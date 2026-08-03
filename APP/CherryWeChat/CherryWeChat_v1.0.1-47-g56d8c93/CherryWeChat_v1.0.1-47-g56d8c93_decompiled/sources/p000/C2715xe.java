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

    public C2715xe(InterfaceC0098CB interfaceC0098CB, boolean z) {
        this.f9291b = interfaceC0098CB;
        this.f9292c = z;
    }

    @Override // p000.InterfaceC0098CB
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo145a(Context context, InterfaceC2389pw interfaceC2389pw, int i, int i2) {
        InterfaceC0565N5 interfaceC0565N5 = ComponentCallbacks2C1273a.m2412a(context).f4337a;
        Drawable drawable = (Drawable) interfaceC2389pw.get();
        C0608O5 c0608o5M271e = AbstractC0148Dc.m271e(interfaceC0565N5, drawable, i, i2);
        if (c0608o5M271e != null) {
            InterfaceC2389pw interfaceC2389pwMo145a = this.f9291b.mo145a(context, c0608o5M271e, i, i2);
            if (!interfaceC2389pwMo145a.equals(c0608o5M271e)) {
                return new C0608O5(context.getResources(), interfaceC2389pwMo145a);
            }
            interfaceC2389pwMo145a.mo118e();
            return interfaceC2389pw;
        }
        if (!this.f9292c) {
            return interfaceC2389pw;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        this.f9291b.mo172b(messageDigest);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C2715xe) {
            return this.f9291b.equals(((C2715xe) obj).f9291b);
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f9291b.hashCode();
    }
}
