package androidx.profileinstaller;

import Yue.C7120;
import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8532;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8900 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3861 = "/data/misc/profiles/ref/";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3862 = "/data/misc/profiles/cur/0/";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f29885 = "primary.prof";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f29886 = "profileInstalled";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f29889 = "ProfileVerifier";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C7120<C8901> f29887 = C7120.m22230();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object f29888 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6490
    public static C8901 f29890 = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ */
    @InterfaceC7113(33)
    public static class C1735 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static PackageInfo m4891(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C1736 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f29891 = 1;

        /* JADX INFO: renamed from: ۥ */
        public final int f3863;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f3864;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f29892;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f29893;

        public C1736(int i, int i2, long j, long j2) {
            this.f3863 = i;
            this.f3864 = i2;
            this.f29892 = j;
            this.f29893 = j2;
        }

        /* JADX INFO: renamed from: ۥ */
        public static C1736 m4892(@InterfaceC6391 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C1736 c1736 = new C1736(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return c1736;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
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
            if (obj == null || !(obj instanceof C1736)) {
                return false;
            }
            C1736 c1736 = (C1736) obj;
            return this.f3864 == c1736.f3864 && this.f29892 == c1736.f29892 && this.f3863 == c1736.f3863 && this.f29893 == c1736.f29893;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3864), Long.valueOf(this.f29892), Integer.valueOf(this.f3863), Long.valueOf(this.f29893));
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4893(@InterfaceC6391 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3863);
                dataOutputStream.writeInt(this.f3864);
                dataOutputStream.writeLong(this.f29892);
                dataOutputStream.writeLong(this.f29893);
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
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C8901 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f29894 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f29895 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f29896 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29897 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29898 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29899 = 65536;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29900 = 131072;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f29901 = 196608;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f29902 = 262144;

        /* JADX INFO: renamed from: ۥ */
        public final int f3865;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f3866;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f29903;

        /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1737 {
        }

        public C8901(int i, boolean z, boolean z2) {
            this.f3865 = i;
            this.f29903 = z2;
            this.f3866 = z;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m4894() {
            return this.f3865;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4895() {
            return this.f29903;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m30145() {
            return this.f3866;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static ListenableFuture<C8901> m4889() {
        return f29887;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static long m4890(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? C1735.m4891(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8901 m30142(int i, boolean z, boolean z2) {
        C8901 c8901 = new C8901(i, z, z2);
        f29890 = c8901;
        f29887.mo5833(c8901);
        return f29890;
    }

    @InterfaceC6391
    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C8901 m30143(@InterfaceC6391 Context context) {
        return m30144(context, false);
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C8901 m30144(@InterfaceC6391 Context context, boolean z) {
        C1736 c1736M4892;
        int i;
        C8901 c8901;
        if (!z && (c8901 = f29890) != null) {
            return c8901;
        }
        synchronized (f29888) {
            if (!z) {
                try {
                    C8901 c89012 = f29890;
                    if (c89012 != null) {
                        return c89012;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File(f3861, context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File(f3862, context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jM4890 = m4890(context);
                    File file3 = new File(context.getFilesDir(), f29886);
                    if (file3.exists()) {
                        try {
                            c1736M4892 = C1736.m4892(file3);
                        } catch (IOException unused) {
                            return m30142(131072, z2, z3);
                        }
                    } else {
                        c1736M4892 = null;
                    }
                    if (c1736M4892 != null && c1736M4892.f29892 == jM4890 && (i = c1736M4892.f3864) != 2) {
                        i3 = i;
                    } else if (z2) {
                        i3 = 1;
                    } else if (z3) {
                        i3 = 2;
                    }
                    if (z && z3 && i3 != 1) {
                        i3 = 2;
                    }
                    if (c1736M4892 != null && c1736M4892.f3864 == 2 && i3 == 1 && length < c1736M4892.f29893) {
                        i3 = 3;
                    }
                    C1736 c1736 = new C1736(1, i3, jM4890, length2);
                    if (c1736M4892 == null || !c1736M4892.equals(c1736)) {
                        try {
                            c1736.m4893(file3);
                        } catch (IOException unused2) {
                            i3 = C8901.f29901;
                        }
                    }
                    return m30142(i3, z2, z3);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return m30142(65536, z2, z3);
                }
            }
            return m30142(262144, false, false);
        }
    }
}
