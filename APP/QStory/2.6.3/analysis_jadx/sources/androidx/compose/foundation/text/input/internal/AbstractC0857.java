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
import kotlin.text.AbstractC5144;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857 implements InterfaceC0875 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m1667(C7328 c7328, float f, float f2) {
        float f3 = c7328.f19540;
        if (f > c7328.f19538 || f3 > f) {
            return false;
        }
        return f2 <= c7328.f19537 && c7328.f19539 <= f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m1668(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ExtractedText m1669(C2013 c2013) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2013.f5947.f6129;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2013.f5946;
        extractedText.selectionStart = C2035.m3757(j);
        extractedText.selectionEnd = C2035.m3750(j);
        extractedText.flags = !AbstractC5144.m10163(c2013.f5947.f6129, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m1670(C2033 c2033, int i) {
        int iM3788 = c2033.f5990.m3788(i);
        return i == c2033.m3747(iM3788) || i == c2033.f5990.m3789(iM3788, false) ? c2033.m3746(i) != c2033.m3745(i) : c2033.m3745(i) != c2033.m3745(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m1671(C0943 c0943, C7328 c7328, C7328 c73282, int i) {
        long jM1678 = m1678(c0943, c7328, i);
        if (C2035.m3752(jM1678)) {
            return C2035.f6003;
        }
        long jM16782 = m1678(c0943, c73282, i);
        if (C2035.m3752(jM16782)) {
            return C2035.f6003;
        }
        int i2 = (int) (jM1678 >> 32);
        int i3 = (int) (jM16782 & 4294967295L);
        return AbstractC2048.m3770(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m1672(long j, C2068 c2068, boolean z, C0877 c0877) {
        if (z) {
            int i = C2035.f6002;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c2068, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c2068.f6129.length() ? Character.codePointAt(c2068, iCharCount2) : 10;
            if (m1677(iCodePointBefore) && (m1676(iCodePointAt) || m1679(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c2068, iCharCount);
                    }
                } while (m1677(iCodePointBefore));
                j = AbstractC2048.m3770(iCharCount, iCharCount2);
            } else if (m1677(iCodePointAt) && (m1676(iCodePointBefore) || m1679(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c2068.f6129.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c2068, iCharCount2);
                    }
                } while (m1677(iCodePointAt));
                j = AbstractC2048.m3770(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        c0877.invoke(new C0864(new InterfaceC2005[]{new C2016(i2, i2), new C2007(C2035.m3751(j), 0)}));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1673(InterfaceC2129 interfaceC2129, C0860 c0860, C0943 c0943, C0882 c0882) {
        return interfaceC2129.mo3866(new C0868(c0860, c0943, c0882));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m1674(C2062 c2062, long j, InterfaceC1863 interfaceC1863) {
        float fMo3456 = interfaceC1863 != null ? interfaceC1863.mo3456() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM3787 = c2062.m3787(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < c2062.m3786(iM3787) - fMo3456 || Float.intBitsToFloat(i) > c2062.m3790(iM3787) + fMo3456) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo3456) || Float.intBitsToFloat(i2) > c2062.f6102 + fMo3456) {
            return -1;
        }
        return iM3787;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m1675(HandwritingGesture handwritingGesture, C0877 c0877) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0877.invoke(new C2010(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m1676(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m1677(int i) {
        int type;
        return (!m1676(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m1678(C0943 c0943, C7328 c7328, int i) {
        C2033 c2033;
        C0963 c0963M1865 = c0943.m1865();
        C2062 c2062 = (c0963M1865 == null || (c2033 = c0963M1865.f2745) == null) ? null : c2033.f5990;
        InterfaceC1695 interfaceC1695M1866 = c0943.m1866();
        return (c2062 == null || interfaceC1695M1866 == null) ? C2035.f6003 : c2062.m3793(c7328.m12524(interfaceC1695M1866.mo3079(0L)), i, C2043.f6045);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m1679(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract InputMethodManager m1680();
}
