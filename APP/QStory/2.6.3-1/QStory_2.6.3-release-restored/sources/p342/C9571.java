package p342;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import p408.C9931;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9571 f24981;

    static {
        "HbConfig";
        "LIN_XPOSED";
        f24981 = new C9571();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m14997() {
        C9931 c9931 = new C9931();
        c9931.m15254("qwallet_pb_handle_trpc_error", "QWalletHttp-QWalletPbServlet");
        c9931.f25871 = "mqq.app.MSFServlet";
        Class clsM15255 = c9931.m15255();
        "first(...)";
        clsM15255.getClass();
        return clsM15255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m14998(byte[] bArr) {
        "bArr";
        bArr.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 4);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(bArr.length + 4);
                dataOutputStream.write(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArrayOutputStream.close();
                "use(...)";
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }
}
