package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class za {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public final boolean D;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final Rect c;
    public CharSequence c0;
    public final Rect d;
    public final int d0;
    public final RectF e;
    public final float e0;
    public int f;
    public final int f0;
    public int g;
    public float h;
    public float i;
    public ColorStateList j;
    public ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public g8 y;
    public final TextUtils.TruncateAt z;

    public za(TextInputLayout r3) {
        this.f = 16;
        this.g = 16;
        this.h = 15.0f;
        this.i = 15.0f;
        this.z = TextUtils.TruncateAt.END;
        this.D = true;
        this.d0 = 1;
        this.e0 = 1.0f;
        this.f0 = 1;
        this.a = r3;
        TextPaint r0 = new TextPaint(129);
        this.N = r0;
        this.O = new TextPaint(r0);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        g(r3.getContext().getResources().getConfiguration());
    }

    public static int a(float r5, int r6, int r7) {
        float r0 = 1.0f - r5;
        return Color.argb(Math.round((Color.alpha(r7) * r5) + (Color.alpha(r6) * r0)), Math.round((Color.red(r7) * r5) + (Color.red(r6) * r0)), Math.round((Color.green(r7) * r5) + (Color.green(r6) * r0)), Math.round((Color.blue(r7) * r5) + (Color.blue(r6) * r0)));
    }

    public static float f(float r0, float r1, float r2, TimeInterpolator r3) {
        if (r3 == null) goto L5;
        r2 = r3.getInterpolation(r2);
    L5:
        return q2.a(r0, r1, r2);
    }

    public final boolean b(CharSequence r3) {
        WeakHashMap r0 = ja0.a;
        boolean r1 = true;
        if (t90.d(this.a) == 1) goto L7;
        r1 = false;
    L7:
        if (this.D == false) goto L13;
        if (r1 == false) goto L10;
        r7 r02 = b60.d;
    L12:
        return r02.b(r3, r3.length());
    L10:
        r02 = b60.c;
        goto L12
    L13:
        return r1;
    }

    public final void c(float r11, boolean r12) {
        if (this.A == null) goto L80;
        float r0 = this.d.width();
        float r1 = this.c.width();
        if (Math.abs(r11 - 1.0f) >= 1.0E-5f) goto L8;
        float r112 = this.i;
        float r122 = this.V;
        this.F = 1.0f;
        Typeface r13 = this.r;
    L19:
        TextPaint r4 = this.N;
        if (r0 > 0.0f) goto L22;
        boolean r3 = false;
    L55:
        if (this.B == null) goto L59;
        if (r3 == true) goto L59;
        return;
    L59:
        r4.setTextSize(this.G);
        r4.setTypeface(this.x);
        r4.setLetterSpacing(this.X);
        boolean r113 = b(this.A);
        this.C = r113;
        int r123 = this.d0;
        if (r123 <= 1) goto L62;
        if (r113 == true) goto L62;
    L63:
        if (r123 != 1) goto L65;
        Layout.Alignment r14 = Layout.Alignment.ALIGN_NORMAL;
    L78:
        t40 r32 = new t40(this.A, r4, (int) r0);
        r32.k = this.z;
        r32.j = r113;
        r32.e = r14;
        r32.i = false;
        r32.f = r123;
        r32.g = this.e0;
        r32.h = this.f0;
        StaticLayout r114 = r32.a();
        r114.getClass();
        this.Y = r114;
        this.B = r114.getText();
        return;
    L65:
        int r15 = Gravity.getAbsoluteGravity(this.f, r113 ? 1 : 0) & 7;
        if (r15 != 1) goto L68;
        r14 = Layout.Alignment.ALIGN_CENTER;
        goto L78
    L68:
        if (r15 == 5) goto L74;
        if (this.C == false) goto L72;
        r14 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L78
    L72:
        r14 = Layout.Alignment.ALIGN_NORMAL;
        goto L78
    L74:
        if (this.C == false) goto L76;
        r14 = Layout.Alignment.ALIGN_NORMAL;
        goto L78
    L76:
        r14 = Layout.Alignment.ALIGN_OPPOSITE;
    L62:
        r123 = 1;
        goto L63
    L22:
        if (this.G == r112) goto L24;
        boolean r33 = true;
    L26:
        if (this.X == r122) goto L28;
        boolean r7 = true;
    L30:
        if (this.x == r13) goto L32;
        boolean r8 = true;
    L34:
        if (this.Y != null) goto L36;
    L38:
        boolean r9 = false;
    L39:
        if (r33 == true) goto L47;
        if (r7 == true) goto L47;
        if (r9 == true) goto L47;
        if (r8 == true) goto L47;
        if (this.M == true) goto L47;
        boolean r34 = false;
    L48:
        this.G = r112;
        this.X = r122;
        this.x = r13;
        this.M = false;
        if (this.F == 1.0f) goto L51;
        boolean r115 = true;
    L52:
        r4.setLinearText(r115);
        r3 = r34;
        goto L55
    L51:
        r115 = false;
    L47:
        r34 = true;
        goto L48
    L36:
        if (r0 == r9.getWidth()) goto L38;
        r9 = true;
        goto L39
    L32:
        r8 = false;
        goto L34
    L28:
        r7 = false;
        goto L30
    L24:
        r33 = false;
        goto L26
    L8:
        float r35 = this.h;
        float r6 = this.W;
        Typeface r72 = this.u;
        if (Math.abs(r11 - 0.0f) >= 1.0E-5f) goto L11;
        this.F = 1.0f;
    L12:
        float r116 = this.i / this.h;
        float r42 = r1 * r116;
        if (r12 == false) goto L15;
    L18:
        r0 = r1;
    L17:
        r112 = r35;
        r122 = r6;
        r13 = r72;
        goto L19
    L15:
        if (r42 <= r0) goto L18;
        r0 = Math.min(r0 / r116, r1);
        goto L17
    L11:
        this.F = f(this.h, this.i, r11, this.Q) / this.h;
        goto L12
    }

    public final float d() {
        float r0 = this.i;
        TextPaint r1 = this.O;
        r1.setTextSize(r0);
        r1.setTypeface(this.r);
        r1.setLetterSpacing(this.V);
        return -r1.ascent();
    }

    public final int e(ColorStateList r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int[] r1 = this.L;
        if (r1 == null) goto L10;
        return r3.getColorForState(r1, 0);
    L10:
        return r3.getDefaultColor();
    }

    public final void g(Configuration r3) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        Typeface r0 = this.t;
        if (r0 == null) goto L7;
        this.s = zt.G(r3, r0);
    L7:
        Typeface r02 = this.w;
        if (r02 == null) goto L10;
        this.v = zt.G(r3, r02);
    L10:
        Typeface r32 = this.s;
        if (r32 != null) goto L14;
        r32 = this.t;
    L14:
        this.r = r32;
        Typeface r33 = this.v;
        if (r33 != null) goto L18;
        r33 = this.w;
    L18:
        this.u = r33;
        h(true);
        return;
    }

    public final void h(boolean r19) {
        TextInputLayout r2 = this.a;
        if (r2.getHeight() > 0) goto L5;
    L6:
        if (r19 == false) goto L69;
    L7:
        c(1.0f, r19);
        CharSequence r4 = this.B;
        TextPaint r5 = this.N;
        if (r4 != null) goto L10;
    L12:
        CharSequence r42 = this.c0;
        if (r42 == null) goto L15;
        this.Z = r5.measureText(r42, 0, r42.length());
    L16:
        int r43 = Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
        int r8 = r43 & 112;
        Rect r9 = this.d;
        if (r8 == 48) goto L21;
        if (r8 == 80) goto L20;
        this.m = r9.centerY() - ((r5.descent() - r5.ascent()) / 2.0f);
    L22:
        int r44 = r43 & 8388615;
        if (r44 == 1) goto L27;
        if (r44 == 5) goto L26;
        this.o = r9.left;
    L28:
        c(0.0f, r19);
        StaticLayout r1 = this.Y;
        if (r1 == null) goto L31;
        float r12 = r1.getHeight();
    L32:
        StaticLayout r45 = this.Y;
        if (r45 != null) goto L35;
    L37:
        CharSequence r46 = this.B;
        if (r46 == null) goto L40;
        float r47 = r5.measureText(r46, 0, r46.length());
    L41:
        StaticLayout r15 = this.Y;
        if (r15 == null) goto L44;
        r15.getLineCount();
    L44:
        int r82 = Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
        int r152 = r82 & 112;
        Rect r122 = this.c;
        if (r152 == 48) goto L49;
        if (r152 == 80) goto L48;
        this.l = r122.centerY() - (r12 / 2.0f);
    L50:
        int r13 = r82 & 8388615;
        if (r13 == 1) goto L55;
        if (r13 == 5) goto L54;
        this.n = r122.left;
    L56:
        Bitmap r14 = this.E;
        if (r14 == null) goto L59;
        r14.recycle();
        this.E = null;
    L59:
        l(this.b);
        float r16 = this.b;
        float r48 = f(r122.left, r9.left, r16, this.P);
        RectF r83 = this.e;
        r83.left = r48;
        r83.top = f(this.l, this.m, r16, this.P);
        r83.right = f(r122.right, r9.right, r16, this.P);
        r83.bottom = f(r122.bottom, r9.bottom, r16, this.P);
        this.p = f(this.n, this.o, r16, this.P);
        this.q = f(this.l, this.m, r16, this.P);
        l(r16);
        tj r84 = q2.b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - r16, r84);
        WeakHashMap r49 = ja0.a;
        s90.k(r2);
        this.b0 = f(1.0f, 0.0f, r16, r84);
        s90.k(r2);
        ColorStateList r3 = this.k;
        ColorStateList r410 = this.j;
        if (r3 == r410) goto L62;
        r5.setColor(a(r16, e(r410), e(this.k)));
    L63:
        float r32 = this.V;
        float r411 = this.W;
        if (r32 == r411) goto L66;
        r5.setLetterSpacing(f(r411, r32, r16, r84));
    L67:
        this.H = q2.a(0.0f, this.R, r16);
        this.I = q2.a(0.0f, this.S, r16);
        this.J = q2.a(0.0f, this.T, r16);
        int r17 = a(r16, 0, e(this.U));
        this.K = r17;
        r5.setShadowLayer(this.H, this.I, this.J, r17);
        s90.k(r2);
        return;
    L66:
        r5.setLetterSpacing(r32);
        goto L67
    L62:
        r5.setColor(e(r3));
        goto L63
    L54:
        this.n = r122.right - r47;
        goto L56
    L55:
        this.n = r122.centerX() - (r47 / 2.0f);
        goto L56
    L48:
        this.l = r5.descent() + (r122.bottom - r12);
        goto L50
    L49:
        this.l = r122.top;
        goto L50
    L40:
        r47 = 0.0f;
        goto L41
    L35:
        if (this.d0 <= 1) goto L37;
        r47 = r45.getWidth();
        goto L41
    L31:
        r12 = 0.0f;
        goto L32
    L26:
        this.o = r9.right - this.Z;
        goto L28
    L27:
        this.o = r9.centerX() - (this.Z / 2.0f);
        goto L28
    L20:
        this.m = r5.ascent() + r9.bottom;
        goto L22
    L21:
        this.m = r9.top;
        goto L22
    L15:
        this.Z = 0.0f;
        goto L16
    L10:
        if (this.Y == null) goto L12;
        this.c0 = TextUtils.ellipsize(r4, r5, r6.getWidth(), this.z);
        goto L12
    L69:
        return;
    L5:
        if (r2.getWidth() > 0) goto L7;
        goto L6
    }

    public final void i(ColorStateList r2) {
        if (this.k == r2) goto L5;
    L8:
        this.k = r2;
        this.j = r2;
        h(false);
        return;
    L5:
        if (this.j != r2) goto L8;
    }

    public final boolean j(Typeface r3) {
        g8 r0 = this.y;
        if (r0 == null) goto L6;
        r0.c = true;
    L6:
        if (this.t == r3) goto L12;
        this.t = r3;
        Typeface r32 = zt.G(this.a.getContext().getResources().getConfiguration(), r3);
        this.s = r32;
        if (r32 != null) goto L10;
        r32 = this.t;
    L10:
        this.r = r32;
        return true;
    L12:
        return false;
    }

    public final void k(float r9) {
        if (r9 >= 0.0f) goto L6;
        r9 = 0.0f;
    L9:
        if (r9 == this.b) goto L20;
        this.b = r9;
        float r3 = this.c.left;
        Rect r4 = this.d;
        float r32 = f(r3, r4.left, r9, this.P);
        RectF r5 = this.e;
        r5.left = r32;
        r5.top = f(this.l, this.m, r9, this.P);
        r5.right = f(r1.right, r4.right, r9, this.P);
        r5.bottom = f(r1.bottom, r4.bottom, r9, this.P);
        this.p = f(this.n, this.o, r9, this.P);
        this.q = f(this.l, this.m, r9, this.P);
        l(r9);
        tj r33 = q2.b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - r9, r33);
        WeakHashMap r1 = ja0.a;
        TextInputLayout r12 = this.a;
        s90.k(r12);
        this.b0 = f(1.0f, 0.0f, r9, r33);
        s90.k(r12);
        ColorStateList r2 = this.k;
        ColorStateList r42 = this.j;
        TextPaint r52 = this.N;
        if (r2 == r42) goto L13;
        r52.setColor(a(r9, e(r42), e(this.k)));
    L14:
        float r22 = this.V;
        float r43 = this.W;
        if (r22 == r43) goto L17;
        r52.setLetterSpacing(f(r43, r22, r9, r33));
    L18:
        this.H = q2.a(0.0f, this.R, r9);
        this.I = q2.a(0.0f, this.S, r9);
        this.J = q2.a(0.0f, this.T, r9);
        int r92 = a(r9, 0, e(this.U));
        this.K = r92;
        r52.setShadowLayer(this.H, this.I, this.J, r92);
        s90.k(r12);
        return;
    L17:
        r52.setLetterSpacing(r22);
        goto L18
    L13:
        r52.setColor(e(r2));
        goto L14
    L20:
        return;
    L6:
        if (r9 <= 1.0f) goto L9;
        r9 = 1.0f;
        goto L9
    }

    public final void l(float r2) {
        c(r2, false);
        WeakHashMap r22 = ja0.a;
        s90.k(this.a);
    }

    public final void m(Typeface r4) {
        boolean r0 = j(r4);
        if (this.w == r4) goto L8;
        this.w = r4;
        Typeface r42 = zt.G(this.a.getContext().getResources().getConfiguration(), r4);
        this.v = r42;
        if (r42 != null) goto L7;
        r42 = this.w;
    L7:
        this.u = r42;
        boolean r43 = true;
    L9:
        if (r0 == true) goto L13;
        if (r43 == true) goto L13;
        return;
    L13:
        h(false);
        return;
    L8:
        r43 = false;
        goto L9
    }
}
