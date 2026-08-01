package p252;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8928 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8928 f22711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8928 f22712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8928 f22713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8928 f22714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8928 f22715;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8928 f22716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8928 f22717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final List f22718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22719;

    static {
        C8928 c8928 = new C8928("GET");
        f22715 = c8928;
        C8928 c89282 = new C8928("POST");
        f22714 = c89282;
        C8928 c89283 = new C8928("PUT");
        f22713 = c89283;
        C8928 c89284 = new C8928("PATCH");
        f22712 = c89284;
        C8928 c89285 = new C8928("DELETE");
        f22711 = c89285;
        C8928 c89286 = new C8928("HEAD");
        f22717 = c89286;
        C8928 c89287 = new C8928("OPTIONS");
        f22716 = c89287;
        f22718 = AbstractC7176.m12490(c8928, c89282, c89283, c89284, c89285, c89286, c89287);
    }

    public C8928(String str) {
        str.getClass();
        this.f22719 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8928) && AbstractC5227.m9466(this.f22719, ((C8928) obj).f22719);
    }

    public final int hashCode() {
        return this.f22719.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("HttpMethod(value="), this.f22719, ')');
    }
}
