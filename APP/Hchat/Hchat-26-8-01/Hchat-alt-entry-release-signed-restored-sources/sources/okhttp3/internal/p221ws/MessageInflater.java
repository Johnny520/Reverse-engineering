package okhttp3.internal.p221ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import okio.InflaterSource;
import okio.Source;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final Buffer deflatedBytes;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private final boolean noContextTakeover;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageInflater(boolean z9) {
        this.noContextTakeover = z9;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource((Source) buffer, inflater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void inflate(Buffer buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.size() != 0) {
            C2104o.m5294t("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.writeAll(buffer);
        this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long size = this.deflatedBytes.size() + this.inflater.getBytesRead();
        do {
            this.inflaterSource.readOrInflate(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < size);
    }
}
