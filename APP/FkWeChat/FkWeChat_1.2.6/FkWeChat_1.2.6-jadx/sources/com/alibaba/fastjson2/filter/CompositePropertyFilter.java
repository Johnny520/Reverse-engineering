package com.alibaba.fastjson2.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class CompositePropertyFilter implements PropertyFilter {
    private final List<PropertyFilter> filters = new ArrayList();

    public CompositePropertyFilter(PropertyFilter... propertyFilterArr) {
        for (PropertyFilter propertyFilter : propertyFilterArr) {
            if (propertyFilter != null) {
                this.filters.add(propertyFilter);
            }
        }
    }

    public void add(PropertyFilter propertyFilter) {
        if (propertyFilter != null) {
            this.filters.add(propertyFilter);
        }
    }

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
