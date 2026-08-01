package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.selects.WhileSelectKt", m556f = "WhileSelect.kt", m557l = {34}, m558m = "whileSelect", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 176)
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public WhileSelectKt$whileSelect$1(InterfaceC5189<? super WhileSelectKt$whileSelect$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:12:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r7.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L27
            if (r0 != r3) goto L21
            int r0 = r7.I$0
            java.lang.Object r5 = r7.L$1
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r5 = (kotlinx.coroutines.selects.C6201) r5
            java.lang.Object r5 = r7.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = (p068.InterfaceC7387) r5
            kotlin.AbstractC6017.m10769(r8)
            goto L4b
        L21:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r7)
            return r2
        L27:
            kotlin.AbstractC6017.m10769(r8)
            r5 = r2
            r0 = r4
        L2c:
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r8 = new kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r7.getContext()
            r8.<init>(r6)
            r5.invoke(r8)
            r7.L$0 = r5
            r7.L$1 = r2
            r7.I$0 = r0
            r7.I$1 = r4
            r7.I$2 = r4
            r7.label = r3
            java.lang.Object r8 = r8.m10978(r7)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L2c
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C6008.f15084
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
