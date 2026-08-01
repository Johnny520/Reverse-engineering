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
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p033.AbstractC6325;
import p230.C8048;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TextView f22632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC3745 f22633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TextView f22634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MaxRelativeLayout f22635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22637;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final TextView f22638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View f22639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final TextView f22640;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8207 f22641;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RelativeLayout f22642;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewGroup f22643;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final TextView f22644;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final View f22645;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final EditText f22646;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinearLayout f22647;

    public C8208(C8207 c8207, View view) {
        this.f22641 = c8207;
        if (view == null) {
            return;
        }
        c8207.m8060(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22636 = dialogXBaseRelativeLayout;
        this.f22635 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f22634 = textView;
        this.f22633 = (InterfaceC3745) view.findViewById(R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        this.f22632 = textView2;
        this.f22643 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f22642 = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f22646 = (EditText) view.findViewById(R.id.txt_input);
        this.f22647 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f22644 = textView3;
        this.f22645 = view.findViewById(R.id.space_other_button);
        this.f22639 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f22638 = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f22640 = textView5;
        this.f22637 = AbstractC3737.m8052(view);
        BaseDialog$BUTTON_SELECT_RESULT baseDialog$BUTTON_SELECT_RESULT = BaseDialog$BUTTON_SELECT_RESULT.NONE;
        c8207.m8068().setTranslationZ(0.0f);
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        if (c8207.f22625 == null) {
            c8207.f22625 = null;
        }
        if (c8207.f22625 == null) {
            c8207.f22625 = null;
        }
        textView.getPaint().setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m8087(0.0f);
        dialogXBaseRelativeLayout.m8086(c8207.f22616);
        dialogXBaseRelativeLayout.f11631 = new C8235(this, 3);
        dialogXBaseRelativeLayout.f11632 = new C8048(this, 6);
        textView5.setOnClickListener(new ViewOnClickListenerC8225(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC8225(this, 1));
        textView3.setOnClickListener(new ViewOnClickListenerC8225(this, 2));
        c8207.f22621 = this;
        m13715();
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
    public final void m13715() {
        ?? r8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22636;
        if (dialogXBaseRelativeLayout != null) {
            C8207 c8207 = this.f22641;
            Activity activityM8071 = c8207.m8071();
            AbstractC3737 abstractC3737 = c8207.f22616;
            AbstractC6325 abstractC6325 = c8207.f11578;
            if (activityM8071 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f11634 = c8207.f11589;
            int[] iArr = c8207.f11583;
            int i = 1;
            int i2 = 2;
            dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
            AbstractC6325 abstractC63252 = AbstractC8247.f22824;
            MaxRelativeLayout maxRelativeLayout = this.f22635;
            maxRelativeLayout.m8088(0);
            int i3 = c8207.f11585;
            if (i3 == 0) {
                i3 = 0;
            }
            maxRelativeLayout.m8089(i3);
            maxRelativeLayout.setMinimumWidth(0);
            int i4 = c8207.f11584;
            if (i4 == 0) {
                i4 = 0;
            }
            maxRelativeLayout.setMinimumHeight(i4);
            View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
            boolean z = abstractC3737 instanceof C8227;
            EditText editText = this.f22646;
            if (z) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                editText.setVisibility(0);
                if (editText != dialogXBaseRelativeLayout) {
                    dialogXBaseRelativeLayout.f11621 = new WeakReference(editText);
                }
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                editText.setVisibility(8);
            }
            dialogXBaseRelativeLayout.setClickable(true);
            if (c8207.f22629 > -1.0f) {
                maxRelativeLayout.setOutlineProvider(new C8219(this, i2));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f22637;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C2941.m6336();
                        return;
                    }
                }
            }
            CharSequence charSequence = c8207.f22615;
            if (charSequence == null) {
                charSequence = null;
            }
            TextView textView = this.f22634;
            AbstractC3737.m8037(textView, charSequence);
            CharSequence charSequence2 = c8207.f22627;
            TextView textView2 = this.f22632;
            AbstractC3737.m8037(textView2, charSequence2);
            String str = c8207.f22626;
            TextView textView3 = this.f22640;
            AbstractC3737.m8037(textView3, str);
            String str2 = c8207.f22630;
            TextView textView4 = this.f22638;
            AbstractC3737.m8037(textView4, str2);
            String str3 = c8207.f22631;
            TextView textView5 = this.f22644;
            AbstractC3737.m8037(textView5, str3);
            editText.setText(c8207.f22628);
            editText.setHint((CharSequence) null);
            View view = this.f22645;
            if (view != null) {
                if (c8207.f22631 == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            AbstractC3737.m8036(textView, null);
            AbstractC3737.m8036(textView2, null);
            AbstractC3737.m8036(textView3, c8207.f22625);
            AbstractC3737.m8036(textView4, null);
            AbstractC3737.m8036(textView5, null);
            LinearLayout linearLayout = this.f22647;
            if (linearLayout != null) {
                linearLayout.setVisibility(((textView4 == null || textView4.getVisibility() != 0) && (textView5 == null || textView5.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0)) ? 8 : 0);
            }
            AbstractC3737.m8040(c8207.f22626);
            AbstractC3737.m8040(c8207.f22630);
            AbstractC3737.m8040(c8207.f22631);
            View view2 = this.f22639;
            if (view2 != null) {
                c8207.mo8057();
                abstractC6325.getClass();
                view2.setBackgroundColor(c8207.m8073(0));
            }
            linearLayout.setOrientation(0);
            abstractC6325.mo11880();
            if (abstractC6325.mo11880().length != 0) {
                linearLayout.removeAllViews();
                int[] iArrMo11880 = abstractC6325.mo11880();
                int length = iArrMo11880.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = iArrMo11880[i5];
                    if (i6 == i) {
                        linearLayout.addView(textView3);
                        abstractC6325.mo11876();
                        textView3.setBackgroundResource(abstractC6325.mo11876().mo10052(c8207.mo8057()));
                    } else if (i6 == 2) {
                        linearLayout.addView(textView4);
                        abstractC6325.mo11876();
                        textView4.setBackgroundResource(abstractC6325.mo11876().mo10053(c8207.mo8057()));
                    } else if (i6 == 3) {
                        linearLayout.addView(textView5);
                        abstractC6325.mo11876();
                        textView5.setBackgroundResource(abstractC6325.mo11876().mo10054(c8207.mo8057()));
                    } else if (i6 != 4) {
                        if (i6 == 5 && linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                            View view3 = new View(c8207.m8071());
                            Resources resourcesM8069 = c8207.m8069();
                            c8207.mo8057();
                            abstractC6325.getClass();
                            view3.setBackgroundColor(resourcesM8069.getColor(0));
                            abstractC6325.getClass();
                            linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                        }
                    } else if (linearLayout.getChildCount() >= i && linearLayout.getChildAt(linearLayout.getChildCount() - i).getVisibility() != 8) {
                        Space space = new Space(c8207.m8071());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.weight = 1.0f;
                        linearLayout.addView(space, layoutParams);
                    }
                    i5++;
                    i = 1;
                }
            }
            if (c8207.f22620) {
                if (c8207.mo13708()) {
                    dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC8225(this, 3));
                } else {
                    dialogXBaseRelativeLayout.setOnClickListener(null);
                }
                r8 = 0;
            } else {
                r8 = 0;
                dialogXBaseRelativeLayout.setClickable(false);
            }
            AbstractC3748 abstractC3748 = c8207.f22617;
            RelativeLayout relativeLayout = this.f22642;
            if (abstractC3748 == null || abstractC3748.getCustomView() == null) {
                relativeLayout.setVisibility(8);
                return;
            }
            c8207.f22617.bindParent(relativeLayout, abstractC3737);
            relativeLayout.setVisibility(r8);
            if (c8207.f22617.getCustomView() instanceof InterfaceC3745) {
                InterfaceC3745 interfaceC3745 = this.f22633;
                if (interfaceC3745 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC3745).setVerticalScrollBarEnabled(r8);
                }
                this.f22633 = (InterfaceC3745) c8207.f22617.getCustomView();
                return;
            }
            KeyEvent.Callback callbackFindViewWithTag = c8207.f22617.getCustomView().findViewWithTag("ScrollController");
            if (callbackFindViewWithTag instanceof InterfaceC3745) {
                InterfaceC3745 interfaceC37452 = this.f22633;
                if (interfaceC37452 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC37452).setVerticalScrollBarEnabled(false);
                }
                this.f22633 = (InterfaceC3745) callbackFindViewWithTag;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m13716(Animation animation) {
        if (animation == null) {
            MaxRelativeLayout maxRelativeLayout = this.f22635;
            if (maxRelativeLayout.getAnimation() != null) {
                animation = maxRelativeLayout.getAnimation();
            }
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22641.f11586;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13717(View view) {
        C8207 c8207 = this.f22641;
        c8207.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8207.m8071() == null || c8207.f11582) {
            return;
        }
        int i = 3;
        if (c8207.f22618 == null) {
            c8207.f22618 = new C8216(this, i);
        }
        C8216 c8216 = c8207.f22618;
        if (c8216 != null) {
            c8207.f11582 = true;
            if (c8216 == null) {
                c8207.f22618 = new C8216(this, i);
            }
            c8207.f22618.m13726(c8207);
            AbstractC3737.m8042(m13716(null), new RunnableC0062(this, 22));
        }
    }
}
