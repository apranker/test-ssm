package com.qunar.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodeFilter implements Filter {
    private String encoding;

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        encoding = filterConfig.getInitParameter("encoding");
        if (encoding == null || encoding.isEmpty()) {
            encoding = "utf-8";
        }

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding(encoding);
        chain.doFilter(request, response);
    }

    public void destroy() {
        // TODO Auto-generated method stub

    }

}
