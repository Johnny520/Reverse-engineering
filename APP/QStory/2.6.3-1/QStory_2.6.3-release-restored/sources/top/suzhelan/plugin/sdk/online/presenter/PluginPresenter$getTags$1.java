package top.suzhelan.plugin.sdk.online.presenter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.C3382;
import com.bumptech.glide.load.engine.C3837;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p208.C8637;
import p233.AbstractC8798;
import p358.ViewOnClickListenerC9645;
import p402.C9908;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.plugin.sdk.online.widget.CustomChipGroup;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1", m556f = "PluginPresenter.kt", m557l = {49}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PluginPresenter$getTags$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6635 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getTags$1$1", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07971 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ List<String> $tags;
        int label;
        final /* synthetic */ C6635 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07971(C6635 c6635, List<String> list, InterfaceC5189<? super C07971> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6635;
            this.$tags = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07971(this.this$0, this.$tags, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07971) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C3837 c3837 = this.this$0.f16265;
            List<String> list = this.$tags;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c3837.f9881;
            if (progressBar == null) {
                AbstractC5227.m9467("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            CustomChipGroup customChipGroup = (CustomChipGroup) c3837.f9878;
            if (customChipGroup == null) {
                AbstractC5227.m9467("chipGroup");
                throw null;
            }
            customChipGroup.removeAllViews();
            C8637 c8637 = new C8637((Activity) c3837.f9884, C0328R.style.AppTheme);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Chip chip = new Chip(c8637, null);
                chip.setText(list.get(i));
                chip.setId(View.generateViewId());
                chip.setOnClickListener(new ViewOnClickListenerC9645(c3837, i, 1));
                CustomChipGroup customChipGroup2 = (CustomChipGroup) c3837.f9878;
                if (customChipGroup2 == null) {
                    AbstractC5227.m9467("chipGroup");
                    throw null;
                }
                customChipGroup2.addView(chip, new ViewGroup.LayoutParams(-2, -2));
            }
            C9908 c9908 = new C9908((C6635) c3837.f9883);
            C3382 c3382 = (C3382) c3837.f9880;
            if (c3382 == null) {
                AbstractC5227.m9467("viewPager");
                throw null;
            }
            c3382.setAdapter(c9908);
            AbstractC8798.m14017(c9908, list);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$getTags$1(C6635 c6635, InterfaceC5189<? super PluginPresenter$getTags$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6635;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PluginPresenter$getTags$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PluginPresenter$getTags$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ArrayList arrayList = new ArrayList();
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getTags().execute().f16101;
            if (qSResult != null && qSResult.getStatus() == 200) {
                Object data = qSResult.getData();
                data.getClass();
                arrayList.addAll((Collection) data);
            }
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07971 c07971 = new C07971(this.this$0, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c07971, this) == coroutineSingletons) {
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
