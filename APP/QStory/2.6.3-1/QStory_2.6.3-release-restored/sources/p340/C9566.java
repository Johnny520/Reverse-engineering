package p340;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3114;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;
import p233.AbstractC8798;
import p331.C9492;
import p337.C9517;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9566 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f24975;

    static {
        "payload_selection";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14995(List list) {
        "dirList";
        list.getClass();
        C9517.f24851.getClass();
        this.f24975 = C9517.m14971();
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        listBuilderM12470.add(new C9562(StickerDirAdapter$SpecialAction.SORT_CONFIG));
        listBuilderM12470.add(new C9562(StickerDirAdapter$SpecialAction.ONLINE_STICKER));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            listBuilderM12470.add(new C9561((String) it.next()));
        }
        AbstractC8798.m14017(this, listBuilderM12470.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14996(C9492 c9492, String str, boolean z) {
        final GradientDrawable gradientDrawable;
        c9492.m14918(C0328R.id.tv_dir_name, str);
        final TextView textView = (TextView) c9492.m14919(C0328R.id.tv_dir_name);
        boolean zM9466 = AbstractC5227.m9466(this.f24975, str);
        Context context = textView.getContext();
        "getContext(...)";
        context.getClass();
        final C9563 c9563 = zM9466 ? new C9563(context.getColor(C0328R.color.sticker_dir_selected_background), context.getColor(C0328R.color.sticker_dir_selected_border), context.getColor(C0328R.color.sticker_dir_selected_text), 1.0f, 1.0f, 4.0f) : new C9563(0, 0, context.getColor(C0328R.color.sticker_dir_text), 0.94f, 0.72f, 0.0f);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable2 == null) {
            Context context2 = textView.getContext();
            "getContext(...)";
            context2.getClass();
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(18.0f * context2.getResources().getDisplayMetrics().density);
            textView.setBackground(gradientDrawable3);
            gradientDrawable = gradientDrawable3;
        } else {
            gradientDrawable = gradientDrawable2;
        }
        Object tag = textView.getTag(C0328R.id.tag_sticker_dir_state);
        final C9563 c95632 = tag instanceof C9563 ? (C9563) tag : null;
        Object tag2 = textView.getTag(C0328R.id.tag_sticker_dir_color_animator);
        ValueAnimator valueAnimator = tag2 instanceof ValueAnimator ? (ValueAnimator) tag2 : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        textView.animate().cancel();
        float f = c9563.f24962;
        float f2 = c9563.f24963;
        float f3 = c9563.f24964;
        if (z && c95632 != null && textView.isAttachedToWindow()) {
            final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.6f));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(argbEvaluator, c95632, c9563, gradientDrawable, this, textView) { // from class: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世苏兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ TextView f24968;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ GradientDrawable f24969;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C9563 f24970;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ C9563 f24971;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                public final /* synthetic */ ArgbEvaluator f24972;

                {
                    this.f24968 = textView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    "animator";
                    valueAnimator2.getClass();
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    C9563 c95633 = this.f24971;
                    Integer numValueOf = Integer.valueOf(c95633.f24967);
                    C9563 c95634 = this.f24970;
                    Integer numValueOf2 = Integer.valueOf(c95634.f24967);
                    ArgbEvaluator argbEvaluator2 = this.f24972;
                    Object objEvaluate = argbEvaluator2.evaluate(animatedFraction, numValueOf, numValueOf2);
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate.getClass();
                    int iIntValue = ((Integer) objEvaluate).intValue();
                    Object objEvaluate2 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c95633.f24966), Integer.valueOf(c95634.f24966));
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate2.getClass();
                    int iIntValue2 = ((Integer) objEvaluate2).intValue();
                    Object objEvaluate3 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c95633.f24965), Integer.valueOf(c95634.f24965));
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate3.getClass();
                    int iIntValue3 = ((Integer) objEvaluate3).intValue();
                    GradientDrawable gradientDrawable4 = this.f24969;
                    gradientDrawable4.setColor(iIntValue);
                    TextView textView2 = this.f24968;
                    Context context3 = textView2.getContext();
                    "getContext(...)";
                    context3.getClass();
                    int i = (int) (1.0f * context3.getResources().getDisplayMetrics().density);
                    if (i < 1) {
                        i = 1;
                    }
                    gradientDrawable4.setStroke(i, iIntValue2);
                    textView2.setTextColor(iIntValue3);
                }
            });
            valueAnimatorOfFloat.addListener(new C3114(textView, 4, c9563));
            textView.setTag(C0328R.id.tag_sticker_dir_color_animator, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            textView.animate().scaleX(f3).scaleY(f3).alpha(f2).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.6f)).start();
            Context context3 = textView.getContext();
            "getContext(...)";
            context3.getClass();
            float f4 = f * context3.getResources().getDisplayMetrics().density;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            textView.setElevation(f4);
            return;
        }
        gradientDrawable.setColor(c9563.f24967);
        Context context4 = textView.getContext();
        "getContext(...)";
        context4.getClass();
        int i = (int) (1.0f * context4.getResources().getDisplayMetrics().density);
        if (i < 1) {
            i = 1;
        }
        gradientDrawable.setStroke(i, c9563.f24966);
        textView.setTextColor(c9563.f24965);
        textView.setScaleX(f3);
        textView.setScaleY(f3);
        textView.setAlpha(f2);
        Context context5 = textView.getContext();
        "getContext(...)";
        context5.getClass();
        float f5 = f * context5.getResources().getDisplayMetrics().density;
        WeakHashMap weakHashMap2 = AbstractC3103.f6939;
        textView.setElevation(f5);
        textView.setTag(C0328R.id.tag_sticker_dir_state, c9563);
        textView.setTag(C0328R.id.tag_sticker_dir_color_animator, null);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo14012(int i, List list) {
        "list";
        list.getClass();
        AbstractC9560 abstractC9560 = (AbstractC9560) list.get(i);
        if (abstractC9560 instanceof C9562) {
            return 0;
        }
        if (abstractC9560 instanceof C9561) {
            return 1;
        }
        C5043.m9170();
        return 0;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo14013(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        C9492 c9492 = (C9492) abstractC3317;
        Object obj2 = (AbstractC9560) obj;
        "holder";
        "payloads";
        list.getClass();
        if (obj2 == null) {
            return;
        }
        if ((obj2 instanceof C9561) && list.contains("payload_selection")) {
            m14996(c9492, ((C9561) obj2).f24960, true);
        } else {
            mo14016(c9492, i, obj2);
        }
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        "context";
        "parent";
        return new C9492(i == 0 ? C0328R.layout.item_sticker_dir_action : C0328R.layout.item_sticker_dir, viewGroup);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        C9492 c9492 = (C9492) abstractC3317;
        AbstractC9560 abstractC9560 = (AbstractC9560) obj;
        "holder";
        if (abstractC9560 == null) {
            return;
        }
        if (!(abstractC9560 instanceof C9562)) {
            if (abstractC9560 instanceof C9561) {
                m14996(c9492, ((C9561) abstractC9560).f24960, false);
                return;
            } else {
                C5043.m9170();
                return;
            }
        }
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = ((C9562) abstractC9560).f24961;
        ImageView imageView = (ImageView) c9492.m14919(C0328R.id.iv_action_icon);
        int i2 = AbstractC9567.f24976[stickerDirAdapter$SpecialAction.ordinal()];
        if (i2 == 1) {
            imageView.setImageResource(C0328R.drawable.ic_settings_gear);
            imageView.setContentDescription(imageView.getContext().getString(C0328R.string.sticker_action_sort_config));
        } else if (i2 != 2) {
            C5043.m9170();
        } else {
            imageView.setImageResource(C0328R.drawable.ic_cloud);
            imageView.setContentDescription(imageView.getContext().getString(C0328R.string.sticker_action_online_sticker));
        }
    }
}
