package b4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b4.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4.e f464b;

    public e() {
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            c4.f r0 = c4.f.f1022b
            goto Lb
        L9:
            c4.c r0 = c4.c.f1017f
        Lb:
            r9.<init>()
            r9.f464b = r0
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 32
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 128(0x80, float:1.8E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r3, r4, r5, r6, r7, r8}
            a.a.k(r0)
            return
    }
}
