package Yue;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: renamed from: Yue.ۥۢۥۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8471 {

    /* JADX INFO: renamed from: ۥ */
    public final C1541 f3517;

    /* JADX INFO: renamed from: Yue.ۥۢۥۥۨ$ۥ */
    @InterfaceC7113(30)
    public static class C1540 extends C1541 {

        /* JADX INFO: renamed from: ۥ */
        public final WindowInsetsAnimationController f3518;

        public C1540(@InterfaceC6391 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f3518 = windowInsetsAnimationController;
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥ */
        public void mo4461(boolean z) {
            this.f3518.finish(z);
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo4462() {
            return this.f3518.getCurrentAlpha();
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float mo28267() {
            return this.f3518.getCurrentFraction();
        }

        @Override // Yue.C8471.C1541
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C5450 mo28268() {
            return C5450.m16961(this.f3518.getCurrentInsets());
        }

        @Override // Yue.C8471.C1541
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C5450 mo28269() {
            return C5450.m16961(this.f3518.getHiddenStateInsets());
        }

        @Override // Yue.C8471.C1541
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C5450 mo28270() {
            return C5450.m16961(this.f3518.getShownStateInsets());
        }

        @Override // Yue.C8471.C1541
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int mo28271() {
            return this.f3518.getTypes();
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean mo28272() {
            return this.f3518.isCancelled();
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean mo28273() {
            return this.f3518.isFinished();
        }

        @Override // Yue.C8471.C1541
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo28274(@InterfaceC6490 C5450 c5450, float f, float f2) {
            this.f3518.setInsetsAndAlpha(c5450 == null ? null : c5450.m16963(), f, f2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۥۨ$ۥ۟ */
    public static class C1541 {
        /* JADX INFO: renamed from: ۥ */
        public void mo4461(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public float mo4462() {
            return 0.0f;
        }

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        /* JADX INFO: renamed from: ۥ۟۟ */
        public float mo28267() {
            return 0.0f;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public C5450 mo28268() {
            return C5450.f13398;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public C5450 mo28269() {
            return C5450.f13398;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public C5450 mo28270() {
            return C5450.f13398;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo28271() {
            return 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public boolean mo28272() {
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public boolean mo28273() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28274(@InterfaceC6490 C5450 c5450, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f2) {
        }
    }

    @InterfaceC7113(30)
    public C8471(@InterfaceC6391 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f3517 = new C1540(windowInsetsAnimationController);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4459(boolean z) {
        this.f3517.mo4461(z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m4460() {
        return this.f3517.mo4462();
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m28258() {
        return this.f3517.mo28267();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C5450 m28259() {
        return this.f3517.mo28268();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C5450 m28260() {
        return this.f3517.mo28269();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C5450 m28261() {
        return this.f3517.mo28270();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m28262() {
        return this.f3517.mo28271();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m28263() {
        return this.f3517.mo28272();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m28264() {
        return this.f3517.mo28273();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m28265() {
        return (m28264() || m28263()) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28266(@InterfaceC6490 C5450 c5450, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f2) {
        this.f3517.mo28274(c5450, f, f2);
    }
}
