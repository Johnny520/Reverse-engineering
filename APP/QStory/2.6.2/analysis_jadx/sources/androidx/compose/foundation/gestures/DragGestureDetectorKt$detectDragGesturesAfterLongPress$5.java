package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p112.C7328;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {384, 385, 390}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $onDrag;
    final /* synthetic */ InterfaceC6542 $onDragCancel;
    final /* synthetic */ InterfaceC6542 $onDragEnd;
    final /* synthetic */ InterfaceC6557 $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(InterfaceC6557 interfaceC6557, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422, InterfaceC6553 interfaceC6553, InterfaceC4356<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> interfaceC4356) {
        super(2, interfaceC4356);
        this.$onDragStart = interfaceC6557;
        this.$onDragEnd = interfaceC6542;
        this.$onDragCancel = interfaceC65422;
        this.$onDrag = interfaceC6553;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC6553 interfaceC6553, C1643 c1643) {
        interfaceC6553.invoke(c1643, new C7328(AbstractC1646.m3021(c1643, false)));
        c1643.m3014();
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, interfaceC4356);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0079, B:35:0x0081, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1c
            java.lang.Object r0 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L79
        L19:
            r9 = move-exception
            goto Laf
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L22:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L54
        L2a:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L45
        L32:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.label = r6     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0503.m1265(r1, r3, r8, r5)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L45
            goto L77
        L45:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.ui.input.pointer.C1643) r9     // Catch: java.util.concurrent.CancellationException -> L19
            long r6 = r9.f4808     // Catch: java.util.concurrent.CancellationException -> L19
            r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.label = r5     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0468.m1227(r1, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L54
            goto L77
        L54:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.ui.input.pointer.C1643) r9     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto Lac
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r3 = r8.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L19
            long r5 = r9.f4806     // Catch: java.util.concurrent.CancellationException -> L19
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r7 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲     // Catch: java.util.concurrent.CancellationException -> L19
            r7.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L19
            r3.invoke(r7)     // Catch: java.util.concurrent.CancellationException -> L19
            long r5 = r9.f4808     // Catch: java.util.concurrent.CancellationException -> L19
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r9 = r8.$onDrag     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪 r3 = new androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪     // Catch: java.util.concurrent.CancellationException -> L19
            r3.<init>(r2, r9)     // Catch: java.util.concurrent.CancellationException -> L19
            r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.label = r4     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0468.m1232(r1, r5, r3, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L78
        L77:
            return r0
        L78:
            r0 = r1
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto La7
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r0 = (androidx.compose.ui.input.pointer.C1621) r0     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲 r9 = r0.f4740     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = r9.f4756     // Catch: java.util.concurrent.CancellationException -> L19
            java.util.List r9 = r9.f4851     // Catch: java.util.concurrent.CancellationException -> L19
            int r0 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L19
        L8d:
            if (r2 >= r0) goto La1
            java.lang.Object r1 = r9.get(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r3 = androidx.compose.ui.input.pointer.AbstractC1646.m3018(r1)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r3 == 0) goto L9e
            r1.m3014()     // Catch: java.util.concurrent.CancellationException -> L19
        L9e:
            int r2 = r2 + 1
            goto L8d
        La1:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r9 = r8.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L19
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
            goto Lac
        La7:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r9 = r8.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L19
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
        Lac:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        Laf:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r8 = r8.$onDragCancel
            r8.invoke()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
