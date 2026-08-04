package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛱᛷᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0156 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f960 = new ArrayList();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2471 f961;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f962;

    public C0156(MainActivity mainActivity) {
        this.f962 = mainActivity;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m704(C2471 c2471) {
        AbstractC2328.m4341(-1497444215587694L);
        this.f960.clear();
        this.f961 = c2471;
        MainActivity mainActivity = this.f962;
        TextView textView = mainActivity.f465;
        if (textView != null) {
            textView.setText(c2471.f12210);
        }
        m1058();
        mainActivity.m334();
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        int i2;
        int iM316;
        C1780 c1780;
        AbstractC2328.m4341(-1497843647546222L);
        int i3 = 8;
        if (abstractC0185 instanceof C2301) {
            C2301 c2301 = (C2301) abstractC0185;
            C2471 c2471M306 = this.f961;
            if (c2471M306 == null) {
                c2471M306 = MainActivity.m306();
            }
            TextView textView = c2301.f11304;
            AbstractC2328.m4341(-1428415501206382L);
            c2301.f11303.setText(c2471M306.f12210);
            c2301.f11305.setText(c2471M306.f12211);
            String str = c2471M306.f12212;
            if (str == null || c2471M306.f12213 == null) {
                textView.setVisibility(8);
                textView.setOnClickListener(null);
                return;
            } else {
                textView.setText(str);
                textView.setVisibility(0);
                textView.setOnClickListener(new ViewOnClickListenerC1462(i3, c2471M306));
                return;
            }
        }
        boolean z = abstractC0185 instanceof C2039;
        ArrayList arrayList = this.f960;
        if (z) {
            C0539 c0539 = ((C2039) abstractC0185).f10149;
            C0178 c0178 = (C0178) arrayList.get(i);
            TextView textView2 = c0539.f2574;
            MainActivity mainActivity = c0539.f2584;
            C2227 c2227 = c0539.f2582;
            AbstractC2328.m4341(-1341446708429678L);
            String str2 = c0178.f1008;
            List<String> list = c0178.f1009;
            String str3 = c0178.f1006;
            FrameLayout frameLayout = c0539.f2578;
            frameLayout.animate().cancel();
            boolean z2 = c0178.f1005;
            List list2 = MainActivity.f451;
            int iM338 = mainActivity.m338(z2);
            float fM311 = mainActivity.m311(26);
            int iM3382 = mainActivity.m338(z2);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{MainActivity.m308(-16777216, iM3382, 0.18f), iM3382, MainActivity.m308(iM3382, -1, 0.52f)});
            gradientDrawable.setCornerRadius(fM311);
            frameLayout.setBackground(gradientDrawable);
            View view = c0539.f2575;
            int iM3162 = mainActivity.m316(R.color.card_bg);
            int iM3383 = mainActivity.m338(z2);
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{MainActivity.m308(iM3383, iM3162, 0.13f), MainActivity.m308(iM3383, iM3162, 0.03f), MainActivity.m308(iM3383, iM3162, 0.06f)});
            gradientDrawable2.setCornerRadius(mainActivity.m311(25));
            view.setBackground(gradientDrawable2);
            c0539.f2590.setBackground(MainActivity.m303(iM338, mainActivity.m311(26), null, 0));
            c0539.f2593.setBackground(MainActivity.m303(MainActivity.m308(iM338, -1, 0.5f), mainActivity.m311(26), null, 0));
            C1780 c17802 = new C1780(iM338, 2.6f * mainActivity.getResources().getDisplayMetrics().density);
            c0539.f2579 = c17802;
            c0539.f2592.setBackground(c17802);
            c0539.f2583.setImageDrawable(c0178.f1011);
            TextView textView3 = c0539.f2580;
            String str4 = c0178.f1007;
            textView3.setText(str4);
            c0539.f2591.setText(str2);
            TextView textView4 = c0539.f2587;
            textView4.setText(AbstractC2328.m4341(z2 ? -1341463888298862L : -1341481068168046L));
            textView4.setTextColor(iM338);
            c0539.f2586.setBackground(MainActivity.m303(iM338, mainActivity.m311(999), null, 0));
            c0539.f2588.setBackground(MainActivity.m303(MainActivity.m308(iM338, mainActivity.m316(R.color.card_bg), 0.1f), mainActivity.m311(999), Integer.valueOf(MainActivity.m308(iM338, mainActivity.m316(R.color.card_bg), 0.35f)), mainActivity.m315(1)));
            TextView textView5 = c0539.f2576;
            String strM4341 = c0178.f1010;
            if (AbstractC0473.m1313(strM4341)) {
                strM4341 = AbstractC2328.m4341(-1341498248037230L);
            }
            textView5.setText(strM4341);
            textView2.setText(AbstractC2328.m4341(-1341506837971822L).concat(AbstractC0473.m1313(str3) ? AbstractC2328.m4341(-1341519722873710L) : str3));
            if (AbstractC0473.m1313(str3)) {
                iM316 = mainActivity.m316(R.color.status_warning);
                i2 = R.color.secondary_text;
            } else {
                i2 = R.color.secondary_text;
                iM316 = mainActivity.m316(R.color.secondary_text);
            }
            textView2.setTextColor(iM316);
            c2227.removeAllViews();
            if (list.isEmpty()) {
                Context context = c0539.getContext();
                AbstractC2328.m4341(-1341536902742894L);
                c2227.addView(mainActivity.m313(context, AbstractC2328.m4341(-1341605622219630L), mainActivity.m316(i2), mainActivity.m316(R.color.status_neutral_bg), null, false));
            } else {
                for (String str5 : list) {
                    Context context2 = c0539.getContext();
                    AbstractC2328.m4341(-1341635686990702L);
                    c2227.addView(mainActivity.m332(context2, str5, AbstractC1544.m3188(str5, str3), iM338));
                }
            }
            C0096 c0096 = c0539.f2577;
            c0096.getClass();
            if (!ValueAnimator.areAnimatorsEnabled()) {
                c0096.invalidate();
            } else if (c0096.f712 == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(100000L);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.addUpdateListener(new C2405(4, c0096));
                valueAnimatorOfFloat.start();
                c0096.f712 = valueAnimatorOfFloat;
            }
            if (ValueAnimator.areAnimatorsEnabled() && (c1780 = c0539.f2579) != null) {
                ValueAnimator valueAnimator = c0539.f2585;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
                valueAnimatorOfFloat2.setDuration(2600L);
                valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat2.setRepeatCount(-1);
                valueAnimatorOfFloat2.addUpdateListener(new C2405(3, c1780));
                valueAnimatorOfFloat2.start();
                c0539.f2585 = valueAnimatorOfFloat2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append((char) 65292);
            sb.append(AbstractC2328.m4341(z2 ? -1341704406467438L : -1341721586336622L));
            frameLayout.setContentDescription(sb.toString());
            TextView textView6 = c0539.f2589;
            TextView textView7 = c0539.f2581;
            List list3 = MainActivity.f451;
            Set set = mainActivity.f467;
            EnumC2648 enumC2648 = set == null ? EnumC2648.f13045 : set.contains(str2) ? EnumC2648.f13047 : EnumC2648.f13044;
            boolean z3 = mainActivity.f468 != null;
            if (enumC2648 == EnumC2648.f13044 && z3) {
                textView7.setVisibility(0);
                textView7.setEnabled(true);
                textView7.setText(AbstractC2328.m4341(-1341764536009582L));
                textView7.setBackground(MainActivity.m303(MainActivity.m308(mainActivity.m338(true), mainActivity.m316(R.color.card_bg), 0.06f), mainActivity.m311(999), Integer.valueOf(MainActivity.m308(mainActivity.m338(true), mainActivity.m316(R.color.card_bg), 0.45f)), mainActivity.m315(1)));
                textView7.setTextColor(mainActivity.m338(true));
            } else {
                textView7.setVisibility(8);
                textView7.setEnabled(true);
                textView7.setText(AbstractC2328.m4341(-1341738766205806L));
            }
            textView6.setBackground(mainActivity.m333());
            textView6.setTextColor(MainActivity.m304(mainActivity));
            Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null) {
                textView6.setVisibility(8);
                textView6.setOnClickListener(null);
            } else {
                textView6.setVisibility(0);
                textView6.setOnClickListener(new ViewOnClickListenerC1192(mainActivity, c0539, launchIntentForPackage, 12));
            }
            textView7.setOnClickListener(new ViewOnClickListenerC1374(c0539, 16, c0178));
            return;
        }
        if (abstractC0185 instanceof C2757) {
            C2757 c2757 = (C2757) abstractC0185;
            C0178 c01782 = (C0178) arrayList.get(i);
            AbstractC2328.m4341(-240350237721454L);
            String str6 = c01782.f1008;
            String str7 = c01782.f1006;
            LinearLayout linearLayout = c2757.f13481;
            linearLayout.removeAllViews();
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            ImageView imageView = new ImageView(linearLayout.getContext());
            MainActivity mainActivity2 = c2757.f13482.f962;
            imageView.setImageDrawable(c01782.f1011);
            List list4 = MainActivity.f451;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(mainActivity2.m315(46), mainActivity2.m315(46)));
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new C2645(mainActivity2, 0));
            imageView.setClickable(true);
            imageView.setFocusable(true);
            TypedValue typedValue = new TypedValue();
            imageView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
            imageView.setForeground(imageView.getContext().getDrawable(typedValue.resourceId));
            imageView.setOnClickListener(new ViewOnClickListenerC0573(mainActivity2, imageView, 1));
            linearLayout2.addView(imageView);
            LinearLayout linearLayout3 = new LinearLayout(linearLayout.getContext());
            linearLayout3.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.leftMargin = mainActivity2.m315(12);
            linearLayout3.setLayoutParams(layoutParams);
            TextView textView8 = new TextView(linearLayout.getContext());
            textView8.setText(c01782.f1007);
            textView8.setTextSize(17.0f);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView8.setTypeface(typeface);
            textView8.setTextColor(mainActivity2.m316(R.color.primary_text));
            textView8.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView8.setEllipsize(truncateAt);
            linearLayout3.addView(textView8);
            TextView textView9 = new TextView(linearLayout.getContext());
            textView9.setText(str6);
            textView9.setTextSize(12.0f);
            textView9.setTextColor(mainActivity2.m316(R.color.secondary_text));
            textView9.setPadding(0, mainActivity2.m315(3), 0, 0);
            textView9.setMaxLines(1);
            textView9.setEllipsize(truncateAt);
            linearLayout3.addView(textView9);
            linearLayout2.addView(linearLayout3);
            LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
            linearLayout4.setOrientation(1);
            linearLayout4.setGravity(8388613);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = mainActivity2.m315(10);
            linearLayout4.setLayoutParams(layoutParams2);
            boolean z4 = c01782.f1005;
            int iM3384 = mainActivity2.m338(z4);
            Context context3 = linearLayout.getContext();
            AbstractC2328.m4341(-240449021969262L);
            TextView textViewM313 = mainActivity2.m313(context3, AbstractC2328.m4341(z4 ? -240517741445998L : -240534921315182L), iM3384, MainActivity.m308(iM3384, mainActivity2.m316(R.color.card_bg), 0.1f), null, true);
            textViewM313.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout4.addView(textViewM313);
            Set set2 = mainActivity2.f467;
            EnumC2648 enumC26482 = set2 == null ? EnumC2648.f13045 : set2.contains(str6) ? EnumC2648.f13047 : EnumC2648.f13044;
            if (enumC26482 != EnumC2648.f13047) {
                TextView textView10 = new TextView(linearLayout.getContext());
                EnumC2648 enumC26483 = EnumC2648.f13044;
                textView10.setText(enumC26482 == enumC26483 ? AbstractC2328.m4341(-240393187394414L) : AbstractC2328.m4341(-240423252165486L));
                textView10.setTextSize(11.0f);
                textView10.setGravity(8388613);
                textView10.setTextColor(mainActivity2.m316(enumC26482 == enumC26483 ? R.color.status_warning : R.color.secondary_text));
                textView10.setMaxLines(1);
                textView10.setPadding(0, mainActivity2.m315(2), 0, 0);
                linearLayout4.addView(textView10);
            }
            linearLayout2.addView(linearLayout4);
            linearLayout.addView(linearLayout2);
            TextView textView11 = new TextView(linearLayout.getContext());
            String strM43412 = c01782.f1010;
            if (AbstractC0473.m1313(strM43412)) {
                strM43412 = AbstractC2328.m4341(-240552101184366L);
            }
            textView11.setText(AbstractC2328.m4341(-240577870988142L) + strM43412 + AbstractC2328.m4341(-240603640791918L) + (AbstractC0473.m1313(str7) ? AbstractC2328.m4341(-240560691118958L) : str7));
            textView11.setTextSize(12.0f);
            textView11.setTextColor(AbstractC0473.m1313(str7) ? mainActivity2.m316(R.color.status_warning) : mainActivity2.m316(R.color.primary_text));
            textView11.setMaxLines(1);
            textView11.setEllipsize(truncateAt);
            textView11.setPadding(0, mainActivity2.m315(6), 0, 0);
            linearLayout.addView(textView11);
            String strM43413 = AbstractC2328.m4341(-240367417590638L);
            TextView textView12 = new TextView(linearLayout.getContext());
            textView12.setText(strM43413);
            textView12.setTextSize(12.0f);
            textView12.setTypeface(typeface);
            textView12.setTextColor(mainActivity2.m316(R.color.secondary_text));
            textView12.setPadding(0, mainActivity2.m315(8), 0, 0);
            linearLayout.addView(textView12);
            List<String> list5 = c01782.f1009;
            int iM3385 = mainActivity2.m338(z4);
            Context context4 = linearLayout.getContext();
            AbstractC2328.m4341(-240620820661102L);
            C2227 c22272 = new C2227(context4);
            c22272.setPadding(0, mainActivity2.m315(8), 0, 0);
            if (list5.isEmpty()) {
                Context context5 = linearLayout.getContext();
                AbstractC2328.m4341(-240689540137838L);
                c22272.addView(mainActivity2.m313(context5, AbstractC2328.m4341(-240758259614574L), mainActivity2.m316(R.color.secondary_text), mainActivity2.m316(R.color.status_neutral_bg), null, false));
            } else {
                for (String str8 : list5) {
                    Context context6 = linearLayout.getContext();
                    AbstractC2328.m4341(-240788324385646L);
                    c22272.addView(mainActivity2.m332(context6, str8, AbstractC1544.m3188(str8, str7), iM3385));
                }
            }
            linearLayout.addView(c22272);
        }
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        ArrayList arrayList = this.f960;
        return arrayList.size() + ((!arrayList.isEmpty() || this.f961 == null) ? 0 : 1);
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int mo705() {
        if (!this.f960.isEmpty() || this.f961 == null) {
            return this.f962.f472 == EnumC0110.f755 ? 3 : 2;
        }
        return 1;
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void mo706(AbstractC0185 abstractC0185) {
        AbstractC2328.m4341(-1497873712317294L);
        if (abstractC0185 instanceof C2039) {
            C0539 c0539 = ((C2039) abstractC0185).f10149;
            c0539.f2578.animate().cancel();
            C0096 c0096 = c0539.f2577;
            ValueAnimator valueAnimator = c0096.f712;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0096.f712 = null;
            ValueAnimator valueAnimator2 = c0539.f2585;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            c0539.f2585 = null;
        }
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-1497744863298414L);
        MainActivity mainActivity = this.f962;
        if (i != 1) {
            if (i == 3) {
                Context context = viewGroup.getContext();
                AbstractC2328.m4341(-1497774928069486L);
                C0539 c0539 = new C0539(mainActivity, context);
                List list = MainActivity.f451;
                C2526 c2526 = new C2526((int) (mainActivity.getResources().getDisplayMetrics().widthPixels * 0.74f), -1);
                ((ViewGroup.MarginLayoutParams) c2526).topMargin = mainActivity.m315(2);
                ((ViewGroup.MarginLayoutParams) c2526).bottomMargin = mainActivity.m315(4);
                c0539.setLayoutParams(c2526);
                return new C2039(c0539);
            }
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(1);
            List list2 = MainActivity.f451;
            int iM315 = mainActivity.m315(14);
            linearLayout.setPadding(iM315, iM315, iM315, iM315);
            linearLayout.setBackground(MainActivity.m303(mainActivity.m316(R.color.card_bg), mainActivity.m311(16), Integer.valueOf(mainActivity.m316(R.color.divider_color)), mainActivity.m315(1)));
            linearLayout.setElevation(mainActivity.m311(3));
            C2526 c25262 = new C2526(-1, -2);
            ((ViewGroup.MarginLayoutParams) c25262).bottomMargin = mainActivity.m315(12);
            linearLayout.setLayoutParams(c25262);
            return new C2757(this, linearLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        List list3 = MainActivity.f451;
        linearLayout2.setPadding(mainActivity.m315(20), mainActivity.m315(34), mainActivity.m315(20), mainActivity.m315(34));
        linearLayout2.setBackground(MainActivity.m303(mainActivity.m316(R.color.card_bg), mainActivity.m311(16), Integer.valueOf(mainActivity.m316(R.color.divider_color)), mainActivity.m315(1)));
        C2526 c25263 = new C2526(-1, -2);
        ((ViewGroup.MarginLayoutParams) c25263).bottomMargin = mainActivity.m315(12);
        linearLayout2.setLayoutParams(c25263);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setTextSize(16.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setGravity(17);
        textView.setTextColor(mainActivity.m316(R.color.primary_text));
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(viewGroup.getContext());
        textView2.setTextSize(13.0f);
        textView2.setGravity(17);
        textView2.setTextColor(mainActivity.m316(R.color.secondary_text));
        textView2.setPadding(0, mainActivity.m315(8), 0, 0);
        textView2.setLineSpacing(mainActivity.m311(2), 1.0f);
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(viewGroup.getContext());
        textView3.setTextSize(13.0f);
        textView3.setTypeface(typeface);
        textView3.setGravity(17);
        textView3.setTextColor(mainActivity.m338(true));
        textView3.setPadding(mainActivity.m315(14), mainActivity.m315(7), mainActivity.m315(14), mainActivity.m315(7));
        textView3.setMinimumHeight(mainActivity.m315(48));
        textView3.setMinWidth(mainActivity.m315(88));
        textView3.setBackground(MainActivity.m303(MainActivity.m308(mainActivity.m338(true), mainActivity.m316(R.color.card_bg), 0.1f), mainActivity.m311(999), Integer.valueOf(MainActivity.m308(mainActivity.m338(true), mainActivity.m316(R.color.card_bg), 0.3f)), mainActivity.m315(1)));
        textView3.setClickable(true);
        textView3.setFocusable(true);
        textView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = mainActivity.m315(16);
        textView3.setLayoutParams(layoutParams);
        linearLayout2.addView(textView3);
        if (mainActivity.f472 == EnumC0110.f755) {
            linearLayout2.setLayoutParams(new C2526((int) (mainActivity.getResources().getDisplayMetrics().widthPixels * 0.74f), -1));
            linearLayout2.setGravity(17);
        }
        return new C2301(linearLayout2);
    }
}
