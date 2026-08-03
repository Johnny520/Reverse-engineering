package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ao implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.l f15058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wb.c0 f15059c;

    public /* synthetic */ ao(fg.l r1, wb.c0 r2, int r3) {
            r0 = this;
            r0.f15057a = r3
            r0.f15058b = r1
            r0.f15059c = r2
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r6, wf.c r7) {
            r5 = this;
            int r0 = r5.f15057a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            wb.zn r0 = new wb.zn
            r1 = 0
            r2 = 1
            fg.l r3 = r5.f15058b
            wb.c0 r4 = r5.f15059c
            r0.<init>(r3, r4, r1, r2)
            java.lang.Object r6 = a.a.n(r6, r0, r7)
            return r6
        L15:
            wb.zn r0 = new wb.zn
            r1 = 0
            r2 = 0
            fg.l r3 = r5.f15058b
            wb.c0 r4 = r5.f15059c
            r0.<init>(r3, r4, r1, r2)
            java.lang.Object r6 = a.a.n(r6, r0, r7)
            return r6
    }
}
