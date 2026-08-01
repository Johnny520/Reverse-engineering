package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p052.InterfaceC6557;
import p070.AbstractC6908;
import p079.AbstractC6995;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4802 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4809 f14004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14005;

    public /* synthetic */ C4802(C4809 c4809, int i) {
        this.f14005 = i;
        this.f14004 = c4809;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f14005;
        C4809 c4809 = this.f14004;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C4823 c4823 = c4809.f14022;
                C4687 c4687M13051 = AbstractC7738.m13051(c4823.f14057, iIntValue);
                boolean z = c4687M13051.f13693;
                C4832 c4832 = c4823.f14058;
                if (!z) {
                    return AbstractC4490.m9086(c4832.f14087, c4687M13051);
                }
                C4834 c4834 = c4832.f14089;
                Set set = C4834.f14105;
                return c4834.m9577(c4687M13051, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C4823 c48232 = c4809.f14022;
                C4687 c4687M130512 = AbstractC7738.m13051(c48232.f14057, iIntValue2);
                if (c4687M130512.f13693) {
                    return null;
                }
                InterfaceC4485 interfaceC4485 = c48232.f14058.f14087;
                interfaceC4485.getClass();
                InterfaceC4476 interfaceC4476M9086 = AbstractC4490.m9086(interfaceC4485, c4687M130512);
                if (interfaceC4476M9086 instanceof AbstractC6995) {
                    return (AbstractC6995) interfaceC4476M9086;
                }
                return null;
            default:
                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
                protoBuf$Type.getClass();
                return AbstractC6908.m12169(protoBuf$Type, c4809.f14022.f14055);
        }
    }
}
