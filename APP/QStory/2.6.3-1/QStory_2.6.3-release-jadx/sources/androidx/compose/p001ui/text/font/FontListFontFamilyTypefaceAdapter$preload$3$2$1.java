package androidx.compose.p001ui.text.font;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.RunnableC6245;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", m556f = "FontListFontFamilyTypefaceAdapter.kt", m557l = {109}, m558m = "invokeSuspend", m559v = 1)
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2829 $font;
    final /* synthetic */ InterfaceC2818 $resourceLoader;
    int label;
    final /* synthetic */ C2823 this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m151d2 = {"<anonymous>", ""}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
    @InterfaceC7691(m555c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", m556f = "FontListFontFamilyTypefaceAdapter.kt", m557l = {111}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02211 extends SuspendLambda implements InterfaceC7387 {
        final /* synthetic */ InterfaceC2829 $font;
        final /* synthetic */ InterfaceC2818 $resourceLoader;
        int label;

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", m556f = "FontListFontFamilyTypefaceAdapter.kt", m557l = {112}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC2829 $font;
            final /* synthetic */ InterfaceC2818 $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC2818 interfaceC2818, InterfaceC2829 interfaceC2829, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$resourceLoader = interfaceC2818;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(this.$resourceLoader, null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC6017.m10769(obj);
                        return obj;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                InterfaceC2818 interfaceC2818 = this.$resourceLoader;
                this.label = 1;
                Object objM4259 = ((C2812) interfaceC2818).m4259(this);
                return objM4259 == coroutineSingletons ? coroutineSingletons : objM4259;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02211(InterfaceC2829 interfaceC2829, InterfaceC2818 interfaceC2818, InterfaceC5189<? super C02211> interfaceC5189) {
            super(1, interfaceC5189);
            this.$resourceLoader = interfaceC2818;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
            return new C02211(null, this.$resourceLoader, interfaceC5189);
        }

        @Override // p068.InterfaceC7387
        public final Object invoke(InterfaceC5189<Object> interfaceC5189) {
            return ((C02211) create(interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resourceLoader, null, null);
                    this.label = 1;
                    obj = AbstractC6231.m11042(new RunnableC6245(15000L, this), anonymousClass1);
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
                if (obj != null) {
                    return obj;
                }
                C6755.m11870("Unable to load font null");
                return null;
            } catch (Exception e) {
                C9620.m15032("Unable to load font null", e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(C2823 c2823, InterfaceC2829 interfaceC2829, InterfaceC2818 interfaceC2818, InterfaceC5189<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2823;
        this.$resourceLoader = interfaceC2818;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, null, this.$resourceLoader, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C2807 c2807 = this.this$0.f6224;
        InterfaceC2818 interfaceC2818 = this.$resourceLoader;
        C02211 c02211 = new C02211(null, interfaceC2818, null);
        this.label = 1;
        Object objM4258 = c2807.m4258(interfaceC2818, true, c02211, this);
        return objM4258 == coroutineSingletons ? coroutineSingletons : objM4258;
    }
}
