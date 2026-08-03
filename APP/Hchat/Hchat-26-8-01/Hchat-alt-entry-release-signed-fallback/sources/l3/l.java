package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements l3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f7805a;

    public l(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f7805a = r1
            return
    }

    public l(android.content.Context r1, java.lang.ClassLoader r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f7805a = r1
            return
    }

    @Override // l3.h
    public void a(a7.a r9) {
            r8 = this;
            l3.a r7 = new l3.a
            java.lang.String r0 = "EmojiCompatInitializer"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            ac.l r1 = new ac.l
            r2 = 20
            r1.<init>(r8, r9, r0, r2)
            r0.execute(r1)
            return
    }

    public android.content.SharedPreferences b() {
            r2 = this;
            android.content.Context r0 = r2.f7805a
            java.lang.String r1 = "Hchat_redpacket_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            return r0
    }

    public int c(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.b()     // Catch: java.lang.Throwable -> L9
            int r2 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            return r3
    }

    public java.lang.String d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.b()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lb
            return r2
        Lb:
            return r3
    }

    public boolean e() {
            r3 = this;
            java.lang.String r0 = "hb_auto_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r3.b()     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r2.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            return r1
    }

    public boolean f() {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L16
            java.lang.String r0 = "hb_grab_mode"
            r1 = 1
            android.content.SharedPreferences r2 = r3.b()     // Catch: java.lang.Throwable -> L12
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != r1) goto L16
            return r1
        L16:
            r0 = 0
            return r0
    }
}
