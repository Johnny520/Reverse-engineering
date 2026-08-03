package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface LabelFilter extends Filter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static LabelFilter compose(LabelFilter labelFilter, LabelFilter labelFilter2) {
        if (!(labelFilter instanceof CompositeLabelFilter)) {
            return new CompositeLabelFilter(labelFilter, labelFilter2);
        }
        ((CompositeLabelFilter) labelFilter).add(labelFilter2);
        return labelFilter;
    }

    boolean apply(String str);
}
