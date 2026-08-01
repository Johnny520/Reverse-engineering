package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9837 {
    public static final C9838 Companion = new C9838();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25632;

    public /* synthetic */ C9837(int i, String str) {
        if ((i & 1) == 0) {
            this.f25632 = "";
        } else {
            this.f25632 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9837) && AbstractC5227.m9466(this.f25632, ((C9837) obj).f25632);
    }

    public final int hashCode() {
        return this.f25632.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1442));
        return AbstractC0900.m708(sb, this.f25632, ')');
    }
}
