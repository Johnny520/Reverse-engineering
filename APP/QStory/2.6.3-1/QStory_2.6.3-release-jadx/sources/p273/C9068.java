package p273;

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
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.C4599;
import com.kongzue.dialogx.util.C4603;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p246.C8878;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9068 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f23082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageView f23083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaxRelativeLayout f23084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final RelativeLayout f23085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f23086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4599 f23087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f23088 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f23089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C9069 f23090;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ImageView f23091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ImageView f23092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f23093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f23094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final LinearLayout f23095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f23096;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextView f23097;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC4578 f23098;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final RelativeLayout f23099;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ViewGroup f23100;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View f23101;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewGroup f23102;

    public C9068(C9069 c9069, View view) {
        this.f23090 = c9069;
        if (view == null) {
            return;
        }
        c9069.m8606(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(C0328R.id.box_root);
        this.f23086 = dialogXBaseRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0328R.id.box_bkg);
        this.f23085 = relativeLayout;
        this.f23084 = (MaxRelativeLayout) view.findViewById(C0328R.id.bkg);
        this.f23083 = (ImageView) view.findViewById(C0328R.id.img_tab);
        TextView textView = (TextView) view.findViewById(C0328R.id.txt_dialog_title);
        this.f23082 = textView;
        this.f23098 = (InterfaceC4578) view.findViewById(C0328R.id.scrollView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0328R.id.box_content);
        this.f23097 = (TextView) view.findViewById(C0328R.id.txt_dialog_tip);
        View viewFindViewWithTag = view.findViewWithTag("split");
        this.f23101 = viewFindViewWithTag;
        this.f23102 = (ViewGroup) view.findViewById(C0328R.id.box_list);
        this.f23099 = (RelativeLayout) view.findViewById(C0328R.id.box_custom);
        int i = 1;
        if (!c9069.f23117) {
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            viewGroup.addView(linearLayout, 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f23100 = (ViewGroup) view.findViewWithTag("cancelBox");
        this.f23095 = (LinearLayout) view.findViewById(C0328R.id.box_button);
        TextView textView2 = (TextView) view.findViewById(C0328R.id.btn_selectNegative);
        this.f23096 = textView2;
        TextView textView3 = (TextView) view.findViewById(C0328R.id.btn_selectOther);
        this.f23093 = textView3;
        TextView textView4 = (TextView) view.findViewById(C0328R.id.btn_selectPositive);
        this.f23094 = textView4;
        this.f23092 = (ImageView) view.findViewWithTag("imgPositiveButtonSplit");
        this.f23091 = (ImageView) view.findViewWithTag("imgOtherButtonSplit");
        this.f23089 = AbstractC4570.m8598(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        AbstractC5754 abstractC5754 = c9069.f11928;
        c9069.m8614().setTranslationZ(0.0f);
        AbstractC5754 abstractC57542 = AbstractC9077.f23168;
        if (c9069.f23114 == null) {
            c9069.f23114 = null;
        }
        if (c9069.f23114 == null) {
            c9069.f23114 = null;
        }
        if (c9069.f23118 == null) {
            c9069.f23118 = null;
        }
        if (c9069.f23113 == null) {
            c9069.f23113 = null;
        }
        if (c9069.f23108 == null) {
            c9069.f23108 = null;
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
        relativeLayout.setY(c9069.m8616() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c9069.m8616().getMeasuredHeight());
        dialogXBaseRelativeLayout.m8632(c9069.f23111);
        int i2 = 0;
        dialogXBaseRelativeLayout.f11981 = new C9065(this, i2);
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC9064(this, i2));
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC9064(this, i));
        }
        int i3 = 2;
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC9064(this, i3));
        }
        if (viewFindViewWithTag != null) {
            int iMo7434 = abstractC5754.mo10461().mo7434(c9069.mo8603());
            c9069.mo8603();
            if (iMo7434 != 0) {
                viewFindViewWithTag.setBackgroundResource(iMo7434);
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewWithTag.getLayoutParams();
            layoutParams.height = 1;
            viewFindViewWithTag.setLayoutParams(layoutParams);
        }
        dialogXBaseRelativeLayout.f11982 = new C8878(this, 4);
        relativeLayout.post(new RunnableC9048(this, i));
        RunnableC9048 runnableC9048 = new RunnableC9048(this, i3);
        long j = c9069.f11925;
        AbstractC4570.m8588(j < 0 ? 300L : j, runnableC9048);
        c9069.f23110 = this;
        m14315();
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
    public final void m14315() {
        char c;
        GradientDrawable gradientDrawable;
        int i;
        C9069 c9069 = this.f23090;
        C9069 c90692 = c9069.f23111;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f23086;
        if (dialogXBaseRelativeLayout == null || c9069.m8617() == null) {
            return;
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        MaxRelativeLayout maxRelativeLayout = this.f23084;
        int i2 = 0;
        maxRelativeLayout.m8634(0);
        int i3 = c9069.f11935;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.m8635(i3);
        maxRelativeLayout.setMinimumWidth(0);
        int i4 = c9069.f11934;
        if (i4 == 0) {
            i4 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i4);
        dialogXBaseRelativeLayout.f11984 = c9069.f11939;
        int[] iArr = c9069.f11933;
        int i5 = 3;
        dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
        String str = c9069.f23106;
        TextView textView = this.f23082;
        AbstractC4570.m8583(textView, str);
        String str2 = c9069.f23105;
        TextView textView2 = this.f23097;
        AbstractC4570.m8583(textView2, str2);
        AbstractC4570.m8582(textView, null);
        AbstractC4570.m8582(textView2, null);
        C4603 c4603 = c9069.f23118;
        TextView textView3 = this.f23096;
        AbstractC4570.m8582(textView3, c4603);
        C4603 c46032 = c9069.f23113;
        TextView textView4 = this.f23093;
        AbstractC4570.m8582(textView4, c46032);
        C4603 c46033 = c9069.f23114;
        TextView textView5 = this.f23094;
        AbstractC4570.m8582(textView5, c46033);
        LinearLayout linearLayout = this.f23095;
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
        if (!c9069.f23115) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c9069.f11930) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC9064(this, i5));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        this.f23085.setOnClickListener(new ViewOnClickListenerC9064(this, 4));
        if (c9069.f23119 > -1.0f) {
            if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                float f = c9069.f23119;
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
            maxRelativeLayout.setOutlineProvider(new C9049(this, i2));
            maxRelativeLayout.setClipToOutline(c);
            ArrayList arrayList = this.f23089;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C3775.m6954();
                    return;
                }
            }
        }
        AbstractC4581 abstractC4581 = c9069.f23109;
        if (abstractC4581 != null && abstractC4581.getCustomView() != null) {
            c9069.f23109.bindParent(this.f23099, c90692);
            if (c9069.f23109.getCustomView() instanceof InterfaceC4578) {
                InterfaceC4578 interfaceC4578 = this.f23098;
                if (interfaceC4578 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC4578).setVerticalScrollBarEnabled(false);
                }
                this.f23098 = (InterfaceC4578) c9069.f23109.getCustomView();
            } else {
                KeyEvent.Callback callbackFindViewWithTag = c9069.f23109.getCustomView().findViewWithTag("ScrollController");
                if (callbackFindViewWithTag instanceof InterfaceC4578) {
                    InterfaceC4578 interfaceC45782 = this.f23098;
                    if (interfaceC45782 instanceof DialogScrollView) {
                        ((DialogScrollView) interfaceC45782).setVerticalScrollBarEnabled(false);
                    }
                    this.f23098 = (InterfaceC4578) callbackFindViewWithTag;
                }
            }
        }
        boolean zM14321 = c9069.m14321();
        ImageView imageView = this.f23083;
        if (zM14321 && c9069.f11930) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        C4599 c4599 = this.f23087;
        if (c4599 != null) {
            c4599.m8651(c90692, this);
        }
        View view = this.f23101;
        if (view != null) {
            if (textView.getVisibility() == 0 || textView2.getVisibility() == 0) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        ViewGroup viewGroup = this.f23100;
        if (viewGroup != null) {
            if (AbstractC4570.m8586(c9069.f23108)) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
            }
        }
        AbstractC4570.m8583(textView5, c9069.f23107);
        AbstractC4570.m8583(textView3, c9069.f23108);
        AbstractC4570.m8583(textView4, null);
        ImageView imageView2 = this.f23092;
        if (imageView2 != null) {
            imageView2.setVisibility(textView5.getVisibility());
        }
        ImageView imageView3 = this.f23091;
        if (imageView3 != null) {
            imageView3.setVisibility(textView4.getVisibility());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14316() {
        C9069 c9069 = this.f23090;
        boolean z = c9069.f11930;
        int i = 0;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f23086;
        if (z) {
            if (c9069.f23112 == null) {
                new C9050(i);
            }
            m14317(dialogXBaseRelativeLayout);
            return;
        }
        long j = c9069.f11936;
        if (j < 0) {
            j = 300;
        }
        RelativeLayout relativeLayout = this.f23085;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14317(View view) {
        int i = 0;
        if (view != null) {
            view.setEnabled(false);
        }
        C9069 c9069 = this.f23090;
        if (c9069.m8617() == null || c9069.f11932) {
            return;
        }
        if (c9069.f23120 == null) {
            c9069.f23120 = new C9046(this, i);
        }
        C9046 c9046 = c9069.f23120;
        if (c9046 != null) {
            c9069.f11932 = true;
            if (c9046 == null) {
                c9069.f23120 = new C9046(this, i);
            }
            c9069.f23120.m14302(c9069);
            RunnableC9048 runnableC9048 = new RunnableC9048(this, i);
            long j = c9069.f11936;
            if (j == -1) {
                j = 300;
            }
            AbstractC4570.m8588(j, runnableC9048);
        }
    }
}
