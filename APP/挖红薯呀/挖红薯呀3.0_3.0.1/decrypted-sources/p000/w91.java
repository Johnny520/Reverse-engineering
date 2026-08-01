package p000;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w91 {

    /* JADX INFO: renamed from: a */
    public static final jo0 f7050a;

    /* JADX INFO: renamed from: b */
    public static Paint f7051b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g60.m1208g("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            f7050a = new x91();
        } else {
            f7050a = new jo0();
        }
        new C0910x1(14);
        f7051b = null;
        Trace.endSection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Typeface m4926a(Context context, C0107cw[] c0107cwArr) {
        g60.m1208g("TypefaceCompat.createFromFontInfo");
        try {
            jo0 jo0Var = f7050a;
            jo0Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyM1738q = jo0Var.m1738q(c0107cwArr, context.getContentResolver());
                if (fontFamilyM1738q != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyM1738q).setStyle(jo0.m1732p(fontFamilyM1738q).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Font m4927b(Typeface typeface) {
        if (f7051b == null) {
            f7051b = new Paint();
        }
        f7051b.setTextSize(10.0f);
        f7051b.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f7051b);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
