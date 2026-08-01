package sd;

/* JADX INFO: renamed from: sd.xa */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7745xa {

    /* JADX INFO: renamed from: a */
    public final int f25879a;

    /* JADX INFO: renamed from: b */
    public final int f25880b;

    /* JADX INFO: renamed from: c */
    public final int f25881c;

    /* JADX INFO: renamed from: d */
    public final int f25882d;

    public C7745xa(int i10, int i11, int i12, int i13) {
        this.f25879a = i10;
        this.f25880b = i11;
        this.f25881c = i12;
        this.f25882d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m30166a() {
        return this.f25882d;
    }

    /* JADX INFO: renamed from: b */
    public final int m30167b() {
        return this.f25881c;
    }

    /* JADX INFO: renamed from: c */
    public final int m30168c() {
        return this.f25880b;
    }

    /* JADX INFO: renamed from: d */
    public final int m30169d() {
        return this.f25879a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7745xa)) {
            return false;
        }
        C7745xa c7745xa = (C7745xa) obj;
        return this.f25879a == c7745xa.f25879a && this.f25880b == c7745xa.f25880b && this.f25881c == c7745xa.f25881c && this.f25882d == c7745xa.f25882d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f25879a) * 31) + Integer.hashCode(this.f25880b)) * 31) + Integer.hashCode(this.f25881c)) * 31) + Integer.hashCode(this.f25882d);
    }

    public String toString() {
        return "LengthStats(tiny=" + this.f25879a + ", short=" + this.f25880b + ", medium=" + this.f25881c + ", long=" + this.f25882d + ")";
    }
}
