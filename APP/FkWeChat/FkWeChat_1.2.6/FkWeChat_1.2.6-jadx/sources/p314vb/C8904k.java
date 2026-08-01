package p314vb;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C9987e;

/* JADX INFO: renamed from: vb.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8904k implements Comparable, Serializable {

    /* JADX INFO: renamed from: s */
    public static final a f29505s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C8904k f29506t = new C8904k(-31557014167219200L, 0);

    /* JADX INFO: renamed from: u */
    public static final C8904k f29507u = new C8904k(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: q */
    public final long f29508q;

    /* JADX INFO: renamed from: r */
    public final int f29509r;

    public C8904k(long j10, int i10) {
        this.f29508q = j10;
        this.f29509r = i10;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            C9987e.m38645a("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return AbstractC8906m.m34184a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8904k)) {
            return false;
        }
        C8904k c8904k = (C8904k) obj;
        return this.f29508q == c8904k.f29508q && this.f29509r == c8904k.f29509r;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C8904k c8904k) {
        c8904k.getClass();
        int iM3844e = AbstractC1061t.m3844e(this.f29508q, c8904k.f29508q);
        return iM3844e != 0 ? iM3844e : AbstractC1061t.m3843d(this.f29509r, c8904k.f29509r);
    }

    /* JADX INFO: renamed from: h */
    public final long m34175h() {
        return this.f29508q;
    }

    public int hashCode() {
        return Long.hashCode(this.f29508q) + (this.f29509r * 51);
    }

    /* JADX INFO: renamed from: i */
    public final int m34176i() {
        return this.f29509r;
    }

    /* JADX INFO: renamed from: j */
    public final long m34177j() {
        long j10 = this.f29508q;
        long j11 = 1000;
        if (j10 >= 0) {
            if (j10 != 1) {
                if (j10 != 0) {
                    long j12 = j10 * 1000;
                    if (j12 / 1000 != j10) {
                        return Long.MAX_VALUE;
                    }
                    j11 = j12;
                } else {
                    j11 = 0;
                }
            }
            long j13 = this.f29509r / 1000000;
            long j14 = j11 + j13;
            if ((j11 ^ j14) >= 0 || (j13 ^ j11) < 0) {
                return j14;
            }
            return Long.MAX_VALUE;
        }
        long j15 = j10 + 1;
        if (j15 != 1) {
            if (j15 != 0) {
                long j16 = j15 * 1000;
                if (j16 / 1000 != j15) {
                    return Long.MIN_VALUE;
                }
                j11 = j16;
            } else {
                j11 = 0;
            }
        }
        long j17 = (this.f29509r / 1000000) - 1000;
        long j18 = j11 + j17;
        if ((j11 ^ j18) >= 0 || (j17 ^ j11) < 0) {
            return j18;
        }
        return Long.MIN_VALUE;
    }

    public String toString() {
        return AbstractC8913t.m34195j(this);
    }

    /* JADX INFO: renamed from: vb.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8904k m34178a(long j10) {
            long j11 = j10 / 1000;
            if ((j10 ^ 1000) < 0 && j11 * 1000 != j10) {
                j11--;
            }
            long j12 = j10 % 1000;
            return j11 < -31557014167219200L ? m34182e() : j11 > 31556889864403199L ? m34181d() : m34179b(j11, (int) ((j12 + (1000 & (((j12 ^ 1000) & ((-j12) | j12)) >> 63))) * ((long) 1000000)));
        }

        /* JADX INFO: renamed from: b */
        public final C8904k m34179b(long j10, int i10) {
            return m34180c(j10, i10);
        }

        /* JADX INFO: renamed from: c */
        public final C8904k m34180c(long j10, long j11) {
            long j12 = j11 / 1000000000;
            if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                j12--;
            }
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                return j10 > 0 ? C8904k.f29505s.m34181d() : C8904k.f29505s.m34182e();
            }
            if (j13 < -31557014167219200L) {
                return m34182e();
            }
            if (j13 > 31556889864403199L) {
                return m34181d();
            }
            long j14 = j11 % 1000000000;
            return new C8904k(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
        }

        /* JADX INFO: renamed from: d */
        public final C8904k m34181d() {
            return C8904k.f29507u;
        }

        /* JADX INFO: renamed from: e */
        public final C8904k m34182e() {
            return C8904k.f29506t;
        }

        /* JADX INFO: renamed from: f */
        public final C8904k m34183f(CharSequence charSequence) {
            charSequence.getClass();
            return AbstractC8913t.m34199n(charSequence).toInstant();
        }

        public a() {
        }
    }
}
