package defpackage;

/* JADX INFO: renamed from: ᲁᛱᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1793 implements android.os.Parcelable {
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.C1604 m3185(java.lang.String r2, java.util.ArrayList r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()
            ᛸᲈᛷᛳ r0 = (defpackage.C1604) r0
            java.lang.String r1 = r0.f7097
            boolean r1 = defpackage.AbstractC1592.m2887(r1, r2)
            if (r1 == 0) goto L4
            return r0
        L19:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3186(defpackage.C1604 r3, java.lang.String r4, int r5) {
            if (r3 == 0) goto L4a
            int r3 = r3.f7098
            if (r3 >= r5) goto L49
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The AndroidManifest.xml file <uses-permission android:name=\""
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "\" android:maxSdkVersion=\""
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "\" /> does not meet the requirements, "
            r1.append(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r4) goto L2b
            java.lang.String r3 = "the minimum requirement for maxSdkVersion is "
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r5, r3)
            goto L3e
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "please delete the android:maxSdkVersion=\""
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "\" attribute"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L3e:
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L49:
            return
        L4a:
            java.lang.String r3 = "Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\""
            java.lang.String r5 = "\" />"
            java.lang.String r3 = defpackage.AbstractC0225.m817(r3, r4, r5)
            defpackage.C2264.m3676(r3)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.AbstractC1793
            if (r0 == 0) goto L17
            ᲁᛱᛲᛳ r2 = (defpackage.AbstractC1793) r2
            java.lang.String r1 = r1.mo1205()
            java.lang.String r2 = r2.mo1205()
            boolean r1 = defpackage.AbstractC1592.m2887(r1, r2)
            return r1
        L17:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L26
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r1.mo1205()
            boolean r1 = defpackage.AbstractC1592.m2887(r1, r2)
            return r1
        L26:
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.mo1205()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public int mo2345(android.app.Activity r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public java.util.ArrayList mo2346(android.app.Activity r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            boolean r1 = defpackage.AbstractC1536.m2795()
            java.lang.String r2 = "extra_pkgname"
            java.lang.String r3 = "miui.intent.action.APP_PERM_EDITOR"
            if (r1 == 0) goto L27
            boolean r1 = defpackage.AbstractC1536.m2788()
            if (r1 == 0) goto L27
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3)
            java.lang.String r3 = r6.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.add(r1)
            goto L6e
        L27:
            boolean r1 = defpackage.AbstractC1536.m2794()
            if (r1 == 0) goto L53
            boolean r1 = defpackage.AbstractC1536.m2788()
            if (r1 == 0) goto L53
            java.lang.String r1 = defpackage.AbstractC1536.f6759
            if (r1 == 0) goto L38
            goto L3a
        L38:
            java.lang.String r1 = ""
        L3a:
            java.lang.String r4 = "^2\\.0\\.[0-5]\\.\\d+$"
            boolean r1 = r1.matches(r4)
            if (r1 != 0) goto L6e
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3)
            java.lang.String r3 = r6.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.add(r1)
            goto L6e
        L53:
            int r1 = defpackage.AbstractC1536.f6760
            r2 = 67983659(0x40d592b, float:1.6615414E-36)
            if (r1 != r2) goto L6e
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.meizu.safe.security.SHOW_APPSEC"
            r1.<init>(r2)
            java.lang.String r2 = "packageName"
            java.lang.String r3 = r6.getPackageName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.add(r1)
        L6e:
            ᲁᛱᛲᛳ[] r5 = new defpackage.AbstractC1793[]{r5}
            android.content.Intent r5 = defpackage.AbstractC2193.m3593(r6, r5)
            r0.add(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.MANAGE_APPLICATIONS_SETTINGS"
            r5.<init>(r6)
            r0.add(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.APPLICATION_SETTINGS"
            r5.<init>(r6)
            r0.add(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.SETTINGS"
            r5.<init>(r6)
            r0.add(r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public boolean mo2347(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = r2.mo1202()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r0 <= r1) goto Ld
            boolean r2 = r2.mo1203(r3, r4)
            return r2
        Ld:
            boolean r2 = r2.mo1206(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public java.lang.String mo1201() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public boolean mo2348(android.content.Context r1) {
            r0 = this;
            int r0 = r0.mo1202()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r0 > r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract int mo1202();

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public boolean mo1203(android.content.Context r1, boolean r2) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo1204(android.app.Activity r1, java.util.ArrayList r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public abstract java.lang.String mo1205();

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public boolean mo1206(android.content.Context r1, boolean r2) {
            r0 = this;
            java.lang.String r0 = r0.mo1205()
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public void mo1207(android.app.Activity r1, java.util.ArrayList r2, defpackage.C1939 r3, java.util.ArrayList r4, defpackage.C1604 r5) {
            r0 = this;
            java.lang.String r0 = r0.mo1205()
            r1 = 2147483647(0x7fffffff, float:NaN)
            m3186(r5, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public int mo1981(android.app.Activity r1) {
            r0 = this;
            int r0 = r0.mo1202()
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public java.util.List mo1208() {
            r0 = this;
            r0 = 0
            return r0
    }
}
