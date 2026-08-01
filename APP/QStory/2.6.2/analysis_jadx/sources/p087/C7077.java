package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5138;
import p091.C7197;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7077 implements InterfaceC7190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7190 f18993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7190 f18994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18995;

    public C7077(String str, InterfaceC7190 interfaceC7190, InterfaceC7190 interfaceC71902) {
        this.f18995 = str;
        this.f18994 = interfaceC7190;
        this.f18993 = interfaceC71902;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7077)) {
            return false;
        }
        C7077 c7077 = (C7077) obj;
        return this.f18995.equals(c7077.f18995) && this.f18994.equals(c7077.f18994) && this.f18993.equals(c7077.f18993);
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return C7197.f19215;
    }

    public final int hashCode() {
        return this.f18993.hashCode() + ((this.f18994.hashCode() + (this.f18995.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f18995 + '(' + this.f18994 + ", " + this.f18993 + ')';
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return String.valueOf(i);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return 2;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        Integer numM10136 = AbstractC5138.m10136(str);
        if (numM10136 != null) {
            return numM10136.intValue();
        }
        C5919.m11249(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f18995;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        if (i < 0) {
            C5919.m11253(AbstractC0053.m146(AbstractC0053.m148(i, "Illegal index ", ", "), this.f18995, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f18994;
        }
        if (i2 == 1) {
            return this.f18993;
        }
        C5919.m11250("Unreached");
        return null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C5919.m11253(AbstractC0053.m146(AbstractC0053.m148(i, "Illegal index ", ", "), this.f18995, " expects only non-negative indices"));
        return null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        if (i >= 0) {
            return false;
        }
        C5919.m11253(AbstractC0053.m146(AbstractC0053.m148(i, "Illegal index ", ", "), this.f18995, " expects only non-negative indices"));
        return false;
    }
}
