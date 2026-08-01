package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.flow.C5294;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6550;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4484 f14805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4484 f14806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4484 f14807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC4356[] f14808 = new InterfaceC4356[0];

    static {
        int i = 1;
        f14807 = new C4484("NULL", i);
        f14806 = new C4484("UNINITIALIZED", i);
        f14805 = new C4484("DONE", i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10294(kotlin.coroutines.InterfaceC4359 r6, java.lang.Object r7, java.lang.Object r8, p052.InterfaceC6553 r9, kotlin.coroutines.InterfaceC4356 r10) throws java.lang.Throwable {
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
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = (kotlin.coroutines.InterfaceC4359) r7
            java.lang.Object r8 = r0.L$3
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6553) r8
            java.lang.Object r8 = r0.L$0
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r8 = (kotlin.coroutines.InterfaceC4359) r8
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L3c
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
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L48:
            kotlin.AbstractC5184.m10206(r10)
            java.lang.Object r8 = kotlinx.coroutines.internal.AbstractC5352.m10364(r6, r8)
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
            java.lang.Object r7 = com.bumptech.glide.AbstractC3054.m6574(r9, r7, r10)     // Catch: java.lang.Throwable -> L73
        L71:
            r10 = r7
            goto L7e
        L73:
            r7 = move-exception
            goto L85
        L75:
            r0 = 2
            kotlin.jvm.internal.AbstractC4387.m8898(r0, r9)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = r9.invoke(r7, r10)     // Catch: java.lang.Throwable -> L73
            goto L71
        L7e:
            if (r10 != r1) goto L81
            return r1
        L81:
            kotlinx.coroutines.internal.AbstractC5352.m10367(r6, r8)
            return r10
        L85:
            kotlinx.coroutines.internal.AbstractC5352.m10367(r6, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5218.m10294(kotlin.coroutines.飘花落叶言子楪苏世兰哲, java.lang.Object, java.lang.Object, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m10295(InterfaceC5317 interfaceC5317, InterfaceC5318[] interfaceC5318Arr, InterfaceC6550 interfaceC6550, SuspendLambda suspendLambda) throws Throwable {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(interfaceC5318Arr, C5294.f14879, interfaceC6550, interfaceC5317, null);
        C5225 c5225 = new C5225(suspendLambda, suspendLambda.getContext());
        Object objM11999 = AbstractC6560.m11999(c5225, true, c5225, combineKt$combineInternal$2);
        return objM11999 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11999 : C5175.f14739;
    }
}
