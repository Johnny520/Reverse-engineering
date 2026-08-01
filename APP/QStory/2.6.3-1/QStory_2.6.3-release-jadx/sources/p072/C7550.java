package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7550 {
    public static final C7551 Companion = new C7551();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18497;

    public /* synthetic */ C7550(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7548.f18492.getDescriptor());
            throw null;
        }
        this.f18497 = str;
        this.f18496 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7550)) {
            return false;
        }
        C7550 c7550 = (C7550) obj;
        return AbstractC5227.m9466(this.f18497, c7550.f18497) && AbstractC5227.m9466(this.f18496, c7550.f18496);
    }

    public final int hashCode() {
        return this.f18496.hashCode() + (this.f18497.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Implementation(name=");
        sb.append(this.f18497);
        sb.append(", version=");
        return AbstractC0900.m708(sb, this.f18496, ')');
    }

    public C7550() {
        this.f18497 = "mcp-ktor";
        this.f18496 = "0.5.0";
    }
}
