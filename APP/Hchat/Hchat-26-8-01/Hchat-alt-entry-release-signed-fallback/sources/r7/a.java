package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a extends r7.b implements r7.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11551o;

    public a(int r1, boolean r2) {
            r0 = this;
            r0.f11549m = r1
            switch(r1) {
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = 0
            r0.<init>(r1)
            r1 = 4
            r0.f11551o = r1
            r0.f11550n = r2
            return
        Lf:
            r1 = 2
            r0.<init>(r1)
            r0.f11550n = r2
            return
    }

    public a(short r3) {
            r2 = this;
            r0 = 1
            r2.f11549m = r0
            r0 = 0
            r1 = 1
            r2.<init>(r1, r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            r2.k(r3)
            return
    }

    @Override // r7.b, k7.a
    public void B(q7.b r3) {
            r2 = this;
            int r0 = r2.f11549m
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.B(r3)
            return
        L9:
            boolean r0 = r2.f11550n
            if (r0 == 0) goto L24
            int r0 = r3.f10666k
            r2.N(r0)
            int r0 = r2.p()
            int r1 = r3.available()
            if (r0 == 0) goto L27
            if (r1 < r0) goto L27
            byte[] r1 = r2.f11553k
            r3.e(r1, r0)
            goto L27
        L24:
            super.B(r3)
        L27:
            return
    }

    @Override // r7.b
    public void L() {
            r4 = this;
            int r0 = r4.f11549m
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            byte[] r0 = r4.f11553k
            boolean r1 = r4.f11550n
            r2 = 0
            if (r1 == 0) goto L20
            r1 = 2
            int r3 = r0.length
            if (r1 <= r3) goto L12
            goto L24
        L12:
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = 1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r1 | r0
            goto L24
        L20:
            int r2 = k7.a.x(r0, r2)
        L24:
            r4.f11551o = r2
            return
    }

    public int N(int r3) {
            r2 = this;
            int r0 = r2.f11551o
            r1 = 1
            if (r0 > r1) goto L7
            r3 = 0
            goto Lb
        L7:
            int r3 = r3 % r0
            int r3 = r0 - r3
            int r3 = r3 % r0
        Lb:
            r2.O(r3)
            return r3
    }

    public void O(int r4) {
            r3 = this;
            r0 = 0
            r3.M(r4, r0)
            byte[] r4 = r3.f11553k
            int r1 = r4.length
            r2 = r0
        L8:
            if (r2 >= r1) goto Lf
            r4[r2] = r0
            int r2 = r2 + 1
            goto L8
        Lf:
            return
    }

    @Override // r7.g
    public int get() {
            r1 = this;
            int r0 = r1.f11551o
            return r0
    }

    @Override // r7.g
    public void k(int r4) {
            r3 = this;
            int r0 = r3.f11551o
            if (r4 != r0) goto L5
            return
        L5:
            r3.f11551o = r4
            byte[] r0 = r3.f11553k
            boolean r1 = r3.f11550n
            r2 = 0
            if (r1 == 0) goto L1c
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0[r2] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1 = 1
            r0[r1] = r4
            return
        L1c:
            k7.a.E(r0, r2, r4)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f11549m
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            int r0 = r4.f11551o
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            int r0 = r4.f11551o
            if (r0 > 0) goto L13
            java.lang.String r0 = "OFF"
            goto L38
        L13:
            int r1 = r4.p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 4
            if (r0 == r3) goto L2c
            java.lang.String r3 = "alignment="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
        L2c:
            java.lang.String r0 = "align="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L38:
            return r0
    }
}
