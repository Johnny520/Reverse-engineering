package sd;

/* JADX INFO: renamed from: sd.re */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7635re {

    /* JADX INFO: renamed from: a */
    public final int f25265a;

    /* JADX INFO: renamed from: b */
    public final int f25266b;

    /* JADX INFO: renamed from: c */
    public final int f25267c;

    /* JADX INFO: renamed from: d */
    public final int f25268d;

    public C7635re(int i10, int i11, int i12, int i13) {
        this.f25265a = i10;
        this.f25266b = i11;
        this.f25267c = i12;
        this.f25268d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m29513a() {
        return this.f25265a;
    }

    /* JADX INFO: renamed from: b */
    public final int m29514b() {
        return this.f25267c;
    }

    /* JADX INFO: renamed from: c */
    public final int m29515c() {
        return this.f25268d;
    }

    /* JADX INFO: renamed from: d */
    public final int m29516d() {
        return this.f25266b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7635re)) {
            return false;
        }
        C7635re c7635re = (C7635re) obj;
        return this.f25265a == c7635re.f25265a && this.f25266b == c7635re.f25266b && this.f25267c == c7635re.f25267c && this.f25268d == c7635re.f25268d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f25265a) * 31) + Integer.hashCode(this.f25266b)) * 31) + Integer.hashCode(this.f25267c)) * 31) + Integer.hashCode(this.f25268d);
    }

    public String toString() {
        return "RoutineStats(earlyBird=" + this.f25265a + ", slacker=" + this.f25266b + ", nightLife=" + this.f25267c + ", nightOwl=" + this.f25268d + ")";
    }
}
