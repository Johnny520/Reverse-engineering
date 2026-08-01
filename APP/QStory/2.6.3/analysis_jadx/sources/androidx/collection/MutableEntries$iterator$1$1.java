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
@InterfaceC6862(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", l = {1538}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class MutableEntries$iterator$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
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
    final /* synthetic */ AbstractC0249 this$0;
    final /* synthetic */ AbstractC0250 this$1;

    public MutableEntries$iterator$1$1(AbstractC0249 abstractC0249, AbstractC0250 abstractC0250, InterfaceC4357<? super MutableEntries$iterator$1$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MutableEntries$iterator$1$1 mutableEntries$iterator$1$1 = new MutableEntries$iterator$1$1(null, null, interfaceC4357);
        mutableEntries$iterator$1$1.L$0 = obj;
        return mutableEntries$iterator$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MutableEntries$iterator$1$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r3 = 8 - ((~(r6 - r7)) >>> 31);
        r0 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 0
            if (r0 == 0) goto L68
            r2 = 1
            if (r0 != r2) goto L62
            int r0 = r13.I$3
            int r3 = r13.I$2
            long r4 = r13.J$0
            int r6 = r13.I$1
            int r7 = r13.I$0
            java.lang.Object r8 = r13.L$3
            long[] r8 = (long[]) r8
            java.lang.Object r9 = r13.L$2
            if (r9 != 0) goto L5e
            java.lang.Object r9 = r13.L$1
            if (r9 != 0) goto L5a
            java.lang.Object r13 = r13.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r13 = (kotlin.sequences.AbstractC5125) r13
            kotlin.AbstractC5185.m10210(r14)
        L27:
            r13 = 8
            long r4 = r4 >> r13
            int r0 = r0 + r2
        L2b:
            if (r0 >= r3) goto L38
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r4
            r9 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 < 0) goto L37
            goto L27
        L37:
            throw r1
        L38:
            if (r3 != r13) goto L57
        L3a:
            if (r6 == r7) goto L57
            int r6 = r6 + 1
            r4 = r8[r6]
            long r9 = ~r4
            r14 = 7
            long r9 = r9 << r14
            long r9 = r9 & r4
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 == 0) goto L3a
            int r14 = r6 - r7
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r3 = 8 - r14
            r0 = 0
            goto L2b
        L57:
            kotlin.飘花落叶言子楪兰苏哲世 r13 = kotlin.C5176.f14739
            return r13
        L5a:
            com.alibaba.fastjson2.C2942.m6394()
            return r1
        L5e:
            com.alibaba.fastjson2.C2942.m6394()
            return r1
        L62:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r13)
            return r1
        L68:
            kotlin.AbstractC5185.m10210(r14)
            java.lang.Object r13 = r13.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r13 = (kotlin.sequences.AbstractC5125) r13
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries$iterator$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
