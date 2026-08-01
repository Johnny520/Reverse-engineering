package p012ab;

import gb.AbstractC2706r0;

/* JADX INFO: renamed from: ab.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0212i extends AbstractC0204a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0212i(AbstractC2706r0 abstractC2706r0) {
        this(abstractC2706r0, null);
        if (abstractC2706r0 == null) {
            m448b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ void m448b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212i(AbstractC2706r0 abstractC2706r0, InterfaceC0210g interfaceC0210g) {
        super(abstractC2706r0, interfaceC0210g);
        if (abstractC2706r0 == null) {
            m448b(1);
        }
    }
}
