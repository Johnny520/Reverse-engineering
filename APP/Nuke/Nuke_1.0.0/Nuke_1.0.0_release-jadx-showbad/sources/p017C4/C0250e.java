package p017C4;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p005A4.InterfaceC0162b;
import p011B4.C0230a;
import p011B4.C0232c;

/* JADX INFO: renamed from: C4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0250e implements InterfaceC0162b {

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC0162b f829d;

    /* JADX INFO: renamed from: e */
    public Boolean f830e;

    /* JADX INFO: renamed from: f */
    public Method f831f;

    /* JADX INFO: renamed from: g */
    public C0230a f832g;

    /* JADX INFO: renamed from: h */
    public final Queue f833h;

    /* JADX INFO: renamed from: i */
    public final boolean f834i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0250e(LinkedBlockingQueue linkedBlockingQueue, boolean z5) {
        this.f833h = linkedBlockingQueue;
        this.f834i = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: a */
    public final boolean mo229a() {
        return m455i().mo229a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: b */
    public final boolean mo230b() {
        return m455i().mo230b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: c */
    public final void mo231c(String str, Throwable th) {
        m455i().mo231c(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: d */
    public final boolean mo232d() {
        return m455i().mo232d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: e */
    public final boolean mo233e(int i5) {
        return m455i().mo233e(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0250e.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: f */
    public final boolean mo234f() {
        return m455i().mo234f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: g */
    public final void mo235g(String str) {
        m455i().mo235g(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: h */
    public final boolean mo236h() {
        return m455i().mo236h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return 732274226;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final InterfaceC0162b m455i() {
        if (this.f829d != null) {
            return this.f829d;
        }
        if (this.f834i) {
            return C0247b.f824d;
        }
        if (this.f832g == null) {
            Queue queue = this.f833h;
            C0230a c0230a = new C0230a();
            c0230a.f781d = this;
            c0230a.f782e = queue;
            this.f832g = c0230a;
        }
        return this.f832g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m456j() {
        Boolean bool = this.f830e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f831f = this.f829d.getClass().getMethod("log", C0232c.class);
            this.f830e = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f830e = Boolean.FALSE;
        }
        return this.f830e.booleanValue();
    }
}
