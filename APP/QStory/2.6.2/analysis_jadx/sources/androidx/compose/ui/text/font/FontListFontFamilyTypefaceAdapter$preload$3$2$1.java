package androidx.compose.ui.text.font;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.RunnableC5412;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend", v = 1)
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1995 $font;
    final /* synthetic */ InterfaceC1984 $resourceLoader;
    int label;
    final /* synthetic */ C1989 this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @InterfaceC6861(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {111}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6557 {
        final /* synthetic */ InterfaceC1995 $font;
        final /* synthetic */ InterfaceC1984 $resourceLoader;
        int label;

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6861(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {112}, m = "invokeSuspend", v = 1)
        public static final class C19681 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC1995 $font;
            final /* synthetic */ InterfaceC1984 $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19681(InterfaceC1984 interfaceC1984, InterfaceC1995 interfaceC1995, InterfaceC4356<? super C19681> interfaceC4356) {
                super(2, interfaceC4356);
                this.$resourceLoader = interfaceC1984;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new C19681(this.$resourceLoader, null, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
                return ((C19681) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC5184.m10206(obj);
                        return obj;
                    }
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                InterfaceC1984 interfaceC1984 = this.$resourceLoader;
                this.label = 1;
                Object objM3689 = ((C1978) interfaceC1984).m3689(this);
                return objM3689 == coroutineSingletons ? coroutineSingletons : objM3689;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1995 interfaceC1995, InterfaceC1984 interfaceC1984, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(1, interfaceC4356);
            this.$resourceLoader = interfaceC1984;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(null, this.$resourceLoader, interfaceC4356);
        }

        @Override // p052.InterfaceC6557
        public final Object invoke(InterfaceC4356<Object> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    C19681 c19681 = new C19681(this.$resourceLoader, null, null);
                    this.label = 1;
                    obj = AbstractC5398.m10479(new RunnableC5412(15000L, this), c19681);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                if (obj != null) {
                    return obj;
                }
                C5919.m11250("Unable to load font null");
                return null;
            } catch (Exception e) {
                C8796.m14449("Unable to load font null", e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(C1989 c1989, InterfaceC1995 interfaceC1995, InterfaceC1984 interfaceC1984, InterfaceC4356<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c1989;
        this.$resourceLoader = interfaceC1984;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, null, this.$resourceLoader, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C1973 c1973 = this.this$0.f5878;
        InterfaceC1984 interfaceC1984 = this.$resourceLoader;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC1984, null);
        this.label = 1;
        Object objM3688 = c1973.m3688(interfaceC1984, true, anonymousClass1, this);
        return objM3688 == coroutineSingletons ? coroutineSingletons : objM3688;
    }
}
