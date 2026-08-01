package p088R1;

import java.security.MessageDigest;
import p078P1.InterfaceC1144f;

/* JADX INFO: renamed from: R1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1204e implements InterfaceC1144f {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1144f f3958b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1144f f3959c;

    public C1204e(InterfaceC1144f interfaceC1144f, InterfaceC1144f interfaceC1144f2) {
        this.f3958b = interfaceC1144f;
        this.f3959c = interfaceC1144f2;
    }

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        this.f3958b.mo2199b(messageDigest);
        this.f3959c.mo2199b(messageDigest);
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1204e) {
            C1204e c1204e = (C1204e) obj;
            if (this.f3958b.equals(c1204e.f3958b) && this.f3959c.equals(c1204e.f3959c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return this.f3959c.hashCode() + (this.f3958b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f3958b + ", signature=" + this.f3959c + '}';
    }
}
