package a;

/* JADX INFO: loaded from: classes.dex */
public final class Oa implements a.Tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ int c;

    public Oa(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f202a = r2
            r0.b = r1
            r0.c = r3
            return
    }

    @Override // a.Tb
    public final a.nh a(android.view.View r5, a.nh r6) {
            r4 = this;
            a.nh$k r5 = r6.f603a
            r0 = 7
            a.a9 r5 = r5.f(r0)
            int r5 = r5.b
            android.view.View r0 = r4.b
            int r1 = r4.f202a
            if (r1 < 0) goto L1d
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r1 = r1 + r5
            r2.height = r1
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0.setLayoutParams(r1)
        L1d:
            int r1 = r0.getPaddingLeft()
            int r2 = r4.c
            int r2 = r2 + r5
            int r5 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r2, r5, r3)
            return r6
    }
}
