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
    public final C0004a3 f5530a;

    /* JADX INFO: renamed from: b */
    public final C0803v2 f5531b;

    /* JADX INFO: renamed from: c */
    public final C0139d5 f5532c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f5533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952z2(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        d70.m881a(context);
        x60.m2635a(this, getContext());
        C0139d5 c0139d5 = new C0139d5(this);
        this.f5532c = c0139d5;
        c0139d5.m873f(attributeSet, R.attr.checkedTextViewStyle);
        c0139d5.m870b();
        C0803v2 c0803v2 = new C0803v2(this);
        this.f5531b = c0803v2;
        c0803v2.m2536d(attributeSet, R.attr.checkedTextViewStyle);
        this.f5530a = new C0004a3(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0205ez.f1688l;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        oa0.m2011k(this, getContext(), iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0259gf.m1261w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0259gf.m1261w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0259gf.m1261w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0658r5M2226y.m2240l(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0261gh.m1276b(typedArray.getInt(3, -1), null));
            }
            c0658r5M2226y.m2252z();
            getEmojiTextViewHelper().m2629a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0658r5M2226y.m2252z();
            throw th;
        }
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f5533d == null) {
            this.f5533d = new C0879x3(this);
        }
        return this.f5533d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0139d5 c0139d5 = this.f5532c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            c0004a3.m19b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u60 ? ((u60) customSelectionActionModeCallback).f4645a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            return (ColorStateList) c0004a3.f13a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            return (PorterDuff.Mode) c0004a3.f14b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5532c.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5532c.m872e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g80.m1171B(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2630b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            if (c0004a3.f17e) {
                c0004a3.f17e = false;
            } else {
                c0004a3.f17e = true;
                c0004a3.m19b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5532c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5532c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0274gu.m1308O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2631c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f5531b;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            c0004a3.f13a = colorStateList;
            c0004a3.f15c = true;
            c0004a3.m19b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0004a3 c0004a3 = this.f5530a;
        if (c0004a3 != null) {
            c0004a3.f14b = mode;
            c0004a3.f16d = true;
            c0004a3.m19b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f5532c;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f5532c;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f5532c;
        if (c0139d5 != null) {
            c0139d5.m874g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0259gf.m1261w(getContext(), i));
    }
}
