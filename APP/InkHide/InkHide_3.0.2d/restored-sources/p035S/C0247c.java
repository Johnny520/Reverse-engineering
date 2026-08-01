package p035S;

/* JADX INFO: renamed from: S.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0247c extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0247c(int i2, int i3) {
        super("Unpaired surrogate at index " + i2 + " of " + i3);
    }
}
