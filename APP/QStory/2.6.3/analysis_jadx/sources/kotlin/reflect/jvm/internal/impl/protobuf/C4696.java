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
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4696 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f13741 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C0262 f13742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f13743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public List f13744 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f13745 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13746;

    public C4696(int i) {
        this.f13746 = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9344();
        if (!this.f13744.isEmpty()) {
            this.f13744.clear();
        }
        if (this.f13745.isEmpty()) {
            return;
        }
        this.f13745.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9345(comparable) >= 0 || this.f13745.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13742 == null) {
            this.f13742 = new C0262(2, this);
        }
        return this.f13742;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9345 = m9345(comparable);
        return iM9345 >= 0 ? ((C4704) this.f13744.get(iM9345)).f13756 : this.f13745.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9344();
        Comparable comparable = (Comparable) obj;
        int iM9345 = m9345(comparable);
        if (iM9345 >= 0) {
            return m9340(iM9345);
        }
        if (this.f13745.isEmpty()) {
            return null;
        }
        return this.f13745.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13745.size() + this.f13744.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m9340(int i) {
        m9344();
        Object obj = ((C4704) this.f13744.remove(i)).f13756;
        if (!this.f13745.isEmpty()) {
            Iterator it = m9342().entrySet().iterator();
            List list = this.f13744;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4704(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9344();
        int iM9345 = m9345(comparable);
        if (iM9345 >= 0) {
            return ((C4704) this.f13744.get(iM9345)).setValue(obj);
        }
        m9344();
        boolean zIsEmpty = this.f13744.isEmpty();
        int i = this.f13746;
        if (zIsEmpty && !(this.f13744 instanceof ArrayList)) {
            this.f13744 = new ArrayList(i);
        }
        int i2 = -(iM9345 + 1);
        if (i2 >= i) {
            return m9342().put(comparable, obj);
        }
        if (this.f13744.size() == i) {
            C4704 c4704 = (C4704) this.f13744.remove(i - 1);
            m9342().put(c4704.f13758, c4704.f13756);
        }
        this.f13744.add(i2, new C4704(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SortedMap m9342() {
        m9344();
        if (this.f13745.isEmpty() && !(this.f13745 instanceof TreeMap)) {
            this.f13745 = new TreeMap();
        }
        return (SortedMap) this.f13745;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterable m9343() {
        return this.f13745.isEmpty() ? AbstractC4705.f13759 : this.f13745.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9344() {
        if (this.f13743) {
            C5554.m10882();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m9345(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f13744
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f13744
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪 r2 = (kotlin.reflect.jvm.internal.impl.protobuf.C4704) r2
            java.lang.Comparable r2 = r2.f13758
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
            java.util.List r3 = r4.f13744
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世苏哲兰楪 r3 = (kotlin.reflect.jvm.internal.impl.protobuf.C4704) r3
            java.lang.Comparable r3 = r3.f13758
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4696.m9345(java.lang.Comparable):int");
    }
}
