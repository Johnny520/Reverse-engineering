package p059;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;

/* JADX INFO: renamed from: 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5086 f18302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5092 f18303;

    public C6856(InterfaceC5092 interfaceC5092, InterfaceC5086 interfaceC5086) {
        interfaceC5092.getClass();
        this.f18303 = interfaceC5092;
        this.f18302 = interfaceC5086;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6856)) {
            return false;
        }
        InterfaceC5086 interfaceC5086 = this.f18302;
        if (interfaceC5086 == null) {
            C6856 c6856 = (C6856) obj;
            if (c6856.f18302 == null) {
                return AbstractC4394.m8917(this.f18303, c6856.f18303);
            }
        }
        return AbstractC4394.m8917(interfaceC5086, ((C6856) obj).f18302);
    }

    public final int hashCode() {
        InterfaceC5086 interfaceC5086 = this.f18302;
        return interfaceC5086 != null ? interfaceC5086.hashCode() : this.f18303.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.f18302;
        if (obj == null) {
            obj = this.f18303;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
