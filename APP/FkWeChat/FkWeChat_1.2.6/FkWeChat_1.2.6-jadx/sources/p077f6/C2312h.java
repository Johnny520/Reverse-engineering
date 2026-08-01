package p077f6;

import java.util.Map;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2312h implements InterfaceC2305d0 {

    /* JADX INFO: renamed from: a */
    public final Map f6319a;

    public C2312h(Map map) {
        map.getClass();
        this.f6319a = map;
    }

    @Override // p077f6.InterfaceC2305d0
    /* JADX INFO: renamed from: a */
    public Map mo8431a() {
        return this.f6319a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2312h.class != obj.getClass()) {
            return false;
        }
        return AbstractC1061t.m3842c(mo8431a(), ((C2312h) obj).mo8431a());
    }

    public int hashCode() {
        return mo8431a().hashCode();
    }
}
