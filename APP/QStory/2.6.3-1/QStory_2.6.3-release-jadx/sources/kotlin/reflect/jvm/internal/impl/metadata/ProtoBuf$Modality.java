package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import p091.C7787;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$Modality implements InterfaceC5554 {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static InterfaceC5555 internalValueMap = new C7787(0);
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
    public final int getNumber() {
        return this.value;
    }
}
