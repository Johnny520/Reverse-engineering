package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2877;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2841;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2850;
import androidx.compose.p001ui.text.input.InterfaceC2839;
import kotlin.text.AbstractC5976;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1695 implements InterfaceC1713 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m2227(C8157 c8157, float f, float f2) {
        float f3 = c8157.f19885;
        if (f > c8157.f19883 || f3 > f) {
            return false;
        }
        return f2 <= c8157.f19882 && c8157.f19884 <= f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m2228(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ExtractedText m2229(C2847 c2847) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2847.f6292.f6474;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2847.f6291;
        extractedText.selectionStart = C2869.m4317(j);
        extractedText.selectionEnd = C2869.m4310(j);
        extractedText.flags = !AbstractC5976.m10722(c2847.f6292.f6474, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2230(C2867 c2867, int i) {
        int iM4348 = c2867.f6335.m4348(i);
        return i == c2867.m4307(iM4348) || i == c2867.f6335.m4349(iM4348, false) ? c2867.m4306(i) != c2867.m4305(i) : c2867.m4305(i) != c2867.m4305(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m2231(C1781 c1781, C8157 c8157, C8157 c81572, int i) {
        long jM2238 = m2238(c1781, c8157, i);
        if (C2869.m4312(jM2238)) {
            return C2869.f6348;
        }
        long jM22382 = m2238(c1781, c81572, i);
        if (C2869.m4312(jM22382)) {
            return C2869.f6348;
        }
        int i2 = (int) (jM2238 >> 32);
        int i3 = (int) (jM22382 & 4294967295L);
        return AbstractC2882.m4330(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m2232(long j, C2902 c2902, boolean z, C1715 c1715) {
        if (z) {
            int i = C2869.f6347;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c2902, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c2902.f6474.length() ? Character.codePointAt(c2902, iCharCount2) : 10;
            if (m2237(iCodePointBefore) && (m2236(iCodePointAt) || m2239(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c2902, iCharCount);
                    }
                } while (m2237(iCodePointBefore));
                j = AbstractC2882.m4330(iCharCount, iCharCount2);
            } else if (m2237(iCodePointAt) && (m2236(iCodePointBefore) || m2239(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c2902.f6474.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c2902, iCharCount2);
                    }
                } while (m2237(iCodePointAt));
                j = AbstractC2882.m4330(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        c1715.invoke(new C1702(new InterfaceC2839[]{new C2850(i2, i2), new C2841(C2869.m4311(j), 0)}));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2233(InterfaceC2962 interfaceC2962, C1698 c1698, C1781 c1781, C1720 c1720) {
        return interfaceC2962.mo4426(new C1706(c1698, c1781, c1720));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m2234(C2896 c2896, long j, InterfaceC2698 interfaceC2698) {
        float fMo4016 = interfaceC2698 != null ? interfaceC2698.mo4016() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM4347 = c2896.m4347(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < c2896.m4346(iM4347) - fMo4016 || Float.intBitsToFloat(i) > c2896.m4350(iM4347) + fMo4016) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo4016) || Float.intBitsToFloat(i2) > c2896.f6447 + fMo4016) {
            return -1;
        }
        return iM4347;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m2235(HandwritingGesture handwritingGesture, C1715 c1715) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c1715.invoke(new C2844(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2236(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m2237(int i) {
        int type;
        return (!m2236(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m2238(C1781 c1781, C8157 c8157, int i) {
        C2867 c2867;
        C1801 c1801M2425 = c1781.m2425();
        C2896 c2896 = (c1801M2425 == null || (c2867 = c1801M2425.f3090) == null) ? null : c2867.f6335;
        InterfaceC2530 interfaceC2530M2426 = c1781.m2426();
        return (c2896 == null || interfaceC2530M2426 == null) ? C2869.f6348 : c2896.m4353(c8157.m13083(interfaceC2530M2426.mo3639(0L)), i, C2877.f6390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m2239(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract InputMethodManager m2240();
}
