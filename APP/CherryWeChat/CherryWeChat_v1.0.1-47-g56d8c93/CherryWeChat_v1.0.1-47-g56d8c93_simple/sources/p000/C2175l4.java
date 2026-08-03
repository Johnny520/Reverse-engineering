package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
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

/* JADX INFO: renamed from: l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2175l4 {

    /* JADX INFO: renamed from: a */
    public final TextView f7571a;

    /* JADX INFO: renamed from: b */
    public C2090jB f7572b;

    /* JADX INFO: renamed from: c */
    public C2090jB f7573c;

    /* JADX INFO: renamed from: d */
    public C2090jB f7574d;

    /* JADX INFO: renamed from: e */
    public C2090jB f7575e;

    /* JADX INFO: renamed from: f */
    public C2090jB f7576f;

    /* JADX INFO: renamed from: g */
    public C2090jB f7577g;

    /* JADX INFO: renamed from: h */
    public C2090jB f7578h;

    /* JADX INFO: renamed from: i */
    public final C2484s4 f7579i;

    /* JADX INFO: renamed from: j */
    public int f7580j;

    /* JADX INFO: renamed from: k */
    public int f7581k;

    /* JADX INFO: renamed from: l */
    public Typeface f7582l;

    /* JADX INFO: renamed from: m */
    public boolean f7583m;

    public C2175l4(TextView r2) {
        this.f7580j = 0;
        this.f7581k = -1;
        this.f7571a = r2;
        this.f7579i = new C2484s4(r2);
    }

    /* JADX INFO: renamed from: c */
    public static C2090jB m4372c(Context r1, C0262G3 r2, int r3) {
        monitor-enter(r2);
        ColorStateList r12 = r2.f844a.m5352f(r1, r3);     // Catch: Throwable -> L10
        monitor-exit(r2);
        if (r12 == null) goto L8;
        C2090jB r22 = new C2090jB();
        r22.f7361d = true;
        r22.f7358a = r12;
        return r22;
    L8:
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public static void m4373h(EditorInfo r10, InputConnection r11, TextView r12) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L55;
        if (r11 == null) goto L56;
        CharSequence r112 = r12.getText();
        if (r0 < 30) goto L9;
        AbstractC0945W.m1804e(r10, r112);
        return;
    L9:
        r112.getClass();
        if (r0 < 30) goto L13;
        AbstractC0945W.m1804e(r10, r112);
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
        AbstractC0714Qj.m1475F(r10, null, 0, 0);
        return;
    L27:
        if (r4 == 225) goto L51;
        if (r4 == 18) goto L51;
        if (r03 > 2048) goto L35;
        AbstractC0714Qj.m1475F(r10, r112, r1, r122);
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
        AbstractC0714Qj.m1475F(r10, r113, r52, r6);
        return;
    L48:
        r113 = r112.subSequence(r13, r8 + r13);
        goto L49
    L38:
        r3 = r04;
    L53:
        AbstractC0714Qj.m1475F(r10, null, 0, 0);
        return;
    L16:
        r1 = r122;
        goto L17
    L56:
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m4374a(Drawable r2, C2090jB r3) {
        if (r2 == null) goto L6;
        if (r3 == null) goto L7;
        C0262G3.m542e(r2, r3, this.f7571a.getDrawableState());
        return;
    L7:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m4375b() {
        C2090jB r0 = this.f7572b;
        TextView r3 = this.f7571a;
        if (r0 == null) goto L5;
    L10:
        Drawable[] r02 = r3.getCompoundDrawables();
        m4374a(r02[0], this.f7572b);
        m4374a(r02[1], this.f7573c);
        m4374a(r02[2], this.f7574d);
        m4374a(r02[3], this.f7575e);
    L12:
        if (this.f7576f == null) goto L14;
    L17:
        Drawable[] r03 = r3.getCompoundDrawablesRelative();
        m4374a(r03[0], this.f7576f);
        m4374a(r03[2], this.f7577g);
        return;
    L14:
        if (this.f7577g != null) goto L17;
        return;
    L5:
        if (this.f7573c != null) goto L10;
        if (this.f7574d != null) goto L10;
        if (this.f7575e == null) goto L12;
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m4376d() {
        C2090jB r0 = this.f7578h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7358a;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m4377e() {
        C2090jB r0 = this.f7578h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7359b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m4378f(AttributeSet r28, int r29) {
        TextView r1 = this.f7571a;
        Context r7 = r1.getContext();
        C0262G3 r8 = C0262G3.m539a();
        int[] r3 = AbstractC0982Wu.f3073h;
        C2656w4 r9 = C2656w4.m5186A(r7, r28, r3, r29);
        AbstractC2185lE.m4398k(r1, r1.getContext(), r3, r28, (TypedArray) r9.f9196b, r29);
        TypedArray r12 = (TypedArray) r9.f9196b;
        int r2 = r12.getResourceId(0, -1);
        if (r12.hasValue(3) == false) goto L6;
        this.f7572b = m4372c(r7, r8, r12.getResourceId(3, 0));
    L6:
        if (r12.hasValue(1) == false) goto L9;
        this.f7573c = m4372c(r7, r8, r12.getResourceId(1, 0));
    L9:
        if (r12.hasValue(4) == false) goto L12;
        this.f7574d = m4372c(r7, r8, r12.getResourceId(4, 0));
    L12:
        if (r12.hasValue(2) == false) goto L15;
        this.f7575e = m4372c(r7, r8, r12.getResourceId(2, 0));
    L15:
        if (r12.hasValue(5) == false) goto L18;
        this.f7576f = m4372c(r7, r8, r12.getResourceId(5, 0));
    L18:
        if (r12.hasValue(6) == false) goto L20;
        this.f7577g = m4372c(r7, r8, r12.getResourceId(6, 0));
    L20:
        r9.m5195E();
        boolean r13 = r1.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] r92 = AbstractC0982Wu.f3088w;
        if (r2 == (-1)) goto L37;
        TypedArray r22 = r7.obtainStyledAttributes(r2, r92);
        C2656w4 r5 = new C2656w4(r7, r22);
        if (r13 == false) goto L25;
    L27:
        boolean r20 = false;
        boolean r21 = false;
    L28:
        m4382k(r7, r5);
        if (r22.hasValue(15) == false) goto L31;
        String r222 = r22.getString(15);
    L33:
        if (r22.hasValue(13) == false) goto L35;
        String r23 = r22.getString(13);
    L36:
        r5.m5195E();
    L38:
        TypedArray r93 = r7.obtainStyledAttributes(r28, r92, r29, 0);
        C2656w4 r52 = new C2656w4(r7, r93);
        if (r13 == false) goto L41;
    L43:
        boolean r32 = r21;
        if (r93.hasValue(15) == false) goto L47;
        r222 = r93.getString(15);
    L47:
        if (r93.hasValue(13) == false) goto L50;
        r23 = r93.getString(13);
    L50:
        if (r93.hasValue(0) == true) goto L52;
    L54:
        m4382k(r7, r52);
        r52.m5195E();
        if (r13 == true) goto L58;
        if (r20 == false) goto L58;
        r1.setAllCaps(r32);
    L58:
        Typeface r14 = this.f7582l;
        if (r14 != null) goto L61;
    L64:
        if (r23 == null) goto L66;
        AbstractC2083j4.m4252d(r1, r23);
    L66:
        if (r222 == null) goto L68;
        AbstractC1526i4.m2902b(r1, AbstractC1526i4.m2901a(r222));
    L68:
        C2484s4 r94 = this.f7579i;
        Context r15 = r94.f8742h;
        int[] r33 = AbstractC0982Wu.f3074i;
        TypedArray r53 = r15.obtainStyledAttributes(r28, r33, r29, 0);
        TextView r16 = r94.f8741g;
        AbstractC2185lE.m4398k(r16, r16.getContext(), r33, r28, r53, r29);
        if (r53.hasValue(5) == false) goto L72;
        r94.f8735a = r53.getInt(5, 0);
    L72:
        if (r53.hasValue(4) == false) goto L74;
        float r17 = r53.getDimension(4, -1.0f);
    L76:
        if (r53.hasValue(2) == false) goto L79;
        float r24 = r53.getDimension(2, -1.0f);
    L81:
        if (r53.hasValue(1) == false) goto L84;
        float r212 = r53.getDimension(1, -1.0f);
    L86:
        if (r53.hasValue(3) == false) goto L102;
        int r132 = r53.getResourceId(3, 0);
        if (r132 <= 0) goto L102;
        TypedArray r133 = r53.getResources().obtainTypedArray(r132);
        int r152 = r133.length();
        int r242 = 0;
        int[] r11 = new int[r152];
        if (r152 <= 0) goto L101;
        int r142 = 0;
    L92:
        if (r142 >= r152) goto L94;
        r11[r142] = r133.getDimensionPixelSize(r142, -1);
        r142 = r142 + 1;
        goto L92
    L94:
        int[] r112 = C2484s4.m4967a(r11);
        r94.f8739e = r112;
        if (r112.length <= 0) goto L97;
        boolean r153 = true;
    L98:
        r94.f8740f = r153;
        if (r153 == false) goto L101;
        r94.f8735a = 1;
        r94.f8737c = r112[0];
        r94.f8738d = r112[r14 - 1];
        r94.f8736b = -1.0f;
        goto L101
    L97:
        r153 = false;
    L101:
        r133.recycle();
    L103:
        r53.recycle();
        if (r94.m4968b() == true) goto L106;
        r94.f8735a = r242;
    L146:
        if (r94.f8735a == 0) goto L153;
        int[] r18 = r94.f8739e;
        if (r18.length <= 0) goto L153;
        if (AbstractC2083j4.m4249a(r1) == (-1.0f)) goto L152;
        AbstractC2083j4.m4250b(r1, Math.round(r94.f8737c), Math.round(r94.f8738d), Math.round(r94.f8736b), 0);
        goto L153
    L152:
        AbstractC2083j4.m4251c(r1, r18, 0);
    L153:
        TypedArray r19 = r7.obtainStyledAttributes(r28, r33);
        int r25 = r19.getResourceId(8, -1);
        if (r25 == (-1)) goto L157;
        Drawable r26 = r8.m543b(r7, r25);
    L158:
        int r34 = r19.getResourceId(13, -1);
        if (r34 == (-1)) goto L161;
        Drawable r35 = r8.m543b(r7, r34);
    L162:
        int r4 = r19.getResourceId(9, -1);
        if (r4 == (-1)) goto L166;
        Drawable r42 = r8.m543b(r7, r4);
    L167:
        int r54 = r19.getResourceId(6, -1);
        if (r54 == (-1)) goto L170;
        Drawable r55 = r8.m543b(r7, r54);
    L171:
        int r95 = r19.getResourceId(10, -1);
        if (r95 == (-1)) goto L174;
        Drawable r96 = r8.m543b(r7, r95);
    L175:
        int r113 = r19.getResourceId(7, -1);
        if (r113 == (-1)) goto L178;
        Drawable r82 = r8.m543b(r7, r113);
    L179:
        if (r96 != null) goto L212;
        if (r82 != null) goto L212;
        if (r26 != null) goto L186;
        if (r35 != null) goto L186;
        if (r42 != null) goto L186;
        if (r55 != null) goto L186;
    L227:
        if (r19.hasValue(11) == false) goto L238;
        if (r19.hasValue(11) == false) goto L235;
        int r36 = r19.getResourceId(11, 0);
        if (r36 == 0) goto L235;
        ColorStateList r37 = AbstractC0295Gu.m622o(r7, r36);
        if (r37 == null) goto L235;
    L236:
        r1.setCompoundDrawableTintList(r37);
    L235:
        r37 = r19.getColorStateList(11);
    L238:
        if (r19.hasValue(12) == false) goto L240;
        r1.setCompoundDrawableTintMode(AbstractC0107Ce.m161c(r19.getInt(12, -1), null));
    L240:
        int r27 = r19.getDimensionPixelSize(15, -1);
        int r38 = r19.getDimensionPixelSize(18, -1);
        if (r19.hasValue(19) == false) goto L249;
        TypedValue r56 = r19.peekValue(19);
        if (r56 != null) goto L245;
    L247:
        float r43 = r19.getDimensionPixelSize(19, -1);
    L248:
        int r57 = -1;
    L250:
        r19.recycle();
        if (r27 == (-1)) goto L253;
        AbstractC1293cr.m2546e(r27);
        r1.setFirstBaselineToTopHeight(r27);
    L253:
        if (r38 == (-1)) goto L262;
        AbstractC1293cr.m2546e(r38);
        Paint.FontMetricsInt r110 = r1.getPaint().getFontMetricsInt();
        if (r1.getIncludeFontPadding() == false) goto L257;
        int r111 = r110.bottom;
    L259:
        if (r38 <= Math.abs(r111)) goto L262;
        r1.setPadding(r1.getPaddingLeft(), r1.getPaddingTop(), r1.getPaddingRight(), r38 - r111);
        goto L262
    L257:
        r111 = r110.descent;
    L262:
        if (r43 == (-1.0f)) goto L274;
        if (r57 != (-1)) goto L267;
        AbstractC0148Dc.m284r(r1, (int) r43);
        return;
    L267:
        if (Build.VERSION.SDK_INT < 34) goto L270;
        AbstractC1031Y.m1961i(r1, r57, r43);
        return;
    L270:
        AbstractC0148Dc.m284r(r1, Math.round(TypedValue.applyDimension(r57, r43, r1.getResources().getDisplayMetrics())));
        return;
    L274:
        return;
    L245:
        if (r56.type != 5) goto L247;
        int r44 = r56.data;
        r57 = r44 & 15;
        r43 = TypedValue.complexToFloat(r44);
        goto L250
    L249:
        r43 = -1.0f;
    L186:
        Drawable[] r83 = r1.getCompoundDrawablesRelative();
        Drawable r97 = r83[0];
        if (r97 != null) goto L205;
        if (r83[2] != null) goto L205;
        Drawable[] r84 = r1.getCompoundDrawables();
        if (r26 != null) goto L195;
        r26 = r84[0];
    L195:
        if (r35 != null) goto L198;
        r35 = r84[1];
    L198:
        if (r42 != null) goto L201;
        r42 = r84[2];
    L201:
        if (r55 != null) goto L204;
        r55 = r84[3];
    L204:
        r1.setCompoundDrawablesWithIntrinsicBounds(r26, r35, r42, r55);
    L205:
        if (r35 != null) goto L208;
        r35 = r83[1];
    L208:
        if (r55 != null) goto L211;
        r55 = r83[3];
    L211:
        r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r97, r35, r83[2], r55);
    L212:
        Drawable[] r210 = r1.getCompoundDrawablesRelative();
        if (r96 != null) goto L216;
        r96 = r210[0];
    L216:
        if (r35 != null) goto L219;
        r35 = r210[1];
    L219:
        if (r82 != null) goto L222;
        r82 = r210[2];
    L222:
        if (r55 != null) goto L225;
        r55 = r210[3];
    L225:
        r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r96, r35, r82, r55);
        goto L227
    L178:
        r82 = null;
        goto L179
    L174:
        r96 = null;
        goto L175
    L170:
        r55 = null;
        goto L171
    L166:
        r42 = null;
        goto L167
    L161:
        r35 = null;
        goto L162
    L157:
        r26 = null;
        goto L158
    L106:
        if (r94.f8735a != 1) goto L146;
        if (r94.f8740f == true) goto L133;
        DisplayMetrics r58 = r15.getResources().getDisplayMetrics();
        if (r24 != (-1.0f)) goto L112;
        int r143 = 2;
        r24 = TypedValue.applyDimension(2, 12.0f, r58);
    L114:
        if (r212 != (-1.0f)) goto L116;
        r212 = TypedValue.applyDimension(r143, 112.0f, r58);
    L116:
        float r59 = r212;
        if (r17 != (-1.0f)) goto L120;
        r17 = 1.0f;
    L120:
        if (r24 <= 0.0f) goto L131;
        if (r59 <= r24) goto L129;
        if (r17 <= 0.0f) goto L127;
        r94.f8735a = 1;
        r94.f8737c = r24;
        r94.f8738d = r59;
        r94.f8736b = r17;
        r94.f8740f = r242;
        goto L133
    L127:
        throw new IllegalArgumentException("The auto-size step granularity (" + r17 + "px) is less or equal to (0px)");
    L129:
        throw new IllegalArgumentException("Maximum auto-size text size (" + r59 + "px) is less or equal to minimum auto-size text size (" + r24 + "px)");
    L131:
        throw new IllegalArgumentException("Minimum auto-size text size (" + r24 + "px) is less or equal to (0px)");
    L112:
        r143 = 2;
    L133:
        if (r94.m4968b() == false) goto L146;
        if (r94.f8735a != 1) goto L146;
        if (r94.f8740f == true) goto L139;
    L140:
        int r114 = ((int) Math.floor((r94.f8738d - r94.f8737c) / r94.f8736b)) + 1;
        int[] r211 = new int[r114];
        int r510 = 0;
    L141:
        if (r510 >= r114) goto L143;
        r211[r510] = Math.round((r510 * r94.f8736b) + r94.f8737c);
        r510 = r510 + 1;
        goto L141
    L143:
        r94.f8739e = C2484s4.m4967a(r211);
        goto L146
    L139:
        if (r94.f8739e.length != 0) goto L146;
    L102:
        r242 = 0;
        goto L103
    L84:
        r212 = -1.0f;
        goto L86
    L79:
        r24 = -1.0f;
        goto L81
    L74:
        r17 = -1.0f;
        goto L76
    L61:
        if (this.f7581k != (-1)) goto L63;
        r1.setTypeface(r14, this.f7580j);
        goto L64
    L63:
        r1.setTypeface(r14);
        goto L64
    L52:
        if (r93.getDimensionPixelSize(0, -1) != 0) goto L54;
        r1.setTextSize(0, 0.0f);
        goto L54
    L41:
        if (r93.hasValue(14) == false) goto L43;
        r21 = r93.getBoolean(14, false);
        r20 = true;
        goto L43
    L35:
        r23 = null;
        goto L36
    L31:
        r222 = null;
        goto L33
    L25:
        if (r22.hasValue(14) == false) goto L27;
        r21 = r22.getBoolean(14, false);
        r20 = true;
        goto L28
    L37:
        r20 = false;
        r21 = false;
        r23 = null;
        r222 = null;
        goto L38
    }

    /* JADX INFO: renamed from: g */
    public final void m4379g(Context r6, int r7) {
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0982Wu.f3088w);
        C2656w4 r0 = new C2656w4(r6, r72);
        boolean r2 = r72.hasValue(14);
        TextView r3 = this.f7571a;
        if (r2 == false) goto L6;
        r3.setAllCaps(r72.getBoolean(14, false));
    L6:
        if (r72.hasValue(0) == true) goto L8;
    L10:
        m4382k(r6, r0);
        if (r72.hasValue(13) == false) goto L15;
        String r62 = r72.getString(13);
        if (r62 == null) goto L15;
        AbstractC2083j4.m4252d(r3, r62);
    L15:
        r0.m5195E();
        Typeface r63 = this.f7582l;
        if (r63 == null) goto L19;
        r3.setTypeface(r63, this.f7580j);
        return;
    L19:
        return;
    L8:
        if (r72.getDimensionPixelSize(0, -1) != 0) goto L10;
        r3.setTextSize(0, 0.0f);
        goto L10
    }

    /* JADX INFO: renamed from: i */
    public final void m4380i(ColorStateList r2) {
        if (this.f7578h != null) goto L5;
        this.f7578h = new C2090jB();
    L5:
        C2090jB r0 = this.f7578h;
        r0.f7358a = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r0.f7361d = r22;
        this.f7572b = r0;
        this.f7573c = r0;
        this.f7574d = r0;
        this.f7575e = r0;
        this.f7576f = r0;
        this.f7577g = r0;
        return;
    L8:
        r22 = false;
        goto L9
    }

    /* JADX INFO: renamed from: j */
    public final void m4381j(PorterDuff.Mode r2) {
        if (this.f7578h != null) goto L5;
        this.f7578h = new C2090jB();
    L5:
        C2090jB r0 = this.f7578h;
        r0.f7359b = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r0.f7360c = r22;
        this.f7572b = r0;
        this.f7573c = r0;
        this.f7574d = r0;
        this.f7575e = r0;
        this.f7576f = r0;
        this.f7577g = r0;
        return;
    L8:
        r22 = false;
        goto L9
    }

    /* JADX INFO: renamed from: k */
    public final void m4382k(Context r10, C2656w4 r11) {
        int r0 = this.f7580j;
        TypedArray r1 = (TypedArray) r11.f9196b;
        this.f7580j = r1.getInt(2, r0);
        int r02 = r1.getInt(11, -1);
        this.f7581k = r02;
        if (r02 == (-1)) goto L5;
        this.f7580j &= 2;
    L5:
        int r03 = 10;
        boolean r6 = false;
        if (r1.hasValue(10) == false) goto L8;
    L24:
        this.f7582l = null;
        if (r1.hasValue(12) == false) goto L27;
        r03 = 12;
    L27:
        int r4 = this.f7581k;
        int r5 = this.f7580j;
        if (r10.isRestricted() == true) goto L46;
        Typeface r102 = r11.m5212s(r03, this.f7580j, new C1438g4(this, r4, r5, new WeakReference(this.f7571a)));     // Catch: Throwable -> L57
        if (r102 == null) goto L41;
        if (this.f7581k == (-1)) goto L39;
        Typeface r103 = Typeface.create(r102, 0);     // Catch: Throwable -> L57
        int r112 = this.f7581k;     // Catch: Throwable -> L57
        if ((this.f7580j & 2) == 0) goto L37;
        boolean r42 = true;
    L38:
        this.f7582l = AbstractC2127k4.m4311a(r103, r112, r42);     // Catch: Throwable -> L57
        goto L41
    L37:
        r42 = false;
        goto L38
    L39:
        this.f7582l = r102;     // Catch: Throwable -> L57
    L41:
        if (this.f7582l != null) goto L43;
        boolean r104 = true;
    L44:
        this.f7583m = r104;     // Catch: Throwable -> L57
        goto L46
    L43:
        r104 = false;
    L46:
        if (this.f7582l != null) goto L61;
        String r105 = r1.getString(r03);
        if (r105 != null) goto L50;
        return;
    L50:
        if (this.f7581k == (-1)) goto L55;
        Typeface r106 = Typeface.create(r105, 0);
        int r113 = this.f7581k;
        if ((this.f7580j & 2) == 0) goto L54;
        r6 = true;
    L54:
        this.f7582l = AbstractC2127k4.m4311a(r106, r113, r6);
        return;
    L55:
        this.f7582l = Typeface.create(r105, this.f7580j);
        return;
    L61:
        return;
    L8:
        if (r1.hasValue(12) == true) goto L24;
        if (r1.hasValue(1) == false) goto L60;
        this.f7583m = false;
        int r107 = r1.getInt(1, 1);
        if (r107 == 1) goto L22;
        if (r107 != 2) goto L16;
        this.f7582l = Typeface.SERIF;
        return;
    L16:
        if (r107 != 3) goto L64;
        this.f7582l = Typeface.MONOSPACE;
        return;
    L64:
        return;
    L22:
        this.f7582l = Typeface.SANS_SERIF;
        return;
    }
}
