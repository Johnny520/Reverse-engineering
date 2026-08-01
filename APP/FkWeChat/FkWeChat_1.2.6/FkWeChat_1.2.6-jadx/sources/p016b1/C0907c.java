package p016b1;

import java.util.Map;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: b1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907c extends C0906b implements Map.Entry, InterfaceC1404e.a {

    /* JADX INFO: renamed from: s */
    public final C0913i f2854s;

    /* JADX INFO: renamed from: t */
    public Object f2855t;

    public C0907c(C0913i c0913i, Object obj, Object obj2) {
        super(obj, obj2);
        this.f2854s = c0913i;
        this.f2855t = obj2;
    }

    /* JADX INFO: renamed from: a */
    public void m3322a(Object obj) {
        this.f2855t = obj;
    }

    @Override // p016b1.C0906b, java.util.Map.Entry
    public Object getValue() {
        return this.f2855t;
    }

    @Override // p016b1.C0906b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        m3322a(obj);
        this.f2854s.m3352l(getKey(), obj);
        return value;
    }
}
