package p000a;

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
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0183K0 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C0201L0 f629a;

    /* JADX INFO: renamed from: b */
    public final C0111G0 f630b;

    /* JADX INFO: renamed from: c */
    public final C0756p1 f631c;

    /* JADX INFO: renamed from: d */
    public C0490b1 f632d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0183K0(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int i = C0983R.attr.checkedTextViewStyle;
        C0694lf.m1563a(context);
        super(context, attributeSet, i);
        C0542df.m1311a(this, getContext());
        C0756p1 c0756p1 = new C0756p1(this);
        this.f631c = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        c0756p1.m1783b();
        C0111G0 c0111g0 = new C0111G0(this);
        this.f630b = c0111g0;
        c0111g0.m299d(attributeSet, i);
        this.f629a = new C0201L0(this);
        C0751of c0751ofM1768e = C0751of.m1768e(getContext(), attributeSet, C0983R.styleable.CheckedTextView, i);
        TypedArray typedArray = c0751ofM1768e.f2960b;
        C0866ug.m2002i(this, getContext(), C0983R.styleable.CheckedTextView, attributeSet, c0751ofM1768e.f2960b, i);
        try {
            if (typedArray.hasValue(C0983R.styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(C0983R.styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(C0889w1.m2115A(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(C0983R.styleable.CheckedTextView_android_checkMark)) {
                        setCheckMarkDrawable(C0889w1.m2115A(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(C0983R.styleable.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(C0983R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(C0889w1.m2115A(getContext(), resourceId));
            }
            if (typedArray.hasValue(C0983R.styleable.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(c0751ofM1768e.m1769a(C0983R.styleable.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(C0983R.styleable.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(C0912x5.m2200c(typedArray.getInt(C0983R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
            c0751ofM1768e.m1773f();
            getEmojiTextViewHelper().m1190b(attributeSet, i);
        } catch (Throwable th) {
            c0751ofM1768e.m1773f();
            throw th;
        }
    }

    private C0490b1 getEmojiTextViewHelper() {
        if (this.f632d == null) {
            this.f632d = new C0490b1(this);
        }
        return this.f632d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0756p1 c0756p1 = this.f631c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            c0201l0.m571a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            return c0201l0.f676b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            return c0201l0.f677c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f631c.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f631c.m1785e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0889w1.m2125L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1191c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            if (c0201l0.f680f) {
                c0201l0.f680f = false;
            } else {
                c0201l0.f680f = true;
                c0201l0.m571a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f631c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f631c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1192d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f630b;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            c0201l0.f676b = colorStateList;
            c0201l0.f678d = true;
            c0201l0.m571a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0201L0 c0201l0 = this.f629a;
        if (c0201l0 != null) {
            c0201l0.f677c = mode;
            c0201l0.f679e = true;
            c0201l0.m571a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f631c;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f631c;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0756p1 c0756p1 = this.f631c;
        if (c0756p1 != null) {
            c0756p1.m1787g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0889w1.m2115A(getContext(), i));
    }
}
