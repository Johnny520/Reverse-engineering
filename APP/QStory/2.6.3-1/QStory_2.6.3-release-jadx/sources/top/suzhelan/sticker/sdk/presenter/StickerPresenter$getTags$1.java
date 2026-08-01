package top.suzhelan.sticker.sdk.presenter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.C3382;
import com.bumptech.glide.load.engine.C3837;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p208.C8637;
import p233.AbstractC8798;
import p358.C9640;
import p358.RunnableC9644;
import p358.ViewOnClickListenerC9645;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.TagInfo;
import top.suzhelan.sticker.sdk.net.StickerApiService;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1", m556f = "StickerPresenter.kt", m557l = {47}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class StickerPresenter$getTags$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6815 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08092 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ List<String> $tags;
        int label;
        final /* synthetic */ C6815 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08092(C6815 c6815, List<String> list, InterfaceC5189<? super C08092> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6815;
            this.$tags = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08092(this.this$0, this.$tags, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08092) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C3837 c3837 = this.this$0.f16650;
            List<String> list = this.$tags;
            Activity activity = (Activity) c3837.f9884;
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
            C8637 c8637 = new C8637(activity, C0328R.style.AppTheme);
            ArrayList arrayListM12475 = AbstractC7176.m12475("全部");
            arrayListM12475.addAll(list);
            int size = arrayListM12475.size();
            for (int i = 0; i < size; i++) {
                Chip chip = new Chip(c8637, null);
                chip.setText((CharSequence) arrayListM12475.get(i));
                chip.setId(View.generateViewId());
                chip.setOnClickListener(new ViewOnClickListenerC9645(c3837, i, 0));
                CustomChipGroup customChipGroup2 = (CustomChipGroup) c3837.f9878;
                if (customChipGroup2 == null) {
                    AbstractC5227.m9467("chipGroup");
                    throw null;
                }
                customChipGroup2.addView(chip, new ViewGroup.LayoutParams(-2, -2));
            }
            C9640 c9640 = new C9640((C6815) c3837.f9883, activity);
            C3382 c3382 = (C3382) c3837.f9880;
            if (c3382 == null) {
                AbstractC5227.m9467("viewPager");
                throw null;
            }
            c3382.setAdapter(c9640);
            AbstractC8798.m14017(c9640, arrayListM12475);
            C3382 c33822 = (C3382) c3837.f9880;
            if (c33822 != null) {
                c33822.post(new RunnableC9644(c3837, 0));
                return C6008.f15084;
            }
            AbstractC5227.m9467("viewPager");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$getTags$1(C6815 c6815, InterfaceC5189<? super StickerPresenter$getTags$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6815;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StickerPresenter$getTags$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StickerPresenter$getTags$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ArrayList arrayList = new ArrayList();
            StickerResult stickerResult = (StickerResult) StickerApiService.getTags$default(StickerClientKt.getStickerApiService(), 0, 1, null).execute().f16101;
            if (stickerResult != null && stickerResult.isSuccess() && stickerResult.getData() != null) {
                Iterable iterable = (Iterable) stickerResult.getData();
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TagInfo) it.next()).getName());
                }
                arrayList.addAll(arrayList2);
            }
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C08092 c08092 = new C08092(this.this$0, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c08092, this) == coroutineSingletons) {
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
