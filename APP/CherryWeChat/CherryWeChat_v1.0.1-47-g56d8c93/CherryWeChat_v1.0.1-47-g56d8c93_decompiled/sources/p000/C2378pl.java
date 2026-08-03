package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: pl */
/* JADX INFO: loaded from: classes.dex */
public final class C2378pl extends C0809St {

    /* JADX INFO: renamed from: l */
    public final boolean f8370l;

    public C2378pl(String str, C2421ql c2421ql) {
        super(str, c2421ql, 1);
        this.f8370l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [Dn, java.lang.Object] */
    @Override // p000.C0809St
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2378pl) {
            InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj;
            if (this.f2553a.equals(interfaceC0126Cx.mo203b())) {
                C2378pl c2378pl = (C2378pl) obj;
                if (c2378pl.f8370l && Arrays.equals((InterfaceC0126Cx[]) this.f2562j.getValue(), (InterfaceC0126Cx[]) c2378pl.f2562j.getValue())) {
                    int iMo205d = interfaceC0126Cx.mo205d();
                    int i = this.f2555c;
                    if (i == iMo205d) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC0585Nj.m1134a(mo210j(i2).mo203b(), interfaceC0126Cx.mo210j(i2).mo203b()) && AbstractC0585Nj.m1134a(mo210j(i2).mo204c(), interfaceC0126Cx.mo210j(i2).mo204c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
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
