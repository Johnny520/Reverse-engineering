package io.ktor.websocket;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.server.websocket.InterfaceC4177;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5200;
import p291.AbstractC8493;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4261 implements InterfaceC4262, InterfaceC4258 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12785;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12788;
    private volatile /* synthetic */ int closed;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5451 f12789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5190 f12790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f12791;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4360 f12792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5438 f12793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5190 f12794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4258 f12795;

    static {
        new C4282(new byte[0], C4276.f12831);
        f12787 = AtomicReferenceFieldUpdater.newUpdater(C4261.class, Object.class, "pinger");
        f12785 = AbstractC8493.f23591.objectFieldOffset(C4261.class.getDeclaredField("pinger"));
        f12788 = AtomicIntegerFieldUpdater.newUpdater(C4261.class, "closed");
        f12786 = AtomicIntegerFieldUpdater.newUpdater(C4261.class, "started");
    }

    public C4261(InterfaceC4177 interfaceC4177, long j) {
        interfaceC4177.getClass();
        this.f12795 = interfaceC4177;
        this.pinger = null;
        this.f12793 = AbstractC5399.m10490();
        this.f12794 = AbstractC5205.m10282(8, 6, null);
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.f12790 = AbstractC5205.m10282(property != null ? Integer.parseInt(property) : 8, 6, null);
        this.closed = 0;
        C5451 c5451 = new C5451((InterfaceC5452) interfaceC4177.mo2430().get(C5453.f15105));
        this.f12789 = c5451;
        this.f12791 = new ArrayList();
        this.started = 0;
        this.f12792 = interfaceC4177.mo2430().plus(c5451).plus(new C5402("ws-default"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r2.m8717(r11, null, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r7.mo8433(r12, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e1 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8715(io.ktor.websocket.C4261 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4261.m8715(io.ktor.websocket.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8716(io.ktor.websocket.C4261 r7, kotlinx.io.InterfaceC5484 r8, io.ktor.websocket.AbstractC4280 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws io.ktor.websocket.FrameTooBigException {
        /*
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r0 = r7.f12795
            boolean r1 = r10 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            if (r1 == 0) goto L15
            r1 = r10
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r1 = (io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 == r4) goto L2c
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L2c:
            int r7 = r1.I$0
            kotlin.AbstractC5185.m10210(r10)
            goto L71
        L32:
            kotlin.AbstractC5185.m10210(r10)
            byte[] r9 = r9.f12836
            int r9 = r9.length
            if (r8 == 0) goto L40
            kotlinx.io.飘花落叶言子楪世苏哲兰 r8 = (kotlinx.io.C5477) r8
            long r5 = r8.f15142
            int r8 = (int) r5
            goto L41
        L40:
            r8 = 0
        L41:
            int r8 = r8 + r9
            long r9 = (long) r8
            long r5 = r0.mo8549()
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L78
            io.ktor.websocket.飘花落叶言子楪世苏兰哲 r9 = new io.ktor.websocket.飘花落叶言子楪世苏兰哲
            io.ktor.websocket.CloseReason$Codes r10 = io.ktor.websocket.CloseReason$Codes.TOO_BIG
            java.lang.String r3 = "Frame is too big: "
            java.lang.String r5 = ". Max size is "
            java.lang.StringBuilder r3 = androidx.activity.AbstractC0053.m150(r8, r3, r5)
            long r5 = r0.mo8549()
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            r9.<init>(r10, r0)
            r1.I$0 = r8
            r1.label = r4
            java.lang.Object r7 = io.ktor.websocket.AbstractC4257.m8714(r7, r9, r1)
            if (r7 != r2) goto L70
            return r2
        L70:
            r7 = r8
        L71:
            io.ktor.websocket.FrameTooBigException r8 = new io.ktor.websocket.FrameTooBigException
            long r9 = (long) r7
            r8.<init>(r9)
            throw r8
        L78:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4261.m8716(io.ktor.websocket.飘花落叶言子楪世哲兰苏, kotlinx.io.飘花落叶言子楪苏哲兰世, io.ktor.websocket.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12792;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC5200 mo8545() {
        return this.f12790;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8717(io.ktor.websocket.C4263 r9, java.io.IOException r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4261.m8717(io.ktor.websocket.飘花落叶言子楪世苏兰哲, java.io.IOException, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8718() {
        f12787.getClass();
        InterfaceC5200 interfaceC5200 = (InterfaceC5200) AbstractC8493.f23591.getAndSetObject(this, f12785, (Object) null);
        if (interfaceC5200 != null) {
            interfaceC5200.mo8435(null);
        }
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo8546(C4278 c4278, InterfaceC4357 interfaceC4357) {
        Object objMo8433 = mo8545().mo8433(c4278, interfaceC4357);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5176 c5176 = C5176.f14739;
        if (objMo8433 != coroutineSingletons) {
            objMo8433 = c5176;
        }
        return objMo8433 == coroutineSingletons ? objMo8433 : c5176;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5199 mo8547() {
        return this.f12794;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8719(List list) {
        List list2;
        if (!f12786.compareAndSet(this, 0, 1)) {
            C4211.m8619(this, "WebSocket session ", " is already started.");
            return;
        }
        InterfaceC9141 interfaceC9141 = AbstractC4260.f12784;
        if (AbstractC2905.m6294(interfaceC9141)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list2 = list;
            sb.append(AbstractC4344.m8810(list2, null, null, null, null, 63));
            interfaceC9141.trace(sb.toString());
        } else {
            list2 = list;
        }
        this.f12791.addAll(list2);
        m8718();
        C5402 c5402 = AbstractC4273.f12830;
        C5190 c5190 = this.f12790;
        c5190.getClass();
        C5190 c5190M10282 = AbstractC5205.m10282(5, 6, null);
        AbstractC5399.m10477(this, AbstractC4273.f12830, null, new PingPongKt$ponger$1(c5190M10282, c5190, null), 2);
        C5402 c54022 = AbstractC4260.f12783;
        C5416 c5416 = AbstractC5395.f15029;
        AbstractC5399.m10477(this, c54022.plus(c5416), null, new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this, c5190M10282, null), 2);
        AbstractC5399.m10478(this, AbstractC4260.f12782.plus(c5416), CoroutineStart.UNDISPATCHED, new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this, null));
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8548(ContinuationImpl continuationImpl) {
        Object objMo8548 = this.f12795.mo8548(continuationImpl);
        return objMo8548 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8548 : C5176.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8549() {
        return this.f12795.mo8549();
    }
}
