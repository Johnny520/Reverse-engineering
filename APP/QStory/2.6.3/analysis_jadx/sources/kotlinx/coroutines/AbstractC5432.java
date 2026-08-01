package kotlinx.coroutines;

import io.ktor.util.C4207;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.C4356;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4355;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5348;
import kotlinx.coroutines.internal.C5349;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5432 extends AbstractC4359 implements InterfaceC4355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5435 f15081 = new C5435(C4356.f12936, new C4207(13));

    public AbstractC5432() {
        super(C4356.f12936);
    }

    @Override // kotlin.coroutines.AbstractC4359, kotlin.coroutines.InterfaceC4360
    public final /* bridge */ InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC8190.m13702(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.AbstractC4359, kotlin.coroutines.InterfaceC4360
    public final /* bridge */ InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC8190.m13690(this, interfaceC4361);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC5399.m10501(this);
    }

    @Override // kotlin.coroutines.InterfaceC4355
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4357 mo8471(ContinuationImpl continuationImpl) {
        return new C5349(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC5432 mo10527(int i) {
        AbstractC5353.m10367(i);
        return new C5348(this, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable);

    @Override // kotlin.coroutines.InterfaceC4355
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8472(InterfaceC4357 interfaceC4357) {
        interfaceC4357.getClass();
        C5349 c5349 = (C5349) interfaceC4357;
        c5349.m10352();
        C5444 c5444M10350 = c5349.m10350();
        if (c5444M10350 != null) {
            c5444M10350.m10546();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public boolean mo4491(InterfaceC4360 interfaceC4360) {
        return !(this instanceof C5416);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo10344(InterfaceC4360 interfaceC4360, Runnable runnable) {
        AbstractC5353.m10374(this, interfaceC4360, runnable);
    }
}
