package p336x3;

import ae.C0306e;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p215oc.C5725t;
import p252r3.C6475f;
import p320w3.AbstractC9169b;
import p320w3.AbstractC9170c;
import p376zd.C9987e;

/* JADX INFO: renamed from: x3.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9408m0 {

    /* JADX INFO: renamed from: b */
    public static final C9408m0 f31978b;

    /* JADX INFO: renamed from: a */
    public final m f31979a;

    /* JADX INFO: renamed from: x3.m0$n */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class n {
        /* JADX INFO: renamed from: a */
        public static int m36612a() {
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static int m36613b() {
            return 4;
        }

        /* JADX INFO: renamed from: c */
        public static int m36614c() {
            return 128;
        }

        /* JADX INFO: renamed from: d */
        public static int m36615d() {
            return 8;
        }

        /* JADX INFO: renamed from: e */
        public static int m36616e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            C0306e.m922a("type needs to be >= FIRST and <= LAST, type=", i10);
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public static int m36617f() {
            return 32;
        }

        /* JADX INFO: renamed from: g */
        public static int m36618g() {
            return 2;
        }

        /* JADX INFO: renamed from: h */
        public static int m36619h() {
            return 1;
        }

        /* JADX INFO: renamed from: i */
        public static int m36620i() {
            return 519;
        }

        /* JADX INFO: renamed from: j */
        public static int m36621j() {
            return 16;
        }

        /* JADX INFO: renamed from: k */
        public static int m36622k() {
            return 64;
        }
    }

    /* JADX INFO: renamed from: x3.m0$o */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class o {
        /* JADX INFO: renamed from: a */
        public static int m36623a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: renamed from: x3.m0$p */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class p {
        /* JADX INFO: renamed from: a */
        public static int m36624a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f31978b = l.f32006s;
        } else if (i10 >= 30) {
            f31978b = k.f32005r;
        } else {
            f31978b = m.f32007b;
        }
    }

    public C9408m0(C9408m0 c9408m0) {
        if (c9408m0 == null) {
            this.f31979a = new m(this);
            return;
        }
        m mVar = c9408m0.f31979a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && (mVar instanceof l)) {
            this.f31979a = new l(this, (l) mVar);
        } else if (i10 >= 30 && (mVar instanceof k)) {
            this.f31979a = new k(this, (k) mVar);
        } else if (i10 >= 29 && (mVar instanceof j)) {
            this.f31979a = new j(this, (j) mVar);
        } else if (i10 >= 28 && (mVar instanceof i)) {
            this.f31979a = new i(this, (i) mVar);
        } else if (mVar instanceof h) {
            this.f31979a = new h(this, (h) mVar);
        } else if (mVar instanceof g) {
            this.f31979a = new g(this, (g) mVar);
        } else {
            this.f31979a = new m(this);
        }
        mVar.mo36590e(this);
    }

    /* JADX INFO: renamed from: k */
    public static C6475f m36550k(C6475f c6475f, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, c6475f.f20347a - i10);
        int iMax2 = Math.max(0, c6475f.f20348b - i11);
        int iMax3 = Math.max(0, c6475f.f20349c - i12);
        int iMax4 = Math.max(0, c6475f.f20350d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? c6475f : C6475f.m25652b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: s */
    public static C9408m0 m36551s(WindowInsets windowInsets) {
        return m36552t(windowInsets, null);
    }

    /* JADX INFO: renamed from: t */
    public static C9408m0 m36552t(WindowInsets windowInsets, View view) {
        C9408m0 c9408m0 = new C9408m0((WindowInsets) AbstractC9170c.m35614c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c9408m0.m36566o(AbstractC9428u.m36657g(view));
            c9408m0.m36556d(view.getRootView());
            c9408m0.m36568q(view.getWindowSystemUiVisibility());
        }
        return c9408m0;
    }

    /* JADX INFO: renamed from: a */
    public C9408m0 m36553a() {
        return this.f31979a.mo36607a();
    }

    /* JADX INFO: renamed from: b */
    public C9408m0 m36554b() {
        return this.f31979a.mo36602b();
    }

    /* JADX INFO: renamed from: c */
    public C9408m0 m36555c() {
        return this.f31979a.mo36603c();
    }

    /* JADX INFO: renamed from: d */
    public void m36556d(View view) {
        this.f31979a.mo36589d(view);
    }

    /* JADX INFO: renamed from: e */
    public C9377c m36557e() {
        return this.f31979a.mo36608f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9408m0) {
            return AbstractC9169b.m35610a(this.f31979a, ((C9408m0) obj).f31979a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C6475f m36558f(int i10) {
        return this.f31979a.mo36591g(i10);
    }

    /* JADX INFO: renamed from: g */
    public C6475f m36559g(int i10) {
        return this.f31979a.mo36592h(i10);
    }

    /* JADX INFO: renamed from: h */
    public C6475f m36560h() {
        return this.f31979a.mo36604j();
    }

    public int hashCode() {
        m mVar = this.f31979a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m36561i() {
        C6475f c6475fM36558f = m36558f(n.m36612a());
        C6475f c6475f = C6475f.f20346e;
        return (c6475fM36558f.equals(c6475f) && m36559g(n.m36612a() ^ n.m36615d()).equals(c6475f) && m36557e() == null) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public C9408m0 m36562j(int i10, int i11, int i12, int i13) {
        return this.f31979a.mo36594n(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: l */
    public boolean m36563l(int i10) {
        return this.f31979a.mo36596q(i10);
    }

    /* JADX INFO: renamed from: m */
    public void m36564m(C6475f[] c6475fArr) {
        this.f31979a.mo36597r(c6475fArr);
    }

    /* JADX INFO: renamed from: n */
    public void m36565n(C6475f c6475f) {
        this.f31979a.mo36598s(c6475f);
    }

    /* JADX INFO: renamed from: o */
    public void m36566o(C9408m0 c9408m0) {
        this.f31979a.mo36599t(c9408m0);
    }

    /* JADX INFO: renamed from: p */
    public void m36567p(C6475f c6475f) {
        this.f31979a.mo36606u(c6475f);
    }

    /* JADX INFO: renamed from: q */
    public void m36568q(int i10) {
        this.f31979a.mo36600v(i10);
    }

    /* JADX INFO: renamed from: r */
    public WindowInsets m36569r() {
        m mVar = this.f31979a;
        if (mVar instanceof g) {
            return ((g) mVar).f31995c;
        }
        return null;
    }

    /* JADX INFO: renamed from: x3.m0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends c {
        public d() {
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: c */
        public void mo36581c(int i10, C6475f c6475f) {
            this.f31987c.setInsets(o.m36623a(i10), c6475f.m25655e());
        }

        public d(C9408m0 c9408m0) {
            super(c9408m0);
        }
    }

    /* JADX INFO: renamed from: x3.m0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e extends d {
        public e() {
        }

        @Override // p336x3.C9408m0.d, p336x3.C9408m0.f
        /* JADX INFO: renamed from: c */
        public void mo36581c(int i10, C6475f c6475f) {
            this.f31987c.setInsets(p.m36624a(i10), c6475f.m25655e());
        }

        public e(C9408m0 c9408m0) {
            super(c9408m0);
        }
    }

    /* JADX INFO: renamed from: x3.m0$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class i extends h {
        public i(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0, windowInsets);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: a */
        public C9408m0 mo36607a() {
            return C9408m0.m36551s(this.f31995c.consumeDisplayCutout());
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f31995c, iVar.f31995c) && Objects.equals(this.f31999g, iVar.f31999g) && g.m36584C(this.f32000h, iVar.f32000h);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: f */
        public C9377c mo36608f() {
            return C9377c.m36496g(this.f31995c.getDisplayCutout());
        }

        @Override // p336x3.C9408m0.m
        public int hashCode() {
            return this.f31995c.hashCode();
        }

        public i(C9408m0 c9408m0, i iVar) {
            super(c9408m0, iVar);
        }
    }

    /* JADX INFO: renamed from: x3.m0$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class k extends j {

        /* JADX INFO: renamed from: r */
        public static final C9408m0 f32005r = C9408m0.m36551s(WindowInsets.CONSUMED);

        public k(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0, windowInsets);
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: g */
        public C6475f mo36591g(int i10) {
            return C6475f.m25654d(this.f31995c.getInsets(o.m36623a(i10)));
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: h */
        public C6475f mo36592h(int i10) {
            return C6475f.m25654d(this.f31995c.getInsetsIgnoringVisibility(o.m36623a(i10)));
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: q */
        public boolean mo36596q(int i10) {
            return this.f31995c.isVisible(o.m36623a(i10));
        }

        public k(C9408m0 c9408m0, k kVar) {
            super(c9408m0, kVar);
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: d */
        public final void mo36589d(View view) {
        }
    }

    /* JADX INFO: renamed from: x3.m0$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class l extends k {

        /* JADX INFO: renamed from: s */
        public static final C9408m0 f32006s = C9408m0.m36551s(WindowInsets.CONSUMED);

        public l(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0, windowInsets);
        }

        @Override // p336x3.C9408m0.k, p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: g */
        public C6475f mo36591g(int i10) {
            return C6475f.m25654d(this.f31995c.getInsets(p.m36624a(i10)));
        }

        @Override // p336x3.C9408m0.k, p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: h */
        public C6475f mo36592h(int i10) {
            return C6475f.m25654d(this.f31995c.getInsetsIgnoringVisibility(p.m36624a(i10)));
        }

        @Override // p336x3.C9408m0.k, p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: q */
        public boolean mo36596q(int i10) {
            return this.f31995c.isVisible(p.m36624a(i10));
        }

        public l(C9408m0 c9408m0, l lVar) {
            super(c9408m0, lVar);
        }
    }

    /* JADX INFO: renamed from: x3.m0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends f {

        /* JADX INFO: renamed from: e */
        public static Field f31981e;

        /* JADX INFO: renamed from: f */
        public static boolean f31982f;

        /* JADX INFO: renamed from: g */
        public static Constructor f31983g;

        /* JADX INFO: renamed from: h */
        public static boolean f31984h;

        /* JADX INFO: renamed from: c */
        public WindowInsets f31985c;

        /* JADX INFO: renamed from: d */
        public C6475f f31986d;

        public b() {
            this.f31985c = m36574i();
        }

        /* JADX INFO: renamed from: i */
        private static WindowInsets m36574i() {
            if (!f31982f) {
                try {
                    f31981e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f31982f = true;
            }
            Field field = f31981e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f31984h) {
                try {
                    f31983g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f31984h = true;
            }
            Constructor constructor = f31983g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: b */
        public C9408m0 mo36575b() {
            m36582a();
            C9408m0 c9408m0M36551s = C9408m0.m36551s(this.f31985c);
            c9408m0M36551s.m36564m(this.f31989b);
            c9408m0M36551s.m36567p(this.f31986d);
            return c9408m0M36551s;
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: e */
        public void mo36576e(C6475f c6475f) {
            this.f31986d = c6475f;
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: g */
        public void mo36577g(C6475f c6475f) {
            WindowInsets windowInsets = this.f31985c;
            if (windowInsets != null) {
                this.f31985c = windowInsets.replaceSystemWindowInsets(c6475f.f20347a, c6475f.f20348b, c6475f.f20349c, c6475f.f20350d);
            }
        }

        public b(C9408m0 c9408m0) {
            super(c9408m0);
            this.f31985c = c9408m0.m36569r();
        }
    }

    /* JADX INFO: renamed from: x3.m0$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final C9408m0 f31988a;

        /* JADX INFO: renamed from: b */
        public C6475f[] f31989b;

        public f() {
            this(new C9408m0((C9408m0) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m36582a() {
            C6475f[] c6475fArr = this.f31989b;
            if (c6475fArr != null) {
                C6475f c6475fM36558f = c6475fArr[n.m36616e(1)];
                C6475f c6475fM36558f2 = this.f31989b[n.m36616e(2)];
                if (c6475fM36558f2 == null) {
                    c6475fM36558f2 = this.f31988a.m36558f(2);
                }
                if (c6475fM36558f == null) {
                    c6475fM36558f = this.f31988a.m36558f(1);
                }
                mo36577g(C6475f.m25651a(c6475fM36558f, c6475fM36558f2));
                C6475f c6475f = this.f31989b[n.m36616e(16)];
                if (c6475f != null) {
                    mo36579f(c6475f);
                }
                C6475f c6475f2 = this.f31989b[n.m36616e(32)];
                if (c6475f2 != null) {
                    mo36578d(c6475f2);
                }
                C6475f c6475f3 = this.f31989b[n.m36616e(64)];
                if (c6475f3 != null) {
                    mo36580h(c6475f3);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract C9408m0 mo36575b();

        /* JADX INFO: renamed from: c */
        public void mo36581c(int i10, C6475f c6475f) {
            if (this.f31989b == null) {
                this.f31989b = new C6475f[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f31989b[n.m36616e(i11)] = c6475f;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo36576e(C6475f c6475f);

        /* JADX INFO: renamed from: g */
        public abstract void mo36577g(C6475f c6475f);

        public f(C9408m0 c9408m0) {
            this.f31988a = c9408m0;
        }

        /* JADX INFO: renamed from: d */
        public void mo36578d(C6475f c6475f) {
        }

        /* JADX INFO: renamed from: f */
        public void mo36579f(C6475f c6475f) {
        }

        /* JADX INFO: renamed from: h */
        public void mo36580h(C6475f c6475f) {
        }
    }

    /* JADX INFO: renamed from: x3.m0$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g extends m {

        /* JADX INFO: renamed from: i */
        public static boolean f31990i;

        /* JADX INFO: renamed from: j */
        public static Method f31991j;

        /* JADX INFO: renamed from: k */
        public static Class f31992k;

        /* JADX INFO: renamed from: l */
        public static Field f31993l;

        /* JADX INFO: renamed from: m */
        public static Field f31994m;

        /* JADX INFO: renamed from: c */
        public final WindowInsets f31995c;

        /* JADX INFO: renamed from: d */
        public C6475f[] f31996d;

        /* JADX INFO: renamed from: e */
        public C6475f f31997e;

        /* JADX INFO: renamed from: f */
        public C9408m0 f31998f;

        /* JADX INFO: renamed from: g */
        public C6475f f31999g;

        /* JADX INFO: renamed from: h */
        public int f32000h;

        public g(C9408m0 c9408m0, g gVar) {
            this(c9408m0, new WindowInsets(gVar.f31995c));
        }

        /* JADX INFO: renamed from: B */
        private static void m36583B() {
            try {
                f31991j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f31992k = cls;
                f31993l = cls.getDeclaredField("mVisibleInsets");
                f31994m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f31993l.setAccessible(true);
                f31994m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f31990i = true;
        }

        /* JADX INFO: renamed from: C */
        public static boolean m36584C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        /* JADX INFO: renamed from: w */
        private C6475f m36585w(int i10, boolean z10) {
            C6475f c6475fM25651a = C6475f.f20346e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c6475fM25651a = C6475f.m25651a(c6475fM25651a, m36601x(i11, z10));
                }
            }
            return c6475fM25651a;
        }

        /* JADX INFO: renamed from: y */
        private C6475f m36586y() {
            C9408m0 c9408m0 = this.f31998f;
            return c9408m0 != null ? c9408m0.m36560h() : C6475f.f20346e;
        }

        /* JADX INFO: renamed from: z */
        private C6475f m36587z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                C5725t.m23179a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!f31990i) {
                m36583B();
            }
            Method method = f31991j;
            if (method != null && f31992k != null && f31993l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f31993l.get(f31994m.get(objInvoke));
                    if (rect != null) {
                        return C6475f.m25653c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: A */
        public boolean m36588A(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !m36601x(i10, false).equals(C6475f.f20346e);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: d */
        public void mo36589d(View view) {
            C6475f c6475fM36587z = m36587z(view);
            if (c6475fM36587z == null) {
                c6475fM36587z = C6475f.f20346e;
            }
            mo36598s(c6475fM36587z);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: e */
        public void mo36590e(C9408m0 c9408m0) {
            c9408m0.m36566o(this.f31998f);
            c9408m0.m36565n(this.f31999g);
            c9408m0.m36568q(this.f32000h);
        }

        @Override // p336x3.C9408m0.m
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f31999g, gVar.f31999g) && m36584C(this.f32000h, gVar.f32000h);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: g */
        public C6475f mo36591g(int i10) {
            return m36585w(i10, false);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: h */
        public C6475f mo36592h(int i10) {
            return m36585w(i10, true);
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: l */
        public final C6475f mo36593l() {
            if (this.f31997e == null) {
                this.f31997e = C6475f.m25652b(this.f31995c.getSystemWindowInsetLeft(), this.f31995c.getSystemWindowInsetTop(), this.f31995c.getSystemWindowInsetRight(), this.f31995c.getSystemWindowInsetBottom());
            }
            return this.f31997e;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: n */
        public C9408m0 mo36594n(int i10, int i11, int i12, int i13) {
            a aVar = new a(C9408m0.m36551s(this.f31995c));
            aVar.m36573d(C9408m0.m36550k(mo36593l(), i10, i11, i12, i13));
            aVar.m36572c(C9408m0.m36550k(mo36604j(), i10, i11, i12, i13));
            return aVar.m36570a();
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: p */
        public boolean mo36595p() {
            return this.f31995c.isRound();
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: q */
        public boolean mo36596q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !m36588A(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: r */
        public void mo36597r(C6475f[] c6475fArr) {
            this.f31996d = c6475fArr;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: s */
        public void mo36598s(C6475f c6475f) {
            this.f31999g = c6475f;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: t */
        public void mo36599t(C9408m0 c9408m0) {
            this.f31998f = c9408m0;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: v */
        public void mo36600v(int i10) {
            this.f32000h = i10;
        }

        /* JADX INFO: renamed from: x */
        public C6475f m36601x(int i10, boolean z10) {
            C6475f c6475fM36560h;
            int i11;
            if (i10 == 1) {
                return z10 ? C6475f.m25652b(0, Math.max(m36586y().f20348b, mo36593l().f20348b), 0, 0) : (this.f32000h & 4) != 0 ? C6475f.f20346e : C6475f.m25652b(0, mo36593l().f20348b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C6475f c6475fM36586y = m36586y();
                    C6475f c6475fMo36604j = mo36604j();
                    return C6475f.m25652b(Math.max(c6475fM36586y.f20347a, c6475fMo36604j.f20347a), 0, Math.max(c6475fM36586y.f20349c, c6475fMo36604j.f20349c), Math.max(c6475fM36586y.f20350d, c6475fMo36604j.f20350d));
                }
                if ((this.f32000h & 2) != 0) {
                    return C6475f.f20346e;
                }
                C6475f c6475fMo36593l = mo36593l();
                C9408m0 c9408m0 = this.f31998f;
                c6475fM36560h = c9408m0 != null ? c9408m0.m36560h() : null;
                int iMin = c6475fMo36593l.f20350d;
                if (c6475fM36560h != null) {
                    iMin = Math.min(iMin, c6475fM36560h.f20350d);
                }
                return C6475f.m25652b(c6475fMo36593l.f20347a, 0, c6475fMo36593l.f20349c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return mo36610k();
                }
                if (i10 == 32) {
                    return mo36609i();
                }
                if (i10 == 64) {
                    return mo36611m();
                }
                if (i10 != 128) {
                    return C6475f.f20346e;
                }
                C9408m0 c9408m02 = this.f31998f;
                C9377c c9377cM36557e = c9408m02 != null ? c9408m02.m36557e() : mo36608f();
                return c9377cM36557e != null ? C6475f.m25652b(c9377cM36557e.m36499c(), c9377cM36557e.m36501e(), c9377cM36557e.m36500d(), c9377cM36557e.m36498b()) : C6475f.f20346e;
            }
            C6475f[] c6475fArr = this.f31996d;
            c6475fM36560h = c6475fArr != null ? c6475fArr[n.m36616e(8)] : null;
            if (c6475fM36560h != null) {
                return c6475fM36560h;
            }
            C6475f c6475fMo36593l2 = mo36593l();
            C6475f c6475fM36586y2 = m36586y();
            int i12 = c6475fMo36593l2.f20350d;
            if (i12 > c6475fM36586y2.f20350d) {
                return C6475f.m25652b(0, 0, 0, i12);
            }
            C6475f c6475f = this.f31999g;
            return (c6475f == null || c6475f.equals(C6475f.f20346e) || (i11 = this.f31999g.f20350d) <= c6475fM36586y2.f20350d) ? C6475f.f20346e : C6475f.m25652b(0, 0, 0, i11);
        }

        public g(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0);
            this.f31997e = null;
            this.f31995c = windowInsets;
        }
    }

    /* JADX INFO: renamed from: x3.m0$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class h extends g {

        /* JADX INFO: renamed from: n */
        public C6475f f32001n;

        public h(C9408m0 c9408m0, h hVar) {
            super(c9408m0, hVar);
            this.f32001n = null;
            this.f32001n = hVar.f32001n;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: b */
        public C9408m0 mo36602b() {
            return C9408m0.m36551s(this.f31995c.consumeStableInsets());
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: c */
        public C9408m0 mo36603c() {
            return C9408m0.m36551s(this.f31995c.consumeSystemWindowInsets());
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: j */
        public final C6475f mo36604j() {
            if (this.f32001n == null) {
                this.f32001n = C6475f.m25652b(this.f31995c.getStableInsetLeft(), this.f31995c.getStableInsetTop(), this.f31995c.getStableInsetRight(), this.f31995c.getStableInsetBottom());
            }
            return this.f32001n;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: o */
        public boolean mo36605o() {
            return this.f31995c.isConsumed();
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: u */
        public void mo36606u(C6475f c6475f) {
            this.f32001n = c6475f;
        }

        public h(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0, windowInsets);
            this.f32001n = null;
        }
    }

    /* JADX INFO: renamed from: x3.m0$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class j extends i {

        /* JADX INFO: renamed from: o */
        public C6475f f32002o;

        /* JADX INFO: renamed from: p */
        public C6475f f32003p;

        /* JADX INFO: renamed from: q */
        public C6475f f32004q;

        public j(C9408m0 c9408m0, WindowInsets windowInsets) {
            super(c9408m0, windowInsets);
            this.f32002o = null;
            this.f32003p = null;
            this.f32004q = null;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: i */
        public C6475f mo36609i() {
            if (this.f32003p == null) {
                this.f32003p = C6475f.m25654d(this.f31995c.getMandatorySystemGestureInsets());
            }
            return this.f32003p;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: k */
        public C6475f mo36610k() {
            if (this.f32002o == null) {
                this.f32002o = C6475f.m25654d(this.f31995c.getSystemGestureInsets());
            }
            return this.f32002o;
        }

        @Override // p336x3.C9408m0.m
        /* JADX INFO: renamed from: m */
        public C6475f mo36611m() {
            if (this.f32004q == null) {
                this.f32004q = C6475f.m25654d(this.f31995c.getTappableElementInsets());
            }
            return this.f32004q;
        }

        @Override // p336x3.C9408m0.g, p336x3.C9408m0.m
        /* JADX INFO: renamed from: n */
        public C9408m0 mo36594n(int i10, int i11, int i12, int i13) {
            return C9408m0.m36551s(this.f31995c.inset(i10, i11, i12, i13));
        }

        public j(C9408m0 c9408m0, j jVar) {
            super(c9408m0, jVar);
            this.f32002o = null;
            this.f32003p = null;
            this.f32004q = null;
        }

        @Override // p336x3.C9408m0.h, p336x3.C9408m0.m
        /* JADX INFO: renamed from: u */
        public void mo36606u(C6475f c6475f) {
        }
    }

    /* JADX INFO: renamed from: x3.m0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends f {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f31987c;

        public c(C9408m0 c9408m0) {
            super(c9408m0);
            WindowInsets windowInsetsM36569r = c9408m0.m36569r();
            this.f31987c = windowInsetsM36569r != null ? AbstractC9411n0.m36627a(windowInsetsM36569r) : AbstractC9414o0.m36630a();
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: b */
        public C9408m0 mo36575b() {
            m36582a();
            C9408m0 c9408m0M36551s = C9408m0.m36551s(this.f31987c.build());
            c9408m0M36551s.m36564m(this.f31989b);
            return c9408m0M36551s;
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: d */
        public void mo36578d(C6475f c6475f) {
            this.f31987c.setMandatorySystemGestureInsets(c6475f.m25655e());
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: e */
        public void mo36576e(C6475f c6475f) {
            this.f31987c.setStableInsets(c6475f.m25655e());
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: f */
        public void mo36579f(C6475f c6475f) {
            this.f31987c.setSystemGestureInsets(c6475f.m25655e());
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: g */
        public void mo36577g(C6475f c6475f) {
            this.f31987c.setSystemWindowInsets(c6475f.m25655e());
        }

        @Override // p336x3.C9408m0.f
        /* JADX INFO: renamed from: h */
        public void mo36580h(C6475f c6475f) {
            this.f31987c.setTappableElementInsets(c6475f.m25655e());
        }

        public c() {
            this.f31987c = AbstractC9414o0.m36630a();
        }
    }

    /* JADX INFO: renamed from: x3.m0$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class m {

        /* JADX INFO: renamed from: b */
        public static final C9408m0 f32007b = new a().m36570a().m36553a().m36554b().m36555c();

        /* JADX INFO: renamed from: a */
        public final C9408m0 f32008a;

        public m(C9408m0 c9408m0) {
            this.f32008a = c9408m0;
        }

        /* JADX INFO: renamed from: a */
        public C9408m0 mo36607a() {
            return this.f32008a;
        }

        /* JADX INFO: renamed from: b */
        public C9408m0 mo36602b() {
            return this.f32008a;
        }

        /* JADX INFO: renamed from: c */
        public C9408m0 mo36603c() {
            return this.f32008a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return mo36595p() == mVar.mo36595p() && mo36605o() == mVar.mo36605o() && AbstractC9169b.m35610a(mo36593l(), mVar.mo36593l()) && AbstractC9169b.m35610a(mo36604j(), mVar.mo36604j()) && AbstractC9169b.m35610a(mo36608f(), mVar.mo36608f());
        }

        /* JADX INFO: renamed from: f */
        public C9377c mo36608f() {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public C6475f mo36591g(int i10) {
            return C6475f.f20346e;
        }

        /* JADX INFO: renamed from: h */
        public C6475f mo36592h(int i10) {
            if ((i10 & 8) == 0) {
                return C6475f.f20346e;
            }
            C9987e.m38645a("Unable to query the maximum insets for IME");
            return null;
        }

        public int hashCode() {
            return AbstractC9169b.m35611b(Boolean.valueOf(mo36595p()), Boolean.valueOf(mo36605o()), mo36593l(), mo36604j(), mo36608f());
        }

        /* JADX INFO: renamed from: i */
        public C6475f mo36609i() {
            return mo36593l();
        }

        /* JADX INFO: renamed from: j */
        public C6475f mo36604j() {
            return C6475f.f20346e;
        }

        /* JADX INFO: renamed from: k */
        public C6475f mo36610k() {
            return mo36593l();
        }

        /* JADX INFO: renamed from: l */
        public C6475f mo36593l() {
            return C6475f.f20346e;
        }

        /* JADX INFO: renamed from: m */
        public C6475f mo36611m() {
            return mo36593l();
        }

        /* JADX INFO: renamed from: n */
        public C9408m0 mo36594n(int i10, int i11, int i12, int i13) {
            return f32007b;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo36605o() {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo36595p() {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo36596q(int i10) {
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void mo36589d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo36590e(C9408m0 c9408m0) {
        }

        /* JADX INFO: renamed from: r */
        public void mo36597r(C6475f[] c6475fArr) {
        }

        /* JADX INFO: renamed from: s */
        public void mo36598s(C6475f c6475f) {
        }

        /* JADX INFO: renamed from: t */
        public void mo36599t(C9408m0 c9408m0) {
        }

        /* JADX INFO: renamed from: u */
        public void mo36606u(C6475f c6475f) {
        }

        /* JADX INFO: renamed from: v */
        public void mo36600v(int i10) {
        }
    }

    /* JADX INFO: renamed from: x3.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final f f31980a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f31980a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f31980a = new d();
            } else if (i10 >= 29) {
                this.f31980a = new c();
            } else {
                this.f31980a = new b();
            }
        }

        /* JADX INFO: renamed from: a */
        public C9408m0 m36570a() {
            return this.f31980a.mo36575b();
        }

        /* JADX INFO: renamed from: b */
        public a m36571b(int i10, C6475f c6475f) {
            this.f31980a.mo36581c(i10, c6475f);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m36572c(C6475f c6475f) {
            this.f31980a.mo36576e(c6475f);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m36573d(C6475f c6475f) {
            this.f31980a.mo36577g(c6475f);
            return this;
        }

        public a(C9408m0 c9408m0) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f31980a = new e(c9408m0);
                return;
            }
            if (i10 >= 30) {
                this.f31980a = new d(c9408m0);
            } else if (i10 >= 29) {
                this.f31980a = new c(c9408m0);
            } else {
                this.f31980a = new b(c9408m0);
            }
        }
    }

    public C9408m0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f31979a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f31979a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f31979a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f31979a = new i(this, windowInsets);
        } else {
            this.f31979a = new h(this, windowInsets);
        }
    }
}
