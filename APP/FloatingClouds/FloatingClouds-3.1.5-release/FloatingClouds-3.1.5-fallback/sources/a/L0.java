package a;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.K0 f157a;
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public L0(a.K0 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f157a = r2
            return
    }

    public final void a() {
            r3 = this;
            a.K0 r0 = r3.f157a
            android.graphics.drawable.Drawable r1 = r0.getCheckMarkDrawable()
            if (r1 == 0) goto L36
            boolean r2 = r3.d
            if (r2 != 0) goto L10
            boolean r2 = r3.e
            if (r2 == 0) goto L36
        L10:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.d
            if (r2 == 0) goto L1d
            android.content.res.ColorStateList r2 = r3.b
            a.C0439w5.a.h(r1, r2)
        L1d:
            boolean r2 = r3.e
            if (r2 == 0) goto L26
            android.graphics.PorterDuff$Mode r2 = r3.c
            a.C0439w5.a.i(r1, r2)
        L26:
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L33
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L33:
            r0.setCheckMarkDrawable(r1)
        L36:
            return
    }
}
