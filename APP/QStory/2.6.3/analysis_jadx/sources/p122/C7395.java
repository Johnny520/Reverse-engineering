package p122;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4353;
import kotlin.sequences.C5123;
import p054.InterfaceC6567;
import p115.C7336;
import p123.C7401;
import p123.C7407;
import p125.InterfaceC7421;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7395 extends AbstractC4353 implements InterfaceC7421, Collection, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7395 f20047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f20048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7401 f20049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f20050;

    static {
        C7336 c7336 = C7336.f19548;
        f20047 = new C7395(c7336, c7336, C7401.f20068);
    }

    public C7395(Object obj, Object obj2, C7401 c7401) {
        this.f20050 = obj;
        this.f20048 = obj2;
        this.f20049 = c7401;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f20049.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        C7401 c7401 = this.f20049;
        c7401.getClass();
        return c7401.f20069;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5123(this.f20050, this.f20049);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7395 m12566(Object obj) {
        C7401 c7401M12572 = this.f20049;
        C7396 c7396 = (C7396) c7401M12572.get(obj);
        if (c7396 == null) {
            return this;
        }
        Object obj2 = c7396.f20052;
        Object obj3 = c7396.f20051;
        C7407 c7407 = c7401M12572.f20070;
        C7407 c7407M12585 = c7407.m12585(obj, obj != null ? obj.hashCode() : 0, 0);
        if (c7407 != c7407M12585) {
            c7401M12572 = c7407M12585 == null ? C7401.f20068 : new C7401(c7407M12585, c7401M12572.f20069 - 1);
        }
        C7336 c7336 = C7336.f19548;
        if (obj2 != c7336) {
            Object obj4 = c7401M12572.get(obj2);
            obj4.getClass();
            c7401M12572 = c7401M12572.m12572(obj2, new C7396(((C7396) obj4).f20052, obj3));
        }
        if (obj3 != c7336) {
            Object obj5 = c7401M12572.get(obj3);
            obj5.getClass();
            c7401M12572 = c7401M12572.m12572(obj3, new C7396(obj2, ((C7396) obj5).f20051));
        }
        Object obj6 = obj2 != c7336 ? this.f20050 : obj3;
        if (obj3 != c7336) {
            obj2 = this.f20048;
        }
        return new C7395(obj6, obj2, c7401M12572);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7395 m12567(Object obj) {
        C7401 c7401 = this.f20049;
        if (c7401.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C7395(obj, obj, c7401.m12572(obj, new C7396()));
        }
        Object obj2 = this.f20048;
        Object obj3 = c7401.get(obj2);
        obj3.getClass();
        return new C7395(this.f20050, obj, c7401.m12572(obj2, new C7396(((C7396) obj3).f20052, obj)).m12572(obj, new C7396(obj2)));
    }
}
