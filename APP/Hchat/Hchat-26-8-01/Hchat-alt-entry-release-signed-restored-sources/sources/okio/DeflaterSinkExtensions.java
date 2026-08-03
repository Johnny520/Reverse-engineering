package okio;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        sink.getClass();
        deflater.getClass();
        return new DeflaterSink(sink, deflater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            deflater = new Deflater();
        }
        sink.getClass();
        deflater.getClass();
        return new DeflaterSink(sink, deflater);
    }
}
