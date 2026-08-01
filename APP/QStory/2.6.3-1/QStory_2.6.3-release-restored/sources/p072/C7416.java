package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7416 implements InterfaceC7561 {
    public static final C7417 Companion = new C7417();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18306;

    public /* synthetic */ C7416(int i, String str, String str2) {
        this.f18306 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18305 = "text";
        } else {
            this.f18305 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7416) && AbstractC5227.m9466(this.f18306, ((C7416) obj).f18306);
    }

    public final int hashCode() {
        String str = this.f18306;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("TextContent(text="), this.f18306, ')');
    }
}
