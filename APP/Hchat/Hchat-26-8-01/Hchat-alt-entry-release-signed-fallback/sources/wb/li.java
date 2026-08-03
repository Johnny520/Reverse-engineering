package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17516k;

    public /* synthetic */ li(android.content.Context r2, android.content.SharedPreferences r3, java.lang.String r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f17512g = r0
            r1.<init>()
            r1.f17513h = r2
            r1.f17514i = r3
            r1.f17515j = r4
            r1.f17516k = r5
            return
    }

    public /* synthetic */ li(android.content.Context r2, i0.a1 r3, android.content.SharedPreferences r4, java.lang.String r5) {
            r1 = this;
            r0 = 0
            r1.f17512g = r0
            r1.<init>()
            r1.f17513h = r2
            r1.f17516k = r3
            r1.f17514i = r4
            r1.f17515j = r5
            return
    }

    public /* synthetic */ li(android.content.SharedPreferences r2, java.lang.String r3, android.content.Context r4, i0.a1 r5) {
            r1 = this;
            r0 = 2
            r1.f17512g = r0
            r1.<init>()
            r1.f17514i = r2
            r1.f17515j = r3
            r1.f17513h = r4
            r1.f17516k = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f17512g
            switch(r0) {
                case 0: goto L56;
                case 1: goto L2a;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r9.f17516k
            java.lang.String r1 = ""
            r0.setValue(r1)
            android.content.SharedPreferences r0 = r9.f17514i
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = r9.f17515j
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            java.lang.String r0 = "铃声已清空"
            r1 = 0
            android.content.Context r2 = r9.f17513h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            sf.n r0 = sf.n.f12433a
            return r0
        L2a:
            android.content.Context r2 = r9.f17513h
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L34
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L42
            java.lang.String r0 = "当前页面无法打开文件选择器"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L53
        L42:
            wb.vq r7 = wb.vq.f19807a
            wb.oi r1 = new wb.oi
            r6 = 0
            android.content.SharedPreferences r3 = r9.f17514i
            java.lang.String r4 = r9.f17515j
            i0.a1 r5 = r9.f17516k
            r1.<init>(r2, r3, r4, r5, r6)
            r7.c(r0, r1)
        L53:
            sf.n r0 = sf.n.f12433a
            return r0
        L56:
            android.content.Context r2 = r9.f17513h
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L60
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L6e
            java.lang.String r0 = "当前页面无法打开铃声选择器"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L86
        L6e:
            wb.vq r7 = wb.vq.f19807a
            i0.a1 r5 = r9.f17516k
            java.lang.Object r1 = r5.getValue()
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            wb.oi r1 = new wb.oi
            r6 = 1
            android.content.SharedPreferences r3 = r9.f17514i
            java.lang.String r4 = r9.f17515j
            r1.<init>(r2, r3, r4, r5, r6)
            r7.d(r0, r8, r1)
        L86:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
