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
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3316 extends MultiAutoCompleteTextView implements InterfaceC7838, InterfaceC4608, InterfaceC7841 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int[] f5211 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3278 f5212;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final C3337 f5213;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6391
    public final C3307 f5214;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3316(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            c3278.m349();
        }
        C3337 c3337 = this.f5213;
        if (c3337 != null) {
            c3337.m410();
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5213.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5213.m6817();
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return this.f5214.m6762();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f5214.m6764(C3309.m378(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5213;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5213;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@InterfaceC4525 int i) {
        setDropDownBackgroundDrawable(C3323.m396(getContext(), i));
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        this.f5214.m6765(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@InterfaceC6490 KeyListener keyListener) {
        super.setKeyListener(this.f5214.m374(keyListener));
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.f5212;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.f5213.m6829(colorStateList);
        this.f5213.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5213.m6830(mode);
        this.f5213.m410();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3337 c3337 = this.f5213;
        if (c3337 != null) {
            c3337.m6823(context, i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m384(C3307 c3307) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3316(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18394);
    }

    public C3316(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        C7772.m3866(this, getContext());
        C7837 c7837M24869 = C7837.m24869(getContext(), attributeSet, f5211, i, 0);
        if (c7837M24869.m24896(0)) {
            setDropDownBackgroundDrawable(c7837M24869.m24875(0));
        }
        c7837M24869.m24899();
        C3278 c3278 = new C3278(this);
        this.f5212 = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.f5213 = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        C3307 c3307 = new C3307(this);
        this.f5214 = c3307;
        c3307.m6763(attributeSet, i);
        m384(c3307);
    }
}
