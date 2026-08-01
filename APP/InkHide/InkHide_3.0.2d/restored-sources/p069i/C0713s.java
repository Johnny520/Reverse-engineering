package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.p055lu.wxmask272.R;
import p004C.C0064h;
import p006D.AbstractC0079h;
import p024M.C0190d;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0713s extends CheckedTextView {

    /* JADX INFO: renamed from: b */
    public final C0190d f2411b;

    /* JADX INFO: renamed from: c */
    public final C0704p f2412c;

    /* JADX INFO: renamed from: d */
    public final C0666c0 f2413d;

    /* JADX INFO: renamed from: e */
    public C0723w f2414e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC0673e1.m1303a(context);
        AbstractC0670d1.m1297a(this, getContext());
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2413d = c0666c0;
        c0666c0.m1284f(attributeSet, R.attr.checkedTextViewStyle);
        c0666c0.m1281b();
        C0704p c0704p = new C0704p(this);
        this.f2412c = c0704p;
        c0704p.m1330d(attributeSet, R.attr.checkedTextViewStyle);
        this.f2411b = new C0190d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0515a.f1648l;
        C0064h c0064hM114t = C0064h.m114t(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        AbstractC1048L.m2289h(this, getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0503h.m992y(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0503h.m992y(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0503h.m992y(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0064hM114t.m122l(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0705p0.m1337b(typedArray.getInt(3, -1), null));
            }
            c0064hM114t.m130v();
            getEmojiTextViewHelper().m1372a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0064hM114t.m130v();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0723w getEmojiTextViewHelper() {
        if (this.f2414e == null) {
            this.f2414e = new C0723w(this);
        }
        return this.f2414e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0666c0 c0666c0 = this.f2413d;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            c0190d.m394b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0079h.m177V(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCheckMarkTintList() {
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            return (ColorStateList) c0190d.f542e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            return (PorterDuff.Mode) c0190d.f543f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2413d.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2413d.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0503h.m972H(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m1373b(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            if (c0190d.f540c) {
                c0190d.f540c = false;
            } else {
                c0190d.f540c = true;
                c0190d.m394b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2413d;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2413d;
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
        getEmojiTextViewHelper().m1374c(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2412c;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            c0190d.f542e = colorStateList;
            c0190d.f538a = true;
            c0190d.m394b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0190d c0190d = this.f2411b;
        if (c0190d != null) {
            c0190d.f543f = mode;
            c0190d.f539b = true;
            c0190d.m394b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2413d;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2413d;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0666c0 c0666c0 = this.f2413d;
        if (c0666c0 != null) {
            c0666c0.m1285g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(AbstractC0503h.m992y(getContext(), i2));
    }
}
