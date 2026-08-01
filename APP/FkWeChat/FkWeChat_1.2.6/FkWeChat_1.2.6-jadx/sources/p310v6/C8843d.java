package p310v6;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p097g8.InterfaceC2546e;
import p215oc.C5706c;
import p376zd.C10001l;
import p376zd.C10016s0;
import p376zd.C10030z0;

/* JADX INFO: renamed from: v6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8843d implements CharSequence, Appendable {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2546e f29382q;

    /* JADX INFO: renamed from: r */
    public List f29383r;

    /* JADX INFO: renamed from: s */
    public char[] f29384s;

    /* JADX INFO: renamed from: t */
    public String f29385t;

    /* JADX INFO: renamed from: u */
    public boolean f29386u;

    /* JADX INFO: renamed from: v */
    public int f29387v;

    /* JADX INFO: renamed from: w */
    public int f29388w;

    /* JADX INFO: renamed from: v6.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements CharSequence {

        /* JADX INFO: renamed from: q */
        public final int f29389q;

        /* JADX INFO: renamed from: r */
        public final int f29390r;

        /* JADX INFO: renamed from: s */
        public String f29391s;

        public a(int i10, int i11) {
            this.f29389q = i10;
            this.f29390r = i11;
        }

        /* JADX INFO: renamed from: a */
        public char m33965a(int i10) {
            int i11 = this.f29389q + i10;
            if (i10 < 0) {
                C10030z0.m38853a("index is negative: ", i10);
                return (char) 0;
            }
            if (i11 < this.f29390r) {
                return C8843d.this.m33958j(i11);
            }
            C10016s0.m38832a("index (", i10, ") should be less than length (", length());
            return (char) 0;
        }

        /* JADX INFO: renamed from: b */
        public int m33966b() {
            return this.f29390r - this.f29389q;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            return m33965a(i10);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return C8843d.this.m33962n(this.f29389q, charSequence, 0, length());
        }

        public int hashCode() {
            String str = this.f29391s;
            return str != null ? str.hashCode() : C8843d.this.m33960l(this.f29389q, this.f29390r);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return m33966b();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            if (i10 < 0) {
                C10030z0.m38853a("start is negative: ", i10);
                return null;
            }
            if (i10 > i11) {
                C10016s0.m38832a("start (", i10, ") should be less or equal to end (", i11);
                return null;
            }
            int i12 = this.f29390r;
            int i13 = this.f29389q;
            if (i11 <= i12 - i13) {
                return i10 == i11 ? _UrlKt.FRAGMENT_ENCODE_SET : C8843d.this.new a(i10 + i13, i13 + i11);
            }
            C10001l.m38755a("end should be less than length (", length(), 41);
            return null;
        }

        @Override // java.lang.CharSequence
        public String toString() {
            String str = this.f29391s;
            if (str != null) {
                return str;
            }
            String string = C8843d.this.m33955g(this.f29389q, this.f29390r).toString();
            this.f29391s = string;
            return string;
        }
    }

    public /* synthetic */ C8843d(InterfaceC2546e interfaceC2546e, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC8845f.m33968a() : interfaceC2546e);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return this;
        }
        int i12 = i10;
        while (i12 < i11) {
            char[] cArrM33961m = m33961m();
            int length = cArrM33961m.length;
            int i13 = this.f29387v;
            int i14 = length - i13;
            int iMin = Math.min(i11 - i12, i13);
            for (int i15 = 0; i15 < iMin; i15++) {
                cArrM33961m[i14 + i15] = charSequence.charAt(i12 + i15);
            }
            i12 += iMin;
            this.f29387v -= iMin;
        }
        this.f29385t = null;
        this.f29388w = length() + (i11 - i10);
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return m33957i(i10);
    }

    /* JADX INFO: renamed from: e */
    public final char[] m33953e() {
        char[] cArr = (char[]) this.f29382q.mo9064B();
        char[] cArr2 = this.f29384s;
        this.f29384s = cArr;
        this.f29387v = cArr.length;
        this.f29386u = false;
        if (cArr2 != null) {
            List list = this.f29383r;
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f29383r = arrayList;
                arrayList.add(cArr2);
                list2 = arrayList;
            }
            list2.add(cArr);
        }
        return cArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return m33962n(0, charSequence, 0, length());
    }

    /* JADX INFO: renamed from: f */
    public final char[] m33954f(int i10) {
        List list = this.f29383r;
        if (list != null) {
            char[] cArr = this.f29384s;
            cArr.getClass();
            return (char[]) list.get(i10 / cArr.length);
        }
        if (i10 >= 2048) {
            m33964p(i10);
            C5706c.m23089a();
            return null;
        }
        char[] cArr2 = this.f29384s;
        if (cArr2 != null) {
            return cArr2;
        }
        m33964p(i10);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m33955g(int i10, int i11) {
        if (i10 == i11) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder(i11 - i10);
        for (int i12 = i10 - (i10 % 2048); i12 < i11; i12 += 2048) {
            char[] cArrM33954f = m33954f(i12);
            int iMin = Math.min(i11 - i12, 2048);
            for (int iMax = Math.max(0, i10 - i12); iMax < iMin; iMax++) {
                sb2.append(cArrM33954f[iMax]);
            }
        }
        return sb2;
    }

    /* JADX INFO: renamed from: h */
    public final int m33956h() {
        char[] cArr = this.f29384s;
        cArr.getClass();
        return cArr.length - this.f29387v;
    }

    public int hashCode() {
        String str = this.f29385t;
        return str != null ? str.hashCode() : m33960l(0, length());
    }

    /* JADX INFO: renamed from: i */
    public char m33957i(int i10) {
        if (i10 < 0) {
            C10030z0.m38853a("index is negative: ", i10);
            return (char) 0;
        }
        if (i10 < length()) {
            return m33958j(i10);
        }
        C10016s0.m38832a("index ", i10, " is not in range [0, ", length());
        return (char) 0;
    }

    /* JADX INFO: renamed from: j */
    public final char m33958j(int i10) {
        char[] cArrM33954f = m33954f(i10);
        char[] cArr = this.f29384s;
        cArr.getClass();
        return cArrM33954f[i10 % cArr.length];
    }

    /* JADX INFO: renamed from: k */
    public int m33959k() {
        return this.f29388w;
    }

    /* JADX INFO: renamed from: l */
    public final int m33960l(int i10, int i11) {
        int iM33958j = 0;
        while (i10 < i11) {
            iM33958j = (iM33958j * 31) + m33958j(i10);
            i10++;
        }
        return iM33958j;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m33959k();
    }

    /* JADX INFO: renamed from: m */
    public final char[] m33961m() {
        if (this.f29387v == 0) {
            return m33953e();
        }
        char[] cArr = this.f29384s;
        cArr.getClass();
        return cArr;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m33962n(int i10, CharSequence charSequence, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (m33958j(i10 + i13) != charSequence.charAt(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m33963o() {
        List list = this.f29383r;
        if (list != null) {
            this.f29384s = null;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f29382q.mo9065C0(list.get(i10));
            }
        } else {
            char[] cArr = this.f29384s;
            if (cArr != null) {
                this.f29382q.mo9065C0(cArr);
            }
            this.f29384s = null;
        }
        this.f29386u = true;
        this.f29383r = null;
        this.f29385t = null;
        this.f29388w = 0;
        this.f29387v = 0;
    }

    /* JADX INFO: renamed from: p */
    public final Void m33964p(int i10) {
        if (this.f29386u) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i10 + " is not in range [0; " + m33956h() + ')');
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 > i11) {
            C10016s0.m38832a("startIndex (", i10, ") should be less or equal to endIndex (", i11);
            return null;
        }
        if (i10 < 0) {
            C10030z0.m38853a("startIndex is negative: ", i10);
            return null;
        }
        if (i11 <= length()) {
            return new a(i10, i11);
        }
        C10016s0.m38832a("endIndex (", i11, ") is greater than length (", length());
        return null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        String str = this.f29385t;
        if (str != null) {
            return str;
        }
        String string = m33955g(0, length()).toString();
        this.f29385t = string;
        return string;
    }

    public C8843d(InterfaceC2546e interfaceC2546e) {
        interfaceC2546e.getClass();
        this.f29382q = interfaceC2546e;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) {
        char[] cArrM33961m = m33961m();
        char[] cArr = this.f29384s;
        cArr.getClass();
        int length = cArr.length;
        int i10 = this.f29387v;
        cArrM33961m[length - i10] = c10;
        this.f29385t = null;
        this.f29387v = i10 - 1;
        this.f29388w = length() + 1;
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }
}
