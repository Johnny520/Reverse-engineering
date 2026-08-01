package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC4765;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import p068.InterfaceC7387;
import p086.AbstractC7738;
import p095.AbstractC7825;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5635 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5642 f14353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14354;

    public /* synthetic */ C5635(C5642 c5642, int i) {
        this.f14354 = i;
        this.f14353 = c5642;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f14354;
        C5642 c5642 = this.f14353;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C5656 c5656 = c5642.f14371;
                C5520 c5520M8878 = AbstractC4765.m8878(c5656.f14406, iIntValue);
                boolean z = c5520M8878.f14042;
                C5665 c5665 = c5656.f14407;
                if (!z) {
                    return AbstractC5323.m9635(c5665.f14436, c5520M8878);
                }
                C5667 c5667 = c5665.f14438;
                Set set = C5667.f14454;
                return c5667.m10126(c5520M8878, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C5656 c56562 = c5642.f14371;
                C5520 c5520M88782 = AbstractC4765.m8878(c56562.f14406, iIntValue2);
                if (c5520M88782.f14042) {
                    return null;
                }
                InterfaceC5318 interfaceC5318 = c56562.f14407.f14436;
                interfaceC5318.getClass();
                InterfaceC5309 interfaceC5309M9635 = AbstractC5323.m9635(interfaceC5318, c5520M88782);
                if (interfaceC5309M9635 instanceof AbstractC7825) {
                    return (AbstractC7825) interfaceC5309M9635;
                }
                return null;
            default:
                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
                protoBuf$Type.getClass();
                return AbstractC7738.m12756(protoBuf$Type, c5642.f14371.f14404);
        }
    }
}
