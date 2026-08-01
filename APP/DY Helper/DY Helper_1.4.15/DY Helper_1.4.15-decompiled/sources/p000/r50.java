package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements p000.InterfaceC0048ap {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9263;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f9264;

    public /* synthetic */ r50(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9263 = r1
            r0.f9264 = r2
            r0.<init>()
            return
    }

    @Override // p000.InterfaceC0048ap
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f9263
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            s50 r4 = (p000.s50) r4
            java.lang.Object r0 = p000.t50.f10204
            monitor-enter(r0)
            fw1 r1 = p000.t50.f10205     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.f9264     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L37
        L1a:
            r3 = move-exception
            goto L38
        L1c:
            java.lang.Object r3 = r3.f9264     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L25:
            int r0 = r2.size()
            if (r3 >= r0) goto L37
            java.lang.Object r0 = r2.get(r3)
            ap r0 = (p000.InterfaceC0048ap) r0
            r0.accept(r4)
            int r3 = r3 + 1
            goto L25
        L37:
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L3a:
            s50 r4 = (p000.s50) r4
            if (r4 != 0) goto L44
            s50 r4 = new s50
            r0 = -3
            r4.<init>(r0)
        L44:
            java.lang.Object r3 = r3.f9264
            n5 r3 = (p000.C0574n5) r3
            r3.m3971(r4)
            return
    }
}
