package p000;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10408a = 0;

    /* JADX INFO: renamed from: b */
    public int f10409b;

    /* JADX INFO: renamed from: c */
    public int f10410c;

    /* JADX INFO: renamed from: d */
    public CharSequence f10411d;

    /* JADX INFO: renamed from: e */
    public Object f10412e;

    public sx1(CharSequence charSequence, int i, Locale locale) {
        this.f10411d = charSequence;
        if (charSequence.length() < 0) {
            lz0.m2988a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            lz0.m2988a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f10412e = wordInstance;
        this.f10409b = Math.max(0, -50);
        this.f10410c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C0782uq(charSequence, i));
    }

    /* JADX INFO: renamed from: a */
    public void m5008a(int i) {
        int i2 = this.f10409b;
        int i3 = this.f10410c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM2212k = hk1.m2212k("Invalid offset: ", i, i2, ". Valid range is [", " , ");
        sbM2212k.append(i3);
        sbM2212k.append(']');
        lz0.m2988a(sbM2212k.toString());
    }

    /* JADX INFO: renamed from: b */
    public int m5009b() {
        bo0 bo0Var = (bo0) this.f10412e;
        String str = (String) this.f10411d;
        if (bo0Var == null) {
            return str.length();
        }
        return (bo0Var.f957b - bo0Var.m577b()) + (str.length() - (this.f10410c - this.f10409b));
    }

    /* JADX INFO: renamed from: c */
    public boolean m5010c(int i) {
        CharSequence charSequence = this.f10411d;
        int i2 = this.f10409b + 1;
        if (i > this.f10410c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i - 1));
    }

    /* JADX INFO: renamed from: d */
    public boolean m5011d(int i) {
        int i2 = this.f10409b + 1;
        if (i > this.f10410c || i2 > i) {
            return false;
        }
        return yf3.m6266a(Character.codePointBefore(this.f10411d, i));
    }

    /* JADX INFO: renamed from: e */
    public boolean m5012e(int i) {
        m5008a(i);
        if (!((BreakIterator) this.f10412e).isBoundary(i)) {
            return false;
        }
        if (m5014g(i) && m5014g(i - 1) && m5014g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.f10411d.length() - 1 || !(m5013f(i) || m5013f(i + 1));
    }

    /* JADX INFO: renamed from: f */
    public boolean m5013f(int i) {
        CharSequence charSequence = this.f10411d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (t11.m5086l(unicodeBlockOf, unicodeBlock) && t11.m5086l(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return t11.m5086l(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && t11.m5086l(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: g */
    public boolean m5014g(int i) {
        CharSequence charSequence = this.f10411d;
        int i2 = this.f10409b;
        if (i >= this.f10410c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: h */
    public boolean m5015h(int i) {
        int i2 = this.f10409b;
        if (i >= this.f10410c || i2 > i) {
            return false;
        }
        return yf3.m6266a(Character.codePointAt(this.f10411d, i));
    }

    /* JADX INFO: renamed from: i */
    public int m5016i(int i) {
        m5008a(i);
        int iFollowing = ((BreakIterator) this.f10412e).following(i);
        return (m5014g(iFollowing + (-1)) && m5014g(iFollowing) && !m5013f(iFollowing)) ? m5016i(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: j */
    public int m5017j(int i) {
        m5008a(i);
        int iPreceding = ((BreakIterator) this.f10412e).preceding(i);
        return (m5014g(iPreceding) && m5010c(iPreceding) && !m5013f(iPreceding)) ? m5017j(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: k */
    public void m5018k(String str, int i, int i2) {
        if (i > i2) {
            lz0.m2988a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            lz0.m2988a("start must be non-negative, but was " + i);
        }
        bo0 bo0Var = (bo0) this.f10412e;
        if (bo0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f10411d).length() - i2, 64);
            String str2 = (String) this.f10411d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.f10411d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            bo0 bo0Var2 = new bo0();
            bo0Var2.f957b = iMax;
            bo0Var2.f960e = cArr;
            bo0Var2.f958c = length;
            bo0Var2.f959d = i4;
            this.f10412e = bo0Var2;
            this.f10409b = i3;
            this.f10410c = i5;
            return;
        }
        int i6 = this.f10409b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > bo0Var.f957b - bo0Var.m577b()) {
            this.f10411d = toString();
            this.f10412e = null;
            this.f10409b = -1;
            this.f10410c = -1;
            m5018k(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > bo0Var.m577b()) {
            int iM577b = length2 - bo0Var.m577b();
            int i9 = bo0Var.f957b;
            do {
                i9 *= 2;
            } while (i9 - bo0Var.f957b < iM577b);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) bo0Var.f960e, 0, cArr2, 0, bo0Var.f958c);
            int i10 = bo0Var.f957b;
            int i11 = bo0Var.f959d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) bo0Var.f960e, i11, cArr2, i13, (i12 + i11) - i11);
            bo0Var.f960e = cArr2;
            bo0Var.f957b = i9;
            bo0Var.f959d = i13;
        }
        int i14 = bo0Var.f958c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) bo0Var.f960e;
            System.arraycopy(cArr3, i8, cArr3, bo0Var.f959d - i15, i15);
            bo0Var.f958c = i7;
            bo0Var.f959d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM577b2 = bo0Var.m577b() + i7;
            int iM577b3 = bo0Var.m577b() + i8;
            int i16 = bo0Var.f959d;
            int i17 = iM577b2 - i16;
            char[] cArr4 = (char[]) bo0Var.f960e;
            System.arraycopy(cArr4, i16, cArr4, bo0Var.f958c, i17);
            bo0Var.f958c += i17;
            bo0Var.f959d = iM577b3;
        } else {
            bo0Var.f959d = bo0Var.m577b() + i8;
            bo0Var.f958c = i7;
        }
        str.getChars(0, str.length(), (char[]) bo0Var.f960e, bo0Var.f958c);
        bo0Var.f958c = str.length() + bo0Var.f958c;
    }

    public String toString() {
        switch (this.f10408a) {
            case 0:
                bo0 bo0Var = (bo0) this.f10412e;
                String str = (String) this.f10411d;
                if (bo0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f10409b);
                sb.append((char[]) bo0Var.f960e, 0, bo0Var.f958c);
                char[] cArr = (char[]) bo0Var.f960e;
                int i = bo0Var.f959d;
                sb.append(cArr, i, bo0Var.f957b - i);
                String str2 = (String) this.f10411d;
                sb.append((CharSequence) str2, this.f10410c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sx1() {
    }
}
