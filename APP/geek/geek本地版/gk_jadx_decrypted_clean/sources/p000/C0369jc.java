package p000;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: jc */
/* JADX INFO: loaded from: classes.dex */
public final class C0369jc {

    /* JADX INFO: renamed from: a */
    public int f2613a;

    /* JADX INFO: renamed from: b */
    public final C0480mc f2614b;

    /* JADX INFO: renamed from: c */
    public final C0443lc f2615c;

    /* JADX INFO: renamed from: d */
    public final C0406kc f2616d;

    /* JADX INFO: renamed from: e */
    public final C0517nc f2617e;

    /* JADX INFO: renamed from: f */
    public HashMap f2618f;

    public C0369jc() {
        C0480mc c0480mc = new C0480mc();
        c0480mc.f3190a = 0;
        c0480mc.f3191b = 0;
        c0480mc.f3192c = 1.0f;
        c0480mc.f3193d = Float.NaN;
        this.f2614b = c0480mc;
        C0443lc c0443lc = new C0443lc();
        c0443lc.f3042a = -1;
        c0443lc.f3043b = -1;
        c0443lc.f3044c = Float.NaN;
        c0443lc.f3045d = Float.NaN;
        this.f2615c = c0443lc;
        C0406kc c0406kc = new C0406kc();
        c0406kc.f2843a = false;
        c0406kc.f2849d = -1;
        c0406kc.f2851e = -1;
        c0406kc.f2853f = -1.0f;
        c0406kc.f2855g = -1;
        c0406kc.f2857h = -1;
        c0406kc.f2859i = -1;
        c0406kc.f2861j = -1;
        c0406kc.f2862k = -1;
        c0406kc.f2863l = -1;
        c0406kc.f2864m = -1;
        c0406kc.f2865n = -1;
        c0406kc.f2866o = -1;
        c0406kc.f2867p = -1;
        c0406kc.f2868q = -1;
        c0406kc.f2869r = -1;
        c0406kc.f2870s = -1;
        c0406kc.f2871t = 0.5f;
        c0406kc.f2872u = 0.5f;
        c0406kc.f2873v = null;
        c0406kc.f2874w = -1;
        c0406kc.f2875x = 0;
        c0406kc.f2876y = 0.0f;
        c0406kc.f2877z = -1;
        c0406kc.f2817A = -1;
        c0406kc.f2818B = -1;
        c0406kc.f2819C = -1;
        c0406kc.f2820D = -1;
        c0406kc.f2821E = -1;
        c0406kc.f2822F = -1;
        c0406kc.f2823G = -1;
        c0406kc.f2824H = -1;
        c0406kc.f2825I = -1;
        c0406kc.f2826J = -1;
        c0406kc.f2827K = -1;
        c0406kc.f2828L = -1;
        c0406kc.f2829M = -1;
        c0406kc.f2830N = -1;
        c0406kc.f2831O = -1.0f;
        c0406kc.f2832P = -1.0f;
        c0406kc.f2833Q = 0;
        c0406kc.f2834R = 0;
        c0406kc.f2835S = 0;
        c0406kc.f2836T = 0;
        c0406kc.f2837U = -1;
        c0406kc.f2838V = -1;
        c0406kc.f2839W = -1;
        c0406kc.f2840X = -1;
        c0406kc.f2841Y = 1.0f;
        c0406kc.f2842Z = 1.0f;
        c0406kc.f2844a0 = -1;
        c0406kc.f2846b0 = 0;
        c0406kc.f2848c0 = -1;
        c0406kc.f2856g0 = false;
        c0406kc.f2858h0 = false;
        c0406kc.f2860i0 = true;
        this.f2616d = c0406kc;
        C0517nc c0517nc = new C0517nc();
        c0517nc.f3373a = 0.0f;
        c0517nc.f3374b = 0.0f;
        c0517nc.f3375c = 0.0f;
        c0517nc.f3376d = 1.0f;
        c0517nc.f3377e = 1.0f;
        c0517nc.f3378f = Float.NaN;
        c0517nc.f3379g = Float.NaN;
        c0517nc.f3380h = 0.0f;
        c0517nc.f3381i = 0.0f;
        c0517nc.f3382j = 0.0f;
        c0517nc.f3383k = false;
        c0517nc.f3384l = 0.0f;
        this.f2617e = c0517nc;
        this.f2618f = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m1584a(C0256gc c0256gc) {
        C0406kc c0406kc = this.f2616d;
        c0256gc.f2092d = c0406kc.f2855g;
        c0256gc.f2094e = c0406kc.f2857h;
        c0256gc.f2096f = c0406kc.f2859i;
        c0256gc.f2098g = c0406kc.f2861j;
        c0256gc.f2100h = c0406kc.f2862k;
        c0256gc.f2102i = c0406kc.f2863l;
        c0256gc.f2104j = c0406kc.f2864m;
        c0256gc.f2106k = c0406kc.f2865n;
        c0256gc.f2108l = c0406kc.f2866o;
        c0256gc.f2112p = c0406kc.f2867p;
        c0256gc.f2113q = c0406kc.f2868q;
        c0256gc.f2114r = c0406kc.f2869r;
        c0256gc.f2115s = c0406kc.f2870s;
        ((ViewGroup.MarginLayoutParams) c0256gc).leftMargin = c0406kc.f2819C;
        ((ViewGroup.MarginLayoutParams) c0256gc).rightMargin = c0406kc.f2820D;
        ((ViewGroup.MarginLayoutParams) c0256gc).topMargin = c0406kc.f2821E;
        ((ViewGroup.MarginLayoutParams) c0256gc).bottomMargin = c0406kc.f2822F;
        c0256gc.f2120x = c0406kc.f2830N;
        c0256gc.f2121y = c0406kc.f2829M;
        c0256gc.f2117u = c0406kc.f2826J;
        c0256gc.f2119w = c0406kc.f2828L;
        c0256gc.f2122z = c0406kc.f2871t;
        c0256gc.f2060A = c0406kc.f2872u;
        c0256gc.f2109m = c0406kc.f2874w;
        c0256gc.f2110n = c0406kc.f2875x;
        c0256gc.f2111o = c0406kc.f2876y;
        c0256gc.f2061B = c0406kc.f2873v;
        c0256gc.f2075P = c0406kc.f2877z;
        c0256gc.f2076Q = c0406kc.f2817A;
        c0256gc.f2064E = c0406kc.f2831O;
        c0256gc.f2063D = c0406kc.f2832P;
        c0256gc.f2066G = c0406kc.f2834R;
        c0256gc.f2065F = c0406kc.f2833Q;
        c0256gc.f2078S = c0406kc.f2856g0;
        c0256gc.f2079T = c0406kc.f2858h0;
        c0256gc.f2067H = c0406kc.f2835S;
        c0256gc.f2068I = c0406kc.f2836T;
        c0256gc.f2071L = c0406kc.f2837U;
        c0256gc.f2072M = c0406kc.f2838V;
        c0256gc.f2069J = c0406kc.f2839W;
        c0256gc.f2070K = c0406kc.f2840X;
        c0256gc.f2073N = c0406kc.f2841Y;
        c0256gc.f2074O = c0406kc.f2842Z;
        c0256gc.f2077R = c0406kc.f2818B;
        c0256gc.f2090c = c0406kc.f2853f;
        c0256gc.f2086a = c0406kc.f2849d;
        c0256gc.f2088b = c0406kc.f2851e;
        ((ViewGroup.MarginLayoutParams) c0256gc).width = c0406kc.f2845b;
        ((ViewGroup.MarginLayoutParams) c0256gc).height = c0406kc.f2847c;
        String str = c0406kc.f2854f0;
        if (str != null) {
            c0256gc.f2080U = str;
        }
        c0256gc.setMarginStart(c0406kc.f2824H);
        c0256gc.setMarginEnd(c0406kc.f2823G);
        c0256gc.m1268a();
    }

    public final Object clone() {
        C0369jc c0369jc = new C0369jc();
        C0406kc c0406kc = c0369jc.f2616d;
        c0406kc.getClass();
        C0406kc c0406kc2 = this.f2616d;
        c0406kc.f2843a = c0406kc2.f2843a;
        c0406kc.f2845b = c0406kc2.f2845b;
        c0406kc.f2847c = c0406kc2.f2847c;
        c0406kc.f2849d = c0406kc2.f2849d;
        c0406kc.f2851e = c0406kc2.f2851e;
        c0406kc.f2853f = c0406kc2.f2853f;
        c0406kc.f2855g = c0406kc2.f2855g;
        c0406kc.f2857h = c0406kc2.f2857h;
        c0406kc.f2859i = c0406kc2.f2859i;
        c0406kc.f2861j = c0406kc2.f2861j;
        c0406kc.f2862k = c0406kc2.f2862k;
        c0406kc.f2863l = c0406kc2.f2863l;
        c0406kc.f2864m = c0406kc2.f2864m;
        c0406kc.f2865n = c0406kc2.f2865n;
        c0406kc.f2866o = c0406kc2.f2866o;
        c0406kc.f2867p = c0406kc2.f2867p;
        c0406kc.f2868q = c0406kc2.f2868q;
        c0406kc.f2869r = c0406kc2.f2869r;
        c0406kc.f2870s = c0406kc2.f2870s;
        c0406kc.f2871t = c0406kc2.f2871t;
        c0406kc.f2872u = c0406kc2.f2872u;
        c0406kc.f2873v = c0406kc2.f2873v;
        c0406kc.f2874w = c0406kc2.f2874w;
        c0406kc.f2875x = c0406kc2.f2875x;
        c0406kc.f2876y = c0406kc2.f2876y;
        c0406kc.f2877z = c0406kc2.f2877z;
        c0406kc.f2817A = c0406kc2.f2817A;
        c0406kc.f2818B = c0406kc2.f2818B;
        c0406kc.f2819C = c0406kc2.f2819C;
        c0406kc.f2820D = c0406kc2.f2820D;
        c0406kc.f2821E = c0406kc2.f2821E;
        c0406kc.f2822F = c0406kc2.f2822F;
        c0406kc.f2823G = c0406kc2.f2823G;
        c0406kc.f2824H = c0406kc2.f2824H;
        c0406kc.f2825I = c0406kc2.f2825I;
        c0406kc.f2826J = c0406kc2.f2826J;
        c0406kc.f2827K = c0406kc2.f2827K;
        c0406kc.f2828L = c0406kc2.f2828L;
        c0406kc.f2829M = c0406kc2.f2829M;
        c0406kc.f2830N = c0406kc2.f2830N;
        c0406kc.f2831O = c0406kc2.f2831O;
        c0406kc.f2832P = c0406kc2.f2832P;
        c0406kc.f2833Q = c0406kc2.f2833Q;
        c0406kc.f2834R = c0406kc2.f2834R;
        c0406kc.f2835S = c0406kc2.f2835S;
        c0406kc.f2836T = c0406kc2.f2836T;
        c0406kc.f2837U = c0406kc2.f2837U;
        c0406kc.f2838V = c0406kc2.f2838V;
        c0406kc.f2839W = c0406kc2.f2839W;
        c0406kc.f2840X = c0406kc2.f2840X;
        c0406kc.f2841Y = c0406kc2.f2841Y;
        c0406kc.f2842Z = c0406kc2.f2842Z;
        c0406kc.f2844a0 = c0406kc2.f2844a0;
        c0406kc.f2846b0 = c0406kc2.f2846b0;
        c0406kc.f2848c0 = c0406kc2.f2848c0;
        c0406kc.f2854f0 = c0406kc2.f2854f0;
        int[] iArr = c0406kc2.f2850d0;
        if (iArr != null) {
            c0406kc.f2850d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            c0406kc.f2850d0 = null;
        }
        c0406kc.f2852e0 = c0406kc2.f2852e0;
        c0406kc.f2856g0 = c0406kc2.f2856g0;
        c0406kc.f2858h0 = c0406kc2.f2858h0;
        c0406kc.f2860i0 = c0406kc2.f2860i0;
        C0443lc c0443lc = c0369jc.f2615c;
        c0443lc.getClass();
        C0443lc c0443lc2 = this.f2615c;
        c0443lc2.getClass();
        c0443lc.f3042a = c0443lc2.f3042a;
        c0443lc.f3043b = c0443lc2.f3043b;
        c0443lc.f3045d = c0443lc2.f3045d;
        c0443lc.f3044c = c0443lc2.f3044c;
        C0480mc c0480mc = this.f2614b;
        int i = c0480mc.f3190a;
        C0480mc c0480mc2 = c0369jc.f2614b;
        c0480mc2.f3190a = i;
        c0480mc2.f3192c = c0480mc.f3192c;
        c0480mc2.f3193d = c0480mc.f3193d;
        c0480mc2.f3191b = c0480mc.f3191b;
        C0517nc c0517nc = c0369jc.f2617e;
        c0517nc.getClass();
        C0517nc c0517nc2 = this.f2617e;
        c0517nc2.getClass();
        c0517nc.f3373a = c0517nc2.f3373a;
        c0517nc.f3374b = c0517nc2.f3374b;
        c0517nc.f3375c = c0517nc2.f3375c;
        c0517nc.f3376d = c0517nc2.f3376d;
        c0517nc.f3377e = c0517nc2.f3377e;
        c0517nc.f3378f = c0517nc2.f3378f;
        c0517nc.f3379g = c0517nc2.f3379g;
        c0517nc.f3380h = c0517nc2.f3380h;
        c0517nc.f3381i = c0517nc2.f3381i;
        c0517nc.f3382j = c0517nc2.f3382j;
        c0517nc.f3383k = c0517nc2.f3383k;
        c0517nc.f3384l = c0517nc2.f3384l;
        c0369jc.f2613a = this.f2613a;
        return c0369jc;
    }
}
