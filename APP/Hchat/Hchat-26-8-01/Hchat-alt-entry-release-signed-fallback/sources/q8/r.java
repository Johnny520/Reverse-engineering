package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10735a;

    public r(android.content.Context r1, i8.f r2) {
            r0 = this;
            r0.<init>()
            r0.f10735a = r1
            return
    }

    public final android.content.Intent[] a(java.lang.String r8) {
            r7 = this;
            android.content.Context r0 = r7.f10735a
            r1 = 872415232(0x34000000, float:1.1920929E-7)
            r2 = 0
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "com.tencent.mm.ui.LauncherUI"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1d
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L1d
            r3.addFlags(r1)     // Catch: java.lang.Throwable -> L1d
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L30
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.Intent r3 = r4.getLaunchIntentForPackage(r5)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            r3.addFlags(r1)     // Catch: java.lang.Throwable -> L30
        L30:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L5f
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "com.tencent.mm.ui.chatting.ChattingUI"
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L60
            r1.setComponent(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Chat_User"
            r1.putExtra(r0, r8)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "Chat_Mode"
            r0 = 1
            r1.putExtra(r8, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "finish_direct"
            r1.putExtra(r8, r0)     // Catch: java.lang.Throwable -> L60
            r8 = 603979776(0x24000000, float:2.7755576E-17)
            r1.addFlags(r8)     // Catch: java.lang.Throwable -> L60
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r3 == 0) goto L69
            if (r1 == 0) goto L69
            android.content.Intent[] r8 = new android.content.Intent[]{r3, r1}
            return r8
        L69:
            if (r1 == 0) goto L70
            android.content.Intent[] r8 = new android.content.Intent[]{r1}
            return r8
        L70:
            if (r3 == 0) goto L77
            android.content.Intent[] r8 = new android.content.Intent[]{r3}
            return r8
        L77:
            return r2
    }

    public final void b(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatNotifyApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }
}
