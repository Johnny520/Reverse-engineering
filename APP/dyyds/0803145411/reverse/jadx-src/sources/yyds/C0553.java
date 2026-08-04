package yyds;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛳᛳᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0553 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2534 f2643 = new C2534(Arrays.copyOf(new byte[]{42}, 1));

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final List f2644 = Collections.singletonList("*");

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0553 f2645 = new C0553(new C1521(1));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1521 f2646;

    public C0553(C1521 c1521) {
        this.f2646 = c1521;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static List m1400(String str) {
        List listM1306 = AbstractC0473.m1306(str, new char[]{'.'});
        return AbstractC1544.m3188(AbstractC1595.m3263(listM1306), "") ? AbstractC1595.m3277(listM1306) : listM1306;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m1401(String str) {
        String strM2012;
        String strM20122;
        String strM20123;
        List listM1306;
        int size;
        int size2;
        List listM1400 = m1400(IDN.toUnicode(str));
        C1521 c1521 = this.f2646;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c1521.f7342;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c1521.f7344).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        c1521.m3146();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    c1521.f7341 = e;
                    if (z) {
                    }
                }
            }
        }
        if (((C2534) c1521.f7340) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c1521.f7339);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c1521.f7341);
            throw illegalStateException;
        }
        int size3 = listM1400.size();
        C2534[] c2534Arr = new C2534[size3];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listM1400.get(i);
            C2534 c2534 = new C2534(str2.getBytes(AbstractC0347.f1806));
            c2534.f12476 = str2;
            c2534Arr[i] = c2534;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strM2012 = null;
                break;
            }
            C2534 c25342 = (C2534) c1521.f7340;
            if (c25342 == null) {
                c25342 = null;
            }
            strM2012 = AbstractC0902.m2012(c25342, c2534Arr, i2);
            if (strM2012 != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            C2534[] c2534Arr2 = (C2534[]) c2534Arr.clone();
            int length = c2534Arr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                c2534Arr2[i3] = f2643;
                C2534 c25343 = (C2534) c1521.f7340;
                if (c25343 == null) {
                    c25343 = null;
                }
                strM20122 = AbstractC0902.m2012(c25343, c2534Arr2, i3);
                if (strM20122 != null) {
                    break;
                }
            }
            strM20122 = null;
        } else {
            strM20122 = null;
        }
        if (strM20122 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                C2534 c25344 = (C2534) c1521.f7343;
                if (c25344 == null) {
                    c25344 = null;
                }
                strM20123 = AbstractC0902.m2012(c25344, c2534Arr, i5);
                if (strM20123 != null) {
                    break;
                }
            }
            strM20123 = null;
        } else {
            strM20123 = null;
        }
        if (strM20123 != null) {
            listM1306 = AbstractC0473.m1306("!".concat(strM20123), new char[]{'.'});
        } else if (strM2012 == null && strM20122 == null) {
            listM1306 = f2644;
        } else {
            List listM13062 = C1860.f9345;
            List listM13063 = strM2012 != null ? AbstractC0473.m1306(strM2012, new char[]{'.'}) : listM13062;
            if (strM20122 != null) {
                listM13062 = AbstractC0473.m1306(strM20122, new char[]{'.'});
            }
            listM1306 = listM13063.size() > listM13062.size() ? listM13063 : listM13062;
        }
        if (listM1400.size() == listM1306.size() && ((String) listM1306.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM1306.get(0)).charAt(0) == '!') {
            size = listM1400.size();
            size2 = listM1306.size();
        } else {
            size = listM1400.size();
            size2 = listM1306.size() + 1;
        }
        int i6 = size - size2;
        InterfaceC1240 c0558 = new C0558(1, m1400(str));
        if (i6 < 0) {
            C1693.m3439("Requested element count ", i6, " is less than zero.");
            return null;
        }
        if (i6 != 0) {
            c0558 = c0558 instanceof InterfaceC2375 ? ((InterfaceC2375) c0558).mo993(i6) : new C0320(c0558, i6);
        }
        return AbstractC1529.m3156(c0558, ".");
    }
}
