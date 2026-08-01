package io.ktor.network.tls;

import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6026;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.p010io.C6309;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSClientHandshake$output$1", m556f = "TLSClientHandshake.kt", m557l = {108, 113, 119, 129, 119, 129}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪世苏哲兰;", "Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TLSClientHandshake$output$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5079 $rawOutput;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$output$1(AbstractC4873 abstractC4873, InterfaceC5079 interfaceC5079, InterfaceC5189<? super TLSClientHandshake$output$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4873;
        this.$rawOutput = interfaceC5079;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TLSClientHandshake$output$1 tLSClientHandshake$output$1 = new TLSClientHandshake$output$1(this.this$0, this.$rawOutput, interfaceC5189);
        tLSClientHandshake$output$1.L$0 = obj;
        return tLSClientHandshake$output$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6026 interfaceC6026, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TLSClientHandshake$output$1) create(interfaceC6026, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r10).m9263(r9) != r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:22:0x0067, B:26:0x007c, B:28:0x0084, B:38:0x00ae, B:16:0x0048, B:21:0x0056, B:11:0x0036, B:30:0x008e, B:33:0x0095, B:36:0x00a8, B:37:0x00ad), top: B:58:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:39:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ae -> B:39:0x00b7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5079 interfaceC5079;
        Object obj2;
        int i;
        Object obj3;
        ?? r4;
        Object obj4;
        ?? r42;
        Object objM10823;
        ?? r43;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
        } catch (Throwable th) {
            th = th;
            InterfaceC5079 interfaceC50792 = this.$rawOutput;
            TLSRecordType tLSRecordType = TLSRecordType.Alert;
            C6309 c6309 = new C6309();
            c6309.m11173((byte) TLSAlertLevel.WARNING.getCode());
            c6309.m11173((byte) TLSAlertType.CloseNotify.getCode());
            C4875 c4875 = new C4875(tLSRecordType, c6309);
            this.L$0 = th;
            this.L$1 = null;
            this.label = 5;
            if (AbstractC4867.m8996(interfaceC50792, c4875, this) != coroutineSingletons) {
                interfaceC5079 = this.$rawOutput;
                this.L$0 = th;
                this.label = 6;
                if (((C5081) interfaceC5079).m9263(this) != coroutineSingletons) {
                }
            }
        }
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                obj2 = (InterfaceC6026) this.L$0;
                AbstractC6043 abstractC6043 = (AbstractC6043) obj2;
                abstractC6043.getClass();
                C6022 c6022 = abstractC6043.f15143;
                c6022.getClass();
                C6023 c6023 = new C6023(c6022);
                i = 0;
                r42 = c6023;
                this.L$0 = obj2;
                this.L$1 = r42;
                this.I$0 = i;
                this.label = 1;
                C6023 c60232 = (C6023) r42;
                objM10823 = c60232.m10823(this);
                if (objM10823 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj3 = obj2;
                obj = objM10823;
                obj4 = c60232;
                if (((Boolean) obj).booleanValue()) {
                    InterfaceC5079 interfaceC50793 = this.$rawOutput;
                    TLSRecordType tLSRecordType2 = TLSRecordType.Alert;
                    C6309 c63092 = new C6309();
                    c63092.m11173((byte) TLSAlertLevel.WARNING.getCode());
                    c63092.m11173((byte) TLSAlertType.CloseNotify.getCode());
                    C4875 c48752 = new C4875(tLSRecordType2, c63092);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (AbstractC4867.m8996(interfaceC50793, c48752, this) != coroutineSingletons) {
                        InterfaceC5079 interfaceC50794 = this.$rawOutput;
                        this.label = 4;
                    }
                    break;
                } else {
                    r4 = (C6023) obj4;
                    C4875 c48753 = (C4875) r4.m10821();
                    if (i != 0) {
                        this.this$0.getClass();
                        throw null;
                    }
                    if (c48753.f12668 == TLSRecordType.ChangeCipherSpec) {
                        i = 1;
                    }
                    InterfaceC5079 interfaceC50795 = this.$rawOutput;
                    this.L$0 = obj3;
                    this.L$1 = r4;
                    this.I$0 = i;
                    this.label = 2;
                    r43 = r4;
                    if (AbstractC4867.m8996(interfaceC50795, c48753, this) == coroutineSingletons) {
                    }
                    obj2 = obj3;
                    r42 = r43;
                    this.L$0 = obj2;
                    this.L$1 = r42;
                    this.I$0 = i;
                    this.label = 1;
                    C6023 c602322 = (C6023) r42;
                    objM10823 = c602322.m10823(this);
                    if (objM10823 == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            case 1:
                i = this.I$0;
                InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$1;
                obj3 = (InterfaceC6026) this.L$0;
                AbstractC6017.m10769(obj);
                obj4 = interfaceC6044;
                if (((Boolean) obj).booleanValue()) {
                }
                return coroutineSingletons;
            case 2:
                i = this.I$0;
                r4 = (InterfaceC6044) this.L$1;
                obj3 = (InterfaceC6026) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    r43 = r4;
                } catch (Throwable th2) {
                    AbstractC6043 abstractC60432 = (AbstractC6043) obj3;
                    abstractC60432.getClass();
                    abstractC60432.mo8994(th2);
                    r43 = r4;
                }
                obj2 = obj3;
                r42 = r43;
                this.L$0 = obj2;
                this.L$1 = r42;
                this.I$0 = i;
                this.label = 1;
                C6023 c6023222 = (C6023) r42;
                objM10823 = c6023222.m10823(this);
                if (objM10823 == coroutineSingletons) {
                }
                break;
            case 3:
                AbstractC6017.m10769(obj);
                InterfaceC5079 interfaceC507942 = this.$rawOutput;
                this.label = 4;
                break;
            case 4:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            case 5:
                Throwable th3 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                th = th3;
                interfaceC5079 = this.$rawOutput;
                this.L$0 = th;
                this.label = 6;
                if (((C5081) interfaceC5079).m9263(this) != coroutineSingletons) {
                    throw th;
                }
                return coroutineSingletons;
            case 6:
                Throwable th4 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th4;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
