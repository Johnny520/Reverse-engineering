package p000;

import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247gi extends AbstractC0671r {

    /* JADX INFO: renamed from: l */
    public final gp0 f1996l;

    /* JADX INFO: renamed from: m */
    public boolean f1997m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0247gi(MainActivity mainActivity) {
        super(mainActivity);
        this.f1996l = r60.m3419u(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0671r
    /* JADX INFO: renamed from: b */
    public final void mo1246b(InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(420213850);
        int i2 = (c0616pi.m3108h(this) ? 4 : 2) | i;
        if (c0616pi.m3082O(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) this.f1996l.getValue();
            if (interfaceC0904ww == null) {
                c0616pi.m3090W(-1238823553);
            } else {
                c0616pi.m3090W(98585282);
                interfaceC0904ww.invoke(c0616pi, 0);
            }
            c0616pi.m3119p(false);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0634q(this, i, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0247gi.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0671r
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1997m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContent(InterfaceC0904ww interfaceC0904ww) {
        this.f1997m = true;
        this.f1996l.setValue(interfaceC0904ww);
        if (isAttachedToWindow()) {
            if (this.f5255g != null || isAttachedToWindow()) {
                m3368d();
            } else {
                C0921xc.m5134o("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
