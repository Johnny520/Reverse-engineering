package p244u;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0379Q;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: u.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3265e implements InterfaceC3267f, InterfaceC3271h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10097a;

    /* JADX INFO: renamed from: b */
    public final float f10098b;

    public C3265e(int i5) {
        this.f10097a = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f10098b = 0;
                break;
            case 2:
                this.f10098b = 0;
                break;
            case 3:
                this.f10098b = 0;
                break;
            default:
                this.f10098b = 0;
                break;
        }
    }

    @Override // p244u.InterfaceC3267f, p244u.InterfaceC3271h
    /* JADX INFO: renamed from: a */
    public final float mo5542a() {
        switch (this.f10097a) {
        }
        return this.f10098b;
    }

    @Override // p244u.InterfaceC3267f
    /* JADX INFO: renamed from: b */
    public final void mo5511b(InterfaceC2007c interfaceC2007c, int i5, int[] iArr, EnumC2017m enumC2017m, int[] iArr2) {
        switch (this.f10097a) {
            case 0:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5543a(i5, iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5543a(i5, iArr, iArr2, false);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5546d(i5, iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5546d(i5, iArr, iArr2, false);
                }
                break;
            case 2:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5547e(i5, iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5547e(i5, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5548f(i5, iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5548f(i5, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // p244u.InterfaceC3271h
    /* JADX INFO: renamed from: c */
    public final void mo5541c(int i5, InterfaceC0379Q interfaceC0379Q, int[] iArr, int[] iArr2) {
        switch (this.f10097a) {
            case 0:
                AbstractC3273i.m5543a(i5, iArr, iArr2, false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC3273i.m5546d(i5, iArr, iArr2, false);
                break;
            case 2:
                AbstractC3273i.m5547e(i5, iArr, iArr2, false);
                break;
            default:
                AbstractC3273i.m5548f(i5, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f10097a) {
            case 0:
                return "Arrangement#Center";
            case BuildConfig.VERSION_CODE /* 1 */:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
