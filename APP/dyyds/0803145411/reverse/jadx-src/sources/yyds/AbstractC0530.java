package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;

/* JADX INFO: renamed from: yyds.ᛳᛲᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0530 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ColorMatrixColorFilter f2558 = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Gainmap m1370(Gainmap gainmap) {
        Bitmap gainmapContents = gainmap.getGainmapContents();
        Bitmap.Config config = gainmapContents.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
        if (config != config2) {
            return gainmap;
        }
        AbstractC0319.m985("", gainmapContents.getConfig() == config2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(f2558);
        canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
        float[] ratioMin = gainmap.getRatioMin();
        gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
        float[] ratioMax = gainmap.getRatioMax();
        gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
        float[] gamma = gainmap.getGamma();
        gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
        float[] epsilonSdr = gainmap.getEpsilonSdr();
        gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
        float[] epsilonHdr = gainmap.getEpsilonHdr();
        gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
        gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
        gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
        return gainmap2;
    }
}
