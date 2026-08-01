package io.ktor.websocket;

import io.ktor.util.cio.AbstractC5018;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;
import p073.C7682;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5097 implements InterfaceC5090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13143;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5100 f13144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5087 f13145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f13146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5098 f13147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6022 f13148;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C5097.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        C5229 c5229 = AbstractC5228.f13320;
        f13143 = new InterfaceC5920[]{c5229.mo9472(mutablePropertyReference1Impl), c5229.mo9472(new MutablePropertyReference1Impl(C5097.class, "masking", "getMasking()Z", 0))};
    }

    public C5097(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, long j, boolean z, InterfaceC5192 interfaceC5192) {
        C7682 c7682 = AbstractC5018.f12999;
        interfaceC5084.getClass();
        interfaceC5079.getClass();
        interfaceC5192.getClass();
        c7682.getClass();
        C6283 c6283 = new C6283((InterfaceC6284) interfaceC5192.get(C6285.f15450));
        this.f13148 = AbstractC6037.m10841(0, 6, null);
        InterfaceC5192 interfaceC5192Plus = interfaceC5192.plus(c6283).plus(new C6234("raw-ws"));
        this.f13146 = interfaceC5192Plus;
        this.f13147 = new C5098(Long.valueOf(j), 0, this);
        this.f13145 = new C5087(interfaceC5079, interfaceC5192Plus, z, c7682);
        this.f13144 = new C5100(interfaceC5084, interfaceC5192Plus, j, c7682);
        AbstractC6231.m11036(this, null, null, new RawWebSocketJvm$1(this, null), 3);
        c6283.m11114();
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13146;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC6032 mo9104() {
        return this.f13145.f13118;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo9105(C5110 c5110, InterfaceC5189 interfaceC5189) {
        Object objMo8992 = mo9104().mo8992(c5110, interfaceC5189);
        return objMo8992 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8992 : C6008.f15084;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC6031 mo9106() {
        return this.f13148;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo9107(ContinuationImpl continuationImpl) throws Throwable {
        Object objM9267 = this.f13145.m9267(continuationImpl);
        return objM9267 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9267 : C6008.f15084;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo9108() {
        InterfaceC5920 interfaceC5920 = f13143[0];
        C5098 c5098 = this.f13147;
        c5098.getClass();
        interfaceC5920.getClass();
        return ((Number) c5098.f13151).longValue();
    }
}
