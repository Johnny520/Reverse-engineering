package androidx.compose.ui.text.input;

import android.content.res.TypedArray;
import android.util.SparseArray;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.selection.C0920;
import com.android.dx.io.Opcodes;
import com.google.android.material.textfield.C3195;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6344;
import p167.C7713;
import p195.AbstractC7834;
import p212.C7945;
import p282.C8375;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f5956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f5957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f5959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5960;

    public C2019(CharSequence charSequence, int i, Locale locale) {
        this.f5960 = 4;
        this.f5957 = charSequence;
        if (charSequence.length() < 0) {
            AbstractC7834.m13198("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC7834.m13198("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f5956 = wordInstance;
        this.f5959 = Math.max(0, -50);
        this.f5958 = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C7945(charSequence, i));
    }

    public String toString() {
        switch (this.f5960) {
            case 0:
                C0920 c0920 = (C0920) this.f5956;
                String str = (String) this.f5957;
                if (c0920 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f5959);
                sb.append((char[]) c0920.f2610, 0, c0920.f2612);
                char[] cArr = (char[]) c0920.f2610;
                int i = c0920.f2611;
                sb.append(cArr, i, c0920.f2613 - i);
                String str2 = (String) this.f5957;
                sb.append((CharSequence) str2, this.f5958, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean m3716(int i) {
        CharSequence charSequence = (CharSequence) this.f5957;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC4395.m8907(unicodeBlockOf, unicodeBlock) && AbstractC4395.m8907(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC4395.m8907(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC4395.m8907(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean m3717(int i) {
        m3721(i);
        if (!((BreakIterator) this.f5956).isBoundary(i)) {
            return false;
        }
        if (m3723(i) && m3723(i - 1) && m3723(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f5957).length() - 1 || !(m3716(i) || m3716(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m3718(int i) {
        int i2 = this.f5959 + 1;
        if (i > this.f5958 || i2 > i) {
            return false;
        }
        return AbstractC6344.m11883(Character.codePointBefore((CharSequence) this.f5957, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m3719(int i) {
        CharSequence charSequence = (CharSequence) this.f5957;
        int i2 = this.f5959 + 1;
        if (i > this.f5958 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!C7713.m13009()) {
                    return false;
                }
                C7713 c7713M13010 = C7713.m13010();
                if (c7713M13010.m13013() != 1 || c7713M13010.m13014(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m3720() {
        C0920 c0920 = (C0920) this.f5956;
        String str = (String) this.f5957;
        if (c0920 == null) {
            return str.length();
        }
        return (c0920.f2613 - c0920.m1825()) + (str.length() - (this.f5958 - this.f5959));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3721(int i) {
        int i2 = this.f5959;
        int i3 = this.f5958;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM149 = AbstractC0053.m149(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbM149.append(i3);
        sbM149.append(']');
        AbstractC7834.m13198(sbM149.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean m3722(int i) {
        int i2 = this.f5959;
        if (i >= this.f5958 || i2 > i) {
            return false;
        }
        return AbstractC6344.m11883(Character.codePointAt((CharSequence) this.f5957, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m3723(int i) {
        CharSequence charSequence = (CharSequence) this.f5957;
        int i2 = this.f5959;
        if (i >= this.f5958 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!C7713.m13009()) {
                return false;
            }
            C7713 c7713M13010 = C7713.m13010();
            if (c7713M13010.m13013() != 1 || c7713M13010.m13014(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m3724(int i, int i2, String str) {
        if (i > i2) {
            AbstractC7834.m13198("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC7834.m13198("start must be non-negative, but was " + i);
        }
        C0920 c0920 = (C0920) this.f5956;
        if (c0920 == null) {
            int iMax = Math.max(Opcodes.CONST_METHOD_TYPE, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f5957).length() - i2, 64);
            String str2 = (String) this.f5957;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.f5957;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0920 c09202 = new C0920(1);
            c09202.f2613 = iMax;
            c09202.f2610 = cArr;
            c09202.f2612 = length;
            c09202.f2611 = i4;
            this.f5956 = c09202;
            this.f5959 = i3;
            this.f5958 = i5;
            return;
        }
        int i6 = this.f5959;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c0920.f2613 - c0920.m1825()) {
            this.f5957 = toString();
            this.f5956 = null;
            this.f5959 = -1;
            this.f5958 = -1;
            m3724(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > c0920.m1825()) {
            int iM1825 = length2 - c0920.m1825();
            int i9 = c0920.f2613;
            do {
                i9 *= 2;
            } while (i9 - c0920.f2613 < iM1825);
            char[] cArr2 = new char[i9];
            AbstractC4347.m8843((char[]) c0920.f2610, cArr2, 0, 0, c0920.f2612);
            int i10 = c0920.f2613;
            int i11 = c0920.f2611;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            AbstractC4347.m8843((char[]) c0920.f2610, cArr2, i13, i11, i12 + i11);
            c0920.f2610 = cArr2;
            c0920.f2613 = i9;
            c0920.f2611 = i13;
        }
        int i14 = c0920.f2612;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) c0920.f2610;
            AbstractC4347.m8843(cArr3, cArr3, c0920.f2611 - i15, i8, i14);
            c0920.f2612 = i7;
            c0920.f2611 -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM18252 = c0920.m1825() + i7;
            int iM18253 = c0920.m1825() + i8;
            int i16 = c0920.f2611;
            char[] cArr4 = (char[]) c0920.f2610;
            AbstractC4347.m8843(cArr4, cArr4, c0920.f2612, i16, iM18252);
            c0920.f2612 += iM18252 - i16;
            c0920.f2611 = iM18253;
        } else {
            c0920.f2611 = c0920.m1825() + i8;
            c0920.f2612 = i7;
        }
        str.getChars(0, str.length(), (char[]) c0920.f2610, c0920.f2612);
        c0920.f2612 = str.length() + c0920.f2612;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m3725(int i) {
        m3721(i);
        int iFollowing = ((BreakIterator) this.f5956).following(i);
        return (m3723(iFollowing + (-1)) && m3723(iFollowing) && !m3716(iFollowing)) ? m3725(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m3726(int i) {
        m3721(i);
        int iPreceding = ((BreakIterator) this.f5956).preceding(i);
        return (m3723(iPreceding) && m3719(iPreceding) && !m3716(iPreceding)) ? m3726(iPreceding) : iPreceding;
    }

    public /* synthetic */ C2019(byte b, int i) {
        this.f5960 = i;
    }

    public C2019(int i) {
        this.f5960 = 3;
        this.f5958 = -1;
        this.f5959 = i;
    }

    public C2019(int i, int i2, String str, C8375 c8375) {
        this.f5960 = 5;
        this.f5959 = i;
        this.f5958 = i2;
        this.f5957 = str;
        this.f5956 = c8375;
    }

    public C2019(C3195 c3195, C0108 c0108) {
        this.f5960 = 2;
        this.f5957 = new SparseArray();
        this.f5956 = c3195;
        TypedArray typedArray = (TypedArray) c0108.f320;
        this.f5959 = typedArray.getResourceId(28, 0);
        this.f5958 = typedArray.getResourceId(53, 0);
    }
}
