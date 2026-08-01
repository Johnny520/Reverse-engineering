package p302ue;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C5823a;
import org.luckypray.dexkit.DexKitBridge;
import p010a9.InterfaceC0173a;
import p172l8.C4700i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ue.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8680d {

    /* JADX INFO: renamed from: a */
    public final String f28782a;

    /* JADX INFO: renamed from: b */
    public final C5823a.e f28783b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f28784c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0173a f28785d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0173a f28786e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0173a f28787f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0173a f28788g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0173a f28789h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f28790i;

    /* JADX INFO: renamed from: j */
    public final Object f28791j;

    /* JADX INFO: renamed from: k */
    public int f28792k;

    /* JADX INFO: renamed from: l */
    public long f28793l;

    /* JADX INFO: renamed from: m */
    public boolean f28794m;

    /* JADX INFO: renamed from: n */
    public ScheduledFuture f28795n;

    /* JADX INFO: renamed from: o */
    public volatile DexKitBridge f28796o;

    public C8680d(String str, C5823a.e eVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5) {
        str.getClass();
        eVar.getClass();
        scheduledThreadPoolExecutor.getClass();
        interfaceC0173a.getClass();
        interfaceC0173a2.getClass();
        interfaceC0173a3.getClass();
        interfaceC0173a4.getClass();
        interfaceC0173a5.getClass();
        this.f28782a = str;
        this.f28783b = eVar;
        this.f28784c = scheduledThreadPoolExecutor;
        this.f28785d = interfaceC0173a;
        this.f28786e = interfaceC0173a2;
        this.f28787f = interfaceC0173a3;
        this.f28788g = interfaceC0173a4;
        this.f28789h = interfaceC0173a5;
        this.f28790i = new AtomicBoolean(false);
        this.f28791j = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m33340a(C8680d c8680d, long j10) {
        c8680d.getClass();
        synchronized (c8680d.f28791j) {
            if (c8680d.m33352m()) {
                return;
            }
            if (c8680d.f28792k != 0) {
                return;
            }
            if (c8680d.f28793l != j10) {
                return;
            }
            c8680d.f28795n = null;
            if (c8680d.f28794m) {
                return;
            }
            C8678b c8678b = C8678b.f28775a;
            if (c8678b.m33337e(c8680d.f28782a, c8680d.f28783b) && !c8680d.m33352m()) {
                boolean zM33354o = c8680d.m33354o();
                c8678b.m33335c(c8680d.f28782a, c8680d.f28783b);
                if (zM33354o) {
                    c8680d.f28788g.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33348i() {
        synchronized (this.f28791j) {
            try {
                m33351l();
                this.f28793l++;
                ScheduledFuture scheduledFuture = this.f28795n;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f28795n = null;
                this.f28792k++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m33349j() {
        boolean zM33354o;
        synchronized (this.f28791j) {
            try {
                m33351l();
                this.f28793l++;
                ScheduledFuture scheduledFuture = this.f28795n;
                zM33354o = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f28795n = null;
                if (this.f28792k == 0) {
                    this.f28794m = false;
                    zM33354o = m33354o();
                    m33353n();
                } else {
                    this.f28794m = true;
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM33354o) {
            this.f28788g.invoke();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33350k() {
        boolean zM33354o;
        synchronized (this.f28791j) {
            try {
                int i10 = this.f28792k;
                if (i10 <= 0) {
                    throw new IllegalStateException("activeCalls underflow");
                }
                int i11 = i10 - 1;
                this.f28792k = i11;
                if (i11 != 0) {
                    return;
                }
                if (m33352m()) {
                    zM33354o = m33354o();
                } else if (this.f28794m) {
                    this.f28794m = false;
                    zM33354o = m33354o();
                    m33353n();
                } else {
                    m33355p();
                    zM33354o = false;
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (zM33354o) {
                    this.f28788g.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m33351l() {
        if (m33352m()) {
            C10010p0.m38820a("RecyclableBridge is destroyed");
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m33352m() {
        return this.f28790i.get();
    }

    /* JADX INFO: renamed from: n */
    public final void m33353n() {
        if (m33352m()) {
            C8678b.f28775a.m33337e(this.f28782a, this.f28783b);
        } else {
            C8678b.f28775a.m33333a(this.f28782a, this.f28783b);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33354o() {
        DexKitBridge dexKitBridge = this.f28796o;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.f28796o = null;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m33355p() {
        final long j10 = this.f28793l;
        this.f28795n = this.f28784c.schedule(new Runnable() { // from class: ue.c
            @Override // java.lang.Runnable
            public final void run() {
                C8680d.m33340a(this.f28780q, j10);
            }
        }, ((Number) this.f28785d.invoke()).longValue(), TimeUnit.MILLISECONDS);
    }
}
