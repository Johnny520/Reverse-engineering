package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements n33 {

    /* JADX INFO: renamed from: b */
    public final n33 f318b;

    public ap0(n33 n33Var) {
        fg1.m1642q("Argument must not be null", n33Var);
        this.f318b = n33Var;
    }

    @Override // p000.n33
    /* JADX INFO: renamed from: a */
    public final d92 mo247a(Context context, d92 d92Var, int i, int i2) {
        yo0 yo0Var = (yo0) d92Var.get();
        C0022al c0022al = new C0022al(ComponentCallbacks2C0099a.m868a(context).f1643h, yo0Var.f13536h.f13087a.f2543l);
        n33 n33Var = this.f318b;
        d92 d92VarMo247a = n33Var.mo247a(context, c0022al, i, i2);
        if (c0022al != d92VarMo247a) {
            c0022al.mo192e();
        }
        yo0Var.f13536h.f13087a.m1402c(n33Var, (Bitmap) d92VarMo247a.get());
        return d92Var;
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        this.f318b.mo96b(messageDigest);
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof ap0) {
            return this.f318b.equals(((ap0) obj).f318b);
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        return this.f318b.hashCode();
    }
}
