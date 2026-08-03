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
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1525i3 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C2082j3 f5393a;

    /* JADX INFO: renamed from: b */
    public final C1349e3 f5394b;

    /* JADX INFO: renamed from: c */
    public final C2175l4 f5395c;

    /* JADX INFO: renamed from: d */
    public C0391J3 f5396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525i3(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1533iB.m2903a(context);
        AbstractC1042YA.m1987a(getContext(), this);
        C2175l4 c2175l4 = new C2175l4(this);
        this.f5395c = c2175l4;
        c2175l4.m4378f(attributeSet, R.attr.checkedTextViewStyle);
        c2175l4.m4375b();
        C1349e3 c1349e3 = new C1349e3(this);
        this.f5394b = c1349e3;
        c1349e3.m2603d(attributeSet, R.attr.checkedTextViewStyle);
        this.f5393a = new C2082j3(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0982Wu.f3077l;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        AbstractC2185lE.m4398k(this, getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c2656w4M5186A.m5209p(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0107Ce.m161c(typedArray.getInt(3, -1), null));
            }
            c2656w4M5186A.m5195E();
            getEmojiTextViewHelper().m829b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c2656w4M5186A.m5195E();
            throw th;
        }
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f5396d == null) {
            this.f5396d = new C0391J3(this);
        }
        return this.f5396d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2175l4 c2175l4 = this.f5395c;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            c2082j3.m4247b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            return c2082j3.f7338a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            return c2082j3.f7339b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5395c.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5395c.m4377e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0828TB.m1654x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m830c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            if (c2082j3.f7342e) {
                c2082j3.f7342e = false;
            } else {
                c2082j3.f7342e = true;
                c2082j3.m4247b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f5395c;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f5395c;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m831d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f5394b;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            c2082j3.f7338a = colorStateList;
            c2082j3.f7340c = true;
            c2082j3.m4247b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2082j3 c2082j3 = this.f5393a;
        if (c2082j3 != null) {
            c2082j3.f7339b = mode;
            c2082j3.f7341d = true;
            c2082j3.m4247b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2175l4 c2175l4 = this.f5395c;
        c2175l4.m4380i(colorStateList);
        c2175l4.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2175l4 c2175l4 = this.f5395c;
        c2175l4.m4381j(mode);
        c2175l4.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2175l4 c2175l4 = this.f5395c;
        if (c2175l4 != null) {
            c2175l4.m4379g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }
}
