package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7457 {
    public static final C7521 Companion = new C7521();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18360;

    public /* synthetic */ C7457(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7520.f18446.getDescriptor());
            throw null;
        }
        this.f18360 = str;
        this.f18359 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7457)) {
            return false;
        }
        C7457 c7457 = (C7457) obj;
        return AbstractC5227.m9466(this.f18360, c7457.f18360) && AbstractC5227.m9466(this.f18359, c7457.f18359);
    }

    public final int hashCode() {
        return this.f18359.hashCode() + (this.f18360.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Argument(name=");
        sb.append(this.f18360);
        sb.append(", value=");
        return AbstractC0900.m708(sb, this.f18359, ')');
    }
}
