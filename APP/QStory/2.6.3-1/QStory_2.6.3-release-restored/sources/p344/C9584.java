package p344;

import android.os.Environment;
import android.view.View;
import com.alibaba.fastjson2.AbstractC3738;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
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
import p026.AbstractC7017;
import p035.C7092;
import p348.C9614;
import p353.AbstractC9632;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9584 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f25019;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String f25020;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f25024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f25023 = new C9924("AutoBackup", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final SimpleDateFormat f25022 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final SimpleDateFormat f25021 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());

    static {
        "AutoBackupModuleData";
        "AutoBackup";
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f25019 = externalStorageDirectory + "/Android/data/com.tencent.mobileqq/QStory";
        f25020 = externalStorageDirectory + "/Download/QStory";
    }

    public C9584() {
        new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m15003() {
        String str = f25020;
        File file = new File(str);
        if (!file.exists()) {
            if (file.mkdirs()) {
                m15007(file);
                return;
            } else {
                C7092.m12337("创建备份目录失败: ", str);
                return;
            }
        }
        if (!file.isDirectory()) {
            C7092.m12337("备份路径不是目录: ", str);
        } else {
            if (new File(file, ".nomedia").exists()) {
                return;
            }
            m15007(file);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m15004() {
        File[] fileArrListFiles;
        try {
            m15003();
        } catch (IOException e) {
            AbstractC7017.m12164("AutoBackupModuleData", "创建.nomedia文件异常", e, true);
        }
        File file = new File(f25020);
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
    public static void m15005(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m15005(file2, str + '/' + file2.getName(), zipOutputStream);
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
                        AbstractC3738.m6868(fileInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m15006(long j) {
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
    public static void m15007(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(file, ".nomedia"));
        try {
            fileWriter.write("");
            fileWriter.close();
        } finally {
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        new Thread(new RunnableC9585(this, 0)).start();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "每天启动QQ自动备份模块数据 点击可进行手动备份测试";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File m15008() {
        String str = f25019;
        File file = new File(str);
        if (!file.exists()) {
            C7092.m12337("模块数据目录不存在: ", str);
            return null;
        }
        if (!file.isDirectory()) {
            C7092.m12337("模块数据路径不是目录: ", str);
            return null;
        }
        m15003();
        File file2 = new File(f25020, "QStoryBackup_" + this.f25021.format(new Date()) + ".zip");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                String name = file.getName();
                "getName(...)";
                name.getClass();
                m15005(file, name, zipOutputStream);
                zipOutputStream.close();
                fileOutputStream.close();
                return file2;
            } finally {
            }
        } finally {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 25);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        "user";
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        "user";
        return true;
    }
}
