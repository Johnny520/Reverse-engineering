package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Cj */
/* JADX INFO: loaded from: classes.dex */
public final class C0112Cj implements InterfaceC0098CB {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0098CB f273b;

    public C0112Cj(InterfaceC0098CB r2) {
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f273b = r2;
    }

    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context r5, InterfaceC2389pw r6, int r7, int r8) {
        C0026Aj r0 = (C0026Aj) r6.get();
        InterfaceC2389pw r3 = new C0608O5(ComponentCallbacks2C1273a.m2412a(r5).f4337a, ((C0327Hj) r0.f50a.f1572b).f1124l);
        InterfaceC0098CB r1 = this.f273b;
        InterfaceC2389pw r52 = r1.mo145a(r5, r3, r7, r8);
        if (r3.equals(r52) == true) goto L5;
        r3.mo118e();
    L5:
        Bitmap r53 = (Bitmap) r52.get();
        ((C0327Hj) r0.f50a.f1572b).m714c(r1, r53);
        return r6;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        this.f273b.mo172b(r2);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r2) {
        if ((r2 instanceof C0112Cj) == true) goto L5;
        return false;
    L5:
        return this.f273b.equals(((C0112Cj) r2).f273b);
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f273b.hashCode();
    }
}
