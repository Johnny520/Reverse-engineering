package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.C0960;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3077;
import androidx.core.view.C3093;
import androidx.core.view.InterfaceC3037;
import androidx.core.view.InterfaceC3078;
import androidx.core.widget.ActionModeCallbackC3132;
import androidx.core.widget.C3133;
import androidx.fragment.app.C3191;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p170.C8435;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0975 extends EditText implements InterfaceC3037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0980 f908;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3133 f909;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0976 f910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1059 f911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0980 f912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f913;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.editTextStyle);
        AbstractC0988.m1157(context);
        AbstractC0999.m1167(getContext(), this);
        C1038 c1038 = new C1038(this);
        this.f913 = c1038;
        c1038.m1226(attributeSet, C0328R.attr.editTextStyle);
        C1059 c1059 = new C1059(this);
        this.f911 = c1059;
        c1059.m1267(attributeSet, C0328R.attr.editTextStyle);
        c1059.m1270();
        C0980 c0980 = new C0980();
        c0980.f930 = this;
        this.f912 = c0980;
        this.f909 = new C3133();
        C0980 c09802 = new C0980(this);
        this.f908 = c09802;
        c09802.mo1091(attributeSet, C0328R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1119 = c09802.m1119(keyListener);
        if (keyListenerM1119 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1119);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0976 getSuperCaller() {
        if (this.f910 == null) {
            this.f910 = new C0976(this);
        }
        return this.f910;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1059 c1059 = this.f911;
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
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f911.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f911.m1268();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0980 c0980;
        if (Build.VERSION.SDK_INT >= 28 || (c0980 = this.f912) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0980.f929;
        return textClassifier == null ? AbstractC1078.m1294((TextView) c0980.f930) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM4805;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f911.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC5894.m10579(editorInfo, getText());
        }
        AbstractC3400.m5623(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM4805 = AbstractC3103.m4805(this)) != null) {
            editorInfo.contentMimeTypes = strArrM4805;
            inputConnectionOnCreateInputConnection = new C8435(inputConnectionOnCreateInputConnection, new C3191(this, 22));
        }
        return this.f908.m1118(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM1089 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC3103.m4805(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM1089 = AbstractC0969.m1089(dragEvent, this, activity);
            }
        }
        if (zM1089) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC3078 c0960;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC3103.m4805(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0960 = new C0960(primaryClip, 1);
            } else {
                C3077 c3077 = new C3077();
                c3077.f6887 = primaryClip;
                c3077.f6888 = 1;
                c0960 = c3077;
            }
            c0960.mo1009(i == 16908322 ? 0 : 1);
            AbstractC3103.m4807(this, c0960.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f911;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f911;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC7390.m12619(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f908.m1117(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f908.m1119(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f913;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f911;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f911;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1059 c1059 = this.f911;
        if (c1059 != null) {
            c1059.m1273(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0980 c0980;
        if (Build.VERSION.SDK_INT >= 28 || (c0980 = this.f912) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0980.f929 = textClassifier;
        }
    }

    @Override // androidx.core.view.InterfaceC3037
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3093 mo1096(C3093 c3093) {
        this.f909.getClass();
        return C3133.m4883(this, c3093);
    }
}
