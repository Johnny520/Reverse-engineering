package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0796v3 implements kh1 {

    /* JADX INFO: renamed from: h */
    public Object f11660h;

    /* JADX INFO: renamed from: i */
    public final Object f11661i;

    public AbstractC0796v3(t11 t11Var) {
        this.f11660h = new C0205fj(this);
        this.f11661i = new C0168ej(this, t11Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo5611a(int i);

    /* JADX INFO: renamed from: b */
    public int[] m5612b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f11661i;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public String m5613c() {
        String str = (String) this.f11660h;
        if (str != null) {
            return str;
        }
        t11.m5067S("text");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m5614d() {
        return ((C0205fj) this.f11660h).f3012b && ((C0168ej) this.f11661i).f4078b;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo5005f();

    /* JADX INFO: renamed from: i */
    public abstract int[] mo5618i(int i);

    /* JADX INFO: renamed from: j */
    public void mo5619j(boolean z) {
        C0205fj c0205fj = (C0205fj) this.f11660h;
        c0205fj.f3012b = z;
        for (jt1 jt1Var : c0205fj.f3011a) {
            jt1Var.m2221f(jt1Var.f5208e && z);
        }
        ((C0168ej) this.f11661i).m2221f(z);
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        Context context = (Context) this.f11660h;
        Class cls = (Class) this.f11661i;
        return new o42(context, kj1Var.m2708g(File.class, cls), kj1Var.m2708g(Uri.class, cls), cls);
    }

    public AbstractC0796v3() {
        this.f11661i = new int[2];
    }

    public AbstractC0796v3(Context context, Class cls) {
        this.f11660h = context;
        this.f11661i = cls;
    }

    /* JADX INFO: renamed from: e */
    public void mo5615e() {
    }

    /* JADX INFO: renamed from: h */
    public void mo5617h() {
    }

    /* JADX INFO: renamed from: g */
    public void mo5616g(C0132dj c0132dj) {
    }
}
