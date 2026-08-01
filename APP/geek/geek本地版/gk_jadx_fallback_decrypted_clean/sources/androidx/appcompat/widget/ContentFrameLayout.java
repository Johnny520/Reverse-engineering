package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    public android.util.TypedValue a;
    public android.util.TypedValue b;
    public android.util.TypedValue c;
    public android.util.TypedValue d;
    public android.util.TypedValue e;
    public android.util.TypedValue f;
    public final android.graphics.Rect g;
    public defpackage.yc h;

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.g = r2
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.e = r0
        Lb:
            android.util.TypedValue r0 = r1.e
            return r0
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f = r0
        Lb:
            android.util.TypedValue r0 = r1.f
            return r0
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.c = r0
        Lb:
            android.util.TypedValue r0 = r1.c
            return r0
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.d
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.d = r0
        Lb:
            android.util.TypedValue r0 = r1.d
            return r0
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.a
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.a = r0
        Lb:
            android.util.TypedValue r0 = r1.a
            return r0
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.b
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.b = r0
        Lb:
            android.util.TypedValue r0 = r1.b
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            yc r0 = r1.h
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            yc r0 = r3.h
            if (r0 == 0) goto L67
            g3 r0 = (defpackage.g3) r0
            r3 r0 = r0.b
            gf r1 = r0.r
            if (r1 == 0) goto L34
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r1.k()
            hf r1 = r1.e
            k70 r1 = (defpackage.k70) r1
            androidx.appcompat.widget.Toolbar r1 = r1.a
            androidx.appcompat.widget.ActionMenuView r1 = r1.a
            if (r1 == 0) goto L34
            j1 r1 = r1.t
            if (r1 == 0) goto L34
            r1.f()
            f1 r1 = r1.t
            if (r1 == 0) goto L34
            boolean r2 = r1.b()
            if (r2 == 0) goto L34
            tu r1 = r1.i
            r1.dismiss()
        L34:
            android.widget.PopupWindow r1 = r0.w
            if (r1 == 0) goto L53
            android.view.Window r1 = r0.l
            android.view.View r1 = r1.getDecorView()
            f3 r2 = r0.x
            r1.removeCallbacks(r2)
            android.widget.PopupWindow r1 = r0.w
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L50
            android.widget.PopupWindow r1 = r0.w     // Catch: java.lang.IllegalArgumentException -> L50
            r1.dismiss()     // Catch: java.lang.IllegalArgumentException -> L50
        L50:
            r1 = 0
            r0.w = r1
        L53:
            wa0 r1 = r0.y
            if (r1 == 0) goto L5a
            r1.b()
        L5a:
            r1 = 0
            q3 r0 = r0.z(r1)
            ku r0 = r0.h
            if (r0 == 0) goto L67
            r1 = 1
            r0.c(r1)
        L67:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r5
        L19:
            int r3 = android.view.View.MeasureSpec.getMode(r17)
            int r6 = android.view.View.MeasureSpec.getMode(r18)
            android.graphics.Rect r7 = r0.g
            r8 = 6
            r9 = 5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r10) goto L62
            if (r2 == 0) goto L30
            android.util.TypedValue r12 = r0.d
            goto L32
        L30:
            android.util.TypedValue r12 = r0.c
        L32:
            if (r12 == 0) goto L62
            int r13 = r12.type
            if (r13 == 0) goto L62
            if (r13 != r9) goto L40
            float r12 = r12.getDimension(r1)
        L3e:
            int r12 = (int) r12
            goto L4c
        L40:
            if (r13 != r8) goto L4b
            int r13 = r1.widthPixels
            float r14 = (float) r13
            float r13 = (float) r13
            float r12 = r12.getFraction(r14, r13)
            goto L3e
        L4b:
            r12 = r5
        L4c:
            if (r12 <= 0) goto L62
            int r13 = r7.left
            int r14 = r7.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            r13 = r4
            goto L65
        L62:
            r12 = r17
            r13 = r5
        L65:
            if (r6 != r10) goto L9d
            if (r2 == 0) goto L6c
            android.util.TypedValue r6 = r0.e
            goto L6e
        L6c:
            android.util.TypedValue r6 = r0.f
        L6e:
            if (r6 == 0) goto L9d
            int r14 = r6.type
            if (r14 == 0) goto L9d
            if (r14 != r9) goto L7c
            float r6 = r6.getDimension(r1)
        L7a:
            int r6 = (int) r6
            goto L88
        L7c:
            if (r14 != r8) goto L87
            int r14 = r1.heightPixels
            float r15 = (float) r14
            float r14 = (float) r14
            float r6 = r6.getFraction(r15, r14)
            goto L7a
        L87:
            r6 = r5
        L88:
            if (r6 <= 0) goto L9d
            int r14 = r7.top
            int r15 = r7.bottom
            int r14 = r14 + r15
            int r6 = r6 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r6 = java.lang.Math.min(r6, r14)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L9f
        L9d:
            r6 = r18
        L9f:
            super.onMeasure(r12, r6)
            int r12 = r0.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            if (r13 != 0) goto Lde
            if (r3 != r10) goto Lde
            if (r2 == 0) goto Lb3
            android.util.TypedValue r2 = r0.b
            goto Lb5
        Lb3:
            android.util.TypedValue r2 = r0.a
        Lb5:
            if (r2 == 0) goto Lde
            int r3 = r2.type
            if (r3 == 0) goto Lde
            if (r3 != r9) goto Lc3
            float r1 = r2.getDimension(r1)
        Lc1:
            int r1 = (int) r1
            goto Lcf
        Lc3:
            if (r3 != r8) goto Lce
            int r1 = r1.widthPixels
            float r3 = (float) r1
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            goto Lc1
        Lce:
            r1 = r5
        Lcf:
            if (r1 <= 0) goto Ld7
            int r2 = r7.left
            int r3 = r7.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        Ld7:
            if (r12 >= r1) goto Lde
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le4
            super.onMeasure(r14, r6)
        Le4:
            return
    }

    public void setAttachListener(defpackage.yc r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
