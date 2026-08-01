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
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3350 extends AbstractMap {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f10991 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C0262 f10992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Map f10994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Map f10996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f10997;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C3350 m7403() {
        C3350 c3350 = new C3350();
        Map map = Collections.EMPTY_MAP;
        c3350.f10996 = map;
        c3350.f10994 = map;
        return c3350;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7408();
        if (this.f10995 != 0) {
            this.f10997 = null;
            this.f10995 = 0;
        }
        if (this.f10996.isEmpty()) {
            return;
        }
        this.f10996.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m7409(comparable) >= 0 || this.f10996.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f10992 == null) {
            this.f10992 = new C0262(1, this);
        }
        return this.f10992;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3350)) {
            return super.equals(obj);
        }
        C3350 c3350 = (C3350) obj;
        int size = size();
        if (size == c3350.size()) {
            int i = this.f10995;
            if (i != c3350.f10995) {
                return ((AbstractSet) entrySet()).equals(c3350.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m7407(i2).equals(c3350.m7407(i2))) {
                }
            }
            if (i != size) {
                return this.f10996.equals(c3350.f10996);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM7409 = m7409(comparable);
        return iM7409 >= 0 ? ((C3351) this.f10997[iM7409]).f10998 : this.f10996.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f10995;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f10997[i2].hashCode();
        }
        return this.f10996.size() > 0 ? this.f10996.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m7408();
        Comparable comparable = (Comparable) obj;
        int iM7409 = m7409(comparable);
        if (iM7409 >= 0) {
            return m7411(iM7409);
        }
        if (this.f10996.isEmpty()) {
            return null;
        }
        return this.f10996.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10996.size() + this.f10995;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7404() {
        if (!this.f10993) {
            for (int i = 0; i < this.f10995; i++) {
                C3351 c3351M7407 = m7407(i);
                if (((InterfaceC3681) c3351M7407.f11000).mo7806()) {
                    c3351M7407.setValue(Collections.unmodifiableList((List) c3351M7407.f10998));
                }
            }
            for (Map.Entry entry : m7406()) {
                if (((InterfaceC3681) entry.getKey()).mo7806()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (this.f10993) {
            return;
        }
        this.f10996 = this.f10996.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10996);
        this.f10994 = this.f10994.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10994);
        this.f10993 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SortedMap m7405() {
        m7408();
        if (this.f10996.isEmpty() && !(this.f10996 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10996 = treeMap;
            this.f10994 = treeMap.descendingMap();
        }
        return (SortedMap) this.f10996;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Set m7406() {
        return this.f10996.isEmpty() ? Collections.EMPTY_SET : this.f10996.entrySet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3351 m7407(int i) {
        if (i < this.f10995) {
            return (C3351) this.f10997[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7408() {
        if (this.f10993) {
            C5554.m10882();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7409(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.f10995
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1b
            java.lang.Object[] r2 = r4.f10997
            r2 = r2[r1]
            com.google.protobuf.飘花落叶言世兰楪苏哲子 r2 = (com.google.protobuf.C3351) r2
            java.lang.Comparable r2 = r2.f11000
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
            java.lang.Object[] r3 = r4.f10997
            r3 = r3[r2]
            com.google.protobuf.飘花落叶言世兰楪苏哲子 r3 = (com.google.protobuf.C3351) r3
            java.lang.Comparable r3 = r3.f11000
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3350.m7409(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m7408();
        int iM7409 = m7409(comparable);
        if (iM7409 >= 0) {
            return ((C3351) this.f10997[iM7409]).setValue(obj);
        }
        m7408();
        if (this.f10997 == null) {
            this.f10997 = new Object[16];
        }
        int i = -(iM7409 + 1);
        if (i >= 16) {
            return m7405().put(comparable, obj);
        }
        int i2 = this.f10995;
        if (i2 == 16) {
            C3351 c3351 = (C3351) this.f10997[15];
            this.f10995 = i2 - 1;
            m7405().put(c3351.f11000, c3351.f10998);
        }
        Object[] objArr = this.f10997;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f10997[i] = new C3351(this, comparable, obj);
        this.f10995++;
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object m7411(int i) {
        m7408();
        Object[] objArr = this.f10997;
        Object obj = ((C3351) objArr[i]).f10998;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f10995 - i) - 1);
        this.f10995--;
        if (!this.f10996.isEmpty()) {
            Iterator it = m7405().entrySet().iterator();
            Object[] objArr2 = this.f10997;
            int i2 = this.f10995;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C3351(this, (Comparable) entry.getKey(), entry.getValue());
            this.f10995++;
            it.remove();
        }
        return obj;
    }
}
