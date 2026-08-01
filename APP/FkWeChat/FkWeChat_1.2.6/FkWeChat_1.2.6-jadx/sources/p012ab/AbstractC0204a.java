package p012ab;

import gb.AbstractC2706r0;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0204a implements InterfaceC0210g {

    /* JADX INFO: renamed from: a */
    public final AbstractC2706r0 f534a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0210g f535b;

    public AbstractC0204a(AbstractC2706r0 abstractC2706r0, InterfaceC0210g interfaceC0210g) {
        if (abstractC2706r0 == null) {
            m442b(0);
        }
        this.f534a = abstractC2706r0;
        this.f535b = interfaceC0210g == null ? this : interfaceC0210g;
    }

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ void m442b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p012ab.InterfaceC0210g
    public AbstractC2706r0 getType() {
        AbstractC2706r0 abstractC2706r0 = this.f534a;
        if (abstractC2706r0 == null) {
            m442b(1);
        }
        return abstractC2706r0;
    }
}
