package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements p000.jp1 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f6074;

    /* JADX INFO: renamed from: ζ */
    public final java.util.LinkedHashMap f6075;

    public kp1() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f6074 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f6075 = r0
            return
    }

    @Override // p000.jp1
    /* JADX INFO: renamed from: γ */
    public final p000.C0063b3 mo2978(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.Object r0 = r2.f6074
            monitor-enter(r0)
            java.util.LinkedHashMap r2 = r2.f6075     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            b3 r1 = p000.AbstractC1126.m7343(r4)     // Catch: java.lang.Throwable -> L19
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r2 = move-exception
            goto L1f
        L1b:
            b3 r1 = (p000.C0063b3) r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r1
        L1f:
            monitor-exit(r0)
            throw r2
    }
}
