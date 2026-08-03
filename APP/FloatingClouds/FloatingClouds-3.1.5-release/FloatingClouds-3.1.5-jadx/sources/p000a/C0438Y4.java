package p000a;

/* JADX INFO: renamed from: a.Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438Y4 {

    /* JADX INFO: renamed from: a */
    public final String f1640a;

    /* JADX INFO: renamed from: b */
    public final String f1641b;

    /* JADX INFO: renamed from: c */
    public final String f1642c;

    /* JADX INFO: renamed from: d */
    public final C0233Me f1643d;

    /* JADX INFO: renamed from: a.Y4$a */
    public static final class a extends AbstractC0859u9 implements InterfaceC0819s7<String> {
        public a() {
            super(0);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final String mo31a() {
            return C0608h5.m1445b(C0438Y4.this.f1642c);
        }
    }

    public C0438Y4(String str) {
        C0631i9.m1482e(str, "descriptor");
        this.f1643d = new C0233Me(new a());
        int iM99N = C0034Be.m99N(str, "->", 0, false, 6);
        int iM99N2 = C0034Be.m99N(str, ":", iM99N + 1, false, 4);
        if (iM99N == -1 || iM99N2 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM99N);
        C0631i9.m1481d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1640a = C0608h5.m1444a(strSubstring);
        String strSubstring2 = str.substring(iM99N + 2, iM99N2);
        C0631i9.m1481d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1641b = strSubstring2;
        String strSubstring3 = str.substring(iM99N2 + 1);
        C0631i9.m1481d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
        this.f1642c = C0608h5.m1444a(strSubstring3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0438Y4)) {
            return false;
        }
        C0438Y4 c0438y4 = (C0438Y4) obj;
        return C0631i9.m1478a(this.f1640a, c0438y4.f1640a) && C0631i9.m1478a(this.f1641b, c0438y4.f1641b) && C0631i9.m1478a(this.f1642c, c0438y4.f1642c);
    }

    public final int hashCode() {
        return this.f1642c.hashCode() + (this.f1641b.hashCode() * 31) + (this.f1640a.hashCode() * 31);
    }

    public final String toString() {
        String str = C0608h5.m1445b(this.f1640a) + "->" + this.f1641b + ":" + ((String) this.f1643d.m625a());
        C0631i9.m1481d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
