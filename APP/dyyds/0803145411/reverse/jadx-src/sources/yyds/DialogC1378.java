package yyds;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛶᛷᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1378 extends Dialog {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1343 f6422;

    public DialogC1378(Context context, C1343 c1343) {
        super(context, 0);
        this.f6422 = c1343;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        float f;
        C1343 c1343 = this.f6422;
        String str = c1343.f6225;
        String str2 = c1343.f6231;
        String str3 = c1343.f6229;
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setLayout(-1, -1);
            window.setGravity(17);
            window.addFlags(2);
            window.setDimAmount(0.4f);
        }
        Context context = getContext();
        AbstractC2328.m4341(-192414107730798L);
        float f2 = context.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new ViewOnClickListenerC1462(9, this));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (context.getResources().getDisplayMetrics().widthPixels * 0.92f), -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(20.0f * f2);
        gradientDrawable.setColor(-1);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new C0920(f2));
        linearLayout.setOnClickListener(new ViewOnClickListenerC2618(5));
        String str4 = c1343.f6226;
        String str5 = c1343.f6227;
        if (str4.length() > 0) {
            TextView textView = new TextView(context);
            textView.setText(str4);
            textView.setTextSize(22.0f);
            textView.setTypeface(null, 1);
            textView.setTextColor(-14606047);
            int i = (int) (24.0f * f2);
            textView.setPadding(i, i, i, (int) (str5.length() == 0 ? 8.0f * f2 : 12.0f * f2));
            linearLayout.addView(textView);
        }
        final int i2 = 0;
        if (str5.length() > 0) {
            TextView textView2 = new TextView(context);
            textView2.setText(str5);
            textView2.setTextSize(16.0f);
            textView2.setTextColor(-12434878);
            f = 16.0f;
            textView2.setLineSpacing(0.0f, 1.5f);
            int i3 = (int) (24.0f * f2);
            textView2.setPadding(i3, str4.length() == 0 ? i3 : 0, i3, (int) (8.0f * f2));
            linearLayout.addView(textView2);
        } else {
            f = 16.0f;
        }
        if (str.length() > 0 || str2.length() > 0 || str3.length() > 0) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int i4 = (int) (12.0f * f2);
            linearLayout2.setPadding(i4, (int) (8.0f * f2), i4, (int) (f * f2));
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            linearLayout2.addView(view);
            if (str.length() > 0) {
                linearLayout2.addView(m2793(context, str, null, f2, new InterfaceC2266(this) { // from class: yyds.ᛴᛵᛳᛳ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ DialogC1378 f3916;

                    {
                        this.f3916 = this;
                    }

                    @Override // yyds.InterfaceC2266
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final Object mo731() {
                        int i5 = i2;
                        C2746 c2746 = C2746.f13459;
                        DialogC1378 dialogC1378 = this.f3916;
                        switch (i5) {
                            case 0:
                                dialogC1378.dismiss();
                                break;
                            case 1:
                                dialogC1378.dismiss();
                                break;
                            default:
                                InterfaceC2266 interfaceC2266 = dialogC1378.f6422.f6228;
                                if (interfaceC2266 != null) {
                                    interfaceC2266.mo731();
                                }
                                dialogC1378.dismiss();
                                break;
                        }
                        return c2746;
                    }
                }));
            }
            if (str2.length() > 0) {
                final int i5 = 1;
                linearLayout2.addView(m2793(context, str2, null, f2, new InterfaceC2266(this) { // from class: yyds.ᛴᛵᛳᛳ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ DialogC1378 f3916;

                    {
                        this.f3916 = this;
                    }

                    @Override // yyds.InterfaceC2266
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final Object mo731() {
                        int i52 = i5;
                        C2746 c2746 = C2746.f13459;
                        DialogC1378 dialogC1378 = this.f3916;
                        switch (i52) {
                            case 0:
                                dialogC1378.dismiss();
                                break;
                            case 1:
                                dialogC1378.dismiss();
                                break;
                            default:
                                InterfaceC2266 interfaceC2266 = dialogC1378.f6422.f6228;
                                if (interfaceC2266 != null) {
                                    interfaceC2266.mo731();
                                }
                                dialogC1378.dismiss();
                                break;
                        }
                        return c2746;
                    }
                }));
            }
            if (str3.length() > 0) {
                final int i6 = 2;
                linearLayout2.addView(m2793(context, str3, c1343.f6230, f2, new InterfaceC2266(this) { // from class: yyds.ᛴᛵᛳᛳ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ DialogC1378 f3916;

                    {
                        this.f3916 = this;
                    }

                    @Override // yyds.InterfaceC2266
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final Object mo731() {
                        int i52 = i6;
                        C2746 c2746 = C2746.f13459;
                        DialogC1378 dialogC1378 = this.f3916;
                        switch (i52) {
                            case 0:
                                dialogC1378.dismiss();
                                break;
                            case 1:
                                dialogC1378.dismiss();
                                break;
                            default:
                                InterfaceC2266 interfaceC2266 = dialogC1378.f6422.f6228;
                                if (interfaceC2266 != null) {
                                    interfaceC2266.mo731();
                                }
                                dialogC1378.dismiss();
                                break;
                        }
                        return c2746;
                    }
                }));
            }
            linearLayout.addView(linearLayout2);
        }
        frameLayout.addView(linearLayout);
        frameLayout.post(new RunnableC0309(11, linearLayout));
        setContentView(frameLayout);
        setCancelable(c1343.f6224);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final TextView m2793(Context context, String str, Integer num, float f, InterfaceC2266 interfaceC2266) {
        TextView textView = new TextView(context);
        int iIntValue = num != null ? num.intValue() : -13980690;
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(iIntValue);
        textView.setGravity(17);
        int i = (int) (12.0f * f);
        int i2 = (int) (8.0f * f);
        textView.setPadding(i, i2, i, i2);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf((iIntValue & 16777215) | 436207616);
        AbstractC2328.m4341(-192482827207534L);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(6.0f * f);
        gradientDrawable.setColor(-1);
        textView.setBackground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable));
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new ViewOnClickListenerC1456(1, interfaceC2266));
        return textView;
    }
}
