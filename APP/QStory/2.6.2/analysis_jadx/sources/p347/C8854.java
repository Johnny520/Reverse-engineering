package p347;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C8854 {
    public static final C8855 Companion = new C8855();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f24962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24965;

    public /* synthetic */ C8854(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.f24965 = 0;
        } else {
            this.f24965 = i2;
        }
        if ((i & 2) == 0) {
            this.f24964 = 0;
        } else {
            this.f24964 = i3;
        }
        if ((i & 4) == 0) {
            this.f24963 = 0;
        } else {
            this.f24963 = i4;
        }
        if ((i & 8) == 0) {
            this.f24962 = new byte[0];
        } else {
            this.f24962 = bArr;
        }
        if ((i & 16) == 0) {
            this.f24961 = 0;
        } else {
            this.f24961 = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8854.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3056.m6668(-3937278820491724199L);
        obj.getClass();
        C8854 c8854 = (C8854) obj;
        return this.f24965 == c8854.f24965 && this.f24964 == c8854.f24964 && Arrays.equals(this.f24962, c8854.f24962);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24962) + (((this.f24965 * 31) + this.f24964) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937278369520158119L));
        AbstractC6136.m11533(sb, this.f24965, -3937278352340288935L);
        AbstractC6136.m11533(sb, this.f24964, -3937278279325844903L);
        AbstractC6136.m11533(sb, this.f24963, -3937278184836564391L);
        sb.append(Arrays.toString(this.f24962));
        sb.append(AbstractC3056.m6668(-3937278107527153063L));
        return AbstractC0053.m154(sb, this.f24961, ')');
    }

    public C8854(byte[] bArr) {
        AbstractC3056.m6668(-3937278902096102823L);
        this.f24965 = 36994;
        this.f24964 = 1;
        this.f24963 = 0;
        this.f24962 = bArr;
        this.f24961 = 1;
    }
}
