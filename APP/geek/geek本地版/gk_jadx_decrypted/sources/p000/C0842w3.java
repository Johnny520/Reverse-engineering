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
public class C0842w3 extends EditText implements InterfaceC0084bx {

    /* JADX INFO: renamed from: a */
    public final C0804v2 f4913a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f4914b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f4915c;

    /* JADX INFO: renamed from: d */
    public final p60 f4916d;

    /* JADX INFO: renamed from: e */
    public final C0138d4 f4917e;

    /* JADX INFO: renamed from: f */
    public C0805v3 f4918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0842w3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        x60.m2614a(context);
        r60.m2247a(this, getContext());
        C0804v2 c0804v2 = new C0804v2(this);
        this.f4913a = c0804v2;
        c0804v2.m2482d(attributeSet, R.attr.editTextStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f4914b = c0139d5;
        c0139d5.m916f(attributeSet, R.attr.editTextStyle);
        c0139d5.m913b();
        C0138d4 c0138d4 = new C0138d4(4, false);
        c0138d4.f1363b = this;
        this.f4915c = c0138d4;
        this.f4916d = new p60();
        C0138d4 c0138d42 = new C0138d4(this, 3);
        this.f4917e = c0138d42;
        c0138d42.mo904z(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM900u = c0138d42.m900u(keyListener);
        if (keyListenerM900u == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM900u);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0805v3 getSuperCaller() {
        if (this.f4918f == null) {
            this.f4918f = new C0805v3(this);
        }
        return this.f4918f;
    }

    @Override // p000.InterfaceC0084bx
    /* JADX INFO: renamed from: a */
    public final C0100cd mo584a(C0100cd c0100cd) {
        return this.f4916d.m2045a(this, c0100cd);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0139d5 c0139d5 = this.f4914b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o60 ? ((o60) customSelectionActionModeCallback).f3499a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4914b.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4914b.m915e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f4915c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0138d4.f1364c;
        return textClassifier == null ? AbstractC0843w4.m2545a((TextView) c0138d4.f1363b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM1569f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4914b.getClass();
        C0139d5.m911h(editorInfo, inputConnectionOnCreateInputConnection, this);
        a80.m57v(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM1569f = ja0.m1569f(this)) != null) {
            editorInfo.contentMimeTypes = strArrM1569f;
            inputConnectionOnCreateInputConnection = new C0076bp(inputConnectionOnCreateInputConnection, new C0559oh(this));
        }
        return this.f4917e.m872C(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM1257a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ja0.m1569f(this) != null) {
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
                zM1257a = AbstractC0248g4.m1257a(dragEvent, this, activity);
            }
        }
        if (zM1257a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0962zc c0431l0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || ja0.m1569f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0431l0 = new C0431l0(primaryClip, 1);
            } else {
                C0014ad c0014ad = new C0014ad();
                c0014ad.f131b = primaryClip;
                c0014ad.f132c = 1;
                c0431l0 = c0014ad;
            }
            c0431l0.mo93s(i == 16908322 ? 0 : 1);
            ja0.m1571h(this, c0431l0.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f4914b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f4914b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0979zt.m2822S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f4917e.m880K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4917e.m900u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f4913a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f4914b;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f4914b;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f4914b;
        if (c0139d5 != null) {
            c0139d5.m917g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f4915c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0138d4.f1364c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
