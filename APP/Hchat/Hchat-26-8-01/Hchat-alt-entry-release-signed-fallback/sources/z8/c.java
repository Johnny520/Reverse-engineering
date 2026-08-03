package z8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z8.d f22634b;

    public /* synthetic */ c(z8.d r1, int r2) {
            r0 = this;
            r0.f22633a = r2
            r0.f22634b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f22633a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r3)
            return
        L9:
            r3.getClass()
            z8.d r3 = r2.f22634b
            java.lang.ThreadLocal r0 = r3.f22639d
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            goto L1f
        L1e:
            r0 = r1
        L1f:
            int r0 = r0 - r1
            if (r0 > 0) goto L28
            java.lang.ThreadLocal r3 = r3.f22639d
            r3.remove()
            goto L31
        L28:
            java.lang.ThreadLocal r3 = r3.f22639d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.set(r0)
        L31:
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f22633a
            r4.getClass()
            switch(r0) {
                case 0: goto L26;
                default: goto L8;
            }
        L8:
            z8.d r4 = r3.f22634b
            java.lang.ThreadLocal r0 = r4.f22639d
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L19
            int r0 = r0.intValue()
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.ThreadLocal r4 = r4.f22639d
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.set(r0)
            return
        L26:
            z8.d r0 = r3.f22634b
            r8.g r0 = r0.f22636a
            android.content.Context r0 = r0.f11620a
            java.lang.String r1 = "Hchat_call_media_limit_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            java.lang.String r1 = "call_media_limit_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L3c
            goto L41
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.setResult(r0)
        L41:
            return
    }
}
