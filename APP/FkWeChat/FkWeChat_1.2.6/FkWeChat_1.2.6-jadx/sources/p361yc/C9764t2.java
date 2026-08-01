package p361yc;

import java.util.List;
import java.util.Set;
import p024b9.AbstractC1061t;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.t2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9764t2 implements InterfaceC9218f, InterfaceC9731n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9218f f33041a;

    /* JADX INFO: renamed from: b */
    public final String f33042b;

    /* JADX INFO: renamed from: c */
    public final Set f33043c;

    public C9764t2(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        this.f33041a = interfaceC9218f;
        this.f33042b = interfaceC9218f.mo35888a() + '?';
        this.f33043c = AbstractC9689e2.m37878a(interfaceC9218f);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: a */
    public String mo35888a() {
        return this.f33042b;
    }

    @Override // p361yc.InterfaceC9731n
    /* JADX INFO: renamed from: b */
    public Set mo35899b() {
        return this.f33043c;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: c */
    public boolean mo35889c() {
        return true;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: d */
    public int mo35890d(String str) {
        str.getClass();
        return this.f33041a.mo35890d(str);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: e */
    public int mo35891e() {
        return this.f33041a.mo35891e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9764t2) && AbstractC1061t.m3842c(this.f33041a, ((C9764t2) obj).f33041a);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: f */
    public String mo35892f(int i10) {
        return this.f33041a.mo35892f(i10);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: g */
    public List mo35893g(int i10) {
        return this.f33041a.mo35893g(i10);
    }

    @Override // p329wc.InterfaceC9218f
    public List getAnnotations() {
        return this.f33041a.getAnnotations();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        return this.f33041a.mo35894h(i10);
    }

    public int hashCode() {
        return this.f33041a.hashCode() * 31;
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: i */
    public boolean mo35895i(int i10) {
        return this.f33041a.mo35895i(i10);
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return this.f33041a.mo35896j();
    }

    @Override // p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return this.f33041a.mo35897k();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC9218f m38057l() {
        return this.f33041a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33041a);
        sb2.append('?');
        return sb2.toString();
    }
}
