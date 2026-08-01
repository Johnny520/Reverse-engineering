package p236;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8098 f22368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8098 f22369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8098 f22370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8098 f22371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8098 f22372;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8098 f22373;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8098 f22374;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final List f22375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22376;

    static {
        C8098 c8098 = new C8098("GET");
        f22372 = c8098;
        C8098 c80982 = new C8098("POST");
        f22371 = c80982;
        C8098 c80983 = new C8098("PUT");
        f22370 = c80983;
        C8098 c80984 = new C8098("PATCH");
        f22369 = c80984;
        C8098 c80985 = new C8098("DELETE");
        f22368 = c80985;
        C8098 c80986 = new C8098("HEAD");
        f22374 = c80986;
        C8098 c80987 = new C8098("OPTIONS");
        f22373 = c80987;
        f22375 = AbstractC8189.m13659(c8098, c80982, c80983, c80984, c80985, c80986, c80987);
    }

    public C8098(String str) {
        str.getClass();
        this.f22376 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8098) && AbstractC4394.m8917(this.f22376, ((C8098) obj).f22376);
    }

    public final int hashCode() {
        return this.f22376.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("HttpMethod(value="), this.f22376, ')');
    }
}
