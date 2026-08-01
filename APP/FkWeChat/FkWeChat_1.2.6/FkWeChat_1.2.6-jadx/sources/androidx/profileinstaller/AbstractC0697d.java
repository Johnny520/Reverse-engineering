package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import p193n3.C5490c;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0697d {

    /* JADX INFO: renamed from: a */
    public static final C5490c f2038a = C5490c.m22335o();

    /* JADX INFO: renamed from: b */
    public static final Object f2039b = new Object();

    /* JADX INFO: renamed from: c */
    public static c f2040c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m2757a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f2041a;

        /* JADX INFO: renamed from: b */
        public final int f2042b;

        /* JADX INFO: renamed from: c */
        public final long f2043c;

        /* JADX INFO: renamed from: d */
        public final long f2044d;

        public b(int i10, int i11, long j10, long j11) {
            this.f2041a = i10;
            this.f2042b = i11;
            this.f2043c = j10;
            this.f2044d = j11;
        }

        /* JADX INFO: renamed from: a */
        public static b m2758a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2759b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2041a);
                dataOutputStream.writeInt(this.f2042b);
                dataOutputStream.writeLong(this.f2043c);
                dataOutputStream.writeLong(this.f2044d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f2042b == bVar.f2042b && this.f2043c == bVar.f2043c && this.f2041a == bVar.f2041a && this.f2044d == bVar.f2044d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2042b), Long.valueOf(this.f2043c), Integer.valueOf(this.f2041a), Long.valueOf(this.f2044d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f2045a;

        /* JADX INFO: renamed from: b */
        public final boolean f2046b;

        /* JADX INFO: renamed from: c */
        public final boolean f2047c;

        /* JADX INFO: renamed from: d */
        public final boolean f2048d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f2045a = i10;
            this.f2047c = z11;
            this.f2046b = z10;
            this.f2048d = z12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m2754a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m2757a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static c m2755b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f2040c = cVar;
        f2038a.mo22325m(cVar);
        return f2040c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.AbstractC0697d.c m2756c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.AbstractC0697d.m2756c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
