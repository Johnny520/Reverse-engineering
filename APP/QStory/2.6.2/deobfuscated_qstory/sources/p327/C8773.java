package p327;

import android.os.Environment;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p331.C8799;
import p336.AbstractC8805;
import p391.C9114;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏兰哲;", "L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8773 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f24710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String f24711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24714 = new C9114("AutoBackup", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final SimpleDateFormat f24713 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final SimpleDateFormat f24712 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());

    static {
        "AutoBackupModuleData";
        "AutoBackup";
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f24710 = externalStorageDirectory + "/Android/data/com.tencent.mobileqq/QStory";
        f24711 = externalStorageDirectory + "/Download/QStory";
    }

    public C8773() {
        new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m14437() {
        String str = f24711;
        File file = new File(str);
        if (!file.exists()) {
            if (file.mkdirs()) {
                m14441(file);
                return;
            } else {
                C5919.m11246(AbstractC6136.m11557(-3937793980344042919L, new StringBuilder(), str));
                return;
            }
        }
        if (!file.isDirectory()) {
            C5919.m11246(AbstractC6136.m11557(-3937793924509468071L, new StringBuilder(), str));
        } else {
            if (new File(file, ".nomedia").exists()) {
                return;
            }
            m14441(file);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m14438() {
        File[] fileArrListFiles;
        try {
            m14437();
        } catch (IOException e) {
            AbstractC6157.m11574("AutoBackupModuleData", "\u521b\u5efa.nomedia\u6587\u4ef6\u5f02\u5e38", e, true);
        }
        File file = new File(f24711);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    "getName(...)";
                    name.getClass();
                    Locale locale = Locale.getDefault();
                    "getDefault(...)";
                    locale.getClass();
                    String lowerCase = name.toLowerCase(locale);
                    "toLowerCase(...)";
                    lowerCase.getClass();
                    if (lowerCase.endsWith(".zip")) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m14439(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m14439(file2, str + '/' + file2.getName(), zipOutputStream);
            } else {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + '/' + file2.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i);
                        }
                    }
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3065.m6841(fileInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m14440(long j) {
        if (j < 1024) {
            return j + " B";
        }
        if (j < 1048576) {
            String str = String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
            "format(...)";
            return str;
        }
        String str2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
        "format(...)";
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14441(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(file, ".nomedia"));
        try {
            fileWriter.write("");
            fileWriter.close();
        } finally {
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        new Thread(new RunnableC8774(this, 0)).start();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u6bcf\u5929\u542f\u52a8QQ\u81ea\u52a8\u5907\u4efd\u6a21\u5757\u6570\u636e \u70b9\u51fb\u53ef\u8fdb\u884c\u624b\u52a8\u5907\u4efd\u6d4b\u8bd5";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File m14442() {
        String str = f24710;
        File file = new File(str);
        if (!file.exists()) {
            C5919.m11246(AbstractC6136.m11557(-3937793937394369959L, new StringBuilder(), str));
            return null;
        }
        if (!file.isDirectory()) {
            C5919.m11246(AbstractC6136.m11557(-3937793885854762407L, new StringBuilder(), str));
            return null;
        }
        m14437();
        String str2 = this.f24712.format(new Date());
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937793769890645415L, sb, str2);
        sb.append(".zip");
        File file2 = new File(f24711, sb.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                String name = file.getName();
                "getName(...)";
                name.getClass();
                m14439(file, name, zipOutputStream);
                zipOutputStream.close();
                fileOutputStream.close();
                return file2;
            } finally {
            }
        } finally {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 25);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        "user";
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        "user";
        return true;
    }
}
