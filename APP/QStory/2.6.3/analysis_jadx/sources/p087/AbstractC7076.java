package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import p091.C7198;
import p091.InterfaceC7191;
import p144.C7547;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7076 implements InterfaceC7191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7191 f18983;

    public AbstractC7076(InterfaceC7191 interfaceC7191) {
        this.f18983 = interfaceC7191;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7076)) {
            return false;
        }
        AbstractC7076 abstractC7076 = (AbstractC7076) obj;
        return AbstractC4395.m8907(this.f18983, abstractC7076.f18983) && AbstractC4395.m8907(mo12382(), abstractC7076.mo12382());
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return C7198.f19210;
    }

    public final int hashCode() {
        return mo12382().hashCode() + (this.f18983.hashCode() * 31);
    }

    public final String toString() {
        return mo12382() + '(' + this.f18983 + ')';
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return String.valueOf(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return 1;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        Integer numM10140 = AbstractC5139.m10140(str);
        if (numM10140 != null) {
            return numM10140.intValue();
        }
        C5925.m11310(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        if (i >= 0) {
            return this.f18983;
        }
        C7547.m12773(AbstractC0053.m150(i, "Illegal index ", ", "), mo12382(), " expects only non-negative indices");
        return null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C7547.m12773(AbstractC0053.m150(i, "Illegal index ", ", "), mo12382(), " expects only non-negative indices");
        return null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        if (i >= 0) {
            return false;
        }
        C7547.m12773(AbstractC0053.m150(i, "Illegal index ", ", "), mo12382(), " expects only non-negative indices");
        return false;
    }
}
