package io.ktor.server.cio;

import androidx.compose.foundation.C1905;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.engine.AbstractC4922;
import io.ktor.server.engine.C4924;
import io.ktor.server.engine.InterfaceC4926;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;
import p111.C8036;
import p111.ExecutorC8037;
import p246.C8878;
import p256.C8964;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4913 extends AbstractC4922 {
    private volatile InterfaceC6284 serverJob;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7372 f12736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4914 f12737;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ExecutorC8037 f12738;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ExecutorC8037 f12739;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6270 f12740;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6283 f12741;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4913(C4924 c4924, C8878 c8878, boolean z, C4914 c4914, InterfaceC7372 interfaceC7372) {
        super(c4924, c8878, z);
        c8878.getClass();
        this.f12737 = c4914;
        this.f12736 = interfaceC7372;
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
        this.f12739 = executorC8037;
        this.f12738 = executorC8037;
        C6270 c6270M11049 = AbstractC6231.m11049();
        this.f12740 = c6270M11049;
        C6283 c6283M11047 = AbstractC6231.m11047();
        this.f12741 = c6283M11047;
        this.serverJob = AbstractC6231.m11047();
        C4924 c49242 = this.f12776;
        this.serverJob = AbstractC6231.m11036(AbstractC6231.m11048(((C4890) interfaceC7372.invoke()).f12690.plus(executorC8037)), null, CoroutineStart.LAZY, new CIOApplicationEngine$initServerJob$1(this, this.f12773, c6283M11047, c6270M11049, executorC8037, c49242, null), 1);
        this.serverJob.mo11118(new C1905(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9038(long j, long j2, ContinuationImpl continuationImpl) {
        CIOApplicationEngine$stopSuspend$1 cIOApplicationEngine$stopSuspend$1;
        if (continuationImpl instanceof CIOApplicationEngine$stopSuspend$1) {
            cIOApplicationEngine$stopSuspend$1 = (CIOApplicationEngine$stopSuspend$1) continuationImpl;
            int i = cIOApplicationEngine$stopSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationEngine$stopSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationEngine$stopSuspend$1 = new CIOApplicationEngine$stopSuspend$1(this, continuationImpl);
            }
        }
        Object objM11032 = cIOApplicationEngine$stopSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationEngine$stopSuspend$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM11032);
            this.f12741.m11114();
            CIOApplicationEngine$stopSuspend$result$1 cIOApplicationEngine$stopSuspend$result$1 = new CIOApplicationEngine$stopSuspend$result$1(this, null);
            cIOApplicationEngine$stopSuspend$1.L$0 = this;
            cIOApplicationEngine$stopSuspend$1.J$0 = j;
            cIOApplicationEngine$stopSuspend$1.J$1 = j2;
            cIOApplicationEngine$stopSuspend$1.label = 1;
            objM11032 = AbstractC6231.m11032(j, cIOApplicationEngine$stopSuspend$result$1, cIOApplicationEngine$stopSuspend$1);
            if (objM11032 != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(objM11032);
                return objM11032;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = cIOApplicationEngine$stopSuspend$1.J$1;
        j = cIOApplicationEngine$stopSuspend$1.J$0;
        this = (C4913) cIOApplicationEngine$stopSuspend$1.L$0;
        AbstractC6017.m10769(objM11032);
        if (((Boolean) objM11032) != null) {
            return C6008.f15084;
        }
        this.serverJob.mo10815(null);
        long j3 = j2 - j;
        CIOApplicationEngine$stopSuspend$2 cIOApplicationEngine$stopSuspend$2 = new CIOApplicationEngine$stopSuspend$2(this, null);
        cIOApplicationEngine$stopSuspend$1.L$0 = null;
        cIOApplicationEngine$stopSuspend$1.label = 2;
        Object objM110322 = AbstractC6231.m11032(j3, cIOApplicationEngine$stopSuspend$2, cIOApplicationEngine$stopSuspend$1);
        return objM110322 == coroutineSingletons ? coroutineSingletons : objM110322;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9039(long j, long j2) throws Throwable {
        AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$stop$1(this, j, j2, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|13)(2:14|15))(1:16))(3:17|(0)|29)|20|31|21|(2:27|(1:29))|30) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r5.error("Some handlers have thrown an exception", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9040(boolean z, ContinuationImpl continuationImpl) {
        CIOApplicationEngine$startSuspend$1 cIOApplicationEngine$startSuspend$1;
        if (continuationImpl instanceof CIOApplicationEngine$startSuspend$1) {
            cIOApplicationEngine$startSuspend$1 = (CIOApplicationEngine$startSuspend$1) continuationImpl;
            int i = cIOApplicationEngine$startSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationEngine$startSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationEngine$startSuspend$1 = new CIOApplicationEngine$startSuspend$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationEngine$startSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationEngine$startSuspend$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.serverJob.start();
            C6270 c6270 = this.f12740;
            cIOApplicationEngine$startSuspend$1.L$0 = this;
            cIOApplicationEngine$startSuspend$1.Z$0 = z;
            cIOApplicationEngine$startSuspend$1.label = 1;
            if (c6270.m11132(cIOApplicationEngine$startSuspend$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4913 c4913 = (C4913) cIOApplicationEngine$startSuspend$1.L$0;
            AbstractC6017.m10769(obj);
            return c4913;
        }
        z = cIOApplicationEngine$startSuspend$1.Z$0;
        this = (C4913) cIOApplicationEngine$startSuspend$1.L$0;
        AbstractC6017.m10769(obj);
        C8878 c8878 = this.f12775;
        C8964 c8964 = AbstractC4892.f12701;
        C4924 c4924 = this.f12776;
        InterfaceC9970 interfaceC9970 = c4924.f12782;
        c8878.getClass();
        c8878.m14091(c8964, c4924);
        if (z) {
            InterfaceC6284 interfaceC6284 = this.serverJob;
            cIOApplicationEngine$startSuspend$1.L$0 = this;
            cIOApplicationEngine$startSuspend$1.label = 2;
            if (interfaceC6284.mo11123(cIOApplicationEngine$startSuspend$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4926 m9041(boolean z) {
        return (InterfaceC4926) AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$start$1(this, z, null));
    }
}
