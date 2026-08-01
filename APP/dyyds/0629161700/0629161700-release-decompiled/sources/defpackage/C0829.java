package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0829 extends defpackage.AbstractC1793 {
    public static final android.os.Parcelable.Creator<defpackage.C0829> CREATOR = null;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 6
            r0.<init>(r1)
            defpackage.C0829.CREATOR = r0
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.String mo1201() {
            r0 = this;
            java.lang.String r0 = "storage_group"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final int mo1202() {
            r0 = this;
            r0 = 23
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1204(android.app.Activity r1, java.util.ArrayList r2) {
            r0 = this;
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 33
            if (r0 >= r1) goto Lb
            return
        Lb:
            java.lang.String r0 = "When the project targetSdkVersion >= 33, the \"android.permission.READ_EXTERNAL_STORAGE\" permission cannot be applied for, and some problems will occur.Because after testing, if targetSdkVersion >= 33 applies for \"android.permission.READ_EXTERNAL_STORAGE\" or \"android.permission.WRITE_EXTERNAL_STORAGE\", it will be directly rejected by the system and no authorization dialog box will be displayed.If the App has been adapted for scoped storage, the should be requested \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" or \"android.permission.READ_MEDIA_AUDIO\" permission.If the App does not need to adapt scoped storage, the should be requested \"android.permission.MANAGE_EXTERNAL_STORAGE\" permission"
            defpackage.C2264.m3684(r0)
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.String mo1205() {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final boolean mo1206(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4e
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 < r1) goto L4e
            java.lang.String r2 = "android.permission.READ_MEDIA_IMAGES"
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1904(r2)
            if (r0 == 0) goto L17
            goto L21
        L17:
            ᛴᛳᲁᲈ r0 = new ᛴᛳᲁᲈ
            r0.<init>()
            ᲈᛸᛲᛵ r1 = defpackage.AbstractC0956.f4262
            r1.m3734(r2, r0)
        L21:
            boolean r2 = r0.mo2347(r3, r4)
            if (r2 == 0) goto L4c
            java.lang.String r2 = "android.permission.READ_MEDIA_VIDEO"
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1904(r2)
            if (r0 == 0) goto L30
            goto L3a
        L30:
            ᛳᛲᛸᛸ r0 = new ᛳᛲᛸᛸ
            r0.<init>()
            ᲈᛸᛲᛵ r1 = defpackage.AbstractC0956.f4262
            r1.m3734(r2, r0)
        L3a:
            boolean r2 = r0.mo2347(r3, r4)
            if (r2 == 0) goto L4c
            ᲁᛱᛲᛳ r2 = defpackage.AbstractC0956.m1903()
            boolean r2 = r2.mo2347(r3, r4)
            if (r2 == 0) goto L4c
            r2 = 1
            return r2
        L4c:
            r2 = 0
            return r2
        L4e:
            boolean r2 = super.mo1206(r3, r4)
            return r2
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1207(android.app.Activity r1, java.util.ArrayList r2, defpackage.C1939 r3, java.util.ArrayList r4, defpackage.C1604 r5) {
            r0 = this;
            super.mo1207(r1, r2, r3, r4, r5)
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = defpackage.AbstractC1592.m2879(r0, r2)
            if (r0 == 0) goto Lc
            goto L5e
        Lc:
            java.lang.Object r0 = r3.f8442
            ᲁᲁᛴᲇ r0 = (defpackage.C1926) r0
            if (r0 != 0) goto L13
            goto L5e
        L13:
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            java.lang.Object r2 = r0.f8366
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L40
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            ᲈᛶᲁᛸ r3 = (defpackage.C2273) r3
            java.lang.String r4 = "ScopedStorage"
            java.lang.String r5 = r3.f9620
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L23
            java.lang.String r2 = r3.f9621
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            goto L41
        L40:
            r2 = 0
        L41:
            r3 = 29
            if (r1 < r3) goto L52
            boolean r0 = r0.f8365
            if (r0 != 0) goto L52
            if (r2 == 0) goto L4c
            goto L52
        L4c:
            java.lang.String r0 = "Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version"
            defpackage.C2264.m3676(r0)
            return
        L52:
            r0 = 30
            if (r1 < r0) goto L5e
            if (r2 == 0) goto L59
            goto L5e
        L59:
            java.lang.String r0 = "The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use \"android.permission.MANAGE_EXTERNAL_STORAGE\" to apply for permission"
            defpackage.C2264.m3684(r0)
        L5e:
            return
    }
}
