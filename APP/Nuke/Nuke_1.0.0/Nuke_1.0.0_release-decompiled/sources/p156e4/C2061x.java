package p156e4;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p000A.C0099z;
import p011B4.AbstractC0231b;
import p133a4.C1807c;
import p208n4.C2703b;

/* JADX INFO: renamed from: e4.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2061x extends C2703b {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C2062y f6896n;

    public C2061x(C2062y c2062y) {
        this.f6896n = c2062y;
    }

    @Override // p208n4.C2703b
    /* JADX INFO: renamed from: j */
    public final IOException mo3767j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // p208n4.C2703b
    /* JADX INFO: renamed from: k */
    public final void mo3347k() {
        this.f6896n.m3773e(EnumC2039b.f6789k);
        C2054q c2054q = this.f6896n.f6898e;
        synchronized (c2054q) {
            long j5 = c2054q.f6859q;
            long j6 = c2054q.f6858p;
            if (j5 < j6) {
                return;
            }
            c2054q.f6858p = j6 + 1;
            c2054q.f6860r = System.nanoTime() + ((long) 1000000000);
            C1807c.m3275b(c2054q.f6853k, AbstractC0231b.m403n(new StringBuilder(), c2054q.f6848f, " ping"), new C0099z(20, c2054q));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3768l() {
        if (m4697i()) {
            throw mo3767j(null);
        }
    }
}
