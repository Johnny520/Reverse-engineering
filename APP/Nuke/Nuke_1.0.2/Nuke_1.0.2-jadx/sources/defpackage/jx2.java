package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jx2 implements kh1, oa3 {
    public static jx2 i;
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jx2(ea eaVar) {
        this.h = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(long j, int i2) {
        int i3 = x23.b;
        return ((int) (j >> (i2 * 15))) & 32767;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jx2 d() {
        if (i == null) {
            i = new jx2(4);
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long e(int i2, int i3, int i4, int i5) {
        return (((long) (i3 & 32767)) << 15) | ((long) (i2 & 32767)) | (((long) (i4 & 32767)) << 30) | (((long) (i5 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.oa3
    public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.h) {
            case 5:
                mediaMetadataRetriever.setDataSource(new na3((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.oa3
    public void b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.h) {
            case 5:
                mediaExtractor.setDataSource(new na3((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        return new kv2(kj1Var.g(cq0.class, InputStream.class), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 7:
                int iHashCode = hashCode();
                xe1.j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.k("CreationExtras.Key@", string, "<", d72.a(String.class).c(), ">");
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [jx2.d():jx2, p7.<clinit>():void, sc2.<init>(tc2, ta):void, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72] */
    public /* synthetic */ jx2(int i2) {
        this.h = i2;
    }
}
