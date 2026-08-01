package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1209 extends defpackage.AbstractC1793 {
    public static final android.os.Parcelable.Creator<defpackage.C1209> CREATOR = null;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 1
            r0.<init>(r1)
            defpackage.C1209.CREATOR = r0
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m2343(android.content.Context r4) {
            r0 = 1
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            java.lang.String r3 = "com.android.permission.GET_INSTALLED_APPS"
            android.content.pm.PermissionInfo r2 = r2.getPermissionInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            if (r2 == 0) goto L1a
            int r4 = r2.getProtection()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            if (r4 != r0) goto L15
            return r0
        L15:
            return r1
        L16:
            r2 = move-exception
            r2.printStackTrace()
        L1a:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L29
            java.lang.String r2 = "oem_installed_apps_runtime_permission_enable"
            int r4 = android.provider.Settings.Secure.getInt(r4, r2)     // Catch: android.provider.Settings.SettingNotFoundException -> L29
            if (r4 != r0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            return r0
        L29:
            r4 = move-exception
            r4.printStackTrace()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static boolean m2344(android.content.Context r3) {
            int r0 = defpackage.AbstractC1536.f6760
            r1 = 76334938(0x48cc75a, float:3.3096917E-36)
            r2 = 0
            if (r0 != r1) goto L21
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            java.lang.String r0 = "com.samsung.android.permission.GET_APP_LIST"
            android.content.pm.PermissionInfo r3 = r3.getPermissionInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            if (r3 == 0) goto L21
            int r3 = r3.getProtection()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            r0 = 1
            if (r3 != r0) goto L1c
            return r0
        L1c:
            return r2
        L1d:
            r3 = move-exception
            r3.printStackTrace()
        L21:
            return r2
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int mo2345(android.app.Activity r1) {
            r0 = this;
            boolean r0 = m2343(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r0 = m2344(r1)
            if (r0 == 0) goto Lf
            goto L34
        Lf:
            int r0 = defpackage.AbstractC1536.f6760
            r1 = 67983659(0x40d592b, float:1.6615414E-36)
            if (r0 != r1) goto L34
            java.lang.String r0 = defpackage.AbstractC1536.f6759
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L24
            goto L34
        L24:
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            if (r1 != 0) goto L2e
            goto L34
        L2e:
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Exception -> L34
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L34
        L34:
            r0 = 2
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.util.ArrayList mo2346(android.app.Activity r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = defpackage.AbstractC1536.m2794()
            if (r1 == 0) goto L11
            boolean r1 = defpackage.AbstractC1536.m2788()
            if (r1 != 0) goto L1d
        L11:
            boolean r1 = defpackage.AbstractC1536.m2795()
            if (r1 == 0) goto L32
            boolean r1 = defpackage.AbstractC1536.m2788()
            if (r1 == 0) goto L32
        L1d:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "miui.intent.action.APP_PERM_EDITOR"
            r1.<init>(r2)
            java.lang.String r2 = "extra_pkgname"
            java.lang.String r3 = r5.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.add(r1)
            goto L4d
        L32:
            int r1 = defpackage.AbstractC1536.f6760
            r2 = 67983659(0x40d592b, float:1.6615414E-36)
            if (r1 != r2) goto L4d
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.meizu.safe.security.SHOW_APPSEC"
            r1.<init>(r2)
            java.lang.String r2 = "packageName"
            java.lang.String r3 = r5.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.add(r1)
        L4d:
            r1 = 1
            ᲁᛱᛲᛳ[] r1 = new defpackage.AbstractC1793[r1]
            r2 = 0
            r1[r2] = r4
            android.content.Intent r4 = defpackage.AbstractC2193.m3593(r5, r1)
            r0.add(r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.settings.MANAGE_APPLICATIONS_SETTINGS"
            r4.<init>(r5)
            r0.add(r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.settings.APPLICATION_SETTINGS"
            r4.<init>(r5)
            r0.add(r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.settings.SETTINGS"
            r4.<init>(r5)
            r0.add(r4)
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean mo2347(android.content.Context r8, boolean r9) {
            r7 = this;
            java.lang.String r7 = "OP_GET_INSTALLED_APPS"
            boolean r9 = m2343(r8)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L14
            java.lang.String r7 = "com.android.permission.GET_INSTALLED_APPS"
            int r7 = r8.checkSelfPermission(r7)
            if (r7 != 0) goto L13
            return r1
        L13:
            return r0
        L14:
            boolean r9 = m2344(r8)
            if (r9 == 0) goto L24
            java.lang.String r7 = "com.samsung.android.permission.GET_APP_LIST"
            int r7 = r8.checkSelfPermission(r7)
            if (r7 != 0) goto L23
            return r1
        L23:
            return r0
        L24:
            int r9 = defpackage.AbstractC1536.f6760
            r2 = 67983659(0x40d592b, float:1.6615414E-36)
            r3 = -1
            if (r9 != r2) goto L76
            java.lang.String r9 = defpackage.AbstractC1536.f6759
            if (r9 == 0) goto L31
            goto L33
        L31:
            java.lang.String r9 = ""
        L33:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L3a
            goto L4b
        L3a:
            java.lang.String r2 = "\\."
            java.lang.String[] r9 = r9.split(r2)
            int r2 = r9.length
            if (r2 != 0) goto L44
            goto L4b
        L44:
            r9 = r9[r0]     // Catch: java.lang.Exception -> L4b
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L4b
            goto L4c
        L4b:
            r9 = r3
        L4c:
            r2 = 9
            if (r9 < r2) goto L76
            android.content.ContentResolver r7 = r8.getContentResolver()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = r8.getPackageName()
            r9.append(r8)
            java.lang.String r8 = "_op_56"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            int r7 = android.provider.Settings.Secure.getInt(r7, r8, r3)
            r8 = 4
            if (r7 == r8) goto Lf2
            r8 = 6
            if (r7 != r8) goto L75
            goto Lf2
        L75:
            return r0
        L76:
            int r9 = defpackage.AbstractC1536.f6760
            r2 = 2366768(0x241d30, float:3.316548E-39)
            if (r9 != r2) goto Lf2
            java.lang.Class<android.app.AppOpsManager> r9 = android.app.AppOpsManager.class
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Exception -> Lf2
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Lf2
            r2.getDeclaredField(r7)     // Catch: java.lang.Exception -> Lf2
            boolean r2 = defpackage.AbstractC1536.m2788()
            if (r2 != 0) goto L91
            goto Lf2
        L91:
            java.lang.Object r2 = r8.getSystemService(r9)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            if (r2 != 0) goto L9b
        L99:
            r7 = r3
            goto Leb
        L9b:
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Exception -> Lb4
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Field r7 = r9.getDeclaredField(r7)     // Catch: java.lang.Exception -> Lb4 java.lang.NoSuchFieldException -> Lb6
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Exception -> Lb4 java.lang.NoSuchFieldException -> Lb6
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> Lb4 java.lang.NoSuchFieldException -> Lb6
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> Lb4 java.lang.NoSuchFieldException -> Lb6
            goto Lb8
        Lb4:
            r7 = move-exception
            goto Le7
        Lb6:
            r7 = 10022(0x2726, float:1.4044E-41)
        Lb8:
            java.lang.String r4 = "checkOpNoThrow"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r5, r6}     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r9 = r9.getMethod(r4, r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lb4
            android.content.pm.ApplicationInfo r4 = r8.getApplicationInfo()     // Catch: java.lang.Exception -> Lb4
            int r4 = r4.uid     // Catch: java.lang.Exception -> Lb4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r4, r8}     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r9.invoke(r2, r7)     // Catch: java.lang.Exception -> Lb4
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> Lb4
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> Lb4
            goto Leb
        Le7:
            r7.printStackTrace()
            goto L99
        Leb:
            if (r7 != r3) goto Lee
            goto Lf2
        Lee:
            if (r7 != 0) goto Lf1
            r0 = r1
        Lf1:
            r1 = r0
        Lf2:
            return r1
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final boolean mo2348(android.content.Context r2) {
            r1 = this;
            boolean r1 = super.mo2348(r2)
            if (r1 == 0) goto L31
            boolean r0 = m2343(r2)
            if (r0 != 0) goto L30
            boolean r2 = m2344(r2)
            if (r2 == 0) goto L13
            goto L30
        L13:
            int r2 = defpackage.AbstractC1536.f6760
            r0 = 2366768(0x241d30, float:3.316548E-39)
            if (r2 != r0) goto L2f
            if (r2 != r0) goto L31
            java.lang.String r2 = "OP_GET_INSTALLED_APPS"
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L31
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L31
            r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L31
            boolean r1 = defpackage.AbstractC1536.m2788()
        L2f:
            return r1
        L30:
            r1 = 1
        L31:
            return r1
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final int mo1202() {
            r0 = this;
            r0 = 17
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.String mo1205() {
            r0 = this;
            java.lang.String r0 = "com.android.permission.GET_INSTALLED_APPS"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1207(android.app.Activity r1, java.util.ArrayList r2, defpackage.C1939 r3, java.util.ArrayList r4, defpackage.C1604 r5) {
            r0 = this;
            super.mo1207(r1, r2, r3, r4, r5)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 30
            if (r0 >= r1) goto Le
            goto L26
        Le:
            java.lang.String r0 = "android.permission.QUERY_ALL_PACKAGES"
            ᛸᲈᛷᛳ r0 = defpackage.AbstractC1793.m3185(r0, r4)
            if (r0 != 0) goto L26
            java.lang.Object r0 = r3.f8443
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            goto L26
        L21:
            java.lang.String r0 = "Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"android.permission.QUERY_ALL_PACKAGES\" />, or add the app package name to the <queries> tag in the AndroidManifest.xml file"
            defpackage.C2264.m3676(r0)
        L26:
            return
    }
}
