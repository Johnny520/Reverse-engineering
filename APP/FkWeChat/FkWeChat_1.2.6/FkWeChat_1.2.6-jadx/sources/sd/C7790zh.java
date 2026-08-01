package sd;

/* JADX INFO: renamed from: sd.zh */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7790zh {

    /* JADX INFO: renamed from: a */
    public final int f25984a;

    /* JADX INFO: renamed from: b */
    public final int f25985b;

    /* JADX INFO: renamed from: c */
    public final int f25986c;

    /* JADX INFO: renamed from: d */
    public final int f25987d;

    /* JADX INFO: renamed from: e */
    public final int f25988e;

    public C7790zh(int i10, int i11, int i12, int i13, int i14) {
        this.f25984a = i10;
        this.f25985b = i11;
        this.f25986c = i12;
        this.f25987d = i13;
        this.f25988e = i14;
    }

    /* JADX INFO: renamed from: a */
    public final int m30211a() {
        return this.f25986c;
    }

    /* JADX INFO: renamed from: b */
    public final int m30212b() {
        return this.f25984a;
    }

    /* JADX INFO: renamed from: c */
    public final int m30213c() {
        return this.f25985b;
    }

    /* JADX INFO: renamed from: d */
    public final int m30214d() {
        return this.f25988e;
    }

    /* JADX INFO: renamed from: e */
    public final int m30215e() {
        return this.f25987d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7790zh)) {
            return false;
        }
        C7790zh c7790zh = (C7790zh) obj;
        return this.f25984a == c7790zh.f25984a && this.f25985b == c7790zh.f25985b && this.f25986c == c7790zh.f25986c && this.f25987d == c7790zh.f25987d && this.f25988e == c7790zh.f25988e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f25984a) * 31) + Integer.hashCode(this.f25985b)) * 31) + Integer.hashCode(this.f25986c)) * 31) + Integer.hashCode(this.f25987d)) * 31) + Integer.hashCode(this.f25988e);
    }

    public String toString() {
        return "VibeStats(laugh=" + this.f25984a + ", question=" + this.f25985b + ", exclamation=" + this.f25986c + ", tilde=" + this.f25987d + ", speechless=" + this.f25988e + ")";
    }
}
