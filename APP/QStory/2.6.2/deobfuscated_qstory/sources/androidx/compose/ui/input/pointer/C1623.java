package androidx.compose.ui.input.pointer;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子世楪哲兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1623 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final PointerInputEventHandler f4746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f4747;

    public C1623(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.f4747 = obj;
        this.f4745 = obj2;
        this.f4746 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1623)) {
            return false;
        }
        C1623 c1623 = (C1623) obj;
        return AbstractC4394.m8917(this.f4747, c1623.f4747) && AbstractC4394.m8917(this.f4745, c1623.f4745) && this.f4746 == c1623.f4746;
    }

    public final int hashCode() {
        Object obj = this.f4747;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f4745;
        return this.f4746.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1627 c1627 = (C1627) abstractC2128;
        Object obj = c1627.f4753;
        Object obj2 = this.f4747;
        boolean z = !AbstractC4394.m8917(obj, obj2);
        c1627.f4753 = obj2;
        Object obj3 = c1627.f4759;
        Object obj4 = this.f4745;
        if (!AbstractC4394.m8917(obj3, obj4)) {
            z = true;
        }
        c1627.f4759 = obj4;
        Class<?> cls = c1627.f4758.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f4746;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c1627.m2996();
        }
        c1627.f4758 = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C1627(this.f4747, this.f4745, this.f4746);
    }
}
