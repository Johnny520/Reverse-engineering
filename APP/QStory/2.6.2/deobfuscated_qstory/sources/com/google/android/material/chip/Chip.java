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
import com.bumptech.glide.AbstractC3054;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.internal.C3154;
import com.google.android.material.internal.C3155;
import com.google.android.material.internal.InterfaceC3164;
import com.google.android.material.internal.InterfaceC3165;
import java.lang.ref.WeakReference;
import java.util.Locale;
import lin.xposed.hook.javaplugin.view.C5537;
import p053.AbstractC6560;
import p124.C7412;
import p152.AbstractC7589;
import p152.C7593;
import p162.AbstractC7652;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p257.C8219;
import p268.AbstractC8266;
import p301.AbstractC8615;
import p301.C8613;
import p301.C8614;
import p305.C8648;
import p305.InterfaceC8627;
import p307.AbstractC8658;
import p310.C8662;
import p314.AbstractC8669;
import p317.C8679;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0196 implements InterfaceC8627, InterfaceC3165 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3155 f10210;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f10211;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10212;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10213;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10214;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10215;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f10216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC3164 f10217;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Rect f10218;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10219;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8614 f10220;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f10221;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10222;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8613 f10224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public View.OnClickListener f10225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10226;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InsetDrawable f10227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public RippleDrawable f10228;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final Rect f10209 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10208 = {R.attr.state_selected};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10207 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC8266.m13812(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle);
        this.f10218 = new Rect();
        this.f10211 = new RectF();
        this.f10210 = new C3155(this, 1);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                C5919.m11247("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                C5919.m11247("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                C5919.m11247("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                C5919.m11247("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                C5919.m11247("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C8613 c8613 = new C8613(context2, attributeSet);
        Context context3 = c8613.f24106;
        int[] iArr = AbstractC8669.f24435;
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context3, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c8613.f24090 = typedArrayM7195.hasValue(39);
        Context context4 = c8613.f24106;
        ColorStateList colorStateListM13678 = AbstractC8189.m13678(context4, typedArrayM7195, 25);
        if (c8613.f24089 != colorStateListM13678) {
            c8613.f24089 = colorStateListM13678;
            c8613.onStateChange(c8613.getState());
        }
        ColorStateList colorStateListM136782 = AbstractC8189.m13678(context4, typedArrayM7195, 12);
        if (c8613.f24144 != colorStateListM136782) {
            c8613.f24144 = colorStateListM136782;
            c8613.onStateChange(c8613.getState());
        }
        float dimension = typedArrayM7195.getDimension(20, 0.0f);
        if (c8613.f24143 != dimension) {
            c8613.f24143 = dimension;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        if (typedArrayM7195.hasValue(13)) {
            c8613.m14234(typedArrayM7195.getDimension(13, 0.0f));
        }
        c8613.m14225(AbstractC8189.m13678(context4, typedArrayM7195, 23));
        c8613.m14228(typedArrayM7195.getDimension(24, 0.0f));
        c8613.m14248(AbstractC8189.m13678(context4, typedArrayM7195, 38));
        int i = 5;
        String text = typedArrayM7195.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c8613.f24130, text)) {
            c8613.f24130 = text;
            c8613.f24120.f10499 = true;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        C8662 c8662 = (!typedArrayM7195.hasValue(0) || (resourceId3 = typedArrayM7195.getResourceId(0, 0)) == 0) ? null : new C8662(context4, resourceId3);
        c8662.f24399 = typedArrayM7195.getDimension(1, c8662.f24399);
        int i2 = typedArrayM7195.hasValue(34) ? 34 : 7;
        if (typedArrayM7195.hasValue(i2)) {
            c8662.f24389 = typedArrayM7195.getString(i2);
        }
        c8613.m14247(c8662);
        int i3 = typedArrayM7195.getInt(3, 0);
        if (i3 == 1) {
            c8613.f24091 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            c8613.f24091 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            c8613.f24091 = TextUtils.TruncateAt.END;
        }
        c8613.m14226(typedArrayM7195.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c8613.m14226(typedArrayM7195.getBoolean(16, false));
        }
        c8613.m14233(AbstractC8189.m13683(context4, typedArrayM7195, 15));
        if (typedArrayM7195.hasValue(18)) {
            c8613.m14230(AbstractC8189.m13678(context4, typedArrayM7195, 18));
        }
        c8613.m14229(typedArrayM7195.getDimension(17, -1.0f));
        c8613.m14254(typedArrayM7195.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c8613.m14254(typedArrayM7195.getBoolean(27, false));
        }
        c8613.m14227(AbstractC8189.m13683(context4, typedArrayM7195, 26));
        c8613.m14253(AbstractC8189.m13678(context4, typedArrayM7195, 31));
        c8613.m14224(typedArrayM7195.getDimension(29, 0.0f));
        c8613.m14241(typedArrayM7195.getBoolean(6, false));
        c8613.m14231(typedArrayM7195.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c8613.m14231(typedArrayM7195.getBoolean(9, false));
        }
        c8613.m14240(AbstractC8189.m13683(context4, typedArrayM7195, 8));
        if (typedArrayM7195.hasValue(10)) {
            c8613.m14232(AbstractC8189.m13678(context4, typedArrayM7195, 10));
        }
        c8613.f24134 = (!typedArrayM7195.hasValue(41) || (resourceId2 = typedArrayM7195.getResourceId(41, 0)) == 0) ? null : C8679.m14375(context4, resourceId2);
        c8613.f24133 = (!typedArrayM7195.hasValue(35) || (resourceId = typedArrayM7195.getResourceId(35, 0)) == 0) ? null : C8679.m14375(context4, resourceId);
        float dimension2 = typedArrayM7195.getDimension(22, 0.0f);
        if (c8613.f24114 != dimension2) {
            c8613.f24114 = dimension2;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        c8613.m14252(typedArrayM7195.getDimension(37, 0.0f));
        c8613.m14251(typedArrayM7195.getDimension(36, 0.0f));
        float dimension3 = typedArrayM7195.getDimension(43, 0.0f);
        if (c8613.f24118 != dimension3) {
            c8613.f24118 = dimension3;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        float dimension4 = typedArrayM7195.getDimension(42, 0.0f);
        if (c8613.f24115 != dimension4) {
            c8613.f24115 = dimension4;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        c8613.m14250(typedArrayM7195.getDimension(30, 0.0f));
        c8613.m14223(typedArrayM7195.getDimension(28, 0.0f));
        float dimension5 = typedArrayM7195.getDimension(14, 0.0f);
        if (c8613.f24103 != dimension5) {
            c8613.f24103 = dimension5;
            c8613.invalidateSelf();
            c8613.m14243();
        }
        c8613.f24093 = typedArrayM7195.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM7195.recycle();
        AbstractC3159.m7199(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3159.m7198(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        this.f10212 = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueM13597 = AbstractC8174.m13597(theme, com.davemorrissey.labs.subscaleview.R.attr.minTouchTargetSize);
        this.f10222 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN((typedValueM13597 == null || typedValueM13597.type != 5) ? Float.NaN : typedValueM13597.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.davemorrissey.labs.subscaleview.R.dimen.mtrl_min_touch_target_size) : r6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c8613);
        c8613.m14322(getElevation());
        AbstractC3159.m7199(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3159.m7198(context2, attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.f10220 = new C8614(this, this);
        m7100();
        if (!zHasValue) {
            setOutlineProvider(new C8219(this, i));
        }
        setChecked(this.f10216);
        setText(c8613.f24130);
        setEllipsize(c8613.f24091);
        m7103();
        if (!this.f10224.f24094) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m7098();
        if (this.f10212) {
            setMinHeight(this.f10222);
        }
        this.f10223 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C5537(this, 2));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f10211;
        rectF.setEmpty();
        if (m7101() && this.f10225 != null) {
            C8613 c8613 = this.f10224;
            Rect bounds = c8613.getBounds();
            rectF.setEmpty();
            if (c8613.m14244()) {
                float f = c8613.f24103 + c8613.f24104 + c8613.f24140 + c8613.f24116 + c8613.f24115;
                if (c8613.getLayoutDirection() == 0) {
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
        Rect rect = this.f10218;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C8662 getTextAppearance() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24120.f10497;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10214 != z) {
            this.f10214 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10215 != z) {
            this.f10215 = z;
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
            boolean r0 = r7.f10219
            if (r0 != 0) goto L9
            boolean r7 = super.dispatchHoverEvent(r8)
            return r7
        L9:
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r7.f10220
            android.view.accessibility.AccessibilityManager r1 = r0.f20972
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
            int r1 = r0.f20966
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f20966 = r2
            r0.m13008(r2, r6)
            r0.m13008(r1, r5)
            return r4
        L42:
            float r7 = r8.getX()
            float r8 = r8.getY()
            com.google.android.material.chip.Chip r1 = r0.f24149
            boolean r2 = r1.m7101()
            if (r2 == 0) goto L5d
            android.graphics.RectF r1 = r1.getCloseIconTouchBounds()
            boolean r7 = r1.contains(r7, r8)
            if (r7 == 0) goto L5d
            r3 = r4
        L5d:
            int r7 = r0.f20966
            if (r7 != r3) goto L62
            goto L71
        L62:
            r0.f20966 = r3
            r0.m13008(r3, r6)
            r0.m13008(r7, r5)
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
            boolean r0 = r9.f10219
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r9.f10220
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
            boolean r8 = r0.m13006(r5, r6)
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
            int r1 = r0.f20967
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f24149
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f10225
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f10219
            if (r1 == 0) goto L85
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r1 = r5.f10220
            r1.m13008(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m13006(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m13006(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f20967
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
        C8613 c8613 = this.f10224;
        boolean zM14249 = false;
        int i = 0;
        zM14249 = false;
        if (c8613 != null && C8613.m14220(c8613.f24142)) {
            C8613 c86132 = this.f10224;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f10213) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f10214) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f10215) {
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
            if (this.f10213) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f10214) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f10215) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM14249 = c86132.m14249(iArr);
        }
        if (zM14249) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f10221)) {
            return this.f10221;
        }
        C8613 c8613 = this.f10224;
        if (c8613 == null || !c8613.f24135) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof AbstractC8615) && ((AbstractC8615) parent).f24152.f10493) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10227;
        return insetDrawable == null ? this.f10224 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24132;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24131;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24144;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return Math.max(0.0f, c8613.m14235());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10224;
    }

    public float getChipEndPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24103;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C8613 c8613 = this.f10224;
        if (c8613 == null || (drawable = c8613.f24128) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24126;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24127;
        }
        return null;
    }

    public float getChipMinHeight() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24143;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24114;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24148;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24145;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C8613 c8613 = this.f10224;
        if (c8613 == null || (drawable = c8613.f24142) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24139;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24104;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24140;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24116;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24137;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24091;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f10219) {
            C8614 c8614 = this.f10220;
            if (c8614.f20967 == 1 || c8614.f20968 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        C8613 c8613 = this.f10224;
        if (c8613 == null) {
            return super.getFontVariationSettings();
        }
        C8662 c8662 = c8613.f24120.f10497;
        if (c8662 != null) {
            return c8662.f24389;
        }
        return null;
    }

    public C8679 getHideMotionSpec() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24133;
        }
        return null;
    }

    public float getIconEndPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24117;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24113;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24146;
        }
        return null;
    }

    public C8648 getShapeAppearanceModel() {
        return this.f10224.m14330();
    }

    public C8679 getShowMotionSpec() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24134;
        }
        return null;
    }

    public float getTextEndPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24115;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            return c8613.f24118;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC6560.m12000(this, this.f10224);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10208);
        }
        C8613 c8613 = this.f10224;
        if (c8613 != null && c8613.f24135) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10207);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f10219) {
            C8614 c8614 = this.f10220;
            int i2 = c8614.f20967;
            if (i2 != Integer.MIN_VALUE) {
                c8614.m13013(i2);
            }
            if (z) {
                c8614.m13006(i, rect);
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
        C8613 c8613 = this.f10224;
        accessibilityNodeInfo.setCheckable(c8613 != null && c8613.f24135);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof AbstractC8615) {
            AbstractC8615 abstractC8615 = (AbstractC8615) getParent();
            if (abstractC8615.f10519) {
                i = 0;
                for (int i2 = 0; i2 < abstractC8615.getChildCount(); i2++) {
                    View childAt = abstractC8615.getChildAt(i2);
                    if ((childAt instanceof Chip) && abstractC8615.getChildAt(i2).getVisibility() == 0) {
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
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C7412.m12615(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f20104);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10223 != i) {
            this.f10223 = i;
            m7098();
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
            boolean r0 = r5.f10215
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f10215
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f10225
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f10219
            if (r0 == 0) goto L43
            飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰 r0 = r5.f10220
            r0.m13008(r2, r2)
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
        this.f10221 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10228) {
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
        if (drawable == getBackgroundDrawable() || drawable == this.f10228) {
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
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14241(z);
        }
    }

    public void setCheckableResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14241(c8613.f24106.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C8613 c8613 = this.f10224;
        if (c8613 == null) {
            this.f10216 = z;
        } else if (c8613.f24135) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14240(drawable);
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
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14240(AbstractC3054.m6607(c8613.f24106, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14232(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14232(AbstractC7652.m12890(c8613.f24106, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14231(c8613.f24106.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24144 == colorStateList) {
            return;
        }
        c8613.f24144 = colorStateList;
        c8613.onStateChange(c8613.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM12890;
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24144 == (colorStateListM12890 = AbstractC7652.m12890(c8613.f24106, i))) {
            return;
        }
        c8613.f24144 = colorStateListM12890;
        c8613.onStateChange(c8613.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14234(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14234(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C8613 c8613) {
        C8613 c86132 = this.f10224;
        if (c86132 != c8613) {
            if (c86132 != null) {
                c86132.f24092 = new WeakReference(null);
            }
            this.f10224 = c8613;
            c8613.f24094 = false;
            c8613.f24092 = new WeakReference(this);
            m7102(this.f10222);
        }
    }

    public void setChipEndPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24103 == f) {
            return;
        }
        c8613.f24103 = f;
        c8613.invalidateSelf();
        c8613.m14243();
    }

    public void setChipEndPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float dimension = c8613.f24106.getResources().getDimension(i);
            if (c8613.f24103 != dimension) {
                c8613.f24103 = dimension;
                c8613.invalidateSelf();
                c8613.m14243();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14233(drawable);
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
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14233(AbstractC3054.m6607(c8613.f24106, i));
        }
    }

    public void setChipIconSize(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14229(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14229(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14230(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14230(AbstractC7652.m12890(c8613.f24106, i));
        }
    }

    public void setChipIconVisible(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14226(c8613.f24106.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24143 == f) {
            return;
        }
        c8613.f24143 = f;
        c8613.invalidateSelf();
        c8613.m14243();
    }

    public void setChipMinHeightResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float dimension = c8613.f24106.getResources().getDimension(i);
            if (c8613.f24143 != dimension) {
                c8613.f24143 = dimension;
                c8613.invalidateSelf();
                c8613.m14243();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24114 == f) {
            return;
        }
        c8613.f24114 = f;
        c8613.invalidateSelf();
        c8613.m14243();
    }

    public void setChipStartPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float dimension = c8613.f24106.getResources().getDimension(i);
            if (c8613.f24114 != dimension) {
                c8613.f24114 = dimension;
                c8613.invalidateSelf();
                c8613.m14243();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14225(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14225(AbstractC7652.m12890(c8613.f24106, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14228(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14228(c8613.f24106.getResources().getDimension(i));
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
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14227(drawable);
        }
        m7100();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24139 == charSequence) {
            return;
        }
        String str = C7593.f20590;
        C7593 c7593 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C7593.f20587 : C7593.f20588;
        c7593.getClass();
        C0064 c0064 = AbstractC7589.f20581;
        c8613.f24139 = c7593.m12794(charSequence);
        c8613.invalidateSelf();
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
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14223(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14223(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14227(AbstractC3054.m6607(c8613.f24106, i));
        }
        m7100();
    }

    public void setCloseIconSize(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14224(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14224(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14250(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14250(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14253(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14253(AbstractC7652.m12890(c8613.f24106, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5919.m11247("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            C5919.m11247("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5919.m11247("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            C5919.m11247("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C5919.m11247("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C5919.m11247("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C5919.m11247("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C5919.m11247("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14322(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10224 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            C5919.m11247("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24091 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10212 = z;
        m7102(this.f10222);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        C8613 c8613 = this.f10224;
        if (c8613 == null) {
            return false;
        }
        C8662 c8662 = c8613.f24120.f10497;
        if (c8662 != null) {
            c8662.f24389 = str;
        }
        m7103();
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

    public void setHideMotionSpec(C8679 c8679) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24133 = c8679;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24133 = C8679.m14375(c8613.f24106, i);
        }
    }

    public void setIconEndPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14251(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14251(c8613.f24106.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14252(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14252(c8613.f24106.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3165
    public void setInternalOnCheckedChangeListener(InterfaceC3164 interfaceC3164) {
        this.f10217 = interfaceC3164;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f10224 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            C5919.m11247("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            C5919.m11247("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24093 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            C5919.m11247("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10226 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10225 = onClickListener;
        m7100();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14248(colorStateList);
        }
        this.f10224.getClass();
        m7099();
    }

    public void setRippleColorResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14248(AbstractC7652.m12890(c8613.f24106, i));
            this.f10224.getClass();
            m7099();
        }
    }

    @Override // p305.InterfaceC8627
    public void setShapeAppearanceModel(C8648 c8648) {
        this.f10224.setShapeAppearanceModel(c8648);
    }

    public void setShowMotionSpec(C8679 c8679) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24134 = c8679;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.f24134 = C8679.m14375(c8613.f24106, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            C5919.m11247("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C8613 c8613 = this.f10224;
        if (c8613 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c8613.f24094 ? null : charSequence, bufferType);
        C8613 c86132 = this.f10224;
        if (c86132 == null || TextUtils.equals(c86132.f24130, charSequence)) {
            return;
        }
        c86132.f24130 = charSequence;
        c86132.f24120.f10499 = true;
        c86132.invalidateSelf();
        c86132.m14243();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14247(new C8662(c8613.f24106, i));
        }
        m7103();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24115 == f) {
            return;
        }
        c8613.f24115 = f;
        c8613.invalidateSelf();
        c8613.m14243();
    }

    public void setTextEndPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float dimension = c8613.f24106.getResources().getDimension(i);
            if (c8613.f24115 != dimension) {
                c8613.f24115 = dimension;
                c8613.invalidateSelf();
                c8613.m14243();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C3154 c3154 = c8613.f24120;
            C8662 c8662 = c3154.f10497;
            if (c8662 != null) {
                c8662.f24399 = fApplyDimension;
                c3154.f10502.setTextSize(fApplyDimension);
                c8613.m14243();
                c8613.invalidateSelf();
            }
        }
        m7103();
    }

    public void setTextStartPadding(float f) {
        C8613 c8613 = this.f10224;
        if (c8613 == null || c8613.f24118 == f) {
            return;
        }
        c8613.f24118 = f;
        c8613.invalidateSelf();
        c8613.m14243();
    }

    public void setTextStartPaddingResource(int i) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            float dimension = c8613.f24106.getResources().getDimension(i);
            if (c8613.f24118 != dimension) {
                c8613.f24118 = dimension;
                c8613.invalidateSelf();
                c8613.m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7098() {
        C8613 c8613;
        if (TextUtils.isEmpty(getText()) || (c8613 = this.f10224) == null) {
            return;
        }
        int iM14236 = (int) (c8613.m14236() + c8613.f24103 + c8613.f24115);
        C8613 c86132 = this.f10224;
        int iM14237 = (int) (c86132.m14237() + c86132.f24114 + c86132.f24118);
        if (this.f10227 != null) {
            Rect rect = new Rect();
            this.f10227.getPadding(rect);
            iM14237 += rect.left;
            iM14236 += rect.right;
        }
        setPaddingRelative(iM14237, getPaddingTop(), iM14236, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7099() {
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC8658.m14332(this.f10224.f24146), getBackgroundDrawable(), null);
        FocusRingDrawable.m7162(getContext(), rippleDrawable, this.f10224);
        this.f10228 = rippleDrawable;
        this.f10224.getClass();
        setBackground(this.f10228);
        m7098();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7100() {
        C8613 c8613;
        if (!m7101() || (c8613 = this.f10224) == null || !c8613.f24141 || this.f10225 == null) {
            AbstractC2270.m4234(this, null);
            this.f10219 = false;
        } else {
            AbstractC2270.m4234(this, this.f10220);
            this.f10219 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7101() {
        C8613 c8613 = this.f10224;
        if (c8613 == null) {
            return false;
        }
        Drawable drawable = c8613.f24142;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7102(int i) {
        this.f10222 = i;
        if (!this.f10212) {
            InsetDrawable insetDrawable = this.f10227;
            if (insetDrawable == null) {
                m7099();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f10227 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7099();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f10224.f24143));
        int iMax2 = Math.max(0, i - this.f10224.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f10227;
            if (insetDrawable2 == null) {
                m7099();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f10227 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7099();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f10227 != null) {
            Rect rect = new Rect();
            this.f10227.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m7099();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f10227 = new InsetDrawable((Drawable) this.f10224, i2, i3, i2, i3);
        m7099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7103() {
        TextPaint paint = getPaint();
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            paint.drawableState = c8613.getState();
        }
        C8662 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m14336(getContext(), paint, this.f10210);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14254(z);
        }
        m7100();
    }

    public void setCheckedIconVisible(boolean z) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14231(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14226(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5919.m11247("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C5919.m11247("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C5919.m11247("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C5919.m11247("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(C8662 c8662) {
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14247(c8662);
        }
        m7103();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C8613 c8613 = this.f10224;
        if (c8613 != null) {
            c8613.m14247(new C8662(c8613.f24106, i));
        }
        m7103();
    }
}
