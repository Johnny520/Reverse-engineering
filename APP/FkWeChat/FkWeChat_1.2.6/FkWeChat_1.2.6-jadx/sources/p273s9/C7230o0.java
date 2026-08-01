package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2706r0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7230o0 extends AbstractC7237s implements InterfaceC6000f1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7230o0(InterfaceC6019m interfaceC6019m, InterfaceC6000f1 interfaceC6000f1, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f, aVar, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m28567N(0);
        }
        if (interfaceC6333h == null) {
            m28567N(1);
        }
        if (c5695f == null) {
            m28567N(2);
        }
        if (aVar == null) {
            m28567N(3);
        }
        if (interfaceC6003g1 == null) {
            m28567N(4);
        }
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28567N(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case Opcodes.FCONST_0 /* 11 */:
            case 16:
            case Opcodes.ILOAD /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LLOAD /* 22 */:
                objArr[0] = "visibility";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.LDC /* 18 */:
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case Opcodes.DCONST_0 /* 14 */:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case Opcodes.ALOAD /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.LLOAD /* 22 */:
                objArr[2] = "initialize";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.LDC /* 18 */:
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case 29:
            case 30:
                break;
            case Opcodes.ALOAD /* 25 */:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: r1 */
    public static C7230o0 m28568r1(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m28567N(5);
        }
        if (interfaceC6333h == null) {
            m28567N(6);
        }
        if (c5695f == null) {
            m28567N(7);
        }
        if (aVar == null) {
            m28567N(8);
        }
        if (interfaceC6003g1 == null) {
            m28567N(9);
        }
        return new C7230o0(interfaceC6019m, null, interfaceC6333h, c5695f, aVar, interfaceC6003g1);
    }

    @Override // p273s9.AbstractC7237s
    /* JADX INFO: renamed from: R0 */
    public AbstractC7237s mo423u1(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m28567N(25);
        }
        if (aVar == null) {
            m28567N(26);
        }
        if (interfaceC6333h == null) {
            m28567N(27);
        }
        if (interfaceC6003g1 == null) {
            m28567N(28);
        }
        InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) interfaceC6056z;
        if (c5695f == null) {
            c5695f = getName();
        }
        return new C7230o0(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f, aVar, interfaceC6003g1);
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: q1 */
    public InterfaceC6000f1 mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) super.m28596Q0(interfaceC6019m, enumC5996e0, abstractC6043u, aVar, z10);
        if (interfaceC6000f1 == null) {
            m28567N(29);
        }
        return interfaceC6000f1;
    }

    @Override // p273s9.AbstractC7237s, p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public InterfaceC6000f1 mo12664a() {
        InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) super.mo12664a();
        if (interfaceC6000f1 == null) {
            m28567N(24);
        }
        return interfaceC6000f1;
    }

    @Override // p273s9.AbstractC7237s
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C7230o0 mo28569X0(InterfaceC5988b1 interfaceC5988b1, InterfaceC5988b1 interfaceC5988b12, List list, List list2, List list3, AbstractC2706r0 abstractC2706r0, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u) {
        if (list == null) {
            m28567N(14);
        }
        if (list2 == null) {
            m28567N(15);
        }
        if (list3 == null) {
            m28567N(16);
        }
        if (abstractC6043u == null) {
            m28567N(17);
        }
        C7230o0 c7230o0Mo427u1 = mo427u1(interfaceC5988b1, interfaceC5988b12, list, list2, list3, abstractC2706r0, enumC5996e0, abstractC6043u, null);
        if (c7230o0Mo427u1 == null) {
            m28567N(18);
        }
        return c7230o0Mo427u1;
    }

    /* JADX INFO: renamed from: u1 */
    public C7230o0 mo427u1(InterfaceC5988b1 interfaceC5988b1, InterfaceC5988b1 interfaceC5988b12, List list, List list2, List list3, AbstractC2706r0 abstractC2706r0, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, Map map) {
        if (list == null) {
            m28567N(19);
        }
        if (list2 == null) {
            m28567N(20);
        }
        if (list3 == null) {
            m28567N(21);
        }
        if (abstractC6043u == null) {
            m28567N(22);
        }
        super.mo28569X0(interfaceC5988b1, interfaceC5988b12, list, list2, list3, abstractC2706r0, enumC5996e0, abstractC6043u);
        if (map != null && !map.isEmpty()) {
            this.f24044T = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC6056z, p229p9.InterfaceC6000f1
    /* JADX INFO: renamed from: y */
    public InterfaceC6056z.a mo12638y() {
        InterfaceC6056z.a aVarMo12638y = super.mo12638y();
        if (aVarMo12638y == null) {
            m28567N(30);
        }
        return aVarMo12638y;
    }
}
