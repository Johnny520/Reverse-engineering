package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: cA */
/* JADX INFO: loaded from: classes.dex */
public final class C1251cA implements InterfaceC0159Dn, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0884Ui f4248a;

    /* JADX INFO: renamed from: b */
    public volatile Object f4249b;

    /* JADX INFO: renamed from: c */
    public final Object f4250c;

    public C1251cA(InterfaceC0884Ui r1) {
        this.f4248a = r1;
        this.f4249b = C1456gf.f5166j;
        this.f4250c = this;
    }

    @Override // p000.InterfaceC0159Dn
    public final Object getValue() {
        Object r0 = this.f4249b;
        C1456gf r1 = C1456gf.f5166j;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        Object r02 = this.f4250c;
        monitor-enter(r02);
        Object r2 = this.f4249b;     // Catch: Throwable -> L13
        if (r2 != r1) goto L11;
        r2 = this.f4248a.mo6a();     // Catch: Throwable -> L13
        this.f4249b = r2;     // Catch: Throwable -> L13
        this.f4248a = null;     // Catch: Throwable -> L13
    L11:
        monitor-exit(r02);
        return r2;
    L13:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        if (this.f4249b != C1456gf.f5166j) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
