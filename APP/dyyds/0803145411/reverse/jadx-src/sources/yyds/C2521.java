package yyds;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᲇᲀᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2521 implements InterfaceC2295 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f12432;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final ArrayDeque f12433;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C1646 f12434;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f12435;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2206 f12436;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public IOException f12437;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f12438;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C1856 f12439;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C1646 f12440;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0719 f12441;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12442;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f12443;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0937 f12444;

    public C2521(int i, C0937 c0937, boolean z, boolean z2, C1605 c1605) {
        this.f12442 = i;
        this.f12444 = c0937;
        this.f12436 = new C2206(i);
        this.f12438 = c0937.f4301.m3416();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12433 = arrayDeque;
        this.f12441 = new C0719(this, c0937.f4313.m3416(), z2);
        this.f12439 = new C1856(this, z);
        this.f12440 = new C1646(this);
        this.f12434 = new C1646(this);
        if (c1605 == null) {
            if (m4565()) {
                return;
            }
            C0188.m800("remotely-initiated streams should have headers");
            throw null;
        }
        if (m4565()) {
            C0188.m800("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c1605);
    }

    @Override // yyds.InterfaceC2295
    public final InterfaceC1590 getSource() {
        return this.f12441;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m4565() {
        boolean z = (this.f12442 & 1) == 1;
        this.f12444.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean m4566() {
        synchronized (this) {
            try {
                if (m4570() != 0) {
                    return false;
                }
                C0719 c0719 = this.f12441;
                if (c0719.f3379 || c0719.f3376) {
                    C1856 c1856 = this.f12439;
                    if (c1856.f9335 || c1856.f9334) {
                        if (this.f12435) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m4567(int i, IOException iOException) {
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (this) {
            if (m4570() != 0) {
                return false;
            }
            this.f12432 = i;
            this.f12437 = iOException;
            notifyAll();
            if (this.f12441.f3379) {
                if (this.f12439.f9335) {
                    return false;
                }
            }
            this.f12444.m2056(this.f12442);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4568() {
        boolean z;
        boolean zM4566;
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (this) {
            try {
                C0719 c0719 = this.f12441;
                if (c0719.f3379 || !c0719.f3376) {
                    z = false;
                } else {
                    C1856 c1856 = this.f12439;
                    if (c1856.f9335 || c1856.f9334) {
                        z = true;
                    }
                }
                zM4566 = m4566();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m4573(9, null);
        } else {
            if (zM4566) {
                return;
            }
            this.f12444.m2056(this.f12442);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4569() throws IOException {
        C1856 c1856 = this.f12439;
        if (c1856.f9334) {
            C0188.m804("stream closed");
            return;
        }
        if (c1856.f9335) {
            C0188.m804("stream finished");
        } else if (m4570() != 0) {
            IOException iOException = this.f12437;
            if (iOException == null) {
                throw new C2601(m4570());
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int m4570() {
        int i;
        synchronized (this) {
            i = this.f12432;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4571(C1605 c1605, boolean z) {
        boolean zM4566;
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (this) {
            try {
                if (this.f12435 && c1605.m3306(":status") == null && c1605.m3306(":method") == null) {
                    this.f12441.getClass();
                } else {
                    this.f12435 = true;
                    this.f12433.add(c1605);
                }
                if (z) {
                    this.f12441.f3379 = true;
                }
                zM4566 = m4566();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM4566) {
            return;
        }
        this.f12444.m2056(this.f12442);
    }

    @Override // yyds.InterfaceC2295
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final InterfaceC1979 mo952() {
        return this.f12439;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4572(int i) {
        if (m4567(i, null)) {
            this.f12444.m2055(this.f12442, i);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4573(int i, IOException iOException) {
        if (m4567(i, iOException)) {
            this.f12444.f4318.m920(this.f12442, i);
        }
    }
}
