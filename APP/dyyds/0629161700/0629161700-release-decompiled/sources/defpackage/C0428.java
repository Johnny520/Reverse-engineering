package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0428 extends defpackage.AbstractC1793 {
    public static final android.os.Parcelable.Creator<defpackage.C0428> CREATOR = null;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 9
            r0.<init>(r1)
            defpackage.C0428.CREATOR = r0
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.String mo1201() {
            r0 = this;
            java.lang.String r0 = "image_and_video_media_group"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int mo1202() {
            r0 = this;
            r0 = 33
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final boolean mo1203(android.content.Context r1, boolean r2) {
            r0 = this;
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1905()
            boolean r0 = r0.mo2347(r1, r2)
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo1204(android.app.Activity r1, java.util.ArrayList r2) {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = defpackage.AbstractC1592.m2879(r0, r2)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "You have added the \"android.permission.READ_MEDIA_VIDEO\" permission, please do not add the \"android.permission.READ_EXTERNAL_STORAGE\" permission, this conflicts with the framework's automatic compatibility policy."
            defpackage.C2264.m3684(r0)
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.String mo1205() {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final boolean mo1206(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L21
            if (r4 != 0) goto L21
            java.lang.String r2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            ᲁᛱᛲᛳ r4 = defpackage.AbstractC0956.m1904(r2)
            if (r4 == 0) goto L11
            goto L1b
        L11:
            ᛶᛲᲇᛴ r4 = new ᛶᛲᲇᛴ
            r4.<init>()
            ᲈᛸᛲᛵ r0 = defpackage.AbstractC0956.f4262
            r0.m3734(r2, r4)
        L1b:
            r2 = 0
            boolean r2 = r4.mo2347(r3, r2)
            return r2
        L21:
            boolean r2 = super.mo1206(r3, r4)
            return r2
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo1207(android.app.Activity r1, java.util.ArrayList r2, defpackage.C1939 r3, java.util.ArrayList r4, defpackage.C1604 r5) {
            r0 = this;
            super.mo1207(r1, r2, r3, r4, r5)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            int r0 = r0.minSdkVersion
            r1 = 33
            if (r1 <= r0) goto L18
            r0 = 32
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            ᛸᲈᛷᛳ r2 = defpackage.AbstractC1793.m3185(r1, r4)
            defpackage.AbstractC1793.m3186(r2, r1, r0)
        L18:
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.List mo1208() {
            r0 = this;
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1905()
            ᲁᛱᛲᛳ[] r0 = new defpackage.AbstractC1793[]{r0}
            java.util.ArrayList r0 = defpackage.AbstractC1592.m2881(r0)
            return r0
    }
}
