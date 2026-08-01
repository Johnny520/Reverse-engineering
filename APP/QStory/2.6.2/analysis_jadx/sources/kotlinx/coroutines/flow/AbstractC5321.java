package kotlinx.coroutines.flow;

import androidx.compose.foundation.lazy.C0753;
import kotlin.C5175;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C5207;
import kotlinx.coroutines.channels.InterfaceC5206;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.C5227;
import kotlinx.coroutines.flow.internal.C5232;
import kotlinx.coroutines.flow.internal.C5235;
import kotlinx.coroutines.flow.internal.InterfaceC5229;
import kotlinx.coroutines.internal.C5350;
import lin.xposed.hook.javaplugin.C5553;
import p052.InterfaceC6553;
import p089.C7179;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7179 f14893 = new C7179(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0753 f14892 = new C0753(20);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4484 f14891 = new C4484("NO_VALUE", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4484 f14890 = new C4484("NONE", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4484 f14889 = new C4484("PENDING", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC5318 m10324(InterfaceC5318 interfaceC5318) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        return interfaceC5318 instanceof InterfaceC5229 ? InterfaceC5229.m10303((InterfaceC5229) interfaceC5318, null, 0, bufferOverflow, 1) : new C5232(interfaceC5318, 0, bufferOverflow, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10325(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3e
            java.lang.Object r1 = r0.L$4
            kotlinx.coroutines.flow.飘花落叶言子苏楪哲世兰 r1 = (kotlinx.coroutines.flow.C5345) r1
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r2 = (kotlinx.coroutines.flow.InterfaceC5318) r2
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
            java.lang.Object r3 = r0.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r3 = (p052.InterfaceC6553) r3
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r3 = (kotlinx.coroutines.flow.InterfaceC5318) r3
            kotlin.AbstractC5184.m10206(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3c
            goto L70
        L3c:
            r6 = move-exception
            goto L65
        L3e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L44:
            kotlin.AbstractC5184.m10206(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            kotlinx.coroutines.flow.飘花落叶言子苏楪哲世兰 r1 = new kotlinx.coroutines.flow.飘花落叶言子苏楪哲世兰
            r1.<init>(r6)
            r0.L$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$1 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$2 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$3 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$4 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r4 = 0
            r0.I$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            throw r3
        L61:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L65:
            java.lang.Object r3 = r6.owner
            if (r3 != r1) goto L77
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r0.getContext()
            kotlinx.coroutines.AbstractC5398.m10498(r6)
        L70:
            boolean r6 = r2.element
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L77:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5321.m10325(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10326(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m10327(kotlinx.coroutines.flow.InterfaceC5317 r5, java.lang.Object r6, java.lang.Object r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2a:
            java.lang.Object r7 = r0.L$2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r5 = (kotlinx.coroutines.flow.InterfaceC5317) r5
            kotlin.AbstractC5184.m10206(r8)
            goto L46
        L34:
            kotlin.AbstractC5184.m10206(r8)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5321.m10327(kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲, java.lang.Object, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5266 m10328(Object obj) {
        if (obj == null) {
            obj = AbstractC5218.f14807;
        }
        return new C5266(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5286 m10329(int i, BufferOverflow bufferOverflow) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if (i2 <= 0 && i3 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            C5553.m10815(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new C5286(i2, i4, bufferOverflow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5268 m10330(C5283 c5283) {
        InterfaceC5206.f14794.getClass();
        C5207 c5207 = C5207.f14796;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        return new C5268(c5283, EmptyCoroutineContext.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m10331(InterfaceC5318 interfaceC5318, InterfaceC6553 interfaceC6553, ContinuationImpl continuationImpl) {
        int i = AbstractC5328.f14900;
        Object objMo8463 = m10324(new C5235(new FlowKt__MergeKt$mapLatest$1(interfaceC6553, null), interfaceC5318, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND)).mo8463(C5227.f14821, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5175 c5175 = C5175.f14739;
        if (objMo8463 != coroutineSingletons) {
            objMo8463 = c5175;
        }
        return objMo8463 == coroutineSingletons ? objMo8463 : c5175;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10332(io.ktor.serialization.C4048 r5, p052.InterfaceC6553 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3e
            java.lang.Object r5 = r0.L$4
            kotlinx.coroutines.flow.飘花落叶言子苏世兰楪哲 r5 = (kotlinx.coroutines.flow.C5324) r5
            java.lang.Object r6 = r0.L$3
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r6 = (kotlinx.coroutines.flow.InterfaceC5318) r6
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r1 = r0.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = (p052.InterfaceC6553) r1
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            kotlin.AbstractC5184.m10206(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3c
            goto L78
        L3c:
            r7 = move-exception
            goto L6d
        L3e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r4
        L44:
            kotlin.AbstractC5184.m10206(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlinx.coroutines.flow.飘花落叶言子苏世兰楪哲 r2 = new kotlinx.coroutines.flow.飘花落叶言子苏世兰楪哲
            r2.<init>(r6, r7)
            r0.L$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r0.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r0.L$2 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r0.L$3 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r0.L$4 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r6 = 0
            r0.I$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            java.lang.Object r5 = r5.mo8463(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L69
            if (r5 != r1) goto L67
            return r1
        L67:
            r6 = r7
            goto L78
        L69:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L6d:
            java.lang.Object r1 = r7.owner
            if (r1 != r5) goto L7b
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r0.getContext()
            kotlinx.coroutines.AbstractC5398.m10498(r5)
        L78:
            T r5 = r6.element
            return r5
        L7b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5321.m10332(io.ktor.serialization.飘花落叶言子楪世苏兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C5295 m10333(C5283 c5283, C5350 c5350, C5264 c5264, Float f) {
        C5268 c5268M10330 = m10330(c5283);
        C5266 c5266M10328 = m10328(f);
        return new C5295(c5266M10328, AbstractC5398.m10474(c5350, c5268M10330.f14856, c5264.equals(C5267.f14855) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(c5264, c5268M10330.f14857, c5266M10328, f, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0035, B:25:0x0060, B:29:0x0079, B:31:0x0081, B:20:0x0051, B:24:0x005c), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0097 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10334(kotlinx.coroutines.flow.InterfaceC5317 r7, kotlinx.coroutines.channels.InterfaceC5198 r8, boolean r9, kotlin.coroutines.InterfaceC4356 r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3d
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5211) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r2 = (kotlinx.coroutines.flow.InterfaceC5317) r2
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L3b
        L38:
            r10 = r7
            r7 = r2
            goto L60
        L3b:
            r7 = move-exception
            goto La2
        L3d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r5
        L43:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5211) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r2 = (kotlinx.coroutines.flow.InterfaceC5317) r2
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L3b
            goto L79
        L55:
            kotlin.AbstractC5184.m10206(r10)
            boolean r10 = r7 instanceof kotlinx.coroutines.flow.AbstractC5274
            if (r10 != 0) goto Laa
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L3b
        L60:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r4     // Catch: java.lang.Throwable -> L3b
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r10 = (kotlinx.coroutines.channels.C5190) r10     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r10.m10260(r0)     // Catch: java.lang.Throwable -> L3b
            if (r2 != r1) goto L75
            goto L99
        L75:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L9a
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5190) r7     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r7.m10258()     // Catch: java.lang.Throwable -> L3b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r1) goto L38
        L99:
            return r1
        L9a:
            if (r9 == 0) goto L9f
            r8.mo10252(r5)
        L9f:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        La2:
            throw r7     // Catch: java.lang.Throwable -> La3
        La3:
            r10 = move-exception
            if (r9 == 0) goto La9
            kotlinx.coroutines.channels.AbstractC5204.m10274(r8, r7)
        La9:
            throw r10
        Laa:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5321.m10334(kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲, kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲, boolean, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10335(kotlinx.coroutines.flow.InterfaceC5318 r6, p052.InterfaceC6553 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r0 = kotlinx.coroutines.flow.internal.AbstractC5218.f14807
            boolean r1 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r1 == 0) goto L15
            r1 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L46
            if (r3 != r4) goto L40
            java.lang.Object r6 = r1.L$4
            kotlinx.coroutines.flow.飘花落叶言子苏世哲楪兰 r6 = (kotlinx.coroutines.flow.C5326) r6
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = (kotlinx.coroutines.flow.InterfaceC5318) r7
            java.lang.Object r7 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r2 = r1.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r2 = (p052.InterfaceC6553) r2
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r2 = (kotlinx.coroutines.flow.InterfaceC5318) r2
            kotlin.AbstractC5184.m10206(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
            goto L7c
        L3e:
            r8 = move-exception
            goto L71
        L40:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r5
        L46:
            kotlin.AbstractC5184.m10206(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r0
            kotlinx.coroutines.flow.飘花落叶言子苏世哲楪兰 r3 = new kotlinx.coroutines.flow.飘花落叶言子苏世哲楪兰
            r3.<init>(r7, r8)
            r1.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r1.L$1 = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r1.L$2 = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r1.L$3 = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r1.L$4 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r7 = 0
            r1.I$0 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            r1.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            java.lang.Object r6 = r6.mo8463(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6d
            if (r6 != r2) goto L6b
            return r2
        L6b:
            r7 = r8
            goto L7c
        L6d:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L71:
            java.lang.Object r2 = r8.owner
            if (r2 != r6) goto L87
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r1.getContext()
            kotlinx.coroutines.AbstractC5398.m10498(r6)
        L7c:
            T r6 = r7.element
            if (r6 == r0) goto L81
            return r6
        L81:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            io.ktor.util.C4210.m8627(r6)
            return r5
        L87:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5321.m10335(kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
