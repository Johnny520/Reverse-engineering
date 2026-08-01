package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uj extends o10 {
    public final HashMap e;

    public uj() {
        this.e = new HashMap();
    }

    @Override // defpackage.o10
    public final l10 a(Object r2) {
        return (l10) this.e.get(r2);
    }

    @Override // defpackage.o10
    public final Object b(Object r3) {
        Object r0 = super.b(r3);
        this.e.remove(r3);
        return r0;
    }
}
