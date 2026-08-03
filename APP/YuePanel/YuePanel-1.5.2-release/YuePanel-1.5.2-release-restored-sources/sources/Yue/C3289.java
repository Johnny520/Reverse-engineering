package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3289 extends CheckedTextView implements InterfaceC7839, InterfaceC7838, InterfaceC4608, InterfaceC7841 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3290 f5172;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final C3278 f5173;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C3337 f5174;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6391
    public C3308 f5175;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3289(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private C3308 getEmojiTextViewHelper() {
        if (this.f5175 == null) {
            this.f5175 = new C3308(this);
        }
        return this.f5175;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3337 c3337 = this.f5174;
        if (c3337 != null) {
            c3337.m410();
        }
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            c3278.m349();
        }
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            c3290.m358();
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
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7839
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCheckMarkTintList() {
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            return c3290.m359();
        }
        return null;
    }

    @Override // Yue.InterfaceC7839
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            return c3290.m6732();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5174.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5174.m6817();
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m377();
    }

    @Override // android.widget.TextView, android.view.View
    @InterfaceC6490
    public InputConnection onCreateInputConnection(@InterfaceC6391 EditorInfo editorInfo) {
        return C3309.m378(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m6767(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@InterfaceC6490 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            c3290.m6734();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5174;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5174;
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
        getEmojiTextViewHelper().m6768(z);
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.f5173;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7839
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            c3290.m6735(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7839
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3290 c3290 = this.f5172;
        if (c3290 != null) {
            c3290.m6736(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.f5174.m6829(colorStateList);
        this.f5174.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5174.m6830(mode);
        this.f5174.m410();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@InterfaceC6391 Context context, int i) {
        super.setTextAppearance(context, i);
        C3337 c3337 = this.f5174;
        if (c3337 != null) {
            c3337.m6823(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3289(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18424);
    }

    public C3289(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        C7772.m3866(this, getContext());
        C3337 c3337 = new C3337(this);
        this.f5174 = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        C3278 c3278 = new C3278(this);
        this.f5173 = c3278;
        c3278.m6725(attributeSet, i);
        C3290 c3290 = new C3290(this);
        this.f5172 = c3290;
        c3290.m6733(attributeSet, i);
        getEmojiTextViewHelper().m6766(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@InterfaceC4525 int i) {
        setCheckMarkDrawable(C3323.m396(getContext(), i));
    }
}
