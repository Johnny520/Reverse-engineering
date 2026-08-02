package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fi2 extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final String f3008h;

    /* JADX INFO: renamed from: i */
    public final String f3009i;

    /* JADX INFO: renamed from: j */
    public final boolean f3010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi2(String str, String str2, int i, boolean z) {
        super(str2, null);
        z = (i & 4) != 0 ? false : z;
        this.f3008h = str;
        this.f3009i = str2;
        this.f3010j = z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3009i;
    }
}
