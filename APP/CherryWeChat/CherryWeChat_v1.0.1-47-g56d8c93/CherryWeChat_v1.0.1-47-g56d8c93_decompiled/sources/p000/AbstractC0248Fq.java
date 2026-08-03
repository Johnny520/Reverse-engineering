package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import io.github.cherrywechat.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Fq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248Fq extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f807a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f808b;

    /* JADX INFO: renamed from: c */
    public final C1017Xm f809c;

    /* JADX INFO: renamed from: d */
    public final C0060Ba f810d;

    /* JADX INFO: renamed from: e */
    public Integer[] f811e;

    /* JADX INFO: renamed from: f */
    public C1196az f812f;

    /* JADX INFO: renamed from: g */
    public C1301cz f813g;

    /* JADX INFO: renamed from: h */
    public int f814h;

    /* JADX INFO: renamed from: i */
    public C1388ez f815i;

    /* JADX INFO: renamed from: j */
    public boolean f816j;

    public AbstractC0248Fq(Context context, AttributeSet attributeSet) {
        C1196az c1196azM2313b;
        XmlResourceParser xml;
        int next;
        C1388ez c1388ez;
        int next2;
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f807a = new ArrayList();
        this.f808b = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f809c = new C1017Xm(3, materialButtonToggleGroup);
        this.f810d = new C0060Ba(1, materialButtonToggleGroup);
        this.f816j = true;
        Context context2 = getContext();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2942k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM2534G.hasValue(2)) {
            int resourceId = typedArrayM2534G.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    c1388ez = null;
                }
                try {
                    c1388ez = new C1388ez();
                    c1388ez.f4938c = new int[10][];
                    c1388ez.f4939d = new C1017Xm[10];
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
                        c1388ez.m2671a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    this.f815i = c1388ez;
                } finally {
                }
            } else {
                c1388ez = null;
                this.f815i = c1388ez;
            }
        }
        if (typedArrayM2534G.hasValue(4)) {
            C1301cz c1301czM2565b = C1301cz.m2565b(context2, typedArrayM2534G, 4);
            this.f813g = c1301czM2565b;
            if (c1301czM2565b == null) {
                C1239bz c1239bz = new C1239bz(C0728Qx.m1511a(context2, typedArrayM2534G.getResourceId(4, 0), typedArrayM2534G.getResourceId(5, 0), new C2436r(0)).m1383a());
                this.f813g = c1239bz.f4210a != 0 ? new C1301cz(c1239bz) : null;
            }
        }
        if (typedArrayM2534G.hasValue(3)) {
            C2436r c2436r = new C2436r(0.0f);
            int resourceId2 = typedArrayM2534G.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        c1196azM2313b = new C1196az();
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
                            c1196azM2313b.m2316d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    c1196azM2313b = C1196az.m2313b(c2436r);
                }
            } else {
                c1196azM2313b = C1196az.m2313b(C0728Qx.m1513c(typedArrayM2534G, 3, c2436r));
            }
            this.f812f = c1196azM2313b;
        }
        this.f814h = typedArrayM2534G.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM2534G.getBoolean(0, true));
        typedArrayM2534G.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m518c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m518c(childCount)) {
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

    /* JADX INFO: renamed from: a */
    public final void m516a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.f814h <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f814h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f814h - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            m519d();
            this.f816j = true;
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.f809c);
            this.f807a.add(materialButton.getShapeAppearanceModel());
            this.f808b.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m517b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.f815i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (m518c(i)) {
                if (m518c(i) && this.f815i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    C1388ez c1388ez = this.f815i;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < c1388ez.f4936a; i3++) {
                        C1344dz c1344dz = (C1344dz) c1388ez.f4939d[i3].f3226b;
                        int i4 = c1344dz.f4837a;
                        float f = c1344dz.f4838b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else if (i4 == 1) {
                            fMax = Math.max(i2, width * f);
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (m518c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i6 = i + 1;
                    while (true) {
                        if (i6 >= childCount) {
                            break;
                        }
                        if (m518c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                        i6++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (m518c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.f815i);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m518c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m519d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f4493v;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f4493v = null;
                materialButton.f4490s = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f810d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f811e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m520e() {
        C1239bz c1239bz;
        int i;
        if (!(this.f812f == null && this.f813g == null) && this.f816j) {
            this.f816j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    C1301cz c1301cz = this.f813g;
                    if (c1301cz == null || (!z && !z2)) {
                        c1301cz = (C1301cz) this.f808b.get(i2);
                    }
                    if (c1301cz == null) {
                        c1239bz = new C1239bz((C0728Qx) this.f807a.get(i2));
                    } else {
                        C1239bz c1239bz2 = new C1239bz();
                        int i3 = c1301cz.f4736a;
                        c1239bz2.f4210a = i3;
                        c1239bz2.f4211b = c1301cz.f4737b;
                        int[][] iArr = c1301cz.f4738c;
                        int[][] iArr2 = new int[iArr.length][];
                        c1239bz2.f4212c = iArr2;
                        C0728Qx[] c0728QxArr = c1301cz.f4739d;
                        c1239bz2.f4213d = new C0728Qx[c0728QxArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(c0728QxArr, 0, c1239bz2.f4213d, 0, c1239bz2.f4210a);
                        c1239bz2.f4214e = c1301cz.f4740e;
                        c1239bz2.f4215f = c1301cz.f4741f;
                        c1239bz2.f4216g = c1301cz.f4742g;
                        c1239bz2.f4217h = c1301cz.f4743h;
                        c1239bz = c1239bz2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    C1196az c1196az = this.f812f;
                    if ((i4 | 1) == i4) {
                        c1239bz.f4214e = c1196az;
                    }
                    if ((i4 | 2) == i4) {
                        c1239bz.f4215f = c1196az;
                    }
                    if ((i4 | 4) == i4) {
                        c1239bz.f4216g = c1196az;
                    }
                    if ((i4 | 8) == i4) {
                        c1239bz.f4217h = c1196az;
                    }
                    C1301cz c1301cz2 = c1239bz.f4210a == 0 ? null : new C1301cz(c1239bz);
                    if (c1301cz2.m2567d()) {
                        materialButton.setStateListShapeAppearanceModel(c1301cz2);
                    } else {
                        materialButton.setShapeAppearanceModel(c1301cz2.m2566c());
                    }
                }
                i2++;
            }
        }
    }

    public C1388ez getButtonSizeChange() {
        return this.f815i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f811e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public InterfaceC1006Xb getInnerCornerSize() {
        return this.f812f.f4105b;
    }

    public C1196az getInnerCornerSizeStateList() {
        return this.f812f;
    }

    public C0728Qx getShapeAppearance() {
        C1301cz c1301cz = this.f813g;
        if (c1301cz == null) {
            return null;
        }
        return c1301cz.m2566c();
    }

    public int getSpacing() {
        return this.f814h;
    }

    public C1301cz getStateListShapeAppearance() {
        return this.f813g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m519d();
            m517b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m520e();
        m516a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f807a.remove(iIndexOfChild);
            this.f808b.remove(iIndexOfChild);
        }
        this.f816j = true;
        m520e();
        m519d();
        m516a();
    }

    public void setButtonSizeChange(C1388ez c1388ez) {
        if (this.f815i != c1388ez) {
            this.f815i = c1388ez;
            m517b();
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

    public void setInnerCornerSize(InterfaceC1006Xb interfaceC1006Xb) {
        this.f812f = C1196az.m2313b(interfaceC1006Xb);
        this.f816j = true;
        m520e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C1196az c1196az) {
        this.f812f = c1196az;
        this.f816j = true;
        m520e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f816j = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(C0728Qx c0728Qx) {
        C1239bz c1239bz = new C1239bz(c0728Qx);
        this.f813g = c1239bz.f4210a == 0 ? null : new C1301cz(c1239bz);
        this.f816j = true;
        m520e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f814h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C1301cz c1301cz) {
        this.f813g = c1301cz;
        this.f816j = true;
        m520e();
        invalidate();
    }
}
