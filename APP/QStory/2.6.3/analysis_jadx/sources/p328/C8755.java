package p328;

import android.os.Environment;
import android.view.View;
import com.alibaba.fastjson2.AbstractC2905;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
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
import p010.AbstractC6188;
import p019.C6263;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8755 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f24674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String f24675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f24678 = new C9095(AbstractC8405.m13972(2262), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final SimpleDateFormat f24677 = new SimpleDateFormat(AbstractC8405.m13972(1168), Locale.getDefault());

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final SimpleDateFormat f24676 = new SimpleDateFormat(AbstractC8405.m13972(2263), Locale.getDefault());

    static {
        AbstractC8405.m13972(2270);
        AbstractC8405.m13972(2262);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f24674 = externalStorageDirectory + AbstractC8405.m13972(2280);
        f24675 = externalStorageDirectory + AbstractC8405.m13972(2281);
    }

    public C8755() {
        new SimpleDateFormat(AbstractC8405.m13972(1218), Locale.getDefault());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m14444() {
        String str = f24675;
        File file = new File(str);
        if (!file.exists()) {
            if (file.mkdirs()) {
                m14448(file);
                return;
            } else {
                C6263.m11778(AbstractC8405.m13972(2265), str);
                return;
            }
        }
        if (!file.isDirectory()) {
            C6263.m11778(AbstractC8405.m13972(2266), str);
        } else {
            if (new File(file, AbstractC8405.m13972(66)).exists()) {
                return;
            }
            m14448(file);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m14445() {
        File[] fileArrListFiles;
        try {
            m14444();
        } catch (IOException e) {
            AbstractC6188.m11605(AbstractC8405.m13972(2270), AbstractC8405.m13972(2271), e, true);
        }
        File file = new File(f24675);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    AbstractC8405.m13972(1820);
                    name.getClass();
                    Locale locale = Locale.getDefault();
                    AbstractC8405.m13972(1277);
                    locale.getClass();
                    String lowerCase = name.toLowerCase(locale);
                    AbstractC8405.m13972(1322);
                    lowerCase.getClass();
                    if (lowerCase.endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜喵喵喵"))) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m14446(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m14446(file2, str + '/' + file2.getName(), zipOutputStream);
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
                        AbstractC2905.m6308(fileInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m14447(long j) {
        if (j < 1024) {
            return j + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵喵呜呜喵呜呜呜");
        }
        if (j < 1048576) {
            String str = String.format(AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵呜呜~喵喵喵喵呜呜呜喵~喵呜喵喵喵呜喵呜~喵喵呜喵喵呜呜呜~喵喵呜喵喵喵呜呜"), Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
            AbstractC8405.m13972(1290);
            return str;
        }
        String str2 = String.format(AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵喵喵~喵喵喵喵呜呜呜喵~喵呜喵喵喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵呜喵喵喵呜呜"), Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
        AbstractC8405.m13972(1290);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14448(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(file, AbstractC8405.m13972(66)));
        try {
            fileWriter.write("");
            fileWriter.close();
        } finally {
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        new Thread(new RunnableC8756(this, 0)).start();
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2264);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File m14449() {
        String str = f24674;
        File file = new File(str);
        if (!file.exists()) {
            C6263.m11778(AbstractC8405.m13972(2267), str);
            return null;
        }
        if (!file.isDirectory()) {
            C6263.m11778(AbstractC8405.m13972(2268), str);
            return null;
        }
        m14444();
        File file2 = new File(f24675, AbstractC8405.m13972(2269) + this.f24676.format(new Date()) + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜喵喵喵"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                String name = file.getName();
                AbstractC8405.m13972(1820);
                name.getClass();
                m14446(file, name, zipOutputStream);
                zipOutputStream.close();
                fileOutputStream.close();
                return file2;
            } finally {
            }
        } finally {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 25);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
        return true;
    }
}
