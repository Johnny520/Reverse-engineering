package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;
import p168l4.ExecutorC4627e;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0696c {

    /* JADX INFO: renamed from: a */
    public static final c f2036a = new a();

    /* JADX INFO: renamed from: b */
    public static final c f2037b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements c {
        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: a */
        public void mo2717a(int i10, Object obj) {
            Log.d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? _UrlKt.FRAGMENT_ENCODE_SET : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: b */
        public void mo2718b(int i10, Object obj) {
            String str;
            switch (i10) {
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
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case Opcodes.FCONST_0 /* 11 */:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2717a(int i10, Object obj);

        /* JADX INFO: renamed from: b */
        void mo2718b(int i10, Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2744b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: renamed from: c */
    public static void m2745c(Context context, Executor executor, c cVar) {
        m2744b(context.getFilesDir());
        m2748f(executor, cVar, 11, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2746d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    cVar.mo2718b(2, null);
                }
                return z10;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2747e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2748f(Executor executor, final c cVar, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: l4.f
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo2718b(i10, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2749g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C0695b c0695b = new C0695b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c0695b.m2735e()) {
            return false;
        }
        boolean zM2742m = c0695b.m2738h().m2741l().m2742m();
        if (zM2742m) {
            m2747e(packageInfo, file);
        }
        return zM2742m;
    }

    /* JADX INFO: renamed from: h */
    public static void m2750h(Context context) {
        m2751i(context, new ExecutorC4627e(), f2036a);
    }

    /* JADX INFO: renamed from: i */
    public static void m2751i(Context context, Executor executor, c cVar) {
        m2752j(context, executor, cVar, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m2752j(Context context, Executor executor, c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && m2746d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                AbstractC0697d.m2756c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m2749g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                z11 = true;
            }
            AbstractC0697d.m2756c(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.mo2718b(7, e10);
            AbstractC0697d.m2756c(context, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2753k(Context context, Executor executor, c cVar) {
        try {
            m2747e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m2748f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            m2748f(executor, cVar, 7, e10);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements c {
        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: a */
        public void mo2717a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC0696c.c
        /* JADX INFO: renamed from: b */
        public void mo2718b(int i10, Object obj) {
        }
    }
}
