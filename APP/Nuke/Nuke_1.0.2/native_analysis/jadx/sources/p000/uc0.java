package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements n33 {

    /* JADX INFO: renamed from: b */
    public final n33 f11226b;

    /* JADX INFO: renamed from: c */
    public final boolean f11227c;

    public uc0(n33 n33Var, boolean z) {
        this.f11226b = n33Var;
        this.f11227c = z;
    }

    @Override // p000.n33
    /* JADX INFO: renamed from: a */
    public final d92 mo247a(Context context, d92 d92Var, int i, int i2) {
        InterfaceC0965zk interfaceC0965zk = ComponentCallbacks2C0099a.m868a(context).f1643h;
        Drawable drawable = (Drawable) d92Var.get();
        C0022al c0022alM4537W = rp0.m4537W(interfaceC0965zk, drawable, i, i2);
        if (c0022alM4537W != null) {
            d92 d92VarMo247a = this.f11226b.mo247a(context, c0022alM4537W, i, i2);
            if (!d92VarMo247a.equals(c0022alM4537W)) {
                return new C0022al(context.getResources(), d92VarMo247a);
            }
            d92VarMo247a.mo192e();
            return d92Var;
        }
        if (!this.f11227c) {
            return d92Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        this.f11226b.mo96b(messageDigest);
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof uc0) {
            return this.f11226b.equals(((uc0) obj).f11226b);
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        return this.f11226b.hashCode();
    }
}
