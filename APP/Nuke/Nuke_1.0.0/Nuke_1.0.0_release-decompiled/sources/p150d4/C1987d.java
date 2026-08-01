package p150d4;

import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p000A.C0072l0;
import p117X2.AbstractC1665j;
import p118X3.C1709s;
import p123Y3.AbstractC1776g;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p208n4.C2706e;
import p208n4.C2716o;

/* JADX INFO: renamed from: d4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1987d extends AbstractC1985b {

    /* JADX INFO: renamed from: h */
    public long f6683h;

    /* JADX INFO: renamed from: i */
    public boolean f6684i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1991h f6685j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1987d(C1991h c1991h, C1709s c1709s) {
        super(c1991h, c1709s);
        AbstractC1665j.m2985e(c1709s, "url");
        this.f6685j = c1991h;
        this.f6683h = -1L;
        this.f6684i = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM3179f;
        if (this.f6678f) {
            return;
        }
        if (this.f6684i) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC1776g.f6076a;
            AbstractC1665j.m2985e(timeUnit, "timeUnit");
            try {
                zM3179f = AbstractC1776g.m3179f(this, 100);
            } catch (IOException unused) {
                zM3179f = false;
            }
            if (!zM3179f) {
                this.f6685j.f6694b.mo3333h();
                m3662b(C1991h.f6692f);
            }
        }
        this.f6678f = true;
    }

    @Override // p150d4.AbstractC1985b, p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        long j6;
        byte bM4721n;
        C1991h c1991h = this.f6685j;
        C0072l0 c0072l0 = c1991h.f6695c;
        AbstractC1665j.m2985e(c2706e, "sink");
        if (this.f6678f) {
            throw new IllegalStateException("closed");
        }
        long j7 = -1;
        if (!this.f6684i) {
            return -1L;
        }
        long j8 = this.f6683h;
        if (j8 == 0 || j8 == -1) {
            if (j8 != -1) {
                ((C2716o) c0072l0.f308f).mo4722o(Long.MAX_VALUE);
            }
            try {
                C2716o c2716o = (C2716o) c0072l0.f308f;
                C2706e c2706e2 = c2716o.f8651e;
                c2716o.mo4727u(1L);
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    j6 = j7;
                    if (!c2716o.m4756f(i6)) {
                        break;
                    }
                    bM4721n = c2706e2.m4721n(i5);
                    if ((bM4721n < 48 || bM4721n > 57) && ((bM4721n < 97 || bM4721n > 102) && (bM4721n < 65 || bM4721n > 70))) {
                        break;
                    }
                    j7 = j6;
                    i5 = i6;
                }
                if (i5 == 0) {
                    AbstractC1926h.m3565h(16);
                    String string = Integer.toString(bM4721n, 16);
                    AbstractC1665j.m2984d(string, "toString(...)");
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                }
                this.f6683h = c2706e2.m4729w();
                String string2 = AbstractC1976d.m3647o0(((C2716o) c0072l0.f308f).mo4722o(Long.MAX_VALUE)).toString();
                if (this.f6683h < 0 || (string2.length() > 0 && !AbstractC1983k.m3656S(string2, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6683h + string2 + '\"');
                }
                if (this.f6683h == 0) {
                    this.f6684i = false;
                    m3662b(c1991h.f6697e.m3661c());
                }
                if (!this.f6684i) {
                    return j6;
                }
            } catch (NumberFormatException e5) {
                throw new ProtocolException(e5.getMessage());
            }
        } else {
            j6 = -1;
        }
        long jMo554y = super.mo554y(c2706e, Math.min(8192L, this.f6683h));
        if (jMo554y != j6) {
            this.f6683h -= jMo554y;
            return jMo554y;
        }
        c1991h.f6694b.mo3333h();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m3662b(C1991h.f6692f);
        throw protocolException;
    }
}
