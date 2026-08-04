package yyds;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: yyds.ᛳᛸᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655 extends AbstractC0149 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f3141;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0157 f3142;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f3143;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0655(C0157 c0157, C0082 c0082) {
        super(c0157, c0082);
        this.f3142 = c0157;
        this.f3143 = -1L;
        this.f3141 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM1805;
        if (this.f928) {
            return;
        }
        if (this.f3141) {
            try {
                zM1805 = AbstractC0795.m1805(this, 100);
            } catch (IOException unused) {
                zM1805 = false;
            }
            if (!zM1805) {
                this.f3142.f966.mo3290();
                m691(C0157.f963);
            }
        }
        this.f928 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r16.f3141 == false) goto L46;
     */
    @Override // yyds.AbstractC0149, yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo692(long j, C1507 c1507) throws IOException {
        byte bM3038;
        C0157 c0157 = this.f3142;
        C0644 c0644 = c0157.f967;
        if (this.f928) {
            C0188.m800("closed");
            return 0L;
        }
        if (this.f3141) {
            long j2 = this.f3143;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((C2066) c0644.f3102).m3921(Long.MAX_VALUE);
                }
                try {
                    C2066 c2066 = (C2066) c0644.f3102;
                    C1507 c15072 = c2066.f10220;
                    c2066.m3926(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!c2066.m3924(i2)) {
                            break;
                        }
                        bM3038 = c15072.m3038(i);
                        if ((bM3038 < 48 || bM3038 > 57) && ((bM3038 < 97 || bM3038 > 102) && (bM3038 < 65 || bM3038 > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        AbstractC1741.m3477(16);
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM3038, 16)));
                    }
                    this.f3143 = c15072.m3024();
                    String string = AbstractC0473.m1314(((C2066) c0644.f3102).m3921(Long.MAX_VALUE)).toString();
                    if (this.f3143 < 0 || (string.length() > 0 && !string.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3143 + string + '\"');
                    }
                    if (this.f3143 == 0) {
                        this.f3141 = false;
                        m691(c0157.f964.m3354());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo692 = super.mo692(Math.min(8192L, this.f3143), c1507);
            if (jMo692 != -1) {
                this.f3143 -= jMo692;
                return jMo692;
            }
            c0157.f966.mo3290();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m691(C0157.f963);
            throw protocolException;
        }
        return -1L;
    }
}
