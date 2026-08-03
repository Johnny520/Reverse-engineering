package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n2.l {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r2, java.util.concurrent.Executor r3, java.util.function.IntConsumer r4) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L7
            r0.performHandwritingGesture(r2, r3, r4)
        L7:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r2, android.os.CancellationSignal r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.previewHandwritingGesture(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }
}
