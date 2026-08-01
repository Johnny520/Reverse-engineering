package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4410 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4687 f12993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4687 f12994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f12995;

    public C4410(C4687 c4687, C4687 c46872, C4687 c46873) {
        this.f12995 = c4687;
        this.f12994 = c46872;
        this.f12993 = c46873;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4410)) {
            return false;
        }
        C4410 c4410 = (C4410) obj;
        return this.f12995.equals(c4410.f12995) && this.f12994.equals(c4410.f12994) && this.f12993.equals(c4410.f12993);
    }

    public final int hashCode() {
        return this.f12993.hashCode() + ((this.f12994.hashCode() + (this.f12995.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f12995 + ", kotlinReadOnly=" + this.f12994 + ", kotlinMutable=" + this.f12993 + ')';
    }
}
