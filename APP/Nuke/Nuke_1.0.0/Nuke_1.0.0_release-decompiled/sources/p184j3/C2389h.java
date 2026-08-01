package p184j3;

import p000A.C0022L;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2389h extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7739h = 1;

    /* JADX INFO: renamed from: i */
    public int f7740i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f7741j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2391j f7742k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2324e f7743l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389h(C2391j c2391j, InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7742k = c2391j;
        this.f7743l = interfaceC2324e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f7739h) {
        }
        return ((C2389h) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f7739h) {
            case 0:
                return new C2389h(this.f7742k, this.f7743l, this.f7741j, interfaceC1046d);
            default:
                C2389h c2389h = new C2389h(this.f7742k, this.f7743l, interfaceC1046d);
                c2389h.f7741j = obj;
                return c2389h;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f7739h) {
            case 0:
                int i5 = this.f7740i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    ?? r9 = this.f7742k.f7749h;
                    Object obj2 = this.f7741j;
                    this.f7740i = 1;
                    Object objMo5f = r9.mo5f(this.f7743l, obj2, this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objMo5f == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i6 = this.f7740i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f7741j;
                    C1675t c1675t = new C1675t();
                    C2391j c2391j = this.f7742k;
                    InterfaceC2323d interfaceC2323d = c2391j.f7738g;
                    C0022L c0022l = new C0022L(c1675t, interfaceC2160t, c2391j, this.f7743l, 1);
                    this.f7740i = 1;
                    Object objMo3119i = interfaceC2323d.mo3119i(c0022l, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objMo3119i == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389h(C2391j c2391j, InterfaceC2324e interfaceC2324e, Object obj, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7742k = c2391j;
        this.f7743l = interfaceC2324e;
        this.f7741j = obj;
    }
}
