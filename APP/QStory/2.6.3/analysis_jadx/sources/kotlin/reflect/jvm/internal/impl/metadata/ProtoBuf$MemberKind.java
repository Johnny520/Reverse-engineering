package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import p305.C8623;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$MemberKind implements InterfaceC4722 {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static InterfaceC4723 internalValueMap = new C8623(29);
    private final int value;

    ProtoBuf$MemberKind(int i, int i2) {
        this.value = i2;
    }

    public static ProtoBuf$MemberKind valueOf(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
    public final int getNumber() {
        return this.value;
    }
}
