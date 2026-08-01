package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m556f = "SharingStarted.kt", m557l = {175, 177, 179, 180, 182}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;I)V"}, m152k = 3, m153mv = {2, 2, 0})
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6097 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(C6097 c6097, InterfaceC5189<? super StartedWhileSubscribed$command$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c6097;
    }

    public final Object invoke(InterfaceC6150 interfaceC6150, int i, InterfaceC5189<? super C6008> interfaceC5189) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, interfaceC5189);
        startedWhileSubscribed$command$1.L$0 = interfaceC6150;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r0.emit(r11, r10) != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharingCommand sharingCommand;
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (i > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 1;
            } else {
                this.this$0.getClass();
                this.L$0 = interfaceC6150;
                this.I$0 = i;
                this.label = 2;
                if (AbstractC6231.m11058(0L, this) != coroutineSingletons) {
                    this.this$0.getClass();
                    sharingCommand = SharingCommand.STOP;
                    this.L$0 = interfaceC6150;
                    this.I$0 = i;
                    this.label = 3;
                    if (interfaceC6150.emit(sharingCommand, this) != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                this.this$0.getClass();
                sharingCommand = SharingCommand.STOP;
                this.L$0 = interfaceC6150;
                this.I$0 = i;
                this.label = 3;
                if (interfaceC6150.emit(sharingCommand, this) != coroutineSingletons) {
                    this.this$0.getClass();
                    this.L$0 = interfaceC6150;
                    this.I$0 = i;
                    this.label = 4;
                    if (AbstractC6231.m11058(Long.MAX_VALUE, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                AbstractC6017.m10769(obj);
                this.this$0.getClass();
                this.L$0 = interfaceC6150;
                this.I$0 = i;
                this.label = 4;
                if (AbstractC6231.m11058(Long.MAX_VALUE, this) != coroutineSingletons) {
                    SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                    this.L$0 = null;
                    this.I$0 = i;
                    this.label = 5;
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                AbstractC6017.m10769(obj);
                SharingCommand sharingCommand32 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 5;
            } else if (i2 != 5) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        AbstractC6017.m10769(obj);
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6150) obj, ((Number) obj2).intValue(), (InterfaceC5189<? super C6008>) obj3);
    }
}
