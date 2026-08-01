package p257;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.C3766;
import com.kongzue.dialogx.util.C3770;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p033.AbstractC6325;
import p230.C8048;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f22738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageView f22739;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaxRelativeLayout f22740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final RelativeLayout f22741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3766 f22743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f22744 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f22745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C8239 f22746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ImageView f22747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ImageView f22748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f22749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f22750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final LinearLayout f22751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f22752;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextView f22753;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC3745 f22754;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final RelativeLayout f22755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ViewGroup f22756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View f22757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewGroup f22758;

    public C8238(C8239 c8239, View view) {
        this.f22746 = c8239;
        if (view == null) {
            return;
        }
        c8239.m8060(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22742 = dialogXBaseRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.box_bkg);
        this.f22741 = relativeLayout;
        this.f22740 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        this.f22739 = (ImageView) view.findViewById(R.id.img_tab);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f22738 = textView;
        this.f22754 = (InterfaceC3745) view.findViewById(R.id.scrollView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.box_content);
        this.f22753 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        View viewFindViewWithTag = view.findViewWithTag("split");
        this.f22757 = viewFindViewWithTag;
        this.f22758 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f22755 = (RelativeLayout) view.findViewById(R.id.box_custom);
        int i = 1;
        if (!c8239.f22773) {
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            viewGroup.addView(linearLayout, 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f22756 = (ViewGroup) view.findViewWithTag("cancelBox");
        this.f22751 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f22752 = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f22749 = textView3;
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f22750 = textView4;
        this.f22748 = (ImageView) view.findViewWithTag("imgPositiveButtonSplit");
        this.f22747 = (ImageView) view.findViewWithTag("imgOtherButtonSplit");
        this.f22745 = AbstractC3737.m8052(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        AbstractC6325 abstractC6325 = c8239.f11578;
        c8239.m8068().setTranslationZ(0.0f);
        AbstractC6325 abstractC63252 = AbstractC8247.f22824;
        if (c8239.f22770 == null) {
            c8239.f22770 = null;
        }
        if (c8239.f22770 == null) {
            c8239.f22770 = null;
        }
        if (c8239.f22774 == null) {
            c8239.f22774 = null;
        }
        if (c8239.f22769 == null) {
            c8239.f22769 = null;
        }
        if (c8239.f22764 == null) {
            c8239.f22764 = null;
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
        relativeLayout.setY(c8239.m8070() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c8239.m8070().getMeasuredHeight());
        dialogXBaseRelativeLayout.m8086(c8239.f22767);
        int i2 = 0;
        dialogXBaseRelativeLayout.f11631 = new C8235(this, i2);
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC8234(this, i2));
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC8234(this, i));
        }
        int i3 = 2;
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC8234(this, i3));
        }
        if (viewFindViewWithTag != null) {
            int iMo8331 = abstractC6325.mo11877().mo8331(c8239.mo8057());
            c8239.mo8057();
            if (iMo8331 != 0) {
                viewFindViewWithTag.setBackgroundResource(iMo8331);
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewWithTag.getLayoutParams();
            layoutParams.height = 1;
            viewFindViewWithTag.setLayoutParams(layoutParams);
        }
        dialogXBaseRelativeLayout.f11632 = new C8048(this, 4);
        relativeLayout.post(new RunnableC8218(this, i));
        RunnableC8218 runnableC8218 = new RunnableC8218(this, i3);
        long j = c8239.f11575;
        AbstractC3737.m8042(j < 0 ? 300L : j, runnableC8218);
        c8239.f22766 = this;
        m13740();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13740() {
        char c;
        GradientDrawable gradientDrawable;
        int i;
        C8239 c8239 = this.f22746;
        C8239 c82392 = c8239.f22767;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22742;
        if (dialogXBaseRelativeLayout == null || c8239.m8071() == null) {
            return;
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        MaxRelativeLayout maxRelativeLayout = this.f22740;
        int i2 = 0;
        maxRelativeLayout.m8088(0);
        int i3 = c8239.f11585;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.m8089(i3);
        maxRelativeLayout.setMinimumWidth(0);
        int i4 = c8239.f11584;
        if (i4 == 0) {
            i4 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i4);
        dialogXBaseRelativeLayout.f11634 = c8239.f11589;
        int[] iArr = c8239.f11583;
        int i5 = 3;
        dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
        String str = c8239.f22762;
        TextView textView = this.f22738;
        AbstractC3737.m8037(textView, str);
        String str2 = c8239.f22761;
        TextView textView2 = this.f22753;
        AbstractC3737.m8037(textView2, str2);
        AbstractC3737.m8036(textView, null);
        AbstractC3737.m8036(textView2, null);
        C3770 c3770 = c8239.f22774;
        TextView textView3 = this.f22752;
        AbstractC3737.m8036(textView3, c3770);
        C3770 c37702 = c8239.f22769;
        TextView textView4 = this.f22749;
        AbstractC3737.m8036(textView4, c37702);
        C3770 c37703 = c8239.f22770;
        TextView textView5 = this.f22750;
        AbstractC3737.m8036(textView5, c37703);
        LinearLayout linearLayout = this.f22751;
        if (linearLayout != null) {
            if ((textView3 == null || textView3.getVisibility() != 0) && ((textView4 == null || textView4.getVisibility() != 0) && (textView5 == null || textView5.getVisibility() != 0))) {
                c = 1;
                i = 8;
            } else {
                c = 1;
                i = 0;
            }
            linearLayout.setVisibility(i);
        } else {
            c = 1;
        }
        if (!c8239.f22771) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c8239.f11580) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC8234(this, i5));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        this.f22741.setOnClickListener(new ViewOnClickListenerC8234(this, 4));
        if (c8239.f22775 > -1.0f) {
            if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                float f = c8239.f22775;
                float[] fArr = new float[8];
                fArr[0] = f;
                fArr[c] = f;
                fArr[2] = f;
                fArr[3] = f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
                gradientDrawable.setCornerRadii(fArr);
            }
            maxRelativeLayout.setOutlineProvider(new C8219(this, i2));
            maxRelativeLayout.setClipToOutline(c);
            ArrayList arrayList = this.f22745;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2941.m6336();
                    return;
                }
            }
        }
        AbstractC3748 abstractC3748 = c8239.f22765;
        if (abstractC3748 != null && abstractC3748.getCustomView() != null) {
            c8239.f22765.bindParent(this.f22755, c82392);
            if (c8239.f22765.getCustomView() instanceof InterfaceC3745) {
                InterfaceC3745 interfaceC3745 = this.f22754;
                if (interfaceC3745 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC3745).setVerticalScrollBarEnabled(false);
                }
                this.f22754 = (InterfaceC3745) c8239.f22765.getCustomView();
            } else {
                KeyEvent.Callback callbackFindViewWithTag = c8239.f22765.getCustomView().findViewWithTag("ScrollController");
                if (callbackFindViewWithTag instanceof InterfaceC3745) {
                    InterfaceC3745 interfaceC37452 = this.f22754;
                    if (interfaceC37452 instanceof DialogScrollView) {
                        ((DialogScrollView) interfaceC37452).setVerticalScrollBarEnabled(false);
                    }
                    this.f22754 = (InterfaceC3745) callbackFindViewWithTag;
                }
            }
        }
        boolean zM13745 = c8239.m13745();
        ImageView imageView = this.f22739;
        if (zM13745 && c8239.f11580) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        C3766 c3766 = this.f22743;
        if (c3766 != null) {
            c3766.m8105(c82392, this);
        }
        View view = this.f22757;
        if (view != null) {
            if (textView.getVisibility() == 0 || textView2.getVisibility() == 0) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        ViewGroup viewGroup = this.f22756;
        if (viewGroup != null) {
            if (AbstractC3737.m8040(c8239.f22764)) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
            }
        }
        AbstractC3737.m8037(textView5, c8239.f22763);
        AbstractC3737.m8037(textView3, c8239.f22764);
        AbstractC3737.m8037(textView4, null);
        ImageView imageView2 = this.f22748;
        if (imageView2 != null) {
            imageView2.setVisibility(textView5.getVisibility());
        }
        ImageView imageView3 = this.f22747;
        if (imageView3 != null) {
            imageView3.setVisibility(textView4.getVisibility());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13741() {
        C8239 c8239 = this.f22746;
        boolean z = c8239.f11580;
        int i = 0;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22742;
        if (z) {
            if (c8239.f22768 == null) {
                new C8220(i);
            }
            m13742(dialogXBaseRelativeLayout);
            return;
        }
        long j = c8239.f11586;
        if (j < 0) {
            j = 300;
        }
        RelativeLayout relativeLayout = this.f22741;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13742(View view) {
        int i = 0;
        if (view != null) {
            view.setEnabled(false);
        }
        C8239 c8239 = this.f22746;
        if (c8239.m8071() == null || c8239.f11582) {
            return;
        }
        if (c8239.f22776 == null) {
            c8239.f22776 = new C8216(this, i);
        }
        C8216 c8216 = c8239.f22776;
        if (c8216 != null) {
            c8239.f11582 = true;
            if (c8216 == null) {
                c8239.f22776 = new C8216(this, i);
            }
            c8239.f22776.m13726(c8239);
            RunnableC8218 runnableC8218 = new RunnableC8218(this, i);
            long j = c8239.f11586;
            if (j == -1) {
                j = 300;
            }
            AbstractC3737.m8042(j, runnableC8218);
        }
    }
}
