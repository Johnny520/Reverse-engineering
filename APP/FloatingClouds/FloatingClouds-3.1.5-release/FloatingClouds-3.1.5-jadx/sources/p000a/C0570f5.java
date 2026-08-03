package p000a;

import java.util.ArrayList;

/* JADX INFO: renamed from: a.f5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0570f5 {

    /* JADX INFO: renamed from: a */
    public final String f2126a;

    /* JADX INFO: renamed from: b */
    public final String f2127b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2128c;

    /* JADX INFO: renamed from: d */
    public final String f2129d;

    /* JADX INFO: renamed from: e */
    public final C0233Me f2130e;

    /* JADX INFO: renamed from: a.f5$a */
    public static final class a extends AbstractC0859u9 implements InterfaceC0819s7<String> {
        public a() {
            super(0);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final String mo31a() {
            StringBuilder sb = new StringBuilder("(");
            C0570f5 c0570f5 = C0570f5.this;
            sb.append(C0834t3.m1952p0(c0570f5.f2128c, "", C0551e5.f2041b, 30));
            sb.append(")");
            sb.append(C0608h5.m1445b(c0570f5.f2129d));
            String string = sb.toString();
            C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public C0570f5(String str) {
        int i;
        C0631i9.m1482e(str, "descriptor");
        this.f2130e = new C0233Me(new a());
        int iM100O = 0;
        int iM99N = C0034Be.m99N(str, "->", 0, false, 6);
        int iM99N2 = C0034Be.m99N(str, "(", iM99N + 1, false, 4);
        int i2 = iM99N2 + 1;
        int iM99N3 = C0034Be.m99N(str, ")", i2, false, 4);
        if (iM99N == -1 || iM99N2 == -1 || iM99N3 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM99N);
        C0631i9.m1481d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f2126a = C0608h5.m1444a(strSubstring);
        String strSubstring2 = str.substring(iM99N + 2, iM99N2);
        C0631i9.m1481d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f2127b = strSubstring2;
        String strSubstring3 = str.substring(i2, iM99N3);
        C0631i9.m1481d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM100O;
            while (iM100O < strSubstring3.length()) {
                char cCharAt = strSubstring3.charAt(iM100O);
                if (cCharAt == '[') {
                    iM100O++;
                } else {
                    if (cCharAt == 'L') {
                        iM100O = C0034Be.m100O(strSubstring3, ';', iM100O, 4);
                    }
                    iM100O++;
                    String strSubstring4 = strSubstring3.substring(i, iM100O);
                    C0631i9.m1481d(strSubstring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(C0608h5.m1444a(strSubstring4));
                }
            }
            break loop0;
        }
        if (i != iM100O) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring3));
        }
        this.f2128c = arrayList;
        String strSubstring5 = str.substring(iM99N3 + 1);
        C0631i9.m1481d(strSubstring5, "(this as java.lang.String).substring(startIndex)");
        this.f2129d = C0608h5.m1444a(strSubstring5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570f5)) {
            return false;
        }
        C0570f5 c0570f5 = (C0570f5) obj;
        return C0631i9.m1478a(this.f2126a, c0570f5.f2126a) && C0631i9.m1478a(this.f2127b, c0570f5.f2127b) && C0631i9.m1478a(this.f2128c, c0570f5.f2128c) && C0631i9.m1478a(this.f2129d, c0570f5.f2129d);
    }

    public final int hashCode() {
        return this.f2129d.hashCode() + (this.f2128c.hashCode() * 31) + (this.f2127b.hashCode() * 31) + (this.f2126a.hashCode() * 31);
    }

    public final String toString() {
        String str = C0608h5.m1445b(this.f2126a) + "->" + this.f2127b + ((String) this.f2130e.m625a());
        C0631i9.m1481d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
