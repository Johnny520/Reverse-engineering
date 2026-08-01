package p112;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3064;
import io.ktor.client.plugins.AbstractC3932;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7326 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f19534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f19535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f19536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f19537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f19538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f19539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19540;

    static {
        AbstractC4921.m9888(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C7326(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f19538 = f;
        this.f19537 = f2;
        this.f19536 = f3;
        this.f19535 = f4;
        this.f19534 = j;
        this.f19533 = j2;
        this.f19540 = j3;
        this.f19539 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7326)) {
            return false;
        }
        C7326 c7326 = (C7326) obj;
        return Float.compare(this.f19538, c7326.f19538) == 0 && Float.compare(this.f19537, c7326.f19537) == 0 && Float.compare(this.f19536, c7326.f19536) == 0 && Float.compare(this.f19535, c7326.f19535) == 0 && AbstractC3064.m6768(this.f19534, c7326.f19534) && AbstractC3064.m6768(this.f19533, c7326.f19533) && AbstractC3064.m6768(this.f19540, c7326.f19540) && AbstractC3064.m6768(this.f19539, c7326.f19539);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19539) + AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f19538) * 31, this.f19537, 31), this.f19536, 31), this.f19535, 31), 31, this.f19534), 31, this.f19533), 31, this.f19540);
    }

    public final String toString() {
        String str = AbstractC3932.m8302(this.f19538) + ", " + AbstractC3932.m8302(this.f19537) + ", " + AbstractC3932.m8302(this.f19536) + ", " + AbstractC3932.m8302(this.f19535);
        long j = this.f19534;
        long j2 = this.f19533;
        boolean zM6768 = AbstractC3064.m6768(j, j2);
        long j3 = this.f19540;
        long j4 = this.f19539;
        if (!zM6768 || !AbstractC3064.m6768(j2, j3) || !AbstractC3064.m6768(j3, j4)) {
            StringBuilder sbM11550 = AbstractC6136.m11550("RoundRect(rect=", str, ", topLeft=");
            sbM11550.append((Object) AbstractC3064.m6781(j));
            sbM11550.append(", topRight=");
            sbM11550.append((Object) AbstractC3064.m6781(j2));
            sbM11550.append(", bottomRight=");
            sbM11550.append((Object) AbstractC3064.m6781(j3));
            sbM11550.append(", bottomLeft=");
            sbM11550.append((Object) AbstractC3064.m6781(j4));
            sbM11550.append(')');
            return sbM11550.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM115502 = AbstractC6136.m11550("RoundRect(rect=", str, ", radius=");
            sbM115502.append(AbstractC3932.m8302(Float.intBitsToFloat(i)));
            sbM115502.append(')');
            return sbM115502.toString();
        }
        StringBuilder sbM115503 = AbstractC6136.m11550("RoundRect(rect=", str, ", x=");
        sbM115503.append(AbstractC3932.m8302(Float.intBitsToFloat(i)));
        sbM115503.append(", y=");
        sbM115503.append(AbstractC3932.m8302(Float.intBitsToFloat(i2)));
        sbM115503.append(')');
        return sbM115503.toString();
    }
}
