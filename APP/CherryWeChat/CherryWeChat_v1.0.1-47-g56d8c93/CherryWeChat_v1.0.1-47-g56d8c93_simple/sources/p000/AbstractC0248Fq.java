package p000;

import android.content.Context;
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

    public AbstractC0248Fq(Context r13, AttributeSet r14) {
        super(AbstractC0148Dc.m291y(r13, r14, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), r14, R.attr.materialButtonToggleGroupStyle);
        this.f807a = new ArrayList();
        this.f808b = new ArrayList();
        MaterialButtonToggleGroup r0 = (MaterialButtonToggleGroup) this;
        this.f809c = new C1017Xm(3, r0);
        this.f810d = new C0060Ba(1, r0);
        this.f816j = true;
        Context r1 = getContext();
        TypedArray r142 = AbstractC1293cr.m2534G(r1, r14, AbstractC0939Vu.f2942k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        C1301cz r6 = null;
        if (r142.hasValue(2) == false) goto L35;
        int r02 = r142.getResourceId(2, 0);
        if (r02 != 0) goto L8;
    L6:
        C1388ez r03 = null;
    L33:
        this.f815i = r03;
        goto L35
    L8:
        if (r1.getResources().getResourceTypeName(r02).equals("xml") == false) goto L6;
        XmlResourceParser r8 = r1.getResources().getXml(r02);     // Catch: Throwable -> L78
        r03 = new C1388ez();     // Catch: Throwable -> L21
        r03.f4938c = new int[10][];     // Catch: Throwable -> L21
        r03.f4939d = new C1017Xm[10];     // Catch: Throwable -> L21
        AttributeSet r9 = Xml.asAttributeSet(r8);     // Catch: Throwable -> L21
    L12:
        int r10 = r8.next();     // Catch: Throwable -> L21
        if (r10 == 2) goto L16;
        if (r10 != 1) goto L12;
    L16:
        if (r10 != 2) goto L26;
        if (r8.getName().equals("selector") == false) goto L23;
        r03.m2671a(r1, r8, r9, r1.getTheme());     // Catch: Throwable -> L21
    L23:
        r8.close();     // Catch: Throwable -> L78 Throwable -> L78 Throwable -> L78
        goto L33
    L26:
        throw new XmlPullParserException("No start tag found");     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        if (r8 == null) goto L91;
        r8.close();     // Catch: Throwable -> L30
        throw th;     // Catch: Throwable -> L78 Throwable -> L78 Throwable -> L78
    L30:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L78 Throwable -> L78 Throwable -> L78
        throw th;     // Catch: Throwable -> L78 Throwable -> L78 Throwable -> L78
    L91:
        throw th;     // Catch: Throwable -> L78 Throwable -> L78 Throwable -> L78
    L35:
        if (r142.hasValue(4) == false) goto L44;
        C1301cz r82 = C1301cz.m2565b(r1, r142, 4);
        this.f813g = r82;
        if (r82 != null) goto L44;
        C1239bz r83 = new C1239bz(C0728Qx.m1511a(r1, r142.getResourceId(4, 0), r142.getResourceId(5, 0), new C2436r(0)).m1383a());
        if (r83.f4210a == 0) goto L42;
        r6 = new C1301cz(r83);
    L42:
        this.f813g = r6;
    L44:
        if (r142.hasValue(3) == false) goto L76;
        C2436r r62 = new C2436r(0.0f);
        int r84 = r142.getResourceId(3, 0);
        if (r84 != 0) goto L49;
        C1196az r04 = C1196az.m2313b(C0728Qx.m1513c(r142, 3, r62));
    L75:
        this.f812f = r04;
        goto L76
    L49:
        if (r1.getResources().getResourceTypeName(r84).equals("xml") == true) goto L85;
        r04 = C1196az.m2313b(C0728Qx.m1513c(r142, 3, r62));
        goto L75
    L85:
        XmlResourceParser r5 = r1.getResources().getXml(r84);     // Catch: Throwable -> L74
        r04 = new C1196az();     // Catch: Throwable -> L62
        AttributeSet r85 = Xml.asAttributeSet(r5);     // Catch: Throwable -> L62
    L53:
        int r92 = r5.next();     // Catch: Throwable -> L62
        if (r92 == 2) goto L57;
        if (r92 != 1) goto L53;
    L57:
        if (r92 != 2) goto L67;
        if (r5.getName().equals("selector") == false) goto L64;
        r04.m2316d(r1, r5, r85, r1.getTheme());     // Catch: Throwable -> L62
    L64:
        r5.close();     // Catch: Throwable -> L74 Throwable -> L74 Throwable -> L74
        goto L75
    L67:
        throw new XmlPullParserException("No start tag found");     // Catch: Throwable -> L62
    L62:
        th = move-exception;
        if (r5 == null) goto L93;
        r5.close();     // Catch: Throwable -> L71
        throw th;     // Catch: Throwable -> L74 Throwable -> L74 Throwable -> L74
    L71:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L74 Throwable -> L74 Throwable -> L74
        throw th;     // Catch: Throwable -> L74 Throwable -> L74 Throwable -> L74
    L93:
        throw th;     // Catch: Throwable -> L74 Throwable -> L74 Throwable -> L74
    L74:
        r04 = C1196az.m2313b(r62);
    L76:
        this.f814h = r142.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(r142.getBoolean(0, true));
        r142.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int r0 = getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (m518c(r1) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L8;
        if (m518c(r0) == true) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r0;
    L8:
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton r3) {
        if (r3.getId() != (-1)) goto L6;
        r3.setId(View.generateViewId());
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m516a() {
        int r0 = getFirstVisibleChildIndex();
        if (r0 == (-1)) goto L35;
        int r2 = r0 + 1;
    L7:
        if (r2 >= getChildCount()) goto L22;
        MaterialButton r3 = (MaterialButton) getChildAt(r2);
        MaterialButton r6 = (MaterialButton) getChildAt(r2 - 1);
        if (this.f814h > 0) goto L11;
        int r7 = Math.min(r3.getStrokeWidth(), r6.getStrokeWidth());
        r3.setShouldDrawSurfaceColorStroke(true);
        r6.setShouldDrawSurfaceColorStroke(true);
    L12:
        ViewGroup.LayoutParams r4 = r3.getLayoutParams();
        if ((r4 instanceof LinearLayout.LayoutParams) == false) goto L15;
        LinearLayout.LayoutParams r42 = (LinearLayout.LayoutParams) r4;
    L17:
        if (getOrientation() != 0) goto L19;
        r42.setMarginEnd(0);
        r42.setMarginStart(this.f814h - r7);
        r42.topMargin = 0;
    L20:
        r3.setLayoutParams(r42);
        r2 = r2 + 1;
        goto L7
    L19:
        r42.bottomMargin = 0;
        r42.topMargin = this.f814h - r7;
        r42.setMarginStart(0);
        goto L20
    L15:
        r42 = new LinearLayout.LayoutParams(r4.width, r4.height);
        goto L17
    L11:
        r3.setShouldDrawSurfaceColorStroke(false);
        r6.setShouldDrawSurfaceColorStroke(false);
        r7 = 0;
        goto L12
    L22:
        if (getChildCount() == 0) goto L34;
        if (r0 == (-1)) goto L36;
        LinearLayout.LayoutParams r02 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(r0)).getLayoutParams();
        if (getOrientation() != 1) goto L29;
        r02.topMargin = 0;
        r02.bottomMargin = 0;
        return;
    L29:
        r02.setMarginEnd(0);
        r02.setMarginStart(0);
        r02.leftMargin = 0;
        r02.rightMargin = 0;
        return;
    L36:
        return;
    L34:
        return;
    }

    @Override // android.view.ViewGroup
    public void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if ((r2 instanceof MaterialButton) == true) goto L5;
        return;
    L5:
        m519d();
        this.f816j = true;
        super.addView(r2, r3, r4);
        MaterialButton r22 = (MaterialButton) r2;
        setGeneratedIdIfNeeded(r22);
        r22.setOnPressedChangeListenerInternal(this.f809c);
        this.f807a.add(r22.getShapeAppearanceModel());
        this.f808b.add(r22.getStateListShapeAppearanceModel());
        r22.setEnabled(isEnabled());
    }

    /* JADX INFO: renamed from: b */
    public final void m517b() {
        if (this.f815i != null) goto L5;
        return;
    L5:
        if (getChildCount() == 0) goto L81;
        int r0 = getFirstVisibleChildIndex();
        int r1 = getLastVisibleChildIndex();
        int r2 = Integer.MAX_VALUE;
        int r3 = r0;
    L8:
        if (r3 > r1) goto L54;
        if (m518c(r3) == false) goto L53;
        int r5 = 0;
        if (m518c(r3) == true) goto L15;
    L49:
        if (r3 == r0) goto L52;
        if (r3 == r1) goto L52;
        r5 = r5 / 2;
    L52:
        r2 = Math.min(r2, r5);
        goto L53
    L15:
        if (this.f815i == null) goto L49;
        MaterialButton r4 = (MaterialButton) getChildAt(r3);
        C1388ez r6 = this.f815i;
        int r42 = r4.getWidth();
        int r7 = -r42;
        int r8 = 0;
    L19:
        if (r8 >= r6.f4936a) goto L28;
        C1344dz r9 = (C1344dz) r6.f4939d[r8].f3226b;
        int r10 = r9.f4837a;
        float r92 = r9.f4838b;
        if (r10 != 2) goto L25;
        float r72 = Math.max(r7, r92);
    L23:
        r7 = (int) r72;
    L27:
        r8 = r8 + 1;
        goto L19
    L25:
        if (r10 != 1) goto L27;
        r72 = Math.max(r7, r42 * r92);
        goto L23
    L28:
        int r43 = Math.max(0, r7);
        int r62 = r3 - 1;
    L29:
        MaterialButton r73 = null;
        if (r62 < 0) goto L35;
        if (m518c(r62) == true) goto L33;
        r62 = r62 - 1;
        goto L29
    L33:
        MaterialButton r63 = (MaterialButton) getChildAt(r62);
    L36:
        if (r63 != null) goto L38;
        int r64 = 0;
    L39:
        int r82 = getChildCount();
        int r93 = r3 + 1;
    L40:
        if (r93 >= r82) goto L45;
        if (m518c(r93) == true) goto L43;
        r93 = r93 + 1;
        goto L40
    L43:
        r73 = (MaterialButton) getChildAt(r93);
    L45:
        if (r73 == null) goto L48;
        r5 = r73.getAllowedWidthDecrease();
    L48:
        r5 = Math.min(r43, r64 + r5);
        goto L49
    L38:
        r64 = r63.getAllowedWidthDecrease();
        goto L39
    L35:
        r63 = null;
    L53:
        r3 = r3 + 1;
        goto L8
    L54:
        int r32 = r0;
    L55:
        if (r32 > r1) goto L82;
        if (m518c(r32) == false) goto L66;
        ((MaterialButton) getChildAt(r32)).setSizeChange(this.f815i);
        MaterialButton r44 = (MaterialButton) getChildAt(r32);
        if (r32 == r0) goto L64;
        if (r32 == r1) goto L64;
        int r52 = r2 * 2;
    L65:
        r44.setWidthChangeMax(r52);
    L64:
        r52 = r2;
    L66:
        r32 = r32 + 1;
        goto L55
    L82:
        return;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m518c(int r2) {
        if (getChildAt(r2).getVisibility() == 8) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m519d() {
        int r0 = 0;
    L4:
        if (r0 >= getChildCount()) goto L9;
        MaterialButton r1 = (MaterialButton) getChildAt(r0);
        LinearLayout.LayoutParams r2 = r1.f4493v;
        if (r2 == null) goto L8;
        r1.setLayoutParams(r2);
        r1.f4493v = null;
        r1.f4490s = -1.0f;
    L8:
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r7) {
        TreeMap r0 = new TreeMap(this.f810d);
        int r1 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r0.put((MaterialButton) getChildAt(r3), Integer.valueOf(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        this.f811e = (Integer[]) r0.values().toArray(new Integer[0]);
        super.dispatchDraw(r7);
    }

    /* JADX INFO: renamed from: e */
    public final void m520e() {
        if (this.f812f != null) goto L7;
        if (this.f813g != null) goto L7;
        return;
    L7:
        if (this.f816j == false) goto L76;
        this.f816j = false;
        int r2 = getChildCount();
        int r3 = getFirstVisibleChildIndex();
        int r4 = getLastVisibleChildIndex();
        int r5 = 0;
    L10:
        if (r5 >= r2) goto L77;
        MaterialButton r6 = (MaterialButton) getChildAt(r5);
        if (r6.getVisibility() == 8) goto L70;
        if (r5 != r3) goto L16;
        boolean r8 = true;
    L17:
        if (r5 != r4) goto L19;
        boolean r9 = true;
    L20:
        C1301cz r10 = this.f813g;
        if (r10 == null) goto L25;
        if (r8 == true) goto L26;
        if (r9 == false) goto L25;
    L26:
        if (r10 != null) goto L28;
        C1239bz r102 = new C1239bz((C0728Qx) this.f807a.get(r5));
    L30:
        if (getOrientation() != 0) goto L32;
        boolean r7 = true;
    L34:
        if (getLayoutDirection() != 1) goto L36;
        boolean r12 = true;
    L37:
        if (r7 == false) goto L45;
        if (r8 == false) goto L40;
        int r72 = 5;
    L41:
        if (r9 == false) goto L43;
        r72 = r72 | 10;
    L43:
        if (r12 == false) goto L50;
        int r82 = r72 & 5;
        r72 = ((r72 & 10) >> 1) | (r82 << 1);
    L50:
        int r73 = ~r72;
        C1196az r83 = this.f812f;
        if ((r73 | 1) != r73) goto L54;
        r102.f4214e = r83;
    L54:
        if ((r73 | 2) != r73) goto L57;
        r102.f4215f = r83;
    L57:
        if ((r73 | 4) != r73) goto L60;
        r102.f4216g = r83;
    L60:
        if ((r73 | 8) != r73) goto L63;
        r102.f4217h = r83;
    L63:
        if (r102.f4210a != 0) goto L65;
        C1301cz r74 = null;
    L67:
        if (r74.m2567d() == false) goto L69;
        r6.setStateListShapeAppearanceModel(r74);
        goto L70
    L69:
        r6.setShapeAppearanceModel(r74.m2566c());
        goto L70
    L65:
        r74 = new C1301cz(r102);
        goto L67
    L40:
        r72 = 0;
        goto L41
    L45:
        if (r8 == false) goto L47;
        r72 = 3;
    L48:
        if (r9 == false) goto L50;
        r72 = r72 | 12;
        goto L50
    L47:
        r72 = 0;
        goto L48
    L36:
        r12 = false;
        goto L37
    L32:
        r7 = false;
        goto L34
    L28:
        C1239bz r11 = new C1239bz();
        int r122 = r10.f4736a;
        r11.f4210a = r122;
        r11.f4211b = r10.f4737b;
        int[][] r13 = r10.f4738c;
        int[][] r14 = new int[r13.length][];
        r11.f4212c = r14;
        C0728Qx[] r15 = r10.f4739d;
        r11.f4213d = new C0728Qx[r15.length];
        System.arraycopy(r13, 0, r14, 0, r122);
        System.arraycopy(r15, 0, r11.f4213d, 0, r11.f4210a);
        r11.f4214e = r10.f4740e;
        r11.f4215f = r10.f4741f;
        r11.f4216g = r10.f4742g;
        r11.f4217h = r10.f4743h;
        r102 = r11;
    L25:
        r10 = (C1301cz) this.f808b.get(r5);
        goto L26
    L19:
        r9 = false;
        goto L20
    L16:
        r8 = false;
    L70:
        r5 = r5 + 1;
        goto L10
    L77:
        return;
    }

    public C1388ez getButtonSizeChange() {
        return this.f815i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
        Integer[] r22 = this.f811e;
        if (r22 != null) goto L5;
    L9:
        return r3;
    L5:
        if (r3 >= r22.length) goto L9;
        return r22[r3].intValue();
    }

    public InterfaceC1006Xb getInnerCornerSize() {
        return this.f812f.f4105b;
    }

    public C1196az getInnerCornerSizeStateList() {
        return this.f812f;
    }

    public C0728Qx getShapeAppearance() {
        C1301cz r0 = this.f813g;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.m2566c();
    }

    public int getSpacing() {
        return this.f814h;
    }

    public C1301cz getStateListShapeAppearance() {
        return this.f813g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        if (r1 == false) goto L6;
        m519d();
        m517b();
        return;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        m520e();
        m516a();
        super.onMeasure(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View r3) {
        super.onViewRemoved(r3);
        if ((r3 instanceof MaterialButton) == false) goto L5;
        ((MaterialButton) r3).setOnPressedChangeListenerInternal(null);
    L5:
        int r32 = indexOfChild(r3);
        if (r32 < 0) goto L8;
        this.f807a.remove(r32);
        this.f808b.remove(r32);
    L8:
        this.f816j = true;
        m520e();
        m519d();
        m516a();
    }

    public void setButtonSizeChange(C1388ez r2) {
        if (this.f815i == r2) goto L6;
        this.f815i = r2;
        m517b();
        requestLayout();
        invalidate();
        return;
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
        super.setEnabled(r3);
        int r0 = 0;
    L4:
        if (r0 >= getChildCount()) goto L6;
        ((MaterialButton) getChildAt(r0)).setEnabled(r3);
        r0 = r0 + 1;
        goto L4
    }

    public void setInnerCornerSize(InterfaceC1006Xb r1) {
        this.f812f = C1196az.m2313b(r1);
        this.f816j = true;
        m520e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C1196az r1) {
        this.f812f = r1;
        this.f816j = true;
        m520e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
        if (getOrientation() == r2) goto L5;
        this.f816j = true;
    L5:
        super.setOrientation(r2);
    }

    public void setShapeAppearance(C0728Qx r2) {
        C1239bz r0 = new C1239bz(r2);
        if (r0.f4210a != 0) goto L5;
        C1301cz r22 = null;
    L6:
        this.f813g = r22;
        this.f816j = true;
        m520e();
        invalidate();
        return;
    L5:
        r22 = new C1301cz(r0);
        goto L6
    }

    public void setSpacing(int r1) {
        this.f814h = r1;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C1301cz r1) {
        this.f813g = r1;
        this.f816j = true;
        m520e();
        invalidate();
    }
}
