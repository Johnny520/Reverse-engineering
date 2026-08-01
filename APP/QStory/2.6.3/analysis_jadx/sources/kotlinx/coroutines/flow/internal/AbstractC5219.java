package kotlinx.coroutines.flow.internal;

import androidx.window.area.AbstractC2567;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.flow.C5295;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f14805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4485 f14806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f14807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC4357[] f14808 = new InterfaceC4357[0];

    static {
        int i = 1;
        f14807 = new C4485("NULL", i);
        f14806 = new C4485("UNINITIALIZED", i);
        f14805 = new C4485("DONE", i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10298(kotlin.coroutines.InterfaceC4360 r6, java.lang.Object r7, java.lang.Object r8, p052.InterfaceC6554 r9, kotlin.coroutines.InterfaceC4357 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L42
            java.lang.Object r6 = r0.L$7
            kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1 r6 = (kotlinx.coroutines.flow.internal.ChannelFlowKt$withContextUndispatched$1) r6
            java.lang.Object r6 = r0.L$6
            java.lang.Object r7 = r0.L$4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = (kotlin.coroutines.InterfaceC4360) r7
            java.lang.Object r8 = r0.L$3
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6554) r8
            java.lang.Object r8 = r0.L$0
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r8 = (kotlin.coroutines.InterfaceC4360) r8
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L3c
            r8 = r6
            r6 = r7
            goto L81
        L3c:
            r8 = move-exception
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L85
        L42:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L48:
            kotlin.AbstractC5185.m10210(r10)
            java.lang.Object r8 = kotlinx.coroutines.internal.AbstractC5353.m10368(r6, r8)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L73
            r0.L$3 = r9     // Catch: java.lang.Throwable -> L73
            r0.L$4 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$5 = r3     // Catch: java.lang.Throwable -> L73
            r0.L$6 = r8     // Catch: java.lang.Throwable -> L73
            r0.L$7 = r0     // Catch: java.lang.Throwable -> L73
            r10 = 0
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L73
            r0.I$1 = r10     // Catch: java.lang.Throwable -> L73
            r0.label = r4     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏世哲 r10 = new kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏世哲     // Catch: java.lang.Throwable -> L73
            r10.<init>(r0, r6)     // Catch: java.lang.Throwable -> L73
            if (r9 != 0) goto L75
            java.lang.Object r7 = androidx.window.area.AbstractC2567.m5066(r9, r7, r10)     // Catch: java.lang.Throwable -> L73
        L71:
            r10 = r7
            goto L7e
        L73:
            r7 = move-exception
            goto L85
        L75:
            r0 = 2
            kotlin.jvm.internal.AbstractC4388.m8888(r0, r9)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = r9.invoke(r7, r10)     // Catch: java.lang.Throwable -> L73
            goto L71
        L7e:
            if (r10 != r1) goto L81
            return r1
        L81:
            kotlinx.coroutines.internal.AbstractC5353.m10371(r6, r8)
            return r10
        L85:
            kotlinx.coroutines.internal.AbstractC5353.m10371(r6, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5219.m10298(kotlin.coroutines.飘花落叶言子楪苏世兰哲, java.lang.Object, java.lang.Object, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m10299(InterfaceC5318 interfaceC5318, InterfaceC5319[] interfaceC5319Arr, InterfaceC6551 interfaceC6551, SuspendLambda suspendLambda) throws Throwable {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(interfaceC5319Arr, C5295.f14879, interfaceC6551, interfaceC5318, null);
        C5226 c5226 = new C5226(suspendLambda, suspendLambda.getContext());
        Object objM5069 = AbstractC2567.m5069(c5226, true, c5226, combineKt$combineInternal$2);
        return objM5069 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5069 : C5176.f14739;
    }
}
