package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.C2663f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7220j0 extends AbstractC7227n implements InterfaceC6053x0 {

    /* JADX INFO: renamed from: A */
    public AbstractC6043u f23946A;

    /* JADX INFO: renamed from: B */
    public InterfaceC6056z f23947B;

    /* JADX INFO: renamed from: u */
    public boolean f23948u;

    /* JADX INFO: renamed from: v */
    public final boolean f23949v;

    /* JADX INFO: renamed from: w */
    public final EnumC5996e0 f23950w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC6055y0 f23951x;

    /* JADX INFO: renamed from: y */
    public final boolean f23952y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC5986b.a f23953z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7220j0(EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC6055y0 interfaceC6055y0, InterfaceC6333h interfaceC6333h, C5695f c5695f, boolean z10, boolean z11, boolean z12, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6055y0.mo7443b(), interfaceC6333h, c5695f, interfaceC6003g1);
        if (enumC5996e0 == null) {
            m28505N(0);
        }
        if (abstractC6043u == null) {
            m28505N(1);
        }
        if (interfaceC6055y0 == null) {
            m28505N(2);
        }
        if (interfaceC6333h == null) {
            m28505N(3);
        }
        if (c5695f == null) {
            m28505N(4);
        }
        if (interfaceC6003g1 == null) {
            m28505N(5);
        }
        this.f23947B = null;
        this.f23950w = enumC5996e0;
        this.f23946A = abstractC6043u;
        this.f23951x = interfaceC6055y0;
        this.f23948u = z10;
        this.f23949v = z11;
        this.f23952y = z12;
        this.f23953z = aVar;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28505N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[1] = "getVisibility";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[1] = "getCorrespondingProperty";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: A */
    public boolean mo24117A() {
        return false;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: A0 */
    public boolean mo24118A0() {
        return false;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: B0 */
    public void mo12635B0(Collection collection) {
        if (collection == null) {
            m28505N(16);
        }
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        return this.f23949v;
    }

    @Override // p229p9.InterfaceC6053x0
    /* JADX INFO: renamed from: F0 */
    public InterfaceC6055y0 mo24109F0() {
        InterfaceC6055y0 interfaceC6055y0 = this.f23951x;
        if (interfaceC6055y0 == null) {
            m28505N(13);
        }
        return interfaceC6055y0;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: G0 */
    public boolean mo24119G0() {
        return false;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: I0 */
    public boolean mo5573I0() {
        return false;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return false;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6053x0 mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: Q */
    public Object mo436Q(InterfaceC5983a.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public Collection m28507Q0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC6055y0 interfaceC6055y0 : mo24109F0().mo12674e()) {
            InterfaceC6056z interfaceC6056zMo12676h = z10 ? interfaceC6055y0.mo12676h() : interfaceC6055y0.mo12677i();
            if (interfaceC6056zMo12676h != null) {
                arrayList.add(interfaceC6056zMo12676h);
            }
        }
        return arrayList;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: R */
    public boolean mo5576R() {
        return false;
    }

    /* JADX INFO: renamed from: R0 */
    public void m28508R0(boolean z10) {
        this.f23948u = z10;
    }

    /* JADX INFO: renamed from: S0 */
    public void m28509S0(InterfaceC6056z interfaceC6056z) {
        this.f23947B = interfaceC6056z;
    }

    /* JADX INFO: renamed from: T0 */
    public void m28510T0(AbstractC6043u abstractC6043u) {
        this.f23946A = abstractC6043u;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: U */
    public boolean mo7418U() {
        return false;
    }

    @Override // p229p9.InterfaceC6053x0
    /* JADX INFO: renamed from: Z */
    public boolean mo24110Z() {
        return this.f23948u;
    }

    @Override // p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: c */
    public InterfaceC6056z mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28505N(7);
        }
        return this;
    }

    @Override // p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = this.f23946A;
        if (abstractC6043u == null) {
            m28505N(11);
        }
        return abstractC6043u;
    }

    @Override // p229p9.InterfaceC5983a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28505N(9);
        }
        return list;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: j */
    public InterfaceC5986b.a mo12678j() {
        InterfaceC5986b.a aVar = this.f23953z;
        if (aVar == null) {
            m28505N(6);
        }
        return aVar;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: j0 */
    public InterfaceC6056z mo24120j0() {
        return this.f23947B;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: k */
    public boolean mo7422k() {
        return this.f23952y;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: k0 */
    public InterfaceC5988b1 mo12679k0() {
        return mo24109F0().mo12679k0();
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: n */
    public boolean mo7423n() {
        return false;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: p */
    public EnumC5996e0 mo5592p() {
        EnumC5996e0 enumC5996e0 = this.f23950w;
        if (enumC5996e0 == null) {
            m28505N(10);
        }
        return enumC5996e0;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: q0 */
    public InterfaceC5988b1 mo12682q0() {
        return mo24109F0().mo12682q0();
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: u */
    public boolean mo24121u() {
        return false;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: v0 */
    public List mo12685v0() {
        List listMo12685v0 = mo24109F0().mo12685v0();
        if (listMo12685v0 == null) {
            m28505N(14);
        }
        return listMo12685v0;
    }
}
