package p057g;

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
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p015I.AbstractC0207a;
import p017J.AbstractC0225n;
import p017J.AbstractC0228q;
import p018J0.C0234d;
import p034S.AbstractC0324d;
import p048b.AbstractC0550a;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: g.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0860G {

    /* JADX INFO: renamed from: a */
    public final TextView f3091a;

    /* JADX INFO: renamed from: b */
    public C0853C0 f3092b;

    /* JADX INFO: renamed from: c */
    public C0853C0 f3093c;

    /* JADX INFO: renamed from: d */
    public C0853C0 f3094d;

    /* JADX INFO: renamed from: e */
    public C0853C0 f3095e;

    /* JADX INFO: renamed from: f */
    public C0853C0 f3096f;

    /* JADX INFO: renamed from: g */
    public C0853C0 f3097g;

    /* JADX INFO: renamed from: h */
    public C0853C0 f3098h;

    /* JADX INFO: renamed from: i */
    public final C0878P f3099i;

    /* JADX INFO: renamed from: j */
    public int f3100j;

    /* JADX INFO: renamed from: k */
    public int f3101k;

    /* JADX INFO: renamed from: l */
    public Typeface f3102l;

    /* JADX INFO: renamed from: m */
    public boolean f3103m;

    public C0860G(TextView r2) {
        this.f3100j = 0;
        this.f3101k = -1;
        this.f3091a = r2;
        this.f3099i = new C0878P(r2);
    }

    /* JADX INFO: renamed from: c */
    public static C0853C0 m2173c(Context r1, C0926s r2, int r3) {
        monitor-enter(r2);
        ColorStateList r12 = r2.f3291a.m2270h(r1, r3);     // Catch: Throwable -> L10
        monitor-exit(r2);
        if (r12 == null) goto L8;
        C0853C0 r22 = new C0853C0();
        r22.f3087d = true;
        r22.f3084a = r12;
        return r22;
    L8:
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public static void m2174f(TextView r11, InputConnection r12, EditorInfo r13) {
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 30) goto L49;
        if (r12 == null) goto L50;
        CharSequence r112 = r11.getText();
        if (r3 < 30) goto L8;
        AbstractC0207a.m590a(r13, r112);
        return;
    L8:
        r112.getClass();
        if (r3 < 30) goto L11;
        AbstractC0207a.m590a(r13, r112);
        return;
    L11:
        int r122 = r13.initialSelStart;
        int r32 = r13.initialSelEnd;
        if (r122 <= r32) goto L14;
        int r4 = r32;
    L15:
        if (r122 > r32) goto L18;
        r122 = r32;
    L18:
        int r33 = r112.length();
        if (r4 < 0) goto L47;
        if (r122 > r33) goto L47;
        int r6 = r13.inputType & 4095;
        if (r6 != 129) goto L25;
    L46:
        AbstractC0040p.m93X(r13, null, 0, 0);
        return;
    L25:
        if (r6 == 225) goto L46;
        if (r6 == 18) goto L46;
        if (r33 > 2048) goto L31;
        AbstractC0040p.m93X(r13, r112, r4, r122);
        return;
    L31:
        int r34 = r122 - r4;
        if (r34 <= 1024) goto L34;
        int r5 = 0;
    L35:
        int r02 = 2048 - r5;
        int r62 = Math.min(r112.length() - r122, r02 - Math.min(r4, (int) (((double) r02) * 0.8d)));
        int r03 = Math.min(r4, r02 - r62);
        int r42 = r4 - r03;
        if (Character.isLowSurrogate(r112.charAt(r42)) == false) goto L39;
        r42 = r42 + 1;
        r03 = r03 - 1;
    L39:
        if (Character.isHighSurrogate(r112.charAt((r122 + r62) - 1)) == false) goto L41;
        r62 = r62 - 1;
    L41:
        int r7 = r03 + r5;
        int r8 = r7 + r62;
        if (r5 == r34) goto L44;
        CharSequence r113 = TextUtils.concat(new CharSequence[]{r112.subSequence(r42, r42 + r03), r112.subSequence(r122, r62 + r122)});
    L45:
        AbstractC0040p.m93X(r13, r113, r03, r7);
        return;
    L44:
        r113 = r112.subSequence(r42, r8 + r42);
        goto L45
    L34:
        r5 = r34;
    L47:
        AbstractC0040p.m93X(r13, null, 0, 0);
        return;
    L14:
        r4 = r122;
        goto L15
    L50:
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m2175a(Drawable r2, C0853C0 r3) {
        if (r2 == null) goto L6;
        if (r3 == null) goto L7;
        C0926s.m2260c(r2, r3, this.f3091a.getDrawableState());
        return;
    L7:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2176b() {
        C0853C0 r02 = this.f3092b;
        TextView r3 = this.f3091a;
        if (r02 == null) goto L5;
    L10:
        Drawable[] r03 = r3.getCompoundDrawables();
        m2175a(r03[0], this.f3092b);
        m2175a(r03[1], this.f3093c);
        m2175a(r03[2], this.f3094d);
        m2175a(r03[3], this.f3095e);
    L12:
        if (this.f3096f == null) goto L14;
    L15:
        Drawable[] r04 = r3.getCompoundDrawablesRelative();
        m2175a(r04[0], this.f3096f);
        m2175a(r04[2], this.f3097g);
        return;
    L14:
        if (this.f3097g != null) goto L15;
        return;
    L5:
        if (this.f3093c != null) goto L10;
        if (this.f3094d != null) goto L10;
        if (this.f3095e == null) goto L12;
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final void m2177d(AttributeSet r26, int r27) {
        TextView r11 = this.f3091a;
        Context r12 = r11.getContext();
        PorterDuff.Mode r2 = C0926s.f3289b;
        monitor-enter(C0926s.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (C0926s.f3290c != null) goto L9;
        C0926s.m2259b();     // Catch: Throwable -> L7
    L9:
        C0926s r13 = C0926s.f3290c;     // Catch: Throwable -> L7
        monitor-exit(C0926s.class);
        int[] r4 = AbstractC0550a.f1621f;
        int r14 = 0;
        C0234d r15 = C0234d.m638s(r12, r26, r4, r27, 0);
        TextView r22 = this.f3091a;
        AbstractC0080Q.m290i(r22, r22.getContext(), r4, r26, (TypedArray) r15.f475c, r27);
        TypedArray r23 = (TypedArray) r15.f475c;
        int r3 = r23.getResourceId(0, -1);
        if (r23.hasValue(3) == false) goto L15;
        this.f3092b = m2173c(r12, r13, r23.getResourceId(3, 0));
    L15:
        if (r23.hasValue(1) == false) goto L18;
        this.f3093c = m2173c(r12, r13, r23.getResourceId(1, 0));
    L18:
        if (r23.hasValue(4) == false) goto L21;
        this.f3094d = m2173c(r12, r13, r23.getResourceId(4, 0));
    L21:
        if (r23.hasValue(2) == false) goto L24;
        this.f3095e = m2173c(r12, r13, r23.getResourceId(2, 0));
    L24:
        if (r23.hasValue(5) == false) goto L27;
        this.f3096f = m2173c(r12, r13, r23.getResourceId(5, 0));
    L27:
        if (r23.hasValue(6) == false) goto L29;
        this.f3097g = m2173c(r12, r13, r23.getResourceId(6, 0));
    L29:
        r15.m657u();
        boolean r24 = r11.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] r152 = AbstractC0550a.f1634s;
        if (r3 == (-1)) goto L46;
        TypedArray r32 = r12.obtainStyledAttributes(r3, r152);
        C0234d r5 = new C0234d(r12, r32);
        if (r24 == false) goto L34;
    L36:
        boolean r222 = false;
        boolean r232 = false;
    L37:
        m2184l(r12, r5);
        if (r32.hasValue(15) == false) goto L40;
        String r242 = r32.getString(15);
        int r6 = 13;
    L42:
        if (r32.hasValue(r6) == false) goto L44;
        String r33 = r32.getString(r6);
    L45:
        r5.m657u();
    L47:
        TypedArray r62 = r12.obtainStyledAttributes(r26, r152, r27, 0);
        C0234d r52 = new C0234d(r12, r62);
        if (r24 == false) goto L50;
    L52:
        boolean r42 = r232;
    L53:
        int r153 = Build.VERSION.SDK_INT;
        if (r62.hasValue(15) == false) goto L57;
        r242 = r62.getString(15);
    L57:
        if (r62.hasValue(13) == false) goto L60;
        r33 = r62.getString(13);
    L60:
        if (r153 >= 28) goto L62;
    L66:
        m2184l(r12, r52);
        r52.m657u();
        if (r24 == true) goto L70;
        if (r222 == false) goto L70;
        this.f3091a.setAllCaps(r42);
    L70:
        Typeface r25 = this.f3102l;
        if (r25 != null) goto L73;
    L76:
        if (r33 == null) goto L78;
        AbstractC0856E.m2171d(r11, r33);
    L78:
        if (r242 == null) goto L80;
        AbstractC0854D.m2167b(r11, AbstractC0854D.m2166a(r242));
    L80:
        int[] r9 = AbstractC0550a.f1622g;
        C0878P r154 = this.f3099i;
        Context r63 = r154.f3147j;
        TypedArray r53 = r63.obtainStyledAttributes(r26, r9, r27, 0);
        TextView r28 = r154.f3146i;
        AbstractC0080Q.m290i(r28, r28.getContext(), r9, r26, r53, r27);
        if (r53.hasValue(5) == false) goto L84;
        r154.f3138a = r53.getInt(5, 0);
    L84:
        if (r53.hasValue(4) == false) goto L87;
        float r34 = r53.getDimension(4, -1.0f);
    L89:
        if (r53.hasValue(2) == false) goto L92;
        float r64 = r53.getDimension(2, -1.0f);
    L94:
        if (r53.hasValue(1) == false) goto L97;
        float r7 = r53.getDimension(1, -1.0f);
    L99:
        if (r53.hasValue(3) == false) goto L109;
        int r8 = r53.getResourceId(3, 0);
        if (r8 <= 0) goto L109;
        TypedArray r82 = r53.getResources().obtainTypedArray(r8);
        int r10 = r82.length();
        int[] r43 = new int[r10];
        if (r10 <= 0) goto L107;
    L104:
        if (r14 >= r10) goto L106;
        r43[r14] = r82.getDimensionPixelSize(r14, -1);
        r14 = r14 + 1;
        goto L104
    L106:
        int r54 = -1;
        r154.f3143f = C0878P.m2200b(r43);
        r154.m2208i();
    L108:
        r82.recycle();
    L110:
        r53.recycle();
        if (r154.m2209j() == true) goto L113;
        r154.f3138a = 0;
    L130:
        if (AbstractC0881Q0.f3149a == true) goto L132;
    L139:
        TypedArray r02 = r12.obtainStyledAttributes(r26, r9);
        int r29 = r02.getResourceId(8, r54);
        if (r29 == r54) goto L143;
        Drawable r210 = r13.m2261a(r12, r29);
    L144:
        int r35 = r02.getResourceId(13, r54);
        if (r35 == r54) goto L147;
        Drawable r36 = r13.m2261a(r12, r35);
    L148:
        int r44 = r02.getResourceId(9, r54);
        if (r44 == r54) goto L152;
        Drawable r45 = r13.m2261a(r12, r44);
    L153:
        int r65 = r02.getResourceId(6, r54);
        if (r65 == r54) goto L156;
        Drawable r66 = r13.m2261a(r12, r65);
    L157:
        int r72 = r02.getResourceId(10, r54);
        if (r72 == r54) goto L160;
        Drawable r73 = r13.m2261a(r12, r72);
    L161:
        int r83 = r02.getResourceId(7, r54);
        if (r83 == r54) goto L164;
        Drawable r84 = r13.m2261a(r12, r83);
    L165:
        if (r73 != null) goto L198;
        if (r84 != null) goto L198;
        if (r210 != null) goto L172;
        if (r36 != null) goto L172;
        if (r45 != null) goto L172;
        if (r66 != null) goto L172;
    L213:
        if (r02.hasValue(11) == false) goto L224;
        if (r02.hasValue(11) == false) goto L221;
        int r37 = r02.getResourceId(11, 0);
        if (r37 == 0) goto L221;
        ColorStateList r38 = AbstractC0805P.m2049p(r12, r37);
        if (r38 == null) goto L221;
    L222:
        AbstractC0225n.m621f(r11, r38);
    L221:
        r38 = r02.getColorStateList(11);
    L224:
        if (r02.hasValue(12) == false) goto L226;
        AbstractC0225n.m622g(r11, AbstractC0886W.m2221c(r02.getInt(12, r54), null));
    L226:
        int r39 = r02.getDimensionPixelSize(15, r54);
        int r211 = r02.getDimensionPixelSize(18, r54);
        if (r02.hasValue(19) == false) goto L234;
        TypedValue r67 = r02.peekValue(19);
        if (r67 != null) goto L231;
    L233:
        float r46 = r02.getDimensionPixelSize(19, r54);
        int r74 = r54;
    L235:
        r02.recycle();
        if (r39 == r54) goto L238;
        AbstractC0040p.m88S(r11, r39);
    L238:
        if (r211 == r54) goto L241;
        AbstractC0040p.m90U(r11, r211);
    L241:
        if (r46 == (-1.0f)) goto L254;
        if (r74 != r54) goto L245;
        AbstractC0040p.m91V(r11, (int) r46);
        return;
    L245:
        if (Build.VERSION.SDK_INT < 34) goto L247;
        AbstractC0228q.m629a(r11, r74, r46);
        return;
    L247:
        AbstractC0040p.m91V(r11, Math.round(TypedValue.applyDimension(r74, r46, r11.getResources().getDisplayMetrics())));
        return;
    L254:
        return;
    L231:
        if (r67.type != 5) goto L233;
        int r47 = r67.data;
        r74 = r47 & 15;
        r46 = TypedValue.complexToFloat(r47);
        goto L235
    L234:
        r74 = r54;
        r46 = -1.0f;
    L172:
        Drawable[] r75 = r11.getCompoundDrawablesRelative();
        Drawable r92 = r75[0];
        if (r92 != null) goto L191;
        if (r75[2] != null) goto L191;
        Drawable[] r76 = r11.getCompoundDrawables();
        if (r210 != null) goto L181;
        r210 = r76[0];
    L181:
        if (r36 != null) goto L184;
        r36 = r76[1];
    L184:
        if (r45 != null) goto L187;
        r45 = r76[2];
    L187:
        if (r66 != null) goto L190;
        r66 = r76[3];
    L190:
        r11.setCompoundDrawablesWithIntrinsicBounds(r210, r36, r45, r66);
    L191:
        if (r36 != null) goto L194;
        r36 = r75[1];
    L194:
        if (r66 != null) goto L197;
        r66 = r75[3];
    L197:
        r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r92, r36, r75[2], r66);
    L198:
        Drawable[] r212 = r11.getCompoundDrawablesRelative();
        if (r73 != null) goto L202;
        r73 = r212[0];
    L202:
        if (r36 != null) goto L205;
        r36 = r212[1];
    L205:
        if (r84 != null) goto L208;
        r84 = r212[2];
    L208:
        if (r66 != null) goto L211;
        r66 = r212[3];
    L211:
        r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r73, r36, r84, r66);
        goto L213
    L164:
        r84 = null;
        goto L165
    L160:
        r73 = null;
        goto L161
    L156:
        r66 = null;
        goto L157
    L152:
        r45 = null;
        goto L153
    L147:
        r36 = null;
        goto L148
    L143:
        r210 = null;
        goto L144
    L132:
        if (r154.f3138a == 0) goto L139;
        int[] r213 = r154.f3143f;
        if (r213.length <= 0) goto L139;
        if (AbstractC0856E.m2168a(r11) == (-1.0f)) goto L138;
        AbstractC0856E.m2169b(r11, Math.round(r154.f3141d), Math.round(r154.f3142e), Math.round(r154.f3140c), 0);
        goto L139
    L138:
        AbstractC0856E.m2170c(r11, r213, 0);
        goto L139
    L113:
        if (r154.f3138a != 1) goto L130;
        if (r154.f3144g == true) goto L127;
        DisplayMetrics r214 = r63.getResources().getDisplayMetrics();
        if (r64 != (-1.0f)) goto L119;
        int r85 = 2;
        r64 = TypedValue.applyDimension(2, 12.0f, r214);
    L121:
        if (r7 != (-1.0f)) goto L124;
        r7 = TypedValue.applyDimension(r85, 112.0f, r214);
    L124:
        if (r34 != (-1.0f)) goto L126;
        r34 = 1.0f;
    L126:
        r154.m2210k(r64, r7, r34);
        goto L127
    L119:
        r85 = 2;
    L127:
        r154.m2207h();
        goto L130
    L107:
        r54 = -1;
    L109:
        r54 = -1;
        goto L110
    L97:
        r7 = -1.0f;
        goto L99
    L92:
        r64 = -1.0f;
        goto L94
    L87:
        r34 = -1.0f;
        goto L89
    L73:
        if (this.f3101k != (-1)) goto L75;
        r11.setTypeface(r25, this.f3100j);
        goto L76
    L75:
        r11.setTypeface(r25);
        goto L76
    L62:
        if (r62.hasValue(0) == false) goto L66;
        if (r62.getDimensionPixelSize(0, -1) != 0) goto L66;
        r11.setTextSize(0, 0.0f);
        goto L66
    L50:
        if (r62.hasValue(14) == false) goto L52;
        r42 = r62.getBoolean(14, false);
        r222 = true;
        goto L53
    L44:
        r33 = null;
        goto L45
    L40:
        r6 = 13;
        r242 = null;
        goto L42
    L34:
        if (r32.hasValue(14) == false) goto L36;
        r232 = r32.getBoolean(14, false);
        r222 = true;
        goto L37
    L46:
        r222 = false;
        r232 = false;
        r33 = null;
        r242 = null;
        goto L47
    }

    /* JADX INFO: renamed from: e */
    public final void m2178e(Context r6, int r7) {
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0550a.f1634s);
        C0234d r1 = new C0234d(r6, r72);
        boolean r2 = r72.hasValue(14);
        TextView r3 = this.f3091a;
        if (r2 == false) goto L6;
        r3.setAllCaps(r72.getBoolean(14, false));
    L6:
        if (r72.hasValue(0) == true) goto L8;
    L10:
        m2184l(r6, r1);
        if (r72.hasValue(13) == false) goto L15;
        String r62 = r72.getString(13);
        if (r62 == null) goto L15;
        AbstractC0856E.m2171d(r3, r62);
    L15:
        r1.m657u();
        Typeface r63 = this.f3102l;
        if (r63 == null) goto L19;
        r3.setTypeface(r63, this.f3100j);
        return;
    L19:
        return;
    L8:
        if (r72.getDimensionPixelSize(0, -1) != 0) goto L10;
        r3.setTextSize(0, 0.0f);
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public final void m2179g(int r3, int r4, int r5, int r6) {
        C0878P r02 = this.f3099i;
        if (r02.m2209j() == false) goto L8;
        DisplayMetrics r1 = r02.f3147j.getResources().getDisplayMetrics();
        r02.m2210k(TypedValue.applyDimension(r6, r3, r1), TypedValue.applyDimension(r6, r4, r1), TypedValue.applyDimension(r6, r5, r1));
        if (r02.m2207h() == false) goto L9;
        r02.m2203a();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m2180h(int[] r7, int r8) {
        C0878P r02 = this.f3099i;
        if (r02.m2209j() == false) goto L23;
        int r1 = r7.length;
        int r2 = 0;
        if (r1 <= 0) goto L17;
        int[] r3 = new int[r1];
        if (r8 != 0) goto L9;
        r3 = Arrays.copyOf(r7, r1);
    L12:
        r02.f3143f = C0878P.m2200b(r3);
        if (r02.m2208i() == true) goto L19;
        throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(r7));
    L19:
        if (r02.m2207h() == false) goto L24;
        r02.m2203a();
        return;
    L24:
        return;
    L9:
        DisplayMetrics r4 = r02.f3147j.getResources().getDisplayMetrics();
    L10:
        if (r2 >= r1) goto L12;
        r3[r2] = Math.round(TypedValue.applyDimension(r8, r7[r2], r4));
        r2 = r2 + 1;
        goto L10
    L17:
        r02.f3144g = false;
        goto L19
    }

    /* JADX INFO: renamed from: i */
    public final void m2181i(int r5) {
        C0878P r02 = this.f3099i;
        if (r02.m2209j() == false) goto L14;
        if (r5 != 0) goto L6;
        r02.f3138a = 0;
        r02.f3141d = -1.0f;
        r02.f3142e = -1.0f;
        r02.f3140c = -1.0f;
        r02.f3143f = new int[0];
        r02.f3139b = false;
        return;
    L6:
        if (r5 != 1) goto L11;
        DisplayMetrics r52 = r02.f3147j.getResources().getDisplayMetrics();
        r02.m2210k(TypedValue.applyDimension(2, 12.0f, r52), TypedValue.applyDimension(2, 112.0f, r52), 1.0f);
        if (r02.m2207h() == false) goto L15;
        r02.m2203a();
        return;
    L15:
        return;
    L11:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown auto-size text type: ", r5));
    }

    /* JADX INFO: renamed from: j */
    public final void m2182j(ColorStateList r2) {
        if (this.f3098h != null) goto L5;
        this.f3098h = new C0853C0();
    L5:
        C0853C0 r02 = this.f3098h;
        r02.f3084a = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r02.f3087d = r22;
        this.f3092b = r02;
        this.f3093c = r02;
        this.f3094d = r02;
        this.f3095e = r02;
        this.f3096f = r02;
        this.f3097g = r02;
        return;
    L8:
        r22 = false;
        goto L9
    }

    /* JADX INFO: renamed from: k */
    public final void m2183k(PorterDuff.Mode r2) {
        if (this.f3098h != null) goto L5;
        this.f3098h = new C0853C0();
    L5:
        C0853C0 r02 = this.f3098h;
        r02.f3085b = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        r02.f3086c = r22;
        this.f3092b = r02;
        this.f3093c = r02;
        this.f3094d = r02;
        this.f3095e = r02;
        this.f3096f = r02;
        this.f3097g = r02;
        return;
    L8:
        r22 = false;
        goto L9
    }

    /* JADX INFO: renamed from: l */
    public final void m2184l(Context r12, C0234d r13) {
        int r02 = this.f3100j;
        TypedArray r1 = (TypedArray) r13.f475c;
        this.f3100j = r1.getInt(2, r02);
        int r03 = Build.VERSION.SDK_INT;
        if (r03 < 28) goto L7;
        int r5 = r1.getInt(11, -1);
        this.f3101k = r5;
        if (r5 == (-1)) goto L7;
        this.f3100j &= 2;
    L7:
        int r52 = 10;
        boolean r8 = false;
        if (r1.hasValue(10) == false) goto L10;
    L24:
        this.f3102l = null;
        if (r1.hasValue(12) == false) goto L27;
        r52 = 12;
    L27:
        int r6 = this.f3101k;
        int r7 = this.f3100j;
        if (r12.isRestricted() == true) goto L47;
        Typeface r122 = r13.m647j(r52, this.f3100j, new C0850B(this, r6, r7, new WeakReference(this.f3091a)));     // Catch: Throwable -> L60
        if (r122 == null) goto L42;
        if (r03 >= 28) goto L34;
    L40:
        this.f3102l = r122;     // Catch: Throwable -> L60
        goto L42
    L34:
        if (this.f3101k == (-1)) goto L40;
        Typeface r123 = Typeface.create(r122, 0);     // Catch: Throwable -> L60
        int r132 = this.f3101k;     // Catch: Throwable -> L60
        if ((this.f3100j & 2) == 0) goto L38;
        boolean r04 = true;
    L39:
        this.f3102l = AbstractC0858F.m2172a(r123, r132, r04);     // Catch: Throwable -> L60
        goto L42
    L38:
        r04 = false;
    L42:
        if (this.f3102l != null) goto L44;
        boolean r124 = true;
    L45:
        this.f3103m = r124;     // Catch: Throwable -> L60
        goto L47
    L44:
        r124 = false;
    L47:
        if (this.f3102l != null) goto L67;
        String r125 = r1.getString(r52);
        if (r125 != null) goto L51;
        return;
    L51:
        if (Build.VERSION.SDK_INT >= 28) goto L53;
    L58:
        this.f3102l = Typeface.create(r125, this.f3100j);
        return;
    L53:
        if (this.f3101k == (-1)) goto L58;
        Typeface r126 = Typeface.create(r125, 0);
        int r133 = this.f3101k;
        if ((this.f3100j & 2) == 0) goto L57;
        r8 = true;
    L57:
        this.f3102l = AbstractC0858F.m2172a(r126, r133, r8);
        return;
    L67:
        return;
    L10:
        if (r1.hasValue(12) == true) goto L24;
        if (r1.hasValue(1) == false) goto L63;
        this.f3103m = false;
        int r127 = r1.getInt(1, 1);
        if (r127 == 1) goto L22;
        if (r127 != 2) goto L18;
        this.f3102l = Typeface.SERIF;
        return;
    L18:
        if (r127 != 3) goto L66;
        this.f3102l = Typeface.MONOSPACE;
        return;
    L66:
        return;
    L22:
        this.f3102l = Typeface.SANS_SERIF;
        return;
    }
}
