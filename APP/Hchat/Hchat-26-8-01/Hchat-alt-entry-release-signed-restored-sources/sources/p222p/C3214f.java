package p222p;

import p293u2.EnumC4243m;
import p308v1.InterfaceC4418p0;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3214f implements InterfaceC3217g, InterfaceC3223i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10266a;

    /* JADX INFO: renamed from: b */
    public final float f10267b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3214f(int i9) {
        this.f10266a = i9;
        switch (i9) {
            case 1:
                this.f10267b = 0;
                break;
            case 2:
                this.f10267b = 0;
                break;
            case 3:
                this.f10267b = 0;
                break;
            default:
                this.f10267b = 0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3217g, p222p.InterfaceC3223i
    /* JADX INFO: renamed from: a */
    public final float mo6896a() {
        switch (this.f10266a) {
        }
        return this.f10267b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3217g
    /* JADX INFO: renamed from: b */
    public final void mo6870b(InterfaceC4418p0 interfaceC4418p0, int i9, int[] iArr, EnumC4243m enumC4243m, int[] iArr2) {
        switch (this.f10266a) {
            case 0:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6915a(i9, iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6915a(i9, iArr, iArr2, false);
                }
                break;
            case 1:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6918d(i9, iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6918d(i9, iArr, iArr2, false);
                }
                break;
            case 2:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6919e(i9, iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6919e(i9, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6920f(i9, iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6920f(i9, iArr, iArr2, false);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3223i
    /* JADX INFO: renamed from: c */
    public final void mo6893c(int i9, InterfaceC4418p0 interfaceC4418p0, int[] iArr, int[] iArr2) {
        switch (this.f10266a) {
            case 0:
                AbstractC3226j.m6915a(i9, iArr, iArr2, false);
                break;
            case 1:
                AbstractC3226j.m6918d(i9, iArr, iArr2, false);
                break;
            case 2:
                AbstractC3226j.m6919e(i9, iArr, iArr2, false);
                break;
            default:
                AbstractC3226j.m6920f(i9, iArr, iArr2, false);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f10266a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
