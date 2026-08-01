package p122;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4352;
import kotlin.sequences.C5122;
import p054.InterfaceC6566;
import p115.C7335;
import p123.C7400;
import p123.C7406;
import p125.InterfaceC7420;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7394 extends AbstractC4352 implements InterfaceC7420, Collection, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7394 f20052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f20053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7400 f20054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f20055;

    static {
        C7335 c7335 = C7335.f19553;
        f20052 = new C7394(c7335, c7335, C7400.f20073);
    }

    public C7394(Object obj, Object obj2, C7400 c7400) {
        this.f20055 = obj;
        this.f20053 = obj2;
        this.f20054 = c7400;
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f20054.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        C7400 c7400 = this.f20054;
        c7400.getClass();
        return c7400.f20074;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5122(this.f20055, this.f20054);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7394 m12539(Object obj) {
        C7400 c7400M12545 = this.f20054;
        C7395 c7395 = (C7395) c7400M12545.get(obj);
        if (c7395 == null) {
            return this;
        }
        Object obj2 = c7395.f20057;
        Object obj3 = c7395.f20056;
        C7406 c7406 = c7400M12545.f20075;
        C7406 c7406M12558 = c7406.m12558(obj, obj != null ? obj.hashCode() : 0, 0);
        if (c7406 != c7406M12558) {
            c7400M12545 = c7406M12558 == null ? C7400.f20073 : new C7400(c7406M12558, c7400M12545.f20074 - 1);
        }
        C7335 c7335 = C7335.f19553;
        if (obj2 != c7335) {
            Object obj4 = c7400M12545.get(obj2);
            obj4.getClass();
            c7400M12545 = c7400M12545.m12545(obj2, new C7395(((C7395) obj4).f20057, obj3));
        }
        if (obj3 != c7335) {
            Object obj5 = c7400M12545.get(obj3);
            obj5.getClass();
            c7400M12545 = c7400M12545.m12545(obj3, new C7395(obj2, ((C7395) obj5).f20056));
        }
        Object obj6 = obj2 != c7335 ? this.f20055 : obj3;
        if (obj3 != c7335) {
            obj2 = this.f20053;
        }
        return new C7394(obj6, obj2, c7400M12545);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7394 m12540(Object obj) {
        C7400 c7400 = this.f20054;
        if (c7400.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C7394(obj, obj, c7400.m12545(obj, new C7395()));
        }
        Object obj2 = this.f20053;
        Object obj3 = c7400.get(obj2);
        obj3.getClass();
        return new C7394(this.f20055, obj, c7400.m12545(obj2, new C7395(((C7395) obj3).f20057, obj)).m12545(obj, new C7395(obj2)));
    }
}
