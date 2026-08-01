package top.suzhelan.plugin.sdk.online.presenter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import p192.C7807;
import p217.AbstractC7968;
import p343.ViewOnClickListenerC8830;
import p385.C9092;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.plugin.sdk.online.widget.CustomChipGroup;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1", f = "PluginPresenter.kt", l = {49}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PluginPresenter$getTags$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5804 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1$1", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ List<String> $tags;
        int label;
        final /* synthetic */ C5804 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C5804 c5804, List<String> list, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5804;
            this.$tags = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.this$0, this.$tags, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            C3004 c3004 = this.this$0.f15920;
            List<String> list = this.$tags;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c3004.f9534;
            if (progressBar == null) {
                AbstractC4394.m8918("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            CustomChipGroup customChipGroup = (CustomChipGroup) c3004.f9531;
            if (customChipGroup == null) {
                AbstractC4394.m8918("chipGroup");
                throw null;
            }
            customChipGroup.removeAllViews();
            C7807 c7807 = new C7807((Activity) c3004.f9537, R.style.AppTheme);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Chip chip = new Chip(c7807, null);
                chip.setText(list.get(i));
                chip.setId(View.generateViewId());
                chip.setOnClickListener(new ViewOnClickListenerC8830(c3004, i, 1));
                CustomChipGroup customChipGroup2 = (CustomChipGroup) c3004.f9531;
                if (customChipGroup2 == null) {
                    AbstractC4394.m8918("chipGroup");
                    throw null;
                }
                customChipGroup2.addView(chip, new ViewGroup.LayoutParams(-2, -2));
            }
            C9092 c9092 = new C9092((C5804) c3004.f9536);
            C2549 c2549 = (C2549) c3004.f9533;
            if (c2549 == null) {
                AbstractC4394.m8918("viewPager");
                throw null;
            }
            c2549.setAdapter(c9092);
            AbstractC7968.m13430(c9092, list);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$getTags$1(C5804 c5804, InterfaceC4356<? super PluginPresenter$getTags$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c5804;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PluginPresenter$getTags$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PluginPresenter$getTags$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            ArrayList arrayList = new ArrayList();
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getTags().execute().f15756;
            if (qSResult != null && qSResult.getStatus() == 200) {
                Object data = qSResult.getData();
                data.getClass();
                arrayList.addAll((Collection) data);
            }
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
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
