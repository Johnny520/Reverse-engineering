package Yue;

import Yue.InterfaceC7144;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7209<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C7210<K, V> f21777;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C7210<K, V> f21778;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final WeakHashMap<AbstractC7213<K, V>, Boolean> f21779 = new WeakHashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f21780 = 0;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ */
    public static class C1211<K, V> extends AbstractC7212<K, V> {
        public C1211(C7210<K, V> c7210, C7210<K, V> c72102) {
            super(c7210, c72102);
        }

        @Override // Yue.C7209.AbstractC7212
        /* JADX INFO: renamed from: ۥ۟ */
        public C7210<K, V> mo3503(C7210<K, V> c7210) {
            return c7210.f21784;
        }

        @Override // Yue.C7209.AbstractC7212
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7210<K, V> mo22589(C7210<K, V> c7210) {
            return c7210.f21783;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟ */
    public static class C1212<K, V> extends AbstractC7212<K, V> {
        public C1212(C7210<K, V> c7210, C7210<K, V> c72102) {
            super(c7210, c72102);
        }

        @Override // Yue.C7209.AbstractC7212
        /* JADX INFO: renamed from: ۥ۟ */
        public C7210<K, V> mo3503(C7210<K, V> c7210) {
            return c7210.f21783;
        }

        @Override // Yue.C7209.AbstractC7212
        /* JADX INFO: renamed from: ۥ۟۟ */
        public C7210<K, V> mo22589(C7210<K, V> c7210) {
            return c7210.f21784;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C7210<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6391
        public final K f21781;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6391
        public final V f21782;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C7210<K, V> f21783;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C7210<K, V> f21784;

        public C7210(@InterfaceC6391 K k, @InterfaceC6391 V v) {
            this.f21781 = k;
            this.f21782 = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7210)) {
                return false;
            }
            C7210 c7210 = (C7210) obj;
            return this.f21781.equals(c7210.f21781) && this.f21782.equals(c7210.f21782);
        }

        @Override // java.util.Map.Entry
        @InterfaceC6391
        public K getKey() {
            return this.f21781;
        }

        @Override // java.util.Map.Entry
        @InterfaceC6391
        public V getValue() {
            return this.f21782;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f21781.hashCode() ^ this.f21782.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f21781 + "=" + this.f21782;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public class C7211 extends AbstractC7213<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C7210<K, V> f21785;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f21786 = true;

        public C7211() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21786) {
                return C7209.this.f21777 != null;
            }
            C7210<K, V> c7210 = this.f21785;
            return (c7210 == null || c7210.f21783 == null) ? false : true;
        }

        @Override // Yue.C7209.AbstractC7213
        /* JADX INFO: renamed from: ۥ */
        public void mo3504(@InterfaceC6391 C7210<K, V> c7210) {
            C7210<K, V> c72102 = this.f21785;
            if (c7210 == c72102) {
                C7210<K, V> c72103 = c72102.f21784;
                this.f21785 = c72103;
                this.f21786 = c72103 == null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f21786) {
                this.f21786 = false;
                this.f21785 = C7209.this.f21777;
            } else {
                C7210<K, V> c7210 = this.f21785;
                this.f21785 = c7210 != null ? c7210.f21783 : null;
            }
            return this.f21785;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7212<K, V> extends AbstractC7213<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C7210<K, V> f21788;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C7210<K, V> f21789;

        public AbstractC7212(C7210<K, V> c7210, C7210<K, V> c72102) {
            this.f21788 = c72102;
            this.f21789 = c7210;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21789 != null;
        }

        @Override // Yue.C7209.AbstractC7213
        /* JADX INFO: renamed from: ۥ */
        public void mo3504(@InterfaceC6391 C7210<K, V> c7210) {
            if (this.f21788 == c7210 && c7210 == this.f21789) {
                this.f21789 = null;
                this.f21788 = null;
            }
            C7210<K, V> c72102 = this.f21788;
            if (c72102 == c7210) {
                this.f21788 = mo3503(c72102);
            }
            if (this.f21789 == c7210) {
                this.f21789 = m22591();
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract C7210<K, V> mo3503(C7210<K, V> c7210);

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract C7210<K, V> mo22589(C7210<K, V> c7210);

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            C7210<K, V> c7210 = this.f21789;
            this.f21789 = m22591();
            return c7210;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C7210<K, V> m22591() {
            C7210<K, V> c7210 = this.f21789;
            C7210<K, V> c72102 = this.f21788;
            if (c7210 == c72102 || c72102 == null) {
                return null;
            }
            return mo22589(c7210);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static abstract class AbstractC7213<K, V> {
        /* JADX INFO: renamed from: ۥ */
        public abstract void mo3504(@InterfaceC6391 C7210<K, V> c7210);
    }

    @InterfaceC6391
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C1212 c1212 = new C1212(this.f21778, this.f21777);
        this.f21779.put(c1212, Boolean.FALSE);
        return c1212;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7209)) {
            return false;
        }
        C7209 c7209 = (C7209) obj;
        if (size() != c7209.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c7209.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @InterfaceC6391
    public Iterator<Map.Entry<K, V>> iterator() {
        C1211 c1211 = new C1211(this.f21777, this.f21778);
        this.f21779.put(c1211, Boolean.FALSE);
        return c1211;
    }

    public int size() {
        return this.f21780;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public Map.Entry<K, V> m3502() {
        return this.f21777;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public C7210<K, V> mo1695(K k) {
        C7210<K, V> c7210 = this.f21777;
        while (c7210 != null && !c7210.f21781.equals(k)) {
            c7210 = c7210.f21783;
        }
        return c7210;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7209<K, V>.C7211 m22586() {
        C7209<K, V>.C7211 c7211 = new C7211();
        this.f21779.put(c7211, Boolean.FALSE);
        return c7211;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Map.Entry<K, V> m22587() {
        return this.f21778;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7210<K, V> m22588(@InterfaceC6391 K k, @InterfaceC6391 V v) {
        C7210<K, V> c7210 = new C7210<>(k, v);
        this.f21780++;
        C7210<K, V> c72102 = this.f21778;
        if (c72102 == null) {
            this.f21777 = c7210;
            this.f21778 = c7210;
            return c7210;
        }
        c72102.f21783 = c7210;
        c7210.f21784 = c72102;
        this.f21778 = c7210;
        return c7210;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public V mo14467(@InterfaceC6391 K k, @InterfaceC6391 V v) {
        C7210<K, V> c7210Mo1695 = mo1695(k);
        if (c7210Mo1695 != null) {
            return c7210Mo1695.f21782;
        }
        m22588(k, v);
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public V mo14468(@InterfaceC6391 K k) {
        C7210<K, V> c7210Mo1695 = mo1695(k);
        if (c7210Mo1695 == null) {
            return null;
        }
        this.f21780--;
        if (!this.f21779.isEmpty()) {
            Iterator<AbstractC7213<K, V>> it = this.f21779.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo3504(c7210Mo1695);
            }
        }
        C7210<K, V> c7210 = c7210Mo1695.f21784;
        if (c7210 != null) {
            c7210.f21783 = c7210Mo1695.f21783;
        } else {
            this.f21777 = c7210Mo1695.f21783;
        }
        C7210<K, V> c72102 = c7210Mo1695.f21783;
        if (c72102 != null) {
            c72102.f21784 = c7210;
        } else {
            this.f21778 = c7210;
        }
        c7210Mo1695.f21783 = null;
        c7210Mo1695.f21784 = null;
        return c7210Mo1695.f21782;
    }
}
