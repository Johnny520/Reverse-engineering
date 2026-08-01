package p123;

import androidx.collection.C0265;
import androidx.compose.ui.graphics.vector.C1541;
import bsh.C2633;
import p054.InterfaceC6564;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7402 extends C0265 implements InterfaceC6564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20071;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1541 f20072;

    public C7402(C1541 c1541, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.f20072 = c1541;
        this.f20071 = obj2;
    }

    @Override // androidx.collection.C0265, java.util.Map.Entry
    public final Object getValue() {
        return this.f20071;
    }

    @Override // androidx.collection.C0265, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f20071;
        this.f20071 = obj;
        C7398 c7398 = (C7398) this.f20072.f4480;
        C7399 c7399 = c7398.f20056;
        Object obj3 = this.f953;
        if (!c7399.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c7398.f20066;
        if (!z) {
            c7399.put(obj3, obj);
        } else {
            if (!z) {
                C2633.m5336();
                return null;
            }
            AbstractC7408 abstractC7408 = c7398.f20067[c7398.f20065];
            Object obj4 = abstractC7408.f20083[abstractC7408.f20082];
            c7399.put(obj3, obj);
            c7398.m12568(obj4 != null ? obj4.hashCode() : 0, c7399.f20063, obj4, 0);
        }
        c7398.f20058 = c7399.f20059;
        return obj2;
    }
}
