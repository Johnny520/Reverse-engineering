package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5694 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f14022;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f14023;

    EnumC5694(int i, String str) {
        this.f14022 = i;
        this.f14023 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14023;
    }

    /* JADX INFO: renamed from: ۥ */
    public int m2373() {
        return this.f14022;
    }
}
