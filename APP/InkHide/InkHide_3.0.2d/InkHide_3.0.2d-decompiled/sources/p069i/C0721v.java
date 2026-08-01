package p069i;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
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
import com.p055lu.wxmask272.R;
import p004C.AbstractC0059c;
import p004C.C0060d;
import p004C.C0061e;
import p004C.C0062f;
import p004C.C0066j;
import p006D.AbstractC0079h;
import p006D.C0092u;
import p052b1.AbstractC0503h;
import p099y.AbstractC1048L;
import p099y.C1070e;
import p099y.C1074g;
import p099y.InterfaceC1068d;
import p099y.InterfaceC1086r;

/* JADX INFO: renamed from: i.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0721v extends EditText implements InterfaceC1086r {

    /* JADX INFO: renamed from: b */
    public final C0704p f2440b;

    /* JADX INFO: renamed from: c */
    public final C0666c0 f2441c;

    /* JADX INFO: renamed from: d */
    public final C0612C f2442d;

    /* JADX INFO: renamed from: e */
    public final C0092u f2443e;

    /* JADX INFO: renamed from: f */
    public final C0612C f2444f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC0673e1.m1303a(context);
        AbstractC0670d1.m1297a(this, getContext());
        C0704p c0704p = new C0704p(this);
        this.f2440b = c0704p;
        c0704p.m1330d(attributeSet, R.attr.editTextStyle);
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2441c = c0666c0;
        c0666c0.m1284f(attributeSet, R.attr.editTextStyle);
        c0666c0.m1281b();
        C0612C c0612c = new C0612C();
        c0612c.f2115b = this;
        this.f2442d = c0612c;
        this.f2443e = new C0092u();
        C0612C c0612c2 = new C0612C(this);
        this.f2444f = c0612c2;
        c0612c2.mo1213b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM1212a = c0612c2.m1212a(keyListener);
        if (keyListenerM1212a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1212a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1086r
    /* JADX INFO: renamed from: a */
    public final C1074g mo1371a(C1074g c1074g) {
        return this.f2443e.m241a(this, c1074g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0666c0 c0666c0 = this.f2441c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0079h.m177V(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2441c.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2441c.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0612C c0612c;
        if (Build.VERSION.SDK_INT >= 28 || (c0612c = this.f2442d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0612c.f2116c;
        return textClassifier == null ? AbstractC0649V.m1265a((TextView) c0612c.f2115b) : textClassifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
  0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        String[] strArrM2285d;
        String[] stringArray;
        InputConnection c0062f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2441c.getClass();
        C0666c0.m1279h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0503h.m972H(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i2 = Build.VERSION.SDK_INT) <= 30 && (strArrM2285d = AbstractC1048L.m2285d(this)) != null) {
            if (i2 >= 25) {
                editorInfo.contentMimeTypes = strArrM2285d;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM2285d);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM2285d);
            }
            C0060d c0060d = new C0060d(0, this);
            if (i2 >= 25) {
                c0062f = new C0061e(inputConnectionOnCreateInputConnection, c0060d);
            } else {
                String[] strArr = AbstractC0059c.f301a;
                if (i2 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                    if (strArr.length != 0) {
                        c0062f = new C0062f(inputConnectionOnCreateInputConnection, c0060d);
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                        }
                    }
                    if (strArr.length != 0) {
                    }
                }
            }
            inputConnectionOnCreateInputConnection = c0062f;
        }
        return this.f2444f.m1214c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM1217a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1048L.m2285d(this) != null) {
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
                zM1217a = AbstractC0618F.m1217a(dragEvent, this, activity);
            }
        }
        if (zM1217a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC1068d c0066j;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC1048L.m2285d(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0066j = new C0066j(primaryClip, 1);
            } else {
                C1070e c1070e = new C1070e();
                c1070e.f3695c = primaryClip;
                c1070e.f3696d = 1;
                c0066j = c1070e;
            }
            c0066j.mo150v(i2 == 16908322 ? 0 : 1);
            AbstractC1048L.m2287f(this, c0066j.mo140k());
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2441c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2441c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0079h.m178W(callback, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z2) {
        this.f2444f.m1215d(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2444f.m1212a(keyListener));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2440b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2441c;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2441c;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0666c0 c0666c0 = this.f2441c;
        if (c0666c0 != null) {
            c0666c0.m1285g(context, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0612C c0612c;
        if (Build.VERSION.SDK_INT >= 28 || (c0612c = this.f2442d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0612c.f2116c = textClassifier;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getText()Ljava/lang/CharSequence; */
    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
