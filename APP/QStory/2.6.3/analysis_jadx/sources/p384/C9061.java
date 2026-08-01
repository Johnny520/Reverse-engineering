package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9061 {
    public static final C9005 Companion = new C9005();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25356;

    public /* synthetic */ C9061(int i, String str) {
        if ((i & 1) == 0) {
            this.f25356 = "";
        } else {
            this.f25356 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9061) && AbstractC4395.m8907(this.f25356, ((C9061) obj).f25356);
    }

    public final int hashCode() {
        return this.f25356.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1444));
        return AbstractC0053.m148(sb, this.f25356, ')');
    }
}
