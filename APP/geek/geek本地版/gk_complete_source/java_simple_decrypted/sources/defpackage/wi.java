package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class wi implements ge, Serializable {
    public static final wi a = null;

    static {
        a = new wi();
    }

    @Override // defpackage.ge
    public final ee b(fe r2) {
        ip.o("key", r2);
        return null;
    }

    @Override // defpackage.ge
    public final ge g(fe r2) {
        ip.o("key", r2);
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.ge
    public final ge i(ge r2) {
        ip.o("context", r2);
        return r2;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.ge
    public final Object h(Object r1, wm r2) {
        return r1;
    }
}
