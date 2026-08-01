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
import androidx.appcompat.app.C0113;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2244;
import androidx.core.view.C2260;
import androidx.core.view.InterfaceC2204;
import androidx.core.view.InterfaceC2245;
import androidx.core.widget.ActionModeCallbackC2299;
import androidx.core.widget.C2300;
import androidx.fragment.app.C2358;
import androidx.window.area.AbstractC2567;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p154.C7606;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0128 extends EditText implements InterfaceC2204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0133 f563;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2300 f564;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0129 f565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0133 f567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f568;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC0141.m597(context);
        AbstractC0152.m607(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f568 = c0191;
        c0191.m666(attributeSet, R.attr.editTextStyle);
        C0212 c0212 = new C0212(this);
        this.f566 = c0212;
        c0212.m707(attributeSet, R.attr.editTextStyle);
        c0212.m710();
        C0133 c0133 = new C0133();
        c0133.f585 = this;
        this.f567 = c0133;
        this.f564 = new C2300();
        C0133 c01332 = new C0133(this);
        this.f563 = c01332;
        c01332.mo531(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM559 = c01332.m559(keyListener);
        if (keyListenerM559 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM559);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0129 getSuperCaller() {
        if (this.f565 == null) {
            this.f565 = new C0129(this);
        }
        return this.f565;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            c0191.m678();
        }
        C0212 c0212 = this.f566;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2299 ? ((ActionModeCallbackC2299) customSelectionActionModeCallback).f6697 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f566.m709();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f566.m708();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0133 c0133;
        if (Build.VERSION.SDK_INT >= 28 || (c0133 = this.f567) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0133.f584;
        return textClassifier == null ? AbstractC0231.m734((TextView) c0133.f585) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM4245;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f566.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC5062.m10020(editorInfo, getText());
        }
        AbstractC2567.m5063(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM4245 = AbstractC2270.m4245(this)) != null) {
            editorInfo.contentMimeTypes = strArrM4245;
            inputConnectionOnCreateInputConnection = new C7606(inputConnectionOnCreateInputConnection, new C2358(this, 22));
        }
        return this.f563.m558(inputConnectionOnCreateInputConnection, editorInfo);
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
        boolean zM529 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC2270.m4245(this) != null) {
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
                zM529 = AbstractC0122.m529(dragEvent, this, activity);
            }
        }
        if (zM529) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC2245 c0113;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC2270.m4245(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0113 = new C0113(primaryClip, 1);
            } else {
                C2244 c2244 = new C2244();
                c2244.f6542 = primaryClip;
                c2244.f6543 = 1;
                c0113 = c2244;
            }
            c0113.mo449(i == 16908322 ? 0 : 1);
            AbstractC2270.m4247(this, c0113.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f566;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f566;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC6561.m12060(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f563.m557(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f563.m559(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f568;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f566;
        c0212.m712(colorStateList);
        c0212.m710();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f566;
        c0212.m714(mode);
        c0212.m710();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f566;
        if (c0212 != null) {
            c0212.m713(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0133 c0133;
        if (Build.VERSION.SDK_INT >= 28 || (c0133 = this.f567) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0133.f584 = textClassifier;
        }
    }

    @Override // androidx.core.view.InterfaceC2204
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2260 mo536(C2260 c2260) {
        this.f564.getClass();
        return C2300.m4323(this, c2260);
    }
}
