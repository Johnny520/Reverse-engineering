package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyPreFilter extends Filter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static PropertyPreFilter compose(PropertyPreFilter propertyPreFilter, PropertyPreFilter propertyPreFilter2) {
        if (!(propertyPreFilter instanceof CompositePropertyPreFilter)) {
            return new CompositePropertyPreFilter(propertyPreFilter, propertyPreFilter2);
        }
        ((CompositePropertyPreFilter) propertyPreFilter).add(propertyPreFilter2);
        return propertyPreFilter;
    }

    boolean process(JSONWriter jSONWriter, Object obj, String str);
}
