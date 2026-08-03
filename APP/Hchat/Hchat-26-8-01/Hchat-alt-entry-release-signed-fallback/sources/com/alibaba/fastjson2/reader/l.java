package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    public /* synthetic */ l(int r1) {
            r0 = this;
            r0.f1857a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1857a
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L3e;
                case 2: goto L37;
                case 3: goto L30;
                case 4: goto L29;
                case 5: goto L22;
                case 6: goto L1b;
                case 7: goto L14;
                case 8: goto Lf;
                case 9: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.k(r2)
            return r2
        La:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.u(r2)
            return r2
        Lf:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.r(r2)
            return r2
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.time.ZoneOffset r2 = java.time.ZoneOffset.of(r2)
            return r2
        L1b:
            java.lang.String r2 = (java.lang.String) r2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            return r2
        L22:
            java.lang.String r2 = (java.lang.String) r2
            java.net.URL r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.n(r2)
            return r2
        L29:
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.i(r2)
            return r2
        L30:
            java.lang.String r2 = (java.lang.String) r2
            java.nio.charset.Charset r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.d(r2)
            return r2
        L37:
            java.lang.String r2 = (java.lang.String) r2
            java.net.URI r2 = java.net.URI.create(r2)
            return r2
        L3e:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.<init>(r2)
            return r0
        L4a:
            java.lang.String r2 = (java.lang.String) r2
            java.time.Period r2 = java.time.Period.parse(r2)
            return r2
    }
}
