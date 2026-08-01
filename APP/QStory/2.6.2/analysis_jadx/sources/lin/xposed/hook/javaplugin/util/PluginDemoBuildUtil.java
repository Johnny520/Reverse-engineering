package lin.xposed.hook.javaplugin.util;

import android.content.Context;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
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
import lin.xposed.hook.javaplugin.controller.PluginManager;
import p028.C6301;
import p035.AbstractC6340;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginDemoBuildUtil {
    private final C6301 config = new C6301(AbstractC3056.m6668(-3937626231806363047L));

    public static String calculateMD5(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC3056.m6668(-3937560909648758183L));
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
                    sb.append(String.format(AbstractC3056.m6668(-3937626175971788199L), Byte.valueOf(b)));
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
        File file = new File(new File(AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620425010578855L)), AbstractC3056.m6668(-3937626163086886311L)), AbstractC3056.m6668(-3937626218921461159L));
        if (file.exists()) {
            return calculateMD5(AbstractC6340.f17460.getResources().openRawResource(R.raw.main)).equals(calculateMD5(new FileInputStream(file)));
        }
        return false;
    }

    private void initDescFile(Context context, File file) throws IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.desc);
        AbstractC0455.m1171(file, inputStreamOpenRawResource);
        inputStreamOpenRawResource.close();
    }

    private void initInfoFile(File file) throws IOException {
        Properties properties = new Properties();
        String strReplace = UUID.randomUUID().toString().replace(AbstractC3056.m6668(-3937630191766209959L), AbstractC3056.m6668(-3937561979095614887L));
        properties.setProperty(AbstractC3056.m6668(-3937597717518484903L), AbstractC3056.m6668(-3937626163086886311L));
        properties.setProperty(AbstractC3056.m6668(-3937592030981784999L), strReplace);
        properties.setProperty(AbstractC3056.m6668(-3937630200356144551L), AbstractC3056.m6668(-3937626090072442279L));
        properties.setProperty(AbstractC3056.m6668(-3937630092981962151L), AbstractC3056.m6668(-3937626145907017127L));
        properties.setProperty(AbstractC3056.m6668(-3937630127341700519L), AbstractC3056.m6668(-3937626128727147943L));
        properties.setProperty(AbstractC3056.m6668(-3937627417217336743L), AbstractC3056.m6668(-3937595638754313639L));
        properties.setProperty(AbstractC3056.m6668(-3937630114456798631L), AbstractC3056.m6668(-3937626068597605799L));
        properties.store(new FileWriter(file), (String) null);
    }

    private void initMainJavaFile(Context context, File file) throws IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.main);
        AbstractC0455.m1171(file, inputStreamOpenRawResource);
        inputStreamOpenRawResource.close();
    }

    public void createDemoPlugin(Context context) {
        if (compareFileMD5()) {
            return;
        }
        PluginManager.stopAllPlugin();
        File file = new File(AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620425010578855L)), AbstractC3056.m6668(-3937626163086886311L));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, AbstractC3056.m6668(-3937630251895752103L));
        File file3 = new File(file, AbstractC3056.m6668(-3937626218921461159L));
        File file4 = new File(file, AbstractC3056.m6668(-3937630032852420007L));
        initInfoFile(file2);
        initMainJavaFile(context, file3);
        initDescFile(context, file4);
    }
}
