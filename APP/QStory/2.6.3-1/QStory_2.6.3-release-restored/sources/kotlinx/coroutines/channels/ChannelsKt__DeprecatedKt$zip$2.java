package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m556f = "Deprecated.kt", m557l = {667, 499, 501}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"V", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $other;
    final /* synthetic */ InterfaceC6031 $this_zip;
    final /* synthetic */ InterfaceC7383 $transform;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(InterfaceC6031 interfaceC6031, InterfaceC6031 interfaceC60312, InterfaceC7383 interfaceC7383, InterfaceC5189<? super ChannelsKt__DeprecatedKt$zip$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$other = interfaceC6031;
        this.$this_zip = interfaceC60312;
        this.$transform = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, interfaceC5189);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:8:0x0035, B:24:0x00b5, B:28:0x00e0, B:30:0x00e8, B:20:0x0099, B:23:0x00ac), top: B:51:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:34:0x011b, B:36:0x0123, B:15:0x0066), top: B:49:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0158 -> B:40:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x015e -> B:42:0x0160). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        InterfaceC6031 interfaceC6031;
        InterfaceC6044 it;
        InterfaceC6044 interfaceC6044;
        InterfaceC7383 interfaceC7383;
        int i;
        int i2;
        int i3;
        InterfaceC6031 interfaceC60312;
        Object objM10823;
        InterfaceC6044 interfaceC60442;
        Object obj2;
        InterfaceC6044 interfaceC60443;
        int i4;
        InterfaceC7383 interfaceC73832;
        int i5;
        Object objM108232;
        InterfaceC6044 interfaceC60444;
        InterfaceC6044 interfaceC60445;
        int i6;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        int i8 = 2;
        try {
            if (i7 == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6044 it2 = this.$other.iterator();
                interfaceC6031 = this.$this_zip;
                InterfaceC7383 interfaceC73833 = this.$transform;
                it = interfaceC6031.iterator();
                interfaceC6044 = it2;
                interfaceC7383 = interfaceC73833;
                i = 0;
                i2 = 0;
                i3 = 0;
                this.L$0 = interfaceC6233;
                this.L$1 = interfaceC6044;
                this.L$2 = null;
                this.L$3 = interfaceC7383;
                this.L$4 = interfaceC6031;
                this.L$5 = null;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                objM108232 = c6023.m10823(this);
                if (objM108232 != coroutineSingletons) {
                }
            } else if (i7 == 1) {
                i = this.I$2;
                i2 = this.I$1;
                i6 = this.I$0;
                interfaceC60445 = (InterfaceC6044) this.L$6;
                interfaceC6031 = (InterfaceC6031) this.L$4;
                interfaceC7383 = (InterfaceC7383) this.L$3;
                InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                objM108232 = obj;
                interfaceC60444 = interfaceC60446;
                if (((Boolean) objM108232).booleanValue()) {
                }
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$2;
                    i4 = this.I$1;
                    i3 = this.I$0;
                    interfaceC60443 = (InterfaceC6044) this.L$6;
                    interfaceC6031 = (InterfaceC6031) this.L$4;
                    InterfaceC7383 interfaceC73834 = (InterfaceC7383) this.L$3;
                    InterfaceC6044 interfaceC60447 = (InterfaceC6044) this.L$1;
                    AbstractC6017.m10769(obj);
                    interfaceC73832 = interfaceC73834;
                    InterfaceC6044 interfaceC60448 = interfaceC60447;
                    i2 = i4;
                    it = interfaceC60443;
                    interfaceC7383 = interfaceC73832;
                    i8 = 2;
                    interfaceC6044 = interfaceC60448;
                    this.L$0 = interfaceC6233;
                    this.L$1 = interfaceC6044;
                    this.L$2 = null;
                    this.L$3 = interfaceC7383;
                    this.L$4 = interfaceC6031;
                    this.L$5 = null;
                    this.L$6 = it;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    C6023 c60232 = (C6023) it;
                    objM108232 = c60232.m10823(this);
                    if (objM108232 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i9 = i3;
                    interfaceC60445 = c60232;
                    i6 = i9;
                    interfaceC60444 = interfaceC6044;
                    if (((Boolean) objM108232).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return C6008.f15084;
                    }
                    C6023 c60233 = (C6023) interfaceC60445;
                    Object objM10821 = c60233.m10821();
                    this.L$0 = interfaceC6233;
                    this.L$1 = interfaceC60444;
                    this.L$2 = null;
                    this.L$3 = interfaceC7383;
                    this.L$4 = interfaceC6031;
                    this.L$5 = null;
                    this.L$6 = c60233;
                    this.L$7 = null;
                    this.L$8 = objM10821;
                    this.I$0 = i6;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.I$3 = 0;
                    this.label = i8;
                    C6023 c60234 = (C6023) interfaceC60444;
                    objM10823 = c60234.m10823(this);
                    if (objM10823 != coroutineSingletons) {
                        interfaceC60312 = interfaceC6031;
                        obj2 = objM10821;
                        interfaceC73832 = interfaceC7383;
                        interfaceC60443 = c60233;
                        i3 = i6;
                        i4 = i2;
                        i5 = 0;
                        interfaceC60442 = c60234;
                        if (((Boolean) objM10823).booleanValue()) {
                            interfaceC6031 = interfaceC60312;
                            interfaceC60448 = interfaceC60442;
                            i2 = i4;
                            it = interfaceC60443;
                            interfaceC7383 = interfaceC73832;
                            i8 = 2;
                            interfaceC6044 = interfaceC60448;
                            this.L$0 = interfaceC6233;
                            this.L$1 = interfaceC6044;
                            this.L$2 = null;
                            this.L$3 = interfaceC7383;
                            this.L$4 = interfaceC6031;
                            this.L$5 = null;
                            this.L$6 = it;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.I$0 = i3;
                            this.I$1 = i2;
                            this.I$2 = i;
                            this.label = 1;
                            C6023 c602322 = (C6023) it;
                            objM108232 = c602322.m10823(this);
                            if (objM108232 != coroutineSingletons) {
                            }
                        } else {
                            C6023 c60235 = (C6023) interfaceC60442;
                            Object objInvoke = interfaceC73832.invoke(obj2, c60235.m10821());
                            this.L$0 = interfaceC6233;
                            this.L$1 = c60235;
                            this.L$2 = null;
                            this.L$3 = interfaceC73832;
                            this.L$4 = interfaceC60312;
                            this.L$5 = null;
                            this.L$6 = interfaceC60443;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.I$0 = i3;
                            this.I$1 = i4;
                            this.I$2 = i;
                            this.I$3 = i5;
                            this.label = 3;
                            if (((AbstractC6043) interfaceC6233).f15143.mo8992(objInvoke, this) != coroutineSingletons) {
                                interfaceC6031 = interfaceC60312;
                                interfaceC60447 = c60235;
                                interfaceC73834 = interfaceC73832;
                                interfaceC73832 = interfaceC73834;
                                InterfaceC6044 interfaceC604482 = interfaceC60447;
                                i2 = i4;
                                it = interfaceC60443;
                                interfaceC7383 = interfaceC73832;
                                i8 = 2;
                                interfaceC6044 = interfaceC604482;
                                this.L$0 = interfaceC6233;
                                this.L$1 = interfaceC6044;
                                this.L$2 = null;
                                this.L$3 = interfaceC7383;
                                this.L$4 = interfaceC6031;
                                this.L$5 = null;
                                this.L$6 = it;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.I$0 = i3;
                                this.I$1 = i2;
                                this.I$2 = i;
                                this.label = 1;
                                C6023 c6023222 = (C6023) it;
                                objM108232 = c6023222.m10823(this);
                                if (objM108232 != coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                int i10 = this.I$3;
                int i11 = this.I$2;
                int i12 = this.I$1;
                int i13 = this.I$0;
                obj2 = this.L$8;
                InterfaceC6044 interfaceC60449 = (InterfaceC6044) this.L$6;
                interfaceC60312 = (InterfaceC6031) this.L$4;
                InterfaceC7383 interfaceC73835 = (InterfaceC7383) this.L$3;
                InterfaceC6044 interfaceC604410 = (InterfaceC6044) this.L$1;
                try {
                    AbstractC6017.m10769(obj);
                    i5 = i10;
                    i = i11;
                    i4 = i12;
                    i3 = i13;
                    interfaceC60443 = interfaceC60449;
                    interfaceC60442 = interfaceC604410;
                    interfaceC73832 = interfaceC73835;
                    objM10823 = obj;
                    if (((Boolean) objM10823).booleanValue()) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC6031 = interfaceC60312;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC6037.m10837(interfaceC6031, th);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
