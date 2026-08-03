package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends y0.n implements d1.u {
    @Override // d1.u
    public final void r0(d1.r r3) {
            r2 = this;
            android.view.View r0 = x2.i.c(r2)
            y0.n r1 = r2.f21819g
            boolean r1 = r1.f21832t
            if (r1 == 0) goto L16
            android.view.View r1 = x2.i.c(r2)
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r3.c(r1)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L27
            e1.c r0 = d1.h.a(r1, r0)
            r3.d(r0)
        L27:
            return
    }
}
