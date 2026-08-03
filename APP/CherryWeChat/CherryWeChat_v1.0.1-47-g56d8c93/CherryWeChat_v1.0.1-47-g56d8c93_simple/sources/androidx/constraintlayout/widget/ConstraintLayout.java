package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p000.AbstractC0639Ou;
import p000.AbstractC0714Qj;
import p000.AbstractC1364eb;
import p000.AbstractC1408fb;
import p000.AbstractC1449gF;
import p000.AbstractC2540tb;
import p000.AbstractC2592uk;
import p000.C0368Ih;
import p000.C0649P3;
import p000.C0757Rk;
import p000.C0830TD;
import p000.C1452gb;
import p000.C1475gy;
import p000.C1496hb;
import p000.C1540ib;
import p000.C2097jb;
import p000.C2106jk;
import p000.C2150kk;
import p000.C2197lk;
import p000.C2221m7;
import p000.C2244mo;
import p000.C2399q5;
import p000.C2411qb;
import p000.C2454rb;
import p000.C2497sb;
import p000.C2585ud;
import p000.C2656w4;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: p */
    public static C1475gy f3870p;

    /* JADX INFO: renamed from: a */
    public final SparseArray f3871a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3872b;

    /* JADX INFO: renamed from: c */
    public final C2497sb f3873c;

    /* JADX INFO: renamed from: d */
    public int f3874d;

    /* JADX INFO: renamed from: e */
    public int f3875e;

    /* JADX INFO: renamed from: f */
    public int f3876f;

    /* JADX INFO: renamed from: g */
    public int f3877g;

    /* JADX INFO: renamed from: h */
    public boolean f3878h;

    /* JADX INFO: renamed from: i */
    public int f3879i;

    /* JADX INFO: renamed from: j */
    public C2411qb f3880j;

    /* JADX INFO: renamed from: k */
    public C0649P3 f3881k;

    /* JADX INFO: renamed from: l */
    public int f3882l;

    /* JADX INFO: renamed from: m */
    public HashMap f3883m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f3884n;

    /* JADX INFO: renamed from: o */
    public final C1496hb f3885o;

    public ConstraintLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f3871a = new SparseArray();
        this.f3872b = new ArrayList(4);
        this.f3873c = new C2497sb();
        this.f3874d = 0;
        this.f3875e = 0;
        this.f3876f = Integer.MAX_VALUE;
        this.f3877g = Integer.MAX_VALUE;
        this.f3878h = true;
        this.f3879i = 257;
        this.f3880j = null;
        this.f3881k = null;
        this.f3882l = -1;
        this.f3883m = new HashMap();
        this.f3884n = new SparseArray();
        this.f3885o = new C1496hb(this, this);
        m2125i(r3, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C1452gb m2123g() {
        C1452gb r0 = new C1452gb(-2, -2);
        r0.f5106a = -1;
        r0.f5108b = -1;
        r0.f5110c = -1.0f;
        r0.f5112d = true;
        r0.f5114e = -1;
        r0.f5116f = -1;
        r0.f5118g = -1;
        r0.f5120h = -1;
        r0.f5122i = -1;
        r0.f5124j = -1;
        r0.f5126k = -1;
        r0.f5128l = -1;
        r0.f5130m = -1;
        r0.f5132n = -1;
        r0.f5134o = -1;
        r0.f5136p = -1;
        r0.f5138q = 0;
        r0.f5139r = 0.0f;
        r0.f5140s = -1;
        r0.f5141t = -1;
        r0.f5142u = -1;
        r0.f5143v = -1;
        r0.f5144w = Integer.MIN_VALUE;
        r0.f5145x = Integer.MIN_VALUE;
        r0.f5146y = Integer.MIN_VALUE;
        r0.f5147z = Integer.MIN_VALUE;
        r0.f5080A = Integer.MIN_VALUE;
        r0.f5081B = Integer.MIN_VALUE;
        r0.f5082C = Integer.MIN_VALUE;
        r0.f5083D = 0;
        r0.f5084E = 0.5f;
        r0.f5085F = 0.5f;
        r0.f5086G = null;
        r0.f5087H = -1.0f;
        r0.f5088I = -1.0f;
        r0.f5089J = 0;
        r0.f5090K = 0;
        r0.f5091L = 0;
        r0.f5092M = 0;
        r0.f5093N = 0;
        r0.f5094O = 0;
        r0.f5095P = 0;
        r0.f5096Q = 0;
        r0.f5097R = 1.0f;
        r0.f5098S = 1.0f;
        r0.f5099T = -1;
        r0.f5100U = -1;
        r0.f5101V = -1;
        r0.f5102W = false;
        r0.f5103X = false;
        r0.f5104Y = null;
        r0.f5105Z = 0;
        r0.f5107a0 = true;
        r0.f5109b0 = true;
        r0.f5111c0 = false;
        r0.f5113d0 = false;
        r0.f5115e0 = false;
        r0.f5117f0 = -1;
        r0.f5119g0 = -1;
        r0.f5121h0 = -1;
        r0.f5123i0 = -1;
        r0.f5125j0 = Integer.MIN_VALUE;
        r0.f5127k0 = Integer.MIN_VALUE;
        r0.f5129l0 = 0.5f;
        r0.f5137p0 = new C2454rb();
        return r0;
    }

    private int getPaddingWidth() {
        int r0 = Math.max(0, getPaddingLeft());
        int r2 = Math.max(0, getPaddingRight()) + r0;
        int r02 = Math.max(0, getPaddingStart());
        int r1 = Math.max(0, getPaddingEnd()) + r02;
        if (r1 <= 0) goto L5;
        return r1;
    L5:
        return r2;
    }

    public static C1475gy getSharedValues() {
        if (f3870p != null) goto L6;
        C1475gy r0 = new C1475gy();
        new SparseIntArray();
        new HashMap();
        f3870p = r0;
    L6:
        return f3870p;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C1452gb;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r18) {
        ArrayList r2 = this.f3872b;
        if (r2 == null) goto L9;
        int r3 = r2.size();
        if (r3 <= 0) goto L9;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L9;
        ((AbstractC1364eb) r2.get(r4)).getClass();
        r4 = r4 + 1;
    L9:
        super.dispatchDraw(r18);
        if (isInEditMode() == false) goto L24;
        float r22 = getWidth();
        float r32 = getHeight();
        int r42 = getChildCount();
        int r5 = 0;
    L12:
        if (r5 >= r42) goto L32;
        View r6 = getChildAt(r5);
        if (r6.getVisibility() == 8) goto L23;
        Object r62 = r6.getTag();
        if (r62 == null) goto L23;
        if ((r62 instanceof String) == false) goto L23;
        String[] r63 = ((String) r62).split(",");
        if (r63.length != 4) goto L23;
        int r7 = Integer.parseInt(r63[0]);
        int r8 = Integer.parseInt(r63[1]);
        int r9 = Integer.parseInt(r63[2]);
        int r72 = (int) ((r7 / 1080.0f) * r22);
        int r82 = (int) ((r8 / 1920.0f) * r32);
        Paint r15 = new Paint();
        r15.setColor(-65536);
        float r11 = r72;
        float r12 = r82;
        float r13 = r72 + ((int) ((r9 / 1080.0f) * r22));
        r18.drawLine(r11, r12, r13, r12, r15);
        float r14 = r82 + ((int) ((Integer.parseInt(r63[3]) / 1920.0f) * r32));
        r18.drawLine(r13, r12, r13, r14, r15);
        r18.drawLine(r13, r14, r11, r14, r15);
        r18.drawLine(r11, r14, r11, r12, r15);
        r15.setColor(-16711936);
        r18.drawLine(r11, r12, r13, r14, r15);
        r18.drawLine(r11, r14, r13, r12, r15);
    L23:
        r5 = r5 + 1;
        goto L12
    L32:
        return;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f3878h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2123g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r12) {
        Context r1 = getContext();
        C1452gb r0 = new C1452gb(r1, r12);
        r0.f5106a = -1;
        r0.f5108b = -1;
        r0.f5110c = -1.0f;
        r0.f5112d = true;
        r0.f5114e = -1;
        r0.f5116f = -1;
        r0.f5118g = -1;
        r0.f5120h = -1;
        r0.f5122i = -1;
        r0.f5124j = -1;
        r0.f5126k = -1;
        r0.f5128l = -1;
        r0.f5130m = -1;
        r0.f5132n = -1;
        r0.f5134o = -1;
        r0.f5136p = -1;
        r0.f5138q = 0;
        r0.f5139r = 0.0f;
        r0.f5140s = -1;
        r0.f5141t = -1;
        r0.f5142u = -1;
        r0.f5143v = -1;
        r0.f5144w = Integer.MIN_VALUE;
        r0.f5145x = Integer.MIN_VALUE;
        r0.f5146y = Integer.MIN_VALUE;
        r0.f5147z = Integer.MIN_VALUE;
        r0.f5080A = Integer.MIN_VALUE;
        r0.f5081B = Integer.MIN_VALUE;
        r0.f5082C = Integer.MIN_VALUE;
        r0.f5083D = 0;
        r0.f5084E = 0.5f;
        r0.f5085F = 0.5f;
        r0.f5086G = null;
        r0.f5087H = -1.0f;
        r0.f5088I = -1.0f;
        r0.f5089J = 0;
        r0.f5090K = 0;
        r0.f5091L = 0;
        r0.f5092M = 0;
        r0.f5093N = 0;
        r0.f5094O = 0;
        r0.f5095P = 0;
        r0.f5096Q = 0;
        r0.f5097R = 1.0f;
        r0.f5098S = 1.0f;
        r0.f5099T = -1;
        r0.f5100U = -1;
        r0.f5101V = -1;
        r0.f5102W = false;
        r0.f5103X = false;
        r0.f5104Y = null;
        r0.f5105Z = 0;
        r0.f5107a0 = true;
        r0.f5109b0 = true;
        r0.f5111c0 = false;
        r0.f5113d0 = false;
        r0.f5115e0 = false;
        r0.f5117f0 = -1;
        r0.f5119g0 = -1;
        r0.f5121h0 = -1;
        r0.f5123i0 = -1;
        r0.f5125j0 = Integer.MIN_VALUE;
        r0.f5127k0 = Integer.MIN_VALUE;
        r0.f5129l0 = 0.5f;
        r0.f5137p0 = new C2454rb();
        TypedArray r122 = r1.obtainStyledAttributes(r12, AbstractC0639Ou.f2035b);
        int r13 = r122.getIndexCount();
        int r3 = 0;
    L3:
        if (r3 >= r13) goto L114;
        int r7 = r122.getIndex(r3);
        int r8 = AbstractC1408fb.f4991a.get(r7);
        switch(r8) {
            case 1: goto L112;
            case 2: goto L109;
            case 3: goto L108;
            case 4: goto L105;
            case 5: goto L104;
            case 6: goto L103;
            case 7: goto L102;
            case 8: goto L99;
            case 9: goto L96;
            case 10: goto L93;
            case 11: goto L90;
            case 12: goto L87;
            case 13: goto L84;
            case 14: goto L81;
            case 15: goto L78;
            case 16: goto L75;
            case 17: goto L72;
            case 18: goto L69;
            case 19: goto L66;
            case 20: goto L63;
            case 21: goto L62;
            case 22: goto L61;
            case 23: goto L60;
            case 24: goto L59;
            case 25: goto L58;
            case 26: goto L57;
            case 27: goto L56;
            case 28: goto L55;
            case 29: goto L54;
            case 30: goto L53;
            case 31: goto L52;
            case 32: goto L51;
            case 33: goto L118;
            case 34: goto L122;
            case 35: goto L40;
            case 36: goto L116;
            case 37: goto L120;
            case 38: goto L29;
            default: goto L6;
        };
    L6:
        switch(r8) {
            case 44: goto L28;
            case 45: goto L27;
            case 46: goto L26;
            case 47: goto L25;
            case 48: goto L24;
            case 49: goto L23;
            case 50: goto L22;
            case 51: goto L21;
            case 52: goto L18;
            case 53: goto L15;
            case 54: goto L14;
            case 55: goto L13;
            default: goto L7;
        };
    L7:
        switch(r8) {
            case 64: goto L12;
            case 65: goto L11;
            case 66: goto L10;
            case 67: goto L9;
            default: goto L113;
        };
    L9:
        r0.f5112d = r122.getBoolean(r7, r0.f5112d);
        goto L113
    L10:
        r0.f5105Z = r122.getInt(r7, r0.f5105Z);
        goto L113
    L11:
        C2411qb.m4851g(r0, r122, r7, 1);
        goto L113
    L12:
        C2411qb.m4851g(r0, r122, r7, 0);
    L113:
        r3 = r3 + 1;
        goto L3
    L13:
        r0.f5082C = r122.getDimensionPixelSize(r7, r0.f5082C);
        goto L113
    L14:
        r0.f5083D = r122.getDimensionPixelSize(r7, r0.f5083D);
        goto L113
    L15:
        int r82 = r122.getResourceId(r7, r0.f5134o);
        r0.f5134o = r82;
        if (r82 != (-1)) goto L113;
        r0.f5134o = r122.getInt(r7, -1);
        goto L113
    L18:
        int r83 = r122.getResourceId(r7, r0.f5132n);
        r0.f5132n = r83;
        if (r83 != (-1)) goto L113;
        r0.f5132n = r122.getInt(r7, -1);
        goto L113
    L21:
        r0.f5104Y = r122.getString(r7);
        goto L113
    L22:
        r0.f5100U = r122.getDimensionPixelOffset(r7, r0.f5100U);
        goto L113
    L23:
        r0.f5099T = r122.getDimensionPixelOffset(r7, r0.f5099T);
        goto L113
    L24:
        r0.f5090K = r122.getInt(r7, 0);
        goto L113
    L25:
        r0.f5089J = r122.getInt(r7, 0);
        goto L113
    L26:
        r0.f5088I = r122.getFloat(r7, r0.f5088I);
        goto L113
    L27:
        r0.f5087H = r122.getFloat(r7, r0.f5087H);
        goto L113
    L28:
        C2411qb.m4852h(r0, r122.getString(r7));
        goto L113
    L29:
        r0.f5098S = Math.max(0.0f, r122.getFloat(r7, r0.f5098S));
        r0.f5092M = 2;
        goto L113
    L40:
        r0.f5097R = Math.max(0.0f, r122.getFloat(r7, r0.f5097R));
        r0.f5091L = 2;
        goto L113
    L51:
        r0.f5092M = r122.getInt(r7, 0);
        goto L113
    L52:
        r0.f5091L = r122.getInt(r7, 0);
        goto L113
    L53:
        r0.f5085F = r122.getFloat(r7, r0.f5085F);
        goto L113
    L54:
        r0.f5084E = r122.getFloat(r7, r0.f5084E);
        goto L113
    L55:
        r0.f5103X = r122.getBoolean(r7, r0.f5103X);
        goto L113
    L56:
        r0.f5102W = r122.getBoolean(r7, r0.f5102W);
        goto L113
    L57:
        r0.f5081B = r122.getDimensionPixelSize(r7, r0.f5081B);
        goto L113
    L58:
        r0.f5080A = r122.getDimensionPixelSize(r7, r0.f5080A);
        goto L113
    L59:
        r0.f5147z = r122.getDimensionPixelSize(r7, r0.f5147z);
        goto L113
    L60:
        r0.f5146y = r122.getDimensionPixelSize(r7, r0.f5146y);
        goto L113
    L61:
        r0.f5145x = r122.getDimensionPixelSize(r7, r0.f5145x);
        goto L113
    L62:
        r0.f5144w = r122.getDimensionPixelSize(r7, r0.f5144w);
        goto L113
    L63:
        int r84 = r122.getResourceId(r7, r0.f5143v);
        r0.f5143v = r84;
        if (r84 != (-1)) goto L113;
        r0.f5143v = r122.getInt(r7, -1);
        goto L113
    L66:
        int r85 = r122.getResourceId(r7, r0.f5142u);
        r0.f5142u = r85;
        if (r85 != (-1)) goto L113;
        r0.f5142u = r122.getInt(r7, -1);
        goto L113
    L69:
        int r86 = r122.getResourceId(r7, r0.f5141t);
        r0.f5141t = r86;
        if (r86 != (-1)) goto L113;
        r0.f5141t = r122.getInt(r7, -1);
        goto L113
    L72:
        int r87 = r122.getResourceId(r7, r0.f5140s);
        r0.f5140s = r87;
        if (r87 != (-1)) goto L113;
        r0.f5140s = r122.getInt(r7, -1);
        goto L113
    L75:
        int r88 = r122.getResourceId(r7, r0.f5130m);
        r0.f5130m = r88;
        if (r88 != (-1)) goto L113;
        r0.f5130m = r122.getInt(r7, -1);
        goto L113
    L78:
        int r89 = r122.getResourceId(r7, r0.f5128l);
        r0.f5128l = r89;
        if (r89 != (-1)) goto L113;
        r0.f5128l = r122.getInt(r7, -1);
        goto L113
    L81:
        int r810 = r122.getResourceId(r7, r0.f5126k);
        r0.f5126k = r810;
        if (r810 != (-1)) goto L113;
        r0.f5126k = r122.getInt(r7, -1);
        goto L113
    L84:
        int r811 = r122.getResourceId(r7, r0.f5124j);
        r0.f5124j = r811;
        if (r811 != (-1)) goto L113;
        r0.f5124j = r122.getInt(r7, -1);
        goto L113
    L87:
        int r812 = r122.getResourceId(r7, r0.f5122i);
        r0.f5122i = r812;
        if (r812 != (-1)) goto L113;
        r0.f5122i = r122.getInt(r7, -1);
        goto L113
    L90:
        int r813 = r122.getResourceId(r7, r0.f5120h);
        r0.f5120h = r813;
        if (r813 != (-1)) goto L113;
        r0.f5120h = r122.getInt(r7, -1);
        goto L113
    L93:
        int r814 = r122.getResourceId(r7, r0.f5118g);
        r0.f5118g = r814;
        if (r814 != (-1)) goto L113;
        r0.f5118g = r122.getInt(r7, -1);
        goto L113
    L96:
        int r815 = r122.getResourceId(r7, r0.f5116f);
        r0.f5116f = r815;
        if (r815 != (-1)) goto L113;
        r0.f5116f = r122.getInt(r7, -1);
        goto L113
    L99:
        int r816 = r122.getResourceId(r7, r0.f5114e);
        r0.f5114e = r816;
        if (r816 != (-1)) goto L113;
        r0.f5114e = r122.getInt(r7, -1);
        goto L113
    L102:
        r0.f5110c = r122.getFloat(r7, r0.f5110c);
        goto L113
    L103:
        r0.f5108b = r122.getDimensionPixelOffset(r7, r0.f5108b);
        goto L113
    L104:
        r0.f5106a = r122.getDimensionPixelOffset(r7, r0.f5106a);
        goto L113
    L105:
        float r72 = r122.getFloat(r7, r0.f5139r) % 360.0f;
        r0.f5139r = r72;
        if (r72 >= 0.0f) goto L113;
        r0.f5139r = (360.0f - r72) % 360.0f;
        goto L113
    L108:
        r0.f5138q = r122.getDimensionPixelSize(r7, r0.f5138q);
        goto L113
    L109:
        int r817 = r122.getResourceId(r7, r0.f5136p);
        r0.f5136p = r817;
        if (r817 != (-1)) goto L113;
        r0.f5136p = r122.getInt(r7, -1);
        goto L113
    L112:
        r0.f5101V = r122.getInt(r7, r0.f5101V);
        goto L113
    L116:
        r0.f5094O = r122.getDimensionPixelSize(r7, r0.f5094O);     // Catch: Exception -> L37
    L38:
        if (r122.getInt(r7, r0.f5094O) != (-2)) goto L113;
        r0.f5094O = -2;
        goto L113
    L118:
        r0.f5093N = r122.getDimensionPixelSize(r7, r0.f5093N);     // Catch: Exception -> L48
    L49:
        if (r122.getInt(r7, r0.f5093N) != (-2)) goto L113;
        r0.f5093N = -2;
        goto L113
    L120:
        r0.f5096Q = r122.getDimensionPixelSize(r7, r0.f5096Q);     // Catch: Exception -> L32
    L33:
        if (r122.getInt(r7, r0.f5096Q) != (-2)) goto L113;
        r0.f5096Q = -2;
        goto L113
    L122:
        r0.f5095P = r122.getDimensionPixelSize(r7, r0.f5095P);     // Catch: Exception -> L43
    L44:
        if (r122.getInt(r7, r0.f5095P) != (-2)) goto L113;
        r0.f5095P = -2;
        goto L113
    L114:
        r122.recycle();
        r0.m2781a();
        return r0;
    }

    public int getMaxHeight() {
        return this.f3877g;
    }

    public int getMaxWidth() {
        return this.f3876f;
    }

    public int getMinHeight() {
        return this.f3875e;
    }

    public int getMinWidth() {
        return this.f3874d;
    }

    public int getOptimizationLevel() {
        return this.f3873c.f8765D0;
    }

    public String getSceneString() {
        StringBuilder r0 = new StringBuilder();
        C2497sb r1 = this.f3873c;
        if (r1.f8624j != null) goto L9;
        int r2 = getId();
        if (r2 == (-1)) goto L7;
        r1.f8624j = getContext().getResources().getResourceEntryName(r2);
        goto L9
    L7:
        r1.f8624j = "parent";
    L9:
        if (r1.f8621h0 != null) goto L11;
        r1.f8621h0 = r1.f8624j;
    L11:
        Iterator r22 = r1.f8774q0.iterator();
    L13:
        if (r22.hasNext() == false) goto L24;
        C2454rb r4 = (C2454rb) r22.next();
        View r5 = r4.f8617f0;
        if (r5 == null) goto L13;
        if (r4.f8624j != null) goto L22;
        int r52 = r5.getId();
        if (r52 == (-1)) goto L22;
        r4.f8624j = getContext().getResources().getResourceEntryName(r52);
    L22:
        if (r4.f8621h0 != null) goto L13;
        r4.f8621h0 = r4.f8624j;
        goto L13
    L24:
        r1.mo4936n(r0);
        return r0.toString();
    }

    /* JADX INFO: renamed from: h */
    public final C2454rb m2124h(View r2) {
        if (r2 == this) goto L4;
        if (r2 != null) goto L7;
        return null;
    L7:
        if ((r2.getLayoutParams() instanceof C1452gb) == true) goto L9;
        r2.setLayoutParams(generateLayoutParams(r2.getLayoutParams()));
        if ((r2.getLayoutParams() instanceof C1452gb) == true) goto L13;
        return null;
    L13:
        return ((C1452gb) r2.getLayoutParams()).f5137p0;
    L9:
        return ((C1452gb) r2.getLayoutParams()).f5137p0;
    L4:
        return this.f3873c;
    }

    /* JADX INFO: renamed from: i */
    public final void m2125i(AttributeSet r8, int r9) {
        C2497sb r0 = this.f3873c;
        r0.f8617f0 = this;
        C1496hb r1 = this.f3885o;
        r0.f8778u0 = r1;
        r0.f8776s0.f8952f = r1;
        this.f3871a.put(getId(), this);
        this.f3880j = null;
        if (r8 == null) goto L37;
        TypedArray r82 = getContext().obtainStyledAttributes(r8, AbstractC0639Ou.f2035b, r9, 0);
        int r92 = r82.getIndexCount();
        int r2 = 0;
    L5:
        if (r2 >= r92) goto L36;
        int r3 = r82.getIndex(r2);
        if (r3 != 16) goto L10;
        this.f3874d = r82.getDimensionPixelOffset(r3, this.f3874d);
    L35:
        r2 = r2 + 1;
        goto L5
    L10:
        if (r3 != 17) goto L13;
        this.f3875e = r82.getDimensionPixelOffset(r3, this.f3875e);
        goto L35
    L13:
        if (r3 != 14) goto L16;
        this.f3876f = r82.getDimensionPixelOffset(r3, this.f3876f);
        goto L35
    L16:
        if (r3 != 15) goto L19;
        this.f3877g = r82.getDimensionPixelOffset(r3, this.f3877g);
        goto L35
    L19:
        if (r3 != 113) goto L22;
        this.f3879i = r82.getInt(r3, this.f3879i);
        goto L35
    L22:
        if (r3 != 56) goto L29;
        int r32 = r82.getResourceId(r3, 0);
        if (r32 == 0) goto L35;
        m2126j(r32);     // Catch: Resources.NotFoundException -> L27
    L27:
        this.f3881k = null;
        goto L35
    L29:
        if (r3 != 34) goto L35;
        int r33 = r82.getResourceId(r3, 0);
        C2411qb r5 = new C2411qb();     // Catch: Resources.NotFoundException -> L33
        this.f3880j = r5;     // Catch: Resources.NotFoundException -> L33
        r5.m4855e(getContext(), r33);     // Catch: Resources.NotFoundException -> L33
    L34:
        this.f3882l = r33;
    L33:
        this.f3880j = null;
        goto L34
    L36:
        r82.recycle();
    L37:
        r0.f8765D0 = this.f3879i;
        C2244mo.f7925q = r0.m4984W(512);
    }

    /* JADX INFO: renamed from: j */
    public final void m2126j(int r6) {
        Context r1 = getContext();
        C0649P3 r0 = new C0649P3(12);
        r0.f2089b = new SparseArray();
        r0.f2090c = new SparseArray();
        XmlResourceParser r62 = r1.getResources().getXml(r6);
        int r2 = r62.getEventType();     // Catch: Throwable -> L30
        C1540ib r3 = null;
    L5:
        if (r2 == 1) goto L28;
        if (r2 != 2) goto L26;
        String r22 = r62.getName();     // Catch: Throwable -> L30
        switch(r22.hashCode()) {
            case -1349929691: goto L24;
            case 80204913: goto L21;
            case 1382829617: goto L19;
            case 1657696882: goto L17;
            case 1901439077: goto L13;
            default: goto L26;
        };     // Catch: Throwable -> L30
    L17:
        String r4 = "layoutDescription";
    L18:
        r22.equals(r4);     // Catch: Throwable -> L30
        goto L26
    L19:
        r4 = "StateSet";
        goto L18
    L13:
        if (r22.equals("Variant") == false) goto L26;
        C2097jb r23 = new C2097jb(r1, r62);     // Catch: Throwable -> L30
        if (r3 == null) goto L26;
        r3.f5435a.add(r23);     // Catch: Throwable -> L30
        goto L26
    L21:
        if (r22.equals("State") == false) goto L26;
        C1540ib r24 = new C1540ib(r1, r62);     // Catch: Throwable -> L30
        ((SparseArray) r0.f2089b).put(r24.f5436b, r24);     // Catch: Throwable -> L30
        r3 = r24;
        goto L26
    L24:
        if (r22.equals("ConstraintSet") == false) goto L26;
        r0.m1282M(r1, r62);     // Catch: Throwable -> L30
    L26:
        r2 = r62.next();     // Catch: Throwable -> L30
    L28:
        this.f3881k = r0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2127k(C2497sb r28, int r29, int r30, int r31) {
        int r3 = View.MeasureSpec.getMode(r30);
        int r4 = View.MeasureSpec.getSize(r30);
        int r5 = View.MeasureSpec.getMode(r31);
        int r6 = View.MeasureSpec.getSize(r31);
        int r7 = Math.max(0, getPaddingTop());
        int r9 = Math.max(0, getPaddingBottom());
        int r10 = r7 + r9;
        int r11 = getPaddingWidth();
        C1496hb r12 = this.f3885o;
        r12.f5274b = r7;
        r12.f5275c = r9;
        r12.f5276d = r11;
        r12.f5277e = r10;
        r12.f5278f = r30;
        r12.f5279g = r31;
        int r92 = Math.max(0, getPaddingStart());
        int r13 = Math.max(0, getPaddingEnd());
        int r14 = 1;
        if (r92 > 0) goto L8;
        if (r13 > 0) goto L8;
        r92 = Math.max(0, getPaddingLeft());
    L12:
        int r42 = r4 - r11;
        int r62 = r6 - r10;
        int r102 = r12.f5277e;
        int r112 = r12.f5276d;
        int r122 = getChildCount();
        if (r3 == Integer.MIN_VALUE) goto L23;
        if (r3 == 0) goto L18;
        if (r3 == 1073741824) goto L17;
        int r17 = 0;
    L26:
        if (r5 == Integer.MIN_VALUE) goto L37;
        if (r5 == 0) goto L32;
        if (r5 == 1073741824) goto L31;
        int r132 = 0;
    L30:
        int r123 = 1;
    L40:
        int r15 = r28.m4937q();
        C2585ud r8 = r28.f8776s0;
        int[] r103 = r28.f8582C;
        int r104 = r17;
        if (r104 != r15) goto L47;
        if (r132 != r28.m4933k()) goto L47;
        char r312 = 1;
    L48:
        r28.f8604Y = 0;
        r28.f8605Z = 0;
        r103[0] = this.f3876f - r112;
        r103[r312] = this.f3877g - r102;
        r28.f8609b0 = 0;
        r28.f8611c0 = 0;
        r28.m4922M(r14);
        r28.m4924O(r104);
        r28.m4923N(r123);
        r28.m4921L(r132);
        int r105 = this.f3874d - r112;
        if (r105 >= 0) goto L51;
        r28.f8609b0 = 0;
    L52:
        int r106 = this.f3875e - r102;
        if (r106 >= 0) goto L55;
        r28.f8611c0 = 0;
    L56:
        r28.f8781x0 = r92;
        r28.f8782y0 = r7;
        C2656w4 r72 = r28.f8775r0;
        C2497sb r93 = (C2497sb) r72.f9198d;
        ArrayList r107 = (ArrayList) r72.f9196b;
        C1496hb r113 = r28.f8778u0;
        int r124 = r28.f8774q0.size();
        int r133 = r28.m4937q();
        int r142 = r28.m4933k();
        boolean r152 = AbstractC0714Qj.m1492n(r29, 128);
        if (r152 == false) goto L59;
    L62:
        boolean r2 = true;
    L64:
        if (r2 == false) goto L99;
        int r0 = 0;
    L66:
        if (r0 >= r124) goto L99;
        boolean r21 = r2;
        C2454rb r22 = (C2454rb) r28.f8774q0.get(r0);
        int r222 = r0;
        int[] r02 = r22.f8637p0;
        int r24 = r124;
        if (r02[0] != 3) goto L71;
        boolean r26 = true;
    L73:
        if (r02[1] != 3) goto L75;
        boolean r03 = true;
    L76:
        if (r26 == false) goto L81;
        if (r03 == false) goto L81;
        if (r22.f8602W <= 0.0f) goto L81;
        boolean r04 = true;
    L83:
        if (r22.m4944x() == false) goto L87;
        if (r04 == false) goto L87;
    L85:
        int r05 = 1073741824;
        boolean r212 = false;
    L100:
        if (r3 != r05) goto L102;
        if (r5 != r05) goto L102;
    L103:
        boolean r06 = true;
    L105:
        boolean r07 = r212 & r06;
        if (r07 == false) goto L224;
        int r43 = Math.min(r103[0], r42);
        int r23 = Math.min(r103[1], r62);
        int r63 = 1073741824;
        if (r3 == 1073741824) goto L110;
    L113:
        if (r5 == r63) goto L115;
    L117:
        if (r3 != r63) goto L202;
        if (r5 != r63) goto L202;
        ArrayList r25 = r8.f8951e;
        C2497sb r44 = r8.f8947a;
        if (r8.f8948b == false) goto L122;
    L125:
        Iterator r64 = r44.f8774q0.iterator();
    L127:
        if (r64.hasNext() == false) goto L129;
        C2454rb r125 = (C2454rb) r64.next();
        r125.m4931h();
        r125.f8606a = false;
        r125.f8612d.m1551n();
        r125.f8614e.m1655m();
        r07 = r07;
        goto L127
    L129:
        boolean r20 = r07;
        r44.m4931h();
        int r08 = 0;
        r44.f8606a = false;
        r44.f8612d.m1551n();
        r44.f8614e.m1655m();
        r8.f8949c = false;
    L130:
        r8.m5088b(r8.f8950d);
        r44.f8604Y = r08;
        int[] r65 = r44.f8637p0;
        r44.f8605Z = r08;
        int r126 = r44.m4932j(r08);
        int r27 = r44.m4932j(1);
        if (r8.f8948b == false) goto L133;
        r8.m5089c();
    L133:
        int r09 = r44.m4938r();
        int r66 = r44.m4939s();
        C1496hb r252 = r113;
        r44.f8612d.f5064h.mo1539d(r09);
        r44.f8614e.f5064h.mo1539d(r66);
        r8.m5093g();
        if (r126 == 2) goto L140;
        if (r27 == 2) goto L140;
        int r262 = r09;
    L138:
        int r114 = 1;
    L156:
        int r010 = r65[0];
        if (r010 != r114) goto L159;
    L162:
        int r011 = r44.m4937q() + r262;
        r44.f8612d.f5065i.mo1539d(r011);
        r44.f8612d.f5061e.mo1539d(r011 - r262);
        r8.m5093g();
        int r012 = r65[1];
        if (r012 != 1) goto L165;
    L166:
        int r013 = r44.m4933k() + r66;
        r44.f8614e.f5065i.mo1539d(r013);
        r44.f8614e.f5061e.mo1539d(r013 - r66);
    L167:
        r8.m5093g();
        boolean r014 = true;
    L168:
        Iterator r67 = r25.iterator();
    L170:
        if (r67.hasNext() == false) goto L177;
        AbstractC1449gF r82 = (AbstractC1449gF) r67.next();
        if (r82.f5058b != r44) goto L176;
        if (r82.f5063g == false) goto L170;
    L176:
        r82.mo1548e();
        goto L170
    L177:
        Iterator r68 = r25.iterator();
    L179:
        if (r68.hasNext() == false) goto L200;
        AbstractC1449gF r83 = (AbstractC1449gF) r68.next();
        if (r014 == true) goto L186;
        if (r83.f5058b == r44) goto L179;
    L186:
        if (r83.f5064h.f9119j == false) goto L187;
        if (r83.f5065i.f9119j == true) goto L194;
        if ((r83 instanceof C2197lk) == false) goto L187;
    L194:
        if (r83.f5061e.f9119j == true) goto L179;
        if ((r83 instanceof C2221m7) == true) goto L179;
        if ((r83 instanceof C2197lk) == true) goto L179;
    L187:
        boolean r015 = false;
    L201:
        r44.m4922M(r126);
        r44.m4923N(r27);
        boolean r210 = r015;
        int r016 = 2;
        int r69 = 1073741824;
    L216:
        if (r210 == false) goto L225;
        if (r3 != r69) goto L219;
        boolean r32 = true;
    L220:
        if (r5 != r69) goto L222;
        boolean r45 = true;
    L223:
        r28.mo4925P(r32, r45);
        goto L225
    L222:
        r45 = false;
        goto L223
    L219:
        r32 = false;
    L225:
        if (r210 == true) goto L227;
    L230:
        int r017 = r28.f8765D0;
        if (r24 <= 0) goto L300;
        int r211 = r28.f8774q0.size();
        boolean r33 = r28.m4984W(64);
        C1496hb r46 = r28.f8778u0;
        int r153 = 0;
    L233:
        if (r153 >= r211) goto L292;
        C2454rb r52 = (C2454rb) r28.f8774q0.get(r153);
        if ((r52 instanceof C2150kk) == false) goto L238;
    L236:
        int r16 = r211;
    L291:
        r153 = r153 + 1;
        r211 = r16;
        goto L233
    L238:
        if ((r52 instanceof C2399q5) == true) goto L236;
        if (r52.f8585F == true) goto L236;
        if (r33 == false) goto L253;
        C0757Rk r610 = r52.f8612d;
        if (r610 == null) goto L253;
        C0830TD r84 = r52.f8614e;
        if (r84 == null) goto L253;
        if (r610.f5061e.f9119j == false) goto L253;
        if (r84.f5061e.f9119j == true) goto L236;
    L253:
        int r611 = r52.m4932j(0);
        int r85 = r52.m4932j(1);
        r16 = r211;
        if (r611 == 3) goto L256;
    L261:
        boolean r213 = false;
    L262:
        if (r213 == true) goto L288;
        if (r28.m4984W(1) == false) goto L288;
        if ((r52 instanceof C0368Ih) == true) goto L288;
        if (r611 == 3) goto L270;
    L275:
        if (r85 == 3) goto L277;
    L282:
        if (r611 == 3) goto L285;
        if (r85 != 3) goto L288;
    L285:
        if (r52.f8602W <= 0.0f) goto L288;
        r213 = true;
        goto L288
    L277:
        if (r52.f8640s != 0) goto L282;
        if (r611 == 3) goto L282;
        if (r52.m4944x() == true) goto L282;
        r213 = true;
        goto L282
    L270:
        if (r52.f8639r != 0) goto L275;
        if (r85 == 3) goto L275;
        if (r52.m4944x() == true) goto L275;
        r213 = true;
    L288:
        if (r213 == true) goto L291;
        r72.m5218z(0, r46, r52);
        goto L291
    L256:
        if (r52.f8639r == 1) goto L261;
        if (r85 != 3) goto L261;
        if (r52.f8640s == 1) goto L261;
        r213 = true;
        goto L262
    L292:
        ConstraintLayout r214 = r46.f5273a;
        int r34 = r214.getChildCount();
        ArrayList r47 = r214.f3872b;
        int r154 = 0;
    L293:
        if (r154 >= r34) goto L295;
        r214.getChildAt(r154);
        r154 = r154 + 1;
        goto L293
    L295:
        int r215 = r47.size();
        if (r215 <= 0) goto L300;
        int r155 = 0;
    L298:
        if (r155 >= r215) goto L300;
        ((AbstractC1364eb) r47.get(r155)).getClass();
        r155 = r155 + 1;
    L300:
        r72.m5199K(r28);
        int r216 = r107.size();
        if (r24 <= 0) goto L303;
        r72.m5198H(r28, 0, r133, r142);
    L303:
        if (r216 <= 0) goto L392;
        int[] r35 = r28.f8637p0;
        if (r35[0] != 2) goto L308;
        boolean r156 = true;
    L310:
        if (r35[1] != 2) goto L312;
        boolean r36 = true;
    L313:
        int r48 = Math.max(r28.m4937q(), r93.f8609b0);
        int r53 = Math.max(r28.m4933k(), r93.f8611c0);
        int r612 = 0;
        boolean r86 = false;
    L314:
        if (r612 >= r216) goto L335;
        C2454rb r127 = (C2454rb) r107.get(r612);
        if ((r127 instanceof C0368Ih) == true) goto L318;
        boolean r162 = r36;
        int r172 = r612;
        C1496hb r37 = r252;
    L334:
        r612 = r172 + 1;
        r252 = r37;
        r36 = r162;
        goto L314
    L318:
        int r115 = r127.m4937q();
        int r94 = r127.m4933k();
        r162 = r36;
        r172 = r612;
        r37 = r252;
        boolean r613 = r86 | r72.m5218z(1, r37, r127);
        int r87 = r127.m4937q();
        boolean r19 = r613;
        int r614 = r127.m4933k();
        if (r87 == r115) goto L326;
        r127.m4924O(r87);
        if (r156 == true) goto L323;
    L325:
        r19 = true;
        goto L326
    L323:
        if ((r127.m4938r() + r127.f8600U) <= r48) goto L325;
        r48 = Math.max(r48, r127.mo4340i(4).m2384e() + (r127.m4938r() + r127.f8600U));
    L326:
        if (r614 == r94) goto L333;
        r127.m4921L(r614);
        if (r162 == true) goto L330;
    L332:
        r19 = true;
        goto L333
    L330:
        if ((r127.m4939s() + r127.f8601V) <= r53) goto L332;
        r53 = Math.max(r53, r127.mo4340i(5).m2384e() + (r127.m4939s() + r127.f8601V));
    L333:
        r86 = r19 | ((C0368Ih) r127).f1282y0;
        goto L334
    L335:
        boolean r163 = r36;
        int r615 = 0;
    L336:
        C1496hb r38 = r252;
        if (r615 >= 2) goto L392;
        boolean r95 = r86;
        int r88 = 0;
    L339:
        if (r88 >= r216) goto L389;
        C2454rb r128 = (C2454rb) r107.get(r88);
        if ((r128 instanceof AbstractC2592uk) == false) goto L347;
        if ((r128 instanceof C0368Ih) == true) goto L347;
    L345:
        int r173 = r216;
    L360:
        C1496hb r253 = r38;
        int r232 = r615;
        int r192 = r88;
    L388:
        r88 = r192 + 1;
        r216 = r173;
        r615 = r232;
        r38 = r253;
    L347:
        if ((r128 instanceof C2150kk) == true) goto L345;
        r173 = r216;
        if (r128.f8619g0 == 8) goto L360;
        if (r20 == false) goto L359;
        if (r128.f8612d.f5061e.f9119j == false) goto L359;
        if (r128.f8614e.f5061e.f9119j == true) goto L360;
    L359:
        if ((r128 instanceof C0368Ih) == true) goto L360;
        int r217 = r128.m4937q();
        int r116 = r128.m4933k();
        r192 = r88;
        int r89 = r128.f8607a0;
        boolean r223 = r95;
        int r96 = 1;
        if (r615 != 1) goto L364;
        r96 = 2;
    L364:
        r95 = r223 | r72.m5218z(r96, r38, r128);
        r253 = r38;
        int r39 = r128.m4937q();
        r232 = r615;
        int r616 = r128.m4933k();
        if (r39 == r217) goto L374;
        r128.m4924O(r39);
        if (r156 == false) goto L372;
        if ((r128.m4938r() + r128.f8600U) <= r48) goto L372;
        r48 = Math.max(r48, r128.mo4340i(4).m2384e() + (r128.m4938r() + r128.f8600U));
    L372:
        r95 = true;
    L374:
        if (r616 == r116) goto L384;
        r128.m4921L(r616);
        if (r163 == false) goto L381;
        if ((r128.m4939s() + r128.f8601V) <= r53) goto L381;
        r53 = Math.max(r53, r128.mo4340i(5).m2384e() + (r128.m4939s() + r128.f8601V));
    L381:
        r95 = true;
    L384:
        if (r128.f8584E == false) goto L388;
        if (r89 == r128.f8607a0) goto L388;
        r95 = true;
        goto L388
    L389:
        int r174 = r216;
        r252 = r38;
        int r233 = r615;
        if (r95 == false) goto L392;
        int r218 = r233 + 1;
        r72.m5198H(r28, r218, r133, r142);
        r615 = r218;
        r216 = r174;
        r86 = false;
        goto L336
    L312:
        r36 = false;
        goto L313
    L308:
        r156 = false;
    L392:
        r28.f8765D0 = r017;
        C2244mo.f7925q = r28.m4984W(512);
        return;
    L227:
        if (r016 != 2) goto L230;
        return;
    L200:
        r015 = true;
        goto L201
    L165:
        if (r012 != 4) goto L167;
    L159:
        if (r010 == 4) goto L162;
        r014 = false;
    L140:
        if (r152 == false) goto L147;
        Iterator r117 = r25.iterator();
    L143:
        if (r117.hasNext() == false) goto L147;
        if (((AbstractC1449gF) r117.next()).mo1550k() == true) goto L143;
        r152 = false;
    L147:
        if (r152 == true) goto L149;
    L151:
        r262 = r09;
    L152:
        if (r152 == false) goto L138;
        if (r27 != 2) goto L138;
        r114 = 1;
        r44.m4923N(1);
        r44.m4921L(r8.m5090d(r44, 1));
        r44.f8614e.f5061e.mo1539d(r44.m4933k());
        goto L156
    L149:
        if (r126 != 2) goto L151;
        r44.m4922M(1);
        r262 = r09;
        r44.m4924O(r8.m5090d(r44, 0));
        r44.f8612d.f5061e.mo1539d(r44.m4937q());
        goto L152
    L122:
        if (r8.f8949c == true) goto L125;
        r20 = r07;
        r08 = 0;
    L202:
        r20 = r07;
        r252 = r113;
        C2497sb r018 = r8.f8947a;
        if (r8.f8948b == false) goto L209;
        Iterator r219 = r018.f8774q0.iterator();
    L206:
        if (r219.hasNext() == false) goto L208;
        C2454rb r49 = (C2454rb) r219.next();
        r49.m4931h();
        r49.f8606a = false;
        C0757Rk r617 = r49.f8612d;
        r617.f5061e.f9119j = false;
        r617.f5063g = false;
        r617.m1551n();
        C0830TD r410 = r49.f8614e;
        r410.f5061e.f9119j = false;
        r410.f5063g = false;
        r410.m1655m();
        goto L206
    L208:
        int r118 = 0;
        r018.m4931h();
        r018.f8606a = false;
        C0757Rk r220 = r018.f8612d;
        r220.f5061e.f9119j = false;
        r220.f5063g = false;
        r220.m1551n();
        C0830TD r221 = r018.f8614e;
        r221.f5061e.f9119j = false;
        r221.f5063g = false;
        r221.m1655m();
        r8.m5089c();
    L210:
        r8.m5088b(r8.f8950d);
        r018.f8604Y = r118;
        r018.f8605Z = r118;
        r018.f8612d.f5064h.mo1539d(r118);
        r018.f8614e.f5064h.mo1539d(r118);
        r69 = 1073741824;
        if (r3 != 1073741824) goto L213;
        r210 = r28.m4982T(r118, r152);
        r016 = 1;
    L214:
        if (r5 != 1073741824) goto L216;
        r210 = r210 & r28.m4982T(1, r152);
        r016 = r016 + 1;
        goto L216
    L213:
        r016 = 0;
        r210 = true;
        goto L214
    L209:
        r118 = 0;
        goto L210
    L115:
        if (r28.m4933k() == r23) goto L117;
        r28.m4921L(r23);
        r8.f8948b = true;
        goto L117
    L110:
        if (r28.m4937q() == r43) goto L112;
        r28.m4924O(r43);
        r8.f8948b = true;
    L112:
        r63 = 1073741824;
        goto L113
    L224:
        r20 = r07;
        r252 = r113;
        r016 = 0;
        r210 = false;
    L102:
        if (r152 == true) goto L103;
        r06 = false;
    L87:
        if (r22.m4945y() == false) goto L91;
        if (r04 == true) goto L85;
    L91:
        if ((r22 instanceof C0368Ih) == true) goto L85;
        if (r22.m4944x() == true) goto L85;
        if (r22.m4945y() == true) goto L85;
        r0 = r222 + 1;
        r2 = r21;
        r124 = r24;
    L81:
        r04 = false;
        goto L83
    L75:
        r03 = false;
        goto L76
    L71:
        r26 = false;
    L99:
        r212 = r2;
        r24 = r124;
        r05 = 1073741824;
        goto L100
    L59:
        if (AbstractC0714Qj.m1492n(r29, 64) == true) goto L62;
        r2 = false;
        goto L64
    L55:
        r28.f8611c0 = r106;
        goto L56
    L51:
        r28.f8609b0 = r105;
    L47:
        r8.f8949c = true;
        r312 = 1;
        goto L48
    L31:
        r132 = Math.min(this.f3877g - r102, r62);
        goto L30
    L32:
        if (r122 != 0) goto L36;
        int r129 = Math.max(0, this.f3875e);
    L34:
        r132 = r129;
    L35:
        r123 = 2;
        goto L40
    L36:
        r132 = 0;
        goto L35
    L37:
        if (r122 != 0) goto L39;
        r129 = Math.max(0, this.f3875e);
        goto L34
    L39:
        r132 = r62;
        goto L35
    L17:
        r17 = Math.min(this.f3876f - r112, r42);
        r14 = 1;
        goto L26
    L18:
        if (r122 != 0) goto L22;
        int r143 = Math.max(0, this.f3874d);
    L20:
        r17 = r143;
    L21:
        r14 = 2;
        goto L26
    L22:
        r17 = 0;
        goto L21
    L23:
        if (r122 != 0) goto L25;
        r143 = Math.max(0, this.f3874d);
        goto L20
    L25:
        r17 = r42;
    L8:
        if ((getContext().getApplicationInfo().flags & 4194304) == 0) goto L12;
        if (1 != getLayoutDirection()) goto L12;
        r92 = r13;
        goto L12
    }

    /* JADX INFO: renamed from: l */
    public final void m2128l(C2454rb r3, C1452gb r4, SparseArray r5, int r6, int r7) {
        View r0 = (View) this.f3871a.get(r6);
        C2454rb r52 = (C2454rb) r5.get(r6);
        if (r52 == null) goto L12;
        if (r0 != null) goto L6;
        return;
    L6:
        if ((r0.getLayoutParams() instanceof C1452gb) == false) goto L14;
        r4.f5111c0 = true;
        if (r7 != 6) goto L10;
        C1452gb r02 = (C1452gb) r0.getLayoutParams();
        r02.f5111c0 = true;
        r02.f5137p0.f8584E = true;
    L10:
        r3.mo4340i(6).m2381b(r52.mo4340i(r7), r4.f5083D, r4.f5082C, true);
        r3.f8584E = true;
        r3.mo4340i(3).m2389j();
        r3.mo4340i(5).m2389j();
        return;
    L14:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        int r52 = getChildCount();
        boolean r62 = isInEditMode();
        int r72 = 0;
        int r82 = 0;
    L3:
        if (r82 >= r52) goto L14;
        View r92 = getChildAt(r82);
        C1452gb r0 = (C1452gb) r92.getLayoutParams();
        C2454rb r1 = r0.f5137p0;
        if (r92.getVisibility() == 8) goto L7;
    L12:
        int r02 = r1.m4938r();
        int r2 = r1.m4939s();
        r92.layout(r02, r2, r1.m4937q() + r02, r1.m4933k() + r2);
    L13:
        r82 = r82 + 1;
        goto L3
    L7:
        if (r0.f5113d0 == true) goto L12;
        if (r0.f5115e0 == true) goto L12;
        if (r62 == true) goto L12;
    L14:
        ArrayList r53 = this.f3872b;
        int r63 = r53.size();
        if (r63 <= 0) goto L18;
    L16:
        if (r72 >= r63) goto L23;
        ((AbstractC1364eb) r53.get(r72)).getClass();
        r72 = r72 + 1;
        goto L16
    L23:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r35, int r36) {
        ConstraintLayout r0 = this;
        boolean r1 = r0.f3878h;
        r0.f3878h = r1;
        int r8 = 1;
        int r9 = 0;
        if (r1 == true) goto L11;
        int r12 = r0.getChildCount();
        int r2 = 0;
    L5:
        if (r2 >= r12) goto L11;
        if (r0.getChildAt(r2).isLayoutRequested() == true) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        r0.f3878h = true;
    L11:
        if ((r0.getContext().getApplicationInfo().flags & 4194304) != 0) goto L13;
    L15:
        boolean r13 = false;
    L16:
        C2497sb r10 = r0.f3873c;
        r10.f8779v0 = r13;
        if (r0.f3878h == false) goto L319;
        r0.f3878h = false;
        int r14 = r0.getChildCount();
        int r22 = 0;
    L19:
        if (r22 >= r14) goto L24;
        if (r0.getChildAt(r22).isLayoutRequested() == true) goto L22;
        r22 = r22 + 1;
        goto L19
    L22:
        boolean r11 = true;
    L25:
        if (r11 == false) goto L317;
        boolean r122 = r0.isInEditMode();
        int r132 = r0.getChildCount();
        int r15 = 0;
    L27:
        if (r15 >= r132) goto L33;
        C2454rb r23 = r0.m2124h(r0.getChildAt(r15));
        if (r23 == null) goto L32;
        r23.mo4914C();
    L32:
        r15 = r15 + 1;
        goto L27
    L33:
        SparseArray r16 = r0.f3871a;
        if (r122 == false) goto L73;
        int r3 = 0;
    L36:
        if (r3 >= r132) goto L73;
        View r4 = r0.getChildAt(r3);
        String r5 = r0.getResources().getResourceName(r4.getId());     // Catch: Resources.NotFoundException -> L71
        Integer r152 = Integer.valueOf(r4.getId());     // Catch: Resources.NotFoundException -> L71
        if (r5 == null) goto L49;
        int r162 = r8;
        if (r0.f3883m != null) goto L44;
        r0.f3883m = new HashMap();     // Catch: Resources.NotFoundException -> L326
    L44:
        int r82 = r5.indexOf("/");     // Catch: Resources.NotFoundException -> L326
        if (r82 == (-1)) goto L47;
        String r83 = r5.substring(r82 + 1);     // Catch: Resources.NotFoundException -> L326
    L48:
        r0.f3883m.put(r83, r152);     // Catch: Resources.NotFoundException -> L326
    L50:
        int r24 = r5.indexOf(47);     // Catch: Resources.NotFoundException -> L326
        if (r24 == (-1)) goto L53;
        r5 = r5.substring(r24 + 1);     // Catch: Resources.NotFoundException -> L326
    L53:
        int r25 = r4.getId();     // Catch: Resources.NotFoundException -> L326
        if (r25 != 0) goto L56;
    L55:
        C2454rb r26 = r10;
    L69:
        r26.f8621h0 = r5;     // Catch: Resources.NotFoundException -> L326
        goto L72
    L56:
        View r42 = (View) r16.get(r25);     // Catch: Resources.NotFoundException -> L326
        if (r42 != null) goto L64;
        r42 = r0.findViewById(r25);     // Catch: Resources.NotFoundException -> L326
        if (r42 == null) goto L64;
        if (r42 == r0) goto L64;
        if (r42.getParent() != r0) goto L64;
        r0.onViewAdded(r42);     // Catch: Resources.NotFoundException -> L326
    L64:
        if (r42 == r0) goto L55;
        if (r42 != null) goto L68;
        r26 = null;
        goto L69
    L68:
        r26 = ((C1452gb) r42.getLayoutParams()).f5137p0;     // Catch: Resources.NotFoundException -> L326
        goto L69
    L47:
        r83 = r5;
    L72:
        r3 = r3 + 1;
        r8 = r162;
        goto L36
    L49:
        r162 = r8;
    L71:
        r162 = r8;
    L73:
        int r163 = r8;
        if (r0.f3882l == (-1)) goto L78;
        int r27 = 0;
    L76:
        if (r27 >= r132) goto L78;
        r0.getChildAt(r27).getId();
        r27 = r27 + 1;
    L78:
        C2411qb r28 = r0.f3880j;
        if (r28 == null) goto L81;
        r28.m4853a(r0);
    L81:
        r10.f8774q0.clear();
        ArrayList r29 = r0.f3872b;
        int r32 = r29.size();
        if (r32 <= 0) goto L115;
        int r43 = 0;
    L84:
        if (r43 >= r32) goto L115;
        AbstractC1364eb r52 = (AbstractC1364eb) r29.get(r43);
        HashMap r153 = r52.f4878g;
        if (r52.isInEditMode() == false) goto L89;
        r52.setIds(r52.f4876e);
    L89:
        AbstractC2592uk r84 = r52.f4875d;
        if (r84 != null) goto L92;
        SparseArray r19 = r16;
        ArrayList r21 = r29;
    L114:
        r43 = r43 + 1;
        r16 = r19;
        r29 = r21;
        r9 = 0;
        goto L84
    L92:
        r84.f8966r0 = r9;
        Arrays.fill(r84.f8965q0, null);
        int r85 = r9;
    L94:
        if (r85 >= r52.f4873b) goto L113;
        int r142 = r52.f4872a[r85];
        View r192 = (View) r16.get(r142);
        if (r192 != null) goto L101;
        String r143 = (String) r153.get(Integer.valueOf(r142));
        int r92 = r52.m2653f(r0, r143);
        if (r92 == 0) goto L101;
        ArrayList r212 = r29;
        r52.f4872a[r85] = r92;
        r153.put(Integer.valueOf(r92), r143);
        r192 = (View) r16.get(r92);
    L100:
        View r210 = r192;
        if (r210 == null) goto L111;
        AbstractC2592uk r93 = r52.f4875d;
        C2454rb r211 = r0.m2124h(r210);
        r93.getClass();
        if (r211 == r93) goto L111;
        if (r211 == null) goto L111;
        int r144 = r93.f8966r0 + 1;
        SparseArray r193 = r16;
        C2454rb[] r17 = r93.f8965q0;
        if (r144 <= r17.length) goto L110;
        r93.f8965q0 = (C2454rb[]) Arrays.copyOf(r17, r17.length * 2);
    L110:
        C2454rb[] r18 = r93.f8965q0;
        int r213 = r93.f8966r0;
        r18[r213] = r211;
        r93.f8966r0 = r213 + 1;
    L112:
        r85 = r85 + 1;
        r16 = r193;
        r29 = r212;
    L111:
        r193 = r16;
    L101:
        r212 = r29;
        goto L100
    L113:
        r19 = r16;
        r21 = r29;
        r52.f4875d.mo809S();
    L115:
        int r182 = 2;
        int r110 = 0;
    L116:
        if (r110 >= r132) goto L118;
        r0.getChildAt(r110);
        r110 = r110 + 1;
        goto L116
    L118:
        SparseArray r33 = r0.f3884n;
        r33.clear();
        r33.put(0, r10);
        r33.put(r0.getId(), r10);
        int r111 = 0;
    L119:
        if (r111 >= r132) goto L121;
        View r214 = r0.getChildAt(r111);
        r33.put(r214.getId(), r0.m2124h(r214));
        r111 = r111 + 1;
        goto L119
    L121:
        int r86 = 0;
    L122:
        if (r86 >= r132) goto L317;
        View r112 = r0.getChildAt(r86);
        C2454rb r215 = r0.m2124h(r112);
        if (r215 != null) goto L126;
    L125:
        int r172 = r86;
        boolean r292 = r11;
        int r44 = r182;
    L315:
        r86 = r172 + 1;
        r182 = r44;
        r11 = r292;
        goto L122
    L126:
        C1452gb r45 = (C1452gb) r112.getLayoutParams();
        r10.f8774q0.add(r215);
        C2454rb r53 = r215.f8599T;
        if (r53 == null) goto L129;
        ((C2497sb) r53).f8774q0.remove(r215);
        r215.mo4914C();
    L129:
        r215.f8599T = r10;
        r45.m2781a();
        r215.f8619g0 = r112.getVisibility();
        r215.f8617f0 = r112;
        if ((r112 instanceof AbstractC1364eb) == false) goto L133;
        ((AbstractC1364eb) r112).mo2120h(r215, r10.f8779v0);
    L133:
        if (r45.f5113d0 == false) goto L146;
        C2150kk r216 = (C2150kk) r215;
        int r113 = r45.f5131m0;
        int r54 = r45.f5133n0;
        float r46 = r45.f5135o0;
        if (r46 == (-1.0f)) goto L138;
        if (r46 <= (-1.0f)) goto L125;
        r216.f7518q0 = r46;
        byte r47 = -1;
        r216.f7519r0 = -1;
        r216.f7520s0 = -1;
    L142:
        r172 = r86;
        r292 = r11;
        r44 = r182;
        goto L315
    L138:
        r47 = -1;
        if (r113 == (-1)) goto L143;
        if (r113 <= (-1)) goto L142;
        r216.f7518q0 = -1.0f;
        r216.f7519r0 = r113;
        r216.f7520s0 = -1;
        goto L142
    L143:
        if (r54 == (-1)) goto L142;
        if (r54 <= (-1)) goto L142;
        r216.f7518q0 = -1.0f;
        r216.f7519r0 = -1;
        r216.f7520s0 = r54;
        goto L125
    L146:
        int r114 = r45.f5117f0;
        int r55 = r45.f5119g0;
        int r94 = r45.f5121h0;
        int r145 = r45.f5123i0;
        int r154 = r45.f5125j0;
        int r02 = r45.f5127k0;
        r172 = r86;
        float r87 = r45.f5129l0;
        int r03 = r45.f5136p;
        r292 = r11;
        if (r03 == (-1)) goto L152;
        C2454rb r262 = (C2454rb) r33.get(r03);
        if (r262 == null) goto L151;
        float r04 = r45.f5139r;
        r215.m4942v(7, 7, r45.f5138q, 0, r262);
        r215.f8583D = r04;
    L151:
        r0 = this;
        C2454rb r115 = r215;
        C1452gb r217 = r45;
        int r146 = 4;
        int r95 = 2;
    L215:
        if (r122 == false) goto L222;
        int r48 = r217.f5099T;
        if (r48 == (-1)) goto L219;
    L220:
        int r88 = r217.f5100U;
        r115.f8604Y = r48;
        r115.f8605Z = r88;
        goto L222
    L219:
        if (r217.f5100U != (-1)) goto L220;
    L222:
        if (r217.f5107a0 == false) goto L224;
        r115.m4922M(r163);
        r115.m4924O(((ViewGroup.MarginLayoutParams) r217).width);
        if (((ViewGroup.MarginLayoutParams) r217).width != (-2)) goto L235;
        r115.m4922M(r182);
    L235:
        if (r217.f5109b0 == true) goto L245;
        int r155 = -1;
        if (((ViewGroup.MarginLayoutParams) r217).height == (-1)) goto L239;
        r115.m4923N(3);
        r115.m4921L(0);
    L248:
        String r49 = r217.f5086G;
        if (r49 == null) goto L291;
        if (r49.length() == 0) goto L291;
        int r56 = r49.length();
        int r96 = r49.indexOf(44);
        if (r96 > 0) goto L256;
    L265:
        int r116 = r155;
        int r97 = 0;
    L266:
        int r147 = r49.indexOf(58);
        if (r147 >= 0) goto L269;
    L283:
        String r410 = r49.substring(r97);
        if (r410.length() <= 0) goto L287;
        float r411 = Float.parseFloat(r410);     // Catch: NumberFormatException -> L327
    L289:
        if (r411 <= 0.0f) goto L292;
        r115.f8602W = r411;
        r115.f8603X = r116;
    L292:
        float r412 = r217.f5087H;
        float[] r57 = r115.f8627k0;
        r57[0] = r412;
        r163 = 1;
        r57[1] = r217.f5088I;
        r115.f8623i0 = r217.f5089J;
        r115.f8625j0 = r217.f5090K;
        int r413 = r217.f5105Z;
        if (r413 < 0) goto L296;
        if (r413 > 3) goto L296;
        r115.f8638q = r413;
    L296:
        int r414 = r217.f5091L;
        int r58 = r217.f5093N;
        int r89 = r217.f5095P;
        float r98 = r217.f5097R;
        r115.f8639r = r414;
        r115.f8642u = r58;
        if (r89 != Integer.MAX_VALUE) goto L299;
        r89 = 0;
    L299:
        r115.f8643v = r89;
        r115.f8644w = r98;
        if (r98 > 0.0f) goto L302;
    L305:
        int r415 = r217.f5092M;
        int r810 = r217.f5094O;
        int r99 = r217.f5096Q;
        float r218 = r217.f5098S;
        r115.f8640s = r415;
        r115.f8645x = r810;
        if (r99 != Integer.MAX_VALUE) goto L308;
        r99 = 0;
    L308:
        r115.f8646y = r99;
        r115.f8647z = r218;
        if (r218 > 0.0f) goto L311;
    L314:
        r44 = 2;
        goto L315
    L311:
        if (r218 >= 1.0f) goto L314;
        if (r415 != 0) goto L314;
        r44 = 2;
        r115.f8640s = 2;
        goto L315
    L302:
        if (r98 >= 1.0f) goto L305;
        if (r414 != 0) goto L305;
        r115.f8639r = 2;
    L287:
        r411 = 0.0f;
        goto L289
    L269:
        if (r147 >= (r56 - 1)) goto L283;
        String r59 = r49.substring(r97, r147);
        String r416 = r49.substring(r147 + 1);
        if (r59.length() <= 0) goto L287;
        if (r416.length() <= 0) goto L287;
        float r510 = Float.parseFloat(r59);     // Catch: NumberFormatException -> L327
        float r417 = Float.parseFloat(r416);     // Catch: NumberFormatException -> L327
        if (r510 <= 0.0f) goto L287;
        if (r417 <= 0.0f) goto L287;
        if (r116 != 1) goto L281;
        r411 = Math.abs(r417 / r510);     // Catch: NumberFormatException -> L327
        goto L289
    L281:
        r411 = Math.abs(r510 / r417);     // Catch: NumberFormatException -> L327
        goto L289
    L256:
        if (r96 >= (r56 - 1)) goto L265;
        String r148 = r49.substring(0, r96);
        if (r148.equalsIgnoreCase("W") == false) goto L261;
        r116 = 0;
    L264:
        r97 = r96 + 1;
        goto L266
    L261:
        if (r148.equalsIgnoreCase("H") == false) goto L263;
        r116 = 1;
        goto L264
    L263:
        r116 = r155;
    L291:
        r115.f8602W = 0.0f;
        goto L292
    L239:
        if (r217.f5103X == false) goto L242;
        r115.m4923N(3);
    L243:
        r115.mo4340i(3).f4271g = ((ViewGroup.MarginLayoutParams) r217).topMargin;
        r115.mo4340i(5).f4271g = ((ViewGroup.MarginLayoutParams) r217).bottomMargin;
        goto L248
    L242:
        r115.m4923N(4);
        goto L243
    L245:
        r155 = -1;
        r115.m4923N(1);
        r115.m4921L(((ViewGroup.MarginLayoutParams) r217).height);
        if (((ViewGroup.MarginLayoutParams) r217).height != (-2)) goto L248;
        r115.m4923N(2);
        goto L248
    L224:
        if (((ViewGroup.MarginLayoutParams) r217).width == (-1)) goto L226;
        r115.m4922M(3);
        r115.m4924O(0);
        goto L235
    L226:
        if (r217.f5102W == false) goto L228;
        r115.m4922M(3);
    L229:
        r115.mo4340i(r95).f4271g = ((ViewGroup.MarginLayoutParams) r217).leftMargin;
        r115.mo4340i(r146).f4271g = ((ViewGroup.MarginLayoutParams) r217).rightMargin;
        goto L235
    L228:
        r115.m4922M(4);
        goto L229
    L152:
        if (r114 == (-1)) goto L158;
        C2454rb r263 = (C2454rb) r33.get(r114);
        if (r263 == null) goto L156;
        C2454rb r219 = r215;
        int r222 = 2;
        r219.m4942v(2, 2, ((ViewGroup.MarginLayoutParams) r45).leftMargin, r154, r263);
    L157:
        int r232 = r222;
        int r223 = 4;
    L163:
        if (r94 == (-1)) goto L169;
        C2454rb r264 = (C2454rb) r33.get(r94);
        if (r264 == null) goto L167;
        r219.m4942v(r223, r232, ((ViewGroup.MarginLayoutParams) r45).rightMargin, r02, r264);
    L167:
        r95 = r232;
    L168:
        r146 = r223;
        int r05 = r45.f5122i;
        if (r05 == (-1)) goto L181;
        C2454rb r265 = (C2454rb) r33.get(r05);
        if (r265 == null) goto L179;
        int r224 = 3;
        r219.m4942v(3, 3, ((ViewGroup.MarginLayoutParams) r45).topMargin, r45.f5145x, r265);
    L180:
        int r511 = r224;
        int r225 = 5;
        int r117 = -1;
    L187:
        int r06 = r45.f5126k;
        if (r06 == r117) goto L194;
        C2454rb r266 = (C2454rb) r33.get(r06);
        if (r266 == null) goto L192;
        int r233 = r511;
        r219.m4942v(r225, r233, ((ViewGroup.MarginLayoutParams) r45).bottomMargin, r45.f5147z, r266);
        int r156 = r233;
    L193:
        r217 = r45;
        int r418 = r217.f5130m;
        if (r418 == (-1)) goto L203;
        r0 = this;
        r115 = r219;
        r0.m2128l(r115, r217, r33, r418, 6);
    L210:
        if (r87 < 0.0f) goto L212;
        r115.f8613d0 = r87;
    L212:
        float r419 = r217.f5085F;
        if (r419 < 0.0f) goto L215;
        r115.f8615e0 = r419;
        goto L215
    L203:
        int r420 = r217.f5132n;
        if (r420 == (-1)) goto L206;
        r0 = this;
        r115 = r219;
        r0.m2128l(r115, r217, r33, r420, r156);
        goto L210
    L206:
        int r421 = r217.f5134o;
        r0 = this;
        r115 = r219;
        int r512 = r225;
        if (r421 == (-1)) goto L210;
        r0.m2128l(r115, r217, r33, r421, r512);
        goto L210
    L192:
        r156 = r511;
        goto L193
    L194:
        r156 = r511;
        int r07 = r45.f5128l;
        if (r07 == r117) goto L193;
        C2454rb r267 = (C2454rb) r33.get(r07);
        if (r267 == null) goto L193;
        r219.m4942v(r225, r225, ((ViewGroup.MarginLayoutParams) r45).bottomMargin, r45.f5147z, r267);
        goto L193
    L179:
        r224 = 3;
        goto L180
    L181:
        int r08 = r45.f5124j;
        r117 = -1;
        if (r08 == (-1)) goto L186;
        C2454rb r268 = (C2454rb) r33.get(r08);
        if (r268 == null) goto L186;
        r219.m4942v(3, 5, ((ViewGroup.MarginLayoutParams) r45).topMargin, r45.f5145x, r268);
        r511 = 3;
        r225 = 5;
    L186:
        r511 = 3;
        r225 = 5;
        goto L187
    L169:
        r95 = r232;
        if (r145 == (-1)) goto L168;
        C2454rb r269 = (C2454rb) r33.get(r145);
        if (r269 == null) goto L168;
        r219.m4942v(r223, r223, ((ViewGroup.MarginLayoutParams) r45).rightMargin, r02, r269);
        goto L168
    L156:
        r219 = r215;
        r222 = 2;
        goto L157
    L158:
        r219 = r215;
        r222 = 2;
        if (r55 == (-1)) goto L157;
        C2454rb r2610 = (C2454rb) r33.get(r55);
        if (r2610 == null) goto L157;
        r219.m4942v(2, 4, ((ViewGroup.MarginLayoutParams) r45).leftMargin, r154, r2610);
        r232 = 2;
        r223 = 4;
    L317:
        if (r11 == false) goto L319;
        r10.f8775r0.m5199K(r10);
        goto L319
    L24:
        r11 = false;
    L319:
        r10.f8780w0.getClass();
        r0.m2127k(r10, r0.f3879i, r35, r36);
        int r118 = r10.m4937q();
        int r220 = r10.m4933k();
        boolean r34 = r10.f8766E0;
        boolean r422 = r10.f8767F0;
        C1496hb r513 = r0.f3885o;
        int r811 = r513.f5277e;
        int r119 = View.resolveSizeAndState(r118 + r513.f5276d, r35, 0);
        int r221 = View.resolveSizeAndState(r220 + r811, r36, 0) & 16777215;
        int r120 = Math.min(r0.f3876f, r119 & 16777215);
        int r226 = Math.min(r0.f3877g, r221);
        if (r34 == false) goto L322;
        r120 = r120 | 16777216;
    L322:
        if (r422 == false) goto L324;
        r226 = r226 | 16777216;
    L324:
        r0.setMeasuredDimension(r120, r226);
        return;
    L13:
        if (1 != r0.getLayoutDirection()) goto L15;
        r13 = true;
        goto L16
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View r5) {
        super.onViewAdded(r5);
        C2454rb r0 = m2124h(r5);
        if ((r5 instanceof C2106jk) == false) goto L8;
        if ((r0 instanceof C2150kk) == true) goto L8;
        C1452gb r02 = (C1452gb) r5.getLayoutParams();
        C2150kk r1 = new C2150kk();
        r02.f5137p0 = r1;
        r02.f5113d0 = true;
        r1.m4338S(r02.f5101V);
    L8:
        if ((r5 instanceof AbstractC1364eb) == false) goto L12;
        AbstractC1364eb r03 = (AbstractC1364eb) r5;
        r03.m2654i();
        ((C1452gb) r5.getLayoutParams()).f5115e0 = true;
        ArrayList r12 = this.f3872b;
        if (r12.contains(r03) == true) goto L12;
        r12.add(r03);
    L12:
        this.f3871a.put(r5.getId(), r5);
        this.f3878h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View r3) {
        super.onViewRemoved(r3);
        this.f3871a.remove(r3.getId());
        C2454rb r0 = m2124h(r3);
        this.f3873c.f8774q0.remove(r0);
        r0.mo4914C();
        this.f3872b.remove(r3);
        this.f3878h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3878h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C2411qb r1) {
        this.f3880j = r1;
    }

    @Override // android.view.View
    public void setId(int r3) {
        int r0 = getId();
        SparseArray r1 = this.f3871a;
        r1.remove(r0);
        super.setId(r3);
        r1.put(getId(), this);
    }

    public void setMaxHeight(int r2) {
        if (r2 != this.f3877g) goto L5;
        return;
    L5:
        this.f3877g = r2;
        requestLayout();
    }

    public void setMaxWidth(int r2) {
        if (r2 != this.f3876f) goto L5;
        return;
    L5:
        this.f3876f = r2;
        requestLayout();
    }

    public void setMinHeight(int r2) {
        if (r2 != this.f3875e) goto L5;
        return;
    L5:
        this.f3875e = r2;
        requestLayout();
    }

    public void setMinWidth(int r2) {
        if (r2 != this.f3874d) goto L5;
        return;
    L5:
        this.f3874d = r2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2540tb r1) {
        C0649P3 r12 = this.f3881k;
        if (r12 == null) goto L6;
        r12.getClass();
        return;
    }

    public void setOptimizationLevel(int r2) {
        this.f3879i = r2;
        C2497sb r0 = this.f3873c;
        r0.f8765D0 = r2;
        C2244mo.f7925q = r0.m4984W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4);
        this.f3871a = new SparseArray();
        this.f3872b = new ArrayList(4);
        this.f3873c = new C2497sb();
        this.f3874d = 0;
        this.f3875e = 0;
        this.f3876f = Integer.MAX_VALUE;
        this.f3877g = Integer.MAX_VALUE;
        this.f3878h = true;
        this.f3879i = 257;
        this.f3880j = null;
        this.f3881k = null;
        this.f3882l = -1;
        this.f3883m = new HashMap();
        this.f3884n = new SparseArray();
        this.f3885o = new C1496hb(this, this);
        m2125i(r3, r4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r9) {
        C1452gb r0 = new C1452gb(r9);
        r0.f5106a = -1;
        r0.f5108b = -1;
        r0.f5110c = -1.0f;
        r0.f5112d = true;
        r0.f5114e = -1;
        r0.f5116f = -1;
        r0.f5118g = -1;
        r0.f5120h = -1;
        r0.f5122i = -1;
        r0.f5124j = -1;
        r0.f5126k = -1;
        r0.f5128l = -1;
        r0.f5130m = -1;
        r0.f5132n = -1;
        r0.f5134o = -1;
        r0.f5136p = -1;
        r0.f5138q = 0;
        r0.f5139r = 0.0f;
        r0.f5140s = -1;
        r0.f5141t = -1;
        r0.f5142u = -1;
        r0.f5143v = -1;
        r0.f5144w = Integer.MIN_VALUE;
        r0.f5145x = Integer.MIN_VALUE;
        r0.f5146y = Integer.MIN_VALUE;
        r0.f5147z = Integer.MIN_VALUE;
        r0.f5080A = Integer.MIN_VALUE;
        r0.f5081B = Integer.MIN_VALUE;
        r0.f5082C = Integer.MIN_VALUE;
        r0.f5083D = 0;
        r0.f5084E = 0.5f;
        r0.f5085F = 0.5f;
        r0.f5086G = null;
        r0.f5087H = -1.0f;
        r0.f5088I = -1.0f;
        r0.f5089J = 0;
        r0.f5090K = 0;
        r0.f5091L = 0;
        r0.f5092M = 0;
        r0.f5093N = 0;
        r0.f5094O = 0;
        r0.f5095P = 0;
        r0.f5096Q = 0;
        r0.f5097R = 1.0f;
        r0.f5098S = 1.0f;
        r0.f5099T = -1;
        r0.f5100U = -1;
        r0.f5101V = -1;
        r0.f5102W = false;
        r0.f5103X = false;
        r0.f5104Y = null;
        r0.f5105Z = 0;
        r0.f5107a0 = true;
        r0.f5109b0 = true;
        r0.f5111c0 = false;
        r0.f5113d0 = false;
        r0.f5115e0 = false;
        r0.f5117f0 = -1;
        r0.f5119g0 = -1;
        r0.f5121h0 = -1;
        r0.f5123i0 = -1;
        r0.f5125j0 = Integer.MIN_VALUE;
        r0.f5127k0 = Integer.MIN_VALUE;
        r0.f5129l0 = 0.5f;
        r0.f5137p0 = new C2454rb();
        if ((r9 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        ViewGroup.MarginLayoutParams r1 = (ViewGroup.MarginLayoutParams) r9;
        ((ViewGroup.MarginLayoutParams) r0).leftMargin = r1.leftMargin;
        ((ViewGroup.MarginLayoutParams) r0).rightMargin = r1.rightMargin;
        ((ViewGroup.MarginLayoutParams) r0).topMargin = r1.topMargin;
        ((ViewGroup.MarginLayoutParams) r0).bottomMargin = r1.bottomMargin;
        r0.setMarginStart(r1.getMarginStart());
        r0.setMarginEnd(r1.getMarginEnd());
    L6:
        if ((r9 instanceof C1452gb) == true) goto L8;
        return r0;
    L8:
        C1452gb r92 = (C1452gb) r9;
        r0.f5106a = r92.f5106a;
        r0.f5108b = r92.f5108b;
        r0.f5110c = r92.f5110c;
        r0.f5112d = r92.f5112d;
        r0.f5114e = r92.f5114e;
        r0.f5116f = r92.f5116f;
        r0.f5118g = r92.f5118g;
        r0.f5120h = r92.f5120h;
        r0.f5122i = r92.f5122i;
        r0.f5124j = r92.f5124j;
        r0.f5126k = r92.f5126k;
        r0.f5128l = r92.f5128l;
        r0.f5130m = r92.f5130m;
        r0.f5132n = r92.f5132n;
        r0.f5134o = r92.f5134o;
        r0.f5136p = r92.f5136p;
        r0.f5138q = r92.f5138q;
        r0.f5139r = r92.f5139r;
        r0.f5140s = r92.f5140s;
        r0.f5141t = r92.f5141t;
        r0.f5142u = r92.f5142u;
        r0.f5143v = r92.f5143v;
        r0.f5144w = r92.f5144w;
        r0.f5145x = r92.f5145x;
        r0.f5146y = r92.f5146y;
        r0.f5147z = r92.f5147z;
        r0.f5080A = r92.f5080A;
        r0.f5081B = r92.f5081B;
        r0.f5082C = r92.f5082C;
        r0.f5083D = r92.f5083D;
        r0.f5084E = r92.f5084E;
        r0.f5085F = r92.f5085F;
        r0.f5086G = r92.f5086G;
        r0.f5087H = r92.f5087H;
        r0.f5088I = r92.f5088I;
        r0.f5089J = r92.f5089J;
        r0.f5090K = r92.f5090K;
        r0.f5102W = r92.f5102W;
        r0.f5103X = r92.f5103X;
        r0.f5091L = r92.f5091L;
        r0.f5092M = r92.f5092M;
        r0.f5093N = r92.f5093N;
        r0.f5095P = r92.f5095P;
        r0.f5094O = r92.f5094O;
        r0.f5096Q = r92.f5096Q;
        r0.f5097R = r92.f5097R;
        r0.f5098S = r92.f5098S;
        r0.f5099T = r92.f5099T;
        r0.f5100U = r92.f5100U;
        r0.f5101V = r92.f5101V;
        r0.f5107a0 = r92.f5107a0;
        r0.f5109b0 = r92.f5109b0;
        r0.f5111c0 = r92.f5111c0;
        r0.f5113d0 = r92.f5113d0;
        r0.f5117f0 = r92.f5117f0;
        r0.f5119g0 = r92.f5119g0;
        r0.f5121h0 = r92.f5121h0;
        r0.f5123i0 = r92.f5123i0;
        r0.f5125j0 = r92.f5125j0;
        r0.f5127k0 = r92.f5127k0;
        r0.f5129l0 = r92.f5129l0;
        r0.f5104Y = r92.f5104Y;
        r0.f5105Z = r92.f5105Z;
        r0.f5137p0 = r92.f5137p0;
        return r0;
    }
}
