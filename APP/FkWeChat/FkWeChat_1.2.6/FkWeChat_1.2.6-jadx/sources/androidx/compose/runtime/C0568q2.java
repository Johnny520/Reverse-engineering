package androidx.compose.runtime;

import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: androidx.compose.runtime.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568q2 implements InterfaceC0474d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0474d f1569a;

    /* JADX INFO: renamed from: b */
    public final int f1570b;

    /* JADX INFO: renamed from: c */
    public int f1571c;

    public C0568q2(InterfaceC0474d interfaceC0474d, int i10) {
        this.f1569a = interfaceC0474d;
        this.f1570b = i10;
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: a */
    public Object mo1476a() {
        return this.f1569a.mo1476a();
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: b */
    public void mo1580b(int i10, int i11) {
        this.f1569a.mo1580b(i10 + (this.f1571c == 0 ? this.f1570b : 0), i11);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: c */
    public void mo1581c(int i10, Object obj) {
        this.f1569a.mo1581c(i10 + (this.f1571c == 0 ? this.f1570b : 0), obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    public void clear() {
        AbstractC0468c0.m1548b("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: d */
    public void mo1477d(Object obj) {
        this.f1571c++;
        this.f1569a.mo1477d(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: e */
    public void mo1582e() {
        this.f1569a.mo1582e();
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: g */
    public void mo1584g(int i10, int i11, int i12) {
        int i13 = this.f1571c == 0 ? this.f1570b : 0;
        this.f1569a.mo1584g(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: h */
    public void mo1478h() {
        if (!(this.f1571c > 0)) {
            AbstractC0468c0.m1548b("OffsetApplier up called with no corresponding down");
        }
        this.f1571c--;
        this.f1569a.mo1478h();
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: i */
    public void mo1585i(InterfaceC0188p interfaceC0188p, Object obj) {
        this.f1569a.mo1585i(interfaceC0188p, obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: j */
    public void mo1586j(int i10, Object obj) {
        this.f1569a.mo1586j(i10 + (this.f1571c == 0 ? this.f1570b : 0), obj);
    }
}
