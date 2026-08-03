package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gg.u f18569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg.q f18570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f18571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg.u f18572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg.q f18573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wb.o6 f18574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f18575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f18576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c9.a1 f18577j;

    public /* synthetic */ q6(gg.u r1, gg.q r2, i0.j1 r3, gg.u r4, gg.q r5, wb.o6 r6, java.util.ArrayList r7, android.view.ViewGroup r8, c9.a1 r9, int r10) {
            r0 = this;
            r0.f18568a = r10
            r0.f18569b = r1
            r0.f18570c = r2
            r0.f18571d = r3
            r0.f18572e = r4
            r0.f18573f = r5
            r0.f18574g = r6
            r0.f18575h = r7
            r0.f18576i = r8
            r0.f18577j = r9
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f18568a
            r15.getClass()
            switch(r0) {
                case 0: goto L35;
                default: goto L8;
            }
        L8:
            gg.u r4 = r14.f18569b
            java.lang.Object r0 = r4.f4564g
            r10 = 0
            if (r0 == 0) goto L2f
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L18
            goto L2e
        L18:
            android.view.ViewGroup r8 = r14.f18576i
            c9.a1 r9 = r14.f18577j
            gg.q r1 = r14.f18570c
            i0.j1 r2 = r14.f18571d
            gg.u r3 = r14.f18572e
            gg.q r5 = r14.f18573f
            wb.o6 r6 = r14.f18574g
            java.util.ArrayList r7 = r14.f18575h
            a7.a.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.setResult(r10)
        L2e:
            return
        L2f:
            java.lang.String r15 = "page"
            gg.l.g(r15)
            throw r10
        L35:
            java.lang.Object[] r0 = r15.args
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        L3c:
            r3 = 0
            if (r2 >= r1) goto L49
            r4 = r0[r2]
            boolean r5 = r4 instanceof android.view.KeyEvent
            if (r5 == 0) goto L46
            goto L4a
        L46:
            int r2 = r2 + 1
            goto L3c
        L49:
            r4 = r3
        L4a:
            boolean r0 = r4 instanceof android.view.KeyEvent
            if (r0 == 0) goto L51
            android.view.KeyEvent r4 = (android.view.KeyEvent) r4
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L90
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L90
            gg.u r8 = r14.f18569b
            java.lang.Object r0 = r8.f4564g
            if (r0 == 0) goto L8a
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L6a
            goto L90
        L6a:
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L84
            android.view.ViewGroup r12 = r14.f18576i
            c9.a1 r13 = r14.f18577j
            gg.q r5 = r14.f18570c
            i0.j1 r6 = r14.f18571d
            gg.u r7 = r14.f18572e
            gg.q r9 = r14.f18573f
            wb.o6 r10 = r14.f18574g
            java.util.ArrayList r11 = r14.f18575h
            a7.a.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L84:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.setResult(r0)
            goto L90
        L8a:
            java.lang.String r15 = "page"
            gg.l.g(r15)
            throw r3
        L90:
            return
    }
}
