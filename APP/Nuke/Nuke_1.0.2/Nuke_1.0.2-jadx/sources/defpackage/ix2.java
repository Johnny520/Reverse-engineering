package defpackage;

import android.app.Application;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ix2 implements e33, kh1, oa3 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b5.<init>(int):void, dq1.<init>(int):void, gb3.<init>():void, kj1.<init>(kb3, ib3, s20):void, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72] */
    public /* synthetic */ ix2(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final oc c(String str, int i) {
        WeakHashMap weakHashMap = ff3.v;
        return new oc(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o93 d(String str, int i) {
        WeakHashMap weakHashMap = ff3.v;
        return new o93(new g01(0, 0, 0, 0), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static s23 e(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return s23.l;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return s23.k;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return s23.j;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return s23.m;
            }
        } else if (str.equals("SSLv3")) {
            return s23.n;
        }
        s.j("Unexpected TLS version: ".concat(str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.oa3
    public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.oa3
    public void b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        return new w83(kj1Var.g(cq0.class, InputStream.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 7:
                int iHashCode = hashCode();
                xe1.j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.k("CreationExtras.Key@", string, "<", d72.a(Application.class).c(), ">");
            default:
                return super.toString();
        }
    }
}
