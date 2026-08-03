package p040V0;

import java.util.Iterator;
import p029P0.InterfaceC0286l;

/* JADX INFO: renamed from: V0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0402e implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0405h f896a;

    /* JADX INFO: renamed from: b */
    public final boolean f897b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0286l f898c;

    public C0402e(InterfaceC0405h r1, boolean r2, InterfaceC0286l r3) {
        this.f896a = r1;
        this.f897b = r2;
        this.f898c = r3;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        return new C0401d(this);
    }
}
