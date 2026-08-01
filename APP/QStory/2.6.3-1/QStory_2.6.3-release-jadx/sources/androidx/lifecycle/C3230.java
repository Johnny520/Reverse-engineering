package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3230 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Lifecycle$Event m5070(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC3231.f7383[lifecycle$State.ordinal()];
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
    public static Lifecycle$Event m5071(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC3231.f7383[lifecycle$State.ordinal()];
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
    public static Lifecycle$Event m5072(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = AbstractC3231.f7383[lifecycle$State.ordinal()];
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
