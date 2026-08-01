package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.text.C1850;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5609;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5612;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p065.AbstractC7355;
import p068.InterfaceC7387;
import p093.C7800;
import p095.C7817;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5250 implements InterfaceC5307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5680 f13358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5665 f13359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7817 f13360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5677 f13361;

    public C5250(C5677 c5677, C7800 c7800, C7817 c7817) {
        this.f13361 = c5677;
        this.f13360 = c7817;
        this.f13358 = c5677.m10137(new C1850(this, 14));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5610 m9510(C5519 c5519) {
        InputStream inputStreamM10067;
        c5519.getClass();
        C5523 c5523 = AbstractC7355.f18197;
        c5523.getClass();
        if (c5519.f14041.m9876(c5523)) {
            C5612.f14267.getClass();
            inputStreamM10067 = C5609.m10067(C5612.m10070(c5519));
        } else {
            inputStreamM10067 = null;
        }
        if (inputStreamM10067 != null) {
            return AbstractC5754.m10450(c5519, this.f13361, this.f13360, inputStreamM10067);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo9511(C5519 c5519) {
        c5519.getClass();
        C5680 c5680 = this.f13358;
        return (c5680.m10143(c5519) ? (InterfaceC5298) c5680.invoke(c5519) : m9510(c5519)) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo9512(C5519 c5519, ArrayList arrayList) throws Throwable {
        c5519.getClass();
        Object objInvoke = this.f13358.invoke(c5519);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo9513(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        return EmptySet.INSTANCE;
    }
}
