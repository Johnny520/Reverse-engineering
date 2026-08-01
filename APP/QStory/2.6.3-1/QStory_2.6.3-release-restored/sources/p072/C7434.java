package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7434 implements InterfaceC7656 {
    public static final C7435 Companion = new C7435();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18325;

    public /* synthetic */ C7434(int i, String str) {
        if (1 == (i & 1)) {
            this.f18325 = str;
        } else {
            AbstractC7973.m12979(i, 1, C7436.f18326.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7434) && AbstractC5227.m9466(this.f18325, ((C7434) obj).f18325);
    }

    public final int hashCode() {
        return this.f18325.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("UnknownReference(type="), this.f18325, ')');
    }
}
