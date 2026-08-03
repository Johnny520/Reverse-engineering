package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Ie */
/* JADX INFO: loaded from: classes.dex */
public class C0365Ie extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f1235a;

    /* JADX INFO: renamed from: b */
    public int f1236b;

    /* JADX INFO: renamed from: c */
    public int f1237c;

    /* JADX INFO: renamed from: d */
    public int f1238d;

    /* JADX INFO: renamed from: e */
    public int f1239e;

    /* JADX INFO: renamed from: f */
    public int f1240f;

    /* JADX INFO: renamed from: g */
    public C0279Ge f1241g;

    /* JADX INFO: renamed from: h */
    public boolean f1242h;

    /* JADX INFO: renamed from: i */
    public final boolean f1243i;

    /* JADX INFO: renamed from: j */
    public boolean f1244j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0504Lo f1245k;

    /* JADX INFO: renamed from: l */
    public RunnableC0431K0 f1246l;

    public C0365Ie(Context r3, boolean r4) {
        super(r3, null, R.attr.dropDownListViewStyle);
        this.f1235a = new Rect();
        this.f1236b = 0;
        this.f1237c = 0;
        this.f1238d = 0;
        this.f1239e = 0;
        this.f1243i = r4;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m806a(int r12, int r13) {
        int r0 = getListPaddingTop();
        int r1 = getListPaddingBottom();
        int r2 = getDividerHeight();
        Drawable r3 = getDivider();
        ListAdapter r4 = getAdapter();
        if (r4 == null) goto L5;
        int r02 = r0 + r1;
        if (r2 <= 0) goto L10;
        if (r3 == null) goto L10;
    L11:
        int r32 = r4.getCount();
        int r6 = 0;
        int r7 = 0;
        View r8 = null;
    L12:
        if (r6 >= r32) goto L30;
        int r9 = r4.getItemViewType(r6);
        if (r9 == r7) goto L16;
        r8 = null;
        r7 = r9;
    L16:
        r8 = r4.getView(r6, r8, this);
        ViewGroup.LayoutParams r92 = r8.getLayoutParams();
        if (r92 != null) goto L19;
        r92 = generateDefaultLayoutParams();
        r8.setLayoutParams(r92);
    L19:
        int r93 = r92.height;
        if (r93 <= 0) goto L22;
        int r94 = View.MeasureSpec.makeMeasureSpec(r93, 1073741824);
    L23:
        r8.measure(r12, r94);
        r8.forceLayout();
        if (r6 <= 0) goto L26;
        r02 = r02 + r2;
    L26:
        r02 = r02 + r8.getMeasuredHeight();
        if (r02 >= r13) goto L28;
        r6 = r6 + 1;
        goto L12
    L28:
        return r13;
    L22:
        r94 = View.MeasureSpec.makeMeasureSpec(0, 0);
        goto L23
    L30:
        return r02;
    L10:
        r2 = 0;
        goto L11
    L5:
        return r0 + r1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m807b(MotionEvent r18, int r19) {
        int r3 = r18.getActionMasked();
        boolean r5 = false;
        if (r3 != 1) goto L5;
        boolean r0 = false;
    L12:
        int r6 = r18.findPointerIndex(r19);
        if (r6 < 0) goto L9;
        int r7 = (int) r18.getX(r6);
        int r62 = (int) r18.getY(r6);
        int r8 = pointToPosition(r7, r62);
        if (r8 != (-1)) goto L18;
        r5 = true;
    L80:
        if (r0 == false) goto L82;
        if (r5 == true) goto L82;
    L85:
        if (r0 == true) goto L87;
        ViewOnTouchListenerC0504Lo r2 = this.f1245k;
        if (r2 != null) goto L93;
    L96:
        return r0;
    L93:
        if (r2.f1655p == false) goto L95;
        r2.m987d();
    L95:
        r2.f1655p = false;
        goto L96
    L87:
        if (this.f1245k != null) goto L89;
        this.f1245k = new ViewOnTouchListenerC0504Lo(this);
    L89:
        ViewOnTouchListenerC0504Lo r32 = this.f1245k;
        boolean r4 = r32.f1655p;
        r32.f1655p = true;
        r32.onTouch(this, r18);
    L82:
        this.f1244j = false;
        setPressed(false);
        drawableStateChanged();
        View r33 = getChildAt(this.f1240f - getFirstVisiblePosition());
        if (r33 == null) goto L85;
        r33.setPressed(false);
        goto L85
    L18:
        View r10 = getChildAt(r8 - getFirstVisiblePosition());
        float r72 = r7;
        float r63 = r62;
        this.f1244j = true;
        int r02 = Build.VERSION.SDK_INT;
        AbstractC0150De.m294a(this, r72, r63);
        if (isPressed() == true) goto L21;
        setPressed(true);
    L21:
        layoutChildren();
        int r11 = this.f1240f;
        if (r11 == (-1)) goto L29;
        View r112 = getChildAt(r11 - getFirstVisiblePosition());
        if (r112 == null) goto L29;
        if (r112 == r10) goto L29;
        if (r112.isPressed() == false) goto L29;
        r112.setPressed(false);
    L29:
        this.f1240f = r8;
        AbstractC0150De.m294a(r10, r72 - r10.getLeft(), r63 - r10.getTop());
        if (r10.isPressed() == true) goto L32;
        r10.setPressed(true);
    L32:
        Drawable r113 = getSelector();
        if (r113 == null) goto L36;
        if (r8 == (-1)) goto L36;
        boolean r12 = true;
    L37:
        if (r12 == false) goto L39;
        r113.setVisible(false, false);
    L39:
        int r13 = r10.getLeft();
        int r14 = r10.getTop();
        int r15 = r10.getRight();
        int r42 = r10.getBottom();
        Rect r52 = this.f1235a;
        r52.set(r13, r14, r15, r42);
        r52.left -= this.f1236b;
        r52.top -= this.f1237c;
        r52.right += this.f1238d;
        r52.bottom += this.f1239e;
        if (r02 < 33) goto L42;
        boolean r03 = AbstractC0236Fe.m482a(this);
    L50:
        if (r10.isEnabled() == r03) goto L62;
        boolean r04 = !r03;
        if (Build.VERSION.SDK_INT < 33) goto L54;
        AbstractC0236Fe.m483b(this, r04);
    L60:
        if (r8 == (-1)) goto L62;
        refreshDrawableState();
        goto L62
    L54:
        Field r43 = AbstractC0322He.f1089a;
        if (r43 == null) goto L60;
        r43.set(this, Boolean.valueOf(r04));     // Catch: IllegalAccessException -> L58
    L58:
        e = move-exception;
        e.printStackTrace();
    L62:
        if (r12 == false) goto L69;
        float r05 = r52.exactCenterX();
        float r44 = r52.exactCenterY();
        if (getVisibility() != 0) goto L67;
        boolean r53 = true;
    L68:
        r113.setVisible(r53, false);
        r113.setHotspot(r05, r44);
        goto L69
    L67:
        r53 = false;
    L69:
        Drawable r06 = getSelector();
        if (r06 == null) goto L73;
        if (r8 == (-1)) goto L73;
        r06.setHotspot(r72, r63);
    L73:
        C0279Ge r07 = this.f1241g;
        if (r07 == null) goto L76;
        r07.f906b = false;
    L76:
        refreshDrawableState();
        if (r3 != 1) goto L79;
        performItemClick(r10, r8, getItemIdAtPosition(r8));
    L79:
        r0 = true;
        r5 = false;
        goto L80
    L42:
        Field r08 = AbstractC0322He.f1089a;
        if (r08 != null) goto L97;
    L48:
        r03 = false;
        goto L50
    L97:
        r03 = r08.getBoolean(this);     // Catch: IllegalAccessException -> L46
    L46:
        e = move-exception;
        e.printStackTrace();
    L36:
        r12 = false;
    L9:
        r0 = false;
        goto L80
    L5:
        if (r3 != 2) goto L7;
        r0 = true;
        goto L12
    L7:
        if (r3 == 3) goto L9;
        r0 = true;
        goto L80
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r3) {
        Rect r0 = this.f1235a;
        if (r0.isEmpty() == true) goto L7;
        Drawable r1 = getSelector();
        if (r1 == null) goto L7;
        r1.setBounds(r0);
        r1.draw(r3);
    L7:
        super.dispatchDraw(r3);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1246l != null) goto L19;
        super.drawableStateChanged();
        C0279Ge r0 = this.f1241g;
        if (r0 == null) goto L8;
        r0.f906b = true;
    L8:
        Drawable r02 = getSelector();
        if (r02 != null) goto L11;
        return;
    L11:
        if (this.f1244j == true) goto L13;
        return;
    L13:
        if (isPressed() == false) goto L18;
        r02.setState(getDrawableState());
        return;
    L18:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (this.f1243i == false) goto L5;
        return true;
    L5:
        if (super.hasFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (this.f1243i == false) goto L5;
        return true;
    L5:
        if (super.hasWindowFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.f1243i == false) goto L5;
        return true;
    L5:
        if (super.isFocused() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if (this.f1243i == false) goto L7;
        if (this.f1242h == false) goto L7;
        return true;
    L7:
        if (super.isInTouchMode() == true) goto L12;
        return false;
    L12:
        return true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1246l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent r7) {
        int r0 = Build.VERSION.SDK_INT;
        int r1 = r7.getActionMasked();
        if (r1 == 10) goto L5;
    L7:
        boolean r2 = super.onHoverEvent(r7);
        if (r1 != 9) goto L10;
    L14:
        int r72 = pointToPosition((int) r7.getX(), (int) r7.getY());
        if (r72 != (-1)) goto L17;
    L41:
        return r2;
    L17:
        if (r72 == getSelectedItemPosition()) goto L41;
        View r12 = getChildAt(r72 - getFirstVisiblePosition());
        if (r12.isEnabled() == false) goto L34;
        requestFocus();
        if (r0 >= 30) goto L23;
    L33:
        setSelectionFromTop(r72, r12.getTop() - getTop());
        goto L34
    L23:
        if (AbstractC0193Ee.f592d == false) goto L33;
        AbstractC0193Ee.f589a.invoke(this, new Object[]{Integer.valueOf(r72), r12, Boolean.FALSE, -1, -1});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
        AbstractC0193Ee.f590b.invoke(this, new Object[]{Integer.valueOf(r72)});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
        AbstractC0193Ee.f591c.invoke(this, new Object[]{Integer.valueOf(r72)});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
    L29:
        e = move-exception;
        e.printStackTrace();
    L27:
        e = move-exception;
        e.printStackTrace();
    L34:
        Drawable r73 = getSelector();
        if (r73 == null) goto L41;
        if (this.f1244j == false) goto L41;
        if (isPressed() == false) goto L41;
        r73.setState(getDrawableState());
        goto L41
    L10:
        if (r1 == 7) goto L14;
        setSelection(-1);
        return r2;
    L5:
        if (this.f1246l != null) goto L7;
        RunnableC0431K0 r22 = new RunnableC0431K0(5, this);
        this.f1246l = r22;
        post(r22);
        goto L7
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L6;
        this.f1240f = pointToPosition((int) r4.getX(), (int) r4.getY());
    L6:
        RunnableC0431K0 r0 = this.f1246l;
        if (r0 == null) goto L10;
        C0365Ie r1 = (C0365Ie) r0.f1419b;
        r1.f1246l = null;
        r1.removeCallbacks(r0);
    L10:
        return super.onTouchEvent(r4);
    }

    public void setListSelectionHidden(boolean r1) {
        this.f1242h = r1;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable r4) {
        if (r4 == null) goto L10;
        C0279Ge r0 = new C0279Ge();
        Drawable r1 = r0.f905a;
        if (r1 == null) goto L6;
        r1.setCallback(null);
    L6:
        r0.f905a = r4;
        if (r4 == null) goto L9;
        r4.setCallback(r0);
    L9:
        r0.f906b = true;
    L11:
        this.f1241g = r0;
        super.setSelector(r0);
        Rect r02 = new Rect();
        if (r4 == null) goto L14;
        r4.getPadding(r02);
    L14:
        this.f1236b = r02.left;
        this.f1237c = r02.top;
        this.f1238d = r02.right;
        this.f1239e = r02.bottom;
        return;
    L10:
        r0 = null;
        goto L11
    }
}
