package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2397 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Lifecycle$Event m4500(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC2398.f7037[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_CREATE;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle$Event.ON_RESUME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Lifecycle$Event m4501(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC2398.f7037[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_START;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return Lifecycle$Event.ON_CREATE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Lifecycle$Event m4502(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC2398.f7037[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_DESTROY;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle$Event.ON_PAUSE;
    }
}
