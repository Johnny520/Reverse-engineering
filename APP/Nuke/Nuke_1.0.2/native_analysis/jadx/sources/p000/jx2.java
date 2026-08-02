package p000;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jx2 implements kh1, oa3 {

    /* JADX INFO: renamed from: i */
    public static jx2 f5256i;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5257h;

    public jx2(C0159ea c0159ea) {
        this.f5257h = 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m2593c(long j, int i) {
        int i2 = x23.f12781b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    /* JADX INFO: renamed from: d */
    public static jx2 m2594d() {
        if (f5256i == null) {
            f5256i = new jx2(4);
        }
        return f5256i;
    }

    /* JADX INFO: renamed from: e */
    public static long m2595e(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override // p000.oa3
    /* JADX INFO: renamed from: a */
    public void mo2413a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f5257h) {
            case 5:
                mediaMetadataRetriever.setDataSource(new na3((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p000.oa3
    /* JADX INFO: renamed from: b */
    public void mo2414b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f5257h) {
            case 5:
                mediaExtractor.setDataSource(new na3((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        return new kv2(kj1Var.m2708g(cq0.class, InputStream.class), 1);
    }

    public String toString() {
        switch (this.f5257h) {
            case 7:
                int iHashCode = hashCode();
                xe1.m6127j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.m5692k("CreationExtras.Key@", string, "<", d72.m967a(String.class).m591c(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jx2(int i) {
        this.f5257h = i;
    }
}
