package p025bc;

import ac.C0214b;
import java.util.Map;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: bc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1091b extends C0214b implements Map.Entry, InterfaceC1404e.a {

    /* JADX INFO: renamed from: s */
    public final Map f3297s;

    /* JADX INFO: renamed from: t */
    public C1090a f3298t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091b(Map map, Object obj, C1090a c1090a) {
        super(obj, c1090a.m3970e());
        map.getClass();
        c1090a.getClass();
        this.f3297s = map;
        this.f3298t = c1090a;
    }

    @Override // ac.C0214b, java.util.Map.Entry
    public Object getValue() {
        return this.f3298t.m3970e();
    }

    @Override // ac.C0214b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object objM3970e = this.f3298t.m3970e();
        this.f3298t = this.f3298t.m3973h(obj);
        this.f3297s.put(getKey(), this.f3298t);
        return objM3970e;
    }
}
