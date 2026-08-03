package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o9 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18028q;

    public /* synthetic */ o9(android.content.Context r2, gb.o r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, qg.t r11) {
            r1 = this;
            r0 = 2
            r1.f18018g = r0
            r1.<init>()
            r1.f18025n = r3
            r1.f18020i = r4
            r1.f18026o = r11
            r1.f18021j = r5
            r1.f18022k = r6
            r1.f18019h = r2
            r1.f18023l = r7
            r1.f18024m = r8
            r1.f18027p = r9
            r1.f18028q = r10
            return
    }

    public /* synthetic */ o9(android.content.SharedPreferences r2, java.lang.String r3, java.lang.String r4, android.content.Context r5, i0.a1 r6, i0.a1 r7, wb.q r8, i0.a1 r9, i0.a1 r10, i0.a1 r11) {
            r1 = this;
            r0 = 1
            r1.f18018g = r0
            r1.<init>()
            r1.f18025n = r2
            r1.f18026o = r3
            r1.f18027p = r4
            r1.f18019h = r5
            r1.f18020i = r6
            r1.f18021j = r7
            r1.f18028q = r8
            r1.f18022k = r9
            r1.f18023l = r10
            r1.f18024m = r11
            return
    }

    public /* synthetic */ o9(fg.l r2, wb.i5 r3, android.content.Context r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11) {
            r1 = this;
            r0 = 0
            r1.f18018g = r0
            r1.<init>()
            r1.f18025n = r2
            r1.f18026o = r3
            r1.f18019h = r4
            r1.f18020i = r5
            r1.f18021j = r6
            r1.f18022k = r7
            r1.f18023l = r8
            r1.f18024m = r9
            r1.f18027p = r10
            r1.f18028q = r11
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r17 = this;
            r0 = r17
            int r1 = r0.f18018g
            switch(r1) {
                case 0: goto Lde;
                case 1: goto L32;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f18025n
            r10 = r1
            gb.o r10 = (gb.o) r10
            java.lang.Object r1 = r0.f18026o
            r2 = r1
            qg.t r2 = (qg.t) r2
            java.lang.Object r1 = r0.f18027p
            r8 = r1
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r1 = r0.f18028q
            r9 = r1
            i0.a1 r9 = (i0.a1) r9
            r1 = 0
            i0.a1 r3 = r0.f18020i
            r3.setValue(r1)
            r11 = 1
            i0.a1 r3 = r0.f18021j
            i0.a1 r4 = r0.f18022k
            android.content.Context r5 = r0.f18019h
            i0.a1 r6 = r0.f18023l
            i0.a1 r7 = r0.f18024m
            wb.y2.z1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L2f:
            sf.n r1 = sf.n.f12433a
            return r1
        L32:
            java.lang.Object r1 = r0.f18025n
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f18026o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f18027p
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f18028q
            wb.q r4 = (wb.q) r4
            android.content.SharedPreferences$Editor r1 = r1.edit()
            i0.a1 r5 = r0.f18020i
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Long r5 = og.t.g0(r5)
            if (r5 == 0) goto L62
            long r6 = r5.longValue()
            r8 = 0
            r10 = 600000(0x927c0, double:2.964394E-318)
            long r5 = r9.e0.s(r6, r8, r10)
            goto L64
        L62:
            r5 = 0
        L64:
            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r5)
            i0.a1 r2 = r0.f18021j
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            if (r4 == 0) goto Lcd
            java.lang.String r2 = r4.f18552c
            i0.a1 r3 = r0.f18022k
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L98
            java.lang.String r3 = "yyyy-MM-dd"
        L98:
            r1.putString(r2, r3)
            java.lang.String r2 = r4.f18558i
            i0.a1 r3 = r0.f18023l
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto Lb5
            java.lang.String r3 = "yyMMdd"
        Lb5:
            r1.putString(r2, r3)
            java.lang.String r2 = r4.f18560k
            i0.a1 r3 = r0.f18024m
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r1.putString(r2, r3)
        Lcd:
            r1.apply()
            java.lang.String r1 = "设置已保存"
            r2 = 0
            android.content.Context r3 = r0.f18019h
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L2f
        Lde:
            java.lang.Object r1 = r0.f18025n
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f18026o
            wb.i5 r2 = (wb.i5) r2
            java.lang.Object r3 = r0.f18027p
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f18028q
            i0.a1 r4 = (i0.a1) r4
            aa.a r5 = r2.f16719b
            i0.a1 r2 = r0.f18020i
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r9 = r2.booleanValue()
            i0.a1 r2 = r0.f18021j
            java.lang.Object r2 = r2.getValue()
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            i0.a1 r2 = r0.f18022k
            java.lang.Object r2 = r2.getValue()
            r11 = r2
            java.util.Set r11 = (java.util.Set) r11
            i0.a1 r2 = r0.f18023l
            java.lang.Object r6 = r2.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r12 = r6.booleanValue()
            i0.a1 r6 = r0.f18024m
            java.lang.Object r7 = r6.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
            java.lang.Object r7 = r3.getValue()
            r14 = r7
            java.util.Set r14 = (java.util.Set) r14
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L15b
            java.lang.Object r2 = r6.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L15b
            java.lang.Object r2 = r3.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "text"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L15b
            java.lang.Object r2 = r4.getValue()
            java.lang.String r2 = (java.lang.String) r2
        L159:
            r15 = r2
            goto L15e
        L15b:
            java.lang.String r2 = ""
            goto L159
        L15e:
            r16 = 15
            r6 = 0
            r7 = 0
            r8 = 0
            aa.a r2 = aa.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.invoke(r2)
            java.lang.String r1 = "名单已保存"
            r2 = 0
            android.content.Context r3 = r0.f18019h
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L2f
    }
}
