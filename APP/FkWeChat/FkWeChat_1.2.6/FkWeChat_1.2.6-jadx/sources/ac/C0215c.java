package ac;

import java.util.Map;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: ac.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0215c extends C0214b implements Map.Entry, InterfaceC1404e.a {

    /* JADX INFO: renamed from: s */
    public final C0221i f546s;

    /* JADX INFO: renamed from: t */
    public Object f547t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215c(C0221i c0221i, Object obj, Object obj2) {
        super(obj, obj2);
        c0221i.getClass();
        this.f546s = c0221i;
        this.f547t = obj2;
    }

    /* JADX INFO: renamed from: a */
    public void m453a(Object obj) {
        this.f547t = obj;
    }

    @Override // ac.C0214b, java.util.Map.Entry
    public Object getValue() {
        return this.f547t;
    }

    @Override // ac.C0214b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        m453a(obj);
        this.f546s.m503l(getKey(), obj);
        return value;
    }
}
