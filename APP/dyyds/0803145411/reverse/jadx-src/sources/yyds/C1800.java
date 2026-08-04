package yyds;

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

/* JADX INFO: renamed from: yyds.ᛸᛶᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1800 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int[] f9068 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2133 f9069;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1231 f9070;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1495 f9071;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.autoCompleteTextViewStyle);
        AbstractC2790.m4904(context);
        AbstractC2251.m4251(getContext(), this);
        C0644 c0644M1535 = C0644.m1535(getContext(), attributeSet, f9068, com.p000ss.android.ugc.aweme.yyds.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0644M1535.f3099).hasValue(0)) {
            setDropDownBackgroundDrawable(c0644M1535.m1554(0));
        }
        c0644M1535.m1568();
        C1231 c1231 = new C1231(this);
        this.f9070 = c1231;
        c1231.m2518(attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.autoCompleteTextViewStyle);
        C1495 c1495 = new C1495(this);
        this.f9071 = c1495;
        c1495.m3012(attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.autoCompleteTextViewStyle);
        c1495.m3009();
        C2133 c2133 = new C2133(this, 5);
        this.f9069 = c2133;
        c2133.mo2582(attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM4048 = c2133.m4048(keyListener);
        if (keyListenerM4048 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM4048);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            c1231.m2510();
        }
        C1495 c1495 = this.f9071;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9071.m3013();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9071.m3007();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1544.m3194(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f9069.m4058(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f9071;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f9071;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC1367.m2767(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f9069.m4063(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9069.m4048(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f9070;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1495 c1495 = this.f9071;
        c1495.m3005(colorStateList);
        c1495.m3009();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1495 c1495 = this.f9071;
        c1495.m3006(mode);
        c1495.m3009();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1495 c1495 = this.f9071;
        if (c1495 != null) {
            c1495.m3010(context, i);
        }
    }
}
