package Yue;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4634 implements Map, Serializable, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4634 f9947 = new C4634();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f9948 = 8246714829545688274L;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    private final Object m13931() {
        return f9947;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@InterfaceC6489 Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m1592((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m13932();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m13933();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m13934();
    }

    @InterfaceC6399
    public String toString() {
        return C6193.f15213;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m13935();
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m1592(@InterfaceC6399 Void r2) {
        C5499.m17103(r2, "value");
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public Void get(@InterfaceC6489 Object obj) {
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Set<Map.Entry> m13932() {
        return C4636.f9949;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Set<Object> m13933() {
        return C4636.f9949;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m13934() {
        return 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Collection m13935() {
        return C4633.f9945;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Void m13936(Object obj, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
