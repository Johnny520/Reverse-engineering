package p269s5;

import bsh.C1259t2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p376zd.C9987e;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7186a implements Comparable {

    /* JADX INFO: renamed from: u */
    public static final ConcurrentMap f23781u = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: q */
    public final String f23782q;

    /* JADX INFO: renamed from: r */
    public final C7188c f23783r;

    /* JADX INFO: renamed from: s */
    public final C7187b f23784s;

    /* JADX INFO: renamed from: t */
    public C7187b f23785t;

    public C7186a(String str, C7188c c7188c, C7187b c7187b) {
        if (str == null) {
            C1259t2.m5095a("descriptor == null");
            throw null;
        }
        if (c7188c == null) {
            C1259t2.m5095a("returnType == null");
            throw null;
        }
        if (c7187b == null) {
            C1259t2.m5095a("parameterTypes == null");
            throw null;
        }
        this.f23782q = str;
        this.f23783r = c7188c;
        this.f23784s = c7187b;
        this.f23785t = null;
    }

    /* JADX INFO: renamed from: c */
    public static C7186a m28378c(String str) {
        int i10;
        C7186a c7186a = (C7186a) f23781u.get(str);
        if (c7186a != null) {
            return c7186a;
        }
        C7188c[] c7188cArrM28382n = m28382n(str);
        int i11 = 0;
        int i12 = 1;
        while (true) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == ')') {
                C7188c c7188cM28406x = C7188c.m28406x(str.substring(i12 + 1));
                C7187b c7187b = new C7187b(i11);
                for (int i13 = 0; i13 < i11; i13++) {
                    c7187b.m28400N(i13, c7188cArrM28382n[i13]);
                }
                return new C7186a(str, c7188cM28406x, c7187b);
            }
            int i14 = i12;
            while (cCharAt == '[') {
                i14++;
                cCharAt = str.charAt(i14);
            }
            if (cCharAt == 'L') {
                int iIndexOf = str.indexOf(59, i14);
                if (iIndexOf == -1) {
                    C9987e.m38645a("bad descriptor");
                    return null;
                }
                i10 = iIndexOf + 1;
            } else {
                i10 = i14 + 1;
            }
            c7188cArrM28382n[i11] = C7188c.m28404v(str.substring(i12, i10));
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C7186a m28379k(String str) {
        if (str != null) {
            C7186a c7186a = (C7186a) f23781u.get(str);
            return c7186a != null ? c7186a : m28383p(m28378c(str));
        }
        C1259t2.m5095a("descriptor == null");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static C7186a m28380l(String str, C7188c c7188c, boolean z10, boolean z11) {
        C7186a c7186aM28379k = m28379k(str);
        if (z10) {
            return c7186aM28379k;
        }
        if (z11) {
            c7188c = c7188c.m28413a(Integer.MAX_VALUE);
        }
        return c7186aM28379k.m28389r(c7188c);
    }

    /* JADX INFO: renamed from: m */
    public static C7186a m28381m(C7188c c7188c, int i10) {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append('(');
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append('I');
        }
        sb2.append(')');
        sb2.append(c7188c.m28419p());
        return m28379k(sb2.toString());
    }

    /* JADX INFO: renamed from: n */
    public static C7188c[] m28382n(String str) {
        int length = str.length();
        int i10 = 0;
        if (str.charAt(0) != '(') {
            C9987e.m38645a("bad descriptor");
            return null;
        }
        int i11 = 0;
        int i12 = 1;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == ')') {
                i10 = i12;
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i11++;
            }
            i12++;
        }
        if (i10 == 0 || i10 == length - 1) {
            C9987e.m38645a("bad descriptor");
            return null;
        }
        if (str.indexOf(41, i10 + 1) == -1) {
            return new C7188c[i11];
        }
        C9987e.m38645a("bad descriptor");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static C7186a m28383p(C7186a c7186a) {
        C7186a c7186a2 = (C7186a) f23781u.putIfAbsent(c7186a.m28385g(), c7186a);
        return c7186a2 != null ? c7186a2 : c7186a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7186a c7186a) {
        if (this == c7186a) {
            return 0;
        }
        int iM28414c = this.f23783r.compareTo(c7186a.f23783r);
        if (iM28414c != 0) {
            return iM28414c;
        }
        int size = this.f23784s.size();
        int size2 = c7186a.f23784s.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM28414c2 = this.f23784s.m28398G(i10).compareTo(c7186a.f23784s.m28398G(i10));
            if (iM28414c2 != 0) {
                return iM28414c2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7186a) {
            return this.f23782q.equals(((C7186a) obj).f23782q);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public String m28385g() {
        return this.f23782q;
    }

    /* JADX INFO: renamed from: h */
    public C7187b m28386h() {
        if (this.f23785t == null) {
            int size = this.f23784s.size();
            C7187b c7187b = new C7187b(size);
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                C7188c c7188cM28398G = this.f23784s.m28398G(i10);
                if (c7188cM28398G.m28409C()) {
                    c7188cM28398G = C7188c.f23825D;
                    z10 = true;
                }
                c7187b.m28400N(i10, c7188cM28398G);
            }
            if (!z10) {
                c7187b = this.f23784s;
            }
            this.f23785t = c7187b;
        }
        return this.f23785t;
    }

    public int hashCode() {
        return this.f23782q.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public C7187b m28387i() {
        return this.f23784s;
    }

    /* JADX INFO: renamed from: j */
    public C7188c m28388j() {
        return this.f23783r;
    }

    /* JADX INFO: renamed from: r */
    public C7186a m28389r(C7188c c7188c) {
        String str = "(" + c7188c.m28419p() + this.f23782q.substring(1);
        C7187b c7187bM28401P = this.f23784s.m28401P(c7188c);
        c7187bM28401P.mo6829t();
        return m28383p(new C7186a(str, this.f23783r, c7187bM28401P));
    }

    public String toString() {
        return this.f23782q;
    }
}
