package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C0922 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6554 $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextClassifier textClassifier, InterfaceC6554 interfaceC6554, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$textClassificationSession = textClassifier;
            this.$block = interfaceC6554;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$textClassificationSession, this.$block, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return obj;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            InterfaceC6554 interfaceC6554 = this.$block;
            this.label = 1;
            Object objInvoke = interfaceC6554.invoke(textClassifier, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(C0922 c0922, InterfaceC6554 interfaceC6554, InterfaceC4357<? super PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0922;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.this$0, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L32
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L14
            kotlin.AbstractC5185.m10210(r10)
            return r10
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r5
        L1a:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r1 = (kotlinx.coroutines.sync.InterfaceC5383) r1
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L22
            goto L6b
        L22:
            r9 = move-exception
            goto L8b
        L25:
            java.lang.Object r1 = r9.L$1
            androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世 r1 = (androidx.compose.foundation.text.selection.C0922) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r4 = (kotlinx.coroutines.sync.InterfaceC5383) r4
            kotlin.AbstractC5185.m10210(r10)
            r10 = r4
            goto L46
        L32:
            kotlin.AbstractC5185.m10210(r10)
            androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世 r1 = r9.this$0
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r10 = r1.f2616
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r4
            java.lang.Object r4 = r10.m10427(r9)
            if (r4 != r0) goto L46
            goto L89
        L46:
            android.view.textclassifier.TextClassifier r4 = r1.f2615     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L54
            boolean r6 = androidx.activity.AbstractC0045.m108(r4)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L6f
            goto L54
        L51:
            r9 = move-exception
            r1 = r10
            goto L8b
        L54:
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 r4 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1     // Catch: java.lang.Throwable -> L51
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L51
            r9.L$0 = r10     // Catch: java.lang.Throwable -> L51
            r9.L$1 = r5     // Catch: java.lang.Throwable -> L51
            r9.label = r3     // Catch: java.lang.Throwable -> L51
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = kotlinx.coroutines.AbstractC5399.m10473(r6, r4, r9)     // Catch: java.lang.Throwable -> L51
            if (r1 != r0) goto L68
            goto L89
        L68:
            r8 = r1
            r1 = r10
            r10 = r8
        L6b:
            r4 = r10
            android.view.textclassifier.TextClassifier r4 = (android.view.textclassifier.TextClassifier) r4     // Catch: java.lang.Throwable -> L22
            r10 = r1
        L6f:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r10 = (kotlinx.coroutines.sync.C5380) r10
            r10.m10432(r5)
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1 r10 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = r9.$block
            r10.<init>(r4, r1, r5)
            r9.L$0 = r5
            r9.L$1 = r5
            r9.label = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5399.m10473(r1, r10, r9)
            if (r9 != r0) goto L8a
        L89:
            return r0
        L8a:
            return r9
        L8b:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.sync.C5380) r1
            r1.m10432(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
