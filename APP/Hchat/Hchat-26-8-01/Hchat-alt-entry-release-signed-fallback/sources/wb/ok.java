package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18108m;

    public /* synthetic */ ok(android.content.Context r2, i0.a1 r3, i0.a1 r4, k9.j r5, wb.q3 r6, boolean r7) {
            r1 = this;
            r0 = 0
            r1.f18102g = r0
            r1.<init>()
            r1.f18103h = r7
            r1.f18106k = r2
            r1.f18107l = r5
            r1.f18108m = r6
            r1.f18104i = r3
            r1.f18105j = r4
            return
    }

    public /* synthetic */ ok(boolean r2, fg.a r3, android.app.Activity r4, i0.a1 r5, i0.a1 r6, fg.l r7) {
            r1 = this;
            r0 = 1
            r1.f18102g = r0
            r1.<init>()
            r1.f18103h = r2
            r1.f18106k = r3
            r1.f18107l = r4
            r1.f18104i = r5
            r1.f18105j = r6
            r1.f18108m = r7
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f18102g
            switch(r0) {
                case 0: goto L57;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f18106k
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r11.f18107l
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r11.f18108m
            fg.l r2 = (fg.l) r2
            i0.a1 r3 = r11.f18104i
            java.lang.Object r3 = r3.getValue()
            n2.s r3 = (n2.s) r3
            i2.g r3 = r3.f8976a
            java.lang.String r3 = r3.f6314h
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r4 = r3.length()
            if (r4 != 0) goto L37
            boolean r4 = r11.f18103h
            if (r4 != 0) goto L37
            java.lang.String r0 = "内容不能为空"
            i0.a1 r1 = r11.f18105j
            r1.setValue(r0)
            goto L54
        L37:
            r0.invoke()
            wb.u4 r0 = new wb.u4
            r4 = 4
            r0.<init>(r4, r2, r3)
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L54
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L54
            wb.vu r3 = new wb.vu
            r3.<init>(r1, r0)
            r2.postOnAnimation(r3)
        L54:
            sf.n r0 = sf.n.f12433a
            return r0
        L57:
            java.lang.Object r0 = r11.f18106k
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r11.f18107l
            r2 = r1
            k9.j r2 = (k9.j) r2
            java.lang.Object r1 = r11.f18108m
            wb.q3 r1 = (wb.q3) r1
            boolean r3 = r11.f18103h
            r10 = 0
            if (r3 != 0) goto L74
            java.lang.String r1 = "请填写完整的快捷项信息"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
            r0.show()
            goto Lef
        L74:
            java.lang.String r3 = r2.f7504b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r2.f7506d
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r5 = r4.toString()
            r8 = 0
            r9 = 117(0x75, float:1.64E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            k9.j r2 = k9.j.a(r2, r3, r4, r5, r6, r7, r8, r9)
            k9.j r1 = r1.f18566a
            if (r1 == 0) goto La3
            java.lang.String r3 = r1.f7507e
            java.lang.String r4 = r2.f7507e
            boolean r4 = gg.l.a(r3, r4)
            if (r4 != 0) goto La3
            ig.a.m(r0, r3)
        La3:
            if (r1 == 0) goto Lb2
            java.lang.String r1 = r1.f7508f
            java.lang.String r3 = r2.f7508f
            boolean r3 = gg.l.a(r1, r3)
            if (r3 != 0) goto Lb2
            ig.a.m(r0, r1)
        Lb2:
            i0.a1 r1 = r11.f18104i
            java.lang.Object r3 = r1.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r3 = tf.m.R1(r3)
            java.util.Iterator r4 = r3.iterator()
        Lc2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ldc
            java.lang.Object r5 = r4.next()
            k9.j r5 = (k9.j) r5
            java.lang.String r5 = r5.f7503a
            java.lang.String r6 = r2.f7503a
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Ld9
            goto Ldd
        Ld9:
            int r10 = r10 + 1
            goto Lc2
        Ldc:
            r10 = -1
        Ldd:
            if (r10 < 0) goto Le3
            r3.set(r10, r2)
            goto Le6
        Le3:
            r3.add(r2)
        Le6:
            wb.ho.V0(r0, r1, r3)
            r0 = 0
            i0.a1 r1 = r11.f18105j
            r1.setValue(r0)
        Lef:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
