package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2380 f7024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Lifecycle$State f7025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4496(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        Lifecycle$State targetState = lifecycle$Event.getTargetState();
        Lifecycle$State lifecycle$State = this.f7025;
        lifecycle$State.getClass();
        if (targetState != null && targetState.compareTo(lifecycle$State) < 0) {
            lifecycle$State = targetState;
        }
        this.f7025 = lifecycle$State;
        this.f7024.mo18(interfaceC2388, lifecycle$Event);
        this.f7025 = targetState;
    }
}
