package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4658d;

    public /* synthetic */ f(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f4655a = r4
            r0.f4657c = r1
            r0.f4656b = r2
            r0.f4658d = r3
            r0.<init>()
            return
    }

    @Override // i0.z
    public final void a() {
            r4 = this;
            int r0 = r4.f4655a
            switch(r0) {
                case 0: goto L68;
                case 1: goto L42;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f4657c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Object r1 = r4.f4656b
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.m.t0(r1)
            java.lang.String r3 = "[已删除]"
            if (r2 == 0) goto L20
            r1 = r3
        L20:
            java.lang.String r2 = "sns_custom_mark_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            java.lang.Object r1 = r4.f4658d
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L37
            goto L38
        L37:
            r3 = r1
        L38:
            java.lang.String r1 = "sns_comment_custom_mark_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r3)
            r0.apply()
            return
        L42:
            java.lang.Object r0 = r4.f4657c
            v0.d r0 = (v0.d) r0
            f.k0 r1 = r0.f13876h
            java.lang.Object r2 = r4.f4656b
            java.lang.Object r1 = r1.k(r2)
            java.lang.Object r3 = r4.f4658d
            v0.i r3 = (v0.i) r3
            if (r1 != r3) goto L67
            java.util.Map r0 = r0.f13875g
            java.util.Map r1 = r3.c()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L64
            r0.remove(r2)
            goto L67
        L64:
            r0.put(r2, r1)
        L67:
            return
        L68:
            java.lang.Object r0 = r4.f4657c
            w0.p r0 = (w0.p) r0
            java.lang.Object r1 = r4.f4656b
            r0.remove(r1)
            java.lang.Object r0 = r4.f4658d
            h.t r0 = (h.t) r0
            f.k0 r0 = r0.f4756c
            r0.k(r1)
            return
    }
}
