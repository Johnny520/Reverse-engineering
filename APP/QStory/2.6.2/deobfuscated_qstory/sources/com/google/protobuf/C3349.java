package com.google.protobuf;

import androidx.collection.C0262;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3349 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f10986 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C0262 f10987;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10988;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Map f10989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f10991;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f10992;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C3349 m7416() {
        C3349 c3349 = new C3349();
        Map map = Collections.EMPTY_MAP;
        c3349.f10991 = map;
        c3349.f10989 = map;
        return c3349;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7421();
        if (this.f10990 != 0) {
            this.f10992 = null;
            this.f10990 = 0;
        }
        if (this.f10991.isEmpty()) {
            return;
        }
        this.f10991.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m7422(comparable) >= 0 || this.f10991.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f10987 == null) {
            this.f10987 = new C0262(1, this);
        }
        return this.f10987;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3349)) {
            return super.equals(obj);
        }
        C3349 c3349 = (C3349) obj;
        int size = size();
        if (size == c3349.size()) {
            int i = this.f10990;
            if (i != c3349.f10990) {
                return ((AbstractSet) entrySet()).equals(c3349.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m7420(i2).equals(c3349.m7420(i2))) {
                }
            }
            if (i != size) {
                return this.f10991.equals(c3349.f10991);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM7422 = m7422(comparable);
        return iM7422 >= 0 ? ((C3350) this.f10992[iM7422]).f10993 : this.f10991.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f10990;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f10992[i2].hashCode();
        }
        return this.f10991.size() > 0 ? this.f10991.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m7421();
        Comparable comparable = (Comparable) obj;
        int iM7422 = m7422(comparable);
        if (iM7422 >= 0) {
            return m7424(iM7422);
        }
        if (this.f10991.isEmpty()) {
            return null;
        }
        return this.f10991.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10991.size() + this.f10990;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7417() {
        if (!this.f10988) {
            for (int i = 0; i < this.f10990; i++) {
                C3350 c3350M7420 = m7420(i);
                if (((InterfaceC3680) c3350M7420.f10995).mo7819()) {
                    c3350M7420.setValue(Collections.unmodifiableList((List) c3350M7420.f10993));
                }
            }
            for (Map.Entry entry : m7419()) {
                if (((InterfaceC3680) entry.getKey()).mo7819()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (this.f10988) {
            return;
        }
        this.f10991 = this.f10991.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10991);
        this.f10989 = this.f10989.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10989);
        this.f10988 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SortedMap m7418() {
        m7421();
        if (this.f10991.isEmpty() && !(this.f10991 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10991 = treeMap;
            this.f10989 = treeMap.descendingMap();
        }
        return (SortedMap) this.f10991;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Set m7419() {
        return this.f10991.isEmpty() ? Collections.EMPTY_SET : this.f10991.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3350 m7420(int i) {
        if (i < this.f10990) {
            return (C3350) this.f10992[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7421() {
        if (this.f10988) {
            C5553.m10825();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7422(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.f10990
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1b
            java.lang.Object[] r2 = r4.f10992
            r2 = r2[r1]
            com.google.protobuf.飘花落叶言世兰楪苏哲子 r2 = (com.google.protobuf.C3350) r2
            java.lang.Comparable r2 = r2.f10995
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L18
            int r0 = r0 + 1
        L16:
            int r4 = -r0
            return r4
        L18:
            if (r2 != 0) goto L1b
            return r1
        L1b:
            r0 = 0
        L1c:
            if (r0 > r1) goto L3b
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.f10992
            r3 = r3[r2]
            com.google.protobuf.飘花落叶言世兰楪苏哲子 r3 = (com.google.protobuf.C3350) r3
            java.lang.Comparable r3 = r3.f10995
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L34
            int r2 = r2 + (-1)
            r1 = r2
            goto L1c
        L34:
            if (r3 <= 0) goto L3a
            int r2 = r2 + 1
            r0 = r2
            goto L1c
        L3a:
            return r2
        L3b:
            int r0 = r0 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3349.m7422(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m7421();
        int iM7422 = m7422(comparable);
        if (iM7422 >= 0) {
            return ((C3350) this.f10992[iM7422]).setValue(obj);
        }
        m7421();
        if (this.f10992 == null) {
            this.f10992 = new Object[16];
        }
        int i = -(iM7422 + 1);
        if (i >= 16) {
            return m7418().put(comparable, obj);
        }
        int i2 = this.f10990;
        if (i2 == 16) {
            C3350 c3350 = (C3350) this.f10992[15];
            this.f10990 = i2 - 1;
            m7418().put(c3350.f10995, c3350.f10993);
        }
        Object[] objArr = this.f10992;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f10992[i] = new C3350(this, comparable, obj);
        this.f10990++;
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object m7424(int i) {
        m7421();
        Object[] objArr = this.f10992;
        Object obj = ((C3350) objArr[i]).f10993;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f10990 - i) - 1);
        this.f10990--;
        if (!this.f10991.isEmpty()) {
            Iterator it = m7418().entrySet().iterator();
            Object[] objArr2 = this.f10992;
            int i2 = this.f10990;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C3350(this, (Comparable) entry.getKey(), entry.getValue());
            this.f10990++;
            it.remove();
        }
        return obj;
    }
}
