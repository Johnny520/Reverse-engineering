package okio;

import java.util.zip.Inflater;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class InflaterSourceExtensions {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        source.getClass();
        inflater.getClass();
        return new InflaterSource(source, inflater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            inflater = new Inflater();
        }
        source.getClass();
        inflater.getClass();
        return new InflaterSource(source, inflater);
    }
}
