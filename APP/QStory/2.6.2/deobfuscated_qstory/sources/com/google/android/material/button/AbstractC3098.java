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
import androidx.compose.ui.semantics.C1945;
import androidx.core.view.C2242;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import p015.C6221;
import p230.C8048;
import p268.AbstractC8266;
import p305.C8624;
import p305.C8625;
import p305.C8626;
import p305.C8630;
import p305.C8636;
import p305.C8648;
import p305.InterfaceC8633;
import p305.InterfaceC8643;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3098 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Object f10156 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f10157;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10158;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Integer[] f10159;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1945 f10160;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C8630 f10162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C8626 f10163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8625 f10164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f10165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2242 f10166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10167;

    public AbstractC3098(Context context, AttributeSet attributeSet) {
        C8626 c8626M14279;
        XmlResourceParser xml;
        int next;
        int next2;
        super(AbstractC8266.m13812(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f10167 = 0;
        this.f10165 = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f10166 = new C2242(materialButtonToggleGroup, 11);
        this.f10160 = new C1945(materialButtonToggleGroup, 1);
        this.f10158 = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f10157 = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24444, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM7195.hasValue(2)) {
            int resourceId = typedArrayM7195.getResourceId(2, 0);
            C8630 c8630 = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        C8630 c86302 = new C8630();
                        c86302.f24225 = new int[10][];
                        c86302.f24224 = new C8048[10];
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
                            c86302.m14288(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c8630 = c86302;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f10162 = c8630;
        }
        if (typedArrayM7195.hasValue(6)) {
            C8625 c8625M14269 = C8625.m14269(context2, typedArrayM7195, 6);
            this.f10164 = c8625M14269;
            if (c8625M14269 == null) {
                int resourceId2 = typedArrayM7195.getResourceId(6, 0);
                int resourceId3 = typedArrayM7195.getResourceId(7, 0);
                C8636 c8636 = new C8636(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f10164 = new C6221(C8648.m14302(contextThemeWrapper.obtainStyledAttributes(AbstractC8669.f24420), c8636).m14301()).m11663();
            }
        }
        if (typedArrayM7195.hasValue(3)) {
            C8636 c86362 = new C8636(0.0f);
            int resourceId4 = typedArrayM7195.getResourceId(3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        c8626M14279 = new C8626();
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
                            c8626M14279.m14280(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    c8626M14279 = C8626.m14279(c86362);
                }
            } else {
                c8626M14279 = C8626.m14279(C8648.m14304(typedArrayM7195, 3, c86362));
            }
            this.f10163 = c8626M14279;
        }
        this.f10161 = typedArrayM7195.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM7195.getBoolean(0, true));
        setOverflowMode(typedArrayM7195.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayM7195.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m7089(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m7089(childCount)) {
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
    public static C3091 m7080(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C3091((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3091((ViewGroup.MarginLayoutParams) layoutParams) : new C3091(layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinearLayout.LayoutParams m7081(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C3091(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m7090();
        this.f10158 = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f10166);
        this.f10165.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3091;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f10160);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f10159 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3091(-2, -2);
    }

    public C8630 getButtonSizeChange() {
        return this.f10162;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f10159;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public InterfaceC8633 getInnerCornerSize() {
        return this.f10163.f24213;
    }

    public C8626 getInnerCornerSizeStateList() {
        return this.f10163;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f10167;
    }

    public C8648 getShapeAppearance() {
        C8625 c8625 = this.f10164;
        if (c8625 == null) {
            return null;
        }
        return c8625.m14277();
    }

    public int getSpacing() {
        return this.f10161;
    }

    public C8625 getStateListShapeAppearance() {
        return this.f10164;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m7090();
            m7084();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        m7085();
        if (this.f10167 != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                C5919.m11249("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                C5919.m11249("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.f10157;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (m7089(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsM7081 = m7081(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f10161) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.f10161);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsM7081.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.f10161);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsM7081.topMargin += i4;
                        view.setLayoutParams(layoutParamsM7081);
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
                LinearLayout.LayoutParams layoutParamsM70812 = m7081(materialButton);
                int i8 = layoutParamsM70812.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsM70812.setMarginStart((layoutParamsM70812.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsM70812);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        m7088();
        super.onMeasure(i, i2);
        if (this.f10167 != 2 || paddingBottom == getMeasuredHeight()) {
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
            this.f10165.remove(iIndexOfChild);
        }
        this.f10158 = true;
        m7088();
        m7090();
        m7085();
    }

    public void setButtonSizeChange(C8630 c8630) {
        if (this.f10162 != c8630) {
            this.f10162 = c8630;
            m7084();
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

    public void setInnerCornerSize(InterfaceC8633 interfaceC8633) {
        this.f10163 = C8626.m14279(interfaceC8633);
        this.f10158 = true;
        m7088();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C8626 c8626) {
        this.f10163 = c8626;
        this.f10158 = true;
        m7088();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f10158 = true;
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
        if (this.f10167 != i) {
            this.f10167 = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(C8648 c8648) {
        this.f10164 = new C6221(c8648).m11663();
        this.f10158 = true;
        m7088();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f10161 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C8625 c8625) {
        this.f10164 = c8625;
        this.f10158 = true;
        m7088();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3091 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3091 c3091 = new C3091(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24448);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c3091;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7083(int i, int i2) {
        float fMax;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (m7089(i3)) {
                ((MaterialButton) getChildAt(i3)).setWidthChangeDirection(i3 == i ? MaterialButton.WidthChangeDirection.END : i3 == i2 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH);
                if (m7089(i3) && this.f10162 != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                    C8630 c8630 = this.f10162;
                    int width = materialButton.getWidth();
                    int i4 = -width;
                    for (int i5 = 0; i5 < c8630.f24227; i5++) {
                        C8624 c8624 = (C8624) c8630.f24224[i5].f22221;
                        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = c8624.f24202;
                        float f = c8624.f24201;
                        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
                            fMax = Math.max(i4, f);
                        } else if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PERCENT) {
                            fMax = Math.max(i4, width * f);
                        }
                        i4 = (int) fMax;
                    }
                    int iMax = Math.max(0, i4);
                    MaterialButton materialButtonM7086 = m7086(i3);
                    int allowedWidthDecrease = materialButtonM7086 == null ? 0 : materialButtonM7086.getAllowedWidthDecrease();
                    MaterialButton materialButtonM7087 = m7087(i3);
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButtonM7087 != null ? materialButtonM7087.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
            i3++;
        }
        while (i <= i2) {
            if (m7089(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f10162);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7084() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f10162 == null) {
            return;
        }
        if (this.f10167 != 2) {
            m7083(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10157;
            if (i >= arrayList.size()) {
                return;
            }
            m7083(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7085() {
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
                if (this.f10161 <= 0) {
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
            LinearLayout.LayoutParams layoutParamsM7081 = m7081(childAt);
            if (getOrientation() == 0) {
                layoutParamsM7081.setMarginEnd(0);
                layoutParamsM7081.setMarginStart(this.f10161 - iMin);
                layoutParamsM7081.topMargin = 0;
            } else {
                layoutParamsM7081.bottomMargin = 0;
                layoutParamsM7081.topMargin = this.f10161 - iMin;
                layoutParamsM7081.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsM7081);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsM70812 = m7081((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsM70812.topMargin = 0;
            layoutParamsM70812.bottomMargin = 0;
        } else {
            layoutParamsM70812.setMarginEnd(0);
            layoutParamsM70812.setMarginStart(0);
            layoutParamsM70812.leftMargin = 0;
            layoutParamsM70812.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final MaterialButton m7086(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (m7089(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.f10157;
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
    public final MaterialButton m7087(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (m7089(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.f10157;
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
    public final void m7088() {
        int i;
        if (!(this.f10163 == null && this.f10164 == null) && this.f10158) {
            this.f10158 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    InterfaceC8643 interfaceC8643 = this.f10164;
                    ArrayList arrayList = this.f10165;
                    if (interfaceC8643 == null || (!z && !z2)) {
                        interfaceC8643 = (InterfaceC8643) arrayList.get(i2);
                    }
                    C6221 c6221 = !(interfaceC8643 instanceof C8625) ? new C6221((C8648) arrayList.get(i2)) : ((C8625) interfaceC8643).m14278();
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
                    C8626 c8626 = this.f10163;
                    if ((i3 | 1) == i3) {
                        c6221.f17109 = c8626;
                    }
                    if ((i3 | 2) == i3) {
                        c6221.f17116 = c8626;
                    }
                    if ((i3 | 4) == i3) {
                        c6221.f17115 = c8626;
                    }
                    if ((i3 | 8) == i3) {
                        c6221.f17117 = c8626;
                    }
                    C8625 c8625M11663 = c6221.m11663();
                    boolean zMo14271 = c8625M11663.mo14271();
                    C8625 c8625M14277 = c8625M11663;
                    if (!zMo14271) {
                        c8625M14277 = c8625M11663.m14277();
                    }
                    materialButton.setShapeAppearance(c8625M14277);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m7089(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7090() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f10089;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f10089 = null;
                materialButton.f10093 = -2.1474836E9f;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7080(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C3091(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7080(layoutParams);
    }
}
