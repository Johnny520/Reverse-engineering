package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5138;
import p091.C7197;
import p091.InterfaceC7190;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7075 implements InterfaceC7190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7190 f18988;

    public AbstractC7075(InterfaceC7190 interfaceC7190) {
        this.f18988 = interfaceC7190;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7075)) {
            return false;
        }
        AbstractC7075 abstractC7075 = (AbstractC7075) obj;
        return AbstractC4394.m8917(this.f18988, abstractC7075.f18988) && AbstractC4394.m8917(mo12355(), abstractC7075.mo12355());
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return C7197.f19212;
    }

    public final int hashCode() {
        return mo12355().hashCode() + (this.f18988.hashCode() * 31);
    }

    public final String toString() {
        return mo12355() + '(' + this.f18988 + ')';
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return String.valueOf(i);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return 1;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        Integer numM10136 = AbstractC5138.m10136(str);
        if (numM10136 != null) {
            return numM10136.intValue();
        }
        C5919.m11249(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        if (i >= 0) {
            return this.f18988;
        }
        C7546.m12744(AbstractC0053.m148(i, "Illegal index ", ", "), mo12355(), " expects only non-negative indices");
        return null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C7546.m12744(AbstractC0053.m148(i, "Illegal index ", ", "), mo12355(), " expects only non-negative indices");
        return null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        if (i >= 0) {
            return false;
        }
        C7546.m12744(AbstractC0053.m148(i, "Illegal index ", ", "), mo12355(), " expects only non-negative indices");
        return false;
    }
}
