package androidx.compose.p001ui.text.input;

import android.content.res.TypedArray;
import android.util.SparseArray;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.text.selection.C1758;
import com.android.p002dx.p005io.Opcodes;
import com.google.android.material.textfield.C4027;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7173;
import p183.C8542;
import p211.AbstractC8663;
import p228.C8774;
import p298.C9204;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2853 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f6301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f6302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6305;

    public C2853(CharSequence charSequence, int i, Locale locale) {
        this.f6305 = 4;
        this.f6302 = charSequence;
        if (charSequence.length() < 0) {
            AbstractC8663.m13757("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC8663.m13757("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f6301 = wordInstance;
        this.f6304 = Math.max(0, -50);
        this.f6303 = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C8774(charSequence, i));
    }

    public String toString() {
        switch (this.f6305) {
            case 0:
                C1758 c1758 = (C1758) this.f6301;
                String str = (String) this.f6302;
                if (c1758 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f6304);
                sb.append((char[]) c1758.f2955, 0, c1758.f2957);
                char[] cArr = (char[]) c1758.f2955;
                int i = c1758.f2956;
                sb.append(cArr, i, c1758.f2958 - i);
                String str2 = (String) this.f6302;
                sb.append((CharSequence) str2, this.f6303, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean m4276(int i) {
        CharSequence charSequence = (CharSequence) this.f6302;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC5227.m9466(unicodeBlockOf, unicodeBlock) && AbstractC5227.m9466(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC5227.m9466(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC5227.m9466(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean m4277(int i) {
        m4281(i);
        if (!((BreakIterator) this.f6301).isBoundary(i)) {
            return false;
        }
        if (m4283(i) && m4283(i - 1) && m4283(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f6302).length() - 1 || !(m4276(i) || m4276(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m4278(int i) {
        int i2 = this.f6304 + 1;
        if (i > this.f6303 || i2 > i) {
            return false;
        }
        return AbstractC7173.m12442(Character.codePointBefore((CharSequence) this.f6302, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m4279(int i) {
        CharSequence charSequence = (CharSequence) this.f6302;
        int i2 = this.f6304 + 1;
        if (i > this.f6303 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!C8542.m13568()) {
                    return false;
                }
                C8542 c8542M13569 = C8542.m13569();
                if (c8542M13569.m13572() != 1 || c8542M13569.m13573(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4280() {
        C1758 c1758 = (C1758) this.f6301;
        String str = (String) this.f6302;
        if (c1758 == null) {
            return str.length();
        }
        return (c1758.f2958 - c1758.m2385()) + (str.length() - (this.f6303 - this.f6304));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4281(int i) {
        int i2 = this.f6304;
        int i3 = this.f6303;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM709 = AbstractC0900.m709(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbM709.append(i3);
        sbM709.append(']');
        AbstractC8663.m13757(sbM709.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean m4282(int i) {
        int i2 = this.f6304;
        if (i >= this.f6303 || i2 > i) {
            return false;
        }
        return AbstractC7173.m12442(Character.codePointAt((CharSequence) this.f6302, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m4283(int i) {
        CharSequence charSequence = (CharSequence) this.f6302;
        int i2 = this.f6304;
        if (i >= this.f6303 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!C8542.m13568()) {
                return false;
            }
            C8542 c8542M13569 = C8542.m13569();
            if (c8542M13569.m13572() != 1 || c8542M13569.m13573(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m4284(int i, int i2, String str) {
        if (i > i2) {
            AbstractC8663.m13757("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC8663.m13757("start must be non-negative, but was " + i);
        }
        C1758 c1758 = (C1758) this.f6301;
        if (c1758 == null) {
            int iMax = Math.max(Opcodes.CONST_METHOD_TYPE, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f6302).length() - i2, 64);
            String str2 = (String) this.f6302;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.f6302;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C1758 c17582 = new C1758(1);
            c17582.f2958 = iMax;
            c17582.f2955 = cArr;
            c17582.f2957 = length;
            c17582.f2956 = i4;
            this.f6301 = c17582;
            this.f6304 = i3;
            this.f6303 = i5;
            return;
        }
        int i6 = this.f6304;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c1758.f2958 - c1758.m2385()) {
            this.f6302 = toString();
            this.f6301 = null;
            this.f6304 = -1;
            this.f6303 = -1;
            m4284(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > c1758.m2385()) {
            int iM2385 = length2 - c1758.m2385();
            int i9 = c1758.f2958;
            do {
                i9 *= 2;
            } while (i9 - c1758.f2958 < iM2385);
            char[] cArr2 = new char[i9];
            AbstractC5179.m9402((char[]) c1758.f2955, cArr2, 0, 0, c1758.f2957);
            int i10 = c1758.f2958;
            int i11 = c1758.f2956;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            AbstractC5179.m9402((char[]) c1758.f2955, cArr2, i13, i11, i12 + i11);
            c1758.f2955 = cArr2;
            c1758.f2958 = i9;
            c1758.f2956 = i13;
        }
        int i14 = c1758.f2957;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) c1758.f2955;
            AbstractC5179.m9402(cArr3, cArr3, c1758.f2956 - i15, i8, i14);
            c1758.f2957 = i7;
            c1758.f2956 -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM23852 = c1758.m2385() + i7;
            int iM23853 = c1758.m2385() + i8;
            int i16 = c1758.f2956;
            char[] cArr4 = (char[]) c1758.f2955;
            AbstractC5179.m9402(cArr4, cArr4, c1758.f2957, i16, iM23852);
            c1758.f2957 += iM23852 - i16;
            c1758.f2956 = iM23853;
        } else {
            c1758.f2956 = c1758.m2385() + i8;
            c1758.f2957 = i7;
        }
        str.getChars(0, str.length(), (char[]) c1758.f2955, c1758.f2957);
        c1758.f2957 = str.length() + c1758.f2957;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m4285(int i) {
        m4281(i);
        int iFollowing = ((BreakIterator) this.f6301).following(i);
        return (m4283(iFollowing + (-1)) && m4283(iFollowing) && !m4276(iFollowing)) ? m4285(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m4286(int i) {
        m4281(i);
        int iPreceding = ((BreakIterator) this.f6301).preceding(i);
        return (m4283(iPreceding) && m4279(iPreceding) && !m4276(iPreceding)) ? m4286(iPreceding) : iPreceding;
    }

    public /* synthetic */ C2853(byte b, int i) {
        this.f6305 = i;
    }

    public C2853(int i) {
        this.f6305 = 3;
        this.f6303 = -1;
        this.f6304 = i;
    }

    public C2853(int i, int i2, String str, C9204 c9204) {
        this.f6305 = 5;
        this.f6304 = i;
        this.f6303 = i2;
        this.f6302 = str;
        this.f6301 = c9204;
    }

    public C2853(C4027 c4027, C0955 c0955) {
        this.f6305 = 2;
        this.f6302 = new SparseArray();
        this.f6301 = c4027;
        TypedArray typedArray = (TypedArray) c0955.f665;
        this.f6304 = typedArray.getResourceId(28, 0);
        this.f6303 = typedArray.getResourceId(53, 0);
    }
}
