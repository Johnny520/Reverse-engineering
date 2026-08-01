package p000;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0015ae(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
