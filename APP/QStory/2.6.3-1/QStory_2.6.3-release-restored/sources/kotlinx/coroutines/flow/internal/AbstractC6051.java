package kotlinx.coroutines.flow.internal;

import androidx.window.area.AbstractC3400;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.flow.C6127;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import kotlinx.coroutines.internal.AbstractC6185;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5317 f15151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5317 f15152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5189[] f15153 = new InterfaceC5189[0];

    static {
        int i = 1;
        f15152 = new C5317("NULL", i);
        f15151 = new C5317("UNINITIALIZED", i);
        f15150 = new C5317("DONE", i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10857(InterfaceC5192 interfaceC5192, Object obj, Object obj2, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) throws Throwable {
        ChannelFlowKt$withContextUndispatched$1 channelFlowKt$withContextUndispatched$1;
        Object objM10927;
        Object objInvoke;
        if (interfaceC5189 instanceof ChannelFlowKt$withContextUndispatched$1) {
            channelFlowKt$withContextUndispatched$1 = (ChannelFlowKt$withContextUndispatched$1) interfaceC5189;
            int i = channelFlowKt$withContextUndispatched$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelFlowKt$withContextUndispatched$1.label = i - Integer.MIN_VALUE;
            } else {
                channelFlowKt$withContextUndispatched$1 = new ChannelFlowKt$withContextUndispatched$1(interfaceC5189);
            }
        }
        Object obj3 = channelFlowKt$withContextUndispatched$1.result;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelFlowKt$withContextUndispatched$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj5 = channelFlowKt$withContextUndispatched$1.L$6;
            InterfaceC5192 interfaceC51922 = (InterfaceC5192) channelFlowKt$withContextUndispatched$1.L$4;
            try {
                AbstractC6017.m10769(obj3);
                objM10927 = obj5;
                interfaceC5192 = interfaceC51922;
                AbstractC6185.m10930(interfaceC5192, objM10927);
                return obj3;
            } catch (Throwable th) {
                objM10927 = obj5;
                interfaceC5192 = interfaceC51922;
                th = th;
                AbstractC6185.m10930(interfaceC5192, objM10927);
                throw th;
            }
        }
        AbstractC6017.m10769(obj3);
        objM10927 = AbstractC6185.m10927(interfaceC5192, obj2);
        try {
            channelFlowKt$withContextUndispatched$1.L$0 = interfaceC5192;
            channelFlowKt$withContextUndispatched$1.L$1 = obj;
            channelFlowKt$withContextUndispatched$1.L$2 = null;
            channelFlowKt$withContextUndispatched$1.L$3 = interfaceC7383;
            channelFlowKt$withContextUndispatched$1.L$4 = interfaceC5192;
            channelFlowKt$withContextUndispatched$1.L$5 = null;
            channelFlowKt$withContextUndispatched$1.L$6 = objM10927;
            channelFlowKt$withContextUndispatched$1.L$7 = channelFlowKt$withContextUndispatched$1;
            channelFlowKt$withContextUndispatched$1.I$0 = 0;
            channelFlowKt$withContextUndispatched$1.I$1 = 0;
            channelFlowKt$withContextUndispatched$1.label = 1;
            C6056 c6056 = new C6056(channelFlowKt$withContextUndispatched$1, interfaceC5192);
            if (interfaceC7383 == null) {
                objInvoke = AbstractC3400.m5626(interfaceC7383, obj, c6056);
            } else {
                AbstractC5220.m9447(2, interfaceC7383);
                objInvoke = interfaceC7383.invoke(obj, c6056);
            }
            obj3 = objInvoke;
            if (obj3 == obj4) {
                return obj4;
            }
            AbstractC6185.m10930(interfaceC5192, objM10927);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            AbstractC6185.m10930(interfaceC5192, objM10927);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m10858(InterfaceC6150 interfaceC6150, InterfaceC6151[] interfaceC6151Arr, InterfaceC7380 interfaceC7380, SuspendLambda suspendLambda) throws Throwable {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(interfaceC6151Arr, C6127.f15224, interfaceC7380, interfaceC6150, null);
        C6058 c6058 = new C6058(suspendLambda, suspendLambda.getContext());
        Object objM5629 = AbstractC3400.m5629(c6058, true, c6058, combineKt$combineInternal$2);
        return objM5629 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5629 : C6008.f15084;
    }
}
