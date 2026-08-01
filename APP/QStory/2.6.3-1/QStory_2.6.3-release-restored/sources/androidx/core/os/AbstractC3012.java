package androidx.core.os;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.widget.TextView;
import androidx.appcompat.widget.C1072;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3012 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4535(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static PrecomputedText.Params m4536(C1072 c1072) {
        return c1072.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m4537(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String[] m4538(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Bitmap m4539(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Handler m4540(Looper looper) {
        return Handler.createAsync(looper);
    }
}
