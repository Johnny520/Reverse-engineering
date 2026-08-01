package p324;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2281;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4211;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p315.C8663;
import p321.C8688;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8737 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f24630;

    static {
        AbstractC8405.m13972(2718);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14436(List list) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        list.getClass();
        C8688.f24506.getClass();
        this.f24630 = C8688.m14412();
        ListBuilder listBuilderM11911 = AbstractC6347.m11911();
        listBuilderM11911.add(new C8733(StickerDirAdapter$SpecialAction.SORT_CONFIG));
        listBuilderM11911.add(new C8733(StickerDirAdapter$SpecialAction.ONLINE_STICKER));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            listBuilderM11911.add(new C8732((String) it.next()));
        }
        AbstractC7969.m13458(this, listBuilderM11911.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14437(C8663 c8663, String str, boolean z) {
        final GradientDrawable gradientDrawable;
        c8663.m14359(R.id.tv_dir_name, str);
        final TextView textView = (TextView) c8663.m14360(R.id.tv_dir_name);
        boolean zM8907 = AbstractC4395.m8907(this.f24630, str);
        Context context = textView.getContext();
        AbstractC8405.m13972(1309);
        context.getClass();
        final C8734 c8734 = zM8907 ? new C8734(context.getColor(R.color.sticker_dir_selected_background), context.getColor(R.color.sticker_dir_selected_border), context.getColor(R.color.sticker_dir_selected_text), 1.0f, 1.0f, 4.0f) : new C8734(0, 0, context.getColor(R.color.sticker_dir_text), 0.94f, 0.72f, 0.0f);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable2 == null) {
            Context context2 = textView.getContext();
            AbstractC8405.m13972(1309);
            context2.getClass();
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(18.0f * context2.getResources().getDisplayMetrics().density);
            textView.setBackground(gradientDrawable3);
            gradientDrawable = gradientDrawable3;
        } else {
            gradientDrawable = gradientDrawable2;
        }
        Object tag = textView.getTag(R.id.tag_sticker_dir_state);
        final C8734 c87342 = tag instanceof C8734 ? (C8734) tag : null;
        Object tag2 = textView.getTag(R.id.tag_sticker_dir_color_animator);
        ValueAnimator valueAnimator = tag2 instanceof ValueAnimator ? (ValueAnimator) tag2 : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        textView.animate().cancel();
        float f = c8734.f24617;
        float f2 = c8734.f24618;
        float f3 = c8734.f24619;
        if (z && c87342 != null && textView.isAttachedToWindow()) {
            final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.6f));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(argbEvaluator, c87342, c8734, gradientDrawable, this, textView) { // from class: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世苏兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ TextView f24623;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ GradientDrawable f24624;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C8734 f24625;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ C8734 f24626;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                public final /* synthetic */ ArgbEvaluator f24627;

                {
                    this.f24623 = textView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractC8405.m13972(2719);
                    valueAnimator2.getClass();
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    C8734 c87343 = this.f24626;
                    Integer numValueOf = Integer.valueOf(c87343.f24622);
                    C8734 c87344 = this.f24625;
                    Integer numValueOf2 = Integer.valueOf(c87344.f24622);
                    ArgbEvaluator argbEvaluator2 = this.f24627;
                    Object objEvaluate = argbEvaluator2.evaluate(animatedFraction, numValueOf, numValueOf2);
                    AbstractC8405.m13972(1866);
                    objEvaluate.getClass();
                    int iIntValue = ((Integer) objEvaluate).intValue();
                    Object objEvaluate2 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c87343.f24621), Integer.valueOf(c87344.f24621));
                    AbstractC8405.m13972(1866);
                    objEvaluate2.getClass();
                    int iIntValue2 = ((Integer) objEvaluate2).intValue();
                    Object objEvaluate3 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c87343.f24620), Integer.valueOf(c87344.f24620));
                    AbstractC8405.m13972(1866);
                    objEvaluate3.getClass();
                    int iIntValue3 = ((Integer) objEvaluate3).intValue();
                    GradientDrawable gradientDrawable4 = this.f24624;
                    gradientDrawable4.setColor(iIntValue);
                    TextView textView2 = this.f24623;
                    Context context3 = textView2.getContext();
                    AbstractC8405.m13972(1309);
                    context3.getClass();
                    int i = (int) (1.0f * context3.getResources().getDisplayMetrics().density);
                    if (i < 1) {
                        i = 1;
                    }
                    gradientDrawable4.setStroke(i, iIntValue2);
                    textView2.setTextColor(iIntValue3);
                }
            });
            valueAnimatorOfFloat.addListener(new C2281(textView, 4, c8734));
            textView.setTag(R.id.tag_sticker_dir_color_animator, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            textView.animate().scaleX(f3).scaleY(f3).alpha(f2).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.6f)).start();
            Context context3 = textView.getContext();
            AbstractC8405.m13972(1309);
            context3.getClass();
            float f4 = f * context3.getResources().getDisplayMetrics().density;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            textView.setElevation(f4);
            return;
        }
        gradientDrawable.setColor(c8734.f24622);
        Context context4 = textView.getContext();
        AbstractC8405.m13972(1309);
        context4.getClass();
        int i = (int) (1.0f * context4.getResources().getDisplayMetrics().density);
        if (i < 1) {
            i = 1;
        }
        gradientDrawable.setStroke(i, c8734.f24621);
        textView.setTextColor(c8734.f24620);
        textView.setScaleX(f3);
        textView.setScaleY(f3);
        textView.setAlpha(f2);
        Context context5 = textView.getContext();
        AbstractC8405.m13972(1309);
        context5.getClass();
        float f5 = f * context5.getResources().getDisplayMetrics().density;
        WeakHashMap weakHashMap2 = AbstractC2270.f6594;
        textView.setElevation(f5);
        textView.setTag(R.id.tag_sticker_dir_state, c8734);
        textView.setTag(R.id.tag_sticker_dir_color_animator, null);
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo13453(int i, List list) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
        list.getClass();
        AbstractC8731 abstractC8731 = (AbstractC8731) list.get(i);
        if (abstractC8731 instanceof C8733) {
            return 0;
        }
        if (abstractC8731 instanceof C8732) {
            return 1;
        }
        C4211.m8611();
        return 0;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo13454(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        C8663 c8663 = (C8663) abstractC2484;
        Object obj2 = (AbstractC8731) obj;
        AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        AbstractC8405.m13972(2717);
        list.getClass();
        if (obj2 == null) {
            return;
        }
        if ((obj2 instanceof C8732) && list.contains(AbstractC8405.m13972(2718))) {
            m14437(c8663, ((C8732) obj2).f24615, true);
        } else {
            mo13457(c8663, i, obj2);
        }
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        return new C8663(i == 0 ? R.layout.item_sticker_dir_action : R.layout.item_sticker_dir, viewGroup);
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        C8663 c8663 = (C8663) abstractC2484;
        AbstractC8731 abstractC8731 = (AbstractC8731) obj;
        AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        if (abstractC8731 == null) {
            return;
        }
        if (!(abstractC8731 instanceof C8733)) {
            if (abstractC8731 instanceof C8732) {
                m14437(c8663, ((C8732) abstractC8731).f24615, false);
                return;
            } else {
                C4211.m8611();
                return;
            }
        }
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = ((C8733) abstractC8731).f24616;
        ImageView imageView = (ImageView) c8663.m14360(R.id.iv_action_icon);
        int i2 = AbstractC8738.f24631[stickerDirAdapter$SpecialAction.ordinal()];
        if (i2 == 1) {
            imageView.setImageResource(R.drawable.ic_settings_gear);
            imageView.setContentDescription(imageView.getContext().getString(R.string.sticker_action_sort_config));
        } else if (i2 != 2) {
            C4211.m8611();
        } else {
            imageView.setImageResource(R.drawable.ic_cloud);
            imageView.setContentDescription(imageView.getContext().getString(R.string.sticker_action_online_sticker));
        }
    }
}
