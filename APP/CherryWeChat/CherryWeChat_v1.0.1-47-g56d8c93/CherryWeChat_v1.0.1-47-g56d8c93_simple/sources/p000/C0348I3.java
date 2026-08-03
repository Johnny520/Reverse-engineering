package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: I3 */
/* JADX INFO: loaded from: classes.dex */
public class C0348I3 extends EditText implements InterfaceC2472rt {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f1165a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f1166b;

    /* JADX INFO: renamed from: c */
    public final C2791zA f1167c;

    /* JADX INFO: renamed from: d */
    public final C0649P3 f1168d;

    /* JADX INFO: renamed from: e */
    public C0305H3 f1169e;

    public C0348I3(Context r5, AttributeSet r6) {
        AbstractC1533iB.m2903a(r5);
        super(r5, r6, R.attr.editTextStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 r52 = new C1349e3(this);
        this.f1165a = r52;
        r52.m2603d(r6, R.attr.editTextStyle);
        C2175l4 r53 = new C2175l4(this);
        this.f1166b = r53;
        r53.m4378f(r6, R.attr.editTextStyle);
        r53.m4375b();
        this.f1167c = new C2791zA();
        C0649P3 r54 = new C0649P3(this, 5);
        this.f1168d = r54;
        r54.mo1279J(r6, R.attr.editTextStyle);
        KeyListener r62 = getKeyListener();
        if ((r62 instanceof NumberKeyListener) == true) goto L9;
        boolean r0 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r55 = r54.m1273C(r62);
        if (r55 == r62) goto L10;
        super.setKeyListener(r55);
        super.setRawInputType(r3);
        super.setFocusable(r0);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L10:
        return;
    }

    private C0305H3 getSuperCaller() {
        if (this.f1169e != null) goto L6;
        this.f1169e = new C0305H3(this);
    L6:
        return this.f1169e;
    }

    @Override // p000.InterfaceC2472rt
    /* JADX INFO: renamed from: a */
    public final C2798zb mo751a(C2798zb r2) {
        this.f1167c.getClass();
        return C2791zA.m5360a(this, r2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f1165a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f1166b;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f1165a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f1165a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1166b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1166b.m4377e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r4) {
        InputConnection r0 = super.onCreateInputConnection(r4);
        this.f1166b.getClass();
        C2175l4.m4373h(r4, r0, this);
        AbstractC0828TB.m1654x(r4, r0, this);
        if (r0 == null) goto L10;
        if (Build.VERSION.SDK_INT > 30) goto L10;
        String[] r1 = AbstractC2185lE.m4392e(this);
        if (r1 == null) goto L10;
        r4.contentMimeTypes = r1;
        r0 = new C2507sl(r0, new C2464rl(0, this));
    L10:
        return this.f1168d.m1280K(r0, r4);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L5;
        return;
    L5:
        if (r0 >= 33) goto L9;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent r6) {
        boolean r3 = false;
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L25:
        if (r3 == false) goto L28;
        return true;
    L28:
        return super.onDragEvent(r6);
    L5:
        if (r6.getLocalState() != null) goto L25;
        if (AbstractC2185lE.m4392e(this) == null) goto L25;
        Context r0 = getContext();
    L11:
        if ((r0 instanceof ContextWrapper) == false) goto L16;
        if ((r0 instanceof Activity) == true) goto L14;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L11
    L14:
        Activity r02 = (Activity) r0;
    L17:
        if (r02 != null) goto L20;
        toString();
        goto L25
    L20:
        if (r6.getAction() == 1) goto L25;
        if (r6.getAction() != 3) goto L25;
        r3 = AbstractC0777S3.m1599a(r6, this, r02);
        goto L25
    L16:
        r02 = null;
        goto L17
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 31) goto L28;
        if (AbstractC2185lE.m4392e(this) == null) goto L28;
        if (r7 != 16908322) goto L9;
    L11:
        ClipboardManager r3 = (ClipboardManager) getContext().getSystemService("clipboard");
        if (r3 != null) goto L14;
        ClipData r32 = null;
    L16:
        if (r32 != null) goto L18;
    L26:
        return true;
    L18:
        if (r32.getItemCount() <= 0) goto L26;
        if (r0 < 31) goto L21;
        InterfaceC2669wb r02 = new C0132D2(r32, 1);
    L22:
        if (r7 != 16908322) goto L24;
        int r72 = 0;
    L25:
        r02.mo245t(r72);
        AbstractC2185lE.m4395h(this, r02.build());
        goto L26
    L24:
        r72 = 1;
        goto L25
    L21:
        C2712xb r03 = new C2712xb();
        r03.f9286b = r32;
        r03.f9287c = 1;
        r02 = r03;
        goto L22
    L14:
        r32 = r3.getPrimaryClip();
        goto L16
    L9:
        if (r7 == 16908337) goto L11;
    L28:
        return super.onTextContextMenuItem(r7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f1165a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f1165a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f1166b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f1166b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.f1168d.m1288S(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.f1168d.m1273C(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f1165a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f1165a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f1166b;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f1166b;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2175l4 r0 = this.f1166b;
        if (r0 == null) goto L6;
        r0.m4379g(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r2) {
        super.setTextClassifier(r2);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
