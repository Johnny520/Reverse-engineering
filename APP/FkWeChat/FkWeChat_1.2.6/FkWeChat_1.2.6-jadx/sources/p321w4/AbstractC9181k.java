package p321w4;

/* JADX INFO: renamed from: w4.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9181k {

    /* JADX INFO: renamed from: a */
    public final int f31316a;

    /* JADX INFO: renamed from: b */
    public AbstractC9181k f31317b;

    public AbstractC9181k(int i10, AbstractC9181k abstractC9181k) {
        if (i10 != 393216 && i10 != 327680 && i10 != 262144) {
            throw new IllegalArgumentException();
        }
        this.f31316a = i10;
        this.f31317b = abstractC9181k;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo35669a(int i10, String str, String str2, String str3);

    /* JADX INFO: renamed from: b */
    public abstract void mo35670b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract void mo35671c(int i10, int i11);

    /* JADX INFO: renamed from: d */
    public abstract void mo35672d(int i10, C9180j c9180j);

    /* JADX INFO: renamed from: e */
    public abstract void mo35673e(C9180j c9180j);

    /* JADX INFO: renamed from: f */
    public abstract void mo35674f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo35675g(int i10, int i11);

    /* JADX INFO: renamed from: h */
    public abstract void mo35676h(int i10, String str, String str2, String str3, boolean z10);

    /* JADX INFO: renamed from: i */
    public abstract void mo35677i(int i10, int i11, C9180j c9180j, C9180j... c9180jArr);

    /* JADX INFO: renamed from: j */
    public abstract void mo35678j(int i10, String str);

    /* JADX INFO: renamed from: k */
    public abstract void mo35679k(int i10, int i11);

    public AbstractC9181k(int i10) {
        this(i10, null);
    }
}
