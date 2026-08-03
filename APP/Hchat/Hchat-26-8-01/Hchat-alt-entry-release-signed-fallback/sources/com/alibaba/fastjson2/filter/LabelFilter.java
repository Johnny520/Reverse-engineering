package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface LabelFilter extends com.alibaba.fastjson2.filter.Filter {
    static com.alibaba.fastjson2.filter.LabelFilter compose(com.alibaba.fastjson2.filter.LabelFilter r3, com.alibaba.fastjson2.filter.LabelFilter r4) {
            boolean r0 = r3 instanceof com.alibaba.fastjson2.filter.CompositeLabelFilter
            if (r0 == 0) goto Lb
            r0 = r3
            com.alibaba.fastjson2.filter.CompositeLabelFilter r0 = (com.alibaba.fastjson2.filter.CompositeLabelFilter) r0
            r0.add(r4)
            return r3
        Lb:
            com.alibaba.fastjson2.filter.CompositeLabelFilter r0 = new com.alibaba.fastjson2.filter.CompositeLabelFilter
            r1 = 2
            com.alibaba.fastjson2.filter.LabelFilter[] r1 = new com.alibaba.fastjson2.filter.LabelFilter[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.<init>(r1)
            return r0
    }

    boolean apply(java.lang.String r1);
}
