package p000A;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0186T;
import p007B0.InterfaceC0169B;
import p022E.C0276b;
import p034G.C0463h;
import p041H0.AbstractC0601k;
import p043H2.C0644b;
import p046I.C0656c;
import p046I.C0657d;
import p049I2.C0793k;
import p056K2.C0891q;
import p058L.C0918U;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p154e2.C2029h;
import p160f3.AbstractC2162v;
import p179i4.AbstractC2352g;
import p216p.C2847h;

/* JADX INFO: renamed from: A.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0032Q implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f155b;

    public /* synthetic */ C0032Q(int i5, Object obj) {
        this.f154a = i5;
        this.f155b = obj;
    }

    @Override // androidx.compose.p134ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC0169B interfaceC0169B, InterfaceC1046d interfaceC1046d) {
        switch (this.f154a) {
            case 0:
                C0920W c0920w = (C0920W) this.f155b;
                C2029h c2029h = c0920w.f2890z;
                C0918U c0918u = c0920w.f2889y;
                C0186T c0186t = (C0186T) interfaceC0169B;
                c0186t.getClass();
                Object objM4197j = AbstractC2352g.m4197j(interfaceC0169B, new C0656c(new C0793k(AbstractC0601k.m1044t(c0186t).f1694E), c2029h, c0918u, null), interfaceC1046d);
                if (objM4197j != EnumC1152a.f3788d) {
                    objM4197j = C0891q.f2780a;
                }
                return objM4197j == EnumC1152a.f3788d ? objM4197j : C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                Object objM4197j2 = AbstractC2352g.m4197j(interfaceC0169B, new C0276b(new C0009E0(1, (C0463h) this.f155b, C0463h.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 1), null, 0), interfaceC1046d);
                C0891q c0891q = C0891q.f2780a;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM4197j2 != enumC1152a) {
                    objM4197j2 = c0891q;
                }
                return objM4197j2 == enumC1152a ? objM4197j2 : c0891q;
            case 2:
                Object objM285J0 = ((C0186T) interfaceC0169B).m285J0(new C0644b((InterfaceC1347Y) this.f155b, null, 0), interfaceC1046d);
                return objM285J0 == EnumC1152a.f3788d ? objM285J0 : C0891q.f2780a;
            case 3:
                Object objM4197j3 = AbstractC2352g.m4197j(interfaceC0169B, new C0656c((C0657d) this.f155b, null), interfaceC1046d);
                return objM4197j3 == EnumC1152a.f3788d ? objM4197j3 : C0891q.f2780a;
            case 4:
                Object objM285J02 = ((C0186T) interfaceC0169B).m285J0(new C0276b((InterfaceC1601c) this.f155b, null, 1), interfaceC1046d);
                return objM285J02 == EnumC1152a.f3788d ? objM285J02 : C0891q.f2780a;
            case 5:
                Object objM3982d = AbstractC2162v.m3982d(new C0084r0(interfaceC0169B, (InterfaceC0092v0) this.f155b, null), interfaceC1046d);
                C0891q c0891q2 = C0891q.f2780a;
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                if (objM3982d != enumC1152a2) {
                    objM3982d = c0891q2;
                }
                return objM3982d == enumC1152a2 ? objM3982d : c0891q2;
            default:
                Object objM4197j4 = AbstractC2352g.m4197j(interfaceC0169B, new C0644b((C2847h) this.f155b, null, 1), interfaceC1046d);
                return objM4197j4 == EnumC1152a.f3788d ? objM4197j4 : C0891q.f2780a;
        }
    }
}
