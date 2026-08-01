package p103;

import androidx.core.view.C3101;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5174;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.C5981;
import p107.C8025;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7937 extends C7958 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f19380;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C8025 f19381;

    public C7937(String str, int i) {
        super(str, null, i);
        this.f19381 = C8025.f19550;
        this.f19380 = AbstractC6019.m10773(new C5981(i, str, this));
    }

    @Override // p103.C7958
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC8020)) {
            return false;
        }
        InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
        return interfaceC8020.getKind() == C8025.f19550 && this.f19416.equals(interfaceC8020.mo12941()) && AbstractC5227.m9466(AbstractC7973.m12974(this), AbstractC7973.m12974(interfaceC8020));
    }

    @Override // p103.C7958, p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return this.f19381;
    }

    @Override // p103.C7958
    public final int hashCode() {
        int iHashCode = this.f19416.hashCode();
        C3101 c3101 = new C3101(this);
        int iHashCode2 = 1;
        while (c3101.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c3101.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p103.C7958
    public final String toString() {
        return AbstractC5176.m9369(new C5174(this, 4), ", ", this.f19416.concat("("), ")", null, 56);
    }

    @Override // p103.C7958, p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        return ((InterfaceC8020[]) this.f19380.getValue())[i];
    }
}
