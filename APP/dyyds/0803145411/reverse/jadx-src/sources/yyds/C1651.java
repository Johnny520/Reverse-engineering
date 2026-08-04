package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲁᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1651 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f8434;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f8435;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f8436;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f8437;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f8438;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f8439;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public float f8440;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f8441;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f8442;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float m3375(long j) {
        if (j < this.f8436) {
            return 0.0f;
        }
        long j2 = this.f8439;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC0386.m1108((j - r0) / this.f8437, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f8434;
        return (ViewOnTouchListenerC0386.m1108((j - j2) / this.f8435, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
