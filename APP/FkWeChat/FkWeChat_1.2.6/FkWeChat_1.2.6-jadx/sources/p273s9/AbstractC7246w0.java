package p273s9;

import gb.AbstractC2706r0;
import java.util.Collections;
import java.util.List;
import p213oa.C5695f;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6042t1;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7246w0 extends AbstractC7227n implements InterfaceC6042t1 {

    /* JADX INFO: renamed from: u */
    public AbstractC2706r0 f24101u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7246w0(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6019m, interfaceC6333h, c5695f, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m28673N(0);
        }
        if (interfaceC6333h == null) {
            m28673N(1);
        }
        if (c5695f == null) {
            m28673N(2);
        }
        if (interfaceC6003g1 == null) {
            m28673N(3);
        }
        this.f24101u = abstractC2706r0;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28673N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    public void m28674L0(AbstractC2706r0 abstractC2706r0) {
        this.f24101u = abstractC2706r0;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        AbstractC2706r0 type = getType();
        if (type == null) {
            m28673N(10);
        }
        return type;
    }

    @Override // p229p9.InterfaceC6036r1
    public AbstractC2706r0 getType() {
        AbstractC2706r0 abstractC2706r0 = this.f24101u;
        if (abstractC2706r0 == null) {
            m28673N(4);
        }
        return abstractC2706r0;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28673N(8);
        }
        return list;
    }

    /* JADX INFO: renamed from: k0 */
    public InterfaceC5988b1 mo12679k0() {
        return null;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: m */
    public List mo12680m() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28673N(6);
        }
        return list;
    }

    /* JADX INFO: renamed from: q0 */
    public InterfaceC5988b1 mo12682q0() {
        return null;
    }
}
