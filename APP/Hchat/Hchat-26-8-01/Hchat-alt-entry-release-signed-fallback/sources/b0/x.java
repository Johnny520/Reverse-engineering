package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.e f416a;

    public x(b0.e r1) {
            r0 = this;
            r0.<init>()
            r0.f416a = r1
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode r1, android.view.MenuItem r2) {
            r0 = this;
            b0.e r1 = r0.f416a
            r1.getClass()
            r1 = 0
            return r1
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode r1, android.view.Menu r2) {
            r0 = this;
            b0.e r1 = r0.f416a
            r1.a(r2)
            int r1 = r2.size()
            if (r1 <= 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode r1) {
            r0 = this;
            b0.e r1 = r0.f416a
            b0.f r1 = r1.f356a
            r1.close()
            return
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode r3, android.view.View r4, android.graphics.Rect r5) {
            r2 = this;
            b0.e r3 = r2.f416a
            b0.b r3 = r3.f358c
            java.lang.Object r3 = r3.invoke()
            e1.c r3 = (e1.c) r3
            float r4 = r3.f2296a
            int r4 = java.lang.Math.round(r4)
            float r0 = r3.f2297b
            int r0 = java.lang.Math.round(r0)
            float r1 = r3.f2298c
            int r1 = java.lang.Math.round(r1)
            float r3 = r3.f2299d
            int r3 = java.lang.Math.round(r3)
            r5.set(r4, r0, r1, r3)
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode r1, android.view.Menu r2) {
            r0 = this;
            b0.e r1 = r0.f416a
            boolean r1 = r1.a(r2)
            return r1
    }
}
