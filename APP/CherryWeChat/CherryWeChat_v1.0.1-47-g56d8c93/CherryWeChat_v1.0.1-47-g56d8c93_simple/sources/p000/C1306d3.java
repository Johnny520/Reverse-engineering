package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: loaded from: classes.dex */
public class C1306d3 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f4753d = null;

    /* JADX INFO: renamed from: a */
    public final C1349e3 f4754a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f4755b;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f4756c;

    static {
        f4753d = new int[]{R.attr.popupBackground};
    }

    public C1306d3(Context r5, AttributeSet r6) {
        AbstractC1533iB.m2903a(r5);
        super(r5, r6, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C2656w4 r52 = C2656w4.m5186A(getContext(), r6, f4753d, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r52.f9196b).hasValue(0) == false) goto L5;
        setDropDownBackgroundDrawable(r52.m5210q(0));
    L5:
        r52.m5195E();
        C1349e3 r53 = new C1349e3(this);
        this.f4754a = r53;
        r53.m2603d(r6, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        C2175l4 r54 = new C2175l4(this);
        this.f4755b = r54;
        r54.m4378f(r6, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        r54.m4375b();
        C0649P3 r55 = new C0649P3(this, 5);
        this.f4756c = r55;
        r55.mo1279J(r6, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        KeyListener r62 = getKeyListener();
        if ((r62 instanceof NumberKeyListener) == true) goto L12;
        boolean r0 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r56 = r55.m1273C(r62);
        if (r56 == r62) goto L13;
        super.setKeyListener(r56);
        super.setRawInputType(r3);
        super.setFocusable(r0);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L13:
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f4754a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f4755b;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f4754a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f4754a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4755b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4755b.m4377e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r0 = super.onCreateInputConnection(r3);
        AbstractC0828TB.m1654x(r3, r0, this);
        return this.f4756c.m1280K(r0, r3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f4754a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f4754a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f4755b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f4755b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
        setDropDownBackgroundDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.f4756c.m1288S(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.f4756c.m1273C(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f4754a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f4754a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f4755b;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f4755b;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2175l4 r0 = this.f4755b;
        if (r0 == null) goto L6;
        r0.m4379g(r2, r3);
        return;
    }
}
