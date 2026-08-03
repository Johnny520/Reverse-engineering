package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18599r;

    public /* synthetic */ qa(android.content.Context r2, fg.l r3, q9.g r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r1 = this;
            r0 = 0
            r1.f18588g = r0
            r1.<init>()
            r1.f18594m = r2
            r1.f18595n = r3
            r1.f18596o = r4
            r1.f18589h = r5
            r1.f18590i = r6
            r1.f18591j = r7
            r1.f18592k = r8
            r1.f18593l = r9
            r1.f18597p = r10
            r1.f18598q = r11
            r1.f18599r = r12
            return
    }

    public /* synthetic */ qa(android.content.SharedPreferences r2, qg.t r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, android.content.Context r12) {
            r1 = this;
            r0 = 2
            r1.f18588g = r0
            r1.<init>()
            r1.f18595n = r2
            r1.f18596o = r3
            r1.f18589h = r4
            r1.f18590i = r5
            r1.f18591j = r6
            r1.f18592k = r7
            r1.f18593l = r8
            r1.f18597p = r9
            r1.f18598q = r10
            r1.f18599r = r11
            r1.f18594m = r12
            return
    }

    public /* synthetic */ qa(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, android.content.SharedPreferences r6, java.lang.String r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r1 = this;
            r0 = 1
            r1.f18588g = r0
            r1.<init>()
            r1.f18594m = r2
            r1.f18595n = r3
            r1.f18596o = r4
            r1.f18597p = r5
            r1.f18598q = r6
            r1.f18599r = r7
            r1.f18589h = r8
            r1.f18590i = r9
            r1.f18591j = r10
            r1.f18592k = r11
            r1.f18593l = r12
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r23 = this;
            r0 = r23
            int r1 = r0.f18588g
            switch(r1) {
                case 0: goto Ldb;
                case 1: goto L6e;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f18595n
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f18596o
            qg.t r2 = (qg.t) r2
            java.lang.Object r3 = r0.f18597p
            r9 = r3
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r3 = r0.f18598q
            r10 = r3
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r3 = r0.f18599r
            r14 = r3
            i0.a1 r14 = (i0.a1) r14
            java.lang.Object r3 = r0.f18594m
            r12 = r3
            android.content.Context r12 = (android.content.Context) r12
            i0.a1 r4 = r0.f18589h
            i0.a1 r5 = r0.f18590i
            i0.a1 r6 = r0.f18591j
            i0.a1 r7 = r0.f18592k
            i0.a1 r8 = r0.f18593l
            x8.u r3 = wb.ho.r(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = "ai_stream"
            r5 = 0
            boolean r22 = r1.getBoolean(r4, r5)
            x8.u r1 = r3.b()
            x8.a r15 = new x8.a
            java.lang.String r3 = r1.f21366b
            java.lang.String r4 = r1.f21367c
            java.lang.String r5 = r1.f21368d
            java.lang.String r6 = r1.f21369e
            java.lang.String r7 = r1.f21370f
            int r1 = r1.f21371g
            r21 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = "正在测试..."
            r14.setValue(r1)
            ci.e r11 = new ci.e
            r16 = 9
            r13 = r15
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r1 = 3
            qg.v.q(r2, r15, r11, r1)
        L6b:
            sf.n r1 = sf.n.f12433a
            return r1
        L6e:
            java.lang.Object r1 = r0.f18594m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f18595n
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f18596o
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f18597p
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f18598q
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.Object r6 = r0.f18599r
            java.lang.String r6 = (java.lang.String) r6
            i0.a1 r7 = r0.f18589h
            java.lang.String r8 = "global"
            r7.setValue(r8)
            i0.a1 r7 = r0.f18590i
            r7.setValue(r1)
            i0.a1 r7 = r0.f18591j
            r7.setValue(r2)
            i0.a1 r7 = r0.f18592k
            r7.setValue(r3)
            i0.a1 r7 = r0.f18593l
            r7.setValue(r4)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r7 = "group_rename_prompt_type"
            java.lang.String r7 = x6.d.E(r7, r6)
            android.content.SharedPreferences$Editor r5 = r5.putString(r7, r8)
            java.lang.String r7 = "group_rename_both_order"
            java.lang.String r7 = x6.d.E(r7, r6)
            android.content.SharedPreferences$Editor r1 = r5.putString(r7, r1)
            java.lang.String r5 = "group_rename_text"
            java.lang.String r5 = x6.d.E(r5, r6)
            android.content.SharedPreferences$Editor r1 = r1.putString(r5, r2)
            java.lang.String r2 = "group_rename_card_title"
            java.lang.String r2 = x6.d.E(r2, r6)
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            java.lang.String r2 = "group_rename_card_desc"
            java.lang.String r2 = x6.d.E(r2, r6)
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)
            r1.apply()
            goto L6b
        Ldb:
            java.lang.Object r1 = r0.f18594m
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.f18595n
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f18596o
            q9.g r3 = (q9.g) r3
            java.lang.Object r4 = r0.f18597p
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r0.f18598q
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r0.f18599r
            i0.a1 r6 = (i0.a1) r6
            i0.a1 r7 = r0.f18589h
            java.lang.Object r8 = r7.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            r9 = 0
            if (r8 == 0) goto L10d
            java.lang.String r2 = "请输入模板名称"
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r9)
            r1.show()
            goto L1c3
        L10d:
            java.lang.Object r1 = r7.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r12 = r1.toString()
            i0.a1 r1 = r0.f18590i
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            i0.a1 r1 = r0.f18591j
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = og.t.f0(r1)
            if (r1 == 0) goto L13f
            int r1 = r1.intValue()
            r7 = 600(0x258, float:8.41E-43)
            int r9 = r9.e0.r(r1, r9, r7)
        L13f:
            r14 = r9
            i0.a1 r1 = r0.f18592k
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r7 = r1.hashCode()
            r8 = 3029889(0x2e3b81, float:4.245779E-39)
            java.lang.String r9 = "text"
            if (r7 == r8) goto L171
            r8 = 3046160(0x2e7b10, float:4.26858E-39)
            if (r7 == r8) goto L168
            r8 = 3556653(0x36452d, float:4.983932E-39)
            if (r7 == r8) goto L161
            goto L179
        L161:
            boolean r7 = r1.equals(r9)
            if (r7 != 0) goto L17b
            goto L179
        L168:
            java.lang.String r7 = "card"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L17b
            goto L179
        L171:
            java.lang.String r7 = "both"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L17b
        L179:
            r15 = r9
            goto L17c
        L17b:
            r15 = r1
        L17c:
            i0.a1 r1 = r0.f18593l
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.String r7 = "card_first"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L192
        L18f:
            r16 = r7
            goto L195
        L192:
            java.lang.String r7 = "text_first"
            goto L18f
        L195:
            java.lang.Object r1 = r4.getValue()
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r5.getValue()
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r1 = r6.getValue()
            r19 = r1
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r11 = r3.f10759a
            r12.getClass()
            r17.getClass()
            r18.getClass()
            r19.getClass()
            q9.g r10 = new q9.g
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.invoke(r10)
        L1c3:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
