package p034c7;

import ec.InterfaceC2125e0;
import io.ktor.util.internal.AbstractC3449a;
import p282t7.C8174a;

/* JADX INFO: renamed from: c7.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358c0 extends IllegalStateException implements InterfaceC2125e0 {

    /* JADX INFO: renamed from: q */
    public final C8174a f4021q;

    public C1358c0(C8174a c8174a) {
        c8174a.getClass();
        this.f4021q = c8174a;
    }

    @Override // ec.InterfaceC2125e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1358c0 mo5383a() {
        C1358c0 c1358c0 = new C1358c0(this.f4021q);
        AbstractC3449a.m12862a(c1358c0, this);
        return c1358c0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Application plugin " + this.f4021q.m31825a() + " is not installed";
    }
}
