package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1905;
import androidx.compose.p001ui.text.font.C2819;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5039;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.p008io.AbstractC5213;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.internal.C6183;
import p111.C8036;
import p111.ExecutorC8037;
import p191.AbstractC8568;
import top.suzhelan.qstory.p015ui.components.C6797;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f16643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f16644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6183 f16645;

    static {
        C2819 c2819 = new C2819(C6265.f15427, 1);
        C8036 c8036 = AbstractC6227.f15375;
        f16645 = AbstractC6231.m11048(ExecutorC8037.f19570.plus(c2819));
        f16644 = AbstractC5179.m9404(new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp"});
        f16643 = AbstractC8568.m13614("config.json");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11915(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        byte[] bArr = new byte[4096];
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m11915(file2, str + file2.getName() + "/", zipOutputStream);
            } else if (f16643.contains(file2.getName())) {
                continue;
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(AbstractC0900.m696(str, file2.getName())));
                FileInputStream fileInputStream = new FileInputStream(file2);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3738.m6868(fileInputStream, th);
                            throw th2;
                        }
                    }
                }
                fileInputStream.close();
                zipOutputStream.closeEntry();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11916(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C6797 c6797) {
        str2.getClass();
        AbstractC6231.m11036(f16645, null, null, new StickerUploader$upload$1(str, str8, str2, str5, str6, str3, str4, str7, c6797, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11917(LinkedHashMap linkedHashMap, String str, String str2) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        String str3 = AbstractC5176.m9369(AbstractC5176.m9336(linkedHashMap.keySet()), "&", null, null, new C1905(linkedHashMap, 27), 30) + "&timestamp=" + str + "&nonce=" + str2;
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC5964.f15033;
        byte[] bytes = StickerSdkConfig.SIGN_SECRET.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str3.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        return AbstractC5179.m9414(bArrDoFinal, new C5039(24), 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final File m11918(File file, String str) {
        if (str != null && !AbstractC5976.m10731(str)) {
            File file2 = new File(file, str);
            if (file2.exists() && file2.isFile()) {
                return file2;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        Object obj = null;
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file3 : fileArrListFiles) {
            if (file3.isFile() && !f16643.contains(file3.getName())) {
                arrayList.add(file3);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file4 = (File) next;
            file4.getClass();
            String lowerCase = AbstractC5213.m9431(file4).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            boolean z = true;
            if (!f16644.contains(lowerCase)) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file4), 8192);
                    try {
                        byte[] bArr = new byte[12];
                        int i = bufferedInputStream.read(bArr);
                        if (i >= 3) {
                            byte b = bArr[0];
                            if (b != -1 || bArr[1] != -40) {
                                if ((b != -119 || bArr[1] != 80) && ((b != 71 || bArr[1] != 73 || bArr[2] != 70) && (b != 66 || bArr[1] != 77))) {
                                    if (i >= 12) {
                                        Charset charset = AbstractC5964.f15033;
                                        if (!new String(bArr, 0, 4, charset).equals("RIFF") || !new String(bArr, 8, 4, charset).equals("WEBP")) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3738.m6868(bufferedInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    z = false;
                }
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }
}
