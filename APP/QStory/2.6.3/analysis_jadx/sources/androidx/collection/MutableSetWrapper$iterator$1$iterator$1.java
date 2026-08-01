package androidx.collection;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C0237 this$0;
    final /* synthetic */ C0238 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(C0237 c0237, C0238 c0238, InterfaceC4357<? super MutableSetWrapper$iterator$1$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0237;
        this.this$1 = c0238;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC4357);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0056 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0075 -> B:20:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2c
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$3
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$2
            androidx.collection.飘花落叶言子世兰苏哲楪 r12 = (androidx.collection.C0237) r12
            java.lang.Object r13 = r0.L$1
            androidx.collection.飘花落叶言子世兰苏楪哲 r13 = (androidx.collection.C0238) r13
            java.lang.Object r14 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r14 = (kotlin.sequences.AbstractC5125) r14
            kotlin.AbstractC5185.m10210(r22)
            goto L9d
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            r0 = 0
            return r0
        L33:
            kotlin.AbstractC5185.m10210(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r2 = (kotlin.sequences.AbstractC5125) r2
            androidx.collection.飘花落叶言子世兰苏哲楪 r6 = r0.this$0
            androidx.collection.飘花落叶言子世兰楪哲苏 r7 = r6.f882
            androidx.collection.飘花落叶言子世兰苏楪哲 r8 = r0.this$1
            long[] r7 = r7.f1001
            int r9 = r7.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lae
            r10 = 0
        L48:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La9
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r8
            r7 = r19
        L6c:
            if (r2 >= r6) goto La0
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L9d
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f885 = r15
            androidx.collection.飘花落叶言子世兰楪哲苏 r3 = r12.f882
            java.lang.Object[] r3 = r3.f1000
            r3 = r3[r15]
            r0.L$0 = r14
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r14.mo10121(r3, r0)
            if (r3 != r1) goto L9d
            return r1
        L9d:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L6c
        La0:
            if (r6 != r4) goto Lae
            r2 = r10
            r10 = r9
            r9 = r2
            r7 = r11
            r6 = r12
            r8 = r13
            r2 = r14
        La9:
            if (r10 == r9) goto Lae
            int r10 = r10 + 1
            goto L48
        Lae:
            kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5176.f14739
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
