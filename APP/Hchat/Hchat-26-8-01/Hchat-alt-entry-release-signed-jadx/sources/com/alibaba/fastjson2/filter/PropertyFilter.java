package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyFilter extends Filter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static PropertyFilter compose(PropertyFilter propertyFilter, PropertyFilter propertyFilter2) {
        if (!(propertyFilter instanceof CompositePropertyFilter)) {
            return new CompositePropertyFilter(propertyFilter, propertyFilter2);
        }
        ((CompositePropertyFilter) propertyFilter).add(propertyFilter2);
        return propertyFilter;
    }

    boolean apply(Object obj, String str, Object obj2);
}
