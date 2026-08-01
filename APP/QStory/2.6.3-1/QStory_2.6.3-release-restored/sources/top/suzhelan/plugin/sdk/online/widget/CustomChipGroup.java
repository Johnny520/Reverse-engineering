package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p317.AbstractC9436;
import p406.AbstractC9923;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m151d2 = {"Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;", "L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "飘花落叶言子世楪苏兰哲", "I", "getMaxRows", "()I", "setMaxRows", "(I)V", "maxRows", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class CustomChipGroup extends AbstractC9436 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters and from kotlin metadata */
    public int maxRows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.maxRows = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9923.f25832);
        typedArrayObtainStyledAttributes.getClass();
        setMaxRows(typedArrayObtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.material.internal.AbstractC3994, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        super.onMeasure(i, i2);
        if (this.f10869 || this.maxRows == Integer.MAX_VALUE) {
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            measuredWidth = size - getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            if (getMeasuredWidth() <= 0) {
                measuredHeight = getMeasuredHeight();
                if (measuredHeight >= getMeasuredHeight()) {
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                    return;
                }
                return;
            }
            measuredWidth = getMeasuredWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int i3 = measuredWidth - paddingRight;
        if (i3 < 0) {
            i3 = 0;
        }
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        int chipSpacingVertical = 0;
        int iMax = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i7 = (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
                    int i8 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                    int measuredWidth2 = childAt.getMeasuredWidth() + i7;
                    int measuredHeight2 = childAt.getMeasuredHeight() + i8;
                    int chipSpacingHorizontal = i5 == 0 ? 0 : getChipSpacingHorizontal();
                    if (i5 <= 0 || i5 + chipSpacingHorizontal + measuredWidth2 <= i3) {
                        i5 += chipSpacingHorizontal + measuredWidth2;
                        iMax = Math.max(iMax, measuredHeight2);
                    } else {
                        int i9 = chipSpacingVertical + iMax;
                        if (i6 == this.maxRows) {
                            paddingTop = getPaddingTop() + i9;
                            paddingBottom = getPaddingBottom();
                            break;
                        } else {
                            chipSpacingVertical = i9 + getChipSpacingVertical();
                            i6++;
                            i5 = measuredWidth2;
                            iMax = measuredHeight2;
                        }
                    }
                    z = true;
                }
                i4++;
            } else if (z) {
                paddingTop = getPaddingTop() + chipSpacingVertical + iMax;
                paddingBottom = getPaddingBottom();
            } else {
                paddingTop = getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
        }
        measuredHeight = paddingBottom + paddingTop;
        if (measuredHeight >= getMeasuredHeight()) {
        }
    }

    public final void setMaxRows(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.maxRows = i;
        requestLayout();
    }
}
