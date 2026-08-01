package defpackage;

/* JADX INFO: renamed from: ᛸᛸᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1544 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public float f6852;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f6853;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f6854;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public float f6855;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public float f6856;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f6857;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f6858;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public long f6859;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f6860;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final float m2822(long r9) {
            r8 = this;
            long r0 = r8.f6854
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L8
            return r3
        L8:
            long r4 = r8.f6860
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 < 0) goto L28
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L28
        L17:
            long r9 = r9 - r4
            float r0 = r8.f6852
            float r1 = r6 - r0
            float r9 = (float) r9
            int r8 = r8.f6853
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = defpackage.ViewOnTouchListenerC1911.m3344(r9, r3, r6)
            float r8 = r8 * r0
            float r8 = r8 + r1
            return r8
        L28:
            long r9 = r9 - r0
            float r9 = (float) r9
            int r8 = r8.f6857
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = defpackage.ViewOnTouchListenerC1911.m3344(r9, r3, r6)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            return r8
    }
}
