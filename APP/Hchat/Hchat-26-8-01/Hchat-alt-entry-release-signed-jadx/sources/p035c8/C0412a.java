package p035c8;

import gg.AbstractC1416l;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p100h0.C1548s;
import p133j2.C2053c;
import p162l3.C2455i;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1124a = 3;

    /* JADX INFO: renamed from: b */
    public int f1125b;

    /* JADX INFO: renamed from: c */
    public int f1126c;

    /* JADX INFO: renamed from: d */
    public Object f1127d;

    /* JADX INFO: renamed from: e */
    public Object f1128e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0412a(CharSequence charSequence, int i9, Locale locale) {
        this.f1127d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC3042a.m6486a("input start index is outside the CharSequence");
        }
        if (i9 < 0 || i9 > charSequence.length()) {
            AbstractC3042a.m6486a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1128e = wordInstance;
        this.f1125b = Math.max(0, -50);
        this.f1126c = Math.min(charSequence.length(), i9 + 50);
        wordInstance.setText(new C2053c(charSequence, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m1372a(int i9) {
        int i10 = this.f1125b;
        int i11 = this.f1126c;
        boolean z9 = false;
        if (i9 <= i11 && i10 <= i9) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, i10, "Invalid offset: ", ". Valid range is [", " , ");
        sbM2256s.append(i11);
        sbM2256s.append(']');
        AbstractC3042a.m6486a(sbM2256s.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m1373b() {
        C1548s c1548s = (C1548s) this.f1128e;
        String str = (String) this.f1127d;
        if (c1548s == null) {
            return str.length();
        }
        return (c1548s.f5161b - c1548s.m4047b()) + (str.length() - (this.f1126c - this.f1125b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m1374c(int i9) {
        CharSequence charSequence = (CharSequence) this.f1127d;
        int i10 = this.f1125b + 1;
        if (i9 > this.f1126c || i10 > i9) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i9))) {
            int i11 = i9 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i11))) {
                if (!C2455i.m5847d()) {
                    return false;
                }
                C2455i c2455iM5846a = C2455i.m5846a();
                if (c2455iM5846a.m5849c() != 1 || c2455iM5846a.m5848b(charSequence, i11) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean m1375d(int i9) {
        int i10 = this.f1125b + 1;
        if (i9 > this.f1126c || i10 > i9) {
            return false;
        }
        return AbstractC0000a.m91t0(Character.codePointBefore((CharSequence) this.f1127d, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean m1376e(int i9) {
        m1372a(i9);
        if (!((BreakIterator) this.f1128e).isBoundary(i9)) {
            return false;
        }
        if (m1378g(i9) && m1378g(i9 - 1) && m1378g(i9 + 1)) {
            return false;
        }
        return i9 <= 0 || i9 >= ((CharSequence) this.f1127d).length() - 1 || !(m1377f(i9) || m1377f(i9 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean m1377f(int i9) {
        CharSequence charSequence = (CharSequence) this.f1127d;
        int i10 = i9 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC1416l.m3825a(unicodeBlockOf, unicodeBlock) && AbstractC1416l.m3825a(Character.UnicodeBlock.of(charSequence.charAt(i9)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC1416l.m3825a(Character.UnicodeBlock.of(charSequence.charAt(i9)), unicodeBlock) && AbstractC1416l.m3825a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m1378g(int i9) {
        CharSequence charSequence = (CharSequence) this.f1127d;
        int i10 = this.f1125b;
        if (i9 >= this.f1126c || i10 > i9) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i9)) && !Character.isSurrogate(charSequence.charAt(i9))) {
            if (!C2455i.m5847d()) {
                return false;
            }
            C2455i c2455iM5846a = C2455i.m5846a();
            if (c2455iM5846a.m5849c() != 1 || c2455iM5846a.m5848b(charSequence, i9) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m1379h(int i9) {
        int i10 = this.f1125b;
        if (i9 >= this.f1126c || i10 > i9) {
            return false;
        }
        return AbstractC0000a.m91t0(Character.codePointAt((CharSequence) this.f1127d, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public int m1380i(int i9) {
        m1372a(i9);
        int iFollowing = ((BreakIterator) this.f1128e).following(i9);
        return (m1378g(iFollowing + (-1)) && m1378g(iFollowing) && !m1377f(iFollowing)) ? m1380i(iFollowing) : iFollowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public int m1381j(int i9) {
        m1372a(i9);
        int iPreceding = ((BreakIterator) this.f1128e).preceding(i9);
        return (m1378g(iPreceding) && m1374c(iPreceding) && !m1377f(iPreceding)) ? m1381j(iPreceding) : iPreceding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m1382k(int i9, int i10, String str) {
        if (i9 > i10) {
            AbstractC3042a.m6486a("start index must be less than or equal to end index: " + i9 + " > " + i10);
        }
        if (i9 < 0) {
            AbstractC3042a.m6486a("start must be non-negative, but was " + i9);
        }
        C1548s c1548s = (C1548s) this.f1128e;
        if (c1548s == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i9, 64);
            int iMin2 = Math.min(((String) this.f1127d).length() - i10, 64);
            String str2 = (String) this.f1127d;
            int i11 = i9 - iMin;
            str2.getClass();
            str2.getChars(i11, i9, cArr, 0);
            String str3 = (String) this.f1127d;
            int i12 = iMax - iMin2;
            int i13 = iMin2 + i10;
            str3.getClass();
            str3.getChars(i10, i13, cArr, i12);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C1548s c1548s2 = new C1548s();
            c1548s2.f5161b = iMax;
            c1548s2.f5164e = cArr;
            c1548s2.f5162c = length;
            c1548s2.f5163d = i12;
            this.f1128e = c1548s2;
            this.f1125b = i11;
            this.f1126c = i13;
            return;
        }
        int i14 = this.f1125b;
        int i15 = i9 - i14;
        int i16 = i10 - i14;
        if (i15 < 0 || i16 > c1548s.f5161b - c1548s.m4047b()) {
            this.f1127d = toString();
            this.f1128e = null;
            this.f1125b = -1;
            this.f1126c = -1;
            m1382k(i9, i10, str);
            return;
        }
        int length2 = str.length() - (i16 - i15);
        if (length2 > c1548s.m4047b()) {
            int iM4047b = length2 - c1548s.m4047b();
            int i17 = c1548s.f5161b;
            do {
                i17 *= 2;
            } while (i17 - c1548s.f5161b < iM4047b);
            char[] cArr2 = new char[i17];
            System.arraycopy((char[]) c1548s.f5164e, 0, cArr2, 0, c1548s.f5162c);
            int i18 = c1548s.f5161b;
            int i19 = c1548s.f5163d;
            int i20 = i18 - i19;
            int i21 = i17 - i20;
            System.arraycopy((char[]) c1548s.f5164e, i19, cArr2, i21, (i20 + i19) - i19);
            c1548s.f5164e = cArr2;
            c1548s.f5161b = i17;
            c1548s.f5163d = i21;
        }
        int i22 = c1548s.f5162c;
        if (i15 < i22 && i16 <= i22) {
            int i23 = i22 - i16;
            char[] cArr3 = (char[]) c1548s.f5164e;
            System.arraycopy(cArr3, i16, cArr3, c1548s.f5163d - i23, i23);
            c1548s.f5162c = i15;
            c1548s.f5163d -= i23;
        } else if (i15 >= i22 || i16 < i22) {
            int iM4047b2 = c1548s.m4047b() + i15;
            int iM4047b3 = c1548s.m4047b() + i16;
            int i24 = c1548s.f5163d;
            int i25 = iM4047b2 - i24;
            char[] cArr4 = (char[]) c1548s.f5164e;
            System.arraycopy(cArr4, i24, cArr4, c1548s.f5162c, i25);
            c1548s.f5162c += i25;
            c1548s.f5163d = iM4047b3;
        } else {
            c1548s.f5163d = c1548s.m4047b() + i16;
            c1548s.f5162c = i15;
        }
        str.getChars(0, str.length(), (char[]) c1548s.f5164e, c1548s.f5162c);
        c1548s.f5162c = str.length() + c1548s.f5162c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f1124a) {
            case 3:
                C1548s c1548s = (C1548s) this.f1128e;
                String str = (String) this.f1127d;
                if (c1548s == null) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, this.f1125b);
                sb2.append((char[]) c1548s.f5164e, 0, c1548s.f5162c);
                char[] cArr = (char[]) c1548s.f5164e;
                int i9 = c1548s.f5163d;
                sb2.append(cArr, i9, c1548s.f5161b - i9);
                String str2 = (String) this.f1127d;
                sb2.append((CharSequence) str2, this.f1126c, str2.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0412a() {
    }

    public C0412a(int i9, String str, String str2, int i10) {
        this.f1127d = str;
        this.f1125b = i9;
        this.f1126c = i10;
        this.f1128e = str2;
    }

    public C0412a(C0412a c0412a, char[] cArr, int i9, int i10) {
        this.f1127d = c0412a;
        this.f1128e = cArr;
        this.f1125b = i9;
        this.f1126c = i10;
    }
}
