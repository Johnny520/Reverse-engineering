package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ae3 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final wd3 f177a;

    /* JADX INFO: renamed from: b */
    public cf3 f178b;

    public ae3(View view, wd3 wd3Var) {
        cf3 cf3VarMo2150b;
        this.f177a = wd3Var;
        int i = wa3.f12444a;
        cf3 cf3VarM4780a = sa3.m4780a(view);
        if (cf3VarM4780a != null) {
            int i2 = Build.VERSION.SDK_INT;
            cf3VarMo2150b = (i2 >= 36 ? new oe3(cf3VarM4780a) : i2 >= 35 ? new ne3(cf3VarM4780a) : i2 >= 34 ? new me3(cf3VarM4780a) : i2 >= 31 ? new le3(cf3VarM4780a) : i2 >= 30 ? new ke3(cf3VarM4780a) : i2 >= 29 ? new je3(cf3VarM4780a) : new he3(cf3VarM4780a)).mo2150b();
        } else {
            cf3VarMo2150b = null;
        }
        this.f178b = cf3VarMo2150b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.f178b = cf3.m769c(view, windowInsets);
            return be3.m519j(view, windowInsets);
        }
        cf3 cf3VarM769c = cf3.m769c(view, windowInsets);
        ye3 ye3Var = cf3VarM769c.f1518a;
        if (this.f178b == null) {
            int i = wa3.f12444a;
            this.f178b = sa3.m4780a(view);
        }
        if (this.f178b == null) {
            this.f178b = cf3VarM769c;
            return be3.m519j(view, windowInsets);
        }
        wd3 wd3VarM520k = be3.m520k(view);
        if (wd3VarM520k != null && Objects.equals(wd3VarM520k.f12471h, cf3VarM769c)) {
            return be3.m519j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        cf3 cf3Var = this.f178b;
        int i2 = 1;
        while (i2 <= 512) {
            zz0 zz0VarMo4165i = ye3Var.mo4165i(i2);
            zz0 zz0VarMo4165i2 = cf3Var.f1518a.mo4165i(i2);
            int i3 = zz0VarMo4165i.f14157a;
            int i4 = zz0VarMo4165i.f14160d;
            int i5 = zz0VarMo4165i.f14159c;
            int i6 = zz0VarMo4165i.f14158b;
            int i7 = zz0VarMo4165i2.f14157a;
            int i8 = zz0VarMo4165i2.f14160d;
            int i9 = zz0VarMo4165i2.f14159c;
            int i10 = zz0VarMo4165i2.f14158b;
            if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                if (z) {
                    iArr[0] = iArr[0] | i2;
                } else {
                    iArr3[0] = iArr3[0] | i2;
                }
            }
            i2 <<= 1;
            iArr2 = iArr;
        }
        int i11 = iArr2[0];
        int i12 = iArr3[0];
        int i13 = i11 | i12;
        if (i13 == 0) {
            this.f178b = cf3VarM769c;
            return be3.m519j(view, windowInsets);
        }
        cf3 cf3Var2 = this.f178b;
        ge3 ge3Var = new ge3(i13, (i11 & 8) != 0 ? be3.f824e : (i12 & 8) != 0 ? be3.f825f : (i11 & 519) != 0 ? be3.f826g : (i12 & 519) != 0 ? be3.f827h : null, (i13 & 8) != 0 ? 160L : 250L);
        ge3Var.f3471a.mo1348e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ge3Var.f3471a.mo1345b());
        zz0 zz0VarMo4165i3 = ye3Var.mo4165i(i13);
        zz0 zz0VarMo4165i4 = cf3Var2.f1518a.mo4165i(i13);
        int iMin = Math.min(zz0VarMo4165i3.f14157a, zz0VarMo4165i4.f14157a);
        int i14 = zz0VarMo4165i3.f14158b;
        int i15 = zz0VarMo4165i4.f14158b;
        int iMin2 = Math.min(i14, i15);
        int i16 = zz0VarMo4165i3.f14159c;
        int i17 = zz0VarMo4165i4.f14159c;
        int iMin3 = Math.min(i16, i17);
        int i18 = zz0VarMo4165i3.f14160d;
        int i19 = zz0VarMo4165i4.f14160d;
        dq1 dq1Var = new dq1(21, zz0.m6518b(iMin, iMin2, iMin3, Math.min(i18, i19)), zz0.m6518b(Math.max(zz0VarMo4165i3.f14157a, zz0VarMo4165i4.f14157a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
        be3.m516g(view, ge3Var, cf3VarM769c, false);
        duration.addUpdateListener(new xd3(ge3Var, cf3VarM769c, cf3Var2, i13, view));
        duration.addListener(new yd3(ge3Var, view));
        xt1 xt1Var = new xt1(view, new zd3(view, ge3Var, dq1Var, duration));
        view.getViewTreeObserver().addOnPreDrawListener(xt1Var);
        view.addOnAttachStateChangeListener(xt1Var);
        this.f178b = cf3VarM769c;
        return be3.m519j(view, windowInsets);
    }
}
