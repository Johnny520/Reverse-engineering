package p139;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC5185;
import p141.InterfaceC8250;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8238 extends AbstractC5185 implements InterfaceC8250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8230 f20429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20430;

    public /* synthetic */ C8238(C8230 c8230, int i) {
        this.f20430 = i;
        this.f20429 = c8230;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f20430;
        C8230 c8230 = this.f20429;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = c8230.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c8230.containsKey(entry.getKey());
            default:
                return c8230.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        int i = this.f20430;
        C8230 c8230 = this.f20429;
        switch (i) {
            case 0:
                c8230.getClass();
                break;
            default:
                c8230.getClass();
                break;
        }
        return c8230.f20414;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20430) {
            case 0:
                C8236 c8236 = this.f20429.f20415;
                AbstractC8237[] abstractC8237Arr = new AbstractC8237[8];
                for (int i = 0; i < 8; i++) {
                    abstractC8237Arr[i] = new C8233(0);
                }
                return new C8239(c8236, abstractC8237Arr);
            default:
                C8236 c82362 = this.f20429.f20415;
                AbstractC8237[] abstractC8237Arr2 = new AbstractC8237[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC8237Arr2[i2] = new C8233(1);
                }
                return new C8239(c82362, abstractC8237Arr2);
        }
    }
}
