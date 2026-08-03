package p001;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۟.x1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0449x1 {

    /* JADX INFO: renamed from: ۟.x1$a */
    public static class a {

        /* JADX INFO: renamed from: ۥ */
        public final InputStream f1183;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f1184;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f1865;

        public a(InputStream inputStream, boolean z, long j) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f1183 = inputStream;
            this.f1184 = z;
            this.f1865 = j;
        }
    }

    /* JADX INFO: renamed from: ۟.x1$b */
    public static class b extends IOException {

        /* JADX INFO: renamed from: ۥ */
        public final boolean f1185;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1186;

        public b(String str, int i, int i2) {
            super(str);
            this.f1185 = C0167c4.m834(i);
            this.f1186 = i2;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    a mo960(Uri uri, int i);
}
