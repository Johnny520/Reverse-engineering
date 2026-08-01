package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.InterfaceC0169B;
import p056K2.C0891q;
import p058L.C0927b0;
import p074O2.InterfaceC1046d;
import p076P.C1073T;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.C1674s;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p179i4.AbstractC2352g;
import p227r.AbstractC2945D;
import p227r.C2941B;

/* JADX INFO: renamed from: A.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0037T extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f164h;

    /* JADX INFO: renamed from: i */
    public int f165i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0169B f166j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0092v0 f167k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037T(InterfaceC0169B interfaceC0169B, InterfaceC0092v0 interfaceC0092v0, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f164h = i5;
        this.f166j = interfaceC0169B;
        this.f167k = interfaceC0092v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f164h) {
        }
        return ((C0037T) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f164h) {
            case 0:
                return new C0037T(this.f166j, this.f167k, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0037T(this.f166j, this.f167k, interfaceC1046d, 1);
            default:
                return new C0037T(this.f166j, this.f167k, interfaceC1046d, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f164h;
        InterfaceC1046d interfaceC1046d = null;
        final int i6 = 0;
        final InterfaceC0092v0 interfaceC0092v0 = this.f167k;
        InterfaceC0169B interfaceC0169B = this.f166j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        C0891q c0891q = C0891q.f2780a;
        final int i7 = 1;
        switch (i5) {
            case 0:
                int i8 = this.f165i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f165i = 1;
                    Object objM3982d = AbstractC2162v.m3982d(new C0084r0(interfaceC0169B, interfaceC0092v0, null), this);
                    if (objM3982d != enumC1152a) {
                        objM3982d = c0891q;
                    }
                    if (objM3982d == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i9 = this.f165i;
                if (i9 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f165i = 1;
                    Object objM4197j = AbstractC2352g.m4197j(interfaceC0169B, new C0086s0(interfaceC0092v0, interfaceC1046d, i6), this);
                    if (objM4197j != enumC1152a) {
                        objM4197j = c0891q;
                    }
                    if (objM4197j == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return c0891q;
            default:
                int i10 = this.f165i;
                if (i10 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f165i = 1;
                    C0080p0 c0080p0 = new C0080p0(interfaceC0092v0, 0);
                    InterfaceC1599a interfaceC1599a = new InterfaceC1599a() { // from class: A.q0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1599a
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            switch (i6) {
                                case 0:
                                    interfaceC0092v0.mo129b();
                                    break;
                                default:
                                    interfaceC0092v0.onCancel();
                                    break;
                            }
                            return C0891q.f2780a;
                        }
                    };
                    InterfaceC1599a interfaceC1599a2 = new InterfaceC1599a() { // from class: A.q0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1599a
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            switch (i7) {
                                case 0:
                                    interfaceC0092v0.mo129b();
                                    break;
                                default:
                                    interfaceC0092v0.onCancel();
                                    break;
                            }
                            return C0891q.f2780a;
                        }
                    };
                    C0002B c0002b = new C0002B(1, interfaceC0092v0);
                    float f2 = AbstractC2945D.f9309a;
                    Object objM4197j2 = AbstractC2352g.m4197j(interfaceC0169B, new C2941B(new C1073T(24), new C1674s(), null, new C0011F0(c0080p0, i7), c0002b, interfaceC1599a2, new C0927b0(interfaceC1599a, 2), null), this);
                    if (objM4197j2 != enumC1152a) {
                        objM4197j2 = c0891q;
                    }
                    if (objM4197j2 != enumC1152a) {
                        objM4197j2 = c0891q;
                    }
                    if (objM4197j2 != enumC1152a) {
                        objM4197j2 = c0891q;
                    }
                    if (objM4197j2 == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return c0891q;
        }
    }
}
