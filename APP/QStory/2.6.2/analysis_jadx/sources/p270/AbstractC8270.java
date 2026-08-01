package p270;

import java.sql.Date;
import java.sql.Timestamp;
import p270.C8274;
import p270.C8276;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8273 f22890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8274.C8275 f22891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8276.C8277 f22892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8271 f22893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8271 f22894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f22895;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f22895 = z;
        if (z) {
            f22894 = new C8271(Date.class, 0);
            f22893 = new C8271(Timestamp.class, 1);
            f22892 = C8276.f22901;
            f22891 = C8274.f22899;
            f22890 = C8272.f22897;
            return;
        }
        f22894 = null;
        f22893 = null;
        f22892 = null;
        f22891 = null;
        f22890 = null;
    }
}
