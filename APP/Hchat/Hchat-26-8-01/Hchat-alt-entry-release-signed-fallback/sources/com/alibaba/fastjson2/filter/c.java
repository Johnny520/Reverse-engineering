package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements com.alibaba.fastjson2.filter.ValueFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1824c;

    public /* synthetic */ c(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f1822a = r2
            r0.f1823b = r1
            r0.f1824c = r3
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.filter.ValueFilter
    public final java.lang.Object apply(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            int r0 = r2.f1822a
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1f;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f1823b
            java.util.function.Predicate r0 = (java.util.function.Predicate) r0
            java.lang.Object r1 = r2.f1824c
            java.util.function.Function r1 = (java.util.function.Function) r1
            java.lang.Object r3 = com.alibaba.fastjson2.filter.ValueFilter.c(r0, r1, r3, r4, r5)
            return r3
        L12:
            java.lang.Object r0 = r2.f1823b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.f1824c
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = com.alibaba.fastjson2.filter.ValueFilter.g(r0, r1, r3, r4, r5)
            return r3
        L1f:
            java.lang.Object r0 = r2.f1823b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.f1824c
            java.util.function.Function r1 = (java.util.function.Function) r1
            java.lang.Object r3 = com.alibaba.fastjson2.filter.ValueFilter.b(r0, r1, r3, r4, r5)
            return r3
        L2c:
            java.lang.Object r0 = r2.f1823b
            com.alibaba.fastjson2.filter.ValueFilter r0 = (com.alibaba.fastjson2.filter.ValueFilter) r0
            java.lang.Object r1 = r2.f1824c
            com.alibaba.fastjson2.filter.ValueFilter r1 = (com.alibaba.fastjson2.filter.ValueFilter) r1
            java.lang.Object r3 = com.alibaba.fastjson2.filter.ValueFilter.e(r0, r1, r3, r4, r5)
            return r3
    }
}
