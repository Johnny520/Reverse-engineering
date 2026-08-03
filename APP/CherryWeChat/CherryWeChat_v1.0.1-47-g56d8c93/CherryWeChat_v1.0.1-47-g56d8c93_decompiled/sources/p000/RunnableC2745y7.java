package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: y7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2745y7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f9373b;

    public /* synthetic */ RunnableC2745y7(ViewGroup viewGroup, int i) {
        this.f9372a = i;
        this.f9373b = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0446  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws IllegalAccessException {
        int i = this.f9372a;
        int i2 = 0;
        ViewGroup viewGroup = this.f9373b;
        switch (i) {
            case 0:
                AbstractC0585Nj.m1142j(viewGroup);
                break;
            case 1:
                Float fValueOf = Float.valueOf(32.0f);
                C1456gf.m2805o(viewGroup);
                int i3 = AbstractC1450gG.f5067a;
                Field[] declaredFields = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-183944859351093L)).getDeclaredFields();
                AbstractC0295Gu.m625r(-184133837912117L);
                int length = declaredFields.length;
                int i4 = 0;
                while (i4 < length) {
                    Field field = declaredFields[i4];
                    field.setAccessible(true);
                    Object obj = field.get(viewGroup);
                    if (obj instanceof View) {
                        View view = (View) obj;
                        if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-209950886328373L)) && (view.getParent() instanceof LinearLayout)) {
                            Context context = view.getContext();
                            HashMap map = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-209611583911989L));
                            if (drawableM2890b != null) {
                                ViewParent parent = view.getParent();
                                AbstractC0295Gu.m625r(-208172769867829L);
                                final View viewM2788F = C1456gf.m2788F((ViewGroup) parent, i2);
                                AbstractC0295Gu.m625r(-207880712091701L);
                                viewM2788F.setAlpha(0.0f);
                                ViewParent parent2 = viewM2788F.getParent();
                                AbstractC0295Gu.m625r(-208666691106869L);
                                LinearLayout linearLayout = (LinearLayout) parent2;
                                int iIndexOfChild = linearLayout.indexOfChild(viewM2788F);
                                ViewGroup.LayoutParams layoutParams = viewM2788F.getLayoutParams();
                                AbstractC0295Gu.m625r(-208396108167221L);
                                linearLayout.removeView(viewM2788F);
                                final FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.addView(viewM2788F);
                                ImageView imageViewM2808t = C1456gf.m2808t(context, drawableM2890b);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                                layoutParams2.gravity = 17;
                                frameLayout.addView(imageViewM2808t, layoutParams2);
                                linearLayout.addView(frameLayout, iIndexOfChild, (LinearLayout.LayoutParams) layoutParams);
                                frameLayout.setVisibility(viewM2788F.getVisibility());
                                final int i5 = 0;
                                viewM2788F.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: G7
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        switch (i5) {
                                            case 0:
                                                FrameLayout frameLayout2 = (FrameLayout) frameLayout;
                                                View view2 = viewM2788F;
                                                if (view2.getVisibility() != frameLayout2.getVisibility()) {
                                                    frameLayout2.setVisibility(view2.getVisibility());
                                                }
                                                break;
                                            default:
                                                TextView textView = (TextView) viewM2788F;
                                                ImageView imageView = (ImageView) frameLayout;
                                                if (textView.getVisibility() != 0) {
                                                    imageView.setAlpha(1.0f);
                                                } else {
                                                    imageView.setAlpha(0.0f);
                                                }
                                                break;
                                        }
                                        return true;
                                    }
                                });
                            }
                        }
                        if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-210629491161141L)) && (view.getParent() instanceof LinearLayout)) {
                            Context context2 = view.getContext();
                            HashMap map2 = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-209190677116981L));
                            if (drawableM2890b2 != null) {
                                view.setAlpha(0.0f);
                                ViewParent parent3 = view.getParent();
                                AbstractC0295Gu.m625r(-209336706005045L);
                                LinearLayout linearLayout2 = (LinearLayout) parent3;
                                int iIndexOfChild2 = linearLayout2.indexOfChild(view);
                                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                AbstractC0295Gu.m625r(-209066123065397L);
                                linearLayout2.removeView(view);
                                FrameLayout frameLayout2 = new FrameLayout(context2);
                                frameLayout2.addView(view);
                                ImageView imageViewM2808t2 = C1456gf.m2808t(context2, drawableM2890b2);
                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                                layoutParams4.gravity = 17;
                                frameLayout2.addView(imageViewM2808t2, layoutParams4);
                                linearLayout2.addView(frameLayout2, iIndexOfChild2, (LinearLayout.LayoutParams) layoutParams3);
                            }
                        }
                        if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-207081848174645L)) && AbstractC0585Nj.m1134a(view.getTag(R.id.tag_we_img_name), AbstractC0295Gu.m625r(-206742545758261L))) {
                            HashMap map3 = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-206832740071477L));
                            if (drawableM2890b3 != null) {
                                view.setAlpha(0.0f);
                                Context context3 = view.getContext();
                                AbstractC0295Gu.m625r(-206978768959541L);
                                ImageView imageViewM2808t3 = C1456gf.m2808t(context3, drawableM2890b3);
                                ViewParent parent4 = view.getParent();
                                AbstractC0295Gu.m625r(-207597244250165L);
                                RelativeLayout relativeLayout = (RelativeLayout) parent4;
                                ViewGroup.LayoutParams layoutParams5 = relativeLayout.getLayoutParams();
                                AbstractC0295Gu.m625r(-207335251245109L);
                                ((LinearLayout.LayoutParams) layoutParams5).bottomMargin = AbstractC0295Gu.m616i(2);
                                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                                layoutParams6.addRule(13);
                                relativeLayout.addView(imageViewM2808t3, layoutParams6);
                            }
                        }
                        if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-206020991252533L))) {
                            Object tag = view.getTag(R.id.tag_we_img_name);
                            if (!AbstractC0585Nj.m1134a(tag, AbstractC0295Gu.m625r(-205681688836149L)) && !AbstractC0585Nj.m1134a(tag, AbstractC0295Gu.m625r(-205771883149365L)) && !AbstractC0585Nj.m1134a(tag, AbstractC0295Gu.m625r(-205862077462581L)) && (view.getParent() instanceof RelativeLayout)) {
                                ViewParent parent5 = view.getParent();
                                AbstractC0295Gu.m625r(-206519207458869L);
                                RelativeLayout relativeLayout2 = (RelativeLayout) parent5;
                                View childAt = relativeLayout2.getChildAt(2);
                                AbstractC0295Gu.m625r(-206257214453813L);
                                final TextView textView = (TextView) childAt;
                                Object parent6 = textView.getParent();
                                AbstractC0295Gu.m625r(-204869940017205L);
                                ((View) parent6).getLayoutParams().width = AbstractC0295Gu.m616i(50);
                                HashMap map4 = AbstractC0999XA.f3193a;
                                Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-204556407404597L));
                                if (drawableM2890b4 != null) {
                                    view.setAlpha(0.0f);
                                    Context context4 = view.getContext();
                                    AbstractC0295Gu.m625r(-204698141325365L);
                                    final ImageView imageViewM2808t4 = C1456gf.m2808t(context4, drawableM2890b4);
                                    RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                                    layoutParams7.addRule(13);
                                    relativeLayout2.addView(imageViewM2808t4, layoutParams7);
                                    final int i6 = 1;
                                    relativeLayout2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: G7
                                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                        public final boolean onPreDraw() {
                                            switch (i6) {
                                                case 0:
                                                    FrameLayout frameLayout22 = (FrameLayout) imageViewM2808t4;
                                                    View view2 = textView;
                                                    if (view2.getVisibility() != frameLayout22.getVisibility()) {
                                                        frameLayout22.setVisibility(view2.getVisibility());
                                                    }
                                                    break;
                                                default:
                                                    TextView textView2 = (TextView) textView;
                                                    ImageView imageView = (ImageView) imageViewM2808t4;
                                                    if (textView2.getVisibility() != 0) {
                                                        imageView.setAlpha(1.0f);
                                                    } else {
                                                        imageView.setAlpha(0.0f);
                                                    }
                                                    break;
                                            }
                                            return true;
                                        }
                                    });
                                }
                                Drawable drawableM2890b5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-204766860802101L));
                                if (drawableM2890b5 != null) {
                                    textView.setTag(R.id.tag_view_bg_ban, null);
                                    textView.setBackground(drawableM2890b5);
                                    textView.setTag(R.id.tag_view_bg_ban, Object.class);
                                    int iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-205458350536757L));
                                    textView.setTag(R.id.tag_textview_color_ban, null);
                                    textView.setTextColor(iM2889a);
                                    textView.setTag(R.id.tag_textview_color_ban, TextView.class);
                                }
                            }
                        }
                        if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-205578609621045L))) {
                            HashMap map5 = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b6 = C1517hw.m2890b(AbstractC0295Gu.m625r(-205243602171957L));
                            if (drawableM2890b6 != null) {
                                Context context5 = view.getContext();
                                AbstractC0295Gu.m625r(-203706003879989L);
                                ImageView imageViewM2808t5 = C1456gf.m2808t(context5, drawableM2890b6);
                                AbstractC0295Gu.m625r(-203774723356725L);
                                ((ViewGroup) view).addView(imageViewM2808t5, 0, new ViewGroup.LayoutParams(-1, -1));
                            }
                            if (view.getClass().getName().equals(AbstractC0295Gu.m625r(-203482665580597L))) {
                                HashMap map6 = AbstractC0999XA.f3193a;
                                Drawable drawableM2890b7 = C1517hw.m2890b(AbstractC0295Gu.m625r(-203654464272437L));
                                if (drawableM2890b7 != null) {
                                    view.setTag(R.id.tag_view_bg_ban, null);
                                    view.setBackground(drawableM2890b7);
                                    view.setTag(R.id.tag_view_bg_ban, Object.class);
                                }
                                try {
                                    HashMap map7 = AbstractC0999XA.f3193a;
                                    int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-204315889236021L));
                                    if (iM2889a2 != 0 && (view instanceof LinearLayout) && (((LinearLayout) view).getParent() instanceof LinearLayout)) {
                                        ViewGroup.LayoutParams layoutParams8 = ((LinearLayout) view).getLayoutParams();
                                        AbstractC0295Gu.m625r(-204414673483829L);
                                        if (((LinearLayout.LayoutParams) layoutParams8).weight == 1.0f && (AbstractC0295Gu.m618k((ViewGroup) view, 0) instanceof TextView)) {
                                            View viewM618k = AbstractC0295Gu.m618k((ViewGroup) view, 0);
                                            AbstractC0295Gu.m625r(-204199925119029L);
                                            ((TextView) viewM618k).setTextColor(iM2889a2);
                                            ViewParent parent7 = ((LinearLayout) view).getParent();
                                            AbstractC0295Gu.m625r(-202812650682421L);
                                            View viewM618k2 = AbstractC0295Gu.m618k((ViewGroup) parent7, 1);
                                            AbstractC0295Gu.m625r(-202520592906293L);
                                            View viewM618k3 = AbstractC0295Gu.m618k((ViewGroup) viewM618k2, 0);
                                            String strM625r = AbstractC0295Gu.m625r(-203328046757941L);
                                            Object[] objArr = {Integer.valueOf(iM2889a2)};
                                            AbstractC0295Gu.m625r(-578325936338997L);
                                            XposedHelpers.callMethod(viewM618k3, strM625r, Arrays.copyOf(objArr, 1));
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                if (view.getClass().getName().equals(Button.class.getName()) && view.isSoundEffectsEnabled()) {
                                    HashMap map8 = AbstractC0999XA.f3193a;
                                    int iM2889a3 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-203383881332789L));
                                    if (iM2889a3 != 0) {
                                        AbstractC0295Gu.m625r(-202932909766709L);
                                        ((Button) view).setTextColor(iM2889a3);
                                    }
                                }
                            }
                        }
                    }
                    i4++;
                    i2 = 0;
                }
                View viewM2788F2 = C1456gf.m2788F(viewGroup, i2);
                AbstractC0295Gu.m625r(-183682866346037L);
                HashMap map9 = AbstractC0999XA.f3193a;
                C1456gf.m2796N(viewM2788F2, C1517hw.m2890b(AbstractC0295Gu.m625r(-184468845361205L)));
                break;
            case 2:
                AbstractC1293cr.m2531D(viewGroup);
                HashMap map10 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b8 = C1517hw.m2890b(AbstractC0295Gu.m625r(-190980015781941L));
                viewGroup.setTag(R.id.tag_view_bg_ban, null);
                viewGroup.setBackground(drawableM2890b8);
                viewGroup.setTag(R.id.tag_view_bg_ban, Object.class);
                break;
            case 3:
                C1265ch.f4301b.m2406f(viewGroup);
                break;
            default:
                ViewParent parent8 = viewGroup.findViewById(AbstractC0828TB.f2617i).getParent().getParent().getParent().getParent().getParent();
                AbstractC0295Gu.m625r(-521718267377717L);
                ViewGroup viewGroup2 = (ViewGroup) parent8;
                C1456gf.m2806q(viewGroup);
                AbstractC0295Gu.m625r(-525463478859829L);
                ImageView imageView = new ImageView(viewGroup2.getContext());
                HashMap map11 = AbstractC0999XA.f3193a;
                imageView.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
                viewGroup2.addView(imageView, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(viewGroup2.getContext(), "status_bar_height") + C1456gf.f5171o));
                C1456gf.m2809u(viewGroup2);
                Context context6 = viewGroup2.getContext();
                AbstractC0295Gu.m625r(-521426209601589L);
                HashMap map12 = AbstractC0999XA.f3193a;
                viewGroup2.addView(C1456gf.m2808t(context6, C1517hw.m2890b(AbstractC0295Gu.m625r(-522044684892213L))), 0, new ViewGroup.LayoutParams(-1, -1));
                break;
        }
    }
}
