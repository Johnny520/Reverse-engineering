package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3306 extends EditText implements InterfaceC7838, InterfaceC6558, InterfaceC4608, InterfaceC7841 {

    @InterfaceC6391
    private final C3307 mAppCompatEmojiEditTextHelper;
    private final C3278 mBackgroundTintHelper;
    private final C7771 mDefaultOnReceiveContentListener;

    @InterfaceC6490
    private C0102 mSuperCaller;
    private final C3336 mTextClassifierHelper;
    private final C3337 mTextHelper;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۡۥ$ۥ */
    @InterfaceC7113(api = 26)
    public class C0102 {
        public C0102() {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public TextClassifier m372() {
            return C3306.super.getTextClassifier();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m373(TextClassifier textClassifier) {
            C3306.super.setTextClassifier(textClassifier);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3306(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    @InterfaceC8086
    @InterfaceC7113(26)
    private C0102 getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C0102();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    @InterfaceC6391
    @InterfaceC7113(api = 26)
    public TextClassifier getTextClassifier() {
        C3336 c3336;
        return (Build.VERSION.SDK_INT >= 28 || (c3336 = this.mTextClassifierHelper) == null) ? getSuperCaller().m372() : c3336.m406();
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
    @InterfaceC6490
    public InputConnection onCreateInputConnection(@InterfaceC6391 EditorInfo editorInfo) {
        String[] strArrM27364;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m6824(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM378 = C3309.m378(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM378 != null && Build.VERSION.SDK_INT <= 30 && (strArrM27364 = C8273.m27364(this)) != null) {
            C4597.m13661(editorInfo, strArrM27364);
            inputConnectionM378 = C5440.m16934(this, inputConnectionM378, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.m6764(inputConnectionM378, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C3322.m391(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // Yue.InterfaceC6558
    @InterfaceC6490
    public C4152 onReceiveContent(@InterfaceC6391 C4152 c4152) {
        return this.mDefaultOnReceiveContentListener.mo3019(this, c4152);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C3322.m392(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    @InterfaceC7113(api = 26)
    public void setTextClassifier(@InterfaceC6490 TextClassifier textClassifier) {
        C3336 c3336;
        if (Build.VERSION.SDK_INT >= 28 || (c3336 = this.mTextClassifierHelper) == null) {
            getSuperCaller().m373(textClassifier);
        } else {
            c3336.m407(textClassifier);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3306(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18473);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getText()Ljava/lang/CharSequence; */
    @Override // android.widget.EditText, android.widget.TextView
    @InterfaceC6490
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public C3306(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        C7772.m3866(this, getContext());
        C3278 c3278 = new C3278(this);
        this.mBackgroundTintHelper = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.mTextHelper = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        this.mTextClassifierHelper = new C3336(this);
        this.mDefaultOnReceiveContentListener = new C7771();
        C3307 c3307 = new C3307(this);
        this.mAppCompatEmojiEditTextHelper = c3307;
        c3307.m6763(attributeSet, i);
        initEmojiKeyListener(c3307);
    }
}
