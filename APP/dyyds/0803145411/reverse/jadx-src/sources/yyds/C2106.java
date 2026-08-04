package yyds;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᲀᲇᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2106 implements InterfaceC1028 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1864 f10436;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0105 f10438;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f10434 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f10437 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final LinkedBlockingDeque f10435 = new LinkedBlockingDeque();

    public C2106(C1864 c1864, C0105 c0105) {
        this.f10436 = c1864;
        this.f10438 = c0105;
    }

    @Override // yyds.InterfaceC1028
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final C1864 mo2232() {
        return this.f10436;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4022() {
        CopyOnWriteArrayList<InterfaceC2144> copyOnWriteArrayList = this.f10437;
        for (InterfaceC2144 interfaceC2144 : copyOnWriteArrayList) {
            interfaceC2144.cancel();
            InterfaceC2144 interfaceC2144Mo2228 = interfaceC2144.mo2228();
            if (interfaceC2144Mo2228 != null) {
                this.f10436.f9361.addLast(interfaceC2144Mo2228);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2695 m4023() {
        InterfaceC2144 c1025;
        C1864 c1864 = this.f10436;
        if (c1864.m3640(null)) {
            try {
                c1025 = c1864.m3641();
            } catch (Throwable th) {
                c1025 = new C1025(th);
            }
            if (c1025.mo2227()) {
                return new C2695(c1025, null, null, 6);
            }
            if (c1025 instanceof C1025) {
                return ((C1025) c1025).f4674;
            }
            this.f10437.add(c1025);
            this.f10438.m510().m697(new C0063(AbstractC0795.f3654 + " connect " + c1864.f9351.f8234.m479(), c1025, this), 0L);
        }
        return null;
    }

    @Override // yyds.InterfaceC1028
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2723 mo2233() throws IOException {
        C2695 c2695M4023;
        long j;
        C2695 c2695;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f10437.isEmpty() && !this.f10436.m3640(null)) {
                    throw iOException;
                }
                if (this.f10436.f9357.f13422) {
                    throw new IOException("Canceled");
                }
                C2014 c2014 = this.f10438.f742;
                long jNanoTime = System.nanoTime();
                long j2 = this.f10434 - jNanoTime;
                if (this.f10437.isEmpty() || j2 <= 0) {
                    c2695M4023 = m4023();
                    j = 250000000;
                    this.f10434 = jNanoTime + 250000000;
                } else {
                    j = j2;
                    c2695M4023 = null;
                }
                if (c2695M4023 == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f10437;
                    if (copyOnWriteArrayList.isEmpty() || (c2695 = (C2695) this.f10435.poll(j, timeUnit)) == null) {
                        c2695M4023 = null;
                    } else {
                        copyOnWriteArrayList.remove(c2695.f13244);
                        c2695M4023 = c2695;
                    }
                    if (c2695M4023 == null) {
                    }
                }
                boolean z = false;
                if (c2695M4023.f13245 == null && c2695M4023.f13246 == null) {
                    m4022();
                    if (!c2695M4023.f13244.mo2227()) {
                        c2695M4023 = c2695M4023.f13244.mo2229();
                    }
                    if (c2695M4023.f13245 == null && c2695M4023.f13246 == null) {
                        z = true;
                    }
                    if (z) {
                        return c2695M4023.f13244.mo2231();
                    }
                }
                Throwable th = c2695M4023.f13246;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC1579.m3235(iOException, th);
                    }
                }
                InterfaceC2144 interfaceC2144 = c2695M4023.f13245;
                if (interfaceC2144 != null) {
                    this.f10436.f9361.addFirst(interfaceC2144);
                }
            } finally {
                m4022();
            }
        }
    }
}
