package gf;

/* JADX INFO: renamed from: gf.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2795d {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: q */
    public final int f7295q;

    /* JADX INFO: renamed from: r */
    public final String f7296r;

    EnumC2795d(int i10, String str) {
        this.f7295q = i10;
        this.f7296r = str;
    }

    /* JADX INFO: renamed from: c */
    public int m9961c() {
        return this.f7295q;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7296r;
    }
}
