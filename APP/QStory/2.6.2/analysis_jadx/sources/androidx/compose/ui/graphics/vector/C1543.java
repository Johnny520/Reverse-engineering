package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;
import io.ktor.client.plugins.api.C3885;
import kotlin.jvm.internal.AbstractC4394;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int f4481;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3885 f4482 = new C3885(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1540 f4483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4488;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f4489;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f4490;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f4491;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f4492;

    public C1543(String str, float f, float f2, float f3, float f4, C1540 c1540, long j, int i, boolean z) {
        int i2;
        synchronized (f4482) {
            i2 = f4481;
            f4481 = i2 + 1;
        }
        this.f4488 = str;
        this.f4487 = f;
        this.f4486 = f2;
        this.f4485 = f3;
        this.f4484 = f4;
        this.f4483 = c1540;
        this.f4490 = j;
        this.f4489 = i;
        this.f4491 = z;
        this.f4492 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1543)) {
            return false;
        }
        C1543 c1543 = (C1543) obj;
        return AbstractC4394.m8917(this.f4488, c1543.f4488) && C7892.m13290(this.f4487, c1543.f4487) && C7892.m13290(this.f4486, c1543.f4486) && this.f4485 == c1543.f4485 && this.f4484 == c1543.f4484 && this.f4483.equals(c1543.f4483) && C1599.m2939(this.f4490, c1543.f4490) && this.f4489 == c1543.f4489 && this.f4491 == c1543.f4491;
    }

    public final int hashCode() {
        int iHashCode = (this.f4483.hashCode() + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(this.f4488.hashCode() * 31, this.f4487, 31), this.f4486, 31), this.f4485, 31), this.f4484, 31)) * 31;
        int i = C1599.f4698;
        return Boolean.hashCode(this.f4491) + AbstractC0053.m143(this.f4489, AbstractC0053.m141(iHashCode, 31, this.f4490), 31);
    }
}
