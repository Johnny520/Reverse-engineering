package p273s9;

import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6022n;
import p229p9.InterfaceC6028p;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7227n extends AbstractC7225m implements InterfaceC6022n {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6019m f24000s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC6003g1 f24001t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7227n(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6333h, c5695f);
        if (interfaceC6019m == null) {
            m28563N(0);
        }
        if (interfaceC6333h == null) {
            m28563N(1);
        }
        if (c5695f == null) {
            m28563N(2);
        }
        if (interfaceC6003g1 == null) {
            m28563N(3);
        }
        this.f24000s = interfaceC6019m;
        this.f24001t = interfaceC6003g1;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28563N(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6028p mo12664a() {
        InterfaceC6028p interfaceC6028p = (InterfaceC6028p) super.mo12664a();
        if (interfaceC6028p == null) {
            m28563N(4);
        }
        return interfaceC6028p;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        InterfaceC6019m interfaceC6019m = this.f24000s;
        if (interfaceC6019m == null) {
            m28563N(5);
        }
        return interfaceC6019m;
    }

    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = this.f24001t;
        if (interfaceC6003g1 == null) {
            m28563N(6);
        }
        return interfaceC6003g1;
    }
}
