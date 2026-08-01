package com.google.gson.internal;

import android.R;
import androidx.compose.animation.C0426;
import bsh.C2632;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C0426(2);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private C3238 entrySet;
    final C3236 header;
    private C3239 keySet;
    int modCount;
    C3236 root;
    int size;

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z;
        this.header = new C3236(z);
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(C3236 c3236, boolean z) {
        while (c3236 != null) {
            C3236 c32362 = c3236.f10901;
            C3236 c32363 = c3236.f10902;
            int i = c32362 != null ? c32362.f10898 : 0;
            int i2 = c32363 != null ? c32363.f10898 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C3236 c32364 = c32363.f10901;
                C3236 c32365 = c32363.f10902;
                int i4 = (c32364 != null ? c32364.f10898 : 0) - (c32365 != null ? c32365.f10898 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(c3236);
                } else {
                    rotateRight(c32363);
                    rotateLeft(c3236);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C3236 c32366 = c32362.f10901;
                C3236 c32367 = c32362.f10902;
                int i5 = (c32366 != null ? c32366.f10898 : 0) - (c32367 != null ? c32367.f10898 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(c3236);
                } else {
                    rotateLeft(c32362);
                    rotateRight(c3236);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c3236.f10898 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c3236.f10898 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c3236 = c3236.f10903;
        }
    }

    private void replaceInParent(C3236 c3236, C3236 c32362) {
        C3236 c32363 = c3236.f10903;
        c3236.f10903 = null;
        if (c32362 != null) {
            c32362.f10903 = c32363;
        }
        if (c32363 == null) {
            this.root = c32362;
        } else if (c32363.f10901 == c3236) {
            c32363.f10901 = c32362;
        } else {
            c32363.f10902 = c32362;
        }
    }

    private void rotateLeft(C3236 c3236) {
        C3236 c32362 = c3236.f10901;
        C3236 c32363 = c3236.f10902;
        C3236 c32364 = c32363.f10901;
        C3236 c32365 = c32363.f10902;
        c3236.f10902 = c32364;
        if (c32364 != null) {
            c32364.f10903 = c3236;
        }
        replaceInParent(c3236, c32363);
        c32363.f10901 = c3236;
        c3236.f10903 = c32363;
        int iMax = Math.max(c32362 != null ? c32362.f10898 : 0, c32364 != null ? c32364.f10898 : 0) + 1;
        c3236.f10898 = iMax;
        c32363.f10898 = Math.max(iMax, c32365 != null ? c32365.f10898 : 0) + 1;
    }

    private void rotateRight(C3236 c3236) {
        C3236 c32362 = c3236.f10901;
        C3236 c32363 = c3236.f10902;
        C3236 c32364 = c32362.f10901;
        C3236 c32365 = c32362.f10902;
        c3236.f10901 = c32365;
        if (c32365 != null) {
            c32365.f10903 = c3236;
        }
        replaceInParent(c3236, c32362);
        c32362.f10902 = c3236;
        c3236.f10903 = c32362;
        int iMax = Math.max(c32363 != null ? c32363.f10898 : 0, c32365 != null ? c32365.f10898 : 0) + 1;
        c3236.f10898 = iMax;
        c32362.f10898 = Math.max(iMax, c32364 != null ? c32364.f10898 : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C3236 c3236 = this.header;
        c3236.f10895 = c3236;
        c3236.f10896 = c3236;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C3238 c3238 = this.entrySet;
        if (c3238 != null) {
            return c3238;
        }
        C3238 c32382 = new C3238(this);
        this.entrySet = c32382;
        return c32382;
    }

    public C3236 find(K k, boolean z) {
        int iCompareTo;
        C3236 c3236;
        Comparator<? super K> comparator = this.comparator;
        C3236 c32362 = this.root;
        if (c32362 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                R.color colorVar = (Object) c32362.f10899;
                iCompareTo = comparable != null ? comparable.compareTo(colorVar) : comparator.compare(k, colorVar);
                if (iCompareTo == 0) {
                    return c32362;
                }
                C3236 c32363 = iCompareTo < 0 ? c32362.f10901 : c32362.f10902;
                if (c32363 == null) {
                    break;
                }
                c32362 = c32363;
            }
        } else {
            iCompareTo = 0;
        }
        C3236 c32364 = c32362;
        if (!z) {
            return null;
        }
        C3236 c32365 = this.header;
        if (c32364 != null) {
            c3236 = new C3236(this.allowNullValues, c32364, k, c32365, c32365.f10895);
            if (iCompareTo < 0) {
                c32364.f10901 = c3236;
            } else {
                c32364.f10902 = c3236;
            }
            rebalance(c32364, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            c3236 = new C3236(this.allowNullValues, c32364, k, c32365, c32365.f10895);
            this.root = c3236;
        }
        this.size++;
        this.modCount++;
        return c3236;
    }

    public C3236 findByEntry(Map.Entry<?, ?> entry) {
        C3236 c3236FindByObject = findByObject(entry.getKey());
        if (c3236FindByObject == null || !equal(c3236FindByObject.f10897, entry.getValue())) {
            return null;
        }
        return c3236FindByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3236 findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C3236 c3236FindByObject = findByObject(obj);
        if (c3236FindByObject != null) {
            return (V) c3236FindByObject.f10897;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C3239 c3239 = this.keySet;
        if (c3239 != null) {
            return c3239;
        }
        C3239 c32392 = new C3239(this);
        this.keySet = c32392;
        return c32392;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            C2632.m5298("key == null");
            return null;
        }
        if (v == null && !this.allowNullValues) {
            C2632.m5298("value == null");
            return null;
        }
        C3236 c3236Find = find(k, true);
        V v2 = (V) c3236Find.f10897;
        c3236Find.f10897 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C3236 c3236RemoveInternalByKey = removeInternalByKey(obj);
        if (c3236RemoveInternalByKey != null) {
            return (V) c3236RemoveInternalByKey.f10897;
        }
        return null;
    }

    public void removeInternal(C3236 c3236, boolean z) {
        C3236 c32362;
        C3236 c32363;
        int i;
        if (z) {
            C3236 c32364 = c3236.f10895;
            c32364.f10896 = c3236.f10896;
            c3236.f10896.f10895 = c32364;
        }
        C3236 c32365 = c3236.f10901;
        C3236 c32366 = c3236.f10902;
        C3236 c32367 = c3236.f10903;
        int i2 = 0;
        if (c32365 == null || c32366 == null) {
            if (c32365 != null) {
                replaceInParent(c3236, c32365);
                c3236.f10901 = null;
            } else if (c32366 != null) {
                replaceInParent(c3236, c32366);
                c3236.f10902 = null;
            } else {
                replaceInParent(c3236, null);
            }
            rebalance(c32367, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (c32365.f10898 > c32366.f10898) {
            C3236 c32368 = c32365.f10902;
            while (true) {
                C3236 c32369 = c32368;
                c32363 = c32365;
                c32365 = c32369;
                if (c32365 == null) {
                    break;
                } else {
                    c32368 = c32365.f10902;
                }
            }
        } else {
            C3236 c323610 = c32366.f10901;
            while (true) {
                c32362 = c32366;
                c32366 = c323610;
                if (c32366 == null) {
                    break;
                } else {
                    c323610 = c32366.f10901;
                }
            }
            c32363 = c32362;
        }
        removeInternal(c32363, false);
        C3236 c323611 = c3236.f10901;
        if (c323611 != null) {
            i = c323611.f10898;
            c32363.f10901 = c323611;
            c323611.f10903 = c32363;
            c3236.f10901 = null;
        } else {
            i = 0;
        }
        C3236 c323612 = c3236.f10902;
        if (c323612 != null) {
            i2 = c323612.f10898;
            c32363.f10902 = c323612;
            c323612.f10903 = c32363;
            c3236.f10902 = null;
        }
        c32363.f10898 = Math.max(i, i2) + 1;
        replaceInParent(c3236, c32363);
    }

    public C3236 removeInternalByKey(Object obj) {
        C3236 c3236FindByObject = findByObject(obj);
        if (c3236FindByObject != null) {
            removeInternal(c3236FindByObject, true);
        }
        return c3236FindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z) {
        this(NATURAL_ORDER, z);
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }
}
