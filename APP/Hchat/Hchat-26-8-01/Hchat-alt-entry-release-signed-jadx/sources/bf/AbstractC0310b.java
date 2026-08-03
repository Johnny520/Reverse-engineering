package bf;

import ae.C0074e;
import af.C0084g;
import be.AbstractC0283h;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: bf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0310b {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f883a = AbstractC2846d.m6274b(AbstractC0310b.class);

    /* JADX INFO: renamed from: b */
    public static Path f884b;

    /* JADX INFO: renamed from: c */
    public static final Object f885c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f886d;

    /* JADX INFO: renamed from: e */
    public static final byte[] f887e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Path pathCreateTempDirectory = Files.createTempDirectory("jadx-instance-", new FileAttribute[0]);
            pathCreateTempDirectory.toFile().deleteOnExit();
            f884b = pathCreateTempDirectory;
            f885c = new Object();
            f886d = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);
            f887e = new byte[]{80, 75, 3, 4};
        } catch (Exception e6) {
            throw new C0084g("Failed to create temp root directory", e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m1227a(byte[] bArr) {
        if (bArr.length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b10 = bArr[i9];
            int i10 = i9 * 2;
            byte[] bArr3 = f886d;
            bArr2[i10] = bArr3[(b10 & 255) >>> 4];
            bArr2[i10 + 1] = bArr3[b10 & 15];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1228b(Path path, boolean z9) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList<Path> arrayList2 = new ArrayList();
            Files.walkFileTree(path, Collections.EMPTY_SET, Integer.MAX_VALUE, new C0309a(arrayList, arrayList2));
            if (!arrayList.isEmpty()) {
                arrayList.parallelStream().forEach(new C0074e(8));
            }
            if (z9) {
                AbstractC0283h.m1141U(arrayList2);
            }
            for (Path path2 : arrayList2) {
                try {
                    Files.delete(path2);
                } catch (IOException e6) {
                    f883a.mo6265s(path2.toAbsolutePath(), "Failed to delete directory {}", e6);
                }
            }
        } catch (Exception e7) {
            throw new C0084g("Failed to delete directory ".concat(String.valueOf(path)), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1229c(File file) {
        if (file != null) {
            synchronized (f885c) {
                try {
                    if (!file.mkdirs() && !file.isDirectory()) {
                        throw new C0084g("Can't create directory ".concat(String.valueOf(file)));
                    }
                } finally {
                }
            }
        }
    }
}
