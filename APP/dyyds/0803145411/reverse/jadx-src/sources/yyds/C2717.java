package yyds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: yyds.ᲈᛸᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2717 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2717 f13344 = new C2717(0);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2717 f13345 = new C2717(1);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13346;

    public /* synthetic */ C2717(int i) {
        this.f13346 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2098 m4823(C0837 c0837, C2115 c2115, C2537 c2537) throws ProtocolException {
        C0074 c0074;
        C0837 c08372;
        C1369 c1369 = c2115 != null ? c2115.m4036().f13387 : null;
        int i = c0837.f3860;
        String str = c0837.f3858.f10390;
        if (i == 307 || i == 308) {
            if (c2537.f12499.f13423.f5897) {
                String strM3306 = c0837.f3847.m3306("Location");
                if (strM3306 == null) {
                    strM3306 = null;
                }
                C2098 c2098 = c0837.f3858;
                if (strM3306 != null) {
                    C0082 c0082 = c2098.f10389;
                    c0082.getClass();
                    try {
                        c0074 = new C0074();
                        c0074.m465(c0082, strM3306);
                    } catch (IllegalArgumentException unused) {
                        c0074 = null;
                    }
                    C0082 c0082M462 = c0074 != null ? c0074.m462() : null;
                    if (c0082M462 != null && (AbstractC1544.m3188(c0082M462.f665, c2098.f10389.f665) || c2537.f12499.f13423.f5900)) {
                        C1633 c1633M3994 = c2098.m3994();
                        if (AbstractC0598.m1479(str)) {
                            int i2 = c0837.f3860;
                            boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                c1633M3994.m3335(str, z ? c2098.f10393 : null);
                            } else {
                                c1633M3994.m3335("GET", null);
                            }
                            if (!z) {
                                c1633M3994.m3336("Transfer-Encoding");
                                c1633M3994.m3336("Content-Length");
                                c1633M3994.m3336("Content-Type");
                            }
                        }
                        if (!AbstractC0795.m1803(c2098.f10389, c0082M462)) {
                            c1633M3994.m3336("Authorization");
                        }
                        c1633M3994.f8333 = c0082M462;
                        return new C2098(c1633M3994);
                    }
                }
            }
        } else {
            if (i == 401) {
                return c2537.f12497.mo1278(c1369, c0837);
            }
            if (i != 421) {
                if (i == 503) {
                    C0837 c08373 = c0837.f3848;
                    if ((c08373 == null || c08373.f3860 != 503) && m4825(c0837, Integer.MAX_VALUE) == 0) {
                        return c0837.f3858;
                    }
                } else {
                    if (i == 407) {
                        if (c1369.f6394.type() == Proxy.Type.HTTP) {
                            return c2537.f12501.mo1278(c1369, c0837);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                            default:
                                return null;
                        }
                    } else if (c2537.f12504 && (((c08372 = c0837.f3848) == null || c08372.f3860 != 408) && m4825(c0837, 0) <= 0)) {
                        return c0837.f3858;
                    }
                }
            } else if (c2115 != null && !AbstractC1544.m3188(((InterfaceC1028) c2115.f10456).mo2232().f9351.f8234.f670, ((InterfaceC2121) c2115.f10457).mo717().mo3291().f6393.f8234.f670)) {
                C2723 c2723M4036 = c2115.m4036();
                synchronized (c2723M4036) {
                    c2723M4036.f13384 = true;
                }
                return c0837.f3858;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m4824(IOException iOException, C2729 c2729, C2537 c2537, C2098 c2098) {
        boolean z = iOException instanceof C1496;
        if (!c2537.f12504) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C2115 c2115 = c2729.f13413;
        if (c2115 == null || !c2115.f10454) {
            return false;
        }
        C1864 c1864Mo2232 = c2729.f13421.mo2232();
        C2115 c21152 = c2729.f13413;
        return c1864Mo2232.m3640(c21152 != null ? c21152.m4036() : null);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m4825(C0837 c0837, int i) {
        String strM3306 = c0837.f3847.m3306("Retry-After");
        if (strM3306 == null) {
            strM3306 = null;
        }
        if (strM3306 == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strM3306).matches()) {
            return Integer.valueOf(strM3306).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0818 A[PHI: r17
  0x0818: PHI (r17v3 yyds.ᲁᛸᛶᛲ) = (r17v2 yyds.ᲁᛸᛶᛲ), (r17v4 yyds.ᲁᛸᛶᛲ) binds: [B:365:0x0801, B:368:0x0808] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x084b A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0880 A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0898 A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08d0 A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08f5 A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0906 A[Catch: IOException -> 0x081b, TryCatch #11 {IOException -> 0x081b, blocks: (B:367:0x0804, B:369:0x080a, B:373:0x081e, B:382:0x0845, B:384:0x084b, B:385:0x0854, B:386:0x086d, B:391:0x0880, B:397:0x088e, B:398:0x0895, B:400:0x0898, B:403:0x08a1, B:409:0x08ae, B:411:0x08e7, B:413:0x08f5, B:417:0x0900, B:424:0x0919, B:427:0x0926, B:428:0x094a, B:419:0x0906, B:410:0x08d0), top: B:453:0x0804 }] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0854 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f4  */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17, types: [yyds.ᲀᲇᲇᛵ] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0837 m4826(C2537 c2537) {
        boolean z;
        C2294 c2294M4037;
        ?? r7;
        IOException iOException;
        boolean z2;
        ?? r72;
        C2294 c2294;
        boolean z3;
        C0837 c0837M4297;
        int i;
        ?? r1;
        ?? r3;
        C0837 c0837M42972;
        boolean z4;
        InterfaceC2121 c0157;
        boolean z5;
        C2133 c2133;
        C2133 c21332;
        int i2;
        int i3;
        String str;
        String string;
        int length;
        C2729 c2729;
        List list;
        boolean z6;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C2342 c2342;
        switch (this.f13346) {
            case 0:
                C2115 c2115 = c2537.f12515;
                C2098 c2098 = c2537.f12498;
                AbstractC0659 abstractC0659 = c2098.f10393;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ?? EqualsIgnoreCase = (!AbstractC0598.m1479(c2098.f10390) || abstractC0659 == null) ? 0 : 1;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(c2098.f10391.m3306("Connection"));
                try {
                    c2115.getClass();
                    try {
                        try {
                            ((C2729) c2115.f10455).f13425.getClass();
                            ((InterfaceC2121) c2115.f10457).mo710(c2098);
                            ((C2729) c2115.f10455).f13425.getClass();
                            try {
                                if (EqualsIgnoreCase != 0) {
                                    EqualsIgnoreCase = "100-continue".equalsIgnoreCase(c2098.f10391.m3306("Expect"));
                                    if (EqualsIgnoreCase != 0) {
                                        try {
                                            EqualsIgnoreCase = (InterfaceC2121) c2115.f10457;
                                            EqualsIgnoreCase.mo718();
                                            r7 = 1;
                                            EqualsIgnoreCase = 1;
                                            C2294 c2294M40372 = c2115.m4037(true);
                                            try {
                                                ((C2729) c2115.f10455).f13425.getClass();
                                                c2294M4037 = c2294M40372;
                                                z4 = false;
                                            } catch (IOException e) {
                                                e = e;
                                                z = true;
                                                c2294M4037 = c2294M40372;
                                                if (e instanceof C1496) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e2) {
                                            ((C2729) c2115.f10455).f13425.getClass();
                                            c2115.m4035(e2);
                                            throw e2;
                                        }
                                    } else {
                                        EqualsIgnoreCase = 1;
                                        z4 = true;
                                        c2294M4037 = null;
                                    }
                                    if (c2294M4037 == null) {
                                        abstractC0659.getClass();
                                        long jMo1496 = c2098.f10393.mo1496();
                                        ((C2729) c2115.f10455).f13425.getClass();
                                        C2776 c2776 = new C2776(new C1688(c2115, ((InterfaceC2121) c2115.f10457).mo712(c2098, jMo1496), jMo1496, false));
                                        abstractC0659.mo1498(c2776);
                                        c2776.close();
                                    } else {
                                        ((C2729) c2115.f10455).m4860(c2115, true, false, false, false, null);
                                        if ((c2115.m4036().f13378 != null ? EqualsIgnoreCase : 0) == 0) {
                                            ((InterfaceC2121) c2115.f10457).mo717().mo3290();
                                        }
                                    }
                                } else {
                                    EqualsIgnoreCase = 1;
                                    ((C2729) c2115.f10455).m4860(c2115, true, false, false, false, null);
                                    z4 = true;
                                    c2294M4037 = null;
                                }
                                try {
                                    ((InterfaceC2121) c2115.f10457).mo711();
                                    iOException = null;
                                    r72 = EqualsIgnoreCase;
                                    z2 = z4;
                                } catch (IOException e3) {
                                    ((C2729) c2115.f10455).f13425.getClass();
                                    c2115.m4035(e3);
                                    throw e3;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                r7 = EqualsIgnoreCase;
                                z = z4;
                            }
                        } catch (IOException e5) {
                            ((C2729) c2115.f10455).f13425.getClass();
                            c2115.m4035(e5);
                            throw e5;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        z = EqualsIgnoreCase == true ? 1 : 0;
                        c2294M4037 = null;
                        r7 = EqualsIgnoreCase;
                        if ((e instanceof C1496) || !c2115.f10454) {
                            throw e;
                        }
                        iOException = e;
                        r72 = r7;
                        z2 = z;
                        if (c2294M4037 != null) {
                        }
                        c2294.f11264 = c2098;
                        c2294.f11263 = c2115.m4036().f13389;
                        c2294.f11269 = jCurrentTimeMillis;
                        c2294.f11261 = System.currentTimeMillis();
                        c0837M4297 = c2294.m4297();
                        i = c0837M4297.f3860;
                        while (true) {
                            if (i != 100) {
                                ((C2729) c2115.f10455).f13425.getClass();
                                if (i != 101) {
                                }
                                if (r1 != 0) {
                                }
                                if (r1 == 0) {
                                }
                                if (zEqualsIgnoreCase) {
                                    C0627 c0627M4033 = c2115.m4033(c0837M4297);
                                    C2294 c2294M1918 = c0837M4297.m1918();
                                    c2294M1918.f11267 = c0627M4033;
                                    c2294M1918.f11265 = new C0469(10);
                                    c0837M42972 = c2294M1918.m4297();
                                }
                                if ("close".equalsIgnoreCase(c0837M42972.f3858.f10391.m3306("Connection"))) {
                                }
                                if (i == 204) {
                                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c0837M42972.f3849.mo909());
                                }
                                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c0837M42972.f3849.mo909());
                                return c0837M42972;
                            }
                            C2294 c2294M40373 = c2115.m4037(false);
                            if (!z3) {
                            }
                            c2294M40373.f11264 = c2098;
                            c2294M40373.f11263 = c2115.m4036().f13389;
                            c2294M40373.f11269 = jCurrentTimeMillis;
                            c2294M40373.f11261 = System.currentTimeMillis();
                            c0837M4297 = c2294M40373.m4297();
                            i = c0837M4297.f3860;
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    EqualsIgnoreCase = 1;
                }
                if (c2294M4037 != null) {
                    try {
                        c2294M4037 = c2115.m4037(false);
                        if (z2) {
                            ((C2729) c2115.f10455).f13425.getClass();
                            c2294 = c2294M4037;
                            z3 = false;
                        } else {
                            c2294 = c2294M4037;
                            z3 = z2;
                        }
                    } catch (IOException e8) {
                        if (iOException == null) {
                            throw e8;
                        }
                        AbstractC1579.m3235(iOException, e8);
                        throw iOException;
                    }
                }
                c2294.f11264 = c2098;
                c2294.f11263 = c2115.m4036().f13389;
                c2294.f11269 = jCurrentTimeMillis;
                c2294.f11261 = System.currentTimeMillis();
                c0837M4297 = c2294.m4297();
                i = c0837M4297.f3860;
                while (true) {
                    if (i != 100 && (102 > i || i >= 200)) {
                    }
                    C2294 c2294M403732 = c2115.m4037(false);
                    if (!z3) {
                        ((C2729) c2115.f10455).f13425.getClass();
                    }
                    c2294M403732.f11264 = c2098;
                    c2294M403732.f11263 = c2115.m4036().f13389;
                    c2294M403732.f11269 = jCurrentTimeMillis;
                    c2294M403732.f11261 = System.currentTimeMillis();
                    c0837M4297 = c2294M403732.m4297();
                    i = c0837M4297.f3860;
                }
                ((C2729) c2115.f10455).f13425.getClass();
                r1 = i != 101 ? r72 : 0;
                if (r1 != 0) {
                    if ((c2115.m4036().f13378 != null ? r72 : 0) != 0) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (r1 == 0) {
                    r3 = 0;
                } else {
                    String strM3306 = c0837M4297.f3847.m3306("Connection");
                    if (strM3306 == null) {
                        strM3306 = null;
                    }
                    if ("upgrade".equalsIgnoreCase(strM3306)) {
                        r3 = r72;
                    }
                }
                if (zEqualsIgnoreCase || r3 == 0) {
                    C0627 c0627M40332 = c2115.m4033(c0837M4297);
                    C2294 c2294M19182 = c0837M4297.m1918();
                    c2294M19182.f11267 = c0627M40332;
                    c2294M19182.f11265 = new C0469(10);
                    c0837M42972 = c2294M19182.m4297();
                } else {
                    C2294 c2294M19183 = c0837M4297.m1918();
                    c2294M19183.f11267 = new C1834(c0837M4297.f3849.mo910(), c0837M4297.f3849.mo909());
                    c2294M19183.f11260 = c2115.m4032();
                    c0837M42972 = c2294M19183.m4297();
                }
                if ("close".equalsIgnoreCase(c0837M42972.f3858.f10391.m3306("Connection"))) {
                    ((InterfaceC2121) c2115.f10457).mo717().mo3290();
                } else {
                    String strM33062 = c0837M42972.f3847.m3306("Connection");
                    if ("close".equalsIgnoreCase(strM33062 == null ? null : strM33062)) {
                    }
                }
                if ((i == 204 && i != 205) || c0837M42972.f3849.mo909() <= 0) {
                    return c0837M42972;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c0837M42972.f3849.mo909());
            case 1:
                C2729 c27292 = c2537.f12499;
                synchronized (c27292) {
                    if (!c27292.f13415) {
                        throw new IllegalStateException("released");
                    }
                    if (c27292.f13414 || c27292.f13408 || c27292.f13416 || c27292.f13424) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                InterfaceC1028 interfaceC1028 = c27292.f13421;
                C2723 c2723Mo2233 = interfaceC1028.mo2233();
                C1284 c1284 = c27292.f13423;
                int i4 = c2537.f12505;
                C0644 c0644 = c2723Mo2233.f13376;
                C0937 c0937 = c2723Mo2233.f13378;
                if (c0937 != null) {
                    c0157 = new C2218(c1284, c2723Mo2233, c2537, c0937);
                } else {
                    c2723Mo2233.f13379.setSoTimeout(i4);
                    ((C2066) c0644.f3102).f10219.mo693().mo2198(i4);
                    ((C2776) c0644.f3101).f13529.mo577().mo2198(c2537.f12495);
                    c0157 = new C0157(c1284, c2723Mo2233, c0644);
                }
                C2115 c21152 = new C2115(c27292, interfaceC1028, c0157);
                c27292.f13410 = c21152;
                c27292.f13413 = c21152;
                synchronized (c27292) {
                    c27292.f13408 = true;
                    c27292.f13414 = true;
                }
                if (!c27292.f13422) {
                    return C2537.m4577(c2537, 0, c21152, null, 2097149).m4578(c2537.f12498);
                }
                C0188.m804("Canceled");
                return null;
            case 2:
                C1985 c1985 = c2537.f12509;
                C2098 c20982 = c2537.f12498;
                C1633 c1633M3994 = c20982.m3994();
                C1605 c1605 = c20982.f10391;
                AbstractC0659 abstractC06592 = c20982.f10393;
                if (abstractC06592 != null) {
                    C0811 c0811Mo1497 = abstractC06592.mo1497();
                    if (c0811Mo1497 != null) {
                        c1633M3994.m3333("Content-Type", c0811Mo1497.f3736);
                    }
                    long jMo14962 = abstractC06592.mo1496();
                    if (jMo14962 != -1) {
                        c1633M3994.m3333("Content-Length", String.valueOf(jMo14962));
                        c1633M3994.m3336("Transfer-Encoding");
                    } else {
                        c1633M3994.m3333("Transfer-Encoding", "chunked");
                        c1633M3994.m3336("Content-Length");
                    }
                }
                if (c1605.m3306("Host") == null) {
                    c1633M3994.m3333("Host", AbstractC0795.m1801(c20982.f10389, false));
                }
                if (c1605.m3306("Connection") == null) {
                    c1633M3994.m3333("Connection", "Keep-Alive");
                }
                if (c1605.m3306("Accept-Encoding") == null && c1605.m3306("Range") == null) {
                    c1633M3994.m3333("Accept-Encoding", "gzip");
                    z5 = true;
                } else {
                    z5 = false;
                }
                c1985.getClass();
                if (c1605.m3306("User-Agent") == null) {
                    c1633M3994.m3333("User-Agent", "okhttp/5.4.0");
                }
                C2098 c20983 = new C2098(c1633M3994);
                C0837 c0837M4578 = c2537.m4578(c20983);
                C1605 c16052 = c0837M4578.f3847;
                AbstractC2191.m4186(c1985, c20983.f10389, c16052);
                C2294 c2294M19184 = c0837M4578.m1918();
                c2294M19184.f11264 = c20983;
                if (z5) {
                    String strM33063 = c16052.m3306("Content-Encoding");
                    if (strM33063 == null) {
                        strM33063 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM33063) && AbstractC2191.m4183(c0837M4578)) {
                        C2512 c2512 = new C2512(c0837M4578.f3849.mo908());
                        C2135 c2135M1839 = AbstractC0797.m1839(c16052);
                        c2135M1839.m4074("Content-Encoding");
                        c2135M1839.m4074("Content-Length");
                        c2294M19184.f11272 = AbstractC0797.m1839(AbstractC0797.m1823(c2135M1839));
                        String strM33064 = c16052.m3306("Content-Type");
                        if (strM33064 == null) {
                            strM33064 = null;
                        }
                        c2294M19184.f11267 = new C0627(strM33064, -1L, new C2066(c2512));
                    }
                }
                return c2294M19184.m4297();
            case 3:
                System.currentTimeMillis();
                C2098 c20984 = c2537.f12498;
                C2133 c21333 = new C2133(c20984, 12, (Object) null);
                C0316 c0316 = c20984.f10392;
                if (c0316 == null) {
                    int i5 = C0316.f1676;
                    C1605 c16053 = c20984.f10391;
                    int size = c16053.size();
                    String str2 = null;
                    boolean z7 = true;
                    int i6 = 0;
                    boolean z8 = false;
                    boolean z9 = false;
                    int iM2912 = -1;
                    int iM29122 = -1;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    int iM29123 = -1;
                    int iM29124 = -1;
                    boolean z13 = false;
                    boolean z14 = false;
                    boolean z15 = false;
                    while (i6 < size) {
                        String strM1836 = AbstractC0797.m1836(c16053, i6);
                        String strM1817 = AbstractC0797.m1817(c16053, i6);
                        if (strM1836.equalsIgnoreCase("Cache-Control")) {
                            if (str2 == null) {
                                str2 = strM1817;
                            }
                            i2 = 0;
                            while (i2 < strM1817.length()) {
                                C2133 c21334 = c21333;
                                int length2 = strM1817.length();
                                C1605 c16054 = c16053;
                                int length3 = i2;
                                while (true) {
                                    if (length3 < length2) {
                                        int i7 = length2;
                                        if (!AbstractC0473.m1295("=,;", strM1817.charAt(length3))) {
                                            length3++;
                                            length2 = i7;
                                        }
                                    } else {
                                        length3 = strM1817.length();
                                    }
                                }
                                String string2 = AbstractC0473.m1314(strM1817.substring(i2, length3)).toString();
                                if (length3 == strM1817.length() || strM1817.charAt(length3) == ',' || strM1817.charAt(length3) == ';') {
                                    i3 = size;
                                    str = str2;
                                    i2 = length3 + 1;
                                    string = null;
                                } else {
                                    int i8 = length3 + 1;
                                    byte[] bArr = AbstractC1429.f6782;
                                    int length4 = strM1817.length();
                                    while (true) {
                                        if (i8 < length4) {
                                            char cCharAt = strM1817.charAt(i8);
                                            int i9 = i8;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                i8 = i9 + 1;
                                            } else {
                                                length = i9;
                                            }
                                        } else {
                                            length = strM1817.length();
                                        }
                                    }
                                    if (length >= strM1817.length() || strM1817.charAt(length) != '\"') {
                                        int length5 = strM1817.length();
                                        i3 = size;
                                        int length6 = length;
                                        while (true) {
                                            if (length6 < length5) {
                                                str = str2;
                                                if (!AbstractC0473.m1295(",;", strM1817.charAt(length6))) {
                                                    length6++;
                                                    str2 = str;
                                                }
                                            } else {
                                                str = str2;
                                                length6 = strM1817.length();
                                            }
                                        }
                                        string = AbstractC0473.m1314(strM1817.substring(length, length6)).toString();
                                        i2 = length6;
                                    } else {
                                        int i10 = length + 1;
                                        int iM1290 = AbstractC0473.m1290(strM1817, '\"', i10, 4);
                                        string = strM1817.substring(i10, iM1290);
                                        i2 = iM1290 + 1;
                                        i3 = size;
                                        str = str2;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string2)) {
                                    c21333 = c21334;
                                    c16053 = c16054;
                                    size = i3;
                                    str2 = str;
                                    z8 = true;
                                } else if ("no-store".equalsIgnoreCase(string2)) {
                                    c21333 = c21334;
                                    c16053 = c16054;
                                    size = i3;
                                    str2 = str;
                                    z9 = true;
                                } else {
                                    if ("max-age".equalsIgnoreCase(string2)) {
                                        iM2912 = AbstractC1429.m2912(-1, string);
                                    } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                        iM29122 = AbstractC1429.m2912(-1, string);
                                    } else if ("private".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z10 = true;
                                    } else if ("public".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z11 = true;
                                    } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z12 = true;
                                    } else if ("max-stale".equalsIgnoreCase(string2)) {
                                        iM29123 = AbstractC1429.m2912(Integer.MAX_VALUE, string);
                                    } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                        iM29124 = AbstractC1429.m2912(-1, string);
                                    } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z13 = true;
                                    } else if ("no-transform".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z14 = true;
                                    } else if ("immutable".equalsIgnoreCase(string2)) {
                                        c21333 = c21334;
                                        c16053 = c16054;
                                        size = i3;
                                        str2 = str;
                                        z15 = true;
                                    }
                                    c21333 = c21334;
                                    c16053 = c16054;
                                    size = i3;
                                    str2 = str;
                                }
                            }
                            i6++;
                            c21333 = c21333;
                            c16053 = c16053;
                            size = size;
                        } else if (!strM1836.equalsIgnoreCase("Pragma")) {
                            i6++;
                            c21333 = c21333;
                            c16053 = c16053;
                            size = size;
                        }
                        z7 = false;
                        i2 = 0;
                        while (i2 < strM1817.length()) {
                        }
                        i6++;
                        c21333 = c21333;
                        c16053 = c16053;
                        size = size;
                    }
                    c2133 = c21333;
                    c0316 = new C0316(z8, z9, iM2912, iM29122, z10, z11, z12, iM29123, iM29124, z13, z14, z15, !z7 ? null : str2);
                    c20984.f10392 = c0316;
                } else {
                    c2133 = c21333;
                }
                if (c0316.f1686) {
                    Object obj = null;
                    c21332 = new C2133(obj, 12, obj);
                } else {
                    c21332 = c2133;
                }
                C2098 c20985 = (C2098) c21332.f10555;
                C0837 c0837 = (C0837) c21332.f10553;
                if (c20985 == null && c0837 == null) {
                    C0837 c08372 = new C0837(c2537.f12498, EnumC0940.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new C1605((String[]) new ArrayList(20).toArray(new String[0])), AbstractC0379.f1953, null, null, null, null, -1L, System.currentTimeMillis(), null, InterfaceC1414.f6696);
                    c2537.f12499.f13425.getClass();
                    return c08372;
                }
                if (c20985 == null) {
                    C2294 c2294M19185 = c0837.m1918();
                    C0837 c0837M494 = AbstractC0090.m494(c0837);
                    C2294.m4296("cacheResponse", c0837M494);
                    c2294M19185.f11270 = c0837M494;
                    C0837 c0837M42973 = c2294M19185.m4297();
                    c2537.f12499.f13425.getClass();
                    return c0837M42973;
                }
                if (c0837 != null) {
                    c2537.f12499.f13425.getClass();
                }
                C0837 c0837M45782 = c2537.m4578(c20985);
                if (c0837 != null) {
                    if (c0837M45782.f3860 == 304) {
                        C2294 c2294M19186 = c0837.m1918();
                        C1605 c16055 = c0837.f3847;
                        C1605 c16056 = c0837M45782.f3847;
                        ArrayList arrayList = new ArrayList(20);
                        int size2 = c16055.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            String strM18362 = AbstractC0797.m1836(c16055, i11);
                            String strM18172 = AbstractC0797.m1817(c16055, i11);
                            if ((!"Warning".equalsIgnoreCase(strM18362) || !strM18172.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM18362) || "Content-Encoding".equalsIgnoreCase(strM18362) || "Content-Type".equalsIgnoreCase(strM18362) || !AbstractC1960.m3785(strM18362) || c16056.m3306(strM18362) == null)) {
                                arrayList.add(strM18362);
                                arrayList.add(AbstractC0473.m1314(strM18172).toString());
                            }
                        }
                        int size3 = c16056.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            String strM18363 = AbstractC0797.m1836(c16056, i12);
                            if (!"Content-Length".equalsIgnoreCase(strM18363) && !"Content-Encoding".equalsIgnoreCase(strM18363) && !"Content-Type".equalsIgnoreCase(strM18363) && AbstractC1960.m3785(strM18363)) {
                                String strM18173 = AbstractC0797.m1817(c16056, i12);
                                arrayList.add(strM18363);
                                arrayList.add(AbstractC0473.m1314(strM18173).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        C2135 c2135 = new C2135(2);
                        AbstractC1432.m2927(c2135.f10556, strArr);
                        c2294M19186.f11272 = c2135;
                        c2294M19186.f11269 = c0837M45782.f3846;
                        c2294M19186.f11261 = c0837M45782.f3851;
                        C0837 c0837M4942 = AbstractC0090.m494(c0837);
                        C2294.m4296("cacheResponse", c0837M4942);
                        c2294M19186.f11270 = c0837M4942;
                        C0837 c0837M4943 = AbstractC0090.m494(c0837M45782);
                        C2294.m4296("networkResponse", c0837M4943);
                        c2294M19186.f11262 = c0837M4943;
                        c2294M19186.m4297();
                        c0837M45782.f3849.close();
                        throw null;
                    }
                    AbstractC1429.m2918(c0837.f3849);
                }
                C2294 c2294M19187 = c0837M45782.m1918();
                C0837 c0837M4944 = c0837 != null ? AbstractC0090.m494(c0837) : null;
                C2294.m4296("cacheResponse", c0837M4944);
                c2294M19187.f11270 = c0837M4944;
                C0837 c0837M4945 = AbstractC0090.m494(c0837M45782);
                C2294.m4296("networkResponse", c0837M4945);
                c2294M19187.f11262 = c0837M4945;
                return c2294M19187.m4297();
            default:
                C2098 c20986 = c2537.f12498;
                C2729 c27293 = c2537.f12499;
                List listM3279 = C1860.f9345;
                C0837 c08373 = null;
                int i13 = 0;
                C2098 c2098M4823 = c20986;
                while (true) {
                    boolean z16 = true;
                    while (c27293.f13410 == null) {
                        synchronized (c27293) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                c2729 = c27293;
                            }
                            try {
                                if (c27293.f13414) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c27293.f13408 || c27293.f13416 || c27293.f13424) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            break;
                        }
                        if (z16) {
                            C1284 c12842 = c27293.f13423;
                            C0105 c0105 = c12842.f5916;
                            C2142 c2142 = (C2142) c2537.f12508.f551;
                            int i14 = c2537.f12505;
                            int i15 = c2537.f12495;
                            List list2 = listM3279;
                            int i16 = c2537.f12514;
                            boolean z17 = c2537.f12504;
                            boolean z18 = c12842.f5921;
                            C0082 c0082 = c2098M4823.f10389;
                            if (AbstractC1544.m3188(c0082.f665, "https")) {
                                sSLSocketFactory = c2537.f12511;
                                hostnameVerifier = c2537.f12494;
                                c2342 = c2537.f12510;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                c2342 = null;
                            }
                            String str3 = c0082.f670;
                            int i17 = c0082.f664;
                            C0135 c0135 = c2537.f12496;
                            SocketFactory socketFactory = c2537.f12502;
                            InterfaceC2656 interfaceC2656 = c2537.f12501;
                            C1284 c12843 = c2537.f12499.f13423;
                            list = list2;
                            C2729 c27294 = c27293;
                            C2098 c20987 = c2098M4823;
                            C1864 c1864 = new C1864(c0105, c2142, i14, i15, i16, i14, z17, z18, new C1618(str3, i17, c0135, socketFactory, sSLSocketFactory, hostnameVerifier, c2342, interfaceC2656, c12843.f5906, c12843.f5910, c2537.f12513), c27293.f13423.f5899, c27294, c20987);
                            c2729 = c27294;
                            c2098M4823 = c20987;
                            C1284 c12844 = c2729.f13423;
                            c2729.f13421 = c12844.f5921 ? new C2106(c1864, c12844.f5916) : new C2014(16, c1864);
                        } else {
                            c2729 = c27293;
                            list = listM3279;
                        }
                        try {
                            if (c2729.f13422) {
                                throw new IOException("Canceled");
                            }
                            try {
                                C2294 c2294M19188 = c2537.m4578(c2098M4823).m1918();
                                c2294M19188.f11264 = c2098M4823;
                                c2294M19188.f11268 = c08373 != null ? AbstractC0090.m494(c08373) : null;
                                C0837 c0837M42974 = c2294M19188.m4297();
                                c2098M4823 = m4823(c0837M42974, c2729.f13410, c2537);
                                if (c2098M4823 == null) {
                                    try {
                                        c2729.f13425.getClass();
                                        c2729.m4857(false);
                                        return c0837M42974;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z6 = false;
                                    }
                                } else {
                                    AbstractC1429.m2918(c0837M42974.f3849);
                                    int i18 = i13 + 1;
                                    AbstractC2740 abstractC2740 = c2729.f13425;
                                    if (i18 > 20) {
                                        abstractC2740.getClass();
                                        throw new ProtocolException("Too many follow-up requests: " + i18);
                                    }
                                    abstractC2740.getClass();
                                    c2729.m4857(true);
                                    c08373 = c0837M42974;
                                    listM3279 = list;
                                    c27293 = c2729;
                                    i13 = i18;
                                }
                            } catch (IOException e9) {
                                boolean zM4824 = m4824(e9, c2729, c2537, c2098M4823);
                                c2729.f13425.getClass();
                                if (!zM4824) {
                                    byte[] bArr2 = AbstractC1429.f6782;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        AbstractC1579.m3235(e9, (Exception) it.next());
                                    }
                                    throw e9;
                                }
                                listM3279 = AbstractC1595.m3279(list, e9);
                                c2729.m4857(true);
                                c27293 = c2729;
                                z16 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z6 = true;
                        }
                        c2729.m4857(z6);
                        throw th;
                    }
                    C0188.m800("Check failed.");
                    return null;
                }
        }
    }
}
