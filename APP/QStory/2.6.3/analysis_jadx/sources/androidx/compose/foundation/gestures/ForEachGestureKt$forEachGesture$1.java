package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, 56}, m = "forEachGesture", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$forEachGesture$1(InterfaceC4357<? super ForEachGestureKt$forEachGesture$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r12 != r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003f, code lost:
    
        if (r12 != r1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r11.result = r12
            int r0 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r11.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            kotlin.飘花落叶言子楪兰苏哲世 r2 = kotlin.C5176.f14739
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L55
            if (r0 == r6) goto L45
            if (r0 == r5) goto L30
            if (r0 != r4) goto L2a
            java.lang.Object r0 = r11.L$2
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = (kotlin.coroutines.InterfaceC4360) r0
            java.lang.Object r7 = r11.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = (p052.InterfaceC6554) r7
            java.lang.Object r8 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪兰世哲苏 r8 = (androidx.compose.ui.input.pointer.InterfaceC1635) r8
            kotlin.AbstractC5185.m10210(r12)
            goto L3f
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r3
        L30:
            java.lang.Object r0 = r11.L$2
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = (kotlin.coroutines.InterfaceC4360) r0
            java.lang.Object r7 = r11.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = (p052.InterfaceC6554) r7
            java.lang.Object r8 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪兰世哲苏 r8 = (androidx.compose.ui.input.pointer.InterfaceC1635) r8
            kotlin.AbstractC5185.m10210(r12)     // Catch: java.util.concurrent.CancellationException -> L43
        L3f:
            r12 = r0
            r0 = r7
            r7 = r8
            goto L5e
        L43:
            r12 = move-exception
            goto L99
        L45:
            java.lang.Object r0 = r11.L$2
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = (kotlin.coroutines.InterfaceC4360) r0
            java.lang.Object r7 = r11.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = (p052.InterfaceC6554) r7
            java.lang.Object r8 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪兰世哲苏 r8 = (androidx.compose.ui.input.pointer.InterfaceC1635) r8
            kotlin.AbstractC5185.m10210(r12)     // Catch: java.util.concurrent.CancellationException -> L43
            goto L76
        L55:
            kotlin.AbstractC5185.m10210(r12)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r12 = r11.getContext()
            r0 = r3
            r7 = r0
        L5e:
            boolean r8 = kotlinx.coroutines.AbstractC5399.m10494(r12)
            if (r8 == 0) goto Lbd
            r11.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L93
            r11.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L93
            r11.L$2 = r12     // Catch: java.util.concurrent.CancellationException -> L93
            r11.label = r6     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Object r8 = r0.invoke(r7, r11)     // Catch: java.util.concurrent.CancellationException -> L93
            if (r8 != r1) goto L73
            goto Lbe
        L73:
            r8 = r7
            r7 = r0
            r0 = r12
        L76:
            r11.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r11.L$1 = r7     // Catch: java.util.concurrent.CancellationException -> L43
            r11.L$2 = r0     // Catch: java.util.concurrent.CancellationException -> L43
            r11.label = r5     // Catch: java.util.concurrent.CancellationException -> L43
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r12 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2     // Catch: java.util.concurrent.CancellationException -> L43
            r12.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L43
            r9 = r8
            androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲 r9 = (androidx.compose.ui.input.pointer.C1627) r9     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r12 = r9.m3005(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L43
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch: java.util.concurrent.CancellationException -> L43
            if (r12 != r9) goto L8f
            goto L90
        L8f:
            r12 = r2
        L90:
            if (r12 != r1) goto L3f
            goto Lbe
        L93:
            r8 = move-exception
            r10 = r0
            r0 = r12
            r12 = r8
            r8 = r7
            r7 = r10
        L99:
            boolean r9 = kotlinx.coroutines.AbstractC5399.m10494(r0)
            if (r9 == 0) goto Lbc
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r0
            r11.label = r4
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r12 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2
            r12.<init>(r3)
            r9 = r8
            androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲 r9 = (androidx.compose.ui.input.pointer.C1627) r9
            java.lang.Object r12 = r9.m3005(r12, r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r12 != r9) goto Lb8
            goto Lb9
        Lb8:
            r12 = r2
        Lb9:
            if (r12 != r1) goto L3f
            goto Lbe
        Lbc:
            throw r12
        Lbd:
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
