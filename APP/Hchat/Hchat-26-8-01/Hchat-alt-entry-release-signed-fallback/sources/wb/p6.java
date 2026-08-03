package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.q f18403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f18404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg.u f18405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gg.u f18406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gg.q f18407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wb.o6 f18408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f18409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f18410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c9.a1 f18411o;

    public p6(android.app.Activity r1, gg.q r2, i0.j1 r3, gg.u r4, gg.u r5, gg.q r6, wb.o6 r7, java.util.ArrayList r8, android.view.ViewGroup r9, c9.a1 r10) {
            r0 = this;
            r0.f18403g = r2
            r0.f18404h = r3
            r0.f18405i = r4
            r0.f18406j = r5
            r0.f18407k = r6
            r0.f18408l = r7
            r0.f18409m = r8
            r0.f18410n = r9
            r0.f18411o = r10
            r0.<init>(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r11) {
            r10 = this;
            r11.getClass()
            int r0 = r11.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L27
            int r11 = r11.getAction()
            r0 = 1
            if (r11 != r0) goto L26
            android.view.ViewGroup r8 = r10.f18410n
            c9.a1 r9 = r10.f18411o
            gg.q r1 = r10.f18403g
            i0.j1 r2 = r10.f18404h
            gg.u r3 = r10.f18405i
            gg.u r4 = r10.f18406j
            gg.q r5 = r10.f18407k
            wb.o6 r6 = r10.f18408l
            java.util.ArrayList r7 = r10.f18409m
            a7.a.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L26:
            return r0
        L27:
            boolean r11 = super.dispatchKeyEvent(r11)
            return r11
    }
}
