package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import org.luckypray.dexkit.C1031R;
import p002B.C0052b;
import p002B.C0057g;
import p003B0.AbstractC0059a;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p037U.AbstractC0358S;
import p056f0.AbstractC0805P;
import p057g.AbstractC0920p;
import p058g0.AbstractC0942a;
import p060h0.C0946b;
import p074o0.C1026b;
import p074o0.C1027c;
import p074o0.C1028d;
import p074o0.C1030f;
import p074o0.InterfaceC1029e;
import p081s0.AbstractC1077k;
import p081s0.C1075i;
import p081s0.InterfaceC1071e;
import p084u0.C1099d;
import p086v0.AbstractC1110a;
import p087w.AbstractC1112b;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;
import p089x0.C1127k;
import p089x0.InterfaceC1138v;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AbstractC0920p implements InterfaceC1029e, InterfaceC1138v, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f2367w = new Rect();

    /* JADX INFO: renamed from: x */
    public static final int[] f2368x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y */
    public static final int[] f2369y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C1030f f2370e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f2371f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f2372g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f2373h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2374i;

    /* JADX INFO: renamed from: j */
    public boolean f2375j;

    /* JADX INFO: renamed from: k */
    public boolean f2376k;

    /* JADX INFO: renamed from: l */
    public boolean f2377l;

    /* JADX INFO: renamed from: m */
    public boolean f2378m;

    /* JADX INFO: renamed from: n */
    public boolean f2379n;

    /* JADX INFO: renamed from: o */
    public int f2380o;

    /* JADX INFO: renamed from: p */
    public int f2381p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2382q;

    /* JADX INFO: renamed from: r */
    public final C1028d f2383r;

    /* JADX INFO: renamed from: s */
    public boolean f2384s;

    /* JADX INFO: renamed from: t */
    public final Rect f2385t;

    /* JADX INFO: renamed from: u */
    public final RectF f2386u;

    /* JADX INFO: renamed from: v */
    public final C1026b f2387v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0059a.m197a(context, attributeSet, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        this.f2385t = new Rect();
        this.f2386u = new RectF();
        this.f2387v = new C1026b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C1030f c1030f = new C1030f(context2, attributeSet);
        int[] iArr = AbstractC0942a.f3331c;
        Context context3 = c1030f.f3815e0;
        AbstractC1077k.m2553a(context3, attributeSet, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(context3, attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        c1030f.f3790F0 = typedArrayObtainStyledAttributes.hasValue(37);
        ColorStateList colorStateListM2051r = AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 24);
        if (c1030f.f3834x != colorStateListM2051r) {
            c1030f.f3834x = colorStateListM2051r;
            c1030f.onStateChange(c1030f.getState());
        }
        ColorStateList colorStateListM2051r2 = AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 11);
        if (c1030f.f3836y != colorStateListM2051r2) {
            c1030f.f3836y = colorStateListM2051r2;
            c1030f.onStateChange(c1030f.getState());
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(19, 0.0f);
        if (c1030f.f3838z != dimension) {
            c1030f.f3838z = dimension;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            c1030f.m2481B(typedArrayObtainStyledAttributes.getDimension(12, 0.0f));
        }
        c1030f.m2486G(AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 22));
        c1030f.m2487H(typedArrayObtainStyledAttributes.getDimension(23, 0.0f));
        c1030f.m2496Q(AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 36));
        String text = typedArrayObtainStyledAttributes.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c1030f.f3787E, text)) {
            c1030f.f3787E = text;
            c1030f.f3821k0.f4175d = true;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        C1099d c1099d = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? null : new C1099d(context3, resourceId3);
        c1099d.f4243k = typedArrayObtainStyledAttributes.getDimension(1, c1099d.f4243k);
        c1030f.m2497R(c1099d);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
        if (i2 == 1) {
            c1030f.f3784C0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c1030f.f3784C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c1030f.f3784C0 = TextUtils.TruncateAt.END;
        }
        c1030f.m2485F(typedArrayObtainStyledAttributes.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1030f.m2485F(typedArrayObtainStyledAttributes.getBoolean(15, false));
        }
        c1030f.m2482C(AbstractC0805P.m2052t(context3, typedArrayObtainStyledAttributes, 14));
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            c1030f.m2484E(AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 17));
        }
        c1030f.m2483D(typedArrayObtainStyledAttributes.getDimension(16, -1.0f));
        c1030f.m2493N(typedArrayObtainStyledAttributes.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1030f.m2493N(typedArrayObtainStyledAttributes.getBoolean(26, false));
        }
        c1030f.m2488I(AbstractC0805P.m2052t(context3, typedArrayObtainStyledAttributes, 25));
        c1030f.m2492M(AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 30));
        c1030f.m2490K(typedArrayObtainStyledAttributes.getDimension(28, 0.0f));
        c1030f.m2508x(typedArrayObtainStyledAttributes.getBoolean(6, false));
        c1030f.m2480A(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1030f.m2480A(typedArrayObtainStyledAttributes.getBoolean(8, false));
        }
        c1030f.m2509y(AbstractC0805P.m2052t(context3, typedArrayObtainStyledAttributes, 7));
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            c1030f.m2510z(AbstractC0805P.m2051r(context3, typedArrayObtainStyledAttributes, 9));
        }
        c1030f.f3805U = (!typedArrayObtainStyledAttributes.hasValue(39) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(39, 0)) == 0) ? null : C0946b.m2278a(context3, resourceId2);
        c1030f.f3806V = (!typedArrayObtainStyledAttributes.hasValue(33) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(33, 0)) == 0) ? null : C0946b.m2278a(context3, resourceId);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(21, 0.0f);
        if (c1030f.f3807W != dimension2) {
            c1030f.f3807W = dimension2;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        c1030f.m2495P(typedArrayObtainStyledAttributes.getDimension(35, 0.0f));
        c1030f.m2494O(typedArrayObtainStyledAttributes.getDimension(34, 0.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(41, 0.0f);
        if (c1030f.f3810Z != dimension3) {
            c1030f.f3810Z = dimension3;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(40, 0.0f);
        if (c1030f.f3811a0 != dimension4) {
            c1030f.f3811a0 = dimension4;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        c1030f.m2491L(typedArrayObtainStyledAttributes.getDimension(29, 0.0f));
        c1030f.m2489J(typedArrayObtainStyledAttributes.getDimension(27, 0.0f));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(13, 0.0f);
        if (c1030f.f3814d0 != dimension5) {
            c1030f.f3814d0 = dimension5;
            c1030f.invalidateSelf();
            c1030f.m2506v();
        }
        c1030f.f3788E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        this.f2379n = typedArrayObtainStyledAttributes2.getBoolean(32, false);
        this.f2381p = (int) Math.ceil(typedArrayObtainStyledAttributes2.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes2.recycle();
        setChipDrawable(c1030f);
        c1030f.m2650j(AbstractC0070G.m219i(this));
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes3.hasValue(37);
        typedArrayObtainStyledAttributes3.recycle();
        this.f2383r = new C1028d(this, this);
        m1872e();
        if (!zHasValue) {
            setOutlineProvider(new C1027c(this));
        }
        setChecked(this.f2375j);
        setText(c1030f.f3787E);
        setEllipsize(c1030f.f3784C0);
        m1875h();
        if (!this.f2370e.f3786D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1874g();
        if (this.f2379n) {
            setMinHeight(this.f2381p);
        }
        this.f2380o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f3772a.f2374i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2386u;
        rectF.setEmpty();
        if (m1870c() && this.f2373h != null) {
            C1030f c1030f = this.f2370e;
            Rect bounds = c1030f.getBounds();
            rectF.setEmpty();
            if (c1030f.m2500U()) {
                float f2 = c1030f.f3814d0 + c1030f.f3813c0 + c1030f.f3799O + c1030f.f3812b0 + c1030f.f3811a0;
                if (AbstractC1112b.m2628a(c1030f) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2385t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private C1099d getTextAppearance() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3821k0.f4177f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2377l != z2) {
            this.f2377l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2376k != z2) {
            this.f2376k = z2;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1869b(int i2) {
        this.f2381p = i2;
        if (!this.f2379n) {
            InsetDrawable insetDrawable = this.f2371f;
            if (insetDrawable == null) {
                m1873f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2371f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1873f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.f2370e.f3838z));
        int iMax2 = Math.max(0, i2 - this.f2370e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f2371f;
            if (insetDrawable2 == null) {
                m1873f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2371f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1873f();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2371f != null) {
            Rect rect = new Rect();
            this.f2371f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                m1873f();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f2371f = new InsetDrawable((Drawable) this.f2370e, i3, i4, i3, i4);
        m1873f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1870c() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            Object obj = c1030f.f3796L;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC1114d) {
                ((AbstractC1115e) ((InterfaceC1114d) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1871d() {
        C1030f c1030f = this.f2370e;
        return c1030f != null && c1030f.f3801Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.f2384s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1028d c1028d = this.f2383r;
        AccessibilityManager accessibilityManager = c1028d.f491h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = c1028d.f3776q;
                int i3 = (chip.m1870c() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i4 = c1028d.f496m;
                if (i4 != i3) {
                    c1028d.f496m = i3;
                    c1028d.m668q(i3, 128);
                    c1028d.m668q(i4, 256);
                }
                if (i3 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i2 = c1028d.f496m) != Integer.MIN_VALUE) {
                if (i2 == Integer.MIN_VALUE) {
                    return true;
                }
                c1028d.f496m = Integer.MIN_VALUE;
                c1028d.m668q(i2, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2384s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1028d c1028d = this.f2383r;
        c1028d.getClass();
        boolean zM664m = false;
        int i2 = 0;
        zM664m = false;
        zM664m = false;
        zM664m = false;
        zM664m = false;
        zM664m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && c1028d.m664m(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                zM664m = z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i4 = c1028d.f495l;
                                if (i4 != Integer.MIN_VALUE) {
                                    Chip chip = c1028d.f3776q;
                                    if (i4 == 0) {
                                        chip.performClick();
                                    } else if (i4 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f2373h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f2384s) {
                                            chip.f2383r.m668q(1, 1);
                                        }
                                    }
                                }
                                zM664m = true;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM664m = c1028d.m664m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM664m = c1028d.m664m(1, null);
            }
        }
        if (!zM664m || c1028d.f495l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p057g.AbstractC0920p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        C1030f c1030f = this.f2370e;
        boolean zM2507w = false;
        if (c1030f != null && C1030f.m2479u(c1030f.f3796L)) {
            C1030f c1030f2 = this.f2370e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f2378m) {
                i3 = IsEnabled + 1;
            }
            int i4 = i3;
            if (this.f2377l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f2376k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f2378m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f2377l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f2376k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c1030f2.f3837y0, iArr)) {
                c1030f2.f3837y0 = iArr;
                if (c1030f2.m2500U()) {
                    zM2507w = c1030f2.m2507w(c1030f2.getState(), iArr);
                }
            }
        }
        if (zM2507w) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1872e() {
        C1030f c1030f;
        if (!m1870c() || (c1030f = this.f2370e) == null || !c1030f.f3795K || this.f2373h == null) {
            AbstractC0080Q.m291j(this, null);
            this.f2384s = false;
        } else {
            AbstractC0080Q.m291j(this, this.f2383r);
            this.f2384s = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1873f() {
        this.f2372g = new RippleDrawable(AbstractC1110a.m2618a(this.f2370e.f3785D), getBackgroundDrawable(), null);
        C1030f c1030f = this.f2370e;
        if (c1030f.f3839z0) {
            c1030f.f3839z0 = false;
            c1030f.f3780A0 = null;
            c1030f.onStateChange(c1030f.getState());
        }
        RippleDrawable rippleDrawable = this.f2372g;
        Field field = AbstractC0080Q.f219a;
        setBackground(rippleDrawable);
        m1874g();
    }

    /* JADX INFO: renamed from: g */
    public final void m1874g() {
        C1030f c1030f;
        if (TextUtils.isEmpty(getText()) || (c1030f = this.f2370e) == null) {
            return;
        }
        int iM2504r = (int) (c1030f.m2504r() + c1030f.f3814d0 + c1030f.f3811a0);
        C1030f c1030f2 = this.f2370e;
        int iM2503q = (int) (c1030f2.m2503q() + c1030f2.f3807W + c1030f2.f3810Z);
        if (this.f2371f != null) {
            Rect rect = new Rect();
            this.f2371f.getPadding(rect);
            iM2503q += rect.left;
            iM2504r += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC0080Q.f219a;
        setPaddingRelative(iM2503q, paddingTop, iM2504r, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2382q)) {
            return this.f2382q;
        }
        if (!m1871d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2371f;
        return insetDrawable == null ? this.f2370e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3803S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3804T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3836y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return Math.max(0.0f, c1030f.m2505s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2370e;
    }

    public float getChipEndPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3814d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1030f c1030f = this.f2370e;
        if (c1030f == null || (drawable = c1030f.f3791G) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1114d)) {
            return drawable;
        }
        ((AbstractC1115e) ((InterfaceC1114d) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3793I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3792H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3838z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3807W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3781B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3783C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1030f c1030f = this.f2370e;
        if (c1030f == null || (drawable = c1030f.f3796L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1114d)) {
            return drawable;
        }
        ((AbstractC1115e) ((InterfaceC1114d) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3800P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3813c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3799O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3812b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3798N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3784C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2384s) {
            C1028d c1028d = this.f2383r;
            if (c1028d.f495l == 1 || c1028d.f494k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0946b getHideMotionSpec() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3806V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3809Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3808X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3785D;
        }
        return null;
    }

    public C1127k getShapeAppearanceModel() {
        return this.f2370e.f4312a.f4290a;
    }

    public C0946b getShowMotionSpec() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3805U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3811a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            return c1030f.f3810Z;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m1875h() {
        TextPaint paint = getPaint();
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            paint.drawableState = c1030f.getState();
        }
        C1099d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m2589e(getContext(), paint, this.f2387v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0805P.m2042V(this, this.f2370e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2368x);
        }
        if (m1871d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2369y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f2384s) {
            C1028d c1028d = this.f2383r;
            int i3 = c1028d.f495l;
            if (i3 != Integer.MIN_VALUE) {
                c1028d.m661j(i3);
            }
            if (z2) {
                c1028d.m664m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m1871d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f2380o != i2) {
            this.f2380o = i2;
            m1874g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2376k) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                if (this.f2376k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f2373h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f2384s) {
                        this.f2383r.m668q(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2382q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2372g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // p057g.AbstractC0920p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2372g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p057g.AbstractC0920p, android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2508x(z2);
        }
    }

    public void setCheckableResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2508x(c1030f.f3815e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null) {
            this.f2375j = z2;
        } else if (c1030f.f3801Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2509y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2509y(AbstractC0358S.m916w(c1030f.f3815e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2510z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2510z(AbstractC0805P.m2049p(c1030f.f3815e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2480A(c1030f.f3815e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3836y == colorStateList) {
            return;
        }
        c1030f.f3836y = colorStateList;
        c1030f.onStateChange(c1030f.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateListM2049p;
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3836y == (colorStateListM2049p = AbstractC0805P.m2049p(c1030f.f3815e0, i2))) {
            return;
        }
        c1030f.f3836y = colorStateListM2049p;
        c1030f.onStateChange(c1030f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2481B(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2481B(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(C1030f c1030f) {
        C1030f c1030f2 = this.f2370e;
        if (c1030f2 != c1030f) {
            if (c1030f2 != null) {
                c1030f2.f3782B0 = new WeakReference(null);
            }
            this.f2370e = c1030f;
            c1030f.f3786D0 = false;
            c1030f.f3782B0 = new WeakReference(this);
            m1869b(this.f2381p);
        }
    }

    public void setChipEndPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3814d0 == f2) {
            return;
        }
        c1030f.f3814d0 = f2;
        c1030f.invalidateSelf();
        c1030f.m2506v();
    }

    public void setChipEndPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float dimension = c1030f.f3815e0.getResources().getDimension(i2);
            if (c1030f.f3814d0 != dimension) {
                c1030f.f3814d0 = dimension;
                c1030f.invalidateSelf();
                c1030f.m2506v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2482C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2482C(AbstractC0358S.m916w(c1030f.f3815e0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2483D(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2483D(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2484E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2484E(AbstractC0805P.m2049p(c1030f.f3815e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2485F(c1030f.f3815e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3838z == f2) {
            return;
        }
        c1030f.f3838z = f2;
        c1030f.invalidateSelf();
        c1030f.m2506v();
    }

    public void setChipMinHeightResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float dimension = c1030f.f3815e0.getResources().getDimension(i2);
            if (c1030f.f3838z != dimension) {
                c1030f.f3838z = dimension;
                c1030f.invalidateSelf();
                c1030f.m2506v();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3807W == f2) {
            return;
        }
        c1030f.f3807W = f2;
        c1030f.invalidateSelf();
        c1030f.m2506v();
    }

    public void setChipStartPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float dimension = c1030f.f3815e0.getResources().getDimension(i2);
            if (c1030f.f3807W != dimension) {
                c1030f.f3807W = dimension;
                c1030f.invalidateSelf();
                c1030f.m2506v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2486G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2486G(AbstractC0805P.m2049p(c1030f.f3815e0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2487H(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2487H(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2488I(drawable);
        }
        m1872e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3800P == charSequence) {
            return;
        }
        String str = C0052b.f185d;
        C0052b c0052b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0052b.f188g : C0052b.f187f;
        C0057g c0057g = c0052b.f191c;
        c1030f.f3800P = c0052b.m169c(charSequence);
        c1030f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2489J(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2489J(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2488I(AbstractC0358S.m916w(c1030f.f3815e0, i2));
        }
        m1872e();
    }

    public void setCloseIconSize(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2490K(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2490K(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2491L(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2491L(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2492M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2492M(AbstractC0805P.m2049p(c1030f.f3815e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // p057g.AbstractC0920p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p057g.AbstractC0920p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2650j(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2370e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3784C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2379n = z2;
        m1869b(this.f2381p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            return;
        }
        super.setGravity(i2);
    }

    public void setHideMotionSpec(C0946b c0946b) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3806V = c0946b;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3806V = C0946b.m2278a(c1030f.f3815e0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2494O(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2494O(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2495P(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2495P(c1030f.f3815e0.getResources().getDimension(i2));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1071e interfaceC1071e) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f2370e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3788E0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2374i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2373h = onClickListener;
        m1872e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2496Q(colorStateList);
        }
        if (this.f2370e.f3839z0) {
            return;
        }
        m1873f();
    }

    public void setRippleColorResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2496Q(AbstractC0805P.m2049p(c1030f.f3815e0, i2));
            if (this.f2370e.f3839z0) {
                return;
            }
            m1873f();
        }
    }

    @Override // p089x0.InterfaceC1138v
    public void setShapeAppearanceModel(C1127k c1127k) {
        this.f2370e.setShapeAppearanceModel(c1127k);
    }

    public void setShowMotionSpec(C0946b c0946b) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3805U = c0946b;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.f3805U = C0946b.m2278a(c1030f.f3815e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1030f.f3786D0 ? null : charSequence, bufferType);
        C1030f c1030f2 = this.f2370e;
        if (c1030f2 == null || TextUtils.equals(c1030f2.f3787E, charSequence)) {
            return;
        }
        c1030f2.f3787E = charSequence;
        c1030f2.f3821k0.f4175d = true;
        c1030f2.invalidateSelf();
        c1030f2.m2506v();
    }

    public void setTextAppearance(C1099d c1099d) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2497R(c1099d);
        }
        m1875h();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3811a0 == f2) {
            return;
        }
        c1030f.f3811a0 = f2;
        c1030f.invalidateSelf();
        c1030f.m2506v();
    }

    public void setTextEndPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float dimension = c1030f.f3815e0.getResources().getDimension(i2);
            if (c1030f.f3811a0 != dimension) {
                c1030f.f3811a0 = dimension;
                c1030f.invalidateSelf();
                c1030f.m2506v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics());
            C1075i c1075i = c1030f.f3821k0;
            C1099d c1099d = c1075i.f4177f;
            if (c1099d != null) {
                c1099d.f4243k = fApplyDimension;
                c1075i.f4172a.setTextSize(fApplyDimension);
                c1030f.m2506v();
                c1030f.invalidateSelf();
            }
        }
        m1875h();
    }

    public void setTextStartPadding(float f2) {
        C1030f c1030f = this.f2370e;
        if (c1030f == null || c1030f.f3810Z == f2) {
            return;
        }
        c1030f.f3810Z = f2;
        c1030f.invalidateSelf();
        c1030f.m2506v();
    }

    public void setTextStartPaddingResource(int i2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            float dimension = c1030f.f3815e0.getResources().getDimension(i2);
            if (c1030f.f3810Z != dimension) {
                c1030f.f3810Z = dimension;
                c1030f.invalidateSelf();
                c1030f.m2506v();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2493N(z2);
        }
        m1872e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2480A(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2485F(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2497R(new C1099d(c1030f.f3815e0, i2));
        }
        m1875h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C1030f c1030f = this.f2370e;
        if (c1030f != null) {
            c1030f.m2497R(new C1099d(c1030f.f3815e0, i2));
        }
        m1875h();
    }
}
