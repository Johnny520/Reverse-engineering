package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import p091.C7790;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$ReturnValueStatus implements InterfaceC5554 {
    UNSPECIFIED(0, 0),
    MUST_USE(1, 1),
    EXPLICITLY_IGNORABLE(2, 2);

    private static InterfaceC5555 internalValueMap = new C7790(0);
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
    public final int getNumber() {
        return this.value;
    }
}
