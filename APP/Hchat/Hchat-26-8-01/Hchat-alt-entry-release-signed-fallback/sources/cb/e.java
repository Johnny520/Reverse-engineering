package cb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb.f f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1619c;

    public e(cb.f r1, int r2, int r3) {
            r0 = this;
            r0.f1617a = r1
            r0.f1618b = r2
            r0.f1619c = r3
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            r6.getClass()
            cb.f r0 = r5.f1617a
            r8.g r0 = r0.f1621b
            android.content.Context r1 = r0.f11620a
            java.lang.String r2 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r3 = "round_avatar_enable"
            r4 = 0
            boolean r1 = r1.getBoolean(r3, r4)
            if (r1 != 0) goto L19
            goto L69
        L19:
            int r1 = r5.f1618b
            if (r1 < 0) goto L69
            java.lang.Object[] r3 = r6.args
            int r4 = r3.length
            if (r1 >= r4) goto L69
            android.content.Context r0 = r0.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r2)
            java.lang.String r2 = "round_avatar_radius_factor"
            r4 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0.getFloat(r2, r4)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r9.e0.q(r0, r2, r4)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = ig.a.X(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3[r1] = r0
            int r0 = r5.f1619c
            if (r0 < 0) goto L69
            java.lang.Object[] r1 = r6.args
            int r2 = r1.length
            if (r0 >= r2) goto L69
            r1 = r1[r0]
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L58
            java.lang.Number r1 = (java.lang.Number) r1
            goto L59
        L58:
            r1 = 0
        L59:
            if (r1 == 0) goto L69
            int r1 = r1.intValue()
            java.lang.Object[] r6 = r6.args
            r1 = r1 & (-5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r0] = r1
        L69:
            return
    }
}
