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
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3746;
import com.kongzue.dialogx.util.C3767;
import com.kongzue.dialogx.util.C3771;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p230.C8049;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8239 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f22737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageView f22738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaxRelativeLayout f22739;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final RelativeLayout f22740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3767 f22742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f22743 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f22744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C8240 f22745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ImageView f22746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ImageView f22747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f22748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f22749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final LinearLayout f22750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f22751;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextView f22752;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC3746 f22753;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final RelativeLayout f22754;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ViewGroup f22755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View f22756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewGroup f22757;

    public C8239(C8240 c8240, View view) {
        this.f22745 = c8240;
        if (view == null) {
            return;
        }
        c8240.m8047(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22741 = dialogXBaseRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.box_bkg);
        this.f22740 = relativeLayout;
        this.f22739 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        this.f22738 = (ImageView) view.findViewById(R.id.img_tab);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f22737 = textView;
        this.f22753 = (InterfaceC3746) view.findViewById(R.id.scrollView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.box_content);
        this.f22752 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        View viewFindViewWithTag = view.findViewWithTag("split");
        this.f22756 = viewFindViewWithTag;
        this.f22757 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f22754 = (RelativeLayout) view.findViewById(R.id.box_custom);
        int i = 1;
        if (!c8240.f22772) {
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            viewGroup.addView(linearLayout, 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f22755 = (ViewGroup) view.findViewWithTag("cancelBox");
        this.f22750 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f22751 = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f22748 = textView3;
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f22749 = textView4;
        this.f22747 = (ImageView) view.findViewWithTag("imgPositiveButtonSplit");
        this.f22746 = (ImageView) view.findViewWithTag("imgOtherButtonSplit");
        this.f22744 = AbstractC3738.m8039(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        AbstractC4922 abstractC4922 = c8240.f11583;
        c8240.m8055().setTranslationZ(0.0f);
        AbstractC4922 abstractC49222 = AbstractC8248.f22823;
        if (c8240.f22769 == null) {
            c8240.f22769 = null;
        }
        if (c8240.f22769 == null) {
            c8240.f22769 = null;
        }
        if (c8240.f22773 == null) {
            c8240.f22773 = null;
        }
        if (c8240.f22768 == null) {
            c8240.f22768 = null;
        }
        if (c8240.f22763 == null) {
            c8240.f22763 = null;
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
        relativeLayout.setY(c8240.m8057() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c8240.m8057().getMeasuredHeight());
        dialogXBaseRelativeLayout.m8073(c8240.f22766);
        int i2 = 0;
        dialogXBaseRelativeLayout.f11636 = new C8236(this, i2);
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC8235(this, i2));
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC8235(this, i));
        }
        int i3 = 2;
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC8235(this, i3));
        }
        if (viewFindViewWithTag != null) {
            int iMo6874 = abstractC4922.mo9902().mo6874(c8240.mo8044());
            c8240.mo8044();
            if (iMo6874 != 0) {
                viewFindViewWithTag.setBackgroundResource(iMo6874);
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewWithTag.getLayoutParams();
            layoutParams.height = 1;
            viewFindViewWithTag.setLayoutParams(layoutParams);
        }
        dialogXBaseRelativeLayout.f11637 = new C8049(this, 4);
        relativeLayout.post(new RunnableC8219(this, i));
        RunnableC8219 runnableC8219 = new RunnableC8219(this, i3);
        long j = c8240.f11580;
        AbstractC3738.m8029(j < 0 ? 300L : j, runnableC8219);
        c8240.f22765 = this;
        m13756();
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
    public final void m13756() {
        char c;
        GradientDrawable gradientDrawable;
        int i;
        C8240 c8240 = this.f22745;
        C8240 c82402 = c8240.f22766;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22741;
        if (dialogXBaseRelativeLayout == null || c8240.m8058() == null) {
            return;
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        MaxRelativeLayout maxRelativeLayout = this.f22739;
        int i2 = 0;
        maxRelativeLayout.m8075(0);
        int i3 = c8240.f11590;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.m8076(i3);
        maxRelativeLayout.setMinimumWidth(0);
        int i4 = c8240.f11589;
        if (i4 == 0) {
            i4 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i4);
        dialogXBaseRelativeLayout.f11639 = c8240.f11594;
        int[] iArr = c8240.f11588;
        int i5 = 3;
        dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
        String str = c8240.f22761;
        TextView textView = this.f22737;
        AbstractC3738.m8024(textView, str);
        String str2 = c8240.f22760;
        TextView textView2 = this.f22752;
        AbstractC3738.m8024(textView2, str2);
        AbstractC3738.m8023(textView, null);
        AbstractC3738.m8023(textView2, null);
        C3771 c3771 = c8240.f22773;
        TextView textView3 = this.f22751;
        AbstractC3738.m8023(textView3, c3771);
        C3771 c37712 = c8240.f22768;
        TextView textView4 = this.f22748;
        AbstractC3738.m8023(textView4, c37712);
        C3771 c37713 = c8240.f22769;
        TextView textView5 = this.f22749;
        AbstractC3738.m8023(textView5, c37713);
        LinearLayout linearLayout = this.f22750;
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
        if (!c8240.f22770) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c8240.f11585) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC8235(this, i5));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        this.f22740.setOnClickListener(new ViewOnClickListenerC8235(this, 4));
        if (c8240.f22774 > -1.0f) {
            if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                float f = c8240.f22774;
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
            maxRelativeLayout.setOutlineProvider(new C8220(this, i2));
            maxRelativeLayout.setClipToOutline(c);
            ArrayList arrayList = this.f22744;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2942.m6394();
                    return;
                }
            }
        }
        AbstractC3749 abstractC3749 = c8240.f22764;
        if (abstractC3749 != null && abstractC3749.getCustomView() != null) {
            c8240.f22764.bindParent(this.f22754, c82402);
            if (c8240.f22764.getCustomView() instanceof InterfaceC3746) {
                InterfaceC3746 interfaceC3746 = this.f22753;
                if (interfaceC3746 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC3746).setVerticalScrollBarEnabled(false);
                }
                this.f22753 = (InterfaceC3746) c8240.f22764.getCustomView();
            } else {
                KeyEvent.Callback callbackFindViewWithTag = c8240.f22764.getCustomView().findViewWithTag("ScrollController");
                if (callbackFindViewWithTag instanceof InterfaceC3746) {
                    InterfaceC3746 interfaceC37462 = this.f22753;
                    if (interfaceC37462 instanceof DialogScrollView) {
                        ((DialogScrollView) interfaceC37462).setVerticalScrollBarEnabled(false);
                    }
                    this.f22753 = (InterfaceC3746) callbackFindViewWithTag;
                }
            }
        }
        boolean zM13762 = c8240.m13762();
        ImageView imageView = this.f22738;
        if (zM13762 && c8240.f11585) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        C3767 c3767 = this.f22742;
        if (c3767 != null) {
            c3767.m8092(c82402, this);
        }
        View view = this.f22756;
        if (view != null) {
            if (textView.getVisibility() == 0 || textView2.getVisibility() == 0) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        ViewGroup viewGroup = this.f22755;
        if (viewGroup != null) {
            if (AbstractC3738.m8027(c8240.f22763)) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
            }
        }
        AbstractC3738.m8024(textView5, c8240.f22762);
        AbstractC3738.m8024(textView3, c8240.f22763);
        AbstractC3738.m8024(textView4, null);
        ImageView imageView2 = this.f22747;
        if (imageView2 != null) {
            imageView2.setVisibility(textView5.getVisibility());
        }
        ImageView imageView3 = this.f22746;
        if (imageView3 != null) {
            imageView3.setVisibility(textView4.getVisibility());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13757() {
        C8240 c8240 = this.f22745;
        boolean z = c8240.f11585;
        int i = 0;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22741;
        if (z) {
            if (c8240.f22767 == null) {
                new C8221(i);
            }
            m13758(dialogXBaseRelativeLayout);
            return;
        }
        long j = c8240.f11591;
        if (j < 0) {
            j = 300;
        }
        RelativeLayout relativeLayout = this.f22740;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13758(View view) {
        int i = 0;
        if (view != null) {
            view.setEnabled(false);
        }
        C8240 c8240 = this.f22745;
        if (c8240.m8058() == null || c8240.f11587) {
            return;
        }
        if (c8240.f22775 == null) {
            c8240.f22775 = new C8217(this, i);
        }
        C8217 c8217 = c8240.f22775;
        if (c8217 != null) {
            c8240.f11587 = true;
            if (c8217 == null) {
                c8240.f22775 = new C8217(this, i);
            }
            c8240.f22775.m13743(c8240);
            RunnableC8219 runnableC8219 = new RunnableC8219(this, i);
            long j = c8240.f11591;
            if (j == -1) {
                j = 300;
            }
            AbstractC3738.m8029(j, runnableC8219);
        }
    }
}
