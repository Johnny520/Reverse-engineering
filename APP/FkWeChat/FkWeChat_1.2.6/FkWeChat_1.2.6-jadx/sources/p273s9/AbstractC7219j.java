package p273s9;

import p082fb.InterfaceC2412n;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;

/* JADX INFO: renamed from: s9.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7219j extends AbstractC7201a {

    /* JADX INFO: renamed from: v */
    public final InterfaceC6019m f23943v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC6003g1 f23944w;

    /* JADX INFO: renamed from: x */
    public final boolean f23945x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7219j(InterfaceC2412n interfaceC2412n, InterfaceC6019m interfaceC6019m, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1, boolean z10) {
        super(interfaceC2412n, c5695f);
        if (interfaceC2412n == null) {
            m28504J0(0);
        }
        if (interfaceC6019m == null) {
            m28504J0(1);
        }
        if (c5695f == null) {
            m28504J0(2);
        }
        if (interfaceC6003g1 == null) {
            m28504J0(3);
        }
        this.f23943v = interfaceC6019m;
        this.f23944w = interfaceC6003g1;
        this.f23945x = z10;
    }

    /* JADX INFO: renamed from: J0 */
    private static /* synthetic */ void m28504J0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        return this.f23945x;
    }

    @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC6022n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        InterfaceC6019m interfaceC6019m = this.f23943v;
        if (interfaceC6019m == null) {
            m28504J0(4);
        }
        return interfaceC6019m;
    }

    @Override // p229p9.InterfaceC6028p
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = this.f23944w;
        if (interfaceC6003g1 == null) {
            m28504J0(5);
        }
        return interfaceC6003g1;
    }
}
