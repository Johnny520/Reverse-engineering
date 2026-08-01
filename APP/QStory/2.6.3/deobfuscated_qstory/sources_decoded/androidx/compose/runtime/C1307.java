package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.tooling.C1292;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5404;
import kotlinx.coroutines.internal.C5351;
import p018.AbstractC6253;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1307 implements InterfaceC1339, InterfaceC5404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5417 f3794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6554 f3795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5351 f3796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f3797;

    public C1307(InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554) {
        this.f3797 = interfaceC4360;
        this.f3795 = interfaceC6554;
        this.f3796 = AbstractC5399.m10489(interfaceC4360.plus(this));
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public final InterfaceC4361 getKey() {
        return C5433.f15082;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public final void handleException(InterfaceC4360 interfaceC4360, Throwable th) throws Throwable {
        C1292 c1292 = (C1292) interfaceC4360.get(C1292.f3779);
        if (c1292 != null) {
            AbstractC6253.m11737(th, new C0004(c1292, 7, this));
        }
        InterfaceC5404 interfaceC5404 = (InterfaceC5404) this.f3797.get(C5433.f15082);
        if (interfaceC5404 == null) {
            throw th;
        }
        interfaceC5404.handleException(interfaceC4360, th);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2174() {
        C5417 c5417 = this.f3794;
        if (c5417 != null) {
            AbstractC5399.m10508("Old job was still running!", null, c5417);
        }
        this.f3794 = AbstractC5399.m10477(this.f3796, null, null, this.f3795, 3);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2175() {
        C5417 c5417 = this.f3794;
        if (c5417 != null) {
            c5417.mo10285(new LeftCompositionCancellationException());
        }
        this.f3794 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2176() {
        C5417 c5417 = this.f3794;
        if (c5417 != null) {
            c5417.mo10285(new LeftCompositionCancellationException());
        }
        this.f3794 = null;
    }
}
