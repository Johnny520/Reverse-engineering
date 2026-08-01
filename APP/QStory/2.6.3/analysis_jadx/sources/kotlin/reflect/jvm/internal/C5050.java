package kotlin.reflect.jvm.internal;

import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5050 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5050 f14572 = new C5050(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5050 f14573 = new C5050(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14574;

    public /* synthetic */ C5050(int i) {
        this.f14574 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        C4823 c4823 = (C4823) obj;
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj2;
        switch (this.f14574) {
            case 0:
                HashSet hashSet = C5004.f14423;
                c4823.getClass();
                protoBuf$Property.getClass();
                break;
            default:
                int i = C4992.f14403;
                c4823.getClass();
                protoBuf$Property.getClass();
                break;
        }
        return c4823.m9562(protoBuf$Property, true);
    }
}
