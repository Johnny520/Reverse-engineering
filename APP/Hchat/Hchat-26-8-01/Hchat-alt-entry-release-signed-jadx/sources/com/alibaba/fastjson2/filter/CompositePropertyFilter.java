package com.alibaba.fastjson2.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CompositePropertyFilter implements PropertyFilter {
    private final List<PropertyFilter> filters = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CompositePropertyFilter(PropertyFilter... propertyFilterArr) {
        for (PropertyFilter propertyFilter : propertyFilterArr) {
            if (propertyFilter != null) {
                this.filters.add(propertyFilter);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void add(PropertyFilter propertyFilter) {
        if (propertyFilter != null) {
            this.filters.add(propertyFilter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.filter.PropertyFilter
    public boolean apply(Object obj, String str, Object obj2) {
        Iterator<PropertyFilter> it = this.filters.iterator();
        while (it.hasNext()) {
            if (!it.next().apply(obj, str, obj2)) {
                return false;
            }
        }
        return true;
    }
}
