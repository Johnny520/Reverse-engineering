package p007D0;

import java.io.Serializable;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0142h implements InterfaceC0136b, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0275a f331a;

    /* JADX INFO: renamed from: b */
    public volatile Object f332b;

    /* JADX INFO: renamed from: c */
    public final Object f333c;

    public C0142h(InterfaceC0275a r2) {
        AbstractC0307g.m703e(r2, "initializer");
        this.f331a = r2;
        this.f332b = C0145k.f338a;
        this.f333c = this;
    }

    /* JADX INFO: renamed from: a */
    public final Object m466a() {
        Object r02 = this.f332b;
        C0145k r1 = C0145k.f338a;
        if (r02 == r1) goto L5;
        return r02;
    L5:
        Object r03 = this.f333c;
        monitor-enter(r03);
        Object r2 = this.f332b;     // Catch: Throwable -> L13
        if (r2 != r1) goto L11;
        InterfaceC0275a r12 = this.f331a;     // Catch: Throwable -> L13
        AbstractC0307g.m700b(r12);     // Catch: Throwable -> L13
        r2 = r12.invoke();     // Catch: Throwable -> L13
        this.f332b = r2;     // Catch: Throwable -> L13
        this.f331a = null;     // Catch: Throwable -> L13
    L11:
        monitor-exit(r03);
        return r2;
    L13:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        if (this.f332b != C0145k.f338a) goto L7;
        return "Lazy value not initialized yet.";
    L7:
        return String.valueOf(m466a());
    }
}
