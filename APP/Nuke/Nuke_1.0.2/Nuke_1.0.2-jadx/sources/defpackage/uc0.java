package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements n33 {
    public final n33 b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uc0(n33 n33Var, boolean z) {
        this.b = n33Var;
        this.c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n33
    public final d92 a(Context context, d92 d92Var, int i, int i2) {
        zk zkVar = a.a(context).h;
        Drawable drawable = (Drawable) d92Var.get();
        al alVarW = rp0.W(zkVar, drawable, i, i2);
        if (alVarW != null) {
            d92 d92VarA = this.b.a(context, alVarW, i, i2);
            if (!d92VarA.equals(alVarW)) {
                return new al(context.getResources(), d92VarA);
            }
            d92VarA.e();
            return d92Var;
        }
        if (!this.c) {
            return d92Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        if (obj instanceof uc0) {
            return this.b.equals(((uc0) obj).b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        return this.b.hashCode();
    }
}
