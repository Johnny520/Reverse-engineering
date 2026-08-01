package p273s9;

import gb.AbstractC2706r0;
import p010a9.InterfaceC0173a;
import p082fb.InterfaceC2408j;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;
import ua.AbstractC8590g;

/* JADX INFO: renamed from: s9.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7248x0 extends AbstractC7246w0 {

    /* JADX INFO: renamed from: v */
    public final boolean f24108v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2408j f24109w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0173a f24110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7248x0(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, AbstractC2706r0 abstractC2706r0, boolean z10, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6019m, interfaceC6333h, c5695f, abstractC2706r0, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m28684N(0);
        }
        if (interfaceC6333h == null) {
            m28684N(1);
        }
        if (c5695f == null) {
            m28684N(2);
        }
        if (interfaceC6003g1 == null) {
            m28684N(3);
        }
        this.f24108v = z10;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28684N(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: Q0 */
    public void m28685Q0(InterfaceC2408j interfaceC2408j, InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m28684N(5);
        }
        this.f24110x = interfaceC0173a;
        if (interfaceC2408j == null) {
            interfaceC2408j = (InterfaceC2408j) interfaceC0173a.invoke();
        }
        this.f24109w = interfaceC2408j;
    }

    /* JADX INFO: renamed from: R0 */
    public void m28686R0(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m28684N(4);
        }
        m28685Q0(null, interfaceC0173a);
    }

    @Override // p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: c0 */
    public AbstractC8590g mo12673c0() {
        InterfaceC2408j interfaceC2408j = this.f24109w;
        if (interfaceC2408j != null) {
            return (AbstractC8590g) interfaceC2408j.invoke();
        }
        return null;
    }

    @Override // p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: n0 */
    public boolean mo12681n0() {
        return this.f24108v;
    }
}
