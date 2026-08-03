package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b9 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15182o;

    public /* synthetic */ b9(int r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, java.lang.Object r8, java.lang.Object r9) {
            r0 = this;
            r0.f15174g = r1
            r0.f15181n = r8
            r0.f15175h = r9
            r0.f15176i = r2
            r0.f15177j = r3
            r0.f15178k = r4
            r0.f15179l = r5
            r0.f15180m = r6
            r0.f15182o = r7
            r0.<init>()
            return
    }

    public /* synthetic */ b9(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, java.lang.String r9) {
            r1 = this;
            r0 = 1
            r1.f15174g = r0
            r1.<init>()
            r1.f15175h = r3
            r1.f15181n = r9
            r1.f15182o = r2
            r1.f15176i = r4
            r1.f15177j = r5
            r1.f15178k = r6
            r1.f15179l = r7
            r1.f15180m = r8
            return
    }

    public /* synthetic */ b9(fg.l r2, wb.d6 r3, android.content.Context r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9) {
            r1 = this;
            r0 = 2
            r1.f15174g = r0
            r1.<init>()
            r1.f15181n = r2
            r1.f15175h = r3
            r1.f15182o = r4
            r1.f15176i = r5
            r1.f15177j = r6
            r1.f15178k = r7
            r1.f15179l = r8
            r1.f15180m = r9
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r17 = this;
            r0 = r17
            int r1 = r0.f15174g
            switch(r1) {
                case 0: goto L145;
                case 1: goto Lcc;
                case 2: goto L35;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f15181n
            r2 = r1
            i0.j1 r2 = (i0.j1) r2
            java.lang.Object r1 = r0.f15175h
            r3 = r1
            i0.j1 r3 = (i0.j1) r3
            i0.a1 r1 = r0.f15176i
            r4 = r1
            i0.j1 r4 = (i0.j1) r4
            i0.a1 r1 = r0.f15177j
            r5 = r1
            i0.j1 r5 = (i0.j1) r5
            i0.a1 r1 = r0.f15178k
            r6 = r1
            i0.j1 r6 = (i0.j1) r6
            i0.a1 r1 = r0.f15179l
            r7 = r1
            i0.j1 r7 = (i0.j1) r7
            i0.a1 r1 = r0.f15180m
            r8 = r1
            i0.j1 r8 = (i0.j1) r8
            java.lang.Object r1 = r0.f15182o
            r9 = r1
            i0.j1 r9 = (i0.j1) r9
            wb.y2.w1(r2, r3, r4, r5, r6, r7, r8, r9)
        L32:
            sf.n r1 = sf.n.f12433a
            return r1
        L35:
            java.lang.Object r1 = r0.f15181n
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f15175h
            wb.d6 r2 = (wb.d6) r2
            java.lang.Object r3 = r0.f15182o
            android.content.Context r3 = (android.content.Context) r3
            aa.h r4 = r2.f15617b
            java.lang.String r6 = r4.f132a
            i0.a1 r4 = r0.f15176i
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L65
            int r2 = r2.f15616a
            int r2 = r2 + 1
            java.lang.String r4 = "模板 "
            java.lang.String r4 = eh.a.l(r2, r4)
        L65:
            r7 = r4
            i0.a1 r2 = r0.f15177j
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r8 = r2.booleanValue()
            i0.a1 r2 = r0.f15178k
            java.lang.Object r4 = r2.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r14 = r4.booleanValue()
            i0.a1 r4 = r0.f15179l
            java.lang.Object r5 = r4.getValue()
            r15 = r5
            java.util.Set r15 = (java.util.Set) r15
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lac
            java.lang.Object r2 = r4.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r4 = "text"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto Lac
            i0.a1 r2 = r0.f15180m
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
        La9:
            r16 = r2
            goto Laf
        Lac:
            java.lang.String r2 = ""
            goto La9
        Laf:
            aa.h r5 = new aa.h
            r9 = 0
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.invoke(r5)
            java.lang.String r1 = "模板已保存"
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L32
        Lcc:
            java.lang.Object r1 = r0.f15175h
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f15181n
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f15182o
            android.content.Context r3 = (android.content.Context) r3
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = "group_rename_prompt_type"
            java.lang.String r4 = x6.d.E(r4, r2)
            i0.a1 r5 = r0.f15176i
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            java.lang.String r4 = "group_rename_both_order"
            java.lang.String r4 = x6.d.E(r4, r2)
            i0.a1 r5 = r0.f15177j
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            java.lang.String r4 = "group_rename_text"
            java.lang.String r4 = x6.d.E(r4, r2)
            i0.a1 r5 = r0.f15178k
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            java.lang.String r4 = "group_rename_card_title"
            java.lang.String r4 = x6.d.E(r4, r2)
            i0.a1 r5 = r0.f15179l
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            java.lang.String r4 = "group_rename_card_desc"
            java.lang.String r2 = x6.d.E(r4, r2)
            i0.a1 r4 = r0.f15180m
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)
            r1.apply()
            java.lang.String r1 = "专属改名设置已保存"
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L32
        L145:
            java.lang.Object r1 = r0.f15181n
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r0.f15175h
            r3 = r2
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r2 = r0.f15182o
            r9 = r2
            i0.a1 r9 = (i0.a1) r9
            i0.a1 r4 = r0.f15176i
            i0.a1 r5 = r0.f15177j
            i0.a1 r6 = r0.f15178k
            i0.a1 r7 = r0.f15179l
            i0.a1 r8 = r0.f15180m
            wb.ho.P0(r3, r4, r5, r6, r7, r8, r9)
            r1.invoke()
            goto L32
    }
}
