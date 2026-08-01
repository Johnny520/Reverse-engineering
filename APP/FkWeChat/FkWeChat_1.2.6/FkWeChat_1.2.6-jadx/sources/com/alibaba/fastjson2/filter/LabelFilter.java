package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface LabelFilter extends Filter {
    static LabelFilter compose(LabelFilter labelFilter, LabelFilter labelFilter2) {
        if (!(labelFilter instanceof CompositeLabelFilter)) {
            return new CompositeLabelFilter(labelFilter, labelFilter2);
        }
        ((CompositeLabelFilter) labelFilter).add(labelFilter2);
        return labelFilter;
    }

    boolean apply(String str);
}
