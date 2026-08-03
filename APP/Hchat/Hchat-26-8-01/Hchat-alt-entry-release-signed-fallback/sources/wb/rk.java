package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v8.r f18897j;

    public /* synthetic */ rk(android.content.Context r2, i0.a1 r3, v8.r r4) {
            r1 = this;
            r0 = 0
            r1.f18894g = r0
            r1.<init>()
            r1.f18897j = r4
            r1.f18895h = r2
            r1.f18896i = r3
            return
    }

    public /* synthetic */ rk(android.content.Context r1, i0.a1 r2, v8.r r3, int r4) {
            r0 = this;
            r0.f18894g = r4
            r0.f18895h = r1
            r0.f18896i = r2
            r0.f18897j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f18894g
            switch(r0) {
                case 0: goto La8;
                case 1: goto L65;
                default: goto L5;
            }
        L5:
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            v8.a r2 = (v8.a) r2
            java.lang.String r2 = r2.f14201a
            r0.add(r2)
            goto L13
        L25:
            i0.a1 r1 = r6.f18896i
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r2.next()
            r5 = r4
            v8.a r5 = (v8.a) r5
            java.lang.String r5 = r5.f14201a
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L36
            r3.add(r4)
            goto L36
        L4f:
            v8.r r0 = r6.f18897j
            android.content.Context r2 = r6.f18895h
            wb.ho.k(r0, r2, r1, r3)
            int r7 = r7.size()
            java.lang.String r0 = " 条规则"
            r1 = 0
            java.lang.String r3 = "已删除 "
            wb.en.o(r3, r7, r0, r2, r1)
        L62:
            sf.n r7 = sf.n.f12433a
            return r7
        L65:
            v8.a r7 = (v8.a) r7
            r7.getClass()
            i0.a1 r0 = r6.f18896i
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r1.next()
            r4 = r3
            v8.a r4 = (v8.a) r4
            java.lang.String r4 = r4.f14201a
            java.lang.String r5 = r7.f14201a
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L7b
            r2.add(r3)
            goto L7b
        L96:
            v8.r r7 = r6.f18897j
            android.content.Context r1 = r6.f18895h
            wb.ho.k(r7, r1, r0, r2)
            java.lang.String r7 = "规则已删除"
            r0 = 0
            android.widget.Toast r7 = android.widget.Toast.makeText(r1, r7, r0)
            r7.show()
            goto L62
        La8:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            i0.a1 r1 = r6.f18896i
            r1.setValue(r7)
            v8.r r7 = r6.f18897j
            r7.getClass()
            java.lang.String r7 = "Hchat_auto_message_forward_config"
            android.content.Context r1 = r6.f18895h
            android.content.SharedPreferences r7 = ub.b.c(r1, r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r1 = "enabled"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r1, r0)
            r7.apply()
            goto L62
    }
}
