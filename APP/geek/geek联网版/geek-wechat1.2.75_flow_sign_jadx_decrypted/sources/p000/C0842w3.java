package p000;

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
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: loaded from: classes.dex */
public class C0842w3 extends EditText implements InterfaceC0390jx {

    /* JADX INFO: renamed from: a */
    public final C0803v2 f5048a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f5049b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f5050c;

    /* JADX INFO: renamed from: d */
    public final v60 f5051d;

    /* JADX INFO: renamed from: e */
    public final C0138d4 f5052e;

    /* JADX INFO: renamed from: f */
    public C0804v3 f5053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0842w3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        d70.m881a(context);
        x60.m2635a(this, getContext());
        C0803v2 c0803v2 = new C0803v2(this);
        this.f5048a = c0803v2;
        c0803v2.m2536d(attributeSet, R.attr.editTextStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f5049b = c0139d5;
        c0139d5.m873f(attributeSet, R.attr.editTextStyle);
        c0139d5.m870b();
        C0138d4 c0138d4 = new C0138d4(4, false);
        c0138d4.f1297b = this;
        this.f5050c = c0138d4;
        this.f5051d = new v60();
        C0138d4 c0138d42 = new C0138d4(this, 3);
        this.f5052e = c0138d42;
        c0138d42.mo864z(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM860u = c0138d42.m860u(keyListener);
        if (keyListenerM860u == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM860u);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0804v3 getSuperCaller() {
        if (this.f5053f == null) {
            this.f5053f = new C0804v3(this);
        }
        return this.f5053f;
    }

    @Override // p000.InterfaceC0390jx
    /* JADX INFO: renamed from: a */
    public final C0481md mo1639a(C0481md c0481md) {
        return this.f5051d.m2544a(this, c0481md);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f5049b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u60 ? ((u60) customSelectionActionModeCallback).f4645a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5049b.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5049b.m872e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f5050c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0138d4.f1298c;
        return textClassifier == null ? AbstractC0843w4.m2594a((TextView) c0138d4.f1297b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM2006f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5049b.getClass();
        C0139d5.m868h(editorInfo, inputConnectionOnCreateInputConnection, this);
        g80.m1171B(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM2006f = oa0.m2006f(this)) != null) {
            editorInfo.contentMimeTypes = strArrM2006f;
            inputConnectionOnCreateInputConnection = new C0232fp(inputConnectionOnCreateInputConnection, new C0633qh(this));
        }
        return this.f5052e.m831C(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM1136a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && oa0.m2006f(this) != null) {
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
                zM1136a = AbstractC0248g4.m1136a(dragEvent, this, activity);
            }
        }
        if (zM1136a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0370jd c0431l0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || oa0.m2006f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0431l0 = new C0431l0(primaryClip, 1);
            } else {
                C0407kd c0407kd = new C0407kd();
                c0407kd.f2819b = primaryClip;
                c0407kd.f2820c = 1;
                c0431l0 = c0407kd;
            }
            c0431l0.mo1603s(i == 16908322 ? 0 : 1);
            oa0.m2008h(this, c0431l0.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5049b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f5049b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0274gu.m1308O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f5052e.m839K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5052e.m860u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f5048a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f5049b;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f5049b;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f5049b;
        if (c0139d5 != null) {
            c0139d5.m874g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f5050c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0138d4.f1298c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
