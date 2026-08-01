package p361yc;

import java.util.List;
import p172l8.C4699i;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9763t1 implements InterfaceC9218f {

    /* JADX INFO: renamed from: a */
    public static final C9763t1 f33038a = new C9763t1();

    /* JADX INFO: renamed from: b */
    public static final AbstractC9224l f33039b = AbstractC9225m.d.f31489a;

    /* JADX INFO: renamed from: c */
    public static final String f33040c = "kotlin.Nothing";

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return f33040c;
    }

    /* JADX INFO: renamed from: b */
    public final Void m38056b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: c */
    public boolean mo35889c() {
        return super.mo35889c();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: d */
    public int mo35890d(String str) {
        str.getClass();
        m38056b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        m38056b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        m38056b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        m38056b();
        throw new C4699i();
    }

    public int hashCode() {
        return mo35888a().hashCode() + (mo35896j().hashCode() * 31);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        m38056b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return f33039b;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return super.mo35897k();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
