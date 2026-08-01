package p236;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8099 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8099 f22366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8099 f22367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8099 f22368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8099 f22369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8099 f22370;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8099 f22371;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8099 f22372;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final List f22373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22374;

    static {
        C8099 c8099 = new C8099("GET");
        f22370 = c8099;
        C8099 c80992 = new C8099("POST");
        f22369 = c80992;
        C8099 c80993 = new C8099("PUT");
        f22368 = c80993;
        C8099 c80994 = new C8099("PATCH");
        f22367 = c80994;
        C8099 c80995 = new C8099("DELETE");
        f22366 = c80995;
        C8099 c80996 = new C8099("HEAD");
        f22372 = c80996;
        C8099 c80997 = new C8099("OPTIONS");
        f22371 = c80997;
        f22373 = AbstractC6347.m11931(c8099, c80992, c80993, c80994, c80995, c80996, c80997);
    }

    public C8099(String str) {
        str.getClass();
        this.f22374 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8099) && AbstractC4395.m8907(this.f22374, ((C8099) obj).f22374);
    }

    public final int hashCode() {
        return this.f22374.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("HttpMethod(value="), this.f22374, ')');
    }
}
