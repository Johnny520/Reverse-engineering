package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.alibaba.fastjson2.filter.NameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1821b;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1820a = r2
            r0.f1821b = r1
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.filter.NameFilter
    public final java.lang.String process(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.f1820a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f1821b
            java.util.function.Function r0 = (java.util.function.Function) r0
            java.lang.String r2 = com.alibaba.fastjson2.filter.NameFilter.d(r0, r2, r3, r4)
            return r2
        Le:
            java.lang.Object r0 = r1.f1821b
            com.alibaba.fastjson2.PropertyNamingStrategy r0 = (com.alibaba.fastjson2.PropertyNamingStrategy) r0
            java.lang.String r2 = com.alibaba.fastjson2.filter.NameFilter.a(r0, r2, r3, r4)
            return r2
    }
}
