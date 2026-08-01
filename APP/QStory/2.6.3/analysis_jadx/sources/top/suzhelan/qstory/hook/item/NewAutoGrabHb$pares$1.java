package top.suzhelan.qstory.hook.item;

import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.NewAutoGrabHb$pares$1", f = "NewAutoGrabHb.kt", l = {194, Opcodes.AND_INT_LIT16}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NewAutoGrabHb$pares$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ String $authkey;
    final /* synthetic */ String $billNo;
    final /* synthetic */ String $notice;
    final /* synthetic */ Ref$ObjectRef<String> $peerUid;
    final /* synthetic */ int $redChannel;
    final /* synthetic */ Ref$ObjectRef<String> $senderName;
    final /* synthetic */ long $senderUin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C5954 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAutoGrabHb$pares$1(int i, String str, String str2, Ref$ObjectRef<String> ref$ObjectRef, long j, C5954 c5954, String str3, Ref$ObjectRef<String> ref$ObjectRef2, InterfaceC4357<? super NewAutoGrabHb$pares$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$redChannel = i;
        this.$authkey = str;
        this.$billNo = str2;
        this.$peerUid = ref$ObjectRef;
        this.$senderUin = j;
        this.this$0 = c5954;
        this.$notice = str3;
        this.$senderName = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new NewAutoGrabHb$pares$1(this.$redChannel, this.$authkey, this.$billNo, this.$peerUid, this.$senderUin, this.this$0, this.$notice, this.$senderName, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((NewAutoGrabHb$pares$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x065b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r55) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.NewAutoGrabHb$pares$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
