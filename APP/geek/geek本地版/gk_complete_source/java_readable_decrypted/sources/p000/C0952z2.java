package p000;

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
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0952z2 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C0004a3 f5438a;

    /* JADX INFO: renamed from: b */
    public final C0804v2 f5439b;

    /* JADX INFO: renamed from: c */
    public final C0139d5 f5440c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f5441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952z2(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        x60.m2614a(context);
        r60.m2247a(this, getContext());
        C0139d5 c0139d5 = new C0139d5(this);
        this.f5440c = c0139d5;
        c0139d5.m916f(attributeSet, R.attr.checkedTextViewStyle);
        c0139d5.m913b();
        C0804v2 c0804v2 = new C0804v2(this);
        this.f5439b = c0804v2;
        c0804v2.m2482d(attributeSet, R.attr.checkedTextViewStyle);
        this.f5438a = new C0004a3(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0910xy.f5228l;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        ja0.m1574k(this, getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0222ff.m1196r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0222ff.m1196r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0222ff.m1196r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0659r5M2219y.m2233l(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0187eh.m1028b(typedArray.getInt(3, -1), null));
            }
            c0659r5M2219y.m2245z();
            getEmojiTextViewHelper().m2605a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0659r5M2219y.m2245z();
            throw th;
        }
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f5441d == null) {
            this.f5441d = new C0879x3(this);
        }
        return this.f5441d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0139d5 c0139d5 = this.f5440c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            c0004a3.m6b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o60 ? ((o60) customSelectionActionModeCallback).f3499a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            return (ColorStateList) c0004a3.f16a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            return (PorterDuff.Mode) c0004a3.f17b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5440c.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5440c.m915e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a80.m57v(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2606b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            if (c0004a3.f20e) {
                c0004a3.f20e = false;
            } else {
                c0004a3.f20e = true;
                c0004a3.m6b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5440c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5440c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0979zt.m2822S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2607c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f5439b;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            c0004a3.f16a = colorStateList;
            c0004a3.f18c = true;
            c0004a3.m6b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0004a3 c0004a3 = this.f5438a;
        if (c0004a3 != null) {
            c0004a3.f17b = mode;
            c0004a3.f19d = true;
            c0004a3.m6b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f5440c;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f5440c;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f5440c;
        if (c0139d5 != null) {
            c0139d5.m917g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }
}
