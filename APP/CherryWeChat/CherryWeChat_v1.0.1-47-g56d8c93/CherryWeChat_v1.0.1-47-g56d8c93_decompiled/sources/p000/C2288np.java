package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import java.util.Collections;

/* JADX INFO: renamed from: np */
/* JADX INFO: loaded from: classes.dex */
public final class C2288np implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f8028a;

    /* JADX INFO: renamed from: b */
    public Activity f8029b;

    /* JADX INFO: renamed from: c */
    public EditText f8030c;

    /* JADX INFO: renamed from: d */
    public EditText f8031d;

    /* JADX INFO: renamed from: e */
    public TextView f8032e;

    /* JADX INFO: renamed from: f */
    public TextView f8033f;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(1:65)|(1:(1:(6:12|53|(1:55)(1:56)|57|61|62)(2:16|17))(1:18))(3:20|21|(2:23|66))|24|63|25|30|(1:32)(1:33)|(2:42|(9:44|(1:46)|47|(1:49)|50|(2:52|67)|53|(0)(0)|57)(1:58))(4:37|(1:39)(1:40)|(0)|(0)(0))|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        p000.AbstractC0295Gu.m625r(-130906308212789L);
        p000.AbstractC0425Jv.m881a(io.github.cherrywechat.network.model.ApiResponse.class).m445b();
        p000.AbstractC0295Gu.m625r(-131022272329781L);
        r10.getMessage();
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:53:0x00f7, B:55:0x00fb, B:57:0x0105, B:18:0x003f, B:24:0x0059, B:30:0x008d, B:32:0x0091, B:35:0x0099, B:37:0x009f, B:44:0x00b4, B:46:0x00c4, B:47:0x00cd, B:49:0x00d1, B:50:0x00da, B:58:0x0109, B:42:0x00a9, B:29:0x0075, B:21:0x0046, B:25:0x005b), top: B:65:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:53:0x00f7, B:55:0x00fb, B:57:0x0105, B:18:0x003f, B:24:0x0059, B:30:0x008d, B:32:0x0091, B:35:0x0099, B:37:0x009f, B:44:0x00b4, B:46:0x00c4, B:47:0x00cd, B:49:0x00d1, B:50:0x00da, B:58:0x0109, B:42:0x00a9, B:29:0x0075, B:21:0x0046, B:25:0x005b), top: B:65:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:53:0x00f7, B:55:0x00fb, B:57:0x0105, B:18:0x003f, B:24:0x0059, B:30:0x008d, B:32:0x0091, B:35:0x0099, B:37:0x009f, B:44:0x00b4, B:46:0x00c4, B:47:0x00cd, B:49:0x00d1, B:50:0x00da, B:58:0x0109, B:42:0x00a9, B:29:0x0075, B:21:0x0046, B:25:0x005b), top: B:65:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:53:0x00f7, B:55:0x00fb, B:57:0x0105, B:18:0x003f, B:24:0x0059, B:30:0x008d, B:32:0x0091, B:35:0x0099, B:37:0x009f, B:44:0x00b4, B:46:0x00c4, B:47:0x00cd, B:49:0x00d1, B:50:0x00da, B:58:0x0109, B:42:0x00a9, B:29:0x0075, B:21:0x0046, B:25:0x005b), top: B:65:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4620a(C2288np c2288np, String str, AbstractC0233Fb abstractC0233Fb) throws Throwable {
        C2245mp c2245mp;
        String strM625r;
        Activity activity;
        if (abstractC0233Fb instanceof C2245mp) {
            c2245mp = (C2245mp) abstractC0233Fb;
            int i = c2245mp.f7944f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2245mp.f7944f = i - Integer.MIN_VALUE;
            } else {
                c2245mp = new C2245mp(c2288np, abstractC0233Fb);
            }
        }
        Object objM1133N = c2245mp.f7942d;
        int i2 = c2245mp.f7944f;
        Activity activity2 = null;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        try {
        } catch (Exception e) {
            c2288np.m4623g(AbstractC0213Ey.m405c(-131696582195253L, new StringBuilder(), e), true);
            c2288np.m4622f(false);
        }
        if (i2 == 0) {
            AbstractC0628Oj.m1232T(objM1133N);
            C1498hd c1498hd = AbstractC1499he.f5282a;
            ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
            C0991X2 c0991x2 = new C0991X2(str, null);
            c2245mp.f7944f = 1;
            objM1133N = AbstractC0585Nj.m1133N(executorC0921Vc, c0991x2, c2245mp);
            if (objM1133N == enumC1453gc) {
                return enumC1453gc;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException(AbstractC0295Gu.m625r(-131730941933621L));
                }
                AbstractC0628Oj.m1232T(objM1133N);
                activity = c2288np.f8029b;
                if (activity != null) {
                    AbstractC0295Gu.m625r(-131082401871925L);
                } else {
                    activity2 = activity;
                }
                activity2.finish();
                return C0829TC.f2620a;
            }
            AbstractC0628Oj.m1232T(objM1133N);
        }
        String str2 = (String) objM1133N;
        C0029Am c0029Am = AbstractC2809zm.f9524a;
        c0029Am.getClass();
        Object objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), str2);
        ApiResponse apiResponse = (ApiResponse) objM4550a;
        int code = apiResponse != null ? apiResponse.getCode() : -1;
        if (apiResponse == null || (strM625r = apiResponse.getMessage()) == null) {
            strM625r = AbstractC0295Gu.m625r(-131039452198965L);
            if (code != 0) {
                c2288np.m4623g(AbstractC0295Gu.m625r(-131060927035445L), false);
                TextView textView = c2288np.f8033f;
                if (textView == null) {
                    AbstractC0295Gu.m625r(-131632157685813L);
                    textView = null;
                }
                Activity activity3 = c2288np.f8029b;
                if (activity3 == null) {
                    AbstractC0295Gu.m625r(-130047314753589L);
                    activity3 = null;
                }
                textView.setTextColor(activity3.getColor(R.color.colorSuccess));
                C0183EA.f539a.getClass();
                C0183EA.m382j(str2);
                c2245mp.f7944f = 2;
                if (AbstractC1293cr.m2557v(1500L, c2245mp) == enumC1453gc) {
                    return enumC1453gc;
                }
                activity = c2288np.f8029b;
                if (activity != null) {
                }
                activity2.finish();
            } else {
                c2288np.m4623g(AbstractC0295Gu.m625r(-131670812391477L).concat(strM625r), true);
                c2288np.m4622f(false);
            }
        } else {
            if (strM625r.length() <= 0) {
                strM625r = null;
            }
            if (strM625r == null) {
            }
            if (code != 0) {
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m4621e(C2288np c2288np, String str, String str2) {
        try {
            C2171l0 c2171l0 = new C2171l0(C1456gf.m2791I(), str, str2);
            C2214m0 c2214m0 = C2214m0.f7706a;
            Activity activity = c2288np.f8029b;
            if (activity == null) {
                AbstractC0295Gu.m625r(-130867653507125L);
                activity = null;
            }
            c2214m0.getClass();
            C2214m0.m4457d(activity, c2171l0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-130085969459253L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-130124624164917L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-80964428494901L);
        this.f8029b = activity;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(linearLayout.getContext().getColor(R.color.colorBackground));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f8028a = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
        linearLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = AbstractC0295Gu.m616i(24);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout3.setGravity(16);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(android.R.drawable.ic_menu_manage);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
        layoutParams3.setMarginEnd(AbstractC0295Gu.m616i(12));
        layoutParams3.gravity = 16;
        imageView.setLayoutParams(layoutParams3);
        imageView.setColorFilter(activity.getColor(R.color.textTitle));
        linearLayout3.addView(imageView);
        TextView textView = new TextView(activity);
        AbstractC0213Ey.m414l(-81003083200565L, textView, 20.0f);
        textView.setTextColor(activity.getColor(R.color.textTitle));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        linearLayout3.addView(textView);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = AbstractC0295Gu.m616i(16);
        linearLayout4.setLayoutParams(layoutParams4);
        TextView textView2 = new TextView(activity);
        AbstractC0213Ey.m414l(-81024558037045L, textView2, 14.0f);
        textView2.setTextColor(activity.getColor(R.color.textTitle));
        textView2.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.bottomMargin = AbstractC0295Gu.m616i(8);
        textView2.setLayoutParams(layoutParams5);
        linearLayout4.addView(textView2);
        EditText editText = new EditText(activity);
        editText.setText(Editable.Factory.getInstance().newEditable(C1456gf.m2791I()));
        editText.setEnabled(false);
        editText.setTextSize(16.0f);
        editText.setTextColor(activity.getColor(R.color.textSummary));
        editText.setHintTextColor(activity.getColor(R.color.textSecondary));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(activity.getColor(R.color.iconBackground));
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable2.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        editText.setBackground(gradientDrawable2);
        editText.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout4.addView(editText);
        TextView textView3 = new TextView(activity);
        AbstractC0213Ey.m414l(-79465484908597L, textView3, 12.0f);
        textView3.setTextColor(activity.getColor(R.color.textSecondary));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0295Gu.m616i(4);
        textView3.setLayoutParams(layoutParams6);
        linearLayout4.addView(textView3);
        linearLayout2.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.bottomMargin = AbstractC0295Gu.m616i(16);
        linearLayout5.setLayoutParams(layoutParams7);
        TextView textView4 = new TextView(activity);
        AbstractC0213Ey.m414l(-79521319483445L, textView4, 14.0f);
        textView4.setTextColor(activity.getColor(R.color.textTitle));
        textView4.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.bottomMargin = AbstractC0295Gu.m616i(8);
        textView4.setLayoutParams(layoutParams8);
        linearLayout5.addView(textView4);
        EditText editText2 = new EditText(activity);
        editText2.setHint(AbstractC0295Gu.m625r(-79542794319925L));
        editText2.setTextSize(16.0f);
        editText2.setTextColor(activity.getColor(R.color.textTitle));
        editText2.setHintTextColor(activity.getColor(R.color.textSecondary));
        editText2.setInputType(33);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(activity.getColor(R.color.iconBackground));
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable3.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        editText2.setBackground(gradientDrawable3);
        editText2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8030c = editText2;
        linearLayout5.addView(editText2);
        LinearLayout linearLayout6 = new LinearLayout(activity);
        linearLayout6.setOrientation(0);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.topMargin = AbstractC0295Gu.m616i(4);
        linearLayout6.setLayoutParams(layoutParams9);
        linearLayout6.setGravity(16);
        TextView textView5 = new TextView(activity);
        AbstractC0213Ey.m414l(-79637283600437L, textView5, 12.0f);
        textView5.setTextColor(activity.getColor(R.color.textSecondary));
        textView5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout6.addView(textView5);
        C2214m0 c2214m0 = C2214m0.f7706a;
        String strM2791I = C1456gf.m2791I();
        c2214m0.getClass();
        if (C2214m0.m4455b(activity, strM2791I)) {
            TextView textView6 = new TextView(activity);
            AbstractC0213Ey.m414l(-79714593011765L, textView6, 11.0f);
            textView6.setTextColor(activity.getColor(R.color.colorError));
            textView6.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), 0, AbstractC0295Gu.m616i(4));
            textView6.setClickable(true);
            final int i = 0;
            textView6.setOnClickListener(new View.OnClickListener(this) { // from class: kp

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2288np f7537b;

                {
                    this.f7537b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            C2288np c2288np = this.f7537b;
                            try {
                                String strM2791I2 = C1456gf.m2791I();
                                C2214m0 c2214m02 = C2214m0.f7706a;
                                Activity activity2 = c2288np.f8029b;
                                EditText editText3 = null;
                                if (activity2 == null) {
                                    AbstractC0295Gu.m625r(-79723182946357L);
                                    activity2 = null;
                                }
                                c2214m02.getClass();
                                AbstractC0295Gu.m625r(-409211599058997L);
                                AbstractC0295Gu.m625r(-409245958797365L);
                                activity2.getSharedPreferences(AbstractC0295Gu.m625r(-409284613503029L), 0).edit().remove(AbstractC0295Gu.m625r(-409903088793653L).concat(strM2791I2)).apply();
                                EditText editText4 = c2288np.f8030c;
                                if (editText4 == null) {
                                    AbstractC0295Gu.m625r(-79761837652021L);
                                    editText4 = null;
                                }
                                editText4.setText(AbstractC0295Gu.m625r(-79821967194165L));
                                EditText editText5 = c2288np.f8031d;
                                if (editText5 == null) {
                                    AbstractC0295Gu.m625r(-79826262161461L);
                                } else {
                                    editText3 = editText5;
                                }
                                editText3.setText(AbstractC0295Gu.m625r(-79899276605493L));
                                c2288np.m4623g(AbstractC0295Gu.m625r(-79903571572789L), false);
                            } catch (Exception e) {
                                c2288np.m4623g(AbstractC0213Ey.m405c(-79976586016821L, new StringBuilder(), e), true);
                                return;
                            }
                            break;
                        default:
                            C2288np c2288np2 = this.f7537b;
                            EditText editText6 = c2288np2.f8030c;
                            InterfaceC0190Eb interfaceC0190Eb = null;
                            if (editText6 == null) {
                                AbstractC0295Gu.m625r(-131129646512181L);
                                editText6 = null;
                            }
                            String string = AbstractC2564tz.m5070e0(editText6.getText().toString()).toString();
                            EditText editText7 = c2288np2.f8031d;
                            if (editText7 == null) {
                                AbstractC0295Gu.m625r(-131189776054325L);
                                editText7 = null;
                            }
                            String string2 = AbstractC2564tz.m5070e0(editText7.getText().toString()).toString();
                            if (string.length() == 0) {
                                c2288np2.m4623g(AbstractC0295Gu.m625r(-131262790498357L), true);
                            } else if (!Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                                c2288np2.m4623g(AbstractC0295Gu.m625r(-131297150236725L), true);
                            } else if (string2.length() == 0) {
                                c2288np2.m4623g(AbstractC0295Gu.m625r(-131344394876981L), true);
                            } else if (string2.length() >= 6) {
                                c2288np2.m4622f(true);
                                C1498hd c1498hd = AbstractC1499he.f5282a;
                                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(c2288np2, string, string2, interfaceC0190Eb, 1), 3);
                            } else {
                                c2288np2.m4623g(AbstractC0295Gu.m625r(-131370164680757L), true);
                            }
                            break;
                    }
                }
            });
            linearLayout6.addView(textView6);
        }
        linearLayout5.addView(linearLayout6);
        linearLayout2.addView(linearLayout5);
        LinearLayout linearLayout7 = new LinearLayout(activity);
        linearLayout7.setOrientation(1);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams10.bottomMargin = AbstractC0295Gu.m616i(24);
        linearLayout7.setLayoutParams(layoutParams10);
        TextView textView7 = new TextView(activity);
        AbstractC0213Ey.m414l(-79199196936245L, textView7, 14.0f);
        textView7.setTextColor(activity.getColor(R.color.textTitle));
        textView7.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams11.bottomMargin = AbstractC0295Gu.m616i(8);
        textView7.setLayoutParams(layoutParams11);
        linearLayout7.addView(textView7);
        EditText editText3 = new EditText(activity);
        editText3.setHint(AbstractC0295Gu.m625r(-79220671772725L));
        editText3.setTextSize(16.0f);
        editText3.setTextColor(activity.getColor(R.color.textTitle));
        editText3.setHintTextColor(activity.getColor(R.color.textSecondary));
        editText3.setInputType(129);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable4.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        editText3.setBackground(gradientDrawable4);
        editText3.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        editText3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8031d = editText3;
        linearLayout7.addView(editText3);
        linearLayout2.addView(linearLayout7);
        TextView textView8 = new TextView(activity);
        AbstractC0213Ey.m414l(-79353815758901L, textView8, 16.0f);
        textView8.setTextColor(activity.getColor(R.color.buttonTextPrimary));
        textView8.setTypeface(typeface);
        textView8.setGravity(17);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(activity.getColor(R.color.buttonPrimary));
        gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView8.setBackground(gradientDrawable5);
        textView8.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams12.bottomMargin = AbstractC0295Gu.m616i(16);
        textView8.setLayoutParams(layoutParams12);
        textView8.setClickable(true);
        textView8.setFocusable(true);
        final int i2 = 1;
        textView8.setOnClickListener(new View.OnClickListener(this) { // from class: kp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2288np f7537b;

            {
                this.f7537b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C2288np c2288np = this.f7537b;
                        try {
                            String strM2791I2 = C1456gf.m2791I();
                            C2214m0 c2214m02 = C2214m0.f7706a;
                            Activity activity2 = c2288np.f8029b;
                            EditText editText32 = null;
                            if (activity2 == null) {
                                AbstractC0295Gu.m625r(-79723182946357L);
                                activity2 = null;
                            }
                            c2214m02.getClass();
                            AbstractC0295Gu.m625r(-409211599058997L);
                            AbstractC0295Gu.m625r(-409245958797365L);
                            activity2.getSharedPreferences(AbstractC0295Gu.m625r(-409284613503029L), 0).edit().remove(AbstractC0295Gu.m625r(-409903088793653L).concat(strM2791I2)).apply();
                            EditText editText4 = c2288np.f8030c;
                            if (editText4 == null) {
                                AbstractC0295Gu.m625r(-79761837652021L);
                                editText4 = null;
                            }
                            editText4.setText(AbstractC0295Gu.m625r(-79821967194165L));
                            EditText editText5 = c2288np.f8031d;
                            if (editText5 == null) {
                                AbstractC0295Gu.m625r(-79826262161461L);
                            } else {
                                editText32 = editText5;
                            }
                            editText32.setText(AbstractC0295Gu.m625r(-79899276605493L));
                            c2288np.m4623g(AbstractC0295Gu.m625r(-79903571572789L), false);
                        } catch (Exception e) {
                            c2288np.m4623g(AbstractC0213Ey.m405c(-79976586016821L, new StringBuilder(), e), true);
                            return;
                        }
                        break;
                    default:
                        C2288np c2288np2 = this.f7537b;
                        EditText editText6 = c2288np2.f8030c;
                        InterfaceC0190Eb interfaceC0190Eb = null;
                        if (editText6 == null) {
                            AbstractC0295Gu.m625r(-131129646512181L);
                            editText6 = null;
                        }
                        String string = AbstractC2564tz.m5070e0(editText6.getText().toString()).toString();
                        EditText editText7 = c2288np2.f8031d;
                        if (editText7 == null) {
                            AbstractC0295Gu.m625r(-131189776054325L);
                            editText7 = null;
                        }
                        String string2 = AbstractC2564tz.m5070e0(editText7.getText().toString()).toString();
                        if (string.length() == 0) {
                            c2288np2.m4623g(AbstractC0295Gu.m625r(-131262790498357L), true);
                        } else if (!Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                            c2288np2.m4623g(AbstractC0295Gu.m625r(-131297150236725L), true);
                        } else if (string2.length() == 0) {
                            c2288np2.m4623g(AbstractC0295Gu.m625r(-131344394876981L), true);
                        } else if (string2.length() >= 6) {
                            c2288np2.m4622f(true);
                            C1498hd c1498hd = AbstractC1499he.f5282a;
                            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(c2288np2, string, string2, interfaceC0190Eb, 1), 3);
                        } else {
                            c2288np2.m4623g(AbstractC0295Gu.m625r(-131370164680757L), true);
                        }
                        break;
                }
            }
        });
        this.f8032e = textView8;
        textView8.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, textView8));
        View view = this.f8032e;
        if (view == null) {
            AbstractC0295Gu.m625r(-79431125170229L);
            view = null;
        }
        linearLayout2.addView(view);
        TextView textView9 = new TextView(activity);
        AbstractC0213Ey.m414l(-80032420591669L, textView9, 14.0f);
        textView9.setTextColor(activity.getColor(R.color.textSummary));
        textView9.setGravity(17);
        textView9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8033f = textView9;
        linearLayout2.addView(textView9);
        this.f8028a.addView(linearLayout2);
        LinearLayout linearLayout8 = new LinearLayout(activity);
        linearLayout8.setOrientation(1);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams13.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), 0);
        linearLayout8.setLayoutParams(layoutParams13);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(activity.getColor(R.color.importCardBackground));
        gradientDrawable6.setCornerRadius(AbstractC0295Gu.m616i(12));
        gradientDrawable6.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.importCardStroke));
        linearLayout8.setBackground(gradientDrawable6);
        linearLayout8.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        TextView textView10 = new TextView(activity);
        AbstractC0213Ey.m414l(-80148384708661L, textView10, 16.0f);
        textView10.setTextColor(activity.getColor(R.color.textTitle));
        textView10.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams14.bottomMargin = AbstractC0295Gu.m616i(12);
        textView10.setLayoutParams(layoutParams14);
        linearLayout8.addView(textView10);
        for (String str : Collections.singletonList(AbstractC0295Gu.m625r(-80182744447029L))) {
            TextView textView11 = new TextView(activity);
            textView11.setText(str);
            textView11.setTextSize(14.0f);
            textView11.setTextColor(activity.getColor(R.color.textSummary));
            LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams15.bottomMargin = AbstractC0295Gu.m616i(8);
            textView11.setLayoutParams(layoutParams15);
            textView11.setLineSpacing(AbstractC0295Gu.m616i(4), 1.0f);
            linearLayout8.addView(textView11);
        }
        this.f8028a.addView(linearLayout8);
    }

    /* JADX INFO: renamed from: f */
    public final void m4622f(boolean z) {
        TextView textView = this.f8032e;
        EditText editText = null;
        if (textView == null) {
            AbstractC0295Gu.m625r(-131937100363829L);
            textView = null;
        }
        textView.setText(AbstractC0295Gu.m625r(z ? -131438884157493L : -131468948928565L));
        boolean z2 = !z;
        textView.setClickable(z2);
        textView.setAlpha(z ? 0.6f : 1.0f);
        EditText editText2 = this.f8031d;
        if (editText2 == null) {
            AbstractC0295Gu.m625r(-131494718732341L);
        } else {
            editText = editText2;
        }
        editText.setEnabled(z2);
    }

    /* JADX INFO: renamed from: g */
    public final void m4623g(String str, boolean z) {
        TextView textView = this.f8033f;
        if (textView == null) {
            AbstractC0295Gu.m625r(-131567733176373L);
            textView = null;
        }
        textView.setText(str);
        textView.setTextColor(textView.getContext().getColor(z ? R.color.colorError : R.color.textSummary));
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f8028a;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-130163278870581L);
    }
}
