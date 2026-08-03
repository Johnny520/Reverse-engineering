package p000a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.F0 */
/* JADX INFO: loaded from: classes.dex */
public class C0093F0 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f298d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0111G0 f299a;

    /* JADX INFO: renamed from: b */
    public final C0756p1 f300b;

    /* JADX INFO: renamed from: c */
    public final C0471a1 f301c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0093F0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0983R.attr.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0756p1 c0756p1 = this.f300b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f300b.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f300b.m1785e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0889w1.m2125L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f301c.m1148c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f300b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f300b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0889w1.m2115A(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) throws Throwable {
        this.f301c.m1149d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f301c.m1146a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f299a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f300b;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f300b;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0756p1 c0756p1 = this.f300b;
        if (c0756p1 != null) {
            c0756p1.m1787g(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093F0(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        C0542df.m1311a(this, getContext());
        C0751of c0751ofM1768e = C0751of.m1768e(getContext(), attributeSet, f298d, i);
        if (c0751ofM1768e.f2960b.hasValue(0)) {
            setDropDownBackgroundDrawable(c0751ofM1768e.m1770b(0));
        }
        c0751ofM1768e.m1773f();
        C0111G0 c0111g0 = new C0111G0(this);
        this.f299a = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0756p1 c0756p1 = new C0756p1(this);
        this.f300b = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        c0756p1.m1783b();
        C0471a1 c0471a1 = new C0471a1(this);
        this.f301c = c0471a1;
        c0471a1.m1147b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1146a = c0471a1.m1146a(keyListener);
        if (keyListenerM1146a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1146a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
