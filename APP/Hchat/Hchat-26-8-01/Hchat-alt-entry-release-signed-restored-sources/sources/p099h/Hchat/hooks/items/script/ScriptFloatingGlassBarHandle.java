package p099h.Hchat.hooks.items.script;

import p085fg.InterfaceC1220a;
import p332wb.InterfaceC5196p3;
import p332wb.ViewOnAttachStateChangeListenerC4826dr;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptFloatingGlassBarHandle {
    public static final int $stable = 8;
    private final InterfaceC5196p3 delegate;
    private final InterfaceC1220a restoreAction;
    private volatile boolean restored;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScriptFloatingGlassBarHandle(InterfaceC5196p3 interfaceC5196p3, InterfaceC1220a interfaceC1220a) {
        interfaceC5196p3.getClass();
        interfaceC1220a.getClass();
        this.delegate = interfaceC5196p3;
        this.restoreAction = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isApplied() {
        return !this.restored && ((ViewOnAttachStateChangeListenerC4826dr) this.delegate).f16709u.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void markRestored$app() {
        this.restored = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void restore() {
        if (this.restored) {
            return;
        }
        this.restoreAction.invoke();
    }
}
