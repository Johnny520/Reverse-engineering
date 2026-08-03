package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20203u;

    public /* synthetic */ xk(android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15) {
            r1 = this;
            r0 = 1
            r1.f20189g = r0
            r1.<init>()
            r1.f20190h = r2
            r1.f20191i = r3
            r1.f20192j = r4
            r1.f20193k = r5
            r1.f20194l = r6
            r1.f20195m = r7
            r1.f20196n = r8
            r1.f20197o = r9
            r1.f20198p = r10
            r1.f20199q = r11
            r1.f20200r = r12
            r1.f20201s = r13
            r1.f20202t = r14
            r1.f20203u = r15
            return
    }

    public /* synthetic */ xk(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15) {
            r1 = this;
            r0 = 0
            r1.f20189g = r0
            r1.<init>()
            r1.f20203u = r2
            r1.f20190h = r3
            r1.f20191i = r4
            r1.f20192j = r5
            r1.f20193k = r6
            r1.f20194l = r7
            r1.f20195m = r8
            r1.f20196n = r9
            r1.f20197o = r10
            r1.f20198p = r11
            r1.f20199q = r12
            r1.f20200r = r13
            r1.f20201s = r14
            r1.f20202t = r15
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r19 = this;
            r1 = r19
            int r0 = r1.f20189g
            sf.n r2 = sf.n.f12433a
            java.lang.Object r4 = r1.f20203u
            android.content.Context r5 = r1.f20190h
            switch(r0) {
                case 0: goto L85;
                default: goto Ld;
            }
        Ld:
            i0.a1 r6 = r1.f20191i
            i0.a1 r7 = r1.f20192j
            i0.a1 r8 = r1.f20193k
            i0.a1 r9 = r1.f20194l
            i0.a1 r10 = r1.f20195m
            i0.a1 r11 = r1.f20196n
            i0.a1 r12 = r1.f20197o
            i0.a1 r13 = r1.f20198p
            i0.a1 r15 = r1.f20199q
            r14 = r15
            i0.a1 r15 = r1.f20200r
            i0.a1 r0 = r1.f20201s
            i0.a1 r3 = r1.f20202t
            i0.a1 r4 = (i0.a1) r4
            r16 = r0
            fb.v r0 = wb.y2.B0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L65
            r17 = r12
            fb.w.w(r5, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r16.getValue()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L65
            fb.t0 r18 = fb.w.g(r5, r0)     // Catch: java.lang.Throwable -> L65
            r12 = r10
            r10 = r8
            r8 = r6
            r6 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r3
            wb.y2.x0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r4.getValue()     // Catch: java.lang.Throwable -> L65
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L65
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L65
            int r3 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            r4.setValue(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L65
            goto L6c
        L65:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L6c:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L7a
        L78:
            r3 = 0
            goto L7d
        L7a:
            java.lang.String r0 = "删除配置失败"
            goto L78
        L7d:
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
        L84:
            return r2
        L85:
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            android.content.SharedPreferences$Editor r0 = r4.edit()
            i0.a1 r3 = r1.f20191i
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r4 = 8
            java.lang.String r3 = og.m.P0(r4, r3)
            java.lang.String r4 = "global_prefix"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            i0.a1 r3 = r1.f20192j
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r4 = 12
            java.lang.String r3 = og.m.P0(r4, r3)
            java.lang.String r6 = "gender_male_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r6, r3)
            i0.a1 r3 = r1.f20193k
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = og.m.P0(r4, r3)
            java.lang.String r6 = "gender_female_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r6, r3)
            i0.a1 r3 = r1.f20194l
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = og.m.P0(r4, r3)
            java.lang.String r4 = "gender_unknown_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            og.k r3 = bb.l.f693c
            i0.a1 r3 = r1.f20195m
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = a7.a.j(r3)
            java.lang.String r4 = "tail_color"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            i0.a1 r3 = r1.f20196n
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = a7.a.j(r3)
            java.lang.String r4 = "bracket_color"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            i0.a1 r3 = r1.f20197o
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = a7.a.j(r3)
            java.lang.String r4 = "gender_color"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            i0.a1 r3 = r1.f20198p
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = a7.a.j(r3)
            java.lang.String r4 = "region_color"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r3)
            i0.a1 r3 = r1.f20199q
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = og.t.f0(r3)
            r4 = 400(0x190, float:5.6E-43)
            if (r3 == 0) goto L156
            int r3 = r3.intValue()
            goto L157
        L156:
            r3 = r4
        L157:
            int r3 = fb.v0.h(r3)
            java.lang.String r6 = "tail_weight"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r3)
            i0.a1 r3 = r1.f20200r
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = og.t.f0(r3)
            if (r3 == 0) goto L174
            int r3 = r3.intValue()
            goto L175
        L174:
            r3 = r4
        L175:
            int r3 = fb.v0.h(r3)
            java.lang.String r6 = "bracket_weight"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r3)
            i0.a1 r3 = r1.f20201s
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = og.t.f0(r3)
            if (r3 == 0) goto L192
            int r3 = r3.intValue()
            goto L193
        L192:
            r3 = r4
        L193:
            int r3 = fb.v0.h(r3)
            java.lang.String r6 = "gender_weight"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r3)
            i0.a1 r3 = r1.f20202t
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = og.t.f0(r3)
            if (r3 == 0) goto L1af
            int r4 = r3.intValue()
        L1af:
            int r3 = fb.v0.h(r4)
            java.lang.String r4 = "region_weight"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r3)
            r0.apply()
            java.lang.String r0 = "设置已保存"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
            return r2
    }
}
