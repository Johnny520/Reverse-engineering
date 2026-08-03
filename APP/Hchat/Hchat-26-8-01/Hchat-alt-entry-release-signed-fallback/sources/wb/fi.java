package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16176k;

    public /* synthetic */ fi(int r1, android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5) {
            r0 = this;
            r0.f16172g = r1
            r0.f16173h = r3
            r0.f16174i = r2
            r0.f16175j = r4
            r0.f16176k = r5
            r0.<init>()
            return
    }

    public /* synthetic */ fi(android.content.Context r2, i0.a1 r3, i0.a1 r4, android.content.SharedPreferences r5) {
            r1 = this;
            r0 = 2
            r1.f16172g = r0
            r1.<init>()
            r1.f16174i = r2
            r1.f16175j = r3
            r1.f16176k = r4
            r1.f16173h = r5
            return
    }

    public /* synthetic */ fi(android.content.SharedPreferences r2, i0.a1 r3, i0.a1 r4, android.content.Context r5) {
            r1 = this;
            r0 = 0
            r1.f16172g = r0
            r1.<init>()
            r1.f16173h = r2
            r1.f16175j = r3
            r1.f16176k = r4
            r1.f16174i = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f16172g
            switch(r0) {
                case 0: goto L150;
                case 1: goto L10c;
                case 2: goto L80;
                case 3: goto L44;
                default: goto L5;
            }
        L5:
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            i0.a1 r0 = r8.f16175j
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = wb.ho.q7(r1, r9)
            r0.setValue(r1)
            android.content.SharedPreferences r0 = r8.f16173h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "group_member_reply_template_bindings"
            java.lang.String r1 = r9.e0.A(r1)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            int r9 = r9.size()
            java.lang.String r0 = " 个群"
            r1 = 0
            java.lang.String r2 = "模板已套用到 "
            android.content.Context r3 = r8.f16174i
            wb.en.o(r2, r9, r0, r3, r1)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            i0.a1 r0 = r8.f16176k
            r0.setValue(r9)
        L41:
            sf.n r9 = sf.n.f12433a
            return r9
        L44:
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            i0.a1 r0 = r8.f16175j
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = wb.ho.s7(r1, r9)
            r0.setValue(r1)
            android.content.SharedPreferences r0 = r8.f16173h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "message_block_bindings"
            java.lang.String r1 = a2.a.e(r1)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            int r9 = r9.size()
            java.lang.String r0 = " 个名单项"
            r1 = 0
            java.lang.String r2 = "已保存 "
            android.content.Context r3 = r8.f16174i
            wb.en.o(r2, r9, r0, r3, r1)
            r9 = 0
            i0.a1 r0 = r8.f16176k
            r0.setValue(r9)
            goto L41
        L80:
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r9.iterator()
        L8e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r1.next()
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            r0.add(r2)
            goto L8e
        La0:
            i0.a1 r1 = r8.f16175j
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Set r2 = wb.ho.y6(r2)
            java.util.Set r2 = tf.d0.T(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r2 = wb.ho.D5(r2)
            i0.a1 r3 = r8.f16176k
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lc7:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Le0
            java.lang.Object r6 = r4.next()
            r7 = r6
            q9.h r7 = (q9.h) r7
            java.lang.String r7 = r7.f10768a
            boolean r7 = r0.contains(r7)
            if (r7 != 0) goto Lc7
            r5.add(r6)
            goto Lc7
        Le0:
            java.util.Iterator r0 = r0.iterator()
        Le4:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lf6
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r6 = r8.f16173h
            wb.ho.j5(r6, r4, r2, r5)
            goto Le4
        Lf6:
            r1.setValue(r2)
            r3.setValue(r5)
            int r9 = r9.size()
            java.lang.String r0 = " 个监听群"
            r1 = 0
            java.lang.String r2 = "已删除 "
            android.content.Context r3 = r8.f16174i
            wb.en.o(r2, r9, r0, r3, r1)
            goto L41
        L10c:
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            i0.a1 r0 = r8.f16175j
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = wb.ho.r7(r1, r9)
            r0.setValue(r1)
            android.content.SharedPreferences r1 = r8.f16173h
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.String r0 = x6.d.t(r0)
            java.lang.String r2 = "group_rename_template_bindings"
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.apply()
            int r9 = r9.size()
            java.lang.String r0 = " 个群"
            r1 = 0
            java.lang.String r2 = "模板已套用到 "
            android.content.Context r3 = r8.f16174i
            wb.en.o(r2, r9, r0, r3, r1)
            wb.h4 r9 = wb.h4.f16486b
            i0.a1 r0 = r8.f16176k
            r0.setValue(r9)
            goto L41
        L150:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            java.lang.String r1 = "zombie_check_enable"
            i0.a1 r2 = r8.f16175j
            android.content.SharedPreferences r3 = r8.f16173h
            wb.en.m(r2, r9, r3, r1, r0)
            if (r0 != 0) goto L180
            i0.a1 r9 = r8.f16176k
            java.lang.Object r0 = r9.getValue()
            rb.m r0 = (rb.m) r0
            boolean r0 = r0.f11930b
            if (r0 != 0) goto L177
            java.lang.Object r0 = r9.getValue()
            rb.m r0 = (rb.m) r0
            boolean r0 = r0.f11937i
            if (r0 == 0) goto L180
        L177:
            rb.a r0 = fb.v0.I()
            android.content.Context r1 = r8.f16174i
            wb.ho.t4(r1, r9, r0)
        L180:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
