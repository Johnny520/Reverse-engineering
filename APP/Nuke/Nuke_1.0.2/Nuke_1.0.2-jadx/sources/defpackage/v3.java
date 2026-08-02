package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v3 implements kh1 {
    public Object h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v3(t11 t11Var) {
        this.h = new fj(this);
        this.i = new ej(this, t11Var);
    }

    public abstract int[] a(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.i;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String c() {
        String str = (String) this.h;
        if (str != null) {
            return str;
        }
        t11.S("text");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d() {
        return ((fj) this.h).b && ((ej) this.i).b;
    }

    public abstract void f();

    public abstract int[] i(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(boolean z) {
        fj fjVar = (fj) this.h;
        fjVar.b = z;
        for (jt1 jt1Var : fjVar.a) {
            jt1Var.f(jt1Var.e && z);
        }
        ((ej) this.i).f(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        Context context = (Context) this.h;
        Class cls = (Class) this.i;
        return new o42(context, kj1Var.g(File.class, cls), kj1Var.g(Uri.class, cls), cls);
    }

    public v3() {
        this.i = new int[2];
    }

    public v3(Context context, Class cls) {
        this.h = context;
        this.i = cls;
    }

    public void e() {
    }

    public void h() {
    }

    public void g(dj djVar) {
    }
}
