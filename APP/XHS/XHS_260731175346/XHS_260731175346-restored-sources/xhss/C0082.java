package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0082 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f425;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0927 f426;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f427;

    public /* synthetic */ C0082(xhss.C0927 r1, int r2, int r3) {
            r0 = this;
            r3 = 1
            r0.f425 = r3
            r0.<init>()
            r0.f426 = r1
            r0.f427 = r2
            return
    }

    public /* synthetic */ C0082(xhss.C0927 r1, int r2, java.util.List r3) {
            r0 = this;
            r3 = 0
            r0.f425 = r3
            r0.<init>()
            r0.f426 = r1
            r0.f427 = r2
            return
    }

    public /* synthetic */ C0082(xhss.C0927 r1, int r2, java.util.List r3, boolean r4) {
            r0 = this;
            r3 = 2
            r0.f425 = r3
            r0.<init>()
            r0.f426 = r1
            r0.f427 = r2
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r3 = this;
            int r0 = r3.f425
            r1 = 9
            switch(r0) {
                case 0: goto L41;
                case 1: goto L27;
                default: goto L7;
            }
        L7:
            xhss.ᲁᛲᛵ r0 = r3.f426
            int r3 = r3.f427
            xhss.ᛳᛴᲀᲁ r2 = r0.f2996
            r2.getClass()
            xhss.ᲀᛱᛶᛳ r2 = r0.f3003     // Catch: java.io.IOException -> L24
            r2.m1415(r3, r1)     // Catch: java.io.IOException -> L24
            monitor-enter(r0)     // Catch: java.io.IOException -> L24
            java.util.LinkedHashSet r1 = r0.f2989     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r1.remove(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            throw r3     // Catch: java.io.IOException -> L24
        L24:
            xhss.ᛵᛷᲈᛶ r3 = xhss.C0500.f1817
            return r3
        L27:
            xhss.ᲁᛲᛵ r0 = r3.f426
            int r3 = r3.f427
            xhss.ᛳᛴᲀᲁ r1 = r0.f2996
            r1.getClass()
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r0.f2989     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3e
            r1.remove(r3)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            xhss.ᛵᛷᲈᛶ r3 = xhss.C0500.f1817
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L41:
            xhss.ᲁᛲᛵ r0 = r3.f426
            int r3 = r3.f427
            xhss.ᛳᛴᲀᲁ r2 = r0.f2996
            r2.getClass()
            xhss.ᲀᛱᛶᛳ r2 = r0.f3003     // Catch: java.io.IOException -> L5e
            r2.m1415(r3, r1)     // Catch: java.io.IOException -> L5e
            monitor-enter(r0)     // Catch: java.io.IOException -> L5e
            java.util.LinkedHashSet r1 = r0.f2989     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
            r1.remove(r3)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.io.IOException -> L5e
            goto L5e
        L5b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L5e
            throw r3     // Catch: java.io.IOException -> L5e
        L5e:
            xhss.ᛵᛷᲈᛶ r3 = xhss.C0500.f1817
            return r3
    }
}
