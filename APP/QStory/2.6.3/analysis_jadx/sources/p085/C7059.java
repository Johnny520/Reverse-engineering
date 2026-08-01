package p085;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import p086.C7063;
import p086.InterfaceC7064;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7059 implements InterfaceC7064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7063 f18957 = new C7063(AbstractC4396.f12975.mo8917(C7059.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18958 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f18959;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7059.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7059 c7059 = (C7059) obj;
        return this.f18959 == c7059.f18959 && AbstractC4395.m8907(this.f18958, c7059.f18958);
    }

    @Override // p086.InterfaceC7064
    public final C7063 getType() {
        return f18957;
    }

    public final int hashCode() {
        return this.f18958.hashCode() + (Boolean.hashCode(this.f18959) * 31);
    }
}
