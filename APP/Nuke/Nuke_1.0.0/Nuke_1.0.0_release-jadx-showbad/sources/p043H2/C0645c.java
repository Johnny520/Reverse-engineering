package p043H2;

import android.graphics.Path;
import com.bumptech.glide.AbstractC1926h;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p211o0.AbstractC2752k;
import p211o0.AbstractC2767z;
import p211o0.C2731F;
import p211o0.C2750i;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: H2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0645c implements InterfaceC2738M {

    /* JADX INFO: renamed from: a */
    public final float f2055a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0645c(float f2) {
        this.f2055a = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p211o0.InterfaceC2738M
    /* JADX INFO: renamed from: a */
    public final AbstractC2767z mo1116a(long j5, EnumC2017m enumC2017m, InterfaceC2007c interfaceC2007c) {
        AbstractC1665j.m2985e(enumC2017m, "layoutDirection");
        AbstractC1665j.m2985e(interfaceC2007c, "density");
        float fMo268G = interfaceC2007c.mo268G(this.f2055a);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float fM3567j = AbstractC1926h.m3567j(1.35f, 1.0f, 1.6f);
        float fM3567j2 = AbstractC1926h.m3567j(fMo268G, 0.0f, Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f);
        C2750i c2750iM4885a = AbstractC2752k.m4885a();
        Path path = c2750iM4885a.f8742a;
        float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f;
        float f2 = fM3567j2 * fM3567j;
        float f5 = f2 > fMin ? fMin : f2;
        float f6 = (((fM3567j - 1.0f) * 0.18f) + 0.52f) * fM3567j2;
        float f7 = f6 > f5 ? f5 : f6;
        path.moveTo(f5, 0.0f);
        float f8 = fIntBitsToFloat - f5;
        c2750iM4885a.m4881e(f8, 0.0f);
        float f9 = fIntBitsToFloat - f7;
        c2750iM4885a.m4879c(f9, 0.0f, fIntBitsToFloat, f7, fIntBitsToFloat, f5);
        float f10 = f5;
        float f11 = fIntBitsToFloat2 - f10;
        c2750iM4885a.m4881e(fIntBitsToFloat, f11);
        float f12 = fIntBitsToFloat2 - f7;
        c2750iM4885a.m4879c(fIntBitsToFloat, f12, f9, fIntBitsToFloat2, f8, fIntBitsToFloat2);
        c2750iM4885a.m4881e(f10, fIntBitsToFloat2);
        c2750iM4885a.m4879c(f7, fIntBitsToFloat2, 0.0f, f12, 0.0f, f11);
        c2750iM4885a.m4881e(0.0f, f10);
        c2750iM4885a.m4879c(0.0f, f7, f7, 0.0f, f10, 0.0f);
        path.close();
        return new C2731F(c2750iM4885a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0645c) && C2010f.m3696b(this.f2055a, ((C0645c) obj).f2055a) && Float.compare(1.35f, 1.35f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.35f) + (Float.hashCode(this.f2055a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m400k("NukeSquircleShape(radius=", C2010f.m3697c(this.f2055a), ", smoothness=1.35)");
    }
}
