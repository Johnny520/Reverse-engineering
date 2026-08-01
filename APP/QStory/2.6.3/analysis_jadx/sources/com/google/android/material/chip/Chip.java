package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.C0064;
import androidx.appcompat.widget.C0196;
import androidx.core.view.AbstractC2270;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.internal.C3155;
import com.google.android.material.internal.C3156;
import com.google.android.material.internal.InterfaceC3165;
import com.google.android.material.internal.InterfaceC3166;
import io.ktor.client.plugins.AbstractC3933;
import java.lang.ref.WeakReference;
import java.util.Locale;
import lin.xposed.hook.javaplugin.view.C5538;
import p034.AbstractC6344;
import p053.AbstractC6561;
import p124.C7413;
import p152.AbstractC7590;
import p152.C7594;
import p162.AbstractC7653;
import p175.AbstractC7739;
import p257.C8220;
import p268.AbstractC8267;
import p301.AbstractC8607;
import p301.C8605;
import p301.C8606;
import p305.C8640;
import p305.InterfaceC8619;
import p307.AbstractC8650;
import p310.C8654;
import p314.AbstractC8661;
import p317.C8671;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0196 implements InterfaceC8619, InterfaceC3166 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3156 f10215;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f10216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10217;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10218;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10219;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10220;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f10221;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC3165 f10222;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Rect f10223;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10224;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8606 f10225;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f10226;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10227;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10228;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8605 f10229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public View.OnClickListener f10230;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10231;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InsetDrawable f10232;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public RippleDrawable f10233;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final Rect f10214 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10213 = {R.attr.state_selected};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10212 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC8267.m13829(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle);
        this.f10223 = new Rect();
        this.f10216 = new RectF();
        this.f10215 = new C3156(this, 1);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                C5925.m11308("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                C5925.m11308("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                C5925.m11308("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                C5925.m11308("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                C5925.m11308("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C8605 c8605 = new C8605(context2, attributeSet);
        Context context3 = c8605.f24097;
        int[] iArr = AbstractC8661.f24426;
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context3, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c8605.f24081 = typedArrayM7182.hasValue(39);
        Context context4 = c8605.f24097;
        ColorStateList colorStateListM13073 = AbstractC7739.m13073(context4, typedArrayM7182, 25);
        if (c8605.f24080 != colorStateListM13073) {
            c8605.f24080 = colorStateListM13073;
            c8605.onStateChange(c8605.getState());
        }
        ColorStateList colorStateListM130732 = AbstractC7739.m13073(context4, typedArrayM7182, 12);
        if (c8605.f24135 != colorStateListM130732) {
            c8605.f24135 = colorStateListM130732;
            c8605.onStateChange(c8605.getState());
        }
        float dimension = typedArrayM7182.getDimension(20, 0.0f);
        if (c8605.f24134 != dimension) {
            c8605.f24134 = dimension;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        if (typedArrayM7182.hasValue(13)) {
            c8605.m14253(typedArrayM7182.getDimension(13, 0.0f));
        }
        c8605.m14244(AbstractC7739.m13073(context4, typedArrayM7182, 23));
        c8605.m14247(typedArrayM7182.getDimension(24, 0.0f));
        c8605.m14267(AbstractC7739.m13073(context4, typedArrayM7182, 38));
        int i = 5;
        String text = typedArrayM7182.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c8605.f24121, text)) {
            c8605.f24121 = text;
            c8605.f24111.f10504 = true;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        C8654 c8654 = (!typedArrayM7182.hasValue(0) || (resourceId3 = typedArrayM7182.getResourceId(0, 0)) == 0) ? null : new C8654(context4, resourceId3);
        c8654.f24390 = typedArrayM7182.getDimension(1, c8654.f24390);
        int i2 = typedArrayM7182.hasValue(34) ? 34 : 7;
        if (typedArrayM7182.hasValue(i2)) {
            c8654.f24380 = typedArrayM7182.getString(i2);
        }
        c8605.m14266(c8654);
        int i3 = typedArrayM7182.getInt(3, 0);
        if (i3 == 1) {
            c8605.f24082 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            c8605.f24082 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            c8605.f24082 = TextUtils.TruncateAt.END;
        }
        c8605.m14245(typedArrayM7182.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c8605.m14245(typedArrayM7182.getBoolean(16, false));
        }
        c8605.m14252(AbstractC7739.m13076(context4, typedArrayM7182, 15));
        if (typedArrayM7182.hasValue(18)) {
            c8605.m14249(AbstractC7739.m13073(context4, typedArrayM7182, 18));
        }
        c8605.m14248(typedArrayM7182.getDimension(17, -1.0f));
        c8605.m14273(typedArrayM7182.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c8605.m14273(typedArrayM7182.getBoolean(27, false));
        }
        c8605.m14246(AbstractC7739.m13076(context4, typedArrayM7182, 26));
        c8605.m14272(AbstractC7739.m13073(context4, typedArrayM7182, 31));
        c8605.m14243(typedArrayM7182.getDimension(29, 0.0f));
        c8605.m14260(typedArrayM7182.getBoolean(6, false));
        c8605.m14250(typedArrayM7182.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c8605.m14250(typedArrayM7182.getBoolean(9, false));
        }
        c8605.m14259(AbstractC7739.m13076(context4, typedArrayM7182, 8));
        if (typedArrayM7182.hasValue(10)) {
            c8605.m14251(AbstractC7739.m13073(context4, typedArrayM7182, 10));
        }
        c8605.f24125 = (!typedArrayM7182.hasValue(41) || (resourceId2 = typedArrayM7182.getResourceId(41, 0)) == 0) ? null : C8671.m14395(context4, resourceId2);
        c8605.f24124 = (!typedArrayM7182.hasValue(35) || (resourceId = typedArrayM7182.getResourceId(35, 0)) == 0) ? null : C8671.m14395(context4, resourceId);
        float dimension2 = typedArrayM7182.getDimension(22, 0.0f);
        if (c8605.f24105 != dimension2) {
            c8605.f24105 = dimension2;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        c8605.m14271(typedArrayM7182.getDimension(37, 0.0f));
        c8605.m14270(typedArrayM7182.getDimension(36, 0.0f));
        float dimension3 = typedArrayM7182.getDimension(43, 0.0f);
        if (c8605.f24109 != dimension3) {
            c8605.f24109 = dimension3;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        float dimension4 = typedArrayM7182.getDimension(42, 0.0f);
        if (c8605.f24106 != dimension4) {
            c8605.f24106 = dimension4;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        c8605.m14269(typedArrayM7182.getDimension(30, 0.0f));
        c8605.m14242(typedArrayM7182.getDimension(28, 0.0f));
        float dimension5 = typedArrayM7182.getDimension(14, 0.0f);
        if (c8605.f24094 != dimension5) {
            c8605.f24094 = dimension5;
            c8605.invalidateSelf();
            c8605.m14262();
        }
        c8605.f24084 = typedArrayM7182.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM7182.recycle();
        AbstractC3160.m7186(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3160.m7185(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        this.f10217 = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueM12040 = AbstractC6561.m12040(theme, com.davemorrissey.labs.subscaleview.R.attr.minTouchTargetSize);
        this.f10227 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN((typedValueM12040 == null || typedValueM12040.type != 5) ? Float.NaN : typedValueM12040.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_min_touch_target_size) : r6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c8605);
        c8605.m14340(getElevation());
        AbstractC3160.m7186(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3160.m7185(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.f10225 = new C8606(this, this);
        m7087();
        if (!zHasValue) {
            setOutlineProvider(new C8220(this, i));
        }
        setChecked(this.f10221);
        setText(c8605.f24121);
        setEllipsize(c8605.f24082);
        m7090();
        if (!this.f10229.f24085) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m7085();
        if (this.f10217) {
            setMinHeight(this.f10227);
        }
        this.f10228 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C5538(this, 2));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f10216;
        rectF.setEmpty();
        if (m7088() && this.f10230 != null) {
            C8605 c8605 = this.f10229;
            Rect bounds = c8605.getBounds();
            rectF.setEmpty();
            if (c8605.m14263()) {
                float f = c8605.f24094 + c8605.f24095 + c8605.f24131 + c8605.f24107 + c8605.f24106;
                if (c8605.getLayoutDirection() == 0) {
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
        Rect rect = this.f10223;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C8654 getTextAppearance() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24111.f10502;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10219 != z) {
            this.f10219 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10220 != z) {
            this.f10220 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f10224
            if (r0 != 0) goto L9
            boolean r7 = super.dispatchHoverEvent(r8)
            return r7
        L9:
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r7.f10225
            android.view.accessibility.AccessibilityManager r1 = r0.f20967
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r8.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.f20961
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f20961 = r2
            r0.m13038(r2, r6)
            r0.m13038(r1, r5)
            return r4
        L42:
            float r7 = r8.getX()
            float r8 = r8.getY()
            com.google.android.material.chip.Chip r1 = r0.f24140
            boolean r2 = r1.m7088()
            if (r2 == 0) goto L5d
            android.graphics.RectF r1 = r1.getCloseIconTouchBounds()
            boolean r7 = r1.contains(r7, r8)
            if (r7 == 0) goto L5d
            r3 = r4
        L5d:
            int r7 = r0.f20961
            if (r7 != r3) goto L62
            goto L71
        L62:
            r0.f20961 = r3
            r0.m13038(r3, r6)
            r0.m13038(r7, r5)
            return r4
        L6b:
            boolean r7 = super.dispatchHoverEvent(r8)
            if (r7 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f10224
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r9.f10225
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m13036(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f20962
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f24140
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f10230
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f10224
            if (r1 == 0) goto L85
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r1 = r5.f10225
            r1.m13038(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m13036(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m13036(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f20962
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.C0196, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8605 c8605 = this.f10229;
        boolean zM14268 = false;
        int i = 0;
        zM14268 = false;
        if (c8605 != null && C8605.m14239(c8605.f24133)) {
            C8605 c86052 = this.f10229;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f10218) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f10219) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f10220) {
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
            if (this.f10218) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f10219) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f10220) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM14268 = c86052.m14268(iArr);
        }
        if (zM14268) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f10226)) {
            return this.f10226;
        }
        C8605 c8605 = this.f10229;
        if (c8605 == null || !c8605.f24126) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof AbstractC8607) && ((AbstractC8607) parent).f24143.f10498) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10232;
        return insetDrawable == null ? this.f10229 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24123;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24122;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24135;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return Math.max(0.0f, c8605.m14254());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10229;
    }

    public float getChipEndPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24094;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C8605 c8605 = this.f10229;
        if (c8605 == null || (drawable = c8605.f24119) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24117;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24118;
        }
        return null;
    }

    public float getChipMinHeight() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24134;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24105;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24139;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24136;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C8605 c8605 = this.f10229;
        if (c8605 == null || (drawable = c8605.f24133) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24130;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24095;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24131;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24107;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24128;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24082;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f10224) {
            C8606 c8606 = this.f10225;
            if (c8606.f20962 == 1 || c8606.f20963 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        C8605 c8605 = this.f10229;
        if (c8605 == null) {
            return super.getFontVariationSettings();
        }
        C8654 c8654 = c8605.f24111.f10502;
        if (c8654 != null) {
            return c8654.f24380;
        }
        return null;
    }

    public C8671 getHideMotionSpec() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24124;
        }
        return null;
    }

    public float getIconEndPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24108;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24104;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24137;
        }
        return null;
    }

    public C8640 getShapeAppearanceModel() {
        return this.f10229.m14348();
    }

    public C8671 getShowMotionSpec() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24125;
        }
        return null;
    }

    public float getTextEndPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24106;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            return c8605.f24109;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC6344.m11869(this, this.f10229);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10213);
        }
        C8605 c8605 = this.f10229;
        if (c8605 != null && c8605.f24126) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10212);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f10224) {
            C8606 c8606 = this.f10225;
            int i2 = c8606.f20962;
            if (i2 != Integer.MIN_VALUE) {
                c8606.m13043(i2);
            }
            if (z) {
                c8606.m13036(i, rect);
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
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C8605 c8605 = this.f10229;
        accessibilityNodeInfo.setCheckable(c8605 != null && c8605.f24126);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof AbstractC8607) {
            AbstractC8607 abstractC8607 = (AbstractC8607) getParent();
            if (abstractC8607.f10524) {
                i = 0;
                for (int i2 = 0; i2 < abstractC8607.getChildCount(); i2++) {
                    View childAt = abstractC8607.getChildAt(i2);
                    if ((childAt instanceof Chip) && abstractC8607.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.davemorrissey.labs.subscaleview.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C7413.m12642(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f20099);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10228 != i) {
            this.f10228 = i;
            m7085();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f10220
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f10220
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f10230
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f10224
            if (r0 == 0) goto L43
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r5.f10225
            r0.m13038(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f10226 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10233) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0196, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10233) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0196, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14260(z);
        }
    }

    public void setCheckableResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14260(c8605.f24097.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C8605 c8605 = this.f10229;
        if (c8605 == null) {
            this.f10221 = z;
        } else if (c8605.f24126) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14259(drawable);
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
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14259(AbstractC3933.m8312(c8605.f24097, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14251(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14251(AbstractC7653.m12919(c8605.f24097, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14250(c8605.f24097.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24135 == colorStateList) {
            return;
        }
        c8605.f24135 = colorStateList;
        c8605.onStateChange(c8605.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM12919;
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24135 == (colorStateListM12919 = AbstractC7653.m12919(c8605.f24097, i))) {
            return;
        }
        c8605.f24135 = colorStateListM12919;
        c8605.onStateChange(c8605.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14253(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14253(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C8605 c8605) {
        C8605 c86052 = this.f10229;
        if (c86052 != c8605) {
            if (c86052 != null) {
                c86052.f24083 = new WeakReference(null);
            }
            this.f10229 = c8605;
            c8605.f24085 = false;
            c8605.f24083 = new WeakReference(this);
            m7089(this.f10227);
        }
    }

    public void setChipEndPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24094 == f) {
            return;
        }
        c8605.f24094 = f;
        c8605.invalidateSelf();
        c8605.m14262();
    }

    public void setChipEndPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float dimension = c8605.f24097.getResources().getDimension(i);
            if (c8605.f24094 != dimension) {
                c8605.f24094 = dimension;
                c8605.invalidateSelf();
                c8605.m14262();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14252(drawable);
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
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14252(AbstractC3933.m8312(c8605.f24097, i));
        }
    }

    public void setChipIconSize(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14248(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14248(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14249(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14249(AbstractC7653.m12919(c8605.f24097, i));
        }
    }

    public void setChipIconVisible(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14245(c8605.f24097.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24134 == f) {
            return;
        }
        c8605.f24134 = f;
        c8605.invalidateSelf();
        c8605.m14262();
    }

    public void setChipMinHeightResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float dimension = c8605.f24097.getResources().getDimension(i);
            if (c8605.f24134 != dimension) {
                c8605.f24134 = dimension;
                c8605.invalidateSelf();
                c8605.m14262();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24105 == f) {
            return;
        }
        c8605.f24105 = f;
        c8605.invalidateSelf();
        c8605.m14262();
    }

    public void setChipStartPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float dimension = c8605.f24097.getResources().getDimension(i);
            if (c8605.f24105 != dimension) {
                c8605.f24105 = dimension;
                c8605.invalidateSelf();
                c8605.m14262();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14244(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14244(AbstractC7653.m12919(c8605.f24097, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14247(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14247(c8605.f24097.getResources().getDimension(i));
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
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14246(drawable);
        }
        m7087();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24130 == charSequence) {
            return;
        }
        String str = C7594.f20585;
        C7594 c7594 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C7594.f20582 : C7594.f20583;
        c7594.getClass();
        C0064 c0064 = AbstractC7590.f20576;
        c8605.f24130 = c7594.m12823(charSequence);
        c8605.invalidateSelf();
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
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14242(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14242(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14246(AbstractC3933.m8312(c8605.f24097, i));
        }
        m7087();
    }

    public void setCloseIconSize(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14243(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14243(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14269(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14269(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14272(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14272(AbstractC7653.m12919(c8605.f24097, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5925.m11308("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            C5925.m11308("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5925.m11308("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            C5925.m11308("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C5925.m11308("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C5925.m11308("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C5925.m11308("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C5925.m11308("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14340(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10229 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            C5925.m11308("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24082 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10217 = z;
        m7089(this.f10227);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        C8605 c8605 = this.f10229;
        if (c8605 == null) {
            return false;
        }
        C8654 c8654 = c8605.f24111.f10502;
        if (c8654 != null) {
            c8654.f24380 = str;
        }
        m7090();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C8671 c8671) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24124 = c8671;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24124 = C8671.m14395(c8605.f24097, i);
        }
    }

    public void setIconEndPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14270(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14270(c8605.f24097.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14271(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14271(c8605.f24097.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3166
    public void setInternalOnCheckedChangeListener(InterfaceC3165 interfaceC3165) {
        this.f10222 = interfaceC3165;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f10229 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            C5925.m11308("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            C5925.m11308("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24084 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            C5925.m11308("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10231 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10230 = onClickListener;
        m7087();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14267(colorStateList);
        }
        this.f10229.getClass();
        m7086();
    }

    public void setRippleColorResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14267(AbstractC7653.m12919(c8605.f24097, i));
            this.f10229.getClass();
            m7086();
        }
    }

    @Override // p305.InterfaceC8619
    public void setShapeAppearanceModel(C8640 c8640) {
        this.f10229.setShapeAppearanceModel(c8640);
    }

    public void setShowMotionSpec(C8671 c8671) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24125 = c8671;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.f24125 = C8671.m14395(c8605.f24097, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            C5925.m11308("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C8605 c8605 = this.f10229;
        if (c8605 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c8605.f24085 ? null : charSequence, bufferType);
        C8605 c86052 = this.f10229;
        if (c86052 == null || TextUtils.equals(c86052.f24121, charSequence)) {
            return;
        }
        c86052.f24121 = charSequence;
        c86052.f24111.f10504 = true;
        c86052.invalidateSelf();
        c86052.m14262();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14266(new C8654(c8605.f24097, i));
        }
        m7090();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24106 == f) {
            return;
        }
        c8605.f24106 = f;
        c8605.invalidateSelf();
        c8605.m14262();
    }

    public void setTextEndPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float dimension = c8605.f24097.getResources().getDimension(i);
            if (c8605.f24106 != dimension) {
                c8605.f24106 = dimension;
                c8605.invalidateSelf();
                c8605.m14262();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C3155 c3155 = c8605.f24111;
            C8654 c8654 = c3155.f10502;
            if (c8654 != null) {
                c8654.f24390 = fApplyDimension;
                c3155.f10507.setTextSize(fApplyDimension);
                c8605.m14262();
                c8605.invalidateSelf();
            }
        }
        m7090();
    }

    public void setTextStartPadding(float f) {
        C8605 c8605 = this.f10229;
        if (c8605 == null || c8605.f24109 == f) {
            return;
        }
        c8605.f24109 = f;
        c8605.invalidateSelf();
        c8605.m14262();
    }

    public void setTextStartPaddingResource(int i) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            float dimension = c8605.f24097.getResources().getDimension(i);
            if (c8605.f24109 != dimension) {
                c8605.f24109 = dimension;
                c8605.invalidateSelf();
                c8605.m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7085() {
        C8605 c8605;
        if (TextUtils.isEmpty(getText()) || (c8605 = this.f10229) == null) {
            return;
        }
        int iM14255 = (int) (c8605.m14255() + c8605.f24094 + c8605.f24106);
        C8605 c86052 = this.f10229;
        int iM14256 = (int) (c86052.m14256() + c86052.f24105 + c86052.f24109);
        if (this.f10232 != null) {
            Rect rect = new Rect();
            this.f10232.getPadding(rect);
            iM14256 += rect.left;
            iM14255 += rect.right;
        }
        setPaddingRelative(iM14256, getPaddingTop(), iM14255, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7086() {
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC8650.m14350(this.f10229.f24137), getBackgroundDrawable(), null);
        FocusRingDrawable.m7149(getContext(), rippleDrawable, this.f10229);
        this.f10233 = rippleDrawable;
        this.f10229.getClass();
        setBackground(this.f10233);
        m7085();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7087() {
        C8605 c8605;
        if (!m7088() || (c8605 = this.f10229) == null || !c8605.f24132 || this.f10230 == null) {
            AbstractC2270.m4244(this, null);
            this.f10224 = false;
        } else {
            AbstractC2270.m4244(this, this.f10225);
            this.f10224 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7088() {
        C8605 c8605 = this.f10229;
        if (c8605 == null) {
            return false;
        }
        Drawable drawable = c8605.f24133;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7089(int i) {
        this.f10227 = i;
        if (!this.f10217) {
            InsetDrawable insetDrawable = this.f10232;
            if (insetDrawable == null) {
                m7086();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f10232 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7086();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f10229.f24134));
        int iMax2 = Math.max(0, i - this.f10229.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f10232;
            if (insetDrawable2 == null) {
                m7086();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f10232 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7086();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f10232 != null) {
            Rect rect = new Rect();
            this.f10232.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m7086();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f10232 = new InsetDrawable((Drawable) this.f10229, i2, i3, i2, i3);
        m7086();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7090() {
        TextPaint paint = getPaint();
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            paint.drawableState = c8605.getState();
        }
        C8654 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m14354(getContext(), paint, this.f10215);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14273(z);
        }
        m7087();
    }

    public void setCheckedIconVisible(boolean z) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14250(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14245(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5925.m11308("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C5925.m11308("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5925.m11308("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C5925.m11308("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(C8654 c8654) {
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14266(c8654);
        }
        m7090();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C8605 c8605 = this.f10229;
        if (c8605 != null) {
            c8605.m14266(new C8654(c8605.f24097, i));
        }
        m7090();
    }
}
