package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.emoji2.text.C0644c;
import androidx.emoji2.text.C0647f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p031c4.AbstractC1320f;
import p031c4.C1323i;
import p031c4.C1325k;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0645d {

    /* JADX INFO: renamed from: a */
    public final C0644c.j f1890a;

    /* JADX INFO: renamed from: b */
    public final C0647f f1891b;

    /* JADX INFO: renamed from: c */
    public C0644c.e f1892c;

    /* JADX INFO: renamed from: d */
    public final boolean f1893d;

    /* JADX INFO: renamed from: e */
    public final int[] f1894e;

    /* JADX INFO: renamed from: androidx.emoji2.text.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        public C1325k f1895a;

        /* JADX INFO: renamed from: b */
        public final C0644c.j f1896b;

        public a(C1325k c1325k, C0644c.j jVar) {
            this.f1895a = c1325k;
            this.f1896b = jVar;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: a */
        public boolean mo2549a(CharSequence charSequence, int i10, int i11, C1323i c1323i) {
            if (c1323i.m5323k()) {
                return true;
            }
            if (this.f1895a == null) {
                this.f1895a = new C1325k(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f1895a.setSpan(this.f1896b.mo2540a(c1323i), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1325k getResult() {
            return this.f1895a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo2549a(CharSequence charSequence, int i10, int i11, C1323i c1323i);

        Object getResult();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public int f1901a = 1;

        /* JADX INFO: renamed from: b */
        public final C0647f.a f1902b;

        /* JADX INFO: renamed from: c */
        public C0647f.a f1903c;

        /* JADX INFO: renamed from: d */
        public C0647f.a f1904d;

        /* JADX INFO: renamed from: e */
        public int f1905e;

        /* JADX INFO: renamed from: f */
        public int f1906f;

        /* JADX INFO: renamed from: g */
        public final boolean f1907g;

        /* JADX INFO: renamed from: h */
        public final int[] f1908h;

        public e(C0647f.a aVar, boolean z10, int[] iArr) {
            this.f1902b = aVar;
            this.f1903c = aVar;
            this.f1907g = z10;
            this.f1908h = iArr;
        }

        /* JADX INFO: renamed from: d */
        public static boolean m2553d(int i10) {
            return i10 == 65039;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m2554f(int i10) {
            return i10 == 65038;
        }

        /* JADX INFO: renamed from: a */
        public int m2555a(int i10) {
            C0647f.a aVarM2578a = this.f1903c.m2578a(i10);
            int iM2559g = 2;
            if (this.f1901a != 2) {
                if (aVarM2578a == null) {
                    iM2559g = m2559g();
                } else {
                    this.f1901a = 2;
                    this.f1903c = aVarM2578a;
                    this.f1906f = 1;
                }
            } else if (aVarM2578a != null) {
                this.f1903c = aVarM2578a;
                this.f1906f++;
            } else if (m2554f(i10)) {
                iM2559g = m2559g();
            } else if (!m2553d(i10)) {
                if (this.f1903c.m2579b() != null) {
                    iM2559g = 3;
                    if (this.f1906f != 1 || m2560h()) {
                        this.f1904d = this.f1903c;
                        m2559g();
                    } else {
                        iM2559g = m2559g();
                    }
                } else {
                    iM2559g = m2559g();
                }
            }
            this.f1905e = i10;
            return iM2559g;
        }

        /* JADX INFO: renamed from: b */
        public C1323i m2556b() {
            return this.f1903c.m2579b();
        }

        /* JADX INFO: renamed from: c */
        public C1323i m2557c() {
            return this.f1904d.m2579b();
        }

        /* JADX INFO: renamed from: e */
        public boolean m2558e() {
            if (this.f1901a != 2 || this.f1903c.m2579b() == null) {
                return false;
            }
            return this.f1906f > 1 || m2560h();
        }

        /* JADX INFO: renamed from: g */
        public final int m2559g() {
            this.f1901a = 1;
            this.f1903c = this.f1902b;
            this.f1906f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m2560h() {
            if (this.f1903c.m2579b().m5322j() || m2553d(this.f1905e)) {
                return true;
            }
            if (this.f1907g) {
                if (this.f1908h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f1908h, this.f1903c.m2579b().m5314b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0645d(C0647f c0647f, C0644c.j jVar, C0644c.e eVar, boolean z10, int[] iArr, Set set) {
        this.f1890a = jVar;
        this.f1891b = c0647f;
        this.f1892c = eVar;
        this.f1893d = z10;
        this.f1894e = iArr;
        m2546d(set);
    }

    /* JADX INFO: renamed from: a */
    public int m2543a(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            AbstractC1320f[] abstractC1320fArr = (AbstractC1320f[]) spanned.getSpans(i10, i10 + 1, AbstractC1320f.class);
            if (abstractC1320fArr.length > 0) {
                return spanned.getSpanEnd(abstractC1320fArr[0]);
            }
        }
        return ((c) m2548f(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new c(i10))).f1899c;
    }

    /* JADX INFO: renamed from: b */
    public int m2544b(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            AbstractC1320f[] abstractC1320fArr = (AbstractC1320f[]) spanned.getSpans(i10, i10 + 1, AbstractC1320f.class);
            if (abstractC1320fArr.length > 0) {
                return spanned.getSpanStart(abstractC1320fArr[0]);
            }
        }
        return ((c) m2548f(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new c(i10))).f1898b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2545c(CharSequence charSequence, int i10, int i11, C1323i c1323i) {
        if (c1323i.m5316d() == 0) {
            c1323i.m5325m(this.f1892c.mo2513a(charSequence, i10, i11, c1323i.m5320h()));
        }
        return c1323i.m5316d() == 2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2546d(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m2548f(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* JADX INFO: renamed from: e */
    public CharSequence m2547e(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        AbstractC1320f[] abstractC1320fArr;
        int iMin = i10;
        int iMax = i11;
        int length = i12;
        C1325k c1325k = charSequence instanceof Spannable ? new C1325k((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(iMin + (-1), iMax + 1, AbstractC1320f.class) > iMax) ? null : new C1325k(charSequence);
        if (c1325k != null && (abstractC1320fArr = (AbstractC1320f[]) c1325k.getSpans(iMin, iMax, AbstractC1320f.class)) != null && abstractC1320fArr.length > 0) {
            for (AbstractC1320f abstractC1320f : abstractC1320fArr) {
                int spanStart = c1325k.getSpanStart(abstractC1320f);
                int spanEnd = c1325k.getSpanEnd(abstractC1320f);
                if (spanStart != iMax) {
                    c1325k.removeSpan(abstractC1320f);
                }
                iMin = Math.min(spanStart, iMin);
                iMax = Math.max(spanEnd, iMax);
            }
        }
        int i13 = iMax;
        int i14 = iMin;
        if (i14 != i13 && i14 < charSequence.length()) {
            if (length != Integer.MAX_VALUE && c1325k != null) {
                length -= ((AbstractC1320f[]) c1325k.getSpans(0, c1325k.length(), AbstractC1320f.class)).length;
            }
            C1325k c1325k2 = (C1325k) m2548f(charSequence, i14, i13, length, z10, new a(c1325k, this.f1890a));
            if (c1325k2 != null) {
                return c1325k2.m5331b();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2548f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, b bVar) {
        int iCharCount;
        e eVar = new e(this.f1891b.m2575f(), this.f1893d, this.f1894e);
        int i13 = 0;
        boolean zMo2549a = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zMo2549a) {
                int iM2555a = eVar.m2555a(iCodePointAt);
                if (iM2555a == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iM2555a == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iM2555a == 3) {
                    if (z10 || !m2545c(charSequence, iCharCount, i10, eVar.m2557c())) {
                        zMo2549a = bVar.mo2549a(charSequence, iCharCount, i10, eVar.m2557c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.m2558e() && i13 < i12 && zMo2549a && (z10 || !m2545c(charSequence, iCharCount, i10, eVar.m2556b()))) {
            bVar.mo2549a(charSequence, iCharCount, i10, eVar.m2556b());
        }
        return bVar.getResult();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c implements b {

        /* JADX INFO: renamed from: a */
        public final int f1897a;

        /* JADX INFO: renamed from: b */
        public int f1898b = -1;

        /* JADX INFO: renamed from: c */
        public int f1899c = -1;

        public c(int i10) {
            this.f1897a = i10;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: a */
        public boolean mo2549a(CharSequence charSequence, int i10, int i11, C1323i c1323i) {
            int i12 = this.f1897a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f1898b = i10;
            this.f1899c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c getResult() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d implements b {

        /* JADX INFO: renamed from: a */
        public final String f1900a;

        public d(String str) {
            this.f1900a = str;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: a */
        public boolean mo2549a(CharSequence charSequence, int i10, int i11, C1323i c1323i) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f1900a)) {
                return true;
            }
            c1323i.m5324l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C0645d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }
}
