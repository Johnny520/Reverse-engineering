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

    public C0402e(InterfaceC0405h interfaceC0405h, boolean z2, InterfaceC0286l interfaceC0286l) {
        this.f896a = interfaceC0405h;
        this.f897b = z2;
        this.f898c = interfaceC0286l;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        return new C0401d(this);
    }
}
