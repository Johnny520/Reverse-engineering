package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Switch;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲁᛷᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2283 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final View f11227;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object f11228;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final TextView f11229;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final TextView f11230;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final View f11231;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final View f11232;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final Object f11233;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final View f11234;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final TextView f11235;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final View f11236;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final View f11237;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final View f11238;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final EditText f11239;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final View f11240;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final View f11241;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f11242;

    public C2283(C1188 c1188, View view) {
        this.f11233 = c1188;
        if (view == null) {
            return;
        }
        c1188.f413 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f11231 = dialogXBaseRelativeLayout;
        this.f11241 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f11235 = textView;
        this.f11228 = (InterfaceC2018) view.findViewById(R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        this.f11230 = textView2;
        this.f11238 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f11236 = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f11239 = (EditText) view.findViewById(R.id.txt_input);
        this.f11237 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f11229 = textView3;
        this.f11227 = view.findViewById(R.id.space_other_button);
        this.f11232 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f11240 = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f11234 = textView5;
        this.f11242 = AbstractC0041.m265(view);
        c1188.m279().setTranslationZ(0.0f);
        WeakReference weakReference = AbstractC1655.f8450;
        if (c1188.f5443 == null) {
            c1188.f5443 = null;
        }
        if (c1188.f5440 == null) {
            c1188.f5440 = null;
        }
        TextPaint paint = textView.getPaint();
        int i = 1;
        paint.setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m299(0.0f);
        dialogXBaseRelativeLayout.m294(c1188.f5446);
        dialogXBaseRelativeLayout.f420 = new C0599(i, this);
        dialogXBaseRelativeLayout.f430 = new C2014(7, this);
        textView5.setOnClickListener(new ViewOnClickListenerC1963(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC1963(this, i));
        textView3.setOnClickListener(new ViewOnClickListenerC1963(this, 2));
        c1188.f5436 = this;
        m4292();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4290(View view) {
        C1188 c1188 = (C1188) this.f11233;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c1188.m282() == null || c1188.f403) {
            return;
        }
        C2207 c2207 = c1188.f5450;
        int i = 1;
        if (c2207 == null) {
            c2207 = new C2207(i, this);
            c1188.f5450 = c2207;
        }
        c1188.f403 = true;
        if (c2207 == null) {
            c2207 = new C2207(i, this);
            c1188.f5450 = c2207;
        }
        c2207.m4195(c1188);
        AbstractC0041.m268(new RunnableC0871(12, this), m4291(null));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public long m4291(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f11241;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C1188) this.f11233).f411;
        return j != -1 ? j : duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v16 */
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
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4292() {
        int i;
        ?? r15;
        byte b;
        TextView textView = this.f11230;
        TextView textView2 = this.f11235;
        RelativeLayout relativeLayout = (RelativeLayout) this.f11236;
        TextView textView3 = this.f11229;
        TextView textView4 = (TextView) this.f11240;
        TextView textView5 = (TextView) this.f11234;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f11241;
        EditText editText = this.f11239;
        LinearLayout linearLayout = (LinearLayout) this.f11237;
        C1188 c1188 = (C1188) this.f11233;
        AbstractC0041 abstractC0041 = c1188.f5446;
        C0469 c0469 = c1188.f398;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f11231;
        if (dialogXBaseRelativeLayout == null || c1188.m282() == null) {
            return;
        }
        dialogXBaseRelativeLayout.f435 = c1188.f397;
        int[] iArr = c1188.f404;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int[] iArr2 = dialogXBaseRelativeLayout.f427;
        iArr2[0] = i2;
        iArr2[1] = i4;
        iArr2[2] = i5;
        iArr2[3] = i6;
        WeakReference weakReference = AbstractC1655.f8450;
        maxRelativeLayout.getClass();
        maxRelativeLayout.setMinimumWidth(0);
        maxRelativeLayout.setMinimumHeight(0);
        View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
        if (c1188.f5446 instanceof C2059) {
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setVisibility(0);
            }
            editText.setVisibility(0);
            if (editText != dialogXBaseRelativeLayout) {
                dialogXBaseRelativeLayout.f425 = new WeakReference(editText);
            }
        } else {
            if (editText != null) {
                c1188.m281(editText, false);
                editText.clearFocus();
            }
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setVisibility(8);
            }
            editText.setVisibility(8);
        }
        dialogXBaseRelativeLayout.setClickable(true);
        if (c1188.f5453 > -1.0f) {
            maxRelativeLayout.setOutlineProvider(new C1559(i3, this));
            maxRelativeLayout.setClipToOutline(true);
            ArrayList arrayList = (ArrayList) this.f11242;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C0188.m794();
                    return;
                }
            }
        }
        String str = c1188.f5451;
        if (str == null) {
            str = null;
        }
        AbstractC0041.m270(textView2, str);
        AbstractC0041.m270(textView, c1188.f5445);
        AbstractC0041.m270(textView5, c1188.f5447);
        AbstractC0041.m270(textView4, c1188.f5454);
        AbstractC0041.m270(textView3, c1188.f5437);
        editText.setText(c1188.f5435);
        editText.setHint(c1188.f5448);
        View view = this.f11227;
        if (view != null) {
            if (c1188.f5437 == null) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        AbstractC0041.m272(textView2, null);
        AbstractC0041.m272(textView, null);
        AbstractC0041.m272(textView5, null);
        AbstractC0041.m272(textView4, c1188.f5443);
        AbstractC0041.m272(textView3, null);
        if (linearLayout != null) {
            linearLayout.setVisibility(((textView4 == null || textView4.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0) && (textView5 == null || textView5.getVisibility() != 0)) ? 8 : 0);
        }
        C2789 c2789 = c1188.f5440;
        if (c2789 != null) {
            if (c2789.f13643 != -1) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(c1188.f5440.f13643)});
            }
            c1188.f5440.getClass();
            editText.setInputType(2);
            c1188.f5440.getClass();
            c1188.f5440.getClass();
        }
        AbstractC0041.m267(c1188.f5447);
        AbstractC0041.m267(c1188.f5454);
        AbstractC0041.m267(c1188.f5437);
        View view2 = this.f11232;
        if (view2 != null) {
            c1188.mo277();
            c0469.getClass();
            i = 0;
            view2.setBackgroundColor(c1188.m284(0));
        } else {
            i = 0;
        }
        linearLayout.setOrientation(i);
        c0469.getClass();
        c0469.getClass();
        linearLayout.removeAllViews();
        c0469.getClass();
        int i7 = 4;
        int i8 = 3;
        int i9 = 1;
        int[] iArr3 = {3, 4, 2, 1};
        int i10 = 0;
        while (i10 < i7) {
            int i11 = iArr3[i10];
            if (i11 == i9) {
                b = -1;
                linearLayout.addView(textView5);
                c0469.getClass();
                c0469.getClass();
                textView5.setBackgroundResource(c1188.mo277() ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night);
            } else if (i11 == 2) {
                b = -1;
                linearLayout.addView(textView4);
                c0469.getClass();
                c0469.getClass();
                textView4.setBackgroundResource(c1188.mo277() ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night);
            } else if (i11 != i8) {
                if (i11 == i7) {
                    int i12 = i9;
                    if (linearLayout.getChildCount() >= i12 && linearLayout.getChildAt(linearLayout.getChildCount() - i12).getVisibility() != 8) {
                        Context contextM282 = abstractC0041.f408;
                        if (contextM282 == null) {
                            contextM282 = c1188.m282();
                        }
                        Space space = new Space(contextM282);
                        b = -1;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.weight = 1.0f;
                        linearLayout.addView(space, layoutParams);
                    }
                } else if (i11 == 5 && linearLayout.getChildCount() >= i9 && linearLayout.getChildAt(linearLayout.getChildCount() - i9).getVisibility() != 8) {
                    Context contextM2822 = abstractC0041.f408;
                    if (contextM2822 == null) {
                        contextM2822 = c1188.m282();
                    }
                    View view3 = new View(contextM2822);
                    Resources resourcesM286 = c1188.m286();
                    c1188.mo277();
                    c0469.getClass();
                    view3.setBackgroundColor(resourcesM286.getColor(0));
                    c0469.getClass();
                    linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                }
                b = -1;
            } else {
                b = -1;
                linearLayout.addView(textView3);
                c0469.getClass();
                c0469.getClass();
                textView3.setBackgroundResource(c1188.mo277() ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night);
            }
            i10++;
            i7 = 4;
            i8 = 3;
            i9 = 1;
        }
        if (c1188.f5441) {
            if (c1188.mo957()) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC1963(this, 3));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
            r15 = 0;
        } else {
            r15 = 0;
            dialogXBaseRelativeLayout.setClickable(false);
        }
        AbstractC1865 abstractC1865 = c1188.f5438;
        if (abstractC1865 == null || abstractC1865.m3648() == null) {
            relativeLayout.setVisibility(8);
            return;
        }
        c1188.f5438.m3646(relativeLayout, abstractC0041);
        relativeLayout.setVisibility(r15);
        if (c1188.f5438.m3648() instanceof InterfaceC2018) {
            InterfaceC2018 interfaceC2018 = (InterfaceC2018) this.f11228;
            if (interfaceC2018 instanceof DialogScrollView) {
                ((DialogScrollView) interfaceC2018).setVerticalScrollBarEnabled(r15);
            }
            this.f11228 = (InterfaceC2018) c1188.f5438.m3648();
            return;
        }
        KeyEvent.Callback callbackFindViewWithTag = c1188.f5438.m3648().findViewWithTag("ScrollController");
        if (callbackFindViewWithTag instanceof InterfaceC2018) {
            InterfaceC2018 interfaceC20182 = (InterfaceC2018) this.f11228;
            if (interfaceC20182 instanceof DialogScrollView) {
                ((DialogScrollView) interfaceC20182).setVerticalScrollBarEnabled(false);
            }
            this.f11228 = (InterfaceC2018) callbackFindViewWithTag;
        }
    }

    public C2283(LinearLayout linearLayout, ImageView imageView, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, EditText editText, EditText editText2, EditText editText3, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, Switch r17) {
        this.f11242 = imageView;
        this.f11231 = button;
        this.f11241 = button2;
        this.f11235 = button3;
        this.f11228 = button4;
        this.f11230 = button5;
        this.f11238 = button6;
        this.f11236 = button7;
        this.f11237 = button8;
        this.f11239 = editText;
        this.f11229 = editText2;
        this.f11227 = editText3;
        this.f11232 = seekBar;
        this.f11240 = seekBar2;
        this.f11234 = seekBar3;
        this.f11233 = r17;
    }
}
