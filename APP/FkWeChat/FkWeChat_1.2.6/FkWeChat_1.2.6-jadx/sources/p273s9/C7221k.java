package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.C2714u;
import gb.InterfaceC2716u1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p082fb.InterfaceC2412n;
import p112hb.AbstractC2949h;
import p213oa.C5695f;
import p229p9.AbstractC6033q1;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7221k extends AbstractC7219j {

    /* JADX INFO: renamed from: A */
    public final InterfaceC2716u1 f23954A;

    /* JADX INFO: renamed from: B */
    public InterfaceC9913k f23955B;

    /* JADX INFO: renamed from: C */
    public Set f23956C;

    /* JADX INFO: renamed from: D */
    public InterfaceC5992d f23957D;

    /* JADX INFO: renamed from: y */
    public final EnumC5996e0 f23958y;

    /* JADX INFO: renamed from: z */
    public final EnumC5998f f23959z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7221k(InterfaceC6019m interfaceC6019m, C5695f c5695f, EnumC5996e0 enumC5996e0, EnumC5998f enumC5998f, Collection collection, InterfaceC6003g1 interfaceC6003g1, boolean z10, InterfaceC2412n interfaceC2412n) {
        super(interfaceC2412n, interfaceC6019m, c5695f, interfaceC6003g1, z10);
        if (interfaceC6019m == null) {
            m28511J0(0);
        }
        if (c5695f == null) {
            m28511J0(1);
        }
        if (enumC5996e0 == null) {
            m28511J0(2);
        }
        if (enumC5998f == null) {
            m28511J0(3);
        }
        if (collection == null) {
            m28511J0(4);
        }
        if (interfaceC6003g1 == null) {
            m28511J0(5);
        }
        if (interfaceC2412n == null) {
            m28511J0(6);
        }
        this.f23958y = enumC5996e0;
        this.f23959z = enumC5998f;
        this.f23954A = new C2714u(this, Collections.EMPTY_LIST, collection, interfaceC2412n);
    }

    /* JADX INFO: renamed from: J0 */
    private static /* synthetic */ void m28511J0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[1] = "getConstructors";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case Opcodes.SIPUSH /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case Opcodes.LDC /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
                throw new IllegalStateException(str2);
            case Opcodes.FCONST_1 /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: D */
    public boolean mo5568D() {
        return false;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: D0 */
    public AbstractC6033q1 mo5569D0() {
        return null;
    }

    @Override // p273s9.AbstractC7250z
    /* JADX INFO: renamed from: E0 */
    public InterfaceC9913k mo5570E0(AbstractC2949h abstractC2949h) {
        if (abstractC2949h == null) {
            m28511J0(12);
        }
        InterfaceC9913k interfaceC9913k = this.f23955B;
        if (interfaceC9913k == null) {
            m28511J0(13);
        }
        return interfaceC9913k;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: I */
    public boolean mo5572I() {
        return false;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: I0 */
    public boolean mo5573I0() {
        return false;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: N0 */
    public boolean mo5574N0() {
        return false;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: P */
    public Collection mo5575P() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28511J0(19);
        }
        return list;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m28512Q0(InterfaceC9913k interfaceC9913k, Set set, InterfaceC5992d interfaceC5992d) {
        if (interfaceC9913k == null) {
            m28511J0(7);
        }
        if (set == null) {
            m28511J0(8);
        }
        this.f23955B = interfaceC9913k;
        this.f23956C = set;
        this.f23957D = interfaceC5992d;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: R */
    public boolean mo5576R() {
        return false;
    }

    @Override // p229p9.InterfaceC6007i
    /* JADX INFO: renamed from: S */
    public boolean mo5577S() {
        return false;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: V */
    public InterfaceC5992d mo5578V() {
        return this.f23957D;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: W */
    public InterfaceC9913k mo5580W() {
        InterfaceC9913k.b bVar = InterfaceC9913k.b.f33436b;
        if (bVar == null) {
            m28511J0(14);
        }
        return bVar;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: Y */
    public InterfaceC5995e mo5582Y() {
        return null;
    }

    @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC5993d0, p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = AbstractC6040t.f18986e;
        if (abstractC6043u == null) {
            m28511J0(17);
        }
        return abstractC6043u;
    }

    @Override // p243q9.InterfaceC6326a
    public InterfaceC6333h getAnnotations() {
        InterfaceC6333h interfaceC6333hM25003b = InterfaceC6333h.f19873o.m25003b();
        if (interfaceC6333hM25003b == null) {
            m28511J0(9);
        }
        return interfaceC6333hM25003b;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: j */
    public EnumC5998f mo5588j() {
        EnumC5998f enumC5998f = this.f23959z;
        if (enumC5998f == null) {
            m28511J0(15);
        }
        return enumC5998f;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: k */
    public boolean mo5589k() {
        return false;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: l */
    public Collection mo5590l() {
        Set set = this.f23956C;
        if (set == null) {
            m28511J0(11);
        }
        return set;
    }

    @Override // p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: o */
    public InterfaceC2716u1 mo5591o() {
        InterfaceC2716u1 interfaceC2716u1 = this.f23954A;
        if (interfaceC2716u1 == null) {
            m28511J0(10);
        }
        return interfaceC2716u1;
    }

    @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: p */
    public EnumC5996e0 mo5592p() {
        EnumC5996e0 enumC5996e0 = this.f23958y;
        if (enumC5996e0 == null) {
            m28511J0(16);
        }
        return enumC5996e0;
    }

    @Override // p229p9.InterfaceC5995e
    /* JADX INFO: renamed from: r */
    public boolean mo5593r() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC6007i
    /* JADX INFO: renamed from: z */
    public List mo5594z() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28511J0(18);
        }
        return list;
    }
}
