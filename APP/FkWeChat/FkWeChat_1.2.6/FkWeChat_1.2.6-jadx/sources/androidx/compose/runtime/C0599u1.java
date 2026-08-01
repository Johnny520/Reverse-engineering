package androidx.compose.runtime;

import ec.AbstractC2108a2;
import ec.AbstractC2148k;
import ec.AbstractC2169p0;
import ec.InterfaceC2153l0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0188p;
import p150k1.C3917j;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: androidx.compose.runtime.u1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599u1 implements InterfaceC0472c4, InterfaceC2153l0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f1614q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0188p f1615r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2165o0 f1616s;

    /* JADX INFO: renamed from: t */
    public InterfaceC2198w1 f1617t;

    public C0599u1(InterfaceC5980j interfaceC5980j, InterfaceC0188p interfaceC0188p) {
        this.f1614q = interfaceC5980j;
        this.f1615r = interfaceC0188p;
        this.f1616s = AbstractC2169p0.m7878a(interfaceC5980j.mo1651c0(this));
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public /* bridge */ InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC2153l0.a.m7827c(this, cVar);
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: b */
    public void mo1532b() {
        InterfaceC2198w1 interfaceC2198w1 = this.f1617t;
        if (interfaceC2198w1 != null) {
            interfaceC2198w1.mo7696n(new C0613w1());
        }
        this.f1617t = null;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC2153l0.a.m7828d(this, interfaceC5980j);
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: g */
    public void mo1533g() {
        InterfaceC2198w1 interfaceC2198w1 = this.f1617t;
        if (interfaceC2198w1 != null) {
            interfaceC2198w1.mo7696n(new C0613w1());
        }
        this.f1617t = null;
    }

    @Override // p228p8.InterfaceC5980j.b
    public InterfaceC5980j.c getKey() {
        return InterfaceC2153l0.f5982f;
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public /* bridge */ InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC2153l0.a.m7826b(this, cVar);
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: i */
    public void mo1534i() {
        InterfaceC2198w1 interfaceC2198w1 = this.f1617t;
        if (interfaceC2198w1 != null) {
            AbstractC2108a2.m7605e(interfaceC2198w1, "Old job was still running!", null, 2, null);
        }
        this.f1617t = AbstractC2148k.m7817d(this.f1616s, null, null, this.f1615r, 3, null);
    }

    @Override // ec.InterfaceC2153l0
    /* JADX INFO: renamed from: j0 */
    public void mo167j0(InterfaceC5980j interfaceC5980j, Throwable th) throws Throwable {
        C3917j c3917j = (C3917j) interfaceC5980j.mo1654h(C3917j.f11381r);
        if (c3917j != null) {
            c3917j.mo15596a(th, this);
        }
        InterfaceC2153l0 interfaceC2153l0 = (InterfaceC2153l0) this.f1614q.mo1654h(InterfaceC2153l0.f5982f);
        if (interfaceC2153l0 == null) {
            throw th;
        }
        interfaceC2153l0.mo167j0(interfaceC5980j, th);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public /* bridge */ Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC2153l0.a.m7825a(this, obj, interfaceC0188p);
    }
}
