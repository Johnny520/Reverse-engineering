package p361yc;

import java.util.List;
import p024b9.AbstractC1061t;
import p172l8.C4699i;
import p329wc.AbstractC9217e;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9749q2 implements InterfaceC9218f {

    /* JADX INFO: renamed from: a */
    public final String f33017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9217e f33018b;

    public C9749q2(String str, AbstractC9217e abstractC9217e) {
        str.getClass();
        abstractC9217e.getClass();
        this.f33017a = str;
        this.f33018b = abstractC9217e;
    }

    /* JADX INFO: renamed from: b */
    private final Void m38020b() {
        throw new IllegalStateException("Primitive descriptor " + mo35888a() + " does not have elements");
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f33017a;
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
        m38020b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9749q2)) {
            return false;
        }
        C9749q2 c9749q2 = (C9749q2) obj;
        return AbstractC1061t.m3842c(mo35888a(), c9749q2.mo35888a()) && AbstractC1061t.m3842c(mo35896j(), c9749q2.mo35896j());
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        m38020b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        m38020b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        m38020b();
        throw new C4699i();
    }

    public int hashCode() {
        return mo35888a().hashCode() + (mo35896j().hashCode() * 31);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        m38020b();
        throw new C4699i();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return super.mo35897k();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC9217e mo35896j() {
        return this.f33018b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo35888a() + ')';
    }
}
