package com.google.gson.internal;

import android.R;
import androidx.compose.animation.C0426;
import bsh.C2633;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C0426(2);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private C3239 entrySet;
    final C3237 header;
    private C3240 keySet;
    int modCount;
    C3237 root;
    int size;

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z;
        this.header = new C3237(z);
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(C3237 c3237, boolean z) {
        while (c3237 != null) {
            C3237 c32372 = c3237.f10906;
            C3237 c32373 = c3237.f10907;
            int i = c32372 != null ? c32372.f10903 : 0;
            int i2 = c32373 != null ? c32373.f10903 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C3237 c32374 = c32373.f10906;
                C3237 c32375 = c32373.f10907;
                int i4 = (c32374 != null ? c32374.f10903 : 0) - (c32375 != null ? c32375.f10903 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(c3237);
                } else {
                    rotateRight(c32373);
                    rotateLeft(c3237);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C3237 c32376 = c32372.f10906;
                C3237 c32377 = c32372.f10907;
                int i5 = (c32376 != null ? c32376.f10903 : 0) - (c32377 != null ? c32377.f10903 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(c3237);
                } else {
                    rotateLeft(c32372);
                    rotateRight(c3237);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c3237.f10903 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c3237.f10903 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c3237 = c3237.f10908;
        }
    }

    private void replaceInParent(C3237 c3237, C3237 c32372) {
        C3237 c32373 = c3237.f10908;
        c3237.f10908 = null;
        if (c32372 != null) {
            c32372.f10908 = c32373;
        }
        if (c32373 == null) {
            this.root = c32372;
        } else if (c32373.f10906 == c3237) {
            c32373.f10906 = c32372;
        } else {
            c32373.f10907 = c32372;
        }
    }

    private void rotateLeft(C3237 c3237) {
        C3237 c32372 = c3237.f10906;
        C3237 c32373 = c3237.f10907;
        C3237 c32374 = c32373.f10906;
        C3237 c32375 = c32373.f10907;
        c3237.f10907 = c32374;
        if (c32374 != null) {
            c32374.f10908 = c3237;
        }
        replaceInParent(c3237, c32373);
        c32373.f10906 = c3237;
        c3237.f10908 = c32373;
        int iMax = Math.max(c32372 != null ? c32372.f10903 : 0, c32374 != null ? c32374.f10903 : 0) + 1;
        c3237.f10903 = iMax;
        c32373.f10903 = Math.max(iMax, c32375 != null ? c32375.f10903 : 0) + 1;
    }

    private void rotateRight(C3237 c3237) {
        C3237 c32372 = c3237.f10906;
        C3237 c32373 = c3237.f10907;
        C3237 c32374 = c32372.f10906;
        C3237 c32375 = c32372.f10907;
        c3237.f10906 = c32375;
        if (c32375 != null) {
            c32375.f10908 = c3237;
        }
        replaceInParent(c3237, c32372);
        c32372.f10907 = c3237;
        c3237.f10908 = c32372;
        int iMax = Math.max(c32373 != null ? c32373.f10903 : 0, c32375 != null ? c32375.f10903 : 0) + 1;
        c3237.f10903 = iMax;
        c32372.f10903 = Math.max(iMax, c32374 != null ? c32374.f10903 : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C3237 c3237 = this.header;
        c3237.f10900 = c3237;
        c3237.f10901 = c3237;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C3239 c3239 = this.entrySet;
        if (c3239 != null) {
            return c3239;
        }
        C3239 c32392 = new C3239(this);
        this.entrySet = c32392;
        return c32392;
    }

    public C3237 find(K k, boolean z) {
        int iCompareTo;
        C3237 c3237;
        Comparator<? super K> comparator = this.comparator;
        C3237 c32372 = this.root;
        if (c32372 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                R.color colorVar = (Object) c32372.f10904;
                iCompareTo = comparable != null ? comparable.compareTo(colorVar) : comparator.compare(k, colorVar);
                if (iCompareTo == 0) {
                    return c32372;
                }
                C3237 c32373 = iCompareTo < 0 ? c32372.f10906 : c32372.f10907;
                if (c32373 == null) {
                    break;
                }
                c32372 = c32373;
            }
        } else {
            iCompareTo = 0;
        }
        C3237 c32374 = c32372;
        if (!z) {
            return null;
        }
        C3237 c32375 = this.header;
        if (c32374 != null) {
            c3237 = new C3237(this.allowNullValues, c32374, k, c32375, c32375.f10900);
            if (iCompareTo < 0) {
                c32374.f10906 = c3237;
            } else {
                c32374.f10907 = c3237;
            }
            rebalance(c32374, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            c3237 = new C3237(this.allowNullValues, c32374, k, c32375, c32375.f10900);
            this.root = c3237;
        }
        this.size++;
        this.modCount++;
        return c3237;
    }

    public C3237 findByEntry(Map.Entry<?, ?> entry) {
        C3237 c3237FindByObject = findByObject(entry.getKey());
        if (c3237FindByObject == null || !equal(c3237FindByObject.f10902, entry.getValue())) {
            return null;
        }
        return c3237FindByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3237 findByObject(Object obj) {
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
        C3237 c3237FindByObject = findByObject(obj);
        if (c3237FindByObject != null) {
            return (V) c3237FindByObject.f10902;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C3240 c3240 = this.keySet;
        if (c3240 != null) {
            return c3240;
        }
        C3240 c32402 = new C3240(this);
        this.keySet = c32402;
        return c32402;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            C2633.m5343("key == null");
            return null;
        }
        if (v == null && !this.allowNullValues) {
            C2633.m5343("value == null");
            return null;
        }
        C3237 c3237Find = find(k, true);
        V v2 = (V) c3237Find.f10902;
        c3237Find.f10902 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C3237 c3237RemoveInternalByKey = removeInternalByKey(obj);
        if (c3237RemoveInternalByKey != null) {
            return (V) c3237RemoveInternalByKey.f10902;
        }
        return null;
    }

    public void removeInternal(C3237 c3237, boolean z) {
        C3237 c32372;
        C3237 c32373;
        int i;
        if (z) {
            C3237 c32374 = c3237.f10900;
            c32374.f10901 = c3237.f10901;
            c3237.f10901.f10900 = c32374;
        }
        C3237 c32375 = c3237.f10906;
        C3237 c32376 = c3237.f10907;
        C3237 c32377 = c3237.f10908;
        int i2 = 0;
        if (c32375 == null || c32376 == null) {
            if (c32375 != null) {
                replaceInParent(c3237, c32375);
                c3237.f10906 = null;
            } else if (c32376 != null) {
                replaceInParent(c3237, c32376);
                c3237.f10907 = null;
            } else {
                replaceInParent(c3237, null);
            }
            rebalance(c32377, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (c32375.f10903 > c32376.f10903) {
            C3237 c32378 = c32375.f10907;
            while (true) {
                C3237 c32379 = c32378;
                c32373 = c32375;
                c32375 = c32379;
                if (c32375 == null) {
                    break;
                } else {
                    c32378 = c32375.f10907;
                }
            }
        } else {
            C3237 c323710 = c32376.f10906;
            while (true) {
                c32372 = c32376;
                c32376 = c323710;
                if (c32376 == null) {
                    break;
                } else {
                    c323710 = c32376.f10906;
                }
            }
            c32373 = c32372;
        }
        removeInternal(c32373, false);
        C3237 c323711 = c3237.f10906;
        if (c323711 != null) {
            i = c323711.f10903;
            c32373.f10906 = c323711;
            c323711.f10908 = c32373;
            c3237.f10906 = null;
        } else {
            i = 0;
        }
        C3237 c323712 = c3237.f10907;
        if (c323712 != null) {
            i2 = c323712.f10903;
            c32373.f10907 = c323712;
            c323712.f10908 = c32373;
            c3237.f10907 = null;
        }
        c32373.f10903 = Math.max(i, i2) + 1;
        replaceInParent(c3237, c32373);
    }

    public C3237 removeInternalByKey(Object obj) {
        C3237 c3237FindByObject = findByObject(obj);
        if (c3237FindByObject != null) {
            removeInternal(c3237FindByObject, true);
        }
        return c3237FindByObject;
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
