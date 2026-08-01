package p083fc;

import android.os.Handler;
import android.os.Looper;
import ec.AbstractC2210z1;
import ec.C2122d1;
import ec.C2147j2;
import ec.InterfaceC2126e1;
import ec.InterfaceC2156m;
import ec.InterfaceC2201x0;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p172l8.C4700i0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: fc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2418f extends AbstractC2419g implements InterfaceC2201x0 {

    /* JADX INFO: renamed from: s */
    public final Handler f6551s;

    /* JADX INFO: renamed from: t */
    public final String f6552t;

    /* JADX INFO: renamed from: u */
    public final boolean f6553u;

    /* JADX INFO: renamed from: v */
    public final C2418f f6554v;

    public C2418f(Handler handler, String str, boolean z10) {
        super(null);
        this.f6551s = handler;
        this.f6552t = str;
        this.f6553u = z10;
        this.f6554v = z10 ? this : new C2418f(handler, str, true);
    }

    /* JADX INFO: renamed from: M0 */
    public static void m8708M0(InterfaceC2156m interfaceC2156m, C2418f c2418f) {
        interfaceC2156m.mo7831O(c2418f, C4700i0.f13910a);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m8709N0(C2418f c2418f, Runnable runnable) {
        c2418f.f6551s.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: O0 */
    public static C4700i0 m8710O0(C2418f c2418f, Runnable runnable, Throwable th) {
        c2418f.f6551s.removeCallbacks(runnable);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m8712P0(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        AbstractC2210z1.m7951d(interfaceC5980j, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2122d1.m7727b().mo7807x(interfaceC5980j, runnable);
    }

    @Override // ec.AbstractC2135g2
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2418f mo7754q0() {
        return this.f6554v;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: V */
    public boolean mo7821V(InterfaceC5980j interfaceC5980j) {
        return (this.f6553u && AbstractC1061t.m3842c(Looper.myLooper(), this.f6551s.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2418f)) {
            return false;
        }
        C2418f c2418f = (C2418f) obj;
        return c2418f.f6551s == this.f6551s && c2418f.f6553u == this.f6553u;
    }

    public int hashCode() {
        return System.identityHashCode(this.f6551s) ^ (this.f6553u ? 1231 : 1237);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: k */
    public InterfaceC2126e1 mo7800k(long j10, final Runnable runnable, InterfaceC5980j interfaceC5980j) {
        if (this.f6551s.postDelayed(runnable, AbstractC2368o.m8583j(j10, 4611686018427387903L))) {
            return new InterfaceC2126e1() { // from class: fc.e
                @Override // ec.InterfaceC2126e1
                /* JADX INFO: renamed from: a */
                public final void mo7628a() {
                    C2418f.m8709N0(this.f6549q, runnable);
                }
            };
        }
        m8712P0(interfaceC5980j, runnable);
        return C2147j2.f5979q;
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: m */
    public void mo7803m(long j10, final InterfaceC2156m interfaceC2156m) {
        final Runnable runnable = new Runnable() { // from class: fc.c
            @Override // java.lang.Runnable
            public final void run() {
                C2418f.m8708M0(interfaceC2156m, this);
            }
        };
        if (this.f6551s.postDelayed(runnable, AbstractC2368o.m8583j(j10, 4611686018427387903L))) {
            interfaceC2156m.mo7830B(new InterfaceC0184l() { // from class: fc.d
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C2418f.m8710O0(this.f6547q, runnable, (Throwable) obj);
                }
            });
        } else {
            m8712P0(interfaceC2156m.getContext(), runnable);
        }
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        String strM7752E0 = m7752E0();
        if (strM7752E0 != null) {
            return strM7752E0;
        }
        String string = this.f6552t;
        if (string == null) {
            string = this.f6551s.toString();
        }
        if (!this.f6553u) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        if (this.f6551s.post(runnable)) {
            return;
        }
        m8712P0(interfaceC5980j, runnable);
    }

    public /* synthetic */ C2418f(Handler handler, String str, int i10, AbstractC1043k abstractC1043k) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C2418f(Handler handler, String str) {
        this(handler, str, false);
    }
}
