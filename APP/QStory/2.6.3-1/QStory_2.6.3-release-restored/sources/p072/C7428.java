package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪子兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7428 implements InterfaceC7561 {
    public static final C7429 Companion = new C7429();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18319;

    public /* synthetic */ C7428(int i, String str) {
        if (1 == (i & 1)) {
            this.f18319 = str;
        } else {
            AbstractC7973.m12979(i, 1, C7430.f18320.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7428) && AbstractC5227.m9466(this.f18319, ((C7428) obj).f18319);
    }

    public final int hashCode() {
        return this.f18319.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("UnknownContent(type="), this.f18319, ')');
    }
}
