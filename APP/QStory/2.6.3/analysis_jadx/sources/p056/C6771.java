package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6771 {
    public static final C6767 Companion = new C6767();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18208;

    public /* synthetic */ C6771(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6768.f18205.getDescriptor());
            throw null;
        }
        this.f18208 = str;
        this.f18207 = str2;
        if (AbstractC5139.m10139(str, "file://", false)) {
            return;
        }
        C5925.m11310("'uri' param must start with 'file://'");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6771)) {
            return false;
        }
        C6771 c6771 = (C6771) obj;
        return AbstractC4395.m8907(this.f18208, c6771.f18208) && AbstractC4395.m8907(this.f18207, c6771.f18207);
    }

    public final int hashCode() {
        int iHashCode = this.f18208.hashCode() * 31;
        String str = this.f18207;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Root(uri=");
        sb.append(this.f18208);
        sb.append(", name=");
        return AbstractC0053.m148(sb, this.f18207, ')');
    }
}
