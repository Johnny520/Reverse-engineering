package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import p091.C7787;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$Visibility implements InterfaceC5554 {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static InterfaceC5555 internalValueMap = new C7787(1);
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
    public final int getNumber() {
        return this.value;
    }
}
