package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class nt implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f17981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.a f17982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg.a f17983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17984d;

    public nt(float r1, fg.a r2, fg.a r3, i0.a1 r4) {
            r0 = this;
            r0.<init>()
            r0.f17981a = r1
            r0.f17982b = r2
            r0.f17983c = r3
            r0.f17984d = r4
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r7, wf.c r8) {
            r6 = this;
            wb.mt r0 = new wb.mt
            i0.a1 r4 = r6.f17984d
            r5 = 0
            float r1 = r6.f17981a
            fg.a r2 = r6.f17982b
            fg.a r3 = r6.f17983c
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = a.a.n(r7, r0, r8)
            return r7
    }
}
