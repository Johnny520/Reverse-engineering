package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p034S.AbstractC0324d;
import p067l.AbstractC0978a;
import p069m.AbstractC0988h;

/* JADX INFO: renamed from: p.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1048n {

    /* JADX INFO: renamed from: d */
    public static final int[] f4045d = null;

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4046e = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f4047a;

    /* JADX INFO: renamed from: b */
    public final boolean f4048b;

    /* JADX INFO: renamed from: c */
    public final HashMap f4049c;

    static {
        f4045d = new int[]{0, 4, 8};
        SparseIntArray r3 = new SparseIntArray();
        f4046e = r3;
        r3.append(76, 25);
        r3.append(77, 26);
        r3.append(79, 29);
        r3.append(80, 30);
        r3.append(86, 36);
        r3.append(85, 35);
        r3.append(58, 4);
        r3.append(57, 3);
        r3.append(55, 1);
        r3.append(94, 6);
        r3.append(95, 7);
        r3.append(65, 17);
        r3.append(66, 18);
        r3.append(67, 19);
        r3.append(0, 27);
        r3.append(81, 32);
        r3.append(82, 33);
        r3.append(64, 10);
        r3.append(63, 9);
        r3.append(98, 13);
        r3.append(101, 16);
        r3.append(99, 14);
        r3.append(96, 11);
        r3.append(100, 15);
        r3.append(97, 12);
        r3.append(89, 40);
        r3.append(74, 39);
        r3.append(73, 41);
        r3.append(88, 42);
        r3.append(72, 20);
        r3.append(87, 37);
        r3.append(62, 5);
        r3.append(75, 82);
        r3.append(84, 82);
        r3.append(78, 82);
        r3.append(56, 82);
        r3.append(54, 82);
        r3.append(5, 24);
        r3.append(7, 28);
        r3.append(23, 31);
        r3.append(24, 8);
        r3.append(6, 34);
        r3.append(8, 2);
        r3.append(3, 23);
        r3.append(4, 21);
        r3.append(2, 22);
        r3.append(13, 43);
        r3.append(26, 44);
        r3.append(21, 45);
        r3.append(22, 46);
        r3.append(20, 60);
        r3.append(18, 47);
        r3.append(19, 48);
        r3.append(14, 49);
        r3.append(15, 50);
        r3.append(16, 51);
        r3.append(17, 52);
        r3.append(25, 53);
        r3.append(90, 54);
        r3.append(68, 55);
        r3.append(91, 56);
        r3.append(69, 57);
        r3.append(92, 58);
        r3.append(70, 59);
        r3.append(59, 61);
        r3.append(61, 62);
        r3.append(60, 63);
        r3.append(27, 64);
        r3.append(106, 65);
        r3.append(33, 66);
        r3.append(107, 67);
        r3.append(103, 79);
        r3.append(1, 38);
        r3.append(102, 68);
        r3.append(93, 69);
        r3.append(71, 70);
        r3.append(31, 71);
        r3.append(29, 72);
        r3.append(30, 73);
        r3.append(32, 74);
        r3.append(28, 75);
        r3.append(104, 76);
        r3.append(83, 77);
        r3.append(108, 78);
        r3.append(53, 80);
        r3.append(52, 81);
    }

    public C1048n() {
        this.f4047a = new HashMap();
        this.f4048b = true;
        this.f4049c = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static int[] m2525c(C1035a r10, String r11) {
        String[] r112 = r11.split(",");
        Context r02 = r10.getContext();
        int[] r1 = new int[r112.length];
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r112.length) goto L29;
        String r5 = r112[r3].trim();
        Object r6 = null;
        int r7 = AbstractC1051q.class.getField(r5).getInt(null);     // Catch: Exception -> L8
    L9:
        if (r7 != 0) goto L11;
        r7 = r02.getResources().getIdentifier(r5, "id", r02.getPackageName());
    L11:
        if (r7 != 0) goto L27;
        if (r10.isInEditMode() == false) goto L27;
        if ((r10.getParent() instanceof ConstraintLayout) == false) goto L27;
        ConstraintLayout r8 = (ConstraintLayout) r10.getParent();
        r8.getClass();
        if ((r5 instanceof String) == false) goto L23;
        HashMap r9 = r8.f1270m;
        if (r9 == null) goto L23;
        if (r9.containsKey(r5) == false) goto L23;
        r6 = r8.f1270m.get(r5);
    L23:
        if (r6 == null) goto L27;
        if ((r6 instanceof Integer) == false) goto L27;
        r7 = ((Integer) r6).intValue();
    L27:
        r1[r4] = r7;
        r3 = r3 + 1;
        r4 = r4 + 1;
    L8:
        r7 = 0;
        goto L9
    L29:
        if (r4 != r112.length) goto L31;
        return r1;
    L31:
        return Arrays.copyOf(r1, r4);
    }

    /* JADX INFO: renamed from: d */
    public static C1043i m2526d(Context r12, AttributeSet r13) {
        C1043i r02 = new C1043i();
        TypedArray r122 = r12.obtainStyledAttributes(r13, AbstractC1052r.f4050a);
        int r132 = r122.getIndexCount();
        int r2 = 0;
    L3:
        if (r2 >= r132) goto L99;
        int r3 = r122.getIndex(r2);
        C1046l r5 = r02.f3956b;
        C1045k r6 = r02.f3957c;
        C1047m r7 = r02.f3959e;
        C1044j r8 = r02.f3958d;
        if (r3 != 1) goto L7;
    L11:
        SparseIntArray r9 = f4046e;
        switch(r9.get(r3)) {
            case 1: goto L97;
            case 2: goto L96;
            case 3: goto L95;
            case 4: goto L94;
            case 5: goto L93;
            case 6: goto L92;
            case 7: goto L91;
            case 8: goto L90;
            case 9: goto L89;
            case 10: goto L88;
            case 11: goto L87;
            case 12: goto L86;
            case 13: goto L85;
            case 14: goto L84;
            case 15: goto L83;
            case 16: goto L82;
            case 17: goto L81;
            case 18: goto L80;
            case 19: goto L79;
            case 20: goto L78;
            case 21: goto L77;
            case 22: goto L76;
            case 23: goto L75;
            case 24: goto L74;
            case 25: goto L73;
            case 26: goto L72;
            case 27: goto L71;
            case 28: goto L70;
            case 29: goto L69;
            case 30: goto L68;
            case 31: goto L67;
            case 32: goto L66;
            case 33: goto L65;
            case 34: goto L64;
            case 35: goto L63;
            case 36: goto L62;
            case 37: goto L61;
            case 38: goto L60;
            case 39: goto L59;
            case 40: goto L58;
            case 41: goto L57;
            case 42: goto L56;
            case 43: goto L55;
            case 44: goto L54;
            case 45: goto L53;
            case 46: goto L52;
            case 47: goto L51;
            case 48: goto L50;
            case 49: goto L49;
            case 50: goto L48;
            case 51: goto L47;
            case 52: goto L46;
            case 53: goto L45;
            case 54: goto L44;
            case 55: goto L43;
            case 56: goto L42;
            case 57: goto L41;
            case 58: goto L40;
            case 59: goto L39;
            case 60: goto L38;
            case 61: goto L37;
            case 62: goto L36;
            case 63: goto L35;
            case 64: goto L34;
            case 65: goto L31;
            case 66: goto L29;
            case 67: goto L28;
            case 68: goto L27;
            case 69: goto L26;
            case 70: goto L25;
            case 71: goto L98;
            case 72: goto L24;
            case 73: goto L23;
            case 74: goto L22;
            case 75: goto L21;
            case 76: goto L20;
            case 77: goto L19;
            case 78: goto L18;
            case 79: goto L17;
            case 80: goto L16;
            case 81: goto L15;
            case 82: goto L14;
            default: goto L13;
        };
    L13:
        Integer.toHexString(r3);
        r9.get(r3);
        goto L98
    L14:
        Integer.toHexString(r3);
        r9.get(r3);
        goto L98
    L15:
        r8.f4003h0 = r122.getBoolean(r3, r8.f4003h0);
        goto L98
    L16:
        r8.f4001g0 = r122.getBoolean(r3, r8.f4001g0);
        goto L98
    L17:
        r6.f4026c = r122.getFloat(r3, r6.f4026c);
        goto L98
    L18:
        r5.f4029b = r122.getInt(r3, r5.f4029b);
        goto L98
    L19:
        r8.f3999f0 = r122.getString(r3);
        goto L98
    L20:
        r6.f4025b = r122.getInt(r3, r6.f4025b);
        goto L98
    L21:
        r8.f4005i0 = r122.getBoolean(r3, r8.f4005i0);
        goto L98
    L22:
        r8.f3997e0 = r122.getString(r3);
        goto L98
    L23:
        r8.f3991b0 = r122.getDimensionPixelSize(r3, r8.f3991b0);
        goto L98
    L24:
        r8.f3989a0 = r122.getInt(r3, r8.f3989a0);
        goto L98
    L25:
        r8.f3987Z = r122.getFloat(r3, 1.0f);
        goto L98
    L26:
        r8.f3986Y = r122.getFloat(r3, 1.0f);
        goto L98
    L27:
        r5.f4031d = r122.getFloat(r3, r5.f4031d);
        goto L98
    L28:
        r6.f4027d = r122.getFloat(r3, r6.f4027d);
        goto L98
    L29:
        r122.getInt(r3, 0);
        r6.getClass();
        goto L98
    L34:
        r6.f4024a = m2527f(r122, r3, r6.f4024a);
        goto L98
    L35:
        r8.f4021y = r122.getFloat(r3, r8.f4021y);
        goto L98
    L36:
        r8.f4020x = r122.getDimensionPixelSize(r3, r8.f4020x);
        goto L98
    L37:
        r8.f4019w = m2527f(r122, r3, r8.f4019w);
        goto L98
    L38:
        r7.f4033a = r122.getFloat(r3, r7.f4033a);
        goto L98
    L39:
        r8.f3985X = r122.getDimensionPixelSize(r3, r8.f3985X);
        goto L98
    L40:
        r8.f3984W = r122.getDimensionPixelSize(r3, r8.f3984W);
        goto L98
    L41:
        r8.f3983V = r122.getDimensionPixelSize(r3, r8.f3983V);
        goto L98
    L42:
        r8.f3982U = r122.getDimensionPixelSize(r3, r8.f3982U);
        goto L98
    L43:
        r8.f3981T = r122.getInt(r3, r8.f3981T);
        goto L98
    L44:
        r8.f3980S = r122.getInt(r3, r8.f3980S);
        goto L98
    L45:
        r7.f4042j = r122.getDimension(r3, r7.f4042j);
        goto L98
    L46:
        r7.f4041i = r122.getDimension(r3, r7.f4041i);
        goto L98
    L47:
        r7.f4040h = r122.getDimension(r3, r7.f4040h);
        goto L98
    L48:
        r7.f4039g = r122.getDimension(r3, r7.f4039g);
        goto L98
    L49:
        r7.f4038f = r122.getDimension(r3, r7.f4038f);
        goto L98
    L50:
        r7.f4037e = r122.getFloat(r3, r7.f4037e);
        goto L98
    L51:
        r7.f4036d = r122.getFloat(r3, r7.f4036d);
        goto L98
    L52:
        r7.f4035c = r122.getFloat(r3, r7.f4035c);
        goto L98
    L53:
        r7.f4034b = r122.getFloat(r3, r7.f4034b);
        goto L98
    L54:
        r7.f4043k = true;
        r7.f4044l = r122.getDimension(r3, r7.f4044l);
        goto L98
    L55:
        r5.f4030c = r122.getFloat(r3, r5.f4030c);
        goto L98
    L56:
        r8.f3979R = r122.getInt(r3, r8.f3979R);
        goto L98
    L57:
        r8.f3978Q = r122.getInt(r3, r8.f3978Q);
        goto L98
    L58:
        r8.f3976O = r122.getFloat(r3, r8.f3976O);
        goto L98
    L59:
        r8.f3977P = r122.getFloat(r3, r8.f3977P);
        goto L98
    L60:
        r02.f3955a = r122.getResourceId(r3, r02.f3955a);
        goto L98
    L61:
        r8.f4017u = r122.getFloat(r3, r8.f4017u);
        goto L98
    L62:
        r8.f4007k = m2527f(r122, r3, r8.f4007k);
        goto L98
    L63:
        r8.f4008l = m2527f(r122, r3, r8.f4008l);
        goto L98
    L64:
        r8.f3966E = r122.getDimensionPixelSize(r3, r8.f3966E);
        goto L98
    L65:
        r8.f4013q = m2527f(r122, r3, r8.f4013q);
        goto L98
    L66:
        r8.f4012p = m2527f(r122, r3, r8.f4012p);
        goto L98
    L67:
        r8.f3969H = r122.getDimensionPixelSize(r3, r8.f3969H);
        goto L98
    L68:
        r8.f4006j = m2527f(r122, r3, r8.f4006j);
        goto L98
    L69:
        r8.f4004i = m2527f(r122, r3, r8.f4004i);
        goto L98
    L70:
        r8.f3965D = r122.getDimensionPixelSize(r3, r8.f3965D);
        goto L98
    L71:
        r8.f3963B = r122.getInt(r3, r8.f3963B);
        goto L98
    L72:
        r8.f4002h = m2527f(r122, r3, r8.f4002h);
        goto L98
    L73:
        r8.f4000g = m2527f(r122, r3, r8.f4000g);
        goto L98
    L74:
        r8.f3964C = r122.getDimensionPixelSize(r3, r8.f3964C);
        goto L98
    L75:
        r8.f3990b = r122.getLayoutDimension(r3, r8.f3990b);
        goto L98
    L76:
        r5.f4028a = f4045d[r122.getInt(r3, r5.f4028a)];
        goto L98
    L77:
        r8.f3992c = r122.getLayoutDimension(r3, r8.f3992c);
        goto L98
    L78:
        r8.f4016t = r122.getFloat(r3, r8.f4016t);
        goto L98
    L79:
        r8.f3998f = r122.getFloat(r3, r8.f3998f);
        goto L98
    L80:
        r8.f3996e = r122.getDimensionPixelOffset(r3, r8.f3996e);
        goto L98
    L81:
        r8.f3994d = r122.getDimensionPixelOffset(r3, r8.f3994d);
        goto L98
    L82:
        r8.f3971J = r122.getDimensionPixelSize(r3, r8.f3971J);
        goto L98
    L83:
        r8.f3975N = r122.getDimensionPixelSize(r3, r8.f3975N);
        goto L98
    L84:
        r8.f3972K = r122.getDimensionPixelSize(r3, r8.f3972K);
        goto L98
    L85:
        r8.f3970I = r122.getDimensionPixelSize(r3, r8.f3970I);
        goto L98
    L86:
        r8.f3974M = r122.getDimensionPixelSize(r3, r8.f3974M);
        goto L98
    L87:
        r8.f3973L = r122.getDimensionPixelSize(r3, r8.f3973L);
        goto L98
    L88:
        r8.f4014r = m2527f(r122, r3, r8.f4014r);
        goto L98
    L89:
        r8.f4015s = m2527f(r122, r3, r8.f4015s);
        goto L98
    L90:
        r8.f3968G = r122.getDimensionPixelSize(r3, r8.f3968G);
        goto L98
    L91:
        r8.f3962A = r122.getDimensionPixelOffset(r3, r8.f3962A);
        goto L98
    L92:
        r8.f4022z = r122.getDimensionPixelOffset(r3, r8.f4022z);
        goto L98
    L93:
        r8.f4018v = r122.getString(r3);
        goto L98
    L94:
        r8.f4009m = m2527f(r122, r3, r8.f4009m);
        goto L98
    L95:
        r8.f4010n = m2527f(r122, r3, r8.f4010n);
        goto L98
    L96:
        r8.f3967F = r122.getDimensionPixelSize(r3, r8.f3967F);
        goto L98
    L97:
        r8.f4011o = m2527f(r122, r3, r8.f4011o);
        goto L98
    L31:
        if (r122.peekValue(r3).type != 3) goto L33;
        r122.getString(r3);
        r6.getClass();
        goto L98
    L33:
        String r32 = AbstractC0978a.f3461a[r122.getInteger(r3, 0)];
        r6.getClass();
    L98:
        r2 = r2 + 1;
        goto L3
    L7:
        if (23 == r3) goto L11;
        if (24 == r3) goto L11;
        r6.getClass();
        r8.getClass();
        r5.getClass();
        r7.getClass();
        goto L11
    L99:
        r122.recycle();
        return r02;
    }

    /* JADX INFO: renamed from: f */
    public static int m2527f(TypedArray r1, int r2, int r3) {
        int r32 = r1.getResourceId(r2, r3);
        if (r32 == (-1)) goto L5;
        return r32;
    L5:
        return r1.getInt(r2, -1);
    }

    /* JADX INFO: renamed from: a */
    public final void m2528a(ConstraintLayout r14) {
        int r02 = r14.getChildCount();
        HashMap r2 = this.f4049c;
        HashSet r1 = new HashSet(r2.keySet());
        int r3 = 0;
    L4:
        if (r3 >= r02) goto L69;
        View r6 = r14.getChildAt(r3);
        int r7 = r6.getId();
        if (r2.containsKey(Integer.valueOf(r7)) == true) goto L10;
        r6.getContext().getResources().getResourceEntryName(r6.getId());     // Catch: Exception -> L87
    L68:
        r3 = r3 + 1;
        goto L4
    L10:
        if (this.f4048b == false) goto L15;
        if (r7 != (-1)) goto L15;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L15:
        if (r7 == (-1)) goto L68;
        if (r2.containsKey(Integer.valueOf(r7)) == false) goto L68;
        r1.remove(Integer.valueOf(r7));
        C1043i r8 = (C1043i) r2.get(Integer.valueOf(r7));
        if ((r6 instanceof C1035a) == false) goto L22;
        r8.f3958d.f3993c0 = 1;
    L22:
        int r9 = r8.f3958d.f3993c0;
        if (r9 == (-1)) goto L32;
        if (r9 != 1) goto L32;
        C1035a r4 = (C1035a) r6;
        r4.setId(r7);
        C1044j r5 = r8.f3958d;
        r4.setType(r5.f3989a0);
        r4.setMargin(r5.f3991b0);
        r4.setAllowsGoneWidget(r5.f4005i0);
        int[] r72 = r5.f3995d0;
        if (r72 == null) goto L29;
        r4.setReferencedIds(r72);
        goto L32
    L29:
        String r73 = r5.f3997e0;
        if (r73 == null) goto L32;
        int[] r74 = m2525c(r4, r73);
        r5.f3995d0 = r74;
        r4.setReferencedIds(r74);
    L32:
        C1039e r42 = (C1039e) r6.getLayoutParams();
        r42.m2518a();
        r8.m2520a(r42);
        HashMap r52 = r8.f3960f;
        Class<?> r75 = r6.getClass();
        Iterator r92 = r52.keySet().iterator();
    L34:
        if (r92.hasNext() == false) goto L56;
        String r10 = (String) r92.next();
        C1036b r11 = (C1036b) r52.get(r10);
        String r102 = AbstractC0324d.m725h("set", r10);
    L42:
        e = move-exception;
        e.printStackTrace();
    L44:
        e = move-exception;
        e.getMessage();
    L40:
        e = move-exception;
        e.printStackTrace();
        goto L34
    L37:
        switch(AbstractC0988h.m2372a(r11.f3864a)) {
            case 0: goto L51;
            case 1: goto L50;
            case 2: goto L49;
            case 3: goto L48;
            case 4: goto L47;
            case 5: goto L46;
            case 6: goto L39;
            default: goto L34;
        };     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
    L39:
        r75.getMethod(r102, new Class[]{Float.TYPE}).invoke(r6, new Object[]{Float.valueOf(r11.f3866c)});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
    L46:
        r75.getMethod(r102, new Class[]{Boolean.TYPE}).invoke(r6, new Object[]{Boolean.valueOf(r11.f3868e)});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L47:
        r75.getMethod(r102, new Class[]{CharSequence.class}).invoke(r6, new Object[]{r11.f3867d});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L48:
        Method r103 = r75.getMethod(r102, new Class[]{Drawable.class});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        ColorDrawable r12 = new ColorDrawable();     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        r12.setColor(r11.f3869f);     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        r103.invoke(r6, new Object[]{r12});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L49:
        r75.getMethod(r102, new Class[]{Integer.TYPE}).invoke(r6, new Object[]{Integer.valueOf(r11.f3869f)});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L50:
        r75.getMethod(r102, new Class[]{Float.TYPE}).invoke(r6, new Object[]{Float.valueOf(r11.f3866c)});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L51:
        r75.getMethod(r102, new Class[]{Integer.TYPE}).invoke(r6, new Object[]{Integer.valueOf(r11.f3865b)});     // Catch: InvocationTargetException -> L40 IllegalAccessException -> L42 NoSuchMethodException -> L44
        goto L34
    L56:
        r6.setLayoutParams(r42);
        C1046l r43 = r8.f3956b;
        if (r43.f4029b != 0) goto L59;
        r6.setVisibility(r43.f4028a);
    L59:
        r6.setAlpha(r43.f4030c);
        C1047m r44 = r8.f3959e;
        r6.setRotation(r44.f4033a);
        r6.setRotationX(r44.f4034b);
        r6.setRotationY(r44.f4035c);
        r6.setScaleX(r44.f4036d);
        r6.setScaleY(r44.f4037e);
        if (Float.isNaN(r44.f4038f) == true) goto L63;
        r6.setPivotX(r44.f4038f);
    L63:
        if (Float.isNaN(r44.f4039g) == true) goto L65;
        r6.setPivotY(r44.f4039g);
    L65:
        r6.setTranslationX(r44.f4040h);
        r6.setTranslationY(r44.f4041i);
        r6.setTranslationZ(r44.f4042j);
        if (r44.f4043k == false) goto L68;
        r6.setElevation(r44.f4044l);
        goto L68
    L69:
        Iterator r03 = r1.iterator();
    L71:
        if (r03.hasNext() == false) goto L86;
        Integer r13 = (Integer) r03.next();
        C1043i r32 = (C1043i) r2.get(r13);
        C1044j r62 = r32.f3958d;
        int r76 = r62.f3993c0;
        if (r76 == (-1)) goto L84;
        if (r76 != 1) goto L84;
        Context r82 = r14.getContext();
        C1035a r77 = new C1035a(r82);
        r77.f3870a = new int[32];
        r77.f3875f = new HashMap();
        r77.f3872c = r82;
        r77.mo1155e(null);
        r77.setVisibility(8);
        r77.setId(r13.intValue());
        int[] r83 = r62.f3995d0;
        if (r83 == null) goto L79;
        r77.setReferencedIds(r83);
    L82:
        r77.setType(r62.f3989a0);
        r77.setMargin(r62.f3991b0);
        C1039e r84 = ConstraintLayout.m1158a();
        r77.m2517g();
        r32.m2520a(r84);
        r14.addView(r77, r84);
        goto L84
    L79:
        String r85 = r62.f3997e0;
        if (r85 == null) goto L82;
        int[] r86 = m2525c(r77, r85);
        r62.f3995d0 = r86;
        r77.setReferencedIds(r86);
    L84:
        if (r62.f3988a == false) goto L71;
        View r63 = new C1050p(r14.getContext());
        r63.setId(r13.intValue());
        C1039e r15 = ConstraintLayout.m1158a();
        r32.m2520a(r15);
        r14.addView(r63, r15);
        goto L71
    }

    /* JADX INFO: renamed from: b */
    public final void m2529b(ConstraintLayout r17) {
        C1048n r1 = this;
        int r2 = r17.getChildCount();
        HashMap r3 = r1.f4049c;
        r3.clear();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L45;
        View r6 = r17.getChildAt(r4);
        C1039e r7 = (C1039e) r6.getLayoutParams();
        int r8 = r6.getId();
        if (r1.f4048b == false) goto L12;
        if (r8 != (-1)) goto L12;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L12:
        if (r3.containsKey(Integer.valueOf(r8)) == true) goto L14;
        r3.put(Integer.valueOf(r8), new C1043i());
    L14:
        C1043i r9 = (C1043i) r3.get(Integer.valueOf(r8));
        HashMap r10 = r1.f4047a;
        HashMap r11 = new HashMap();
        Class<?> r12 = r6.getClass();
        Iterator r13 = r10.keySet().iterator();
    L16:
        if (r13.hasNext() == false) goto L33;
        String r02 = (String) r13.next();
        C1036b r14 = (C1036b) r10.get(r02);
        if (r02.equals("BackgroundColor") == false) goto L27;
        r11.put(r02, new C1036b(r14, Integer.valueOf(((ColorDrawable) r6.getBackground()).getColor())));     // Catch: InvocationTargetException -> L21 IllegalAccessException -> L23 NoSuchMethodException -> L25
        goto L16
    L27:
        r11.put(r02, new C1036b(r14, r12.getMethod("getMap" + r02, null).invoke(r6, null)));     // Catch: InvocationTargetException -> L21 IllegalAccessException -> L23 NoSuchMethodException -> L25
        goto L16
    L23:
        e = move-exception;
        e.printStackTrace();
    L25:
        e = move-exception;
        e.printStackTrace();
    L21:
        e = move-exception;
        e.printStackTrace();
        goto L16
    L33:
        r9.f3960f = r11;
        r9.f3955a = r8;
        int r03 = r7.f3909d;
        C1044j r15 = r9.f3958d;
        r15.f4000g = r03;
        r15.f4002h = r7.f3911e;
        r15.f4004i = r7.f3913f;
        r15.f4006j = r7.f3915g;
        r15.f4007k = r7.f3917h;
        r15.f4008l = r7.f3919i;
        r15.f4009m = r7.f3921j;
        r15.f4010n = r7.f3923k;
        r15.f4011o = r7.f3925l;
        r15.f4012p = r7.f3929p;
        r15.f4013q = r7.f3930q;
        r15.f4014r = r7.f3931r;
        r15.f4015s = r7.f3932s;
        r15.f4016t = r7.f3939z;
        r15.f4017u = r7.f3877A;
        r15.f4018v = r7.f3878B;
        r15.f4019w = r7.f3926m;
        r15.f4020x = r7.f3927n;
        r15.f4021y = r7.f3928o;
        r15.f4022z = r7.f3892P;
        r15.f3962A = r7.f3893Q;
        r15.f3963B = r7.f3894R;
        r15.f3998f = r7.f3907c;
        r15.f3994d = r7.f3903a;
        r15.f3996e = r7.f3905b;
        r15.f3990b = ((ViewGroup.MarginLayoutParams) r7).width;
        r15.f3992c = ((ViewGroup.MarginLayoutParams) r7).height;
        r15.f3964C = ((ViewGroup.MarginLayoutParams) r7).leftMargin;
        r15.f3965D = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
        r15.f3966E = ((ViewGroup.MarginLayoutParams) r7).topMargin;
        r15.f3967F = ((ViewGroup.MarginLayoutParams) r7).bottomMargin;
        r15.f3976O = r7.f3881E;
        r15.f3977P = r7.f3880D;
        r15.f3979R = r7.f3883G;
        r15.f3978Q = r7.f3882F;
        r15.f4001g0 = r7.f3895S;
        r15.f4003h0 = r7.f3896T;
        r15.f3980S = r7.f3884H;
        r15.f3981T = r7.f3885I;
        r15.f3982U = r7.f3888L;
        r15.f3983V = r7.f3889M;
        r15.f3984W = r7.f3886J;
        r15.f3985X = r7.f3887K;
        r15.f3986Y = r7.f3890N;
        r15.f3987Z = r7.f3891O;
        r15.f3999f0 = r7.f3897U;
        r15.f3971J = r7.f3934u;
        r15.f3973L = r7.f3936w;
        r15.f3970I = r7.f3933t;
        r15.f3972K = r7.f3935v;
        r15.f3975N = r7.f3937x;
        r15.f3974M = r7.f3938y;
        r15.f3968G = r7.getMarginEnd();
        r15.f3969H = r7.getMarginStart();
        int r04 = r6.getVisibility();
        C1046l r72 = r9.f3956b;
        r72.f4028a = r04;
        r72.f4030c = r6.getAlpha();
        float r05 = r6.getRotation();
        C1047m r73 = r9.f3959e;
        r73.f4033a = r05;
        r73.f4034b = r6.getRotationX();
        r73.f4035c = r6.getRotationY();
        r73.f4036d = r6.getScaleX();
        r73.f4037e = r6.getScaleY();
        float r06 = r6.getPivotX();
        float r82 = r6.getPivotY();
        if (r06 == 0.0d) goto L36;
    L37:
        r73.f4038f = r06;
        r73.f4039g = r82;
    L38:
        r73.f4040h = r6.getTranslationX();
        r73.f4041i = r6.getTranslationY();
        r73.f4042j = r6.getTranslationZ();
        if (r73.f4043k == false) goto L42;
        r73.f4044l = r6.getElevation();
    L42:
        if ((r6 instanceof C1035a) == false) goto L44;
        C1035a r62 = (C1035a) r6;
        r15.f4005i0 = r62.f3863i.f3558g0;
        r15.f3995d0 = r62.getReferencedIds();
        r15.f3989a0 = r62.getType();
        r15.f3991b0 = r62.getMargin();
    L44:
        r4 = r4 + 1;
        r1 = this;
        goto L3
    L36:
        if (r82 == 0.0d) goto L38;
    }

    /* JADX INFO: renamed from: e */
    public final void m2530e(Context r5, int r6) {
        XmlResourceParser r62 = r5.getResources().getXml(r6);
        int r02 = r62.getEventType();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L5:
        if (r02 == 1) goto L32;
        if (r02 != 0) goto L8;
        r62.getName();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L19:
        r02 = r62.next();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L8:
        if (r02 != 2) goto L19;
        String r03 = r62.getName();     // Catch: IOException -> L13 XmlPullParserException -> L15
        C1043i r2 = m2526d(r5, Xml.asAttributeSet(r62));     // Catch: IOException -> L13 XmlPullParserException -> L15
        if (r03.equalsIgnoreCase("Guideline") == false) goto L17;
        r2.f3958d.f3988a = true;     // Catch: IOException -> L13 XmlPullParserException -> L15
    L17:
        this.f4049c.put(Integer.valueOf(r2.f3955a), r2);     // Catch: IOException -> L13 XmlPullParserException -> L15
        goto L19
    L32:
        return;
    L13:
        e = move-exception;
        e.printStackTrace();
        return;
    L15:
        e = move-exception;
        e.printStackTrace();
    }
}
