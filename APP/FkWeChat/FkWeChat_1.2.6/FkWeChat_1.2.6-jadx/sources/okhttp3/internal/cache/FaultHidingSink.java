package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p376zd.AbstractC10015s;
import p376zd.C9995i;
import p376zd.InterfaceC10020u0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m16758d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lzd/s;", "Lzd/u0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Ll8/i0;", "onException", "<init>", "(Lzd/u0;La9/l;)V", "Lzd/i;", "source", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "write", "(Lzd/i;J)V", "flush", "()V", "close", "La9/l;", "getOnException", "()La9/l;", _UrlKt.FRAGMENT_ENCODE_SET, "hasErrors", "Z", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public class FaultHidingSink extends AbstractC10015s {
    private boolean hasErrors;
    private final InterfaceC0184l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(InterfaceC10020u0 interfaceC10020u0, InterfaceC0184l interfaceC0184l) {
        super(interfaceC10020u0);
        interfaceC10020u0.getClass();
        interfaceC0184l.getClass();
        this.onException = interfaceC0184l;
    }

    @Override // p376zd.AbstractC10015s, p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.mo27m(e10);
        }
    }

    @Override // p376zd.AbstractC10015s, p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.mo27m(e10);
        }
    }

    public final InterfaceC0184l getOnException() {
        return this.onException;
    }

    @Override // p376zd.AbstractC10015s, p376zd.InterfaceC10020u0
    public void write(C9995i source, long byteCount) throws EOFException {
        source.getClass();
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.mo27m(e10);
        }
    }
}
