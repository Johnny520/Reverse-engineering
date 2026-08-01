package top.suzhelan.sticker.sdk.presenter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
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
import p253.AbstractC8189;
import p343.C8825;
import p343.RunnableC8829;
import p343.ViewOnClickListenerC8830;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.sticker.sdk.entity.TagInfo;
import top.suzhelan.sticker.sdk.net.StickerApiService;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1", f = "StickerPresenter.kt", l = {47}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$getTags$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5979 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getTags$1$2", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ List<String> $tags;
        int label;
        final /* synthetic */ C5979 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C5979 c5979, List<String> list, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5979;
            this.$tags = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.this$0, this.$tags, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            C3004 c3004 = this.this$0.f16296;
            List<String> list = this.$tags;
            Activity activity = (Activity) c3004.f9537;
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
            C7807 c7807 = new C7807(activity, R.style.AppTheme);
            ArrayList arrayListM13657 = AbstractC8189.m13657("全部");
            arrayListM13657.addAll(list);
            int size = arrayListM13657.size();
            for (int i = 0; i < size; i++) {
                Chip chip = new Chip(c7807, null);
                chip.setText((CharSequence) arrayListM13657.get(i));
                chip.setId(View.generateViewId());
                chip.setOnClickListener(new ViewOnClickListenerC8830(c3004, i, 0));
                CustomChipGroup customChipGroup2 = (CustomChipGroup) c3004.f9531;
                if (customChipGroup2 == null) {
                    AbstractC4394.m8918("chipGroup");
                    throw null;
                }
                customChipGroup2.addView(chip, new ViewGroup.LayoutParams(-2, -2));
            }
            C8825 c8825 = new C8825((C5979) c3004.f9536, activity);
            C2549 c2549 = (C2549) c3004.f9533;
            if (c2549 == null) {
                AbstractC4394.m8918("viewPager");
                throw null;
            }
            c2549.setAdapter(c8825);
            AbstractC7968.m13430(c8825, arrayListM13657);
            C2549 c25492 = (C2549) c3004.f9533;
            if (c25492 != null) {
                c25492.post(new RunnableC8829(c3004, 0));
                return C5175.f14739;
            }
            AbstractC4394.m8918("viewPager");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$getTags$1(C5979 c5979, InterfaceC4356<? super StickerPresenter$getTags$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c5979;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new StickerPresenter$getTags$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StickerPresenter$getTags$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            ArrayList arrayList = new ArrayList();
            StickerResult stickerResult = (StickerResult) StickerApiService.getTags$default(StickerClientKt.getStickerApiService(), 0, 1, null).execute().f15756;
            if (stickerResult != null && stickerResult.isSuccess() && stickerResult.getData() != null) {
                Iterable iterable = (Iterable) stickerResult.getData();
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TagInfo) it.next()).getName());
                }
                arrayList.addAll(arrayList2);
            }
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass2, this) == coroutineSingletons) {
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
