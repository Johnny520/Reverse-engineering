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
import p000a.AbstractFutureC0000A;
import p000a.C0559ed;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1151d {

    /* JADX INFO: renamed from: a */
    public static final C0559ed<c> f4733a = new C0559ed<>();

    /* JADX INFO: renamed from: b */
    public static final Object f4734b = new Object();

    /* JADX INFO: renamed from: c */
    public static c f4735c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m2629a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f4736a;

        /* JADX INFO: renamed from: b */
        public final int f4737b;

        /* JADX INFO: renamed from: c */
        public final long f4738c;

        /* JADX INFO: renamed from: d */
        public final long f4739d;

        public b(int i, int i2, long j, long j2) {
            this.f4736a = i;
            this.f4737b = i2;
            this.f4738c = j;
            this.f4739d = j2;
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX INFO: renamed from: a */
        public static b m2630a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2631b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4736a);
                dataOutputStream.writeInt(this.f4737b);
                dataOutputStream.writeLong(this.f4738c);
                dataOutputStream.writeLong(this.f4739d);
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f4737b == bVar.f4737b && this.f4738c == bVar.f4738c && this.f4736a == bVar.f4736a && this.f4739d == bVar.f4739d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4737b), Long.valueOf(this.f4738c), Integer.valueOf(this.f4736a), Long.valueOf(this.f4739d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$c */
    public static class c {
    }

    /* JADX INFO: renamed from: a */
    public static long m2626a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m2629a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static c m2627b() {
        c cVar = new c();
        f4735c = cVar;
        C0559ed<c> c0559ed = f4733a;
        c0559ed.getClass();
        if (AbstractFutureC0000A.f2f.mo7b(c0559ed, null, cVar)) {
            AbstractFutureC0000A.m0b(c0559ed);
        }
        return f4735c;
    }

    /* JADX INFO: renamed from: c */
    public static void m2628c(Context context, boolean z) {
        b bVarM2630a;
        int i;
        if (z || f4735c == null) {
            synchronized (f4734b) {
                if (!z) {
                    try {
                        if (f4735c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    m2627b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i2 = 0;
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jM2626a = m2626a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarM2630a = b.m2630a(file3);
                        } catch (IOException unused) {
                            m2627b();
                            return;
                        }
                    } else {
                        bVarM2630a = null;
                    }
                    if (bVarM2630a != null && bVarM2630a.f4738c == jM2626a && (i = bVarM2630a.f4737b) != 2) {
                        i2 = i;
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z && z3 && i2 != 1) {
                        i2 = 2;
                    }
                    if (bVarM2630a != null && bVarM2630a.f4737b == 2 && i2 == 1 && length < bVarM2630a.f4739d) {
                        i2 = 3;
                    }
                    b bVar = new b(1, i2, jM2626a, length2);
                    if (bVarM2630a == null || !bVarM2630a.equals(bVar)) {
                        try {
                            bVar.m2631b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    m2627b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    m2627b();
                }
            }
        }
    }
}
