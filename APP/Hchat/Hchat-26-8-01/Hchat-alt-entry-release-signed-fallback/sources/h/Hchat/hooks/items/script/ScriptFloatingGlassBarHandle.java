package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptFloatingGlassBarHandle {
    public static final int $stable = 8;
    private final wb.p3 delegate;
    private final fg.a restoreAction;
    private volatile boolean restored;

    public ScriptFloatingGlassBarHandle(wb.p3 r1, fg.a r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.delegate = r1
            r0.restoreAction = r2
            return
    }

    public final boolean isApplied() {
            r1 = this;
            boolean r0 = r1.restored
            if (r0 != 0) goto L12
            wb.p3 r0 = r1.delegate
            wb.dr r0 = (wb.dr) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f15787u
            boolean r0 = r0.get()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final void markRestored$app() {
            r1 = this;
            r0 = 1
            r1.restored = r0
            return
    }

    public final void restore() {
            r1 = this;
            boolean r0 = r1.restored
            if (r0 == 0) goto L5
            return
        L5:
            fg.a r0 = r1.restoreAction
            r0.invoke()
            return
    }
}
