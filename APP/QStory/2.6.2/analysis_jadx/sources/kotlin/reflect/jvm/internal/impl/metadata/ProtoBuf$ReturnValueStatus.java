package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import p075.C6960;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$ReturnValueStatus implements InterfaceC4721 {
    UNSPECIFIED(0, 0),
    MUST_USE(1, 1),
    EXPLICITLY_IGNORABLE(2, 2);

    private static InterfaceC4722 internalValueMap = new C6960(0);
    private final int value;

    ProtoBuf$ReturnValueStatus(int i, int i2) {
        this.value = i2;
    }

    public static ProtoBuf$ReturnValueStatus valueOf(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return MUST_USE;
        }
        if (i != 2) {
            return null;
        }
        return EXPLICITLY_IGNORABLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
    public final int getNumber() {
        return this.value;
    }
}
