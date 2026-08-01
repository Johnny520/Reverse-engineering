package p191n1;

import p024b9.AbstractC1061t;
import p222p2.C5945e;

/* JADX INFO: renamed from: n1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5483l {

    /* JADX INFO: renamed from: a */
    public final int f16863a;

    /* JADX INFO: renamed from: b */
    public final long f16864b;

    /* JADX INFO: renamed from: c */
    public final EnumC5484m f16865c;

    /* JADX INFO: renamed from: d */
    public final C5945e f16866d;

    public C5483l(int i10, long j10, EnumC5484m enumC5484m, C5945e c5945e) {
        this.f16863a = i10;
        this.f16864b = j10;
        this.f16865c = enumC5484m;
        this.f16866d = c5945e;
    }

    /* JADX INFO: renamed from: a */
    public final int m22294a() {
        return this.f16863a;
    }

    /* JADX INFO: renamed from: b */
    public final C5945e m22295b() {
        return this.f16866d;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC5484m m22296c() {
        return this.f16865c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5483l)) {
            return false;
        }
        C5483l c5483l = (C5483l) obj;
        return this.f16863a == c5483l.f16863a && this.f16864b == c5483l.f16864b && this.f16865c == c5483l.f16865c && AbstractC1061t.m3842c(this.f16866d, c5483l.f16866d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f16863a) * 31) + Long.hashCode(this.f16864b)) * 31) + this.f16865c.hashCode()) * 31;
        C5945e c5945e = this.f16866d;
        return iHashCode + (c5945e == null ? 0 : c5945e.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f16863a + ", timestamp=" + this.f16864b + ", type=" + this.f16865c + ", structureCompat=" + this.f16866d + ')';
    }
}
