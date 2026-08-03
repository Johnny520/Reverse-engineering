package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wb.yt f18949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18954o;

    public /* synthetic */ rs(java.lang.String r2, android.content.Context r3, wb.yt r4, i0.j1 r5, i0.j1 r6, i0.j1 r7, i0.j1 r8, i0.a1 r9) {
            r1 = this;
            r0 = 1
            r1.f18946g = r0
            r1.<init>()
            r1.f18947h = r2
            r1.f18948i = r3
            r1.f18949j = r4
            r1.f18950k = r5
            r1.f18951l = r6
            r1.f18952m = r7
            r1.f18953n = r8
            r1.f18954o = r9
            return
    }

    public /* synthetic */ rs(java.lang.String r1, wb.yt r2, android.content.Context r3, i0.j1 r4, i0.j1 r5, i0.j1 r6, i0.j1 r7, i0.a1 r8, int r9) {
            r0 = this;
            r0.f18946g = r9
            r0.f18947h = r1
            r0.f18949j = r2
            r0.f18948i = r3
            r0.f18950k = r4
            r0.f18951l = r5
            r0.f18952m = r6
            r0.f18953n = r7
            r0.f18954o = r8
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
            r17 = this;
            r0 = r17
            int r1 = r0.f18946g
            sf.n r2 = sf.n.f12433a
            wb.yt r3 = r0.f18949j
            switch(r1) {
                case 0: goto Lc9;
                case 1: goto L47;
                default: goto Lb;
            }
        Lb:
            r1 = r18
            fb.d1 r1 = (fb.d1) r1
            r4 = r19
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r8 = r4.booleanValue()
            r1.getClass()
            java.lang.String r4 = r1.f3483a
            java.lang.String r12 = r0.f18947h
            boolean r4 = gg.l.a(r4, r12)
            if (r4 == 0) goto L2a
            long r4 = r1.f3486d
            fb.d1 r1 = r3.M(r4)
        L2a:
            r5 = r1
            r9 = 0
            r11 = 61439(0xefff, float:8.6094E-41)
            r6 = 0
            r7 = 0
            fb.d1 r16 = fb.d1.a(r5, r6, r7, r8, r9, r11)
            android.content.Context r9 = r0.f18948i
            i0.a1 r11 = r0.f18950k
            r10 = r12
            i0.a1 r12 = r0.f18951l
            i0.a1 r13 = r0.f18952m
            i0.a1 r14 = r0.f18953n
            i0.a1 r15 = r0.f18954o
            wb.y2.m1(r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        L47:
            r1 = r18
            fb.d1 r1 = (fb.d1) r1
            r4 = r19
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r7 = r4.booleanValue()
            r1.getClass()
            java.lang.String r4 = r1.f3483a
            java.lang.String r12 = r0.f18947h
            boolean r4 = gg.l.a(r4, r12)
            if (r4 == 0) goto L66
            long r4 = r1.f3486d
            fb.d1 r1 = r3.M(r4)
        L66:
            r5 = r1
            long r3 = r5.f3496n
            android.content.Context r1 = r0.f18948i
            if (r7 == 0) goto Laf
            fb.g1 r6 = fb.g1.f3523a
            java.util.List r6 = fb.g1.i(r1)
            java.util.Iterator r6 = r6.iterator()
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L7f
            r6 = 0
            goto La6
        L7f:
            java.lang.Object r8 = r6.next()
            fb.d1 r8 = (fb.d1) r8
            long r8 = r8.f3496n
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
        L8b:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La5
            java.lang.Object r9 = r6.next()
            fb.d1 r9 = (fb.d1) r9
            long r9 = r9.f3496n
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r10 = r8.compareTo(r9)
            if (r10 >= 0) goto L8b
            r8 = r9
            goto L8b
        La5:
            r6 = r8
        La6:
            if (r6 == 0) goto Lac
            long r3 = r6.longValue()
        Lac:
            r8 = 1
            long r3 = r3 + r8
        Laf:
            r9 = r3
            r8 = 0
            r11 = 55295(0xd7ff, float:7.7485E-41)
            r6 = 0
            fb.d1 r15 = fb.d1.a(r5, r6, r7, r8, r9, r11)
            i0.a1 r10 = r0.f18950k
            i0.a1 r11 = r0.f18951l
            r9 = r12
            i0.a1 r12 = r0.f18952m
            i0.a1 r13 = r0.f18953n
            i0.a1 r14 = r0.f18954o
            r8 = r1
            wb.y2.m1(r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        Lc9:
            r1 = r18
            fb.d1 r1 = (fb.d1) r1
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            r1.getClass()
            r4.getClass()
            java.lang.String r5 = "\\s+"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r5.getClass()
            java.lang.String r6 = " "
            java.util.regex.Matcher r4 = r5.matcher(r4)
            java.lang.String r4 = r4.replaceAll(r6)
            r4.getClass()
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            r5 = 32
            java.lang.String r7 = og.m.P0(r5, r4)
            boolean r4 = og.m.t0(r7)
            if (r4 == 0) goto L102
            goto L12e
        L102:
            java.lang.String r4 = r1.f3483a
            java.lang.String r5 = r0.f18947h
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L112
            long r8 = r1.f3486d
            fb.d1 r1 = r3.M(r8)
        L112:
            r6 = r1
            r10 = 0
            r12 = 65533(0xfffd, float:9.1831E-41)
            r8 = 0
            r9 = 0
            fb.d1 r15 = fb.d1.a(r6, r7, r8, r9, r10, r12)
            android.content.Context r8 = r0.f18948i
            i0.a1 r10 = r0.f18950k
            i0.a1 r11 = r0.f18951l
            i0.a1 r12 = r0.f18952m
            i0.a1 r13 = r0.f18953n
            i0.a1 r14 = r0.f18954o
            r9 = r5
            wb.y2.m1(r8, r9, r10, r11, r12, r13, r14, r15)
        L12e:
            return r2
    }
}
