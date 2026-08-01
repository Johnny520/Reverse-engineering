package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0262;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4695 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f13737 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C0262 f13738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f13739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public List f13740 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f13741 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13742;

    public C4695(int i) {
        this.f13742 = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9354();
        if (!this.f13740.isEmpty()) {
            this.f13740.clear();
        }
        if (this.f13741.isEmpty()) {
            return;
        }
        this.f13741.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9355(comparable) >= 0 || this.f13741.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13738 == null) {
            this.f13738 = new C0262(2, this);
        }
        return this.f13738;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9355 = m9355(comparable);
        return iM9355 >= 0 ? ((C4703) this.f13740.get(iM9355)).f13752 : this.f13741.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9354();
        Comparable comparable = (Comparable) obj;
        int iM9355 = m9355(comparable);
        if (iM9355 >= 0) {
            return m9350(iM9355);
        }
        if (this.f13741.isEmpty()) {
            return null;
        }
        return this.f13741.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13741.size() + this.f13740.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m9350(int i) {
        m9354();
        Object obj = ((C4703) this.f13740.remove(i)).f13752;
        if (!this.f13741.isEmpty()) {
            Iterator it = m9352().entrySet().iterator();
            List list = this.f13740;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4703(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9354();
        int iM9355 = m9355(comparable);
        if (iM9355 >= 0) {
            return ((C4703) this.f13740.get(iM9355)).setValue(obj);
        }
        m9354();
        boolean zIsEmpty = this.f13740.isEmpty();
        int i = this.f13742;
        if (zIsEmpty && !(this.f13740 instanceof ArrayList)) {
            this.f13740 = new ArrayList(i);
        }
        int i2 = -(iM9355 + 1);
        if (i2 >= i) {
            return m9352().put(comparable, obj);
        }
        if (this.f13740.size() == i) {
            C4703 c4703 = (C4703) this.f13740.remove(i - 1);
            m9352().put(c4703.f13754, c4703.f13752);
        }
        this.f13740.add(i2, new C4703(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SortedMap m9352() {
        m9354();
        if (this.f13741.isEmpty() && !(this.f13741 instanceof TreeMap)) {
            this.f13741 = new TreeMap();
        }
        return (SortedMap) this.f13741;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterable m9353() {
        return this.f13741.isEmpty() ? AbstractC4704.f13755 : this.f13741.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9354() {
        if (this.f13739) {
            C5553.m10825();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m9355(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f13740
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f13740
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪 r2 = (kotlin.reflect.jvm.internal.impl.protobuf.C4703) r2
            java.lang.Comparable r2 = r2.f13754
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f13740
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪 r3 = (kotlin.reflect.jvm.internal.impl.protobuf.C4703) r3
            java.lang.Comparable r3 = r3.f13754
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4695.m9355(java.lang.Comparable):int");
    }
}
