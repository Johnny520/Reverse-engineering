package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p001ui.semantics.C2780;
import androidx.core.view.C3075;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import p023.C6977;
import p246.C8878;
import p284.AbstractC9096;
import p321.C9445;
import p321.C9446;
import p321.C9447;
import p321.C9451;
import p321.C9457;
import p321.C9469;
import p321.InterfaceC9454;
import p321.InterfaceC9464;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3931 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Object f10506 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f10507;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10508;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Integer[] f10509;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2780 f10510;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C9451 f10512;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C9447 f10513;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C9446 f10514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f10515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3075 f10516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10517;

    public AbstractC3931(Context context, AttributeSet attributeSet) {
        C9447 c9447M14857;
        XmlResourceParser xml;
        int next;
        int next2;
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.materialButtonToggleGroupStyle, C0328R.style.Widget_Material3_MaterialButtonGroup), attributeSet, C0328R.attr.materialButtonToggleGroupStyle);
        this.f10517 = 0;
        this.f10515 = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f10516 = new C3075(materialButtonToggleGroup, 11);
        this.f10510 = new C2780(materialButtonToggleGroup, 1);
        this.f10508 = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f10507 = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24780, C0328R.attr.materialButtonToggleGroupStyle, C0328R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM7741.hasValue(2)) {
            int resourceId = typedArrayM7741.getResourceId(2, 0);
            C9451 c9451 = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        C9451 c94512 = new C9451();
                        c94512.f24561 = new int[10][];
                        c94512.f24560 = new C8878[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c94512.m14866(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c9451 = c94512;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f10512 = c9451;
        }
        if (typedArrayM7741.hasValue(6)) {
            C9446 c9446M14847 = C9446.m14847(context2, typedArrayM7741, 6);
            this.f10514 = c9446M14847;
            if (c9446M14847 == null) {
                int resourceId2 = typedArrayM7741.getResourceId(6, 0);
                int resourceId3 = typedArrayM7741.getResourceId(7, 0);
                C9457 c9457 = new C9457(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f10514 = new C6977(C9469.m14879(contextThemeWrapper.obtainStyledAttributes(AbstractC9490.f24756), c9457).m14878()).m12093();
            }
        }
        if (typedArrayM7741.hasValue(3)) {
            C9457 c94572 = new C9457(0.0f);
            int resourceId4 = typedArrayM7741.getResourceId(3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        c9447M14857 = new C9447();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c9447M14857.m14858(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    c9447M14857 = C9447.m14857(c94572);
                }
            } else {
                c9447M14857 = C9447.m14857(C9469.m14881(typedArrayM7741, 3, c94572));
            }
            this.f10513 = c9447M14857;
        }
        this.f10511 = typedArrayM7741.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM7741.getBoolean(0, true));
        setOverflowMode(typedArrayM7741.getInt(5, 0));
        getResources().getDimensionPixelOffset(C0328R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayM7741.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m7635(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m7635(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C3924 m7626(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C3924((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3924((ViewGroup.MarginLayoutParams) layoutParams) : new C3924(layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinearLayout.LayoutParams m7627(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C3924(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m7636();
        this.f10508 = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f10516);
        this.f10515.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3924;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f10510);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f10509 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3924(-2, -2);
    }

    public C9451 getButtonSizeChange() {
        return this.f10512;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f10509;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public InterfaceC9454 getInnerCornerSize() {
        return this.f10513.f24549;
    }

    public C9447 getInnerCornerSizeStateList() {
        return this.f10513;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f10517;
    }

    public C9469 getShapeAppearance() {
        C9446 c9446 = this.f10514;
        if (c9446 == null) {
            return null;
        }
        return c9446.m14855();
    }

    public int getSpacing() {
        return this.f10511;
    }

    public C9446 getStateListShapeAppearance() {
        return this.f10514;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m7636();
            m7630();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        m7631();
        if (this.f10517 != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                C6755.m11869("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                C6755.m11869("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.f10507;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (m7635(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsM7627 = m7627(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f10511) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.f10511);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsM7627.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.f10511);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsM7627.topMargin += i4;
                        view.setLayoutParams(layoutParamsM7627);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i3));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i7)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsM76272 = m7627(materialButton);
                int i8 = layoutParamsM76272.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsM76272.setMarginStart((layoutParamsM76272.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsM76272);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        m7634();
        super.onMeasure(i, i2);
        if (this.f10517 != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f10515.remove(iIndexOfChild);
        }
        this.f10508 = true;
        m7634();
        m7636();
        m7631();
    }

    public void setButtonSizeChange(C9451 c9451) {
        if (this.f10512 != c9451) {
            this.f10512 = c9451;
            m7630();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(InterfaceC9454 interfaceC9454) {
        this.f10513 = C9447.m14857(interfaceC9454);
        this.f10508 = true;
        m7634();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C9447 c9447) {
        this.f10513 = c9447;
        this.f10508 = true;
        m7634();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f10508 = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.f10517 != i) {
            this.f10517 = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(C9469 c9469) {
        this.f10514 = new C6977(c9469).m12093();
        this.f10508 = true;
        m7634();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f10511 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C9446 c9446) {
        this.f10514 = c9446;
        this.f10508 = true;
        m7634();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3924 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3924 c3924 = new C3924(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24784);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c3924;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7629(int i, int i2) {
        float fMax;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (m7635(i3)) {
                ((MaterialButton) getChildAt(i3)).setWidthChangeDirection(i3 == i ? MaterialButton.WidthChangeDirection.END : i3 == i2 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH);
                if (m7635(i3) && this.f10512 != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                    C9451 c9451 = this.f10512;
                    int width = materialButton.getWidth();
                    int i4 = -width;
                    for (int i5 = 0; i5 < c9451.f24563; i5++) {
                        C9445 c9445 = (C9445) c9451.f24560[i5].f22564;
                        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = c9445.f24538;
                        float f = c9445.f24537;
                        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
                            fMax = Math.max(i4, f);
                        } else if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PERCENT) {
                            fMax = Math.max(i4, width * f);
                        }
                        i4 = (int) fMax;
                    }
                    int iMax = Math.max(0, i4);
                    MaterialButton materialButtonM7632 = m7632(i3);
                    int allowedWidthDecrease = materialButtonM7632 == null ? 0 : materialButtonM7632.getAllowedWidthDecrease();
                    MaterialButton materialButtonM7633 = m7633(i3);
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButtonM7633 != null ? materialButtonM7633.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
            i3++;
        }
        while (i <= i2) {
            if (m7635(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f10512);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7630() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f10512 == null) {
            return;
        }
        if (this.f10517 != 2) {
            m7629(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10507;
            if (i >= arrayList.size()) {
                return;
            }
            m7629(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7631() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f10511 <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsM7627 = m7627(childAt);
            if (getOrientation() == 0) {
                layoutParamsM7627.setMarginEnd(0);
                layoutParamsM7627.setMarginStart(this.f10511 - iMin);
                layoutParamsM7627.topMargin = 0;
            } else {
                layoutParamsM7627.bottomMargin = 0;
                layoutParamsM7627.topMargin = this.f10511 - iMin;
                layoutParamsM7627.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsM7627);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsM76272 = m7627((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsM76272.topMargin = 0;
            layoutParamsM76272.bottomMargin = 0;
        } else {
            layoutParamsM76272.setMarginEnd(0);
            layoutParamsM76272.setMarginStart(0);
            layoutParamsM76272.leftMargin = 0;
            layoutParamsM76272.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final MaterialButton m7632(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (m7635(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.f10507;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= iIntValue && i < iIntValue2 && (i2 < iIntValue || i2 >= iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final MaterialButton m7633(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (m7635(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.f10507;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= iIntValue && i <= iIntValue2 && (i2 < iIntValue || i2 > iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7634() {
        int i;
        if (!(this.f10513 == null && this.f10514 == null) && this.f10508) {
            this.f10508 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    InterfaceC9464 interfaceC9464 = this.f10514;
                    ArrayList arrayList = this.f10515;
                    if (interfaceC9464 == null || (!z && !z2)) {
                        interfaceC9464 = (InterfaceC9464) arrayList.get(i2);
                    }
                    C6977 c6977 = !(interfaceC9464 instanceof C9446) ? new C6977((C9469) arrayList.get(i2)) : ((C9446) interfaceC9464).m14856();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    C9447 c9447 = this.f10513;
                    if ((i3 | 1) == i3) {
                        c6977.f17215 = c9447;
                    }
                    if ((i3 | 2) == i3) {
                        c6977.f17222 = c9447;
                    }
                    if ((i3 | 4) == i3) {
                        c6977.f17221 = c9447;
                    }
                    if ((i3 | 8) == i3) {
                        c6977.f17223 = c9447;
                    }
                    C9446 c9446M12093 = c6977.m12093();
                    boolean zMo14849 = c9446M12093.mo14849();
                    C9446 c9446M14855 = c9446M12093;
                    if (!zMo14849) {
                        c9446M14855 = c9446M12093.m14855();
                    }
                    materialButton.setShapeAppearance(c9446M14855);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m7635(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7636() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f10439;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f10439 = null;
                materialButton.f10443 = -2.1474836E9f;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7626(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C3924(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7626(layoutParams);
    }
}
