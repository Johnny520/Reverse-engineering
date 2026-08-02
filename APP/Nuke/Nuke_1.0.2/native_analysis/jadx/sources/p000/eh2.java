package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eh2 extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final String f2446h;

    /* JADX INFO: renamed from: i */
    public final String f2447i;

    /* JADX INFO: renamed from: j */
    public final boolean f2448j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(int i, String str, String str2, Throwable th) {
        super(str2, (i & 8) != 0 ? null : th);
        boolean z = (i & 4) == 0;
        this.f2446h = str;
        this.f2447i = str2;
        this.f2448j = z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2447i;
    }
}
