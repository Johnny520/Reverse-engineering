package p321w4;

/* JADX INFO: renamed from: w4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9173c {

    /* JADX INFO: renamed from: a */
    public final int f31257a;

    /* JADX INFO: renamed from: b */
    public AbstractC9173c f31258b;

    public AbstractC9173c(int i10, AbstractC9173c abstractC9173c) {
        if (i10 != 393216 && i10 != 327680 && i10 != 262144) {
            throw new IllegalArgumentException();
        }
        this.f31257a = i10;
        this.f31258b = abstractC9173c;
    }

    public AbstractC9173c(int i10) {
        this(i10, null);
    }
}
