package com.dp.bigdata.taurus.restlet.utils;

import org.restlet.Request;
import org.restlet.representation.Representation;

/**
 * 
 * RequestExtrator is used to extract object T from the request form.
 * @author damon.zhu
 *
 * @param <T>
 */
public interface RequestExtrator<T> {

    /**
     * 
     * @param request
     * @param isUpdateAction
     * @return
     * @throws Exception
     */
    public T extractTask(Request request, Representation re, boolean isUpdateAction) throws Exception;
}
