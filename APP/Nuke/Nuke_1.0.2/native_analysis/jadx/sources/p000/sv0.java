package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0549on f10379h;

    /* JADX INFO: renamed from: i */
    public int f10380i;

    /* JADX INFO: renamed from: j */
    public int f10381j;

    /* JADX INFO: renamed from: k */
    public int f10382k;

    /* JADX INFO: renamed from: l */
    public int f10383l;

    public sv0(InterfaceC0549on interfaceC0549on) {
        interfaceC0549on.getClass();
        this.f10379h = interfaceC0549on;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f10379h.mo889a();
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        int i;
        int i2;
        c0209fn.getClass();
        do {
            int i3 = this.f10382k;
            InterfaceC0549on interfaceC0549on = this.f10379h;
            if (i3 == 0) {
                interfaceC0549on.skip(this.f10383l);
                this.f10383l = 0;
                if ((this.f10380i & 4) == 0) {
                    i = this.f10381j;
                    int iM5504l = ug3.m5504l(interfaceC0549on);
                    this.f10382k = iM5504l;
                    int i4 = interfaceC0549on.readByte() & 255;
                    this.f10380i = interfaceC0549on.readByte() & 255;
                    Logger logger = tv0.f10970k;
                    if (logger.isLoggable(Level.FINE)) {
                        C0505no c0505no = jv0.f5231a;
                        logger.fine(jv0.m2580b(true, this.f10381j, iM5504l, i4, this.f10380i));
                    }
                    i2 = interfaceC0549on.readInt() & Integer.MAX_VALUE;
                    this.f10381j = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo891n = interfaceC0549on.mo891n(c0209fn, Math.min(8192L, i3));
                if (jMo891n != -1) {
                    this.f10382k -= (int) jMo891n;
                    return jMo891n;
                }
            }
            return -1L;
        } while (i2 == i);
        c80.m678v("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
