package p322;

import com.bumptech.glide.AbstractC3056;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import p394.C9131;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8724 f24590;

    static {
        "HbConfig";
        "LIN_XPOSED";
        f24590 = new C8724();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m14400() {
        C9131 c9131 = new C9131();
        c9131.m14699("qwallet_pb_handle_trpc_error", "QWalletHttp-QWalletPbServlet");
        c9131.f25549 = "mqq.app.MSFServlet";
        Class clsM14701 = c9131.m14701();
        "first(...)";
        clsM14701.getClass();
        return clsM14701;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m14401(byte[] bArr) {
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
