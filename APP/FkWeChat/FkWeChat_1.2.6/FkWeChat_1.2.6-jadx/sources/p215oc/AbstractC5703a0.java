package p215oc;

import java.io.EOFException;

/* JADX INFO: renamed from: oc.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5703a0 {
    /* JADX INFO: renamed from: a */
    public static final long m23080a(InterfaceC5728w interfaceC5728w, byte b10, long j10, long j11) {
        String str;
        interfaceC5728w.getClass();
        if (0 <= j10 && j10 <= j11) {
            if (j10 == j11) {
                return -1L;
            }
            long jM23111j = j10;
            while (jM23111j < j11 && interfaceC5728w.mo23110i(1 + jM23111j)) {
                byte b11 = b10;
                long jM23128a = AbstractC5711f.m23128a(interfaceC5728w.mo23102b(), b11, jM23111j, Math.min(j11, interfaceC5728w.mo23102b().m23111j()));
                if (jM23128a != -1) {
                    return jM23128a;
                }
                jM23111j = interfaceC5728w.mo23102b().m23111j();
                b10 = b11;
            }
            return -1L;
        }
        if (j11 < 0) {
            str = "startIndex (" + j10 + ") and endIndex (" + j11 + ") should be non negative";
        } else {
            str = "startIndex (" + j10 + ") is not within the range [0..endIndex(" + j11 + "))";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m23081b(InterfaceC5728w interfaceC5728w, byte b10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return m23080a(interfaceC5728w, b10, j12, j11);
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m23082c(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        return m23084e(interfaceC5728w, -1);
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m23083d(InterfaceC5728w interfaceC5728w, int i10) {
        interfaceC5728w.getClass();
        long j10 = i10;
        if (j10 >= 0) {
            return m23084e(interfaceC5728w, i10);
        }
        C5702a.m23079a("byteCount (", j10, ") < 0");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final byte[] m23084e(InterfaceC5728w interfaceC5728w, int i10) throws EOFException {
        if (i10 == -1) {
            for (long j10 = 2147483647L; interfaceC5728w.mo23102b().m23111j() < 2147483647L && interfaceC5728w.mo23110i(j10); j10 *= (long) 2) {
            }
            if (interfaceC5728w.mo23102b().m23111j() >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC5728w.mo23102b().m23111j()).toString());
            }
            i10 = (int) interfaceC5728w.mo23102b().m23111j();
        } else {
            interfaceC5728w.mo23116o(i10);
        }
        byte[] bArr = new byte[i10];
        m23086g(interfaceC5728w.mo23102b(), bArr, 0, 0, 6, null);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    public static final void m23085f(InterfaceC5728w interfaceC5728w, byte[] bArr, int i10, int i11) throws EOFException {
        interfaceC5728w.getClass();
        bArr.getClass();
        AbstractC5709d0.m23124a(bArr.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            int iMo23098H = interfaceC5728w.mo23098H(bArr, i12, i11);
            if (iMo23098H == -1) {
                throw new EOFException("Source exhausted before reading " + (i11 - i10) + " bytes. Only " + iMo23098H + " bytes were read.");
            }
            i12 += iMo23098H;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23086g(InterfaceC5728w interfaceC5728w, byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        m23085f(interfaceC5728w, bArr, i10, i11);
    }
}
