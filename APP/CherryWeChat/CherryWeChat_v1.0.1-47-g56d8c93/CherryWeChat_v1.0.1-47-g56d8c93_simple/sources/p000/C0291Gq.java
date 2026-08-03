package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Gq */
/* JADX INFO: loaded from: classes.dex */
public final class C0291Gq {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f966a;

    /* JADX INFO: renamed from: b */
    public C0728Qx f967b;

    /* JADX INFO: renamed from: c */
    public C1301cz f968c;

    /* JADX INFO: renamed from: d */
    public C0686Py f969d;

    /* JADX INFO: renamed from: e */
    public C2464rl f970e;

    /* JADX INFO: renamed from: f */
    public int f971f;

    /* JADX INFO: renamed from: g */
    public int f972g;

    /* JADX INFO: renamed from: h */
    public int f973h;

    /* JADX INFO: renamed from: i */
    public int f974i;

    /* JADX INFO: renamed from: j */
    public int f975j;

    /* JADX INFO: renamed from: k */
    public int f976k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f977l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f978m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f979n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f980o;

    /* JADX INFO: renamed from: p */
    public C1021Xq f981p;

    /* JADX INFO: renamed from: q */
    public boolean f982q;

    /* JADX INFO: renamed from: r */
    public boolean f983r;

    /* JADX INFO: renamed from: s */
    public boolean f984s;

    /* JADX INFO: renamed from: t */
    public boolean f985t;

    /* JADX INFO: renamed from: u */
    public boolean f986u;

    /* JADX INFO: renamed from: v */
    public RippleDrawable f987v;

    /* JADX INFO: renamed from: w */
    public int f988w;

    public C0291Gq(MaterialButton r2, C0728Qx r3) {
        this.f982q = false;
        this.f983r = false;
        this.f984s = false;
        this.f986u = true;
        this.f966a = r2;
        this.f967b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final C1021Xq m586a(boolean r3) {
        RippleDrawable r0 = this.f987v;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.getNumberOfLayers() > 0) goto L7;
        return null;
    L7:
        return (C1021Xq) ((LayerDrawable) ((InsetDrawable) this.f987v.getDrawable(0)).getDrawable()).getDrawable(!r3 ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m587b(int r9, int r10) {
        MaterialButton r0 = this.f966a;
        int r1 = r0.getPaddingStart();
        int r2 = r0.getPaddingTop();
        int r3 = r0.getPaddingEnd();
        int r4 = r0.getPaddingBottom();
        int r5 = this.f973h;
        int r6 = this.f974i;
        this.f974i = r10;
        this.f973h = r9;
        if (this.f983r == true) goto L5;
        m588c();
    L5:
        r0.setPaddingRelative(r1, (r2 + r9) - r5, r3, (r4 + r10) - r6);
    }

    /* JADX INFO: renamed from: c */
    public final void m588c() {
        C1021Xq r0 = new C1021Xq(this.f967b);
        C1301cz r1 = this.f968c;
        if (r1 == null) goto L5;
        r0.m1929o(r1);
    L5:
        C0686Py r12 = this.f969d;
        if (r12 == null) goto L8;
        r0.m1926l(r12);
    L8:
        C2464rl r13 = this.f970e;
        if (r13 == null) goto L11;
        r0.f3239D = r13;
    L11:
        MaterialButton r14 = this.f966a;
        r0.m1925k(r14.getContext());
        r0.setTintList(this.f978m);
        PorterDuff.Mode r2 = this.f977l;
        if (r2 == null) goto L14;
        r0.setTintMode(r2);
    L14:
        float r22 = this.f976k;
        ColorStateList r3 = this.f979n;
        r0.f3241b.f2912k = r22;
        r0.invalidateSelf();
        C0935Vq r23 = r0.f3241b;
        if (r23.f2906e == r3) goto L17;
        r23.f2906e = r3;
        r0.onStateChange(r0.getState());
    L17:
        C1021Xq r24 = new C1021Xq(this.f967b);
        C1301cz r32 = this.f968c;
        if (r32 == null) goto L20;
        r24.m1929o(r32);
    L20:
        C0686Py r33 = this.f969d;
        if (r33 == null) goto L23;
        r24.m1926l(r33);
    L23:
        r24.setTint(0);
        float r4 = this.f976k;
        if (this.f982q == false) goto L26;
        int r5 = AbstractC0295Gu.m621n(r14, R.attr.colorSurface);
    L27:
        r24.f3241b.f2912k = r4;
        r24.invalidateSelf();
        ColorStateList r42 = ColorStateList.valueOf(r5);
        C0935Vq r52 = r24.f3241b;
        if (r52.f2906e == r42) goto L30;
        r52.f2906e = r42;
        r24.onStateChange(r24.getState());
    L30:
        C1021Xq r43 = new C1021Xq(this.f967b);
        this.f981p = r43;
        C1301cz r53 = this.f968c;
        if (r53 == null) goto L33;
        r43.m1929o(r53);
    L33:
        C0686Py r44 = this.f969d;
        if (r44 == null) goto L36;
        this.f981p.m1926l(r44);
    L36:
        this.f981p.setTint(-1);
        ColorStateList r54 = this.f980o;
        if (r54 != null) goto L40;
        r54 = ColorStateList.valueOf(0);
    L40:
        RippleDrawable r45 = new RippleDrawable(r54, new InsetDrawable(new LayerDrawable(new Drawable[]{r24, r0}), this.f971f, this.f973h, this.f972g, this.f974i), this.f981p);
        this.f987v = r45;
        r14.setInternalBackground(r45);
        C1021Xq r02 = m586a(false);
        if (r02 == null) goto L44;
        r02.m1927m(this.f988w);
        r02.setState(r14.getDrawableState());
        return;
    L44:
        return;
    L26:
        r5 = 0;
        goto L27
    }

    /* JADX INFO: renamed from: d */
    public final void m589d() {
        C1021Xq r0 = m586a(false);
        if (r0 == null) goto L11;
        C1301cz r1 = this.f968c;
        if (r1 == null) goto L7;
        r0.m1929o(r1);
    L8:
        C0686Py r12 = this.f969d;
        if (r12 == null) goto L11;
        r0.m1926l(r12);
        goto L11
    L7:
        r0.setShapeAppearanceModel(this.f967b);
    L11:
        C1021Xq r13 = m586a(true);
        if (r13 == null) goto L20;
        C1301cz r2 = this.f968c;
        if (r2 == null) goto L16;
        r13.m1929o(r2);
    L17:
        C0686Py r22 = this.f969d;
        if (r22 == null) goto L20;
        r13.m1926l(r22);
        goto L20
    L16:
        r13.setShapeAppearanceModel(this.f967b);
    L20:
        RippleDrawable r14 = this.f987v;
        if (r14 != null) goto L23;
    L28:
        InterfaceC1300cy r02 = null;
    L29:
        if (r02 == null) goto L39;
        r02.setShapeAppearanceModel(this.f967b);
        if ((r02 instanceof C1021Xq) == false) goto L40;
        C1021Xq r03 = (C1021Xq) r02;
        C1301cz r15 = this.f968c;
        if (r15 == null) goto L35;
        r03.m1929o(r15);
    L35:
        C0686Py r16 = this.f969d;
        if (r16 == null) goto L41;
        r03.m1926l(r16);
        return;
    L41:
        return;
    L40:
        return;
    L39:
        return;
    L23:
        if (r14.getNumberOfLayers() <= 1) goto L28;
        if (this.f987v.getNumberOfLayers() <= 2) goto L27;
        r02 = (InterfaceC1300cy) this.f987v.getDrawable(2);
        goto L29
    L27:
        r02 = (InterfaceC1300cy) this.f987v.getDrawable(1);
        goto L29
    }

    /* JADX INFO: renamed from: e */
    public final void m590e() {
        int r0 = 0;
        C1021Xq r1 = m586a(false);
        C1021Xq r2 = m586a(true);
        if (r1 == null) goto L15;
        float r3 = this.f976k;
        ColorStateList r4 = this.f979n;
        r1.f3241b.f2912k = r3;
        r1.invalidateSelf();
        C0935Vq r32 = r1.f3241b;
        if (r32.f2906e == r4) goto L7;
        r32.f2906e = r4;
        r1.onStateChange(r1.getState());
    L7:
        if (r2 == null) goto L16;
        float r12 = this.f976k;
        if (this.f982q == false) goto L11;
        r0 = AbstractC0295Gu.m621n(this.f966a, R.attr.colorSurface);
    L11:
        r2.f3241b.f2912k = r12;
        r2.invalidateSelf();
        ColorStateList r02 = ColorStateList.valueOf(r0);
        C0935Vq r13 = r2.f3241b;
        if (r13.f2906e == r02) goto L17;
        r13.f2906e = r02;
        r2.onStateChange(r2.getState());
        return;
    L17:
        return;
    L16:
        return;
    }
}
