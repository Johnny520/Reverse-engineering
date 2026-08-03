package p000a;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.material.C1247R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.C0787qd;
import p000a.C0850u0;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.La */
/* JADX INFO: loaded from: classes.dex */
public final class C0211La extends C0165J0 {

    /* JADX INFO: renamed from: A */
    public static final int[] f698A;

    /* JADX INFO: renamed from: B */
    public static final int[][] f699B;

    /* JADX INFO: renamed from: C */
    @SuppressLint({"DiscouragedApi"})
    public static final int f700C;

    /* JADX INFO: renamed from: y */
    public static final int f701y = C1247R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: z */
    public static final int[] f702z = {C1247R.attr.state_indeterminate};

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet<c> f703e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet<b> f704f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f705g;

    /* JADX INFO: renamed from: h */
    public boolean f706h;

    /* JADX INFO: renamed from: i */
    public boolean f707i;

    /* JADX INFO: renamed from: j */
    public boolean f708j;

    /* JADX INFO: renamed from: k */
    public CharSequence f709k;

    /* JADX INFO: renamed from: l */
    public Drawable f710l;

    /* JADX INFO: renamed from: m */
    public Drawable f711m;

    /* JADX INFO: renamed from: n */
    public boolean f712n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f713o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f714p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f715q;

    /* JADX INFO: renamed from: r */
    public int f716r;

    /* JADX INFO: renamed from: s */
    public int[] f717s;

    /* JADX INFO: renamed from: t */
    public boolean f718t;

    /* JADX INFO: renamed from: u */
    public CharSequence f719u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f720v;

    /* JADX INFO: renamed from: w */
    public final C0850u0 f721w;

    /* JADX INFO: renamed from: x */
    public final a f722x;

    /* JADX INFO: renamed from: a.La$a */
    public class a extends AbstractC0831t0 {
        public a() {
        }

        @Override // p000a.AbstractC0831t0
        /* JADX INFO: renamed from: a */
        public final void mo587a(Drawable drawable) {
            ColorStateList colorStateList = C0211La.this.f713o;
            if (colorStateList != null) {
                C0893w5.a.m2176h(drawable, colorStateList);
            }
        }

        @Override // p000a.AbstractC0831t0
        /* JADX INFO: renamed from: b */
        public final void mo588b(Drawable drawable) {
            C0211La c0211La = C0211La.this;
            ColorStateList colorStateList = c0211La.f713o;
            if (colorStateList != null) {
                C0893w5.a.m2175g(drawable, colorStateList.getColorForState(c0211La.f717s, colorStateList.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: a.La$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m589a();
    }

    /* JADX INFO: renamed from: a.La$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m590a();
    }

    /* JADX INFO: renamed from: a.La$d */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f724a;

        /* JADX INFO: renamed from: a.La$d$a */
        public class a implements Parcelable.Creator<d> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.f724a = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.f724a;
            return C0944z.m2228h(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f724a));
        }
    }

    static {
        int i = C1247R.attr.state_error;
        f698A = new int[]{i};
        f699B = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f700C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0211La(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.checkboxStyle;
        int i2 = f701y;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        this.f703e = new LinkedHashSet<>();
        this.f704f = new LinkedHashSet<>();
        Context context2 = getContext();
        int i3 = C1247R.drawable.mtrl_checkbox_button_checked_unchecked;
        C0850u0 c0850u0 = new C0850u0(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
        Drawable drawableM1839a = C0787qd.a.m1839a(resources, i3, theme);
        c0850u0.f1914a = drawableM1839a;
        drawableM1839a.setCallback(c0850u0.f3332f);
        new C0850u0.c(c0850u0.f1914a.getConstantState());
        this.f721w = c0850u0;
        this.f722x = new a();
        Context context3 = getContext();
        this.f710l = C0114G3.m305a(this);
        this.f713o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = C1247R.styleable.MaterialCheckBox;
        C0523cf.m1298a(context3, attributeSet, i, i2);
        C0523cf.m1299b(context3, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C0751of c0751of = new C0751of(context3, typedArrayObtainStyledAttributes);
        this.f711m = c0751of.m1770b(C1247R.styleable.MaterialCheckBox_buttonIcon);
        if (this.f710l != null && C0955za.m2245b(context3, C1247R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == f700C && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f710l = C0889w1.m2115A(context3, C1247R.drawable.mtrl_checkbox_button);
                this.f712n = true;
                if (this.f711m == null) {
                    this.f711m = C0889w1.m2115A(context3, C1247R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f714p = C0336Sa.m924a(context3, c0751of, C1247R.styleable.MaterialCheckBox_buttonIconTint);
        this.f715q = C0324Rg.m896b(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f706h = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f707i = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f708j = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.MaterialCheckBox_errorShown, false);
        this.f709k = typedArrayObtainStyledAttributes.getText(C1247R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.MaterialCheckBox_checkedState, 0));
        }
        c0751of.m1773f();
        m586b();
    }

    private String getButtonStateDescription() {
        int i = this.f716r;
        return i == 1 ? getResources().getString(C1247R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C1247R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C1247R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f705g == null) {
            int iM684b = C0247Na.m684b(this, C1247R.attr.colorControlActivated);
            int iM684b2 = C0247Na.m684b(this, C1247R.attr.colorError);
            int iM684b3 = C0247Na.m684b(this, C1247R.attr.colorSurface);
            int iM684b4 = C0247Na.m684b(this, C1247R.attr.colorOnSurface);
            this.f705g = new ColorStateList(f699B, new int[]{C0247Na.m686d(iM684b3, iM684b2, 1.0f), C0247Na.m686d(iM684b3, iM684b, 1.0f), C0247Na.m686d(iM684b3, iM684b4, 0.54f), C0247Na.m686d(iM684b3, iM684b4, 0.38f), C0247Na.m686d(iM684b3, iM684b4, 0.38f)});
        }
        return this.f705g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f713o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public final void m586b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0869v0 c0869v0;
        Drawable drawableMutate = this.f710l;
        ColorStateList colorStateList3 = this.f713o;
        PorterDuff.Mode modeM256b = C0096F3.m256b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM256b != null) {
                C0893w5.a.m2177i(drawableMutate, modeM256b);
            }
        }
        this.f710l = drawableMutate;
        Drawable drawableMutate2 = this.f711m;
        ColorStateList colorStateList4 = this.f714p;
        PorterDuff.Mode mode = this.f715q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                C0893w5.a.m2177i(drawableMutate2, mode);
            }
        }
        this.f711m = drawableMutate2;
        if (this.f712n) {
            C0850u0 c0850u0 = this.f721w;
            if (c0850u0 != null) {
                Drawable drawable = c0850u0.f1914a;
                a aVar = this.f722x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f3299a == null) {
                        aVar.f3299a = new C0812s0(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f3299a);
                }
                ArrayList<AbstractC0831t0> arrayList = c0850u0.f3331e;
                C0850u0.b bVar = c0850u0.f3328b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0850u0.f3331e.size() == 0 && (c0869v0 = c0850u0.f3330d) != null) {
                        bVar.f3335b.removeListener(c0869v0);
                        c0850u0.f3330d = null;
                    }
                }
                Drawable drawable2 = c0850u0.f1914a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f3299a == null) {
                        aVar.f3299a = new C0812s0(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f3299a);
                } else if (aVar != null) {
                    if (c0850u0.f3331e == null) {
                        c0850u0.f3331e = new ArrayList<>();
                    }
                    if (!c0850u0.f3331e.contains(aVar)) {
                        c0850u0.f3331e.add(aVar);
                        if (c0850u0.f3330d == null) {
                            c0850u0.f3330d = new C0869v0(0, c0850u0);
                        }
                        bVar.f3335b.addListener(c0850u0.f3330d);
                    }
                }
            }
            Drawable drawable3 = this.f710l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0850u0 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(C1247R.id.checked, C1247R.id.unchecked, c0850u0, false);
                ((AnimatedStateListDrawable) this.f710l).addTransition(C1247R.id.indeterminate, C1247R.id.unchecked, c0850u0, false);
            }
        }
        Drawable drawable4 = this.f710l;
        if (drawable4 != null && (colorStateList2 = this.f713o) != null) {
            C0893w5.a.m2176h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f711m;
        if (drawable5 != null && (colorStateList = this.f714p) != null) {
            C0893w5.a.m2176h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f710l;
        Drawable drawable7 = this.f711m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f710l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f711m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f714p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f715q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f713o;
    }

    public int getCheckedState() {
        return this.f716r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f709k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f716r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f706h && this.f713o == null && this.f714p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f702z);
        }
        if (this.f708j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f698A);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f717s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM305a;
        if (!this.f707i || !TextUtils.isEmpty(getText()) || (drawableM305a = C0114G3.m305a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM305a.getIntrinsicWidth()) / 2) * (C0324Rg.m895a(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM305a.getBounds();
            C0893w5.a.m2174f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f708j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f709k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f724a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f724a = getCheckedState();
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.C0165J0, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0889w1.m2115A(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f711m = drawable;
        m586b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C0889w1.m2115A(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f714p == colorStateList) {
            return;
        }
        this.f714p = colorStateList;
        m586b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f715q == mode) {
            return;
        }
        this.f715q = mode;
        m586b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f713o == colorStateList) {
            return;
        }
        this.f713o = colorStateList;
        m586b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m586b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f707i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f716r != i) {
            this.f716r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f719u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f718t) {
                return;
            }
            this.f718t = true;
            LinkedHashSet<b> linkedHashSet = this.f704f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m589a();
                }
            }
            if (this.f716r != 2 && (onCheckedChangeListener = this.f720v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f718t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f709k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f708j == z) {
            return;
        }
        this.f708j = z;
        refreshDrawableState();
        Iterator<c> it = this.f703e.iterator();
        while (it.hasNext()) {
            it.next().m590a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f720v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f719u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f706h = z;
        if (z) {
            C0096F3.m257c(this, getMaterialThemeColorsTintList());
        } else {
            C0096F3.m257c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.C0165J0, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f710l = drawable;
        this.f712n = false;
        m586b();
    }
}
