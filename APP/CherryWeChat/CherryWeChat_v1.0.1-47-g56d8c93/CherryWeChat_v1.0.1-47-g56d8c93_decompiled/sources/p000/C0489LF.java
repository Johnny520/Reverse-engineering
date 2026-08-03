package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: LF */
/* JADX INFO: loaded from: classes.dex */
public final class C0489LF {

    /* JADX INFO: renamed from: b */
    public static final C0489LF f1601b;

    /* JADX INFO: renamed from: a */
    public final C0317HF f1602a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f1601b = C0274GF.f891s;
        } else if (i >= 30) {
            f1601b = C0188EF.f573r;
        } else {
            f1601b = C0317HF.f1043b;
        }
    }

    public C0489LF(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f1602a = new C0274GF(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f1602a = new C0231FF(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f1602a = new C0188EF(this, windowInsets);
        } else if (i >= 29) {
            this.f1602a = new C0145DF(this, windowInsets);
        } else {
            this.f1602a = new C0102CF(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C2765yl m938e(C2765yl c2765yl, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c2765yl.f9405a - i);
        int iMax2 = Math.max(0, c2765yl.f9406b - i2);
        int iMax3 = Math.max(0, c2765yl.f9407c - i3);
        int iMax4 = Math.max(0, c2765yl.f9408d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c2765yl : C2765yl.m5337b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: h */
    public static C0489LF m939h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0489LF c0489lf = new C0489LF(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            C0489LF c0489lfM2675a = AbstractC1404fE.m2675a(view);
            C0317HF c0317hf = c0489lf.f1602a;
            c0317hf.mo20r(c0489lfM2675a);
            c0317hf.mo12d(view.getRootView());
            c0317hf.mo21t(view.getWindowSystemUiVisibility());
        }
        return c0489lf;
    }

    /* JADX INFO: renamed from: a */
    public final int m940a() {
        return this.f1602a.mo15k().f9408d;
    }

    /* JADX INFO: renamed from: b */
    public final int m941b() {
        return this.f1602a.mo15k().f9405a;
    }

    /* JADX INFO: renamed from: c */
    public final int m942c() {
        return this.f1602a.mo15k().f9407c;
    }

    /* JADX INFO: renamed from: d */
    public final int m943d() {
        return this.f1602a.mo15k().f9406b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0489LF) {
            return Objects.equals(this.f1602a, ((C0489LF) obj).f1602a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C0489LF m944f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC2796zF c2753yF = i5 >= 34 ? new C2753yF(this) : i5 >= 31 ? new C2710xF(this) : i5 >= 30 ? new C2667wF(this) : i5 >= 29 ? new C2624vF(this) : new C2581uF(this);
        c2753yF.mo5086g(C2765yl.m5337b(i, i2, i3, i4));
        return c2753yF.mo5084b();
    }

    /* JADX INFO: renamed from: g */
    public final WindowInsets m945g() {
        C0317HF c0317hf = this.f1602a;
        if (c0317hf instanceof C0016AF) {
            return ((C0016AF) c0317hf).f26c;
        }
        return null;
    }

    public final int hashCode() {
        C0317HF c0317hf = this.f1602a;
        if (c0317hf == null) {
            return 0;
        }
        return c0317hf.hashCode();
    }

    public C0489LF(C0489LF c0489lf) {
        if (c0489lf != null) {
            C0317HF c0317hf = c0489lf.f1602a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (c0317hf instanceof C0274GF)) {
                this.f1602a = new C0274GF(this, (C0274GF) c0317hf);
            } else if (i >= 31 && (c0317hf instanceof C0231FF)) {
                this.f1602a = new C0231FF(this, (C0231FF) c0317hf);
            } else if (i >= 30 && (c0317hf instanceof C0188EF)) {
                this.f1602a = new C0188EF(this, (C0188EF) c0317hf);
            } else if (i >= 29 && (c0317hf instanceof C0145DF)) {
                this.f1602a = new C0145DF(this, (C0145DF) c0317hf);
            } else if (c0317hf instanceof C0102CF) {
                this.f1602a = new C0102CF(this, (C0102CF) c0317hf);
            } else if (c0317hf instanceof C0059BF) {
                this.f1602a = new C0059BF(this, (C0059BF) c0317hf);
            } else if (c0317hf instanceof C0016AF) {
                this.f1602a = new C0016AF(this, (C0016AF) c0317hf);
            } else {
                this.f1602a = new C0317HF(this);
            }
            c0317hf.mo13e(this);
            return;
        }
        this.f1602a = new C0317HF(this);
    }
}
