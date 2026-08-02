package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public CharSequence d;
    public Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sx1(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            lz0.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            lz0.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new uq(charSequence, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = hk1.k("Invalid offset: ", i, i2, ". Valid range is [", " , ");
        sbK.append(i3);
        sbK.append(']');
        lz0.a(sbK.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b() {
        bo0 bo0Var = (bo0) this.e;
        String str = (String) this.d;
        if (bo0Var == null) {
            return str.length();
        }
        return (bo0Var.b - bo0Var.b()) + (str.length() - (this.c - this.b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return yf3.a(Character.codePointBefore(this.d, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e(int i) {
        a(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.d.length() - 1 || !(f(i) || f(i + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f(int i) {
        CharSequence charSequence = this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (t11.l(unicodeBlockOf, unicodeBlock) && t11.l(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return t11.l(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && t11.l(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean g(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean h(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return yf3.a(Character.codePointAt(this.d, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int i(int i) {
        a(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (g(iFollowing + (-1)) && g(iFollowing) && !f(iFollowing)) ? i(iFollowing) : iFollowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int j(int i) {
        a(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (g(iPreceding) && c(iPreceding) && !f(iPreceding)) ? j(iPreceding) : iPreceding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(String str, int i, int i2) {
        if (i > i2) {
            lz0.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            lz0.a("start must be non-negative, but was " + i);
        }
        bo0 bo0Var = (bo0) this.e;
        if (bo0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            bo0 bo0Var2 = new bo0();
            bo0Var2.b = iMax;
            bo0Var2.e = cArr;
            bo0Var2.c = length;
            bo0Var2.d = i4;
            this.e = bo0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > bo0Var.b - bo0Var.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            k(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > bo0Var.b()) {
            int iB = length2 - bo0Var.b();
            int i9 = bo0Var.b;
            do {
                i9 *= 2;
            } while (i9 - bo0Var.b < iB);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) bo0Var.e, 0, cArr2, 0, bo0Var.c);
            int i10 = bo0Var.b;
            int i11 = bo0Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) bo0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            bo0Var.e = cArr2;
            bo0Var.b = i9;
            bo0Var.d = i13;
        }
        int i14 = bo0Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) bo0Var.e;
            System.arraycopy(cArr3, i8, cArr3, bo0Var.d - i15, i15);
            bo0Var.c = i7;
            bo0Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iB2 = bo0Var.b() + i7;
            int iB3 = bo0Var.b() + i8;
            int i16 = bo0Var.d;
            int i17 = iB2 - i16;
            char[] cArr4 = (char[]) bo0Var.e;
            System.arraycopy(cArr4, i16, cArr4, bo0Var.c, i17);
            bo0Var.c += i17;
            bo0Var.d = iB3;
        } else {
            bo0Var.d = bo0Var.b() + i8;
            bo0Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) bo0Var.e, bo0Var.c);
        bo0Var.c = str.length() + bo0Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 0:
                bo0 bo0Var = (bo0) this.e;
                String str = (String) this.d;
                if (bo0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) bo0Var.e, 0, bo0Var.c);
                char[] cArr = (char[]) bo0Var.e;
                int i = bo0Var.d;
                sb.append(cArr, i, bo0Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sx1() {
    }
}
