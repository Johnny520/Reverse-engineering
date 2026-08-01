package p000;

/* JADX INFO: renamed from: fx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0301fx implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f4158;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ long f4159;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.AlertDialog f4160;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.ClassLoader f4161;

    public /* synthetic */ C0301fx(android.app.Activity r2, long r3, android.app.AlertDialog r5, java.lang.ClassLoader r6) {
            r1 = this;
            int r0 = p000.C0410ix.f5220
            r1.<init>()
            r1.f4158 = r2
            r1.f4159 = r3
            r1.f4160 = r5
            r1.f4161 = r6
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = p000.C0410ix.f5220
            android.app.Activity r0 = r6.f4158
            long r1 = r6.f4159
            r3 = 1
            r4 = 0
            java.lang.String r5 = "dyhelper_dexkit_progress"
            android.content.SharedPreferences r5 = r0.getSharedPreferences(r5, r4)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = p000.C0410ix.m2813(r0, r1)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences$Editor r0 = r5.putBoolean(r0, r3)     // Catch: java.lang.Throwable -> L1d
            r0.apply()     // Catch: java.lang.Throwable -> L1d
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "best-version warning acked, host="
            r0.<init>(r5)
            r0.append(r1)
            java.lang.String r1 = ", best=390601"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0410ix.m2820(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0410ix.f5231
            r0.set(r4)
            android.app.AlertDialog r0 = r6.f4160
            r0.dismiss()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0410ix.f5229
            r0.set(r3)
            android.os.Handler r0 = p000.C0410ix.f5232
            oj r1 = new oj
            java.lang.ClassLoader r6 = r6.f4161
            r1.<init>(r6, r3)
            r2 = 0
            r0.postDelayed(r1, r2)
            s62 r6 = p000.s62.f9751
            return r6
    }
}
