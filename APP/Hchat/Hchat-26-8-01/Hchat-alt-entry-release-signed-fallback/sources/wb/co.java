package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co extends gg.j implements fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15525q;

    public co(android.content.Context r7, i0.a1 r8, i0.a1 r9, i0.a1 r10) {
            r6 = this;
            r6.f15522n = r8
            r6.f15523o = r9
            r6.f15524p = r7
            r6.f15525q = r10
            java.lang.Class<gg.k> r7 = gg.k.class
            java.lang.Class r2 = eh.a.i(r7)
            java.lang.String r4 = "SelectedMessagesMiuixPage$openContactPicker(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V"
            r5 = 0
            r1 = 0
            java.lang.String r3 = "openContactPicker"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            i0.a1 r0 = r3.f15522n
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            i0.a1 r1 = r3.f15523o
            java.lang.Object r1 = r1.getValue()
            db.c r1 = (db.c) r1
            java.util.ArrayList r1 = wb.ho.T6(r1)
            java.lang.String r0 = a.a.a1(r0, r1)
            if (r0 == 0) goto L29
            r1 = 0
            android.content.Context r2 = r3.f15524p
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L30
        L29:
            wb.cu r0 = wb.cu.f15570a
            i0.a1 r1 = r3.f15525q
            r1.setValue(r0)
        L30:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
