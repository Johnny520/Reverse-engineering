package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zi implements Map, Serializable {
    public static final zi a = null;

    static {
        a = new zi();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r1) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return aj.a;
    }

    @Override // java.util.Map
    public final boolean equals(Object r2) {
        if ((r2 instanceof Map) == true) goto L5;
        return false;
    L5:
        if (((Map) r2).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object r1) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return aj.a;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return yi.a;
    }
}
