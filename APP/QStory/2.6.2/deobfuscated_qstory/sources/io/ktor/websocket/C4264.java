package io.ktor.websocket;

import io.ktor.util.cio.AbstractC4185;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.channels.InterfaceC5199;
import p057.C6852;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4264 implements InterfaceC4257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f12794;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4267 f12795;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4254 f12796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f12797;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4265 f12798;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5189 f12799;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C4264.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        C4396 c4396 = AbstractC4395.f12971;
        f12794 = new InterfaceC5087[]{c4396.mo8923(mutablePropertyReference1Impl), c4396.mo8923(new MutablePropertyReference1Impl(C4264.class, "masking", "getMasking()Z", 0))};
    }

    public C4264(InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, long j, boolean z, InterfaceC4359 interfaceC4359) {
        C6852 c6852 = AbstractC4185.f12650;
        interfaceC4251.getClass();
        interfaceC4246.getClass();
        interfaceC4359.getClass();
        c6852.getClass();
        C5450 c5450 = new C5450((InterfaceC5451) interfaceC4359.get(C5452.f15105));
        this.f12799 = AbstractC5204.m10278(0, 6, null);
        InterfaceC4359 interfaceC4359Plus = interfaceC4359.plus(c5450).plus(new C5401("raw-ws"));
        this.f12797 = interfaceC4359Plus;
        this.f12798 = new C4265(Long.valueOf(j), 0, this);
        this.f12796 = new C4254(interfaceC4246, interfaceC4359Plus, z, c6852);
        this.f12795 = new C4267(interfaceC4251, interfaceC4359Plus, j, c6852);
        AbstractC5398.m10473(this, null, null, new RawWebSocketJvm$1(this, null), 3);
        c5450.m10551();
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12797;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC5199 mo8555() {
        return this.f12796.f12769;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Object mo8556(C4277 c4277, InterfaceC4356 interfaceC4356) {
        Object objMo8443 = mo8555().mo8443(c4277, interfaceC4356);
        return objMo8443 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8443 : C5175.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5198 mo8557() {
        return this.f12799;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8558(ContinuationImpl continuationImpl) throws Throwable {
        Object objM8718 = this.f12796.m8718(continuationImpl);
        return objM8718 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8718 : C5175.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8559() {
        InterfaceC5087 interfaceC5087 = f12794[0];
        C4265 c4265 = this.f12798;
        c4265.getClass();
        interfaceC5087.getClass();
        return ((Number) c4265.f12802).longValue();
    }
}
