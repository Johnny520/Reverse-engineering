package p000;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import io.github.cherrywechat.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: zi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2805zi {

    /* JADX INFO: renamed from: A */
    public C1199b1 f9478A;

    /* JADX INFO: renamed from: B */
    public C1199b1 f9479B;

    /* JADX INFO: renamed from: C */
    public C1199b1 f9480C;

    /* JADX INFO: renamed from: D */
    public ArrayDeque f9481D;

    /* JADX INFO: renamed from: E */
    public boolean f9482E;

    /* JADX INFO: renamed from: F */
    public boolean f9483F;

    /* JADX INFO: renamed from: G */
    public boolean f9484G;

    /* JADX INFO: renamed from: H */
    public boolean f9485H;

    /* JADX INFO: renamed from: I */
    public boolean f9486I;

    /* JADX INFO: renamed from: J */
    public ArrayList f9487J;

    /* JADX INFO: renamed from: K */
    public ArrayList f9488K;

    /* JADX INFO: renamed from: L */
    public ArrayList f9489L;

    /* JADX INFO: renamed from: M */
    public C0154Di f9490M;

    /* JADX INFO: renamed from: N */
    public final RunnableC0431K0 f9491N;

    /* JADX INFO: renamed from: a */
    public final ArrayList f9492a;

    /* JADX INFO: renamed from: b */
    public boolean f9493b;

    /* JADX INFO: renamed from: c */
    public final C2428qs f9494c;

    /* JADX INFO: renamed from: d */
    public ArrayList f9495d;

    /* JADX INFO: renamed from: e */
    public ArrayList f9496e;

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C2281ni f9497f;

    /* JADX INFO: renamed from: g */
    public C2335ot f9498g;

    /* JADX INFO: renamed from: h */
    public final C2461ri f9499h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f9500i;

    /* JADX INFO: renamed from: j */
    public final Map f9501j;

    /* JADX INFO: renamed from: k */
    public final Map f9502k;

    /* JADX INFO: renamed from: l */
    public final Map f9503l;

    /* JADX INFO: renamed from: m */
    public final C0649P3 f9504m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f9505n;

    /* JADX INFO: renamed from: o */
    public final C2375pi f9506o;

    /* JADX INFO: renamed from: p */
    public final C2375pi f9507p;

    /* JADX INFO: renamed from: q */
    public final C2375pi f9508q;

    /* JADX INFO: renamed from: r */
    public final C2375pi f9509r;

    /* JADX INFO: renamed from: s */
    public final C2504si f9510s;

    /* JADX INFO: renamed from: t */
    public int f9511t;

    /* JADX INFO: renamed from: u */
    public C2104ji f9512u;

    /* JADX INFO: renamed from: v */
    public AbstractC0828TB f9513v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC1503hi f9514w;

    /* JADX INFO: renamed from: x */
    public AbstractComponentCallbacksC1503hi f9515x;

    /* JADX INFO: renamed from: y */
    public final C2547ti f9516y;

    /* JADX INFO: renamed from: z */
    public final C0668Pg f9517z;

    /* JADX WARN: Type inference failed for: r0v13, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pi] */
    public AbstractC2805zi() {
        this.f9492a = new ArrayList();
        this.f9494c = new C2428qs(4);
        this.f9497f = new LayoutInflaterFactory2C2281ni(this);
        this.f9499h = new C2461ri(this);
        this.f9500i = new AtomicInteger();
        this.f9501j = Collections.synchronizedMap(new HashMap());
        this.f9502k = Collections.synchronizedMap(new HashMap());
        this.f9503l = Collections.synchronizedMap(new HashMap());
        this.f9504m = new C0649P3(this);
        this.f9505n = new CopyOnWriteArrayList();
        final int r1 = 0;
        this.f9506o = new C2375pi(this, r1);
        final int r12 = 1;
        this.f9507p = new C2375pi(this, r12);
        final int r13 = 2;
        this.f9508q = new C2375pi(this, r13);
        final int r14 = 3;
        this.f9509r = new C2375pi(this, r14);
        this.f9510s = new C2504si(this);
        this.f9511t = -1;
        this.f9516y = new C2547ti(this);
        this.f9517z = new C0668Pg(9);
        this.f9481D = new ArrayDeque();
        this.f9491N = new RunnableC0431K0(8, this);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m5374G(int r1) {
        if (Log.isLoggable("FragmentManager", r1) == false) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m5375H(AbstractComponentCallbacksC1503hi r3) {
        r3.getClass();
        Iterator r32 = r3.f5329t.f9494c.m4880r().iterator();
        boolean r1 = false;
    L4:
        if (r32.hasNext() == false) goto L11;
        AbstractComponentCallbacksC1503hi r2 = (AbstractComponentCallbacksC1503hi) r32.next();
        if (r2 == null) goto L8;
        r1 = m5375H(r2);
    L8:
        if (r1 == false) goto L4;
        return true;
    L11:
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m5376J(AbstractComponentCallbacksC1503hi r1) {
        if (r1 != null) goto L5;
        return true;
    L5:
        if (r1.f5293B == true) goto L7;
        return false;
    L7:
        if (r1.f5327r != null) goto L9;
        return true;
    L9:
        if (m5376J(r1.f5330u) == false) goto L16;
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m5377K(AbstractComponentCallbacksC1503hi r2) {
        if (r2 == null) goto L12;
        AbstractC2805zi r0 = r2.f5327r;
        if (r2.equals(r0.f9515x) == true) goto L7;
        return false;
    L7:
        if (m5377K(r0.f9514w) == false) goto L13;
        return true;
    L13:
        return false;
    L12:
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final void m5378A(ArrayList r25, ArrayList r26, int r27, int r28) {
        C2428qs r4 = this.f9494c;
        boolean r6 = ((C1483h5) r25.get(r27)).f5250o;
        ArrayList r7 = this.f9489L;
        if (r7 != null) goto L5;
        this.f9489L = new ArrayList();
    L6:
        this.f9489L.addAll(r4.m4882t());
        AbstractComponentCallbacksC1503hi r72 = this.f9515x;
        int r9 = r27;
        boolean r10 = false;
    L7:
        int r13 = 1;
        if (r9 >= r28) goto L74;
        C1483h5 r14 = (C1483h5) r25.get(r9);
        if (((Boolean) r26.get(r9)).booleanValue() == true) goto L54;
        ArrayList r15 = this.f9489L;
        ArrayList r8 = r14.f5236a;
        int r12 = 0;
    L13:
        if (r12 >= r8.size()) goto L53;
        C0455Ki r11 = (C0455Ki) r8.get(r12);
        int r5 = r11.f1489a;
        if (r5 != r13) goto L17;
        boolean r19 = r6;
        int r62 = r13;
    L30:
        int r22 = r9;
        boolean r21 = r10;
        r15.add(r11.f1490b);
    L52:
        r12 = r12 + r62;
        r13 = r62;
        r6 = r19;
        r10 = r21;
        r9 = r22;
        goto L13
    L17:
        if (r5 != 2) goto L19;
        r19 = r6;
        AbstractComponentCallbacksC1503hi r52 = r11.f1490b;
        int r63 = r52.f5332w;
        int r132 = r15.size() - 1;
        boolean r20 = false;
    L35:
        if (r132 < 0) goto L46;
        int r222 = r9;
        AbstractComponentCallbacksC1503hi r92 = (AbstractComponentCallbacksC1503hi) r15.get(r132);
        boolean r212 = r10;
        if (r92.f5332w != r63) goto L44;
        if (r92 != r52) goto L40;
        int r18 = r63;
        r20 = true;
    L45:
        r132 = r132 - 1;
        r63 = r18;
        r10 = r212;
        r9 = r222;
        goto L35
    L40:
        if (r92 != r72) goto L42;
        r18 = r63;
        int r102 = 0;
        r8.add(r12, new C0455Ki(9, r92, 0));
        r12 = r12 + 1;
        r72 = null;
    L43:
        C0455Ki r64 = new C0455Ki(3, r92, r102);
        r64.f1492d = r11.f1492d;
        r64.f1494f = r11.f1494f;
        r64.f1493e = r11.f1493e;
        r64.f1495g = r11.f1495g;
        r8.add(r12, r64);
        r15.remove(r92);
        r12 = r12 + 1;
        r72 = r72;
        goto L45
    L42:
        r18 = r63;
        r102 = 0;
        goto L43
    L44:
        r18 = r63;
        goto L45
    L46:
        r22 = r9;
        r21 = r10;
        r62 = 1;
        if (r20 == false) goto L49;
        r8.remove(r12);
        r12 = r12 - 1;
        goto L52
    L49:
        r11.f1489a = 1;
        r11.f1491c = true;
        r15.add(r52);
        goto L52
    L19:
        if (r5 != 3) goto L21;
    L31:
        r19 = r6;
        r15.remove(r11.f1490b);
        AbstractComponentCallbacksC1503hi r53 = r11.f1490b;
        if (r53 == r72) goto L33;
    L28:
        r22 = r9;
        r21 = r10;
        r62 = 1;
        goto L52
    L33:
        r8.add(r12, new C0455Ki(9, r53));
        r12 = r12 + 1;
        r22 = r9;
        r21 = r10;
        r62 = 1;
        r72 = null;
        goto L52
    L21:
        if (r5 == 6) goto L31;
        if (r5 != 7) goto L25;
        r19 = r6;
        r62 = 1;
        goto L30
    L25:
        if (r5 == 8) goto L27;
        r19 = r6;
        goto L28
    L27:
        r19 = r6;
        r8.add(r12, new C0455Ki(9, r72, 0));
        r11.f1491c = true;
        r12 = r12 + 1;
        r72 = r11.f1490b;
        goto L28
    L53:
        boolean r192 = r6;
        int r223 = r9;
        boolean r213 = r10;
    L67:
        if (r213 == false) goto L69;
    L72:
        r10 = true;
    L73:
        r9 = r223 + 1;
        r6 = r192;
        goto L7
    L69:
        if (r14.f5242g == true) goto L72;
        r10 = false;
        goto L73
    L54:
        r192 = r6;
        r223 = r9;
        r213 = r10;
        int r65 = 1;
        ArrayList r54 = this.f9489L;
        ArrayList r82 = r14.f5236a;
        int r93 = r82.size() - 1;
    L55:
        if (r93 < 0) goto L67;
        C0455Ki r103 = (C0455Ki) r82.get(r93);
        int r112 = r103.f1489a;
        if (r112 == r65) goto L65;
        if (r112 == 3) goto L64;
        switch(r112) {
            case 6: goto L64;
            case 7: goto L65;
            case 8: goto L63;
            case 9: goto L62;
            case 10: goto L61;
            default: goto L66;
        };
    L61:
        r103.f1497i = r103.f1496h;
        goto L66
    L62:
        r72 = r103.f1490b;
        goto L66
    L63:
        r72 = null;
    L66:
        r93 = r93 - 1;
        r65 = 1;
    L64:
        r54.add(r103.f1490b);
    L65:
        r54.remove(r103.f1490b);
        goto L66
    L74:
        boolean r193 = r6;
        this.f9489L.clear();
        if (r193 == false) goto L77;
    L89:
        int r55 = r27;
    L91:
        if (r55 >= r28) goto L186;
        C1483h5 r73 = (C1483h5) r25.get(r55);
        if (((Boolean) r26.get(r55)).booleanValue() == false) goto L145;
        r73.m2840c(-1);
        AbstractC2805zi r66 = r73.f5251p;
        ArrayList r83 = r73.f5236a;
        boolean r104 = true;
        int r94 = r83.size() - 1;
    L95:
        if (r94 < 0) goto L185;
        C0455Ki r113 = (C0455Ki) r83.get(r94);
        AbstractComponentCallbacksC1503hi r122 = r113.f1490b;
        if (r122 == null) goto L120;
        if (r122.f5299H == null) goto L102;
        r122.m2868b().f4997a = r104;
    L102:
        int r105 = r73.f5241f;
        int r133 = 8194;
        int r142 = 4097;
        if (r105 == 4097) goto L114;
        if (r105 == 8194) goto L111;
        r133 = 4100;
        r142 = 8197;
        if (r105 == 8197) goto L114;
        if (r105 == 4099) goto L112;
        if (r105 == 4100) goto L111;
        r133 = 0;
        goto L114
    L112:
        r133 = 4099;
    L111:
        r133 = r142;
    L114:
        if (r122.f5299H != null) goto L117;
        if (r133 != 0) goto L117;
    L118:
        r122.m2868b();
        r122.f5299H.getClass();
    L117:
        r122.m2868b();
        r122.f5299H.f5002f = r133;
    L120:
        switch(r113.f1489a) {
            case 1: goto L142;
            case 2: goto L122;
            case 3: goto L141;
            case 4: goto L135;
            case 5: goto L129;
            case 6: goto L128;
            case 7: goto L127;
            case 8: goto L126;
            case 9: goto L125;
            case 10: goto L123;
            default: goto L122;
        };
    L123:
        r66.m5397X(r122, r113.f1496h);
    L124:
        r104 = true;
    L143:
        r94 = r94 - 1;
        goto L95
    L125:
        r66.m5398Y(r122);
        goto L124
    L126:
        r66.m5398Y(null);
        goto L124
    L127:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r66.m5396W(r122, true);
        r66.m5409g(r122);
        goto L124
    L128:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r66.m5404c(r122);
        goto L124
    L129:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r66.m5396W(r122, true);
        if (m5374G(2) == false) goto L133;
        Objects.toString(r122);
    L133:
        if (r122.f5334y == true) goto L124;
        r122.f5334y = true;
        r122.f5300I = !r122.f5300I;
        r66.m5399Z(r122);
        goto L124
    L135:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r66.getClass();
        if (m5374G(2) == false) goto L139;
        Objects.toString(r122);
    L139:
        if (r122.f5334y == false) goto L124;
        r122.f5334y = false;
        r122.f5300I = !r122.f5300I;
        goto L124
    L141:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r66.m5400a(r122);
        goto L124
    L142:
        r122.m2866A(r113.f1492d, r113.f1493e, r113.f1494f, r113.f1495g);
        r104 = true;
        r66.m5396W(r122, true);
        r66.m5391R(r122);
        goto L143
    L122:
        throw new IllegalArgumentException("Unknown cmd: " + r113.f1489a);
    L185:
        r55 = r55 + 1;
        goto L91
    L145:
        r73.m2840c(1);
        AbstractC2805zi r67 = r73.f5251p;
        ArrayList r84 = r73.f5236a;
        int r95 = r84.size();
        int r134 = 0;
    L146:
        if (r134 >= r95) goto L185;
        C0455Ki r106 = (C0455Ki) r84.get(r134);
        AbstractComponentCallbacksC1503hi r114 = r106.f1490b;
        if (r114 == null) goto L160;
        if (r114.f5299H == null) goto L153;
        r114.m2868b().f4997a = false;
    L153:
        int r123 = r73.f5241f;
        if (r114.f5299H != null) goto L157;
        if (r123 != 0) goto L157;
    L158:
        r114.m2868b();
        r114.f5299H.getClass();
    L157:
        r114.m2868b();
        r114.f5299H.f5002f = r123;
    L160:
        switch(r106.f1489a) {
            case 1: goto L183;
            case 2: goto L162;
            case 3: goto L182;
            case 4: goto L175;
            case 5: goto L169;
            case 6: goto L168;
            case 7: goto L167;
            case 8: goto L166;
            case 9: goto L165;
            case 10: goto L163;
            default: goto L162;
        };
    L163:
        r67.m5397X(r114, r106.f1497i);
    L184:
        r134 = r134 + 1;
        goto L146
    L165:
        r67.m5398Y(null);
        goto L184
    L166:
        r67.m5398Y(r114);
        goto L184
    L167:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.m5396W(r114, false);
        r67.m5404c(r114);
        goto L184
    L168:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.m5409g(r114);
        goto L184
    L169:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.m5396W(r114, false);
        if (m5374G(2) == false) goto L173;
        Objects.toString(r114);
    L173:
        if (r114.f5334y == false) goto L184;
        r114.f5334y = false;
        r114.f5300I = !r114.f5300I;
        goto L184
    L175:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.getClass();
        if (m5374G(2) == false) goto L179;
        Objects.toString(r114);
    L179:
        if (r114.f5334y == true) goto L184;
        r114.f5334y = true;
        r114.f5300I = !r114.f5300I;
        r67.m5399Z(r114);
        goto L184
    L182:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.m5391R(r114);
        goto L184
    L183:
        r114.m2866A(r106.f1492d, r106.f1493e, r106.f1494f, r106.f1495g);
        r67.m5396W(r114, false);
        r67.m5400a(r114);
        goto L184
    L162:
        throw new IllegalArgumentException("Unknown cmd: " + r106.f1489a);
    L186:
        boolean r42 = ((Boolean) r26.get(r28 - 1)).booleanValue();
        int r56 = r27;
    L187:
        if (r56 >= r28) goto L203;
        C1483h5 r74 = (C1483h5) r25.get(r56);
        if (r42 == false) goto L196;
        int r85 = r74.f5236a.size() - 1;
    L191:
        if (r85 < 0) goto L202;
        AbstractComponentCallbacksC1503hi r96 = ((C0455Ki) r74.f5236a.get(r85)).f1490b;
        if (r96 == null) goto L195;
        m5408f(r96).m704k();
    L195:
        r85 = r85 - 1;
    L202:
        r56 = r56 + 1;
        goto L187
    L196:
        Iterator r75 = r74.f5236a.iterator();
    L198:
        if (r75.hasNext() == false) goto L202;
        AbstractComponentCallbacksC1503hi r86 = ((C0455Ki) r75.next()).f1490b;
        if (r86 == null) goto L198;
        m5408f(r86).m704k();
        goto L198
    L203:
        m5386M(this.f9511t, true);
        HashSet r57 = new HashSet();
        int r76 = r27;
    L204:
        if (r76 >= r28) goto L218;
        Iterator r87 = ((C1483h5) r25.get(r76)).f5236a.iterator();
    L207:
        if (r87.hasNext() == false) goto L217;
        AbstractComponentCallbacksC1503hi r97 = ((C0455Ki) r87.next()).f1490b;
        if (r97 == null) goto L207;
        ViewGroup r98 = r97.f5295D;
        if (r98 == null) goto L207;
        m5383F();
        Object r115 = r98.getTag(R.id.special_effects_controller_view_tag);
        if ((r115 instanceof C2276nd) == false) goto L215;
        C2276nd r116 = (C2276nd) r115;
    L216:
        r57.add(r116);
        goto L207
    L215:
        r116 = new C2276nd(r98);
        r98.setTag(R.id.special_effects_controller_view_tag, r116);
        goto L216
    L217:
        r76 = r76 + 1;
        goto L204
    L218:
        Iterator r58 = r57.iterator();
    L220:
        if (r58.hasNext() == false) goto L252;
        C2276nd r77 = (C2276nd) r58.next();
        r77.f8012d = r42;
        ArrayList r88 = r77.f8010b;
        monitor-enter(r88);
        r77.m4609f();     // Catch: Throwable -> L244
        ArrayList r99 = r77.f8010b;     // Catch: Throwable -> L244
        ListIterator r910 = r99.listIterator(r99.size());     // Catch: Throwable -> L244
    L225:
        if (r910.hasPrevious() == false) goto L246;
        Object r107 = r910.previous();     // Catch: Throwable -> L244
        C0557My r117 = (C0557My) r107;     // Catch: Throwable -> L244
        View r124 = r117.f1827c.f5296E;     // Catch: Throwable -> L244
        char r152 = 4;
        if (r124.getAlpha() == 0.0f) goto L229;
    L231:
        int r125 = r124.getVisibility();     // Catch: Throwable -> L244
        if (r125 == 0) goto L239;
        if (r125 != 4) goto L235;
    L241:
        if (r117.f1825a != 2) goto L225;
        if (r152 == 2) goto L225;
    L247:
        C0557My r108 = (C0557My) r107;     // Catch: Throwable -> L244
        r77.f8013e = false;     // Catch: Throwable -> L244
        monitor-exit(r88);
        r77.m4606c();
        goto L220
    L235:
        if (r125 != 8) goto L238;
        r152 = 3;
        goto L241
    L238:
        throw new IllegalArgumentException("Unknown visibility " + r125);     // Catch: Throwable -> L244
    L239:
        r152 = 2;
        goto L241
    L229:
        if (r124.getVisibility() != 0) goto L231;
    L246:
        r107 = null;
    L244:
        th = move-exception;
        throw th;
    L252:
        int r43 = r27;
    L253:
        if (r43 >= r28) goto L260;
        C1483h5 r59 = (C1483h5) r25.get(r43);
        if (((Boolean) r26.get(r43)).booleanValue() == false) goto L259;
        if (r59.f5253r < 0) goto L259;
        r59.f5253r = -1;
    L259:
        r59.getClass();
        r43 = r43 + 1;
        goto L253
    L260:
        return;
    L77:
        if (this.f9511t < 1) goto L89;
        int r510 = r27;
    L79:
        if (r510 >= r28) goto L89;
        Iterator r68 = ((C1483h5) r25.get(r510)).f5236a.iterator();
    L82:
        if (r68.hasNext() == false) goto L88;
        AbstractComponentCallbacksC1503hi r78 = ((C0455Ki) r68.next()).f1490b;
        if (r78 == null) goto L82;
        if (r78.f5327r == null) goto L82;
        r4.m4883u(m5408f(r78));
        goto L82
    L88:
        r510 = r510 + 1;
        goto L79
    L5:
        r7.clear();
        goto L6
    }

    /* JADX INFO: renamed from: B */
    public final AbstractComponentCallbacksC1503hi m5379B(int r6) {
        C2428qs r0 = this.f9494c;
        ArrayList r1 = (ArrayList) r0.f8520a;
        int r2 = r1.size() - 1;
    L3:
        if (r2 < 0) goto L10;
        AbstractComponentCallbacksC1503hi r3 = (AbstractComponentCallbacksC1503hi) r1.get(r2);
        if (r3 == null) goto L9;
        if (r3.f5331v != r6) goto L9;
        return r3;
    L9:
        r2 = r2 - 1;
        goto L3
    L10:
        Iterator r02 = ((HashMap) r0.f8521b).values().iterator();
    L12:
        if (r02.hasNext() == false) goto L18;
        C0326Hi r12 = (C0326Hi) r02.next();
        if (r12 == null) goto L12;
        AbstractComponentCallbacksC1503hi r13 = r12.f1110c;
        if (r13.f5331v != r6) goto L12;
        return r13;
    L18:
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractComponentCallbacksC1503hi m5380C(String r6) {
        C2428qs r0 = this.f9494c;
        ArrayList r1 = (ArrayList) r0.f8520a;
        if (r6 == null) goto L12;
        int r2 = r1.size() - 1;
    L5:
        if (r2 < 0) goto L12;
        AbstractComponentCallbacksC1503hi r3 = (AbstractComponentCallbacksC1503hi) r1.get(r2);
        if (r3 == null) goto L11;
        if (r6.equals(r3.f5333x) == false) goto L11;
        return r3;
    L11:
        r2 = r2 - 1;
    L12:
        if (r6 == null) goto L21;
        Iterator r02 = ((HashMap) r0.f8521b).values().iterator();
    L15:
        if (r02.hasNext() == false) goto L33;
        C0326Hi r12 = (C0326Hi) r02.next();
        if (r12 == null) goto L15;
        AbstractComponentCallbacksC1503hi r13 = r12.f1110c;
        if (r6.equals(r13.f5333x) == false) goto L15;
        return r13;
    L33:
        return null;
    L21:
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final ViewGroup m5381D(AbstractComponentCallbacksC1503hi r2) {
        ViewGroup r0 = r2.f5295D;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (r2.f5332w > 0) goto L9;
        return null;
    L9:
        if (this.f9513v.mo853z() == false) goto L14;
        View r22 = this.f9513v.mo852y(r2.f5332w);
        if ((r22 instanceof ViewGroup) == true) goto L13;
        return null;
    L13:
        return (ViewGroup) r22;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final C2547ti m5382E() {
        AbstractComponentCallbacksC1503hi r0 = this.f9514w;
        if (r0 == null) goto L7;
        return r0.f5327r.m5382E();
    L7:
        return this.f9516y;
    }

    /* JADX INFO: renamed from: F */
    public final C0668Pg m5383F() {
        AbstractComponentCallbacksC1503hi r0 = this.f9514w;
        if (r0 == null) goto L7;
        return r0.f5327r.m5383F();
    L7:
        return this.f9517z;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5384I() {
        AbstractComponentCallbacksC1503hi r0 = this.f9514w;
        if (r0 != null) goto L6;
        return true;
    L6:
        if (r0.m2875i() == true) goto L8;
        return false;
    L8:
        if (this.f9514w.m2872f().m5384I() == false) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m5385L() {
        if (this.f9483F == false) goto L5;
        return true;
    L5:
        if (this.f9484G == true) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m5386M(int r4, boolean r5) {
        if (this.f9512u == null) goto L5;
    L9:
        if (r5 == false) goto L11;
    L13:
        this.f9511t = r4;
        C2428qs r42 = this.f9494c;
        HashMap r52 = (HashMap) r42.f8521b;
        Iterator r0 = ((ArrayList) r42.f8520a).iterator();
    L15:
        if (r0.hasNext() == false) goto L19;
        C0326Hi r1 = (C0326Hi) r52.get(((AbstractComponentCallbacksC1503hi) r0.next()).f5314e);
        if (r1 == null) goto L15;
        r1.m704k();
        goto L15
    L19:
        Iterator r53 = r52.values().iterator();
    L21:
        if (r53.hasNext() == false) goto L29;
        C0326Hi r02 = (C0326Hi) r53.next();
        if (r02 == null) goto L21;
        r02.m704k();
        AbstractComponentCallbacksC1503hi r12 = r02.f1110c;
        if (r12.f5321l == false) goto L21;
        if (r12.m2877k() == true) goto L21;
        r42.m4884v(r02);
        goto L21
    L29:
        m5401a0();
        if (this.f9482E == false) goto L51;
        C2104ji r43 = this.f9512u;
        if (r43 != null) goto L34;
        return;
    L34:
        if (this.f9511t != 7) goto L53;
        r43.f7404p.invalidateMenu();
        this.f9482E = false;
        return;
    L53:
        return;
    L51:
        return;
    L11:
        if (r4 != this.f9511t) goto L13;
        return;
    L5:
        if (r4 == (-1)) goto L9;
        throw new IllegalStateException("No activity");
    }

    /* JADX INFO: renamed from: N */
    public final void m5387N() {
        if (this.f9512u == null) goto L11;
        this.f9483F = false;
        this.f9484G = false;
        this.f9490M.f418i = false;
        Iterator r0 = this.f9494c.m4882t().iterator();
    L7:
        if (r0.hasNext() == false) goto L17;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L7;
        r1.f5329t.m5387N();
        goto L7
    L17:
        return;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m5388O() {
        return m5389P(-1, 0);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5389P(int r4, int r5) {
        m5427y(false);
        m5426x(true);
        AbstractComponentCallbacksC1503hi r1 = this.f9515x;
        if (r1 == null) goto L8;
        if (r4 >= 0) goto L8;
        if (r1.m2869c().m5388O() == false) goto L8;
        return true;
    L8:
        boolean r42 = m5390Q(this.f9487J, this.f9488K, r4, r5);
        if (r42 == false) goto L16;
        this.f9493b = true;
        m5392S(this.f9487J, this.f9488K);     // Catch: Throwable -> L13
        m5406d();
    L13:
        th = move-exception;
        m5406d();
        throw th;
    L16:
        m5405c0();
        m5423u();
        ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
        return r42;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5390Q(ArrayList r6, ArrayList r7, int r8, int r9) {
        if ((r9 & 1) == 0) goto L5;
        boolean r92 = true;
    L6:
        ArrayList r2 = this.f9495d;
        int r3 = -1;
        if (r2 != null) goto L9;
    L37:
        if (r3 >= 0) goto L39;
        return false;
    L39:
        int r82 = this.f9495d.size() - 1;
    L40:
        if (r82 < r3) goto L42;
        r6.add((C1483h5) this.f9495d.remove(r82));
        r7.add(Boolean.TRUE);
        r82 = r82 - 1;
        goto L40
    L42:
        return true;
    L9:
        if (r2.isEmpty() == true) goto L37;
        if (r8 >= 0) goto L15;
        if (r92 == false) goto L14;
        r3 = 0;
        goto L37
    L14:
        r3 = this.f9495d.size() - 1;
        goto L37
    L15:
        int r22 = this.f9495d.size() - 1;
    L16:
        if (r22 < 0) goto L23;
        C1483h5 r4 = (C1483h5) this.f9495d.get(r22);
        if (r8 < 0) goto L22;
        if (r8 == r4.f5253r) goto L23;
    L22:
        r22 = r22 - 1;
    L23:
        if (r22 >= 0) goto L25;
        r3 = r22;
        goto L37
    L25:
        if (r92 == false) goto L34;
        r3 = r22;
    L27:
        if (r3 <= 0) goto L37;
        C1483h5 r93 = (C1483h5) this.f9495d.get(r3 - 1);
        if (r8 < 0) goto L37;
        if (r8 != r93.f5253r) goto L37;
        r3 = r3 - 1;
        goto L27
    L34:
        if (r22 == (this.f9495d.size() - 1)) goto L37;
        r3 = r22 + 1;
        goto L37
    L5:
        r92 = false;
        goto L6
    }

    /* JADX INFO: renamed from: R */
    public final void m5391R(AbstractComponentCallbacksC1503hi r3) {
        if (m5374G(2) == false) goto L5;
        Objects.toString(r3);
    L5:
        boolean r0 = r3.m2877k();
        if (r3.f5335z == false) goto L10;
        if (r0 == false) goto L10;
        return;
    L10:
        C2428qs r02 = this.f9494c;
        ArrayList r1 = (ArrayList) r02.f8520a;
        monitor-enter(r1);
        ((ArrayList) r02.f8520a).remove(r3);     // Catch: Throwable -> L19
        monitor-exit(r1);     // Catch: Throwable -> L19
        r3.f5320k = false;
        if (m5375H(r3) == false) goto L17;
        this.f9482E = true;
    L17:
        r3.f5321l = true;
        m5399Z(r3);
        return;
    L19:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: S */
    public final void m5392S(ArrayList r5, ArrayList r6) {
        if (r5.isEmpty() == false) goto L6;
        return;
    L6:
        if (r5.size() != r6.size()) goto L27;
        int r0 = r5.size();
        int r1 = 0;
        int r2 = 0;
    L8:
        if (r1 >= r0) goto L23;
        if (((C1483h5) r5.get(r1)).f5250o == true) goto L22;
        if (r2 == r1) goto L13;
        m5378A(r5, r6, r2, r1);
    L13:
        r2 = r1 + 1;
        if (((Boolean) r6.get(r1)).booleanValue() == false) goto L21;
    L15:
        if (r2 >= r0) goto L21;
        if (((Boolean) r6.get(r2)).booleanValue() == false) goto L21;
        if (((C1483h5) r5.get(r2)).f5250o == true) goto L21;
        r2 = r2 + 1;
    L21:
        m5378A(r5, r6, r1, r2);
        r1 = r2 - 1;
    L22:
        r1 = r1 + 1;
        goto L8
    L23:
        if (r2 == r0) goto L34;
        m5378A(r5, r6, r2, r0);
        return;
    L34:
        return;
    L27:
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* JADX INFO: renamed from: T */
    public final void m5393T(Bundle r18) {
        Iterator<String> r2 = r18.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        String r3 = r2.next();
        if (r3.startsWith("result_") == false) goto L4;
        Bundle r4 = r18.getBundle(r3);
        if (r4 == null) goto L4;
        r4.setClassLoader(this.f9512u.f7401m.getClassLoader());
        this.f9502k.put(r3.substring(7), r4);
        goto L4
    L10:
        HashMap r22 = new HashMap();
        Iterator<String> r32 = r18.keySet().iterator();
    L12:
        if (r32.hasNext() == false) goto L18;
        String r42 = r32.next();
        if (r42.startsWith("fragment_") == false) goto L12;
        Bundle r5 = r18.getBundle(r42);
        if (r5 == null) goto L12;
        r5.setClassLoader(this.f9512u.f7401m.getClassLoader());
        r22.put(r42.substring(9), r5);
        goto L12
    L18:
        C2428qs r33 = this.f9494c;
        HashMap r43 = (HashMap) r33.f8522c;
        HashMap r52 = (HashMap) r33.f8521b;
        r43.clear();
        r43.putAll(r22);
        C0068Bi r1 = (C0068Bi) r18.getParcelable("state");
        if (r1 != null) goto L21;
        return;
    L21:
        r52.clear();
        Iterator r44 = r1.f162a.iterator();
    L22:
        boolean r6 = r44.hasNext();
        C0649P3 r7 = this.f9504m;
        int r9 = 2;
        if (r6 == false) goto L37;
        Bundle r15 = r33.m4865D(null, (String) r44.next());
        if (r15 == null) goto L22;
        C0283Gi r62 = (C0283Gi) r15.getParcelable("state");
        C0154Di r8 = this.f9490M;
        AbstractComponentCallbacksC1503hi r63 = (AbstractComponentCallbacksC1503hi) r8.f413d.get(r62.f911b);
        if (r63 != null) goto L29;
        C0326Hi r82 = new C0326Hi(this.f9504m, this.f9494c, this.f9512u.f7401m.getClassLoader(), m5382E(), r15);
    L33:
        AbstractComponentCallbacksC1503hi r64 = r82.f1110c;
        r64.f5311b = r15;
        r64.f5327r = this;
        if (m5374G(2) == false) goto L36;
        r64.toString();
    L36:
        r82.m706m(this.f9512u.f7401m.getClassLoader());
        r33.m4883u(r82);
        r82.f1112e = this.f9511t;
        goto L22
    L29:
        if (m5374G(2) == false) goto L31;
        r63.toString();
    L31:
        r82 = new C0326Hi(r7, r33, r63, r15);
        goto L33
    L37:
        C0154Di r23 = this.f9490M;
        r23.getClass();
        Iterator r24 = new ArrayList(r23.f413d.values()).iterator();
    L39:
        if (r24.hasNext() == false) goto L47;
        AbstractComponentCallbacksC1503hi r45 = (AbstractComponentCallbacksC1503hi) r24.next();
        if (r52.get(r45.f5314e) != null) goto L39;
        if (m5374G(2) == false) goto L46;
        r45.toString();
        Objects.toString(r1.f162a);
    L46:
        this.f9490M.m299d(r45);
        r45.f5327r = this;
        C0326Hi r10 = new C0326Hi(r7, r33, r45);
        r10.f1112e = 1;
        r10.m704k();
        r45.f5321l = true;
        r10.m704k();
        goto L39
    L47:
        ArrayList r25 = r1.f163b;
        ((ArrayList) r33.f8520a).clear();
        if (r25 == null) goto L61;
        Iterator r26 = r25.iterator();
    L51:
        if (r26.hasNext() == false) goto L61;
        String r46 = (String) r26.next();
        AbstractComponentCallbacksC1503hi r53 = r33.m4876n(r46);
        if (r53 == null) goto L59;
        if (m5374G(2) == false) goto L57;
        r53.toString();
    L57:
        r33.m4868c(r53);
        goto L51
    L59:
        throw new IllegalStateException(AbstractC2374ph.m4814k("No instantiated fragment for (", r46, ")"));
    L61:
        if (r1.f164c == null) goto L89;
        this.f9495d = new ArrayList(r1.f164c.length);
        int r27 = 0;
    L63:
        C1527i5[] r54 = r1.f164c;
        if (r27 >= r54.length) goto L88;
        C1527i5 r55 = r54[r27];
        ArrayList r72 = r55.f5398b;
        C1483h5 r83 = new C1483h5(this);
        int[] r102 = r55.f5397a;
        int r11 = 0;
        int r12 = 0;
    L67:
        if (r11 >= r102.length) goto L76;
        C0455Ki r13 = new C0455Ki();
        int r14 = r11 + 1;
        r13.f1489a = r102[r11];
        if (m5374G(r9) == false) goto L71;
        Objects.toString(r83);
        int r152 = r102[r14];
    L71:
        int r182 = r9;
        r13.f1496h = EnumC0675Pn.values()[r55.f5399c[r12]];
        r13.f1497i = EnumC0675Pn.values()[r55.f5400d[r12]];
        int r92 = r11 + 2;
        if (r102[r14] == 0) goto L74;
        boolean r142 = true;
    L75:
        r13.f1491c = r142;
        int r93 = r102[r92];
        r13.f1492d = r93;
        int r143 = r102[r11 + 3];
        r13.f1493e = r143;
        int r16 = r11 + 5;
        int r153 = r102[r11 + 4];
        r13.f1494f = r153;
        r11 = r11 + 6;
        int r47 = r102[r16];
        r13.f1495g = r47;
        r83.f5237b = r93;
        r83.f5238c = r143;
        r83.f5239d = r153;
        r83.f5240e = r47;
        r83.m2839b(r13);
        r12 = r12 + 1;
        r9 = r182;
        goto L67
    L74:
        r142 = false;
        goto L75
    L76:
        int r183 = r9;
        r83.f5241f = r55.f5401e;
        r83.f5243h = r55.f5402f;
        r83.f5242g = true;
        r83.f5244i = r55.f5404h;
        r83.f5245j = r55.f5405i;
        r83.f5246k = r55.f5406j;
        r83.f5247l = r55.f5407k;
        r83.f5248m = r55.f5408l;
        r83.f5249n = r55.f5409m;
        r83.f5250o = r55.f5410n;
        r83.f5253r = r55.f5403g;
        int r48 = 0;
    L78:
        if (r48 >= r72.size()) goto L83;
        String r56 = (String) r72.get(r48);
        if (r56 == null) goto L82;
        ((C0455Ki) r83.f5236a.get(r48)).f1490b = r33.m4876n(r56);
    L82:
        r48 = r48 + 1;
        goto L78
    L83:
        r83.m2840c(1);
        if (m5374G(r183) == false) goto L87;
        r83.toString();
        PrintWriter r57 = new PrintWriter(new C2068ip());
        r83.m2843f("  ", r57, false);
        r57.close();
    L87:
        this.f9495d.add(r83);
        r27 = r27 + 1;
        r9 = r183;
        goto L63
    L88:
        int r73 = 0;
    L90:
        this.f9500i.set(r1.f165d);
        String r28 = r1.f166e;
        if (r28 == null) goto L93;
        AbstractComponentCallbacksC1503hi r29 = r33.m4876n(r28);
        this.f9515x = r29;
        m5419q(r29);
    L93:
        ArrayList r210 = r1.f167f;
        if (r210 == null) goto L99;
        int r49 = r73;
    L97:
        if (r49 >= r210.size()) goto L99;
        this.f9501j.put((String) r210.get(r49), (C2084j5) r1.f168g.get(r49));
        r49 = r49 + 1;
    L99:
        this.f9481D = new ArrayDeque(r1.f169h);
        return;
    L89:
        r73 = 0;
        this.f9495d = null;
        goto L90
    }

    /* JADX INFO: renamed from: U */
    public final Bundle m5394U() {
        Bundle r0 = new Bundle();
        Iterator r1 = m5407e().iterator();
    L3:
        int r3 = 0;
        if (r1.hasNext() == false) goto L8;
        C2276nd r2 = (C2276nd) r1.next();
        if (r2.f8013e == false) goto L3;
        r2.f8013e = false;
        r2.m4606c();
        goto L3
    L8:
        Iterator r12 = m5407e().iterator();
    L10:
        if (r12.hasNext() == false) goto L12;
        ((C2276nd) r12.next()).m4608e();
        goto L10
    L12:
        m5427y(true);
        this.f9483F = true;
        this.f9490M.f418i = true;
        C2428qs r13 = this.f9494c;
        r13.getClass();
        HashMap r4 = (HashMap) r13.f8521b;
        ArrayList r22 = new ArrayList(r4.size());
        Iterator r42 = r4.values().iterator();
    L14:
        if (r42.hasNext() == false) goto L20;
        C0326Hi r5 = (C0326Hi) r42.next();
        if (r5 == null) goto L14;
        AbstractComponentCallbacksC1503hi r7 = r5.f1110c;
        r13.m4865D(r5.m708o(), r7.f5314e);
        r22.add(r7.f5314e);
        if (m5374G(2) == false) goto L14;
        r7.toString();
        Objects.toString(r7.f5311b);
        goto L14
    L20:
        HashMap r14 = (HashMap) this.f9494c.f8522c;
        if (r14.isEmpty() == true) goto L60;
        C2428qs r43 = this.f9494c;
        ArrayList r52 = (ArrayList) r43.f8520a;
        monitor-enter(r52);
    L29:
        th = move-exception;
        throw th;
    L26:
        if (((ArrayList) r43.f8520a).isEmpty() == false) goto L31;
        monitor-exit(r52);     // Catch: Throwable -> L29
        ArrayList r72 = null;
    L38:
        ArrayList r44 = this.f9495d;
        if (r44 == null) goto L48;
        int r45 = r44.size();
        if (r45 <= 0) goto L48;
        C1527i5[] r53 = new C1527i5[r45];
    L43:
        if (r3 >= r45) goto L49;
        r53[r3] = new C1527i5((C1483h5) this.f9495d.get(r3));
        if (m5374G(2) == false) goto L47;
        Objects.toString(this.f9495d.get(r3));
    L47:
        r3 = r3 + 1;
    L49:
        C0068Bi r32 = new C0068Bi();
        r32.f166e = null;
        ArrayList r46 = new ArrayList();
        r32.f167f = r46;
        ArrayList r6 = new ArrayList();
        r32.f168g = r6;
        r32.f162a = r22;
        r32.f163b = r72;
        r32.f164c = r53;
        r32.f165d = this.f9500i.get();
        AbstractComponentCallbacksC1503hi r23 = this.f9515x;
        if (r23 == null) goto L52;
        r32.f166e = r23.f5314e;
    L52:
        r46.addAll(this.f9501j.keySet());
        r6.addAll(this.f9501j.values());
        r32.f169h = new ArrayList(this.f9481D);
        r0.putParcelable("state", r32);
        Iterator r24 = this.f9502k.keySet().iterator();
    L54:
        if (r24.hasNext() == false) goto L56;
        String r33 = (String) r24.next();
        r0.putBundle(AbstractC0213Ey.m420r("result_", r33), (Bundle) this.f9502k.get(r33));
        goto L54
    L56:
        Iterator r25 = r14.keySet().iterator();
    L58:
        if (r25.hasNext() == false) goto L60;
        String r34 = (String) r25.next();
        r0.putBundle(AbstractC0213Ey.m420r("fragment_", r34), (Bundle) r14.get(r34));
    L48:
        r53 = null;
        goto L49
    L31:
        r72 = new ArrayList(((ArrayList) r43.f8520a).size());     // Catch: Throwable -> L29
        Iterator r47 = ((ArrayList) r43.f8520a).iterator();     // Catch: Throwable -> L29
    L33:
        if (r47.hasNext() == false) goto L37;
        AbstractComponentCallbacksC1503hi r9 = (AbstractComponentCallbacksC1503hi) r47.next();     // Catch: Throwable -> L29
        r72.add(r9.f5314e);     // Catch: Throwable -> L29
        if (m5374G(2) == false) goto L33;
        r9.toString();     // Catch: Throwable -> L29
        goto L33
    L37:
        monitor-exit(r52);     // Catch: Throwable -> L29
    L60:
        return r0;
    }

    /* JADX INFO: renamed from: V */
    public final void m5395V() {
        ArrayList r0 = this.f9492a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f9492a.size() != 1) goto L9;
        this.f9512u.f7402n.removeCallbacks(this.f9491N);     // Catch: Throwable -> L7
        this.f9512u.f7402n.post(this.f9491N);     // Catch: Throwable -> L7
        m5405c0();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    /* JADX INFO: renamed from: W */
    public final void m5396W(AbstractComponentCallbacksC1503hi r2, boolean r3) {
        ViewGroup r22 = m5381D(r2);
        if (r22 != null) goto L5;
        return;
    L5:
        if ((r22 instanceof FragmentContainerView) == false) goto L9;
        ((FragmentContainerView) r22).setDrawDisappearingViewsLast(!r3);
        return;
    }

    /* JADX INFO: renamed from: X */
    public final void m5397X(AbstractComponentCallbacksC1503hi r3, EnumC0675Pn r4) {
        if (r3.equals(this.f9494c.m4876n(r3.f5314e)) == false) goto L11;
        if (r3.f5328s != null) goto L7;
    L8:
        r3.f5303L = r4;
        return;
    L7:
        if (r3.f5327r == this) goto L8;
    L11:
        throw new IllegalArgumentException("Fragment " + r3 + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: Y */
    public final void m5398Y(AbstractComponentCallbacksC1503hi r4) {
        if (r4 != null) goto L4;
    L12:
        AbstractComponentCallbacksC1503hi r0 = this.f9515x;
        this.f9515x = r4;
        m5419q(r0);
        m5419q(this.f9515x);
        return;
    L4:
        if (r4.equals(this.f9494c.m4876n(r4.f5314e)) == false) goto L11;
        if (r4.f5328s == null) goto L12;
        if (r4.f5327r == this) goto L12;
    L11:
        throw new IllegalArgumentException("Fragment " + r4 + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: Z */
    public final void m5399Z(AbstractComponentCallbacksC1503hi r6) {
        ViewGroup r0 = m5381D(r6);
        if (r0 == null) goto L33;
        C1415fi r1 = r6.f5299H;
        boolean r2 = false;
        if (r1 != null) goto L7;
        int r3 = 0;
    L8:
        if (r1 != null) goto L10;
        int r4 = 0;
    L11:
        int r42 = r4 + r3;
        if (r1 != null) goto L14;
        int r32 = 0;
    L15:
        int r33 = r32 + r42;
        if (r1 != null) goto L18;
        int r12 = 0;
    L20:
        if ((r12 + r33) > 0) goto L22;
        return;
    L22:
        if (r0.getTag(R.id.visible_removing_fragment_view_tag) != null) goto L24;
        r0.setTag(R.id.visible_removing_fragment_view_tag, r6);
    L24:
        AbstractComponentCallbacksC1503hi r02 = (AbstractComponentCallbacksC1503hi) r0.getTag(R.id.visible_removing_fragment_view_tag);
        C1415fi r62 = r6.f5299H;
        if (r62 == null) goto L29;
        r2 = r62.f4997a;
    L29:
        if (r02.f5299H == null) goto L35;
        r02.m2868b().f4997a = r2;
        return;
    L35:
        return;
    L18:
        r12 = r1.f5001e;
        goto L20
    L14:
        r32 = r1.f5000d;
        goto L15
    L10:
        r4 = r1.f4999c;
        goto L11
    L7:
        r3 = r1.f4998b;
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public final C0326Hi m5400a(AbstractComponentCallbacksC1503hi r4) {
        String r0 = r4.f5302K;
        if (r0 == null) goto L6;
        AbstractC0412Ji.m856c(r4, r0);
    L6:
        if (m5374G(2) == false) goto L8;
        r4.toString();
    L8:
        C0326Hi r02 = m5408f(r4);
        r4.f5327r = this;
        C2428qs r1 = this.f9494c;
        r1.m4883u(r02);
        if (r4.f5335z == true) goto L16;
        r1.m4868c(r4);
        r4.f5321l = false;
        if (r4.f5296E != null) goto L14;
        r4.f5300I = false;
    L14:
        if (m5375H(r4) == false) goto L16;
        this.f9482E = true;
    L16:
        return r02;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5401a0() {
        Iterator r0 = this.f9494c.m4879q().iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        C0326Hi r1 = (C0326Hi) r0.next();
        AbstractComponentCallbacksC1503hi r2 = r1.f1110c;
        if (r2.f5297F == false) goto L4;
        if (this.f9493b == true) goto L9;
        r2.f5297F = false;
        r1.m704k();
        goto L4
    L9:
        this.f9486I = true;
        goto L4
    }

    /* JADX INFO: renamed from: b */
    public final void m5402b(C2104ji r9, AbstractC0828TB r10, AbstractComponentCallbacksC1503hi r11) {
        if (this.f9512u != null) goto L74;
        this.f9512u = r9;
        this.f9513v = r10;
        this.f9514w = r11;
        CopyOnWriteArrayList r102 = this.f9505n;
        if (r11 == null) goto L7;
        r102.add(new C2590ui(r11));
    L10:
        if (this.f9514w == null) goto L12;
        m5405c0();
    L12:
        if (r9 == null) goto L21;
        C2335ot r3 = r9.f7404p.getOnBackPressedDispatcher();
        this.f9498g = r3;
        if (r11 == null) goto L16;
        InterfaceC1061Yn r103 = r11;
    L17:
        r3.getClass();
        AbstractC0760Rn r104 = r103.getLifecycle();
        if (((C1185ao) r104).f4064c == EnumC0675Pn.f2147a) goto L21;
        C2461ri r7 = this.f9499h;
        C2206lt r0 = new C2206lt(r3, r104, r7);
        r7.f8674b.add(r0);
        r3.m4744d();
        int r1 = 0;
        Class<C2335ot> r2 = C2335ot.class;
        String r4 = "updateEnabledCallbacks";
        r7.f8675c = new C2292nt(r1, r2, r3, r4, "updateEnabledCallbacks()V", 0);
        goto L21
    L16:
        r103 = r9;
    L21:
        if (r11 == null) goto L26;
        C0154Di r92 = r11.f5327r.f9490M;
        HashMap r105 = r92.f414e;
        C0154Di r02 = (C0154Di) r105.get(r11.f5314e);
        if (r02 != null) goto L25;
        r02 = new C0154Di(r92.f416g);
        r105.put(r11.f5314e, r02);
    L25:
        this.f9490M = r02;
    L43:
        C0154Di r93 = this.f9490M;
        r93.f418i = m5385L();
        C2428qs r94 = this.f9494c;
        r94.f8523d = this.f9490M;
        C2104ji r95 = this.f9512u;
        if (r95 == null) goto L49;
        if (r11 != null) goto L49;
        C1518hx r96 = r95.f7404p.getSavedStateRegistry();
        r96.m2898c("android:support:fragments", new C0361Ia(2, this));
        Bundle r97 = r96.m2896a("android:support:fragments");
        if (r97 == null) goto L49;
        m5393T(r97);
    L49:
        C2104ji r98 = this.f9512u;
        if (r98 == null) goto L56;
        AbstractC1242c1 r99 = r98.f7404p.getActivityResultRegistry();
        if (r11 == null) goto L54;
        String r106 = AbstractC0213Ey.m410h(new StringBuilder(), r11.f5314e, ":");
    L55:
        String r107 = AbstractC0213Ey.m420r("FragmentManager:", r106);
        this.f9478A = r99.m2364c(AbstractC0213Ey.m407e(r107, "StartActivityForResult"), new C0860U0(1), new C2418qi(this, 1));
        this.f9479B = r99.m2364c(AbstractC0213Ey.m407e(r107, "StartIntentSenderForResult"), new C0860U0(2), new C2418qi(this, 2));
        this.f9480C = r99.m2364c(AbstractC0213Ey.m407e(r107, "RequestPermissions"), new C0860U0(0), new C2418qi(this, 0));
        goto L56
    L54:
        r106 = "";
    L56:
        C2104ji r910 = this.f9512u;
        if (r910 == null) goto L59;
        C2375pi r108 = this.f9506o;
        r910.f7404p.addOnConfigurationChangedListener(r108);
    L59:
        C2104ji r911 = this.f9512u;
        if (r911 == null) goto L62;
        C2375pi r109 = this.f9507p;
        r911.f7404p.addOnTrimMemoryListener(r109);
    L62:
        C2104ji r912 = this.f9512u;
        if (r912 == null) goto L65;
        C2375pi r1010 = this.f9508q;
        r912.f7404p.addOnMultiWindowModeChangedListener(r1010);
    L65:
        C2104ji r913 = this.f9512u;
        if (r913 == null) goto L68;
        C2375pi r1011 = this.f9509r;
        r913.f7404p.addOnPictureInPictureModeChangedListener(r1011);
    L68:
        C2104ji r914 = this.f9512u;
        if (r914 == null) goto L77;
        if (r11 != null) goto L78;
        C2504si r1012 = this.f9510s;
        r914.f7404p.addMenuProvider(r1012);
        return;
    L78:
        return;
    L77:
        return;
    L26:
        if (r9 == null) goto L42;
        C2709xE r915 = r9.f7404p.getViewModelStore();
        C2098jc r1013 = C2098jc.f7385b;
        String r12 = C0154Di.class.getCanonicalName();
        if (r12 == null) goto L41;
        String r13 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r12);
        AbstractC2580uE r22 = (AbstractC2580uE) r915.f9284a.get(r13);
        boolean r32 = C0154Di.class.isInstance(r22);
        C0111Ci r42 = C0154Di.f412j;
        if (r32 == true) goto L39;
        C2557ts r23 = new C2557ts(r1013);
        r23.m5044a(C1456gf.f5170n, r13);
        AbstractC2580uE r1014 = r42.mo2563b(C0154Di.class, r23);     // Catch: AbstractMethodError -> L35
    L34:
        r22 = r1014;
        AbstractC2580uE r916 = (AbstractC2580uE) r915.f9284a.put(r13, r22);
        if (r916 == null) goto L39;
        r916.mo297b();
    L35:
        r1014 = r42.mo171a(C0154Di.class);
    L39:
        this.f9490M = (C0154Di) r22;
        goto L43
    L41:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L42:
        this.f9490M = new C0154Di(false);
        goto L43
    L7:
        if (r9 == null) goto L10;
        r102.add(r9);
        goto L10
    L74:
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: renamed from: b0 */
    public final void m5403b0(IllegalStateException r6) {
        r6.getMessage();
        PrintWriter r1 = new PrintWriter(new C2068ip());
        C2104ji r0 = this.f9512u;
        if (r0 == null) goto L5;
        AbstractActivityC1244c3 r02 = r0.f7404p;     // Catch: Exception -> L7
        r02.dump("  ", null, r1, new String[0]);     // Catch: Exception -> L7
    L8:
        throw r6;
    L5:
        m5424v("  ", null, r1, new String[0]);     // Catch: Exception -> L7
    L11:
        throw r6;
    }

    /* JADX INFO: renamed from: c */
    public final void m5404c(AbstractComponentCallbacksC1503hi r3) {
        if (m5374G(2) == false) goto L6;
        Objects.toString(r3);
    L6:
        if (r3.f5335z == false) goto L16;
        r3.f5335z = false;
        if (r3.f5320k == true) goto L17;
        this.f9494c.m4868c(r3);
        if (m5374G(2) == false) goto L13;
        r3.toString();
    L13:
        if (m5375H(r3) == false) goto L18;
        this.f9482E = true;
        return;
    L18:
        return;
    L17:
        return;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ui, pj] */
    /* JADX WARN: Type inference failed for: r1v10, types: [Ui, pj] */
    /* JADX INFO: renamed from: c0 */
    public final void m5405c0() {
        ArrayList r0 = this.f9492a;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.f9492a.isEmpty() == true) goto L13;
        C2461ri r1 = this.f9499h;     // Catch: Throwable -> L11
        r1.f8673a = true;     // Catch: Throwable -> L11
        ?? r12 = r1.f8675c;     // Catch: Throwable -> L11
        if (r12 == 0) goto L9;
        r12.mo6a();     // Catch: Throwable -> L11
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        C2461ri r02 = this.f9499h;
        ArrayList r13 = this.f9495d;
        if (r13 == null) goto L17;
        int r14 = r13.size();
    L18:
        if (r14 > 0) goto L20;
    L22:
        r2 = false;
    L23:
        r02.f8673a = r2;
        ?? r03 = r02.f8675c;
        if (r03 == 0) goto L30;
        r03.mo6a();
        return;
    L30:
        return;
    L20:
        if (m5377K(this.f9514w) == false) goto L22;
    L17:
        r14 = 0;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final void m5406d() {
        this.f9493b = false;
        this.f9488K.clear();
        this.f9487J.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m5407e() {
        HashSet r0 = new HashSet();
        Iterator r1 = this.f9494c.m4879q().iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        ViewGroup r2 = ((C0326Hi) r1.next()).f1110c.f5295D;
        if (r2 == null) goto L4;
        m5383F();
        Object r4 = r2.getTag(R.id.special_effects_controller_view_tag);
        if ((r4 instanceof C2276nd) == false) goto L10;
        C2276nd r42 = (C2276nd) r4;
    L11:
        r0.add(r42);
        goto L4
    L10:
        r42 = new C2276nd(r2);
        r2.setTag(R.id.special_effects_controller_view_tag, r42);
        goto L11
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public final C0326Hi m5408f(AbstractComponentCallbacksC1503hi r4) {
        String r0 = r4.f5314e;
        C2428qs r1 = this.f9494c;
        C0326Hi r02 = (C0326Hi) ((HashMap) r1.f8521b).get(r0);
        if (r02 == null) goto L5;
        return r02;
    L5:
        C0326Hi r03 = new C0326Hi(this.f9504m, r1, r4);
        r03.m706m(this.f9512u.f7401m.getClassLoader());
        r03.f1112e = this.f9511t;
        return r03;
    }

    /* JADX INFO: renamed from: g */
    public final void m5409g(AbstractComponentCallbacksC1503hi r4) {
        if (m5374G(2) == false) goto L6;
        Objects.toString(r4);
    L6:
        if (r4.f5335z == true) goto L24;
        r4.f5335z = true;
        if (r4.f5320k == true) goto L10;
        return;
    L10:
        if (m5374G(2) == false) goto L12;
        r4.toString();
    L12:
        C2428qs r0 = this.f9494c;
        ArrayList r2 = (ArrayList) r0.f8520a;
        monitor-enter(r2);
        ((ArrayList) r0.f8520a).remove(r4);     // Catch: Throwable -> L21
        monitor-exit(r2);     // Catch: Throwable -> L21
        r4.f5320k = false;
        if (m5375H(r4) == false) goto L19;
        this.f9482E = true;
    L19:
        m5399Z(r4);
        return;
    L21:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public final void m5410h(boolean r4, Configuration r5) {
        if (r4 == true) goto L4;
    L8:
        Iterator r0 = this.f9494c.m4882t().iterator();
    L10:
        if (r0.hasNext() == false) goto L16;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L10;
        r1.onConfigurationChanged(r5);
        if (r4 == false) goto L10;
        r1.f5329t.m5410h(true, r5);
        goto L10
    L16:
        return;
    L4:
        if (this.f9512u == null) goto L8;
        m5403b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5411i() {
        if (this.f9511t < 1) goto L16;
        Iterator r0 = this.f9494c.m4882t().iterator();
    L7:
        if (r0.hasNext() == false) goto L16;
        AbstractComponentCallbacksC1503hi r3 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r3 == null) goto L7;
        if (r3.f5334y == true) goto L13;
        boolean r32 = r3.f5329t.m5411i();
    L14:
        if (r32 == false) goto L7;
        return true;
    L13:
        r32 = false;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5412j() {
        int r1 = 0;
        if (this.f9511t >= 1) goto L5;
        return false;
    L5:
        Iterator r0 = this.f9494c.m4882t().iterator();
        ArrayList r3 = null;
        boolean r4 = false;
    L7:
        if (r0.hasNext() == false) goto L21;
        AbstractComponentCallbacksC1503hi r5 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r5 == null) goto L7;
        if (m5376J(r5) == false) goto L7;
        if (r5.f5334y == true) goto L15;
        boolean r6 = r5.f5329t.m5412j();
    L16:
        if (r6 == false) goto L7;
        if (r3 != null) goto L19;
        r3 = new ArrayList();
    L19:
        r3.add(r5);
        r4 = true;
        goto L7
    L15:
        r6 = false;
        goto L16
    L21:
        if (this.f9496e != null) goto L23;
    L30:
        this.f9496e = r3;
        return r4;
    L23:
        if (r1 >= this.f9496e.size()) goto L30;
        AbstractComponentCallbacksC1503hi r02 = (AbstractComponentCallbacksC1503hi) this.f9496e.get(r1);
        if (r3 != null) goto L27;
    L28:
        r02.getClass();
    L29:
        r1 = r1 + 1;
        goto L23
    L27:
        if (r3.contains(r02) == true) goto L29;
        goto L28
    }

    /* JADX INFO: renamed from: k */
    public final void m5413k() {
        boolean r0 = true;
        this.f9485H = true;
        m5427y(true);
        Iterator r1 = m5407e().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((C2276nd) r1.next()).m4608e();
        goto L4
    L6:
        C2104ji r12 = this.f9512u;
        C2428qs r2 = this.f9494c;
        if (r12 == null) goto L9;
        r0 = ((C0154Di) r2.f8523d).f417h;
    L12:
        if (r0 == false) goto L20;
        Iterator r02 = this.f9501j.values().iterator();
    L15:
        if (r02.hasNext() == false) goto L20;
        Iterator r13 = ((C2084j5) r02.next()).f7344a.iterator();
    L18:
        if (r13.hasNext() == false) goto L15;
        String r3 = (String) r13.next();
        ((C0154Di) r2.f8523d).m298c(r3);
    L20:
        m5422t(-1);
        C2104ji r03 = this.f9512u;
        if (r03 == null) goto L23;
        C2375pi r14 = this.f9507p;
        r03.f7404p.removeOnTrimMemoryListener(r14);
    L23:
        C2104ji r04 = this.f9512u;
        if (r04 == null) goto L26;
        C2375pi r15 = this.f9506o;
        r04.f7404p.removeOnConfigurationChangedListener(r15);
    L26:
        C2104ji r05 = this.f9512u;
        if (r05 == null) goto L29;
        C2375pi r16 = this.f9508q;
        r05.f7404p.removeOnMultiWindowModeChangedListener(r16);
    L29:
        C2104ji r06 = this.f9512u;
        if (r06 == null) goto L32;
        C2375pi r17 = this.f9509r;
        r06.f7404p.removeOnPictureInPictureModeChangedListener(r17);
    L32:
        C2104ji r07 = this.f9512u;
        if (r07 != null) goto L35;
    L37:
        this.f9512u = null;
        this.f9513v = null;
        this.f9514w = null;
        if (this.f9498g == null) goto L44;
        Iterator r18 = this.f9499h.f8674b.iterator();
    L41:
        if (r18.hasNext() == false) goto L43;
        ((InterfaceC0480L6) r18.next()).cancel();
        goto L41
    L43:
        this.f9498g = null;
    L44:
        C1199b1 r08 = this.f9478A;
        if (r08 == null) goto L52;
        r08.f4110a.m2366e(r08.f4111b);
        C1199b1 r09 = this.f9479B;
        r09.f4110a.m2366e(r09.f4111b);
        C1199b1 r010 = this.f9480C;
        r010.f4110a.m2366e(r010.f4111b);
        return;
    L52:
        return;
    L35:
        if (this.f9514w != null) goto L37;
        C2504si r19 = this.f9510s;
        r07.f7404p.removeMenuProvider(r19);
        goto L37
    L9:
        AbstractActivityC1244c3 r110 = r12.f7401m;
        if (r110 == null) goto L12;
        r0 = true ^ r110.isChangingConfigurations();
        goto L12
    }

    /* JADX INFO: renamed from: l */
    public final void m5414l(boolean r4) {
        if (r4 == true) goto L4;
    L8:
        Iterator r0 = this.f9494c.m4882t().iterator();
    L10:
        if (r0.hasNext() == false) goto L16;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L10;
        r1.f5294C = true;
        if (r4 == false) goto L10;
        r1.f5329t.m5414l(true);
        goto L10
    L16:
        return;
    L4:
        if (this.f9512u == null) goto L8;
        m5403b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final void m5415m(boolean r4) {
        if (r4 == true) goto L4;
    L8:
        Iterator r0 = this.f9494c.m4882t().iterator();
    L10:
        if (r0.hasNext() == false) goto L15;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L10;
        if (r4 == false) goto L10;
        r1.f5329t.m5415m(true);
        goto L10
    L15:
        return;
    L4:
        if (this.f9512u == null) goto L8;
        m5403b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m5416n() {
        Iterator r0 = this.f9494c.m4880r().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L4;
        r1.m2876j();
        r1.f5329t.m5416n();
        goto L4
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5417o() {
        if (this.f9511t < 1) goto L16;
        Iterator r0 = this.f9494c.m4882t().iterator();
    L7:
        if (r0.hasNext() == false) goto L16;
        AbstractComponentCallbacksC1503hi r3 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r3 == null) goto L7;
        if (r3.f5334y == true) goto L13;
        boolean r32 = r3.f5329t.m5417o();
    L14:
        if (r32 == false) goto L7;
        return true;
    L13:
        r32 = false;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m5418p() {
        if (this.f9511t < 1) goto L13;
        Iterator r0 = this.f9494c.m4882t().iterator();
    L7:
        if (r0.hasNext() == false) goto L21;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L7;
        if (r1.f5334y == true) goto L7;
        r1.f5329t.m5418p();
        goto L7
    L21:
        return;
    }

    /* JADX INFO: renamed from: q */
    public final void m5419q(AbstractComponentCallbacksC1503hi r3) {
        if (r3 == null) goto L11;
        String r0 = r3.f5314e;
        if (r3.equals(this.f9494c.m4876n(r0)) == false) goto L12;
        r3.f5327r.getClass();
        boolean r02 = m5377K(r3);
        Boolean r1 = r3.f5319j;
        if (r1 != null) goto L8;
    L9:
        r3.f5319j = Boolean.valueOf(r02);
        C0025Ai r32 = r3.f5329t;
        r32.m5405c0();
        r32.m5419q(r32.f9515x);
        return;
    L8:
        if (r1.booleanValue() != r02) goto L9;
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: r */
    public final void m5420r(boolean r4) {
        if (r4 == true) goto L4;
    L8:
        Iterator r0 = this.f9494c.m4882t().iterator();
    L10:
        if (r0.hasNext() == false) goto L15;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r1 == null) goto L10;
        if (r4 == false) goto L10;
        r1.f5329t.m5420r(true);
        goto L10
    L15:
        return;
    L4:
        if (this.f9512u == null) goto L8;
        m5403b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5421s() {
        if (this.f9511t >= 1) goto L5;
        return false;
    L5:
        Iterator r0 = this.f9494c.m4882t().iterator();
        boolean r3 = false;
    L7:
        if (r0.hasNext() == false) goto L18;
        AbstractComponentCallbacksC1503hi r4 = (AbstractComponentCallbacksC1503hi) r0.next();
        if (r4 == null) goto L7;
        if (m5376J(r4) == false) goto L7;
        if (r4.f5334y == true) goto L15;
        boolean r42 = r4.f5329t.m5421s();
    L16:
        if (r42 == false) goto L7;
        r3 = true;
        goto L7
    L15:
        r42 = false;
        goto L16
    L18:
        return r3;
    }

    /* JADX INFO: renamed from: t */
    public final void m5422t(int r5) {
        this.f9493b = true;     // Catch: Throwable -> L14
        Iterator r2 = ((HashMap) this.f9494c.f8521b).values().iterator();     // Catch: Throwable -> L14
    L5:
        if (r2.hasNext() == false) goto L9;
        C0326Hi r3 = (C0326Hi) r2.next();     // Catch: Throwable -> L14
        if (r3 == null) goto L5;
        r3.f1112e = r5;     // Catch: Throwable -> L14
        goto L5
    L9:
        m5386M(r5, false);     // Catch: Throwable -> L14
        Iterator r52 = m5407e().iterator();     // Catch: Throwable -> L14
    L10:
        if (r52.hasNext() == false) goto L16;
        ((C2276nd) r52.next()).m4608e();     // Catch: Throwable -> L14
        goto L10
    L16:
        this.f9493b = false;
        m5427y(true);
        return;
    L14:
        th = move-exception;
        this.f9493b = false;
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentManager{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" in ");
        AbstractComponentCallbacksC1503hi r1 = this.f9514w;
        if (r1 == null) goto L5;
        r0.append(r1.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.f9514w)));
        r0.append("}");
    L9:
        r0.append("}}");
        return r0.toString();
    L5:
        C2104ji r12 = this.f9512u;
        if (r12 == null) goto L8;
        r0.append(r12.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.f9512u)));
        r0.append("}");
        goto L9
    L8:
        r0.append("null");
        goto L9
    }

    /* JADX INFO: renamed from: u */
    public final void m5423u() {
        if (this.f9486I == false) goto L6;
        this.f9486I = false;
        m5401a0();
        return;
    }

    /* JADX INFO: renamed from: v */
    public final void m5424v(String r18, FileDescriptor r19, PrintWriter r20, String[] r21) {
        String r3 = AbstractC0213Ey.m407e(r18, "    ");
        C2428qs r4 = this.f9494c;
        ArrayList r5 = (ArrayList) r4.f8520a;
        String r6 = AbstractC0213Ey.m407e(r18, "    ");
        HashMap r42 = (HashMap) r4.f8521b;
        int r8 = 0;
        if (r42.isEmpty() == true) goto L120;
        r20.print(r18);
        r20.println("Active Fragments:");
        Iterator r43 = r42.values().iterator();
    L6:
        if (r43.hasNext() == false) goto L120;
        C0326Hi r7 = (C0326Hi) r43.next();
        r20.print(r18);
        if (r7 != null) goto L9;
        r20.println("null");
        goto L6
    L9:
        AbstractComponentCallbacksC1503hi r72 = r7.f1110c;
        r20.println(r72);
        r72.getClass();
        r20.print(r6);
        r20.print("mFragmentId=#");
        r20.print(Integer.toHexString(r72.f5331v));
        r20.print(" mContainerId=#");
        r20.print(Integer.toHexString(r72.f5332w));
        r20.print(" mTag=");
        r20.println(r72.f5333x);
        r20.print(r6);
        r20.print("mState=");
        r20.print(r72.f5310a);
        r20.print(" mWho=");
        r20.print(r72.f5314e);
        r20.print(" mBackStackNesting=");
        r20.println(r72.f5326q);
        r20.print(r6);
        r20.print("mAdded=");
        r20.print(r72.f5320k);
        r20.print(" mRemoving=");
        r20.print(r72.f5321l);
        r20.print(" mFromLayout=");
        r20.print(r72.f5322m);
        r20.print(" mInLayout=");
        r20.println(r72.f5323n);
        r20.print(r6);
        r20.print("mHidden=");
        r20.print(r72.f5334y);
        r20.print(" mDetached=");
        r20.print(r72.f5335z);
        r20.print(" mMenuVisible=");
        r20.print(r72.f5293B);
        r20.print(" mHasMenu=");
        r20.println(false);
        r20.print(r6);
        r20.print("mRetainInstance=");
        r20.print(r72.f5292A);
        r20.print(" mUserVisibleHint=");
        r20.println(r72.f5298G);
        if (r72.f5327r == null) goto L13;
        r20.print(r6);
        r20.print("mFragmentManager=");
        r20.println(r72.f5327r);
    L13:
        if (r72.f5328s == null) goto L16;
        r20.print(r6);
        r20.print("mHost=");
        r20.println(r72.f5328s);
    L16:
        if (r72.f5330u == null) goto L19;
        r20.print(r6);
        r20.print("mParentFragment=");
        r20.println(r72.f5330u);
    L19:
        if (r72.f5315f == null) goto L22;
        r20.print(r6);
        r20.print("mArguments=");
        r20.println(r72.f5315f);
    L22:
        if (r72.f5311b == null) goto L25;
        r20.print(r6);
        r20.print("mSavedFragmentState=");
        r20.println(r72.f5311b);
    L25:
        if (r72.f5312c == null) goto L28;
        r20.print(r6);
        r20.print("mSavedViewState=");
        r20.println(r72.f5312c);
    L28:
        if (r72.f5313d == null) goto L30;
        r20.print(r6);
        r20.print("mSavedViewRegistryState=");
        r20.println(r72.f5313d);
    L30:
        Object r9 = r72.f5316g;
        if (r9 != null) goto L39;
        AbstractC2805zi r92 = r72.f5327r;
        if (r92 == null) goto L38;
        String r11 = r72.f5317h;
        if (r11 == null) goto L38;
        r9 = r92.f9494c.m4876n(r11);
    L38:
        r9 = null;
    L39:
        if (r9 == null) goto L41;
        r20.print(r6);
        r20.print("mTarget=");
        r20.print(r9);
        r20.print(" mTargetRequestCode=");
        r20.println(r72.f5318i);
    L41:
        r20.print(r6);
        r20.print("mPopDirection=");
        C1415fi r93 = r72.f5299H;
        if (r93 != null) goto L44;
        boolean r94 = false;
    L45:
        r20.println(r94);
        C1415fi r95 = r72.f5299H;
        if (r95 != null) goto L48;
        int r96 = 0;
    L49:
        if (r96 == 0) goto L55;
        r20.print(r6);
        r20.print("getEnterAnim=");
        C1415fi r97 = r72.f5299H;
        if (r97 != null) goto L53;
        int r98 = 0;
    L54:
        r20.println(r98);
        goto L55
    L53:
        r98 = r97.f4998b;
    L55:
        C1415fi r99 = r72.f5299H;
        if (r99 != null) goto L58;
        int r910 = 0;
    L59:
        if (r910 == 0) goto L65;
        r20.print(r6);
        r20.print("getExitAnim=");
        C1415fi r911 = r72.f5299H;
        if (r911 != null) goto L63;
        int r912 = 0;
    L64:
        r20.println(r912);
        goto L65
    L63:
        r912 = r911.f4999c;
    L65:
        C1415fi r913 = r72.f5299H;
        if (r913 != null) goto L68;
        int r914 = 0;
    L69:
        if (r914 == 0) goto L75;
        r20.print(r6);
        r20.print("getPopEnterAnim=");
        C1415fi r915 = r72.f5299H;
        if (r915 != null) goto L73;
        int r916 = 0;
    L74:
        r20.println(r916);
        goto L75
    L73:
        r916 = r915.f5000d;
    L75:
        C1415fi r917 = r72.f5299H;
        if (r917 != null) goto L78;
        int r918 = 0;
    L79:
        if (r918 == 0) goto L86;
        r20.print(r6);
        r20.print("getPopExitAnim=");
        C1415fi r919 = r72.f5299H;
        if (r919 != null) goto L83;
        int r920 = 0;
    L84:
        r20.println(r920);
        goto L86
    L83:
        r920 = r919.f5001e;
    L86:
        if (r72.f5295D == null) goto L89;
        r20.print(r6);
        r20.print("mContainer=");
        r20.println(r72.f5295D);
    L89:
        if (r72.f5296E == null) goto L92;
        r20.print(r6);
        r20.print("mView=");
        r20.println(r72.f5296E);
    L92:
        if (r72.m2870d() == null) goto L118;
        C2709xE r921 = r72.getViewModelStore();
        C0111Ci r112 = C0719Qo.f2303e;
        C2098jc r12 = C2098jc.f7385b;
        String r14 = C0719Qo.class.getCanonicalName();
        if (r14 == null) goto L117;
        String r142 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r14);
        AbstractC2580uE r15 = (AbstractC2580uE) r921.f9284a.get(r142);
        if (C0719Qo.class.isInstance(r15) == true) goto L105;
        C2557ts r152 = new C2557ts(r12);
        r152.m5044a(C1456gf.f5170n, r142);
        AbstractC2580uE r113 = r112.mo2563b(C0719Qo.class, r152);     // Catch: AbstractMethodError -> L101
    L100:
        r15 = r113;
        AbstractC2580uE r922 = (AbstractC2580uE) r921.f9284a.put(r142, r15);
        if (r922 == null) goto L105;
        r922.mo297b();
    L101:
        r113 = r112.mo171a(C0719Qo.class);
    L105:
        C0471Ky r923 = ((C0719Qo) r15).f2304d;
        if (r923.f1531c <= 0) goto L118;
        r20.print(r6);
        r20.println("Loaders:");
        if (r923.f1531c <= 0) goto L118;
        if (r923.f1530b[0] != null) goto L115;
        r20.print(r6);
        r20.print("  #");
        r20.print(r923.f1529a[0]);
        r20.print(": ");
        throw null;
    L115:
        throw new ClassCastException();
    L117:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L118:
        r20.print(r6);
        r20.println("Child " + r72.f5329t + ":");
        r72.f5329t.m5424v(AbstractC0213Ey.m407e(r6, "  "), r19, r20, r21);
        goto L6
    L78:
        r918 = r917.f5001e;
        goto L79
    L68:
        r914 = r913.f5000d;
        goto L69
    L58:
        r910 = r99.f4999c;
        goto L59
    L48:
        r96 = r95.f4998b;
        goto L49
    L44:
        r94 = r93.f4997a;
    L120:
        int r44 = r5.size();
        if (r44 <= 0) goto L125;
        r20.print(r18);
        r20.println("Added Fragments:");
        int r62 = 0;
    L123:
        if (r62 >= r44) goto L125;
        AbstractComponentCallbacksC1503hi r73 = (AbstractComponentCallbacksC1503hi) r5.get(r62);
        r20.print(r18);
        r20.print("  #");
        r20.print(r62);
        r20.print(": ");
        r20.println(r73.toString());
        r62 = r62 + 1;
    L125:
        ArrayList r45 = this.f9496e;
        if (r45 == null) goto L132;
        int r46 = r45.size();
        if (r46 <= 0) goto L132;
        r20.print(r18);
        r20.println("Fragments Created Menus:");
        int r52 = 0;
    L130:
        if (r52 >= r46) goto L132;
        AbstractComponentCallbacksC1503hi r63 = (AbstractComponentCallbacksC1503hi) this.f9496e.get(r52);
        r20.print(r18);
        r20.print("  #");
        r20.print(r52);
        r20.print(": ");
        r20.println(r63.toString());
        r52 = r52 + 1;
    L132:
        ArrayList r47 = this.f9495d;
        if (r47 == null) goto L139;
        int r48 = r47.size();
        if (r48 <= 0) goto L139;
        r20.print(r18);
        r20.println("Back Stack:");
        int r53 = 0;
    L137:
        if (r53 >= r48) goto L139;
        C1483h5 r64 = (C1483h5) this.f9495d.get(r53);
        r20.print(r18);
        r20.print("  #");
        r20.print(r53);
        r20.print(": ");
        r20.println(r64.toString());
        r64.m2843f(r3, r20, true);
        r53 = r53 + 1;
    L139:
        r20.print(r18);
        r20.println("Back Stack Index: " + this.f9500i.get());
        ArrayList r32 = this.f9492a;
        monitor-enter(r32);
        int r49 = this.f9492a.size();     // Catch: Throwable -> L146
        if (r49 <= 0) goto L148;
        r20.print(r18);     // Catch: Throwable -> L146
        r20.println("Pending Actions:");     // Catch: Throwable -> L146
    L144:
        if (r8 >= r49) goto L148;
        Object r54 = (InterfaceC2719xi) this.f9492a.get(r8);     // Catch: Throwable -> L146
        r20.print(r18);     // Catch: Throwable -> L146
        r20.print("  #");     // Catch: Throwable -> L146
        r20.print(r8);     // Catch: Throwable -> L146
        r20.print(": ");     // Catch: Throwable -> L146
        r20.println(r54);     // Catch: Throwable -> L146
        r8 = r8 + 1;     // Catch: Throwable -> L146
    L148:
        monitor-exit(r32);     // Catch: Throwable -> L146
        r20.print(r18);
        r20.println("FragmentManager misc state:");
        r20.print(r18);
        r20.print("  mHost=");
        r20.println(this.f9512u);
        r20.print(r18);
        r20.print("  mContainer=");
        r20.println(this.f9513v);
        if (this.f9514w == null) goto L152;
        r20.print(r18);
        r20.print("  mParent=");
        r20.println(this.f9514w);
    L152:
        r20.print(r18);
        r20.print("  mCurState=");
        r20.print(this.f9511t);
        r20.print(" mStateSaved=");
        r20.print(this.f9483F);
        r20.print(" mStopped=");
        r20.print(this.f9484G);
        r20.print(" mDestroyed=");
        r20.println(this.f9485H);
        if (this.f9482E == false) goto L174;
        r20.print(r18);
        r20.print("  mNeedMenuInvalidate=");
        r20.println(this.f9482E);
        return;
    L174:
        return;
    L146:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: w */
    public final void m5425w(InterfaceC2719xi r3, boolean r4) {
        if (r4 == false) goto L4;
    L16:
        ArrayList r0 = this.f9492a;
        monitor-enter(r0);
    L23:
        th = move-exception;
        throw th;
    L19:
        if (this.f9512u != null) goto L27;
        if (r4 == false) goto L26;
        monitor-exit(r0);     // Catch: Throwable -> L23
        return;
    L26:
        throw new IllegalStateException("Activity has been destroyed");     // Catch: Throwable -> L23
    L27:
        this.f9492a.add(r3);     // Catch: Throwable -> L23
        m5395V();     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return;
    L4:
        if (this.f9512u != null) goto L12;
        if (this.f9485H == false) goto L10;
        throw new IllegalStateException("FragmentManager has been destroyed");
    L10:
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L12:
        if (m5385L() == false) goto L16;
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* JADX INFO: renamed from: x */
    public final void m5426x(boolean r3) {
        if (this.f9493b == true) goto L27;
        if (this.f9512u != null) goto L13;
        if (this.f9485H == false) goto L11;
        throw new IllegalStateException("FragmentManager has been destroyed");
    L11:
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L13:
        if (Looper.myLooper() != this.f9512u.f7402n.getLooper()) goto L25;
        if (r3 == true) goto L21;
        if (m5385L() == false) goto L21;
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    L21:
        if (this.f9487J != null) goto L28;
        this.f9487J = new ArrayList();
        this.f9488K = new ArrayList();
        return;
    L28:
        return;
    L25:
        throw new IllegalStateException("Must be called from main thread of fragment host");
    L27:
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5427y(boolean r9) {
        m5426x(r9);
        boolean r0 = false;
    L3:
        ArrayList r1 = this.f9487J;
        ArrayList r2 = this.f9488K;
        ArrayList r3 = this.f9492a;
        monitor-enter(r3);
    L9:
        th = move-exception;
        throw th;
    L6:
        if (this.f9492a.isEmpty() == false) goto L32;
        monitor-exit(r3);     // Catch: Throwable -> L9
        boolean r6 = false;
    L19:
        if (r6 == false) goto L26;
        r0 = true;
        this.f9493b = true;
        m5392S(this.f9487J, this.f9488K);     // Catch: Throwable -> L23
        m5406d();
    L23:
        th = move-exception;
        m5406d();
        throw th;
    L26:
        m5405c0();
        m5423u();
        ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
        return r0;
    L32:
        int r4 = this.f9492a.size();     // Catch: Throwable -> L15
        int r5 = 0;
        r6 = false;
    L12:
        if (r5 >= r4) goto L17;
        r6 = r6 | ((InterfaceC2719xi) this.f9492a.get(r5)).mo2838a(r1, r2);
        r5 = r5 + 1;
        goto L12
    L17:
        this.f9492a.clear();     // Catch: Throwable -> L9
        this.f9512u.f7402n.removeCallbacks(this.f9491N);     // Catch: Throwable -> L9
        monitor-exit(r3);     // Catch: Throwable -> L9
        goto L19
    L15:
        th = move-exception;
        this.f9492a.clear();     // Catch: Throwable -> L9
        this.f9512u.f7402n.removeCallbacks(this.f9491N);     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    }

    /* JADX INFO: renamed from: z */
    public final void m5428z(C1483h5 r2, boolean r3) {
        if (r3 == true) goto L4;
    L8:
        m5426x(r3);
        r2.mo2838a(this.f9487J, this.f9488K);
        this.f9493b = true;
        m5392S(this.f9487J, this.f9488K);     // Catch: Throwable -> L12
        m5406d();
        m5405c0();
        m5423u();
        ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
        return;
    L12:
        th = move-exception;
        m5406d();
        throw th;
    L4:
        if (this.f9512u != null) goto L6;
        return;
    L6:
        if (this.f9485H == false) goto L8;
    }
}
