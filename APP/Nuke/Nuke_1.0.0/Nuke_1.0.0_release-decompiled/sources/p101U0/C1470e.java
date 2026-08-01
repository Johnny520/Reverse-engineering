package p101U0;

import com.bumptech.glide.AbstractC1923e;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import me.dartcv.nuke.BuildConfig;
import p058L.C0946r;
import p061L2.AbstractC0972l;
import p096T0.C1402b;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: U0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1470e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5148a = 1;

    /* JADX INFO: renamed from: b */
    public int f5149b;

    /* JADX INFO: renamed from: c */
    public int f5150c;

    /* JADX INFO: renamed from: d */
    public CharSequence f5151d;

    /* JADX INFO: renamed from: e */
    public Object f5152e;

    public /* synthetic */ C1470e() {
    }

    /* JADX INFO: renamed from: a */
    public void m2737a(int i5) {
        int i6 = this.f5149b;
        int i7 = this.f5150c;
        boolean z5 = false;
        if (i5 <= i7 && i6 <= i5) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        AbstractC1732a.m3085a("Invalid offset: " + i5 + ". Valid range is [" + i6 + " , " + i7 + ']');
    }

    /* JADX INFO: renamed from: b */
    public int m2738b() {
        C0946r c0946r = (C0946r) this.f5152e;
        if (c0946r == null) {
            return ((String) this.f5151d).length();
        }
        return (c0946r.f2975b - c0946r.m1951b()) + (((String) this.f5151d).length() - (this.f5150c - this.f5149b));
    }

    /* JADX INFO: renamed from: c */
    public boolean m2739c(int i5) {
        CharSequence charSequence = this.f5151d;
        int i6 = this.f5149b + 1;
        if (i5 > this.f5150c || i6 > i5) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i5)) || Character.isSurrogate(charSequence.charAt(i5 - 1));
    }

    /* JADX INFO: renamed from: d */
    public boolean m2740d(int i5) {
        int i6 = this.f5149b + 1;
        if (i5 > this.f5150c || i6 > i5) {
            return false;
        }
        return AbstractC1923e.m3449H(Character.codePointBefore(this.f5151d, i5));
    }

    /* JADX INFO: renamed from: e */
    public boolean m2741e(int i5) {
        m2737a(i5);
        if (!((BreakIterator) this.f5152e).isBoundary(i5)) {
            return false;
        }
        if (m2743g(i5) && m2743g(i5 - 1) && m2743g(i5 + 1)) {
            return false;
        }
        return i5 <= 0 || i5 >= this.f5151d.length() - 1 || !(m2742f(i5) || m2742f(i5 + 1));
    }

    /* JADX INFO: renamed from: f */
    public boolean m2742f(int i5) {
        CharSequence charSequence = this.f5151d;
        int i6 = i5 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i6));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC1665j.m2981a(unicodeBlockOf, unicodeBlock) && AbstractC1665j.m2981a(Character.UnicodeBlock.of(charSequence.charAt(i5)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC1665j.m2981a(Character.UnicodeBlock.of(charSequence.charAt(i5)), unicodeBlock) && AbstractC1665j.m2981a(Character.UnicodeBlock.of(charSequence.charAt(i6)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: g */
    public boolean m2743g(int i5) {
        CharSequence charSequence = this.f5151d;
        int i6 = this.f5149b;
        if (i5 >= this.f5150c || i6 > i5) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i5)) || Character.isSurrogate(charSequence.charAt(i5));
    }

    /* JADX INFO: renamed from: h */
    public boolean m2744h(int i5) {
        int i6 = this.f5149b;
        if (i5 >= this.f5150c || i6 > i5) {
            return false;
        }
        return AbstractC1923e.m3449H(Character.codePointAt(this.f5151d, i5));
    }

    /* JADX INFO: renamed from: i */
    public int m2745i(int i5) {
        m2737a(i5);
        int iFollowing = ((BreakIterator) this.f5152e).following(i5);
        return (m2743g(iFollowing + (-1)) && m2743g(iFollowing) && !m2742f(iFollowing)) ? m2745i(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: j */
    public int m2746j(int i5) {
        m2737a(i5);
        int iPreceding = ((BreakIterator) this.f5152e).preceding(i5);
        return (m2743g(iPreceding) && m2739c(iPreceding) && !m2742f(iPreceding)) ? m2746j(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: k */
    public void m2747k(int i5, int i6, String str) {
        if (i5 > i6) {
            AbstractC1732a.m3085a("start index must be less than or equal to end index: " + i5 + " > " + i6);
        }
        if (i5 < 0) {
            AbstractC1732a.m3085a("start must be non-negative, but was " + i5);
        }
        C0946r c0946r = (C0946r) this.f5152e;
        if (c0946r == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i5, 64);
            int iMin2 = Math.min(((String) this.f5151d).length() - i6, 64);
            String str2 = (String) this.f5151d;
            int i7 = i5 - iMin;
            AbstractC1665j.m2983c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i7, i5, cArr, 0);
            String str3 = (String) this.f5151d;
            int i8 = iMax - iMin2;
            int i9 = iMin2 + i6;
            AbstractC1665j.m2983c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i6, i9, cArr, i8);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0946r c0946r2 = new C0946r();
            c0946r2.f2975b = iMax;
            c0946r2.f2978e = cArr;
            c0946r2.f2976c = length;
            c0946r2.f2977d = i8;
            this.f5152e = c0946r2;
            this.f5149b = i7;
            this.f5150c = i9;
            return;
        }
        int i10 = this.f5149b;
        int i11 = i5 - i10;
        int i12 = i6 - i10;
        if (i11 < 0 || i12 > c0946r.f2975b - c0946r.m1951b()) {
            this.f5151d = toString();
            this.f5152e = null;
            this.f5149b = -1;
            this.f5150c = -1;
            m2747k(i5, i6, str);
            return;
        }
        int length2 = str.length() - (i12 - i11);
        if (length2 > c0946r.m1951b()) {
            int iM1951b = length2 - c0946r.m1951b();
            int i13 = c0946r.f2975b;
            do {
                i13 *= 2;
            } while (i13 - c0946r.f2975b < iM1951b);
            char[] cArr2 = new char[i13];
            AbstractC0972l.m1990N((char[]) c0946r.f2978e, cArr2, 0, 0, c0946r.f2976c);
            int i14 = c0946r.f2975b;
            int i15 = c0946r.f2977d;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            AbstractC0972l.m1990N((char[]) c0946r.f2978e, cArr2, i17, i15, i16 + i15);
            c0946r.f2978e = cArr2;
            c0946r.f2975b = i13;
            c0946r.f2977d = i17;
        }
        int i18 = c0946r.f2976c;
        if (i11 < i18 && i12 <= i18) {
            int i19 = i18 - i12;
            char[] cArr3 = (char[]) c0946r.f2978e;
            AbstractC0972l.m1990N(cArr3, cArr3, c0946r.f2977d - i19, i12, i18);
            c0946r.f2976c = i11;
            c0946r.f2977d -= i19;
        } else if (i11 >= i18 || i12 < i18) {
            int iM1951b2 = c0946r.m1951b() + i11;
            int iM1951b3 = c0946r.m1951b() + i12;
            int i20 = c0946r.f2977d;
            char[] cArr4 = (char[]) c0946r.f2978e;
            AbstractC0972l.m1990N(cArr4, cArr4, c0946r.f2976c, i20, iM1951b2);
            c0946r.f2976c += iM1951b2 - i20;
            c0946r.f2977d = iM1951b3;
        } else {
            c0946r.f2977d = c0946r.m1951b() + i12;
            c0946r.f2976c = i11;
        }
        str.getChars(0, str.length(), (char[]) c0946r.f2978e, c0946r.f2976c);
        c0946r.f2976c = str.length() + c0946r.f2976c;
    }

    public String toString() {
        switch (this.f5148a) {
            case BuildConfig.VERSION_CODE /* 1 */:
                C0946r c0946r = (C0946r) this.f5152e;
                if (c0946r == null) {
                    return (String) this.f5151d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5151d, 0, this.f5149b);
                sb.append((char[]) c0946r.f2978e, 0, c0946r.f2976c);
                char[] cArr = (char[]) c0946r.f2978e;
                int i5 = c0946r.f2977d;
                sb.append(cArr, i5, c0946r.f2975b - i5);
                String str = (String) this.f5151d;
                sb.append((CharSequence) str, this.f5150c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1470e(CharSequence charSequence, int i5, Locale locale) {
        this.f5151d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC1732a.m3085a("input start index is outside the CharSequence");
        }
        if (i5 < 0 || i5 > charSequence.length()) {
            AbstractC1732a.m3085a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f5152e = wordInstance;
        this.f5149b = Math.max(0, -50);
        this.f5150c = Math.min(charSequence.length(), i5 + 50);
        wordInstance.setText(new C1402b(charSequence, i5));
    }
}
