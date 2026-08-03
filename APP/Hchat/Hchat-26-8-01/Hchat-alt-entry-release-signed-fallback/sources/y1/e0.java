package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1.e0 f21879a = null;

    static {
            y1.e0 r0 = new y1.e0
            r0.<init>()
            y1.e0.f21879a = r0
            return
    }

    public final void a(android.view.View r3, s1.q r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            boolean r1 = r4 instanceof s1.a
            if (r1 == 0) goto L11
            s1.a r4 = (s1.a) r4
            int r4 = r4.f12202b
            android.view.PointerIcon r4 = android.view.PointerIcon.getSystemIcon(r0, r4)
            goto L17
        L11:
            r4 = 1000(0x3e8, float:1.401E-42)
            android.view.PointerIcon r4 = android.view.PointerIcon.getSystemIcon(r0, r4)
        L17:
            android.view.PointerIcon r0 = r3.getPointerIcon()
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L24
            r3.setPointerIcon(r4)
        L24:
            return
    }
}
