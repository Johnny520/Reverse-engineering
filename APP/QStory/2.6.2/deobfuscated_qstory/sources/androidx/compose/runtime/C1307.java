package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.compose.runtime.tooling.C1292;
import com.bumptech.glide.AbstractC3055;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5403;
import kotlinx.coroutines.internal.C5350;
import p000.AbstractC6087;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1307 implements InterfaceC1339, InterfaceC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5416 f3793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6553 f3794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5350 f3795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f3796;

    public C1307(InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553) {
        this.f3796 = interfaceC4359;
        this.f3794 = interfaceC6553;
        this.f3795 = AbstractC5398.m10485(interfaceC4359.plus(this));
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return C5432.f15082;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public final void handleException(InterfaceC4359 interfaceC4359, Throwable th) throws Throwable {
        C1292 c1292 = (C1292) interfaceC4359.get(C1292.f3778);
        if (c1292 != null) {
            AbstractC6087.m11423(th, new C0004(c1292, 7, this));
        }
        InterfaceC5403 interfaceC5403 = (InterfaceC5403) this.f3796.get(C5432.f15082);
        if (interfaceC5403 == null) {
            throw th;
        }
        interfaceC5403.handleException(interfaceC4359, th);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2164() {
        C5416 c5416 = this.f3793;
        if (c5416 != null) {
            AbstractC5398.m10504("Old job was still running!", null, c5416);
        }
        this.f3793 = AbstractC5398.m10473(this.f3795, null, null, this.f3794, 3);
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2165() {
        C5416 c5416 = this.f3793;
        if (c5416 != null) {
            c5416.mo10281(new LeftCompositionCancellationException());
        }
        this.f3793 = null;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2166() {
        C5416 c5416 = this.f3793;
        if (c5416 != null) {
            c5416.mo10281(new LeftCompositionCancellationException());
        }
        this.f3793 = null;
    }
}
