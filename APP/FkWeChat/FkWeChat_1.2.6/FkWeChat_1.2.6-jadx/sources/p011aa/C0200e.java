package p011aa;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2706r0;
import java.util.List;
import java.util.Map;
import p172l8.C4711r;
import p200nb.C5554s;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;
import p273s9.C7230o0;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: aa.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0200e extends C7230o0 implements InterfaceC0196a {

    /* JADX INFO: renamed from: W */
    public static final InterfaceC5983a.a f520W = new a();

    /* JADX INFO: renamed from: X */
    public static final InterfaceC5983a.a f521X = new b();

    /* JADX INFO: renamed from: U */
    public c f522U;

    /* JADX INFO: renamed from: V */
    public final boolean f523V;

    /* JADX INFO: renamed from: aa.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC5983a.a {
    }

    /* JADX INFO: renamed from: aa.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements InterfaceC5983a.a {
    }

    /* JADX INFO: renamed from: aa.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: q */
        public final boolean f529q;

        /* JADX INFO: renamed from: r */
        public final boolean f530r;

        c(boolean z10, boolean z11) {
            this.f529q = z10;
            this.f530r = z11;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m431a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* JADX INFO: renamed from: c */
        public static c m432c(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                m431a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200e(InterfaceC6019m interfaceC6019m, InterfaceC6000f1 interfaceC6000f1, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1, boolean z10) {
        super(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f, aVar, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m425N(0);
        }
        if (interfaceC6333h == null) {
            m425N(1);
        }
        if (c5695f == null) {
            m425N(2);
        }
        if (aVar == null) {
            m425N(3);
        }
        if (interfaceC6003g1 == null) {
            m425N(4);
        }
        this.f522U = null;
        this.f523V = z10;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m425N(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case Opcodes.SIPUSH /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[0] = "visibility";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.LDC /* 18 */:
            case Opcodes.ILOAD /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "initialize";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.LDC /* 18 */:
            case Opcodes.ILOAD /* 21 */:
                break;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: v1 */
    public static C0200e m426v1(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1, boolean z10) {
        if (interfaceC6019m == null) {
            m425N(5);
        }
        if (interfaceC6333h == null) {
            m425N(6);
        }
        if (c5695f == null) {
            m425N(7);
        }
        if (interfaceC6003g1 == null) {
            m425N(8);
        }
        return new C0200e(interfaceC6019m, null, interfaceC6333h, c5695f, InterfaceC5986b.a.DECLARATION, interfaceC6003g1, z10);
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return this.f522U.f530r;
    }

    @Override // p273s9.AbstractC7237s
    /* JADX INFO: renamed from: W0 */
    public boolean mo420W0() {
        return this.f522U.f529q;
    }

    @Override // p273s9.C7230o0
    /* JADX INFO: renamed from: u1 */
    public C7230o0 mo427u1(InterfaceC5988b1 interfaceC5988b1, InterfaceC5988b1 interfaceC5988b12, List list, List list2, List list3, AbstractC2706r0 abstractC2706r0, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, Map map) {
        if (list == null) {
            m425N(9);
        }
        if (list2 == null) {
            m425N(10);
        }
        if (list3 == null) {
            m425N(11);
        }
        if (abstractC6043u == null) {
            m425N(12);
        }
        C7230o0 c7230o0Mo427u1 = super.mo427u1(interfaceC5988b1, interfaceC5988b12, list, list2, list3, abstractC2706r0, enumC5996e0, abstractC6043u, map);
        m28608l1(C5554s.f17347a.m22564a(c7230o0Mo427u1).m22572a());
        if (c7230o0Mo427u1 == null) {
            m425N(13);
        }
        return c7230o0Mo427u1;
    }

    @Override // p273s9.C7230o0, p273s9.AbstractC7237s
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C0200e mo423u1(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m425N(14);
        }
        if (aVar == null) {
            m425N(15);
        }
        if (interfaceC6333h == null) {
            m425N(16);
        }
        if (interfaceC6003g1 == null) {
            m425N(17);
        }
        InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) interfaceC6056z;
        if (c5695f == null) {
            c5695f = getName();
        }
        C0200e c0200e = new C0200e(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f, aVar, interfaceC6003g1, this.f523V);
        c0200e.m430y1(mo420W0(), mo418L());
        return c0200e;
    }

    @Override // p011aa.InterfaceC0196a
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C0200e mo413f0(AbstractC2706r0 abstractC2706r0, List list, AbstractC2706r0 abstractC2706r02, C4711r c4711r) {
        if (list == null) {
            m425N(19);
        }
        if (abstractC2706r02 == null) {
            m425N(20);
        }
        C0200e c0200e = (C0200e) mo12638y().mo12640b(AbstractC0203h.m440a(list, mo12680m(), this)).mo12649k(abstractC2706r02).mo12651m(abstractC2706r0 == null ? null : AbstractC7258h.m28725i(this, abstractC2706r0, InterfaceC6333h.f19873o.m25003b())).mo12639a().mo12643e().build();
        if (c4711r != null) {
            c0200e.m28600a1((InterfaceC5983a.a) c4711r.m18795e(), c4711r.m18796f());
        }
        if (c0200e == null) {
            m425N(21);
        }
        return c0200e;
    }

    /* JADX INFO: renamed from: y1 */
    public void m430y1(boolean z10, boolean z11) {
        this.f522U = c.m432c(z10, z11);
    }
}
