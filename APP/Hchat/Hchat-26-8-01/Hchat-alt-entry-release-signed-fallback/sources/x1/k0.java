package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x1.n0 f20973j;

    public k0(x1.n0 r3) {
            r2 = this;
            r2.<init>()
            r2.f20973j = r3
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r2.f20971h = r0
            r0 = 0
            r2.f20972i = r0
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            x1.n0 r0 = r1.f20973j
            float r0 = r0.d()
            return r0
    }

    public final void e(v1.l r6, float r7) {
            r5 = this;
            x1.n0 r0 = r5.f20973j
            m8.c r1 = r0.f21001s
            if (r1 != 0) goto Ld
            m8.c r1 = new m8.c
            r1.<init>()
            r0.f21001s = r1
        Ld:
            java.lang.Object r0 = r1.f8779b
            v1.l[] r0 = (v1.l[]) r0
            int r0 = tf.l.D0(r0, r6)
            r2 = 1
            if (r0 >= 0) goto L58
            int r0 = r1.f8778a
            java.lang.Object r3 = r1.f8779b
            v1.l[] r3 = (v1.l[]) r3
            int r4 = r3.length
            if (r0 != r4) goto L3f
            int r4 = r0 * 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            v1.l[] r3 = (v1.l[]) r3
            r1.f8779b = r3
            java.lang.Object r3 = r1.f8780c
            float[] r3 = (float[]) r3
            float[] r3 = java.util.Arrays.copyOf(r3, r4)
            r1.f8780c = r3
            java.lang.Object r3 = r1.f8781d
            byte[] r3 = (byte[]) r3
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)
            r1.f8781d = r3
        L3f:
            java.lang.Object r3 = r1.f8779b
            v1.l[] r3 = (v1.l[]) r3
            r3[r0] = r6
            java.lang.Object r6 = r1.f8781d
            byte[] r6 = (byte[]) r6
            r3 = 3
            r6[r0] = r3
            java.lang.Object r6 = r1.f8780c
            float[] r6 = (float[]) r6
            r6[r0] = r7
            int r6 = r1.f8778a
            int r6 = r6 + r2
            r1.f8778a = r6
            return
        L58:
            java.lang.Object r6 = r1.f8780c
            float[] r6 = (float[]) r6
            r3 = r6[r0]
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L6f
            java.lang.Object r6 = r1.f8781d
            byte[] r6 = (byte[]) r6
            r7 = r6[r0]
            r1 = 2
            if (r7 != r1) goto L6e
            r7 = 0
            r6[r0] = r7
        L6e:
            return
        L6f:
            r6[r0] = r7
            java.lang.Object r6 = r1.f8781d
            byte[] r6 = (byte[]) r6
            r6[r0] = r2
            return
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            x1.n0 r0 = r1.f20973j
            float r0 = r0.q0()
            return r0
    }
}
