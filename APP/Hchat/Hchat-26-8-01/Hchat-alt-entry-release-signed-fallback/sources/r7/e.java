package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r7.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7.b f11556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11558i;

    public e(r7.b r1, int r2, int r3) {
            r0 = this;
            r0.f11558i = r3
            r0.<init>()
            r0.f11556g = r1
            r0.f11557h = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L21
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L21
        L12:
            r7.e r5 = (r7.e) r5
            int r2 = r4.f11557h
            int r3 = r5.f11557h
            if (r2 != r3) goto L21
            r7.b r2 = r4.f11556g
            r7.b r5 = r5.f11556g
            if (r2 != r5) goto L21
            return r0
        L21:
            return r1
    }

    @Override // r7.g
    public int get() {
            r2 = this;
            r7.b r0 = r2.f11556g
            byte[] r0 = r0.f11553k
            int r1 = r2.f11557h
            int r0 = k7.a.s(r0, r1)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f11557h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.b r1 = r2.f11556g
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    @Override // r7.g
    public void k(int r3) {
            r2 = this;
            r7.b r0 = r2.f11556g
            byte[] r0 = r0.f11553k
            int r1 = r2.f11557h
            k7.a.D(r0, r1, r3)
            return
    }

    public final java.lang.String toString() {
            r12 = this;
            int r0 = r12.f11558i
            switch(r0) {
                case 0: goto L8a;
                default: goto L5;
            }
        L5:
            r7.b r0 = r12.f11556g
            r1 = r0
            r7.p r1 = (r7.p) r1
            byte[] r1 = r1.f11553k
            int r2 = r12.f11557h
            int r3 = r2 + 3
            r1 = r1[r3]
            if (r1 == 0) goto L76
            r7.p r0 = (r7.p) r0
            byte[] r0 = r0.f11553k
            int r2 = r2 + 3
            r0 = r0[r2]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r3 = 2
            int[] r3 = t3.c.c(r3)
            int r4 = r3.length
            r5 = 0
            r6 = r5
            r7 = r6
        L2c:
            r8 = 124(0x7c, float:1.74E-43)
            if (r5 >= r4) goto L62
            r9 = r3[r5]
            r10 = 1
            if (r9 == r10) goto L3d
            r10 = 2
            if (r9 != r10) goto L3b
            r10 = 32
            goto L3f
        L3b:
            r0 = 0
            throw r0
        L3d:
            r10 = 64
        L3f:
            r11 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 & r0
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 == r11) goto L47
            goto L5f
        L47:
            if (r7 == 0) goto L4c
            r1.append(r8)
        L4c:
            r7 = 1
            if (r9 == r7) goto L58
            r7 = 2
            if (r9 == r7) goto L55
            java.lang.String r7 = "null"
            goto L5a
        L55:
            java.lang.String r7 = "SPEC_STAGED_API"
            goto L5a
        L58:
            java.lang.String r7 = "SPEC_PUBLIC"
        L5a:
            r1.append(r7)
            r6 = r6 | r11
            r7 = 1
        L5f:
            int r5 = r5 + 1
            goto L2c
        L62:
            if (r6 == r2) goto L71
            if (r7 == 0) goto L69
            r1.append(r8)
        L69:
            byte r0 = (byte) r2
            java.lang.String r0 = y7.a.n(r0)
            r1.append(r0)
        L71:
            java.lang.String r0 = r1.toString()
            goto L89
        L76:
            r7.p r0 = (r7.p) r0
            byte[] r0 = r0.f11553k
            int r0 = k7.a.s(r0, r2)
            if (r0 == 0) goto L87
            r1 = 8
            java.lang.String r0 = y7.a.k(r0, r1)
            goto L89
        L87:
            java.lang.String r0 = ""
        L89:
            return r0
        L8a:
            r7.b r0 = r12.f11556g
            byte[] r0 = r0.f11553k
            int r0 = r0.length
            int r1 = r12.f11557h
            int r0 = r0 - r1
            r1 = 4
            if (r0 >= r1) goto L98
            java.lang.String r0 = "NULL"
            goto La0
        L98:
            int r0 = r12.get()
            java.lang.String r0 = java.lang.Integer.toString(r0)
        La0:
            return r0
    }
}
