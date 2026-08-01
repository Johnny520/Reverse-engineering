package p103;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import p107.C8027;
import p107.InterfaceC8020;
import p160.C8376;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7905 implements InterfaceC8020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8020 f19328;

    public AbstractC7905(InterfaceC8020 interfaceC8020) {
        this.f19328 = interfaceC8020;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7905)) {
            return false;
        }
        AbstractC7905 abstractC7905 = (AbstractC7905) obj;
        return AbstractC5227.m9466(this.f19328, abstractC7905.f19328) && AbstractC5227.m9466(mo12941(), abstractC7905.mo12941());
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return C8027.f19555;
    }

    public final int hashCode() {
        return mo12941().hashCode() + (this.f19328.hashCode() * 31);
    }

    public final String toString() {
        return mo12941() + '(' + this.f19328 + ')';
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return String.valueOf(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return 1;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        Integer numM10699 = AbstractC5971.m10699(str);
        if (numM10699 != null) {
            return numM10699.intValue();
        }
        C6755.m11869(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        if (i >= 0) {
            return this.f19328;
        }
        C8376.m13332(AbstractC0900.m710(i, "Illegal index ", ", "), mo12941(), " expects only non-negative indices");
        return null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C8376.m13332(AbstractC0900.m710(i, "Illegal index ", ", "), mo12941(), " expects only non-negative indices");
        return null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        if (i >= 0) {
            return false;
        }
        C8376.m13332(AbstractC0900.m710(i, "Illegal index ", ", "), mo12941(), " expects only non-negative indices");
        return false;
    }
}
