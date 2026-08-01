package p189k2;

import java.security.MessageDigest;
import p078P1.InterfaceC1144f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2452b implements InterfaceC1144f {

    /* JADX INFO: renamed from: b */
    public final Object f7916b;

    public C2452b(Object obj) {
        AbstractC2503g.m4445c(obj, "Argument must not be null");
        this.f7916b = obj;
    }

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        messageDigest.update(this.f7916b.toString().getBytes(InterfaceC1144f.f3779a));
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C2452b) {
            return this.f7916b.equals(((C2452b) obj).f7916b);
        }
        return false;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return this.f7916b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f7916b + '}';
    }
}
