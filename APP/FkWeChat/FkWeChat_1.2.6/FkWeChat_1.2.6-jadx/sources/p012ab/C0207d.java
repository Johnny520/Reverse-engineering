package p012ab;

import gb.AbstractC2706r0;
import p229p9.InterfaceC5983a;

/* JADX INFO: renamed from: ab.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0207d extends AbstractC0204a implements InterfaceC0210g {

    /* JADX INFO: renamed from: c */
    public final InterfaceC5983a f540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207d(InterfaceC5983a interfaceC5983a, AbstractC2706r0 abstractC2706r0, InterfaceC0210g interfaceC0210g) {
        super(abstractC2706r0, interfaceC0210g);
        if (interfaceC5983a == null) {
            m445b(0);
        }
        if (abstractC2706r0 == null) {
            m445b(1);
        }
        this.f540c = interfaceC5983a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m445b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f540c + "}";
    }
}
