package yyds;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᛵᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2457 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final ImageView f12126;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final TextView f12127;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final ImageView f12128;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final View f12129;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ImageView f12130;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0882 f12131;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public float f12132 = -1.0f;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final LinearLayout f12133;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final TextView f12134;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f12135;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final TextView f12136;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC2018 f12137;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0763 f12138;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final RelativeLayout f12139;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final ViewGroup f12140;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final ViewGroup f12141;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final ArrayList f12142;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final RelativeLayout f12143;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final TextView f12144;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final TextView f12145;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final MaxRelativeLayout f12146;

    public C2457(C0763 c0763, View view) {
        this.f12138 = c0763;
        if (view == null) {
            return;
        }
        c0763.getClass();
        c0763.f413 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f12135 = dialogXBaseRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.box_bkg);
        this.f12143 = relativeLayout;
        this.f12146 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        this.f12130 = (ImageView) view.findViewById(R.id.img_tab);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f12145 = textView;
        this.f12137 = (InterfaceC2018) view.findViewById(R.id.scrollView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.box_content);
        this.f12127 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        View viewFindViewWithTag = view.findViewWithTag("split");
        this.f12129 = viewFindViewWithTag;
        this.f12141 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f12139 = (RelativeLayout) view.findViewById(R.id.box_custom);
        int i = 1;
        if (!c0763.f3524) {
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            viewGroup.addView(linearLayout, 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f12140 = (ViewGroup) view.findViewWithTag("cancelBox");
        this.f12133 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f12144 = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f12136 = textView3;
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f12134 = textView4;
        this.f12128 = (ImageView) view.findViewWithTag("imgPositiveButtonSplit");
        this.f12126 = (ImageView) view.findViewWithTag("imgOtherButtonSplit");
        this.f12142 = AbstractC0041.m265(view);
        c0763.f3521 = 1;
        C0469 c0469 = c0763.f398;
        c0763.m279().setTranslationZ(0.0f);
        WeakReference weakReference = AbstractC1655.f8450;
        C2544 c2544 = c0763.f3525;
        if (c2544 == null) {
            c0763.f3525 = null;
            c2544 = null;
        }
        if (c2544 == null) {
            c0763.f3525 = null;
        }
        if (c0763.f3520 == null) {
            c0763.f3520 = null;
        }
        if (c0763.f3519 == null) {
            c0763.f3519 = null;
        }
        if (c0763.f3514 == null) {
            c0763.f3514 = null;
        }
        if (textView != null) {
            textView.getPaint().setFakeBoldText(true);
        }
        if (textView2 != null) {
            textView2.getPaint().setFakeBoldText(true);
        }
        if (textView4 != null) {
            textView4.getPaint().setFakeBoldText(true);
        }
        if (textView3 != null) {
            textView3.getPaint().setFakeBoldText(true);
        }
        relativeLayout.setY(c0763.m278() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c0763.m278().getMeasuredHeight());
        dialogXBaseRelativeLayout.m294(c0763.f3523);
        int i2 = 0;
        dialogXBaseRelativeLayout.f420 = new C0599(i2, this);
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC2221(this, i2));
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC2221(this, i));
        }
        int i3 = 2;
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC2221(this, i3));
        }
        if (viewFindViewWithTag != null) {
            c0469.getClass();
            int i4 = c0763.mo277() ? R.drawable.rect_dialogx_material_menu_split_divider : R.drawable.rect_dialogx_material_menu_split_divider_night;
            c0763.mo277();
            viewFindViewWithTag.setBackgroundResource(i4);
            ViewGroup.LayoutParams layoutParams = viewFindViewWithTag.getLayoutParams();
            layoutParams.height = 1;
            viewFindViewWithTag.setLayoutParams(layoutParams);
        }
        dialogXBaseRelativeLayout.f430 = new C0052(6, this);
        relativeLayout.post(new RunnableC0841(this, i));
        RunnableC0841 runnableC0841 = new RunnableC0841(this, i3);
        long j = c0763.f402;
        AbstractC0041.m268(runnableC0841, j < 0 ? 300L : j);
        c0763.f3516 = this;
        m4497();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4495(View view) {
        C0763 c0763 = this.f12138;
        c0763.getClass();
        int i = 0;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c0763.m282() == null || c0763.f403) {
            return;
        }
        C2207 c2207 = c0763.f3534;
        if (c2207 == null) {
            c2207 = new C2207(i, this);
            c0763.f3534 = c2207;
        }
        c0763.f403 = true;
        if (c2207 == null) {
            c2207 = new C2207(i, this);
            c0763.f3534 = c2207;
        }
        c2207.m4195(c0763);
        RunnableC0841 runnableC0841 = new RunnableC0841(this, i);
        long j = c0763.f411;
        if (j == -1) {
            j = 300;
        }
        AbstractC0041.m268(runnableC0841, j);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4496() {
        C0763 c0763 = this.f12138;
        boolean zMo1716 = c0763.mo1716();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12135;
        if (zMo1716) {
            new C1344();
            m4495(dialogXBaseRelativeLayout);
            return;
        }
        long j = c0763.f411;
        if (j < 0) {
            j = 300;
        }
        RelativeLayout relativeLayout = this.f12143;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4497() {
        int i;
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup = this.f12140;
        ImageView imageView = this.f12130;
        View view = this.f12129;
        TextView textView = this.f12144;
        TextView textView2 = this.f12127;
        TextView textView3 = this.f12145;
        TextView textView4 = this.f12134;
        TextView textView5 = this.f12136;
        MaxRelativeLayout maxRelativeLayout = this.f12146;
        C0763 c0763 = this.f12138;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12135;
        if (dialogXBaseRelativeLayout != null) {
            Activity activityM282 = c0763.m282();
            C0763 c07632 = c0763.f3523;
            if (activityM282 == null) {
                return;
            }
            WeakReference weakReference = AbstractC1655.f8450;
            maxRelativeLayout.getClass();
            maxRelativeLayout.setMinimumWidth(0);
            maxRelativeLayout.setMinimumHeight(0);
            dialogXBaseRelativeLayout.f435 = c0763.f397;
            int[] iArr = c0763.f404;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = 3;
            int i6 = iArr[3];
            int[] iArr2 = dialogXBaseRelativeLayout.f427;
            iArr2[0] = i2;
            iArr2[1] = i3;
            iArr2[2] = i4;
            iArr2[3] = i6;
            AbstractC0041.m270(textView3, c0763.f3518);
            AbstractC0041.m270(textView2, c0763.f3527);
            AbstractC0041.m272(textView3, null);
            AbstractC0041.m272(textView2, null);
            AbstractC0041.m272(textView, c0763.f3520);
            AbstractC0041.m272(textView5, c0763.f3519);
            AbstractC0041.m272(textView4, c0763.f3525);
            if (!c0763.f3515) {
                dialogXBaseRelativeLayout.setClickable(false);
            } else if (c0763.mo1716()) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC2221(this, i5));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
            this.f12143.setOnClickListener(new ViewOnClickListenerC2221(this, 4));
            int i7 = 8;
            if (c0763.f3529 > -1.0f) {
                if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                    float f = c0763.f3529;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                maxRelativeLayout.setOutlineProvider(new C1559(0, this));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f12142;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C0188.m794();
                        return;
                    }
                }
            }
            AbstractC1865 abstractC1865 = c0763.f3522;
            if (abstractC1865 != null && abstractC1865.m3648() != null) {
                c0763.f3522.m3646(this.f12139, c07632);
                if (c0763.f3522.m3648() instanceof InterfaceC2018) {
                    InterfaceC2018 interfaceC2018 = this.f12137;
                    if (interfaceC2018 instanceof DialogScrollView) {
                        ((DialogScrollView) interfaceC2018).setVerticalScrollBarEnabled(false);
                    }
                    this.f12137 = (InterfaceC2018) c0763.f3522.m3648();
                } else {
                    KeyEvent.Callback callbackFindViewWithTag = c0763.f3522.m3648().findViewWithTag("ScrollController");
                    if (callbackFindViewWithTag instanceof InterfaceC2018) {
                        InterfaceC2018 interfaceC20182 = this.f12137;
                        if (interfaceC20182 instanceof DialogScrollView) {
                            ((DialogScrollView) interfaceC20182).setVerticalScrollBarEnabled(false);
                        }
                        this.f12137 = (InterfaceC2018) callbackFindViewWithTag;
                    }
                }
            }
            if (c0763.m1711() && c0763.mo1716()) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else if (imageView != null) {
                imageView.setVisibility(8);
            }
            C0882 c0882 = this.f12131;
            if (c0882 != null) {
                c0882.m1972(c07632, this);
            }
            if (view == null) {
                i = 0;
            } else if (textView3.getVisibility() == 0 || textView2.getVisibility() == 0) {
                i = 0;
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
                i = 0;
            }
            if (viewGroup != null) {
                if (AbstractC0041.m267(c0763.f3514)) {
                    viewGroup.setVisibility(8);
                } else {
                    viewGroup.setVisibility(i);
                }
            }
            AbstractC0041.m270(textView4, c0763.f3530);
            AbstractC0041.m270(textView, c0763.f3514);
            AbstractC0041.m270(textView5, c0763.f3531);
            LinearLayout linearLayout = this.f12133;
            if (linearLayout != null) {
                if ((textView != null && textView.getVisibility() == 0) || ((textView5 != null && textView5.getVisibility() == 0) || (textView4 != null && textView4.getVisibility() == 0))) {
                    i7 = i;
                }
                linearLayout.setVisibility(i7);
            }
            ImageView imageView2 = this.f12128;
            if (imageView2 != null) {
                imageView2.setVisibility(textView4.getVisibility());
            }
            ImageView imageView3 = this.f12126;
            if (imageView3 != null) {
                imageView3.setVisibility(textView5.getVisibility());
            }
        }
    }
}
