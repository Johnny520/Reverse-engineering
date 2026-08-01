package com.google.gson.internal;

import android.R;
import androidx.compose.animation.C1272;
import bsh.C3466;
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
    private static final Comparator<Comparable> NATURAL_ORDER = new C1272(2);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private C4071 entrySet;
    final C4069 header;
    private C4072 keySet;
    int modCount;
    C4069 root;
    int size;

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z;
        this.header = new C4069(z);
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(C4069 c4069, boolean z) {
        while (c4069 != null) {
            C4069 c40692 = c4069.f11251;
            C4069 c40693 = c4069.f11252;
            int i = c40692 != null ? c40692.f11248 : 0;
            int i2 = c40693 != null ? c40693.f11248 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C4069 c40694 = c40693.f11251;
                C4069 c40695 = c40693.f11252;
                int i4 = (c40694 != null ? c40694.f11248 : 0) - (c40695 != null ? c40695.f11248 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(c4069);
                } else {
                    rotateRight(c40693);
                    rotateLeft(c4069);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C4069 c40696 = c40692.f11251;
                C4069 c40697 = c40692.f11252;
                int i5 = (c40696 != null ? c40696.f11248 : 0) - (c40697 != null ? c40697.f11248 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(c4069);
                } else {
                    rotateLeft(c40692);
                    rotateRight(c4069);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c4069.f11248 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c4069.f11248 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c4069 = c4069.f11253;
        }
    }

    private void replaceInParent(C4069 c4069, C4069 c40692) {
        C4069 c40693 = c4069.f11253;
        c4069.f11253 = null;
        if (c40692 != null) {
            c40692.f11253 = c40693;
        }
        if (c40693 == null) {
            this.root = c40692;
        } else if (c40693.f11251 == c4069) {
            c40693.f11251 = c40692;
        } else {
            c40693.f11252 = c40692;
        }
    }

    private void rotateLeft(C4069 c4069) {
        C4069 c40692 = c4069.f11251;
        C4069 c40693 = c4069.f11252;
        C4069 c40694 = c40693.f11251;
        C4069 c40695 = c40693.f11252;
        c4069.f11252 = c40694;
        if (c40694 != null) {
            c40694.f11253 = c4069;
        }
        replaceInParent(c4069, c40693);
        c40693.f11251 = c4069;
        c4069.f11253 = c40693;
        int iMax = Math.max(c40692 != null ? c40692.f11248 : 0, c40694 != null ? c40694.f11248 : 0) + 1;
        c4069.f11248 = iMax;
        c40693.f11248 = Math.max(iMax, c40695 != null ? c40695.f11248 : 0) + 1;
    }

    private void rotateRight(C4069 c4069) {
        C4069 c40692 = c4069.f11251;
        C4069 c40693 = c4069.f11252;
        C4069 c40694 = c40692.f11251;
        C4069 c40695 = c40692.f11252;
        c4069.f11251 = c40695;
        if (c40695 != null) {
            c40695.f11253 = c4069;
        }
        replaceInParent(c4069, c40692);
        c40692.f11252 = c4069;
        c4069.f11253 = c40692;
        int iMax = Math.max(c40693 != null ? c40693.f11248 : 0, c40695 != null ? c40695.f11248 : 0) + 1;
        c4069.f11248 = iMax;
        c40692.f11248 = Math.max(iMax, c40694 != null ? c40694.f11248 : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C4069 c4069 = this.header;
        c4069.f11245 = c4069;
        c4069.f11246 = c4069;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C4071 c4071 = this.entrySet;
        if (c4071 != null) {
            return c4071;
        }
        C4071 c40712 = new C4071(this);
        this.entrySet = c40712;
        return c40712;
    }

    public C4069 find(K k, boolean z) {
        int iCompareTo;
        C4069 c4069;
        Comparator<? super K> comparator = this.comparator;
        C4069 c40692 = this.root;
        if (c40692 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                R.color colorVar = (Object) c40692.f11249;
                iCompareTo = comparable != null ? comparable.compareTo(colorVar) : comparator.compare(k, colorVar);
                if (iCompareTo == 0) {
                    return c40692;
                }
                C4069 c40693 = iCompareTo < 0 ? c40692.f11251 : c40692.f11252;
                if (c40693 == null) {
                    break;
                }
                c40692 = c40693;
            }
        } else {
            iCompareTo = 0;
        }
        C4069 c40694 = c40692;
        if (!z) {
            return null;
        }
        C4069 c40695 = this.header;
        if (c40694 != null) {
            c4069 = new C4069(this.allowNullValues, c40694, k, c40695, c40695.f11245);
            if (iCompareTo < 0) {
                c40694.f11251 = c4069;
            } else {
                c40694.f11252 = c4069;
            }
            rebalance(c40694, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            c4069 = new C4069(this.allowNullValues, c40694, k, c40695, c40695.f11245);
            this.root = c4069;
        }
        this.size++;
        this.modCount++;
        return c4069;
    }

    public C4069 findByEntry(Map.Entry<?, ?> entry) {
        C4069 c4069FindByObject = findByObject(entry.getKey());
        if (c4069FindByObject == null || !equal(c4069FindByObject.f11247, entry.getValue())) {
            return null;
        }
        return c4069FindByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4069 findByObject(Object obj) {
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
        C4069 c4069FindByObject = findByObject(obj);
        if (c4069FindByObject != null) {
            return (V) c4069FindByObject.f11247;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C4072 c4072 = this.keySet;
        if (c4072 != null) {
            return c4072;
        }
        C4072 c40722 = new C4072(this);
        this.keySet = c40722;
        return c40722;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            C3466.m5903("key == null");
            return null;
        }
        if (v == null && !this.allowNullValues) {
            C3466.m5903("value == null");
            return null;
        }
        C4069 c4069Find = find(k, true);
        V v2 = (V) c4069Find.f11247;
        c4069Find.f11247 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C4069 c4069RemoveInternalByKey = removeInternalByKey(obj);
        if (c4069RemoveInternalByKey != null) {
            return (V) c4069RemoveInternalByKey.f11247;
        }
        return null;
    }

    public void removeInternal(C4069 c4069, boolean z) {
        C4069 c40692;
        C4069 c40693;
        int i;
        if (z) {
            C4069 c40694 = c4069.f11245;
            c40694.f11246 = c4069.f11246;
            c4069.f11246.f11245 = c40694;
        }
        C4069 c40695 = c4069.f11251;
        C4069 c40696 = c4069.f11252;
        C4069 c40697 = c4069.f11253;
        int i2 = 0;
        if (c40695 == null || c40696 == null) {
            if (c40695 != null) {
                replaceInParent(c4069, c40695);
                c4069.f11251 = null;
            } else if (c40696 != null) {
                replaceInParent(c4069, c40696);
                c4069.f11252 = null;
            } else {
                replaceInParent(c4069, null);
            }
            rebalance(c40697, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (c40695.f11248 > c40696.f11248) {
            C4069 c40698 = c40695.f11252;
            while (true) {
                C4069 c40699 = c40698;
                c40693 = c40695;
                c40695 = c40699;
                if (c40695 == null) {
                    break;
                } else {
                    c40698 = c40695.f11252;
                }
            }
        } else {
            C4069 c406910 = c40696.f11251;
            while (true) {
                c40692 = c40696;
                c40696 = c406910;
                if (c40696 == null) {
                    break;
                } else {
                    c406910 = c40696.f11251;
                }
            }
            c40693 = c40692;
        }
        removeInternal(c40693, false);
        C4069 c406911 = c4069.f11251;
        if (c406911 != null) {
            i = c406911.f11248;
            c40693.f11251 = c406911;
            c406911.f11253 = c40693;
            c4069.f11251 = null;
        } else {
            i = 0;
        }
        C4069 c406912 = c4069.f11252;
        if (c406912 != null) {
            i2 = c406912.f11248;
            c40693.f11252 = c406912;
            c406912.f11253 = c40693;
            c4069.f11252 = null;
        }
        c40693.f11248 = Math.max(i, i2) + 1;
        replaceInParent(c4069, c40693);
    }

    public C4069 removeInternalByKey(Object obj) {
        C4069 c4069FindByObject = findByObject(obj);
        if (c4069FindByObject != null) {
            removeInternal(c4069FindByObject, true);
        }
        return c4069FindByObject;
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
