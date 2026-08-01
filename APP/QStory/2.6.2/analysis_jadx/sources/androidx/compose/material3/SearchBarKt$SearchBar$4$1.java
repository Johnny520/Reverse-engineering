package androidx.compose.material3;

import androidx.compose.animation.C0412;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import androidx.compose.foundation.C1087;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1", f = "SearchBar.kt", l = {570}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class SearchBarKt$SearchBar$4$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $animationProgress;
    final /* synthetic */ InterfaceC5400 $coroutineScope;
    final /* synthetic */ InterfaceC1395 $currentBackEvent;
    final /* synthetic */ InterfaceC1397 $finalBackProgress;
    final /* synthetic */ InterfaceC1395 $firstBackEvent;
    final /* synthetic */ C1087 $mutatorMutex;
    final /* synthetic */ InterfaceC6557 $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1", f = "SearchBar.kt", l = {573}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6557 {
        final /* synthetic */ C0331 $animationProgress;
        final /* synthetic */ InterfaceC5400 $coroutineScope;
        final /* synthetic */ InterfaceC1395 $currentBackEvent;
        final /* synthetic */ InterfaceC1397 $finalBackProgress;
        final /* synthetic */ InterfaceC1395 $firstBackEvent;
        final /* synthetic */ InterfaceC6557 $onExpandedChange;
        final /* synthetic */ InterfaceC5318 $progress;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6861(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2", f = "SearchBar.kt", l = {585}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ C0331 $animationProgress;
            final /* synthetic */ InterfaceC1395 $currentBackEvent;
            final /* synthetic */ InterfaceC1397 $finalBackProgress;
            final /* synthetic */ InterfaceC1395 $firstBackEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0331 c0331, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
                super(2, interfaceC4356);
                this.$animationProgress = c0331;
                this.$finalBackProgress = interfaceC1397;
                this.$firstBackEvent = interfaceC1395;
                this.$currentBackEvent = interfaceC13952;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AnonymousClass2 anonymousClass2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    C0331 c0331 = this.$animationProgress;
                    Float f = new Float(1.0f);
                    C0362 c0362 = AbstractC1216.f3496;
                    this.label = 1;
                    anonymousClass2 = this;
                    if (C0331.m1028(c0331, f, c0362, null, null, anonymousClass2, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                    anonymousClass2 = this;
                }
                ((AbstractC1349) anonymousClass2.$finalBackProgress).m2425(Float.NaN);
                anonymousClass2.$firstBackEvent.setValue(null);
                anonymousClass2.$currentBackEvent.setValue(null);
                return C5175.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1397 interfaceC1397, InterfaceC5318 interfaceC5318, C0331 c0331, InterfaceC6557 interfaceC6557, InterfaceC5400 interfaceC5400, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(1, interfaceC4356);
            this.$finalBackProgress = interfaceC1397;
            this.$progress = interfaceC5318;
            this.$animationProgress = c0331;
            this.$onExpandedChange = interfaceC6557;
            this.$coroutineScope = interfaceC5400;
            this.$firstBackEvent = interfaceC1395;
            this.$currentBackEvent = interfaceC13952;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, interfaceC4356);
        }

        @Override // p052.InterfaceC6557
        public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    ((AbstractC1349) this.$finalBackProgress).m2425(Float.NaN);
                    InterfaceC5318 interfaceC5318 = this.$progress;
                    C0412 c0412 = new C0412(this.$firstBackEvent, this.$currentBackEvent, this.$animationProgress, 2);
                    this.label = 1;
                    if (interfaceC5318.mo8463(c0412, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                ((AbstractC1349) this.$finalBackProgress).m2425(((Number) this.$animationProgress.m1032()).floatValue());
                this.$onExpandedChange.invoke(Boolean.FALSE);
            } catch (CancellationException unused) {
                AbstractC5398.m10473(this.$coroutineScope, null, null, new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, null), 3);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4$1(C1087 c1087, InterfaceC1397 interfaceC1397, C0331 c0331, InterfaceC6557 interfaceC6557, InterfaceC5400 interfaceC5400, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4356<? super SearchBarKt$SearchBar$4$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$mutatorMutex = c1087;
        this.$finalBackProgress = interfaceC1397;
        this.$animationProgress = c0331;
        this.$onExpandedChange = interfaceC6557;
        this.$coroutineScope = interfaceC5400;
        this.$firstBackEvent = interfaceC1395;
        this.$currentBackEvent = interfaceC13952;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new SearchBarKt$SearchBar$4$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, interfaceC4356);
        searchBarKt$SearchBar$4$1.L$0 = obj;
        return searchBarKt$SearchBar$4$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5318 interfaceC5318, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SearchBarKt$SearchBar$4$1) create(interfaceC5318, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5318 interfaceC5318 = (InterfaceC5318) this.L$0;
            C1087 c1087 = this.$mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$finalBackProgress, interfaceC5318, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (C1087.m1991(c1087, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
