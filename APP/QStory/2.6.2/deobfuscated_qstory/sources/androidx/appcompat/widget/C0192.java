package androidx.appcompat.widget;

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
import androidx.appcompat.app.C0108;
import androidx.core.widget.ActionModeCallbackC2299;
import com.bumptech.glide.AbstractC3054;
import p251.AbstractC8174;
import p316.C8675;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0192 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f753 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0133 f755;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        AbstractC0141.m596(context);
        AbstractC0152.m606(getContext(), this);
        C0108 c0108M353 = C0108.m353(com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f753);
        if (((TypedArray) c0108M353.f320).hasValue(0)) {
            setDropDownBackgroundDrawable(c0108M353.m389(0));
        }
        c0108M353.m362();
        C0191 c0191 = new C0191(this);
        this.f756 = c0191;
        c0191.m665(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        C0212 c0212 = new C0212(this);
        this.f754 = c0212;
        c0212.m706(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        c0212.m709();
        C0133 c0133 = new C0133(this);
        this.f755 = c0133;
        c0133.mo530(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM558 = c0133.m558(keyListener);
        if (keyListenerM558 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM558);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            c0191.m677();
        }
        C0212 c0212 = this.f754;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2299 ? ((ActionModeCallbackC2299) customSelectionActionModeCallback).f6696 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            return c0191.m680();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f754.m708();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f754.m707();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C8675.m14348(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f755.m557(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            c0191.m663();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            c0191.m662(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f754;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f754;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8174.m13594(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC3054.m6607(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f755.m556(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f755.m558(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            c0191.m657(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f756;
        if (c0191 != null) {
            c0191.m660(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f754;
        c0212.m711(colorStateList);
        c0212.m709();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f754;
        c0212.m713(mode);
        c0212.m709();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f754;
        if (c0212 != null) {
            c0212.m712(context, i);
        }
    }
}
