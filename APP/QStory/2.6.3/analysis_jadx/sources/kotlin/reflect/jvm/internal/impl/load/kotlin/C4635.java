package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4790;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802;
import p077.C6970;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4635 implements InterfaceC4802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6970 f13554;

    public C4635(C6970 c6970, C4790 c4790, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        deserializedContainerAbiStability.getClass();
        this.f13554 = c6970;
    }

    public final String toString() {
        return C4635.class.getSimpleName() + ": " + this.f13554;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String mo9248() {
        return AbstractC0053.m148(new StringBuilder("Class '"), AbstractC4431.m8977(this.f13554.f18661).m9327().f13696.f13693, '\'');
    }
}
