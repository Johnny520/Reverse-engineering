package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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

    public /* synthetic */ RunnableC2745y7(ViewGroup r1, int r2) {
        this.f9372a = r2;
        this.f9373b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.f9372a;
        int r6 = 0;
        ViewGroup r7 = this.f9373b;
        switch(r1) {
            case 0: goto L86;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        ViewParent r12 = r7.findViewById(AbstractC0828TB.f2617i).getParent().getParent().getParent().getParent().getParent();
        AbstractC0295Gu.m625r(-521718267377717L);
        ViewGroup r13 = (ViewGroup) r12;
        C1456gf.m2806q(r7);
        AbstractC0295Gu.m625r(-525463478859829L);
        ImageView r2 = new ImageView(r13.getContext());
        HashMap r3 = AbstractC0999XA.f3193a;
        r2.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
        r13.addView(r2, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(r13.getContext(), "status_bar_height") + C1456gf.f5171o));
        C1456gf.m2809u(r13);
        Context r22 = r13.getContext();
        AbstractC0295Gu.m625r(-521426209601589L);
        HashMap r32 = AbstractC0999XA.f3193a;
        r13.addView(C1456gf.m2808t(r22, C1517hw.m2890b(AbstractC0295Gu.m625r(-522044684892213L))), 0, new ViewGroup.LayoutParams(-1, -1));
        return;
    L6:
        C1265ch.f4301b.m2406f(r7);
        return;
    L8:
        AbstractC1293cr.m2531D(r7);
        HashMap r14 = AbstractC0999XA.f3193a;
        Drawable r15 = C1517hw.m2890b(AbstractC0295Gu.m625r(-190980015781941L));
        r7.setTag(R.id.tag_view_bg_ban, null);
        r7.setBackground(r15);
        r7.setTag(R.id.tag_view_bg_ban, Object.class);
        return;
    L10:
        Float r16 = Float.valueOf(32.0f);
        C1456gf.m2805o(r7);
        int r8 = AbstractC1450gG.f5067a;
        Field[] r82 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-183944859351093L)).getDeclaredFields();
        AbstractC0295Gu.m625r(-184133837912117L);
        int r9 = r82.length;
        int r10 = 0;
    L11:
        if (r10 >= r9) goto L84;
        Field r11 = r82[r10];
        r11.setAccessible(true);
        Object r112 = r11.get(r7);
        if ((r112 instanceof View) == false) goto L83;
        View r113 = (View) r112;
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-209950886328373L)) == false) goto L22;
        if ((r113.getParent() instanceof LinearLayout) == false) goto L22;
        Context r132 = r113.getContext();
        HashMap r162 = AbstractC0999XA.f3193a;
        Drawable r5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-209611583911989L));
        if (r5 == null) goto L22;
        ViewParent r163 = r113.getParent();
        AbstractC0295Gu.m625r(-208172769867829L);
        final View r33 = C1456gf.m2788F((ViewGroup) r163, new int[]{r6});
        AbstractC0295Gu.m625r(-207880712091701L);
        r33.setAlpha(0.0f);
        ViewParent r4 = r33.getParent();
        AbstractC0295Gu.m625r(-208666691106869L);
        LinearLayout r42 = (LinearLayout) r4;
        int r122 = r42.indexOfChild(r33);
        ViewGroup.LayoutParams r20 = r33.getLayoutParams();
        AbstractC0295Gu.m625r(-208396108167221L);
        r42.removeView(r33);
        final FrameLayout r62 = new FrameLayout(r132);
        r62.addView(r33);
        ImageView r52 = C1456gf.m2808t(r132, r5);
        FrameLayout.LayoutParams r133 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(r16), AbstractC0295Gu.m616i(r16));
        r133.gravity = 17;
        r62.addView(r52, r133);
        r42.addView(r62, r122, (LinearLayout.LayoutParams) r20);
        r62.setVisibility(r33.getVisibility());
        final int r53 = 0;
        r33.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0266G7(r33, r62, r53));
    L22:
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-210629491161141L)) == false) goto L29;
        if ((r113.getParent() instanceof LinearLayout) == false) goto L29;
        Context r0 = r113.getContext();
        HashMap r34 = AbstractC0999XA.f3193a;
        Drawable r35 = C1517hw.m2890b(AbstractC0295Gu.m625r(-209190677116981L));
        if (r35 == null) goto L29;
        r113.setAlpha(0.0f);
        ViewParent r43 = r113.getParent();
        AbstractC0295Gu.m625r(-209336706005045L);
        LinearLayout r44 = (LinearLayout) r43;
        int r54 = r44.indexOfChild(r113);
        ViewGroup.LayoutParams r63 = r113.getLayoutParams();
        AbstractC0295Gu.m625r(-209066123065397L);
        r44.removeView(r113);
        FrameLayout r123 = new FrameLayout(r0);
        r123.addView(r113);
        ImageView r02 = C1456gf.m2808t(r0, r35);
        FrameLayout.LayoutParams r36 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(r16), AbstractC0295Gu.m616i(r16));
        r36.gravity = 17;
        r123.addView(r02, r36);
        r44.addView(r123, r54, (LinearLayout.LayoutParams) r63);
    L29:
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-207081848174645L)) == false) goto L36;
        if (AbstractC0585Nj.m1134a(r113.getTag(R.id.tag_we_img_name), AbstractC0295Gu.m625r(-206742545758261L)) == false) goto L36;
        HashMap r03 = AbstractC0999XA.f3193a;
        Drawable r04 = C1517hw.m2890b(AbstractC0295Gu.m625r(-206832740071477L));
        if (r04 == null) goto L36;
        r113.setAlpha(0.0f);
        Context r64 = r113.getContext();
        AbstractC0295Gu.m625r(-206978768959541L);
        ImageView r05 = C1456gf.m2808t(r64, r04);
        ViewParent r65 = r113.getParent();
        AbstractC0295Gu.m625r(-207597244250165L);
        RelativeLayout r66 = (RelativeLayout) r65;
        ViewGroup.LayoutParams r124 = r66.getLayoutParams();
        AbstractC0295Gu.m625r(-207335251245109L);
        ((LinearLayout.LayoutParams) r124).bottomMargin = AbstractC0295Gu.m616i(2);
        RelativeLayout.LayoutParams r125 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r16), AbstractC0295Gu.m616i(r16));
        r125.addRule(13);
        r66.addView(r05, r125);
    L36:
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-206020991252533L)) == false) goto L54;
        Object r06 = r113.getTag(R.id.tag_we_img_name);
        if (AbstractC0585Nj.m1134a(r06, AbstractC0295Gu.m625r(-205681688836149L)) == true) goto L54;
        if (AbstractC0585Nj.m1134a(r06, AbstractC0295Gu.m625r(-205771883149365L)) == true) goto L54;
        if (AbstractC0585Nj.m1134a(r06, AbstractC0295Gu.m625r(-205862077462581L)) == true) goto L54;
        if ((r113.getParent() instanceof RelativeLayout) == false) goto L54;
        ViewParent r07 = r113.getParent();
        AbstractC0295Gu.m625r(-206519207458869L);
        RelativeLayout r08 = (RelativeLayout) r07;
        View r45 = r08.getChildAt(2);
        AbstractC0295Gu.m625r(-206257214453813L);
        final TextView r46 = (TextView) r45;
        Object r55 = r46.getParent();
        AbstractC0295Gu.m625r(-204869940017205L);
        ((View) r55).getLayoutParams().width = AbstractC0295Gu.m616i(50);
        HashMap r56 = AbstractC0999XA.f3193a;
        Drawable r57 = C1517hw.m2890b(AbstractC0295Gu.m625r(-204556407404597L));
        if (r57 == null) goto L50;
        r113.setAlpha(0.0f);
        Context r67 = r113.getContext();
        AbstractC0295Gu.m625r(-204698141325365L);
        final ImageView r58 = C1456gf.m2808t(r67, r57);
        RelativeLayout.LayoutParams r68 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r16), AbstractC0295Gu.m616i(r16));
        r68.addRule(13);
        r08.addView(r58, r68);
        final int r69 = 1;
        r08.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0266G7(r46, r58, r69));
    L50:
        Drawable r09 = C1517hw.m2890b(AbstractC0295Gu.m625r(-204766860802101L));
        if (r09 == null) goto L54;
        r46.setTag(R.id.tag_view_bg_ban, null);
        r46.setBackground(r09);
        r46.setTag(R.id.tag_view_bg_ban, Object.class);
        int r010 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-205458350536757L));
        r46.setTag(R.id.tag_textview_color_ban, null);
        r46.setTextColor(r010);
        r46.setTag(R.id.tag_textview_color_ban, TextView.class);
    L54:
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-205578609621045L)) == false) goto L60;
        HashMap r011 = AbstractC0999XA.f3193a;
        Drawable r012 = C1517hw.m2890b(AbstractC0295Gu.m625r(-205243602171957L));
        if (r012 == null) goto L60;
        Context r37 = r113.getContext();
        AbstractC0295Gu.m625r(-203706003879989L);
        ImageView r013 = C1456gf.m2808t(r37, r012);
        AbstractC0295Gu.m625r(-203774723356725L);
        ((ViewGroup) r113).addView(r013, 0, new ViewGroup.LayoutParams(-1, -1));
    L60:
        if (r113.getClass().getName().equals(AbstractC0295Gu.m625r(-203482665580597L)) == false) goto L89;
        HashMap r014 = AbstractC0999XA.f3193a;
        Drawable r015 = C1517hw.m2890b(AbstractC0295Gu.m625r(-203654464272437L));
        if (r015 == null) goto L89;
        r113.setTag(R.id.tag_view_bg_ban, null);
        r113.setBackground(r015);
        r113.setTag(R.id.tag_view_bg_ban, Object.class);
    L89:
        HashMap r016 = AbstractC0999XA.f3193a;     // Catch: Exception -> L88
        int r017 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-204315889236021L));     // Catch: Exception -> L88
        if (r017 == 0) goto L77;
        if ((r113 instanceof LinearLayout) == false) goto L77;
        if ((((LinearLayout) r113).getParent() instanceof LinearLayout) == false) goto L77;
        ViewGroup.LayoutParams r610 = ((LinearLayout) r113).getLayoutParams();     // Catch: Exception -> L88
        AbstractC0295Gu.m625r(-204414673483829L);     // Catch: Exception -> L88
        if (((LinearLayout.LayoutParams) r610).weight != 1.0f) goto L77;
        if ((AbstractC0295Gu.m618k((ViewGroup) r113, 0) instanceof TextView) == false) goto L77;
        View r611 = AbstractC0295Gu.m618k((ViewGroup) r113, 0);     // Catch: Exception -> L88
        AbstractC0295Gu.m625r(-204199925119029L);     // Catch: Exception -> L88
        ((TextView) r611).setTextColor(r017);     // Catch: Exception -> L88
        ViewParent r612 = ((LinearLayout) r113).getParent();     // Catch: Exception -> L88
        AbstractC0295Gu.m625r(-202812650682421L);     // Catch: Exception -> L88
        View r613 = AbstractC0295Gu.m618k((ViewGroup) r612, 1);     // Catch: Exception -> L88
        AbstractC0295Gu.m625r(-202520592906293L);     // Catch: Exception -> L88
        View r614 = AbstractC0295Gu.m618k((ViewGroup) r613, 0);     // Catch: Exception -> L88
        String r126 = AbstractC0295Gu.m625r(-203328046757941L);     // Catch: Exception -> L88
        Object[] r018 = {Integer.valueOf(r017)};     // Catch: Exception -> L88
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Exception -> L88
        XposedHelpers.callMethod(r614, r126, Arrays.copyOf(r018, 1));     // Catch: Exception -> L88
    L77:
        if (r113.getClass().getName().equals(Button.class.getName()) == false) goto L83;
        if (r113.isSoundEffectsEnabled() == false) goto L83;
        HashMap r019 = AbstractC0999XA.f3193a;
        int r020 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-203383881332789L));
        if (r020 == 0) goto L83;
        AbstractC0295Gu.m625r(-202932909766709L);
        ((Button) r113).setTextColor(r020);
    L83:
        r10 = r10 + 1;
        r6 = 0;
        goto L11
    L84:
        View r021 = C1456gf.m2788F(r7, new int[]{r6});
        AbstractC0295Gu.m625r(-183682866346037L);
        HashMap r17 = AbstractC0999XA.f3193a;
        C1456gf.m2796N(r021, C1517hw.m2890b(AbstractC0295Gu.m625r(-184468845361205L)));
        return;
    L86:
        AbstractC0585Nj.m1142j(r7);
    }
}
