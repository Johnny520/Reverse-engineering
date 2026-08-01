package p071O;

import p007B0.C0212z;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.AbstractC1385s;
import p095T.C1330O0;
import p095T.C1362g0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p158f0.AbstractC2082n;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p203n.AbstractC2649d;
import p203n.C2642Z;
import p203n.C2647c;
import p203n.InterfaceC2659i;

/* JADX INFO: renamed from: O.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1028g extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3195h = 0;

    /* JADX INFO: renamed from: i */
    public float f3196i;

    /* JADX INFO: renamed from: j */
    public int f3197j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f3198k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3199l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028g(C0212z c0212z, float f2, InterfaceC2659i interfaceC2659i, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f3198k = c0212z;
        this.f3196i = f2;
        this.f3199l = interfaceC2659i;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f3195h) {
        }
        return ((C1028g) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f3195h) {
            case 0:
                return new C1028g((C0212z) this.f3198k, this.f3196i, (InterfaceC2659i) this.f3199l, interfaceC1046d);
            default:
                C1028g c1028g = new C1028g((C2642Z) this.f3199l, interfaceC1046d);
                c1028g.f3198k = obj;
                return c1028g;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        final float fM4615h;
        InterfaceC2160t interfaceC2160t;
        switch (this.f3195h) {
            case 0:
                int i5 = this.f3197j;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2647c c2647c = (C2647c) ((C0212z) this.f3198k).f742c;
                    Float f2 = new Float(this.f3196i);
                    InterfaceC2659i interfaceC2659i = (InterfaceC2659i) this.f3199l;
                    this.f3197j = 1;
                    Object objM4604c = C2647c.m4604c(c2647c, f2, interfaceC2659i, null, this, 12);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM4604c == enumC1152a) {
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
                int i6 = this.f3197j;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2160t interfaceC2160t2 = (InterfaceC2160t) this.f3198k;
                    fM4615h = AbstractC2649d.m4615h(interfaceC2160t2.mo1202f());
                    interfaceC2160t = interfaceC2160t2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fM4615h = this.f3196i;
                    interfaceC2160t = (InterfaceC2160t) this.f3198k;
                    AbstractC1784a.m3205S(obj);
                }
                while (AbstractC2162v.m3993o(interfaceC2160t)) {
                    final C2642Z c2642z = (C2642Z) this.f3199l;
                    InterfaceC1601c interfaceC1601c = new InterfaceC1601c() { // from class: n.X
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            C2642Z c2642z2 = c2642z;
                            boolean zM4597g = c2642z2.m4597g();
                            C1362g0 c1362g0 = c2642z2.f8407g;
                            if (!zM4597g) {
                                if (((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c == Long.MIN_VALUE) {
                                    c1362g0.m2511g(jLongValue);
                                    c2642z2.f8401a.f8328a.setValue(Boolean.TRUE);
                                }
                                long jM3201O = jLongValue - ((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c;
                                float f5 = fM4615h;
                                if (f5 != 0.0f) {
                                    jM3201O = AbstractC1784a.m3201O(jM3201O / ((double) f5));
                                }
                                if (c2642z2.f8402b == null) {
                                    c2642z2.f8406f.m2511g(jM3201O);
                                }
                                c2642z2.m4598h(jM3201O, f5 == 0.0f);
                            }
                            return C0891q.f2780a;
                        }
                    };
                    this.f3198k = interfaceC2160t;
                    this.f3196i = fM4615h;
                    this.f3197j = 1;
                    InterfaceC1051i interfaceC1051i = this.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i);
                    Object objM1209a = AbstractC1385s.m2626p(interfaceC1051i).m1209a(interfaceC1601c, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM1209a == enumC1152a2) {
                        return enumC1152a2;
                    }
                }
                return C0891q.f2780a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028g(C2642Z c2642z, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f3199l = c2642z;
    }
}
