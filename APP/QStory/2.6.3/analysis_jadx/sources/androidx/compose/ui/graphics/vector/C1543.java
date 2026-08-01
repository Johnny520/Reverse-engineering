package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;
import io.ktor.client.plugins.api.C3886;
import kotlin.jvm.internal.AbstractC4395;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int f4482;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3886 f4483 = new C3886(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1540 f4484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4489;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f4490;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f4491;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f4492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f4493;

    public C1543(String str, float f, float f2, float f3, float f4, C1540 c1540, long j, int i, boolean z) {
        int i2;
        synchronized (f4483) {
            i2 = f4482;
            f4482 = i2 + 1;
        }
        this.f4489 = str;
        this.f4488 = f;
        this.f4487 = f2;
        this.f4486 = f3;
        this.f4485 = f4;
        this.f4484 = c1540;
        this.f4491 = j;
        this.f4490 = i;
        this.f4492 = z;
        this.f4493 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1543)) {
            return false;
        }
        C1543 c1543 = (C1543) obj;
        return AbstractC4395.m8907(this.f4489, c1543.f4489) && C7893.m13318(this.f4488, c1543.f4488) && C7893.m13318(this.f4487, c1543.f4487) && this.f4486 == c1543.f4486 && this.f4485 == c1543.f4485 && this.f4484.equals(c1543.f4484) && C1599.m2949(this.f4491, c1543.f4491) && this.f4490 == c1543.f4490 && this.f4492 == c1543.f4492;
    }

    public final int hashCode() {
        int iHashCode = (this.f4484.hashCode() + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(this.f4489.hashCode() * 31, this.f4488, 31), this.f4487, 31), this.f4486, 31), this.f4485, 31)) * 31;
        int i = C1599.f4699;
        return Boolean.hashCode(this.f4492) + AbstractC0053.m144(this.f4490, AbstractC0053.m142(iHashCode, 31, this.f4491), 31);
    }
}
