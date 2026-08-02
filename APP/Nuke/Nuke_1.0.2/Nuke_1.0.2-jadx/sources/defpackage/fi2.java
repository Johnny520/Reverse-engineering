package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fi2 extends RuntimeException {
    public final String h;
    public final String i;
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi2(String str, String str2, int i, boolean z) {
        super(str2, null);
        z = (i & 4) != 0 ? false : z;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.i;
    }
}
