package a;

/* JADX INFO: renamed from: a.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0398u0 extends a.AbstractC0092cg implements android.graphics.drawable.Animatable {
    public final a.C0398u0.b b;
    public final android.content.Context c;
    public a.C0416v0 d;
    public java.util.ArrayList<a.AbstractC0380t0> e;
    public final a.C0398u0.a f;

    /* JADX INFO: renamed from: a.u0$a */
    public class a implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0398u0 f700a;

        public a(a.C0398u0 r1) {
                r0 = this;
                r0.<init>()
                r0.f700a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                a.u0 r1 = r0.f700a
                r1.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                a.u0 r1 = r0.f700a
                r1.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                a.u0 r1 = r0.f700a
                r1.unscheduleSelf(r2)
                return
        }
    }

    /* JADX INFO: renamed from: a.u0$b */
    public static class b extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.C0110dg f701a;
        public android.animation.AnimatorSet b;
        public java.util.ArrayList<android.animation.Animator> c;
        public a.J1<android.animation.Animator, java.lang.String> d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: renamed from: a.u0$c */
    public static class c extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.drawable.Drawable.ConstantState f702a;

        public c(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f702a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f702a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f702a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                a.u0 r0 = new a.u0
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.f702a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.f428a = r1
                a.u0$a r2 = r0.f
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                a.u0 r0 = new a.u0
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f702a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.f428a = r3
                a.u0$a r1 = r0.f
                r3.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                a.u0 r0 = new a.u0
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f702a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                r0.f428a = r3
                a.u0$a r4 = r0.f
                r3.setCallback(r4)
                return r0
        }
    }

    public C0398u0() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C0398u0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.e = r0
            a.u0$a r0 = new a.u0$a
            r0.<init>(r1)
            r1.f = r0
            r1.c = r2
            a.u0$b r2 = new a.u0$b
            r2.<init>()
            r1.b = r2
            return
    }

    @Override // a.AbstractC0092cg, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L7
            a.C0439w5.a.a(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r0 = a.C0439w5.a.b(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L8
            r0.draw(r3)
            return
        L8:
            a.u0$b r0 = r2.b
            a.dg r1 = r0.f701a
            r1.draw(r3)
            android.animation.AnimatorSet r3 = r0.b
            boolean r3 = r3.isStarted()
            if (r3 == 0) goto L1a
            r2.invalidateSelf()
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getAlpha()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            a.u0$b r1 = r2.b
            r1.getClass()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = a.C0439w5.a.c(r0)
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L10
            a.u0$c r0 = new a.u0$c
            android.graphics.drawable.Drawable r1 = r2.f428a
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a.d(r0, r10, r11, r12, r13)
            return
        L8:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            a.u0$b r3 = r9.b
            if (r0 == r2) goto Lc8
            int r4 = r11.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc8
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc2
            java.lang.String r0 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L68
            int[] r0 = a.C0327q0.e
            android.content.res.TypedArray r0 = a.Lf.c(r10, r13, r12, r0)
            int r4 = r0.getResourceId(r6, r6)
            if (r4 == 0) goto L64
            a.dg r7 = new a.dg
            r7.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r8 = a.C0340qd.f657a
            android.graphics.drawable.Drawable r4 = a.C0340qd.a.a(r10, r4, r13)
            r7.f428a = r4
            a.dg$h r4 = new a.dg$h
            android.graphics.drawable.Drawable r8 = r7.f428a
            android.graphics.drawable.Drawable$ConstantState r8 = r8.getConstantState()
            r4.<init>(r8)
            r7.f = r6
            a.u0$a r4 = r9.f
            r7.setCallback(r4)
            a.dg r4 = r3.f701a
            if (r4 == 0) goto L62
            r4.setCallback(r5)
        L62:
            r3.f701a = r7
        L64:
            r0.recycle()
            goto Lc2
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc2
            int[] r0 = a.C0327q0.f
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            java.lang.String r4 = r0.getString(r6)
            int r6 = r0.getResourceId(r2, r6)
            if (r6 == 0) goto Lbf
            android.content.Context r7 = r9.c
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            a.dg r7 = r3.f701a
            a.dg$g r7 = r7.b
            a.dg$f r7 = r7.b
            a.J1<java.lang.String, java.lang.Object> r7 = r7.o
            java.lang.Object r5 = r7.getOrDefault(r4, r5)
            r6.setTarget(r5)
            java.util.ArrayList<android.animation.Animator> r5 = r3.c
            if (r5 != 0) goto La9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.c = r5
            a.J1 r5 = new a.J1
            r5.<init>()
            r3.d = r5
        La9:
            java.util.ArrayList<android.animation.Animator> r5 = r3.c
            r5.add(r6)
            a.J1<android.animation.Animator, java.lang.String> r3 = r3.d
            r3.put(r6, r4)
            goto Lbf
        Lb4:
            r0.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Context can't be null when inflating animators"
            r10.<init>(r11)
            throw r10
        Lbf:
            r0.recycle()
        Lc2:
            int r0 = r11.next()
            goto L12
        Lc8:
            android.animation.AnimatorSet r10 = r3.b
            if (r10 != 0) goto Ld3
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r3.b = r10
        Ld3:
            android.animation.AnimatorSet r10 = r3.b
            java.util.ArrayList<android.animation.Animator> r11 = r3.c
            r10.playTogether(r11)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r0 = r0.isAutoMirrored()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        Lb:
            a.u0$b r0 = r1.b
            android.animation.AnimatorSet r0 = r0.b
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setBounds(r2)
            return
    }

    @Override // a.AbstractC0092cg, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a(r0, r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a.h(r0, r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a.i(r0, r2)
            return
        L8:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            a.u0$b r0 = r1.b
            a.dg r0 = r0.f701a
            r0.setVisible(r2, r3)
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            a.u0$b r0 = r2.b
            android.animation.AnimatorSet r1 = r0.b
            boolean r1 = r1.isStarted()
            if (r1 == 0) goto L15
            return
        L15:
            android.animation.AnimatorSet r0 = r0.b
            r0.start()
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            a.u0$b r0 = r1.b
            android.animation.AnimatorSet r0 = r0.b
            r0.end()
            return
    }
}
