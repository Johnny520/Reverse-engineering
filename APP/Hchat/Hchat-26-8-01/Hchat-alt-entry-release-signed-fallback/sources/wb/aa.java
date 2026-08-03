package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f14968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f14969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14972l;

    public /* synthetic */ aa(int r1, android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r0 = this;
            r0.f14967g = r1
            r0.f14969i = r2
            r0.f14970j = r4
            r0.f14968h = r3
            r0.f14971k = r5
            r0.f14972l = r6
            r0.<init>()
            return
    }

    public /* synthetic */ aa(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 0
            r1.f14967g = r0
            r1.<init>()
            r1.f14969i = r2
            r1.f14968h = r3
            r1.f14970j = r4
            r1.f14971k = r5
            r1.f14972l = r6
            return
    }

    public /* synthetic */ aa(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 1
            r1.f14967g = r0
            r1.<init>()
            r1.f14968h = r2
            r1.f14969i = r3
            r1.f14970j = r4
            r1.f14971k = r5
            r1.f14972l = r6
            return
    }

    public /* synthetic */ aa(android.content.SharedPreferences r2, i0.a1 r3, i0.a1 r4, android.content.Context r5, i0.a1 r6) {
            r1 = this;
            r0 = 3
            r1.f14967g = r0
            r1.<init>()
            r1.f14968h = r2
            r1.f14970j = r3
            r1.f14971k = r4
            r1.f14969i = r5
            r1.f14972l = r6
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f14967g
            switch(r0) {
                case 0: goto L212;
                case 1: goto L1b3;
                case 2: goto L14a;
                case 3: goto L70;
                default: goto L5;
            }
        L5:
            java.util.List r13 = (java.util.List) r13
            r13.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r13.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            na.i r2 = (na.i) r2
            java.lang.String r2 = r2.f9143a
            r0.add(r2)
            goto L13
        L25:
            i0.a1 r5 = r12.f14970j
            java.lang.Object r1 = r5.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            r3 = r2
            na.i r3 = (na.i) r3
            java.lang.String r3 = r3.f9143a
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L36
            r8.add(r2)
            goto L36
        L4f:
            r5.setValue(r8)
            r9 = 0
            r10 = 80
            android.content.SharedPreferences r3 = r12.f14968h
            i0.a1 r4 = r12.f14971k
            i0.a1 r6 = r12.f14972l
            r7 = 0
            wb.ho.Y2(r3, r4, r5, r6, r7, r8, r9, r10)
            int r13 = r13.size()
            java.lang.String r0 = " 个适用聊天"
        L65:
            r1 = 0
            java.lang.String r2 = "已删除 "
            android.content.Context r3 = r12.f14969i
            wb.en.o(r2, r13, r0, r3, r1)
            sf.n r13 = sf.n.f12433a
            return r13
        L70:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.B2
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 12
            android.content.SharedPreferences r4 = r12.f14968h
            i0.a1 r5 = r12.f14970j
            i0.a1 r6 = r12.f14971k
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -1434247720(0xffffffffaa831dd8, float:-2.3290983E-13)
            r7 = 1
            r3.<init>(r4, r0, r7)
            r.h.a(r13, r1, r3, r2)
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L147
            s0.d r0 = wb.p0.C2
            r.h.a(r13, r1, r0, r2)
            wb.oa r0 = new wb.oa
            r3 = 4
            android.content.Context r4 = r12.f14969i
            i0.a1 r5 = r12.f14972l
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r8 = -1505187021(0xffffffffa648ab33, float:-6.9620957E-16)
            r3.<init>(r8, r0, r7)
            r.h.a(r13, r1, r3, r2)
            java.lang.Object r0 = r6.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ldd
            s0.d r0 = wb.p0.D2
            r.h.a(r13, r1, r0, r2)
            wb.oa r0 = new wb.oa
            r3 = 5
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r8 = 1401782990(0x538d82ce, float:1.2155699E12)
            r3.<init>(r8, r0, r7)
            r.h.a(r13, r1, r3, r2)
        Ldd:
            ba.a[] r0 = ba.a.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r8 = r0.length
            r9 = 0
        Le8:
            if (r9 >= r8) goto Lf6
            r10 = r0[r9]
            ba.a r11 = ba.a.f545h
            if (r10 == r11) goto Lf3
            r3.add(r10)
        Lf3:
            int r9 = r9 + 1
            goto Le8
        Lf6:
            java.util.Iterator r0 = r3.iterator()
        Lfa:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L147
            java.lang.Object r3 = r0.next()
            ba.a r3 = (ba.a) r3
            f0.h r8 = new f0.h
            r9 = 12
            r8.<init>(r3, r9)
            s0.d r9 = new s0.d
            r10 = -758334516(0xffffffffd2ccbbcc, float:-4.3966202E11)
            r9.<init>(r10, r8, r7)
            r.h.a(r13, r1, r9, r2)
            wb.zm r8 = new wb.zm
            r9 = 0
            r8.<init>(r3, r4, r5, r9)
            s0.d r9 = new s0.d
            r10 = -1846076605(0xffffffff91f71b43, float:-3.898653E-28)
            r9.<init>(r10, r8, r7)
            r.h.a(r13, r1, r9, r2)
            java.lang.Object r8 = r6.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lfa
            wb.zm r8 = new wb.zm
            r9 = 1
            r8.<init>(r3, r4, r5, r9)
            s0.d r3 = new s0.d
            r9 = -940215193(0xffffffffc7f57467, float:-125672.805)
            r3.<init>(r9, r8, r7)
            r.h.a(r13, r1, r3, r2)
            goto Lfa
        L147:
            sf.n r13 = sf.n.f12433a
            return r13
        L14a:
            java.util.List r13 = (java.util.List) r13
            r13.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r13.iterator()
        L158:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16a
            java.lang.Object r2 = r1.next()
            ua.h r2 = (ua.h) r2
            java.lang.String r2 = r2.f13618a
            r0.add(r2)
            goto L158
        L16a:
            i0.a1 r5 = r12.f14970j
            java.lang.Object r1 = r5.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L17b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L194
            java.lang.Object r3 = r1.next()
            r4 = r3
            ua.h r4 = (ua.h) r4
            java.lang.String r4 = r4.f13618a
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L17b
            r2.add(r3)
            goto L17b
        L194:
            r5.setValue(r2)
            java.lang.Object r0 = r5.getValue()
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            r10 = 80
            android.content.SharedPreferences r3 = r12.f14968h
            i0.a1 r4 = r12.f14971k
            i0.a1 r6 = r12.f14972l
            r7 = 0
            wb.ho.J(r3, r4, r5, r6, r7, r8, r9, r10)
            int r13 = r13.size()
            java.lang.String r0 = " 个适用聊天"
            goto L65
        L1b3:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r0 = r13.intValue()
            i0.a1 r1 = r12.f14970j
            r1.setValue(r13)
            i0.a1 r13 = r12.f14971k
            java.lang.String r1 = ""
            r13.setValue(r1)
            android.content.SharedPreferences r2 = r12.f14968h
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r4 = "hb_notify_sound_mode"
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r0)
            java.lang.String r4 = "hb_notify_sound_uri"
            android.content.SharedPreferences$Editor r1 = r3.putString(r4, r1)
            r1.apply()
            i0.a1 r1 = r12.f14972l
            r3 = 0
            r1.setValue(r3)
            android.content.Context r1 = r12.f14969i
            boolean r4 = r1 instanceof android.app.Activity
            if (r4 == 0) goto L1e9
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3
        L1e9:
            if (r3 != 0) goto L1f6
            java.lang.String r13 = "当前页面无法打开铃声选择器"
            r0 = 0
            android.widget.Toast r13 = android.widget.Toast.makeText(r1, r13, r0)
            r13.show()
            goto L20f
        L1f6:
            ca.k r4 = new ca.k
            r4.<init>(r2, r1, r13, r0)
            r1 = 1
            if (r0 != r1) goto L204
            wb.vq r13 = wb.vq.f19807a
            r13.c(r3, r4)
            goto L20f
        L204:
            wb.vq r0 = wb.vq.f19807a
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r0.d(r3, r13, r4)
        L20f:
            sf.n r13 = sf.n.f12433a
            return r13
        L212:
            i0.a0 r13 = (i0.a0) r13
            r13.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r13 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            wb.id r0 = new wb.id
            r1 = 0
            android.content.Context r2 = r12.f14969i
            android.content.SharedPreferences r3 = r12.f14968h
            i0.a1 r4 = r12.f14970j
            i0.a1 r5 = r12.f14971k
            i0.a1 r6 = r12.f14972l
            r0.<init>(r1, r2, r3, r4, r5, r6)
            eb.b0 r13 = r13.subscribePluginCatalog(r2, r0)
            wb.bo r0 = new wb.bo
            r0.<init>(r13, r1)
            return r0
    }
}
