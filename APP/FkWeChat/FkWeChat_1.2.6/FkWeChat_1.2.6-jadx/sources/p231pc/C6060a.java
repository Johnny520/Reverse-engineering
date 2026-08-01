package p231pc;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4718y;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: pc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6060a implements Comparable {

    /* JADX INFO: renamed from: s */
    public static final a f19019s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C6060a f19020t = new C6060a(new byte[0], null);

    /* JADX INFO: renamed from: u */
    public static final char[] f19021u;

    /* JADX INFO: renamed from: q */
    public final byte[] f19022q;

    /* JADX INFO: renamed from: r */
    public int f19023r;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        charArray.getClass();
        f19021u = charArray;
    }

    public /* synthetic */ C6060a(byte[] bArr, int i10, int i11, int i12, AbstractC1043k abstractC1043k) {
        this(bArr, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? bArr.length : i11);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C6060a m24125k(C6060a c6060a, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c6060a.m24129i();
        }
        return c6060a.m24130j(i10, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6060a c6060a) {
        c6060a.getClass();
        if (c6060a == this) {
            return 0;
        }
        byte[] bArr = this.f19022q;
        byte[] bArr2 = c6060a.f19022q;
        int iMin = Math.min(m24129i(), c6060a.m24129i());
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM3843d = AbstractC1061t.m3843d(C4718y.m18817c(bArr[i10]) & 255, C4718y.m18817c(bArr2[i10]) & 255);
            if (iM3843d != 0) {
                return iM3843d;
            }
        }
        return AbstractC1061t.m3843d(m24129i(), c6060a.m24129i());
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || C6060a.class != obj.getClass()) {
            return false;
        }
        C6060a c6060a = (C6060a) obj;
        byte[] bArr = c6060a.f19022q;
        int length = bArr.length;
        byte[] bArr2 = this.f19022q;
        if (length != bArr2.length) {
            return false;
        }
        int i11 = c6060a.f19023r;
        if (i11 == 0 || (i10 = this.f19023r) == 0 || i11 == i10) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final byte m24127g(int i10) {
        if (i10 >= 0 && i10 < m24129i()) {
            return this.f19022q[i10];
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of byte string bounds: [0.." + m24129i() + ')');
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m24128h() {
        return this.f19022q;
    }

    public int hashCode() {
        int i10 = this.f19023r;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f19022q);
        this.f19023r = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final int m24129i() {
        return this.f19022q.length;
    }

    /* JADX INFO: renamed from: j */
    public final C6060a m24130j(int i10, int i11) {
        return i10 == i11 ? f19020t : new C6060a(this.f19022q, i10, i11);
    }

    public String toString() {
        if (AbstractC6062c.m24136c(this)) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(m24129i());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22 + (m24129i() * 2));
        sb2.append("ByteString(size=");
        sb2.append(strValueOf);
        sb2.append(" hex=");
        byte[] bArr = this.f19022q;
        int iM24129i = m24129i();
        for (int i10 = 0; i10 < iM24129i; i10++) {
            byte b10 = bArr[i10];
            char[] cArr = f19021u;
            sb2.append(cArr[(b10 >>> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: pc.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6060a m24131a() {
            return C6060a.f19020t;
        }

        /* JADX INFO: renamed from: b */
        public final C6060a m24132b(byte[] bArr) {
            bArr.getClass();
            AbstractC1043k abstractC1043k = null;
            return new C6060a(bArr, abstractC1043k, abstractC1043k);
        }

        public a() {
        }
    }

    public C6060a(byte[] bArr, Object obj) {
        this.f19022q = bArr;
    }

    public /* synthetic */ C6060a(byte[] bArr, Object obj, AbstractC1043k abstractC1043k) {
        this(bArr, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6060a(byte[] bArr, int i10, int i11) {
        this(AbstractC5102r.m20666r(bArr, i10, i11), null);
        bArr.getClass();
    }
}
