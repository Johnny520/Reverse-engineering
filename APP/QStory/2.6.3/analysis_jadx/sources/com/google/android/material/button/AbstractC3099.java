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
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import p007.C6148;
import p230.C8049;
import p268.AbstractC8267;
import p305.C8616;
import p305.C8617;
import p305.C8618;
import p305.C8622;
import p305.C8628;
import p305.C8640;
import p305.InterfaceC8625;
import p305.InterfaceC8635;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3099 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Object f10161 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f10162;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Integer[] f10164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1945 f10165;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C8622 f10167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C8618 f10168;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8617 f10169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f10170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2242 f10171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10172;

    public AbstractC3099(Context context, AttributeSet attributeSet) {
        C8618 c8618M14298;
        XmlResourceParser xml;
        int next;
        int next2;
        super(AbstractC8267.m13829(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f10172 = 0;
        this.f10170 = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f10171 = new C2242(materialButtonToggleGroup, 11);
        this.f10165 = new C1945(materialButtonToggleGroup, 1);
        this.f10163 = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f10162 = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context2, attributeSet, AbstractC8661.f24435, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM7182.hasValue(2)) {
            int resourceId = typedArrayM7182.getResourceId(2, 0);
            C8622 c8622 = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        C8622 c86222 = new C8622();
                        c86222.f24216 = new int[10][];
                        c86222.f24215 = new C8049[10];
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
                            c86222.m14307(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c8622 = c86222;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f10167 = c8622;
        }
        if (typedArrayM7182.hasValue(6)) {
            C8617 c8617M14288 = C8617.m14288(context2, typedArrayM7182, 6);
            this.f10169 = c8617M14288;
            if (c8617M14288 == null) {
                int resourceId2 = typedArrayM7182.getResourceId(6, 0);
                int resourceId3 = typedArrayM7182.getResourceId(7, 0);
                C8628 c8628 = new C8628(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f10169 = new C6148(C8640.m14320(contextThemeWrapper.obtainStyledAttributes(AbstractC8661.f24411), c8628).m14319()).m11534();
            }
        }
        if (typedArrayM7182.hasValue(3)) {
            C8628 c86282 = new C8628(0.0f);
            int resourceId4 = typedArrayM7182.getResourceId(3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        c8618M14298 = new C8618();
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
                            c8618M14298.m14299(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    c8618M14298 = C8618.m14298(c86282);
                }
            } else {
                c8618M14298 = C8618.m14298(C8640.m14322(typedArrayM7182, 3, c86282));
            }
            this.f10168 = c8618M14298;
        }
        this.f10166 = typedArrayM7182.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM7182.getBoolean(0, true));
        setOverflowMode(typedArrayM7182.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayM7182.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m7076(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m7076(childCount)) {
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
    public static C3092 m7067(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C3092((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3092((ViewGroup.MarginLayoutParams) layoutParams) : new C3092(layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinearLayout.LayoutParams m7068(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C3092(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m7077();
        this.f10163 = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f10171);
        this.f10170.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3092;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f10165);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f10164 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3092(-2, -2);
    }

    public C8622 getButtonSizeChange() {
        return this.f10167;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f10164;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public InterfaceC8625 getInnerCornerSize() {
        return this.f10168.f24204;
    }

    public C8618 getInnerCornerSizeStateList() {
        return this.f10168;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f10172;
    }

    public C8640 getShapeAppearance() {
        C8617 c8617 = this.f10169;
        if (c8617 == null) {
            return null;
        }
        return c8617.m14296();
    }

    public int getSpacing() {
        return this.f10166;
    }

    public C8617 getStateListShapeAppearance() {
        return this.f10169;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m7077();
            m7071();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        m7072();
        if (this.f10172 != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                C5925.m11310("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                C5925.m11310("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.f10162;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (m7076(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsM7068 = m7068(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f10166) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.f10166);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsM7068.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.f10166);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsM7068.topMargin += i4;
                        view.setLayoutParams(layoutParamsM7068);
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
                LinearLayout.LayoutParams layoutParamsM70682 = m7068(materialButton);
                int i8 = layoutParamsM70682.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsM70682.setMarginStart((layoutParamsM70682.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsM70682);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        m7075();
        super.onMeasure(i, i2);
        if (this.f10172 != 2 || paddingBottom == getMeasuredHeight()) {
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
            this.f10170.remove(iIndexOfChild);
        }
        this.f10163 = true;
        m7075();
        m7077();
        m7072();
    }

    public void setButtonSizeChange(C8622 c8622) {
        if (this.f10167 != c8622) {
            this.f10167 = c8622;
            m7071();
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

    public void setInnerCornerSize(InterfaceC8625 interfaceC8625) {
        this.f10168 = C8618.m14298(interfaceC8625);
        this.f10163 = true;
        m7075();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C8618 c8618) {
        this.f10168 = c8618;
        this.f10163 = true;
        m7075();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f10163 = true;
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
        if (this.f10172 != i) {
            this.f10172 = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(C8640 c8640) {
        this.f10169 = new C6148(c8640).m11534();
        this.f10163 = true;
        m7075();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f10166 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C8617 c8617) {
        this.f10169 = c8617;
        this.f10163 = true;
        m7075();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3092 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3092 c3092 = new C3092(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24439);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c3092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7070(int i, int i2) {
        float fMax;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (m7076(i3)) {
                ((MaterialButton) getChildAt(i3)).setWidthChangeDirection(i3 == i ? MaterialButton.WidthChangeDirection.END : i3 == i2 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH);
                if (m7076(i3) && this.f10167 != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                    C8622 c8622 = this.f10167;
                    int width = materialButton.getWidth();
                    int i4 = -width;
                    for (int i5 = 0; i5 < c8622.f24218; i5++) {
                        C8616 c8616 = (C8616) c8622.f24215[i5].f22219;
                        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = c8616.f24193;
                        float f = c8616.f24192;
                        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
                            fMax = Math.max(i4, f);
                        } else if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PERCENT) {
                            fMax = Math.max(i4, width * f);
                        }
                        i4 = (int) fMax;
                    }
                    int iMax = Math.max(0, i4);
                    MaterialButton materialButtonM7073 = m7073(i3);
                    int allowedWidthDecrease = materialButtonM7073 == null ? 0 : materialButtonM7073.getAllowedWidthDecrease();
                    MaterialButton materialButtonM7074 = m7074(i3);
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButtonM7074 != null ? materialButtonM7074.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
            i3++;
        }
        while (i <= i2) {
            if (m7076(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f10167);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7071() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f10167 == null) {
            return;
        }
        if (this.f10172 != 2) {
            m7070(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10162;
            if (i >= arrayList.size()) {
                return;
            }
            m7070(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7072() {
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
                if (this.f10166 <= 0) {
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
            LinearLayout.LayoutParams layoutParamsM7068 = m7068(childAt);
            if (getOrientation() == 0) {
                layoutParamsM7068.setMarginEnd(0);
                layoutParamsM7068.setMarginStart(this.f10166 - iMin);
                layoutParamsM7068.topMargin = 0;
            } else {
                layoutParamsM7068.bottomMargin = 0;
                layoutParamsM7068.topMargin = this.f10166 - iMin;
                layoutParamsM7068.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsM7068);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsM70682 = m7068((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsM70682.topMargin = 0;
            layoutParamsM70682.bottomMargin = 0;
        } else {
            layoutParamsM70682.setMarginEnd(0);
            layoutParamsM70682.setMarginStart(0);
            layoutParamsM70682.leftMargin = 0;
            layoutParamsM70682.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final MaterialButton m7073(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (m7076(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.f10162;
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
    public final MaterialButton m7074(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (m7076(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.f10162;
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
    public final void m7075() {
        int i;
        if (!(this.f10168 == null && this.f10169 == null) && this.f10163) {
            this.f10163 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    InterfaceC8635 interfaceC8635 = this.f10169;
                    ArrayList arrayList = this.f10170;
                    if (interfaceC8635 == null || (!z && !z2)) {
                        interfaceC8635 = (InterfaceC8635) arrayList.get(i2);
                    }
                    C6148 c6148 = !(interfaceC8635 instanceof C8617) ? new C6148((C8640) arrayList.get(i2)) : ((C8617) interfaceC8635).m14297();
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
                    C8618 c8618 = this.f10168;
                    if ((i3 | 1) == i3) {
                        c6148.f16870 = c8618;
                    }
                    if ((i3 | 2) == i3) {
                        c6148.f16877 = c8618;
                    }
                    if ((i3 | 4) == i3) {
                        c6148.f16876 = c8618;
                    }
                    if ((i3 | 8) == i3) {
                        c6148.f16878 = c8618;
                    }
                    C8617 c8617M11534 = c6148.m11534();
                    boolean zMo14290 = c8617M11534.mo14290();
                    C8617 c8617M14296 = c8617M11534;
                    if (!zMo14290) {
                        c8617M14296 = c8617M11534.m14296();
                    }
                    materialButton.setShapeAppearance(c8617M14296);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m7076(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7077() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f10094;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f10094 = null;
                materialButton.f10098 = -2.1474836E9f;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7067(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C3092(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m7067(layoutParams);
    }
}
