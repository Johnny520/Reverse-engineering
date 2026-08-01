package io.ktor.server.sse;

import io.ktor.server.routing.C4995;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p261.C8982;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.sse.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5007 implements InterfaceC5004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f12980;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6212 f12981;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5079 f12982;

    public C5007(InterfaceC5079 interfaceC5079, C4995 c4995, InterfaceC5192 interfaceC5192) {
        interfaceC5079.getClass();
        interfaceC5192.getClass();
        this.f12982 = interfaceC5079;
        this.f12980 = interfaceC5192;
        this.f12981 = new C6212();
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12980;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r6).m9259(r0) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9098(InterfaceC5079 interfaceC5079, C8982 c8982, ContinuationImpl continuationImpl) {
        DefaultServerSSESession$writeSSE$1 defaultServerSSESession$writeSSE$1;
        if (continuationImpl instanceof DefaultServerSSESession$writeSSE$1) {
            defaultServerSSESession$writeSSE$1 = (DefaultServerSSESession$writeSSE$1) continuationImpl;
            int i = defaultServerSSESession$writeSSE$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultServerSSESession$writeSSE$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultServerSSESession$writeSSE$1 = new DefaultServerSSESession$writeSSE$1(this, continuationImpl);
            }
        }
        Object obj = defaultServerSSESession$writeSSE$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultServerSSESession$writeSSE$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            String str = c8982 + "\r\n";
            defaultServerSSESession$writeSSE$1.L$0 = interfaceC5079;
            defaultServerSSESession$writeSSE$1.label = 1;
            if (AbstractC5078.m9252(interfaceC5079, str, defaultServerSSESession$writeSSE$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC5079 = (InterfaceC5079) defaultServerSSESession$writeSSE$1.L$0;
        AbstractC6017.m10769(obj);
        defaultServerSSESession$writeSSE$1.L$0 = null;
        defaultServerSSESession$writeSSE$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9099(ContinuationImpl continuationImpl) throws Throwable {
        DefaultServerSSESession$close$1 defaultServerSSESession$close$1;
        InterfaceC6215 interfaceC6215;
        Throwable th;
        InterfaceC6215 interfaceC62152;
        InterfaceC6215 interfaceC62153;
        if (continuationImpl instanceof DefaultServerSSESession$close$1) {
            defaultServerSSESession$close$1 = (DefaultServerSSESession$close$1) continuationImpl;
            int i = defaultServerSSESession$close$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultServerSSESession$close$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultServerSSESession$close$1 = new DefaultServerSSESession$close$1(this, continuationImpl);
            }
        }
        Object obj = defaultServerSSESession$close$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultServerSSESession$close$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                defaultServerSSESession$close$1.L$0 = this;
                C6212 c6212 = this.f12981;
                defaultServerSSESession$close$1.L$1 = c6212;
                defaultServerSSESession$close$1.label = 1;
                Object objM10986 = c6212.m10986(defaultServerSSESession$close$1);
                interfaceC6215 = c6212;
                if (objM10986 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC62152 = (InterfaceC6215) defaultServerSSESession$close$1.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC62153 = interfaceC62152;
                    ((C6212) interfaceC62153).m10991(null);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    ((C6212) interfaceC62152).m10991(null);
                    throw th;
                }
            }
            InterfaceC6215 interfaceC62154 = (InterfaceC6215) defaultServerSSESession$close$1.L$1;
            C5007 c5007 = (C5007) defaultServerSSESession$close$1.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6215 = interfaceC62154;
            this = c5007;
            InterfaceC5079 interfaceC5079 = this.f12982;
            defaultServerSSESession$close$1.L$0 = interfaceC6215;
            defaultServerSSESession$close$1.L$1 = null;
            defaultServerSSESession$close$1.label = 2;
            if (((C5081) interfaceC5079).m9263(defaultServerSSESession$close$1) != coroutineSingletons) {
                interfaceC62153 = interfaceC6215;
                ((C6212) interfaceC62153).m10991(null);
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC6215 interfaceC62155 = interfaceC6215;
            th = th3;
            interfaceC62152 = interfaceC62155;
            ((C6212) interfaceC62152).m10991(null);
            throw th;
        }
    }
}
