package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.InterfaceC1325;
import p115.C7336;
import p123.C7399;
import p123.C7407;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1249 extends C7399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1253 f3624;

    @Override // p123.C7399, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1390) {
            return super.containsKey((AbstractC1390) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1325) {
            return super.containsValue((InterfaceC1325) obj);
        }
        return false;
    }

    @Override // p123.C7399, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1390) {
            return (InterfaceC1325) super.get((AbstractC1390) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1390) ? obj2 : (InterfaceC1325) super.getOrDefault((AbstractC1390) obj, (InterfaceC1325) obj2);
    }

    @Override // p123.C7399, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC1390) {
            return (InterfaceC1325) super.remove((AbstractC1390) obj);
        }
        return null;
    }

    @Override // p123.C7399
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1253 mo2173() {
        C7407 c7407 = this.f20063;
        C1253 c1253 = this.f3624;
        if (c7407 != c1253.f20070) {
            this.f20062 = new C7336();
            c1253 = new C1253(this.f20063, this.f20061);
        }
        this.f3624 = c1253;
        return c1253;
    }
}
