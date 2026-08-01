package kotlinx.coroutines.channels;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m556f = "Deprecated.kt", m557l = {Opcodes.INVOKE_CUSTOM}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m151d2 = {"<anonymous>", "", "E", "it"}, m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelsKt__DeprecatedKt$filterNot$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $predicate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterNot$1(InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$predicate = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.$predicate, interfaceC5189);
        channelsKt__DeprecatedKt$filterNot$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) create(obj, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7383 interfaceC7383 = this.$predicate;
            this.L$0 = null;
            this.label = 1;
            obj = interfaceC7383.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }
}
