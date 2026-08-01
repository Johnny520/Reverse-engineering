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
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p000.AbstractC6087;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Paint f20806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0268 f20807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC4921 f20808;

    static {
        AbstractC6087.m11401("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f20808 = new C7669();
        } else if (i >= 29) {
            f20808 = new C7667();
        } else if (i >= 28) {
            f20808 = new C7668();
        } else {
            f20808 = new C7661();
        }
        f20807 = new C0268(16);
        f20806 = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Font m12903(Typeface typeface) {
        if (f20806 == null) {
            f20806 = new Paint();
        }
        f20806.setTextSize(10.0f);
        f20806.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f20806);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Typeface m12904(String str) {
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
    public static String m12905(Resources resources, int i, String str, int i2, int i3) {
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
    public static android.graphics.Typeface m12906(android.content.Context r16, p161.InterfaceC7639 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, p161.AbstractC7641 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p164.AbstractC7662.m12906(android.content.Context, 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世哲兰苏, android.content.res.Resources, int, java.lang.String, int, int, 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世苏兰哲, boolean):android.graphics.Typeface");
    }
}
