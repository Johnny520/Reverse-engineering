package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn extends gg.j implements fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f20436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ fg.a f20438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20447y;

    public yn(android.content.SharedPreferences r1, android.content.Context r2, fg.a r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r0 = this;
            r0.f20436n = r1
            r0.f20437o = r2
            r0.f20438p = r3
            r0.f20439q = r4
            r0.f20440r = r5
            r0.f20441s = r6
            r0.f20442t = r7
            r0.f20443u = r8
            r0.f20444v = r9
            r0.f20445w = r10
            r0.f20446x = r11
            r0.f20447y = r12
            java.lang.Class<gg.k> r1 = gg.k.class
            java.lang.Class r4 = eh.a.i(r1)
            java.lang.String r6 = "KeywordNotificationTemplatePage$save(Landroid/content/SharedPreferences;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"
            r7 = 0
            r3 = 0
            java.lang.String r5 = "save"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f20436n
            android.content.SharedPreferences$Editor r0 = r0.edit()
            i0.a1 r1 = r3.f20439q
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_keyword_title"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20440r
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_keyword_content"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20441s
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_keyword_toast"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20442t
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_me_title"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20443u
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_me_content"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20444v
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_me_toast"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20445w
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_all_title"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20446x
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_all_content"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            i0.a1 r1 = r3.f20447y
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "keyword_notify_at_all_toast"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            java.lang.String r0 = "模板已保存"
            r1 = 0
            android.content.Context r2 = r3.f20437o
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            fg.a r0 = r3.f20438p
            r0.invoke()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
