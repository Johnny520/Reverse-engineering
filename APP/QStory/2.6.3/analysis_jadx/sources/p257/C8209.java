package p257;

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
import androidx.appcompat.app.RunnableC0062;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3746;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p230.C8049;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f22631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC3746 f22632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TextView f22633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MaxRelativeLayout f22634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22636;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final TextView f22637;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View f22638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final TextView f22639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8208 f22640;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RelativeLayout f22641;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewGroup f22642;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final TextView f22643;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final View f22644;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final EditText f22645;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinearLayout f22646;

    public C8209(C8208 c8208, View view) {
        this.f22640 = c8208;
        if (view == null) {
            return;
        }
        c8208.m8047(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22635 = dialogXBaseRelativeLayout;
        this.f22634 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f22633 = textView;
        this.f22632 = (InterfaceC3746) view.findViewById(R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        this.f22631 = textView2;
        this.f22642 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f22641 = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f22645 = (EditText) view.findViewById(R.id.txt_input);
        this.f22646 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f22643 = textView3;
        this.f22644 = view.findViewById(R.id.space_other_button);
        this.f22638 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f22637 = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f22639 = textView5;
        this.f22636 = AbstractC3738.m8039(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8208.m8055().setTranslationZ(0.0f);
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        if (c8208.f22624 == null) {
            c8208.f22624 = null;
        }
        if (c8208.f22624 == null) {
            c8208.f22624 = null;
        }
        textView.getPaint().setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m8074(0.0f);
        dialogXBaseRelativeLayout.m8073(c8208.f22615);
        dialogXBaseRelativeLayout.f11636 = new C8236(this, 3);
        dialogXBaseRelativeLayout.f11637 = new C8049(this, 6);
        textView5.setOnClickListener(new ViewOnClickListenerC8226(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC8226(this, 1));
        textView3.setOnClickListener(new ViewOnClickListenerC8226(this, 2));
        c8208.f22620 = this;
        m13732();
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
    public final void m13732() {
        ?? r8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22635;
        if (dialogXBaseRelativeLayout != null) {
            C8208 c8208 = this.f22640;
            Activity activityM8058 = c8208.m8058();
            AbstractC3738 abstractC3738 = c8208.f22615;
            AbstractC4922 abstractC4922 = c8208.f11583;
            if (activityM8058 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f11639 = c8208.f11594;
            int[] iArr = c8208.f11588;
            int i = 1;
            int i2 = 2;
            dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
            AbstractC4922 abstractC49222 = AbstractC8248.f22823;
            MaxRelativeLayout maxRelativeLayout = this.f22634;
            maxRelativeLayout.m8075(0);
            int i3 = c8208.f11590;
            if (i3 == 0) {
                i3 = 0;
            }
            maxRelativeLayout.m8076(i3);
            maxRelativeLayout.setMinimumWidth(0);
            int i4 = c8208.f11589;
            if (i4 == 0) {
                i4 = 0;
            }
            maxRelativeLayout.setMinimumHeight(i4);
            View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
            boolean z = abstractC3738 instanceof C8228;
            EditText editText = this.f22645;
            if (z) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                editText.setVisibility(0);
                if (editText != dialogXBaseRelativeLayout) {
                    dialogXBaseRelativeLayout.f11626 = new WeakReference(editText);
                }
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                editText.setVisibility(8);
            }
            dialogXBaseRelativeLayout.setClickable(true);
            if (c8208.f22628 > -1.0f) {
                maxRelativeLayout.setOutlineProvider(new C8220(this, i2));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f22636;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C2942.m6394();
                        return;
                    }
                }
            }
            CharSequence charSequence = c8208.f22614;
            if (charSequence == null) {
                charSequence = null;
            }
            TextView textView = this.f22633;
            AbstractC3738.m8024(textView, charSequence);
            CharSequence charSequence2 = c8208.f22626;
            TextView textView2 = this.f22631;
            AbstractC3738.m8024(textView2, charSequence2);
            String str = c8208.f22625;
            TextView textView3 = this.f22639;
            AbstractC3738.m8024(textView3, str);
            String str2 = c8208.f22629;
            TextView textView4 = this.f22637;
            AbstractC3738.m8024(textView4, str2);
            String str3 = c8208.f22630;
            TextView textView5 = this.f22643;
            AbstractC3738.m8024(textView5, str3);
            editText.setText(c8208.f22627);
            editText.setHint((CharSequence) null);
            View view = this.f22644;
            if (view != null) {
                if (c8208.f22630 == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            AbstractC3738.m8023(textView, null);
            AbstractC3738.m8023(textView2, null);
            AbstractC3738.m8023(textView3, c8208.f22624);
            AbstractC3738.m8023(textView4, null);
            AbstractC3738.m8023(textView5, null);
            LinearLayout linearLayout = this.f22646;
            if (linearLayout != null) {
                linearLayout.setVisibility(((textView4 == null || textView4.getVisibility() != 0) && (textView5 == null || textView5.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0)) ? 8 : 0);
            }
            AbstractC3738.m8027(c8208.f22625);
            AbstractC3738.m8027(c8208.f22629);
            AbstractC3738.m8027(c8208.f22630);
            View view2 = this.f22638;
            if (view2 != null) {
                c8208.mo8044();
                abstractC4922.getClass();
                view2.setBackgroundColor(c8208.m8060(0));
            }
            linearLayout.setOrientation(0);
            abstractC4922.mo9899();
            if (abstractC4922.mo9899().length != 0) {
                linearLayout.removeAllViews();
                int[] iArrMo9899 = abstractC4922.mo9899();
                int length = iArrMo9899.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = iArrMo9899[i5];
                    if (i6 == i) {
                        linearLayout.addView(textView3);
                        abstractC4922.mo9901();
                        textView3.setBackgroundResource(abstractC4922.mo9901().mo6843(c8208.mo8044()));
                    } else if (i6 == 2) {
                        linearLayout.addView(textView4);
                        abstractC4922.mo9901();
                        textView4.setBackgroundResource(abstractC4922.mo9901().mo6844(c8208.mo8044()));
                    } else if (i6 == 3) {
                        linearLayout.addView(textView5);
                        abstractC4922.mo9901();
                        textView5.setBackgroundResource(abstractC4922.mo9901().mo6842(c8208.mo8044()));
                    } else if (i6 != 4) {
                        if (i6 == 5 && linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                            View view3 = new View(c8208.m8058());
                            Resources resourcesM8056 = c8208.m8056();
                            c8208.mo8044();
                            abstractC4922.getClass();
                            view3.setBackgroundColor(resourcesM8056.getColor(0));
                            abstractC4922.getClass();
                            linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                        }
                    } else if (linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                        Space space = new Space(c8208.m8058());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.weight = 1.0f;
                        linearLayout.addView(space, layoutParams);
                    }
                    i5++;
                    i = 1;
                }
            }
            if (c8208.f22619) {
                if (c8208.mo13725()) {
                    dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC8226(this, 3));
                } else {
                    dialogXBaseRelativeLayout.setOnClickListener(null);
                }
                r8 = 0;
            } else {
                r8 = 0;
                dialogXBaseRelativeLayout.setClickable(false);
            }
            AbstractC3749 abstractC3749 = c8208.f22616;
            RelativeLayout relativeLayout = this.f22641;
            if (abstractC3749 == null || abstractC3749.getCustomView() == null) {
                relativeLayout.setVisibility(8);
                return;
            }
            c8208.f22616.bindParent(relativeLayout, abstractC3738);
            relativeLayout.setVisibility(r8);
            if (c8208.f22616.getCustomView() instanceof InterfaceC3746) {
                InterfaceC3746 interfaceC3746 = this.f22632;
                if (interfaceC3746 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC3746).setVerticalScrollBarEnabled(r8);
                }
                this.f22632 = (InterfaceC3746) c8208.f22616.getCustomView();
                return;
            }
            KeyEvent.Callback callbackFindViewWithTag = c8208.f22616.getCustomView().findViewWithTag("ScrollController");
            if (callbackFindViewWithTag instanceof InterfaceC3746) {
                InterfaceC3746 interfaceC37462 = this.f22632;
                if (interfaceC37462 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC37462).setVerticalScrollBarEnabled(false);
                }
                this.f22632 = (InterfaceC3746) callbackFindViewWithTag;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m13733(Animation animation) {
        if (animation == null) {
            MaxRelativeLayout maxRelativeLayout = this.f22634;
            if (maxRelativeLayout.getAnimation() != null) {
                animation = maxRelativeLayout.getAnimation();
            }
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22640.f11591;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13734(View view) {
        C8208 c8208 = this.f22640;
        c8208.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8208.m8058() == null || c8208.f11587) {
            return;
        }
        int i = 3;
        if (c8208.f22617 == null) {
            c8208.f22617 = new C8217(this, i);
        }
        C8217 c8217 = c8208.f22617;
        if (c8217 != null) {
            c8208.f11587 = true;
            if (c8217 == null) {
                c8208.f22617 = new C8217(this, i);
            }
            c8208.f22617.m13743(c8208);
            AbstractC3738.m8029(m13733(null), new RunnableC0062(this, 22));
        }
    }
}
