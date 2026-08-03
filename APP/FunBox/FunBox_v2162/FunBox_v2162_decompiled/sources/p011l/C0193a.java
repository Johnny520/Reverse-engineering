package p011l;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0193a implements Comparable {

    /* JADX INFO: renamed from: e */
    private static final ConcurrentHashMap f705e = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: a */
    private final String f706a;

    /* JADX INFO: renamed from: b */
    private final C0195c f707b;

    /* JADX INFO: renamed from: c */
    private final C0194b f708c;

    /* JADX INFO: renamed from: d */
    private C0194b f709d;

    private C0193a(String str, C0195c c0195c, C0194b c0194b) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c0195c == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f706a = str;
        this.f707b = c0195c;
        this.f708c = c0194b;
        this.f709d = null;
    }

    /* JADX INFO: renamed from: b */
    public static C0193a m453b(String str) {
        int i2;
        C0193a c0193a = (C0193a) f705e.get(str);
        if (c0193a != null) {
            return c0193a;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i3 = 0;
        int i4 = 1;
        while (true) {
            if (i4 >= length) {
                i4 = 0;
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i3++;
            }
            i4++;
        }
        if (i4 == 0 || i4 == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i4 + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        C0195c[] c0195cArr = new C0195c[i3];
        int i5 = 0;
        int i6 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i6 + 1);
                C0195c c0195c = C0195c.f762g;
                try {
                    C0195c c0195cM465i = strSubstring.equals("V") ? C0195c.f770o : C0195c.m465i(strSubstring);
                    C0194b c0194b = new C0194b(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        c0194b.m523z(i7, c0195cArr[i7]);
                    }
                    return new C0193a(str, c0195cM465i, c0194b);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
            int i8 = i6;
            while (cCharAt2 == '[') {
                i8++;
                cCharAt2 = str.charAt(i8);
            }
            if (cCharAt2 == 'L') {
                int iIndexOf = str.indexOf(59, i8);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i2 = iIndexOf + 1;
            } else {
                i2 = i8 + 1;
            }
            c0195cArr[i5] = C0195c.m465i(str.substring(i6, i2));
            i5++;
            i6 = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0193a m454f(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentHashMap concurrentHashMap = f705e;
        C0193a c0193a = (C0193a) concurrentHashMap.get(str);
        if (c0193a != null) {
            return c0193a;
        }
        C0193a c0193aM453b = m453b(str);
        C0193a c0193a2 = (C0193a) concurrentHashMap.putIfAbsent(c0193aM453b.f706a, c0193aM453b);
        return c0193a2 != null ? c0193a2 : c0193aM453b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0193a c0193a) {
        if (this == c0193a) {
            return 0;
        }
        int iCompareTo = this.f707b.compareTo(c0193a.f707b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C0194b c0194b = this.f708c;
        int iM504B = c0194b.m504B();
        C0194b c0194b2 = c0193a.f708c;
        int iM504B2 = c0194b2.m504B();
        int iMin = Math.min(iM504B, iM504B2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo2 = c0194b.m515r(i2).compareTo(c0194b2.m515r(i2));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (iM504B < iM504B2) {
            return -1;
        }
        return iM504B > iM504B2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public final C0194b m456c() {
        if (this.f709d == null) {
            C0194b c0194b = this.f708c;
            int iM504B = c0194b.m504B();
            C0194b c0194b2 = new C0194b(iM504B);
            boolean z = false;
            for (int i2 = 0; i2 < iM504B; i2++) {
                C0195c c0195cR = c0194b.m515r(i2);
                if (c0195cR.m473k()) {
                    c0195cR = C0195c.f767l;
                    z = true;
                }
                c0194b2.m523z(i2, c0195cR);
            }
            if (z) {
                c0194b = c0194b2;
            }
            this.f709d = c0194b;
        }
        return this.f709d;
    }

    /* JADX INFO: renamed from: d */
    public final C0194b m457d() {
        return this.f708c;
    }

    /* JADX INFO: renamed from: e */
    public final C0195c m458e() {
        return this.f707b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193a)) {
            return false;
        }
        return this.f706a.equals(((C0193a) obj).f706a);
    }

    /* JADX INFO: renamed from: g */
    public final C0193a m459g(C0195c c0195c) {
        String str = "(" + c0195c.m471h() + this.f706a.substring(1);
        C0194b c0194bM464J = this.f708c.m464J(c0195c);
        c0194bM464J.m536g();
        C0193a c0193a = new C0193a(str, this.f707b, c0194bM464J);
        C0193a c0193a2 = (C0193a) f705e.putIfAbsent(str, c0193a);
        return c0193a2 != null ? c0193a2 : c0193a;
    }

    public final int hashCode() {
        return this.f706a.hashCode();
    }

    public final String toString() {
        return this.f706a;
    }
}
