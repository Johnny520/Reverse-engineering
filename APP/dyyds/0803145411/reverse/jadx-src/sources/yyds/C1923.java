package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲀᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1923 extends CheckedTextView {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1495 f9682;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0328 f9683;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0286 f9684;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1231 f9685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1923(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC2790.m4904(context);
        AbstractC2251.m4251(getContext(), this);
        C1495 c1495 = new C1495(this);
        this.f9682 = c1495;
        c1495.m3012(attributeSet, R.attr.checkedTextViewStyle);
        c1495.m3009();
        C1231 c1231 = new C1231(this);
        this.f9685 = c1231;
        c1231.m2518(attributeSet, R.attr.checkedTextViewStyle);
        this.f9683 = new C0328(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1592.f8106;
        C0644 c0644M1535 = C0644.m1535(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(this, context3, iArr, attributeSet, typedArray2, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC1367.m2767(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC1367.m2767(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC1367.m2767(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0644M1535.m1556(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC2137.m4076(typedArray.getInt(3, -1), null));
            }
            c0644M1535.m1568();
            getEmojiTextViewHelper().m936(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0644M1535.m1568();
            throw th;
        }
    }

    private C0286 getEmojiTextViewHelper() {
        C0286 c0286 = this.f9684;
        if (c0286 != null) {
            return c0286;
        }
        C0286 c02862 = new C0286(this);
        this.f9684 = c02862;
        return c02862;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1495 c1495 = this.f9682;
        if (c1495 != null) {
            c1495.m3009();
        }
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            c1231.m2510();
        }
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            c0328.m997();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            return (ColorStateList) c0328.f1718;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            return (PorterDuff.Mode) c0328.f1719;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9682.m3013();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9682.m3007();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1544.m3194(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m937(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            if (c0328.f1717) {
                c0328.f1717 = false;
            } else {
                c0328.f1717 = true;
                c0328.m997();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f9682;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f9682;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m938(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f9685;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            c0328.f1718 = colorStateList;
            c0328.f1720 = true;
            c0328.m997();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0328 c0328 = this.f9683;
        if (c0328 != null) {
            c0328.f1719 = mode;
            c0328.f1722 = true;
            c0328.m997();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1495 c1495 = this.f9682;
        c1495.m3005(colorStateList);
        c1495.m3009();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1495 c1495 = this.f9682;
        c1495.m3006(mode);
        c1495.m3009();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1495 c1495 = this.f9682;
        if (c1495 != null) {
            c1495.m3010(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC1367.m2767(getContext(), i));
    }
}
