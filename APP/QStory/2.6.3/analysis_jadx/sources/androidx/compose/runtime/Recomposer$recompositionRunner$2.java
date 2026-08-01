package androidx.compose.runtime;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $block;
    final /* synthetic */ InterfaceC1304 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1383 this$0;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6551 $block;
        final /* synthetic */ InterfaceC1304 $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6551 interfaceC6551, InterfaceC1304 interfaceC1304, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$block = interfaceC6551;
            this.$parentFrameClock = interfaceC1304;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
                InterfaceC6551 interfaceC6551 = this.$block;
                InterfaceC1304 interfaceC1304 = this.$parentFrameClock;
                this.label = 1;
                if (interfaceC6551.invoke(interfaceC5401, interfaceC1304, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(C1383 c1383, InterfaceC6551 interfaceC6551, InterfaceC1304 interfaceC1304, InterfaceC4357<? super Recomposer$recompositionRunner$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1383;
        this.$block = interfaceC6551;
        this.$parentFrameClock = interfaceC1304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.C5176 invokeSuspend$lambda$0(androidx.compose.runtime.C1383 r18, java.util.Set r19, androidx.compose.runtime.snapshots.AbstractC1286 r20) {
        /*
            r0 = r18
            r1 = r19
            java.lang.Object r2 = r0.f3996
            monitor-enter(r2)
            kotlinx.coroutines.flow.飘花落叶言子兰世苏楪哲 r3 = r0.f4004     // Catch: java.lang.Throwable -> L65
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L65
            androidx.compose.runtime.Recomposer$State r3 = (androidx.compose.runtime.Recomposer$State) r3     // Catch: java.lang.Throwable -> L65
            androidx.compose.runtime.Recomposer$State r4 = androidx.compose.runtime.Recomposer$State.Idle     // Catch: java.lang.Throwable -> L65
            int r3 = r3.compareTo(r4)     // Catch: java.lang.Throwable -> L65
            if (r3 < 0) goto L9c
            androidx.collection.飘花落叶言子世兰楪哲苏 r3 = r0.f4011     // Catch: java.lang.Throwable -> L65
            boolean r4 = r1 instanceof androidx.compose.runtime.collection.C1222     // Catch: java.lang.Throwable -> L65
            r5 = 1
            if (r4 == 0) goto L75
            androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏 r1 = (androidx.compose.runtime.collection.C1222) r1     // Catch: java.lang.Throwable -> L65
            androidx.collection.飘花落叶言子苏世楪哲兰 r1 = r1.f3518     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r4 = r1.f1000     // Catch: java.lang.Throwable -> L65
            long[] r1 = r1.f1001     // Catch: java.lang.Throwable -> L65
            int r6 = r1.length     // Catch: java.lang.Throwable -> L65
            int r6 = r6 + (-2)
            if (r6 < 0) goto L97
            r7 = 0
            r8 = r7
        L2d:
            r9 = r1[r8]     // Catch: java.lang.Throwable -> L65
            long r11 = ~r9     // Catch: java.lang.Throwable -> L65
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L70
            int r11 = r8 - r6
            int r11 = ~r11     // Catch: java.lang.Throwable -> L65
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L47:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6a
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r4[r14]     // Catch: java.lang.Throwable -> L65
            boolean r15 = r14 instanceof androidx.compose.runtime.snapshots.AbstractC1256     // Catch: java.lang.Throwable -> L65
            if (r15 == 0) goto L67
            r15 = r14
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰苏哲 r15 = (androidx.compose.runtime.snapshots.AbstractC1256) r15     // Catch: java.lang.Throwable -> L65
            boolean r15 = r15.m2198(r5)     // Catch: java.lang.Throwable -> L65
            if (r15 != 0) goto L67
            goto L6a
        L65:
            r0 = move-exception
            goto Lae
        L67:
            r3.m741(r14)     // Catch: java.lang.Throwable -> L65
        L6a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L47
        L6e:
            if (r11 != r12) goto L97
        L70:
            if (r8 == r6) goto L97
            int r8 = r8 + 1
            goto L2d
        L75:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L65
        L7b:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L97
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L65
            boolean r6 = r4 instanceof androidx.compose.runtime.snapshots.AbstractC1256     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L93
            r6 = r4
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰苏哲 r6 = (androidx.compose.runtime.snapshots.AbstractC1256) r6     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.m2198(r5)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L93
            goto L7b
        L93:
            r3.m741(r4)     // Catch: java.lang.Throwable -> L65
            goto L7b
        L97:
            kotlinx.coroutines.飘花落叶言子楪苏哲兰世 r0 = r0.m2520()     // Catch: java.lang.Throwable -> L65
            goto L9d
        L9c:
            r0 = 0
        L9d:
            monitor-exit(r2)
            if (r0 == 0) goto Lab
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5176.f14739
            java.lang.Object r1 = kotlin.Result.m8745constructorimpl(r1)
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r0 = (kotlinx.coroutines.C5444) r0
            r0.resumeWith(r1)
        Lab:
            kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5176.f14739
            return r0
        Lae:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend$lambda$0(androidx.compose.runtime.飘花落叶言子苏兰哲世楪, java.util.Set, androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰):kotlin.飘花落叶言子楪兰苏哲世");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, interfaceC4357);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Recomposer$recompositionRunner$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
