package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13075;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dg0 f13076;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f13077;

    public /* synthetic */ zf0(p000.dg0 r1, int r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f13075 = r4
            r0.f13076 = r1
            r0.f13077 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ zf0(p000.dg0 r1, int r2, java.util.List r3, boolean r4) {
            r0 = this;
            r3 = 2
            r0.f13075 = r3
            r0.<init>()
            r0.f13076 = r1
            r0.f13077 = r2
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f13075
            switch(r0) {
                case 0: goto L41;
                case 1: goto L27;
                default: goto L5;
            }
        L5:
            dg0 r0 = r3.f13076
            int r3 = r3.f13077
            xn0 r1 = r0.f3142
            r1.getClass()
            lg0 r1 = r0.f3129     // Catch: java.io.IOException -> L24
            sz r2 = p000.EnumC0816sz.f10092     // Catch: java.io.IOException -> L24
            r1.m3563(r3, r2)     // Catch: java.io.IOException -> L24
            monitor-enter(r0)     // Catch: java.io.IOException -> L24
            java.util.LinkedHashSet r1 = r0.f3131     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r1.remove(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            throw r3     // Catch: java.io.IOException -> L24
        L24:
            s62 r3 = p000.s62.f9751
            return r3
        L27:
            dg0 r0 = r3.f13076
            int r3 = r3.f13077
            xn0 r1 = r0.f3142
            r1.getClass()
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r0.f3131     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3e
            r1.remove(r3)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            s62 r3 = p000.s62.f9751
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L41:
            dg0 r0 = r3.f13076
            int r3 = r3.f13077
            xn0 r1 = r0.f3142
            r1.getClass()
            lg0 r1 = r0.f3129     // Catch: java.io.IOException -> L60
            sz r2 = p000.EnumC0816sz.f10092     // Catch: java.io.IOException -> L60
            r1.m3563(r3, r2)     // Catch: java.io.IOException -> L60
            monitor-enter(r0)     // Catch: java.io.IOException -> L60
            java.util.LinkedHashSet r1 = r0.f3131     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5d
            r1.remove(r3)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)     // Catch: java.io.IOException -> L60
            goto L60
        L5d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L60
            throw r3     // Catch: java.io.IOException -> L60
        L60:
            s62 r3 = p000.s62.f9751
            return r3
    }
}
