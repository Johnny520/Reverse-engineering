package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1850;
import androidx.compose.runtime.C2157;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.storage.C5670;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p082.AbstractC7699;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5741 implements InterfaceC5705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5670 f14578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14579;

    public AbstractC5741(C5677 c5677) {
        c5677.getClass();
        this.f14578 = new C5670(c5677, new C2157(this, 7), new C1850(this, 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC5705) && obj.hashCode() == hashCode()) {
            InterfaceC5705 interfaceC5705 = (InterfaceC5705) obj;
            if (interfaceC5705.getParameters().size() == getParameters().size()) {
                InterfaceC5309 interfaceC5309Mo9770 = mo9770();
                InterfaceC5309 interfaceC5309Mo97702 = interfaceC5705.mo9770();
                if (interfaceC5309Mo97702 == null || C8069.m13026(interfaceC5309Mo9770) || AbstractC7699.m12667(interfaceC5309Mo9770) || C8069.m13026(interfaceC5309Mo97702) || AbstractC7699.m12667(interfaceC5309Mo97702)) {
                    return false;
                }
                return mo10390(interfaceC5309Mo97702);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14579;
        if (i != 0) {
            return i;
        }
        InterfaceC5309 interfaceC5309Mo9770 = mo9770();
        int iIdentityHashCode = (C8069.m13026(interfaceC5309Mo9770) || AbstractC7699.m12667(interfaceC5309Mo9770)) ? System.identityHashCode(this) : AbstractC7699.m12660(interfaceC5309Mo9770).f14038.hashCode();
        this.f14579 = iIdentityHashCode;
        return iIdentityHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo10390(InterfaceC5309 interfaceC5309);

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final List mo10053() {
        return ((C5722) this.f14578.invoke()).f14554;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract C5293 mo9768();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC5714 mo10391();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Collection mo9769();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List mo10399(List list) {
        list.getClass();
        return list;
    }
}
