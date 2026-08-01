package p123;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4352;
import p125.InterfaceC7420;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7408 extends AbstractC4352 implements InterfaceC7420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7400 f20089;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20090;

    public /* synthetic */ C7408(C7400 c7400, int i) {
        this.f20090 = i;
        this.f20089 = c7400;
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f20090;
        C7400 c7400 = this.f20089;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = c7400.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c7400.containsKey(entry.getKey());
            default:
                return c7400.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        int i = this.f20090;
        C7400 c7400 = this.f20089;
        switch (i) {
            case 0:
                c7400.getClass();
                break;
            default:
                c7400.getClass();
                break;
        }
        return c7400.f20074;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20090) {
            case 0:
                C7406 c7406 = this.f20089.f20075;
                AbstractC7407[] abstractC7407Arr = new AbstractC7407[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7407Arr[i] = new C7403(0);
                }
                return new C7409(c7406, abstractC7407Arr);
            default:
                C7406 c74062 = this.f20089.f20075;
                AbstractC7407[] abstractC7407Arr2 = new AbstractC7407[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC7407Arr2[i2] = new C7403(1);
                }
                return new C7409(c74062, abstractC7407Arr2);
        }
    }
}
