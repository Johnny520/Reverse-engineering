package defpackage;

/* JADX INFO: renamed from: ᲁᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1822 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final android.graphics.ColorMatrixColorFilter f7955 = null;

    static {
            android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
            r1 = 20
            float[] r1 = new float[r1]
            r1 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 0, 1132396544} // fill-array
            r0.<init>(r1)
            defpackage.AbstractC1822.f7955 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.graphics.Gainmap m3212(android.graphics.Gainmap r7) {
            android.graphics.Bitmap r0 = r7.getGainmapContents()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            if (r1 == r2) goto Ld
            return r7
        Ld:
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L17
            r1 = r4
            goto L18
        L17:
            r1 = r3
        L18:
            java.lang.String r2 = ""
            defpackage.C0292.m945(r2, r1)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r5)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            android.graphics.ColorMatrixColorFilter r6 = defpackage.AbstractC1822.f7955
            r5.setColorFilter(r6)
            r6 = 0
            r2.drawBitmap(r0, r6, r6, r5)
            r0 = 0
            r2.setBitmap(r0)
            android.graphics.Gainmap r0 = new android.graphics.Gainmap
            r0.<init>(r1)
            float[] r1 = r7.getRatioMin()
            r2 = r1[r3]
            r5 = r1[r4]
            r6 = 2
            r1 = r1[r6]
            r0.setRatioMin(r2, r5, r1)
            float[] r1 = r7.getRatioMax()
            r2 = r1[r3]
            r5 = r1[r4]
            r1 = r1[r6]
            r0.setRatioMax(r2, r5, r1)
            float[] r1 = r7.getGamma()
            r2 = r1[r3]
            r5 = r1[r4]
            r1 = r1[r6]
            r0.setGamma(r2, r5, r1)
            float[] r1 = r7.getEpsilonSdr()
            r2 = r1[r3]
            r5 = r1[r4]
            r1 = r1[r6]
            r0.setEpsilonSdr(r2, r5, r1)
            float[] r1 = r7.getEpsilonHdr()
            r2 = r1[r3]
            r3 = r1[r4]
            r1 = r1[r6]
            r0.setEpsilonHdr(r2, r3, r1)
            float r1 = r7.getDisplayRatioForFullHdr()
            r0.setDisplayRatioForFullHdr(r1)
            float r7 = r7.getMinDisplayRatioForHdrTransition()
            r0.setMinDisplayRatioForHdrTransition(r7)
            return r0
    }
}
