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
import java.util.Locale;
import p000.AbstractC0148Dc;
import p000.AbstractC0295Gu;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.AbstractC2447rA;
import p000.C0264G5;
import p000.C0728Qx;
import p000.C1037Y5;
import p000.C1146al;
import p000.C1481h3;
import p000.C2132k9;
import p000.C2162ks;
import p000.C2180l9;
import p000.C2223m9;
import p000.C2309o9;
import p000.C2404qA;
import p000.C2533tA;
import p000.InterfaceC0704QF;
import p000.InterfaceC0721Qq;
import p000.InterfaceC1300cy;
import p000.InterfaceC2266n9;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C1481h3 implements InterfaceC2266n9, InterfaceC1300cy, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f4508w = new Rect();

    /* JADX INFO: renamed from: x */
    public static final int[] f4509x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y */
    public static final int[] f4510y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C2309o9 f4511e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f4512f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f4513g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f4514h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f4515i;

    /* JADX INFO: renamed from: j */
    public boolean f4516j;

    /* JADX INFO: renamed from: k */
    public boolean f4517k;

    /* JADX INFO: renamed from: l */
    public boolean f4518l;

    /* JADX INFO: renamed from: m */
    public boolean f4519m;

    /* JADX INFO: renamed from: n */
    public boolean f4520n;

    /* JADX INFO: renamed from: o */
    public int f4521o;

    /* JADX INFO: renamed from: p */
    public int f4522p;

    /* JADX INFO: renamed from: q */
    public CharSequence f4523q;

    /* JADX INFO: renamed from: r */
    public final C2223m9 f4524r;

    /* JADX INFO: renamed from: s */
    public boolean f4525s;

    /* JADX INFO: renamed from: t */
    public final Rect f4526t;

    /* JADX INFO: renamed from: u */
    public final RectF f4527u;

    /* JADX INFO: renamed from: v */
    public final C2180l9 f4528v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0148Dc.m291y(context, attributeSet, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, io.github.cherrywechat.R.attr.chipStyle);
        this.f4526t = new Rect();
        this.f4527u = new RectF();
        this.f4528v = new C2180l9(0, this);
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
        C2309o9 c2309o9 = new C2309o9(context2, attributeSet);
        Context context3 = c2309o9.f8139n0;
        int[] iArr = AbstractC0939Vu.f2934c;
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context3, attributeSet, iArr, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c2309o9.f8113N0 = typedArrayM2534G.hasValue(37);
        Context context4 = c2309o9.f8139n0;
        ColorStateList colorStateListM1643j = AbstractC0828TB.m1643j(context4, typedArrayM2534G, 24);
        if (c2309o9.f8098G != colorStateListM1643j) {
            c2309o9.f8098G = colorStateListM1643j;
            c2309o9.onStateChange(c2309o9.getState());
        }
        ColorStateList colorStateListM1643j2 = AbstractC0828TB.m1643j(context4, typedArrayM2534G, 11);
        if (c2309o9.f8100H != colorStateListM1643j2) {
            c2309o9.f8100H = colorStateListM1643j2;
            c2309o9.onStateChange(c2309o9.getState());
        }
        float dimension = typedArrayM2534G.getDimension(19, 0.0f);
        if (c2309o9.f8102I != dimension) {
            c2309o9.f8102I = dimension;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        if (typedArrayM2534G.hasValue(12)) {
            c2309o9.m4694G(typedArrayM2534G.getDimension(12, 0.0f));
        }
        c2309o9.m4699L(AbstractC0828TB.m1643j(context4, typedArrayM2534G, 22));
        c2309o9.m4700M(typedArrayM2534G.getDimension(23, 0.0f));
        c2309o9.m4710W(AbstractC0828TB.m1643j(context4, typedArrayM2534G, 36));
        String text = typedArrayM2534G.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c2309o9.f8112N, text)) {
            c2309o9.f8112N = text;
            c2309o9.f8145t0.f8836d = true;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        C2404qA c2404qA = (!typedArrayM2534G.hasValue(0) || (resourceId3 = typedArrayM2534G.getResourceId(0, 0)) == 0) ? null : new C2404qA(context4, resourceId3);
        c2404qA.f8433l = typedArrayM2534G.getDimension(1, c2404qA.f8433l);
        c2309o9.m4711X(c2404qA);
        int i = typedArrayM2534G.getInt(3, 0);
        if (i == 1) {
            c2309o9.f8107K0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c2309o9.f8107K0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c2309o9.f8107K0 = TextUtils.TruncateAt.END;
        }
        c2309o9.m4698K(typedArrayM2534G.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2309o9.m4698K(typedArrayM2534G.getBoolean(15, false));
        }
        c2309o9.m4695H(AbstractC0828TB.m1644l(context4, typedArrayM2534G, 14));
        if (typedArrayM2534G.hasValue(17)) {
            c2309o9.m4697J(AbstractC0828TB.m1643j(context4, typedArrayM2534G, 17));
        }
        c2309o9.m4696I(typedArrayM2534G.getDimension(16, -1.0f));
        c2309o9.m4707T(typedArrayM2534G.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2309o9.m4707T(typedArrayM2534G.getBoolean(26, false));
        }
        c2309o9.m4701N(AbstractC0828TB.m1644l(context4, typedArrayM2534G, 25));
        c2309o9.m4706S(AbstractC0828TB.m1643j(context4, typedArrayM2534G, 30));
        c2309o9.m4703P(typedArrayM2534G.getDimension(28, 0.0f));
        c2309o9.m4690C(typedArrayM2534G.getBoolean(6, false));
        c2309o9.m4693F(typedArrayM2534G.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2309o9.m4693F(typedArrayM2534G.getBoolean(8, false));
        }
        c2309o9.m4691D(AbstractC0828TB.m1644l(context4, typedArrayM2534G, 7));
        if (typedArrayM2534G.hasValue(9)) {
            c2309o9.m4692E(AbstractC0828TB.m1643j(context4, typedArrayM2534G, 9));
        }
        c2309o9.f8129d0 = (!typedArrayM2534G.hasValue(39) || (resourceId2 = typedArrayM2534G.getResourceId(39, 0)) == 0) ? null : C2162ks.m4362a(context4, resourceId2);
        c2309o9.f8130e0 = (!typedArrayM2534G.hasValue(33) || (resourceId = typedArrayM2534G.getResourceId(33, 0)) == 0) ? null : C2162ks.m4362a(context4, resourceId);
        float dimension2 = typedArrayM2534G.getDimension(21, 0.0f);
        if (c2309o9.f8131f0 != dimension2) {
            c2309o9.f8131f0 = dimension2;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        c2309o9.m4709V(typedArrayM2534G.getDimension(35, 0.0f));
        c2309o9.m4708U(typedArrayM2534G.getDimension(34, 0.0f));
        float dimension3 = typedArrayM2534G.getDimension(41, 0.0f);
        if (c2309o9.f8134i0 != dimension3) {
            c2309o9.f8134i0 = dimension3;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        float dimension4 = typedArrayM2534G.getDimension(40, 0.0f);
        if (c2309o9.f8135j0 != dimension4) {
            c2309o9.f8135j0 = dimension4;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        c2309o9.m4704Q(typedArrayM2534G.getDimension(29, 0.0f));
        c2309o9.m4702O(typedArrayM2534G.getDimension(27, 0.0f));
        float dimension5 = typedArrayM2534G.getDimension(13, 0.0f);
        if (c2309o9.f8138m0 != dimension5) {
            c2309o9.f8138m0 = dimension5;
            c2309o9.invalidateSelf();
            c2309o9.m4688A();
        }
        c2309o9.f8111M0 = typedArrayM2534G.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM2534G.recycle();
        AbstractC1293cr.m2547f(context2, attributeSet, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1293cr.m2549h(context2, attributeSet, iArr, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4520n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueM2537P = AbstractC1293cr.m2537P(context2, io.github.cherrywechat.R.attr.minTouchTargetSize);
        this.f4522p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueM2537P == null || typedValueM2537P.type != 5) ? context2.getResources().getDimension(io.github.cherrywechat.R.dimen.mtrl_min_touch_target_size) : typedValueM2537P.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c2309o9);
        c2309o9.m1927m(getElevation());
        AbstractC1293cr.m2547f(context2, attributeSet, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1293cr.m2549h(context2, attributeSet, iArr, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f4524r = new C2223m9(this, this);
        m2463d();
        if (!zHasValue) {
            setOutlineProvider(new C1146al(this, 2));
        }
        setChecked(this.f4516j);
        setText(c2309o9.f8112N);
        setEllipsize(c2309o9.f8107K0);
        m2466g();
        if (!this.f4511e.f8109L0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m2465f();
        if (this.f4520n) {
            setMinHeight(this.f4522p);
        }
        this.f4521o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C2132k9(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f4527u;
        rectF.setEmpty();
        if (m2462c() && this.f4514h != null) {
            C2309o9 c2309o9 = this.f4511e;
            Rect bounds = c2309o9.getBounds();
            rectF.setEmpty();
            if (c2309o9.m4714a0()) {
                float f = c2309o9.f8138m0 + c2309o9.f8137l0 + c2309o9.f8123X + c2309o9.f8136k0 + c2309o9.f8135j0;
                if (c2309o9.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
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
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f4526t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C2404qA getTextAppearance() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8145t0.f8838f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f4518l != z) {
            this.f4518l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f4517k != z) {
            this.f4517k = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2461b(int i) {
        this.f4522p = i;
        if (!this.f4520n) {
            InsetDrawable insetDrawable = this.f4512f;
            if (insetDrawable == null) {
                m2464e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f4512f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2464e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f4511e.f8102I));
        int iMax2 = Math.max(0, i - this.f4511e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f4512f;
            if (insetDrawable2 == null) {
                m2464e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f4512f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2464e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f4512f != null) {
            Rect rect = new Rect();
            this.f4512f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m2464e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f4512f = new InsetDrawable((Drawable) this.f4511e, i2, i3, i2, i3);
        m2464e();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2462c() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null) {
            return false;
        }
        Object obj = c2309o9.f8120U;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC0704QF) {
            obj = null;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2463d() {
        C2309o9 c2309o9;
        if (!m2462c() || (c2309o9 = this.f4511e) == null || !c2309o9.f8119T || this.f4514h == null) {
            AbstractC2185lE.m4399l(this, null);
            this.f4525s = false;
        } else {
            AbstractC2185lE.m4399l(this, this.f4524r);
            this.f4525s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f4525s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C2223m9 c2223m9 = this.f4524r;
        AccessibilityManager accessibilityManager = c2223m9.f7729h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = c2223m9.f7735n;
                if (chip.m2462c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = c2223m9.f7734m;
                if (i3 != i2) {
                    c2223m9.f7734m = i2;
                    c2223m9.m4481q(i2, 128);
                    c2223m9.m4481q(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = c2223m9.f7734m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    c2223m9.f7734m = Integer.MIN_VALUE;
                    c2223m9.m4481q(Integer.MIN_VALUE, 128);
                    c2223m9.m4481q(i, 256);
                    return true;
                }
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f4525s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C2223m9 c2223m9 = this.f4524r;
        c2223m9.getClass();
        boolean zM4477m = false;
        int i = 0;
        zM4477m = false;
        zM4477m = false;
        zM4477m = false;
        zM4477m = false;
        zM4477m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && c2223m9.m4477m(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                zM4477m = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i3 = c2223m9.f7733l;
                                if (i3 != Integer.MIN_VALUE) {
                                    Chip chip = c2223m9.f7735n;
                                    if (i3 == 0) {
                                        chip.performClick();
                                    } else if (i3 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f4514h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f4525s) {
                                            chip.f4524r.m4481q(1, 1);
                                        }
                                    }
                                }
                                zM4477m = true;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM4477m = c2223m9.m4477m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM4477m = c2223m9.m4477m(1, null);
            }
        }
        if (!zM4477m || c2223m9.f7733l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.C1481h3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2309o9 c2309o9 = this.f4511e;
        boolean zM4705R = false;
        int i = 0;
        zM4705R = false;
        if (c2309o9 != null && C2309o9.m4687z(c2309o9.f8120U)) {
            C2309o9 c2309o92 = this.f4511e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f4519m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f4518l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f4517k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f4519m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f4518l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f4517k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM4705R = c2309o92.m4705R(iArr);
        }
        if (zM4705R) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2464e() {
        ColorStateList colorStateListValueOf = this.f4511e.f8110M;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.f4513g = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.f4511e.getClass();
        setBackground(this.f4513g);
        m2465f();
    }

    /* JADX INFO: renamed from: f */
    public final void m2465f() {
        C2309o9 c2309o9;
        if (TextUtils.isEmpty(getText()) || (c2309o9 = this.f4511e) == null) {
            return;
        }
        int iM4718w = (int) (c2309o9.m4718w() + c2309o9.f8138m0 + c2309o9.f8135j0);
        C2309o9 c2309o92 = this.f4511e;
        int iM4717v = (int) (c2309o92.m4717v() + c2309o92.f8131f0 + c2309o92.f8134i0);
        if (this.f4512f != null) {
            Rect rect = new Rect();
            this.f4512f.getPadding(rect);
            iM4717v += rect.left;
            iM4718w += rect.right;
        }
        setPaddingRelative(iM4717v, getPaddingTop(), iM4718w, getPaddingBottom());
    }

    /* JADX INFO: renamed from: g */
    public final void m2466g() {
        TextPaint paint = getPaint();
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            paint.drawableState = c2309o9.getState();
        }
        C2404qA textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4840d(getContext(), paint, this.f4528v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f4523q)) {
            return this.f4523q;
        }
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || !c2309o9.f8125Z) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4512f;
        return insetDrawable == null ? this.f4511e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8127b0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8128c0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8100H;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return Math.max(0.0f, c2309o9.m4719x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4511e;
    }

    public float getChipEndPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8138m0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || (drawable = c2309o9.f8115P) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0704QF)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8117R;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8116Q;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8102I;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8131f0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8106K;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8108L;
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
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || (drawable = c2309o9.f8120U) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0704QF)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8124Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8137l0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8123X;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8136k0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8122W;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8107K0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f4525s) {
            C2223m9 c2223m9 = this.f4524r;
            if (c2223m9.f7733l == 1 || c2223m9.f7732k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C2162ks getHideMotionSpec() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8130e0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8133h0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8132g0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8110M;
        }
        return null;
    }

    public C0728Qx getShapeAppearanceModel() {
        return this.f4511e.f3241b.f2902a;
    }

    public C2162ks getShowMotionSpec() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8129d0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8135j0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            return c2309o9.f8134i0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1406fG.m2714n0(this, this.f4511e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4509x);
        }
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null && c2309o9.f8125Z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4510y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f4525s) {
            C2223m9 c2223m9 = this.f4524r;
            int i2 = c2223m9.f7733l;
            if (i2 != Integer.MIN_VALUE) {
                c2223m9.m4474j(i2);
            }
            if (z) {
                c2223m9.m4477m(i, rect);
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
        C2309o9 c2309o9 = this.f4511e;
        accessibilityNodeInfo.setCheckable(c2309o9 != null && c2309o9.f8125Z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f4521o != i) {
            this.f4521o = i;
            m2465f();
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
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f4517k) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else {
                if (this.f4517k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f4514h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f4525s) {
                        this.f4524r.m4481q(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f4523q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4513g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // p000.C1481h3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4513g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p000.C1481h3, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4690C(z);
        }
    }

    public void setCheckableResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4690C(c2309o9.f8139n0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null) {
            this.f4516j = z;
        } else if (c2309o9.f8125Z) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4691D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4691D(AbstractC1406fG.m2695U(c2309o9.f8139n0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4692E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4692E(AbstractC0295Gu.m622o(c2309o9.f8139n0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4693F(c2309o9.f8139n0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8100H == colorStateList) {
            return;
        }
        c2309o9.f8100H = colorStateList;
        c2309o9.onStateChange(c2309o9.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM622o;
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8100H == (colorStateListM622o = AbstractC0295Gu.m622o(c2309o9.f8139n0, i))) {
            return;
        }
        c2309o9.f8100H = colorStateListM622o;
        c2309o9.onStateChange(c2309o9.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4694G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4694G(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C2309o9 c2309o9) {
        C2309o9 c2309o92 = this.f4511e;
        if (c2309o92 != c2309o9) {
            if (c2309o92 != null) {
                c2309o92.f8105J0 = new WeakReference(null);
            }
            this.f4511e = c2309o9;
            c2309o9.f8109L0 = false;
            c2309o9.f8105J0 = new WeakReference(this);
            m2461b(this.f4522p);
        }
    }

    public void setChipEndPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8138m0 == f) {
            return;
        }
        c2309o9.f8138m0 = f;
        c2309o9.invalidateSelf();
        c2309o9.m4688A();
    }

    public void setChipEndPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float dimension = c2309o9.f8139n0.getResources().getDimension(i);
            if (c2309o9.f8138m0 != dimension) {
                c2309o9.f8138m0 = dimension;
                c2309o9.invalidateSelf();
                c2309o9.m4688A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4695H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4695H(AbstractC1406fG.m2695U(c2309o9.f8139n0, i));
        }
    }

    public void setChipIconSize(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4696I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4696I(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4697J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4697J(AbstractC0295Gu.m622o(c2309o9.f8139n0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4698K(c2309o9.f8139n0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8102I == f) {
            return;
        }
        c2309o9.f8102I = f;
        c2309o9.invalidateSelf();
        c2309o9.m4688A();
    }

    public void setChipMinHeightResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float dimension = c2309o9.f8139n0.getResources().getDimension(i);
            if (c2309o9.f8102I != dimension) {
                c2309o9.f8102I = dimension;
                c2309o9.invalidateSelf();
                c2309o9.m4688A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8131f0 == f) {
            return;
        }
        c2309o9.f8131f0 = f;
        c2309o9.invalidateSelf();
        c2309o9.m4688A();
    }

    public void setChipStartPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float dimension = c2309o9.f8139n0.getResources().getDimension(i);
            if (c2309o9.f8131f0 != dimension) {
                c2309o9.f8131f0 = dimension;
                c2309o9.invalidateSelf();
                c2309o9.m4688A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4699L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4699L(AbstractC0295Gu.m622o(c2309o9.f8139n0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4700M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4700M(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4701N(drawable);
        }
        m2463d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8124Y == charSequence) {
            return;
        }
        String str = C0264G5.f846b;
        C0264G5 c0264g5 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0264G5.f849e : C0264G5.f848d;
        c0264g5.getClass();
        C1037Y5 c1037y5 = AbstractC2447rA.f8572a;
        c2309o9.f8124Y = c0264g5.m550c(charSequence);
        c2309o9.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4702O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4702O(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4701N(AbstractC1406fG.m2695U(c2309o9.f8139n0, i));
        }
        m2463d();
    }

    public void setCloseIconSize(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4703P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4703P(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4704Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4704Q(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4706S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4706S(AbstractC0295Gu.m622o(c2309o9.f8139n0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.C1481h3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.C1481h3, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m1927m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4511e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8107K0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f4520n = z;
        m2461b(this.f4522p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C2162ks c2162ks) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8130e0 = c2162ks;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8130e0 = C2162ks.m4362a(c2309o9.f8139n0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4708U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4708U(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4709V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4709V(c2309o9.f8139n0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0721Qq interfaceC0721Qq) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f4511e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8111M0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4515i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f4514h = onClickListener;
        m2463d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4710W(colorStateList);
        }
        this.f4511e.getClass();
        m2464e();
    }

    public void setRippleColorResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4710W(AbstractC0295Gu.m622o(c2309o9.f8139n0, i));
            this.f4511e.getClass();
            m2464e();
        }
    }

    @Override // p000.InterfaceC1300cy
    public void setShapeAppearanceModel(C0728Qx c0728Qx) {
        this.f4511e.setShapeAppearanceModel(c0728Qx);
    }

    public void setShowMotionSpec(C2162ks c2162ks) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8129d0 = c2162ks;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.f8129d0 = C2162ks.m4362a(c2309o9.f8139n0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2309o9.f8109L0 ? null : charSequence, bufferType);
        C2309o9 c2309o92 = this.f4511e;
        if (c2309o92 == null || TextUtils.equals(c2309o92.f8112N, charSequence)) {
            return;
        }
        c2309o92.f8112N = charSequence;
        c2309o92.f8145t0.f8836d = true;
        c2309o92.invalidateSelf();
        c2309o92.m4688A();
    }

    public void setTextAppearance(C2404qA c2404qA) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4711X(c2404qA);
        }
        m2466g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8135j0 == f) {
            return;
        }
        c2309o9.f8135j0 = f;
        c2309o9.invalidateSelf();
        c2309o9.m4688A();
    }

    public void setTextEndPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float dimension = c2309o9.f8139n0.getResources().getDimension(i);
            if (c2309o9.f8135j0 != dimension) {
                c2309o9.f8135j0 = dimension;
                c2309o9.invalidateSelf();
                c2309o9.m4688A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C2533tA c2533tA = c2309o9.f8145t0;
            C2404qA c2404qA = c2533tA.f8838f;
            if (c2404qA != null) {
                c2404qA.f8433l = fApplyDimension;
                c2533tA.f8833a.setTextSize(fApplyDimension);
                c2309o9.m4688A();
                c2309o9.invalidateSelf();
            }
        }
        m2466g();
    }

    public void setTextStartPadding(float f) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 == null || c2309o9.f8134i0 == f) {
            return;
        }
        c2309o9.f8134i0 = f;
        c2309o9.invalidateSelf();
        c2309o9.m4688A();
    }

    public void setTextStartPaddingResource(int i) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            float dimension = c2309o9.f8139n0.getResources().getDimension(i);
            if (c2309o9.f8134i0 != dimension) {
                c2309o9.f8134i0 = dimension;
                c2309o9.invalidateSelf();
                c2309o9.m4688A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4707T(z);
        }
        m2463d();
    }

    public void setCheckedIconVisible(boolean z) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4693F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4698K(z);
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4711X(new C2404qA(c2309o9.f8139n0, i));
        }
        m2466g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2309o9 c2309o9 = this.f4511e;
        if (c2309o9 != null) {
            c2309o9.m4711X(new C2404qA(c2309o9.f8139n0, i));
        }
        m2466g();
    }
}
