package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6800 implements InterfaceC6827 {
    public static final C6797 Companion = new C6797();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18239;

    public /* synthetic */ C6800(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6798.f18236.getDescriptor());
            throw null;
        }
        this.f18239 = str;
        if ((i & 2) == 0) {
            this.f18238 = "ref/resource";
        } else {
            this.f18238 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6800) && AbstractC4395.m8907(this.f18239, ((C6800) obj).f18239);
    }

    public final int hashCode() {
        return this.f18239.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("ResourceReference(uri="), this.f18239, ')');
    }
}
