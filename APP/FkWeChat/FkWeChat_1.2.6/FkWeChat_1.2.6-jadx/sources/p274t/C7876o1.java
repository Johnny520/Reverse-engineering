package p274t;

/* JADX INFO: renamed from: t.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7876o1 {

    /* JADX INFO: renamed from: a */
    public final int f26235a;

    /* JADX INFO: renamed from: b */
    public final int f26236b;

    /* JADX INFO: renamed from: c */
    public final int f26237c;

    /* JADX INFO: renamed from: d */
    public final int f26238d;

    public C7876o1(int i10, int i11, int i12, int i13) {
        this.f26235a = i10;
        this.f26236b = i11;
        this.f26237c = i12;
        this.f26238d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m30457a() {
        return this.f26238d;
    }

    /* JADX INFO: renamed from: b */
    public final int m30458b() {
        return this.f26235a;
    }

    /* JADX INFO: renamed from: c */
    public final int m30459c() {
        return this.f26237c;
    }

    /* JADX INFO: renamed from: d */
    public final int m30460d() {
        return this.f26236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7876o1)) {
            return false;
        }
        C7876o1 c7876o1 = (C7876o1) obj;
        return this.f26235a == c7876o1.f26235a && this.f26236b == c7876o1.f26236b && this.f26237c == c7876o1.f26237c && this.f26238d == c7876o1.f26238d;
    }

    public int hashCode() {
        return (((((this.f26235a * 31) + this.f26236b) * 31) + this.f26237c) * 31) + this.f26238d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f26235a + ", top=" + this.f26236b + ", right=" + this.f26237c + ", bottom=" + this.f26238d + ')';
    }
}
