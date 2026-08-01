package p123;

import androidx.collection.C0265;
import androidx.compose.ui.graphics.vector.C1541;
import bsh.C2632;
import p054.InterfaceC6563;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7401 extends C0265 implements InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f20076;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1541 f20077;

    public C7401(C1541 c1541, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.f20077 = c1541;
        this.f20076 = obj2;
    }

    @Override // androidx.collection.C0265, java.util.Map.Entry
    public final Object getValue() {
        return this.f20076;
    }

    @Override // androidx.collection.C0265, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f20076;
        this.f20076 = obj;
        C7397 c7397 = (C7397) this.f20077.f4479;
        C7398 c7398 = c7397.f20061;
        Object obj3 = this.f953;
        if (!c7398.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c7397.f20071;
        if (!z) {
            c7398.put(obj3, obj);
        } else {
            if (!z) {
                C2632.m5291();
                return null;
            }
            AbstractC7407 abstractC7407 = c7397.f20072[c7397.f20070];
            Object obj4 = abstractC7407.f20088[abstractC7407.f20087];
            c7398.put(obj3, obj);
            c7397.m12541(obj4 != null ? obj4.hashCode() : 0, c7398.f20068, obj4, 0);
        }
        c7397.f20063 = c7398.f20064;
        return obj2;
    }
}
