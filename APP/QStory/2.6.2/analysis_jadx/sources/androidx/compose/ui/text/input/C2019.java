package androidx.compose.ui.text.input;

import android.content.res.TypedArray;
import android.util.SparseArray;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.selection.C0920;
import com.android.dx.io.Opcodes;
import com.google.android.material.textfield.C3194;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p167.C7712;
import p195.AbstractC7833;
import p212.C7944;
import p282.C8374;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f5955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f5956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f5958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5959;

    public C2019(CharSequence charSequence, int i, Locale locale) {
        this.f5959 = 4;
        this.f5956 = charSequence;
        if (charSequence.length() < 0) {
            AbstractC7833.m13170("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC7833.m13170("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f5955 = wordInstance;
        this.f5958 = Math.max(0, -50);
        this.f5957 = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C7944(charSequence, i));
    }

    public String toString() {
        switch (this.f5959) {
            case 0:
                C0920 c0920 = (C0920) this.f5955;
                String str = (String) this.f5956;
                if (c0920 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f5958);
                sb.append((char[]) c0920.f2609, 0, c0920.f2611);
                char[] cArr = (char[]) c0920.f2609;
                int i = c0920.f2610;
                sb.append(cArr, i, c0920.f2612 - i);
                String str2 = (String) this.f5956;
                sb.append((CharSequence) str2, this.f5957, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean m3706(int i) {
        CharSequence charSequence = (CharSequence) this.f5956;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC4394.m8917(unicodeBlockOf, unicodeBlock) && AbstractC4394.m8917(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC4394.m8917(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC4394.m8917(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean m3707(int i) {
        m3711(i);
        if (!((BreakIterator) this.f5955).isBoundary(i)) {
            return false;
        }
        if (m3713(i) && m3713(i - 1) && m3713(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f5956).length() - 1 || !(m3706(i) || m3706(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m3708(int i) {
        int i2 = this.f5958 + 1;
        if (i > this.f5957 || i2 > i) {
            return false;
        }
        return AbstractC5061.m10026(Character.codePointBefore((CharSequence) this.f5956, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m3709(int i) {
        CharSequence charSequence = (CharSequence) this.f5956;
        int i2 = this.f5958 + 1;
        if (i > this.f5957 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!C7712.m12979()) {
                    return false;
                }
                C7712 c7712M12980 = C7712.m12980();
                if (c7712M12980.m12983() != 1 || c7712M12980.m12984(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m3710() {
        C0920 c0920 = (C0920) this.f5955;
        String str = (String) this.f5956;
        if (c0920 == null) {
            return str.length();
        }
        return (c0920.f2612 - c0920.m1815()) + (str.length() - (this.f5957 - this.f5958));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3711(int i) {
        int i2 = this.f5958;
        int i3 = this.f5957;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM151 = AbstractC0053.m151(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbM151.append(i3);
        sbM151.append(']');
        AbstractC7833.m13170(sbM151.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean m3712(int i) {
        int i2 = this.f5958;
        if (i >= this.f5957 || i2 > i) {
            return false;
        }
        return AbstractC5061.m10026(Character.codePointAt((CharSequence) this.f5956, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m3713(int i) {
        CharSequence charSequence = (CharSequence) this.f5956;
        int i2 = this.f5958;
        if (i >= this.f5957 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!C7712.m12979()) {
                return false;
            }
            C7712 c7712M12980 = C7712.m12980();
            if (c7712M12980.m12983() != 1 || c7712M12980.m12984(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m3714(int i, int i2, String str) {
        if (i > i2) {
            AbstractC7833.m13170("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC7833.m13170("start must be non-negative, but was " + i);
        }
        C0920 c0920 = (C0920) this.f5955;
        if (c0920 == null) {
            int iMax = Math.max(Opcodes.CONST_METHOD_TYPE, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f5956).length() - i2, 64);
            String str2 = (String) this.f5956;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.f5956;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0920 c09202 = new C0920(1);
            c09202.f2612 = iMax;
            c09202.f2609 = cArr;
            c09202.f2611 = length;
            c09202.f2610 = i4;
            this.f5955 = c09202;
            this.f5958 = i3;
            this.f5957 = i5;
            return;
        }
        int i6 = this.f5958;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c0920.f2612 - c0920.m1815()) {
            this.f5956 = toString();
            this.f5955 = null;
            this.f5958 = -1;
            this.f5957 = -1;
            m3714(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > c0920.m1815()) {
            int iM1815 = length2 - c0920.m1815();
            int i9 = c0920.f2612;
            do {
                i9 *= 2;
            } while (i9 - c0920.f2612 < iM1815);
            char[] cArr2 = new char[i9];
            AbstractC4346.m8836((char[]) c0920.f2609, cArr2, 0, 0, c0920.f2611);
            int i10 = c0920.f2612;
            int i11 = c0920.f2610;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            AbstractC4346.m8836((char[]) c0920.f2609, cArr2, i13, i11, i12 + i11);
            c0920.f2609 = cArr2;
            c0920.f2612 = i9;
            c0920.f2610 = i13;
        }
        int i14 = c0920.f2611;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) c0920.f2609;
            AbstractC4346.m8836(cArr3, cArr3, c0920.f2610 - i15, i8, i14);
            c0920.f2611 = i7;
            c0920.f2610 -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM18152 = c0920.m1815() + i7;
            int iM18153 = c0920.m1815() + i8;
            int i16 = c0920.f2610;
            char[] cArr4 = (char[]) c0920.f2609;
            AbstractC4346.m8836(cArr4, cArr4, c0920.f2611, i16, iM18152);
            c0920.f2611 += iM18152 - i16;
            c0920.f2610 = iM18153;
        } else {
            c0920.f2610 = c0920.m1815() + i8;
            c0920.f2611 = i7;
        }
        str.getChars(0, str.length(), (char[]) c0920.f2609, c0920.f2611);
        c0920.f2611 = str.length() + c0920.f2611;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m3715(int i) {
        m3711(i);
        int iFollowing = ((BreakIterator) this.f5955).following(i);
        return (m3713(iFollowing + (-1)) && m3713(iFollowing) && !m3706(iFollowing)) ? m3715(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m3716(int i) {
        m3711(i);
        int iPreceding = ((BreakIterator) this.f5955).preceding(i);
        return (m3713(iPreceding) && m3709(iPreceding) && !m3706(iPreceding)) ? m3716(iPreceding) : iPreceding;
    }

    public /* synthetic */ C2019(byte b, int i) {
        this.f5959 = i;
    }

    public C2019(int i) {
        this.f5959 = 3;
        this.f5957 = -1;
        this.f5958 = i;
    }

    public C2019(int i, int i2, String str, C8374 c8374) {
        this.f5959 = 5;
        this.f5958 = i;
        this.f5957 = i2;
        this.f5956 = str;
        this.f5955 = c8374;
    }

    public C2019(C3194 c3194, C0108 c0108) {
        this.f5959 = 2;
        this.f5956 = new SparseArray();
        this.f5955 = c3194;
        TypedArray typedArray = (TypedArray) c0108.f320;
        this.f5958 = typedArray.getResourceId(28, 0);
        this.f5957 = typedArray.getResourceId(53, 0);
    }
}
