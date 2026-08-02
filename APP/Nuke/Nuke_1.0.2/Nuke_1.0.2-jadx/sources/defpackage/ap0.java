package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements n33 {
    public final n33 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ap0(n33 n33Var) {
        fg1.q("Argument must not be null", n33Var);
        this.b = n33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n33
    public final d92 a(Context context, d92 d92Var, int i, int i2) {
        yo0 yo0Var = (yo0) d92Var.get();
        al alVar = new al(a.a(context).h, yo0Var.h.a.l);
        n33 n33Var = this.b;
        d92 d92VarA = n33Var.a(context, alVar, i, i2);
        if (alVar != d92VarA) {
            alVar.e();
        }
        yo0Var.h.a.c(n33Var, (Bitmap) d92VarA.get());
        return d92Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        if (obj instanceof ap0) {
            return this.b.equals(((ap0) obj).b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        return this.b.hashCode();
    }
}
