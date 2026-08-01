package androidx.compose.runtime.internal;

import androidx.appcompat.app.C0107;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.InterfaceC1325;
import androidx.compose.runtime.InterfaceC1366;
import androidx.compose.runtime.InterfaceC1368;
import p123.C7399;
import p123.C7401;
import p123.C7407;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1253 extends C7401 implements InterfaceC1366, InterfaceC1368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1253 f3641 = new C1253(C7407.f20076, 0);

    @Override // p123.C7401, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1390) {
            return super.containsKey((AbstractC1390) obj);
        }
        return false;
    }

    @Override // p123.C7401, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1325) {
            return super.containsValue((InterfaceC1325) obj);
        }
        return false;
    }

    @Override // p123.C7401, java.util.Map
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1253 m2186(AbstractC1390 abstractC1390, InterfaceC1325 interfaceC1325) {
        C0107 c0107M12584 = this.f20070.m12584(abstractC1390.hashCode(), 0, abstractC1390, interfaceC1325);
        return c0107M12584 == null ? this : new C1253((C7407) c0107M12584.f315, this.f20069 + c0107M12584.f314);
    }

    @Override // p123.C7401
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7399 mo2187() {
        C1249 c1249 = new C1249(this);
        c1249.f3624 = this;
        return c1249;
    }

    @Override // p123.C7401
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7399 mo2188() {
        C1249 c1249 = new C1249(this);
        c1249.f3624 = this;
        return c1249;
    }
}
