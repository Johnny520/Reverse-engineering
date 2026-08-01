package p323;

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
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4210;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4394;
import p217.AbstractC7968;
import p253.AbstractC8189;
import p315.C8671;
import p324.C8738;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8734 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f24628;

    static {
        "payload_selection";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14402(List list) {
        "dirList";
        list.getClass();
        C8738.f24639.getClass();
        this.f24628 = C8738.m14407();
        ListBuilder listBuilderM13685 = AbstractC8189.m13685();
        listBuilderM13685.add(new C8730(StickerDirAdapter$SpecialAction.SORT_CONFIG));
        listBuilderM13685.add(new C8730(StickerDirAdapter$SpecialAction.ONLINE_STICKER));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            listBuilderM13685.add(new C8729((String) it.next()));
        }
        AbstractC7968.m13430(this, listBuilderM13685.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14403(C8671 c8671, String str, boolean z) {
        final GradientDrawable gradientDrawable;
        c8671.m14341(R.id.tv_dir_name, str);
        final TextView textView = (TextView) c8671.m14342(R.id.tv_dir_name);
        boolean zM8917 = AbstractC4394.m8917(this.f24628, str);
        Context context = textView.getContext();
        "getContext(...)";
        context.getClass();
        final C8731 c8731 = zM8917 ? new C8731(context.getColor(R.color.sticker_dir_selected_background), context.getColor(R.color.sticker_dir_selected_border), context.getColor(R.color.sticker_dir_selected_text), 1.0f, 1.0f, 4.0f) : new C8731(0, 0, context.getColor(R.color.sticker_dir_text), 0.94f, 0.72f, 0.0f);
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
        Object tag = textView.getTag(R.id.tag_sticker_dir_state);
        final C8731 c87312 = tag instanceof C8731 ? (C8731) tag : null;
        Object tag2 = textView.getTag(R.id.tag_sticker_dir_color_animator);
        ValueAnimator valueAnimator = tag2 instanceof ValueAnimator ? (ValueAnimator) tag2 : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        textView.animate().cancel();
        float f = c8731.f24615;
        float f2 = c8731.f24616;
        float f3 = c8731.f24617;
        if (z && c87312 != null && textView.isAttachedToWindow()) {
            final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.6f));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(argbEvaluator, c87312, c8731, gradientDrawable, this, textView) { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ TextView f24621;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ GradientDrawable f24622;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C8731 f24623;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ C8731 f24624;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                public final /* synthetic */ ArgbEvaluator f24625;

                {
                    this.f24621 = textView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    "animator";
                    valueAnimator2.getClass();
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    C8731 c87313 = this.f24624;
                    Integer numValueOf = Integer.valueOf(c87313.f24620);
                    C8731 c87314 = this.f24623;
                    Integer numValueOf2 = Integer.valueOf(c87314.f24620);
                    ArgbEvaluator argbEvaluator2 = this.f24625;
                    Object objEvaluate = argbEvaluator2.evaluate(animatedFraction, numValueOf, numValueOf2);
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate.getClass();
                    int iIntValue = ((Integer) objEvaluate).intValue();
                    Object objEvaluate2 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c87313.f24619), Integer.valueOf(c87314.f24619));
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate2.getClass();
                    int iIntValue2 = ((Integer) objEvaluate2).intValue();
                    Object objEvaluate3 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(c87313.f24618), Integer.valueOf(c87314.f24618));
                    "null cannot be cast to non-null type kotlin.Int";
                    objEvaluate3.getClass();
                    int iIntValue3 = ((Integer) objEvaluate3).intValue();
                    GradientDrawable gradientDrawable4 = this.f24622;
                    gradientDrawable4.setColor(iIntValue);
                    TextView textView2 = this.f24621;
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
            valueAnimatorOfFloat.addListener(new C2281(textView, 4, c8731));
            textView.setTag(R.id.tag_sticker_dir_color_animator, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            textView.animate().scaleX(f3).scaleY(f3).alpha(f2).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.6f)).start();
            Context context3 = textView.getContext();
            "getContext(...)";
            context3.getClass();
            float f4 = f * context3.getResources().getDisplayMetrics().density;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            textView.setElevation(f4);
            return;
        }
        gradientDrawable.setColor(c8731.f24620);
        Context context4 = textView.getContext();
        "getContext(...)";
        context4.getClass();
        int i = (int) (1.0f * context4.getResources().getDisplayMetrics().density);
        if (i < 1) {
            i = 1;
        }
        gradientDrawable.setStroke(i, c8731.f24619);
        textView.setTextColor(c8731.f24618);
        textView.setScaleX(f3);
        textView.setScaleY(f3);
        textView.setAlpha(f2);
        Context context5 = textView.getContext();
        "getContext(...)";
        context5.getClass();
        float f5 = f * context5.getResources().getDisplayMetrics().density;
        WeakHashMap weakHashMap2 = AbstractC2270.f6593;
        textView.setElevation(f5);
        textView.setTag(R.id.tag_sticker_dir_state, c8731);
        textView.setTag(R.id.tag_sticker_dir_color_animator, null);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final int mo13425(int i, List list) {
        "list";
        list.getClass();
        AbstractC8728 abstractC8728 = (AbstractC8728) list.get(i);
        if (abstractC8728 instanceof C8730) {
            return 0;
        }
        if (abstractC8728 instanceof C8729) {
            return 1;
        }
        C4210.m8621();
        return 0;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo13426(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        C8671 c8671 = (C8671) abstractC2484;
        Object obj2 = (AbstractC8728) obj;
        "holder";
        "payloads";
        list.getClass();
        if (obj2 == null) {
            return;
        }
        if ((obj2 instanceof C8729) && list.contains("payload_selection")) {
            m14403(c8671, ((C8729) obj2).f24613, true);
        } else {
            mo13429(c8671, i, obj2);
        }
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        "context";
        "parent";
        return new C8671(i == 0 ? R.layout.item_sticker_dir_action : R.layout.item_sticker_dir, viewGroup);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        C8671 c8671 = (C8671) abstractC2484;
        AbstractC8728 abstractC8728 = (AbstractC8728) obj;
        "holder";
        if (abstractC8728 == null) {
            return;
        }
        if (!(abstractC8728 instanceof C8730)) {
            if (abstractC8728 instanceof C8729) {
                m14403(c8671, ((C8729) abstractC8728).f24613, false);
                return;
            } else {
                C4210.m8621();
                return;
            }
        }
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = ((C8730) abstractC8728).f24614;
        ImageView imageView = (ImageView) c8671.m14342(R.id.iv_action_icon);
        int i2 = AbstractC8735.f24629[stickerDirAdapter$SpecialAction.ordinal()];
        if (i2 == 1) {
            imageView.setImageResource(R.drawable.ic_settings_gear);
            imageView.setContentDescription(imageView.getContext().getString(R.string.sticker_action_sort_config));
        } else if (i2 != 2) {
            C4210.m8621();
        } else {
            imageView.setImageResource(R.drawable.ic_cloud);
            imageView.setContentDescription(imageView.getContext().getString(R.string.sticker_action_online_sticker));
        }
    }
}
