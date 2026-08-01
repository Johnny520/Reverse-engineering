package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6777 {
    public static final C6776 Companion = new C6776();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18219;

    public /* synthetic */ C6777(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18219 = bool;
        } else {
            AbstractC7143.m12393(i, 1, C6755.f18194.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6777) && AbstractC4394.m8917(this.f18219, ((C6777) obj).f18219);
    }

    public final int hashCode() {
        Boolean bool = this.f18219;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Prompts(listChanged=" + this.f18219 + ')';
    }

    public C6777() {
        this.f18219 = null;
    }
}
