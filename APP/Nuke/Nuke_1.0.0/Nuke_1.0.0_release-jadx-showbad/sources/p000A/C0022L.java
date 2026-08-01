package p000A;

import me.dartcv.nuke.BuildConfig;
import p041H0.AbstractC0601k;
import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p115X0.C1636k;
import p115X0.C1647v;
import p117X2.C1673r;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p178i3.InterfaceC2324e;
import p184j3.C2389h;
import p184j3.C2390i;
import p184j3.C2391j;
import p184j3.C2392k;
import p216p.C2868y;
import p232s.C3157d;
import p232s.C3158e;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3163j;
import p232s.C3164k;
import p232s.C3165l;
import p232s.InterfaceC3161h;

/* JADX INFO: renamed from: A.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0022L implements InterfaceC2324e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f115d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f116e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f117f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f118g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f119h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0022L(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f115d = i5;
        this.f116e = obj;
        this.f117f = obj2;
        this.f118g = obj3;
        this.f119h = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        C2390i c2390i;
        C0022L c0022l;
        switch (this.f115d) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0920W c0920w = (C0920W) this.f118g;
                C0078o0 c0078o0 = (C0078o0) this.f116e;
                if (zBooleanValue && c0078o0.m121b()) {
                    AbstractC0070k0.m90q((C1647v) this.f117f, c0078o0, c0920w.m1939n(), (C1636k) this.f119h, c0920w.f2866b);
                } else {
                    AbstractC0070k0.m84k(c0078o0);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (interfaceC1046d instanceof C2390i) {
                    c2390i = (C2390i) interfaceC1046d;
                    int i5 = c2390i.f7748k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2390i.f7748k = i5 - Integer.MIN_VALUE;
                    } else {
                        c2390i = new C2390i(this, interfaceC1046d);
                    }
                }
                Object obj2 = c2390i.f7746i;
                int i6 = c2390i.f7748k;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj2);
                    InterfaceC2115S interfaceC2115S = (InterfaceC2115S) ((C1675t) this.f116e).f5710e;
                    if (interfaceC2115S != null) {
                        interfaceC2115S.mo3905c(new C2392k("Child of the scoped flow was cancelled", 0));
                        c2390i.f7744g = this;
                        c2390i.f7745h = obj;
                        c2390i.f7748k = 1;
                        Object objMo3908t = interfaceC2115S.mo3908t(c2390i);
                        EnumC1152a enumC1152a = EnumC1152a.f3788d;
                        if (objMo3908t == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                    c0022l = this;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2390i.f7745h;
                    c0022l = c2390i.f7744g;
                    AbstractC1784a.m3205S(obj2);
                }
                ((C1675t) c0022l.f116e).f5710e = AbstractC2162v.m3994p((InterfaceC2160t) c0022l.f117f, null, new C2389h((C2391j) c0022l.f118g, (InterfaceC2324e) c0022l.f119h, obj, null), 1);
                return C0891q.f2780a;
            default:
                InterfaceC3161h interfaceC3161h = (InterfaceC3161h) obj;
                C1673r c1673r = (C1673r) this.f118g;
                C1673r c1673r2 = (C1673r) this.f117f;
                C1673r c1673r3 = (C1673r) this.f116e;
                boolean z5 = true;
                if (interfaceC3161h instanceof C3164k) {
                    c1673r3.f5707d++;
                } else if ((interfaceC3161h instanceof C3165l) || (interfaceC3161h instanceof C3163j)) {
                    c1673r3.f5707d--;
                } else if (interfaceC3161h instanceof C3159f) {
                    c1673r2.f5707d++;
                } else if (interfaceC3161h instanceof C3160g) {
                    c1673r2.f5707d--;
                } else if (interfaceC3161h instanceof C3157d) {
                    c1673r.f5707d++;
                } else if (interfaceC3161h instanceof C3158e) {
                    c1673r.f5707d--;
                }
                int i7 = c1673r3.f5707d;
                boolean z6 = false;
                boolean z7 = i7 > 0;
                boolean z8 = c1673r2.f5707d > 0;
                boolean z9 = c1673r.f5707d > 0;
                C2868y c2868y = (C2868y) this.f119h;
                if (c2868y.f9057s != z7) {
                    c2868y.f9057s = z7;
                    z6 = true;
                }
                if (c2868y.f9058t != z8) {
                    c2868y.f9058t = z8;
                    z6 = true;
                }
                if (c2868y.f9059u != z9) {
                    c2868y.f9059u = z9;
                } else {
                    z5 = z6;
                }
                if (z5) {
                    AbstractC0601k.m1034j(c2868y);
                }
                return C0891q.f2780a;
        }
    }
}
