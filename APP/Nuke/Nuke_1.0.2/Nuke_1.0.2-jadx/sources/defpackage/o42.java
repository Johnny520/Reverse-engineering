package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o42 implements jh1 {
    public final Context a;
    public final jh1 b;
    public final jh1 c;
    public final Class d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o42(Context context, jh1 jh1Var, jh1 jh1Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = jh1Var;
        this.c = jh1Var2;
        this.d = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && se.N((Uri) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final ih1 b(Object obj, int i, int i2, ov1 ov1Var) {
        Uri uri = (Uri) obj;
        return new ih1(new is1(uri), new n42(this.a, this.b, this.c, uri, i, i2, ov1Var, this.d));
    }
}
