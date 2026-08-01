package androidx.appcompat.widget;

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
import androidx.appcompat.app.C0955;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.ActionModeCallbackC3132;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import p069.AbstractC7390;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 extends CheckedTextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0974 f1102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1038 f1103;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1059 f1104;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1041 f1105;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, C0328R.attr.checkedTextViewStyle);
        AbstractC0988.m1157(context);
        AbstractC0999.m1167(getContext(), this);
        C1059 c1059 = new C1059(this);
        this.f1104 = c1059;
        c1059.m1267(attributeSet, C0328R.attr.checkedTextViewStyle);
        c1059.m1270();
        C1038 c1038 = new C1038(this);
        this.f1103 = c1038;
        c1038.m1226(attributeSet, C0328R.attr.checkedTextViewStyle);
        this.f1105 = new C1041(this);
        Context context2 = getContext();
        int[] iArr = AbstractC8602.f21450;
        C0955 c0955M914 = C0955.m914(C0328R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        AbstractC3103.m4803(this, getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, C0328R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC4765.m8871(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC4765.m8871(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC4765.m8871(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0955M914.m945(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1063.m1282(typedArray.getInt(3, -1), null));
            }
            c0955M914.m923();
            getEmojiTextViewHelper().m1095(attributeSet, C0328R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0955M914.m923();
            throw th;
        }
    }

    private C0974 getEmojiTextViewHelper() {
        if (this.f1102 == null) {
            this.f1102 = new C0974(this);
        }
        return this.f1102;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1059 c1059 = this.f1104;
        if (c1059 != null) {
            c1059.m1270();
        }
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            c1041.m1258();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC3132 ? ((ActionModeCallbackC3132) customSelectionActionModeCallback).f7042 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            return (ColorStateList) c1041.f1111;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            return (PorterDuff.Mode) c1041.f1110;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1104.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1104.m1268();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3400.m5623(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1094(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            if (c1041.f1107) {
                c1041.f1107 = false;
            } else {
                c1041.f1107 = true;
                c1041.m1258();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1104;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1104;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC7390.m12619(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1093(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1103;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            c1041.f1111 = colorStateList;
            c1041.f1109 = true;
            c1041.m1258();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1041 c1041 = this.f1105;
        if (c1041 != null) {
            c1041.f1110 = mode;
            c1041.f1108 = true;
            c1041.m1258();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f1104;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f1104;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1059 c1059 = this.f1104;
        if (c1059 != null) {
            c1059.m1273(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC4765.m8871(getContext(), i));
    }
}
