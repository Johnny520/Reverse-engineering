package p036;

import androidx.appcompat.app.C0955;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import p020.C6921;
import p020.C6928;
import p023.C6978;
import p029.AbstractC7059;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7117 extends AbstractC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C7120 f17703;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7117(C7120 c7120, C6978 c6978) {
        super(c7120, c6978);
        c6978.getClass();
        this.f17703 = c7120;
        this.f17701 = -1L;
        this.f17702 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM12259;
        if (this.f17709) {
            return;
        }
        if (this.f17702) {
            TimeZone timeZone = AbstractC7059.f17512;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM12259 = AbstractC7059.m12259(this, 100);
            } catch (IOException unused) {
                zM12259 = false;
            }
            if (!zM12259) {
                this.f17703.f17715.mo12180();
                m12376(C7120.f17711);
            }
        }
        this.f17709 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.f17702 == false) goto L46;
     */
    @Override // p036.AbstractC7119, p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        byte bM12045;
        C7120 c7120 = this.f17703;
        C0955 c0955 = c7120.f17714;
        c6921.getClass();
        if (this.f17709) {
            C6755.m11870("closed");
            return 0L;
        }
        if (this.f17702) {
            long j2 = this.f17701;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((C6928) c0955.f665).mo12038(Long.MAX_VALUE);
                }
                try {
                    C6928 c6928 = (C6928) c0955.f665;
                    C6921 c69212 = c6928.f17016;
                    c6928.mo12046(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!c6928.mo12032(i2)) {
                            break;
                        }
                        bM12045 = c69212.m12045(i);
                        if ((bM12045 < 48 || bM12045 > 57) && ((bM12045 < 97 || bM12045 > 102) && (bM12045 < 65 || bM12045 > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        AbstractC8568.m13642(16);
                        String string = Integer.toString(bM12045, 16);
                        string.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.f17701 = c69212.m12042();
                    String string2 = AbstractC5976.m10714(((C6928) c0955.f665).mo12038(Long.MAX_VALUE)).toString();
                    if (this.f17701 < 0 || (string2.length() > 0 && !AbstractC5971.m10698(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17701 + string2 + '\"');
                    }
                    if (this.f17701 == 0) {
                        this.f17702 = false;
                        m12376(c7120.f17712.m5510());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo11491 = super.mo11491(c6921, Math.min(8192L, this.f17701));
            if (jMo11491 != -1) {
                this.f17701 -= jMo11491;
                return jMo11491;
            }
            c7120.f17715.mo12180();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12376(C7120.f17711);
            throw protocolException;
        }
        return -1L;
    }
}
