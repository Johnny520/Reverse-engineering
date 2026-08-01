package p321w4;

/* JADX INFO: renamed from: w4.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9176f {

    /* JADX INFO: renamed from: a */
    public final int f31281a;

    /* JADX INFO: renamed from: b */
    public AbstractC9176f f31282b;

    public AbstractC9176f(int i10, AbstractC9176f abstractC9176f) {
        if (i10 != 393216 && i10 != 327680 && i10 != 262144) {
            throw new IllegalArgumentException();
        }
        this.f31281a = i10;
        this.f31282b = abstractC9176f;
    }

    public AbstractC9176f(int i10) {
        this(i10, null);
    }
}
