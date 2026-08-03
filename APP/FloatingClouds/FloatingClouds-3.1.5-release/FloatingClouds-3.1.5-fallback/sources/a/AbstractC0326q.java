package a;

/* JADX INFO: renamed from: a.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0326q extends android.view.ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.AbstractC0326q.a f644a;
    public final android.content.Context b;
    public androidx.appcompat.widget.ActionMenuView c;
    public androidx.appcompat.widget.a d;
    public int e;
    public a.Jg f;
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: a.q$a */
    public class a implements a.Lg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f645a;
        public int b;
        public final /* synthetic */ a.AbstractC0326q c;

        public a(a.AbstractC0326q r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r1 = 0
                r0.f645a = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r2 = this;
                boolean r0 = r2.f645a
                if (r0 == 0) goto L5
                return
            L5:
                a.q r0 = r2.c
                r1 = 0
                r0.f = r1
                int r1 = r2.b
                a.AbstractC0326q.b(r0, r1)
                return
        }

        @Override // a.Lg
        public final void b() {
                r1 = this;
                r0 = 1
                r1.f645a = r0
                return
        }

        @Override // a.Lg
        public final void c() {
                r1 = this;
                a.q r0 = r1.c
                a.AbstractC0326q.a(r0)
                r0 = 0
                r1.f645a = r0
                return
        }
    }

    public AbstractC0326q(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AbstractC0326q(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            a.q$a r4 = new a.q$a
            r4.<init>(r2)
            r2.f644a = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            int r0 = androidx.appcompat.R.attr.actionBarPopupTheme
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2a
            int r5 = r4.resourceId
            if (r5 == 0) goto L2a
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.b = r5
            return
        L2a:
            r2.b = r3
            return
    }

    public static /* synthetic */ void a(a.AbstractC0326q r1) {
            r0 = 0
            super.setVisibility(r0)
            return
    }

    public static /* synthetic */ void b(a.AbstractC0326q r0, int r1) {
            super.setVisibility(r1)
            return
    }

    public static int c(android.view.View r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r1 = r1.getMeasuredWidth()
            int r2 = r2 - r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public static int d(android.view.View r2, int r3, int r4, int r5, boolean r6) {
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            int r5 = r5 - r1
            int r5 = r5 / 2
            int r5 = r5 + r4
            if (r6 == 0) goto L15
            int r4 = r3 - r0
            int r1 = r1 + r5
            r2.layout(r4, r5, r3, r1)
            goto L1b
        L15:
            int r4 = r3 + r0
            int r1 = r1 + r5
            r2.layout(r3, r5, r4, r1)
        L1b:
            if (r6 == 0) goto L1f
            int r2 = -r0
            return r2
        L1f:
            return r0
    }

    public final a.Jg e(long r4, int r6) {
            r3 = this;
            a.Jg r0 = r3.f
            if (r0 == 0) goto L7
            r0.b()
        L7:
            a.q$a r0 = r3.f644a
            r1 = 0
            if (r6 != 0) goto L2b
            int r2 = r3.getVisibility()
            if (r2 == 0) goto L15
            r3.setAlpha(r1)
        L15:
            a.Jg r1 = a.C0414ug.a(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.a(r2)
            r1.c(r4)
            a.q r4 = r0.c
            r4.f = r1
            r0.b = r6
            r1.d(r0)
            return r1
        L2b:
            a.Jg r2 = a.C0414ug.a(r3)
            r2.a(r1)
            r2.c(r4)
            a.q r4 = r0.c
            r4.f = r2
            r0.b = r6
            r2.d(r0)
            return r2
    }

    public int getAnimatedVisibility() {
            r1 = this;
            a.Jg r0 = r1.f
            if (r0 == 0) goto L9
            a.q$a r0 = r1.f644a
            int r0 = r0.b
            return r0
        L9:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            int[] r0 = androidx.appcompat.R.styleable.ActionBar
            int r1 = androidx.appcompat.R.attr.actionBarStyle
            r2 = 0
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r2, r0, r1, r3)
            int r0 = androidx.appcompat.R.styleable.ActionBar_height
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            androidx.appcompat.widget.a r5 = r4.d
            if (r5 == 0) goto L6a
            android.content.Context r0 = r5.b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 > r3) goto L5f
            if (r1 > r3) goto L5f
            r0 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L3f
            if (r2 > r0) goto L5f
        L3f:
            if (r1 <= r0) goto L44
            if (r2 <= r3) goto L44
            goto L5f
        L44:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L5d
            r0 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 <= r3) goto L50
            if (r2 > r0) goto L5d
        L50:
            if (r1 <= r0) goto L55
            if (r2 <= r3) goto L55
            goto L5d
        L55:
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L5b
            r0 = 3
            goto L60
        L5b:
            r0 = 2
            goto L60
        L5d:
            r0 = 4
            goto L60
        L5f:
            r0 = 5
        L60:
            r5.p = r0
            androidx.appcompat.view.menu.f r5 = r5.c
            if (r5 == 0) goto L6a
            r0 = 1
            r5.p(r0)
        L6a:
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.h = r1
        Lb:
            boolean r3 = r5.h
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.h = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.h = r1
            return r4
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.g = r1
        L9:
            boolean r2 = r4.g
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.g = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.g = r1
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.e = r1
            r0.requestLayout()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            a.Jg r0 = r1.f
            if (r0 == 0) goto Ld
            r0.b()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }
}
