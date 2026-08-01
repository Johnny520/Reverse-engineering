package p409;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9935 {
    public static final C9936 Companion = new C9936();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25879;

    public /* synthetic */ C9935(int i, String str) {
        if (1 == (i & 1)) {
            this.f25879 = str;
        } else {
            AbstractC7973.m12979(i, 1, C9937.f25880.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9935) && AbstractC5227.m9466(this.f25879, ((C9935) obj).f25879);
    }

    public final int hashCode() {
        return this.f25879.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m718("ClassInfo(className=", this.f25879, ")");
    }

    public C9935(String str) {
        this.f25879 = str;
    }
}
