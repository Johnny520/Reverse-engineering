package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d52 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.String f2900;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f2901;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f2902;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f2903;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.f52 f2904;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.app.Activity f2905;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ long f2906;

    public /* synthetic */ d52(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, p000.f52 r5, android.app.Activity r6, long r7) {
            r0 = this;
            r0.<init>()
            r0.f2900 = r1
            r0.f2901 = r2
            r0.f2902 = r3
            r0.f2903 = r4
            r0.f2904 = r5
            r0.f2905 = r6
            r0.f2906 = r7
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            java.lang.String r0 = r5.f2900
            java.lang.String r1 = r5.f2901
            java.lang.String r2 = r5.f2902
            int r3 = r5.f2903
            f52 r4 = r5.f2904
            com.example.dyhelper.p002ui.C0182.m1601(r0, r1, r2, r3, r4)
            r1 = 1
            android.app.Activity r2 = r5.f2905
            com.example.dyhelper.p002ui.C0182.m1596(r2, r1)
            java.util.LinkedHashMap r1 = com.example.dyhelper.p002ui.C0182.f2698
            java.lang.Object r3 = r1.remove(r0)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L24
            android.os.Handler r4 = com.example.dyhelper.p002ui.C0182.f2694
            r4.removeCallbacks(r3)
        L24:
            xx0 r3 = new xx0
            r4 = 15
            r3.<init>(r0, r2, r4)
            r1.put(r0, r3)
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            long r1 = r5.f2906
            r0.postDelayed(r3, r1)
            s62 r5 = p000.s62.f9751
            return r5
    }
}
