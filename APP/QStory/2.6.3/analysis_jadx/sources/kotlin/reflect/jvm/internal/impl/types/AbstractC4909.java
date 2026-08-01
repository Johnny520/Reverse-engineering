package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.storage.C4838;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p066.AbstractC6870;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4909 implements InterfaceC4873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4838 f14233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14234;

    public AbstractC4909(C4845 c4845) {
        c4845.getClass();
        this.f14233 = new C4838(c4845, new C1322(this, 7), new C1012(this, 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC4873) && obj.hashCode() == hashCode()) {
            InterfaceC4873 interfaceC4873 = (InterfaceC4873) obj;
            if (interfaceC4873.getParameters().size() == getParameters().size()) {
                InterfaceC4477 interfaceC4477Mo9211 = mo9211();
                InterfaceC4477 interfaceC4477Mo92112 = interfaceC4873.mo9211();
                if (interfaceC4477Mo92112 == null || C7240.m12467(interfaceC4477Mo9211) || AbstractC6870.m12108(interfaceC4477Mo9211) || C7240.m12467(interfaceC4477Mo92112) || AbstractC6870.m12108(interfaceC4477Mo92112)) {
                    return false;
                }
                return mo9831(interfaceC4477Mo92112);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14234;
        if (i != 0) {
            return i;
        }
        InterfaceC4477 interfaceC4477Mo9211 = mo9211();
        int iIdentityHashCode = (C7240.m12467(interfaceC4477Mo9211) || AbstractC6870.m12108(interfaceC4477Mo9211)) ? System.identityHashCode(this) : AbstractC6870.m12101(interfaceC4477Mo9211).f13693.hashCode();
        this.f14234 = iIdentityHashCode;
        return iIdentityHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo9831(InterfaceC4477 interfaceC4477);

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final List mo9494() {
        return ((C4890) this.f14233.invoke()).f14209;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract C4461 mo9209();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC4882 mo9832();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Collection mo9210();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List mo9840(List list) {
        list.getClass();
        return list;
    }
}
