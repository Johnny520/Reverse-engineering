package p244u;

import p011B4.AbstractC0231b;
import p029F0.InterfaceC0379Q;
import p092S0.C1287y;
import p153e1.C2010f;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: u.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3269g implements InterfaceC3267f, InterfaceC3271h {

    /* JADX INFO: renamed from: a */
    public final float f10103a;

    /* JADX INFO: renamed from: b */
    public final C1287y f10104b;

    /* JADX INFO: renamed from: c */
    public final float f10105c;

    public C3269g(float f2, C1287y c1287y) {
        this.f10103a = f2;
        this.f10104b = c1287y;
        this.f10105c = f2;
    }

    @Override // p244u.InterfaceC3267f, p244u.InterfaceC3271h
    /* JADX INFO: renamed from: a */
    public final float mo5542a() {
        return this.f10105c;
    }

    @Override // p244u.InterfaceC3267f
    /* JADX INFO: renamed from: b */
    public final void mo5511b(InterfaceC2007c interfaceC2007c, int i5, int[] iArr, EnumC2017m enumC2017m, int[] iArr2) {
        int i6;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iMo270S = interfaceC2007c.mo270S(this.f10103a);
        boolean z5 = enumC2017m == EnumC2017m.f6743e;
        C3259b c3259b = AbstractC3273i.f10110a;
        if (z5) {
            i6 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i7 = iArr[length];
                int iMin2 = Math.min(i6, i5 - i7);
                iArr2[length] = iMin2;
                iMin = Math.min(iMo270S, (i5 - iMin2) - i7);
                i6 = iArr2[length] + i7 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i8 = 0;
            i6 = 0;
            iMin = 0;
            int i9 = 0;
            while (i8 < length2) {
                int i10 = iArr[i8];
                int iMin3 = Math.min(i6, i5 - i10);
                iArr2[i9] = iMin3;
                int iMin4 = Math.min(iMo270S, (i5 - iMin3) - i10);
                int i11 = iArr2[i9] + i10 + iMin4;
                i8++;
                iMin = iMin4;
                i6 = i11;
                i9++;
            }
        }
        int i12 = i6 - iMin;
        if (i12 < i5) {
            int iIntValue = ((Number) this.f10104b.mo0g(Integer.valueOf(i5 - i12), enumC2017m)).intValue();
            int length3 = iArr2.length;
            for (int i13 = 0; i13 < length3; i13++) {
                iArr2[i13] = iArr2[i13] + iIntValue;
            }
        }
    }

    @Override // p244u.InterfaceC3271h
    /* JADX INFO: renamed from: c */
    public final void mo5541c(int i5, InterfaceC0379Q interfaceC0379Q, int[] iArr, int[] iArr2) {
        mo5511b(interfaceC0379Q, i5, iArr, EnumC2017m.f6742d, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3269g)) {
            return false;
        }
        C3269g c3269g = (C3269g) obj;
        return C2010f.m3696b(this.f10103a, c3269g.f10103a) && this.f10104b.equals(c3269g.f10104b);
    }

    public final int hashCode() {
        return this.f10104b.hashCode() + AbstractC0231b.m395f(Float.hashCode(this.f10103a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) C2010f.m3697c(this.f10103a)) + ", " + this.f10104b + ')';
    }
}
