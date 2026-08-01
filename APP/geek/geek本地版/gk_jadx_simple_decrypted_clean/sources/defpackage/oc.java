package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
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

/* JADX INFO: loaded from: classes.dex */
public final class oc {
    public static final int[] d = null;
    public static final SparseIntArray e = null;
    public final HashMap a;
    public final boolean b;
    public final HashMap c;

    static {
        d = new int[]{0, 4, 8};
        SparseIntArray r3 = new SparseIntArray();
        e = r3;
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

    public oc() {
        this.a = new HashMap();
        this.b = true;
        this.c = new HashMap();
    }

    public static int[] c(d7 r10, String r11) {
        String[] r112 = r11.split(",");
        Context r0 = r10.getContext();
        int[] r1 = new int[r112.length];
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r112.length) goto L30;
        String r5 = r112[r3].trim();
        Object r6 = null;
        int r7 = qy.class.getField(r5).getInt(null);     // Catch: Exception -> L8
    L9:
        if (r7 != 0) goto L11;
        r7 = r0.getResources().getIdentifier(r5, "id", r0.getPackageName());
    L11:
        if (r7 != 0) goto L28;
        if (r10.isInEditMode() == false) goto L28;
        if ((r10.getParent() instanceof ConstraintLayout) == false) goto L28;
        ConstraintLayout r8 = (ConstraintLayout) r10.getParent();
        if (r5 == null) goto L23;
        HashMap r9 = r8.m;
        if (r9 != null) goto L21;
    L24:
        if (r6 == null) goto L28;
        if ((r6 instanceof Integer) == false) goto L28;
        r7 = ((Integer) r6).intValue();
        goto L28
    L21:
        if (r9.containsKey(r5) == false) goto L24;
        r6 = r8.m.get(r5);
        goto L24
    L23:
        r8.getClass();
    L28:
        r1[r4] = r7;
        r3 = r3 + 1;
        r4 = r4 + 1;
    L8:
        r7 = 0;
        goto L9
    L30:
        if (r4 != r112.length) goto L32;
        return r1;
    L32:
        return Arrays.copyOf(r1, r4);
    }

    public static jc d(Context r14, AttributeSet r15) {
        jc r0 = new jc();
        TypedArray r142 = r14.obtainStyledAttributes(r15, ry.a);
        int r152 = r142.getIndexCount();
        int r2 = 0;
    L3:
        if (r2 >= r152) goto L100;
        int r3 = r142.getIndex(r2);
        lc r4 = r0.c;
        nc r5 = r0.e;
        kc r6 = r0.d;
        if (r3 != 1) goto L7;
    L11:
        SparseIntArray r8 = e;
        int r9 = r8.get(r3);
        mc r10 = r0.b;
        switch(r9) {
            case 1: goto L98;
            case 2: goto L97;
            case 3: goto L96;
            case 4: goto L95;
            case 5: goto L94;
            case 6: goto L93;
            case 7: goto L92;
            case 8: goto L91;
            case 9: goto L90;
            case 10: goto L89;
            case 11: goto L88;
            case 12: goto L87;
            case 13: goto L86;
            case 14: goto L85;
            case 15: goto L84;
            case 16: goto L83;
            case 17: goto L82;
            case 18: goto L81;
            case 19: goto L80;
            case 20: goto L79;
            case 21: goto L78;
            case 22: goto L77;
            case 23: goto L76;
            case 24: goto L75;
            case 25: goto L74;
            case 26: goto L73;
            case 27: goto L72;
            case 28: goto L71;
            case 29: goto L70;
            case 30: goto L69;
            case 31: goto L68;
            case 32: goto L67;
            case 33: goto L66;
            case 34: goto L65;
            case 35: goto L64;
            case 36: goto L63;
            case 37: goto L62;
            case 38: goto L61;
            case 39: goto L60;
            case 40: goto L59;
            case 41: goto L58;
            case 42: goto L57;
            case 43: goto L56;
            case 44: goto L55;
            case 45: goto L54;
            case 46: goto L53;
            case 47: goto L52;
            case 48: goto L51;
            case 49: goto L50;
            case 50: goto L49;
            case 51: goto L48;
            case 52: goto L47;
            case 53: goto L46;
            case 54: goto L45;
            case 55: goto L44;
            case 56: goto L43;
            case 57: goto L42;
            case 58: goto L41;
            case 59: goto L40;
            case 60: goto L39;
            case 61: goto L38;
            case 62: goto L37;
            case 63: goto L36;
            case 64: goto L35;
            case 65: goto L32;
            case 66: goto L30;
            case 67: goto L29;
            case 68: goto L28;
            case 69: goto L27;
            case 70: goto L26;
            case 71: goto L25;
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
        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(r3) + "   " + r8.get(r3));
    L99:
        r2 = r2 + 1;
        goto L3
    L14:
        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(r3) + "   " + r8.get(r3));
        goto L99
    L15:
        r6.h0 = r142.getBoolean(r3, r6.h0);
        goto L99
    L16:
        r6.g0 = r142.getBoolean(r3, r6.g0);
        goto L99
    L17:
        r4.c = r142.getFloat(r3, r4.c);
        goto L99
    L18:
        r10.b = r142.getInt(r3, r10.b);
        goto L99
    L19:
        r6.f0 = r142.getString(r3);
        goto L99
    L20:
        r4.b = r142.getInt(r3, r4.b);
        goto L99
    L21:
        r6.i0 = r142.getBoolean(r3, r6.i0);
        goto L99
    L22:
        r6.e0 = r142.getString(r3);
        goto L99
    L23:
        r6.b0 = r142.getDimensionPixelSize(r3, r6.b0);
        goto L99
    L24:
        r6.a0 = r142.getInt(r3, r6.a0);
        goto L99
    L25:
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        goto L99
    L26:
        r6.Z = r142.getFloat(r3, 1.0f);
        goto L99
    L27:
        r6.Y = r142.getFloat(r3, 1.0f);
        goto L99
    L28:
        r10.d = r142.getFloat(r3, r10.d);
        goto L99
    L29:
        r4.d = r142.getFloat(r3, r4.d);
        goto L99
    L30:
        r142.getInt(r3, 0);
        r4.getClass();
        goto L99
    L35:
        r4.a = f(r142, r3, r4.a);
        goto L99
    L36:
        r6.y = r142.getFloat(r3, r6.y);
        goto L99
    L37:
        r6.x = r142.getDimensionPixelSize(r3, r6.x);
        goto L99
    L38:
        r6.w = f(r142, r3, r6.w);
        goto L99
    L39:
        r5.a = r142.getFloat(r3, r5.a);
        goto L99
    L40:
        r6.X = r142.getDimensionPixelSize(r3, r6.X);
        goto L99
    L41:
        r6.W = r142.getDimensionPixelSize(r3, r6.W);
        goto L99
    L42:
        r6.V = r142.getDimensionPixelSize(r3, r6.V);
        goto L99
    L43:
        r6.U = r142.getDimensionPixelSize(r3, r6.U);
        goto L99
    L44:
        r6.T = r142.getInt(r3, r6.T);
        goto L99
    L45:
        r6.S = r142.getInt(r3, r6.S);
        goto L99
    L46:
        r5.j = r142.getDimension(r3, r5.j);
        goto L99
    L47:
        r5.i = r142.getDimension(r3, r5.i);
        goto L99
    L48:
        r5.h = r142.getDimension(r3, r5.h);
        goto L99
    L49:
        r5.g = r142.getDimension(r3, r5.g);
        goto L99
    L50:
        r5.f = r142.getDimension(r3, r5.f);
        goto L99
    L51:
        r5.e = r142.getFloat(r3, r5.e);
        goto L99
    L52:
        r5.d = r142.getFloat(r3, r5.d);
        goto L99
    L53:
        r5.c = r142.getFloat(r3, r5.c);
        goto L99
    L54:
        r5.b = r142.getFloat(r3, r5.b);
        goto L99
    L55:
        r5.k = true;
        r5.l = r142.getDimension(r3, r5.l);
        goto L99
    L56:
        r10.c = r142.getFloat(r3, r10.c);
        goto L99
    L57:
        r6.R = r142.getInt(r3, r6.R);
        goto L99
    L58:
        r6.Q = r142.getInt(r3, r6.Q);
        goto L99
    L59:
        r6.O = r142.getFloat(r3, r6.O);
        goto L99
    L60:
        r6.P = r142.getFloat(r3, r6.P);
        goto L99
    L61:
        r0.a = r142.getResourceId(r3, r0.a);
        goto L99
    L62:
        r6.u = r142.getFloat(r3, r6.u);
        goto L99
    L63:
        r6.k = f(r142, r3, r6.k);
        goto L99
    L64:
        r6.l = f(r142, r3, r6.l);
        goto L99
    L65:
        r6.E = r142.getDimensionPixelSize(r3, r6.E);
        goto L99
    L66:
        r6.q = f(r142, r3, r6.q);
        goto L99
    L67:
        r6.p = f(r142, r3, r6.p);
        goto L99
    L68:
        r6.H = r142.getDimensionPixelSize(r3, r6.H);
        goto L99
    L69:
        r6.j = f(r142, r3, r6.j);
        goto L99
    L70:
        r6.i = f(r142, r3, r6.i);
        goto L99
    L71:
        r6.D = r142.getDimensionPixelSize(r3, r6.D);
        goto L99
    L72:
        r6.B = r142.getInt(r3, r6.B);
        goto L99
    L73:
        r6.h = f(r142, r3, r6.h);
        goto L99
    L74:
        r6.g = f(r142, r3, r6.g);
        goto L99
    L75:
        r6.C = r142.getDimensionPixelSize(r3, r6.C);
        goto L99
    L76:
        r6.b = r142.getLayoutDimension(r3, r6.b);
        goto L99
    L77:
        int r32 = r142.getInt(r3, r10.a);
        r10.a = r32;
        r10.a = d[r32];
        goto L99
    L78:
        r6.c = r142.getLayoutDimension(r3, r6.c);
        goto L99
    L79:
        r6.t = r142.getFloat(r3, r6.t);
        goto L99
    L80:
        r6.f = r142.getFloat(r3, r6.f);
        goto L99
    L81:
        r6.e = r142.getDimensionPixelOffset(r3, r6.e);
        goto L99
    L82:
        r6.d = r142.getDimensionPixelOffset(r3, r6.d);
        goto L99
    L83:
        r6.J = r142.getDimensionPixelSize(r3, r6.J);
        goto L99
    L84:
        r6.N = r142.getDimensionPixelSize(r3, r6.N);
        goto L99
    L85:
        r6.K = r142.getDimensionPixelSize(r3, r6.K);
        goto L99
    L86:
        r6.I = r142.getDimensionPixelSize(r3, r6.I);
        goto L99
    L87:
        r6.M = r142.getDimensionPixelSize(r3, r6.M);
        goto L99
    L88:
        r6.L = r142.getDimensionPixelSize(r3, r6.L);
        goto L99
    L89:
        r6.r = f(r142, r3, r6.r);
        goto L99
    L90:
        r6.s = f(r142, r3, r6.s);
        goto L99
    L91:
        r6.G = r142.getDimensionPixelSize(r3, r6.G);
        goto L99
    L92:
        r6.A = r142.getDimensionPixelOffset(r3, r6.A);
        goto L99
    L93:
        r6.z = r142.getDimensionPixelOffset(r3, r6.z);
        goto L99
    L94:
        r6.v = r142.getString(r3);
        goto L99
    L95:
        r6.m = f(r142, r3, r6.m);
        goto L99
    L96:
        r6.n = f(r142, r3, r6.n);
        goto L99
    L97:
        r6.F = r142.getDimensionPixelSize(r3, r6.F);
        goto L99
    L98:
        r6.o = f(r142, r3, r6.o);
        goto L99
    L32:
        if (r142.peekValue(r3).type != 3) goto L34;
        r142.getString(r3);
        r4.getClass();
        goto L99
    L34:
        String r33 = ff.m[r142.getInteger(r3, 0)];
        r4.getClass();
        goto L99
    L7:
        if (23 == r3) goto L11;
        if (24 == r3) goto L11;
        r4.getClass();
        r6.getClass();
        r5.getClass();
        goto L11
    L100:
        r142.recycle();
        return r0;
    }

    public static int f(TypedArray r1, int r2, int r3) {
        int r32 = r1.getResourceId(r2, r3);
        if (r32 == (-1)) goto L5;
        return r32;
    L5:
        return r1.getInt(r2, -1);
    }

    public final void a(ConstraintLayout r23) {
        oc r1 = this;
        int r3 = r23.getChildCount();
        HashMap r5 = r1.c;
        HashSet r4 = new HashSet(r5.keySet());
        int r7 = 0;
    L4:
        if (r7 >= r3) goto L84;
        View r9 = r23.getChildAt(r7);
        int r10 = r9.getId();
        if (r5.containsKey(Integer.valueOf(r10)) == true) goto L14;
        StringBuilder r0 = new StringBuilder("id unknown ");
        String r8 = r9.getContext().getResources().getResourceEntryName(r9.getId());     // Catch: Exception -> L10
    L11:
        r0.append(r8);
        Log.w("ConstraintSet", r0.toString());
    L12:
        int r17 = r3;
        HashSet r18 = r4;
        int r21 = r7;
    L83:
        r7 = r21 + 1;
        r1 = this;
        r3 = r17;
        r4 = r18;
    L10:
        r8 = "UNKNOWN";
        goto L11
    L14:
        if (r1.b == false) goto L19;
        if (r10 != (-1)) goto L19;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L19:
        if (r10 == (-1)) goto L12;
        if (r5.containsKey(Integer.valueOf(r10)) == false) goto L82;
        r4.remove(Integer.valueOf(r10));
        jc r11 = (jc) r5.get(Integer.valueOf(r10));
        if ((r9 instanceof d7) == false) goto L26;
        r11.d.c0 = 1;
    L26:
        kc r12 = r11.d;
        mc r13 = r11.b;
        nc r14 = r11.e;
        int r15 = r12.c0;
        if (r15 == (-1)) goto L36;
        if (r15 != 1) goto L36;
        d7 r02 = (d7) r9;
        r02.setId(r10);
        r02.setType(r12.a0);
        r02.setMargin(r12.b0);
        r02.setAllowsGoneWidget(r12.i0);
        int[] r82 = r12.d0;
        if (r82 == null) goto L33;
        r02.setReferencedIds(r82);
        goto L36
    L33:
        String r83 = r12.e0;
        if (r83 == null) goto L36;
        int[] r84 = c(r02, r83);
        r12.d0 = r84;
        r02.setReferencedIds(r84);
    L36:
        gc r85 = (gc) r9.getLayoutParams();
        r85.a();
        r11.a(r85);
        HashMap r102 = r11.f;
        Class<?> r6 = r9.getClass();
        Iterator r16 = r102.keySet().iterator();
    L38:
        if (r16.hasNext() == false) goto L70;
        String r19 = (String) r16.next();
        dc r03 = (dc) r102.get(r19);
        int r172 = r3;
        HashSet r182 = r4;
        String r32 = "set" + r19;
        int r42 = z30.t(r03.a);     // Catch: InvocationTargetException -> L45 IllegalAccessException -> L47 NoSuchMethodException -> L49
        Class r192 = Integer.TYPE;
        Class r20 = Float.TYPE;
        switch(r42) {
            case 0: goto L64;
            case 1: goto L63;
            case 2: goto L62;
            case 3: goto L53;
            case 4: goto L52;
            case 5: goto L51;
            case 6: goto L44;
            default: goto L43;
        };
    L43:
        int r212 = r7;
    L69:
        r3 = r172;
        r4 = r182;
        r7 = r212;
        goto L38
    L44:
        r6.getMethod(r32, new Class[]{r20}).invoke(r9, new Object[]{Float.valueOf(r03.c)});     // Catch: InvocationTargetException -> L45 IllegalAccessException -> L47 NoSuchMethodException -> L49
        goto L43
    L51:
        r6.getMethod(r32, new Class[]{Boolean.TYPE}).invoke(r9, new Object[]{Boolean.valueOf(r03.e)});     // Catch: InvocationTargetException -> L45 IllegalAccessException -> L47 NoSuchMethodException -> L49
        goto L43
    L52:
        r6.getMethod(r32, new Class[]{CharSequence.class}).invoke(r9, new Object[]{r03.d});     // Catch: InvocationTargetException -> L45 IllegalAccessException -> L47 NoSuchMethodException -> L49
        goto L43
    L53:
        Method r43 = r6.getMethod(r32, new Class[]{Drawable.class});     // Catch: InvocationTargetException -> L45 IllegalAccessException -> L47 NoSuchMethodException -> L49
        r212 = r7;
        ColorDrawable r72 = new ColorDrawable();     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
        r72.setColor(r03.f);     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
        r43.invoke(r9, new Object[]{r72});     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
    L58:
        e = e;
    L67:
        Log.e("TransitionLayout", " Custom Attribute \"" + r19 + "\" not found on " + r6.getName());
        e.printStackTrace();
    L60:
        e = e;
    L68:
        Log.e("TransitionLayout", e.getMessage());
        Log.e("TransitionLayout", " Custom Attribute \"" + r19 + "\" not found on " + r6.getName());
        Log.e("TransitionLayout", r6.getName() + " must have a method " + r32);
    L56:
        e = e;
    L66:
        Log.e("TransitionLayout", " Custom Attribute \"" + r19 + "\" not found on " + r6.getName());
        e.printStackTrace();
        goto L69
    L62:
        r212 = r7;
        r6.getMethod(r32, new Class[]{r192}).invoke(r9, new Object[]{Integer.valueOf(r03.f)});     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
        goto L69
    L63:
        r212 = r7;
        r6.getMethod(r32, new Class[]{r20}).invoke(r9, new Object[]{Float.valueOf(r03.c)});     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
        goto L69
    L64:
        r212 = r7;
        r6.getMethod(r32, new Class[]{r192}).invoke(r9, new Object[]{Integer.valueOf(r03.b)});     // Catch: InvocationTargetException -> L56 IllegalAccessException -> L58 NoSuchMethodException -> L60
        goto L69
    L47:
        e = e;
        r212 = r7;
    L49:
        e = e;
        r212 = r7;
    L45:
        e = e;
        r212 = r7;
        goto L66
    L70:
        r17 = r3;
        r18 = r4;
        r21 = r7;
        r9.setLayoutParams(r85);
        if (r13.b != 0) goto L73;
        r9.setVisibility(r13.a);
    L73:
        r9.setAlpha(r13.c);
        r9.setRotation(r14.a);
        r9.setRotationX(r14.b);
        r9.setRotationY(r14.c);
        r9.setScaleX(r14.d);
        r9.setScaleY(r14.e);
        if (Float.isNaN(r14.f) == true) goto L77;
        r9.setPivotX(r14.f);
    L77:
        if (Float.isNaN(r14.g) == true) goto L79;
        r9.setPivotY(r14.g);
    L79:
        r9.setTranslationX(r14.h);
        r9.setTranslationY(r14.i);
        r9.setTranslationZ(r14.j);
        if (r14.k == false) goto L83;
        r9.setElevation(r14.l);
        goto L83
    L82:
        r17 = r3;
        r18 = r4;
        r21 = r7;
        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + r10);
        goto L83
    L84:
        Iterator r110 = r4.iterator();
    L86:
        if (r110.hasNext() == false) goto L101;
        Integer r33 = (Integer) r110.next();
        jc r44 = (jc) r5.get(r33);
        kc r62 = r44.d;
        int r73 = r62.c0;
        if (r73 == (-1)) goto L99;
        if (r73 != 1) goto L99;
        Context r92 = r23.getContext();
        d7 r74 = new d7(r92);
        r74.a = new int[32];
        r74.f = new HashMap();
        r74.c = r92;
        e7 r93 = new e7();
        r93.f0 = 0;
        r93.g0 = true;
        r93.h0 = 0;
        r74.i = r93;
        r74.d = r93;
        r74.g();
        r74.setVisibility(8);
        r74.setId(r33.intValue());
        int[] r94 = r62.d0;
        if (r94 == null) goto L94;
        r74.setReferencedIds(r94);
    L97:
        r74.setType(r62.a0);
        r74.setMargin(r62.b0);
        gc r95 = ConstraintLayout.a();
        r74.g();
        r44.a(r95);
        r23.addView(r74, r95);
        goto L99
    L94:
        String r96 = r62.e0;
        if (r96 == null) goto L97;
        int[] r97 = c(r74, r96);
        r62.d0 = r97;
        r74.setReferencedIds(r97);
    L99:
        if (r62.a == false) goto L86;
        View r63 = new fo(r23.getContext());
        r63.setId(r33.intValue());
        gc r34 = ConstraintLayout.a();
        r44.a(r34);
        r23.addView(r63, r34);
        goto L86
    }

    public final void b(ConstraintLayout r17) {
        oc r1 = this;
        int r2 = r17.getChildCount();
        HashMap r3 = r1.c;
        r3.clear();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L45;
        View r6 = r17.getChildAt(r4);
        gc r7 = (gc) r6.getLayoutParams();
        int r8 = r6.getId();
        if (r1.b == false) goto L12;
        if (r8 != (-1)) goto L12;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L12:
        if (r3.containsKey(Integer.valueOf(r8)) == true) goto L14;
        r3.put(Integer.valueOf(r8), new jc());
    L14:
        jc r9 = (jc) r3.get(Integer.valueOf(r8));
        HashMap r10 = new HashMap();
        Class<?> r11 = r6.getClass();
        HashMap r12 = r1.a;
        Iterator r13 = r12.keySet().iterator();
    L16:
        if (r13.hasNext() == false) goto L33;
        String r0 = (String) r13.next();
        dc r14 = (dc) r12.get(r0);
        if (r0.equals("BackgroundColor") == false) goto L27;
        r10.put(r0, new dc(r14, Integer.valueOf(((ColorDrawable) r6.getBackground()).getColor())));     // Catch: InvocationTargetException -> L21 IllegalAccessException -> L23 NoSuchMethodException -> L25
        goto L16
    L27:
        r10.put(r0, new dc(r14, r11.getMethod("getMap" + r0, null).invoke(r6, null)));     // Catch: InvocationTargetException -> L21 IllegalAccessException -> L23 NoSuchMethodException -> L25
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
        r9.f = r10;
        mc r02 = r9.b;
        kc r15 = r9.d;
        nc r102 = r9.e;
        r9.a = r8;
        r15.g = r7.d;
        r15.h = r7.e;
        r15.i = r7.f;
        r15.j = r7.g;
        r15.k = r7.h;
        r15.l = r7.i;
        r15.m = r7.j;
        r15.n = r7.k;
        r15.o = r7.l;
        r15.p = r7.p;
        r15.q = r7.q;
        r15.r = r7.r;
        r15.s = r7.s;
        r15.t = r7.z;
        r15.u = r7.A;
        r15.v = r7.B;
        r15.w = r7.m;
        r15.x = r7.n;
        r15.y = r7.o;
        r15.z = r7.P;
        r15.A = r7.Q;
        r15.B = r7.R;
        r15.f = r7.c;
        r15.d = r7.a;
        r15.e = r7.b;
        r15.b = ((ViewGroup.MarginLayoutParams) r7).width;
        r15.c = ((ViewGroup.MarginLayoutParams) r7).height;
        r15.C = ((ViewGroup.MarginLayoutParams) r7).leftMargin;
        r15.D = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
        r15.E = ((ViewGroup.MarginLayoutParams) r7).topMargin;
        r15.F = ((ViewGroup.MarginLayoutParams) r7).bottomMargin;
        r15.O = r7.E;
        r15.P = r7.D;
        r15.R = r7.G;
        r15.Q = r7.F;
        r15.g0 = r7.S;
        r15.h0 = r7.T;
        r15.S = r7.H;
        r15.T = r7.I;
        r15.U = r7.L;
        r15.V = r7.M;
        r15.W = r7.J;
        r15.X = r7.K;
        r15.Y = r7.N;
        r15.Z = r7.O;
        r15.f0 = r7.U;
        r15.J = r7.u;
        r15.L = r7.w;
        r15.I = r7.t;
        r15.K = r7.v;
        r15.N = r7.x;
        r15.M = r7.y;
        r15.G = r7.getMarginEnd();
        r15.H = r7.getMarginStart();
        r02.a = r6.getVisibility();
        r02.c = r6.getAlpha();
        r102.a = r6.getRotation();
        r102.b = r6.getRotationX();
        r102.c = r6.getRotationY();
        r102.d = r6.getScaleX();
        r102.e = r6.getScaleY();
        float r03 = r6.getPivotX();
        float r72 = r6.getPivotY();
        if (r03 == 0.0d) goto L36;
    L37:
        r102.f = r03;
        r102.g = r72;
    L38:
        r102.h = r6.getTranslationX();
        r102.i = r6.getTranslationY();
        r102.j = r6.getTranslationZ();
        if (r102.k == false) goto L42;
        r102.l = r6.getElevation();
    L42:
        if ((r6 instanceof d7) == false) goto L44;
        d7 r62 = (d7) r6;
        r15.i0 = r62.i.g0;
        r15.d0 = r62.getReferencedIds();
        r15.a0 = r62.getType();
        r15.b0 = r62.getMargin();
    L44:
        r4 = r4 + 1;
        r1 = this;
        goto L3
    L36:
        if (r72 == 0.0d) goto L38;
    }

    public final void e(Context r5, int r6) {
        XmlResourceParser r62 = r5.getResources().getXml(r6);
        int r0 = r62.getEventType();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L5:
        if (r0 == 1) goto L32;
        if (r0 != 0) goto L8;
        r62.getName();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L19:
        r0 = r62.next();     // Catch: IOException -> L13 XmlPullParserException -> L15
    L8:
        if (r0 != 2) goto L19;
        String r02 = r62.getName();     // Catch: IOException -> L13 XmlPullParserException -> L15
        jc r2 = d(r5, Xml.asAttributeSet(r62));     // Catch: IOException -> L13 XmlPullParserException -> L15
        if (r02.equalsIgnoreCase("Guideline") == false) goto L17;
        r2.d.a = true;     // Catch: IOException -> L13 XmlPullParserException -> L15
    L17:
        this.c.put(Integer.valueOf(r2.a), r2);     // Catch: IOException -> L13 XmlPullParserException -> L15
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
