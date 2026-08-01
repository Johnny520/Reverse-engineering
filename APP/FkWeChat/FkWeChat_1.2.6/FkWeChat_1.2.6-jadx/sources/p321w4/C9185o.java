package p321w4;

/* JADX INFO: renamed from: w4.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9185o {

    /* JADX INFO: renamed from: e */
    public static final C9185o f31376e = new C9185o(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: f */
    public static final C9185o f31377f = new C9185o(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: g */
    public static final C9185o f31378g = new C9185o(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: h */
    public static final C9185o f31379h = new C9185o(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: i */
    public static final C9185o f31380i = new C9185o(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: j */
    public static final C9185o f31381j = new C9185o(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: k */
    public static final C9185o f31382k = new C9185o(6, "VZCBSIFJD", 6, 7);

    /* JADX INFO: renamed from: l */
    public static final C9185o f31383l = new C9185o(7, "VZCBSIFJD", 7, 8);

    /* JADX INFO: renamed from: m */
    public static final C9185o f31384m = new C9185o(8, "VZCBSIFJD", 8, 9);

    /* JADX INFO: renamed from: a */
    public final int f31385a;

    /* JADX INFO: renamed from: b */
    public final String f31386b;

    /* JADX INFO: renamed from: c */
    public final int f31387c;

    /* JADX INFO: renamed from: d */
    public final int f31388d;

    public C9185o(int i10, String str, int i11, int i12) {
        this.f31385a = i10;
        this.f31386b = str;
        this.f31387c = i11;
        this.f31388d = i12;
    }

    /* JADX INFO: renamed from: a */
    public static C9185o[] m35733a(String str) {
        int i10;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (str.charAt(i14) != ')') {
            while (str.charAt(i14) == '[') {
                i14++;
            }
            int i15 = i14 + 1;
            if (str.charAt(i14) == 'L') {
                while (true) {
                    i14 = i15 + 1;
                    if (str.charAt(i15) != ';') {
                        i15 = i14;
                    }
                }
            } else {
                i14 = i15;
            }
            i13++;
        }
        C9185o[] c9185oArr = new C9185o[i13];
        while (str.charAt(i12) != ')') {
            int i16 = i12;
            while (str.charAt(i16) == '[') {
                i16++;
            }
            int i17 = i16 + 1;
            if (str.charAt(i16) == 'L') {
                while (true) {
                    i10 = i17 + 1;
                    if (str.charAt(i17) != ';') {
                        i17 = i10;
                    }
                }
            } else {
                i10 = i17;
            }
            c9185oArr[i11] = m35737h(str, i12, i10);
            i12 = i10;
            i11++;
        }
        return c9185oArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m35734b(String str) {
        int i10;
        char cCharAt = str.charAt(1);
        int i11 = 1;
        int i12 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i11++;
                i12 += 2;
            } else {
                while (str.charAt(i11) == '[') {
                    i11++;
                }
                int i13 = i11 + 1;
                if (str.charAt(i11) == 'L') {
                    while (true) {
                        i10 = i13 + 1;
                        if (str.charAt(i13) == ';') {
                            break;
                        }
                        i13 = i10;
                    }
                    i13 = i10;
                }
                i12++;
                i11 = i13;
            }
            cCharAt = str.charAt(i11);
        }
        char cCharAt2 = str.charAt(i11 + 1);
        if (cCharAt2 == 'V') {
            return i12 << 2;
        }
        return (i12 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    /* JADX INFO: renamed from: e */
    public static String m35735e(Class cls) {
        return cls.getName().replace('.', '/');
    }

    /* JADX INFO: renamed from: g */
    public static C9185o m35736g(String str) {
        return m35737h(str, 0, str.length());
    }

    /* JADX INFO: renamed from: h */
    public static C9185o m35737h(String str, int i10, int i11) {
        char cCharAt = str.charAt(i10);
        if (cCharAt == '(') {
            return new C9185o(11, str, i10, i11);
        }
        if (cCharAt == 'F') {
            return f31382k;
        }
        if (cCharAt == 'L') {
            return new C9185o(10, str, i10 + 1, i11 - 1);
        }
        if (cCharAt == 'S') {
            return f31380i;
        }
        if (cCharAt == 'V') {
            return f31376e;
        }
        if (cCharAt == 'I') {
            return f31381j;
        }
        if (cCharAt == 'J') {
            return f31383l;
        }
        if (cCharAt == 'Z') {
            return f31377f;
        }
        if (cCharAt == '[') {
            return new C9185o(9, str, i10, i11);
        }
        switch (cCharAt) {
            case 'B':
                return f31379h;
            case 'C':
                return f31378g;
            case 'D':
                return f31384m;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m35738c() {
        int i10 = this.f31385a;
        if (i10 == 10) {
            return this.f31386b.substring(this.f31387c - 1, this.f31388d + 1);
        }
        String str = this.f31386b;
        if (i10 != 12) {
            return str.substring(this.f31387c, this.f31388d);
        }
        StringBuilder sb2 = new StringBuilder("L");
        sb2.append((CharSequence) str, this.f31387c, this.f31388d);
        sb2.append(';');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public String m35739d() {
        return this.f31386b.substring(this.f31387c, this.f31388d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9185o)) {
            return false;
        }
        C9185o c9185o = (C9185o) obj;
        int i10 = this.f31385a;
        if (i10 == 12) {
            i10 = 10;
        }
        int i11 = c9185o.f31385a;
        if (i10 != (i11 != 12 ? i11 : 10)) {
            return false;
        }
        int i12 = this.f31387c;
        int i13 = this.f31388d;
        int i14 = c9185o.f31387c;
        if (i13 - i12 != c9185o.f31388d - i14) {
            return false;
        }
        while (i12 < i13) {
            if (this.f31386b.charAt(i12) != c9185o.f31386b.charAt(i14)) {
                return false;
            }
            i12++;
            i14++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int m35740f() {
        int i10 = this.f31385a;
        if (i10 == 12) {
            return 10;
        }
        return i10;
    }

    public int hashCode() {
        int i10 = this.f31385a;
        int iCharAt = (i10 == 12 ? 10 : i10) * 13;
        if (i10 >= 9) {
            int i11 = this.f31388d;
            for (int i12 = this.f31387c; i12 < i11; i12++) {
                iCharAt = (iCharAt + this.f31386b.charAt(i12)) * 17;
            }
        }
        return iCharAt;
    }

    public String toString() {
        return m35738c();
    }
}
