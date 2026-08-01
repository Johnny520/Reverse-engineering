package androidx.compose.runtime.internal;

import androidx.appcompat.app.C0107;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.InterfaceC1325;
import androidx.compose.runtime.InterfaceC1366;
import androidx.compose.runtime.InterfaceC1368;
import p123.C7398;
import p123.C7400;
import p123.C7406;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1253 extends C7400 implements InterfaceC1366, InterfaceC1368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1253 f3640 = new C1253(C7406.f20081, 0);

    @Override // p123.C7400, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1390) {
            return super.containsKey((AbstractC1390) obj);
        }
        return false;
    }

    @Override // p123.C7400, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1325) {
            return super.containsValue((InterfaceC1325) obj);
        }
        return false;
    }

    @Override // p123.C7400, java.util.Map
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
    public final C1253 m2176(AbstractC1390 abstractC1390, InterfaceC1325 interfaceC1325) {
        C0107 c0107M12557 = this.f20075.m12557(abstractC1390.hashCode(), 0, abstractC1390, interfaceC1325);
        return c0107M12557 == null ? this : new C1253((C7406) c0107M12557.f315, this.f20074 + c0107M12557.f314);
    }

    @Override // p123.C7400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7398 mo2177() {
        C1249 c1249 = new C1249(this);
        c1249.f3623 = this;
        return c1249;
    }

    @Override // p123.C7400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7398 mo2178() {
        C1249 c1249 = new C1249(this);
        c1249.f3623 = this;
        return c1249;
    }
}
