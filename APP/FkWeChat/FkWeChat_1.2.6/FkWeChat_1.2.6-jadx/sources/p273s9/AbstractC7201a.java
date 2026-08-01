package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2650c1;
import gb.AbstractC2655d2;
import gb.AbstractC2675i2;
import gb.C2663f2;
import gb.C2715u0;
import java.util.Collections;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p112hb.AbstractC2949h;
import p213oa.C5695f;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6025o;
import p327wa.AbstractC9211e;
import sa.AbstractC7259i;
import za.C9909g;
import za.C9922t;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7201a extends AbstractC7250z {

    /* JADX INFO: renamed from: r */
    public final C5695f f23880r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2407i f23881s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2407i f23882t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC2407i f23883u;

    /* JADX INFO: renamed from: s9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC0173a {

        /* JADX INFO: renamed from: s9.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class C10211a implements InterfaceC0184l {
            public C10211a() {
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC2650c1 mo27m(AbstractC2949h abstractC2949h) {
                InterfaceC6004h interfaceC6004hMo10850f = abstractC2949h.mo10850f(AbstractC7201a.this);
                return interfaceC6004hMo10850f == null ? (AbstractC2650c1) AbstractC7201a.this.f23881s.invoke() : interfaceC6004hMo10850f instanceof InterfaceC6015k1 ? C2715u0.m9623c((InterfaceC6015k1) interfaceC6004hMo10850f, AbstractC2675i2.m9459g(interfaceC6004hMo10850f.mo5591o().mo5600d())) : interfaceC6004hMo10850f instanceof AbstractC7250z ? AbstractC2675i2.m9473u(interfaceC6004hMo10850f.mo5591o().mo9545a(abstractC2949h), ((AbstractC7250z) interfaceC6004hMo10850f).mo5570E0(abstractC2949h), this) : interfaceC6004hMo10850f.mo7508x();
            }
        }

        public a() {
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2650c1 invoke() {
            AbstractC7201a abstractC7201a = AbstractC7201a.this;
            return AbstractC2675i2.m9474v(abstractC7201a, abstractC7201a.mo5571H0(), new C10211a());
        }
    }

    /* JADX INFO: renamed from: s9.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements InterfaceC0173a {
        public b() {
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC9913k invoke() {
            return new C9909g(AbstractC7201a.this.mo5571H0());
        }
    }

    /* JADX INFO: renamed from: s9.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements InterfaceC0173a {
        public c() {
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5988b1 invoke() {
            return new C7239t(AbstractC7201a.this);
        }
    }

    public AbstractC7201a(InterfaceC2412n interfaceC2412n, C5695f c5695f) {
        if (interfaceC2412n == null) {
            m28442J0(0);
        }
        if (c5695f == null) {
            m28442J0(1);
        }
        this.f23880r = c5695f;
        this.f23881s = interfaceC2412n.mo8663f(new a());
        this.f23882t = interfaceC2412n.mo8663f(new b());
        this.f23883u = interfaceC2412n.mo8663f(new c());
    }

    /* JADX INFO: renamed from: J0 */
    private static /* synthetic */ void m28442J0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case Opcodes.FCONST_2 /* 13 */:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case Opcodes.LDC /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case Opcodes.LDC /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: C0 */
    public InterfaceC9913k mo5567C0() {
        InterfaceC9913k interfaceC9913k = (InterfaceC9913k) this.f23882t.invoke();
        if (interfaceC9913k == null) {
            m28442J0(4);
        }
        return interfaceC9913k;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: H0 */
    public InterfaceC9913k mo5571H0() {
        InterfaceC9913k interfaceC9913kMo5570E0 = mo5570E0(AbstractC9211e.m35863r(AbstractC7259i.m28754g(this)));
        if (interfaceC9913kMo5570E0 == null) {
            m28442J0(17);
        }
        return interfaceC9913kMo5570E0;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: K0 */
    public List mo7442K0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28442J0(6);
        }
        return list;
    }

    @Override // p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: L0 */
    public InterfaceC5995e mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28442J0(18);
        }
        return c2663f2.m9390k() ? this : new C7249y(this, c2663f2);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo24040k(this, obj);
    }

    @Override // p273s9.AbstractC7250z
    /* JADX INFO: renamed from: N */
    public InterfaceC9913k mo12632N(AbstractC2655d2 abstractC2655d2, AbstractC2949h abstractC2949h) {
        if (abstractC2655d2 == null) {
            m28442J0(10);
        }
        if (abstractC2949h == null) {
            m28442J0(11);
        }
        if (!abstractC2655d2.mo7022f()) {
            return new C9922t(mo5570E0(abstractC2949h), C2663f2.m9384g(abstractC2655d2));
        }
        InterfaceC9913k interfaceC9913kMo5570E0 = mo5570E0(abstractC2949h);
        if (interfaceC9913kMo5570E0 == null) {
            m28442J0(12);
        }
        return interfaceC9913kMo5570E0;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: O0 */
    public InterfaceC9913k mo23998O0(AbstractC2655d2 abstractC2655d2) {
        if (abstractC2655d2 == null) {
            m28442J0(15);
        }
        InterfaceC9913k interfaceC9913kMo12632N = mo12632N(abstractC2655d2, AbstractC9211e.m35863r(AbstractC7259i.m28754g(this)));
        if (interfaceC9913kMo12632N == null) {
            m28442J0(16);
        }
        return interfaceC9913kMo12632N;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: P0 */
    public InterfaceC5988b1 mo23999P0() {
        InterfaceC5988b1 interfaceC5988b1 = (InterfaceC5988b1) this.f23883u.invoke();
        if (interfaceC5988b1 == null) {
            m28442J0(5);
        }
        return interfaceC5988b1;
    }

    @Override // p229p9.InterfaceC6011j0
    public C5695f getName() {
        C5695f c5695f = this.f23880r;
        if (c5695f == null) {
            m28442J0(2);
        }
        return c5695f;
    }

    @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: x */
    public AbstractC2650c1 mo7508x() {
        AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) this.f23881s.invoke();
        if (abstractC2650c1 == null) {
            m28442J0(20);
        }
        return abstractC2650c1;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC5995e mo12664a() {
        return this;
    }
}
