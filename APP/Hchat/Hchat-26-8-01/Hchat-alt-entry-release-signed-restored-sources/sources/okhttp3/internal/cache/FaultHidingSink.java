package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import p085fg.InterfaceC1231l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    private final InterfaceC1231l onException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(Sink sink, InterfaceC1231l interfaceC1231l) {
        super(sink);
        sink.getClass();
        interfaceC1231l.getClass();
        this.onException = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getOnException() {
        return this.onException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        if (this.hasErrors) {
            buffer.skip(j3);
            return;
        }
        try {
            super.write(buffer, j3);
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }
}
