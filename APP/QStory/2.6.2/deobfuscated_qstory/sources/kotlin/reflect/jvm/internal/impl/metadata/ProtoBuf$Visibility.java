package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import p075.C6957;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$Visibility implements InterfaceC4721 {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static InterfaceC4722 internalValueMap = new C6957(1);
    private final int value;

    ProtoBuf$Visibility(int i, int i2) {
        this.value = i2;
    }

    public static ProtoBuf$Visibility valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
    public final int getNumber() {
        return this.value;
    }
}
