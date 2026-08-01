package androidx.collection;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C0240 this$0;
    final /* synthetic */ C0239 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(C0240 c0240, C0239 c0239, InterfaceC4356<? super MutableOrderedSetWrapper$iterator$1$iterator$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0240;
        this.this$1 = c0239;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC4356);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:6:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L22
            int r1 = r11.I$0
            java.lang.Object r3 = r11.L$3
            long[] r3 = (long[]) r3
            java.lang.Object r4 = r11.L$2
            androidx.collection.飘花落叶言子世哲兰苏楪 r4 = (androidx.collection.C0240) r4
            java.lang.Object r5 = r11.L$1
            androidx.collection.飘花落叶言子世哲兰楪苏 r5 = (androidx.collection.C0239) r5
            java.lang.Object r6 = r11.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r6 = (kotlin.sequences.AbstractC5124) r6
            kotlin.AbstractC5184.m10206(r12)
            r12 = r5
            r5 = r3
        L20:
            r3 = r1
            goto L3d
        L22:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            r11 = 0
            return r11
        L29:
            kotlin.AbstractC5184.m10206(r12)
            java.lang.Object r12 = r11.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r12 = (kotlin.sequences.AbstractC5124) r12
            androidx.collection.飘花落叶言子世哲兰苏楪 r1 = r11.this$0
            androidx.collection.飘花落叶言子世哲苏兰楪 r3 = r1.f889
            androidx.collection.飘花落叶言子世哲兰楪苏 r4 = r11.this$1
            long[] r5 = r3.f1011
            int r3 = r3.f1009
            r6 = r12
            r12 = r4
            r4 = r1
        L3d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto L67
            r7 = r5[r3]
            r1 = 31
            long r7 = r7 >> r1
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 & r9
            int r1 = (int) r7
            r12.f888 = r3
            androidx.collection.飘花落叶言子世哲苏兰楪 r7 = r4.f889
            java.lang.Object[] r7 = r7.f1012
            r3 = r7[r3]
            r11.L$0 = r6
            r11.L$1 = r12
            r11.L$2 = r4
            r11.L$3 = r5
            r11.I$0 = r1
            r11.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r6.mo10117(r3, r11)
            if (r3 != r0) goto L20
            return r0
        L67:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
