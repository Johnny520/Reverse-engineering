package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC3213 f7370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Lifecycle$State f7371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5066(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        Lifecycle$State targetState = lifecycle$Event.getTargetState();
        Lifecycle$State lifecycle$State = this.f7371;
        lifecycle$State.getClass();
        if (targetState != null && targetState.compareTo(lifecycle$State) < 0) {
            lifecycle$State = targetState;
        }
        this.f7371 = lifecycle$State;
        this.f7370.mo578(interfaceC3221, lifecycle$Event);
        this.f7371 = targetState;
    }
}
