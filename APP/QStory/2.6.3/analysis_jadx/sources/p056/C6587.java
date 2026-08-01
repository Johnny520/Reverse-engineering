package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6587 implements InterfaceC6732 {
    public static final C6588 Companion = new C6588();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17961;

    public /* synthetic */ C6587(int i, String str, String str2) {
        this.f17961 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f17960 = "text";
        } else {
            this.f17960 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6587) && AbstractC4395.m8907(this.f17961, ((C6587) obj).f17961);
    }

    public final int hashCode() {
        String str = this.f17961;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("TextContent(text="), this.f17961, ')');
    }
}
