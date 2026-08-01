package p069i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p004C.C0064h;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p066g.C0564d;
import p068h.ViewTreeObserverOnGlobalLayoutListenerC0585d;

/* JADX INFO: renamed from: i.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0647U extends Spinner {

    /* JADX INFO: renamed from: j */
    public static final int[] f2205j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b */
    public final C0704p f2206b;

    /* JADX INFO: renamed from: c */
    public final Context f2207c;

    /* JADX INFO: renamed from: d */
    public final C0624I f2208d;

    /* JADX INFO: renamed from: e */
    public SpinnerAdapter f2209e;

    /* JADX INFO: renamed from: f */
    public final boolean f2210f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0645T f2211g;

    /* JADX INFO: renamed from: h */
    public int f2212h;

    /* JADX INFO: renamed from: i */
    public final Rect f2213i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0647U(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.p055lu.wxmask272.R.attr.spinnerStyle);
        this.f2213i = new Rect();
        AbstractC0670d1.m1297a(this, getContext());
        int[] iArr = AbstractC0515a.f1658v;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, com.p055lu.wxmask272.R.attr.spinnerStyle);
        this.f2206b = new C0704p(this);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2207c = new C0564d(context, resourceId);
        } else {
            this.f2207c = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2205j, com.p055lu.wxmask272.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c0064hM114t.m130v();
                    this.f2210f = true;
                    spinnerAdapter = this.f2209e;
                    if (spinnerAdapter != null) {
                    }
                    this.f2206b.m1330d(attributeSet, com.p055lu.wxmask272.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC0632M dialogInterfaceOnClickListenerC0632M = new DialogInterfaceOnClickListenerC0632M(this);
            this.f2211g = dialogInterfaceOnClickListenerC0632M;
            dialogInterfaceOnClickListenerC0632M.f2170d = typedArray.getString(2);
        } else if (i2 == 1) {
            C0640Q c0640q = new C0640Q(this, this.f2207c, attributeSet);
            C0064h c0064hM114t2 = C0064h.m114t(this.f2207c, attributeSet, iArr, com.p055lu.wxmask272.R.attr.spinnerStyle);
            this.f2212h = ((TypedArray) c0064hM114t2.f309c).getLayoutDimension(3, -2);
            c0640q.m1222j(c0064hM114t2.m123m(1));
            c0640q.f2194C = typedArray.getString(2);
            c0064hM114t2.m130v();
            this.f2211g = c0640q;
            this.f2208d = new C0624I(this, this, c0640q);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.p055lu.wxmask272.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0064hM114t.m130v();
        this.f2210f = true;
        spinnerAdapter = this.f2209e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2209e = null;
        }
        this.f2206b.m1330d(attributeSet, com.p055lu.wxmask272.R.attr.spinnerStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1264a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f2213i;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        return interfaceC0645T != null ? interfaceC0645T.mo1243d() : super.getDropDownHorizontalOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        return interfaceC0645T != null ? interfaceC0645T.mo1246i() : super.getDropDownVerticalOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2211g != null ? this.f2212h : super.getDropDownWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0645T getInternalPopup() {
        return this.f2211g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        return interfaceC0645T != null ? interfaceC0645T.mo1249l() : super.getPopupBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2207c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        return interfaceC0645T != null ? interfaceC0645T.mo1241b() : super.getPrompt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T == null || !interfaceC0645T.mo1240a()) {
            return;
        }
        interfaceC0645T.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2211g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1264a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0643S c0643s = (C0643S) parcelable;
        super.onRestoreInstanceState(c0643s.getSuperState());
        if (!c0643s.f2201a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0585d(2, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0643S c0643s = new C0643S(super.onSaveInstanceState());
        InterfaceC0645T interfaceC0645T = this.f2211g;
        c0643s.f2201a = interfaceC0645T != null && interfaceC0645T.mo1240a();
        return c0643s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0624I c0624i = this.f2208d;
        if (c0624i == null || !c0624i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T == null) {
            return super.performClick();
        }
        if (interfaceC0645T.mo1240a()) {
            return true;
        }
        this.f2211g.mo1244e(AbstractC0628K.m1236b(this), AbstractC0628K.m1235a(this));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0645T.mo1250n(i2);
            interfaceC0645T.mo1242c(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T != null) {
            interfaceC0645T.mo1248k(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2211g != null) {
            this.f2212h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T != null) {
            interfaceC0645T.mo1247j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0503h.m992y(getPopupContext(), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T != null) {
            interfaceC0645T.mo1245g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2206b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2210f) {
            this.f2209e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0645T interfaceC0645T = this.f2211g;
        if (interfaceC0645T != null) {
            Context context = this.f2207c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0634N c0634n = new C0634N();
            c0634n.f2172b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0634n.f2173c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0630L.m1239a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0645T.mo1225m(c0634n);
        }
    }
}
