package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {
    public final TextView a;
    public y60 b;
    public y60 c;
    public y60 d;
    public y60 e;
    public y60 f;
    public y60 g;
    public y60 h;
    public final n5 i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public d5(TextView r2) {
        this.j = 0;
        this.k = -1;
        this.a = r2;
        this.i = new n5(r2);
    }

    public static y60 c(Context r1, u3 r2, int r3) {
        monitor-enter(r2);
        ColorStateList r12 = r2.a.f(r1, r3);     // Catch: Throwable -> L10
        monitor-exit(r2);
        if (r12 == null) goto L8;
        y60 r22 = new y60();
        r22.d = true;
        r22.a = r12;
        return r22;
    L8:
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    public static void h(EditorInfo r10, InputConnection r11, TextView r12) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L55;
        if (r11 == null) goto L56;
        CharSequence r112 = r12.getText();
        if (r0 < 30) goto L9;
        wh.a(r10, r112);
        return;
    L9:
        r112.getClass();
        if (r0 < 30) goto L13;
        wh.a(r10, r112);
        return;
    L13:
        int r122 = r10.initialSelStart;
        int r02 = r10.initialSelEnd;
        if (r122 <= r02) goto L16;
        int r1 = r02;
    L17:
        if (r122 > r02) goto L20;
        r122 = r02;
    L20:
        int r03 = r112.length();
        if (r1 < 0) goto L53;
        if (r122 > r03) goto L53;
        int r4 = r10.inputType & 4095;
        if (r4 != 129) goto L27;
    L51:
        ff.N(r10, null, 0, 0);
        return;
    L27:
        if (r4 == 225) goto L51;
        if (r4 == 18) goto L51;
        if (r03 > 2048) goto L35;
        ff.N(r10, r112, r1, r122);
        return;
    L35:
        int r04 = r122 - r1;
        if (r04 <= 1024) goto L38;
        int r3 = 0;
    L39:
        int r5 = 2048 - r3;
        int r42 = Math.min(r112.length() - r122, r5 - Math.min(r1, (int) (((double) r5) * 0.8d)));
        int r52 = Math.min(r1, r5 - r42);
        int r13 = r1 - r52;
        if (Character.isLowSurrogate(r112.charAt(r13)) == false) goto L43;
        r13 = r13 + 1;
        r52 = r52 - 1;
    L43:
        if (Character.isHighSurrogate(r112.charAt((r122 + r42) - 1)) == false) goto L45;
        r42 = r42 - 1;
    L45:
        int r6 = r52 + r3;
        int r8 = r6 + r42;
        if (r3 == r04) goto L48;
        CharSequence r113 = TextUtils.concat(new CharSequence[]{r112.subSequence(r13, r13 + r52), r112.subSequence(r122, r42 + r122)});
    L49:
        ff.N(r10, r113, r52, r6);
        return;
    L48:
        r113 = r112.subSequence(r13, r8 + r13);
        goto L49
    L38:
        r3 = r04;
    L53:
        ff.N(r10, null, 0, 0);
        return;
    L16:
        r1 = r122;
        goto L17
    L56:
        return;
    }

    public final void a(Drawable r2, y60 r3) {
        if (r2 == null) goto L6;
        if (r3 == null) goto L7;
        u3.e(r2, r3, this.a.getDrawableState());
        return;
    L7:
        return;
    }

    public final void b() {
        y60 r0 = this.b;
        TextView r3 = this.a;
        if (r0 == null) goto L5;
    L10:
        Drawable[] r02 = r3.getCompoundDrawables();
        a(r02[0], this.b);
        a(r02[1], this.c);
        a(r02[2], this.d);
        a(r02[3], this.e);
    L12:
        if (this.f == null) goto L14;
    L17:
        Drawable[] r03 = z4.a(r3);
        a(r03[0], this.f);
        a(r03[2], this.g);
        return;
    L14:
        if (this.g != null) goto L17;
        return;
    L5:
        if (this.c != null) goto L10;
        if (this.d != null) goto L10;
        if (this.e == null) goto L12;
        goto L10
    }

    public final ColorStateList d() {
        y60 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    public final PorterDuff.Mode e() {
        y60 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b;
    }

    public final void f(AttributeSet r27, int r28) {
        TextView r1 = this.a;
        Context r7 = r1.getContext();
        u3 r8 = u3.a();
        int[] r3 = xy.h;
        r5 r9 = r5.y(r7, r27, r3, r28);
        ja0.k(r1, r1.getContext(), r3, r27, (TypedArray) r9.b, r28);
        TypedArray r12 = (TypedArray) r9.b;
        int r2 = r12.getResourceId(0, -1);
        if (r12.hasValue(3) == false) goto L6;
        this.b = c(r7, r8, r12.getResourceId(3, 0));
    L6:
        if (r12.hasValue(1) == false) goto L9;
        this.c = c(r7, r8, r12.getResourceId(1, 0));
    L9:
        if (r12.hasValue(4) == false) goto L12;
        this.d = c(r7, r8, r12.getResourceId(4, 0));
    L12:
        if (r12.hasValue(2) == false) goto L14;
        this.e = c(r7, r8, r12.getResourceId(2, 0));
    L14:
        int r5 = Build.VERSION.SDK_INT;
        if (r12.hasValue(5) == false) goto L18;
        this.f = c(r7, r8, r12.getResourceId(5, 0));
    L18:
        if (r12.hasValue(6) == false) goto L20;
        this.g = c(r7, r8, r12.getResourceId(6, 0));
    L20:
        r9.z();
        boolean r13 = r1.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] r92 = xy.w;
        if (r2 == (-1)) goto L37;
        TypedArray r22 = r7.obtainStyledAttributes(r2, r92);
        r5 r132 = new r5(r7, r22);
        if (r13 == false) goto L25;
    L27:
        boolean r222 = false;
        boolean r23 = false;
    L28:
        n(r7, r132);
        if (r22.hasValue(15) == false) goto L31;
        String r24 = r22.getString(15);
    L33:
        if (r22.hasValue(13) == false) goto L35;
        String r25 = r22.getString(13);
    L36:
        r132.z();
    L38:
        TypedArray r93 = r7.obtainStyledAttributes(r27, r92, r28, 0);
        r5 r133 = new r5(r7, r93);
        if (r13 == false) goto L41;
    L43:
        boolean r32 = r23;
        if (r93.hasValue(15) == false) goto L47;
        r24 = r93.getString(15);
    L47:
        if (r93.hasValue(13) == false) goto L50;
        r25 = r93.getString(13);
    L50:
        if (r5 >= 28) goto L52;
    L56:
        n(r7, r133);
        r133.z();
        if (r13 == true) goto L60;
        if (r222 == false) goto L60;
        r1.setAllCaps(r32);
    L60:
        Typeface r14 = this.l;
        if (r14 != null) goto L63;
    L66:
        if (r25 == null) goto L68;
        b5.d(r1, r25);
    L68:
        if (r24 == null) goto L70;
        a5.b(r1, a5.a(r24));
    L70:
        n5 r94 = this.i;
        Context r134 = r94.j;
        int[] r33 = xy.i;
        TypedArray r52 = r134.obtainStyledAttributes(r27, r33, r28, 0);
        TextView r15 = r94.i;
        ja0.k(r15, r15.getContext(), r33, r27, r52, r28);
        if (r52.hasValue(5) == false) goto L74;
        r94.a = r52.getInt(5, 0);
    L74:
        if (r52.hasValue(4) == false) goto L76;
        float r16 = r52.getDimension(4, -1.0f);
    L78:
        if (r52.hasValue(2) == false) goto L81;
        float r26 = r52.getDimension(2, -1.0f);
    L83:
        if (r52.hasValue(1) == false) goto L86;
        float r20 = r52.getDimension(1, -1.0f);
    L88:
        if (r52.hasValue(3) == false) goto L98;
        int r6 = r52.getResourceId(3, 0);
        if (r6 <= 0) goto L98;
        TypedArray r62 = r52.getResources().obtainTypedArray(r6);
        int r142 = r62.length();
        int[] r11 = new int[r142];
        if (r142 <= 0) goto L97;
        int r152 = 0;
    L94:
        if (r152 >= r142) goto L96;
        r11[r152] = r62.getDimensionPixelSize(r152, -1);
        r152 = r152 + 1;
        goto L94
    L96:
        r94.f = n5.b(r11);
        r94.i();
    L97:
        r62.recycle();
    L98:
        r52.recycle();
        if (r94.j() == true) goto L101;
        r94.a = 0;
    L118:
        if (cb0.b == true) goto L120;
    L127:
        TypedArray r17 = r7.obtainStyledAttributes(r27, r33);
        int r29 = r17.getResourceId(8, -1);
        if (r29 == (-1)) goto L131;
        Drawable r210 = r8.b(r7, r29);
    L132:
        int r34 = r17.getResourceId(13, -1);
        if (r34 == (-1)) goto L135;
        Drawable r35 = r8.b(r7, r34);
    L136:
        int r4 = r17.getResourceId(9, -1);
        if (r4 == (-1)) goto L140;
        Drawable r42 = r8.b(r7, r4);
    L141:
        int r53 = r17.getResourceId(6, -1);
        if (r53 == (-1)) goto L144;
        Drawable r54 = r8.b(r7, r53);
    L145:
        int r95 = r17.getResourceId(10, -1);
        if (r95 == (-1)) goto L148;
        Drawable r96 = r8.b(r7, r95);
    L149:
        int r112 = r17.getResourceId(7, -1);
        if (r112 == (-1)) goto L152;
        Drawable r82 = r8.b(r7, r112);
    L153:
        if (r96 != null) goto L187;
        if (r82 != null) goto L187;
        if (r210 != null) goto L160;
        if (r35 != null) goto L160;
        if (r42 != null) goto L160;
        if (r54 != null) goto L160;
    L202:
        if (r17.hasValue(11) == false) goto L213;
        if (r17.hasValue(11) == false) goto L210;
        int r36 = r17.getResourceId(11, 0);
        if (r36 == 0) goto L210;
        ColorStateList r37 = ip.v(r7, r36);
        if (r37 == null) goto L210;
    L211:
        l60.f(r1, r37);
    L210:
        r37 = r17.getColorStateList(11);
    L213:
        if (r17.hasValue(12) == false) goto L215;
        l60.g(r1, eh.b(r17.getInt(12, -1), null));
    L215:
        int r211 = r17.getDimensionPixelSize(15, -1);
        int r38 = r17.getDimensionPixelSize(18, -1);
        int r43 = r17.getDimensionPixelSize(19, -1);
        r17.recycle();
        if (r211 == (-1)) goto L218;
        zt.L(r1, r211);
    L218:
        if (r38 == (-1)) goto L220;
        zt.M(r1, r38);
    L220:
        if (r43 == (-1)) goto L226;
        zt.e(r43);
        if (r43 == r1.getPaint().getFontMetricsInt(null)) goto L227;
        r1.setLineSpacing(r43 - r1, 1.0f);
        return;
    L227:
        return;
    L226:
        return;
    L160:
        Drawable[] r83 = z4.a(r1);
        Drawable r97 = r83[0];
        if (r97 == null) goto L163;
    L179:
        if (r35 != null) goto L182;
        r35 = r83[1];
    L182:
        Drawable r212 = r83[2];
        if (r54 != null) goto L186;
        r54 = r83[3];
    L186:
        z4.b(r1, r97, r35, r212, r54);
        goto L202
    L163:
        if (r83[2] != null) goto L179;
        Drawable[] r84 = r1.getCompoundDrawables();
        if (r210 != null) goto L169;
        r210 = r84[0];
    L169:
        if (r35 != null) goto L172;
        r35 = r84[1];
    L172:
        if (r42 != null) goto L175;
        r42 = r84[2];
    L175:
        if (r54 != null) goto L178;
        r54 = r84[3];
    L178:
        r1.setCompoundDrawablesWithIntrinsicBounds(r210, r35, r42, r54);
    L187:
        Drawable[] r213 = z4.a(r1);
        if (r96 != null) goto L191;
        r96 = r213[0];
    L191:
        if (r35 != null) goto L194;
        r35 = r213[1];
    L194:
        if (r82 != null) goto L197;
        r82 = r213[2];
    L197:
        if (r54 != null) goto L200;
        r54 = r213[3];
    L200:
        z4.b(r1, r96, r35, r82, r54);
        goto L202
    L152:
        r82 = null;
        goto L153
    L148:
        r96 = null;
        goto L149
    L144:
        r54 = null;
        goto L145
    L140:
        r42 = null;
        goto L141
    L135:
        r35 = null;
        goto L136
    L131:
        r210 = null;
        goto L132
    L120:
        if (r94.a == 0) goto L127;
        int[] r18 = r94.f;
        if (r18.length <= 0) goto L127;
        if (b5.a(r1) == (-1.0f)) goto L126;
        b5.b(r1, Math.round(r94.d), Math.round(r94.e), Math.round(r94.c), 0);
        goto L127
    L126:
        b5.c(r1, r18, 0);
        goto L127
    L101:
        if (r94.a != 1) goto L118;
        if (r94.g == true) goto L115;
        DisplayMetrics r55 = r134.getResources().getDisplayMetrics();
        if (r26 != (-1.0f)) goto L107;
        int r153 = 2;
        r26 = TypedValue.applyDimension(2, 12.0f, r55);
    L109:
        if (r20 != (-1.0f)) goto L111;
        r20 = TypedValue.applyDimension(r153, 112.0f, r55);
    L111:
        float r56 = r20;
        if (r16 != (-1.0f)) goto L114;
        r16 = 1.0f;
    L114:
        r94.k(r26, r56, r16);
        goto L115
    L107:
        r153 = 2;
    L115:
        r94.h();
        goto L118
    L86:
        r20 = -1.0f;
        goto L88
    L81:
        r26 = -1.0f;
        goto L83
    L76:
        r16 = -1.0f;
        goto L78
    L63:
        if (this.k != (-1)) goto L65;
        r1.setTypeface(r14, this.j);
        goto L66
    L65:
        r1.setTypeface(r14);
        goto L66
    L52:
        if (r93.hasValue(0) == false) goto L56;
        if (r93.getDimensionPixelSize(0, -1) != 0) goto L56;
        r1.setTextSize(0, 0.0f);
        goto L56
    L41:
        if (r93.hasValue(14) == false) goto L43;
        r23 = r93.getBoolean(14, false);
        r222 = true;
        goto L43
    L35:
        r25 = null;
        goto L36
    L31:
        r24 = null;
        goto L33
    L25:
        if (r22.hasValue(14) == false) goto L27;
        r23 = r22.getBoolean(14, false);
        r222 = true;
        goto L28
    L37:
        r222 = false;
        r23 = false;
        r25 = null;
        r24 = null;
        goto L38
    }

    public final void g(Context r6, int r7) {
        TypedArray r72 = r6.obtainStyledAttributes(r7, xy.w);
        r5 r0 = new r5(r6, r72);
        boolean r2 = r72.hasValue(14);
        TextView r3 = this.a;
        if (r2 == false) goto L6;
        r3.setAllCaps(r72.getBoolean(14, false));
    L6:
        if (r72.hasValue(0) == true) goto L8;
    L10:
        n(r6, r0);
        if (r72.hasValue(13) == false) goto L15;
        String r62 = r72.getString(13);
        if (r62 == null) goto L15;
        b5.d(r3, r62);
    L15:
        r0.z();
        Typeface r63 = this.l;
        if (r63 == null) goto L19;
        r3.setTypeface(r63, this.j);
        return;
    L19:
        return;
    L8:
        if (r72.getDimensionPixelSize(0, -1) != 0) goto L10;
        r3.setTextSize(0, 0.0f);
        goto L10
    }

    public final void i(int r3, int r4, int r5, int r6) {
        n5 r0 = this.i;
        if (r0.j() == false) goto L8;
        DisplayMetrics r1 = r0.j.getResources().getDisplayMetrics();
        r0.k(TypedValue.applyDimension(r6, r3, r1), TypedValue.applyDimension(r6, r4, r1), TypedValue.applyDimension(r6, r5, r1));
        if (r0.h() == false) goto L9;
        r0.a();
        return;
    L9:
        return;
    }

    public final void j(int[] r7, int r8) {
        n5 r0 = this.i;
        if (r0.j() == false) goto L23;
        int r1 = r7.length;
        int r2 = 0;
        if (r1 <= 0) goto L17;
        int[] r3 = new int[r1];
        if (r8 != 0) goto L9;
        r3 = Arrays.copyOf(r7, r1);
    L12:
        r0.f = n5.b(r3);
        if (r0.i() == true) goto L19;
        throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(r7));
    L19:
        if (r0.h() == false) goto L24;
        r0.a();
        return;
    L24:
        return;
    L9:
        DisplayMetrics r4 = r0.j.getResources().getDisplayMetrics();
    L10:
        if (r2 >= r1) goto L12;
        r3[r2] = Math.round(TypedValue.applyDimension(r8, r7[r2], r4));
        r2 = r2 + 1;
        goto L10
    L17:
        r0.g = false;
        goto L19
    }

    public final void k(int r5) {
        n5 r0 = this.i;
        if (r0.j() == false) goto L15;
        if (r5 != 0) goto L6;
        r0.a = 0;
        r0.d = -1.0f;
        r0.e = -1.0f;
        r0.c = -1.0f;
        r0.f = new int[0];
        r0.b = false;
        return;
    L6:
        if (r5 != 1) goto L12;
        DisplayMetrics r52 = r0.j.getResources().getDisplayMetrics();
        r0.k(TypedValue.applyDimension(2, 12.0f, r52), TypedValue.applyDimension(2, 112.0f, r52), 1.0f);
        if (r0.h() == false) goto L16;
        r0.a();
        return;
    L16:
        return;
    L12:
        throw new IllegalArgumentException("Unknown auto-size text type: " + r5);
    }

    public final void l(ColorStateList r2) {
        if (this.h != null) goto L5;
        this.h = new y60();
    L5:
        y60 r0 = this.h;
        r0.a = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r0.d = r22;
        this.b = r0;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        this.f = r0;
        this.g = r0;
        return;
    L8:
        r22 = false;
        goto L9
    }

    public final void m(PorterDuff.Mode r2) {
        if (this.h != null) goto L5;
        this.h = new y60();
    L5:
        y60 r0 = this.h;
        r0.b = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r0.c = r22;
        this.b = r0;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        this.f = r0;
        this.g = r0;
        return;
    L8:
        r22 = false;
        goto L9
    }

    public final void n(Context r12, r5 r13) {
        int r0 = this.j;
        TypedArray r1 = (TypedArray) r13.b;
        this.j = r1.getInt(2, r0);
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 28) goto L7;
        int r5 = r1.getInt(11, -1);
        this.k = r5;
        if (r5 == (-1)) goto L7;
        this.j &= 2;
    L7:
        int r52 = 10;
        boolean r8 = false;
        if (r1.hasValue(10) == false) goto L10;
    L26:
        this.l = null;
        if (r1.hasValue(12) == false) goto L29;
        r52 = 12;
    L29:
        int r6 = this.k;
        int r7 = this.j;
        if (r12.isRestricted() == true) goto L49;
        Typeface r122 = r13.o(r52, this.j, new x4(this, r6, r7, new WeakReference(this.a)));     // Catch: Throwable -> L62
        if (r122 == null) goto L44;
        if (r02 >= 28) goto L36;
    L42:
        this.l = r122;     // Catch: Throwable -> L62
        goto L44
    L36:
        if (this.k == (-1)) goto L42;
        Typeface r123 = Typeface.create(r122, 0);     // Catch: Throwable -> L62
        int r132 = this.k;     // Catch: Throwable -> L62
        if ((this.j & 2) == 0) goto L40;
        boolean r03 = true;
    L41:
        this.l = c5.a(r123, r132, r03);     // Catch: Throwable -> L62
        goto L44
    L40:
        r03 = false;
    L44:
        if (this.l != null) goto L46;
        boolean r124 = true;
    L47:
        this.m = r124;     // Catch: Throwable -> L62
        goto L49
    L46:
        r124 = false;
    L49:
        if (this.l != null) goto L66;
        String r125 = r1.getString(r52);
        if (r125 != null) goto L53;
        return;
    L53:
        if (Build.VERSION.SDK_INT >= 28) goto L55;
    L60:
        this.l = Typeface.create(r125, this.j);
        return;
    L55:
        if (this.k == (-1)) goto L60;
        Typeface r126 = Typeface.create(r125, 0);
        int r133 = this.k;
        if ((this.j & 2) == 0) goto L59;
        r8 = true;
    L59:
        this.l = c5.a(r126, r133, r8);
        return;
    L66:
        return;
    L10:
        if (r1.hasValue(12) == true) goto L26;
        if (r1.hasValue(1) == false) goto L65;
        this.m = false;
        int r127 = r1.getInt(1, 1);
        if (r127 == 1) goto L24;
        if (r127 != 2) goto L18;
        this.l = Typeface.SERIF;
        return;
    L18:
        if (r127 != 3) goto L69;
        this.l = Typeface.MONOSPACE;
        return;
    L69:
        return;
    L24:
        this.l = Typeface.SANS_SERIF;
        return;
    }
}
