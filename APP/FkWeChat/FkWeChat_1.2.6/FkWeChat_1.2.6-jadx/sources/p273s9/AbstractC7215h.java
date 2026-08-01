package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2650c1;
import gb.AbstractC2699p;
import gb.AbstractC2706r0;
import gb.C2704q1;
import gb.C2715u0;
import gb.EnumC2691m2;
import gb.InterfaceC2716u1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p010a9.InterfaceC0173a;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6012j1;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p243q9.InterfaceC6333h;
import p327wa.AbstractC9211e;
import sa.C7257g;
import za.C9911i;
import za.C9926x;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7215h extends AbstractC7227n implements InterfaceC6018l1 {

    /* JADX INFO: renamed from: u */
    public final EnumC2691m2 f23922u;

    /* JADX INFO: renamed from: v */
    public final boolean f23923v;

    /* JADX INFO: renamed from: w */
    public final int f23924w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC2407i f23925x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2407i f23926y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC2412n f23927z;

    /* JADX INFO: renamed from: s9.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC0173a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2412n f23928q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC6012j1 f23929r;

        public a(InterfaceC2412n interfaceC2412n, InterfaceC6012j1 interfaceC6012j1) {
            this.f23928q = interfaceC2412n;
            this.f23929r = interfaceC6012j1;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2716u1 invoke() {
            return new c(AbstractC7215h.this, this.f23928q, this.f23929r);
        }
    }

    /* JADX INFO: renamed from: s9.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements InterfaceC0173a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C5695f f23931q;

        /* JADX INFO: renamed from: s9.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a implements InterfaceC0173a {
            public a() {
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC9913k invoke() {
                return C9926x.m38481m("Scope for type parameter " + b.this.f23931q.m23030c(), AbstractC7215h.this.getUpperBounds());
            }
        }

        public b(C5695f c5695f) {
            this.f23931q = c5695f;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2650c1 invoke() {
            return C2715u0.m9633o(C2704q1.f7069r.m9585k(), AbstractC7215h.this.mo5591o(), Collections.EMPTY_LIST, false, new C9911i(new a()));
        }
    }

    /* JADX INFO: renamed from: s9.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c extends AbstractC2699p {

        /* JADX INFO: renamed from: d */
        public final InterfaceC6012j1 f23934d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC7215h f23935e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC7215h abstractC7215h, InterfaceC2412n interfaceC2412n, InterfaceC6012j1 interfaceC6012j1) {
            super(interfaceC2412n);
            if (interfaceC2412n == null) {
                m28493I(0);
            }
            this.f23935e = abstractC7215h;
            this.f23934d = interfaceC6012j1;
        }

        /* JADX INFO: renamed from: I */
        public static /* synthetic */ void m28493I(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // gb.AbstractC2699p
        /* JADX INFO: renamed from: A */
        public void mo9544A(AbstractC2706r0 abstractC2706r0) {
            if (abstractC2706r0 == null) {
                m28493I(6);
            }
            this.f23935e.mo5495Q0(abstractC2706r0);
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: d */
        public List mo5600d() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                m28493I(2);
            }
            return list;
        }

        @Override // gb.AbstractC2717v
        /* JADX INFO: renamed from: f */
        public boolean mo9338f(InterfaceC6004h interfaceC6004h) {
            if (interfaceC6004h == null) {
                m28493I(9);
            }
            return (interfaceC6004h instanceof InterfaceC6018l1) && C7257g.f24129a.m28713m(this.f23935e, (InterfaceC6018l1) interfaceC6004h, true);
        }

        @Override // gb.AbstractC2699p
        /* JADX INFO: renamed from: p */
        public Collection mo5601p() {
            List listMo5496R0 = this.f23935e.mo5496R0();
            if (listMo5496R0 == null) {
                m28493I(1);
            }
            return listMo5496R0;
        }

        @Override // gb.AbstractC2699p
        /* JADX INFO: renamed from: q */
        public AbstractC2706r0 mo9339q() {
            return C3381l.m12703d(EnumC3380k.f9261K, new String[0]);
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: t */
        public AbstractC5128i mo9341t() {
            AbstractC5128i abstractC5128iM35858m = AbstractC9211e.m35858m(this.f23935e);
            if (abstractC5128iM35858m == null) {
                m28493I(4);
            }
            return abstractC5128iM35858m;
        }

        public String toString() {
            return this.f23935e.getName().toString();
        }

        @Override // gb.AbstractC2717v, gb.InterfaceC2716u1
        /* JADX INFO: renamed from: u */
        public InterfaceC6004h mo5602u() {
            AbstractC7215h abstractC7215h = this.f23935e;
            if (abstractC7215h == null) {
                m28493I(3);
            }
            return abstractC7215h;
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: v */
        public boolean mo5603v() {
            return true;
        }

        @Override // gb.AbstractC2699p
        /* JADX INFO: renamed from: w */
        public InterfaceC6012j1 mo5604w() {
            InterfaceC6012j1 interfaceC6012j1 = this.f23934d;
            if (interfaceC6012j1 == null) {
                m28493I(5);
            }
            return interfaceC6012j1;
        }

        @Override // gb.AbstractC2699p
        /* JADX INFO: renamed from: y */
        public List mo9550y(List list) {
            if (list == null) {
                m28493I(7);
            }
            List listMo5494L0 = this.f23935e.mo5494L0(list);
            if (listMo5494L0 == null) {
                m28493I(8);
            }
            return listMo5494L0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7215h(InterfaceC2412n interfaceC2412n, InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, EnumC2691m2 enumC2691m2, boolean z10, int i10, InterfaceC6003g1 interfaceC6003g1, InterfaceC6012j1 interfaceC6012j1) {
        super(interfaceC6019m, interfaceC6333h, c5695f, interfaceC6003g1);
        if (interfaceC2412n == null) {
            m28489N(0);
        }
        if (interfaceC6019m == null) {
            m28489N(1);
        }
        if (interfaceC6333h == null) {
            m28489N(2);
        }
        if (c5695f == null) {
            m28489N(3);
        }
        if (enumC2691m2 == null) {
            m28489N(4);
        }
        if (interfaceC6003g1 == null) {
            m28489N(5);
        }
        if (interfaceC6012j1 == null) {
            m28489N(6);
        }
        this.f23922u = enumC2691m2;
        this.f23923v = z10;
        this.f23924w = i10;
        this.f23925x = interfaceC2412n.mo8663f(new a(interfaceC2412n, interfaceC6012j1));
        this.f23926y = interfaceC2412n.mo8663f(new b(c5695f));
        this.f23927z = interfaceC2412n;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28489N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
                i11 = 2;
                break;
            case Opcodes.FCONST_1 /* 12 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[1] = "getOriginal";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
                throw new IllegalStateException(str2);
            case Opcodes.FCONST_1 /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: K */
    public boolean mo23993K() {
        return this.f23923v;
    }

    /* JADX INFO: renamed from: L0 */
    public List mo5494L0(List list) {
        if (list == null) {
            m28489N(12);
        }
        if (list == null) {
            m28489N(13);
        }
        return list;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo24037h(this, obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo5495Q0(AbstractC2706r0 abstractC2706r0);

    /* JADX INFO: renamed from: R0 */
    public abstract List mo5496R0();

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC6018l1 mo12664a() {
        InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) super.mo12664a();
        if (interfaceC6018l1 == null) {
            m28489N(11);
        }
        return interfaceC6018l1;
    }

    @Override // p229p9.InterfaceC6018l1
    public int getIndex() {
        return this.f23924w;
    }

    @Override // p229p9.InterfaceC6018l1
    public List getUpperBounds() {
        List listMo9546n = ((c) mo5591o()).mo9546n();
        if (listMo9546n == null) {
            m28489N(8);
        }
        return listMo9546n;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: m0 */
    public InterfaceC2412n mo23994m0() {
        InterfaceC2412n interfaceC2412n = this.f23927z;
        if (interfaceC2412n == null) {
            m28489N(14);
        }
        return interfaceC2412n;
    }

    @Override // p229p9.InterfaceC6018l1, p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: o */
    public final InterfaceC2716u1 mo5591o() {
        InterfaceC2716u1 interfaceC2716u1 = (InterfaceC2716u1) this.f23925x.invoke();
        if (interfaceC2716u1 == null) {
            m28489N(9);
        }
        return interfaceC2716u1;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: s */
    public EnumC2691m2 mo23995s() {
        EnumC2691m2 enumC2691m2 = this.f23922u;
        if (enumC2691m2 == null) {
            m28489N(7);
        }
        return enumC2691m2;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: s0 */
    public boolean mo23996s0() {
        return false;
    }

    @Override // p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: x */
    public AbstractC2650c1 mo7508x() {
        AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) this.f23926y.invoke();
        if (abstractC2650c1 == null) {
            m28489N(10);
        }
        return abstractC2650c1;
    }
}
