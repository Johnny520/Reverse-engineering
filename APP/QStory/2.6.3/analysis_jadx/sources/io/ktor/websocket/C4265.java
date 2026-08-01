package io.ktor.websocket;

import io.ktor.util.cio.AbstractC4186;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5200;
import p057.C6853;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4265 implements InterfaceC4258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f12798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4268 f12799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4255 f12800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f12801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4266 f12802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5190 f12803;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C4265.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        C4397 c4397 = AbstractC4396.f12975;
        f12798 = new InterfaceC5088[]{c4397.mo8913(mutablePropertyReference1Impl), c4397.mo8913(new MutablePropertyReference1Impl(C4265.class, "masking", "getMasking()Z", 0))};
    }

    public C4265(InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, long j, boolean z, InterfaceC4360 interfaceC4360) {
        C6853 c6853 = AbstractC4186.f12654;
        interfaceC4252.getClass();
        interfaceC4247.getClass();
        interfaceC4360.getClass();
        c6853.getClass();
        C5451 c5451 = new C5451((InterfaceC5452) interfaceC4360.get(C5453.f15105));
        this.f12803 = AbstractC5205.m10282(0, 6, null);
        InterfaceC4360 interfaceC4360Plus = interfaceC4360.plus(c5451).plus(new C5402("raw-ws"));
        this.f12801 = interfaceC4360Plus;
        this.f12802 = new C4266(Long.valueOf(j), 0, this);
        this.f12800 = new C4255(interfaceC4247, interfaceC4360Plus, z, c6853);
        this.f12799 = new C4268(interfaceC4252, interfaceC4360Plus, j, c6853);
        AbstractC5399.m10477(this, null, null, new RawWebSocketJvm$1(this, null), 3);
        c5451.m10555();
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12801;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC5200 mo8545() {
        return this.f12800.f12773;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo8546(C4278 c4278, InterfaceC4357 interfaceC4357) {
        Object objMo8433 = mo8545().mo8433(c4278, interfaceC4357);
        return objMo8433 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8433 : C5176.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5199 mo8547() {
        return this.f12803;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8548(ContinuationImpl continuationImpl) throws Throwable {
        Object objM8708 = this.f12800.m8708(continuationImpl);
        return objM8708 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8708 : C5176.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8549() {
        InterfaceC5088 interfaceC5088 = f12798[0];
        C4266 c4266 = this.f12802;
        c4266.getClass();
        interfaceC5088.getClass();
        return ((Number) c4266.f12806).longValue();
    }
}
