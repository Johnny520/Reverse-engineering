package p244u;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p153e1.C2010f;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.O */
/* JADX INFO: loaded from: classes.dex */
final class C3246O extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f10048a;

    /* JADX INFO: renamed from: b */
    public final float f10049b;

    public C3246O(float f2, float f5) {
        this.f10048a = f2;
        this.f10049b = f5;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3247P c3247p = new C3247P();
        c3247p.f10050r = this.f10048a;
        c3247p.f10051s = this.f10049b;
        c3247p.f10052t = true;
        return c3247p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3246O c3246o = obj instanceof C3246O ? (C3246O) obj : null;
        return c3246o != null && C2010f.m3696b(this.f10048a, c3246o.f10048a) && C2010f.m3696b(this.f10049b, c3246o.f10049b);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3247P c3247p = (C3247P) abstractC2206o;
        float f2 = c3247p.f10050r;
        float f5 = this.f10048a;
        boolean zM3696b = C2010f.m3696b(f2, f5);
        float f6 = this.f10049b;
        if (!zM3696b || !C2010f.m3696b(c3247p.f10051s, f6) || !c3247p.f10052t) {
            AbstractC0601k.m1044t(c3247p).m812U(false);
        }
        c3247p.f10050r = f5;
        c3247p.f10051s = f6;
        c3247p.f10052t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0231b.m390a(this.f10049b, Float.hashCode(this.f10048a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) C2010f.m3697c(this.f10048a)) + ", y=" + ((Object) C2010f.m3697c(this.f10049b)) + ", rtlAware=true)";
    }
}
