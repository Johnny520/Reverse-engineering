package yyds;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᲁᛴᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2218 implements InterfaceC2121 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final EnumC0940 f10971;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2723 f10972;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2537 f10973;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0937 f10974;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public volatile boolean f10975;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile C2521 f10976;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final List f10970 = AbstractC0795.m1806(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final List f10969 = AbstractC0795.m1806(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public C2218(C1284 c1284, C2723 c2723, C2537 c2537, C0937 c0937) {
        this.f10972 = c2723;
        this.f10973 = c2537;
        this.f10974 = c0937;
        List list = c1284.f5906;
        EnumC0940 enumC0940 = EnumC0940.H2_PRIOR_KNOWLEDGE;
        this.f10971 = list.contains(enumC0940) ? enumC0940 : EnumC0940.HTTP_2;
    }

    @Override // yyds.InterfaceC2121
    public final void cancel() {
        this.f10975 = true;
        C2521 c2521 = this.f10976;
        if (c2521 != null) {
            c2521.m4572(9);
        }
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final long mo707(C0837 c0837) {
        if (AbstractC2191.m4183(c0837)) {
            return AbstractC0795.m1802(c0837);
        }
        return 0L;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final InterfaceC1590 mo708(C0837 c0837) {
        return this.f10976.f12441;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2295 mo709() {
        return this.f10976;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo710(C2098 c2098) throws IOException {
        int i;
        C2521 c2521;
        boolean z;
        if (this.f10976 != null) {
            return;
        }
        boolean z2 = c2098.f10393 != null;
        C1605 c1605 = c2098.f10391;
        ArrayList arrayList = new ArrayList(c1605.size() + 4);
        arrayList.add(new C1843(C1843.f9268, c2098.f10390));
        C2534 c2534 = C1843.f9267;
        C0082 c0082 = c2098.f10389;
        String strM478 = c0082.m478();
        String strM482 = c0082.m482();
        if (strM482 != null) {
            strM478 = strM478 + '?' + strM482;
        }
        arrayList.add(new C1843(c2534, strM478));
        String strM3306 = c1605.m3306("Host");
        if (strM3306 != null) {
            arrayList.add(new C1843(C1843.f9265, strM3306));
        }
        arrayList.add(new C1843(C1843.f9264, c0082.f665));
        int size = c1605.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = AbstractC0797.m1836(c1605, i2).toLowerCase(Locale.US);
            if (!f10970.contains(lowerCase) || (lowerCase.equals("te") && AbstractC0797.m1817(c1605, i2).equals("trailers"))) {
                arrayList.add(new C1843(lowerCase, AbstractC0797.m1817(c1605, i2)));
            }
        }
        C0937 c0937 = this.f10974;
        boolean z3 = !z2;
        synchronized (c0937.f4318) {
            synchronized (c0937) {
                try {
                    if (c0937.f4307 > 1073741823) {
                        c0937.m2057(8);
                    }
                    if (c0937.f4295) {
                        throw new C1496();
                    }
                    i = c0937.f4307;
                    c0937.f4307 = i + 2;
                    c2521 = new C2521(i, c0937, z3, false, null);
                    z = !z2 || c0937.f4308 >= c0937.f4305 || c2521.f12443 >= c2521.f12438;
                    if (c2521.m4566()) {
                        c0937.f4317.put(Integer.valueOf(i), c2521);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0937.f4318.m919(z3, i, arrayList);
        }
        if (z) {
            c0937.f4318.flush();
        }
        this.f10976 = c2521;
        boolean z4 = this.f10975;
        C2521 c25212 = this.f10976;
        if (z4) {
            c25212.m4572(9);
            C0188.m804("Canceled");
        } else {
            c25212.f12440.mo2198(this.f10973.f12505);
            this.f10976.f12434.mo2198(this.f10973.f12495);
        }
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo711() throws SocketTimeoutException {
        this.f10976.f12439.close();
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final InterfaceC1979 mo712(C2098 c2098, long j) {
        return this.f10976.f12439;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2294 mo715(boolean z) throws IOException {
        C1605 c1605;
        C2521 c2521 = this.f10976;
        if (c2521 == null) {
            C0188.m804("stream wasn't created");
            return null;
        }
        synchronized (c2521) {
            while (true) {
                if (!c2521.f12433.isEmpty() || c2521.m4570() != 0) {
                    break;
                }
                if (!z) {
                    c2521.f12444.getClass();
                    C1856 c1856 = c2521.f12439;
                    boolean z2 = c1856.f9334 || c1856.f9335;
                    if (z2) {
                        c2521.f12440.m977();
                    }
                    try {
                        try {
                            c2521.wait();
                            if (z2) {
                                c2521.f12440.m3357();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            c2521.f12440.m3357();
                        }
                        throw th;
                    }
                }
            }
            if (c2521.f12433.isEmpty()) {
                IOException iOException = c2521.f12437;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C2601(c2521.m4570());
            }
            c1605 = (C1605) c2521.f12433.removeFirst();
        }
        EnumC0940 enumC0940 = this.f10971;
        ArrayList arrayList = new ArrayList(20);
        int size = c1605.size();
        C1607 c1607M2017 = null;
        for (int i = 0; i < size; i++) {
            String strM1836 = AbstractC0797.m1836(c1605, i);
            String strM1817 = AbstractC0797.m1817(c1605, i);
            if (strM1836.equals(":status")) {
                c1607M2017 = AbstractC0902.m2017("HTTP/1.1 ".concat(strM1817));
            } else if (!f10969.contains(strM1836)) {
                arrayList.add(strM1836);
                arrayList.add(AbstractC0473.m1314(strM1817).toString());
            }
        }
        if (c1607M2017 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C2294 c2294 = new C2294();
        c2294.f11266 = enumC0940;
        c2294.f11271 = c1607M2017.f8178;
        c2294.f11273 = (String) c1607M2017.f8180;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C2135 c2135 = new C2135(2);
        AbstractC1432.m2927(c2135.f10556, strArr);
        c2294.f11272 = c2135;
        if (z && c2294.f11271 == 100) {
            return null;
        }
        return c2294;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo716() {
        boolean z;
        C2521 c2521 = this.f10976;
        if (c2521 != null) {
            synchronized (c2521) {
                C0719 c0719 = c2521.f12441;
                if (c0719.f3379) {
                    z = c0719.f3378.m3021();
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final InterfaceC1604 mo717() {
        return this.f10972;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo718() {
        this.f10974.flush();
    }
}
