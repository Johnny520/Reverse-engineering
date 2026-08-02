package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zk2 extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final String f13937h;

    /* JADX INFO: renamed from: i */
    public final String f13938i;

    /* JADX INFO: renamed from: j */
    public final boolean f13939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk2(int i, String str, String str2) {
        super(str2, null);
        boolean z = (i & 4) == 0;
        this.f13937h = str;
        this.f13938i = str2;
        this.f13939j = z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f13938i;
    }
}
