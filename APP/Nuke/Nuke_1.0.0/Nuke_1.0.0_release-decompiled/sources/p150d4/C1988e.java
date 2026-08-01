package p150d4;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p117X2.AbstractC1665j;
import p118X3.C1707q;
import p118X3.C1709s;
import p123Y3.AbstractC1776g;
import p208n4.C2706e;

/* JADX INFO: renamed from: d4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1988e extends AbstractC1985b {

    /* JADX INFO: renamed from: h */
    public long f6686h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1991h f6687i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988e(C1991h c1991h, C1709s c1709s, long j5) {
        super(c1991h, c1709s);
        AbstractC1665j.m2985e(c1709s, "url");
        this.f6687i = c1991h;
        this.f6686h = j5;
        if (j5 == 0) {
            m3662b(C1707q.f5858e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM3179f;
        if (this.f6678f) {
            return;
        }
        if (this.f6686h != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC1776g.f6076a;
            AbstractC1665j.m2985e(timeUnit, "timeUnit");
            try {
                zM3179f = AbstractC1776g.m3179f(this, 100);
            } catch (IOException unused) {
                zM3179f = false;
            }
            if (!zM3179f) {
                this.f6687i.f6694b.mo3333h();
                m3662b(C1991h.f6692f);
            }
        }
        this.f6678f = true;
    }

    @Override // p150d4.AbstractC1985b, p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        AbstractC1665j.m2985e(c2706e, "sink");
        if (this.f6678f) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f6686h;
        if (j6 == 0) {
            return -1L;
        }
        long jMo554y = super.mo554y(c2706e, Math.min(j6, 8192L));
        if (jMo554y == -1) {
            this.f6687i.f6694b.mo3333h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m3662b(C1991h.f6692f);
            throw protocolException;
        }
        long j7 = this.f6686h - jMo554y;
        this.f6686h = j7;
        if (j7 == 0) {
            m3662b(C1707q.f5858e);
        }
        return jMo554y;
    }
}
