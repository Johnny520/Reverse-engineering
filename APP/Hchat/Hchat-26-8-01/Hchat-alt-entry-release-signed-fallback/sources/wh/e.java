package wh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s f20808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh.b f20809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg.q f20810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.SensorManager f20811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh.d f20812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg.q f20813f;

    public e(androidx.lifecycle.s r1, wh.b r2, gg.q r3, android.hardware.SensorManager r4, wh.d r5, gg.q r6) {
            r0 = this;
            r0.<init>()
            r0.f20808a = r1
            r0.f20809b = r2
            r0.f20810c = r3
            r0.f20811d = r4
            r0.f20812e = r5
            r0.f20813f = r6
            return
    }

    @Override // i0.z
    public final void a() {
            r3 = this;
            androidx.lifecycle.s r0 = r3.f20808a
            wh.b r1 = r3.f20809b
            r0.f(r1)
            gg.q r0 = r3.f20810c
            boolean r1 = r0.f4560g
            if (r1 == 0) goto L1b
            android.hardware.SensorManager r1 = r3.f20811d
            wh.d r2 = r3.f20812e
            r1.unregisterListener(r2)
            r1 = 0
            r0.f4560g = r1
            gg.q r0 = r3.f20813f
            r0.f4560g = r1
        L1b:
            return
    }
}
