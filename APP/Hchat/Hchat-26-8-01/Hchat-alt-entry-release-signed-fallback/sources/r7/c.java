package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c extends r7.b implements r7.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11554m;

    public /* synthetic */ c(int r1, int r2) {
            r0 = this;
            r0.f11554m = r2
            r0.<init>(r1)
            return
    }

    public static boolean N(byte[] r4, byte[] r5) {
            if (r4 != r5) goto L3
            goto L22
        L3:
            int r0 = r4.length
            r1 = 0
            if (r0 != 0) goto Lb
            int r4 = r5.length
            if (r4 != 0) goto L1e
            goto L22
        Lb:
            int r0 = r5.length
            if (r0 != 0) goto Lf
            goto L1e
        Lf:
            int r0 = r4.length
            int r2 = r5.length
            if (r0 == r2) goto L14
            goto L1e
        L14:
            r0 = r1
        L15:
            int r2 = r4.length
            if (r0 >= r2) goto L22
            r2 = r4[r0]
            r3 = r5[r0]
            if (r2 == r3) goto L1f
        L1e:
            return r1
        L1f:
            int r0 = r0 + 1
            goto L15
        L22:
            r4 = 1
            return r4
    }

    public static byte[] R(byte[] r4) {
            r0 = 0
            if (r4 != 0) goto L6
            byte[] r4 = new byte[r0]
            return r4
        L6:
            r1 = r0
            r2 = r1
        L8:
            int r3 = r4.length
            if (r1 >= r3) goto L14
            r3 = r4[r1]
            if (r3 == 0) goto L11
            int r2 = r1 + 1
        L11:
            int r1 = r1 + 1
            goto L8
        L14:
            byte[] r1 = new byte[r2]
            if (r2 <= 0) goto L1b
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
        L1b:
            return r1
    }

    public int O(int r4) {
            r3 = this;
            byte[] r0 = r3.f11553k
            int r1 = r4 + 4
            int r2 = r0.length
            if (r1 <= r2) goto L9
            r4 = 0
            return r4
        L9:
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r4 = r4 + 3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r4 = r4 | r1
            return r4
    }

    public void P(byte r3) {
            r2 = this;
            byte[] r0 = r2.f11553k
            r1 = 0
            r0[r1] = r3
            return
    }

    public void Q(int r2) {
            r1 = this;
            if (r2 >= 0) goto L3
            r2 = 0
        L3:
            r0 = 1
            r1.M(r2, r0)
            return
    }

    @Override // r7.g
    public int get() {
            r2 = this;
            byte[] r0 = r2.f11553k
            r1 = 0
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // r7.g
    public void k(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.P(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f11554m
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            byte[] r0 = r2.f11553k
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            byte[] r1 = r2.f11553k
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
