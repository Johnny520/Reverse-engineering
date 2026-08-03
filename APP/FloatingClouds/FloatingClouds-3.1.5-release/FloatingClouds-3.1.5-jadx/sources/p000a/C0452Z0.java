package p000a;

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
import androidx.appcompat.C0983R;
import p000a.C0401W3;

/* JADX INFO: renamed from: a.Z0 */
/* JADX INFO: loaded from: classes.dex */
public class C0452Z0 extends EditText implements InterfaceC0558ec {

    /* JADX INFO: renamed from: a */
    public final C0111G0 f1706a;

    /* JADX INFO: renamed from: b */
    public final C0756p1 f1707b;

    /* JADX INFO: renamed from: c */
    public final C0485af f1708c;

    /* JADX INFO: renamed from: d */
    public final C0471a1 f1709d;

    /* JADX INFO: renamed from: e */
    public a f1710e;

    /* JADX INFO: renamed from: a.Z0$a */
    public class a {
        public a() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0452Z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0983R.attr.editTextStyle);
    }

    private a getSuperCaller() {
        if (this.f1710e == null) {
            this.f1710e = new a();
        }
        return this.f1710e;
    }

    @Override // p000a.InterfaceC0558ec
    /* JADX INFO: renamed from: a */
    public final C0401W3 mo1114a(C0401W3 c0401w3) {
        return this.f1708c.mo1172a(this, c0401w3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0756p1 c0756p1 = this.f1707b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1707b.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1707b.m1785e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM1997d;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1707b.getClass();
        C0756p1.m1781h(editorInfo, inputConnectionOnCreateInputConnection, this);
        C0889w1.m2125L(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM1997d = C0866ug.m1997d(this)) != null) {
            editorInfo.contentMimeTypes = strArrM1997d;
            inputConnectionOnCreateInputConnection = new C0424X8(inputConnectionOnCreateInputConnection, new C0080E5(this));
        }
        return this.f1709d.m1148c(inputConnectionOnCreateInputConnection, editorInfo);
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
        boolean zM1535a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C0866ug.m1997d(this) != null) {
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
                zM1535a = C0661k1.m1535a(dragEvent, this, activity);
            }
        }
        if (zM1535a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0401W3.b aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || C0866ug.m1997d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                aVar = new C0401W3.a(primaryClip, 1);
            } else {
                C0401W3.c cVar = new C0401W3.c();
                cVar.f1530a = primaryClip;
                cVar.f1531b = 1;
                aVar = cVar;
            }
            aVar.mo1043c(i == 16908322 ? 0 : 1);
            C0866ug.m1999f(this, aVar.mo1041a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f1707b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f1707b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) throws Throwable {
        this.f1709d.m1149d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1709d.m1146a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f1706a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f1707b;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f1707b;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0756p1 c0756p1 = this.f1707b;
        if (c0756p1 != null) {
            c0756p1.m1787g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0452Z0(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        C0542df.m1311a(this, getContext());
        C0111G0 c0111g0 = new C0111G0(this);
        this.f1706a = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0756p1 c0756p1 = new C0756p1(this);
        this.f1707b = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        c0756p1.m1783b();
        this.f1708c = new C0485af();
        C0471a1 c0471a1 = new C0471a1(this);
        this.f1709d = c0471a1;
        c0471a1.m1147b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1146a = c0471a1.m1146a(keyListener);
        if (keyListenerM1146a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1146a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getText()Ljava/lang/CharSequence; */
    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
