package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5622;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import p093.C7799;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5467 implements InterfaceC5634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7799 f13899;

    public C5467(C7799 c7799, C5622 c5622, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        deserializedContainerAbiStability.getClass();
        this.f13899 = c7799;
    }

    public final String toString() {
        return C5467.class.getSimpleName() + ": " + this.f13899;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String mo9807() {
        return AbstractC0900.m708(new StringBuilder("Class '"), AbstractC5263.m9536(this.f13899.f19006).m9886().f14041.f14038, '\'');
    }
}
