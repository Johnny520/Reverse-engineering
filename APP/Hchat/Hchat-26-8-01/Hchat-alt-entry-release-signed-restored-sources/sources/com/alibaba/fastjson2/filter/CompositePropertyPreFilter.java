package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CompositePropertyPreFilter implements PropertyPreFilter {
    private final List<PropertyPreFilter> filters = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CompositePropertyPreFilter(PropertyPreFilter... propertyPreFilterArr) {
        for (PropertyPreFilter propertyPreFilter : propertyPreFilterArr) {
            if (propertyPreFilter != null) {
                this.filters.add(propertyPreFilter);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void add(PropertyPreFilter propertyPreFilter) {
        if (propertyPreFilter != null) {
            this.filters.add(propertyPreFilter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.filter.PropertyPreFilter
    public boolean process(JSONWriter jSONWriter, Object obj, String str) {
        Iterator<PropertyPreFilter> it = this.filters.iterator();
        while (it.hasNext()) {
            if (!it.next().process(jSONWriter, obj, str)) {
                return false;
            }
        }
        return true;
    }
}
