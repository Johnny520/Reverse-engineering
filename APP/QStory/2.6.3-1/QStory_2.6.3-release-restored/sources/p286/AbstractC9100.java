package p286;

import java.sql.Date;
import java.sql.Timestamp;
import p286.C9104;
import p286.C9106;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C9103 f23234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9104.C9105 f23235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9106.C9107 f23236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9101 f23237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9101 f23238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f23239;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f23239 = z;
        if (z) {
            f23238 = new C9101(Date.class, 0);
            f23237 = new C9101(Timestamp.class, 1);
            f23236 = C9106.f23245;
            f23235 = C9104.f23243;
            f23234 = C9102.f23241;
            return;
        }
        f23238 = null;
        f23237 = null;
        f23236 = null;
        f23235 = null;
        f23234 = null;
    }
}
