package kotlinx.coroutines;

import io.ktor.util.C5039;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.C5188;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5187;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6180;
import kotlinx.coroutines.internal.C6181;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6264 extends AbstractC5191 implements InterfaceC5187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C6267 f15426 = new C6267(C5188.f13281, new C5039(13));

    public AbstractC6264() {
        super(C5188.f13281);
    }

    @Override // kotlin.coroutines.AbstractC5191, kotlin.coroutines.InterfaceC5192
    public final /* bridge */ InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC9019.m14261(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.AbstractC5191, kotlin.coroutines.InterfaceC5192
    public final /* bridge */ InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC9019.m14249(this, interfaceC5193);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6231.m11060(this);
    }

    @Override // kotlin.coroutines.InterfaceC5187
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC5189 mo9030(ContinuationImpl continuationImpl) {
        return new C6181(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC6264 mo11086(int i) {
        AbstractC6185.m10926(i);
        return new C6180(this, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable);

    @Override // kotlin.coroutines.InterfaceC5187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9031(InterfaceC5189 interfaceC5189) {
        interfaceC5189.getClass();
        C6181 c6181 = (C6181) interfaceC5189;
        c6181.m10911();
        C6276 c6276M10909 = c6181.m10909();
        if (c6276M10909 != null) {
            c6276M10909.m11105();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public boolean mo5051(InterfaceC5192 interfaceC5192) {
        return !(this instanceof C6248);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo10903(InterfaceC5192 interfaceC5192, Runnable runnable) {
        AbstractC6185.m10933(this, interfaceC5192, runnable);
    }
}
