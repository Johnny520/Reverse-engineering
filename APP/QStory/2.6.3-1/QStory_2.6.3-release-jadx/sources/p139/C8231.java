package p139;

import androidx.collection.C1112;
import androidx.compose.p001ui.graphics.vector.C2376;
import bsh.C3466;
import p070.InterfaceC7393;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8231 extends C1112 implements InterfaceC7393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20416;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2376 f20417;

    public C8231(C2376 c2376, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.f20417 = c2376;
        this.f20416 = obj2;
    }

    @Override // androidx.collection.C1112, java.util.Map.Entry
    public final Object getValue() {
        return this.f20416;
    }

    @Override // androidx.collection.C1112, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f20416;
        this.f20416 = obj;
        C8227 c8227 = (C8227) this.f20417.f4825;
        C8228 c8228 = c8227.f20401;
        Object obj3 = this.f1298;
        if (!c8228.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c8227.f20411;
        if (!z) {
            c8228.put(obj3, obj);
        } else {
            if (!z) {
                C3466.m5896();
                return null;
            }
            AbstractC8237 abstractC8237 = c8227.f20412[c8227.f20410];
            Object obj4 = abstractC8237.f20428[abstractC8237.f20427];
            c8228.put(obj3, obj);
            c8227.m13127(obj4 != null ? obj4.hashCode() : 0, c8228.f20408, obj4, 0);
        }
        c8227.f20403 = c8228.f20404;
        return obj2;
    }
}
