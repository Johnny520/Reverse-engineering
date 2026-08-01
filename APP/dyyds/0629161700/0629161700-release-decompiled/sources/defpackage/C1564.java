package defpackage;

/* JADX INFO: renamed from: ᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final float f6920;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1180 f6921;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f6922;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.app.ActivityManager f6923;

    public C1564(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f6920 = r0
            r2.f6922 = r3
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r2.f6923 = r0
            ᛶᲈᛱᲈ r1 = new ᛶᲈᛱᲈ
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r1.<init>(r3)
            r2.f6921 = r1
            boolean r3 = r0.isLowRamDevice()
            if (r3 == 0) goto L2b
            r3 = 0
            r2.f6920 = r3
        L2b:
            return
    }
}
