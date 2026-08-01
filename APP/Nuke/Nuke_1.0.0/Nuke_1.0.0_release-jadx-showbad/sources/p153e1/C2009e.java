package p153e1;

import com.bumptech.glide.AbstractC1926h;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p159f1.InterfaceC2095a;

/* JADX INFO: renamed from: e1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2009e implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public final float f6729d;

    /* JADX INFO: renamed from: e */
    public final float f6730e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2095a f6731f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2009e(float f2, float f5, InterfaceC2095a interfaceC2095a) {
        this.f6729d = f2;
        this.f6730e = f5;
        this.f6731f = interfaceC2095a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return AbstractC1926h.m3582y(this.f6731f.mo3706a(f2), 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        if (C2020p.m3712a(C2019o.m3709b(j5), 4294967296L)) {
            return this.f6731f.mo3707b(C2019o.m3710c(j5));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f6729d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2009e)) {
            return false;
        }
        C2009e c2009e = (C2009e) obj;
        return Float.compare(this.f6729d, c2009e.f6729d) == 0 && Float.compare(this.f6730e, c2009e.f6730e) == 0 && AbstractC1665j.m2981a(this.f6731f, c2009e.f6731f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6731f.hashCode() + AbstractC0231b.m390a(this.f6730e, Float.hashCode(this.f6729d) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f6730e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DensityWithConverter(density=" + this.f6729d + ", fontScale=" + this.f6730e + ", converter=" + this.f6731f + ')';
    }
}
