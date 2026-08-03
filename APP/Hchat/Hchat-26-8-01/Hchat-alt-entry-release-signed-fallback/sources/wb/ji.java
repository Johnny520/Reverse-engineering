package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ji implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f17053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17057l;

    public /* synthetic */ ji(boolean r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f17052g = r6
            r0.f17053h = r1
            r0.f17054i = r2
            r0.f17055j = r3
            r0.f17056k = r4
            r0.f17057l = r5
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f17052g
            switch(r0) {
                case 0: goto L81;
                case 1: goto L4d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f17054i
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r8.f17055j
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r8.f17056k
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r8.f17057l
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r2.getValue()
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L26
            boolean r4 = r8.f17053h
            if (r4 != 0) goto L26
            goto L4a
        L26:
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r0.invoke()
            wb.xi r0 = new wb.xi
            r4 = 21
            r0.<init>(r3, r4, r2)
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L4a
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L4a
            wb.vu r3 = new wb.vu
            r3.<init>(r1, r0)
            r2.postOnAnimation(r3)
        L4a:
            sf.n r0 = sf.n.f12433a
            return r0
        L4d:
            java.lang.Object r0 = r8.f17054i
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r8.f17055j
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r8.f17056k
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r8.f17057l
            java.lang.Integer r3 = (java.lang.Integer) r3
            boolean r4 = r8.f17053h
            if (r4 == 0) goto L7e
            java.util.Locale r4 = java.util.Locale.US
            r1.intValue()
            r2.intValue()
            r3.intValue()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            r2 = 3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "%02d:%02d:%02d"
            java.lang.String r1 = java.lang.String.format(r4, r2, r1)
            r0.invoke(r1)
        L7e:
            sf.n r0 = sf.n.f12433a
            return r0
        L81:
            java.lang.Object r0 = r8.f17054i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r8.f17055j
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r8.f17056k
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r8.f17057l
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r4 = og.m.t0(r2)
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            if (r4 == 0) goto La8
            r2 = r5
        La8:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> Lbb
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Lbb
            r4.<init>(r2, r6)     // Catch: java.lang.Throwable -> Lbb
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> Lbb
            r6.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r4.format(r6)     // Catch: java.lang.Throwable -> Lbb
            goto Lc2
        Lbb:
            r4 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r4)
            r4 = r6
        Lc2:
            boolean r4 = r4 instanceof sf.f
            boolean r6 = r8.f17053h
            r7 = 0
            if (r6 == 0) goto Ld5
            if (r4 == 0) goto Ld5
            java.lang.String r1 = "时间格式无效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r7)
            r0.show()
            goto L102
        Ld5:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto Le7
            java.lang.String r3 = "{name}撤回了上一条消息 {content}"
        Le7:
            java.lang.String r6 = "anti_recall_notice_text"
            android.content.SharedPreferences$Editor r1 = r1.putString(r6, r3)
            if (r4 != 0) goto Lf0
            r5 = r2
        Lf0:
            java.lang.String r2 = "anti_recall_notice_time_format"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r5)
            r1.apply()
            java.lang.String r1 = "设置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r7)
            r0.show()
        L102:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
