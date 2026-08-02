package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 implements a51 {

    /* JADX INFO: renamed from: b */
    public final C0663ro f7858b = new C0663ro(0);

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0663ro c0663ro = this.f7858b;
            if (i >= c0663ro.f11446j) {
                return;
            }
            mv1 mv1Var = (mv1) c0663ro.m5569f(i);
            Object objM5570j = this.f7858b.m5570j(i);
            lv1 lv1Var = mv1Var.f6897b;
            if (mv1Var.f6899d == null) {
                mv1Var.f6899d = mv1Var.f6898c.getBytes(a51.f64a);
            }
            lv1Var.mo2275a(mv1Var.f6899d, objM5570j, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m3643c(mv1 mv1Var) {
        C0663ro c0663ro = this.f7858b;
        return c0663ro.containsKey(mv1Var) ? c0663ro.get(mv1Var) : mv1Var.f6896a;
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof ov1) {
            return this.f7858b.equals(((ov1) obj).f7858b);
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        return this.f7858b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f7858b + '}';
    }
}
