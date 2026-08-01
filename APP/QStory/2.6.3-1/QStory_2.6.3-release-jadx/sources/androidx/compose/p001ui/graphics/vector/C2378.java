package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2434;
import io.ktor.client.plugins.api.C4718;
import kotlin.jvm.internal.AbstractC5227;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2378 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int f4827;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4718 f4828 = new C4718(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2375 f4829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4834;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f4835;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f4836;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f4837;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f4838;

    public C2378(String str, float f, float f2, float f3, float f4, C2375 c2375, long j, int i, boolean z) {
        int i2;
        synchronized (f4828) {
            i2 = f4827;
            f4827 = i2 + 1;
        }
        this.f4834 = str;
        this.f4833 = f;
        this.f4832 = f2;
        this.f4831 = f3;
        this.f4830 = f4;
        this.f4829 = c2375;
        this.f4836 = j;
        this.f4835 = i;
        this.f4837 = z;
        this.f4838 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2378)) {
            return false;
        }
        C2378 c2378 = (C2378) obj;
        return AbstractC5227.m9466(this.f4834, c2378.f4834) && C8722.m13877(this.f4833, c2378.f4833) && C8722.m13877(this.f4832, c2378.f4832) && this.f4831 == c2378.f4831 && this.f4830 == c2378.f4830 && this.f4829.equals(c2378.f4829) && C2434.m3509(this.f4836, c2378.f4836) && this.f4835 == c2378.f4835 && this.f4837 == c2378.f4837;
    }

    public final int hashCode() {
        int iHashCode = (this.f4829.hashCode() + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(this.f4834.hashCode() * 31, this.f4833, 31), this.f4832, 31), this.f4831, 31), this.f4830, 31)) * 31;
        int i = C2434.f5044;
        return Boolean.hashCode(this.f4837) + AbstractC0900.m704(this.f4835, AbstractC0900.m702(iHashCode, 31, this.f4836), 31);
    }
}
