package okio;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m115d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class InflaterSourceExtensions {
    public static final okio.InflaterSource inflate(okio.Source r2, java.util.zip.Inflater r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            okio.InflaterSource r1 = new okio.InflaterSource
            r1.<init>(r2, r3)
            return r1
    }

    public static /* synthetic */ okio.InflaterSource inflate$default(okio.Source r0, java.util.zip.Inflater r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            r1 = r2
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            okio.InflaterSource r3 = new okio.InflaterSource
            r3.<init>(r0, r1)
            return r3
    }
}
