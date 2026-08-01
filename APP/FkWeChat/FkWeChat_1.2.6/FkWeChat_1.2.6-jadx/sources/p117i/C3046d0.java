package p117i;

import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: i.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3046d0 implements Map.Entry, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Object f8090q;

    /* JADX INFO: renamed from: r */
    public final Object f8091r;

    public C3046d0(Object obj, Object obj2) {
        this.f8090q = obj;
        this.f8091r = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f8090q;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f8091r;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
