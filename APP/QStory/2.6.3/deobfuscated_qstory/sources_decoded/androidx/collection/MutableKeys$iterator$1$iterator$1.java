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
@InterfaceC6862(c = "androidx.collection.MutableKeys$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1622}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class MutableKeys$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC0256 this$0;

    public MutableKeys$iterator$1$iterator$1(AbstractC0256 abstractC0256, InterfaceC4357<? super MutableKeys$iterator$1$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MutableKeys$iterator$1$iterator$1 mutableKeys$iterator$1$iterator$1 = new MutableKeys$iterator$1$iterator$1(null, interfaceC4357);
        mutableKeys$iterator$1$iterator$1.L$0 = obj;
        return mutableKeys$iterator$1$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MutableKeys$iterator$1$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r2 = 8 - ((~(r6 - r7)) >>> 31);
        r1 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.label
            r2 = 0
            if (r1 == 0) goto L75
            r3 = 1
            if (r1 != r3) goto L6f
            int r1 = r14.I$3
            int r2 = r14.I$2
            long r4 = r14.J$0
            int r6 = r14.I$1
            int r7 = r14.I$0
            java.lang.Object r8 = r14.L$1
            long[] r8 = (long[]) r8
            java.lang.Object r9 = r14.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r9 = (kotlin.sequences.AbstractC5125) r9
            kotlin.AbstractC5185.m10210(r15)
        L1f:
            r15 = 8
            long r4 = r4 >> r15
            int r1 = r1 + r3
        L23:
            if (r1 >= r2) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L1f
            int r15 = r6 << 3
            int r15 = r15 + r1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r15)
            r14.L$0 = r9
            r14.L$1 = r8
            r14.I$0 = r7
            r14.I$1 = r6
            r14.J$0 = r4
            r14.I$2 = r2
            r14.I$3 = r1
            r14.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = r9.mo10121(r10, r14)
            if (r15 != r0) goto L1f
            return r0
        L4d:
            if (r2 != r15) goto L6c
        L4f:
            if (r6 == r7) goto L6c
            int r6 = r6 + 1
            r4 = r8[r6]
            long r1 = ~r4
            r10 = 7
            long r1 = r1 << r10
            long r1 = r1 & r4
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r10
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L4f
            int r1 = r6 - r7
            int r1 = ~r1
            int r1 = r1 >>> 31
            int r2 = 8 - r1
            r1 = 0
            goto L23
        L6c:
            kotlin.飘花落叶言子楪兰苏哲世 r14 = kotlin.C5176.f14739
            return r14
        L6f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r14)
            return r2
        L75:
            kotlin.AbstractC5185.m10210(r15)
            java.lang.Object r14 = r14.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r14 = (kotlin.sequences.AbstractC5125) r14
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
