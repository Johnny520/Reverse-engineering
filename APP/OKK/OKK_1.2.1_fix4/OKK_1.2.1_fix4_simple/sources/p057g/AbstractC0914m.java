package p057g;

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
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p001A0.AbstractC0040p;
import p017J.ActionModeCallbackC0229r;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: g.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f3234d = null;

    /* JADX INFO: renamed from: a */
    public final C0916n f3235a;

    /* JADX INFO: renamed from: b */
    public final C0860G f3236b;

    /* JADX INFO: renamed from: c */
    public final C0002c f3237c;

    static {
        f3234d = new int[]{R.attr.popupBackground};
    }

    public AbstractC0914m(Context r5, AttributeSet r6) {
        AbstractC0851B0.m2165a(r5);
        super(r5, r6, C1031R.attr.autoCompleteTextViewStyle);
        AbstractC0849A0.m2159a(this, getContext());
        C0234d r52 = C0234d.m638s(getContext(), r6, f3234d, C1031R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) r52.f475c).hasValue(0) == false) goto L5;
        setDropDownBackgroundDrawable(r52.m646i(0));
    L5:
        r52.m657u();
        C0916n r53 = new C0916n(this);
        this.f3235a = r53;
        r53.m2243d(r6, C1031R.attr.autoCompleteTextViewStyle);
        C0860G r54 = new C0860G(this);
        this.f3236b = r54;
        r54.m2177d(r6, C1031R.attr.autoCompleteTextViewStyle);
        r54.m2176b();
        C0002c r55 = new C0002c(this, 8);
        this.f3237c = r55;
        r55.m5f(r6, C1031R.attr.autoCompleteTextViewStyle);
        KeyListener r62 = getKeyListener();
        if ((!(r62 instanceof NumberKeyListener)) == false) goto L12;
        boolean r02 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r56 = r55.m3d(r62);
        if (r56 == r62) goto L13;
        super.setKeyListener(r56);
        super.setRawInputType(r3);
        super.setFocusable(r02);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L13:
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3235a;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0860G r03 = this.f3236b;
        if (r03 == null) goto L9;
        r03.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r02 = super.getCustomSelectionActionModeCallback();
        if ((r02 instanceof ActionModeCallbackC0229r) == true) goto L5;
        return r02;
    L5:
        return ((ActionModeCallbackC0229r) r02).f465a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3235a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3235a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 r02 = this.f3236b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 r02 = this.f3236b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r02 = super.onCreateInputConnection(r3);
        AbstractC0805P.m2036L(r02, r3, this);
        return this.f3237c.m7h(r02, r3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3235a;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3235a;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C0860G r12 = this.f3236b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C0860G r12 = this.f3236b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(r1, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
        setDropDownBackgroundDrawable(AbstractC0358S.m916w(getContext(), r2));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.f3237c.m14o(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.f3237c.m3d(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3235a;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3235a;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C0860G r02 = this.f3236b;
        r02.m2182j(r2);
        r02.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C0860G r02 = this.f3236b;
        r02.m2183k(r2);
        r02.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C0860G r02 = this.f3236b;
        if (r02 == null) goto L6;
        r02.m2178e(r2, r3);
        return;
    }
}
