package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.InterfaceC2160;
import p131.C8165;
import p139.C8228;
import p139.C8236;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2084 extends C8228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C2088 f3969;

    @Override // p139.C8228, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC2225) {
            return super.containsKey((AbstractC2225) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC2160) {
            return super.containsValue((InterfaceC2160) obj);
        }
        return false;
    }

    @Override // p139.C8228, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC2225) {
            return (InterfaceC2160) super.get((AbstractC2225) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC2225) ? obj2 : (InterfaceC2160) super.getOrDefault((AbstractC2225) obj, (InterfaceC2160) obj2);
    }

    @Override // p139.C8228, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC2225) {
            return (InterfaceC2160) super.remove((AbstractC2225) obj);
        }
        return null;
    }

    @Override // p139.C8228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2088 mo2733() {
        C8236 c8236 = this.f20408;
        C2088 c2088 = this.f3969;
        if (c8236 != c2088.f20415) {
            this.f20407 = new C8165();
            c2088 = new C2088(this.f20408, this.f20406);
        }
        this.f3969 = c2088;
        return c2088;
    }
}
