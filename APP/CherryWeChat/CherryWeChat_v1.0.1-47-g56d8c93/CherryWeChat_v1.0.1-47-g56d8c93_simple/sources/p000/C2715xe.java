package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: xe */
/* JADX INFO: loaded from: classes.dex */
public final class C2715xe implements InterfaceC0098CB {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0098CB f9291b;

    /* JADX INFO: renamed from: c */
    public final boolean f9292c;

    public C2715xe(InterfaceC0098CB r1, boolean r2) {
        this.f9291b = r1;
        this.f9292c = r2;
    }

    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context r3, InterfaceC2389pw r4, int r5, int r6) {
        InterfaceC0565N5 r0 = ComponentCallbacks2C1273a.m2412a(r3).f4337a;
        Drawable r1 = (Drawable) r4.get();
        C0608O5 r02 = AbstractC0148Dc.m271e(r0, r1, r5, r6);
        if (r02 == null) goto L5;
        InterfaceC2389pw r52 = this.f9291b.mo145a(r3, r02, r5, r6);
        if (r52.equals(r02) == false) goto L14;
        r52.mo118e();
        return r4;
    L14:
        return new C0608O5(r3.getResources(), r52);
    L5:
        if (this.f9292c == true) goto L8;
        return r4;
    L8:
        throw new IllegalArgumentException("Unable to convert " + r1 + " to a Bitmap");
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        this.f9291b.mo172b(r2);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r2) {
        if ((r2 instanceof C2715xe) == true) goto L5;
        return false;
    L5:
        return this.f9291b.equals(((C2715xe) r2).f9291b);
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f9291b.hashCode();
    }
}
