package p138;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5185;
import kotlin.sequences.C5955;
import p070.InterfaceC7396;
import p131.C8165;
import p139.C8230;
import p139.C8236;
import p141.InterfaceC8250;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8224 extends AbstractC5185 implements InterfaceC8250, Collection, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8224 f20392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f20393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8230 f20394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f20395;

    static {
        C8165 c8165 = C8165.f19893;
        f20392 = new C8224(c8165, c8165, C8230.f20413);
    }

    public C8224(Object obj, Object obj2, C8230 c8230) {
        this.f20395 = obj;
        this.f20393 = obj2;
        this.f20394 = c8230;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f20394.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        C8230 c8230 = this.f20394;
        c8230.getClass();
        return c8230.f20414;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5955(this.f20395, this.f20394);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8224 m13125(Object obj) {
        C8230 c8230M13131 = this.f20394;
        C8225 c8225 = (C8225) c8230M13131.get(obj);
        if (c8225 == null) {
            return this;
        }
        Object obj2 = c8225.f20397;
        Object obj3 = c8225.f20396;
        C8236 c8236 = c8230M13131.f20415;
        C8236 c8236M13144 = c8236.m13144(obj, obj != null ? obj.hashCode() : 0, 0);
        if (c8236 != c8236M13144) {
            c8230M13131 = c8236M13144 == null ? C8230.f20413 : new C8230(c8236M13144, c8230M13131.f20414 - 1);
        }
        C8165 c8165 = C8165.f19893;
        if (obj2 != c8165) {
            Object obj4 = c8230M13131.get(obj2);
            obj4.getClass();
            c8230M13131 = c8230M13131.m13131(obj2, new C8225(((C8225) obj4).f20397, obj3));
        }
        if (obj3 != c8165) {
            Object obj5 = c8230M13131.get(obj3);
            obj5.getClass();
            c8230M13131 = c8230M13131.m13131(obj3, new C8225(obj2, ((C8225) obj5).f20396));
        }
        Object obj6 = obj2 != c8165 ? this.f20395 : obj3;
        if (obj3 != c8165) {
            obj2 = this.f20393;
        }
        return new C8224(obj6, obj2, c8230M13131);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8224 m13126(Object obj) {
        C8230 c8230 = this.f20394;
        if (c8230.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C8224(obj, obj, c8230.m13131(obj, new C8225()));
        }
        Object obj2 = this.f20393;
        Object obj3 = c8230.get(obj2);
        obj3.getClass();
        return new C8224(this.f20395, obj, c8230.m13131(obj2, new C8225(((C8225) obj3).f20397, obj)).m13131(obj, new C8225(obj2)));
    }
}
