package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6820 {
    public static final C6819 Companion = new C6819();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18257;

    public /* synthetic */ C6820(int i, String str) {
        if (1 == (i & 1)) {
            this.f18257 = str;
        } else {
            AbstractC7144.m12420(i, 1, C6815.f18255.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6820) && AbstractC4395.m8907(this.f18257, ((C6820) obj).f18257);
    }

    public final int hashCode() {
        String str = this.f18257;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("ModelHint(name="), this.f18257, ')');
    }
}
