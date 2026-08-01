package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends p000.u22 {

    /* JADX INFO: renamed from: η */
    public final java.lang.Runnable f11078;

    public v22(java.lang.Runnable r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f11078 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            java.lang.Runnable r0 = r0.f11078
            r0.run()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.f11078
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = p000.AbstractC1021yh.m6855(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f10574
            r0.append(r2)
            r0.append(r1)
            boolean r4 = r4.f10575
            if (r4 == 0) goto L34
            java.lang.String r4 = "Blocking"
            goto L36
        L34:
            java.lang.String r4 = "Non-blocking"
        L36:
            r1 = 93
            java.lang.String r4 = p000.AbstractC0602nx.m4132(r0, r4, r1)
            return r4
    }
}
