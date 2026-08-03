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
    public static final C0489LF f1601b = null;

    /* JADX INFO: renamed from: a */
    public final C0317HF f1602a;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L7;
        f1601b = C0274GF.f891s;
        return;
    L7:
        if (r0 < 30) goto L10;
        f1601b = C0188EF.f573r;
        return;
    L10:
        f1601b = C0317HF.f1043b;
    }

    public C0489LF(WindowInsets r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L7;
        this.f1602a = new C0274GF(this, r3);
        return;
    L7:
        if (r0 < 31) goto L11;
        this.f1602a = new C0231FF(this, r3);
        return;
    L11:
        if (r0 < 30) goto L15;
        this.f1602a = new C0188EF(this, r3);
        return;
    L15:
        if (r0 < 29) goto L18;
        this.f1602a = new C0145DF(this, r3);
        return;
    L18:
        this.f1602a = new C0102CF(this, r3);
    }

    /* JADX INFO: renamed from: e */
    public static C2765yl m938e(C2765yl r5, int r6, int r7, int r8, int r9) {
        int r0 = Math.max(0, r5.f9405a - r6);
        int r2 = Math.max(0, r5.f9406b - r7);
        int r3 = Math.max(0, r5.f9407c - r8);
        int r1 = Math.max(0, r5.f9408d - r9);
        if (r0 != r6) goto L9;
        if (r2 != r7) goto L9;
        if (r3 != r8) goto L9;
        if (r1 != r9) goto L9;
        return r5;
    L9:
        return C2765yl.m5337b(r0, r2, r3, r1);
    }

    /* JADX INFO: renamed from: h */
    public static C0489LF m939h(View r2, WindowInsets r3) {
        r3.getClass();
        C0489LF r0 = new C0489LF(r3);
        if (r2 != null) goto L5;
    L7:
        return r0;
    L5:
        if (r2.isAttachedToWindow() == false) goto L7;
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        C0489LF r33 = AbstractC1404fE.m2675a(r2);
        C0317HF r1 = r0.f1602a;
        r1.mo20r(r33);
        r1.mo12d(r2.getRootView());
        r1.mo21t(r2.getWindowSystemUiVisibility());
        goto L7
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

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C0489LF) == true) goto L10;
        return false;
    L10:
        return Objects.equals(this.f1602a, ((C0489LF) r2).f1602a);
    }

    /* JADX INFO: renamed from: f */
    public final C0489LF m944f(int r3, int r4, int r5, int r6) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        AbstractC2796zF r02 = new C2753yF(this);
    L15:
        r02.mo5086g(C2765yl.m5337b(r3, r4, r5, r6));
        return r02.mo5084b();
    L6:
        if (r0 < 31) goto L9;
        r02 = new C2710xF(this);
        goto L15
    L9:
        if (r0 < 30) goto L12;
        r02 = new C2667wF(this);
        goto L15
    L12:
        if (r0 < 29) goto L14;
        r02 = new C2624vF(this);
        goto L15
    L14:
        r02 = new C2581uF(this);
        goto L15
    }

    /* JADX INFO: renamed from: g */
    public final WindowInsets m945g() {
        C0317HF r0 = this.f1602a;
        if ((r0 instanceof C0016AF) == true) goto L5;
        return null;
    L5:
        return ((C0016AF) r0).f26c;
    }

    public final int hashCode() {
        C0317HF r0 = this.f1602a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public C0489LF(C0489LF r3) {
        if (r3 == null) goto L36;
        C0317HF r32 = r3.f1602a;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L10;
        if ((r32 instanceof C0274GF) == false) goto L10;
        this.f1602a = new C0274GF(this, (C0274GF) r32);
    L34:
        r32.mo13e(this);
        return;
    L10:
        if (r0 < 31) goto L15;
        if ((r32 instanceof C0231FF) == false) goto L15;
        this.f1602a = new C0231FF(this, (C0231FF) r32);
    L15:
        if (r0 < 30) goto L20;
        if ((r32 instanceof C0188EF) == false) goto L20;
        this.f1602a = new C0188EF(this, (C0188EF) r32);
    L20:
        if (r0 < 29) goto L25;
        if ((r32 instanceof C0145DF) == false) goto L25;
        this.f1602a = new C0145DF(this, (C0145DF) r32);
    L25:
        if ((r32 instanceof C0102CF) == false) goto L28;
        this.f1602a = new C0102CF(this, (C0102CF) r32);
        goto L34
    L28:
        if ((r32 instanceof C0059BF) == false) goto L31;
        this.f1602a = new C0059BF(this, (C0059BF) r32);
        goto L34
    L31:
        if ((r32 instanceof C0016AF) == false) goto L33;
        this.f1602a = new C0016AF(this, (C0016AF) r32);
        goto L34
    L33:
        this.f1602a = new C0317HF(this);
        goto L34
    L36:
        this.f1602a = new C0317HF(this);
    }
}
