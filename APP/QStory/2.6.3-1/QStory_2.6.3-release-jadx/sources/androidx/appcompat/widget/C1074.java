package androidx.appcompat.widget;

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
import androidx.appcompat.app.C0955;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import p204.AbstractC8602;
import p208.C8637;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1074 extends Spinner {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final int[] f1196 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f1197;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public SpinnerAdapter f1198;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Rect f1199;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC1075 f1200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f1201;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f1202;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0967 f1203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f1204;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1074(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, C0328R.attr.spinnerStyle);
        this.f1199 = new Rect();
        AbstractC0999.m1167(getContext(), this);
        int[] iArr = AbstractC8602.f21439;
        C0955 c0955M914 = C0955.m914(C0328R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        this.f1204 = new C1038(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f1202 = new C8637(context, resourceId);
        } else {
            this.f1202 = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1196, C0328R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c0955M914.m923();
                    this.f1197 = true;
                    spinnerAdapter = this.f1198;
                    if (spinnerAdapter != null) {
                    }
                    this.f1204.m1226(attributeSet, C0328R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC0963 dialogInterfaceOnClickListenerC0963 = new DialogInterfaceOnClickListenerC0963(this);
            this.f1200 = dialogInterfaceOnClickListenerC0963;
            dialogInterfaceOnClickListenerC0963.f885 = typedArray.getString(2);
        } else if (i == 1) {
            C0962 c0962 = new C0962(this, this.f1202, attributeSet);
            C0955 c0955M9142 = C0955.m914(C0328R.attr.spinnerStyle, 0, this.f1202, attributeSet, iArr);
            this.f1201 = ((TypedArray) c0955M9142.f665).getLayoutDimension(3, -2);
            c0962.m1209(c0955M9142.m950(1));
            c0962.f880 = typedArray.getString(2);
            c0955M9142.m923();
            this.f1200 = c0962;
            this.f1203 = new C0967(this, this, c0962);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(C0328R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0955M914.m923();
        this.f1197 = true;
        spinnerAdapter = this.f1198;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1198 = null;
        }
        this.f1204.m1226(attributeSet, C0328R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            c1038.m1238();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1075 interfaceC1075 = this.f1200;
        return interfaceC1075 != null ? interfaceC1075.mo1080() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1075 interfaceC1075 = this.f1200;
        return interfaceC1075 != null ? interfaceC1075.mo1084() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1200 != null ? this.f1201 : super.getDropDownWidth();
    }

    public final InterfaceC1075 getInternalPopup() {
        return this.f1200;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1075 interfaceC1075 = this.f1200;
        return interfaceC1075 != null ? interfaceC1075.mo1078() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1202;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1075 interfaceC1075 = this.f1200;
        return interfaceC1075 != null ? interfaceC1075.mo1073() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 == null || !interfaceC1075.mo1081()) {
            return;
        }
        interfaceC1075.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1200 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1291(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f808 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0968(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        InterfaceC1075 interfaceC1075 = this.f1200;
        appCompatSpinner$SavedState.f808 = interfaceC1075 != null && interfaceC1075.mo1081();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0967 c0967 = this.f1203;
        if (c0967 == null || !c0967.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 == null) {
            return super.performClick();
        }
        if (interfaceC1075.mo1081()) {
            return true;
        }
        interfaceC1075.mo1076(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1197) {
            this.f1198 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 != null) {
            Context context = this.f1202;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0966 c0966 = new C0966();
            c0966.f890 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0966.f889 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0964.m1085((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1075.mo1074(c0966);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1075.mo1077(i);
            interfaceC1075.mo1079(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 != null) {
            interfaceC1075.mo1082(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1200 != null) {
            this.f1201 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 != null) {
            interfaceC1075.mo1083(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC4765.m8871(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1075 interfaceC1075 = this.f1200;
        if (interfaceC1075 != null) {
            interfaceC1075.mo1072(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1204;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m1291(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
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
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
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
        Rect rect = this.f1199;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }
}
