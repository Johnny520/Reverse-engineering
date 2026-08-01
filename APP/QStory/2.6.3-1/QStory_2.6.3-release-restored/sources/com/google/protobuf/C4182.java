package com.google.protobuf;

import androidx.collection.C1109;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4182 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f11336 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C1109 f11337;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11338;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Map f11339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f11341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f11342;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4182 m7962() {
        C4182 c4182 = new C4182();
        Map map = Collections.EMPTY_MAP;
        c4182.f11341 = map;
        c4182.f11339 = map;
        return c4182;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7967();
        if (this.f11340 != 0) {
            this.f11342 = null;
            this.f11340 = 0;
        }
        if (this.f11341.isEmpty()) {
            return;
        }
        this.f11341.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m7968(comparable) >= 0 || this.f11341.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11337 == null) {
            this.f11337 = new C1109(1, this);
        }
        return this.f11337;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4182)) {
            return super.equals(obj);
        }
        C4182 c4182 = (C4182) obj;
        int size = size();
        if (size == c4182.size()) {
            int i = this.f11340;
            if (i != c4182.f11340) {
                return ((AbstractSet) entrySet()).equals(c4182.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m7966(i2).equals(c4182.m7966(i2))) {
                }
            }
            if (i != size) {
                return this.f11341.equals(c4182.f11341);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM7968 = m7968(comparable);
        return iM7968 >= 0 ? ((C4183) this.f11342[iM7968]).f11343 : this.f11341.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f11340;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f11342[i2].hashCode();
        }
        return this.f11341.size() > 0 ? this.f11341.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m7967();
        Comparable comparable = (Comparable) obj;
        int iM7968 = m7968(comparable);
        if (iM7968 >= 0) {
            return m7970(iM7968);
        }
        if (this.f11341.isEmpty()) {
            return null;
        }
        return this.f11341.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11341.size() + this.f11340;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7963() {
        if (!this.f11338) {
            for (int i = 0; i < this.f11340; i++) {
                C4183 c4183M7966 = m7966(i);
                if (((InterfaceC4513) c4183M7966.f11345).mo8365()) {
                    c4183M7966.setValue(Collections.unmodifiableList((List) c4183M7966.f11343));
                }
            }
            for (Map.Entry entry : m7965()) {
                if (((InterfaceC4513) entry.getKey()).mo8365()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (this.f11338) {
            return;
        }
        this.f11341 = this.f11341.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11341);
        this.f11339 = this.f11339.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11339);
        this.f11338 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SortedMap m7964() {
        m7967();
        if (this.f11341.isEmpty() && !(this.f11341 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11341 = treeMap;
            this.f11339 = treeMap.descendingMap();
        }
        return (SortedMap) this.f11341;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Set m7965() {
        return this.f11341.isEmpty() ? Collections.EMPTY_SET : this.f11341.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4183 m7966(int i) {
        if (i < this.f11340) {
            return (C4183) this.f11342[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7967() {
        if (this.f11338) {
            C6385.m11441();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7968(Comparable comparable) {
        int i;
        int i2;
        int i3 = this.f11340;
        int i4 = i3 - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                int i5 = (i + i4) / 2;
                int iCompareTo = comparable.compareTo(((C4183) this.f11342[i5]).f11345);
                if (iCompareTo < 0) {
                    i4 = i5 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i5;
                    }
                    i = i5 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C4183) this.f11342[i4]).f11345);
            if (iCompareTo2 > 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m7967();
        int iM7968 = m7968(comparable);
        if (iM7968 >= 0) {
            return ((C4183) this.f11342[iM7968]).setValue(obj);
        }
        m7967();
        if (this.f11342 == null) {
            this.f11342 = new Object[16];
        }
        int i = -(iM7968 + 1);
        if (i >= 16) {
            return m7964().put(comparable, obj);
        }
        int i2 = this.f11340;
        if (i2 == 16) {
            C4183 c4183 = (C4183) this.f11342[15];
            this.f11340 = i2 - 1;
            m7964().put(c4183.f11345, c4183.f11343);
        }
        Object[] objArr = this.f11342;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f11342[i] = new C4183(this, comparable, obj);
        this.f11340++;
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object m7970(int i) {
        m7967();
        Object[] objArr = this.f11342;
        Object obj = ((C4183) objArr[i]).f11343;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f11340 - i) - 1);
        this.f11340--;
        if (!this.f11341.isEmpty()) {
            Iterator it = m7964().entrySet().iterator();
            Object[] objArr2 = this.f11342;
            int i2 = this.f11340;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C4183(this, (Comparable) entry.getKey(), entry.getValue());
            this.f11340++;
            it.remove();
        }
        return obj;
    }
}
