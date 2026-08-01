package androidx.compose.ui.text.font;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.RunnableC5413;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend", v = 1)
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1995 $font;
    final /* synthetic */ InterfaceC1984 $resourceLoader;
    int label;
    final /* synthetic */ C1989 this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @InterfaceC6862(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {111}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6558 {
        final /* synthetic */ InterfaceC1995 $font;
        final /* synthetic */ InterfaceC1984 $resourceLoader;
        int label;

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {112}, m = "invokeSuspend", v = 1)
        public static final class C19681 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ InterfaceC1995 $font;
            final /* synthetic */ InterfaceC1984 $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19681(InterfaceC1984 interfaceC1984, InterfaceC1995 interfaceC1995, InterfaceC4357<? super C19681> interfaceC4357) {
                super(2, interfaceC4357);
                this.$resourceLoader = interfaceC1984;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new C19681(this.$resourceLoader, null, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
                return ((C19681) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC5185.m10210(obj);
                        return obj;
                    }
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
                InterfaceC1984 interfaceC1984 = this.$resourceLoader;
                this.label = 1;
                Object objM3699 = ((C1978) interfaceC1984).m3699(this);
                return objM3699 == coroutineSingletons ? coroutineSingletons : objM3699;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1995 interfaceC1995, InterfaceC1984 interfaceC1984, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(1, interfaceC4357);
            this.$resourceLoader = interfaceC1984;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(null, this.$resourceLoader, interfaceC4357);
        }

        @Override // p052.InterfaceC6558
        public final Object invoke(InterfaceC4357<Object> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    C19681 c19681 = new C19681(this.$resourceLoader, null, null);
                    this.label = 1;
                    obj = AbstractC5399.m10483(new RunnableC5413(15000L, this), c19681);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5185.m10210(obj);
                }
                if (obj != null) {
                    return obj;
                }
                C5925.m11311("Unable to load font null");
                return null;
            } catch (Exception e) {
                C8791.m14473("Unable to load font null", e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(C1989 c1989, InterfaceC1995 interfaceC1995, InterfaceC1984 interfaceC1984, InterfaceC4357<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1989;
        this.$resourceLoader = interfaceC1984;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, null, this.$resourceLoader, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C1973 c1973 = this.this$0.f5879;
        InterfaceC1984 interfaceC1984 = this.$resourceLoader;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC1984, null);
        this.label = 1;
        Object objM3698 = c1973.m3698(interfaceC1984, true, anonymousClass1, this);
        return objM3698 == coroutineSingletons ? coroutineSingletons : objM3698;
    }
}
