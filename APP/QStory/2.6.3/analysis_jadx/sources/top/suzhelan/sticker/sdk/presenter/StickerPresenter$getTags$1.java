package top.suzhelan.sticker.sdk.presenter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.load.engine.C3005;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.internal.AbstractC5365;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p093.C7201;
import p095.C7207;
import p192.C7808;
import p217.AbstractC7969;
import p342.C8811;
import p342.RunnableC8815;
import p342.ViewOnClickListenerC8816;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.sticker.sdk.entity.TagInfo;
import top.suzhelan.sticker.sdk.net.StickerApiService;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1", f = "StickerPresenter.kt", l = {47}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$getTags$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5985 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ List<String> $tags;
        int label;
        final /* synthetic */ C5985 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C5985 c5985, List<String> list, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5985;
            this.$tags = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.this$0, this.$tags, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            C3005 c3005 = this.this$0.f16305;
            List<String> list = this.$tags;
            Activity activity = (Activity) c3005.f9539;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c3005.f9536;
            if (progressBar == null) {
                AbstractC4395.m8908("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            CustomChipGroup customChipGroup = (CustomChipGroup) c3005.f9533;
            if (customChipGroup == null) {
                AbstractC4395.m8908("chipGroup");
                throw null;
            }
            customChipGroup.removeAllViews();
            C7808 c7808 = new C7808(activity, R.style.AppTheme);
            ArrayList arrayListM11916 = AbstractC6347.m11916("全部");
            arrayListM11916.addAll(list);
            int size = arrayListM11916.size();
            for (int i = 0; i < size; i++) {
                Chip chip = new Chip(c7808, null);
                chip.setText((CharSequence) arrayListM11916.get(i));
                chip.setId(View.generateViewId());
                chip.setOnClickListener(new ViewOnClickListenerC8816(c3005, i, 0));
                CustomChipGroup customChipGroup2 = (CustomChipGroup) c3005.f9533;
                if (customChipGroup2 == null) {
                    AbstractC4395.m8908("chipGroup");
                    throw null;
                }
                customChipGroup2.addView(chip, new ViewGroup.LayoutParams(-2, -2));
            }
            C8811 c8811 = new C8811((C5985) c3005.f9538, activity);
            C2549 c2549 = (C2549) c3005.f9535;
            if (c2549 == null) {
                AbstractC4395.m8908("viewPager");
                throw null;
            }
            c2549.setAdapter(c8811);
            AbstractC7969.m13458(c8811, arrayListM11916);
            C2549 c25492 = (C2549) c3005.f9535;
            if (c25492 != null) {
                c25492.post(new RunnableC8815(c3005, 0));
                return C5176.f14739;
            }
            AbstractC4395.m8908("viewPager");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$getTags$1(C5985 c5985, InterfaceC4357<? super StickerPresenter$getTags$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c5985;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new StickerPresenter$getTags$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StickerPresenter$getTags$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            ArrayList arrayList = new ArrayList();
            StickerResult stickerResult = (StickerResult) StickerApiService.getTags$default(StickerClientKt.getStickerApiService(), 0, 1, null).execute().f15756;
            if (stickerResult != null && stickerResult.isSuccess() && stickerResult.getData() != null) {
                Iterable iterable = (Iterable) stickerResult.getData();
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TagInfo) it.next()).getName());
                }
                arrayList.addAll(arrayList2);
            }
            C7207 c7207 = AbstractC5395.f15030;
            C7201 c7201 = AbstractC5365.f14960;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC5399.m10470(c7201, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
