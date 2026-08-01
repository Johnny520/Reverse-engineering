package kotlin.reflect.jvm.internal;

import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4822;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5049 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5049 f14570 = new C5049(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5049 f14571 = new C5049(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14572;

    public /* synthetic */ C5049(int i) {
        this.f14572 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        C4822 c4822 = (C4822) obj;
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj2;
        switch (this.f14572) {
            case 0:
                HashSet hashSet = C5003.f14421;
                c4822.getClass();
                protoBuf$Property.getClass();
                break;
            default:
                int i = C4991.f14401;
                c4822.getClass();
                protoBuf$Property.getClass();
                break;
        }
        return c4822.m9572(protoBuf$Property, true);
    }
}
