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
@InterfaceC6861(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class SetWrapper$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC0284 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetWrapper$iterator$1(AbstractC0284 abstractC0284, InterfaceC4356<? super SetWrapper$iterator$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC0284;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SetWrapper$iterator$1 setWrapper$iterator$1 = new SetWrapper$iterator$1(this.this$0, interfaceC4356);
        setWrapper$iterator$1.L$0 = obj;
        return setWrapper$iterator$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SetWrapper$iterator$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:23:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:20:0x008e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L28
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r13 = (kotlin.sequences.AbstractC5124) r13
            kotlin.AbstractC5184.m10206(r21)
            goto L8e
        L28:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            r0 = 0
            return r0
        L2f:
            kotlin.AbstractC5184.m10206(r21)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r2 = (kotlin.sequences.AbstractC5124) r2
            androidx.collection.飘花落叶言子苏世哲楪兰 r6 = r0.this$0
            androidx.collection.飘花落叶言子世兰楪哲苏 r6 = r6.f996
            java.lang.Object[] r7 = r6.f1000
            long[] r6 = r6.f1001
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r9 = r3
        L44:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L65:
            if (r2 >= r6) goto L91
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8e
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r14 = r13.mo10117(r14, r0)
            if (r14 != r1) goto L8e
            return r1
        L8e:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L91:
            if (r6 != r4) goto L9c
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L97:
            if (r9 == r8) goto L9c
            int r9 = r9 + 1
            goto L44
        L9c:
            kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5175.f14739
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
