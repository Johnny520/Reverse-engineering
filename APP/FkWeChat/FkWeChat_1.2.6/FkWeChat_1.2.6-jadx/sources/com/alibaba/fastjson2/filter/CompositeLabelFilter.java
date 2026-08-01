package com.alibaba.fastjson2.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class CompositeLabelFilter implements LabelFilter {
    private final List<LabelFilter> filters = new ArrayList();

    public CompositeLabelFilter(LabelFilter... labelFilterArr) {
        for (LabelFilter labelFilter : labelFilterArr) {
            if (labelFilter != null) {
                this.filters.add(labelFilter);
            }
        }
    }

    public void add(LabelFilter labelFilter) {
        if (labelFilter != null) {
            this.filters.add(labelFilter);
        }
    }

    @Override // com.alibaba.fastjson2.filter.LabelFilter
    public boolean apply(String str) {
        Iterator<LabelFilter> it = this.filters.iterator();
        while (it.hasNext()) {
            if (!it.next().apply(str)) {
                return false;
            }
        }
        return true;
    }
}
