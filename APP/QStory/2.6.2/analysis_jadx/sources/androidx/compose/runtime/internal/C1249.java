package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.InterfaceC1325;
import p115.C7335;
import p123.C7398;
import p123.C7406;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1249 extends C7398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1253 f3623;

    @Override // p123.C7398, java.util.AbstractMap, java.util.Map
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

    @Override // p123.C7398, java.util.AbstractMap, java.util.Map
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

    @Override // p123.C7398, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC1390) {
            return (InterfaceC1325) super.remove((AbstractC1390) obj);
        }
        return null;
    }

    @Override // p123.C7398
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1253 mo2163() {
        C7406 c7406 = this.f20068;
        C1253 c1253 = this.f3623;
        if (c7406 != c1253.f20075) {
            this.f20067 = new C7335();
            c1253 = new C1253(this.f20068, this.f20066);
        }
        this.f3623 = c1253;
        return c1253;
    }
}
