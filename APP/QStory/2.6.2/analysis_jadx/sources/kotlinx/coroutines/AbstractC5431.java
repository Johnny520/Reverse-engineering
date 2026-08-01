package kotlinx.coroutines;

import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.util.C4206;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.C4355;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5347;
import kotlinx.coroutines.internal.C5348;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5431 extends AbstractC4358 implements InterfaceC4354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5434 f15081 = new C5434(C4355.f12932, new C4206(13));

    public AbstractC5431() {
        super(C4355.f12932);
    }

    @Override // kotlin.coroutines.AbstractC4358, kotlin.coroutines.InterfaceC4359
    public final /* bridge */ InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC2904.m6257(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.AbstractC4358, kotlin.coroutines.InterfaceC4359
    public final /* bridge */ InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC2904.m6247(this, interfaceC4360);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC5398.m10497(this);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final InterfaceC4356 mo8481(ContinuationImpl continuationImpl) {
        return new C5348(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC5431 mo10523(int i) {
        AbstractC5352.m10363(i);
        return new C5347(this, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable);

    @Override // kotlin.coroutines.InterfaceC4354
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8482(InterfaceC4356 interfaceC4356) {
        interfaceC4356.getClass();
        C5348 c5348 = (C5348) interfaceC4356;
        c5348.m10348();
        C5443 c5443M10346 = c5348.m10346();
        if (c5443M10346 != null) {
            c5443M10346.m10542();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public boolean mo4481(InterfaceC4359 interfaceC4359) {
        return !(this instanceof C5415);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo10340(InterfaceC4359 interfaceC4359, Runnable runnable) {
        AbstractC5352.m10370(this, interfaceC4359, runnable);
    }
}
