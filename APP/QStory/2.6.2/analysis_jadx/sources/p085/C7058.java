package p085;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import p086.C7062;
import p086.InterfaceC7063;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7058 implements InterfaceC7063 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7062 f18962 = new C7062(AbstractC4395.f12971.mo8927(C7058.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18963 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f18964;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7058.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7058 c7058 = (C7058) obj;
        return this.f18964 == c7058.f18964 && AbstractC4394.m8917(this.f18963, c7058.f18963);
    }

    @Override // p086.InterfaceC7063
    public final C7062 getType() {
        return f18962;
    }

    public final int hashCode() {
        return this.f18963.hashCode() + (Boolean.hashCode(this.f18964) * 31);
    }
}
