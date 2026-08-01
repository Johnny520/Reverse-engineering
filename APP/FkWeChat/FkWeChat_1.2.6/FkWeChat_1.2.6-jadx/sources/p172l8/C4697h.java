package p172l8;

import java.io.Serializable;

/* JADX INFO: renamed from: l8.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4697h implements InterfaceC4705l, Serializable {

    /* JADX INFO: renamed from: q */
    public final Object f13909q;

    public C4697h(Object obj) {
        this.f13909q = obj;
    }

    @Override // p172l8.InterfaceC4705l
    /* JADX INFO: renamed from: a */
    public boolean mo18779a() {
        return true;
    }

    @Override // p172l8.InterfaceC4705l
    public Object getValue() {
        return this.f13909q;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
