package p164;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import androidx.collection.C0268;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p053.AbstractC6561;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7663 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Paint f20801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0268 f20802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC6561 f20803;

    static {
        AbstractC8175.m13651("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f20803 = new C7670();
        } else if (i >= 29) {
            f20803 = new C7668();
        } else if (i >= 28) {
            f20803 = new C7669();
        } else {
            f20803 = new C7662();
        }
        f20802 = new C0268(16);
        f20801 = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Font m12932(Typeface typeface) {
        if (f20801 == null) {
            f20801 = new Paint();
        }
        f20801.setTextSize(10.0f);
        f20801.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f20801);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Typeface m12933(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m12934(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + SignatureVisitor.SUPER + str + SignatureVisitor.SUPER + i2 + SignatureVisitor.SUPER + i + SignatureVisitor.SUPER + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m12935(android.content.Context r16, p161.InterfaceC7640 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, p161.AbstractC7642 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p164.AbstractC7663.m12935(android.content.Context, 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世哲兰苏, android.content.res.Resources, int, java.lang.String, int, int, 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世苏兰哲, boolean):android.graphics.Typeface");
    }
}
