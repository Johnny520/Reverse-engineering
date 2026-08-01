package androidx.compose.runtime.internal;

import androidx.appcompat.app.C0954;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.InterfaceC2160;
import androidx.compose.runtime.InterfaceC2201;
import androidx.compose.runtime.InterfaceC2203;
import p139.C8228;
import p139.C8230;
import p139.C8236;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2088 extends C8230 implements InterfaceC2201, InterfaceC2203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2088 f3986 = new C2088(C8236.f20421, 0);

    @Override // p139.C8230, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC2225) {
            return super.containsKey((AbstractC2225) obj);
        }
        return false;
    }

    @Override // p139.C8230, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC2160) {
            return super.containsValue((InterfaceC2160) obj);
        }
        return false;
    }

    @Override // p139.C8230, java.util.Map
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2088 m2746(AbstractC2225 abstractC2225, InterfaceC2160 interfaceC2160) {
        C0954 c0954M13143 = this.f20415.m13143(abstractC2225.hashCode(), 0, abstractC2225, interfaceC2160);
        return c0954M13143 == null ? this : new C2088((C8236) c0954M13143.f660, this.f20414 + c0954M13143.f659);
    }

    @Override // p139.C8230
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8228 mo2747() {
        C2084 c2084 = new C2084(this);
        c2084.f3969 = this;
        return c2084;
    }

    @Override // p139.C8230
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8228 mo2748() {
        C2084 c2084 = new C2084(this);
        c2084.f3969 = this;
        return c2084;
    }
}
