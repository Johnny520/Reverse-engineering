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

    public AbstractC0930u(Context r5, AttributeSet r6) {
        AbstractC0851B0.m2165a(r5);
        super(r5, r6, C1031R.attr.editTextStyle);
        AbstractC0849A0.m2159a(this, getContext());
        C0916n r52 = new C0916n(this);
        this.f3299a = r52;
        r52.m2243d(r6, C1031R.attr.editTextStyle);
        C0860G r53 = new C0860G(this);
        this.f3300b = r53;
        r53.m2177d(r6, C1031R.attr.editTextStyle);
        r53.m2176b();
        C0002c r54 = new C0002c(9);
        r54.f7b = this;
        this.f3301c = r54;
        this.f3302d = new C0230s();
        C0002c r55 = new C0002c(this, 8);
        this.f3303e = r55;
        r55.m5f(r6, C1031R.attr.editTextStyle);
        KeyListener r62 = getKeyListener();
        if ((!(r62 instanceof NumberKeyListener)) == false) goto L9;
        boolean r02 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r56 = r55.m3d(r62);
        if (r56 == r62) goto L10;
        super.setKeyListener(r56);
        super.setRawInputType(r3);
        super.setFocusable(r02);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L10:
        return;
    }

    private C0928t getSuperCaller() {
        if (this.f3304f != null) goto L6;
        this.f3304f = new C0928t(this);
    L6:
        return this.f3304f;
    }

    @Override // p006D.InterfaceC0125s
    /* JADX INFO: renamed from: a */
    public final C0103h mo201a(C0103h r2) {
        return this.f3302d.m630a(this, r2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3299a;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0860G r03 = this.f3300b;
        if (r03 == null) goto L9;
        r03.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r02 = super.getCustomSelectionActionModeCallback();
        if ((r02 instanceof ActionModeCallbackC0229r) == true) goto L5;
        return r02;
    L5:
        return ((ActionModeCallbackC0229r) r02).f465a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3299a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3299a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 r02 = this.f3300b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 r02 = this.f3300b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L12;
        C0002c r02 = this.f3301c;
        if (r02 == null) goto L12;
        TextClassifier r1 = (TextClassifier) r02.f8c;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return AbstractC0848A.m2158a((TextView) r02.f7b);
    L12:
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r4) {
        InputConnection r02 = super.onCreateInputConnection(r4);
        this.f3300b.getClass();
        C0860G.m2174f(this, r02, r4);
        AbstractC0805P.m2036L(r02, r4, this);
        if (r02 == null) goto L10;
        if (Build.VERSION.SDK_INT > 30) goto L10;
        String[] r1 = AbstractC0080Q.m285d(this);
        if (r1 == null) goto L10;
        r4.contentMimeTypes = r1;
        r02 = new C0208b(r02, new C0037m(this));
    L10:
        return this.f3303e.m7h(r02, r4);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) goto L5;
        return;
    L5:
        if (r02 >= 33) goto L9;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent r6) {
        boolean r3 = false;
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L25:
        if (r3 == false) goto L28;
        return true;
    L28:
        return super.onDragEvent(r6);
    L5:
        if (r6.getLocalState() != null) goto L25;
        if (AbstractC0080Q.m285d(this) == null) goto L25;
        Context r02 = getContext();
    L11:
        if ((r02 instanceof ContextWrapper) == false) goto L16;
        if ((r02 instanceof Activity) == true) goto L14;
        r02 = ((ContextWrapper) r02).getBaseContext();
        goto L11
    L14:
        Activity r03 = (Activity) r02;
    L17:
        if (r03 != null) goto L20;
        toString();
        goto L25
    L20:
        if (r6.getAction() == 1) goto L25;
        if (r6.getAction() != 3) goto L25;
        r3 = AbstractC0940z.m2273a(r6, this, r03);
        goto L25
    L16:
        r03 = null;
        goto L17
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 31) goto L28;
        if (AbstractC0080Q.m285d(this) == null) goto L28;
        if (r7 != 16908322) goto L9;
    L11:
        ClipboardManager r3 = (ClipboardManager) getContext().getSystemService("clipboard");
        if (r3 != null) goto L14;
        ClipData r32 = null;
    L16:
        if (r32 != null) goto L18;
    L26:
        return true;
    L18:
        if (r32.getItemCount() <= 0) goto L26;
        if (r02 < 31) goto L21;
        InterfaceC0097e r03 = new C0095d(r32, 1);
    L22:
        if (r7 != 16908322) goto L24;
        int r72 = 0;
    L25:
        r03.mo357w(r72);
        AbstractC0080Q.m287f(this, r03.mo347m());
        goto L26
    L24:
        r72 = 1;
        goto L25
    L21:
        C0099f r04 = new C0099f();
        r04.f258b = r32;
        r04.f259c = 1;
        r03 = r04;
        goto L22
    L14:
        r32 = r3.getPrimaryClip();
        goto L16
    L9:
        if (r7 == 16908337) goto L11;
    L28:
        return super.onTextContextMenuItem(r7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3299a;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3299a;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C0860G r12 = this.f3300b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C0860G r12 = this.f3300b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.f3303e.m14o(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.f3303e.m3d(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3299a;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3299a;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C0860G r02 = this.f3300b;
        r02.m2182j(r2);
        r02.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C0860G r02 = this.f3300b;
        r02.m2183k(r2);
        r02.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C0860G r02 = this.f3300b;
        if (r02 == null) goto L6;
        r02.m2178e(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        C0002c r02 = this.f3301c;
        if (r02 == null) goto L9;
        r02.f8c = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return super.getText();
    L7:
        return super.getEditableText();
    }
}
