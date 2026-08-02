package p000;

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

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4829h;

    public /* synthetic */ ix2(int i) {
        this.f4829h = i;
    }

    /* JADX INFO: renamed from: c */
    public static final C0538oc m2410c(String str, int i) {
        WeakHashMap weakHashMap = ff3.f2953v;
        return new C0538oc(str, i);
    }

    /* JADX INFO: renamed from: d */
    public static final o93 m2411d(String str, int i) {
        WeakHashMap weakHashMap = ff3.f2953v;
        return new o93(new g01(0, 0, 0, 0), str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public static s23 m2412e(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return s23.f9884l;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return s23.f9883k;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return s23.f9882j;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return s23.f9885m;
            }
        } else if (str.equals("SSLv3")) {
            return s23.f9886n;
        }
        C0676s.m4651j("Unexpected TLS version: ".concat(str));
        return null;
    }

    @Override // p000.oa3
    /* JADX INFO: renamed from: a */
    public void mo2413a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p000.oa3
    /* JADX INFO: renamed from: b */
    public void mo2414b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        return new w83(kj1Var.m2708g(cq0.class, InputStream.class));
    }

    public String toString() {
        switch (this.f4829h) {
            case 7:
                int iHashCode = hashCode();
                xe1.m6127j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.m5692k("CreationExtras.Key@", string, "<", d72.m967a(Application.class).m591c(), ">");
            default:
                return super.toString();
        }
    }
}
