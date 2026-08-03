package p009E0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0191v implements Map, Serializable, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public static final C0191v f402a = null;

    static {
        f402a = new C0191v();
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
    public final boolean containsValue(Object r3) {
        if ((r3 instanceof Void) == true) goto L5;
        return false;
    L5:
        AbstractC0307g.m703e((Void) r3, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C0192w.f403a;
    }

    @Override // java.util.Map
    public final boolean equals(Object r2) {
        if ((r2 instanceof Map) == true) goto L5;
    L7:
        return false;
    L5:
        if (((Map) r2).isEmpty() == false) goto L7;
        return true;
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
        return C0192w.f403a;
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
        return C0190u.f401a;
    }
}
