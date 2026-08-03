package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6364j;

    public /* synthetic */ n(int r2, int r3, fg.l r4) {
            r1 = this;
            r0 = 1
            r1.f6361g = r0
            r1.<init>()
            r1.f6362h = r2
            r1.f6363i = r3
            r1.f6364j = r4
            return
    }

    public /* synthetic */ n(f1.j r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f6361g = r0
            r1.<init>()
            r1.f6364j = r2
            r1.f6362h = r3
            r1.f6363i = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f6361g
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f6364j
            fg.l r0 = (fg.l) r0
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r9.length()
            r3 = 0
        L18:
            if (r3 >= r2) goto L2a
            char r4 = r9.charAt(r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L27
            r1.append(r4)
        L27:
            int r3 = r3 + 1
            goto L18
        L2a:
            java.lang.String r9 = r1.toString()
            int r1 = r8.f6362h
            java.lang.String r9 = og.m.P0(r1, r9)
            r1 = 10
            java.lang.Integer r1 = og.t.e0(r1, r9)
            int r2 = r9.length()
            if (r2 != 0) goto L41
            goto L4b
        L41:
            if (r1 == 0) goto L4e
            int r1 = r1.intValue()
            int r2 = r8.f6363i
            if (r1 > r2) goto L4e
        L4b:
            r0.invoke(r9)
        L4e:
            sf.n r9 = sf.n.f12433a
            return r9
        L51:
            java.lang.Object r0 = r8.f6364j
            f1.j r0 = (f1.j) r0
            i2.r r9 = (i2.r) r9
            i2.a r1 = r9.f6381a
            int r2 = r8.f6362h
            int r2 = r9.d(r2)
            int r3 = r8.f6363i
            int r3 = r9.d(r3)
            java.lang.CharSequence r4 = r1.f6249e
            if (r2 < 0) goto L72
            if (r2 > r3) goto L72
            int r5 = r4.length()
            if (r3 > r5) goto L72
            goto L8f
        L72:
            java.lang.String r5 = ") or end("
            java.lang.String r6 = ") is out of range [0.."
            java.lang.String r7 = "start("
            java.lang.StringBuilder r5 = eh.a.s(r2, r3, r7, r5, r6)
            int r4 = r4.length()
            r5.append(r4)
            java.lang.String r4 = "], or start > end!"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            o2.a.a(r4)
        L8f:
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            j2.k r1 = r1.f6248d
            android.text.Layout r5 = r1.f6700f
            r5.getSelectionPath(r2, r3, r4)
            int r1 = r1.f6702h
            r2 = 0
            if (r1 == 0) goto Laa
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto Laa
            float r1 = (float) r1
            r4.offset(r2, r1)
        Laa:
            f1.j r1 = new f1.j
            r1.<init>(r4)
            float r9 = r9.f6386f
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r4 = (long) r9
            r9 = 32
            long r2 = r2 << r9
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            r1.i(r2)
            f1.j.a(r0, r1)
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
