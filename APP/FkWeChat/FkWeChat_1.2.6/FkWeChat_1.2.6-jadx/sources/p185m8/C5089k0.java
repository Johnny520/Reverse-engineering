package p185m8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5089k0 implements Map, Serializable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public static final C5089k0 f15400q = new C5089k0();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return f15400q;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20605a(Void r12) {
        r12.getClass();
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m20605a((Void) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public Set m20607e() {
        return C5091l0.f15401q;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m20607e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public Set m20608g() {
        return C5091l0.f15401q;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public int m20609j() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m20608g();
    }

    /* JADX INFO: renamed from: l */
    public Collection m20610l() {
        return C5087j0.f15399q;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m20609j();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m20610l();
    }
}
