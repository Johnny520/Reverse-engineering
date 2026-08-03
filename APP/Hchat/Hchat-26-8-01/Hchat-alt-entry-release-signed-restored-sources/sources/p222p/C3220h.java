package p222p;

import okhttp3.HttpUrl;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p293u2.C4236f;
import p293u2.EnumC4243m;
import p308v1.InterfaceC4418p0;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3220h implements InterfaceC3217g, InterfaceC3223i {

    /* JADX INFO: renamed from: a */
    public final float f10279a;

    /* JADX INFO: renamed from: b */
    public final boolean f10280b;

    /* JADX INFO: renamed from: c */
    public final C3193a f10281c;

    /* JADX INFO: renamed from: d */
    public final float f10282d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3220h(float f3, boolean z9, C3193a c3193a) {
        this.f10279a = f3;
        this.f10280b = z9;
        this.f10281c = c3193a;
        this.f10282d = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3217g, p222p.InterfaceC3223i
    /* JADX INFO: renamed from: a */
    public final float mo6896a() {
        return this.f10282d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3217g
    /* JADX INFO: renamed from: b */
    public final void mo6870b(InterfaceC4418p0 interfaceC4418p0, int i9, int[] iArr, EnumC4243m enumC4243m, int[] iArr2) {
        int i10;
        int iRound;
        if (iArr.length == 0) {
            return;
        }
        int iMo1590G0 = interfaceC4418p0.mo1590G0(this.f10279a);
        boolean z9 = this.f10280b && enumC4243m == EnumC4243m.f13920h;
        if (z9) {
            int length = iArr.length;
            int i11 = 0;
            int iMin = 0;
            int i12 = 0;
            while (i11 < length) {
                int iMax = Math.max(0, i9 - iArr[i11]);
                iArr2[i12] = iMax;
                iMin = Math.min(iMo1590G0, iMax);
                i9 = iArr2[i12] - iMin;
                i11++;
                i12++;
            }
            i10 = i9 + iMin;
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i13 < length2) {
                int i17 = iArr[i13];
                int iMin2 = Math.min(i14, i9 - i17);
                iArr2[i16] = iMin2;
                int iMin3 = Math.min(iMo1590G0, (i9 - iMin2) - i17);
                int i18 = iArr2[i16] + i17 + iMin3;
                i13++;
                i15 = iMin3;
                i14 = i18;
                i16++;
            }
            i10 = i9 - (i14 - i15);
        }
        if (i10 > 0) {
            switch (this.f10281c.f10232g) {
                case 3:
                    iRound = Math.round((1 + 0.0f) * ((i10 + 0) / 2.0f));
                    break;
                default:
                    iRound = Math.round((1 + (enumC4243m != EnumC4243m.f13919g ? (-1.0f) * (-1) : -1.0f)) * (i10 / 2.0f));
                    break;
            }
            if (z9) {
                iRound -= i10;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i19 = 0; i19 < length3; i19++) {
                    iArr2[i19] = iArr2[i19] + iRound;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3223i
    /* JADX INFO: renamed from: c */
    public final void mo6893c(int i9, InterfaceC4418p0 interfaceC4418p0, int[] iArr, int[] iArr2) {
        mo6870b(interfaceC4418p0, i9, iArr, EnumC4243m.f13919g, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3220h)) {
            return false;
        }
        C3220h c3220h = (C3220h) obj;
        return C4236f.m8520b(this.f10279a, c3220h.f10279a) && this.f10280b == c3220h.f10280b && this.f10281c.equals(c3220h.f10281c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10281c.hashCode() + AbstractC0921a.m2245h(Float.hashCode(this.f10279a) * 31, 31, this.f10280b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10280b ? HttpUrl.FRAGMENT_ENCODE_SET : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) C4236f.m8521c(this.f10279a));
        sb2.append(", ");
        sb2.append(this.f10281c);
        sb2.append(')');
        return sb2.toString();
    }
}
