package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7600 {
    public static final C7596 Companion = new C7596();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18553;

    public /* synthetic */ C7600(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7597.f18550.getDescriptor());
            throw null;
        }
        this.f18553 = str;
        this.f18552 = str2;
        if (AbstractC5971.m10698(str, "file://", false)) {
            return;
        }
        C6755.m11869("'uri' param must start with 'file://'");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7600)) {
            return false;
        }
        C7600 c7600 = (C7600) obj;
        return AbstractC5227.m9466(this.f18553, c7600.f18553) && AbstractC5227.m9466(this.f18552, c7600.f18552);
    }

    public final int hashCode() {
        int iHashCode = this.f18553.hashCode() * 31;
        String str = this.f18552;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Root(uri=");
        sb.append(this.f18553);
        sb.append(", name=");
        return AbstractC0900.m708(sb, this.f18552, ')');
    }
}
