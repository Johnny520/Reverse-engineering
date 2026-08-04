package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛳᛳᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0555 extends EditText implements InterfaceC1403 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1179 f2648;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0019 f2649;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1231 f2650;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2133 f2651;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1495 f2652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC2790.m4904(context);
        AbstractC2251.m4251(getContext(), this);
        C1231 c1231 = new C1231(this);
        this.f2650 = c1231;
        c1231.m2518(attributeSet, R.attr.editTextStyle);
        C1495 c1495 = new C1495(this);
        this.f2652 = c1495;
        c1495.m3012(attributeSet, R.attr.editTextStyle);
        c1495.m3009();
        this.f2648 = new C1179();
        C2133 c2133 = new C2133(this, 5);
        this.f2651 = c2133;
        c2133.mo2582(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM4048 = c2133.m4048(keyListener);
        if (keyListenerM4048 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM4048);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C0019 getSuperCaller() {
        C0019 c0019 = this.f2649;
        if (c0019 != null) {
            return c0019;
        }
        C0019 c00192 = new C0019(this);
        this.f2649 = c00192;
        return c00192;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            c1231.m2510();
        }
        C1495 c1495 = this.f2652;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2652.m3013();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2652.m3007();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM3344;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2652.getClass();
        AbstractC1544.m3194(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM3344 = AbstractC1640.m3344(this)) != null) {
            editorInfo.contentMimeTypes = strArrM3344;
            inputConnectionOnCreateInputConnection = new C1280(inputConnectionOnCreateInputConnection, new C1908(6, this));
        }
        return this.f2651.m4058(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM2253 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1640.m3344(this) != null) {
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
                zM2253 = AbstractC1063.m2253(dragEvent, this, activity);
            }
        }
        if (zM2253) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0375 c0052;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC1640.m3344(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0052 = new C0052(primaryClip, 1);
            } else {
                C2686 c2686 = new C2686();
                c2686.f13159 = primaryClip;
                c2686.f13155 = 1;
                c0052 = c2686;
            }
            c0052.mo403(i == 16908322 ? 0 : 1);
            AbstractC1640.m3345(this, c0052.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f2652;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f2652;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2651.m4063(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2651.m4048(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f2650;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1495 c1495 = this.f2652;
        c1495.m3005(colorStateList);
        c1495.m3009();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1495 c1495 = this.f2652;
        c1495.m3006(mode);
        c1495.m3009();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1495 c1495 = this.f2652;
        if (c1495 != null) {
            c1495.m3010(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // yyds.InterfaceC1403
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1167 mo1403(C1167 c1167) {
        this.f2648.getClass();
        return C1179.m2374(this, c1167);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
