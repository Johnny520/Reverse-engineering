package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class n extends pd.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final od.d f10526p;

    public n(od.d r2, int r3, int r4) {
            r1 = this;
            pd.k r0 = pd.k.O
            r1.<init>(r0, r4)
            r1.f10526p = r2
            r1.f10525o = r3
            return
    }

    public n(od.d r8, gf.a r9, int r10, boolean r11) {
            r7 = this;
            r0 = 1
            if (r10 == r0) goto La
        L3:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r5 = r0
            goto Lc
        La:
            r0 = 0
            goto L3
        Lc:
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public n(od.d r3, gf.a r4, int r5, boolean r6, boolean r7) {
            r2 = this;
            java.util.List r0 = r3.f9779i
            int r0 = r0.size()
            int r0 = r0 + r6
            pd.k r1 = pd.k.O
            r2.<init>(r1, r0)
            r2.f10526p = r3
            r2.f10525o = r5
            r5 = 0
            if (r7 == 0) goto L17
            int[] r0 = r4.f4499i
            r5 = r0[r5]
        L17:
            if (r6 == 0) goto L31
            if (r7 == 0) goto L1d
            r6 = r5
            goto L21
        L1d:
            int[] r6 = r4.f4499i
            r6 = r6[r5]
        L21:
            od.a r0 = r3.f9780j
            qd.j r0 = r0.f9765g
            mh.b r1 = qd.l.f10901k
            qd.r r1 = new qd.r
            r1.<init>(r6, r0)
            r2.I(r1)
            int r5 = r5 + 1
        L31:
            java.util.List r3 = r3.f9779i
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r3.next()
            qd.j r6 = (qd.j) r6
            if (r7 == 0) goto L47
            r0 = r5
            goto L4b
        L47:
            int[] r0 = r4.f4499i
            r0 = r0[r5]
        L4b:
            mh.b r1 = qd.l.f10901k
            qd.r r1 = new qd.r
            r1.<init>(r0, r6)
            r2.I(r1)
            int r6 = r6.p()
            int r5 = r5 + r6
            goto L37
        L5b:
            r4.getClass()
            return
    }

    @Override // ud.p
    public ud.p O() {
            r4 = this;
            pd.n r0 = new pd.n
            java.util.List r1 = r4.f13715m
            int r1 = r1.size()
            od.d r2 = r4.f10526p
            int r3 = r4.f10525o
            r0.<init>(r2, r3, r1)
            r4.P(r0)
            return r0
    }

    @Override // ud.p
    public boolean Y(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof pd.n
            if (r0 == 0) goto L22
            boolean r0 = super.Y(r3)
            if (r0 != 0) goto Le
            goto L22
        Le:
            pd.n r3 = (pd.n) r3
            int r0 = r2.f10525o
            int r1 = r3.f10525o
            if (r0 != r1) goto L22
            od.d r0 = r2.f10526p
            od.d r3 = r3.f10526p
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L22
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    @Override // pd.b
    public final od.d i0() {
            r1 = this;
            od.d r0 = r1.f10526p
            return r0
    }

    @Override // pd.b
    public int j0() {
            r2 = this;
            int r0 = r2.f10525o
            r1 = 1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            return r1
    }

    @Override // pd.b
    public qd.l k0() {
            r2 = this;
            int r0 = r2.f10525o
            r1 = 1
            if (r0 == r1) goto L13
            java.util.List r0 = r2.f13715m
            int r0 = r0.size()
            if (r0 <= 0) goto L13
            r0 = 0
            qd.l r0 = r2.S(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // ud.p
    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.k()
            int r1 = r5.f10525o
            switch(r1) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "null"
            goto L23
        Lc:
            java.lang.String r1 = "CUSTOM_RAW"
            goto L23
        Lf:
            java.lang.String r1 = "CUSTOM"
            goto L23
        L12:
            java.lang.String r1 = "POLYMORPHIC"
            goto L23
        L15:
            java.lang.String r1 = "SUPER"
            goto L23
        L18:
            java.lang.String r1 = "INTERFACE"
            goto L23
        L1b:
            java.lang.String r1 = "VIRTUAL"
            goto L23
        L1e:
            java.lang.String r1 = "DIRECT"
            goto L23
        L21:
            java.lang.String r1 = "STATIC"
        L23:
            od.d r2 = r5.f10526p
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r5.M()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " call: "
            r4.append(r0)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
