package p108;

import java.io.File;
import kotlin.AbstractC6019;
import kotlin.text.AbstractC5971;
import p091.C7790;
import p104.C7996;

/* JADX INFO: renamed from: 飘花落叶言世苏哲兰子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7790 f19556;

    static {
        AbstractC6019.m10773(new C7996(4));
        f19556 = new C7790(1);
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        new File(property);
        String property2 = System.getProperty("os.name");
        if (property2 != null) {
            AbstractC5971.m10698(property2, "Windows", false);
        }
    }
}
