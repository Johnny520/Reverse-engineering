package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0542s {

    /* JADX INFO: renamed from: a */
    public EnumC0536m f1489a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0539p f1490b;

    /* JADX INFO: renamed from: a */
    public final void m1253a(InterfaceC0541r r4, EnumC0535l r5) {
        EnumC0536m r02 = r5.m1252a();
        EnumC0536m r1 = this.f1489a;
        AbstractC0307g.m703e(r1, "state1");
        if (r02.compareTo(r1) >= 0) goto L5;
        r1 = r02;
    L5:
        this.f1489a = r1;
        this.f1490b.mo981b(r4, r5);
        this.f1489a = r02;
    }
}
