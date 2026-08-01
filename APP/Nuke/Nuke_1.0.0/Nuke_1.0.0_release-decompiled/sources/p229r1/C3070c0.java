package p229r1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3070c0 {

    /* JADX INFO: renamed from: b */
    public static final C3070c0 f9781b;

    /* JADX INFO: renamed from: a */
    public final C3064Z f9782a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            f9781b = C3062X.f9774x;
        } else if (i5 >= 30) {
            f9781b = C3060V.f9773w;
        } else {
            f9781b = C3064Z.f9775b;
        }
    }

    public C3070c0(WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            this.f9782a = new C3063Y(this, windowInsets);
            return;
        }
        if (i5 >= 34) {
            this.f9782a = new C3062X(this, windowInsets);
            return;
        }
        if (i5 >= 31) {
            this.f9782a = new C3061W(this, windowInsets);
            return;
        }
        if (i5 >= 30) {
            this.f9782a = new C3060V(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f9782a = new C3059U(this, windowInsets);
        } else if (i5 >= 28) {
            this.f9782a = new C3058T(this, windowInsets);
        } else {
            this.f9782a = new C3057S(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2688b m5392a(C2688b c2688b, int i5, int i6, int i7, int i8) {
        int iMax = Math.max(0, c2688b.f8572a - i5);
        int iMax2 = Math.max(0, c2688b.f8573b - i6);
        int iMax3 = Math.max(0, c2688b.f8574c - i7);
        int iMax4 = Math.max(0, c2688b.f8575d - i8);
        return (iMax == i5 && iMax2 == i6 && iMax3 == i7 && iMax4 == i8) ? c2688b : C2688b.m4667b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: c */
    public static C3070c0 m5393c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C3070c0 c3070c0 = new C3070c0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i5 = AbstractC3092v.f9811a;
            C3070c0 c3070c0M5401a = AbstractC3088r.m5401a(view);
            C3064Z c3064z = c3070c0.f9782a;
            c3064z.mo5378y(c3070c0M5401a);
            View rootView = view.getRootView();
            c3064z.mo5363d(rootView);
            c3064z.mo5370p(rootView);
            c3064z.mo5371q();
            c3064z.mo5358A(view.getWindowSystemUiVisibility());
        }
        return c3070c0;
    }

    /* JADX INFO: renamed from: b */
    public final WindowInsets m5394b() {
        C3064Z c3064z = this.f9782a;
        if (c3064z instanceof C3056Q) {
            return ((C3056Q) c3064z).f9758c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3070c0) {
            return Objects.equals(this.f9782a, ((C3070c0) obj).f9782a);
        }
        return false;
    }

    public final int hashCode() {
        C3064Z c3064z = this.f9782a;
        if (c3064z == null) {
            return 0;
        }
        return c3064z.hashCode();
    }

    public C3070c0(C3070c0 c3070c0) {
        if (c3070c0 != null) {
            C3064Z c3064z = c3070c0.f9782a;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 35 && (c3064z instanceof C3063Y)) {
                this.f9782a = new C3063Y(this, (C3063Y) c3064z);
            } else if (i5 >= 34 && (c3064z instanceof C3062X)) {
                this.f9782a = new C3062X(this, (C3062X) c3064z);
            } else if (i5 >= 31 && (c3064z instanceof C3061W)) {
                this.f9782a = new C3061W(this, (C3061W) c3064z);
            } else if (i5 >= 30 && (c3064z instanceof C3060V)) {
                this.f9782a = new C3060V(this, (C3060V) c3064z);
            } else if (i5 >= 29 && (c3064z instanceof C3059U)) {
                this.f9782a = new C3059U(this, (C3059U) c3064z);
            } else if (i5 >= 28 && (c3064z instanceof C3058T)) {
                this.f9782a = new C3058T(this, (C3058T) c3064z);
            } else if (c3064z instanceof C3057S) {
                this.f9782a = new C3057S(this, (C3057S) c3064z);
            } else if (c3064z instanceof C3056Q) {
                this.f9782a = new C3056Q(this, (C3056Q) c3064z);
            } else {
                this.f9782a = new C3064Z(this);
            }
            c3064z.mo5364e(this);
            return;
        }
        this.f9782a = new C3064Z(this);
    }
}
