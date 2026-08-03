package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3277 extends AutoCompleteTextView implements InterfaceC7838, InterfaceC4608, InterfaceC7841 {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};

    @InterfaceC6391
    private final C3307 mAppCompatEmojiEditTextHelper;
    private final C3278 mBackgroundTintHelper;
    private final C3337 mTextHelper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3277(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m349();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m410();
        }
    }

    @Override // android.widget.TextView
    @InterfaceC6490
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C7759.m24678(super.getCustomSelectionActionModeCallback());
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6817();
    }

    public void initEmojiKeyListener(C3307 c3307) {
        KeyListener keyListener = getKeyListener();
        if (c3307.m375(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM374 = c3307.m374(keyListener);
            if (keyListenerM374 == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM374);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m6762();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mAppCompatEmojiEditTextHelper.m6764(C3309.m378(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@InterfaceC6490 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C7759.m24679(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@InterfaceC4525 int i) {
        setDropDownBackgroundDrawable(C3323.m396(getContext(), i));
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m6765(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@InterfaceC6490 KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m374(keyListener));
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.mTextHelper.m6829(colorStateList);
        this.mTextHelper.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.mTextHelper.m6830(mode);
        this.mTextHelper.m410();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6823(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3277(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18394);
    }

    public C3277(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        C7772.m3866(this, getContext());
        C7837 c7837M24869 = C7837.m24869(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (c7837M24869.m24896(0)) {
            setDropDownBackgroundDrawable(c7837M24869.m24875(0));
        }
        c7837M24869.m24899();
        C3278 c3278 = new C3278(this);
        this.mBackgroundTintHelper = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.mTextHelper = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        C3307 c3307 = new C3307(this);
        this.mAppCompatEmojiEditTextHelper = c3307;
        c3307.m6763(attributeSet, i);
        initEmojiKeyListener(c3307);
    }
}
