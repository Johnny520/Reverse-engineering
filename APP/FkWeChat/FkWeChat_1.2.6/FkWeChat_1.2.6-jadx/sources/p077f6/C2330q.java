package p077f6;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2330q {

    /* JADX INFO: renamed from: a */
    public final String f6373a;

    /* JADX INFO: renamed from: b */
    public final String f6374b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f6375c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f6376d;

    /* JADX INFO: renamed from: e */
    public final String f6377e;

    /* JADX INFO: renamed from: f */
    public final String f6378f;

    public /* synthetic */ C2330q(String str, String str2, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, String str3, String str4, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? "Quote" : str, (i10 & 2) != 0 ? "Code block" : str2, (i10 & 4) != 0 ? new InterfaceC0184l() { // from class: f6.o
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C2330q.m8492b((String) obj);
            }
        } : interfaceC0184l, (i10 & 8) != 0 ? new InterfaceC0184l() { // from class: f6.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C2330q.m8491a((String) obj);
            }
        } : interfaceC0184l2, (i10 & 16) != 0 ? "CODE" : str3, (i10 & 32) != 0 ? "Copy code" : str4);
    }

    /* JADX INFO: renamed from: a */
    public static String m8491a(String str) {
        str.getClass();
        return "Language: ".concat(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m8492b(String str) {
        str.getClass();
        return "Code block, ".concat(str);
    }

    /* JADX INFO: renamed from: c */
    public final String m8493c() {
        return this.f6373a;
    }

    /* JADX INFO: renamed from: d */
    public final String m8494d() {
        return this.f6374b;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l m8495e() {
        return this.f6375c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2330q)) {
            return false;
        }
        C2330q c2330q = (C2330q) obj;
        return AbstractC1061t.m3842c(this.f6373a, c2330q.f6373a) && AbstractC1061t.m3842c(this.f6374b, c2330q.f6374b) && AbstractC1061t.m3842c(this.f6375c, c2330q.f6375c) && AbstractC1061t.m3842c(this.f6376d, c2330q.f6376d) && AbstractC1061t.m3842c(this.f6377e, c2330q.f6377e) && AbstractC1061t.m3842c(this.f6378f, c2330q.f6378f);
    }

    /* JADX INFO: renamed from: f */
    public final String m8496f() {
        return this.f6377e;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0184l m8497g() {
        return this.f6376d;
    }

    /* JADX INFO: renamed from: h */
    public final String m8498h() {
        return this.f6378f;
    }

    public int hashCode() {
        return (((((((((this.f6373a.hashCode() * 31) + this.f6374b.hashCode()) * 31) + this.f6375c.hashCode()) * 31) + this.f6376d.hashCode()) * 31) + this.f6377e.hashCode()) * 31) + this.f6378f.hashCode();
    }

    public String toString() {
        return "MarkdownA11yLabels(blockquote=" + this.f6373a + ", codeBlock=" + this.f6374b + ", codeBlockWithLanguage=" + this.f6375c + ", codeLanguage=" + this.f6376d + ", codeFallbackLanguage=" + this.f6377e + ", copyCode=" + this.f6378f + ")";
    }

    public C2330q(String str, String str2, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l2.getClass();
        str3.getClass();
        str4.getClass();
        this.f6373a = str;
        this.f6374b = str2;
        this.f6375c = interfaceC0184l;
        this.f6376d = interfaceC0184l2;
        this.f6377e = str3;
        this.f6378f = str4;
    }
}
