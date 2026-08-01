package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.f1;
import defpackage.g3;
import defpackage.gf;
import defpackage.j1;
import defpackage.k70;
import defpackage.ku;
import defpackage.r3;
import defpackage.wa0;
import defpackage.yc;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public yc h;

    public ContentFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e != null) goto L6;
        this.e = new TypedValue();
    L6:
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f != null) goto L6;
        this.f = new TypedValue();
    L6:
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c != null) goto L6;
        this.c = new TypedValue();
    L6:
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d != null) goto L6;
        this.d = new TypedValue();
    L6:
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a != null) goto L6;
        this.a = new TypedValue();
    L6:
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b != null) goto L6;
        this.b = new TypedValue();
    L6:
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yc r0 = this.h;
        if (r0 == null) goto L6;
        r0.getClass();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yc r0 = this.h;
        if (r0 == null) goto L31;
        r3 r02 = ((g3) r0).b;
        gf r1 = r02.r;
        if (r1 == null) goto L16;
        ActionBarOverlayLayout r12 = (ActionBarOverlayLayout) r1;
        r12.k();
        ActionMenuView r13 = ((k70) r12.e).a.a;
        if (r13 == null) goto L16;
        j1 r14 = r13.t;
        if (r14 == null) goto L16;
        r14.f();
        f1 r15 = r14.t;
        if (r15 == null) goto L16;
        if (r15.b() == false) goto L16;
        r15.i.dismiss();
    L16:
        if (r02.w == null) goto L21;
        r02.l.getDecorView().removeCallbacks(r02.x);
        if (r02.w.isShowing() == true) goto L29;
    L20:
        r02.w = null;
        goto L21
    L29:
        r02.w.dismiss();     // Catch: IllegalArgumentException -> L28
    L21:
        wa0 r16 = r02.y;
        if (r16 == null) goto L24;
        r16.b();
    L24:
        ku r03 = r02.z(0).h;
        if (r03 == null) goto L32;
        r03.c(true);
        return;
    L32:
        return;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
        DisplayMetrics r1 = getContext().getResources().getDisplayMetrics();
        boolean r4 = true;
        if (r1.widthPixels >= r1.heightPixels) goto L5;
        boolean r2 = true;
    L6:
        int r3 = View.MeasureSpec.getMode(r17);
        int r6 = View.MeasureSpec.getMode(r18);
        Rect r7 = this.g;
        if (r3 != Integer.MIN_VALUE) goto L22;
        if (r2 == false) goto L10;
        TypedValue r12 = this.d;
    L11:
        if (r12 == null) goto L22;
        int r13 = r12.type;
        if (r13 == 0) goto L22;
        if (r13 != 5) goto L17;
        float r122 = r12.getDimension(r1);
    L16:
        int r123 = (int) r122;
    L20:
        if (r123 <= 0) goto L22;
        int r124 = View.MeasureSpec.makeMeasureSpec(Math.min(r123 - (r7.left + r7.right), View.MeasureSpec.getSize(r17)), 1073741824);
        boolean r132 = true;
    L23:
        if (r6 != Integer.MIN_VALUE) goto L38;
        if (r2 == false) goto L26;
        TypedValue r62 = this.e;
    L27:
        if (r62 == null) goto L38;
        int r14 = r62.type;
        if (r14 == 0) goto L38;
        if (r14 != 5) goto L33;
        float r63 = r62.getDimension(r1);
    L32:
        int r64 = (int) r63;
    L36:
        if (r64 <= 0) goto L38;
        int r65 = View.MeasureSpec.makeMeasureSpec(Math.min(r64 - (r7.top + r7.bottom), View.MeasureSpec.getSize(r18)), 1073741824);
    L39:
        super.onMeasure(r124, r65);
        int r125 = getMeasuredWidth();
        int r142 = View.MeasureSpec.makeMeasureSpec(r125, 1073741824);
        if (r132 == true) goto L58;
        if (r3 != Integer.MIN_VALUE) goto L58;
        if (r2 == false) goto L44;
        TypedValue r22 = this.b;
    L45:
        if (r22 == null) goto L58;
        int r32 = r22.type;
        if (r32 == 0) goto L58;
        if (r32 != 5) goto L51;
        float r15 = r22.getDimension(r1);
    L50:
        int r16 = (int) r15;
    L54:
        if (r16 <= 0) goto L56;
        r16 = r16 - (r7.left + r7.right);
    L56:
        if (r125 >= r16) goto L58;
        r142 = View.MeasureSpec.makeMeasureSpec(r16, 1073741824);
    L59:
        if (r4 == false) goto L62;
        super.onMeasure(r142, r65);
        return;
    L62:
        return;
    L51:
        if (r32 != 6) goto L53;
        int r19 = r1.widthPixels;
        r15 = r22.getFraction(r19, r19);
        goto L50
    L53:
        r16 = 0;
        goto L54
    L44:
        r22 = this.a;
    L58:
        r4 = false;
        goto L59
    L33:
        if (r14 != 6) goto L35;
        int r143 = r1.heightPixels;
        r63 = r62.getFraction(r143, r143);
        goto L32
    L35:
        r64 = 0;
        goto L36
    L26:
        r62 = this.f;
    L38:
        r65 = r18;
        goto L39
    L17:
        if (r13 != 6) goto L19;
        int r133 = r1.widthPixels;
        r122 = r12.getFraction(r133, r133);
        goto L16
    L19:
        r123 = 0;
        goto L20
    L10:
        r12 = this.c;
    L22:
        r124 = r17;
        r132 = false;
        goto L23
    L5:
        r2 = false;
        goto L6
    }

    public void setAttachListener(yc r1) {
        this.h = r1;
    }
}
