package p336x3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p117i.C3059h1;

/* JADX INFO: renamed from: x3.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9415o1 {

    /* JADX INFO: renamed from: a */
    public final g f32009a;

    /* JADX INFO: renamed from: x3.o1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends g {

        /* JADX INFO: renamed from: a */
        public final Window f32010a;

        /* JADX INFO: renamed from: b */
        public final C9404l f32011b;

        public a(Window window, C9404l c9404l) {
            this.f32010a = window;
            this.f32011b = c9404l;
        }

        /* JADX INFO: renamed from: c */
        public void m36633c(int i10) {
            View decorView = this.f32010a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: d */
        public void m36634d(int i10) {
            this.f32010a.addFlags(i10);
        }

        /* JADX INFO: renamed from: e */
        public void m36635e(int i10) {
            View decorView = this.f32010a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: f */
        public void m36636f(int i10) {
            this.f32010a.clearFlags(i10);
        }
    }

    /* JADX INFO: renamed from: x3.o1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends a {
        public b(Window window, C9404l c9404l) {
            super(window, c9404l);
        }

        @Override // p336x3.C9415o1.g
        /* JADX INFO: renamed from: b */
        public void mo36637b(boolean z10) {
            if (!z10) {
                m36635e(8192);
                return;
            }
            m36636f(67108864);
            m36634d(Integer.MIN_VALUE);
            m36633c(8192);
        }
    }

    /* JADX INFO: renamed from: x3.o1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends b {
        public c(Window window, C9404l c9404l) {
            super(window, c9404l);
        }

        @Override // p336x3.C9415o1.g
        /* JADX INFO: renamed from: a */
        public void mo36638a(boolean z10) {
            if (!z10) {
                m36635e(16);
                return;
            }
            m36636f(134217728);
            m36634d(Integer.MIN_VALUE);
            m36633c(16);
        }
    }

    /* JADX INFO: renamed from: x3.o1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e extends d {
        public e(Window window, C9415o1 c9415o1, C9404l c9404l) {
            super(window, c9415o1, c9404l);
        }
    }

    /* JADX INFO: renamed from: x3.o1$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f extends e {
        public f(Window window, C9415o1 c9415o1, C9404l c9404l) {
            super(window, c9415o1, c9404l);
        }
    }

    /* JADX INFO: renamed from: x3.o1$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g {
        /* JADX INFO: renamed from: a */
        public abstract void mo36638a(boolean z10);

        /* JADX INFO: renamed from: b */
        public abstract void mo36637b(boolean z10);
    }

    public C9415o1(Window window, View view) {
        C9404l c9404l = new C9404l(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f32009a = new f(window, this, c9404l);
        } else if (i10 >= 30) {
            this.f32009a = new d(window, this, c9404l);
        } else {
            this.f32009a = new c(window, c9404l);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36631a(boolean z10) {
        this.f32009a.mo36638a(z10);
    }

    /* JADX INFO: renamed from: b */
    public void m36632b(boolean z10) {
        this.f32009a.mo36637b(z10);
    }

    /* JADX INFO: renamed from: x3.o1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends g {

        /* JADX INFO: renamed from: a */
        public final C9415o1 f32012a;

        /* JADX INFO: renamed from: b */
        public final WindowInsetsController f32013b;

        /* JADX INFO: renamed from: c */
        public final C9404l f32014c;

        /* JADX INFO: renamed from: d */
        public final C3059h1 f32015d;

        /* JADX INFO: renamed from: e */
        public Window f32016e;

        public d(WindowInsetsController windowInsetsController, C9415o1 c9415o1, C9404l c9404l) {
            this.f32015d = new C3059h1();
            this.f32013b = windowInsetsController;
            this.f32012a = c9415o1;
            this.f32014c = c9404l;
        }

        @Override // p336x3.C9415o1.g
        /* JADX INFO: renamed from: a */
        public void mo36638a(boolean z10) {
            Window window = this.f32016e;
            if (z10) {
                if (window != null) {
                    m36639c(16);
                }
                this.f32013b.setSystemBarsAppearance(16, 16);
            } else {
                if (window != null) {
                    m36640d(16);
                }
                this.f32013b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p336x3.C9415o1.g
        /* JADX INFO: renamed from: b */
        public void mo36637b(boolean z10) {
            Window window = this.f32016e;
            if (z10) {
                if (window != null) {
                    m36639c(8192);
                }
                this.f32013b.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    m36640d(8192);
                }
                this.f32013b.setSystemBarsAppearance(0, 8);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m36639c(int i10) {
            View decorView = this.f32016e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: d */
        public void m36640d(int i10) {
            View decorView = this.f32016e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(Window window, C9415o1 c9415o1, C9404l c9404l) {
            this(window.getInsetsController(), c9415o1, c9404l);
            this.f32016e = window;
        }
    }
}
