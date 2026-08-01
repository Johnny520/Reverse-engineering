package defpackage;

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
import com.ljx.wechatmod.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class kh extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ih g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public lr k;
    public y6 l;

    public kh(Context r3, boolean r4) {
        super(r3, null, R.attr.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.i = r4;
        setCacheColorHint(0);
    }

    public final int a(int r12, int r13) {
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

    public final boolean b(MotionEvent r18, int r19) {
        int r3 = r18.getActionMasked();
        boolean r4 = true;
        if (r3 != 1) goto L5;
        boolean r0 = false;
    L12:
        int r6 = r18.findPointerIndex(r19);
        if (r6 < 0) goto L9;
        int r7 = (int) r18.getX(r6);
        int r62 = (int) r18.getY(r6);
        int r8 = pointToPosition(r7, r62);
        if (r8 == (-1)) goto L79;
        View r10 = getChildAt(r8 - getFirstVisiblePosition());
        float r72 = r7;
        float r63 = r62;
        this.j = true;
        fh.a(this, r72, r63);
        if (isPressed() == true) goto L21;
        setPressed(true);
    L21:
        layoutChildren();
        int r02 = this.f;
        if (r02 == (-1)) goto L29;
        View r03 = getChildAt(r02 - getFirstVisiblePosition());
        if (r03 == null) goto L29;
        if (r03 == r10) goto L29;
        if (r03.isPressed() == false) goto L29;
        r03.setPressed(false);
    L29:
        this.f = r8;
        fh.a(r10, r72 - r10.getLeft(), r63 - r10.getTop());
        if (r10.isPressed() == true) goto L32;
        r10.setPressed(true);
    L32:
        Drawable r11 = getSelector();
        if (r11 == null) goto L36;
        if (r8 == (-1)) goto L36;
        boolean r12 = true;
    L37:
        if (r12 == false) goto L39;
        r11.setVisible(false, false);
    L39:
        int r04 = r10.getLeft();
        int r13 = r10.getTop();
        int r14 = r10.getRight();
        int r15 = r10.getBottom();
        Rect r42 = this.a;
        r42.set(r04, r13, r14, r15);
        r42.left -= this.b;
        r42.top -= this.c;
        r42.right += this.d;
        r42.bottom += this.e;
        if (ip.A() == false) goto L42;
        boolean r05 = hh.a(this);
    L50:
        if (r10.isEnabled() == r05) goto L62;
        boolean r06 = !r05;
        if (ip.A() == false) goto L54;
        hh.b(this, r06);
    L60:
        if (r8 == (-1)) goto L62;
        refreshDrawableState();
        goto L62
    L54:
        Field r132 = jh.a;
        if (r132 == null) goto L60;
        r132.set(this, Boolean.valueOf(r06));     // Catch: IllegalAccessException -> L58
    L58:
        e = move-exception;
        e.printStackTrace();
    L62:
        if (r12 == false) goto L68;
        float r07 = r42.exactCenterX();
        float r43 = r42.exactCenterY();
        if (getVisibility() != 0) goto L66;
        boolean r122 = true;
    L67:
        r11.setVisible(r122, false);
        ch.e(r11, r07, r43);
        goto L68
    L66:
        r122 = false;
    L68:
        Drawable r08 = getSelector();
        if (r08 == null) goto L72;
        if (r8 == (-1)) goto L72;
        ch.e(r08, r72, r63);
    L72:
        ih r09 = this.g;
        if (r09 == null) goto L75;
        r09.b = false;
    L75:
        refreshDrawableState();
        if (r3 != 1) goto L78;
        performItemClick(r10, r8, getItemIdAtPosition(r8));
    L78:
        r4 = false;
        r0 = true;
        goto L79
    L42:
        Field r010 = jh.a;
        if (r010 != null) goto L98;
    L48:
        r05 = false;
        goto L50
    L98:
        r05 = r010.getBoolean(this);     // Catch: IllegalAccessException -> L46
    L46:
        e = move-exception;
        e.printStackTrace();
    L36:
        r12 = false;
    L79:
        if (r0 == false) goto L81;
        if (r4 == true) goto L81;
    L84:
        if (r0 == true) goto L86;
        lr r2 = this.k;
        if (r2 != null) goto L92;
    L95:
        return r0;
    L92:
        if (r2.p == false) goto L94;
        r2.d();
    L94:
        r2.p = false;
        goto L95
    L86:
        if (this.k != null) goto L88;
        this.k = new lr(this);
    L88:
        lr r32 = this.k;
        boolean r44 = r32.p;
        r32.p = true;
        r32.onTouch(this, r18);
    L81:
        this.j = false;
        setPressed(false);
        drawableStateChanged();
        View r33 = getChildAt(this.f - getFirstVisiblePosition());
        if (r33 == null) goto L84;
        r33.setPressed(false);
    L9:
        r0 = false;
        r4 = false;
        goto L79
    L5:
        if (r3 != 2) goto L7;
        r0 = true;
        goto L12
    L7:
        if (r3 == 3) goto L9;
        r0 = true;
        r4 = false;
        goto L79
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r3) {
        Rect r0 = this.a;
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
        if (this.l != null) goto L19;
        super.drawableStateChanged();
        ih r0 = this.g;
        if (r0 == null) goto L8;
        r0.b = true;
    L8:
        Drawable r02 = getSelector();
        if (r02 != null) goto L11;
        return;
    L11:
        if (this.j == true) goto L13;
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
        if (this.i == false) goto L5;
        return true;
    L5:
        if (super.hasFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (this.i == false) goto L5;
        return true;
    L5:
        if (super.hasWindowFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.i == false) goto L5;
        return true;
    L5:
        if (super.isFocused() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if (this.i == false) goto L7;
        if (this.h == false) goto L7;
        return true;
    L7:
        if (super.isInTouchMode() == true) goto L12;
        return false;
    L12:
        return true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
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
        if (gh.d == false) goto L33;
        gh.a.invoke(this, new Object[]{Integer.valueOf(r72), r12, Boolean.FALSE, -1, -1});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
        gh.b.invoke(this, new Object[]{Integer.valueOf(r72)});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
        gh.c.invoke(this, new Object[]{Integer.valueOf(r72)});     // Catch: InvocationTargetException -> L27 IllegalAccessException -> L29
    L29:
        e = move-exception;
        e.printStackTrace();
    L27:
        e = move-exception;
        e.printStackTrace();
    L34:
        Drawable r73 = getSelector();
        if (r73 == null) goto L41;
        if (this.j == false) goto L41;
        if (isPressed() == false) goto L41;
        r73.setState(getDrawableState());
        goto L41
    L10:
        if (r1 == 7) goto L14;
        setSelection(-1);
        return r2;
    L5:
        if (this.l != null) goto L7;
        y6 r22 = new y6(5, this);
        this.l = r22;
        post(r22);
        goto L7
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L6;
        this.f = pointToPosition((int) r4.getX(), (int) r4.getY());
    L6:
        y6 r0 = this.l;
        if (r0 == null) goto L10;
        kh r1 = (kh) r0.b;
        r1.l = null;
        r1.removeCallbacks(r0);
    L10:
        return super.onTouchEvent(r4);
    }

    public void setListSelectionHidden(boolean r1) {
        this.h = r1;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable r4) {
        ih r0 = null;
        if (r4 == null) goto L8;
        ih r1 = new ih();
        Drawable r2 = r1.a;
        if (r2 == null) goto L7;
        r2.setCallback(null);
    L7:
        r1.a = r4;
        r4.setCallback(r1);
        r1.b = true;
        r0 = r1;
    L8:
        this.g = r0;
        super.setSelector(r0);
        Rect r02 = new Rect();
        if (r4 == null) goto L11;
        r4.getPadding(r02);
    L11:
        this.b = r02.left;
        this.c = r02.top;
        this.d = r02.right;
        this.e = r02.bottom;
    }
}
