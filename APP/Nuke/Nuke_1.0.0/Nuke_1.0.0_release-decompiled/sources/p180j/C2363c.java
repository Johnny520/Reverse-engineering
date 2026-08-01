package p180j;

import java.util.Map;
import p002A1.C0146s;
import p002A1.InterfaceC0144q;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2363c implements Map.Entry {

    /* JADX INFO: renamed from: d */
    public final Object f7666d;

    /* JADX INFO: renamed from: e */
    public final C0146s f7667e;

    /* JADX INFO: renamed from: f */
    public C2363c f7668f;

    /* JADX INFO: renamed from: g */
    public C2363c f7669g;

    public C2363c(InterfaceC0144q interfaceC0144q, C0146s c0146s) {
        this.f7666d = interfaceC0144q;
        this.f7667e = c0146s;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2363c)) {
            return false;
        }
        C2363c c2363c = (C2363c) obj;
        return this.f7666d.equals(c2363c.f7666d) && this.f7667e.equals(c2363c.f7667e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7666d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7667e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7666d.hashCode() ^ this.f7667e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7666d + "=" + this.f7667e;
    }
}
