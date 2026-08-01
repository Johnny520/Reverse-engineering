package p329wc;

import java.util.List;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;

/* JADX INFO: renamed from: wc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9215c implements InterfaceC9218f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9218f f31451a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2549c f31452b;

    /* JADX INFO: renamed from: c */
    public final String f31453c;

    public C9215c(InterfaceC9218f interfaceC9218f, InterfaceC2549c interfaceC2549c) {
        interfaceC9218f.getClass();
        interfaceC2549c.getClass();
        this.f31451a = interfaceC9218f;
        this.f31452b = interfaceC2549c;
        this.f31453c = interfaceC9218f.mo35888a() + '<' + interfaceC2549c.mo3794w() + '>';
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f31453c;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: c */
    public boolean mo35889c() {
        return this.f31451a.mo35889c();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: d */
    public int mo35890d(String str) {
        str.getClass();
        return this.f31451a.mo35890d(str);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return this.f31451a.mo35891e();
    }

    public boolean equals(Object obj) {
        C9215c c9215c = obj instanceof C9215c ? (C9215c) obj : null;
        return c9215c != null && AbstractC1061t.m3842c(this.f31451a, c9215c.f31451a) && AbstractC1061t.m3842c(c9215c.f31452b, this.f31452b);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        return this.f31451a.mo35892f(i10);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        return this.f31451a.mo35893g(i10);
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return this.f31451a.getAnnotations();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        return this.f31451a.mo35894h(i10);
    }

    public int hashCode() {
        return (this.f31452b.hashCode() * 31) + mo35888a().hashCode();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        return this.f31451a.mo35895i(i10);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return this.f31451a.mo35896j();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return this.f31451a.mo35897k();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f31452b + ", original: " + this.f31451a + ')';
    }
}
