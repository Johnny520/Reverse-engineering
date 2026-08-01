package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6764 {
    public static final C6763 Companion = new C6763();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18202;

    public /* synthetic */ C6764(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18202 = bool;
        } else {
            AbstractC7144.m12420(i, 1, C6775.f18211.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6764) && AbstractC4395.m8907(this.f18202, ((C6764) obj).f18202);
    }

    public final int hashCode() {
        Boolean bool = this.f18202;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Tools(listChanged=" + this.f18202 + ')';
    }

    public C6764() {
        this.f18202 = null;
    }
}
