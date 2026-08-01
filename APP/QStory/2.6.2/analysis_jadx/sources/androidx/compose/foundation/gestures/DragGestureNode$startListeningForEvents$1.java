package androidx.compose.foundation.gestures;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {508, 510, 512, 519, 521, 524}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC0463 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "processDelta", "<anonymous>", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {515}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ Ref$ObjectRef<AbstractC0469> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC0463 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<AbstractC0469> ref$ObjectRef, AbstractC0463 abstractC0463, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$event = ref$ObjectRef;
            this.this$0 = abstractC0463;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC6557 interfaceC6557, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC6557, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:26:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L16
                java.lang.Object r1 = r5.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r4 = r5.L$0
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = (p052.InterfaceC6557) r4
                kotlin.AbstractC5184.m10206(r6)
                goto L52
            L16:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r5)
                return r2
            L1c:
                kotlin.AbstractC5184.m10206(r6)
                java.lang.Object r6 = r5.L$0
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r6 = (p052.InterfaceC6557) r6
                r4 = r6
            L24:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.飘花落叶言子世哲楪兰苏> r6 = r5.$event
                T r6 = r6.element
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.C0470
                if (r1 != 0) goto L59
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.C0481
                if (r1 != 0) goto L59
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.C0480
                if (r1 == 0) goto L37
                androidx.compose.foundation.gestures.飘花落叶言子世苏兰楪哲 r6 = (androidx.compose.foundation.gestures.C0480) r6
                goto L38
            L37:
                r6 = r2
            L38:
                if (r6 == 0) goto L3d
                r4.invoke(r6)
            L3d:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.飘花落叶言子世哲楪兰苏> r1 = r5.$event
                androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏 r6 = r5.this$0
                kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r6 = r6.f1416
                if (r6 == 0) goto L55
                r5.L$0 = r4
                r5.L$1 = r1
                r5.label = r3
                java.lang.Object r6 = kotlinx.coroutines.channels.C5189.m10218(r6, r5)
                if (r6 != r0) goto L52
                return r0
            L52:
                androidx.compose.foundation.gestures.飘花落叶言子世哲楪兰苏 r6 = (androidx.compose.foundation.gestures.AbstractC0469) r6
                goto L56
            L55:
                r6 = r2
            L56:
                r1.element = r6
                goto L24
            L59:
                kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(AbstractC0463 abstractC0463, InterfaceC4356<? super DragGestureNode$startListeningForEvents$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC0463;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, interfaceC4356);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DragGestureNode$startListeningForEvents$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0463.m1209(r9, r8) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x00e3, B:43:0x00cf], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:49:0x00e7, B:19:0x005c], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
  0x0032: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002f, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v8 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) = (r4v5 kotlinx.coroutines.飘花落叶言子世楪哲兰苏), (r4v10 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) binds: [B:13:0x002f, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r5
  0x005c: PHI (r5v8 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) = 
  (r5v0 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v6 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v9 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
 binds: [B:18:0x0054, B:48:0x00e5, B:50:0x00f4, B:44:0x00de, B:30:0x008a, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:41:0x00c9, B:43:0x00cf, B:47:0x00e3, B:49:0x00e7), top: B:57:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:41:0x00c9, B:43:0x00cf, B:47:0x00e3, B:49:0x00e7), top: B:57:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008a -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00de -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e5 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f4 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0104 -> B:11:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
