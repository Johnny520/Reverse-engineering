package p273s9;

import p012ab.C0208e;
import p012ab.InterfaceC0210g;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7239t extends AbstractC7205c {

    /* JADX INFO: renamed from: s */
    public final InterfaceC5995e f24084s;

    /* JADX INFO: renamed from: t */
    public final C0208e f24085t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7239t(InterfaceC5995e interfaceC5995e) {
        super(InterfaceC6333h.f19873o.m25003b());
        if (interfaceC5995e == null) {
            m28654N(0);
        }
        this.f24084s = interfaceC5995e;
        this.f24085t = new C0208e(interfaceC5995e, null);
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28654N(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        InterfaceC5995e interfaceC5995e = this.f24084s;
        if (interfaceC5995e == null) {
            m28654N(2);
        }
        return interfaceC5995e;
    }

    @Override // p229p9.InterfaceC5988b1
    public InterfaceC0210g getValue() {
        C0208e c0208e = this.f24085t;
        if (c0208e == null) {
            m28654N(1);
        }
        return c0208e;
    }

    @Override // p273s9.AbstractC7225m
    public String toString() {
        return "class " + this.f24084s.getName() + "::this";
    }
}
