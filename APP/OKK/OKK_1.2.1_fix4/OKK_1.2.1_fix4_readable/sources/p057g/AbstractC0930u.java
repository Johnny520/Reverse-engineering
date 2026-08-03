package p057g;

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
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.abc.core.runtime.AbstractC0805P;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p001A0.AbstractC0040p;
import p001A0.C0037m;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p006D.C0099f;
import p006D.C0103h;
import p006D.InterfaceC0097e;
import p006D.InterfaceC0125s;
import p015I.C0208b;
import p017J.ActionModeCallbackC0229r;
import p017J.C0230s;

/* JADX INFO: renamed from: g.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0930u extends EditText implements InterfaceC0125s {

    /* JADX INFO: renamed from: a */
    public final C0916n f3299a;

    /* JADX INFO: renamed from: b */
    public final C0860G f3300b;

    /* JADX INFO: renamed from: c */
    public final C0002c f3301c;

    /* JADX INFO: renamed from: d */
    public final C0230s f3302d;

    /* JADX INFO: renamed from: e */
    public final C0002c f3303e;

    /* JADX INFO: renamed from: f */
    public C0928t f3304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0930u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.editTextStyle);
        AbstractC0851B0.m2165a(context);
        AbstractC0849A0.m2159a(this, getContext());
        C0916n c0916n = new C0916n(this);
        this.f3299a = c0916n;
        c0916n.m2243d(attributeSet, C1031R.attr.editTextStyle);
        C0860G c0860g = new C0860G(this);
        this.f3300b = c0860g;
        c0860g.m2177d(attributeSet, C1031R.attr.editTextStyle);
        c0860g.m2176b();
        C0002c c0002c = new C0002c(9);
        c0002c.f7b = this;
        this.f3301c = c0002c;
        this.f3302d = new C0230s();
        C0002c c0002c2 = new C0002c(this, 8);
        this.f3303e = c0002c2;
        c0002c2.m5f(attributeSet, C1031R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM3d = c0002c2.m3d(keyListener);
            if (keyListenerM3d == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM3d);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private C0928t getSuperCaller() {
        if (this.f3304f == null) {
            this.f3304f = new C0928t(this);
        }
        return this.f3304f;
    }

    @Override // p006D.InterfaceC0125s
    /* JADX INFO: renamed from: a */
    public final C0103h mo201a(C0103h c0103h) {
        return this.f3302d.m630a(this, c0103h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0860G c0860g = this.f3300b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC0229r ? ((ActionModeCallbackC0229r) customSelectionActionModeCallback).f465a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 c0853c0 = this.f3300b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 c0853c0 = this.f3300b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0002c c0002c;
        if (Build.VERSION.SDK_INT >= 28 || (c0002c = this.f3301c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0002c.f8c;
        return textClassifier == null ? AbstractC0848A.m2158a((TextView) c0002c.f7b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM285d;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3300b.getClass();
        C0860G.m2174f(this, inputConnectionOnCreateInputConnection, editorInfo);
        AbstractC0805P.m2036L(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM285d = AbstractC0080Q.m285d(this)) != null) {
            editorInfo.contentMimeTypes = strArrM285d;
            inputConnectionOnCreateInputConnection = new C0208b(inputConnectionOnCreateInputConnection, new C0037m(this));
        }
        return this.f3303e.m7h(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM2273a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC0080Q.m285d(this) != null) {
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
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM2273a = AbstractC0940z.m2273a(dragEvent, this, activity);
            }
        }
        if (zM2273a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0097e c0095d;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC0080Q.m285d(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0095d = new C0095d(primaryClip, 1);
            } else {
                C0099f c0099f = new C0099f();
                c0099f.f258b = primaryClip;
                c0099f.f259c = 1;
                c0095d = c0099f;
            }
            c0095d.mo357w(i2 == 16908322 ? 0 : 1);
            AbstractC0080Q.m287f(this, c0095d.mo347m());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3300b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3300b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3303e.m14o(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3303e.m3d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3299a;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0860G c0860g = this.f3300b;
        c0860g.m2182j(colorStateList);
        c0860g.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0860G c0860g = this.f3300b;
        c0860g.m2183k(mode);
        c0860g.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0860G c0860g = this.f3300b;
        if (c0860g != null) {
            c0860g.m2178e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0002c c0002c;
        if (Build.VERSION.SDK_INT >= 28 || (c0002c = this.f3301c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0002c.f8c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
