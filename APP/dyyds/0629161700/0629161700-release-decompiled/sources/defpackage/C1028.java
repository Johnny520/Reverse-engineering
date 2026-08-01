package defpackage;

/* JADX INFO: renamed from: ᛶᛲᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1028 extends defpackage.AbstractC1793 {
    public static final android.os.Parcelable.Creator<defpackage.C1028> CREATOR = null;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 10
            r0.<init>(r1)
            defpackage.C1028.CREATOR = r0
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.String mo1201() {
            r0 = this;
            java.lang.String r0 = "image_and_video_media_group"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final int mo1202() {
            r0 = this;
            r0 = 34
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1204(android.app.Activity r1, java.util.ArrayList r2) {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = defpackage.AbstractC1592.m2879(r0, r2)
            if (r0 != 0) goto L16
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r0 = defpackage.AbstractC1592.m2879(r0, r2)
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.lang.String r0 = "You cannot request the \"android.permission.READ_MEDIA_VISUAL_USER_SELECTED\" permission alone. must add either \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" permission, or maybe both"
            defpackage.C2264.m3684(r0)
        L16:
            return
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.String mo1205() {
            r0 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            return r0
    }

    @Override // defpackage.AbstractC1793
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int mo1981(android.app.Activity r1) {
            r0 = this;
            r0 = 33
            return r0
    }
}
