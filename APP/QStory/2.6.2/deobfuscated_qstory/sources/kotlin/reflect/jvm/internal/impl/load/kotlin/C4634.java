package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4789;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801;
import p077.C6969;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4634 implements InterfaceC4801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6969 f13550;

    public C4634(C6969 c6969, C4789 c4789, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        deserializedContainerAbiStability.getClass();
        this.f13550 = c6969;
    }

    public final String toString() {
        return C4634.class.getSimpleName() + ": " + this.f13550;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String mo9258() {
        return AbstractC0053.m155(new StringBuilder("Class '"), AbstractC4430.m8987(this.f13550.f18666).m9337().f13692.f13689, '\'');
    }
}
