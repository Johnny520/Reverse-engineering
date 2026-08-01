package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7649 {
    public static final C7648 Companion = new C7648();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18602;

    public /* synthetic */ C7649(int i, String str) {
        if (1 == (i & 1)) {
            this.f18602 = str;
        } else {
            AbstractC7973.m12979(i, 1, C7644.f18600.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7649) && AbstractC5227.m9466(this.f18602, ((C7649) obj).f18602);
    }

    public final int hashCode() {
        String str = this.f18602;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("ModelHint(name="), this.f18602, ')');
    }
}
