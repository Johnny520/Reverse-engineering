package p069i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.p055lu.wxmask272.R;
import p006D.AbstractC0079h;
import p006D.InterfaceC0074c;

/* JADX INFO: renamed from: i.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0707q extends Button implements InterfaceC0074c {

    /* JADX INFO: renamed from: b */
    public final C0704p f2392b;

    /* JADX INFO: renamed from: c */
    public final C0666c0 f2393c;

    /* JADX INFO: renamed from: d */
    public C0723w f2394d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        AbstractC0673e1.m1303a(context);
        AbstractC0670d1.m1297a(this, getContext());
        C0704p c0704p = new C0704p(this);
        this.f2392b = c0704p;
        c0704p.m1330d(attributeSet, R.attr.buttonStyle);
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2393c = c0666c0;
        c0666c0.m1284f(attributeSet, R.attr.buttonStyle);
        c0666c0.m1281b();
        getEmojiTextViewHelper().m1372a(attributeSet, R.attr.buttonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0723w getEmojiTextViewHelper() {
        if (this.f2394d == null) {
            this.f2394d = new C0723w(this);
        }
        return this.f2394d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2331e);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeMinTextSize();
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2330d);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeStepGranularity();
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2329c);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0666c0 c0666c0 = this.f2393c;
        return c0666c0 != null ? c0666c0.f2249i.f2332f : new int[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            return c0666c0.f2249i.f2327a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0079h.m177V(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2393c.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2393c.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 == null || InterfaceC0074c.f337a) {
            return;
        }
        c0666c0.f2249i.m1315a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 == null || InterfaceC0074c.f337a) {
            return;
        }
        C0690k0 c0690k0 = c0666c0.f2249i;
        if (c0690k0.m1317f()) {
            c0690k0.m1315a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m1373b(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.m1286i(i2, i3, i4, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.m1287j(iArr, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.m1288k(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0079h.m178W(callback, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m1374c(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0079h) getEmojiTextViewHelper().f2448b.f312c).mo209t(inputFilterArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportAllCaps(boolean z2) {
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.f2241a.setAllCaps(z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2392b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2393c;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2393c;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 != null) {
            c0666c0.m1285g(context, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = InterfaceC0074c.f337a;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0666c0 c0666c0 = this.f2393c;
        if (c0666c0 == null || z2) {
            return;
        }
        C0690k0 c0690k0 = c0666c0.f2249i;
        if (c0690k0.m1317f()) {
            return;
        }
        c0690k0.m1318g(i2, f);
    }
}
