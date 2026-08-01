package androidx.compose.runtime;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.text.C1850;
import androidx.compose.runtime.internal.C2080;
import androidx.window.area.AbstractC3400;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2189 implements InterfaceC2139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2080 f4271 = new C2080(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2221 f4272;

    public C2189(C2221 c2221) {
        this.f4272 = c2221;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // androidx.compose.runtime.InterfaceC2139
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final Object mo2865(InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        C2190 c2190 = new C2190();
        c2190.f4274 = c6276;
        c2190.f4273 = interfaceC7387;
        c6276.m11100(new C1850(this.f4271.m2712(c2190, this.f4272), 1));
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }
}
