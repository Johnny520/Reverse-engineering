package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1067;
import androidx.compose.ui.text.font.C1985;
import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4207;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5132;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.internal.C5351;
import p095.C7207;
import p095.ExecutorC7208;
import p175.AbstractC7739;
import top.suzhelan.qstory.ui.components.C5967;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f16298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f16299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5351 f16300;

    static {
        C1985 c1985 = new C1985(C5433.f15082, 1);
        C7207 c7207 = AbstractC5395.f15030;
        f16300 = AbstractC5399.m10489(ExecutorC7208.f19225.plus(c1985));
        f16299 = AbstractC4347.m8845(new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp"});
        f16298 = AbstractC7739.m13055("config.json");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11356(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        byte[] bArr = new byte[4096];
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m11356(file2, str + file2.getName() + "/", zipOutputStream);
            } else if (f16298.contains(file2.getName())) {
                continue;
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(AbstractC0053.m136(str, file2.getName())));
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
                            AbstractC2905.m6308(fileInputStream, th);
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
    public static void m11357(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C5967 c5967) {
        str2.getClass();
        AbstractC5399.m10477(f16300, null, null, new StickerUploader$upload$1(str, str8, str2, str5, str6, str3, str4, str7, c5967, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11358(LinkedHashMap linkedHashMap, String str, String str2) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        String str3 = AbstractC4344.m8810(AbstractC4344.m8777(linkedHashMap.keySet()), "&", null, null, new C1067(linkedHashMap, 27), 30) + "&timestamp=" + str + "&nonce=" + str2;
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC5132.f14688;
        byte[] bytes = StickerSdkConfig.SIGN_SECRET.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str3.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        return AbstractC4347.m8855(bArrDoFinal, new C4207(24), 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File m11359(java.io.File r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.sticker.sdk.presenter.C5984.m11359(java.io.File, java.lang.String):java.io.File");
    }
}
