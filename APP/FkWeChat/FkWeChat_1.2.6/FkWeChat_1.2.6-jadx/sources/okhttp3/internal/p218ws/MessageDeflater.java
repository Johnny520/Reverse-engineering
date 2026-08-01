package okhttp3.internal.p218ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p325w8.AbstractC9202b;
import p376zd.C10003m;
import p376zd.C10005n;
import p376zd.C9987e;
import p376zd.C9995i;
import p376zd.InterfaceC10020u0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m16758d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "noContextTakeover", "<init>", "(Z)V", "Lzd/i;", "Lzd/m;", "suffix", "endsWith", "(Lzd/i;Lzd/m;)Z", "buffer", "Ll8/i0;", "deflate", "(Lzd/i;)V", "close", "()V", "Z", "deflatedBytes", "Lzd/i;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lzd/n;", "deflaterSink", "Lzd/n;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class MessageDeflater implements Closeable {
    private final C9995i deflatedBytes;
    private final Deflater deflater;
    private final C10005n deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        C9995i c9995i = new C9995i();
        this.deflatedBytes = c9995i;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C10005n((InterfaceC10020u0) c9995i, deflater);
    }

    private final boolean endsWith(C9995i c9995i, C10003m c10003m) {
        return c9995i.mo38706f0(c9995i.size() - ((long) c10003m.m38765G()), c10003m);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C9995i buffer) throws IllegalAccessException, IOException, InvocationTargetException {
        buffer.getClass();
        if (this.deflatedBytes.size() != 0) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        boolean zEndsWith = endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK);
        C9995i c9995i = this.deflatedBytes;
        if (zEndsWith) {
            long size = c9995i.size() - ((long) 4);
            C9995i.a aVarM38668F = C9995i.m38668F(this.deflatedBytes, null, 1, null);
            try {
                aVarM38668F.m38741f(size);
                AbstractC9202b.m35830a(aVarM38668F, null);
            } finally {
            }
        } else {
            c9995i.writeByte(0);
        }
        C9995i c9995i2 = this.deflatedBytes;
        buffer.write(c9995i2, c9995i2.size());
    }
}
