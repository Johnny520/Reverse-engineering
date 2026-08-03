package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21432k;

    public /* synthetic */ f(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f21428g = r5
            r0.f21429h = r1
            r0.f21430i = r2
            r0.f21431j = r3
            r0.f21432k = r4
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f21428g
            switch(r0) {
                case 0: goto L26;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f21429h
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r11.f21430i
            r3 = r1
            i.c r3 = (i.c) r3
            java.lang.Object r1 = r11.f21431j
            r4 = r1
            i.c r4 = (i.c) r4
            java.lang.Object r1 = r11.f21432k
            r5 = r1
            i.c r5 = (i.c) r5
            w.e0 r2 = new w.e0
            r7 = 4
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 3
            qg.v.q(r0, r6, r2, r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L26:
            java.lang.Object r0 = r11.f21430i
            xa.m r0 = (xa.m) r0
            java.lang.Object r1 = r11.f21431j
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r11.f21432k
            xa.i r2 = (xa.i) r2
            android.app.Activity r3 = r2.f21438a
            java.lang.Object r4 = r11.f21429h
            java.lang.Throwable r5 = sf.g.b(r4)
            r6 = 0
            if (r5 != 0) goto Lec
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L5b
            r0.getClass()
            boolean r0 = xa.m.a(r1)
            if (r0 != 0) goto L50
            goto L101
        L50:
            java.lang.String r0 = "暂无好友标签，请先新建标签"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r6)
            r0.show()
            goto L101
        L5b:
            r0.getClass()
            boolean r1 = xa.m.a(r3)
            if (r1 != 0) goto L66
            goto L101
        L66:
            lg.d r1 = a.a.X(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L73:
            r6 = r1
            lg.c r6 = (lg.c) r6
            boolean r7 = r6.f8047i
            if (r7 == 0) goto L99
            java.lang.Object r6 = r6.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r7 = r4.get(r7)
            h.Hchat.hooks.api.model.ContactLabelBean r7 = (h.Hchat.hooks.api.model.ContactLabelBean) r7
            java.util.List<java.lang.String> r7 = r7.userNameList
            java.lang.String r8 = r2.f21439b
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L73
            r5.add(r6)
            goto L73
        L99:
            java.util.Set r7 = tf.m.U1(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = tf.n.e1(r4)
            r6.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Laa:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Ld5
            java.lang.Object r5 = r1.next()
            h.Hchat.hooks.api.model.ContactLabelBean r5 = (h.Hchat.hooks.api.model.ContactLabelBean) r5
            java.lang.String r8 = r5.labelName
            boolean r9 = og.m.t0(r8)
            if (r9 == 0) goto Lc0
            java.lang.String r8 = r5.labelId
        Lc0:
            java.util.List<java.lang.String> r5 = r5.userNameList
            int r5 = r5.size()
            java.lang.String r9 = " 位好友"
            java.lang.String r5 = p.a.i(r5, r9)
            sf.e r9 = new sf.e
            r9.<init>(r8, r5)
            r6.add(r9)
            goto Laa
        Ld5:
            wb.dj r8 = new wb.dj
            r1 = 12
            r8.<init>(r0, r2, r4, r1)
            k.s1 r9 = new k.s1
            r0 = 7
            r9.<init>(r0)
            r10 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "设置好友标签"
            java.lang.String r5 = "取消全部勾选可清空该好友的标签"
            wb.y2.Z1(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L101
        Lec:
            ia.t r0 = r0.f21446b
            java.lang.String r2 = "载入好友标签失败"
            r0.invoke(r2, r5)
            boolean r0 = xa.m.a(r1)
            if (r0 != 0) goto Lfa
            goto L101
        Lfa:
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r6)
            r0.show()
        L101:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
