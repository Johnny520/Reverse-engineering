package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: Yue.ۥۢۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8514 {

    /* JADX INFO: renamed from: ۥ۟ */
    @Deprecated
    public static final int f3530 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f25343 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f25344 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f25345 = 2;

    /* JADX INFO: renamed from: ۥ */
    public final C8517 f3531;

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ */
    @InterfaceC7113(20)
    public static class C1545 extends C8517 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final Window f3532;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final C7494 f3533;

        public C1545(@InterfaceC6391 Window window, @InterfaceC6391 C7494 c7494) {
            this.f3532 = window;
            this.f3533 = c7494;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ */
        public void mo4506(InterfaceC8518 interfaceC8518) {
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4507(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, InterfaceC8460 interfaceC8460) {
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo28373() {
            return 0;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo28374(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m28378(i2);
                }
            }
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo28375(@InterfaceC6391 InterfaceC8518 interfaceC8518) {
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo28376(int i) {
            if (i == 0) {
                m28382(6144);
                return;
            }
            if (i == 1) {
                m28382(4096);
                m28379(2048);
            } else {
                if (i != 2) {
                    return;
                }
                m28382(2048);
                m28379(4096);
            }
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo28377(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m28381(i2);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m28378(int i) {
            if (i == 1) {
                m28379(4);
            } else if (i == 2) {
                m28379(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f3533.m3687();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m28379(int i) {
            View decorView = this.f3532.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m28380(int i) {
            this.f3532.addFlags(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m28381(int i) {
            if (i == 1) {
                m28382(4);
                m28383(1024);
            } else if (i == 2) {
                m28382(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f3533.m3688();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m28382(int i) {
            View decorView = this.f3532.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void m28383(int i) {
            this.f3532.clearFlags(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C1546 extends C1545 {
        public C1546(@InterfaceC6391 Window window, @InterfaceC6391 C7494 c7494) {
            super(window, c7494);
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo28384() {
            return (this.f3532.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo28385(boolean z) {
            if (!z) {
                m28382(8192);
                return;
            }
            m28383(67108864);
            m28380(Integer.MIN_VALUE);
            m28379(8192);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C8515 extends C1546 {
        public C8515(@InterfaceC6391 Window window, @InterfaceC6391 C7494 c7494) {
            super(window, c7494);
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo28386() {
            return (this.f3532.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo28387(boolean z) {
            if (!z) {
                m28382(16);
                return;
            }
            m28383(134217728);
            m28380(Integer.MIN_VALUE);
            m28379(16);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8517 {
        /* JADX INFO: renamed from: ۥ */
        public void mo4506(InterfaceC8518 interfaceC8518) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4507(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, InterfaceC8460 interfaceC8460) {
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo28373() {
            return 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo28374(int i) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo28386() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo28384() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28375(@InterfaceC6391 InterfaceC8518 interfaceC8518) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo28387(boolean z) {
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo28385(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28376(int i) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo28377(int i) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC8518 {
        /* JADX INFO: renamed from: ۥ */
        void m4508(@InterfaceC6391 C8514 c8514, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7113(30)
    @Deprecated
    public C8514(@InterfaceC6391 WindowInsetsController windowInsetsController) {
        this.f3531 = new C8516(windowInsetsController, this, new C7494(windowInsetsController));
    }

    @InterfaceC6391
    @InterfaceC7113(30)
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static C8514 m28363(@InterfaceC6391 WindowInsetsController windowInsetsController) {
        return new C8514(windowInsetsController);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4504(@InterfaceC6391 InterfaceC8518 interfaceC8518) {
        this.f3531.mo4506(interfaceC8518);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4505(int i, long j, @InterfaceC6490 Interpolator interpolator, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 InterfaceC8460 interfaceC8460) {
        this.f3531.mo4507(i, j, interpolator, cancellationSignal, interfaceC8460);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m28364() {
        return this.f3531.mo28373();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28365(int i) {
        this.f3531.mo28374(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m28366() {
        return this.f3531.mo28386();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m28367() {
        return this.f3531.mo28384();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m28368(@InterfaceC6391 InterfaceC8518 interfaceC8518) {
        this.f3531.mo28375(interfaceC8518);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28369(boolean z) {
        this.f3531.mo28387(z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28370(boolean z) {
        this.f3531.mo28385(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28371(int i) {
        this.f3531.mo28376(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28372(int i) {
        this.f3531.mo28377(i);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8516 extends C8517 {

        /* JADX INFO: renamed from: ۥ */
        public final C8514 f3534;

        /* JADX INFO: renamed from: ۥ۟ */
        public final WindowInsetsController f3535;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C7494 f25346;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C7467<InterfaceC8518, WindowInsetsController.OnControllableInsetsChangedListener> f25347;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Window f25348;

        /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟$ۥ */
        public class WindowInsetsAnimationControlListenerC1547 implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: ۥ */
            public C8471 f3536 = null;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ InterfaceC8460 f3537;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public WindowInsetsAnimationControlListenerC1547(InterfaceC8460 interfaceC8460) {
                this.f3537 = interfaceC8460;
            }

            public void onCancelled(@InterfaceC6490 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f3537.m28257(windowInsetsAnimationController == null ? null : this.f3536);
            }

            public void onFinished(@InterfaceC6391 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f3537.m4448(this.f3536);
            }

            public void onReady(@InterfaceC6391 WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                C8471 c8471 = new C8471(windowInsetsAnimationController);
                this.f3536 = c8471;
                this.f3537.m4447(c8471, i);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8516(@InterfaceC6391 Window window, @InterfaceC6391 C8514 c8514, @InterfaceC6391 C7494 c7494) {
            this(window.getInsetsController(), c8514, c7494);
            this.f25348 = window;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ */
        public void mo4506(@InterfaceC6391 final InterfaceC8518 interfaceC8518) {
            if (this.f25347.containsKey(interfaceC8518)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: Yue.ۥۢۦ۟ۢ
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    this.f3538.m28389(interfaceC8518, windowInsetsController, i);
                }
            };
            this.f25347.put(interfaceC8518, onControllableInsetsChangedListener);
            this.f3535.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4507(int i, long j, @InterfaceC6490 Interpolator interpolator, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 InterfaceC8460 interfaceC8460) {
            this.f3535.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new WindowInsetsAnimationControlListenerC1547(interfaceC8460));
        }

        @Override // Yue.C8514.C8517
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo28373() {
            return this.f3535.getSystemBarsBehavior();
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo28374(int i) {
            if ((i & 8) != 0) {
                this.f25346.m3687();
            }
            this.f3535.hide(i & (-9));
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo28386() {
            this.f3535.setSystemBarsAppearance(0, 0);
            return (this.f3535.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo28384() {
            this.f3535.setSystemBarsAppearance(0, 0);
            return (this.f3535.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28375(@InterfaceC6391 InterfaceC8518 interfaceC8518) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM4514 = C8524.m4514(this.f25347.remove(interfaceC8518));
            if (onControllableInsetsChangedListenerM4514 != null) {
                this.f3535.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM4514);
            }
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo28387(boolean z) {
            if (z) {
                if (this.f25348 != null) {
                    m28390(16);
                }
                this.f3535.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f25348 != null) {
                    m28391(16);
                }
                this.f3535.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo28385(boolean z) {
            if (z) {
                if (this.f25348 != null) {
                    m28390(8192);
                }
                this.f3535.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f25348 != null) {
                    m28391(8192);
                }
                this.f3535.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28376(int i) {
            this.f3535.setSystemBarsBehavior(i);
        }

        @Override // Yue.C8514.C8517
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo28377(int i) {
            if ((i & 8) != 0) {
                this.f25346.m3688();
            }
            this.f3535.show(i & (-9));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final /* synthetic */ void m28389(InterfaceC8518 interfaceC8518, WindowInsetsController windowInsetsController, int i) {
            if (this.f3535 == windowInsetsController) {
                interfaceC8518.m4508(this.f3534, i);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m28390(int i) {
            View decorView = this.f25348.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void m28391(int i) {
            View decorView = this.f25348.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C8516(@InterfaceC6391 WindowInsetsController windowInsetsController, @InterfaceC6391 C8514 c8514, @InterfaceC6391 C7494 c7494) {
            this.f25347 = new C7467<>();
            this.f3535 = windowInsetsController;
            this.f3534 = c8514;
            this.f25346 = c7494;
        }
    }

    public C8514(@InterfaceC6391 Window window, @InterfaceC6391 View view) {
        C7494 c7494 = new C7494(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3531 = new C8516(window, this, c7494);
        } else {
            this.f3531 = new C8515(window, c7494);
        }
    }
}
