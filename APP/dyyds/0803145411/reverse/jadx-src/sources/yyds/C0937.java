package yyds;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᛴᲀᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937 implements Closeable {

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final C1670 f4293;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public long f4294;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f4295;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0469 f4296;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final LinkedHashSet f4297;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0105 f4298;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f4299;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final C0644 f4300;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C1670 f4301;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public long f4302;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final C1601 f4303;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final C2025 f4304;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public long f4305;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public long f4306;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f4307;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public long f4308;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final C2206 f4309;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0153 f4310;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C0153 f4311;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0153 f4312;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final C1670 f4313;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC2165 f4314;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public long f4315;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f4316;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final LinkedHashMap f4317 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final C0276 f4318;

    static {
        C1670 c1670 = new C1670();
        c1670.m3417(4, 65535);
        c1670.m3417(5, 16384);
        f4293 = c1670;
    }

    public C0937(C1633 c1633) {
        this.f4314 = (AbstractC2165) c1633.f8334;
        String str = (String) c1633.f8331;
        this.f4299 = str == null ? null : str;
        this.f4307 = 3;
        C0105 c0105 = (C0105) c1633.f8333;
        this.f4298 = c0105;
        this.f4312 = c0105.m510();
        this.f4310 = c0105.m510();
        this.f4311 = c0105.m510();
        this.f4296 = C0469.f2329;
        this.f4303 = (C1601) c1633.f8332;
        C1670 c1670 = new C1670();
        c1670.m3417(4, 16777216);
        this.f4313 = c1670;
        this.f4301 = f4293;
        this.f4309 = new C2206(0);
        this.f4305 = r0.m3416();
        C0644 c0644 = (C0644) c1633.f8335;
        C0644 c06442 = c0644 != null ? c0644 : null;
        this.f4300 = c06442;
        this.f4318 = new C0276((C2776) c06442.f3101);
        this.f4304 = new C2025(this, new C2188((C2066) c06442.f3102));
        this.f4297 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2052(1, 9, null);
    }

    public final void flush() {
        this.f4318.flush();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2052(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        TimeZone timeZone = AbstractC0795.f3653;
        try {
            m2057(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4317.isEmpty()) {
                array = null;
            } else {
                array = this.f4317.values().toArray(new C2521[0]);
                this.f4317.clear();
            }
        }
        C2521[] c2521Arr = (C2521[]) array;
        if (c2521Arr != null) {
            for (C2521 c2521 : c2521Arr) {
                try {
                    c2521.m4573(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4318.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C0299) this.f4300.f3099).f1577).close();
        } catch (IOException unused4) {
        }
        this.f4312.m695();
        this.f4310.m695();
        this.f4311.m695();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m2053(final int i, final long j) {
        C0153.m694(this.f4312, this.f4299 + '[' + i + "] windowUpdate", new InterfaceC2266() { // from class: yyds.ᲀᛵᛷᛸ
            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final Object mo731() {
                C0937 c0937 = this.f10064;
                try {
                    c0937.f4318.m918(i, j);
                } catch (IOException e) {
                    c0937.m2052(2, 2, e);
                }
                return C2746.f13459;
            }
        });
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m2054(long j) {
        synchronized (this) {
            try {
                C2206.m4192(this.f4309, j, 0L, 2);
                long jM4194 = this.f4309.m4194();
                if (jM4194 >= this.f4313.m3416() / 2) {
                    m2053(0, jM4194);
                    C2206.m4192(this.f4309, 0L, jM4194, 1);
                }
                this.f4303.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m2055(int i, int i2) {
        C0153.m694(this.f4312, this.f4299 + '[' + i + "] writeSynReset", new C2190(this, i, i2, 0));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2521 m2056(int i) {
        C2521 c2521;
        synchronized (this) {
            c2521 = (C2521) this.f4317.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c2521;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m2057(int i) {
        synchronized (this.f4318) {
            synchronized (this) {
                if (this.f4295) {
                    return;
                }
                this.f4295 = true;
                this.f4318.m922(AbstractC1429.f6782, this.f4316, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4318.f1481);
        r6 = r2;
        r8.f4308 += r6;
     */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2058(int i, boolean z, C1507 c1507, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.f4318.m924(z, i, c1507, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f4308;
                            long j4 = this.f4305;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f4317.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.f4318.m924(z && j == 0, i, c1507, iMin);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2521 m2059(int i) {
        C2521 c2521;
        synchronized (this) {
            c2521 = (C2521) this.f4317.get(Integer.valueOf(i));
        }
        return c2521;
    }
}
