package p087;

import androidx.core.view.C2268;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4342;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.C5149;
import p091.C7196;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7108 extends C7129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f19035;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7196 f19036;

    public C7108(String str, int i) {
        super(str, null, i);
        this.f19036 = C7196.f19205;
        this.f19035 = AbstractC5187.m10214(new C5149(i, str, this));
    }

    @Override // p087.C7129
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC7191)) {
            return false;
        }
        InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
        return interfaceC7191.getKind() == C7196.f19205 && this.f19071.equals(interfaceC7191.mo12382()) && AbstractC4395.m8907(AbstractC7144.m12415(this), AbstractC7144.m12415(interfaceC7191));
    }

    @Override // p087.C7129, p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return this.f19036;
    }

    @Override // p087.C7129
    public final int hashCode() {
        int iHashCode = this.f19071.hashCode();
        C2268 c2268 = new C2268(this);
        int iHashCode2 = 1;
        while (c2268.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c2268.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p087.C7129
    public final String toString() {
        return AbstractC4344.m8810(new C4342(this, 4), ", ", this.f19071.concat("("), ")", null, 56);
    }

    @Override // p087.C7129, p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        return ((InterfaceC7191[]) this.f19035.getValue())[i];
    }
}
