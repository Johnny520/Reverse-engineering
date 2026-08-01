package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6720 implements InterfaceC6732 {
    public static final C6724 Companion = new C6724();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18150;

    public /* synthetic */ C6720(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6723.f18153.getDescriptor());
            throw null;
        }
        this.f18150 = str;
        this.f18149 = str2;
        if ((i & 4) == 0) {
            this.f18148 = "image";
        } else {
            this.f18148 = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6720)) {
            return false;
        }
        C6720 c6720 = (C6720) obj;
        return AbstractC4395.m8907(this.f18150, c6720.f18150) && AbstractC4395.m8907(this.f18149, c6720.f18149);
    }

    public final int hashCode() {
        return this.f18149.hashCode() + (this.f18150.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageContent(data=");
        sb.append(this.f18150);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f18149, ')');
    }
}
