package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.text.font.C1985;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4206;
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
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5131;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.internal.C5350;
import p095.C7206;
import p095.ExecutorC7207;
import top.suzhelan.qstory.ui.components.C5961;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f16289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f16290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5350 f16291;

    static {
        C1985 c1985 = new C1985(C5432.f15082, 1);
        C7206 c7206 = AbstractC5394.f15030;
        f16291 = AbstractC5398.m10485(ExecutorC7207.f19230.plus(c1985));
        f16290 = AbstractC4346.m8852(new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp"});
        f16289 = AbstractC0455.m1140("config.json");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11296(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        byte[] bArr = new byte[4096];
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m11296(file2, str + file2.getName() + "/", zipOutputStream);
            } else if (f16289.contains(file2.getName())) {
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
                            AbstractC3065.m6841(fileInputStream, th);
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
    public static void m11297(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C5961 c5961) {
        str2.getClass();
        AbstractC5398.m10473(f16291, null, null, new StickerUploader$upload$1(str, str8, str2, str5, str6, str3, str4, str7, c5961, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11298(LinkedHashMap linkedHashMap, String str, String str2) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        String str3 = AbstractC4343.m8813(AbstractC4343.m8814(linkedHashMap.keySet()), "&", null, null, new C1067(linkedHashMap, 27), 30) + "&timestamp=" + str + "&nonce=" + str2;
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC5131.f14688;
        byte[] bytes = StickerSdkConfig.SIGN_SECRET.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str3.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        return AbstractC4346.m8860(bArrDoFinal, new C4206(24), 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File m11299(java.io.File r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.sticker.sdk.presenter.C5978.m11299(java.io.File, java.lang.String):java.io.File");
    }
}
