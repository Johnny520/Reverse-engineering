package p056;

import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6610 implements InterfaceC6795 {
    public static final C6614 Companion = new C6614();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7151 f17989;

    public C6610(int i, C7151 c7151) {
        if ((i & 1) == 0) {
            this.f17989 = AbstractC6601.f17981;
        } else {
            this.f17989 = c7151;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6610) && AbstractC4394.m8917(this.f17989, ((C6610) obj).f17989);
    }

    public final int hashCode() {
        return this.f17989.f19121.hashCode();
    }

    public final String toString() {
        return AbstractC6136.m11552(new StringBuilder("EmptyRequestResult(_meta="), this.f17989, ')');
    }

    public C6610() {
        C7151 c7151 = AbstractC6601.f17981;
        c7151.getClass();
        this.f17989 = c7151;
    }
}
