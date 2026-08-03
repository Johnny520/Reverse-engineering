package p070m0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p086v0.AbstractC1110a;
import p087w.AbstractC1111a;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1127k;
import p089x0.InterfaceC1138v;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0993c {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f3530a;

    /* JADX INFO: renamed from: b */
    public C1127k f3531b;

    /* JADX INFO: renamed from: c */
    public int f3532c;

    /* JADX INFO: renamed from: d */
    public int f3533d;

    /* JADX INFO: renamed from: e */
    public int f3534e;

    /* JADX INFO: renamed from: f */
    public int f3535f;

    /* JADX INFO: renamed from: g */
    public int f3536g;

    /* JADX INFO: renamed from: h */
    public int f3537h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f3538i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3539j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3540k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3541l;

    /* JADX INFO: renamed from: m */
    public C1123g f3542m;

    /* JADX INFO: renamed from: n */
    public boolean f3543n;

    /* JADX INFO: renamed from: o */
    public boolean f3544o;

    /* JADX INFO: renamed from: p */
    public boolean f3545p;

    /* JADX INFO: renamed from: q */
    public boolean f3546q;

    /* JADX INFO: renamed from: r */
    public boolean f3547r;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f3548s;

    /* JADX INFO: renamed from: t */
    public int f3549t;

    public C0993c(MaterialButton r2, C1127k r3) {
        this.f3543n = false;
        this.f3544o = false;
        this.f3545p = false;
        this.f3547r = true;
        this.f3530a = r2;
        this.f3531b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1138v m2380a() {
        RippleDrawable r02 = this.f3548s;
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.getNumberOfLayers() > 1) goto L7;
        return null;
    L7:
        if (this.f3548s.getNumberOfLayers() <= 2) goto L11;
        return (InterfaceC1138v) this.f3548s.getDrawable(2);
    L11:
        return (InterfaceC1138v) this.f3548s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C1123g m2381b(boolean r3) {
        RippleDrawable r02 = this.f3548s;
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.getNumberOfLayers() > 0) goto L7;
        return null;
    L7:
        return (C1123g) ((LayerDrawable) ((InsetDrawable) this.f3548s.getDrawable(0)).getDrawable()).getDrawable(!r3 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m2382c(C1127k r3) {
        this.f3531b = r3;
        if (m2381b(false) == null) goto L6;
        m2381b(false).setShapeAppearanceModel(r3);
    L6:
        if (m2381b(true) == null) goto L9;
        m2381b(true).setShapeAppearanceModel(r3);
    L9:
        if (m2380a() == null) goto L12;
        m2380a().setShapeAppearanceModel(r3);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m2383d(int r9, int r10) {
        Field r02 = AbstractC0080Q.f219a;
        MaterialButton r03 = this.f3530a;
        int r1 = r03.getPaddingStart();
        int r2 = r03.getPaddingTop();
        int r3 = r03.getPaddingEnd();
        int r4 = r03.getPaddingBottom();
        int r5 = this.f3534e;
        int r6 = this.f3535f;
        this.f3535f = r10;
        this.f3534e = r9;
        if (this.f3544o == true) goto L5;
        m2384e();
    L5:
        r03.setPaddingRelative(r1, (r2 + r9) - r5, r3, (r4 + r10) - r6);
    }

    /* JADX INFO: renamed from: e */
    public final void m2384e() {
        C1123g r1 = new C1123g(this.f3531b);
        MaterialButton r2 = this.f3530a;
        r1.m2649i(r2.getContext());
        AbstractC1111a.m2626h(r1, this.f3539j);
        PorterDuff.Mode r3 = this.f3538i;
        if (r3 == null) goto L5;
        AbstractC1111a.m2627i(r1, r3);
    L5:
        float r32 = this.f3537h;
        ColorStateList r4 = this.f3540k;
        r1.f4312a.f4300k = r32;
        r1.invalidateSelf();
        C1122f r33 = r1.f4312a;
        if (r33.f4293d == r4) goto L8;
        r33.f4293d = r4;
        r1.onStateChange(r1.getState());
    L8:
        C1123g r34 = new C1123g(this.f3531b);
        r34.setTint(0);
        float r42 = this.f3537h;
        if (this.f3543n == false) goto L11;
        int r5 = AbstractC0805P.m2048o(r2, C1031R.attr.colorSurface);
    L12:
        r34.f4312a.f4300k = r42;
        r34.invalidateSelf();
        ColorStateList r43 = ColorStateList.valueOf(r5);
        C1122f r52 = r34.f4312a;
        if (r52.f4293d == r43) goto L15;
        r52.f4293d = r43;
        r34.onStateChange(r34.getState());
    L15:
        C1123g r44 = new C1123g(this.f3531b);
        this.f3542m = r44;
        AbstractC1111a.m2625g(r44, -1);
        RippleDrawable r45 = new RippleDrawable(AbstractC1110a.m2618a(this.f3541l), new InsetDrawable(new LayerDrawable(new Drawable[]{r34, r1}), this.f3532c, this.f3534e, this.f3533d, this.f3535f), this.f3542m);
        this.f3548s = r45;
        r2.setInternalBackground(r45);
        C1123g r02 = m2381b(false);
        if (r02 == null) goto L19;
        r02.m2650j(this.f3549t);
        r02.setState(r2.getDrawableState());
        return;
    L19:
        return;
    L11:
        r5 = 0;
        goto L12
    }

    /* JADX INFO: renamed from: f */
    public final void m2385f() {
        int r02 = 0;
        C1123g r1 = m2381b(false);
        C1123g r2 = m2381b(true);
        if (r1 == null) goto L15;
        float r3 = this.f3537h;
        ColorStateList r4 = this.f3540k;
        r1.f4312a.f4300k = r3;
        r1.invalidateSelf();
        C1122f r32 = r1.f4312a;
        if (r32.f4293d == r4) goto L7;
        r32.f4293d = r4;
        r1.onStateChange(r1.getState());
    L7:
        if (r2 == null) goto L16;
        float r12 = this.f3537h;
        if (this.f3543n == false) goto L11;
        r02 = AbstractC0805P.m2048o(this.f3530a, C1031R.attr.colorSurface);
    L11:
        r2.f4312a.f4300k = r12;
        r2.invalidateSelf();
        ColorStateList r03 = ColorStateList.valueOf(r02);
        C1122f r13 = r2.f4312a;
        if (r13.f4293d == r03) goto L17;
        r13.f4293d = r03;
        r2.onStateChange(r2.getState());
        return;
    L17:
        return;
    L16:
        return;
    }
}
