package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import p075.C6957;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$Modality implements InterfaceC4721 {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static InterfaceC4722 internalValueMap = new C6957(0);
    private final int value;

    ProtoBuf$Modality(int i, int i2) {
        this.value = i2;
    }

    public static ProtoBuf$Modality valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
    public final int getNumber() {
        return this.value;
    }
}
