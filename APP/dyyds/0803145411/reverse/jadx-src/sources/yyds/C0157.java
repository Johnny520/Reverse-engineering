package yyds;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛱᛷᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0157 implements InterfaceC2121 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1605 f963;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1641 f964;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1284 f965;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC1604 f966;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0644 f967;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f968;

    static {
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            C0188.m798("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                C0188.m798("Headers cannot be null");
                return;
            }
            strArr2[i2] = AbstractC0473.m1314(strArr[i2]).toString();
        }
        int iM3792 = AbstractC1960.m3792(0, strArr2.length - 1, 2);
        if (iM3792 >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                AbstractC0797.m1830(str);
                AbstractC0797.m1831(str2, str);
                if (i == iM3792) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f963 = new C1605(strArr2);
    }

    public C0157(C1284 c1284, InterfaceC1604 interfaceC1604, C0644 c0644) {
        this.f965 = c1284;
        this.f966 = interfaceC1604;
        this.f967 = c0644;
        this.f964 = new C1641((C2066) c0644.f3102);
    }

    @Override // yyds.InterfaceC2121
    public final void cancel() {
        this.f966.cancel();
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long mo707(C0837 c0837) {
        if (!AbstractC2191.m4183(c0837)) {
            return 0L;
        }
        String strM3306 = c0837.f3847.m3306("Transfer-Encoding");
        if (strM3306 == null) {
            strM3306 = null;
        }
        if ("chunked".equalsIgnoreCase(strM3306)) {
            return -1L;
        }
        return AbstractC0795.m1802(c0837);
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final InterfaceC1590 mo708(C0837 c0837) {
        C2098 c2098 = c0837.f3858;
        if (!AbstractC2191.m4183(c0837)) {
            return m713(c2098.f10389, 0L);
        }
        String strM3306 = c0837.f3847.m3306("Transfer-Encoding");
        if (strM3306 == null) {
            strM3306 = null;
        }
        if ("chunked".equalsIgnoreCase(strM3306)) {
            C0082 c0082 = c2098.f10389;
            if (this.f968 == 4) {
                this.f968 = 5;
                return new C0655(this, c0082);
            }
            C1693.m3438(this.f968, "state: ");
            return null;
        }
        long jM1802 = AbstractC0795.m1802(c0837);
        if (jM1802 != -1) {
            return m713(c2098.f10389, jM1802);
        }
        C0082 c00822 = c2098.f10389;
        if (this.f968 != 4) {
            C1693.m3438(this.f968, "state: ");
            return null;
        }
        this.f968 = 5;
        this.f966.mo3290();
        return new C2384(this, c00822);
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2295 mo709() {
        return this.f967;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo710(C2098 c2098) {
        Proxy.Type type = this.f966.mo3291().f6394.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c2098.f10390);
        sb.append(' ');
        C0082 c0082 = c2098.f10389;
        if (AbstractC1544.m3188(c0082.f665, "https") || type != Proxy.Type.HTTP) {
            String strM478 = c0082.m478();
            String strM482 = c0082.m482();
            if (strM482 != null) {
                strM478 = strM478 + '?' + strM482;
            }
            sb.append(strM478);
        } else {
            sb.append(c0082);
        }
        sb.append(" HTTP/1.1");
        m714(c2098.f10391, sb.toString());
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo711() {
        ((C2776) this.f967.f3101).flush();
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC1979 mo712(C2098 c2098, long j) {
        if ("chunked".equalsIgnoreCase(c2098.f10391.m3306("Transfer-Encoding"))) {
            if (this.f968 == 1) {
                this.f968 = 2;
                return new C2000(this);
            }
            C1693.m3438(this.f968, "state: ");
            return null;
        }
        if (j == -1) {
            C0188.m800("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f968 == 1) {
            this.f968 = 2;
            return new C0125(this);
        }
        C1693.m3438(this.f968, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C2357 m713(C0082 c0082, long j) {
        if (this.f968 == 4) {
            this.f968 = 5;
            return new C2357(this, c0082, j);
        }
        C1693.m3438(this.f968, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m714(C1605 c1605, String str) {
        if (this.f968 != 0) {
            C1693.m3438(this.f968, "state: ");
            return;
        }
        C0644 c0644 = this.f967;
        C2776 c2776 = (C2776) c0644.f3101;
        c2776.m4892(str);
        c2776.m4892("\r\n");
        int size = c1605.size();
        int i = 0;
        while (true) {
            C2776 c27762 = (C2776) c0644.f3101;
            if (i >= size) {
                c27762.m4892("\r\n");
                this.f968 = 1;
                return;
            } else {
                c27762.m4892(AbstractC0797.m1836(c1605, i));
                c27762.m4892(": ");
                c27762.m4892(AbstractC0797.m1817(c1605, i));
                c27762.m4892("\r\n");
                i++;
            }
        }
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2294 mo715(boolean z) throws IOException {
        C1641 c1641 = this.f964;
        int i = this.f968;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            C1693.m3438(this.f968, "state: ");
            return null;
        }
        try {
            String strM3921 = ((C2066) c1641.f8357).m3921(c1641.f8356);
            c1641.f8356 -= (long) strM3921.length();
            C1607 c1607M2017 = AbstractC0902.m2017(strM3921);
            int i2 = c1607M2017.f8178;
            C2294 c2294 = new C2294();
            c2294.f11266 = (EnumC0940) c1607M2017.f8179;
            c2294.f11271 = i2;
            c2294.f11273 = (String) c1607M2017.f8180;
            c2294.f11272 = AbstractC0797.m1839(c1641.m3354());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f968 = 3;
                return c2294;
            }
            if (102 > i2 || i2 >= 200) {
                this.f968 = 4;
                return c2294;
            }
            this.f968 = 3;
            return c2294;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f966.mo3291().f6393.f8234.m479()), e);
        }
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean mo716() {
        return this.f968 == 6;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC1604 mo717() {
        return this.f966;
    }

    @Override // yyds.InterfaceC2121
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo718() {
        ((C2776) this.f967.f3101).flush();
    }
}
