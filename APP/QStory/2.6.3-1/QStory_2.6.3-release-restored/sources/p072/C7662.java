package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7662 implements InterfaceC7665 {
    public static final C7663 Companion = new C7663();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18620;

    public /* synthetic */ C7662(int i, String str) {
        if (1 == (i & 1)) {
            this.f18620 = str;
        } else {
            AbstractC7973.m12979(i, 1, C7667.f18623.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7662) && AbstractC5227.m9466(this.f18620, ((C7662) obj).f18620);
    }

    public final int hashCode() {
        return this.f18620.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("StringId(value="), this.f18620, ')');
    }

    public C7662(String str) {
        str.getClass();
        this.f18620 = str;
    }
}
