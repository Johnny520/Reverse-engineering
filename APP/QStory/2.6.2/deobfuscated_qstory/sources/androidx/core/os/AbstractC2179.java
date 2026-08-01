package androidx.core.os;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.widget.TextView;
import androidx.appcompat.widget.C0225;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2179 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m3965(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static PrecomputedText.Params m3966(C0225 c0225) {
        return c0225.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m3967(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String[] m3968(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Bitmap m3969(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Handler m3970(Looper looper) {
        return Handler.createAsync(looper);
    }
}
