package p123;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4353;
import p125.InterfaceC7421;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7409 extends AbstractC4353 implements InterfaceC7421 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7401 f20084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20085;

    public /* synthetic */ C7409(C7401 c7401, int i) {
        this.f20085 = i;
        this.f20084 = c7401;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f20085;
        C7401 c7401 = this.f20084;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = c7401.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c7401.containsKey(entry.getKey());
            default:
                return c7401.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        int i = this.f20085;
        C7401 c7401 = this.f20084;
        switch (i) {
            case 0:
                c7401.getClass();
                break;
            default:
                c7401.getClass();
                break;
        }
        return c7401.f20069;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20085) {
            case 0:
                C7407 c7407 = this.f20084.f20070;
                AbstractC7408[] abstractC7408Arr = new AbstractC7408[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7408Arr[i] = new C7404(0);
                }
                return new C7410(c7407, abstractC7408Arr);
            default:
                C7407 c74072 = this.f20084.f20070;
                AbstractC7408[] abstractC7408Arr2 = new AbstractC7408[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC7408Arr2[i2] = new C7404(1);
                }
                return new C7410(c74072, abstractC7408Arr2);
        }
    }
}
