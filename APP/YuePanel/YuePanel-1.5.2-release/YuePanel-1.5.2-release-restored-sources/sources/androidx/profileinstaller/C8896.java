package androidx.profileinstaller;

import Yue.ExecutorC6810;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8532;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8896 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3858 = "ProfileInstaller";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3859 = "/data/misc/profiles/cur/0";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f29858 = "primary.prof";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f29859 = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f29860 = "dexopt/baseline.profm";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f29861 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC8898 f29862 = new C1733();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6391
    public static final InterfaceC8898 f29863 = new C1734();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f29864 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f29865 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f29866 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f29867 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f29868 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f29869 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f29870 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f29871 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f29872 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f29873 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f29874 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f29875 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f29876 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f29877 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f29878 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f29879 = 11;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f29880 = 12;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f29881 = 13;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f29882 = 14;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f29883 = 15;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f29884 = 16;

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟$ۥ */
    public class C1733 implements InterfaceC8898 {
        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ */
        public void mo4874(int i, @InterfaceC6490 Object obj) {
        }

        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4875(int i, @InterfaceC6490 Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟$ۥ۟ */
    public class C1734 implements InterfaceC8898 {

        /* JADX INFO: renamed from: ۥ */
        public static final String f3860 = "ProfileInstaller";

        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ */
        public void mo4874(int i, @InterfaceC6490 Object obj) {
            Log.d("ProfileInstaller", i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.C8896.InterfaceC8898
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4875(int i, @InterfaceC6490 Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8897 {
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8898 {
        /* JADX INFO: renamed from: ۥ */
        void mo4874(int i, @InterfaceC6490 Object obj);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo4875(int i, @InterfaceC6490 Object obj);
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8899 {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m30129(@InterfaceC6391 File file) {
        return new File(file, f29861).delete();
    }

    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m30130(@InterfaceC6391 Context context, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC8898 interfaceC8898) {
        m30129(context.getFilesDir());
        m30136(executor, interfaceC8898, 11, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m30131(@InterfaceC6391 Executor executor, @InterfaceC6391 final InterfaceC8898 interfaceC8898, final int i, @InterfaceC6490 final Object obj) {
        executor.execute(new Runnable() { // from class: Yue.ۥۡۥۡۧ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC8898.mo4874(i, obj);
            }
        });
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m30132(PackageInfo packageInfo, File file, InterfaceC8898 interfaceC8898) {
        File file2 = new File(file, f29861);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC8898.mo4875(2, null);
                }
                return z;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m30135(@InterfaceC6391 PackageInfo packageInfo, @InterfaceC6391 File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f29861)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m30136(@InterfaceC6391 Executor executor, @InterfaceC6391 final InterfaceC8898 interfaceC8898, final int i, @InterfaceC6490 final Object obj) {
        executor.execute(new Runnable() { // from class: Yue.ۥۡۥۡۦ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC8898.mo4875(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m30137(@InterfaceC6391 AssetManager assetManager, @InterfaceC6391 String str, @InterfaceC6391 PackageInfo packageInfo, @InterfaceC6391 File file, @InterfaceC6391 String str2, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC8898 interfaceC8898) {
        C1732 c1732 = new C1732(assetManager, executor, interfaceC8898, str2, f29859, f29860, new File(new File(f3859, str), "primary.prof"));
        if (!c1732.m30120()) {
            return false;
        }
        boolean zM30128 = c1732.m30124().m30127().m30128();
        if (zM30128) {
            m30135(packageInfo, file);
        }
        return zM30128;
    }

    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m30138(@InterfaceC6391 Context context) {
        m30139(context, new ExecutorC6810(), f29862);
    }

    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m30139(@InterfaceC6391 Context context, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC8898 interfaceC8898) {
        m30140(context, executor, interfaceC8898, false);
    }

    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m30140(@InterfaceC6391 Context context, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC8898 interfaceC8898, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && m30132(packageInfo, filesDir, interfaceC8898)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                C8900.m30144(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m30137(assets, packageName, packageInfo, filesDir, name, executor, interfaceC8898) && z) {
                z2 = true;
            }
            C8900.m30144(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC8898.mo4875(7, e);
            C8900.m30144(context, false);
        }
    }

    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m30141(@InterfaceC6391 Context context, @InterfaceC6391 Executor executor, @InterfaceC6391 InterfaceC8898 interfaceC8898) {
        try {
            m30135(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m30136(executor, interfaceC8898, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            m30136(executor, interfaceC8898, 7, e);
        }
    }
}
