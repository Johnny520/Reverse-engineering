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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.C0911;
import androidx.appcompat.widget.C1043;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.internal.C3987;
import com.google.android.material.internal.C3988;
import com.google.android.material.internal.InterfaceC3997;
import com.google.android.material.internal.InterfaceC3998;
import io.ktor.client.plugins.AbstractC4765;
import java.lang.ref.WeakReference;
import java.util.Locale;
import lin.xposed.hook.javaplugin.view.C6369;
import p050.AbstractC7173;
import p069.AbstractC7390;
import p140.C8242;
import p168.AbstractC8419;
import p168.C8423;
import p178.AbstractC8482;
import p191.AbstractC8568;
import p273.C9049;
import p284.AbstractC9096;
import p317.AbstractC9436;
import p317.C9434;
import p317.C9435;
import p321.C9469;
import p321.InterfaceC9448;
import p323.AbstractC9479;
import p326.C9483;
import p330.AbstractC9490;
import p333.C9500;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends C1043 implements InterfaceC9448, InterfaceC3998 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3988 f10560;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f10561;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10562;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10563;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10564;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10565;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f10566;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC3997 f10567;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Rect f10568;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10569;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C9435 f10570;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public CharSequence f10571;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10572;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C9434 f10574;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public View.OnClickListener f10575;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InsetDrawable f10577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public RippleDrawable f10578;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final Rect f10559 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10558 = {R.attr.state_selected};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10557 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action), attributeSet, C0328R.attr.chipStyle);
        this.f10568 = new Rect();
        this.f10561 = new RectF();
        this.f10560 = new C3988(this, 1);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                C6755.m11867("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                C6755.m11867("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                C6755.m11867("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                C6755.m11867("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                C6755.m11867("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C9434 c9434 = new C9434(context2, attributeSet);
        Context context3 = c9434.f24442;
        int[] iArr = AbstractC9490.f24771;
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context3, attributeSet, iArr, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c9434.f24426 = typedArrayM7741.hasValue(39);
        Context context4 = c9434.f24442;
        ColorStateList colorStateListM13632 = AbstractC8568.m13632(context4, typedArrayM7741, 25);
        if (c9434.f24425 != colorStateListM13632) {
            c9434.f24425 = colorStateListM13632;
            c9434.onStateChange(c9434.getState());
        }
        ColorStateList colorStateListM136322 = AbstractC8568.m13632(context4, typedArrayM7741, 12);
        if (c9434.f24480 != colorStateListM136322) {
            c9434.f24480 = colorStateListM136322;
            c9434.onStateChange(c9434.getState());
        }
        float dimension = typedArrayM7741.getDimension(20, 0.0f);
        if (c9434.f24479 != dimension) {
            c9434.f24479 = dimension;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        if (typedArrayM7741.hasValue(13)) {
            c9434.m14812(typedArrayM7741.getDimension(13, 0.0f));
        }
        c9434.m14803(AbstractC8568.m13632(context4, typedArrayM7741, 23));
        c9434.m14806(typedArrayM7741.getDimension(24, 0.0f));
        c9434.m14826(AbstractC8568.m13632(context4, typedArrayM7741, 38));
        int i = 5;
        String text = typedArrayM7741.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c9434.f24466, text)) {
            c9434.f24466 = text;
            c9434.f24456.f10849 = true;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        C9483 c9483 = (!typedArrayM7741.hasValue(0) || (resourceId3 = typedArrayM7741.getResourceId(0, 0)) == 0) ? null : new C9483(context4, resourceId3);
        c9483.f24735 = typedArrayM7741.getDimension(1, c9483.f24735);
        int i2 = typedArrayM7741.hasValue(34) ? 34 : 7;
        if (typedArrayM7741.hasValue(i2)) {
            c9483.f24725 = typedArrayM7741.getString(i2);
        }
        c9434.m14825(c9483);
        int i3 = typedArrayM7741.getInt(3, 0);
        if (i3 == 1) {
            c9434.f24427 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            c9434.f24427 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            c9434.f24427 = TextUtils.TruncateAt.END;
        }
        c9434.m14804(typedArrayM7741.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c9434.m14804(typedArrayM7741.getBoolean(16, false));
        }
        c9434.m14811(AbstractC8568.m13635(context4, typedArrayM7741, 15));
        if (typedArrayM7741.hasValue(18)) {
            c9434.m14808(AbstractC8568.m13632(context4, typedArrayM7741, 18));
        }
        c9434.m14807(typedArrayM7741.getDimension(17, -1.0f));
        c9434.m14832(typedArrayM7741.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c9434.m14832(typedArrayM7741.getBoolean(27, false));
        }
        c9434.m14805(AbstractC8568.m13635(context4, typedArrayM7741, 26));
        c9434.m14831(AbstractC8568.m13632(context4, typedArrayM7741, 31));
        c9434.m14802(typedArrayM7741.getDimension(29, 0.0f));
        c9434.m14819(typedArrayM7741.getBoolean(6, false));
        c9434.m14809(typedArrayM7741.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c9434.m14809(typedArrayM7741.getBoolean(9, false));
        }
        c9434.m14818(AbstractC8568.m13635(context4, typedArrayM7741, 8));
        if (typedArrayM7741.hasValue(10)) {
            c9434.m14810(AbstractC8568.m13632(context4, typedArrayM7741, 10));
        }
        c9434.f24470 = (!typedArrayM7741.hasValue(41) || (resourceId2 = typedArrayM7741.getResourceId(41, 0)) == 0) ? null : C9500.m14954(context4, resourceId2);
        c9434.f24469 = (!typedArrayM7741.hasValue(35) || (resourceId = typedArrayM7741.getResourceId(35, 0)) == 0) ? null : C9500.m14954(context4, resourceId);
        float dimension2 = typedArrayM7741.getDimension(22, 0.0f);
        if (c9434.f24450 != dimension2) {
            c9434.f24450 = dimension2;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        c9434.m14830(typedArrayM7741.getDimension(37, 0.0f));
        c9434.m14829(typedArrayM7741.getDimension(36, 0.0f));
        float dimension3 = typedArrayM7741.getDimension(43, 0.0f);
        if (c9434.f24454 != dimension3) {
            c9434.f24454 = dimension3;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        float dimension4 = typedArrayM7741.getDimension(42, 0.0f);
        if (c9434.f24451 != dimension4) {
            c9434.f24451 = dimension4;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        c9434.m14828(typedArrayM7741.getDimension(30, 0.0f));
        c9434.m14801(typedArrayM7741.getDimension(28, 0.0f));
        float dimension5 = typedArrayM7741.getDimension(14, 0.0f);
        if (c9434.f24439 != dimension5) {
            c9434.f24439 = dimension5;
            c9434.invalidateSelf();
            c9434.m14821();
        }
        c9434.f24429 = typedArrayM7741.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM7741.recycle();
        AbstractC3992.m7745(context2, attributeSet, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3992.m7744(context2, attributeSet, iArr, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action);
        this.f10562 = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueM12599 = AbstractC7390.m12599(theme, C0328R.attr.minTouchTargetSize);
        this.f10572 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN((typedValueM12599 == null || typedValueM12599.type != 5) ? Float.NaN : typedValueM12599.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(C0328R.dimen.mtrl_min_touch_target_size) : r6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c9434);
        c9434.m14899(getElevation());
        AbstractC3992.m7745(context2, attributeSet, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3992.m7744(context2, attributeSet, iArr, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.f10570 = new C9435(this, this);
        m7646();
        if (!zHasValue) {
            setOutlineProvider(new C9049(this, i));
        }
        setChecked(this.f10566);
        setText(c9434.f24466);
        setEllipsize(c9434.f24427);
        m7649();
        if (!this.f10574.f24430) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m7644();
        if (this.f10562) {
            setMinHeight(this.f10572);
        }
        this.f10573 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C6369(this, 2));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f10561;
        rectF.setEmpty();
        if (m7647() && this.f10575 != null) {
            C9434 c9434 = this.f10574;
            Rect bounds = c9434.getBounds();
            rectF.setEmpty();
            if (c9434.m14822()) {
                float f = c9434.f24439 + c9434.f24440 + c9434.f24476 + c9434.f24452 + c9434.f24451;
                if (c9434.getLayoutDirection() == 0) {
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
        Rect rect = this.f10568;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C9483 getTextAppearance() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24456.f10847;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10564 != z) {
            this.f10564 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10565 != z) {
            this.f10565 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f10569) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C9435 c9435 = this.f10570;
        AccessibilityManager accessibilityManager = c9435.f21312;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = c9435.f24485;
                if (chip.m7647() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = c9435.f21306;
                if (i3 != i2) {
                    c9435.f21306 = i2;
                    c9435.m13597(i2, 128);
                    c9435.m13597(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = c9435.f21306) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    c9435.f21306 = Integer.MIN_VALUE;
                    c9435.m13597(Integer.MIN_VALUE, 128);
                    c9435.m13597(i, 256);
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
        if (!this.f10569) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C9435 c9435 = this.f10570;
        c9435.getClass();
        boolean zM13595 = false;
        int i = 0;
        zM13595 = false;
        zM13595 = false;
        zM13595 = false;
        zM13595 = false;
        zM13595 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
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
                                while (i < repeatCount && c9435.m13595(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                zM13595 = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i3 = c9435.f21307;
                                if (i3 != Integer.MIN_VALUE) {
                                    Chip chip = c9435.f24485;
                                    if (i3 == 0) {
                                        chip.performClick();
                                    } else if (i3 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f10575;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f10569) {
                                            chip.f10570.m13597(1, 1);
                                        }
                                    }
                                }
                                zM13595 = true;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM13595 = c9435.m13595(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM13595 = c9435.m13595(1, null);
            }
        }
        if (!zM13595 || c9435.f21307 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.C1043, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C9434 c9434 = this.f10574;
        boolean zM14827 = false;
        int i = 0;
        zM14827 = false;
        if (c9434 != null && C9434.m14798(c9434.f24478)) {
            C9434 c94342 = this.f10574;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f10563) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f10564) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f10565) {
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
            if (this.f10563) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f10564) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f10565) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM14827 = c94342.m14827(iArr);
        }
        if (zM14827) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f10571)) {
            return this.f10571;
        }
        C9434 c9434 = this.f10574;
        if (c9434 == null || !c9434.f24471) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof AbstractC9436) && ((AbstractC9436) parent).f24488.f10843) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10577;
        return insetDrawable == null ? this.f10574 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24468;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24467;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24480;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return Math.max(0.0f, c9434.m14813());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10574;
    }

    public float getChipEndPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24439;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C9434 c9434 = this.f10574;
        if (c9434 == null || (drawable = c9434.f24464) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24462;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24463;
        }
        return null;
    }

    public float getChipMinHeight() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24479;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24450;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24484;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24481;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C9434 c9434 = this.f10574;
        if (c9434 == null || (drawable = c9434.f24478) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24475;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24440;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24476;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24452;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24473;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24427;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f10569) {
            C9435 c9435 = this.f10570;
            if (c9435.f21307 == 1 || c9435.f21308 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        C9434 c9434 = this.f10574;
        if (c9434 == null) {
            return super.getFontVariationSettings();
        }
        C9483 c9483 = c9434.f24456.f10847;
        if (c9483 != null) {
            return c9483.f24725;
        }
        return null;
    }

    public C9500 getHideMotionSpec() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24469;
        }
        return null;
    }

    public float getIconEndPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24453;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24449;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24482;
        }
        return null;
    }

    public C9469 getShapeAppearanceModel() {
        return this.f10574.m14907();
    }

    public C9500 getShowMotionSpec() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24470;
        }
        return null;
    }

    public float getTextEndPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24451;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            return c9434.f24454;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC7173.m12428(this, this.f10574);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10558);
        }
        C9434 c9434 = this.f10574;
        if (c9434 != null && c9434.f24471) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10557);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f10569) {
            C9435 c9435 = this.f10570;
            int i2 = c9435.f21307;
            if (i2 != Integer.MIN_VALUE) {
                c9435.m13602(i2);
            }
            if (z) {
                c9435.m13595(i, rect);
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
        C9434 c9434 = this.f10574;
        accessibilityNodeInfo.setCheckable(c9434 != null && c9434.f24471);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof AbstractC9436) {
            AbstractC9436 abstractC9436 = (AbstractC9436) getParent();
            if (abstractC9436.f10869) {
                i = 0;
                for (int i2 = 0; i2 < abstractC9436.getChildCount(); i2++) {
                    View childAt = abstractC9436.getChildAt(i2);
                    if ((childAt instanceof Chip) && abstractC9436.getChildAt(i2).getVisibility() == 0) {
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
            Object tag = getTag(C0328R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C8242.m13201(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f20444);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10573 != i) {
            this.f10573 = i;
            m7644();
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
                    if (this.f10565) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else {
                if (this.f10565) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f10575;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f10569) {
                        this.f10570.m13597(1, 1);
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
        this.f10571 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10578) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C1043, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10578) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C1043, android.view.View
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
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14819(z);
        }
    }

    public void setCheckableResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14819(c9434.f24442.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C9434 c9434 = this.f10574;
        if (c9434 == null) {
            this.f10566 = z;
        } else if (c9434.f24471) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14818(drawable);
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
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14818(AbstractC4765.m8871(c9434.f24442, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14810(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14810(AbstractC8482.m13478(c9434.f24442, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14809(c9434.f24442.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24480 == colorStateList) {
            return;
        }
        c9434.f24480 = colorStateList;
        c9434.onStateChange(c9434.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM13478;
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24480 == (colorStateListM13478 = AbstractC8482.m13478(c9434.f24442, i))) {
            return;
        }
        c9434.f24480 = colorStateListM13478;
        c9434.onStateChange(c9434.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14812(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14812(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C9434 c9434) {
        C9434 c94342 = this.f10574;
        if (c94342 != c9434) {
            if (c94342 != null) {
                c94342.f24428 = new WeakReference(null);
            }
            this.f10574 = c9434;
            c9434.f24430 = false;
            c9434.f24428 = new WeakReference(this);
            m7648(this.f10572);
        }
    }

    public void setChipEndPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24439 == f) {
            return;
        }
        c9434.f24439 = f;
        c9434.invalidateSelf();
        c9434.m14821();
    }

    public void setChipEndPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float dimension = c9434.f24442.getResources().getDimension(i);
            if (c9434.f24439 != dimension) {
                c9434.f24439 = dimension;
                c9434.invalidateSelf();
                c9434.m14821();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14811(drawable);
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
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14811(AbstractC4765.m8871(c9434.f24442, i));
        }
    }

    public void setChipIconSize(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14807(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14807(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14808(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14808(AbstractC8482.m13478(c9434.f24442, i));
        }
    }

    public void setChipIconVisible(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14804(c9434.f24442.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24479 == f) {
            return;
        }
        c9434.f24479 = f;
        c9434.invalidateSelf();
        c9434.m14821();
    }

    public void setChipMinHeightResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float dimension = c9434.f24442.getResources().getDimension(i);
            if (c9434.f24479 != dimension) {
                c9434.f24479 = dimension;
                c9434.invalidateSelf();
                c9434.m14821();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24450 == f) {
            return;
        }
        c9434.f24450 = f;
        c9434.invalidateSelf();
        c9434.m14821();
    }

    public void setChipStartPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float dimension = c9434.f24442.getResources().getDimension(i);
            if (c9434.f24450 != dimension) {
                c9434.f24450 = dimension;
                c9434.invalidateSelf();
                c9434.m14821();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14803(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14803(AbstractC8482.m13478(c9434.f24442, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14806(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14806(c9434.f24442.getResources().getDimension(i));
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
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14805(drawable);
        }
        m7646();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24475 == charSequence) {
            return;
        }
        String str = C8423.f20930;
        C8423 c8423 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C8423.f20927 : C8423.f20928;
        c8423.getClass();
        C0911 c0911 = AbstractC8419.f20921;
        c9434.f24475 = c8423.m13382(charSequence);
        c9434.invalidateSelf();
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
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14801(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14801(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14805(AbstractC4765.m8871(c9434.f24442, i));
        }
        m7646();
    }

    public void setCloseIconSize(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14802(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14802(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14828(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14828(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14831(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14831(AbstractC8482.m13478(c9434.f24442, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.C1043, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C6755.m11867("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            C6755.m11867("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.C1043, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C6755.m11867("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            C6755.m11867("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C6755.m11867("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C6755.m11867("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C6755.m11867("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C6755.m11867("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14899(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10574 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            C6755.m11867("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24427 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10562 = z;
        m7648(this.f10572);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        C9434 c9434 = this.f10574;
        if (c9434 == null) {
            return false;
        }
        C9483 c9483 = c9434.f24456.f10847;
        if (c9483 != null) {
            c9483.f24725 = str;
        }
        m7649();
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

    public void setHideMotionSpec(C9500 c9500) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24469 = c9500;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24469 = C9500.m14954(c9434.f24442, i);
        }
    }

    public void setIconEndPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14829(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14829(c9434.f24442.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14830(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14830(c9434.f24442.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3998
    public void setInternalOnCheckedChangeListener(InterfaceC3997 interfaceC3997) {
        this.f10567 = interfaceC3997;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f10574 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            C6755.m11867("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            C6755.m11867("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24429 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            C6755.m11867("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10576 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10575 = onClickListener;
        m7646();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14826(colorStateList);
        }
        this.f10574.getClass();
        m7645();
    }

    public void setRippleColorResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14826(AbstractC8482.m13478(c9434.f24442, i));
            this.f10574.getClass();
            m7645();
        }
    }

    @Override // p321.InterfaceC9448
    public void setShapeAppearanceModel(C9469 c9469) {
        this.f10574.setShapeAppearanceModel(c9469);
    }

    public void setShowMotionSpec(C9500 c9500) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24470 = c9500;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.f24470 = C9500.m14954(c9434.f24442, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            C6755.m11867("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C9434 c9434 = this.f10574;
        if (c9434 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c9434.f24430 ? null : charSequence, bufferType);
        C9434 c94342 = this.f10574;
        if (c94342 == null || TextUtils.equals(c94342.f24466, charSequence)) {
            return;
        }
        c94342.f24466 = charSequence;
        c94342.f24456.f10849 = true;
        c94342.invalidateSelf();
        c94342.m14821();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14825(new C9483(c9434.f24442, i));
        }
        m7649();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24451 == f) {
            return;
        }
        c9434.f24451 = f;
        c9434.invalidateSelf();
        c9434.m14821();
    }

    public void setTextEndPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float dimension = c9434.f24442.getResources().getDimension(i);
            if (c9434.f24451 != dimension) {
                c9434.f24451 = dimension;
                c9434.invalidateSelf();
                c9434.m14821();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C3987 c3987 = c9434.f24456;
            C9483 c9483 = c3987.f10847;
            if (c9483 != null) {
                c9483.f24735 = fApplyDimension;
                c3987.f10852.setTextSize(fApplyDimension);
                c9434.m14821();
                c9434.invalidateSelf();
            }
        }
        m7649();
    }

    public void setTextStartPadding(float f) {
        C9434 c9434 = this.f10574;
        if (c9434 == null || c9434.f24454 == f) {
            return;
        }
        c9434.f24454 = f;
        c9434.invalidateSelf();
        c9434.m14821();
    }

    public void setTextStartPaddingResource(int i) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            float dimension = c9434.f24442.getResources().getDimension(i);
            if (c9434.f24454 != dimension) {
                c9434.f24454 = dimension;
                c9434.invalidateSelf();
                c9434.m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7644() {
        C9434 c9434;
        if (TextUtils.isEmpty(getText()) || (c9434 = this.f10574) == null) {
            return;
        }
        int iM14814 = (int) (c9434.m14814() + c9434.f24439 + c9434.f24451);
        C9434 c94342 = this.f10574;
        int iM14815 = (int) (c94342.m14815() + c94342.f24450 + c94342.f24454);
        if (this.f10577 != null) {
            Rect rect = new Rect();
            this.f10577.getPadding(rect);
            iM14815 += rect.left;
            iM14814 += rect.right;
        }
        setPaddingRelative(iM14815, getPaddingTop(), iM14814, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7645() {
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC9479.m14909(this.f10574.f24482), getBackgroundDrawable(), null);
        FocusRingDrawable.m7708(getContext(), rippleDrawable, this.f10574);
        this.f10578 = rippleDrawable;
        this.f10574.getClass();
        setBackground(this.f10578);
        m7644();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7646() {
        C9434 c9434;
        if (!m7647() || (c9434 = this.f10574) == null || !c9434.f24477 || this.f10575 == null) {
            AbstractC3103.m4804(this, null);
            this.f10569 = false;
        } else {
            AbstractC3103.m4804(this, this.f10570);
            this.f10569 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7647() {
        C9434 c9434 = this.f10574;
        if (c9434 == null) {
            return false;
        }
        Drawable drawable = c9434.f24478;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7648(int i) {
        this.f10572 = i;
        if (!this.f10562) {
            InsetDrawable insetDrawable = this.f10577;
            if (insetDrawable == null) {
                m7645();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f10577 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7645();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f10574.f24479));
        int iMax2 = Math.max(0, i - this.f10574.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f10577;
            if (insetDrawable2 == null) {
                m7645();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f10577 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m7645();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f10577 != null) {
            Rect rect = new Rect();
            this.f10577.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m7645();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f10577 = new InsetDrawable((Drawable) this.f10574, i2, i3, i2, i3);
        m7645();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7649() {
        TextPaint paint = getPaint();
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            paint.drawableState = c9434.getState();
        }
        C9483 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m14913(getContext(), paint, this.f10560);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14832(z);
        }
        m7646();
    }

    public void setCheckedIconVisible(boolean z) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14809(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14804(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C6755.m11867("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C6755.m11867("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C6755.m11867("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C6755.m11867("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(C9483 c9483) {
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14825(c9483);
        }
        m7649();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C9434 c9434 = this.f10574;
        if (c9434 != null) {
            c9434.m14825(new C9483(c9434.f24442, i));
        }
        m7649();
    }
}
