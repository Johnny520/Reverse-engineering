package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyFilter extends Filter {
    static PropertyFilter compose(PropertyFilter propertyFilter, PropertyFilter propertyFilter2) {
        if (!(propertyFilter instanceof CompositePropertyFilter)) {
            return new CompositePropertyFilter(propertyFilter, propertyFilter2);
        }
        ((CompositePropertyFilter) propertyFilter).add(propertyFilter2);
        return propertyFilter;
    }

    boolean apply(Object obj, String str, Object obj2);
}
