package p273;

import android.app.Activity;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0909;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p246.C8878;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9038 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f22976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC4578 f22977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TextView f22978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MaxRelativeLayout f22979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22981;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final TextView f22982;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View f22983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final TextView f22984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9037 f22985;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RelativeLayout f22986;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewGroup f22987;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final TextView f22988;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final View f22989;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final EditText f22990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinearLayout f22991;

    public C9038(C9037 c9037, View view) {
        this.f22985 = c9037;
        if (view == null) {
            return;
        }
        c9037.m8606(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(C0328R.id.box_root);
        this.f22980 = dialogXBaseRelativeLayout;
        this.f22979 = (MaxRelativeLayout) view.findViewById(C0328R.id.bkg);
        TextView textView = (TextView) view.findViewById(C0328R.id.txt_dialog_title);
        this.f22978 = textView;
        this.f22977 = (InterfaceC4578) view.findViewById(C0328R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(C0328R.id.txt_dialog_tip);
        this.f22976 = textView2;
        this.f22987 = (ViewGroup) view.findViewById(C0328R.id.box_list);
        this.f22986 = (RelativeLayout) view.findViewById(C0328R.id.box_custom);
        this.f22990 = (EditText) view.findViewById(C0328R.id.txt_input);
        this.f22991 = (LinearLayout) view.findViewById(C0328R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(C0328R.id.btn_selectOther);
        this.f22988 = textView3;
        this.f22989 = view.findViewById(C0328R.id.space_other_button);
        this.f22983 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(C0328R.id.btn_selectNegative);
        this.f22982 = textView4;
        TextView textView5 = (TextView) view.findViewById(C0328R.id.btn_selectPositive);
        this.f22984 = textView5;
        this.f22981 = AbstractC4570.m8598(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c9037.m8614().setTranslationZ(0.0f);
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        if (c9037.f22969 == null) {
            c9037.f22969 = null;
        }
        if (c9037.f22969 == null) {
            c9037.f22969 = null;
        }
        textView.getPaint().setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m8633(0.0f);
        dialogXBaseRelativeLayout.m8632(c9037.f22960);
        dialogXBaseRelativeLayout.f11981 = new C9065(this, 3);
        dialogXBaseRelativeLayout.f11982 = new C8878(this, 6);
        textView5.setOnClickListener(new ViewOnClickListenerC9055(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC9055(this, 1));
        textView3.setOnClickListener(new ViewOnClickListenerC9055(this, 2));
        c9037.f22965 = this;
        m14291();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14291() {
        ?? r8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22980;
        if (dialogXBaseRelativeLayout != null) {
            C9037 c9037 = this.f22985;
            Activity activityM8617 = c9037.m8617();
            AbstractC4570 abstractC4570 = c9037.f22960;
            AbstractC5754 abstractC5754 = c9037.f11928;
            if (activityM8617 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f11984 = c9037.f11939;
            int[] iArr = c9037.f11933;
            int i = 1;
            int i2 = 2;
            dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
            AbstractC5754 abstractC57542 = AbstractC9077.f23168;
            MaxRelativeLayout maxRelativeLayout = this.f22979;
            maxRelativeLayout.m8634(0);
            int i3 = c9037.f11935;
            if (i3 == 0) {
                i3 = 0;
            }
            maxRelativeLayout.m8635(i3);
            maxRelativeLayout.setMinimumWidth(0);
            int i4 = c9037.f11934;
            if (i4 == 0) {
                i4 = 0;
            }
            maxRelativeLayout.setMinimumHeight(i4);
            View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
            boolean z = abstractC4570 instanceof C9057;
            EditText editText = this.f22990;
            if (z) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                editText.setVisibility(0);
                if (editText != dialogXBaseRelativeLayout) {
                    dialogXBaseRelativeLayout.f11971 = new WeakReference(editText);
                }
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                editText.setVisibility(8);
            }
            dialogXBaseRelativeLayout.setClickable(true);
            if (c9037.f22973 > -1.0f) {
                maxRelativeLayout.setOutlineProvider(new C9049(this, i2));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f22981;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C3775.m6954();
                        return;
                    }
                }
            }
            CharSequence charSequence = c9037.f22959;
            if (charSequence == null) {
                charSequence = null;
            }
            TextView textView = this.f22978;
            AbstractC4570.m8583(textView, charSequence);
            CharSequence charSequence2 = c9037.f22971;
            TextView textView2 = this.f22976;
            AbstractC4570.m8583(textView2, charSequence2);
            String str = c9037.f22970;
            TextView textView3 = this.f22984;
            AbstractC4570.m8583(textView3, str);
            String str2 = c9037.f22974;
            TextView textView4 = this.f22982;
            AbstractC4570.m8583(textView4, str2);
            String str3 = c9037.f22975;
            TextView textView5 = this.f22988;
            AbstractC4570.m8583(textView5, str3);
            editText.setText(c9037.f22972);
            editText.setHint((CharSequence) null);
            View view = this.f22989;
            if (view != null) {
                if (c9037.f22975 == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            AbstractC4570.m8582(textView, null);
            AbstractC4570.m8582(textView2, null);
            AbstractC4570.m8582(textView3, c9037.f22969);
            AbstractC4570.m8582(textView4, null);
            AbstractC4570.m8582(textView5, null);
            LinearLayout linearLayout = this.f22991;
            if (linearLayout != null) {
                linearLayout.setVisibility(((textView4 == null || textView4.getVisibility() != 0) && (textView5 == null || textView5.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0)) ? 8 : 0);
            }
            AbstractC4570.m8586(c9037.f22970);
            AbstractC4570.m8586(c9037.f22974);
            AbstractC4570.m8586(c9037.f22975);
            View view2 = this.f22983;
            if (view2 != null) {
                c9037.mo8603();
                abstractC5754.getClass();
                view2.setBackgroundColor(c9037.m8619(0));
            }
            linearLayout.setOrientation(0);
            abstractC5754.mo10458();
            if (abstractC5754.mo10458().length != 0) {
                linearLayout.removeAllViews();
                int[] iArrMo10458 = abstractC5754.mo10458();
                int length = iArrMo10458.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = iArrMo10458[i5];
                    if (i6 == i) {
                        linearLayout.addView(textView3);
                        abstractC5754.mo10460();
                        textView3.setBackgroundResource(abstractC5754.mo10460().mo7403(c9037.mo8603()));
                    } else if (i6 == 2) {
                        linearLayout.addView(textView4);
                        abstractC5754.mo10460();
                        textView4.setBackgroundResource(abstractC5754.mo10460().mo7404(c9037.mo8603()));
                    } else if (i6 == 3) {
                        linearLayout.addView(textView5);
                        abstractC5754.mo10460();
                        textView5.setBackgroundResource(abstractC5754.mo10460().mo7402(c9037.mo8603()));
                    } else if (i6 != 4) {
                        if (i6 == 5 && linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                            View view3 = new View(c9037.m8617());
                            Resources resourcesM8615 = c9037.m8615();
                            c9037.mo8603();
                            abstractC5754.getClass();
                            view3.setBackgroundColor(resourcesM8615.getColor(0));
                            abstractC5754.getClass();
                            linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                        }
                    } else if (linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                        Space space = new Space(c9037.m8617());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.weight = 1.0f;
                        linearLayout.addView(space, layoutParams);
                    }
                    i5++;
                    i = 1;
                }
            }
            if (c9037.f22964) {
                if (c9037.mo14284()) {
                    dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC9055(this, 3));
                } else {
                    dialogXBaseRelativeLayout.setOnClickListener(null);
                }
                r8 = 0;
            } else {
                r8 = 0;
                dialogXBaseRelativeLayout.setClickable(false);
            }
            AbstractC4581 abstractC4581 = c9037.f22961;
            RelativeLayout relativeLayout = this.f22986;
            if (abstractC4581 == null || abstractC4581.getCustomView() == null) {
                relativeLayout.setVisibility(8);
                return;
            }
            c9037.f22961.bindParent(relativeLayout, abstractC4570);
            relativeLayout.setVisibility(r8);
            if (c9037.f22961.getCustomView() instanceof InterfaceC4578) {
                InterfaceC4578 interfaceC4578 = this.f22977;
                if (interfaceC4578 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC4578).setVerticalScrollBarEnabled(r8);
                }
                this.f22977 = (InterfaceC4578) c9037.f22961.getCustomView();
                return;
            }
            KeyEvent.Callback callbackFindViewWithTag = c9037.f22961.getCustomView().findViewWithTag("ScrollController");
            if (callbackFindViewWithTag instanceof InterfaceC4578) {
                InterfaceC4578 interfaceC45782 = this.f22977;
                if (interfaceC45782 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC45782).setVerticalScrollBarEnabled(false);
                }
                this.f22977 = (InterfaceC4578) callbackFindViewWithTag;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m14292(Animation animation) {
        if (animation == null) {
            MaxRelativeLayout maxRelativeLayout = this.f22979;
            if (maxRelativeLayout.getAnimation() != null) {
                animation = maxRelativeLayout.getAnimation();
            }
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22985.f11936;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14293(View view) {
        C9037 c9037 = this.f22985;
        c9037.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c9037.m8617() == null || c9037.f11932) {
            return;
        }
        int i = 3;
        if (c9037.f22962 == null) {
            c9037.f22962 = new C9046(this, i);
        }
        C9046 c9046 = c9037.f22962;
        if (c9046 != null) {
            c9037.f11932 = true;
            if (c9046 == null) {
                c9037.f22962 = new C9046(this, i);
            }
            c9037.f22962.m14302(c9037);
            AbstractC4570.m8588(m14292(null), new RunnableC0909(this, 22));
        }
    }
}
