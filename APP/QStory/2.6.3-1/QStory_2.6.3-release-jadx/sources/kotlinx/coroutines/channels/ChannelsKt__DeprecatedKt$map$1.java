package kotlinx.coroutines.channels;

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
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m556f = "Deprecated.kt", m557l = {667, 363, 363}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $this_map;
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
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$map$1(InterfaceC6031 interfaceC6031, InterfaceC7383 interfaceC7383, InterfaceC5189<? super ChannelsKt__DeprecatedKt$map$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_map = interfaceC6031;
        this.$transform = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, interfaceC5189);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:8:0x0031, B:24:0x00a2, B:28:0x00ca, B:30:0x00d2, B:20:0x008d, B:23:0x009a), top: B:47:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x012a -> B:38:0x012b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        InterfaceC6031 interfaceC6031;
        InterfaceC6044 it;
        InterfaceC7383 interfaceC7383;
        int i;
        int i2;
        int i3;
        InterfaceC6031 interfaceC60312;
        InterfaceC7383 interfaceC73832;
        Object objInvoke;
        Object obj2;
        InterfaceC6044 interfaceC6044;
        int i4;
        Object objM10823;
        InterfaceC6044 interfaceC60442;
        int i5;
        int i6;
        InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6031 = this.$this_map;
                InterfaceC7383 interfaceC73833 = this.$transform;
                it = interfaceC6031.iterator();
                interfaceC7383 = interfaceC73833;
                i = 0;
                i2 = 0;
                i3 = 0;
                this.L$0 = interfaceC6028;
                this.L$1 = null;
                this.L$2 = interfaceC7383;
                this.L$3 = interfaceC6031;
                this.L$4 = null;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                objM10823 = c6023.m10823(this);
                if (objM10823 == coroutineSingletons) {
                }
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i8 = this.I$3;
                        int i9 = this.I$2;
                        int i10 = this.I$1;
                        int i11 = this.I$0;
                        obj2 = (InterfaceC6028) this.L$8;
                        InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$5;
                        interfaceC60312 = (InterfaceC6031) this.L$3;
                        interfaceC73832 = (InterfaceC7383) this.L$2;
                        try {
                            AbstractC6017.m10769(obj);
                            i4 = i8;
                            i = i9;
                            i2 = i10;
                            i3 = i11;
                            interfaceC6044 = interfaceC60443;
                            objInvoke = obj;
                            this.L$0 = interfaceC6028;
                            this.L$1 = null;
                            this.L$2 = interfaceC73832;
                            this.L$3 = interfaceC60312;
                            this.L$4 = null;
                            this.L$5 = interfaceC6044;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.I$0 = i3;
                            this.I$1 = i2;
                            this.I$2 = i;
                            this.I$3 = i4;
                            this.label = 3;
                            if (((AbstractC6043) obj2).f15143.mo8992(objInvoke, this) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
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
                    if (i7 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$2;
                    i2 = this.I$1;
                    i3 = this.I$0;
                    interfaceC6044 = (InterfaceC6044) this.L$5;
                    interfaceC6031 = (InterfaceC6031) this.L$3;
                    InterfaceC7383 interfaceC73834 = (InterfaceC7383) this.L$2;
                    AbstractC6017.m10769(obj);
                    interfaceC73832 = interfaceC73834;
                    it = interfaceC6044;
                    interfaceC7383 = interfaceC73832;
                    this.L$0 = interfaceC6028;
                    this.L$1 = null;
                    this.L$2 = interfaceC7383;
                    this.L$3 = interfaceC6031;
                    this.L$4 = null;
                    this.L$5 = it;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    C6023 c60232 = (C6023) it;
                    objM10823 = c60232.m10823(this);
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i12 = i3;
                    interfaceC60442 = c60232;
                    i6 = i2;
                    i5 = i12;
                    if (((Boolean) objM10823).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return C6008.f15084;
                    }
                    C6023 c60233 = (C6023) interfaceC60442;
                    Object objM10821 = c60233.m10821();
                    this.L$0 = interfaceC6028;
                    this.L$1 = null;
                    this.L$2 = interfaceC7383;
                    this.L$3 = interfaceC6031;
                    this.L$4 = null;
                    this.L$5 = c60233;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = interfaceC6028;
                    this.I$0 = i5;
                    this.I$1 = i6;
                    this.I$2 = i;
                    this.I$3 = 0;
                    this.label = 2;
                    objInvoke = interfaceC7383.invoke(objM10821, this);
                    if (objInvoke != coroutineSingletons) {
                        interfaceC73832 = interfaceC7383;
                        interfaceC60312 = interfaceC6031;
                        obj2 = interfaceC6028;
                        interfaceC6044 = c60233;
                        i3 = i5;
                        i2 = i6;
                        i4 = 0;
                        this.L$0 = interfaceC6028;
                        this.L$1 = null;
                        this.L$2 = interfaceC73832;
                        this.L$3 = interfaceC60312;
                        this.L$4 = null;
                        this.L$5 = interfaceC6044;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.I$0 = i3;
                        this.I$1 = i2;
                        this.I$2 = i;
                        this.I$3 = i4;
                        this.label = 3;
                        if (((AbstractC6043) obj2).f15143.mo8992(objInvoke, this) != coroutineSingletons) {
                            interfaceC6031 = interfaceC60312;
                            it = interfaceC6044;
                            interfaceC7383 = interfaceC73832;
                            this.L$0 = interfaceC6028;
                            this.L$1 = null;
                            this.L$2 = interfaceC7383;
                            this.L$3 = interfaceC6031;
                            this.L$4 = null;
                            this.L$5 = it;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.I$0 = i3;
                            this.I$1 = i2;
                            this.I$2 = i;
                            this.label = 1;
                            C6023 c602322 = (C6023) it;
                            objM10823 = c602322.m10823(this);
                            if (objM10823 == coroutineSingletons) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                i = this.I$2;
                i6 = this.I$1;
                i5 = this.I$0;
                interfaceC60442 = (InterfaceC6044) this.L$5;
                interfaceC6031 = (InterfaceC6031) this.L$3;
                interfaceC7383 = (InterfaceC7383) this.L$2;
                AbstractC6017.m10769(obj);
                objM10823 = obj;
                if (((Boolean) objM10823).booleanValue()) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
