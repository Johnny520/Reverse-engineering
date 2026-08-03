package a;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.Q0 f267a;

    public class a extends a.C0282n9 {
        public final /* synthetic */ a.T0 b;

        public a(a.T0 r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r3 = this;
                a.T0 r0 = r3.b
                a.Q0 r0 = r0.f267a
                androidx.appcompat.widget.ActionBarContextView r1 = r0.v
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                a.Jg r1 = r0.y
                r2 = 0
                r1.d(r2)
                r0.y = r2
                return
        }

        @Override // a.C0282n9, a.Lg
        public final void c() {
                r2 = this;
                a.T0 r0 = r2.b
                a.Q0 r0 = r0.f267a
                androidx.appcompat.widget.ActionBarContextView r0 = r0.v
                r1 = 0
                r0.setVisibility(r1)
                return
        }
    }

    public T0(a.Q0 r1) {
            r0 = this;
            r0.<init>()
            r0.f267a = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            a.Q0 r0 = r5.f267a
            android.widget.PopupWindow r1 = r0.w
            androidx.appcompat.widget.ActionBarContextView r2 = r0.v
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            a.Jg r1 = r0.y
            if (r1 == 0) goto L13
            r1.b()
        L13:
            boolean r1 = r0.A
            if (r1 == 0) goto L23
            android.view.ViewGroup r1 = r0.B
            if (r1 == 0) goto L23
            boolean r1 = r1.isLaidOut()
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = r4
        L24:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L42
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            a.Jg r1 = a.C0414ug.a(r1)
            r1.a(r2)
            r0.y = r1
            a.T0$a r0 = new a.T0$a
            r0.<init>(r5)
            r1.d(r0)
            return
        L42:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.v
            r0.setVisibility(r4)
            return
    }
}
