package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1948 extends defpackage.AbstractC1793 {
    public static final android.os.Parcelable.Creator<defpackage.C1948> CREATOR = null;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 7
            r0.<init>(r1)
            defpackage.C1948.CREATOR = r0
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final int mo1202() {
            r0 = this;
            r0 = 33
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final boolean mo1203(android.content.Context r1, boolean r2) {
            r0 = this;
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1905()
            boolean r0 = r0.mo2347(r1, r2)
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1204(android.app.Activity r1, java.util.ArrayList r2) {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = defpackage.AbstractC1592.m2879(r0, r2)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "You have added the \"android.permission.READ_MEDIA_AUDIO\" permission, please do not add the \"android.permission.READ_EXTERNAL_STORAGE\" permission, this conflicts with the framework's automatic compatibility policy."
            defpackage.C2264.m3684(r0)
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.String mo1205() {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
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
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.util.List mo1208() {
            r0 = this;
            ᲁᛱᛲᛳ r0 = defpackage.AbstractC0956.m1905()
            ᲁᛱᛲᛳ[] r0 = new defpackage.AbstractC1793[]{r0}
            java.util.ArrayList r0 = defpackage.AbstractC1592.m2881(r0)
            return r0
    }
}
