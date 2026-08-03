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

    public C0112Cj(InterfaceC0098CB interfaceC0098CB) {
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC0098CB);
        this.f273b = interfaceC0098CB;
    }

    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context context, InterfaceC2389pw interfaceC2389pw, int i, int i2) {
        C0026Aj c0026Aj = (C0026Aj) interfaceC2389pw.get();
        InterfaceC2389pw c0608o5 = new C0608O5(ComponentCallbacks2C1273a.m2412a(context).f4337a, ((C0327Hj) c0026Aj.f50a.f1572b).f1124l);
        InterfaceC0098CB interfaceC0098CB = this.f273b;
        InterfaceC2389pw interfaceC2389pwMo145a = interfaceC0098CB.mo145a(context, c0608o5, i, i2);
        if (!c0608o5.equals(interfaceC2389pwMo145a)) {
            c0608o5.mo118e();
        }
        ((C0327Hj) c0026Aj.f50a.f1572b).m714c(interfaceC0098CB, (Bitmap) interfaceC2389pwMo145a.get());
        return interfaceC2389pw;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        this.f273b.mo172b(messageDigest);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C0112Cj) {
            return this.f273b.equals(((C0112Cj) obj).f273b);
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f273b.hashCode();
    }
}
