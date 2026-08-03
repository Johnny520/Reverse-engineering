package p018J0;

import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;

/* JADX INFO: renamed from: J0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0232b implements InterfaceC0202a {

    /* JADX INFO: renamed from: a */
    public static final C0232b f472a = null;

    static {
        f472a = new C0232b();
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: a */
    public final void mo587a(Object r2) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
