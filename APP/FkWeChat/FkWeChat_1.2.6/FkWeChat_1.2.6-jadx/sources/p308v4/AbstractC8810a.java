package p308v4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8810a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMap f29319a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends ContextWrapper {

        /* JADX INFO: renamed from: a */
        public final Resources f29320a;

        /* JADX INFO: renamed from: b */
        public final ClassLoader f29321b;

        public a(Context context, Resources resources, ClassLoader classLoader) {
            super(context);
            this.f29320a = resources;
            this.f29321b = classLoader;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public AssetManager getAssets() {
            return this.f29320a.getAssets();
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public ClassLoader getClassLoader() {
            return this.f29321b;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources getResources() {
            return this.f29320a;
        }
    }

    static {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            if (objInvoke instanceof Context) {
                m33790a((Context) objInvoke);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m33790a(Context context) {
        f29319a.clear();
        m33793d(new File(context.getCacheDir(), "dynamic"));
    }

    /* JADX INFO: renamed from: b */
    public static void m33791b(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AssetManager m33792c(String str) {
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
            AssetManager.class.getMethod("addAssetPath", String.class).invoke(assetManager, str);
            return assetManager;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m33793d(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m33793d(file2);
            }
        }
        file.setWritable(true);
        file.delete();
    }

    /* JADX INFO: renamed from: e */
    public static void m33794e(File file, File file2) {
        String str;
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        str = null;
                        break;
                    }
                    str = strArr[i10];
                    if (m33795f(zipFile, str)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (str != null) {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    String str2 = "lib/" + str + "/";
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement.getName().startsWith(str2) && zipEntryNextElement.getName().endsWith(".so")) {
                            File file3 = new File(file2, new File(zipEntryNextElement.getName()).getName());
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    byte[] bArr = new byte[8192];
                                    while (true) {
                                        int i11 = inputStream.read(bArr);
                                        if (i11 == -1) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, i11);
                                        }
                                    }
                                    fileOutputStream.close();
                                    inputStream.close();
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m33795f(ZipFile zipFile, String str) {
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        String str2 = "lib/" + str + "/";
        while (enumerationEntries.hasMoreElements()) {
            if (enumerationEntries.nextElement().getName().startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static a m33796g(Context context, String str) {
        String strM33821c;
        File file = new File(str);
        if (file.exists() && (strM33821c = AbstractC8818i.m33821c(str)) != null && !strM33821c.isEmpty()) {
            ConcurrentMap concurrentMap = f29319a;
            if (concurrentMap.containsKey(strM33821c)) {
                return (a) concurrentMap.get(strM33821c);
            }
            File file2 = new File(new File(context.getCacheDir(), "dynamic"), strM33821c);
            File file3 = new File(file2, "base.apk");
            File file4 = new File(file2, "opt");
            File file5 = new File(file2, "lib");
            try {
                if (!file3.exists()) {
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    if (!file4.exists()) {
                        file4.mkdirs();
                    }
                    if (!file5.exists()) {
                        file5.mkdirs();
                    }
                    m33791b(file, file3);
                    file3.setWritable(false);
                    m33794e(file3, file5);
                }
                DexClassLoader dexClassLoader = new DexClassLoader(file3.getAbsolutePath(), file4.getAbsolutePath(), file5.getAbsolutePath(), context.getClassLoader());
                AssetManager assetManagerM33792c = m33792c(file3.getAbsolutePath());
                Resources resources = context.getResources();
                a aVar = new a(context, new Resources(assetManagerM33792c, resources.getDisplayMetrics(), resources.getConfiguration()), dexClassLoader);
                concurrentMap.put(strM33821c, aVar);
                return aVar;
            } catch (Exception e10) {
                System.err.println("[ApkLoader] Failed to load plugin " + strM33821c + ": " + e10.getMessage());
            }
        }
        return null;
    }
}
