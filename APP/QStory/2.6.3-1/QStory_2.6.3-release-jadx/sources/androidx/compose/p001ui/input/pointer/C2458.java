package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子世楪哲兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C2458 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final PointerInputEventHandler f5092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f5093;

    public C2458(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.f5093 = obj;
        this.f5091 = obj2;
        this.f5092 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2458)) {
            return false;
        }
        C2458 c2458 = (C2458) obj;
        return AbstractC5227.m9466(this.f5093, c2458.f5093) && AbstractC5227.m9466(this.f5091, c2458.f5091) && this.f5092 == c2458.f5092;
    }

    public final int hashCode() {
        Object obj = this.f5093;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f5091;
        return this.f5092.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2462 c2462 = (C2462) abstractC2961;
        Object obj = c2462.f5099;
        Object obj2 = this.f5093;
        boolean z = !AbstractC5227.m9466(obj, obj2);
        c2462.f5099 = obj2;
        Object obj3 = c2462.f5105;
        Object obj4 = this.f5091;
        if (!AbstractC5227.m9466(obj3, obj4)) {
            z = true;
        }
        c2462.f5105 = obj4;
        Class<?> cls = c2462.f5104.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f5092;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c2462.m3566();
        }
        c2462.f5104 = pointerInputEventHandler;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2462(this.f5093, this.f5091, this.f5092);
    }
}
