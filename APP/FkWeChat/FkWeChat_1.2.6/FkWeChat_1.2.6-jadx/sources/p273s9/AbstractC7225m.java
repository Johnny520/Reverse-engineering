package p273s9;

import p213oa.C5695f;
import p229p9.InterfaceC6019m;
import p243q9.AbstractC6327b;
import p243q9.InterfaceC6333h;
import p259ra.AbstractC6569n;

/* JADX INFO: renamed from: s9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7225m extends AbstractC6327b implements InterfaceC6019m {

    /* JADX INFO: renamed from: r */
    public final C5695f f23997r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7225m(InterfaceC6333h interfaceC6333h, C5695f c5695f) {
        super(interfaceC6333h);
        if (interfaceC6333h == null) {
            m28558N(0);
        }
        if (c5695f == null) {
            m28558N(1);
        }
        this.f23997r = c5695f;
    }

    /* JADX INFO: renamed from: E0 */
    public static String m28557E0(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28558N(4);
        }
        try {
            return AbstractC6569n.f20555k.mo25906M(interfaceC6019m) + "[" + interfaceC6019m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC6019m)) + "]";
        } catch (Throwable unused) {
            return interfaceC6019m.getClass().getSimpleName() + " " + interfaceC6019m.getName();
        }
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28558N(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p229p9.InterfaceC6011j0
    public C5695f getName() {
        C5695f c5695f = this.f23997r;
        if (c5695f == null) {
            m28558N(2);
        }
        return c5695f;
    }

    public String toString() {
        return m28557E0(this);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC6019m mo12664a() {
        return this;
    }
}
