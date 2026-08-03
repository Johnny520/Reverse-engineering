package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Zw */
/* JADX INFO: loaded from: classes.dex */
public final class C1113Zw implements InterfaceC0159Dn, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f3511c = null;

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC0884Ui f3512a;

    /* JADX INFO: renamed from: b */
    public volatile Object f3513b;

    static {
        f3511c = AtomicReferenceFieldUpdater.newUpdater(C1113Zw.class, Object.class, "b");
    }

    @Override // p000.InterfaceC0159Dn
    public final Object getValue() {
        Object r0 = this.f3513b;
        C1456gf r1 = C1456gf.f5166j;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        InterfaceC0884Ui r02 = this.f3512a;
        if (r02 == null) goto L15;
        Object r03 = r02.mo6a();
        AtomicReferenceFieldUpdater r2 = f3511c;
    L9:
        if (r2.compareAndSet(this, r1, r03) == true) goto L10;
        if (r2.get(this) == r1) goto L9;
    L10:
        this.f3512a = null;
        return r03;
    L15:
        return this.f3513b;
    }

    public final String toString() {
        if (this.f3513b != C1456gf.f5166j) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
