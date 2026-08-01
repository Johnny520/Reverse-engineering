package p344xb;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p024b9.AbstractC1043k;
import p172l8.C4688c0;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: xb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9479b implements Comparable, Serializable {

    /* JADX INFO: renamed from: s */
    public static final a f32211s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C9479b f32212t = new C9479b(0, 0);

    /* JADX INFO: renamed from: q */
    public final long f32213q;

    /* JADX INFO: renamed from: r */
    public final long f32214r;

    public C9479b(long j10, long j11) {
        this.f32213q = j10;
        this.f32214r = j11;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return AbstractC9480c.m36935d(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C9479b c9479b) {
        c9479b.getClass();
        long j10 = this.f32213q;
        return j10 != c9479b.f32213q ? Long.compareUnsigned(C4688c0.m18729c(j10), C4688c0.m18729c(c9479b.f32213q)) : Long.compareUnsigned(C4688c0.m18729c(this.f32214r), C4688c0.m18729c(c9479b.f32214r));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9479b)) {
            return false;
        }
        C9479b c9479b = (C9479b) obj;
        return this.f32213q == c9479b.f32213q && this.f32214r == c9479b.f32214r;
    }

    /* JADX INFO: renamed from: g */
    public final long m36922g() {
        return this.f32214r;
    }

    /* JADX INFO: renamed from: h */
    public final long m36923h() {
        return this.f32213q;
    }

    public int hashCode() {
        return Long.hashCode(this.f32213q ^ this.f32214r);
    }

    /* JADX INFO: renamed from: i */
    public final String m36924i() {
        byte[] bArr = new byte[36];
        AbstractC9480c.m36932a(this.f32213q, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC9480c.m36932a(this.f32213q, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC9480c.m36932a(this.f32213q, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC9480c.m36932a(this.f32214r, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC9480c.m36932a(this.f32214r, bArr, 24, 2, 8);
        return AbstractC8611a0.m33078y(bArr);
    }

    /* JADX INFO: renamed from: j */
    public final String m36925j() {
        byte[] bArr = new byte[32];
        AbstractC9480c.m36932a(this.f32213q, bArr, 0, 0, 8);
        AbstractC9480c.m36932a(this.f32214r, bArr, 16, 0, 8);
        return AbstractC8611a0.m33078y(bArr);
    }

    public String toString() {
        return m36924i();
    }

    /* JADX INFO: renamed from: xb.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9479b m36926a(byte[] bArr) {
            bArr.getClass();
            if (bArr.length == 16) {
                return m36927b(AbstractC9480c.m36933b(bArr, 0), AbstractC9480c.m36933b(bArr, 8));
            }
            throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + AbstractC9481d.m36944m(bArr, 32) + " of size " + bArr.length).toString());
        }

        /* JADX INFO: renamed from: b */
        public final C9479b m36927b(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? m36929d() : new C9479b(j10, j11, null);
        }

        /* JADX INFO: renamed from: c */
        public final C9479b m36928c() {
            return AbstractC9481d.m36942k();
        }

        /* JADX INFO: renamed from: d */
        public final C9479b m36929d() {
            return C9479b.f32212t;
        }

        /* JADX INFO: renamed from: e */
        public final C9479b m36930e(String str) {
            str.getClass();
            int length = str.length();
            if (length == 32) {
                return AbstractC9480c.m36936e(str);
            }
            if (length == 36) {
                return AbstractC9480c.m36937f(str);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + AbstractC9481d.m36943l(str, 64) + "\" of length " + str.length());
        }

        /* JADX INFO: renamed from: f */
        public final C9479b m36931f() {
            return m36928c();
        }

        public a() {
        }
    }

    public /* synthetic */ C9479b(long j10, long j11, AbstractC1043k abstractC1043k) {
        this(j10, j11);
    }
}
