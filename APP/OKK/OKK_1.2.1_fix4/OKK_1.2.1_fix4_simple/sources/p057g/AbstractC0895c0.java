package p057g;

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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0019E;
import p017J.ViewOnTouchListenerC0218g;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895c0 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f3169a;

    /* JADX INFO: renamed from: b */
    public int f3170b;

    /* JADX INFO: renamed from: c */
    public int f3171c;

    /* JADX INFO: renamed from: d */
    public int f3172d;

    /* JADX INFO: renamed from: e */
    public int f3173e;

    /* JADX INFO: renamed from: f */
    public int f3174f;

    /* JADX INFO: renamed from: g */
    public C0891a0 f3175g;

    /* JADX INFO: renamed from: h */
    public boolean f3176h;

    /* JADX INFO: renamed from: i */
    public final boolean f3177i;

    /* JADX INFO: renamed from: j */
    public boolean f3178j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0218g f3179k;

    /* JADX INFO: renamed from: l */
    public RunnableC0019E f3180l;

    public AbstractC0895c0(Context r3, boolean r4) {
        super(r3, null, C1031R.attr.dropDownListViewStyle);
        this.f3169a = new Rect();
        this.f3170b = 0;
        this.f3171c = 0;
        this.f3172d = 0;
        this.f3173e = 0;
        this.f3177i = r4;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m2229a(int r12, int r13) {
        int r02 = getListPaddingTop();
        int r1 = getListPaddingBottom();
        int r2 = getDividerHeight();
        Drawable r3 = getDivider();
        ListAdapter r4 = getAdapter();
        if (r4 == null) goto L5;
        int r03 = r02 + r1;
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
        r03 = r03 + r2;
    L26:
        r03 = r03 + r8.getMeasuredHeight();
        if (r03 >= r13) goto L28;
        r6 = r6 + 1;
        goto L12
    L28:
        return r13;
    L22:
        r94 = View.MeasureSpec.makeMeasureSpec(0, 0);
        goto L23
    L30:
        return r03;
    L10:
        r2 = 0;
        goto L11
    L5:
        return r02 + r1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2230b(MotionEvent r17, int r18) {
        int r3 = r17.getActionMasked();
        boolean r5 = false;
        if (r3 != 1) goto L5;
        boolean r02 = false;
    L12:
        int r6 = r17.findPointerIndex(r18);
        if (r6 < 0) goto L9;
        int r7 = (int) r17.getX(r6);
        int r62 = (int) r17.getY(r6);
        int r8 = pointToPosition(r7, r62);
        if (r8 != (-1)) goto L18;
        r5 = true;
    L82:
        if (r02 == false) goto L84;
        if (r5 == true) goto L84;
    L87:
        if (r02 == true) goto L89;
        ViewOnTouchListenerC0218g r2 = this.f3179k;
        if (r2 != null) goto L95;
    L98:
        return r02;
    L95:
        if (r2.f460p == false) goto L97;
        r2.m609d();
    L97:
        r2.f460p = false;
        goto L98
    L89:
        if (this.f3179k != null) goto L91;
        this.f3179k = new ViewOnTouchListenerC0218g(this);
    L91:
        ViewOnTouchListenerC0218g r32 = this.f3179k;
        boolean r52 = r32.f460p;
        r32.f460p = true;
        r32.onTouch(this, r17);
    L84:
        this.f3178j = false;
        setPressed(false);
        drawableStateChanged();
        View r53 = getChildAt(this.f3174f - getFirstVisiblePosition());
        if (r53 == null) goto L87;
        r53.setPressed(false);
        goto L87
    L18:
        View r10 = getChildAt(r8 - getFirstVisiblePosition());
        float r72 = r7;
        float r63 = r62;
        this.f3178j = true;
        int r03 = Build.VERSION.SDK_INT;
        AbstractC0887X.m2222a(this, r72, r63);
        if (isPressed() == true) goto L21;
        setPressed(true);
    L21:
        layoutChildren();
        int r11 = this.f3174f;
        if (r11 == (-1)) goto L29;
        View r112 = getChildAt(r11 - getFirstVisiblePosition());
        if (r112 == null) goto L29;
        if (r112 == r10) goto L29;
        if (r112.isPressed() == false) goto L29;
        r112.setPressed(false);
    L29:
        this.f3174f = r8;
        AbstractC0887X.m2222a(r10, r72 - r10.getLeft(), r63 - r10.getTop());
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
        int r54 = r10.getBottom();
        Rect r9 = this.f3169a;
        r9.set(r13, r14, r15, r54);
        r9.left -= this.f3170b;
        r9.top -= this.f3171c;
        r9.right += this.f3172d;
        r9.bottom += this.f3173e;
        if (r03 < 33) goto L42;
        boolean r04 = AbstractC0889Z.m2223a(this);
    L50:
        if (r10.isEnabled() == r04) goto L63;
        boolean r05 = !r04;
        if (Build.VERSION.SDK_INT < 33) goto L55;
        AbstractC0889Z.m2224b(this, r05);
    L61:
        if (r8 == (-1)) goto L63;
        refreshDrawableState();
        goto L63
    L55:
        Field r55 = AbstractC0893b0.f3168a;
        if (r55 == null) goto L61;
        r55.set(this, Boolean.valueOf(r05));     // Catch: IllegalAccessException -> L59
    L59:
        e = move-exception;
        e.printStackTrace();
    L63:
        if (r12 == false) goto L70;
        float r06 = r9.exactCenterX();
        float r56 = r9.exactCenterY();
        if (getVisibility() != 0) goto L68;
        boolean r92 = true;
    L69:
        r113.setVisible(r92, false);
        AbstractC1111a.m2623e(r113, r06, r56);
        goto L70
    L68:
        r92 = false;
    L70:
        Drawable r07 = getSelector();
        if (r07 != null) goto L73;
    L75:
        C0891a0 r08 = this.f3175g;
        if (r08 == null) goto L78;
        r08.f3165b = false;
    L78:
        refreshDrawableState();
        if (r3 != 1) goto L81;
        performItemClick(r10, r8, getItemIdAtPosition(r8));
    L81:
        r02 = true;
        r5 = false;
        goto L82
    L73:
        if (r8 == (-1)) goto L75;
        AbstractC1111a.m2623e(r07, r72, r63);
        goto L75
    L42:
        Field r09 = AbstractC0893b0.f3168a;
        if (r09 != null) goto L101;
    L48:
        r04 = false;
        goto L50
    L101:
        r04 = r09.getBoolean(this);     // Catch: IllegalAccessException -> L46
    L46:
        e = move-exception;
        e.printStackTrace();
    L36:
        r12 = false;
    L9:
        r02 = false;
        goto L82
    L5:
        if (r3 != 2) goto L7;
        r02 = true;
        goto L12
    L7:
        if (r3 == 3) goto L9;
        r02 = true;
        goto L82
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r3) {
        Rect r02 = this.f3169a;
        if (r02.isEmpty() == true) goto L7;
        Drawable r1 = getSelector();
        if (r1 == null) goto L7;
        r1.setBounds(r02);
        r1.draw(r3);
    L7:
        super.dispatchDraw(r3);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3180l == null) goto L5;
        return;
    L5:
        super.drawableStateChanged();
        C0891a0 r02 = this.f3175g;
        if (r02 == null) goto L8;
        r02.f3165b = true;
    L8:
        Drawable r03 = getSelector();
        if (r03 != null) goto L11;
        return;
    L11:
        if (this.f3178j == true) goto L13;
        return;
    L13:
        if (isPressed() == false) goto L18;
        r03.setState(getDrawableState());
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (this.f3177i == false) goto L5;
    L8:
        return true;
    L5:
        if (super.hasFocus() == true) goto L8;
        return false;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (this.f3177i == false) goto L5;
    L8:
        return true;
    L5:
        if (super.hasWindowFocus() == true) goto L8;
        return false;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.f3177i == false) goto L5;
    L8:
        return true;
    L5:
        if (super.isFocused() == true) goto L8;
        return false;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if (this.f3177i == false) goto L7;
        if (this.f3176h == false) goto L7;
    L8:
        return true;
    L7:
        if (super.isInTouchMode() == true) goto L8;
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3180l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent r8) {
        int r02 = Build.VERSION.SDK_INT;
        int r1 = r8.getActionMasked();
        if (r1 == 10) goto L5;
    L7:
        boolean r2 = super.onHoverEvent(r8);
        if (r1 != 9) goto L10;
    L13:
        int r82 = pointToPosition((int) r8.getX(), (int) r8.getY());
        if (r82 != (-1)) goto L16;
    L39:
        return r2;
    L16:
        if (r82 == getSelectedItemPosition()) goto L39;
        View r12 = getChildAt(r82 - getFirstVisiblePosition());
        if (r12.isEnabled() == false) goto L32;
        requestFocus();
        if (r02 >= 30) goto L22;
    L31:
        setSelectionFromTop(r82, r12.getTop() - getTop());
        goto L32
    L22:
        if (AbstractC0888Y.f3162d == false) goto L31;
        AbstractC0888Y.f3159a.invoke(this, new Object[]{Integer.valueOf(r82), r12, Boolean.FALSE, -1, -1});     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L27
        AbstractC0888Y.f3160b.invoke(this, new Object[]{Integer.valueOf(r82)});     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L27
        AbstractC0888Y.f3161c.invoke(this, new Object[]{Integer.valueOf(r82)});     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L27
    L27:
        e = move-exception;
        e.printStackTrace();
    L25:
        e = move-exception;
        e.printStackTrace();
    L32:
        Drawable r83 = getSelector();
        if (r83 == null) goto L39;
        if (this.f3178j == false) goto L39;
        if (isPressed() == false) goto L39;
        r83.setState(getDrawableState());
        goto L39
    L10:
        if (r1 == 7) goto L13;
        setSelection(-1);
        goto L39
    L5:
        if (this.f3180l != null) goto L7;
        RunnableC0019E r22 = new RunnableC0019E(8, this);
        this.f3180l = r22;
        post(r22);
        goto L7
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L6;
        this.f3174f = pointToPosition((int) r4.getX(), (int) r4.getY());
    L6:
        RunnableC0019E r02 = this.f3180l;
        if (r02 == null) goto L10;
        AbstractC0895c0 r1 = (AbstractC0895c0) r02.f57b;
        r1.f3180l = null;
        r1.removeCallbacks(r02);
    L10:
        return super.onTouchEvent(r4);
    }

    public void setListSelectionHidden(boolean r1) {
        this.f3176h = r1;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable r4) {
        C0891a0 r02 = null;
        if (r4 == null) goto L8;
        C0891a0 r1 = new C0891a0();
        Drawable r2 = r1.f3164a;
        if (r2 == null) goto L7;
        r2.setCallback(null);
    L7:
        r1.f3164a = r4;
        r4.setCallback(r1);
        r1.f3165b = true;
        r02 = r1;
    L8:
        this.f3175g = r02;
        super.setSelector(r02);
        Rect r03 = new Rect();
        if (r4 == null) goto L11;
        r4.getPadding(r03);
    L11:
        this.f3170b = r03.left;
        this.f3171c = r03.top;
        this.f3172d = r03.right;
        this.f3173e = r03.bottom;
    }
}
