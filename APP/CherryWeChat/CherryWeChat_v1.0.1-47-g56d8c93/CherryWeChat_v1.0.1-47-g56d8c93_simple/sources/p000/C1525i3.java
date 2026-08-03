package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1525i3 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C2082j3 f5393a;

    /* JADX INFO: renamed from: b */
    public final C1349e3 f5394b;

    /* JADX INFO: renamed from: c */
    public final C2175l4 f5395c;

    /* JADX INFO: renamed from: d */
    public C0391J3 f5396d;

    public C1525i3(Context r8, AttributeSet r9) {
        AbstractC1533iB.m2903a(r8);
        super(r8, r9, R.attr.checkedTextViewStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C2175l4 r82 = new C2175l4(this);
        this.f5395c = r82;
        r82.m4378f(r9, R.attr.checkedTextViewStyle);
        r82.m4375b();
        C1349e3 r83 = new C1349e3(this);
        this.f5394b = r83;
        r83.m2603d(r9, R.attr.checkedTextViewStyle);
        this.f5393a = new C2082j3(this);
        Context r84 = getContext();
        int[] r3 = AbstractC0982Wu.f3077l;
        C2656w4 r85 = C2656w4.m5186A(r84, r9, r3, R.attr.checkedTextViewStyle);
        TypedArray r0 = (TypedArray) r85.f9196b;
        AbstractC2185lE.m4398k(this, getContext(), r3, r9, (TypedArray) r85.f9196b, R.attr.checkedTextViewStyle);
    L9:
        th = move-exception;
        r85.m5195E();
        throw th;
    L4:
        if (r0.hasValue(1) == false) goto L12;
        int r92 = r0.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r92 == 0) goto L12;
        setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), r92));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r0.hasValue(2) == false) goto L20;
        setCheckMarkTintList(r85.m5209p(2));     // Catch: Throwable -> L9
    L20:
        if (r0.hasValue(3) == false) goto L22;
        setCheckMarkTintMode(AbstractC0107Ce.m161c(r0.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r85.m5195E();
        getEmojiTextViewHelper().m829b(r9, R.attr.checkedTextViewStyle);
        return;
    L12:
        if (r0.hasValue(0) == false) goto L17;
        int r93 = r0.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r93 == 0) goto L17;
        setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), r93));     // Catch: Throwable -> L9
        goto L17
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f5396d != null) goto L6;
        this.f5396d = new C0391J3(this);
    L6:
        return this.f5396d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2175l4 r0 = this.f5395c;
        if (r0 == null) goto L5;
        r0.m4375b();
    L5:
        C1349e3 r02 = this.f5394b;
        if (r02 == null) goto L8;
        r02.m2600a();
    L8:
        C2082j3 r03 = this.f5393a;
        if (r03 == null) goto L12;
        r03.m4247b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f5394b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f5394b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2082j3 r0 = this.f5393a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7338a;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2082j3 r0 = this.f5393a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7339b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5395c.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5395c.m4377e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r2) {
        InputConnection r0 = super.onCreateInputConnection(r2);
        AbstractC0828TB.m1654x(r2, r0, this);
        return r0;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f5394b;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f5394b;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable r2) {
        super.setCheckMarkDrawable(r2);
        C2082j3 r22 = this.f5393a;
        if (r22 != null) goto L5;
        return;
    L5:
        if (r22.f7342e == false) goto L8;
        r22.f7342e = false;
        return;
    L8:
        r22.f7342e = true;
        r22.m4247b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f5395c;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f5395c;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().m831d(r2);
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f5394b;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f5394b;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCheckMarkTintList(ColorStateList r2) {
        C2082j3 r0 = this.f5393a;
        if (r0 == null) goto L6;
        r0.f7338a = r2;
        r0.f7340c = true;
        r0.m4247b();
        return;
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode r2) {
        C2082j3 r0 = this.f5393a;
        if (r0 == null) goto L6;
        r0.f7339b = r2;
        r0.f7341d = true;
        r0.m4247b();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f5395c;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f5395c;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2175l4 r0 = this.f5395c;
        if (r0 == null) goto L6;
        r0.m4379g(r2, r3);
        return;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
        setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }
}
