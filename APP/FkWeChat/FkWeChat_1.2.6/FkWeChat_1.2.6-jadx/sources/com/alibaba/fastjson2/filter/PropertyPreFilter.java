package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyPreFilter extends Filter {
    static PropertyPreFilter compose(PropertyPreFilter propertyPreFilter, PropertyPreFilter propertyPreFilter2) {
        if (!(propertyPreFilter instanceof CompositePropertyPreFilter)) {
            return new CompositePropertyPreFilter(propertyPreFilter, propertyPreFilter2);
        }
        ((CompositePropertyPreFilter) propertyPreFilter).add(propertyPreFilter2);
        return propertyPreFilter;
    }

    boolean process(JSONWriter jSONWriter, Object obj, String str);
}
