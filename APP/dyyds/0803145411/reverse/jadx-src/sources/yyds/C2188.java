package yyds;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᲁᛲᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2188 implements Closeable {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Logger f10752 = Logger.getLogger(AbstractC0545.class.getName());

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2401 f10753;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2066 f10754;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2311 f10755;

    public C2188(C2066 c2066) {
        this.f10754 = c2066;
        C2311 c2311 = new C2311(c2066);
        this.f10755 = c2311;
        this.f10753 = new C2401(c2311);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10754.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x021f, code lost:
    
        yyds.C0188.m804(yyds.AbstractC0897.m1989(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0228, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4176(boolean z, C2025 c2025) throws Exception {
        int iM2921;
        int i;
        int i2;
        Object[] array;
        try {
            this.f10754.m3926(9L);
            iM2921 = AbstractC1429.m2921(this.f10754);
        } catch (EOFException unused) {
        }
        if (iM2921 > 16384) {
            C0188.m804(AbstractC0897.m1989(iM2921, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int iM3925 = this.f10754.m3925() & 255;
        byte bM3925 = this.f10754.m3925();
        int i3 = bM3925 & 255;
        int iM3922 = this.f10754.m3922();
        int i4 = Integer.MAX_VALUE & iM3922;
        if (iM3925 != 8) {
            Logger logger = f10752;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0545.m1380(true, i4, iM2921, iM3925, i3));
            }
        }
        if (z && iM3925 != 4) {
            C0188.m797(AbstractC0545.m1379(iM3925), "Expected a SETTINGS frame but was ");
            return false;
        }
        switch (iM3925) {
            case 0:
                m4180(c2025, iM2921, i3, i4);
                return true;
            case 1:
                m4179(c2025, iM2921, i3, i4);
                return true;
            case 2:
                if (iM2921 != 5) {
                    throw new IOException("TYPE_PRIORITY length: " + iM2921 + " != 5");
                }
                if (i4 == 0) {
                    C0188.m804("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                C2066 c2066 = this.f10754;
                c2066.m3922();
                c2066.m3925();
                return true;
            case 3:
                if (iM2921 != 4) {
                    throw new IOException("TYPE_RST_STREAM length: " + iM2921 + " != 4");
                }
                if (i4 == 0) {
                    C0188.m804("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int iM39222 = this.f10754.m3922();
                int[] iArrM4003 = AbstractC2104.m4003(14);
                int length = iArrM4003.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        i = iArrM4003[i5];
                        if (AbstractC2104.m4012(i) != iM39222) {
                            i5++;
                        }
                    } else {
                        i = 0;
                    }
                }
                if (i == 0) {
                    C0188.m804(AbstractC0897.m1989(iM39222, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                C0937 c0937 = c2025.f10099;
                if (i4 != 0 && (iM3922 & 1) == 0) {
                    C0153.m694(c0937.f4310, c0937.f4299 + '[' + i4 + "] onReset", new C2052(c0937, i4, i));
                    return true;
                }
                C2521 c2521M2056 = c0937.m2056(i4);
                if (c2521M2056 != null) {
                    synchronized (c2521M2056) {
                        if (c2521M2056.m4570() == 0) {
                            c2521M2056.f12432 = i;
                            c2521M2056.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                C2066 c20662 = this.f10754;
                if (i4 != 0) {
                    C0188.m804("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((bM3925 & 1) != 0) {
                    if (iM2921 != 0) {
                        C0188.m804("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iM2921 % 6 != 0) {
                    C0188.m804(AbstractC0897.m1989(iM2921, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                C1670 c1670 = new C1670();
                C2536 c2536M1484 = AbstractC0598.m1484(AbstractC0598.m1485(0, iM2921), 6);
                int i6 = c2536M1484.f12492;
                int i7 = c2536M1484.f12493;
                int i8 = c2536M1484.f12491;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        short sM3923 = c20662.m3923();
                        byte[] bArr = AbstractC1429.f6782;
                        int i9 = sM3923 & 65535;
                        int iM39223 = c20662.m3922();
                        if (i9 != 2) {
                            if (i9 != 4) {
                                if (i9 == 5 && (iM39223 < 16384 || iM39223 > 16777215)) {
                                }
                            } else if (iM39223 < 0) {
                                C0188.m804("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (iM39223 != 0 && iM39223 != 1) {
                            C0188.m804("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        c1670.m3417(i9, iM39223);
                        if (i6 != i7) {
                            i6 += i8;
                        }
                        break;
                    }
                }
                C0937 c09372 = c2025.f10099;
                C0153.m694(c09372.f4312, AbstractC2104.m4015(new StringBuilder(), c09372.f4299, " applyAndAckSettings"), new C1524(c2025, 5, c1670));
                return true;
            case 5:
                m4177(c2025, iM2921, i3, i4);
                return true;
            case 6:
                if (iM2921 != 8) {
                    C0188.m804(AbstractC0897.m1989(iM2921, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i4 != 0) {
                    C0188.m804("TYPE_PING streamId != 0");
                    return false;
                }
                int iM39224 = this.f10754.m3922();
                int iM39225 = this.f10754.m3922();
                i = (bM3925 & 1) != 0 ? 1 : 0;
                C0937 c09373 = c2025.f10099;
                if (i == 0) {
                    C0153.m694(c09373.f4312, AbstractC2104.m4015(new StringBuilder(), c2025.f10099.f4299, " ping"), new C2190(c2025.f10099, iM39224, iM39225, 1));
                    return true;
                }
                synchronized (c09373) {
                    try {
                        if (iM39224 == 1) {
                            c09373.f4294++;
                        } else if (iM39224 == 2) {
                            c09373.f4315++;
                        } else if (iM39224 == 3) {
                            c09373.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (iM2921 < 8) {
                    C0188.m804(AbstractC0897.m1989(iM2921, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i4 != 0) {
                    C0188.m804("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int iM39226 = this.f10754.m3922();
                int iM39227 = this.f10754.m3922();
                int i10 = iM2921 - 8;
                int[] iArrM40032 = AbstractC2104.m4003(14);
                int length2 = iArrM40032.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        i2 = iArrM40032[i11];
                        if (AbstractC2104.m4012(i2) != iM39227) {
                            i11++;
                        }
                    } else {
                        i2 = 0;
                    }
                }
                if (i2 == 0) {
                    C0188.m804(AbstractC0897.m1989(iM39227, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                C2534 c2534M3927 = C2534.f12475;
                if (i10 > 0) {
                    c2534M3927 = this.f10754.m3927(i10);
                }
                c2534M3927.mo4261();
                C0937 c09374 = c2025.f10099;
                synchronized (c09374) {
                    array = c09374.f4317.values().toArray(new C2521[0]);
                    c09374.f4295 = true;
                }
                C2521[] c2521Arr = (C2521[]) array;
                int length3 = c2521Arr.length;
                while (i < length3) {
                    C2521 c2521 = c2521Arr[i];
                    if (c2521.f12442 > iM39226 && c2521.m4565()) {
                        synchronized (c2521) {
                            if (c2521.m4570() == 0) {
                                c2521.f12432 = 8;
                                c2521.notifyAll();
                            }
                        }
                        c2025.f10099.m2056(c2521.f12442);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iM2921 != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM2921);
                    }
                    long jM3922 = ((long) this.f10754.m3922()) & 2147483647L;
                    if (jM3922 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = f10752;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(AbstractC0545.m1381(true, i4, iM2921, jM3922));
                    }
                    C0937 c09375 = c2025.f10099;
                    if (i4 == 0) {
                        synchronized (c09375) {
                            c09375.f4305 += jM3922;
                            c09375.notifyAll();
                        }
                        return true;
                    }
                    C2521 c2521M2059 = c09375.m2059(i4);
                    if (c2521M2059 != null) {
                        synchronized (c2521M2059) {
                            c2521M2059.f12438 += jM3922;
                            if (jM3922 > 0) {
                                c2521M2059.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    f10752.fine(AbstractC0545.m1380(true, i4, iM2921, 8, i3));
                    throw e;
                }
            default:
                this.f10754.m3928(iM2921);
                return true;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m4177(C2025 c2025, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C0188.m804("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bM3925 = this.f10754.m3925();
            byte[] bArr = AbstractC1429.f6782;
            i4 = bM3925 & 255;
        } else {
            i4 = 0;
        }
        int iM3922 = this.f10754.m3922() & Integer.MAX_VALUE;
        List listM4178 = m4178(AbstractC0181.m742(i - 4, i2, i4), i4, i2, i3);
        C0937 c0937 = c2025.f10099;
        synchronized (c0937) {
            if (c0937.f4297.contains(Integer.valueOf(iM3922))) {
                c0937.m2055(iM3922, 2);
                return;
            }
            c0937.f4297.add(Integer.valueOf(iM3922));
            C0153.m694(c0937.f4310, c0937.f4299 + '[' + iM3922 + "] onRequest", new C2052(c0937, iM3922, listM4178));
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final List m4178(int i, int i2, int i3, int i4) throws IOException {
        C2311 c2311 = this.f10755;
        c2311.f11322 = i;
        c2311.f11320 = i2;
        c2311.f11323 = i3;
        c2311.f11319 = i4;
        C2401 c2401 = this.f10753;
        C2066 c2066 = c2401.f11835;
        while (!c2066.m3920()) {
            byte bM3925 = c2066.m3925();
            byte[] bArr = AbstractC1429.f6782;
            int i5 = bM3925 & 255;
            if (i5 == 128) {
                C0188.m804("index == 0");
                return null;
            }
            if ((bM3925 & 128) == 128) {
                int iM4444 = c2401.m4444(i5, 127);
                int i6 = iM4444 - 1;
                if (i6 >= 0) {
                    C1843[] c1843Arr = AbstractC1190.f5457;
                    if (i6 <= c1843Arr.length - 1) {
                        c2401.m4441(c1843Arr[i6]);
                    }
                }
                int length = c2401.f11834 + 1 + (i6 - AbstractC1190.f5457.length);
                if (length >= 0) {
                    C1843[] c1843Arr2 = c2401.f11829;
                    if (length < c1843Arr2.length) {
                        c2401.m4441(c1843Arr2[length]);
                    }
                }
                C0188.m804(AbstractC0897.m1989(iM4444, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C1843[] c1843Arr3 = AbstractC1190.f5457;
                C2534 c2534M4440 = c2401.m4440();
                AbstractC1190.m2394(c2534M4440);
                c2401.m4445(new C1843(c2534M4440, c2401.m4440()));
            } else if ((bM3925 & 64) == 64) {
                c2401.m4445(new C1843(c2401.m4443(c2401.m4444(i5, 63) - 1), c2401.m4440()));
            } else if ((bM3925 & 32) == 32) {
                int iM44442 = c2401.m4444(i5, 31);
                c2401.f11830 = iM44442;
                if (iM44442 < 0 || iM44442 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2401.f11830);
                }
                int i7 = c2401.f11828;
                if (iM44442 < i7) {
                    if (iM44442 == 0) {
                        C1843[] c1843Arr4 = c2401.f11829;
                        Arrays.fill(c1843Arr4, 0, c1843Arr4.length, (Object) null);
                        c2401.f11834 = c2401.f11829.length - 1;
                        c2401.f11832 = 0;
                        c2401.f11828 = 0;
                    } else {
                        c2401.m4442(i7 - iM44442);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C1843[] c1843Arr5 = AbstractC1190.f5457;
                C2534 c2534M44402 = c2401.m4440();
                AbstractC1190.m2394(c2534M44402);
                c2401.m4441(new C1843(c2534M44402, c2401.m4440()));
            } else {
                c2401.m4441(new C1843(c2401.m4443(c2401.m4444(i5, 15) - 1), c2401.m4440()));
            }
        }
        ArrayList arrayList = c2401.f11831;
        List listM3269 = AbstractC1595.m3269(arrayList);
        arrayList.clear();
        c2401.f11833 = 0L;
        return listM3269;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4179(C2025 c2025, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C0188.m804("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bM3925 = this.f10754.m3925();
            byte[] bArr = AbstractC1429.f6782;
            i4 = bM3925 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            C2066 c2066 = this.f10754;
            c2066.m3922();
            c2066.m3925();
            byte[] bArr2 = AbstractC1429.f6782;
            i -= 5;
        }
        List listM4178 = m4178(AbstractC0181.m742(i, i2, i4), i4, i2, i3);
        C0937 c0937 = c2025.f10099;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C0153.m694(c0937.f4310, c0937.f4299 + '[' + i3 + "] onHeaders", new C2052(c0937, i3, listM4178, z2));
            return;
        }
        synchronized (c0937) {
            C2521 c2521M2059 = c0937.m2059(i3);
            if (c2521M2059 != null) {
                c2521M2059.m4571(AbstractC0795.m1800(listM4178), z2);
                return;
            }
            if (c0937.f4295) {
                return;
            }
            if (i3 <= c0937.f4316) {
                return;
            }
            if (i3 % 2 == c0937.f4307 % 2) {
                return;
            }
            C2521 c2521 = new C2521(i3, c0937, false, z2, AbstractC0795.m1800(listM4178));
            c0937.f4316 = i3;
            c0937.f4317.put(Integer.valueOf(i3), c2521);
            C0153.m694(c0937.f4298.m510(), c0937.f4299 + '[' + i3 + "] onStream", new C1524(c0937, 4, c2521));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0113, code lost:
    
        r9.m4571(yyds.C1605.f8173, true);
     */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4180(C2025 c2025, int i, int i2, final int i3) throws IOException {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            C0188.m804("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            C0188.m804("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bM3925 = this.f10754.m3925();
            byte[] bArr = AbstractC1429.f6782;
            i4 = bM3925 & 255;
        } else {
            i4 = 0;
        }
        final int iM742 = AbstractC0181.m742(i, i2, i4);
        C2066 c2066 = this.f10754;
        final C0937 c0937 = c2025.f10099;
        if (!((i3 == 0 || (i3 & 1) != 0) ? false : z)) {
            C2521 c2521M2059 = c0937.m2059(i3);
            if (c2521M2059 != null) {
                TimeZone timeZone = AbstractC0795.f3653;
                C0719 c0719 = c2521M2059.f12441;
                long j = iM742;
                c0719.getClass();
                long j2 = j;
                while (true) {
                    C2521 c2521 = c0719.f3374;
                    if (j2 <= 0) {
                        TimeZone timeZone2 = AbstractC0795.f3653;
                        c2521.f12444.m2054(j);
                        c0719.f3374.f12444.f4303.getClass();
                        break;
                    }
                    synchronized (c2521) {
                        z2 = c0719.f3379;
                        z3 = c0719.f3378.f7087 + j2 > c0719.f3377;
                    }
                    if (z3) {
                        c2066.m3928(j2);
                        c0719.f3374.m4572(4);
                        break;
                    }
                    if (z2) {
                        c2066.m3928(j2);
                        break;
                    }
                    long jMo692 = c2066.mo692(j2, c0719.f3375);
                    if (jMo692 == -1) {
                        throw new EOFException();
                    }
                    j2 -= jMo692;
                    C2521 c25212 = c0719.f3374;
                    synchronized (c25212) {
                        try {
                            if (c0719.f3376) {
                                C1507 c1507 = c0719.f3375;
                                c1507.m3030(c1507.f7087);
                            } else {
                                C1507 c15072 = c0719.f3378;
                                boolean z5 = c15072.f7087 == 0;
                                c15072.m3034(c0719.f3375);
                                if (z5) {
                                    c25212.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                c2025.f10099.m2055(i3, 2);
                long j3 = iM742;
                c2025.f10099.m2054(j3);
                c2066.m3928(j3);
            }
        } else {
            final C1507 c15073 = new C1507();
            long j4 = iM742;
            c2066.m3926(j4);
            c2066.mo692(j4, c15073);
            C0153.m694(c0937.f4310, c0937.f4299 + '[' + i3 + "] onData", new InterfaceC2266(i3, c15073, iM742, z4) { // from class: yyds.ᛲᛸᛶᲈ

                /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
                public final /* synthetic */ C1507 f2157;

                /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
                public final /* synthetic */ int f2159;

                /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                public final /* synthetic */ int f2160;

                @Override // yyds.InterfaceC2266
                /* JADX INFO: renamed from: ᛲᲈᲁ */
                public final Object mo731() {
                    C0937 c09372 = this.f2158;
                    int i5 = this.f2160;
                    C1507 c15074 = this.f2157;
                    int i6 = this.f2159;
                    try {
                        c09372.f4296.getClass();
                        c15074.m3030(i6);
                        c09372.f4318.m920(i5, 9);
                        synchronized (c09372) {
                            c09372.f4297.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return C2746.f13459;
                }
            });
        }
        this.f10754.m3928(i4);
    }
}
