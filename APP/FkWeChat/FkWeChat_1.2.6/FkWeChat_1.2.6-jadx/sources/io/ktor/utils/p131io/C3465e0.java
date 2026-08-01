package io.ktor.utils.p131io;

import java.io.IOException;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6533b;

/* JADX INFO: renamed from: io.ktor.utils.io.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3465e0 implements InterfaceC3468g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5728w f9591b;
    private volatile C3481s closed;

    public C3465e0(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        this.f9591b = interfaceC5728w;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: a */
    public Throwable mo8540a() {
        C3481s c3481s = this.closed;
        if (c3481s != null) {
            return C3481s.m12994c(c3481s, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: c */
    public Object mo8541c(int i10, InterfaceC5976f interfaceC5976f) throws Throwable {
        Throwable thMo8540a = mo8540a();
        if (thMo8540a == null) {
            return AbstractC6533b.m25845a(this.f9591b.mo23110i(i10));
        }
        throw thMo8540a;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: e */
    public InterfaceC5728w mo8542e() throws Throwable {
        Throwable thMo8540a = mo8540a();
        if (thMo8540a == null) {
            return this.f9591b.mo23102b();
        }
        throw thMo8540a;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: g */
    public void mo8543g(Throwable th) {
        String message;
        if (this.closed != null) {
            return;
        }
        this.f9591b.close();
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C3481s(new IOException(message, th));
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: h */
    public boolean mo8544h() {
        return this.f9591b.mo23108g();
    }
}
