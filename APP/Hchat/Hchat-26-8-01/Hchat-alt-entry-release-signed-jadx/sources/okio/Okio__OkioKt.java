package okio;

import ac.AbstractC0063p;
import java.io.Closeable;
import p085fg.InterfaceC1231l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSource buffer(Source source) {
        source.getClass();
        return new RealBufferedSource(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T extends Closeable, R> R use(T t9, InterfaceC1231l interfaceC1231l) throws Throwable {
        R r2;
        interfaceC1231l.getClass();
        Throwable th2 = null;
        try {
            r2 = (R) interfaceC1231l.invoke(t9);
            if (t9 != null) {
                try {
                    t9.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (t9 != null) {
                try {
                    t9.close();
                } catch (Throwable th5) {
                    AbstractC0063p.m412e(th4, th5);
                }
            }
            th2 = th4;
            r2 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        r2.getClass();
        return r2;
    }

    public static final BufferedSink buffer(Sink sink) {
        sink.getClass();
        return new RealBufferedSink(sink);
    }
}
