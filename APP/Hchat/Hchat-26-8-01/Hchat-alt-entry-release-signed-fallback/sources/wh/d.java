package wh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements android.hardware.SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float[] f20800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f20801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg.q f20802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg.r f20803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg.r f20804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg.r f20805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.r f20806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20807h;

    public d(float[] r1, float[] r2, gg.q r3, gg.r r4, gg.r r5, gg.r r6, gg.r r7, i0.a1 r8) {
            r0 = this;
            r0.<init>()
            r0.f20800a = r1
            r0.f20801b = r2
            r0.f20802c = r3
            r0.f20803d = r4
            r0.f20804e = r5
            r0.f20805f = r6
            r0.f20806g = r7
            r0.f20807h = r8
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r11) {
            r10 = this;
            r11.getClass()
            float[] r11 = r11.values
            float[] r0 = r10.f20800a
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r11)
            float[] r11 = r10.f20801b
            android.hardware.SensorManager.getOrientation(r0, r11)
            r1 = 6
            r1 = r0[r1]
            float r1 = -r1
            r2 = 7
            r0 = r0[r2]
            float r0 = -r0
            gg.q r2 = r10.f20802c
            boolean r3 = r2.f4560g
            r4 = 2
            gg.r r5 = r10.f20806g
            gg.r r6 = r10.f20805f
            gg.r r7 = r10.f20804e
            r8 = 1
            gg.r r9 = r10.f20803d
            if (r3 != 0) goto L36
            r3 = r11[r8]
            r9.f4561g = r3
            r11 = r11[r4]
            r7.f4561g = r11
            r6.f4561g = r1
            r5.f4561g = r0
            r2.f4560g = r8
            goto L59
        L36:
            float r2 = r9.f4561g
            r3 = r11[r8]
            float r3 = r3 - r2
            r8 = 1041865114(0x3e19999a, float:0.15)
            float r3 = r3 * r8
            float r3 = r3 + r2
            r9.f4561g = r3
            float r2 = r7.f4561g
            r11 = r11[r4]
            float r11 = r11 - r2
            float r11 = r11 * r8
            float r11 = r11 + r2
            r7.f4561g = r11
            float r11 = r6.f4561g
            float r1 = r1 - r11
            float r1 = r1 * r8
            float r1 = r1 + r11
            r6.f4561g = r1
            float r11 = r5.f4561g
            float r0 = r0 - r11
            float r0 = r0 * r8
            float r0 = r0 + r11
            r5.f4561g = r0
        L59:
            wh.a r11 = new wh.a
            float r0 = r9.f4561g
            float r1 = r7.f4561g
            float r2 = r6.f4561g
            float r3 = r5.f4561g
            r11.<init>(r0, r1, r2, r3)
            i0.a1 r0 = r10.f20807h
            r0.setValue(r11)
            return
    }
}
