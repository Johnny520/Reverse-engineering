package p000;

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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: qb */
/* JADX INFO: loaded from: classes.dex */
public final class C2411qb {

    /* JADX INFO: renamed from: d */
    public static final int[] f8451d = null;

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f8452e = null;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f8453f = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f8454a;

    /* JADX INFO: renamed from: b */
    public final boolean f8455b;

    /* JADX INFO: renamed from: c */
    public final HashMap f8456c;

    static {
        f8451d = new int[]{0, 4, 8};
        SparseIntArray r0 = new SparseIntArray();
        f8452e = r0;
        SparseIntArray r3 = new SparseIntArray();
        f8453f = r3;
        r0.append(82, 25);
        r0.append(83, 26);
        r0.append(85, 29);
        r0.append(86, 30);
        r0.append(92, 36);
        r0.append(91, 35);
        r0.append(63, 4);
        r0.append(62, 3);
        r0.append(58, 1);
        r0.append(60, 91);
        r0.append(59, 92);
        r0.append(101, 6);
        r0.append(102, 7);
        r0.append(70, 17);
        r0.append(71, 18);
        r0.append(72, 19);
        r0.append(54, 99);
        r0.append(0, 27);
        r0.append(87, 32);
        r0.append(88, 33);
        r0.append(69, 10);
        r0.append(68, 9);
        r0.append(106, 13);
        r0.append(109, 16);
        r0.append(107, 14);
        r0.append(104, 11);
        r0.append(108, 15);
        r0.append(105, 12);
        r0.append(95, 40);
        r0.append(80, 39);
        r0.append(79, 41);
        r0.append(94, 42);
        r0.append(78, 20);
        r0.append(93, 37);
        r0.append(67, 5);
        r0.append(81, 87);
        r0.append(90, 87);
        r0.append(84, 87);
        r0.append(61, 87);
        r0.append(57, 87);
        r0.append(5, 24);
        r0.append(7, 28);
        r0.append(23, 31);
        r0.append(24, 8);
        r0.append(6, 34);
        r0.append(8, 2);
        r0.append(3, 23);
        r0.append(4, 21);
        r0.append(96, 95);
        r0.append(73, 96);
        r0.append(2, 22);
        r0.append(13, 43);
        r0.append(26, 44);
        r0.append(21, 45);
        r0.append(22, 46);
        r0.append(20, 60);
        r0.append(18, 47);
        r0.append(19, 48);
        r0.append(14, 49);
        r0.append(15, 50);
        r0.append(16, 51);
        r0.append(17, 52);
        r0.append(25, 53);
        r0.append(97, 54);
        r0.append(74, 55);
        r0.append(98, 56);
        r0.append(75, 57);
        r0.append(99, 58);
        r0.append(76, 59);
        r0.append(64, 61);
        r0.append(66, 62);
        r0.append(65, 63);
        r0.append(28, 64);
        r0.append(121, 65);
        r0.append(35, 66);
        r0.append(122, 67);
        r0.append(113, 79);
        r0.append(1, 38);
        r0.append(112, 68);
        r0.append(100, 69);
        r0.append(77, 70);
        r0.append(111, 97);
        r0.append(32, 71);
        r0.append(30, 72);
        r0.append(31, 73);
        r0.append(33, 74);
        r0.append(29, 75);
        r0.append(114, 76);
        r0.append(89, 77);
        r0.append(123, 78);
        r0.append(56, 80);
        r0.append(55, 81);
        r0.append(116, 82);
        r0.append(120, 83);
        r0.append(119, 84);
        r0.append(118, 85);
        r0.append(117, 86);
        r3.append(85, 6);
        r3.append(85, 7);
        r3.append(0, 27);
        r3.append(89, 13);
        r3.append(92, 16);
        r3.append(90, 14);
        r3.append(87, 11);
        r3.append(91, 15);
        r3.append(88, 12);
        r3.append(78, 40);
        r3.append(71, 39);
        r3.append(70, 41);
        r3.append(77, 42);
        r3.append(69, 20);
        r3.append(76, 37);
        r3.append(60, 5);
        r3.append(72, 87);
        r3.append(75, 87);
        r3.append(73, 87);
        r3.append(57, 87);
        r3.append(56, 87);
        r3.append(5, 24);
        r3.append(7, 28);
        r3.append(23, 31);
        r3.append(24, 8);
        r3.append(6, 34);
        r3.append(8, 2);
        r3.append(3, 23);
        r3.append(4, 21);
        r3.append(79, 95);
        r3.append(64, 96);
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
        r3.append(80, 54);
        r3.append(65, 55);
        r3.append(81, 56);
        r3.append(66, 57);
        r3.append(82, 58);
        r3.append(67, 59);
        r3.append(59, 62);
        r3.append(58, 63);
        r3.append(28, 64);
        r3.append(105, 65);
        r3.append(34, 66);
        r3.append(106, 67);
        r3.append(96, 79);
        r3.append(1, 38);
        r3.append(97, 98);
        r3.append(95, 68);
        r3.append(83, 69);
        r3.append(68, 70);
        r3.append(32, 71);
        r3.append(30, 72);
        r3.append(31, 73);
        r3.append(33, 74);
        r3.append(29, 75);
        r3.append(98, 76);
        r3.append(74, 77);
        r3.append(107, 78);
        r3.append(55, 80);
        r3.append(54, 81);
        r3.append(100, 82);
        r3.append(104, 83);
        r3.append(103, 84);
        r3.append(102, 85);
        r3.append(101, 86);
        r3.append(94, 97);
    }

    public C2411qb() {
        this.f8454a = new HashMap();
        this.f8455b = true;
        this.f8456c = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static int[] m4848c(C2348p5 r10, String r11) {
        String[] r112 = r11.split(",");
        Context r0 = r10.getContext();
        int[] r1 = new int[r112.length];
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r112.length) goto L30;
        String r5 = r112[r3].trim();
        Object r6 = null;
        int r7 = AbstractC0553Mu.class.getField(r5).getInt(null);     // Catch: Exception -> L8
    L9:
        if (r7 != 0) goto L11;
        r7 = r0.getResources().getIdentifier(r5, "id", r0.getPackageName());
    L11:
        if (r7 != 0) goto L28;
        if (r10.isInEditMode() == false) goto L28;
        if ((r10.getParent() instanceof ConstraintLayout) == false) goto L28;
        ConstraintLayout r8 = (ConstraintLayout) r10.getParent();
        if (r5 == null) goto L23;
        HashMap r9 = r8.f3883m;
        if (r9 != null) goto L21;
    L24:
        if (r6 == null) goto L28;
        if ((r6 instanceof Integer) == false) goto L28;
        r7 = ((Integer) r6).intValue();
        goto L28
    L21:
        if (r9.containsKey(r5) == false) goto L24;
        r6 = r8.f3883m.get(r5);
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

    /* JADX INFO: renamed from: d */
    public static C2188lb m4849d(Context r16, AttributeSet r17, boolean r18) {
        C2188lb r0 = new C2188lb();
        if (r18 == false) goto L6;
        int[] r1 = AbstractC0639Ou.f2036c;
    L7:
        TypedArray r12 = r16.obtainStyledAttributes(r17, r1);
        String[] r2 = AbstractC0585Nj.f1897b;
        C2317ob r3 = r0.f7633b;
        C2368pb r4 = r0.f7636e;
        C2274nb r5 = r0.f7634c;
        C2231mb r6 = r0.f7635d;
        int[] r7 = f8451d;
        SparseIntArray r11 = f8452e;
        int r122 = 3;
        if (r18 == false) goto L112;
        int r9 = r12.getIndexCount();
        C2141kb r13 = new C2141kb();
        r13.f7487a = new int[10];
        r13.f7488b = new int[10];
        r13.f7489c = 0;
        r13.f7490d = new int[10];
        r13.f7491e = new float[10];
        r13.f7492f = 0;
        r13.f7493g = new int[5];
        r13.f7494h = new String[5];
        r13.f7495i = 0;
        r13.f7496j = new int[4];
        r13.f7497k = new boolean[4];
        r13.f7498l = 0;
        r5.getClass();
        r6.getClass();
        r4.getClass();
        int r8 = 0;
    L10:
        if (r8 >= r9) goto L234;
        int r15 = r12.getIndex(r8);
        switch(f8453f.get(r15)) {
            case 2: goto L110;
            case 3: goto L13;
            case 4: goto L13;
            case 5: goto L109;
            case 6: goto L108;
            case 7: goto L107;
            case 8: goto L106;
            case 9: goto L13;
            case 10: goto L13;
            case 11: goto L105;
            case 12: goto L104;
            case 13: goto L103;
            case 14: goto L102;
            case 15: goto L101;
            case 16: goto L100;
            case 17: goto L99;
            case 18: goto L98;
            case 19: goto L97;
            case 20: goto L96;
            case 21: goto L95;
            case 22: goto L94;
            case 23: goto L93;
            case 24: goto L92;
            case 25: goto L13;
            case 26: goto L13;
            case 27: goto L91;
            case 28: goto L90;
            case 29: goto L13;
            case 30: goto L13;
            case 31: goto L89;
            case 32: goto L13;
            case 33: goto L13;
            case 34: goto L88;
            case 35: goto L13;
            case 36: goto L13;
            case 37: goto L87;
            case 38: goto L86;
            case 39: goto L85;
            case 40: goto L84;
            case 41: goto L83;
            case 42: goto L82;
            case 43: goto L81;
            case 44: goto L80;
            case 45: goto L79;
            case 46: goto L78;
            case 47: goto L77;
            case 48: goto L76;
            case 49: goto L75;
            case 50: goto L74;
            case 51: goto L73;
            case 52: goto L72;
            case 53: goto L71;
            case 54: goto L70;
            case 55: goto L69;
            case 56: goto L68;
            case 57: goto L67;
            case 58: goto L66;
            case 59: goto L65;
            case 60: goto L64;
            case 61: goto L13;
            case 62: goto L63;
            case 63: goto L62;
            case 64: goto L61;
            case 65: goto L58;
            case 66: goto L56;
            case 67: goto L55;
            case 68: goto L54;
            case 69: goto L53;
            case 70: goto L52;
            case 71: goto L111;
            case 72: goto L51;
            case 73: goto L50;
            case 74: goto L49;
            case 75: goto L48;
            case 76: goto L47;
            case 77: goto L46;
            case 78: goto L45;
            case 79: goto L44;
            case 80: goto L43;
            case 81: goto L42;
            case 82: goto L41;
            case 83: goto L40;
            case 84: goto L39;
            case 85: goto L38;
            case 86: goto L26;
            case 87: goto L25;
            case 88: goto L13;
            case 89: goto L13;
            case 90: goto L13;
            case 91: goto L13;
            case 92: goto L13;
            case 93: goto L24;
            case 94: goto L23;
            case 95: goto L22;
            case 96: goto L21;
            case 97: goto L20;
            case 98: goto L16;
            case 99: goto L15;
            default: goto L13;
        };
    L13:
        Integer.toHexString(r15);
        r11.get(r15);
        goto L111
    L15:
        r13.m4331d(99, r12.getBoolean(r15, r6.f7842g));
        goto L111
    L16:
        int r14 = AbstractC2114js.f7434q;
        if (r12.peekValue(r15).type != r122) goto L19;
        r12.getString(r15);
        goto L111
    L19:
        r0.f7632a = r12.getResourceId(r15, r0.f7632a);
        goto L111
    L20:
        r13.m4329b(97, r12.getInt(r15, r6.f7859o0));
        goto L111
    L21:
        m4851g(r13, r12, r15, 1);
        goto L111
    L22:
        m4851g(r13, r12, r15, 0);
        goto L111
    L23:
        r13.m4329b(94, r12.getDimensionPixelSize(r15, r6.f7822S));
        goto L111
    L24:
        r13.m4329b(93, r12.getDimensionPixelSize(r15, r6.f7815L));
        goto L111
    L25:
        Integer.toHexString(r15);
        r11.get(r15);
        goto L111
    L26:
        int r142 = r12.peekValue(r15).type;
        if (r142 != 1) goto L32;
        int r143 = r12.getResourceId(r15, -1);
        r5.f8008i = r143;
        r13.m4329b(89, r143);
        if (r5.f8008i == (-1)) goto L111;
        r13.m4329b(88, -2);
        goto L111
    L32:
        if (r142 != 3) goto L37;
        String r123 = r12.getString(r15);
        r5.f8007h = r123;
        r13.m4330c(90, r123);
        if (r5.f8007h.indexOf("/") <= 0) goto L36;
        int r144 = r12.getResourceId(r15, -1);
        r5.f8008i = r144;
        r13.m4329b(89, r144);
        r13.m4329b(88, -2);
        goto L111
    L36:
        r13.m4329b(88, -1);
        goto L111
    L37:
        r13.m4329b(88, r12.getInteger(r15, r5.f8008i));
        goto L111
    L38:
        r13.m4328a(85, r12.getFloat(r15, r5.f8005f));
        goto L111
    L39:
        r13.m4329b(84, r12.getInteger(r15, r5.f8006g));
        goto L111
    L40:
        r13.m4329b(83, m4850f(r12, r15, r4.f8328h));
        goto L111
    L41:
        r13.m4329b(82, r12.getInteger(r15, r5.f8001b));
        goto L111
    L42:
        r13.m4331d(81, r12.getBoolean(r15, r6.f7855m0));
        goto L111
    L43:
        r13.m4331d(80, r12.getBoolean(r15, r6.f7853l0));
        goto L111
    L44:
        r13.m4328a(79, r12.getFloat(r15, r5.f8003d));
        goto L111
    L45:
        r13.m4329b(78, r12.getInt(r15, r3.f8161b));
        goto L111
    L46:
        r13.m4330c(77, r12.getString(r15));
        goto L111
    L47:
        r13.m4329b(76, r12.getInt(r15, r5.f8002c));
        goto L111
    L48:
        r13.m4331d(75, r12.getBoolean(r15, r6.f7857n0));
        goto L111
    L49:
        r13.m4330c(74, r12.getString(r15));
        goto L111
    L50:
        r13.m4329b(73, r12.getDimensionPixelSize(r15, r6.f7843g0));
        goto L111
    L51:
        r13.m4329b(72, r12.getInt(r15, r6.f7841f0));
        goto L111
    L52:
        r13.m4328a(70, r12.getFloat(r15, 1.0f));
        goto L111
    L53:
        r13.m4328a(69, r12.getFloat(r15, 1.0f));
        goto L111
    L54:
        r13.m4328a(68, r12.getFloat(r15, r3.f8163d));
        goto L111
    L55:
        r13.m4328a(67, r12.getFloat(r15, r5.f8004e));
        goto L111
    L56:
        r13.m4329b(66, r12.getInt(r15, 0));
        goto L111
    L61:
        r13.m4329b(64, m4850f(r12, r15, r5.f8000a));
        goto L111
    L62:
        r13.m4328a(63, r12.getFloat(r15, r6.f7805B));
        goto L111
    L63:
        r13.m4329b(62, r12.getDimensionPixelSize(r15, r6.f7804A));
        goto L111
    L64:
        r13.m4328a(60, r12.getFloat(r15, r4.f8321a));
        goto L111
    L65:
        r13.m4329b(59, r12.getDimensionPixelSize(r15, r6.f7835c0));
        goto L111
    L66:
        r13.m4329b(58, r12.getDimensionPixelSize(r15, r6.f7833b0));
        goto L111
    L67:
        r13.m4329b(57, r12.getDimensionPixelSize(r15, r6.f7831a0));
        goto L111
    L68:
        r13.m4329b(56, r12.getDimensionPixelSize(r15, r6.f7829Z));
        goto L111
    L69:
        r13.m4329b(55, r12.getInt(r15, r6.f7828Y));
        goto L111
    L70:
        r13.m4329b(54, r12.getInt(r15, r6.f7827X));
        goto L111
    L71:
        r13.m4328a(53, r12.getDimension(r15, r4.f8331k));
        goto L111
    L72:
        r13.m4328a(52, r12.getDimension(r15, r4.f8330j));
        goto L111
    L73:
        r13.m4328a(51, r12.getDimension(r15, r4.f8329i));
        goto L111
    L74:
        r13.m4328a(50, r12.getDimension(r15, r4.f8327g));
        goto L111
    L75:
        r13.m4328a(49, r12.getDimension(r15, r4.f8326f));
        goto L111
    L76:
        r13.m4328a(48, r12.getFloat(r15, r4.f8325e));
        goto L111
    L77:
        r13.m4328a(47, r12.getFloat(r15, r4.f8324d));
        goto L111
    L78:
        r13.m4328a(46, r12.getFloat(r15, r4.f8323c));
        goto L111
    L79:
        r13.m4328a(45, r12.getFloat(r15, r4.f8322b));
        goto L111
    L80:
        r13.m4331d(44, true);
        r13.m4328a(44, r12.getDimension(r15, r4.f8333m));
        goto L111
    L81:
        r13.m4328a(43, r12.getFloat(r15, r3.f8162c));
        goto L111
    L82:
        r13.m4329b(42, r12.getInt(r15, r6.f7826W));
        goto L111
    L83:
        r13.m4329b(41, r12.getInt(r15, r6.f7825V));
        goto L111
    L84:
        r13.m4328a(40, r12.getFloat(r15, r6.f7823T));
        goto L111
    L85:
        r13.m4328a(39, r12.getFloat(r15, r6.f7824U));
        goto L111
    L86:
        int r124 = r12.getResourceId(r15, r0.f7632a);
        r0.f7632a = r124;
        r13.m4329b(38, r124);
        goto L111
    L87:
        r13.m4328a(37, r12.getFloat(r15, r6.f7868x));
        goto L111
    L88:
        r13.m4329b(34, r12.getDimensionPixelSize(r15, r6.f7811H));
        goto L111
    L89:
        r13.m4329b(31, r12.getDimensionPixelSize(r15, r6.f7814K));
        goto L111
    L90:
        r13.m4329b(28, r12.getDimensionPixelSize(r15, r6.f7810G));
        goto L111
    L91:
        r13.m4329b(27, r12.getInt(r15, r6.f7808E));
        goto L111
    L92:
        r13.m4329b(24, r12.getDimensionPixelSize(r15, r6.f7809F));
        goto L111
    L93:
        r13.m4329b(23, r12.getLayoutDimension(r15, r6.f7832b));
        goto L111
    L94:
        r13.m4329b(22, r7[r12.getInt(r15, r3.f8160a)]);
        goto L111
    L95:
        r13.m4329b(21, r12.getLayoutDimension(r15, r6.f7834c));
        goto L111
    L96:
        r13.m4328a(20, r12.getFloat(r15, r6.f7867w));
        goto L111
    L97:
        r13.m4328a(19, r12.getFloat(r15, r6.f7840f));
        goto L111
    L98:
        r13.m4329b(18, r12.getDimensionPixelOffset(r15, r6.f7838e));
        goto L111
    L99:
        r13.m4329b(17, r12.getDimensionPixelOffset(r15, r6.f7836d));
        goto L111
    L100:
        r13.m4329b(16, r12.getDimensionPixelSize(r15, r6.f7817N));
        goto L111
    L101:
        r13.m4329b(15, r12.getDimensionPixelSize(r15, r6.f7821R));
        goto L111
    L102:
        r13.m4329b(14, r12.getDimensionPixelSize(r15, r6.f7818O));
        goto L111
    L103:
        r13.m4329b(13, r12.getDimensionPixelSize(r15, r6.f7816M));
        goto L111
    L104:
        r13.m4329b(12, r12.getDimensionPixelSize(r15, r6.f7820Q));
        goto L111
    L105:
        r13.m4329b(11, r12.getDimensionPixelSize(r15, r6.f7819P));
        goto L111
    L106:
        r13.m4329b(8, r12.getDimensionPixelSize(r15, r6.f7813J));
        goto L111
    L107:
        r13.m4329b(7, r12.getDimensionPixelOffset(r15, r6.f7807D));
        goto L111
    L108:
        r13.m4329b(6, r12.getDimensionPixelOffset(r15, r6.f7806C));
        goto L111
    L109:
        r13.m4330c(5, r12.getString(r15));
        goto L111
    L110:
        r13.m4329b(2, r12.getDimensionPixelSize(r15, r6.f7812I));
    L111:
        r8 = r8 + 1;
        r122 = 3;
        goto L10
    L58:
        if (r12.peekValue(r15).type != 3) goto L60;
        r13.m4330c(65, r12.getString(r15));
        goto L111
    L60:
        r13.m4330c(65, r2[r12.getInteger(r15, 0)]);
    L234:
        r12.recycle();
        return r0;
    L112:
        int r82 = r12.getIndexCount();
        int r145 = 0;
    L113:
        if (r145 >= r82) goto L232;
        int r92 = r12.getIndex(r145);
        if (r92 == 1) goto L122;
        if (23 == r92) goto L122;
        if (24 == r92) goto L122;
        r5.getClass();
        r6.getClass();
        r4.getClass();
    L122:
        switch(r11.get(r92)) {
            case 1: goto L229;
            case 2: goto L228;
            case 3: goto L227;
            case 4: goto L226;
            case 5: goto L225;
            case 6: goto L224;
            case 7: goto L223;
            case 8: goto L222;
            case 9: goto L221;
            case 10: goto L220;
            case 11: goto L219;
            case 12: goto L218;
            case 13: goto L217;
            case 14: goto L216;
            case 15: goto L215;
            case 16: goto L214;
            case 17: goto L213;
            case 18: goto L212;
            case 19: goto L211;
            case 20: goto L210;
            case 21: goto L209;
            case 22: goto L208;
            case 23: goto L207;
            case 24: goto L206;
            case 25: goto L205;
            case 26: goto L204;
            case 27: goto L203;
            case 28: goto L202;
            case 29: goto L201;
            case 30: goto L200;
            case 31: goto L199;
            case 32: goto L198;
            case 33: goto L197;
            case 34: goto L196;
            case 35: goto L195;
            case 36: goto L194;
            case 37: goto L193;
            case 38: goto L192;
            case 39: goto L191;
            case 40: goto L190;
            case 41: goto L189;
            case 42: goto L188;
            case 43: goto L187;
            case 44: goto L186;
            case 45: goto L185;
            case 46: goto L184;
            case 47: goto L183;
            case 48: goto L182;
            case 49: goto L181;
            case 50: goto L180;
            case 51: goto L179;
            case 52: goto L178;
            case 53: goto L177;
            case 54: goto L176;
            case 55: goto L175;
            case 56: goto L174;
            case 57: goto L173;
            case 58: goto L172;
            case 59: goto L171;
            case 60: goto L170;
            case 61: goto L169;
            case 62: goto L168;
            case 63: goto L167;
            case 64: goto L166;
            case 65: goto L163;
            case 66: goto L161;
            case 67: goto L160;
            case 68: goto L159;
            case 69: goto L158;
            case 70: goto L157;
            case 71: goto L230;
            case 72: goto L156;
            case 73: goto L155;
            case 74: goto L154;
            case 75: goto L153;
            case 76: goto L152;
            case 77: goto L151;
            case 78: goto L150;
            case 79: goto L149;
            case 80: goto L148;
            case 81: goto L147;
            case 82: goto L146;
            case 83: goto L145;
            case 84: goto L144;
            case 85: goto L143;
            case 86: goto L134;
            case 87: goto L133;
            case 88: goto L123;
            case 89: goto L123;
            case 90: goto L123;
            case 91: goto L132;
            case 92: goto L131;
            case 93: goto L130;
            case 94: goto L129;
            case 95: goto L127;
            case 96: goto L126;
            case 97: goto L125;
            default: goto L123;
        };
    L123:
        Integer.toHexString(r92);
        r11.get(r92);
        goto L230
    L125:
        r6.f7859o0 = r12.getInt(r92, r6.f7859o0);
        goto L230
    L126:
        m4851g(r6, r12, r92, 1);
        goto L230
    L127:
        m4851g(r6, r12, r92, 0);
        goto L230
    L129:
        r6.f7822S = r12.getDimensionPixelSize(r92, r6.f7822S);
        goto L230
    L130:
        r6.f7815L = r12.getDimensionPixelSize(r92, r6.f7815L);
        goto L230
    L131:
        r6.f7862r = m4850f(r12, r92, r6.f7862r);
        goto L230
    L132:
        r6.f7861q = m4850f(r12, r92, r6.f7861q);
        goto L230
    L133:
        Integer.toHexString(r92);
        r11.get(r92);
        goto L230
    L134:
        int r152 = r12.peekValue(r92).type;
        if (r152 != 1) goto L138;
        r5.f8008i = r12.getResourceId(r92, -1);
        goto L230
    L138:
        if (r152 != 3) goto L142;
        String r132 = r12.getString(r92);
        r5.f8007h = r132;
        if (r132.indexOf("/") <= 0) goto L230;
        r5.f8008i = r12.getResourceId(r92, -1);
        goto L230
    L142:
        r12.getInteger(r92, r5.f8008i);
        goto L230
    L143:
        r5.f8005f = r12.getFloat(r92, r5.f8005f);
        goto L230
    L144:
        r5.f8006g = r12.getInteger(r92, r5.f8006g);
        goto L230
    L145:
        r4.f8328h = m4850f(r12, r92, r4.f8328h);
        goto L230
    L146:
        r5.f8001b = r12.getInteger(r92, r5.f8001b);
        goto L230
    L147:
        r6.f7855m0 = r12.getBoolean(r92, r6.f7855m0);
        goto L230
    L148:
        r6.f7853l0 = r12.getBoolean(r92, r6.f7853l0);
        goto L230
    L149:
        r5.f8003d = r12.getFloat(r92, r5.f8003d);
        goto L230
    L150:
        r3.f8161b = r12.getInt(r92, r3.f8161b);
        goto L230
    L151:
        r6.f7851k0 = r12.getString(r92);
        goto L230
    L152:
        r5.f8002c = r12.getInt(r92, r5.f8002c);
        goto L230
    L153:
        r6.f7857n0 = r12.getBoolean(r92, r6.f7857n0);
        goto L230
    L154:
        r6.f7849j0 = r12.getString(r92);
        goto L230
    L155:
        r6.f7843g0 = r12.getDimensionPixelSize(r92, r6.f7843g0);
        goto L230
    L156:
        r6.f7841f0 = r12.getInt(r92, r6.f7841f0);
        goto L230
    L157:
        r6.f7839e0 = r12.getFloat(r92, 1.0f);
        goto L230
    L158:
        r6.f7837d0 = r12.getFloat(r92, 1.0f);
        goto L230
    L159:
        r3.f8163d = r12.getFloat(r92, r3.f8163d);
        goto L230
    L160:
        r5.f8004e = r12.getFloat(r92, r5.f8004e);
        goto L230
    L161:
        r12.getInt(r92, 0);
        r5.getClass();
        goto L230
    L166:
        r5.f8000a = m4850f(r12, r92, r5.f8000a);
        goto L230
    L167:
        r6.f7805B = r12.getFloat(r92, r6.f7805B);
        goto L230
    L168:
        r6.f7804A = r12.getDimensionPixelSize(r92, r6.f7804A);
        goto L230
    L169:
        r6.f7870z = m4850f(r12, r92, r6.f7870z);
        goto L230
    L170:
        r4.f8321a = r12.getFloat(r92, r4.f8321a);
        goto L230
    L171:
        r6.f7835c0 = r12.getDimensionPixelSize(r92, r6.f7835c0);
        goto L230
    L172:
        r6.f7833b0 = r12.getDimensionPixelSize(r92, r6.f7833b0);
        goto L230
    L173:
        r6.f7831a0 = r12.getDimensionPixelSize(r92, r6.f7831a0);
        goto L230
    L174:
        r6.f7829Z = r12.getDimensionPixelSize(r92, r6.f7829Z);
        goto L230
    L175:
        r6.f7828Y = r12.getInt(r92, r6.f7828Y);
        goto L230
    L176:
        r6.f7827X = r12.getInt(r92, r6.f7827X);
        goto L230
    L177:
        r4.f8331k = r12.getDimension(r92, r4.f8331k);
        goto L230
    L178:
        r4.f8330j = r12.getDimension(r92, r4.f8330j);
        goto L230
    L179:
        r4.f8329i = r12.getDimension(r92, r4.f8329i);
        goto L230
    L180:
        r4.f8327g = r12.getDimension(r92, r4.f8327g);
        goto L230
    L181:
        r4.f8326f = r12.getDimension(r92, r4.f8326f);
        goto L230
    L182:
        r4.f8325e = r12.getFloat(r92, r4.f8325e);
        goto L230
    L183:
        r4.f8324d = r12.getFloat(r92, r4.f8324d);
        goto L230
    L184:
        r4.f8323c = r12.getFloat(r92, r4.f8323c);
        goto L230
    L185:
        r4.f8322b = r12.getFloat(r92, r4.f8322b);
        goto L230
    L186:
        r4.f8332l = true;
        r4.f8333m = r12.getDimension(r92, r4.f8333m);
        goto L230
    L187:
        r3.f8162c = r12.getFloat(r92, r3.f8162c);
        goto L230
    L188:
        r6.f7826W = r12.getInt(r92, r6.f7826W);
        goto L230
    L189:
        r6.f7825V = r12.getInt(r92, r6.f7825V);
        goto L230
    L190:
        r6.f7823T = r12.getFloat(r92, r6.f7823T);
        goto L230
    L191:
        r6.f7824U = r12.getFloat(r92, r6.f7824U);
        goto L230
    L192:
        r0.f7632a = r12.getResourceId(r92, r0.f7632a);
        goto L230
    L193:
        r6.f7868x = r12.getFloat(r92, r6.f7868x);
        goto L230
    L194:
        r6.f7852l = m4850f(r12, r92, r6.f7852l);
        goto L230
    L195:
        r6.f7854m = m4850f(r12, r92, r6.f7854m);
        goto L230
    L196:
        r6.f7811H = r12.getDimensionPixelSize(r92, r6.f7811H);
        goto L230
    L197:
        r6.f7864t = m4850f(r12, r92, r6.f7864t);
        goto L230
    L198:
        r6.f7863s = m4850f(r12, r92, r6.f7863s);
        goto L230
    L199:
        r6.f7814K = r12.getDimensionPixelSize(r92, r6.f7814K);
        goto L230
    L200:
        r6.f7850k = m4850f(r12, r92, r6.f7850k);
        goto L230
    L201:
        r6.f7848j = m4850f(r12, r92, r6.f7848j);
        goto L230
    L202:
        r6.f7810G = r12.getDimensionPixelSize(r92, r6.f7810G);
        goto L230
    L203:
        r6.f7808E = r12.getInt(r92, r6.f7808E);
        goto L230
    L204:
        r6.f7846i = m4850f(r12, r92, r6.f7846i);
        goto L230
    L205:
        r6.f7844h = m4850f(r12, r92, r6.f7844h);
        goto L230
    L206:
        r6.f7809F = r12.getDimensionPixelSize(r92, r6.f7809F);
        goto L230
    L207:
        r6.f7832b = r12.getLayoutDimension(r92, r6.f7832b);
        goto L230
    L208:
        int r93 = r12.getInt(r92, r3.f8160a);
        r3.f8160a = r93;
        r3.f8160a = r7[r93];
        goto L230
    L209:
        r6.f7834c = r12.getLayoutDimension(r92, r6.f7834c);
        goto L230
    L210:
        r6.f7867w = r12.getFloat(r92, r6.f7867w);
        goto L230
    L211:
        r6.f7840f = r12.getFloat(r92, r6.f7840f);
        goto L230
    L212:
        r6.f7838e = r12.getDimensionPixelOffset(r92, r6.f7838e);
        goto L230
    L213:
        r6.f7836d = r12.getDimensionPixelOffset(r92, r6.f7836d);
        goto L230
    L214:
        r6.f7817N = r12.getDimensionPixelSize(r92, r6.f7817N);
        goto L230
    L215:
        r6.f7821R = r12.getDimensionPixelSize(r92, r6.f7821R);
        goto L230
    L216:
        r6.f7818O = r12.getDimensionPixelSize(r92, r6.f7818O);
        goto L230
    L217:
        r6.f7816M = r12.getDimensionPixelSize(r92, r6.f7816M);
        goto L230
    L218:
        r6.f7820Q = r12.getDimensionPixelSize(r92, r6.f7820Q);
        goto L230
    L219:
        r6.f7819P = r12.getDimensionPixelSize(r92, r6.f7819P);
        goto L230
    L220:
        r6.f7865u = m4850f(r12, r92, r6.f7865u);
        goto L230
    L221:
        r6.f7866v = m4850f(r12, r92, r6.f7866v);
        goto L230
    L222:
        r6.f7813J = r12.getDimensionPixelSize(r92, r6.f7813J);
        goto L230
    L223:
        r6.f7807D = r12.getDimensionPixelOffset(r92, r6.f7807D);
        goto L230
    L224:
        r6.f7806C = r12.getDimensionPixelOffset(r92, r6.f7806C);
        goto L230
    L225:
        r6.f7869y = r12.getString(r92);
        goto L230
    L226:
        r6.f7856n = m4850f(r12, r92, r6.f7856n);
        goto L230
    L227:
        r6.f7858o = m4850f(r12, r92, r6.f7858o);
        goto L230
    L228:
        r6.f7812I = r12.getDimensionPixelSize(r92, r6.f7812I);
        goto L230
    L229:
        r6.f7860p = m4850f(r12, r92, r6.f7860p);
    L230:
        r145 = r145 + 1;
        goto L113
    L163:
        if (r12.peekValue(r92).type != 3) goto L165;
        r12.getString(r92);
        r5.getClass();
        goto L230
    L165:
        String r94 = r2[r12.getInteger(r92, 0)];
        r5.getClass();
        goto L230
    L232:
        if (r6.f7849j0 == null) goto L234;
        r6.f7847i0 = null;
        goto L234
    L6:
        r1 = AbstractC0639Ou.f2034a;
        goto L7
    }

    /* JADX INFO: renamed from: f */
    public static int m4850f(TypedArray r1, int r2, int r3) {
        int r32 = r1.getResourceId(r2, r3);
        if (r32 == (-1)) goto L5;
        return r32;
    L5:
        return r1.getInt(r2, -1);
    }

    /* JADX INFO: renamed from: g */
    public static void m4851g(Object r7, TypedArray r8, int r9, int r10) {
        if (r7 == null) goto L131;
        int r0 = r8.peekValue(r9).type;
        boolean r2 = true;
        int r6 = 0;
        if (r0 == 3) goto L42;
        if (r0 == 5) goto L17;
        int r82 = r8.getInt(r9, 0);
        if (r82 != (-4)) goto L10;
        r6 = -2;
    L19:
        if ((r7 instanceof C1452gb) == false) goto L27;
        C1452gb r72 = (C1452gb) r7;
        if (r10 != 0) goto L24;
        ((ViewGroup.MarginLayoutParams) r72).width = r6;
        r72.f5102W = r2;
        return;
    L24:
        ((ViewGroup.MarginLayoutParams) r72).height = r6;
        r72.f5103X = r2;
        return;
    L27:
        if ((r7 instanceof C2231mb) == false) goto L35;
        C2231mb r73 = (C2231mb) r7;
        if (r10 != 0) goto L32;
        r73.f7832b = r6;
        r73.f7853l0 = r2;
        return;
    L32:
        r73.f7834c = r6;
        r73.f7855m0 = r2;
        return;
    L35:
        if ((r7 instanceof C2141kb) == false) goto L123;
        C2141kb r74 = (C2141kb) r7;
        if (r10 != 0) goto L40;
        r74.m4329b(23, r6);
        r74.m4331d(80, r2);
        return;
    L40:
        r74.m4329b(21, r6);
        r74.m4331d(81, r2);
        return;
    L123:
        return;
    L10:
        if (r82 == (-3)) goto L14;
        if (r82 != (-2)) goto L13;
    L15:
        r2 = false;
        r6 = r82;
        goto L19
    L13:
        if (r82 == (-1)) goto L15;
    L14:
        r2 = false;
        goto L19
    L17:
        r82 = r8.getDimensionPixelSize(r9, 0);
        goto L15
    L42:
        String r83 = r8.getString(r9);
        if (r83 == null) goto L132;
        int r92 = r83.indexOf(61);
        int r02 = r83.length();
        if (r92 > 0) goto L48;
        return;
    L48:
        if (r92 >= (r02 - 1)) goto L125;
        String r03 = r83.substring(0, r92);
        String r84 = r83.substring(r92 + 1);
        if (r84.length() <= 0) goto L126;
        String r93 = r03.trim();
        String r85 = r84.trim();
        if ("ratio".equalsIgnoreCase(r93) == false) goto L122;
        if ((r7 instanceof C1452gb) == false) goto L62;
        C1452gb r75 = (C1452gb) r7;
        if (r10 != 0) goto L58;
        ((ViewGroup.MarginLayoutParams) r75).width = 0;
    L59:
        m4852h(r75, r85);
        return;
    L58:
        ((ViewGroup.MarginLayoutParams) r75).height = 0;
        goto L59
    L62:
        if ((r7 instanceof C2231mb) == false) goto L66;
        ((C2231mb) r7).f7869y = r85;
        return;
    L66:
        if ((r7 instanceof C2141kb) == false) goto L127;
        ((C2141kb) r7).m4330c(5, r85);
        return;
    L127:
        return;
    L122:
        if ("weight".equalsIgnoreCase(r93) == false) goto L96;
        float r86 = Float.parseFloat(r85);     // Catch: NumberFormatException -> L121
        if ((r7 instanceof C1452gb) == false) goto L80;
        C1452gb r76 = (C1452gb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L77;
        ((ViewGroup.MarginLayoutParams) r76).width = 0;     // Catch: NumberFormatException -> L121
        r76.f5087H = r86;     // Catch: NumberFormatException -> L121
        return;
    L77:
        ((ViewGroup.MarginLayoutParams) r76).height = 0;     // Catch: NumberFormatException -> L121
        r76.f5088I = r86;     // Catch: NumberFormatException -> L121
        return;
    L80:
        if ((r7 instanceof C2231mb) == false) goto L88;
        C2231mb r77 = (C2231mb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L85;
        r77.f7832b = 0;     // Catch: NumberFormatException -> L121
        r77.f7824U = r86;     // Catch: NumberFormatException -> L121
        return;
    L85:
        r77.f7834c = 0;     // Catch: NumberFormatException -> L121
        r77.f7823T = r86;     // Catch: NumberFormatException -> L121
        return;
    L88:
        if ((r7 instanceof C2141kb) == false) goto L128;
        C2141kb r78 = (C2141kb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L93;
        r78.m4329b(23, 0);     // Catch: NumberFormatException -> L121
        r78.m4328a(39, r86);     // Catch: NumberFormatException -> L121
        return;
    L93:
        r78.m4329b(21, 0);     // Catch: NumberFormatException -> L121
        r78.m4328a(40, r86);     // Catch: NumberFormatException -> L121
        return;
    L128:
        return;
    L96:
        if ("parent".equalsIgnoreCase(r93) == false) goto L129;
        float r87 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(r85)));     // Catch: NumberFormatException -> L121
        if ((r7 instanceof C1452gb) == false) goto L106;
        C1452gb r79 = (C1452gb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L103;
        ((ViewGroup.MarginLayoutParams) r79).width = 0;     // Catch: NumberFormatException -> L121
        r79.f5097R = r87;     // Catch: NumberFormatException -> L121
        r79.f5091L = 2;     // Catch: NumberFormatException -> L121
        return;
    L103:
        ((ViewGroup.MarginLayoutParams) r79).height = 0;     // Catch: NumberFormatException -> L121
        r79.f5098S = r87;     // Catch: NumberFormatException -> L121
        r79.f5092M = 2;     // Catch: NumberFormatException -> L121
        return;
    L106:
        if ((r7 instanceof C2231mb) == false) goto L114;
        C2231mb r710 = (C2231mb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L111;
        r710.f7832b = 0;     // Catch: NumberFormatException -> L121
        r710.f7837d0 = r87;     // Catch: NumberFormatException -> L121
        r710.f7827X = 2;     // Catch: NumberFormatException -> L121
        return;
    L111:
        r710.f7834c = 0;     // Catch: NumberFormatException -> L121
        r710.f7839e0 = r87;     // Catch: NumberFormatException -> L121
        r710.f7828Y = 2;     // Catch: NumberFormatException -> L121
        return;
    L114:
        if ((r7 instanceof C2141kb) == false) goto L130;
        C2141kb r711 = (C2141kb) r7;     // Catch: NumberFormatException -> L121
        if (r10 != 0) goto L119;
        r711.m4329b(23, 0);     // Catch: NumberFormatException -> L121
        r711.m4329b(54, 2);     // Catch: NumberFormatException -> L121
        return;
    L119:
        r711.m4329b(21, 0);     // Catch: NumberFormatException -> L121
        r711.m4329b(55, 2);     // Catch: NumberFormatException -> L121
        return;
    L130:
        return;
    L129:
        return;
    L133:
        return;
    L126:
        return;
    L125:
        return;
    L132:
        return;
    }

    /* JADX INFO: renamed from: h */
    public static void m4852h(C1452gb r7, String r8) {
        if (r8 == null) goto L34;
        int r0 = r8.length();
        int r1 = r8.indexOf(44);
        int r2 = 0;
        int r4 = -1;
        if (r1 > 0) goto L6;
    L15:
        int r12 = r8.indexOf(58);
        if (r12 >= 0) goto L18;
    L31:
        String r02 = r8.substring(r2);
        if (r02.length() <= 0) goto L34;
        Float.parseFloat(r02);     // Catch: NumberFormatException -> L36
    L37:
        goto L34
    L18:
        if (r12 >= (r0 - 1)) goto L31;
        String r03 = r8.substring(r2, r12);
        String r13 = r8.substring(r12 + 1);
        if (r03.length() <= 0) goto L34;
        if (r13.length() <= 0) goto L34;
        float r04 = Float.parseFloat(r03);     // Catch: NumberFormatException -> L36
        float r14 = Float.parseFloat(r13);     // Catch: NumberFormatException -> L36
        if (r04 <= 0.0f) goto L37;
        if (r14 <= 0.0f) goto L37;
        if (r4 != 1) goto L29;
        Math.abs(r14 / r04);     // Catch: NumberFormatException -> L36
        goto L37
    L29:
        Math.abs(r04 / r14);     // Catch: NumberFormatException -> L36
        goto L37
    L6:
        if (r1 >= (r0 - 1)) goto L15;
        String r5 = r8.substring(0, r1);
        if (r5.equalsIgnoreCase("W") == false) goto L11;
    L14:
        r4 = r2;
        r2 = r1 + 1;
        goto L15
    L11:
        if (r5.equalsIgnoreCase("H") == false) goto L13;
        r2 = 1;
        goto L14
    L13:
        r2 = -1;
    L34:
        r7.f5086G = r8;
    }

    /* JADX INFO: renamed from: a */
    public final void m4853a(ConstraintLayout r20) {
        int r2 = r20.getChildCount();
        HashMap r4 = this.f8456c;
        HashSet r3 = new HashSet(r4.keySet());
        int r6 = 0;
    L4:
        if (r6 >= r2) goto L71;
        View r8 = r20.getChildAt(r6);
        int r9 = r8.getId();
        if (r4.containsKey(Integer.valueOf(r9)) == true) goto L10;
        r8.getContext().getResources().getResourceEntryName(r8.getId());     // Catch: Exception -> L98
    L70:
        r6 = r6 + 1;
        goto L4
    L10:
        if (this.f8455b == false) goto L15;
        if (r9 != (-1)) goto L15;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L15:
        if (r9 == (-1)) goto L70;
        if (r4.containsKey(Integer.valueOf(r9)) == false) goto L70;
        r3.remove(Integer.valueOf(r9));
        C2188lb r10 = (C2188lb) r4.get(Integer.valueOf(r9));
        if (r10 == null) goto L70;
        C2317ob r12 = r10.f7633b;
        C2231mb r13 = r10.f7635d;
        C2368pb r14 = r10.f7636e;
        if ((r8 instanceof C2348p5) == false) goto L30;
        r13.f7845h0 = 1;
        C2348p5 r7 = (C2348p5) r8;
        r7.setId(r9);
        r7.setType(r13.f7841f0);
        r7.setMargin(r13.f7843g0);
        r7.setAllowsGoneWidget(r13.f7857n0);
        int[] r92 = r13.f7847i0;
        if (r92 == null) goto L27;
        r7.setReferencedIds(r92);
        goto L30
    L27:
        String r93 = r13.f7849j0;
        if (r93 == null) goto L30;
        int[] r94 = m4848c(r7, r93);
        r13.f7847i0 = r94;
        r7.setReferencedIds(r94);
    L30:
        C1452gb r72 = (C1452gb) r8.getLayoutParams();
        r72.m2781a();
        r10.m4425a(r72);
        HashMap r95 = r10.f7637f;
        Class<?> r102 = r8.getClass();
        Iterator r132 = r95.keySet().iterator();
    L32:
        if (r132.hasNext() == false) goto L49;
        String r15 = (String) r132.next();
        C1321db r5 = (C1321db) r95.get(r15);
        if (r5.f4783a == true) goto L101;
        r15 = AbstractC0213Ey.m420r("set", r15);
    L101:
        int r11 = AbstractC0213Ey.m424v(r5.f4784b);     // Catch: Throwable -> L97
        Class r17 = Float.TYPE;
        Class r18 = Integer.TYPE;
        switch(r11) {
            case 0: goto L47;
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L43;
            case 5: goto L42;
            case 6: goto L41;
            case 7: goto L40;
            default: goto L32;
        };
    L40:
        r102.getMethod(r15, new Class[]{r18}).invoke(r8, new Object[]{Integer.valueOf(r5.f4785c)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L41:
        r102.getMethod(r15, new Class[]{r17}).invoke(r8, new Object[]{Float.valueOf(r5.f4786d)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L42:
        r102.getMethod(r15, new Class[]{Boolean.TYPE}).invoke(r8, new Object[]{Boolean.valueOf(r5.f4788f)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L43:
        r102.getMethod(r15, new Class[]{CharSequence.class}).invoke(r8, new Object[]{r5.f4787e});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L44:
        Method r112 = r102.getMethod(r15, new Class[]{Drawable.class});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        ColorDrawable r152 = new ColorDrawable();     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        r152.setColor(r5.f4789g);     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        r112.invoke(r8, new Object[]{r152});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L45:
        r102.getMethod(r15, new Class[]{r18}).invoke(r8, new Object[]{Integer.valueOf(r5.f4789g)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L46:
        r102.getMethod(r15, new Class[]{r17}).invoke(r8, new Object[]{Float.valueOf(r5.f4786d)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L47:
        r102.getMethod(r15, new Class[]{r18}).invoke(r8, new Object[]{Integer.valueOf(r5.f4785c)});     // Catch: Throwable -> L97 Throwable -> L97 Throwable -> L97
        goto L32
    L49:
        r8.setLayoutParams(r72);
        if (r12.f8161b != 0) goto L52;
        r8.setVisibility(r12.f8160a);
    L52:
        r8.setAlpha(r12.f8162c);
        r8.setRotation(r14.f8321a);
        r8.setRotationX(r14.f8322b);
        r8.setRotationY(r14.f8323c);
        r8.setScaleX(r14.f8324d);
        r8.setScaleY(r14.f8325e);
        if (r14.f8328h == (-1)) goto L62;
        View r52 = ((View) r8.getParent()).findViewById(r14.f8328h);
        if (r52 == null) goto L67;
        int r73 = r52.getTop();
        float r74 = (r52.getBottom() + r73) / 2.0f;
        int r103 = r52.getLeft();
        float r53 = (r52.getRight() + r103) / 2.0f;
        if ((r8.getRight() - r8.getLeft()) <= 0) goto L67;
        if ((r8.getBottom() - r8.getTop()) <= 0) goto L67;
        r8.setPivotX(r53 - r8.getLeft());
        r8.setPivotY(r74 - r8.getTop());
    L67:
        r8.setTranslationX(r14.f8329i);
        r8.setTranslationY(r14.f8330j);
        r8.setTranslationZ(r14.f8331k);
        if (r14.f8332l == false) goto L70;
        r8.setElevation(r14.f8333m);
        goto L70
    L62:
        if (Float.isNaN(r14.f8326f) == true) goto L65;
        r8.setPivotX(r14.f8326f);
    L65:
        if (Float.isNaN(r14.f8327g) == true) goto L67;
        r8.setPivotY(r14.f8327g);
        goto L67
    L71:
        Iterator r32 = r3.iterator();
    L73:
        if (r32.hasNext() == false) goto L90;
        Integer r54 = (Integer) r32.next();
        C2188lb r62 = (C2188lb) r4.get(r54);
        if (r62 == null) goto L73;
        C2231mb r82 = r62.f7635d;
        if (r82.f7845h0 != 1) goto L88;
        Context r104 = r20.getContext();
        C2348p5 r96 = new C2348p5(r104);
        r96.f4872a = new int[32];
        r96.f4878g = new HashMap();
        r96.f4874c = r104;
        C2399q5 r105 = new C2399q5();
        r105.f8407s0 = 0;
        r105.f8408t0 = true;
        r105.f8409u0 = 0;
        r105.f8410v0 = false;
        r96.f8227j = r105;
        r96.f4875d = r105;
        r96.m2654i();
        r96.setVisibility(8);
        r96.setId(r54.intValue());
        int[] r106 = r82.f7847i0;
        if (r106 == null) goto L82;
        r96.setReferencedIds(r106);
    L85:
        r96.setType(r82.f7841f0);
        r96.setMargin(r82.f7843g0);
        C1452gb r107 = ConstraintLayout.m2123g();
        r96.m2654i();
        r62.m4425a(r107);
        r20.addView(r96, r107);
        goto L88
    L82:
        String r108 = r82.f7849j0;
        if (r108 == null) goto L85;
        int[] r109 = m4848c(r96, r108);
        r82.f7847i0 = r109;
        r96.setReferencedIds(r109);
    L88:
        if (r82.f7830a == false) goto L73;
        View r83 = new C2106jk(r20.getContext());
        r83.setId(r54.intValue());
        C1452gb r55 = ConstraintLayout.m2123g();
        r62.m4425a(r55);
        r20.addView(r83, r55);
        goto L73
    L90:
        int r56 = 0;
    L91:
        if (r56 >= r2) goto L96;
        View r33 = r20.getChildAt(r56);
        if ((r33 instanceof AbstractC1364eb) == false) goto L95;
        ((AbstractC1364eb) r33).mo1834e(r20);
    L95:
        r56 = r56 + 1;
        goto L91
    }

    /* JADX INFO: renamed from: b */
    public final void m4854b(ConstraintLayout r20) {
        C2411qb r0 = this;
        int r1 = r20.getChildCount();
        HashMap r2 = r0.f8456c;
        r2.clear();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L41;
        View r5 = r20.getChildAt(r3);
        C1452gb r6 = (C1452gb) r5.getLayoutParams();
        int r7 = r5.getId();
        if (r0.f8455b == false) goto L12;
        if (r7 != (-1)) goto L12;
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    L12:
        if (r2.containsKey(Integer.valueOf(r7)) == true) goto L14;
        r2.put(Integer.valueOf(r7), new C2188lb());
    L14:
        C2188lb r8 = (C2188lb) r2.get(Integer.valueOf(r7));
        if (r8 != null) goto L17;
        int r17 = r1;
        HashMap r16 = r2;
        int r18 = r3;
    L40:
        r3 = r18 + 1;
        r0 = this;
        r2 = r16;
        r1 = r17;
        goto L3
    L17:
        C2317ob r9 = r8.f7633b;
        C2231mb r10 = r8.f7635d;
        C2368pb r11 = r8.f7636e;
        HashMap r12 = new HashMap();
        Class<?> r13 = r5.getClass();
        HashMap r14 = r0.f8454a;
        Iterator r15 = r14.keySet().iterator();
    L19:
        if (r15.hasNext() == false) goto L29;
        String r02 = (String) r15.next();
        int r172 = r1;
        C1321db r19 = (C1321db) r14.get(r02);
        HashMap r162 = r2;
        if (r02.equals("BackgroundColor") == true) goto L24;
        int r182 = r3;
        r12.put(r02, new C1321db(r19, r13.getMethod("getMap" + r02, null).invoke(r5, null)));     // Catch: Throwable -> L42
    L28:
        r2 = r162;
        r1 = r172;
        r3 = r182;
        goto L19
    L24:
        r182 = r3;
        r12.put(r02, new C1321db(r19, Integer.valueOf(((ColorDrawable) r5.getBackground()).getColor())));     // Catch: Throwable -> L42
    L26:
        r182 = r3;
        goto L28
    L29:
        r17 = r1;
        r16 = r2;
        r18 = r3;
        r8.f7637f = r12;
        r8.f7632a = r7;
        r10.f7844h = r6.f5114e;
        r10.f7846i = r6.f5116f;
        r10.f7848j = r6.f5118g;
        r10.f7850k = r6.f5120h;
        r10.f7852l = r6.f5122i;
        r10.f7854m = r6.f5124j;
        r10.f7856n = r6.f5126k;
        r10.f7858o = r6.f5128l;
        r10.f7860p = r6.f5130m;
        r10.f7861q = r6.f5132n;
        r10.f7862r = r6.f5134o;
        r10.f7863s = r6.f5140s;
        r10.f7864t = r6.f5141t;
        r10.f7865u = r6.f5142u;
        r10.f7866v = r6.f5143v;
        r10.f7867w = r6.f5084E;
        r10.f7868x = r6.f5085F;
        r10.f7869y = r6.f5086G;
        r10.f7870z = r6.f5136p;
        r10.f7804A = r6.f5138q;
        r10.f7805B = r6.f5139r;
        r10.f7806C = r6.f5099T;
        r10.f7807D = r6.f5100U;
        r10.f7808E = r6.f5101V;
        r10.f7840f = r6.f5110c;
        r10.f7836d = r6.f5106a;
        r10.f7838e = r6.f5108b;
        r10.f7832b = ((ViewGroup.MarginLayoutParams) r6).width;
        r10.f7834c = ((ViewGroup.MarginLayoutParams) r6).height;
        r10.f7809F = ((ViewGroup.MarginLayoutParams) r6).leftMargin;
        r10.f7810G = ((ViewGroup.MarginLayoutParams) r6).rightMargin;
        r10.f7811H = ((ViewGroup.MarginLayoutParams) r6).topMargin;
        r10.f7812I = ((ViewGroup.MarginLayoutParams) r6).bottomMargin;
        r10.f7815L = r6.f5083D;
        r10.f7823T = r6.f5088I;
        r10.f7824U = r6.f5087H;
        r10.f7826W = r6.f5090K;
        r10.f7825V = r6.f5089J;
        r10.f7853l0 = r6.f5102W;
        r10.f7855m0 = r6.f5103X;
        r10.f7827X = r6.f5091L;
        r10.f7828Y = r6.f5092M;
        r10.f7829Z = r6.f5095P;
        r10.f7831a0 = r6.f5096Q;
        r10.f7833b0 = r6.f5093N;
        r10.f7835c0 = r6.f5094O;
        r10.f7837d0 = r6.f5097R;
        r10.f7839e0 = r6.f5098S;
        r10.f7851k0 = r6.f5104Y;
        r10.f7817N = r6.f5145x;
        r10.f7819P = r6.f5147z;
        r10.f7816M = r6.f5144w;
        r10.f7818O = r6.f5146y;
        r10.f7821R = r6.f5080A;
        r10.f7820Q = r6.f5081B;
        r10.f7822S = r6.f5082C;
        r10.f7859o0 = r6.f5105Z;
        r10.f7813J = r6.getMarginEnd();
        r10.f7814K = r6.getMarginStart();
        r9.f8160a = r5.getVisibility();
        r9.f8162c = r5.getAlpha();
        r11.f8321a = r5.getRotation();
        r11.f8322b = r5.getRotationX();
        r11.f8323c = r5.getRotationY();
        r11.f8324d = r5.getScaleX();
        r11.f8325e = r5.getScaleY();
        float r03 = r5.getPivotX();
        float r110 = r5.getPivotY();
        if (r03 == 0.0d) goto L32;
    L33:
        r11.f8326f = r03;
        r11.f8327g = r110;
    L34:
        r11.f8329i = r5.getTranslationX();
        r11.f8330j = r5.getTranslationY();
        r11.f8331k = r5.getTranslationZ();
        if (r11.f8332l == false) goto L38;
        r11.f8333m = r5.getElevation();
    L38:
        if ((r5 instanceof C2348p5) == false) goto L40;
        C2348p5 r52 = (C2348p5) r5;
        r10.f7857n0 = r52.getAllowsGoneWidget();
        r10.f7847i0 = r52.getReferencedIds();
        r10.f7841f0 = r52.getType();
        r10.f7843g0 = r52.getMargin();
        goto L40
    L32:
        if (r110 == 0.0d) goto L34;
    }

    /* JADX INFO: renamed from: e */
    public final void m4855e(Context r5, int r6) {
        XmlResourceParser r62 = r5.getResources().getXml(r6);
        int r0 = r62.getEventType();     // Catch: Throwable -> L16
    L5:
        if (r0 == 1) goto L23;
        if (r0 != 2) goto L13;
        String r02 = r62.getName();     // Catch: Throwable -> L16
        C2188lb r2 = m4849d(r5, Xml.asAttributeSet(r62), false);     // Catch: Throwable -> L16
        if (r02.equalsIgnoreCase("Guideline") == false) goto L12;
        r2.f7635d.f7830a = true;     // Catch: Throwable -> L16
    L12:
        this.f8456c.put(Integer.valueOf(r2.f7632a), r2);     // Catch: Throwable -> L16
    L13:
        r0 = r62.next();     // Catch: Throwable -> L16
    L23:
        return;
    }
}
