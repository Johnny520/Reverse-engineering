package p087;

import androidx.core.view.C2268;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4341;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.C5148;
import p091.C7195;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7107 extends C7128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f19040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7195 f19041;

    public C7107(String str, int i) {
        super(str, null, i);
        this.f19041 = C7195.f19210;
        this.f19040 = AbstractC5186.m10210(new C5148(i, str, this));
    }

    @Override // p087.C7128
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC7190)) {
            return false;
        }
        InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
        return interfaceC7190.getKind() == C7195.f19210 && this.f19076.equals(interfaceC7190.mo12355()) && AbstractC4394.m8917(AbstractC7143.m12388(this), AbstractC7143.m12388(interfaceC7190));
    }

    @Override // p087.C7128, p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return this.f19041;
    }

    @Override // p087.C7128
    public final int hashCode() {
        int iHashCode = this.f19076.hashCode();
        C2268 c2268 = new C2268(this);
        int iHashCode2 = 1;
        while (c2268.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c2268.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p087.C7128
    public final String toString() {
        return AbstractC4343.m8813(new C4341(this, 4), ", ", this.f19076.concat("("), ")", null, 56);
    }

    @Override // p087.C7128, p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        return ((InterfaceC7190[]) this.f19040.getValue())[i];
    }
}
