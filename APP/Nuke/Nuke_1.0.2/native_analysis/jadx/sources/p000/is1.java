package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 implements a51 {

    /* JADX INFO: renamed from: b */
    public final Object f4772b;

    public is1(Object obj) {
        fg1.m1642q("Argument must not be null", obj);
        this.f4772b = obj;
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        messageDigest.update(this.f4772b.toString().getBytes(a51.f64a));
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof is1) {
            return this.f4772b.equals(((is1) obj).f4772b);
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        return this.f4772b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4772b + '}';
    }
}
