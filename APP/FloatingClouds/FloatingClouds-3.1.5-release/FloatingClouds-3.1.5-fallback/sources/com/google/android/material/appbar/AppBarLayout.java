package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public final class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1039a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public java.lang.ref.WeakReference<android.view.View> l;
    public android.animation.ValueAnimator m;
    public int[] n;
    public android.graphics.drawable.Drawable o;
    public com.google.android.material.appbar.AppBarLayout.Behavior p;

    public static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends a.AbstractC0084c8<T> {
        public int j;
        public int k;
        public android.animation.ValueAnimator l;
        public com.google.android.material.appbar.AppBarLayout.BaseBehavior.a m;
        public java.lang.ref.WeakReference<android.view.View> n;

        public static class a extends a.r {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.a> CREATOR = null;
            public boolean c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            public class C0028a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.a> {
                @Override // android.os.Parcelable.Creator
                public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                        r2 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                        r1 = 0
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final com.google.android.material.appbar.AppBarLayout.BaseBehavior.a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                        r1 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                        r0.<init>(r2, r3)
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public final java.lang.Object[] newArray(int r1) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a[] r1 = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.a[r1]
                        return r1
                }
            }

            static {
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a
                    r0.<init>()
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.a.CREATOR = r0
                    return
            }

            public a(android.os.Parcel r3, java.lang.ClassLoader r4) {
                    r2 = this;
                    r2.<init>(r3, r4)
                    byte r4 = r3.readByte()
                    r0 = 0
                    r1 = 1
                    if (r4 == 0) goto Ld
                    r4 = r1
                    goto Le
                Ld:
                    r4 = r0
                Le:
                    r2.c = r4
                    byte r4 = r3.readByte()
                    if (r4 == 0) goto L18
                    r4 = r1
                    goto L19
                L18:
                    r4 = r0
                L19:
                    r2.d = r4
                    int r4 = r3.readInt()
                    r2.e = r4
                    float r4 = r3.readFloat()
                    r2.f = r4
                    byte r3 = r3.readByte()
                    if (r3 == 0) goto L2e
                    r0 = r1
                L2e:
                    r2.g = r0
                    return
            }

            @Override // a.r, android.os.Parcelable
            public final void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    super.writeToParcel(r1, r2)
                    boolean r2 = r0.c
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    boolean r2 = r0.d
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    int r2 = r0.e
                    r1.writeInt(r2)
                    float r2 = r0.f
                    r1.writeFloat(r2)
                    boolean r2 = r0.g
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    return
            }
        }

        public BaseBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public BaseBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.view.View B(com.google.android.material.appbar.AppBarLayout.BaseBehavior r3, androidx.coordinatorlayout.widget.CoordinatorLayout r4) {
                r3.getClass()
                int r3 = r4.getChildCount()
                r0 = 0
            L8:
                if (r0 >= r3) goto L1e
                android.view.View r1 = r4.getChildAt(r0)
                android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f879a
                boolean r2 = r2 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r2 == 0) goto L1b
                return r1
            L1b:
                int r0 = r0 + 1
                goto L8
            L1e:
                r3 = 0
                return r3
        }

        public static android.view.View D(androidx.coordinatorlayout.widget.CoordinatorLayout r4) {
                int r0 = r4.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1c
                android.view.View r2 = r4.getChildAt(r1)
                boolean r3 = r2 instanceof a.Ib
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.AbsListView
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ScrollView
                if (r3 == 0) goto L18
                goto L1b
            L18:
                int r1 = r1 + 1
                goto L5
            L1b:
                return r2
            L1c:
                r4 = 0
                return r4
        }

        public static void H(androidx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.android.material.appbar.AppBarLayout r9, int r10, int r11, boolean r12) {
                r0 = 1
                int r1 = java.lang.Math.abs(r10)
                int r2 = r9.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                r5 = 0
                if (r4 >= r2) goto L21
                android.view.View r6 = r9.getChildAt(r4)
                int r7 = r6.getTop()
                if (r1 < r7) goto L1f
                int r7 = r6.getBottom()
                if (r1 > r7) goto L1f
                goto L22
            L1f:
                int r4 = r4 + r0
                goto Lb
            L21:
                r6 = r5
            L22:
                if (r6 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f1041a
                r2 = r1 & 1
                if (r2 == 0) goto L5d
                java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                int r2 = r6.getMinimumHeight()
                if (r11 <= 0) goto L4b
                r11 = r1 & 12
                if (r11 == 0) goto L4b
                int r10 = -r10
                int r11 = r6.getBottom()
                int r11 = r11 - r2
                int r1 = r9.getTopInset()
                int r11 = r11 - r1
                if (r10 < r11) goto L5d
            L49:
                r10 = r0
                goto L5e
            L4b:
                r11 = r1 & 2
                if (r11 == 0) goto L5d
                int r10 = -r10
                int r11 = r6.getBottom()
                int r11 = r11 - r2
                int r1 = r9.getTopInset()
                int r11 = r11 - r1
                if (r10 < r11) goto L5d
                goto L49
            L5d:
                r10 = r3
            L5e:
                boolean r11 = r9.j
                if (r11 == 0) goto L6a
                android.view.View r10 = D(r8)
                boolean r10 = r9.e(r10)
            L6a:
                boolean r10 = r9.d(r10)
                if (r12 != 0) goto La9
                if (r10 == 0) goto Ld0
                a.A2 r10 = r8.b
                java.lang.Object r10 = r10.b
                a.ge r10 = (a.C0162ge) r10
                java.lang.Object r10 = r10.getOrDefault(r9, r5)
                java.util.List r10 = (java.util.List) r10
                java.util.ArrayList r8 = r8.d
                r8.clear()
                if (r10 == 0) goto L88
                r8.addAll(r10)
            L88:
                int r10 = r8.size()
            L8c:
                if (r3 >= r10) goto Ld0
                java.lang.Object r11 = r8.get(r3)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f879a
                boolean r12 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r12 == 0) goto La7
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r8 = r11.f
                if (r8 == 0) goto Ld0
                goto La9
            La7:
                int r3 = r3 + r0
                goto L8c
            La9:
                android.graphics.drawable.Drawable r8 = r9.getBackground()
                if (r8 == 0) goto Lb6
                android.graphics.drawable.Drawable r8 = r9.getBackground()
                r8.jumpToCurrentState()
            Lb6:
                android.graphics.drawable.Drawable r8 = r9.getForeground()
                if (r8 == 0) goto Lc3
                android.graphics.drawable.Drawable r8 = r9.getForeground()
                r8.jumpToCurrentState()
            Lc3:
                android.animation.StateListAnimator r8 = r9.getStateListAnimator()
                if (r8 == 0) goto Ld0
                android.animation.StateListAnimator r8 = r9.getStateListAnimator()
                r8.jumpToCurrentState()
            Ld0:
                return
        }

        public final void C(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, int r7) {
                r4 = this;
                int r0 = r4.t()
                int r0 = r0 - r7
                int r0 = java.lang.Math.abs(r0)
                r1 = 0
                float r2 = java.lang.Math.abs(r1)
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 <= 0) goto L1e
                float r0 = (float) r0
                float r0 = r0 / r2
                r1 = 1148846080(0x447a0000, float:1000.0)
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r0 = r0 * 3
                goto L2c
            L1e:
                float r0 = (float) r0
                int r1 = r6.getHeight()
                float r1 = (float) r1
                float r0 = r0 / r1
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 + r1
                r1 = 1125515264(0x43160000, float:150.0)
                float r0 = r0 * r1
                int r0 = (int) r0
            L2c:
                int r1 = r4.t()
                if (r1 != r7) goto L42
                android.animation.ValueAnimator r5 = r4.l
                if (r5 == 0) goto L41
                boolean r5 = r5.isRunning()
                if (r5 == 0) goto L41
                android.animation.ValueAnimator r5 = r4.l
                r5.cancel()
            L41:
                return
            L42:
                android.animation.ValueAnimator r2 = r4.l
                if (r2 != 0) goto L5d
                android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
                r2.<init>()
                r4.l = r2
                android.view.animation.DecelerateInterpolator r3 = a.C0434w0.e
                r2.setInterpolator(r3)
                android.animation.ValueAnimator r2 = r4.l
                com.google.android.material.appbar.a r3 = new com.google.android.material.appbar.a
                r3.<init>(r5, r4, r6)
                r2.addUpdateListener(r3)
                goto L60
            L5d:
                r2.cancel()
            L60:
                android.animation.ValueAnimator r5 = r4.l
                r6 = 600(0x258, float:8.41E-43)
                int r6 = java.lang.Math.min(r0, r6)
                long r2 = (long) r6
                r5.setDuration(r2)
                android.animation.ValueAnimator r5 = r4.l
                int[] r6 = new int[]{r1, r7}
                r5.setIntValues(r6)
                android.animation.ValueAnimator r5 = r4.l
                r5.start()
                return
        }

        public final void E(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.t()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.z(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.j
                if (r9 == 0) goto L37
                boolean r9 = r4.e(r11)
                r4.d(r9)
            L37:
                return
        }

        public final com.google.android.material.appbar.AppBarLayout.BaseBehavior.a F(android.os.Parcelable r9, T r10) {
                r8 = this;
                r0 = 1
                int r1 = r8.s()
                int r2 = r10.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L5c
                android.view.View r5 = r10.getChildAt(r4)
                int r6 = r5.getBottom()
                int r6 = r6 + r1
                int r7 = r5.getTop()
                int r7 = r7 + r1
                if (r7 > 0) goto L5a
                if (r6 < 0) goto L5a
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r2 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                if (r9 != 0) goto L25
                a.r$a r9 = a.r.b
            L25:
                r2.<init>(r9)
                if (r1 != 0) goto L2c
                r9 = r0
                goto L2d
            L2c:
                r9 = r3
            L2d:
                r2.d = r9
                if (r9 != 0) goto L3a
                int r9 = -r1
                int r1 = r10.getTotalScrollRange()
                if (r9 < r1) goto L3a
                r9 = r0
                goto L3b
            L3a:
                r9 = r3
            L3b:
                r2.c = r9
                r2.e = r4
                java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
                int r9 = r5.getMinimumHeight()
                int r10 = r10.getTopInset()
                int r10 = r10 + r9
                if (r6 != r10) goto L4d
                goto L4e
            L4d:
                r0 = r3
            L4e:
                r2.g = r0
                float r9 = (float) r6
                int r10 = r5.getHeight()
                float r10 = (float) r10
                float r9 = r9 / r10
                r2.f = r9
                return r2
            L5a:
                int r4 = r4 + r0
                goto Lb
            L5c:
                r9 = 0
                return r9
        }

        public final void G(androidx.coordinatorlayout.widget.CoordinatorLayout r14, T r15) {
                r13 = this;
                r0 = 5
                r1 = 2
                r2 = 17
                int r3 = r15.getTopInset()
                int r4 = r15.getPaddingTop()
                int r4 = r4 + r3
                int r3 = r13.t()
                int r3 = r3 - r4
                int r5 = r15.getChildCount()
                r6 = 0
                r7 = r6
            L18:
                r8 = 32
                if (r7 >= r5) goto L42
                android.view.View r9 = r15.getChildAt(r7)
                int r10 = r9.getTop()
                int r11 = r9.getBottom()
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r9 = (com.google.android.material.appbar.AppBarLayout.c) r9
                int r12 = r9.f1041a
                r12 = r12 & r8
                if (r12 != r8) goto L39
                int r12 = r9.topMargin
                int r10 = r10 - r12
                int r9 = r9.bottomMargin
                int r11 = r11 + r9
            L39:
                int r9 = -r3
                if (r10 > r9) goto L3f
                if (r11 < r9) goto L3f
                goto L43
            L3f:
                int r7 = r7 + 1
                goto L18
            L42:
                r7 = -1
            L43:
                if (r7 < 0) goto Lad
                android.view.View r5 = r15.getChildAt(r7)
                android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r9 = (com.google.android.material.appbar.AppBarLayout.c) r9
                int r10 = r9.f1041a
                r11 = r10 & 17
                if (r11 != r2) goto Lad
                int r2 = r5.getTop()
                int r2 = -r2
                int r11 = r5.getBottom()
                int r11 = -r11
                if (r7 != 0) goto L74
                java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
                boolean r7 = r15.getFitsSystemWindows()
                if (r7 == 0) goto L74
                boolean r7 = r5.getFitsSystemWindows()
                if (r7 == 0) goto L74
                int r7 = r15.getTopInset()
                int r2 = r2 - r7
            L74:
                r7 = r10 & 2
                if (r7 != r1) goto L80
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r0 = r5.getMinimumHeight()
                int r11 = r11 + r0
                goto L90
            L80:
                r7 = r10 & 5
                if (r7 != r0) goto L90
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r0 = r5.getMinimumHeight()
                int r0 = r0 + r11
                if (r3 >= r0) goto L8f
                r2 = r0
                goto L90
            L8f:
                r11 = r0
            L90:
                r0 = r10 & 32
                if (r0 != r8) goto L9a
                int r0 = r9.topMargin
                int r2 = r2 + r0
                int r0 = r9.bottomMargin
                int r11 = r11 - r0
            L9a:
                int r0 = r11 + r2
                int r0 = r0 / r1
                if (r3 >= r0) goto La0
                r2 = r11
            La0:
                int r2 = r2 + r4
                int r0 = r15.getTotalScrollRange()
                int r0 = -r0
                int r0 = a.C0282n9.j(r2, r0, r6)
                r13.C(r14, r15, r0)
            Lad:
                return
        }

        @Override // a.Hg, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
                r4 = this;
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                super.h(r5, r6, r7)
                int r7 = r6.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = r4.m
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L5a
                r3 = r7 & 8
                if (r3 != 0) goto L5a
                boolean r7 = r0.c
                if (r7 == 0) goto L20
                int r7 = r6.getTotalScrollRange()
                int r7 = -r7
                r4.A(r5, r6, r7)
                goto L82
            L20:
                boolean r7 = r0.d
                if (r7 == 0) goto L28
                r4.A(r5, r6, r1)
                goto L82
            L28:
                int r7 = r0.e
                android.view.View r7 = r6.getChildAt(r7)
                int r0 = r7.getBottom()
                int r0 = -r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r3 = r4.m
                boolean r3 = r3.g
                if (r3 == 0) goto L46
                java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                int r7 = r7.getMinimumHeight()
                int r3 = r6.getTopInset()
                int r3 = r3 + r7
                int r3 = r3 + r0
                goto L56
            L46:
                int r7 = r7.getHeight()
                float r7 = (float) r7
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r3 = r4.m
                float r3 = r3.f
                float r7 = r7 * r3
                int r7 = java.lang.Math.round(r7)
                int r3 = r7 + r0
            L56:
                r4.A(r5, r6, r3)
                goto L82
            L5a:
                if (r7 == 0) goto L82
                r0 = r7 & 4
                if (r0 == 0) goto L62
                r0 = r2
                goto L63
            L62:
                r0 = r1
            L63:
                r3 = r7 & 2
                if (r3 == 0) goto L76
                int r7 = r6.getUpNestedPreScrollRange()
                int r7 = -r7
                if (r0 == 0) goto L72
                r4.C(r5, r6, r7)
                goto L82
            L72:
                r4.A(r5, r6, r7)
                goto L82
            L76:
                r7 = r7 & r2
                if (r7 == 0) goto L82
                if (r0 == 0) goto L7f
                r4.C(r5, r6, r1)
                goto L82
            L7f:
                r4.A(r5, r6, r1)
            L82:
                r6.f = r1
                r7 = 0
                r4.m = r7
                int r7 = r4.s()
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                int r7 = a.C0282n9.j(r7, r0, r1)
                a.Qe r0 = r4.f117a
                if (r0 == 0) goto La2
                int r3 = r0.c
                if (r3 == r7) goto La4
                r0.c = r7
                r0.b()
                goto La4
            La2:
                r4.b = r7
            La4:
                int r7 = r4.s()
                H(r5, r6, r7, r1, r2)
                int r7 = r4.s()
                r6.f1039a = r7
                boolean r7 = r6.willNotDraw()
                if (r7 != 0) goto Lbc
                java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
                r6.postInvalidateOnAnimation()
            Lbc:
                android.view.View$AccessibilityDelegate r7 = a.C0414ug.b(r5)
                if (r7 == 0) goto Lc3
                return r2
            Lc3:
                com.google.android.material.appbar.b r7 = new com.google.android.material.appbar.b
                r7.<init>(r5, r4, r6)
                a.C0414ug.j(r5, r7)
                return r2
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5, int r6, int r7) {
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
                int r7 = r7.height
                r0 = -2
                r1 = 0
                if (r7 != r0) goto L17
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                r3.r(r4, r5, r6, r7)
                r3 = 1
                return r3
            L17:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r1.E(r2, r3, r4, r5, r6)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9, int r10, int r11, int[] r12) {
                r6 = this;
                r2 = r8
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                if (r11 >= 0) goto L1b
                int r8 = r2.getDownNestedScrollRange()
                int r4 = -r8
                int r8 = r6.t()
                int r3 = r8 - r11
                r5 = 0
                r0 = r6
                r1 = r7
                int r7 = r0.z(r1, r2, r3, r4, r5)
                r8 = 1
                r12[r8] = r7
                goto L1d
            L1b:
                r0 = r6
                r1 = r7
            L1d:
                if (r11 != 0) goto L2e
                android.view.View$AccessibilityDelegate r7 = a.C0414ug.b(r1)
                if (r7 == 0) goto L26
                goto L2e
            L26:
                com.google.android.material.appbar.b r7 = new com.google.android.material.appbar.b
                r7.<init>(r1, r6, r2)
                a.C0414ug.j(r1, r7)
            L2e:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(android.view.View r1, android.os.Parcelable r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                boolean r1 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
                if (r1 == 0) goto Lb
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r2 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.a) r2
                r0.m = r2
                return
            Lb:
                r1 = 0
                r0.m = r1
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final android.os.Parcelable o(android.view.View r2) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r2 = r1.F(r0, r2)
                if (r2 != 0) goto Lb
                return r0
            Lb:
                return r2
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r4 = r5 & 2
                if (r4 == 0) goto L21
                boolean r4 = r2.j
                if (r4 != 0) goto L1f
                int r4 = r2.getTotalScrollRange()
                if (r4 == 0) goto L21
                int r1 = r1.getHeight()
                int r3 = r3.getHeight()
                int r1 = r1 - r3
                int r2 = r2.getHeight()
                if (r1 > r2) goto L21
            L1f:
                r1 = 1
                goto L22
            L21:
                r1 = 0
            L22:
                if (r1 == 0) goto L2b
                android.animation.ValueAnimator r2 = r0.l
                if (r2 == 0) goto L2b
                r2.cancel()
            L2b:
                r2 = 0
                r0.n = r2
                r0.k = r6
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                int r0 = r1.k
                if (r0 == 0) goto L9
                r0 = 1
                if (r5 != r0) goto L17
            L9:
                r1.G(r2, r3)
                boolean r2 = r3.j
                if (r2 == 0) goto L17
                boolean r2 = r3.e(r4)
                r3.d(r2)
            L17:
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r4)
                r1.n = r2
                return
        }

        @Override // a.Hg
        public final int t() {
                r2 = this;
                int r0 = r2.s()
                int r1 = r2.j
                int r0 = r0 + r1
                return r0
        }

        @Override // a.AbstractC0084c8
        public final boolean v(android.view.View r2) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                java.lang.ref.WeakReference<android.view.View> r2 = r1.n
                if (r2 == 0) goto L1e
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L1c
                boolean r0 = r2.isShown()
                if (r0 == 0) goto L1c
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L1c
                goto L1e
            L1c:
                r2 = 0
                return r2
            L1e:
                r2 = 1
                return r2
        }

        @Override // a.AbstractC0084c8
        public final int w(android.view.View r2) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r0 = r2.getDownNestedScrollRange()
                int r0 = -r0
                int r2 = r2.getTopInset()
                int r2 = r2 + r0
                return r2
        }

        @Override // a.AbstractC0084c8
        public final int x(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r1.getTotalScrollRange()
                return r1
        }

        @Override // a.AbstractC0084c8
        public final void y(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r1.G(r2, r3)
                boolean r0 = r3.j
                if (r0 == 0) goto L14
                android.view.View r2 = D(r2)
                boolean r2 = r3.e(r2)
                r3.d(r2)
            L14:
                return
        }

        @Override // a.AbstractC0084c8
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, int r22, int r23, int r24) {
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r23
                r3 = 1
                r4 = r21
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                int r5 = r0.t()
                r6 = 0
                if (r2 == 0) goto L1ac
                if (r5 < r2) goto L1ac
                r7 = r24
                if (r5 > r7) goto L1ac
                int r2 = a.C0282n9.j(r22, r23, r24)
                if (r5 == r2) goto L1ae
                boolean r7 = r4.e
                if (r7 == 0) goto L91
                int r7 = java.lang.Math.abs(r2)
                int r8 = r4.getChildCount()
                r9 = r6
            L2b:
                if (r9 >= r8) goto L91
                android.view.View r10 = r4.getChildAt(r9)
                android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r11 = (com.google.android.material.appbar.AppBarLayout.c) r11
                android.view.animation.Interpolator r12 = r11.c
                int r13 = r10.getTop()
                if (r7 < r13) goto L8f
                int r13 = r10.getBottom()
                if (r7 > r13) goto L8f
                if (r12 == 0) goto L91
                int r8 = r11.f1041a
                r9 = r8 & 1
                if (r9 == 0) goto L63
                int r9 = r10.getHeight()
                int r13 = r11.topMargin
                int r9 = r9 + r13
                int r11 = r11.bottomMargin
                int r9 = r9 + r11
                r8 = r8 & 2
                if (r8 == 0) goto L64
                java.util.WeakHashMap<android.view.View, a.Jg> r8 = a.C0414ug.f721a
                int r8 = r10.getMinimumHeight()
                int r9 = r9 - r8
                goto L64
            L63:
                r9 = r6
            L64:
                java.util.WeakHashMap<android.view.View, a.Jg> r8 = a.C0414ug.f721a
                boolean r8 = r10.getFitsSystemWindows()
                if (r8 == 0) goto L71
                int r8 = r4.getTopInset()
                int r9 = r9 - r8
            L71:
                if (r9 <= 0) goto L91
                int r8 = r10.getTop()
                int r7 = r7 - r8
                float r8 = (float) r9
                float r7 = (float) r7
                float r7 = r7 / r8
                float r7 = r12.getInterpolation(r7)
                float r7 = r7 * r8
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Integer.signum(r2)
                int r9 = r10.getTop()
                int r9 = r9 + r7
                int r9 = r9 * r8
                goto L92
            L8f:
                int r9 = r9 + r3
                goto L2b
            L91:
                r9 = r2
            L92:
                a.Qe r7 = r0.f117a
                if (r7 == 0) goto La3
                int r8 = r7.c
                if (r8 == r9) goto La1
                r7.c = r9
                r7.b()
                r7 = r3
                goto La6
            La1:
                r7 = r6
                goto La6
            La3:
                r0.b = r9
                goto La1
            La6:
                int r8 = r5 - r2
                int r9 = r2 - r9
                r0.j = r9
                r9 = 0
                if (r7 == 0) goto L157
                r10 = r6
            Lb0:
                int r11 = r4.getChildCount()
                if (r10 >= r11) goto L157
                android.view.View r11 = r4.getChildAt(r10)
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r11 = (com.google.android.material.appbar.AppBarLayout.c) r11
                com.google.android.material.appbar.AppBarLayout$b r12 = r11.b
                if (r12 == 0) goto L14f
                int r11 = r11.f1041a
                r11 = r11 & r3
                if (r11 == 0) goto L14f
                android.view.View r11 = r4.getChildAt(r10)
                int r13 = r0.s()
                float r13 = (float) r13
                android.graphics.Rect r14 = r12.f1040a
                r11.getDrawingRect(r14)
                r4.offsetDescendantRectToMyCoords(r11, r14)
                int r15 = r4.getTopInset()
                int r15 = -r15
                r14.offset(r6, r15)
                int r15 = r14.top
                float r15 = (float) r15
                float r13 = java.lang.Math.abs(r13)
                float r15 = r15 - r13
                r13 = 0
                int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r16 > 0) goto L141
                r16 = r3
                int r3 = r14.height()
                float r3 = (float) r3
                float r3 = r15 / r3
                float r3 = java.lang.Math.abs(r3)
                int r17 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                r18 = 1065353216(0x3f800000, float:1.0)
                if (r17 >= 0) goto L103
                goto L10b
            L103:
                int r13 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
                if (r13 <= 0) goto L10a
                r13 = r18
                goto L10b
            L10a:
                r13 = r3
            L10b:
                float r3 = -r15
                float r13 = r18 - r13
                float r13 = r13 * r13
                float r18 = r18 - r13
                int r13 = r14.height()
                float r13 = (float) r13
                r14 = 1050253722(0x3e99999a, float:0.3)
                float r13 = r13 * r14
                float r13 = r13 * r18
                float r3 = r3 - r13
                r11.setTranslationY(r3)
                android.graphics.Rect r12 = r12.b
                r11.getDrawingRect(r12)
                float r13 = -r3
                int r13 = (int) r13
                r12.offset(r6, r13)
                int r13 = r12.height()
                float r13 = (float) r13
                int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r3 < 0) goto L138
                r3 = 4
                r11.setVisibility(r3)
                goto L13b
            L138:
                r11.setVisibility(r6)
            L13b:
                java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                r11.setClipBounds(r12)
                goto L151
            L141:
                r16 = r3
                java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                r11.setClipBounds(r9)
                r11.setTranslationY(r13)
                r11.setVisibility(r6)
                goto L151
            L14f:
                r16 = r3
            L151:
                int r10 = r10 + 1
                r3 = r16
                goto Lb0
            L157:
                r16 = r3
                if (r7 != 0) goto L190
                boolean r3 = r4.e
                if (r3 == 0) goto L190
                a.A2 r3 = r1.b
                java.lang.Object r3 = r3.b
                a.ge r3 = (a.C0162ge) r3
                java.lang.Object r3 = r3.getOrDefault(r4, r9)
                java.util.List r3 = (java.util.List) r3
                if (r3 == 0) goto L190
                boolean r7 = r3.isEmpty()
                if (r7 != 0) goto L190
                r7 = r6
            L174:
                int r9 = r3.size()
                if (r7 >= r9) goto L190
                java.lang.Object r9 = r3.get(r7)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f879a
                if (r10 == 0) goto L18d
                r10.d(r1, r9, r4)
            L18d:
                int r7 = r7 + 1
                goto L174
            L190:
                int r3 = r0.s()
                r4.f1039a = r3
                boolean r3 = r4.willNotDraw()
                if (r3 != 0) goto L1a1
                java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                r4.postInvalidateOnAnimation()
            L1a1:
                if (r2 >= r5) goto L1a5
                r3 = -1
                goto L1a7
            L1a5:
                r3 = r16
            L1a7:
                H(r1, r4, r2, r3, r6)
                r6 = r8
                goto L1ae
            L1ac:
                r0.j = r6
            L1ae:
                android.view.View$AccessibilityDelegate r2 = a.C0414ug.b(r1)
                if (r2 == 0) goto L1b5
                return r6
            L1b5:
                com.google.android.material.appbar.b r2 = new com.google.android.material.appbar.b
                r2.<init>(r1, r0, r4)
                a.C0414ug.j(r1, r2)
                return r6
        }
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static class ScrollingViewBehavior extends a.AbstractC0102d8 {
        public ScrollingViewBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.ScrollingViewBehavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop
                r0 = 0
                int r3 = r2.getDimensionPixelSize(r3, r0)
                r1.f = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(android.view.View r1, android.view.View r2) {
                r0 = this;
                boolean r1 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f879a
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                r1 = 0
                if (r0 == 0) goto L37
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
                int r0 = r7.getBottom()
                int r2 = r6.getTop()
                int r0 = r0 - r2
                int r5 = r5.j
                int r0 = r0 + r5
                int r5 = r4.e
                int r0 = r0 + r5
                int r5 = r4.f
                if (r5 != 0) goto L24
                r5 = r1
                goto L31
            L24:
                float r5 = r4.w(r7)
                int r2 = r4.f
                float r3 = (float) r2
                float r5 = r5 * r3
                int r5 = (int) r5
                int r5 = a.C0282n9.j(r5, r1, r2)
            L31:
                int r0 = r0 - r5
                java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
                r6.offsetTopAndBottom(r0)
            L37:
                boolean r5 = r7 instanceof com.google.android.material.appbar.AppBarLayout
                if (r5 == 0) goto L48
                com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7
                boolean r5 = r7.j
                if (r5 == 0) goto L48
                boolean r5 = r7.e(r6)
                r7.d(r5)
            L48:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                boolean r2 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L8
                r2 = 0
                a.C0414ug.j(r1, r2)
            L8:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.graphics.Rect r9, boolean r10) {
                r6 = this;
                java.util.ArrayList r0 = r7.e(r8)
                int r1 = r0.size()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L1c
                java.lang.Object r4 = r0.get(r3)
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r5 == 0) goto L19
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                goto L1d
            L19:
                int r3 = r3 + 1
                goto La
            L1c:
                r4 = 0
            L1d:
                if (r4 == 0) goto L4e
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>(r9)
                int r9 = r8.getLeft()
                int r8 = r8.getTop()
                r0.offset(r9, r8)
                int r8 = r7.getWidth()
                int r7 = r7.getHeight()
                android.graphics.Rect r9 = r6.c
                r9.set(r2, r2, r8, r7)
                boolean r7 = r9.contains(r0)
                if (r7 != 0) goto L4e
                if (r10 != 0) goto L45
                r2 = 4
            L45:
                r7 = r2 | 10
                r4.f = r7
                r4.requestLayout()
                r7 = 1
                return r7
            L4e:
                return r2
        }

        @Override // a.AbstractC0102d8
        public final com.google.android.material.appbar.AppBarLayout v(java.util.ArrayList r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L14
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                return r2
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                r5 = 0
                return r5
        }

        @Override // a.AbstractC0102d8
        public final float w(android.view.View r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto L34
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                int r0 = r5.getTotalScrollRange()
                int r2 = r5.getDownNestedPreScrollRange()
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f879a
                boolean r3 = r5 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r3 == 0) goto L22
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
                int r5 = r5.t()
                goto L23
            L22:
                r5 = 0
            L23:
                if (r2 == 0) goto L2a
                int r3 = r0 + r5
                if (r3 > r2) goto L2a
                return r1
            L2a:
                int r0 = r0 - r2
                if (r0 == 0) goto L34
                float r5 = (float) r5
                float r0 = (float) r0
                float r5 = r5 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 + r0
                return r5
            L34:
                return r1
        }

        @Override // a.AbstractC0102d8
        public final int x(android.view.View r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto Lb
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r2 = r2.getTotalScrollRange()
                return r2
            Lb:
                int r2 = r2.getMeasuredHeight()
                return r2
        }
    }

    public static abstract class a {
    }

    public static class b extends com.google.android.material.appbar.AppBarLayout.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Rect f1040a;
        public final android.graphics.Rect b;

        public b() {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1040a = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.b = r0
                return
        }
    }

    public static class c extends android.widget.LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1041a;
        public com.google.android.material.appbar.AppBarLayout.b b;
        public android.view.animation.Interpolator c;
    }

    public static com.google.android.material.appbar.AppBarLayout.c b(android.view.ViewGroup.LayoutParams r2) {
            boolean r0 = r2 instanceof android.widget.LinearLayout.LayoutParams
            r1 = 1
            if (r0 == 0) goto Lf
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r0.<init>(r2)
            r0.f1041a = r1
            return r0
        Lf:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L1d
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            r0.f1041a = r1
            return r0
        L1d:
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            r0.<init>(r2)
            r0.f1041a = r1
            return r0
    }

    public final com.google.android.material.appbar.AppBarLayout.c a(android.util.AttributeSet r6) {
            r5 = this;
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1, r6)
            r2 = 1
            r0.f1041a = r2
            int[] r3 = com.google.android.material.R.styleable.AppBarLayout_Layout
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r3)
            int r3 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollFlags
            r4 = 0
            int r3 = r6.getInt(r3, r4)
            r0.f1041a = r3
            int r3 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollEffect
            int r3 = r6.getInt(r3, r4)
            if (r3 == r2) goto L25
            r2 = 0
            goto L2a
        L25:
            com.google.android.material.appbar.AppBarLayout$b r2 = new com.google.android.material.appbar.AppBarLayout$b
            r2.<init>()
        L2a:
            r0.b = r2
            int r2 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator
            boolean r2 = r6.hasValue(r2)
            if (r2 == 0) goto L40
            int r2 = com.google.android.material.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator
            int r2 = r6.getResourceId(r2, r4)
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.c = r1
        L40:
            r6.recycle()
            return r0
    }

    public final void c() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = r3.p
            int r1 = r3.b
            r2 = -1
            if (r1 == r2) goto L13
            int r1 = r3.f
            if (r1 == 0) goto Lc
            goto L13
        Lc:
            a.r$a r1 = a.r.b
            com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = r0.F(r1, r3)
            goto L14
        L13:
            r0 = 0
        L14:
            r3.b = r2
            r3.c = r2
            r3.d = r2
            if (r0 == 0) goto L25
            com.google.android.material.appbar.AppBarLayout$Behavior r1 = r3.p
            com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r2 = r1.m
            if (r2 == 0) goto L23
            goto L25
        L23:
            r1.m = r0
        L25:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.c
            return r1
    }

    public final boolean d(boolean r3) {
            r2 = this;
            boolean r0 = r2.g
            if (r0 != 0) goto L3e
            boolean r0 = r2.i
            if (r0 == r3) goto L3e
            r2.i = r3
            r2.refreshDrawableState()
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            boolean r3 = r3 instanceof a.Ta
            if (r3 == 0) goto L3c
            boolean r3 = r2.j
            if (r3 == 0) goto L3c
            android.animation.ValueAnimator r3 = r2.m
            if (r3 == 0) goto L20
            r3.cancel()
        L20:
            r3 = 2
            float[] r3 = new float[r3]
            r3 = {x0040: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r2.m = r3
            r0 = 0
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.m
            r0 = 0
            r3.setInterpolator(r0)
            android.animation.ValueAnimator r3 = r2.m
            r3.start()
        L3c:
            r3 = 1
            return r3
        L3e:
            r3 = 0
            return r3
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            super.draw(r4)
            android.graphics.drawable.Drawable r0 = r3.o
            if (r0 == 0) goto L21
            int r0 = r3.getTopInset()
            if (r0 <= 0) goto L21
            int r0 = r4.save()
            int r1 = r3.f1039a
            int r1 = -r1
            float r1 = (float) r1
            r2 = 0
            r4.translate(r2, r1)
            android.graphics.drawable.Drawable r1 = r3.o
            r1.draw(r4)
            r4.restoreToCount(r0)
        L21:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.o
            if (r1 == 0) goto L1a
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L1a
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L1a
            r3.invalidateDrawable(r1)
        L1a:
            return
    }

    public final boolean e(android.view.View r5) {
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.l
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L31
            int r0 = r4.k
            if (r0 == r1) goto L31
            if (r5 == 0) goto L11
            android.view.View r0 = r5.findViewById(r0)
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 != 0) goto L28
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L28
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.k
            android.view.View r0 = r0.findViewById(r3)
        L28:
            if (r0 == 0) goto L31
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.l = r3
        L31:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.l
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get()
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L3c:
            if (r2 != 0) goto L3f
            goto L40
        L3f:
            r5 = r2
        L40:
            if (r5 == 0) goto L50
            boolean r0 = r5.canScrollVertically(r1)
            if (r0 != 0) goto L4e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L50
        L4e:
            r5 = 1
            return r5
        L50:
            r5 = 0
            return r5
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r1 = 1
            r0.f1041a = r1
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$c r0 = new com.google.android.material.appbar.AppBarLayout$c
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r1 = 1
            r0.f1041a = r1
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$c r1 = r0.a(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$c r1 = b(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$c r1 = r0.a(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$c r1 = b(r1)
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.c<com.google.android.material.appbar.AppBarLayout> getBehavior() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = new com.google.android.material.appbar.AppBarLayout$Behavior
            r0.<init>()
            r1.p = r0
            return r0
    }

    public int getDownNestedPreScrollRange() {
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.c
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r7 = (com.google.android.material.appbar.AppBarLayout.c) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f1041a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.c = r0
            return r0
    }

    public int getDownNestedScrollRange() {
            r9 = this;
            int r0 = r9.d
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        Ld:
            if (r2 >= r0) goto L42
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L1c
            goto L3f
        L1c:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r5 = (com.google.android.material.appbar.AppBarLayout.c) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.topMargin
            int r8 = r5.bottomMargin
            int r7 = r7 + r8
            int r7 = r7 + r6
            int r5 = r5.f1041a
            r6 = r5 & 1
            if (r6 == 0) goto L42
            int r3 = r3 + r7
            r5 = r5 & 2
            if (r5 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r4.getMinimumHeight()
            int r3 = r3 - r0
            goto L42
        L3f:
            int r2 = r2 + 1
            goto Ld
        L42:
            int r0 = java.lang.Math.max(r1, r3)
            r9.d = r0
            return r0
    }

    public int getLiftOnScrollTargetViewId() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public a.Ta getMaterialShapeBackground() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto Lb
            a.Ta r0 = (a.Ta) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
            r3 = this;
            int r0 = r3.getTopInset()
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r3.getMinimumHeight()
            if (r1 == 0) goto L10
        Lc:
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
        L10:
            int r1 = r3.getChildCount()
            r2 = 1
            if (r1 < r2) goto L21
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = r1.getMinimumHeight()
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            goto Lc
        L25:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
    }

    public int getPendingAction() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.o
            return r0
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int getTopInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int getTotalScrollRange() {
            r9 = this;
            int r0 = r9.b
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        Ld:
            if (r2 >= r0) goto L52
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L1c
            goto L4f
        L1c:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r5 = (com.google.android.material.appbar.AppBarLayout.c) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.f1041a
            r8 = r7 & 1
            if (r8 == 0) goto L52
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r6 = r6 + r3
            if (r2 != 0) goto L42
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r4.getFitsSystemWindows()
            if (r3 == 0) goto L42
            int r3 = r9.getTopInset()
            int r6 = r6 - r3
        L42:
            r3 = r6
            r5 = r7 & 2
            if (r5 == 0) goto L4f
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r4.getMinimumHeight()
            int r3 = r3 - r0
            goto L52
        L4f:
            int r2 = r2 + 1
            goto Ld
        L52:
            int r0 = java.lang.Math.max(r1, r3)
            r9.b = r0
            return r0
    }

    public int getUpNestedPreScrollRange() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto L10
            a.Ta r0 = (a.Ta) r0
            a.C0282n9.A(r2, r0)
        L10:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r5) {
            r4 = this;
            int[] r0 = r4.n
            if (r0 != 0) goto L9
            r0 = 4
            int[] r0 = new int[r0]
            r4.n = r0
        L9:
            int[] r0 = r4.n
            int r1 = r0.length
            int r5 = r5 + r1
            int[] r5 = super.onCreateDrawableState(r5)
            boolean r1 = r4.h
            int r2 = com.google.android.material.R.attr.state_liftable
            if (r1 == 0) goto L18
            goto L19
        L18:
            int r2 = -r2
        L19:
            r3 = 0
            r0[r3] = r2
            if (r1 == 0) goto L25
            boolean r2 = r4.i
            if (r2 == 0) goto L25
            int r2 = com.google.android.material.R.attr.state_lifted
            goto L28
        L25:
            int r2 = com.google.android.material.R.attr.state_lifted
            int r2 = -r2
        L28:
            r3 = 1
            r0[r3] = r2
            int r2 = com.google.android.material.R.attr.state_collapsible
            if (r1 == 0) goto L30
            goto L31
        L30:
            int r2 = -r2
        L31:
            r3 = 2
            r0[r3] = r2
            if (r1 == 0) goto L3d
            boolean r1 = r4.i
            if (r1 == 0) goto L3d
            int r1 = com.google.android.material.R.attr.state_collapsed
            goto L40
        L3d:
            int r1 = com.google.android.material.R.attr.state_collapsed
            int r1 = -r1
        L40:
            r2 = 3
            r0[r2] = r1
            int[] r5 = android.view.View.mergeDrawableStates(r5, r0)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.ref.WeakReference<android.view.View> r0 = r1.l
            if (r0 == 0) goto La
            r0.clear()
        La:
            r0 = 0
            r1.l = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r0 = 1
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            boolean r4 = r2.getFitsSystemWindows()
            r5 = 0
            if (r4 == 0) goto L3b
            int r4 = r2.getChildCount()
            if (r4 <= 0) goto L3b
            android.view.View r4 = r2.getChildAt(r5)
            int r6 = r4.getVisibility()
            r7 = 8
            if (r6 == r7) goto L3b
            boolean r4 = r4.getFitsSystemWindows()
            if (r4 != 0) goto L3b
            int r4 = r2.getTopInset()
            int r6 = r2.getChildCount()
            int r6 = r6 - r0
        L2f:
            if (r6 < 0) goto L3b
            android.view.View r7 = r2.getChildAt(r6)
            r7.offsetTopAndBottom(r4)
            int r6 = r6 + (-1)
            goto L2f
        L3b:
            r2.c()
            r3.e = r5
            int r4 = r2.getChildCount()
            r6 = r5
        L45:
            if (r6 >= r4) goto L5a
            android.view.View r7 = r2.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r7 = (com.google.android.material.appbar.AppBarLayout.c) r7
            android.view.animation.Interpolator r7 = r7.c
            if (r7 == 0) goto L58
            r3.e = r0
            goto L5a
        L58:
            int r6 = r6 + r0
            goto L45
        L5a:
            android.graphics.drawable.Drawable r4 = r3.o
            if (r4 == 0) goto L69
            int r6 = r2.getWidth()
            int r7 = r2.getTopInset()
            r4.setBounds(r5, r5, r6, r7)
        L69:
            boolean r4 = r3.g
            if (r4 != 0) goto L99
            boolean r4 = r3.j
            if (r4 != 0) goto L90
            int r4 = r2.getChildCount()
            r6 = r5
        L76:
            if (r6 >= r4) goto L8f
            android.view.View r7 = r2.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r7 = (com.google.android.material.appbar.AppBarLayout.c) r7
            int r7 = r7.f1041a
            r1 = r7 & 1
            if (r1 != r0) goto L8d
            r7 = r7 & 10
            if (r7 == 0) goto L8d
            goto L90
        L8d:
            int r6 = r6 + r0
            goto L76
        L8f:
            r0 = r5
        L90:
            boolean r4 = r3.h
            if (r4 == r0) goto L99
            r3.h = r0
            r2.refreshDrawableState()
        L99:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            int r5 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L55
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r4.getFitsSystemWindows()
            if (r0 == 0) goto L55
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L55
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L55
            boolean r1 = r1.getFitsSystemWindows()
            if (r1 != 0) goto L55
            int r1 = r4.getMeasuredHeight()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L3d
            if (r5 == 0) goto L37
            goto L4e
        L37:
            int r5 = r4.getTopInset()
            int r1 = r1 + r5
            goto L4e
        L3d:
            int r5 = r4.getMeasuredHeight()
            int r1 = r4.getTopInset()
            int r1 = r1 + r5
            int r5 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = a.C0282n9.j(r1, r0, r5)
        L4e:
            int r5 = r4.getMeasuredWidth()
            r4.setMeasuredDimension(r5, r1)
        L55:
            r4.c()
            return
    }

    @Override // android.view.View
    public void setElevation(float r3) {
            r2 = this;
            super.setElevation(r3)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto L10
            a.Ta r0 = (a.Ta) r0
            r0.j(r3)
        L10:
            return
    }

    public void setExpanded(boolean r2) {
            r1 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r1.isLaidOut()
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 2
        Lb:
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = 0
        L10:
            r2 = r2 | r0
            r2 = r2 | 8
            r1.f = r2
            r1.requestLayout()
            return
    }

    public void setLiftOnScroll(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setLiftOnScrollTargetView(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.k = r0
            if (r2 != 0) goto L10
            java.lang.ref.WeakReference<android.view.View> r2 = r1.l
            if (r2 == 0) goto Lc
            r2.clear()
        Lc:
            r2 = 0
            r1.l = r2
            return
        L10:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.l = r0
            return
    }

    public void setLiftOnScrollTargetViewId(int r1) {
            r0 = this;
            r0.k = r1
            java.lang.ref.WeakReference<android.view.View> r1 = r0.l
            if (r1 == 0) goto L9
            r1.clear()
        L9:
            r1 = 0
            r0.l = r1
            return
    }

    public void setLiftableOverrideEnabled(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L7
            super.setOrientation(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AppBarLayout is always vertical and does not support horizontal orientation"
            r2.<init>(r0)
            throw r2
    }

    public void setStatusBarForeground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.o
            if (r0 == r4) goto L6c
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r4 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L10:
            r3.o = r1
            boolean r4 = r1 instanceof a.Ta
            if (r4 == 0) goto L1b
            a.Ta r1 = (a.Ta) r1
            int r4 = r1.u
            goto L24
        L1b:
            android.content.res.ColorStateList r4 = a.C0475y5.a(r1)
            if (r4 == 0) goto L24
            r4.getDefaultColor()
        L24:
            android.graphics.drawable.Drawable r4 = r3.o
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L57
            boolean r4 = r4.isStateful()
            if (r4 == 0) goto L39
            android.graphics.drawable.Drawable r4 = r3.o
            int[] r2 = r3.getDrawableState()
            r4.setState(r2)
        L39:
            android.graphics.drawable.Drawable r4 = r3.o
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r2 = r3.getLayoutDirection()
            a.C0439w5.b.b(r4, r2)
            android.graphics.drawable.Drawable r4 = r3.o
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L4e
            r2 = r1
            goto L4f
        L4e:
            r2 = r0
        L4f:
            r4.setVisible(r2, r0)
            android.graphics.drawable.Drawable r4 = r3.o
            r4.setCallback(r3)
        L57:
            android.graphics.drawable.Drawable r4 = r3.o
            if (r4 == 0) goto L62
            int r4 = r3.getTopInset()
            if (r4 <= 0) goto L62
            r0 = r1
        L62:
            r4 = r0 ^ 1
            r3.setWillNotDraw(r4)
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            r3.postInvalidateOnAnimation()
        L6c:
            return
    }

    public void setStatusBarForegroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarForeground(r0)
            return
    }

    public void setStatusBarForegroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setStatusBarForeground(r2)
            return
    }

    @java.lang.Deprecated
    public void setTargetElevation(float r12) {
            r11 = this;
            r0 = 1
            r1 = 0
            android.content.res.Resources r2 = r11.getResources()
            int r3 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r2 = r2.getInteger(r3)
            android.animation.StateListAnimator r3 = new android.animation.StateListAnimator
            r3.<init>()
            int r4 = com.google.android.material.R.attr.state_liftable
            int r5 = com.google.android.material.R.attr.state_lifted
            int r5 = -r5
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r6, r4, r5}
            r5 = 0
            float[] r7 = new float[r0]
            r7[r1] = r5
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r11, r8, r7)
            long r9 = (long) r2
            android.animation.ObjectAnimator r2 = r7.setDuration(r9)
            r3.addState(r4, r2)
            int[] r2 = new int[]{r6}
            float[] r4 = new float[r0]
            r4[r1] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r11, r8, r4)
            android.animation.ObjectAnimator r12 = r12.setDuration(r9)
            r3.addState(r2, r12)
            int[] r12 = new int[r1]
            float[] r0 = new float[r0]
            r0[r1] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r8, r0)
            r1 = 0
            android.animation.ObjectAnimator r0 = r0.setDuration(r1)
            r3.addState(r12, r0)
            r11.setStateListAnimator(r3)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.o
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.o
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }
}
