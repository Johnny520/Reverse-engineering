package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2043;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2007;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2016;
import androidx.compose.ui.text.input.InterfaceC2005;
import kotlin.text.AbstractC5143;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857 implements InterfaceC0875 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m1657(C7327 c7327, float f, float f2) {
        float f3 = c7327.f19545;
        if (f > c7327.f19543 || f3 > f) {
            return false;
        }
        return f2 <= c7327.f19542 && c7327.f19544 <= f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m1658(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ExtractedText m1659(C2013 c2013) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2013.f5946.f6128;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2013.f5945;
        extractedText.selectionStart = C2035.m3747(j);
        extractedText.selectionEnd = C2035.m3740(j);
        extractedText.flags = !AbstractC5143.m10172(c2013.f5946.f6128, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m1660(C2033 c2033, int i) {
        int iM3778 = c2033.f5989.m3778(i);
        return i == c2033.m3737(iM3778) || i == c2033.f5989.m3779(iM3778, false) ? c2033.m3736(i) != c2033.m3735(i) : c2033.m3735(i) != c2033.m3735(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m1661(C0943 c0943, C7327 c7327, C7327 c73272, int i) {
        long jM1668 = m1668(c0943, c7327, i);
        if (C2035.m3742(jM1668)) {
            return C2035.f6002;
        }
        long jM16682 = m1668(c0943, c73272, i);
        if (C2035.m3742(jM16682)) {
            return C2035.f6002;
        }
        int i2 = (int) (jM1668 >> 32);
        int i3 = (int) (jM16682 & 4294967295L);
        return AbstractC2048.m3760(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m1662(long j, C2068 c2068, boolean z, C0877 c0877) {
        if (z) {
            int i = C2035.f6001;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c2068, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c2068.f6128.length() ? Character.codePointAt(c2068, iCharCount2) : 10;
            if (m1667(iCodePointBefore) && (m1666(iCodePointAt) || m1669(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c2068, iCharCount);
                    }
                } while (m1667(iCodePointBefore));
                j = AbstractC2048.m3760(iCharCount, iCharCount2);
            } else if (m1667(iCodePointAt) && (m1666(iCodePointBefore) || m1669(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c2068.f6128.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c2068, iCharCount2);
                    }
                } while (m1667(iCodePointAt));
                j = AbstractC2048.m3760(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        c0877.invoke(new C0864(new InterfaceC2005[]{new C2016(i2, i2), new C2007(C2035.m3741(j), 0)}));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1663(InterfaceC2129 interfaceC2129, C0860 c0860, C0943 c0943, C0882 c0882) {
        return interfaceC2129.mo3856(new C0868(c0860, c0943, c0882));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m1664(C2062 c2062, long j, InterfaceC1863 interfaceC1863) {
        float fMo3446 = interfaceC1863 != null ? interfaceC1863.mo3446() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM3777 = c2062.m3777(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < c2062.m3776(iM3777) - fMo3446 || Float.intBitsToFloat(i) > c2062.m3780(iM3777) + fMo3446) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo3446) || Float.intBitsToFloat(i2) > c2062.f6101 + fMo3446) {
            return -1;
        }
        return iM3777;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m1665(HandwritingGesture handwritingGesture, C0877 c0877) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0877.invoke(new C2010(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1666(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m1667(int i) {
        int type;
        return (!m1666(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m1668(C0943 c0943, C7327 c7327, int i) {
        C2033 c2033;
        C0963 c0963M1855 = c0943.m1855();
        C2062 c2062 = (c0963M1855 == null || (c2033 = c0963M1855.f2744) == null) ? null : c2033.f5989;
        InterfaceC1695 interfaceC1695M1856 = c0943.m1856();
        return (c2062 == null || interfaceC1695M1856 == null) ? C2035.f6002 : c2062.m3783(c7327.m12497(interfaceC1695M1856.mo3069(0L)), i, C2043.f6044);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m1669(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract InputMethodManager m1670();
}
