package io.ktor.websocket;

import io.ktor.server.websocket.InterfaceC4176;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5415;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.channels.InterfaceC5199;
import p291.AbstractC8501;
import p316.C8675;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4260 implements InterfaceC4261, InterfaceC4257 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12781;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12782;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12783;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12784;
    private volatile /* synthetic */ int closed;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5450 f12785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5189 f12786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f12787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4359 f12788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5437 f12789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5189 f12790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4257 f12791;

    static {
        new C4281(new byte[0], C4275.f12827);
        f12783 = AtomicReferenceFieldUpdater.newUpdater(C4260.class, Object.class, "pinger");
        f12781 = AbstractC8501.f23600.objectFieldOffset(C4260.class.getDeclaredField("pinger"));
        f12784 = AtomicIntegerFieldUpdater.newUpdater(C4260.class, "closed");
        f12782 = AtomicIntegerFieldUpdater.newUpdater(C4260.class, "started");
    }

    public C4260(InterfaceC4176 interfaceC4176, long j) {
        interfaceC4176.getClass();
        this.f12791 = interfaceC4176;
        this.pinger = null;
        this.f12789 = AbstractC5398.m10486();
        this.f12790 = AbstractC5204.m10278(8, 6, null);
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.f12786 = AbstractC5204.m10278(property != null ? Integer.parseInt(property) : 8, 6, null);
        this.closed = 0;
        C5450 c5450 = new C5450((InterfaceC5451) interfaceC4176.mo2420().get(C5452.f15105));
        this.f12785 = c5450;
        this.f12787 = new ArrayList();
        this.started = 0;
        this.f12788 = interfaceC4176.mo2420().plus(c5450).plus(new C5401("ws-default"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r2.m8727(r11, null, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r7.mo8443(r12, r0) == r1) goto L42;
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
    public static final java.lang.Object m8725(io.ktor.websocket.C4260 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4260.m8725(io.ktor.websocket.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8726(io.ktor.websocket.C4260 r7, kotlinx.io.InterfaceC5483 r8, io.ktor.websocket.AbstractC4279 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws io.ktor.websocket.FrameTooBigException {
        /*
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r0 = r7.f12791
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
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L2c:
            int r7 = r1.I$0
            kotlin.AbstractC5184.m10206(r10)
            goto L71
        L32:
            kotlin.AbstractC5184.m10206(r10)
            byte[] r9 = r9.f12832
            int r9 = r9.length
            if (r8 == 0) goto L40
            kotlinx.io.飘花落叶言子楪世苏哲兰 r8 = (kotlinx.io.C5476) r8
            long r5 = r8.f15142
            int r8 = (int) r5
            goto L41
        L40:
            r8 = 0
        L41:
            int r8 = r8 + r9
            long r9 = (long) r8
            long r5 = r0.mo8559()
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L78
            io.ktor.websocket.飘花落叶言子楪世苏兰哲 r9 = new io.ktor.websocket.飘花落叶言子楪世苏兰哲
            io.ktor.websocket.CloseReason$Codes r10 = io.ktor.websocket.CloseReason$Codes.TOO_BIG
            java.lang.String r3 = "Frame is too big: "
            java.lang.String r5 = ". Max size is "
            java.lang.StringBuilder r3 = androidx.activity.AbstractC0053.m148(r8, r3, r5)
            long r5 = r0.mo8559()
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            r9.<init>(r10, r0)
            r1.I$0 = r8
            r1.label = r4
            java.lang.Object r7 = io.ktor.websocket.AbstractC4256.m8724(r7, r9, r1)
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
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4260.m8726(io.ktor.websocket.飘花落叶言子楪世哲兰苏, kotlinx.io.飘花落叶言子楪苏哲兰世, io.ktor.websocket.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12788;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC5199 mo8555() {
        return this.f12786;
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
    public final java.lang.Object m8727(io.ktor.websocket.C4262 r9, java.io.IOException r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4260.m8727(io.ktor.websocket.飘花落叶言子楪世苏兰哲, java.io.IOException, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8728() {
        f12783.getClass();
        InterfaceC5199 interfaceC5199 = (InterfaceC5199) AbstractC8501.f23600.getAndSetObject(this, f12781, (Object) null);
        if (interfaceC5199 != null) {
            interfaceC5199.mo8446(null);
        }
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Object mo8556(C4277 c4277, InterfaceC4356 interfaceC4356) {
        Object objMo8443 = mo8555().mo8443(c4277, interfaceC4356);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5175 c5175 = C5175.f14739;
        if (objMo8443 != coroutineSingletons) {
            objMo8443 = c5175;
        }
        return objMo8443 == coroutineSingletons ? objMo8443 : c5175;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5198 mo8557() {
        return this.f12790;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8729(List list) {
        List list2;
        if (!f12782.compareAndSet(this, 0, 1)) {
            C4210.m8629(this, "WebSocket session ", " is already started.");
            return;
        }
        InterfaceC9156 interfaceC9156 = AbstractC4259.f12780;
        if (C8675.m14359(interfaceC9156)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list2 = list;
            sb.append(AbstractC4343.m8813(list2, null, null, null, null, 63));
            interfaceC9156.trace(sb.toString());
        } else {
            list2 = list;
        }
        this.f12787.addAll(list2);
        m8728();
        C5401 c5401 = AbstractC4272.f12826;
        C5189 c5189 = this.f12786;
        c5189.getClass();
        C5189 c5189M10278 = AbstractC5204.m10278(5, 6, null);
        AbstractC5398.m10473(this, AbstractC4272.f12826, null, new PingPongKt$ponger$1(c5189M10278, c5189, null), 2);
        C5401 c54012 = AbstractC4259.f12779;
        C5415 c5415 = AbstractC5394.f15029;
        AbstractC5398.m10473(this, c54012.plus(c5415), null, new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this, c5189M10278, null), 2);
        AbstractC5398.m10474(this, AbstractC4259.f12778.plus(c5415), CoroutineStart.UNDISPATCHED, new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this, null));
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8558(ContinuationImpl continuationImpl) {
        Object objMo8558 = this.f12791.mo8558(continuationImpl);
        return objMo8558 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8558 : C5175.f14739;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8559() {
        return this.f12791.mo8559();
    }
}
