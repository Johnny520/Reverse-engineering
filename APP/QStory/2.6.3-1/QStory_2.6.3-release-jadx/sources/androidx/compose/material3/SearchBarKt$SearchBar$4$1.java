package androidx.compose.material3;

import androidx.compose.animation.C1258;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
import androidx.compose.foundation.C1925;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1", m556f = "SearchBar.kt", m557l = {570}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SearchBarKt$SearchBar$4$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $animationProgress;
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2230 $currentBackEvent;
    final /* synthetic */ InterfaceC2232 $finalBackProgress;
    final /* synthetic */ InterfaceC2230 $firstBackEvent;
    final /* synthetic */ C1925 $mutatorMutex;
    final /* synthetic */ InterfaceC7387 $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1", m556f = "SearchBar.kt", m557l = {573}, m558m = "invokeSuspend")
    public static final class C01501 extends SuspendLambda implements InterfaceC7387 {
        final /* synthetic */ C1177 $animationProgress;
        final /* synthetic */ InterfaceC6233 $coroutineScope;
        final /* synthetic */ InterfaceC2230 $currentBackEvent;
        final /* synthetic */ InterfaceC2232 $finalBackProgress;
        final /* synthetic */ InterfaceC2230 $firstBackEvent;
        final /* synthetic */ InterfaceC7387 $onExpandedChange;
        final /* synthetic */ InterfaceC6151 $progress;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2", m556f = "SearchBar.kt", m557l = {585}, m558m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C1177 $animationProgress;
            final /* synthetic */ InterfaceC2230 $currentBackEvent;
            final /* synthetic */ InterfaceC2232 $finalBackProgress;
            final /* synthetic */ InterfaceC2230 $firstBackEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1177 c1177, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
                super(2, interfaceC5189);
                this.$animationProgress = c1177;
                this.$finalBackProgress = interfaceC2232;
                this.$firstBackEvent = interfaceC2230;
                this.$currentBackEvent = interfaceC22302;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AnonymousClass2 anonymousClass2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    C1177 c1177 = this.$animationProgress;
                    Float f = new Float(1.0f);
                    C1208 c1208 = AbstractC2051.f3842;
                    this.label = 1;
                    anonymousClass2 = this;
                    if (C1177.m1589(c1177, f, c1208, null, null, anonymousClass2, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    anonymousClass2 = this;
                }
                ((AbstractC2184) anonymousClass2.$finalBackProgress).m2995(Float.NaN);
                anonymousClass2.$firstBackEvent.setValue(null);
                anonymousClass2.$currentBackEvent.setValue(null);
                return C6008.f15084;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01501(InterfaceC2232 interfaceC2232, InterfaceC6151 interfaceC6151, C1177 c1177, InterfaceC7387 interfaceC7387, InterfaceC6233 interfaceC6233, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super C01501> interfaceC5189) {
            super(1, interfaceC5189);
            this.$finalBackProgress = interfaceC2232;
            this.$progress = interfaceC6151;
            this.$animationProgress = c1177;
            this.$onExpandedChange = interfaceC7387;
            this.$coroutineScope = interfaceC6233;
            this.$firstBackEvent = interfaceC2230;
            this.$currentBackEvent = interfaceC22302;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
            return new C01501(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, interfaceC5189);
        }

        @Override // p068.InterfaceC7387
        public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01501) create(interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    ((AbstractC2184) this.$finalBackProgress).m2995(Float.NaN);
                    InterfaceC6151 interfaceC6151 = this.$progress;
                    C1258 c1258 = new C1258(this.$firstBackEvent, this.$currentBackEvent, this.$animationProgress, 2);
                    this.label = 1;
                    if (interfaceC6151.mo9012(c1258, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                ((AbstractC2184) this.$finalBackProgress).m2995(((Number) this.$animationProgress.m1593()).floatValue());
                this.$onExpandedChange.invoke(Boolean.FALSE);
            } catch (CancellationException unused) {
                AbstractC6231.m11036(this.$coroutineScope, null, null, new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, null), 3);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4$1(C1925 c1925, InterfaceC2232 interfaceC2232, C1177 c1177, InterfaceC7387 interfaceC7387, InterfaceC6233 interfaceC6233, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super SearchBarKt$SearchBar$4$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$mutatorMutex = c1925;
        this.$finalBackProgress = interfaceC2232;
        this.$animationProgress = c1177;
        this.$onExpandedChange = interfaceC7387;
        this.$coroutineScope = interfaceC6233;
        this.$firstBackEvent = interfaceC2230;
        this.$currentBackEvent = interfaceC22302;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new SearchBarKt$SearchBar$4$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, interfaceC5189);
        searchBarKt$SearchBar$4$1.L$0 = obj;
        return searchBarKt$SearchBar$4$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6151 interfaceC6151, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SearchBarKt$SearchBar$4$1) create(interfaceC6151, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6151 interfaceC6151 = (InterfaceC6151) this.L$0;
            C1925 c1925 = this.$mutatorMutex;
            C01501 c01501 = new C01501(this.$finalBackProgress, interfaceC6151, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (C1925.m2561(c1925, c01501, this) == coroutineSingletons) {
                return coroutineSingletons;
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
