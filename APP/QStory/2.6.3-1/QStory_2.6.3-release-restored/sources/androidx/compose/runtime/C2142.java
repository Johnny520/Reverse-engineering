package androidx.compose.runtime;

import androidx.activity.compose.C0851;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.tooling.C2127;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;
import kotlinx.coroutines.internal.C6183;
import p034.AbstractC7082;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2142 implements InterfaceC2174, InterfaceC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6249 f4139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7383 f4140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6183 f4141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f4142;

    public C2142(InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383) {
        this.f4142 = interfaceC5192;
        this.f4140 = interfaceC7383;
        this.f4141 = AbstractC6231.m11048(interfaceC5192.plus(this));
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public final InterfaceC5193 getKey() {
        return C6265.f15427;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) throws Throwable {
        C2127 c2127 = (C2127) interfaceC5192.get(C2127.f4124);
        if (c2127 != null) {
            AbstractC7082.m12296(th, new C0851(c2127, 7, this));
        }
        InterfaceC6236 interfaceC6236 = (InterfaceC6236) this.f4142.get(C6265.f15427);
        if (interfaceC6236 == null) {
            throw th;
        }
        interfaceC6236.handleException(interfaceC5192, th);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2734() {
        C6249 c6249 = this.f4139;
        if (c6249 != null) {
            AbstractC6231.m11067("Old job was still running!", null, c6249);
        }
        this.f4139 = AbstractC6231.m11036(this.f4141, null, null, this.f4140, 3);
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2735() {
        C6249 c6249 = this.f4139;
        if (c6249 != null) {
            c6249.mo10844(new LeftCompositionCancellationException());
        }
        this.f4139 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2736() {
        C6249 c6249 = this.f4139;
        if (c6249 != null) {
            c6249.mo10844(new LeftCompositionCancellationException());
        }
        this.f4139 = null;
    }
}
