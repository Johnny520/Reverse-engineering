package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.C0955;
import androidx.core.widget.ActionModeCallbackC3132;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import p069.AbstractC7390;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1039 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f1098 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1059 f1099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0980 f1100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f1101;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.autoCompleteTextViewStyle);
        AbstractC0988.m1157(context);
        AbstractC0999.m1167(getContext(), this);
        C0955 c0955M914 = C0955.m914(C0328R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f1098);
        if (((TypedArray) c0955M914.f665).hasValue(0)) {
            setDropDownBackgroundDrawable(c0955M914.m950(0));
        }
        c0955M914.m923();
        C1038 c1038 = new C1038(this);
        this.f1101 = c1038;
        c1038.m1226(attributeSet, C0328R.attr.autoCompleteTextViewStyle);
        C1059 c1059 = new C1059(this);
        this.f1099 = c1059;
        c1059.m1267(attributeSet, C0328R.attr.autoCompleteTextViewStyle);
        c1059.m1270();
        C0980 c0980 = new C0980(this);
        this.f1100 = c0980;
        c0980.mo1091(attributeSet, C0328R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1119 = c0980.m1119(keyListener);
        if (keyListenerM1119 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1119);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1059 c1059 = this.f1099;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC3132 ? ((ActionModeCallbackC3132) customSelectionActionModeCallback).f7042 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1099.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1099.m1268();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC3400.m5623(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f1100.m1118(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1099;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1099;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC7390.m12619(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC4765.m8871(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1100.m1117(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1100.m1119(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1101;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f1099;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f1099;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1059 c1059 = this.f1099;
        if (c1059 != null) {
            c1059.m1273(context, i);
        }
    }
}
