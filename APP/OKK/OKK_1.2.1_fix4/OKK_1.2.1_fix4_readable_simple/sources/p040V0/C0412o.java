package p040V0;

import java.util.Iterator;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0412o implements InterfaceC0405h, InterfaceC0399b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0405h f912a;

    /* JADX INFO: renamed from: b */
    public final int f913b;

    public C0412o(InterfaceC0405h r2) {
        AbstractC0307g.m703e(r2, "sequence");
        this.f912a = r2;
        this.f913b = 8;
    }

    @Override // p040V0.InterfaceC0399b
    /* JADX INFO: renamed from: a */
    public final InterfaceC0405h mo986a() {
        if (8 < this.f913b) goto L6;
        return this;
    L6:
        return new C0412o(this.f912a);
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        return new C0172c(this);
    }
}
