package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class CompositePropertyPreFilter implements com.alibaba.fastjson2.filter.PropertyPreFilter {
    private final java.util.List<com.alibaba.fastjson2.filter.PropertyPreFilter> filters;

    public CompositePropertyPreFilter(com.alibaba.fastjson2.filter.PropertyPreFilter... r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.filters = r0
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            if (r2 == 0) goto L17
            java.util.List<com.alibaba.fastjson2.filter.PropertyPreFilter> r3 = r4.filters
            r3.add(r2)
        L17:
            int r1 = r1 + 1
            goto Lc
        L1a:
            return
    }

    public void add(com.alibaba.fastjson2.filter.PropertyPreFilter r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.alibaba.fastjson2.filter.PropertyPreFilter> r0 = r1.filters
            r0.add(r2)
        L7:
            return
    }

    @Override // com.alibaba.fastjson2.filter.PropertyPreFilter
    public boolean process(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.String r5) {
            r2 = this;
            java.util.List<com.alibaba.fastjson2.filter.PropertyPreFilter> r0 = r2.filters
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson2.filter.PropertyPreFilter r1 = (com.alibaba.fastjson2.filter.PropertyPreFilter) r1
            boolean r1 = r1.process(r3, r4, r5)
            if (r1 != 0) goto L6
            r3 = 0
            return r3
        L1a:
            r3 = 1
            return r3
    }
}
