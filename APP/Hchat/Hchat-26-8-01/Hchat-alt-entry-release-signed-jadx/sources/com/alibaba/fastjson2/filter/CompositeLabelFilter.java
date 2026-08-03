package com.alibaba.fastjson2.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CompositeLabelFilter implements LabelFilter {
    private final List<LabelFilter> filters = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CompositeLabelFilter(LabelFilter... labelFilterArr) {
        for (LabelFilter labelFilter : labelFilterArr) {
            if (labelFilter != null) {
                this.filters.add(labelFilter);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void add(LabelFilter labelFilter) {
        if (labelFilter != null) {
            this.filters.add(labelFilter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
