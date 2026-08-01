package p172l8;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l8.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4701j implements Comparable {

    /* JADX INFO: renamed from: u */
    public static final a f13911u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C4701j f13912v = C4703k.m18782a();

    /* JADX INFO: renamed from: q */
    public final int f13913q;

    /* JADX INFO: renamed from: r */
    public final int f13914r;

    /* JADX INFO: renamed from: s */
    public final int f13915s;

    /* JADX INFO: renamed from: t */
    public final int f13916t;

    public C4701j(int i10, int i11, int i12) {
        this.f13913q = i10;
        this.f13914r = i11;
        this.f13915s = i12;
        this.f13916t = m18781c(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4701j c4701j) {
        c4701j.getClass();
        return this.f13916t - c4701j.f13916t;
    }

    /* JADX INFO: renamed from: c */
    public final int m18781c(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4701j c4701j = obj instanceof C4701j ? (C4701j) obj : null;
        return c4701j != null && this.f13916t == c4701j.f13916t;
    }

    public int hashCode() {
        return this.f13916t;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13913q);
        sb2.append('.');
        sb2.append(this.f13914r);
        sb2.append('.');
        sb2.append(this.f13915s);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l8.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C4701j(int i10, int i11) {
        this(i10, i11, 0);
    }
}
