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
import com.abc.core.runtime.AbstractC0805P;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p001A0.AbstractC0040p;
import p017J.ActionModeCallbackC0229r;
import p018J0.C0234d;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: g.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f3234d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0916n f3235a;

    /* JADX INFO: renamed from: b */
    public final C0860G f3236b;

    /* JADX INFO: renamed from: c */
    public final C0002c f3237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0914m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.autoCompleteTextViewStyle);
        AbstractC0851B0.m2165a(context);
        AbstractC0849A0.m2159a(this, getContext());
        C0234d c0234dM638s = C0234d.m638s(getContext(), attributeSet, f3234d, C1031R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) c0234dM638s.f475c).hasValue(0)) {
            setDropDownBackgroundDrawable(c0234dM638s.m646i(0));
        }
        c0234dM638s.m657u();
        C0916n c0916n = new C0916n(this);
        this.f3235a = c0916n;
        c0916n.m2243d(attributeSet, C1031R.attr.autoCompleteTextViewStyle);
        C0860G c0860g = new C0860G(this);
        this.f3236b = c0860g;
        c0860g.m2177d(attributeSet, C1031R.attr.autoCompleteTextViewStyle);
        c0860g.m2176b();
        C0002c c0002c = new C0002c(this, 8);
        this.f3237c = c0002c;
        c0002c.m5f(attributeSet, C1031R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM3d = c0002c.m3d(keyListener);
            if (keyListenerM3d == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM3d);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0860G c0860g = this.f3236b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC0229r ? ((ActionModeCallbackC0229r) customSelectionActionModeCallback).f465a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 c0853c0 = this.f3236b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 c0853c0 = this.f3236b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0805P.m2036L(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f3237c.m7h(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3236b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3236b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3237c.m14o(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3237c.m3d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3235a;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0860G c0860g = this.f3236b;
        c0860g.m2182j(colorStateList);
        c0860g.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0860G c0860g = this.f3236b;
        c0860g.m2183k(mode);
        c0860g.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0860G c0860g = this.f3236b;
        if (c0860g != null) {
            c0860g.m2178e(context, i2);
        }
    }
}
