package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.AbstractC1675;
import androidx.compose.p001ui.platform.InterfaceC2689;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2138;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6126;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", m556f = "LegacyPlatformTextInputServiceAdapter.android.kt", m557l = {125}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲世兰苏楪;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲世兰苏楪;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $initializeRequest;
    final /* synthetic */ InterfaceC1691 $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1698 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", m556f = "LegacyPlatformTextInputServiceAdapter.android.kt", m557l = {149}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00941 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2689 $$this$launchTextInputSession;
        final /* synthetic */ InterfaceC7387 $initializeRequest;
        final /* synthetic */ InterfaceC1691 $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C1698 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", m556f = "LegacyPlatformTextInputServiceAdapter.android.kt", m557l = {140, 141}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC1701 $inputMethodManager;
            int label;
            final /* synthetic */ C1698 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1698 c1698, InterfaceC1701 interfaceC1701, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.this$0 = c1698;
                this.$inputMethodManager = interfaceC1701;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C6008 invokeSuspend$lambda$0(long j) {
                return C6008.f15084;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(this.this$0, this.$inputMethodManager, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
            
                if (kotlinx.coroutines.flow.C6119.m10874((kotlinx.coroutines.flow.C6119) r7, r1, r6) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                int i2 = 0;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    C1700 c1700 = new C1700(i2);
                    this.label = 1;
                    if (AbstractC2202.m3052(getContext()).mo2865(new C2138(c1700, i2), this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    C5043.m9161();
                    return null;
                }
                AbstractC6017.m10769(obj);
                InterfaceC6126 interfaceC6126M2250 = this.this$0.m2250();
                if (interfaceC6126M2250 == null) {
                    return C6008.f15084;
                }
                C1699 c1699 = new C1699(this.$inputMethodManager, i2);
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00941(InterfaceC2689 interfaceC2689, InterfaceC7387 interfaceC7387, C1698 c1698, InterfaceC1691 interfaceC1691, InterfaceC5189<? super C00941> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$launchTextInputSession = interfaceC2689;
            this.$initializeRequest = interfaceC7387;
            this.this$0 = c1698;
            this.$node = interfaceC1691;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00941 c00941 = new C00941(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, interfaceC5189);
            c00941.L$0 = obj;
            return c00941;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<?> interfaceC5189) {
            return ((C00941) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                    InterfaceC1701 interfaceC1701 = (InterfaceC1701) AbstractC1690.f2750.invoke(this.$$this$launchTextInputSession.mo4026());
                    C1689 c1689 = new C1689(this.$$this$launchTextInputSession.mo4026(), new C0095x8f2ae8f3(this.$node), interfaceC1701);
                    if (AbstractC1675.f2715) {
                        AbstractC6231.m11036(interfaceC6233, null, null, new AnonymousClass1(this.this$0, interfaceC1701, null), 3);
                    }
                    InterfaceC7387 interfaceC7387 = this.$initializeRequest;
                    if (interfaceC7387 != null) {
                        interfaceC7387.invoke(c1689);
                    }
                    this.this$0.f2759 = c1689;
                    InterfaceC2689 interfaceC2689 = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (interfaceC2689.mo4027(c1689, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f2759 = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(InterfaceC7387 interfaceC7387, C1698 c1698, InterfaceC1691 interfaceC1691, InterfaceC5189<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$initializeRequest = interfaceC7387;
        this.this$0 = c1698;
        this.$node = interfaceC1691;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, interfaceC5189);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2689 interfaceC2689, InterfaceC5189<?> interfaceC5189) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(interfaceC2689, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C00941 c00941 = new C00941((InterfaceC2689) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (AbstractC6231.m11066(c00941, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
