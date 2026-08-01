package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC3933;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import p052.InterfaceC6558;
import p070.AbstractC6909;
import p079.AbstractC6996;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4803 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4810 f14008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14009;

    public /* synthetic */ C4803(C4810 c4810, int i) {
        this.f14009 = i;
        this.f14008 = c4810;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f14009;
        C4810 c4810 = this.f14008;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C4824 c4824 = c4810.f14026;
                C4688 c4688M8319 = AbstractC3933.m8319(c4824.f14061, iIntValue);
                boolean z = c4688M8319.f13697;
                C4833 c4833 = c4824.f14062;
                if (!z) {
                    return AbstractC4491.m9076(c4833.f14091, c4688M8319);
                }
                C4835 c4835 = c4833.f14093;
                Set set = C4835.f14109;
                return c4835.m9567(c4688M8319, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C4824 c48242 = c4810.f14026;
                C4688 c4688M83192 = AbstractC3933.m8319(c48242.f14061, iIntValue2);
                if (c4688M83192.f13697) {
                    return null;
                }
                InterfaceC4486 interfaceC4486 = c48242.f14062.f14091;
                interfaceC4486.getClass();
                InterfaceC4477 interfaceC4477M9076 = AbstractC4491.m9076(interfaceC4486, c4688M83192);
                if (interfaceC4477M9076 instanceof AbstractC6996) {
                    return (AbstractC6996) interfaceC4477M9076;
                }
                return null;
            default:
                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
                protoBuf$Type.getClass();
                return AbstractC6909.m12197(protoBuf$Type, c4810.f14026.f14059);
        }
    }
}
