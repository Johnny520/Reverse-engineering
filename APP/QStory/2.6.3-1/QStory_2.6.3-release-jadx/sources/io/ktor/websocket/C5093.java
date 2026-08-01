package io.ktor.websocket;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.server.websocket.InterfaceC5009;
import io.ktor.util.C5043;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6248;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6316;
import p307.AbstractC9322;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5093 implements InterfaceC5094, InterfaceC5090 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f13130;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13131;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13132;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13133;
    private volatile /* synthetic */ int closed;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6283 f13134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6022 f13135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f13136;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5192 f13137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6270 f13138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6022 f13139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5090 f13140;

    static {
        new C5114(new byte[0], C5108.f13176);
        f13132 = AtomicReferenceFieldUpdater.newUpdater(C5093.class, Object.class, "pinger");
        f13130 = AbstractC9322.f23936.objectFieldOffset(C5093.class.getDeclaredField("pinger"));
        f13133 = AtomicIntegerFieldUpdater.newUpdater(C5093.class, "closed");
        f13131 = AtomicIntegerFieldUpdater.newUpdater(C5093.class, "started");
    }

    public C5093(InterfaceC5009 interfaceC5009, long j) {
        interfaceC5009.getClass();
        this.f13140 = interfaceC5009;
        this.pinger = null;
        this.f13138 = AbstractC6231.m11049();
        this.f13139 = AbstractC6037.m10841(8, 6, null);
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.f13135 = AbstractC6037.m10841(property != null ? Integer.parseInt(property) : 8, 6, null);
        this.closed = 0;
        C6283 c6283 = new C6283((InterfaceC6284) interfaceC5009.mo2990().get(C6285.f15450));
        this.f13134 = c6283;
        this.f13136 = new ArrayList();
        this.started = 0;
        this.f13137 = interfaceC5009.mo2990().plus(c6283).plus(new C6234("ws-default"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r2.m9276(r11, null, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r7.mo8992(r12, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e1 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9274(C5093 c5093, ContinuationImpl continuationImpl) throws EOFException {
        DefaultWebSocketSessionImpl$outgoingProcessorLoop$1 defaultWebSocketSessionImpl$outgoingProcessorLoop$1;
        InterfaceC6044 interfaceC6044;
        C5093 c50932;
        InterfaceC6044 c6023;
        Object objM10823;
        c5093.getClass();
        if (continuationImpl instanceof DefaultWebSocketSessionImpl$outgoingProcessorLoop$1) {
            defaultWebSocketSessionImpl$outgoingProcessorLoop$1 = (DefaultWebSocketSessionImpl$outgoingProcessorLoop$1) continuationImpl;
            int i = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultWebSocketSessionImpl$outgoingProcessorLoop$1 = new DefaultWebSocketSessionImpl$outgoingProcessorLoop$1(c5093, continuationImpl);
            }
        }
        Object obj = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6022 c6022 = c5093.f13135;
            c6022.getClass();
            c6023 = new C6023(c6022);
            defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = c5093;
            defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1 = c6023;
            defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 1;
            C6023 c60232 = (C6023) c6023;
            objM10823 = c60232.m10823(defaultWebSocketSessionImpl$outgoingProcessorLoop$1);
            if (objM10823 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            interfaceC6044 = (InterfaceC6044) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1;
            c50932 = (C5093) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0;
            AbstractC6017.m10769(obj);
            if (((Boolean) obj).booleanValue()) {
            }
            return C6008.f15084;
        }
        if (i2 == 2) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        if (i2 != 3) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6044 interfaceC60442 = (InterfaceC6044) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1;
        c50932 = (C5093) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC6044 interfaceC60443 = interfaceC60442;
        C5093 c50933 = c50932;
        c6023 = interfaceC60443;
        c5093 = c50933;
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = c5093;
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1 = c6023;
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 1;
        C6023 c602322 = (C6023) c6023;
        objM10823 = c602322.m10823(defaultWebSocketSessionImpl$outgoingProcessorLoop$1);
        if (objM10823 != coroutineSingletons) {
            c50932 = c5093;
            interfaceC6044 = c602322;
            obj = objM10823;
            if (((Boolean) obj).booleanValue()) {
                C6023 c60233 = (C6023) interfaceC6044;
                AbstractC5112 abstractC5112 = (AbstractC5112) c60233.m10821();
                InterfaceC9970 interfaceC9970 = AbstractC5092.f13129;
                if (AbstractC3738.m6854(interfaceC9970)) {
                    interfaceC9970.trace("Sending " + abstractC5112 + " from session " + c50932);
                }
                if (abstractC5112 instanceof C5110) {
                    C5095 c5095M9270 = AbstractC5089.m9270((C5110) abstractC5112);
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = null;
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1 = null;
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 2;
                } else {
                    if ((abstractC5112 instanceof C5111) || (abstractC5112 instanceof C5091)) {
                        Iterator it = c50932.f13136.iterator();
                        if (it.hasNext()) {
                            throw AbstractC3275.m5138(it);
                        }
                    }
                    InterfaceC6032 interfaceC6032Mo9104 = c50932.f13140.mo9104();
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = c50932;
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$1 = c60233;
                    defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 3;
                    interfaceC60443 = c60233;
                }
            }
            return C6008.f15084;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9275(C5093 c5093, InterfaceC6316 interfaceC6316, AbstractC5112 abstractC5112, ContinuationImpl continuationImpl) throws FrameTooBigException {
        DefaultWebSocketSessionImpl$checkMaxFrameSize$1 defaultWebSocketSessionImpl$checkMaxFrameSize$1;
        int i;
        InterfaceC5090 interfaceC5090 = c5093.f13140;
        if (continuationImpl instanceof DefaultWebSocketSessionImpl$checkMaxFrameSize$1) {
            defaultWebSocketSessionImpl$checkMaxFrameSize$1 = (DefaultWebSocketSessionImpl$checkMaxFrameSize$1) continuationImpl;
            int i2 = defaultWebSocketSessionImpl$checkMaxFrameSize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultWebSocketSessionImpl$checkMaxFrameSize$1.label = i2 - Integer.MIN_VALUE;
            } else {
                defaultWebSocketSessionImpl$checkMaxFrameSize$1 = new DefaultWebSocketSessionImpl$checkMaxFrameSize$1(c5093, continuationImpl);
            }
        }
        Object obj = defaultWebSocketSessionImpl$checkMaxFrameSize$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = defaultWebSocketSessionImpl$checkMaxFrameSize$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            int length = (interfaceC6316 != null ? (int) ((C6309) interfaceC6316).f15487 : 0) + abstractC5112.f13181.length;
            if (length <= interfaceC5090.mo9108()) {
                return C6008.f15084;
            }
            CloseReason$Codes closeReason$Codes = CloseReason$Codes.TOO_BIG;
            StringBuilder sbM710 = AbstractC0900.m710(length, "Frame is too big: ", ". Max size is ");
            sbM710.append(interfaceC5090.mo9108());
            C5095 c5095 = new C5095(closeReason$Codes, sbM710.toString());
            defaultWebSocketSessionImpl$checkMaxFrameSize$1.I$0 = length;
            defaultWebSocketSessionImpl$checkMaxFrameSize$1.label = 1;
            if (AbstractC5089.m9273(c5093, c5095, defaultWebSocketSessionImpl$checkMaxFrameSize$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = length;
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = defaultWebSocketSessionImpl$checkMaxFrameSize$1.I$0;
            AbstractC6017.m10769(obj);
        }
        throw new FrameTooBigException(i);
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13137;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC6032 mo9104() {
        return this.f13135;
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
    */
    public final Object m9276(C5095 c5095, IOException iOException, ContinuationImpl continuationImpl) throws Throwable {
        DefaultWebSocketSessionImpl$sendCloseSequence$1 defaultWebSocketSessionImpl$sendCloseSequence$1;
        ?? r10;
        if (continuationImpl instanceof DefaultWebSocketSessionImpl$sendCloseSequence$1) {
            defaultWebSocketSessionImpl$sendCloseSequence$1 = (DefaultWebSocketSessionImpl$sendCloseSequence$1) continuationImpl;
            int i = defaultWebSocketSessionImpl$sendCloseSequence$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultWebSocketSessionImpl$sendCloseSequence$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultWebSocketSessionImpl$sendCloseSequence$1 = new DefaultWebSocketSessionImpl$sendCloseSequence$1(this, continuationImpl);
            }
        }
        Object obj = defaultWebSocketSessionImpl$sendCloseSequence$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultWebSocketSessionImpl$sendCloseSequence$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (f13133.compareAndSet(this, 0, 1)) {
                InterfaceC9970 interfaceC9970 = AbstractC5092.f13129;
                if (AbstractC3738.m6854(interfaceC9970)) {
                    interfaceC9970.trace("Sending Close Sequence for session " + this + " with reason " + c5095 + " and exception " + ((Object) iOException));
                }
                this.f13134.m11114();
                if (c5095 == null) {
                    c5095 = new C5095(CloseReason$Codes.NORMAL, "");
                }
                try {
                    m9277();
                    r10 = iOException;
                    if (c5095.f13142 != CloseReason$Codes.CLOSED_ABNORMALLY.getCode()) {
                        InterfaceC6032 interfaceC6032Mo9104 = this.f13140.mo9104();
                        C5110 c5110 = new C5110(c5095);
                        defaultWebSocketSessionImpl$sendCloseSequence$1.L$0 = this;
                        defaultWebSocketSessionImpl$sendCloseSequence$1.L$1 = iOException;
                        defaultWebSocketSessionImpl$sendCloseSequence$1.L$2 = c5095;
                        defaultWebSocketSessionImpl$sendCloseSequence$1.label = 1;
                        r10 = iOException;
                        if (interfaceC6032Mo9104.mo8992(c5110, defaultWebSocketSessionImpl$sendCloseSequence$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    this.f13138.m11147(c5095);
                    if (r10 != 0) {
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f13138.m11147(c5095);
                    if (iOException != 0) {
                        this.f13135.m10801(iOException, false);
                        this.f13139.m10801(iOException, false);
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5095 c50952 = (C5095) defaultWebSocketSessionImpl$sendCloseSequence$1.L$2;
            iOException = (Throwable) defaultWebSocketSessionImpl$sendCloseSequence$1.L$1;
            C5093 c5093 = (C5093) defaultWebSocketSessionImpl$sendCloseSequence$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                c5095 = c50952;
                this = c5093;
                r10 = iOException;
                this.f13138.m11147(c5095);
                if (r10 != 0) {
                    this.f13135.m10801(r10, false);
                    this.f13139.m10801(r10, false);
                }
            } catch (Throwable th2) {
                th = th2;
                c5095 = c50952;
                this = c5093;
                this.f13138.m11147(c5095);
                if (iOException != 0) {
                }
                throw th;
            }
        }
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m9277() {
        f13132.getClass();
        InterfaceC6032 interfaceC6032 = (InterfaceC6032) AbstractC9322.f23936.getAndSetObject(this, f13130, (Object) null);
        if (interfaceC6032 != null) {
            interfaceC6032.mo8994(null);
        }
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo9105(C5110 c5110, InterfaceC5189 interfaceC5189) {
        Object objMo8992 = mo9104().mo8992(c5110, interfaceC5189);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (objMo8992 != coroutineSingletons) {
            objMo8992 = c6008;
        }
        return objMo8992 == coroutineSingletons ? objMo8992 : c6008;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC6031 mo9106() {
        return this.f13139;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m9278(List list) {
        List list2;
        if (!f13131.compareAndSet(this, 0, 1)) {
            C5043.m9178(this, "WebSocket session ", " is already started.");
            return;
        }
        InterfaceC9970 interfaceC9970 = AbstractC5092.f13129;
        if (AbstractC3738.m6854(interfaceC9970)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list2 = list;
            sb.append(AbstractC5176.m9369(list2, null, null, null, null, 63));
            interfaceC9970.trace(sb.toString());
        } else {
            list2 = list;
        }
        this.f13136.addAll(list2);
        m9277();
        C6234 c6234 = AbstractC5105.f13175;
        C6022 c6022 = this.f13135;
        c6022.getClass();
        C6022 c6022M10841 = AbstractC6037.m10841(5, 6, null);
        AbstractC6231.m11036(this, AbstractC5105.f13175, null, new PingPongKt$ponger$1(c6022M10841, c6022, null), 2);
        C6234 c62342 = AbstractC5092.f13128;
        C6248 c6248 = AbstractC6227.f15374;
        AbstractC6231.m11036(this, c62342.plus(c6248), null, new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this, c6022M10841, null), 2);
        AbstractC6231.m11037(this, AbstractC5092.f13127.plus(c6248), CoroutineStart.UNDISPATCHED, new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this, null));
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo9107(ContinuationImpl continuationImpl) {
        Object objMo9107 = this.f13140.mo9107(continuationImpl);
        return objMo9107 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9107 : C6008.f15084;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo9108() {
        return this.f13140.mo9108();
    }
}
