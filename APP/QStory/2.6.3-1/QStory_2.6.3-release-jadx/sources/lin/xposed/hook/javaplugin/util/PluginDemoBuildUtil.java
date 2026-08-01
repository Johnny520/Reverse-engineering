package lin.xposed.hook.javaplugin.util;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.UUID;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import p045.C7149;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginDemoBuildUtil {
    private final C7149 config = new C7149(AbstractC9234.m14531(712));

    public static String calculateMD5(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC9234.m14532("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵呜呜呜呜"));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format(AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵喵喵~喵喵喵呜喵喵喵喵"), Byte.valueOf(b)));
                }
                return sb.toString();
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private boolean compareFileMD5() {
        File file = new File(new File(AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")), AbstractC9234.m14531(713)), AbstractC9234.m14531(714));
        if (file.exists()) {
            return calculateMD5(AbstractC7187.f17852.getResources().openRawResource(C0328R.raw.main)).equals(calculateMD5(new FileInputStream(file)));
        }
        return false;
    }

    private void initDescFile(Context context, File file) throws IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(C0328R.raw.desc);
        AbstractC5894.m10613(file, inputStreamOpenRawResource);
        inputStreamOpenRawResource.close();
    }

    private void initInfoFile(File file) throws IOException {
        Properties properties = new Properties();
        String strReplace = UUID.randomUUID().toString().replace(AbstractC9234.m14532("喵呜喵呜呜呜呜喵"), "");
        properties.setProperty(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), AbstractC9234.m14531(713));
        properties.setProperty(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"), strReplace);
        properties.setProperty(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(715));
        properties.setProperty(AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜呜呜"), AbstractC9234.m14532("喵呜喵喵喵喵呜喵~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵呜喵"));
        properties.setProperty(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜"), AbstractC9234.m14531(716));
        properties.setProperty(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        properties.setProperty(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"), AbstractC9234.m14531(717));
        properties.store(new FileWriter(file), (String) null);
    }

    private void initMainJavaFile(Context context, File file) throws IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(C0328R.raw.main);
        AbstractC5894.m10613(file, inputStreamOpenRawResource);
        inputStreamOpenRawResource.close();
    }

    public void createDemoPlugin(Context context) {
        if (compareFileMD5()) {
            return;
        }
        PluginManager.stopAllPlugin();
        File file = new File(AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")), AbstractC9234.m14531(713));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, AbstractC9234.m14531(678));
        File file3 = new File(file, AbstractC9234.m14531(714));
        File file4 = new File(file, AbstractC9234.m14531(679));
        initInfoFile(file2);
        initMainJavaFile(context, file3);
        initDescFile(context, file4);
    }
}
