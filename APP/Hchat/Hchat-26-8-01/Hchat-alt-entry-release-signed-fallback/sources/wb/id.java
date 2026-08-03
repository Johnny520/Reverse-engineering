package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class id implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16803l;

    public /* synthetic */ id(int r1, android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r0 = this;
            r0.f16798g = r1
            r0.f16799h = r2
            r0.f16800i = r3
            r0.f16801j = r4
            r0.f16802k = r5
            r0.f16803l = r6
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f16798g
            switch(r0) {
                case 0: goto Lf6;
                default: goto L5;
            }
        L5:
            i0.a1 r1 = r11.f16801j
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "${sendText}"
            android.content.Context r3 = r11.f16799h
            i0.a1 r4 = r11.f16802k
            r5 = 0
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r6 = r5
            r7 = r6
        L25:
            r8 = 4
            int r6 = og.m.r0(r0, r2, r6, r5, r8)
            if (r6 >= 0) goto L3a
            r0 = 1
            if (r7 == r0) goto L3f
            java.lang.String r0 = "文本格式必须且只能包含一个原消息变量"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
            goto Lf3
        L3a:
            int r7 = r7 + 1
            int r6 = r6 + 11
            goto L25
        L3f:
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            i0.a1 r6 = r11.f16803l
            java.lang.String r7 = "HH:mm:ss"
            java.lang.String r8 = ""
            if (r0 == 0) goto L88
            java.lang.Object r0 = r6.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L5c
            r0 = r8
        L5c:
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            boolean r10 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L73
            if (r10 == 0) goto L6b
            r0 = r7
        L6b:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L73
            r9.<init>(r0, r10)     // Catch: java.lang.Throwable -> L73
            goto L79
        L73:
            r0 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r0)
        L79:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L88
            java.lang.String r0 = "时间格式无效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
            goto Lf3
        L88:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L91
            r0 = r8
        L91:
            boolean r9 = og.m.t0(r0)
            if (r9 == 0) goto L98
            goto L99
        L98:
            r2 = r0
        L99:
            r4.setValue(r2)
            java.lang.Object r0 = r6.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto La5
            goto La6
        La5:
            r8 = r0
        La6:
            java.lang.CharSequence r0 = og.m.R0(r8)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto Lb5
            goto Lb6
        Lb5:
            r7 = r0
        Lb6:
            r6.setValue(r7)
            android.content.SharedPreferences r0 = r11.f16800i
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "message_affix_enable"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            java.lang.Object r1 = r4.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "message_affix_text_format"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            java.lang.Object r1 = r6.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "message_affix_time_format"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            java.lang.String r0 = "设置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
        Lf3:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf6:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.x r2 = new ca.x
            r8 = 14
            android.content.Context r3 = r11.f16799h
            android.content.SharedPreferences r4 = r11.f16800i
            i0.a1 r5 = r11.f16801j
            i0.a1 r6 = r11.f16802k
            i0.a1 r7 = r11.f16803l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.post(r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
