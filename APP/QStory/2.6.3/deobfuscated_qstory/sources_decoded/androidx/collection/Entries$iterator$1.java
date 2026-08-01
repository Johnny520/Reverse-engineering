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
@InterfaceC6862(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {1, 9, 0})
final class Entries$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C0279 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Entries$iterator$1(C0279 c0279, InterfaceC4357<? super Entries$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0279;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.this$0, interfaceC4357);
        entries$iterator$1.L$0 = obj;
        return entries$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Entries$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009b -> B:21:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b4 -> B:26:0x00b9). Please report as a decompilation issue!!! */
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
            if (r2 == 0) goto L30
            if (r2 != r5) goto L29
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            androidx.collection.飘花落叶言子楪苏哲世兰 r12 = (androidx.collection.C0279) r12
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r13 = (kotlin.sequences.AbstractC5125) r13
            kotlin.AbstractC5185.m10210(r21)
            goto L9e
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            r0 = 0
            return r0
        L30:
            kotlin.AbstractC5185.m10210(r21)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r2 = (kotlin.sequences.AbstractC5125) r2
            androidx.collection.飘花落叶言子楪苏哲世兰 r6 = r0.this$0
            androidx.collection.飘花落叶言子世兰楪苏哲 r7 = r6.f987
            long[] r7 = r7.f881
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lc3
            r9 = r3
        L43:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto Lb4
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L65:
            if (r2 >= r6) goto La8
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L9e
            int r14 = r9 << 3
            int r14 = r14 + r2
            androidx.collection.飘花落叶言子楪兰哲世苏 r15 = new androidx.collection.飘花落叶言子楪兰哲世苏
            r16 = r4
            androidx.collection.飘花落叶言子世兰楪苏哲 r4 = r12.f987
            java.lang.Object[] r5 = r4.f880
            r5 = r5[r14]
            java.lang.Object[] r4 = r4.f879
            r4 = r4[r14]
            r15.<init>(r5, r3, r4)
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r4 = 1
            r0.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = r13.mo10121(r15, r0)
            if (r5 != r1) goto La1
            return r1
        L9e:
            r16 = r4
            r4 = r5
        La1:
            long r7 = r7 >> r16
            int r2 = r2 + r4
            r5 = r4
            r4 = r16
            goto L65
        La8:
            r18 = r5
            r5 = r4
            r4 = r18
            if (r6 != r5) goto Lc3
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r13
            goto Lb9
        Lb4:
            r18 = r5
            r5 = r4
            r4 = r18
        Lb9:
            if (r9 == r8) goto Lc3
            int r9 = r9 + 1
            r18 = r5
            r5 = r4
            r4 = r18
            goto L43
        Lc3:
            kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5176.f14739
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Entries$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
