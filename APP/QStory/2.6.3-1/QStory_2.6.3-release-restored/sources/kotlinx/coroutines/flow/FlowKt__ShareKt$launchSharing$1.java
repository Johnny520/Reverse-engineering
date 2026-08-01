package kotlinx.coroutines.flow;

import androidx.compose.foundation.lazy.C1594;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.internal.AbstractC6052;
import kotlinx.coroutines.flow.internal.C6057;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p105.C8009;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m556f = "Share.kt", m557l = {Opcodes.MUL_INT_LIT16, Opcodes.OR_INT_LIT16, Opcodes.XOR_INT_LIT16, Opcodes.AND_INT_LIT8}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ InterfaceC6126 $shared;
    final /* synthetic */ InterfaceC6104 $started;
    final /* synthetic */ InterfaceC6151 $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, m152k = 3, m153mv = {2, 2, 0})
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m556f = "Share.kt", m557l = {Opcodes.XOR_INT_LIT8}, m558m = "invokeSuspend", m559v = 1)
    public static final class C03962 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ InterfaceC6126 $shared;
        final /* synthetic */ InterfaceC6151 $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03962(InterfaceC6151 interfaceC6151, InterfaceC6126 interfaceC6126, Object obj, InterfaceC5189<? super C03962> interfaceC5189) {
            super(2, interfaceC5189);
            this.$upstream = interfaceC6151;
            this.$shared = interfaceC6126;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03962 c03962 = new C03962(this.$upstream, this.$shared, this.$initialValue, interfaceC5189);
            c03962.L$0 = obj;
            return c03962;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(SharingCommand sharingCommand, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03962) create(sharingCommand, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharingCommand sharingCommand = (SharingCommand) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                int i2 = AbstractC6168.f15246[sharingCommand.ordinal()];
                if (i2 == 1) {
                    InterfaceC6151 interfaceC6151 = this.$upstream;
                    InterfaceC6126 interfaceC6126 = this.$shared;
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC6151.mo9012(interfaceC6126, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        C5043.m9170();
                        return null;
                    }
                    Object obj2 = this.$initialValue;
                    C5317 c5317 = AbstractC6154.f15236;
                    InterfaceC6126 interfaceC61262 = this.$shared;
                    if (obj2 == c5317) {
                        interfaceC61262.mo10869();
                    } else {
                        interfaceC61262.mo10868(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC6104 interfaceC6104, InterfaceC6151 interfaceC6151, InterfaceC6126 interfaceC6126, Object obj, InterfaceC5189<? super FlowKt__ShareKt$launchSharing$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$started = interfaceC6104;
        this.$upstream = interfaceC6151;
        this.$shared = interfaceC6126;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8.mo9012(r1, r7) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8.mo9012(r1, r7) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC6154.m10894(r8, r1, r7) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6132 c6132;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6151 interfaceC6151 = this.$upstream;
                    InterfaceC6126 interfaceC6126 = this.$shared;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        InterfaceC6104 interfaceC6104 = this.$started;
        if (interfaceC6104 != C6100.f15200) {
            Object obj2 = this.$shared;
            if (interfaceC6104 == C6100.f15199) {
                C6057 c6057M10863 = ((AbstractC6052) obj2).m10863();
                C03951 c03951 = new C03951(null);
                this.label = 2;
                if (AbstractC6154.m10898(c6057M10863, c03951, this) != coroutineSingletons) {
                    InterfaceC6151 interfaceC61512 = this.$upstream;
                    InterfaceC6126 interfaceC61262 = this.$shared;
                    this.label = 3;
                }
            } else {
                InterfaceC6151 interfaceC6151Mo10867 = interfaceC6104.mo10867(((AbstractC6052) obj2).m10863());
                if (!(interfaceC6151Mo10867 instanceof InterfaceC6096)) {
                    C8009 c8009 = AbstractC6154.f15238;
                    C1594 c1594 = AbstractC6154.f15237;
                    if (interfaceC6151Mo10867 instanceof C6132) {
                        c6132 = (C6132) interfaceC6151Mo10867;
                        if (c6132.f15226 != c8009 || c6132.f15227 != c1594) {
                        }
                        interfaceC6151Mo10867 = c6132;
                    }
                    c6132 = new C6132(interfaceC6151Mo10867, c8009, c1594);
                    interfaceC6151Mo10867 = c6132;
                }
                C03962 c03962 = new C03962(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
            }
            return coroutineSingletons;
        }
        InterfaceC6151 interfaceC61513 = this.$upstream;
        InterfaceC6126 interfaceC61263 = this.$shared;
        this.label = 1;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m151d2 = {"<anonymous>", "", "it", ""}, m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m556f = "Share.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C03951 extends SuspendLambda implements InterfaceC7383 {
        /* synthetic */ int I$0;
        int label;

        public C03951(InterfaceC5189<? super C03951> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03951 c03951 = new C03951(interfaceC5189);
            c03951.I$0 = ((Number) obj).intValue();
            return c03951;
        }

        public final Object invoke(int i, InterfaceC5189<? super Boolean> interfaceC5189) {
            return ((C03951) create(Integer.valueOf(i), interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC6017.m10769(obj);
                return Boolean.valueOf(i > 0);
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC5189<? super Boolean>) obj2);
        }
    }
}
