package p059;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;

/* JADX INFO: renamed from: 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5087 f18297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5093 f18298;

    public C6857(InterfaceC5093 interfaceC5093, InterfaceC5087 interfaceC5087) {
        interfaceC5093.getClass();
        this.f18298 = interfaceC5093;
        this.f18297 = interfaceC5087;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6857)) {
            return false;
        }
        InterfaceC5087 interfaceC5087 = this.f18297;
        if (interfaceC5087 == null) {
            C6857 c6857 = (C6857) obj;
            if (c6857.f18297 == null) {
                return AbstractC4395.m8907(this.f18298, c6857.f18298);
            }
        }
        return AbstractC4395.m8907(interfaceC5087, ((C6857) obj).f18297);
    }

    public final int hashCode() {
        InterfaceC5087 interfaceC5087 = this.f18297;
        return interfaceC5087 != null ? interfaceC5087.hashCode() : this.f18298.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.f18297;
        if (obj == null) {
            obj = this.f18298;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
