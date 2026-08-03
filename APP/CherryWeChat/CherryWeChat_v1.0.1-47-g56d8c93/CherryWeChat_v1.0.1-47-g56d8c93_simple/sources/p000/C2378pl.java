package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: pl */
/* JADX INFO: loaded from: classes.dex */
public final class C2378pl extends C0809St {

    /* JADX INFO: renamed from: l */
    public final boolean f8370l;

    public C2378pl(String r2, C2421ql r3) {
        super(r2, r3, 1);
        this.f8370l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [Dn, java.lang.Object] */
    @Override // p000.C0809St
    public final boolean equals(Object r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        if ((r6 instanceof C2378pl) == false) goto L28;
        InterfaceC0126Cx r0 = (InterfaceC0126Cx) r6;
        if (this.f2553a.equals(r0.mo203b()) == false) goto L28;
        C2378pl r62 = (C2378pl) r6;
        if (r62.f8370l == false) goto L28;
        if (Arrays.equals((InterfaceC0126Cx[]) this.f2562j.getValue(), (InterfaceC0126Cx[]) r62.f2562j.getValue()) == false) goto L28;
        int r63 = r0.mo205d();
        int r2 = this.f2555c;
        if (r2 != r63) goto L28;
        int r64 = 0;
    L18:
        if (r64 >= r2) goto L32;
        if (AbstractC0585Nj.m1134a(mo210j(r64).mo203b(), r0.mo210j(r64).mo203b()) == false) goto L28;
        if (AbstractC0585Nj.m1134a(mo210j(r64).mo204c(), r0.mo210j(r64).mo204c()) == false) goto L28;
        r64 = r64 + 1;
        goto L18
    L32:
        return true;
    L28:
        return false;
    }

    @Override // p000.C0809St, p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public final boolean mo207f() {
        return this.f8370l;
    }

    @Override // p000.C0809St
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
