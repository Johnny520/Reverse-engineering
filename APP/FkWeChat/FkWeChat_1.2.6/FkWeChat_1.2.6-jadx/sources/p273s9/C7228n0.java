package p273s9;

import p012ab.InterfaceC0210g;
import p213oa.C5695f;
import p213oa.C5697h;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7228n0 extends AbstractC7205c {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6019m f24002s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0210g f24003t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7228n0(InterfaceC6019m interfaceC6019m, InterfaceC0210g interfaceC0210g, InterfaceC6333h interfaceC6333h, C5695f c5695f) {
        super(interfaceC6333h, c5695f);
        if (interfaceC6019m == null) {
            m28564N(3);
        }
        if (interfaceC0210g == null) {
            m28564N(4);
        }
        if (interfaceC6333h == null) {
            m28564N(5);
        }
        if (c5695f == null) {
            m28564N(6);
        }
        this.f24002s = interfaceC6019m;
        this.f24003t = interfaceC0210g;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28564N(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        InterfaceC6019m interfaceC6019m = this.f24002s;
        if (interfaceC6019m == null) {
            m28564N(8);
        }
        return interfaceC6019m;
    }

    @Override // p229p9.InterfaceC5988b1
    public InterfaceC0210g getValue() {
        InterfaceC0210g interfaceC0210g = this.f24003t;
        if (interfaceC0210g == null) {
            m28564N(7);
        }
        return interfaceC0210g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7228n0(InterfaceC6019m interfaceC6019m, InterfaceC0210g interfaceC0210g, InterfaceC6333h interfaceC6333h) {
        this(interfaceC6019m, interfaceC0210g, interfaceC6333h, C5697h.f17923i);
        if (interfaceC6019m == null) {
            m28564N(0);
        }
        if (interfaceC0210g == null) {
            m28564N(1);
        }
        if (interfaceC6333h == null) {
            m28564N(2);
        }
    }
}
