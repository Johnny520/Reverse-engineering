package io.ktor.server.cio.backend;

import io.ktor.http.cio.C4799;
import io.ktor.http.cio.C4803;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.C6042;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.p010io.C6309;
import p074.AbstractC7684;
import p252.C8926;
import p252.C8927;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6309 f12719;

    static {
        C4799 c4799 = new C4799();
        c4799.m8917(C8926.f22698.f22704, "Bad Request", "HTTP/1.0");
        c4799.m8918("Connection", "close");
        c4799.m8919();
        f12719 = c4799.f12550;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m9033(C8927 c8927, C4803 c4803) {
        c8927.getClass();
        if (c4803 == null && c8927.equals(C8927.f22705)) {
            return true;
        }
        return c4803 == null ? !c8927.equals(C8927.f22706) : !c4803.f12559 && c4803.f12560;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9034(InterfaceC6039 interfaceC6039, ContinuationImpl continuationImpl) {
        ServerPipelineKt$respondBadRequest$1 serverPipelineKt$respondBadRequest$1;
        InterfaceC6039 interfaceC60392;
        C5081 c5081;
        if (continuationImpl instanceof ServerPipelineKt$respondBadRequest$1) {
            serverPipelineKt$respondBadRequest$1 = (ServerPipelineKt$respondBadRequest$1) continuationImpl;
            int i = serverPipelineKt$respondBadRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serverPipelineKt$respondBadRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                serverPipelineKt$respondBadRequest$1 = new ServerPipelineKt$respondBadRequest$1(continuationImpl);
            }
        }
        Object obj = serverPipelineKt$respondBadRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = serverPipelineKt$respondBadRequest$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C5081 c50812 = new C5081(false);
            if (!(interfaceC6039.mo8995(c50812) instanceof C6042)) {
                C6309 c6309M12640 = AbstractC7684.m12640(f12719);
                serverPipelineKt$respondBadRequest$1.L$0 = interfaceC6039;
                serverPipelineKt$respondBadRequest$1.L$1 = c50812;
                serverPipelineKt$respondBadRequest$1.label = 1;
                if (AbstractC5078.m9246(c50812, c6309M12640, serverPipelineKt$respondBadRequest$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC60392 = interfaceC6039;
                c5081 = c50812;
            }
            interfaceC6039.mo8994(null);
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c5081 = (C5081) serverPipelineKt$respondBadRequest$1.L$1;
        interfaceC60392 = (InterfaceC6039) serverPipelineKt$respondBadRequest$1.L$0;
        AbstractC6017.m10769(obj);
        c5081.m9257();
        interfaceC6039 = interfaceC60392;
        interfaceC6039.mo8994(null);
        return C6008.f15084;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        r13 = r9;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:32:0x0097, B:35:0x00aa, B:21:0x005c), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [long] */
    /* JADX WARN: Type inference failed for: r10v4, types: [long] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [long] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ba -> B:15:0x003b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9035(InterfaceC6031 interfaceC6031, long j, C4907 c4907, ContinuationImpl continuationImpl) {
        ServerPipelineKt$pipelineWriterLoop$1 serverPipelineKt$pipelineWriterLoop$1;
        InterfaceC5084 interfaceC5084;
        ?? r10;
        ?? r2;
        C5081 c5081;
        ?? r102;
        ?? r22;
        if (continuationImpl instanceof ServerPipelineKt$pipelineWriterLoop$1) {
            serverPipelineKt$pipelineWriterLoop$1 = (ServerPipelineKt$pipelineWriterLoop$1) continuationImpl;
            int i = serverPipelineKt$pipelineWriterLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serverPipelineKt$pipelineWriterLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                serverPipelineKt$pipelineWriterLoop$1 = new ServerPipelineKt$pipelineWriterLoop$1(continuationImpl);
            }
        }
        Object objM11032 = serverPipelineKt$pipelineWriterLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r23 = serverPipelineKt$pipelineWriterLoop$1.label;
        try {
        } catch (Throwable th) {
            C4907 c49072 = c4907;
            j = interfaceC6031;
            interfaceC6031 = r23;
            ServerPipelineKt$pipelineWriterLoop$1 serverPipelineKt$pipelineWriterLoop$12 = serverPipelineKt$pipelineWriterLoop$1;
            if (interfaceC5084 instanceof InterfaceC5079) {
                AbstractC5078.m9251((InterfaceC5079) interfaceC5084, th);
                c4907 = c49072;
                serverPipelineKt$pipelineWriterLoop$1 = serverPipelineKt$pipelineWriterLoop$12;
            } else {
                c4907 = c49072;
                serverPipelineKt$pipelineWriterLoop$1 = serverPipelineKt$pipelineWriterLoop$12;
            }
        }
        if (r23 == 0) {
            AbstractC6017.m10769(objM11032);
            ServerPipelineKt$pipelineWriterLoop$child$1 serverPipelineKt$pipelineWriterLoop$child$1 = new ServerPipelineKt$pipelineWriterLoop$child$1(interfaceC6031, null);
            serverPipelineKt$pipelineWriterLoop$1.L$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = null;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = j;
            serverPipelineKt$pipelineWriterLoop$1.label = 1;
            objM11032 = AbstractC6231.m11032(AbstractC6231.m11040(j), serverPipelineKt$pipelineWriterLoop$child$1, serverPipelineKt$pipelineWriterLoop$1);
            if (objM11032 == coroutineSingletons) {
            }
        } else if (r23 == 1) {
            long j2 = serverPipelineKt$pipelineWriterLoop$1.J$0;
            C4907 c49073 = (C4907) serverPipelineKt$pipelineWriterLoop$1.L$1;
            InterfaceC6031 interfaceC60312 = (InterfaceC6031) serverPipelineKt$pipelineWriterLoop$1.L$0;
            AbstractC6017.m10769(objM11032);
            r23 = interfaceC60312;
            c4907 = c49073;
            interfaceC6031 = j2;
            interfaceC5084 = (InterfaceC5084) objM11032;
            if (interfaceC5084 != null) {
            }
            ServerPipelineKt$pipelineWriterLoop$child$1 serverPipelineKt$pipelineWriterLoop$child$12 = new ServerPipelineKt$pipelineWriterLoop$child$1(interfaceC6031, null);
            serverPipelineKt$pipelineWriterLoop$1.L$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = null;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = j;
            serverPipelineKt$pipelineWriterLoop$1.label = 1;
            objM11032 = AbstractC6231.m11032(AbstractC6231.m11040(j), serverPipelineKt$pipelineWriterLoop$child$12, serverPipelineKt$pipelineWriterLoop$1);
            if (objM11032 == coroutineSingletons) {
            }
        } else if (r23 == 2) {
            long j3 = serverPipelineKt$pipelineWriterLoop$1.J$0;
            interfaceC5084 = (InterfaceC5084) serverPipelineKt$pipelineWriterLoop$1.L$2;
            c4907 = (C4907) serverPipelineKt$pipelineWriterLoop$1.L$1;
            InterfaceC6031 interfaceC60313 = (InterfaceC6031) serverPipelineKt$pipelineWriterLoop$1.L$0;
            AbstractC6017.m10769(objM11032);
            r2 = interfaceC60313;
            r10 = j3;
            c5081 = c4907.f12722;
            serverPipelineKt$pipelineWriterLoop$1.L$0 = r2;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = interfaceC5084;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = r10;
            serverPipelineKt$pipelineWriterLoop$1.label = 3;
            r22 = r2;
            r102 = r10;
            if (c5081.m9259(serverPipelineKt$pipelineWriterLoop$1) == coroutineSingletons) {
            }
            j = r102;
            interfaceC6031 = r22;
            ServerPipelineKt$pipelineWriterLoop$child$1 serverPipelineKt$pipelineWriterLoop$child$122 = new ServerPipelineKt$pipelineWriterLoop$child$1(interfaceC6031, null);
            serverPipelineKt$pipelineWriterLoop$1.L$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = null;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = j;
            serverPipelineKt$pipelineWriterLoop$1.label = 1;
            objM11032 = AbstractC6231.m11032(AbstractC6231.m11040(j), serverPipelineKt$pipelineWriterLoop$child$122, serverPipelineKt$pipelineWriterLoop$1);
            if (objM11032 == coroutineSingletons) {
            }
        } else {
            if (r23 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = serverPipelineKt$pipelineWriterLoop$1.J$0;
            c4907 = (C4907) serverPipelineKt$pipelineWriterLoop$1.L$1;
            InterfaceC6031 interfaceC60314 = (InterfaceC6031) serverPipelineKt$pipelineWriterLoop$1.L$0;
            AbstractC6017.m10769(objM11032);
            r22 = interfaceC60314;
            r102 = j4;
            j = r102;
            interfaceC6031 = r22;
            ServerPipelineKt$pipelineWriterLoop$child$1 serverPipelineKt$pipelineWriterLoop$child$1222 = new ServerPipelineKt$pipelineWriterLoop$child$1(interfaceC6031, null);
            serverPipelineKt$pipelineWriterLoop$1.L$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = null;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = j;
            serverPipelineKt$pipelineWriterLoop$1.label = 1;
            objM11032 = AbstractC6231.m11032(AbstractC6231.m11040(j), serverPipelineKt$pipelineWriterLoop$child$1222, serverPipelineKt$pipelineWriterLoop$1);
            if (objM11032 == coroutineSingletons) {
                return coroutineSingletons;
            }
            r23 = interfaceC6031;
            interfaceC6031 = j;
            interfaceC5084 = (InterfaceC5084) objM11032;
            if (interfaceC5084 != null) {
                return C6008.f15084;
            }
            C5081 c50812 = c4907.f12722;
            serverPipelineKt$pipelineWriterLoop$1.L$0 = r23;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = interfaceC5084;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.label = 2;
            r2 = r23;
            r10 = interfaceC6031;
            if (AbstractC5076.m9223(interfaceC5084, c50812, serverPipelineKt$pipelineWriterLoop$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c5081 = c4907.f12722;
            serverPipelineKt$pipelineWriterLoop$1.L$0 = r2;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = interfaceC5084;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = r10;
            serverPipelineKt$pipelineWriterLoop$1.label = 3;
            r22 = r2;
            r102 = r10;
            if (c5081.m9259(serverPipelineKt$pipelineWriterLoop$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = r102;
            interfaceC6031 = r22;
            ServerPipelineKt$pipelineWriterLoop$child$1 serverPipelineKt$pipelineWriterLoop$child$12222 = new ServerPipelineKt$pipelineWriterLoop$child$1(interfaceC6031, null);
            serverPipelineKt$pipelineWriterLoop$1.L$0 = interfaceC6031;
            serverPipelineKt$pipelineWriterLoop$1.L$1 = c4907;
            serverPipelineKt$pipelineWriterLoop$1.L$2 = null;
            serverPipelineKt$pipelineWriterLoop$1.J$0 = j;
            serverPipelineKt$pipelineWriterLoop$1.label = 1;
            objM11032 = AbstractC6231.m11032(AbstractC6231.m11040(j), serverPipelineKt$pipelineWriterLoop$child$12222, serverPipelineKt$pipelineWriterLoop$1);
            if (objM11032 == coroutineSingletons) {
            }
        }
    }
}
