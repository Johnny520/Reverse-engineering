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
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: zi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2805zi {

    /* JADX INFO: renamed from: A */
    public C1199b1 f9478A;

    /* JADX INFO: renamed from: B */
    public C1199b1 f9479B;

    /* JADX INFO: renamed from: C */
    public C1199b1 f9480C;

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

    /* JADX INFO: renamed from: b */
    public boolean f9493b;

    /* JADX INFO: renamed from: d */
    public ArrayList f9495d;

    /* JADX INFO: renamed from: e */
    public ArrayList f9496e;

    /* JADX INFO: renamed from: g */
    public C2335ot f9498g;

    /* JADX INFO: renamed from: o */
    public final C2375pi f9506o;

    /* JADX INFO: renamed from: p */
    public final C2375pi f9507p;

    /* JADX INFO: renamed from: q */
    public final C2375pi f9508q;

    /* JADX INFO: renamed from: r */
    public final C2375pi f9509r;

    /* JADX INFO: renamed from: u */
    public C2104ji f9512u;

    /* JADX INFO: renamed from: v */
    public AbstractC0828TB f9513v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC1503hi f9514w;

    /* JADX INFO: renamed from: x */
    public AbstractComponentCallbacksC1503hi f9515x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f9492a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C2428qs f9494c = new C2428qs(4);

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C2281ni f9497f = new LayoutInflaterFactory2C2281ni(this);

    /* JADX INFO: renamed from: h */
    public final C2461ri f9499h = new C2461ri(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f9500i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f9501j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map f9502k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    public final Map f9503l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final C0649P3 f9504m = new C0649P3(this);

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f9505n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: s */
    public final C2504si f9510s = new C2504si(this);

    /* JADX INFO: renamed from: t */
    public int f9511t = -1;

    /* JADX INFO: renamed from: y */
    public final C2547ti f9516y = new C2547ti(this);

    /* JADX INFO: renamed from: z */
    public final C0668Pg f9517z = new C0668Pg(9);

    /* JADX INFO: renamed from: D */
    public ArrayDeque f9481D = new ArrayDeque();

    /* JADX INFO: renamed from: N */
    public final RunnableC0431K0 f9491N = new RunnableC0431K0(8, this);

    /* JADX WARN: Type inference failed for: r0v13, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pi] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pi] */
    public AbstractC2805zi() {
        final int i = 0;
        this.f9506o = new InterfaceC2583ub(this) { // from class: pi

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC2805zi f8359b;

            {
                this.f8359b = this;
            }

            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC2805zi abstractC2805zi = this.f8359b;
                        if (abstractC2805zi.m5384I()) {
                            abstractC2805zi.m5410h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC2805zi abstractC2805zi2 = this.f8359b;
                        if (abstractC2805zi2.m5384I() && num.intValue() == 80) {
                            abstractC2805zi2.m5414l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2514ss c2514ss = (C2514ss) obj;
                        AbstractC2805zi abstractC2805zi3 = this.f8359b;
                        if (abstractC2805zi3.m5384I()) {
                            boolean z = c2514ss.f8803a;
                            abstractC2805zi3.m5415m(false);
                        }
                        break;
                    default:
                        C0638Ot c0638Ot = (C0638Ot) obj;
                        AbstractC2805zi abstractC2805zi4 = this.f8359b;
                        if (abstractC2805zi4.m5384I()) {
                            boolean z2 = c0638Ot.f2033a;
                            abstractC2805zi4.m5420r(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f9507p = new InterfaceC2583ub(this) { // from class: pi

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC2805zi f8359b;

            {
                this.f8359b = this;
            }

            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC2805zi abstractC2805zi = this.f8359b;
                        if (abstractC2805zi.m5384I()) {
                            abstractC2805zi.m5410h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC2805zi abstractC2805zi2 = this.f8359b;
                        if (abstractC2805zi2.m5384I() && num.intValue() == 80) {
                            abstractC2805zi2.m5414l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2514ss c2514ss = (C2514ss) obj;
                        AbstractC2805zi abstractC2805zi3 = this.f8359b;
                        if (abstractC2805zi3.m5384I()) {
                            boolean z = c2514ss.f8803a;
                            abstractC2805zi3.m5415m(false);
                        }
                        break;
                    default:
                        C0638Ot c0638Ot = (C0638Ot) obj;
                        AbstractC2805zi abstractC2805zi4 = this.f8359b;
                        if (abstractC2805zi4.m5384I()) {
                            boolean z2 = c0638Ot.f2033a;
                            abstractC2805zi4.m5420r(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f9508q = new InterfaceC2583ub(this) { // from class: pi

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC2805zi f8359b;

            {
                this.f8359b = this;
            }

            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC2805zi abstractC2805zi = this.f8359b;
                        if (abstractC2805zi.m5384I()) {
                            abstractC2805zi.m5410h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC2805zi abstractC2805zi2 = this.f8359b;
                        if (abstractC2805zi2.m5384I() && num.intValue() == 80) {
                            abstractC2805zi2.m5414l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2514ss c2514ss = (C2514ss) obj;
                        AbstractC2805zi abstractC2805zi3 = this.f8359b;
                        if (abstractC2805zi3.m5384I()) {
                            boolean z = c2514ss.f8803a;
                            abstractC2805zi3.m5415m(false);
                        }
                        break;
                    default:
                        C0638Ot c0638Ot = (C0638Ot) obj;
                        AbstractC2805zi abstractC2805zi4 = this.f8359b;
                        if (abstractC2805zi4.m5384I()) {
                            boolean z2 = c0638Ot.f2033a;
                            abstractC2805zi4.m5420r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f9509r = new InterfaceC2583ub(this) { // from class: pi

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC2805zi f8359b;

            {
                this.f8359b = this;
            }

            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC2805zi abstractC2805zi = this.f8359b;
                        if (abstractC2805zi.m5384I()) {
                            abstractC2805zi.m5410h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC2805zi abstractC2805zi2 = this.f8359b;
                        if (abstractC2805zi2.m5384I() && num.intValue() == 80) {
                            abstractC2805zi2.m5414l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2514ss c2514ss = (C2514ss) obj;
                        AbstractC2805zi abstractC2805zi3 = this.f8359b;
                        if (abstractC2805zi3.m5384I()) {
                            boolean z = c2514ss.f8803a;
                            abstractC2805zi3.m5415m(false);
                        }
                        break;
                    default:
                        C0638Ot c0638Ot = (C0638Ot) obj;
                        AbstractC2805zi abstractC2805zi4 = this.f8359b;
                        if (abstractC2805zi4.m5384I()) {
                            boolean z2 = c0638Ot.f2033a;
                            abstractC2805zi4.m5420r(false);
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: G */
    public static boolean m5374G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m5375H(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        abstractComponentCallbacksC1503hi.getClass();
        boolean zM5375H = false;
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 : abstractComponentCallbacksC1503hi.f5329t.f9494c.m4880r()) {
            if (abstractComponentCallbacksC1503hi2 != null) {
                zM5375H = m5375H(abstractComponentCallbacksC1503hi2);
            }
            if (zM5375H) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m5376J(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (abstractComponentCallbacksC1503hi == null) {
            return true;
        }
        if (abstractComponentCallbacksC1503hi.f5293B) {
            return abstractComponentCallbacksC1503hi.f5327r == null || m5376J(abstractComponentCallbacksC1503hi.f5330u);
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m5377K(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (abstractComponentCallbacksC1503hi == null) {
            return true;
        }
        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
        return abstractComponentCallbacksC1503hi.equals(abstractC2805zi.f9515x) && m5377K(abstractC2805zi.f9514w);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0235 A[PHI: r14
  0x0235: PHI (r14v24 int) = (r14v23 int), (r14v25 int) binds: [B:104:0x0225, B:109:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5378A(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ViewGroup viewGroup;
        C2276nd c2276nd;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        C2428qs c2428qs = this.f9494c;
        boolean z5 = ((C1483h5) arrayList.get(i)).f5250o;
        ArrayList arrayList3 = this.f9489L;
        if (arrayList3 == null) {
            this.f9489L = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f9489L.addAll(c2428qs.m4882t());
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9515x;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.f9489L.clear();
                if (!z7 && this.f9511t >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        Iterator it = ((C1483h5) arrayList.get(i10)).f5236a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = ((C0455Ki) it.next()).f1490b;
                            if (abstractComponentCallbacksC1503hi2 != null && abstractComponentCallbacksC1503hi2.f5327r != null) {
                                c2428qs.m4883u(m5408f(abstractComponentCallbacksC1503hi2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    C1483h5 c1483h5 = (C1483h5) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        c1483h5.m2840c(-1);
                        AbstractC2805zi abstractC2805zi = c1483h5.f5251p;
                        ArrayList arrayList4 = c1483h5.f5236a;
                        boolean z8 = true;
                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                            C0455Ki c0455Ki = (C0455Ki) arrayList4.get(size);
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = c0455Ki.f1490b;
                            if (abstractComponentCallbacksC1503hi3 != null) {
                                if (abstractComponentCallbacksC1503hi3.f5299H != null) {
                                    abstractComponentCallbacksC1503hi3.m2868b().f4997a = z8;
                                }
                                int i12 = c1483h5.f5241f;
                                int i13 = 8194;
                                int i14 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        i14 = 8197;
                                        if (i12 != 8197) {
                                            i13 = i12 != 4099 ? i12 != 4100 ? 0 : i14 : 4099;
                                        }
                                    }
                                }
                                if (abstractComponentCallbacksC1503hi3.f5299H != null || i13 != 0) {
                                    abstractComponentCallbacksC1503hi3.m2868b();
                                    abstractComponentCallbacksC1503hi3.f5299H.f5002f = i13;
                                }
                                abstractComponentCallbacksC1503hi3.m2868b();
                                abstractComponentCallbacksC1503hi3.f5299H.getClass();
                            }
                            switch (c0455Ki.f1489a) {
                                case 1:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    z8 = true;
                                    abstractC2805zi.m5396W(abstractComponentCallbacksC1503hi3, true);
                                    abstractC2805zi.m5391R(abstractComponentCallbacksC1503hi3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0455Ki.f1489a);
                                case 3:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    abstractC2805zi.m5400a(abstractComponentCallbacksC1503hi3);
                                    z8 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    abstractC2805zi.getClass();
                                    if (m5374G(2)) {
                                        Objects.toString(abstractComponentCallbacksC1503hi3);
                                    }
                                    if (abstractComponentCallbacksC1503hi3.f5334y) {
                                        abstractComponentCallbacksC1503hi3.f5334y = false;
                                        abstractComponentCallbacksC1503hi3.f5300I = !abstractComponentCallbacksC1503hi3.f5300I;
                                    }
                                    z8 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    abstractC2805zi.m5396W(abstractComponentCallbacksC1503hi3, true);
                                    if (m5374G(2)) {
                                        Objects.toString(abstractComponentCallbacksC1503hi3);
                                    }
                                    if (!abstractComponentCallbacksC1503hi3.f5334y) {
                                        abstractComponentCallbacksC1503hi3.f5334y = true;
                                        abstractComponentCallbacksC1503hi3.f5300I = !abstractComponentCallbacksC1503hi3.f5300I;
                                        abstractC2805zi.m5399Z(abstractComponentCallbacksC1503hi3);
                                    }
                                    z8 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    abstractC2805zi.m5404c(abstractComponentCallbacksC1503hi3);
                                    z8 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1503hi3.m2866A(c0455Ki.f1492d, c0455Ki.f1493e, c0455Ki.f1494f, c0455Ki.f1495g);
                                    abstractC2805zi.m5396W(abstractComponentCallbacksC1503hi3, true);
                                    abstractC2805zi.m5409g(abstractComponentCallbacksC1503hi3);
                                    z8 = true;
                                    break;
                                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                    abstractC2805zi.m5398Y(null);
                                    z8 = true;
                                    break;
                                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                    abstractC2805zi.m5398Y(abstractComponentCallbacksC1503hi3);
                                    z8 = true;
                                    break;
                                case 10:
                                    abstractC2805zi.m5397X(abstractComponentCallbacksC1503hi3, c0455Ki.f1496h);
                                    z8 = true;
                                    break;
                            }
                        }
                    } else {
                        c1483h5.m2840c(1);
                        AbstractC2805zi abstractC2805zi2 = c1483h5.f5251p;
                        ArrayList arrayList5 = c1483h5.f5236a;
                        int size2 = arrayList5.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            C0455Ki c0455Ki2 = (C0455Ki) arrayList5.get(i15);
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi4 = c0455Ki2.f1490b;
                            if (abstractComponentCallbacksC1503hi4 != null) {
                                if (abstractComponentCallbacksC1503hi4.f5299H != null) {
                                    abstractComponentCallbacksC1503hi4.m2868b().f4997a = false;
                                }
                                int i16 = c1483h5.f5241f;
                                if (abstractComponentCallbacksC1503hi4.f5299H != null || i16 != 0) {
                                    abstractComponentCallbacksC1503hi4.m2868b();
                                    abstractComponentCallbacksC1503hi4.f5299H.f5002f = i16;
                                }
                                abstractComponentCallbacksC1503hi4.m2868b();
                                abstractComponentCallbacksC1503hi4.f5299H.getClass();
                            }
                            switch (c0455Ki2.f1489a) {
                                case 1:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.m5396W(abstractComponentCallbacksC1503hi4, false);
                                    abstractC2805zi2.m5400a(abstractComponentCallbacksC1503hi4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0455Ki2.f1489a);
                                case 3:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.m5391R(abstractComponentCallbacksC1503hi4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.getClass();
                                    if (m5374G(2)) {
                                        Objects.toString(abstractComponentCallbacksC1503hi4);
                                    }
                                    if (!abstractComponentCallbacksC1503hi4.f5334y) {
                                        abstractComponentCallbacksC1503hi4.f5334y = true;
                                        abstractComponentCallbacksC1503hi4.f5300I = !abstractComponentCallbacksC1503hi4.f5300I;
                                        abstractC2805zi2.m5399Z(abstractComponentCallbacksC1503hi4);
                                    }
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.m5396W(abstractComponentCallbacksC1503hi4, false);
                                    if (m5374G(2)) {
                                        Objects.toString(abstractComponentCallbacksC1503hi4);
                                    }
                                    if (abstractComponentCallbacksC1503hi4.f5334y) {
                                        abstractComponentCallbacksC1503hi4.f5334y = false;
                                        abstractComponentCallbacksC1503hi4.f5300I = !abstractComponentCallbacksC1503hi4.f5300I;
                                    }
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.m5409g(abstractComponentCallbacksC1503hi4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1503hi4.m2866A(c0455Ki2.f1492d, c0455Ki2.f1493e, c0455Ki2.f1494f, c0455Ki2.f1495g);
                                    abstractC2805zi2.m5396W(abstractComponentCallbacksC1503hi4, false);
                                    abstractC2805zi2.m5404c(abstractComponentCallbacksC1503hi4);
                                    break;
                                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                    abstractC2805zi2.m5398Y(abstractComponentCallbacksC1503hi4);
                                    break;
                                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                    abstractC2805zi2.m5398Y(null);
                                    break;
                                case 10:
                                    abstractC2805zi2.m5397X(abstractComponentCallbacksC1503hi4, c0455Ki2.f1497i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C1483h5 c1483h52 = (C1483h5) arrayList.get(i17);
                    if (zBooleanValue) {
                        for (int size3 = c1483h52.f5236a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi5 = ((C0455Ki) c1483h52.f5236a.get(size3)).f1490b;
                            if (abstractComponentCallbacksC1503hi5 != null) {
                                m5408f(abstractComponentCallbacksC1503hi5).m704k();
                            }
                        }
                    } else {
                        Iterator it2 = c1483h52.f5236a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi6 = ((C0455Ki) it2.next()).f1490b;
                            if (abstractComponentCallbacksC1503hi6 != null) {
                                m5408f(abstractComponentCallbacksC1503hi6).m704k();
                            }
                        }
                    }
                }
                m5386M(this.f9511t, true);
                HashSet<C2276nd> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C1483h5) arrayList.get(i18)).f5236a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi7 = ((C0455Ki) it3.next()).f1490b;
                        if (abstractComponentCallbacksC1503hi7 != null && (viewGroup = abstractComponentCallbacksC1503hi7.f5295D) != null) {
                            m5383F();
                            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                            if (tag instanceof C2276nd) {
                                c2276nd = (C2276nd) tag;
                            } else {
                                c2276nd = new C2276nd(viewGroup);
                                viewGroup.setTag(R.id.special_effects_controller_view_tag, c2276nd);
                            }
                            hashSet.add(c2276nd);
                        }
                    }
                }
                for (C2276nd c2276nd2 : hashSet) {
                    c2276nd2.f8012d = zBooleanValue;
                    synchronized (c2276nd2.f8010b) {
                        try {
                            c2276nd2.m4609f();
                            ArrayList arrayList6 = c2276nd2.f8010b;
                            ListIterator listIterator = arrayList6.listIterator(arrayList6.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    C0557My c0557My = (C0557My) objPrevious;
                                    View view = c0557My.f1827c.f5296E;
                                    char c = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility == 0) {
                                            c = 2;
                                        } else if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                            c = 3;
                                        }
                                    }
                                    if (c0557My.f1825a != 2 || c == 2) {
                                    }
                                } else {
                                    objPrevious = null;
                                }
                            }
                            c2276nd2.f8013e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c2276nd2.m4606c();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C1483h5 c1483h53 = (C1483h5) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c1483h53.f5253r >= 0) {
                        c1483h53.f5253r = -1;
                    }
                    c1483h53.getClass();
                }
                return;
            }
            C1483h5 c1483h54 = (C1483h5) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i20 = 1;
                ArrayList arrayList7 = this.f9489L;
                ArrayList arrayList8 = c1483h54.f5236a;
                int size4 = arrayList8.size() - 1;
                while (size4 >= 0) {
                    C0455Ki c0455Ki3 = (C0455Ki) arrayList8.get(size4);
                    int i21 = c0455Ki3.f1489a;
                    if (i21 == i20) {
                        arrayList7.remove(c0455Ki3.f1490b);
                    } else if (i21 != 3) {
                        switch (i21) {
                            case 6:
                                arrayList7.add(c0455Ki3.f1490b);
                                break;
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                abstractComponentCallbacksC1503hi = null;
                                break;
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                abstractComponentCallbacksC1503hi = c0455Ki3.f1490b;
                                break;
                            case 10:
                                c0455Ki3.f1497i = c0455Ki3.f1496h;
                                break;
                        }
                    }
                    size4--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f9489L;
                ArrayList arrayList10 = c1483h54.f5236a;
                int i22 = 0;
                while (i22 < arrayList10.size()) {
                    C0455Ki c0455Ki4 = (C0455Ki) arrayList10.get(i22);
                    int i23 = c0455Ki4.f1489a;
                    if (i23 != i9) {
                        if (i23 != 2) {
                            if (i23 == 3 || i23 == 6) {
                                z3 = z5;
                                arrayList9.remove(c0455Ki4.f1490b);
                                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi8 = c0455Ki4.f1490b;
                                if (abstractComponentCallbacksC1503hi8 == abstractComponentCallbacksC1503hi) {
                                    arrayList10.add(i22, new C0455Ki(9, abstractComponentCallbacksC1503hi8));
                                    i22++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    abstractComponentCallbacksC1503hi = null;
                                }
                            } else if (i23 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i23 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList10.add(i22, new C0455Ki(9, abstractComponentCallbacksC1503hi, 0));
                                c0455Ki4.f1491c = true;
                                i22++;
                                abstractComponentCallbacksC1503hi = c0455Ki4.f1490b;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi9 = c0455Ki4.f1490b;
                            int i24 = abstractComponentCallbacksC1503hi9.f5332w;
                            int size5 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size5 >= 0) {
                                int i25 = i8;
                                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi10 = (AbstractComponentCallbacksC1503hi) arrayList9.get(size5);
                                boolean z10 = z6;
                                if (abstractComponentCallbacksC1503hi10.f5332w != i24) {
                                    i6 = i24;
                                } else if (abstractComponentCallbacksC1503hi10 == abstractComponentCallbacksC1503hi9) {
                                    i6 = i24;
                                    z9 = true;
                                } else {
                                    if (abstractComponentCallbacksC1503hi10 == abstractComponentCallbacksC1503hi) {
                                        i6 = i24;
                                        i7 = 0;
                                        arrayList10.add(i22, new C0455Ki(9, abstractComponentCallbacksC1503hi10, 0));
                                        i22++;
                                        abstractComponentCallbacksC1503hi = null;
                                    } else {
                                        i6 = i24;
                                        i7 = 0;
                                    }
                                    C0455Ki c0455Ki5 = new C0455Ki(3, abstractComponentCallbacksC1503hi10, i7);
                                    c0455Ki5.f1492d = c0455Ki4.f1492d;
                                    c0455Ki5.f1494f = c0455Ki4.f1494f;
                                    c0455Ki5.f1493e = c0455Ki4.f1493e;
                                    c0455Ki5.f1495g = c0455Ki4.f1495g;
                                    arrayList10.add(i22, c0455Ki5);
                                    arrayList9.remove(abstractComponentCallbacksC1503hi10);
                                    i22++;
                                    abstractComponentCallbacksC1503hi = abstractComponentCallbacksC1503hi;
                                }
                                size5--;
                                i24 = i6;
                                z6 = z10;
                                i8 = i25;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList10.remove(i22);
                                i22--;
                            } else {
                                c0455Ki4.f1489a = 1;
                                c0455Ki4.f1491c = true;
                                arrayList9.add(abstractComponentCallbacksC1503hi9);
                            }
                        }
                        i22 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    } else {
                        z3 = z5;
                        i4 = i9;
                    }
                    i5 = i8;
                    z4 = z6;
                    arrayList9.add(c0455Ki4.f1490b);
                    i22 += i4;
                    i9 = i4;
                    z5 = z3;
                    z6 = z4;
                    i8 = i5;
                }
                z = z5;
                i3 = i8;
                z2 = z6;
            }
            z6 = z2 || c1483h54.f5242g;
            i8 = i3 + 1;
            z5 = z;
        }
    }

    /* JADX INFO: renamed from: B */
    public final AbstractComponentCallbacksC1503hi m5379B(int i) {
        C2428qs c2428qs = this.f9494c;
        ArrayList arrayList = (ArrayList) c2428qs.f8520a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) arrayList.get(size);
            if (abstractComponentCallbacksC1503hi != null && abstractComponentCallbacksC1503hi.f5331v == i) {
                return abstractComponentCallbacksC1503hi;
            }
        }
        for (C0326Hi c0326Hi : ((HashMap) c2428qs.f8521b).values()) {
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
                if (abstractComponentCallbacksC1503hi2.f5331v == i) {
                    return abstractComponentCallbacksC1503hi2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractComponentCallbacksC1503hi m5380C(String str) {
        C2428qs c2428qs = this.f9494c;
        ArrayList arrayList = (ArrayList) c2428qs.f8520a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) arrayList.get(size);
                if (abstractComponentCallbacksC1503hi != null && str.equals(abstractComponentCallbacksC1503hi.f5333x)) {
                    return abstractComponentCallbacksC1503hi;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0326Hi c0326Hi : ((HashMap) c2428qs.f8521b).values()) {
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
                if (str.equals(abstractComponentCallbacksC1503hi2.f5333x)) {
                    return abstractComponentCallbacksC1503hi2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final ViewGroup m5381D(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        ViewGroup viewGroup = abstractComponentCallbacksC1503hi.f5295D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1503hi.f5332w <= 0 || !this.f9513v.mo853z()) {
            return null;
        }
        View viewMo852y = this.f9513v.mo852y(abstractComponentCallbacksC1503hi.f5332w);
        if (viewMo852y instanceof ViewGroup) {
            return (ViewGroup) viewMo852y;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final C2547ti m5382E() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9514w;
        return abstractComponentCallbacksC1503hi != null ? abstractComponentCallbacksC1503hi.f5327r.m5382E() : this.f9516y;
    }

    /* JADX INFO: renamed from: F */
    public final C0668Pg m5383F() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9514w;
        return abstractComponentCallbacksC1503hi != null ? abstractComponentCallbacksC1503hi.f5327r.m5383F() : this.f9517z;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5384I() {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9514w;
        if (abstractComponentCallbacksC1503hi == null) {
            return true;
        }
        return abstractComponentCallbacksC1503hi.m2875i() && this.f9514w.m2872f().m5384I();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m5385L() {
        return this.f9483F || this.f9484G;
    }

    /* JADX INFO: renamed from: M */
    public final void m5386M(int i, boolean z) {
        C2104ji c2104ji;
        if (this.f9512u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f9511t) {
            this.f9511t = i;
            C2428qs c2428qs = this.f9494c;
            HashMap map = (HashMap) c2428qs.f8521b;
            Iterator it = ((ArrayList) c2428qs.f8520a).iterator();
            while (it.hasNext()) {
                C0326Hi c0326Hi = (C0326Hi) map.get(((AbstractComponentCallbacksC1503hi) it.next()).f5314e);
                if (c0326Hi != null) {
                    c0326Hi.m704k();
                }
            }
            for (C0326Hi c0326Hi2 : map.values()) {
                if (c0326Hi2 != null) {
                    c0326Hi2.m704k();
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi2.f1110c;
                    if (abstractComponentCallbacksC1503hi.f5321l && !abstractComponentCallbacksC1503hi.m2877k()) {
                        c2428qs.m4884v(c0326Hi2);
                    }
                }
            }
            m5401a0();
            if (this.f9482E && (c2104ji = this.f9512u) != null && this.f9511t == 7) {
                c2104ji.f7404p.invalidateMenu();
                this.f9482E = false;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m5387N() {
        if (this.f9512u == null) {
            return;
        }
        this.f9483F = false;
        this.f9484G = false;
        this.f9490M.f418i = false;
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null) {
                abstractComponentCallbacksC1503hi.f5329t.m5387N();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m5388O() {
        return m5389P(-1, 0);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5389P(int i, int i2) {
        m5427y(false);
        m5426x(true);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9515x;
        if (abstractComponentCallbacksC1503hi != null && i < 0 && abstractComponentCallbacksC1503hi.m2869c().m5388O()) {
            return true;
        }
        boolean zM5390Q = m5390Q(this.f9487J, this.f9488K, i, i2);
        if (zM5390Q) {
            this.f9493b = true;
            try {
                m5392S(this.f9487J, this.f9488K);
            } finally {
                m5406d();
            }
        }
        m5405c0();
        m5423u();
        ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
        return zM5390Q;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5390Q(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f9495d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f9495d.size() - 1;
            } else {
                int size2 = this.f9495d.size() - 1;
                while (size2 >= 0) {
                    C1483h5 c1483h5 = (C1483h5) this.f9495d.get(size2);
                    if (i >= 0 && i == c1483h5.f5253r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C1483h5 c1483h52 = (C1483h5) this.f9495d.get(size - 1);
                        if (i < 0 || i != c1483h52.f5253r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f9495d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f9495d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C1483h5) this.f9495d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final void m5391R(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        boolean zM2877k = abstractComponentCallbacksC1503hi.m2877k();
        if (abstractComponentCallbacksC1503hi.f5335z && zM2877k) {
            return;
        }
        C2428qs c2428qs = this.f9494c;
        synchronized (((ArrayList) c2428qs.f8520a)) {
            ((ArrayList) c2428qs.f8520a).remove(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.f5320k = false;
        if (m5375H(abstractComponentCallbacksC1503hi)) {
            this.f9482E = true;
        }
        abstractComponentCallbacksC1503hi.f5321l = true;
        m5399Z(abstractComponentCallbacksC1503hi);
    }

    /* JADX INFO: renamed from: S */
    public final void m5392S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C1483h5) arrayList.get(i)).f5250o) {
                if (i2 != i) {
                    m5378A(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1483h5) arrayList.get(i2)).f5250o) {
                        i2++;
                    }
                }
                m5378A(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m5378A(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m5393T(Bundle bundle) {
        C0649P3 c0649p3;
        int i;
        int i2;
        C0326Hi c0326Hi;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f9512u.f7401m.getClassLoader());
                this.f9502k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f9512u.f7401m.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C2428qs c2428qs = this.f9494c;
        HashMap map2 = (HashMap) c2428qs.f8522c;
        HashMap map3 = (HashMap) c2428qs.f8521b;
        map2.clear();
        map2.putAll(map);
        C0068Bi c0068Bi = (C0068Bi) bundle.getParcelable("state");
        if (c0068Bi == null) {
            return;
        }
        map3.clear();
        Iterator it = c0068Bi.f162a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0649p3 = this.f9504m;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM4865D = c2428qs.m4865D(null, (String) it.next());
            if (bundleM4865D != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.f9490M.f413d.get(((C0283Gi) bundleM4865D.getParcelable("state")).f911b);
                if (abstractComponentCallbacksC1503hi != null) {
                    if (m5374G(2)) {
                        abstractComponentCallbacksC1503hi.toString();
                    }
                    c0326Hi = new C0326Hi(c0649p3, c2428qs, abstractComponentCallbacksC1503hi, bundleM4865D);
                } else {
                    c0326Hi = new C0326Hi(this.f9504m, this.f9494c, this.f9512u.f7401m.getClassLoader(), m5382E(), bundleM4865D);
                }
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
                abstractComponentCallbacksC1503hi2.f5311b = bundleM4865D;
                abstractComponentCallbacksC1503hi2.f5327r = this;
                if (m5374G(2)) {
                    abstractComponentCallbacksC1503hi2.toString();
                }
                c0326Hi.m706m(this.f9512u.f7401m.getClassLoader());
                c2428qs.m4883u(c0326Hi);
                c0326Hi.f1112e = this.f9511t;
            }
        }
        C0154Di c0154Di = this.f9490M;
        c0154Di.getClass();
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 : new ArrayList(c0154Di.f413d.values())) {
            if (map3.get(abstractComponentCallbacksC1503hi3.f5314e) == null) {
                if (m5374G(2)) {
                    abstractComponentCallbacksC1503hi3.toString();
                    Objects.toString(c0068Bi.f162a);
                }
                this.f9490M.m299d(abstractComponentCallbacksC1503hi3);
                abstractComponentCallbacksC1503hi3.f5327r = this;
                C0326Hi c0326Hi2 = new C0326Hi(c0649p3, c2428qs, abstractComponentCallbacksC1503hi3);
                c0326Hi2.f1112e = 1;
                c0326Hi2.m704k();
                abstractComponentCallbacksC1503hi3.f5321l = true;
                c0326Hi2.m704k();
            }
        }
        ArrayList<String> arrayList = c0068Bi.f163b;
        ((ArrayList) c2428qs.f8520a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4876n = c2428qs.m4876n(str3);
                if (abstractComponentCallbacksC1503hiM4876n == null) {
                    throw new IllegalStateException(AbstractC2374ph.m4814k("No instantiated fragment for (", str3, ")"));
                }
                if (m5374G(2)) {
                    abstractComponentCallbacksC1503hiM4876n.toString();
                }
                c2428qs.m4868c(abstractComponentCallbacksC1503hiM4876n);
            }
        }
        if (c0068Bi.f164c != null) {
            this.f9495d = new ArrayList(c0068Bi.f164c.length);
            int i3 = 0;
            while (true) {
                C1527i5[] c1527i5Arr = c0068Bi.f164c;
                if (i3 >= c1527i5Arr.length) {
                    break;
                }
                C1527i5 c1527i5 = c1527i5Arr[i3];
                ArrayList arrayList2 = c1527i5.f5398b;
                C1483h5 c1483h5 = new C1483h5(this);
                int[] iArr = c1527i5.f5397a;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C0455Ki c0455Ki = new C0455Ki();
                    int i6 = i4 + 1;
                    c0455Ki.f1489a = iArr[i4];
                    if (m5374G(i)) {
                        Objects.toString(c1483h5);
                        int i7 = iArr[i6];
                    }
                    int i8 = i;
                    c0455Ki.f1496h = EnumC0675Pn.values()[c1527i5.f5399c[i5]];
                    c0455Ki.f1497i = EnumC0675Pn.values()[c1527i5.f5400d[i5]];
                    int i9 = i4 + 2;
                    c0455Ki.f1491c = iArr[i6] != 0;
                    int i10 = iArr[i9];
                    c0455Ki.f1492d = i10;
                    int i11 = iArr[i4 + 3];
                    c0455Ki.f1493e = i11;
                    int i12 = i4 + 5;
                    int i13 = iArr[i4 + 4];
                    c0455Ki.f1494f = i13;
                    i4 += 6;
                    int i14 = iArr[i12];
                    c0455Ki.f1495g = i14;
                    c1483h5.f5237b = i10;
                    c1483h5.f5238c = i11;
                    c1483h5.f5239d = i13;
                    c1483h5.f5240e = i14;
                    c1483h5.m2839b(c0455Ki);
                    i5++;
                    i = i8;
                }
                int i15 = i;
                c1483h5.f5241f = c1527i5.f5401e;
                c1483h5.f5243h = c1527i5.f5402f;
                c1483h5.f5242g = true;
                c1483h5.f5244i = c1527i5.f5404h;
                c1483h5.f5245j = c1527i5.f5405i;
                c1483h5.f5246k = c1527i5.f5406j;
                c1483h5.f5247l = c1527i5.f5407k;
                c1483h5.f5248m = c1527i5.f5408l;
                c1483h5.f5249n = c1527i5.f5409m;
                c1483h5.f5250o = c1527i5.f5410n;
                c1483h5.f5253r = c1527i5.f5403g;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((C0455Ki) c1483h5.f5236a.get(i16)).f1490b = c2428qs.m4876n(str4);
                    }
                }
                c1483h5.m2840c(1);
                if (m5374G(i15)) {
                    c1483h5.toString();
                    PrintWriter printWriter = new PrintWriter(new C2068ip());
                    c1483h5.m2843f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9495d.add(c1483h5);
                i3++;
                i = i15;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f9495d = null;
        }
        this.f9500i.set(c0068Bi.f165d);
        String str5 = c0068Bi.f166e;
        if (str5 != null) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4876n2 = c2428qs.m4876n(str5);
            this.f9515x = abstractComponentCallbacksC1503hiM4876n2;
            m5419q(abstractComponentCallbacksC1503hiM4876n2);
        }
        ArrayList arrayList3 = c0068Bi.f167f;
        if (arrayList3 != null) {
            for (int i17 = i2; i17 < arrayList3.size(); i17++) {
                this.f9501j.put((String) arrayList3.get(i17), (C2084j5) c0068Bi.f168g.get(i17));
            }
        }
        this.f9481D = new ArrayDeque(c0068Bi.f169h);
    }

    /* JADX INFO: renamed from: U */
    public final Bundle m5394U() {
        int i;
        ArrayList arrayList;
        C1527i5[] c1527i5Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m5407e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2276nd c2276nd = (C2276nd) it.next();
            if (c2276nd.f8013e) {
                c2276nd.f8013e = false;
                c2276nd.m4606c();
            }
        }
        Iterator it2 = m5407e().iterator();
        while (it2.hasNext()) {
            ((C2276nd) it2.next()).m4608e();
        }
        m5427y(true);
        this.f9483F = true;
        this.f9490M.f418i = true;
        C2428qs c2428qs = this.f9494c;
        c2428qs.getClass();
        HashMap map = (HashMap) c2428qs.f8521b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0326Hi c0326Hi : map.values()) {
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
                c2428qs.m4865D(c0326Hi.m708o(), abstractComponentCallbacksC1503hi.f5314e);
                arrayList2.add(abstractComponentCallbacksC1503hi.f5314e);
                if (m5374G(2)) {
                    abstractComponentCallbacksC1503hi.toString();
                    Objects.toString(abstractComponentCallbacksC1503hi.f5311b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f9494c.f8522c;
        if (!map2.isEmpty()) {
            C2428qs c2428qs2 = this.f9494c;
            synchronized (((ArrayList) c2428qs2.f8520a)) {
                try {
                    if (((ArrayList) c2428qs2.f8520a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c2428qs2.f8520a).size());
                        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 : (ArrayList) c2428qs2.f8520a) {
                            arrayList.add(abstractComponentCallbacksC1503hi2.f5314e);
                            if (m5374G(2)) {
                                abstractComponentCallbacksC1503hi2.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f9495d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c1527i5Arr = null;
            } else {
                c1527i5Arr = new C1527i5[size];
                for (i = 0; i < size; i++) {
                    c1527i5Arr[i] = new C1527i5((C1483h5) this.f9495d.get(i));
                    if (m5374G(2)) {
                        Objects.toString(this.f9495d.get(i));
                    }
                }
            }
            C0068Bi c0068Bi = new C0068Bi();
            c0068Bi.f166e = null;
            ArrayList arrayList4 = new ArrayList();
            c0068Bi.f167f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c0068Bi.f168g = arrayList5;
            c0068Bi.f162a = arrayList2;
            c0068Bi.f163b = arrayList;
            c0068Bi.f164c = c1527i5Arr;
            c0068Bi.f165d = this.f9500i.get();
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = this.f9515x;
            if (abstractComponentCallbacksC1503hi3 != null) {
                c0068Bi.f166e = abstractComponentCallbacksC1503hi3.f5314e;
            }
            arrayList4.addAll(this.f9501j.keySet());
            arrayList5.addAll(this.f9501j.values());
            c0068Bi.f169h = new ArrayList(this.f9481D);
            bundle.putParcelable("state", c0068Bi);
            for (String str : this.f9502k.keySet()) {
                bundle.putBundle(AbstractC0213Ey.m420r("result_", str), (Bundle) this.f9502k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC0213Ey.m420r("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: V */
    public final void m5395V() {
        synchronized (this.f9492a) {
            try {
                if (this.f9492a.size() == 1) {
                    this.f9512u.f7402n.removeCallbacks(this.f9491N);
                    this.f9512u.f7402n.post(this.f9491N);
                    m5405c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m5396W(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        ViewGroup viewGroupM5381D = m5381D(abstractComponentCallbacksC1503hi);
        if (viewGroupM5381D == null || !(viewGroupM5381D instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM5381D).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: X */
    public final void m5397X(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, EnumC0675Pn enumC0675Pn) {
        if (abstractComponentCallbacksC1503hi.equals(this.f9494c.m4876n(abstractComponentCallbacksC1503hi.f5314e)) && (abstractComponentCallbacksC1503hi.f5328s == null || abstractComponentCallbacksC1503hi.f5327r == this)) {
            abstractComponentCallbacksC1503hi.f5303L = enumC0675Pn;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1503hi + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: Y */
    public final void m5398Y(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (abstractComponentCallbacksC1503hi != null) {
            if (!abstractComponentCallbacksC1503hi.equals(this.f9494c.m4876n(abstractComponentCallbacksC1503hi.f5314e)) || (abstractComponentCallbacksC1503hi.f5328s != null && abstractComponentCallbacksC1503hi.f5327r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1503hi + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = this.f9515x;
        this.f9515x = abstractComponentCallbacksC1503hi;
        m5419q(abstractComponentCallbacksC1503hi2);
        m5419q(this.f9515x);
    }

    /* JADX INFO: renamed from: Z */
    public final void m5399Z(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        ViewGroup viewGroupM5381D = m5381D(abstractComponentCallbacksC1503hi);
        if (viewGroupM5381D != null) {
            C1415fi c1415fi = abstractComponentCallbacksC1503hi.f5299H;
            if ((c1415fi == null ? 0 : c1415fi.f5001e) + (c1415fi == null ? 0 : c1415fi.f5000d) + (c1415fi == null ? 0 : c1415fi.f4999c) + (c1415fi == null ? 0 : c1415fi.f4998b) > 0) {
                if (viewGroupM5381D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM5381D.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1503hi);
                }
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = (AbstractComponentCallbacksC1503hi) viewGroupM5381D.getTag(R.id.visible_removing_fragment_view_tag);
                C1415fi c1415fi2 = abstractComponentCallbacksC1503hi.f5299H;
                boolean z = c1415fi2 != null ? c1415fi2.f4997a : false;
                if (abstractComponentCallbacksC1503hi2.f5299H == null) {
                    return;
                }
                abstractComponentCallbacksC1503hi2.m2868b().f4997a = z;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0326Hi m5400a(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        String str = abstractComponentCallbacksC1503hi.f5302K;
        if (str != null) {
            AbstractC0412Ji.m856c(abstractComponentCallbacksC1503hi, str);
        }
        if (m5374G(2)) {
            abstractComponentCallbacksC1503hi.toString();
        }
        C0326Hi c0326HiM5408f = m5408f(abstractComponentCallbacksC1503hi);
        abstractComponentCallbacksC1503hi.f5327r = this;
        C2428qs c2428qs = this.f9494c;
        c2428qs.m4883u(c0326HiM5408f);
        if (!abstractComponentCallbacksC1503hi.f5335z) {
            c2428qs.m4868c(abstractComponentCallbacksC1503hi);
            abstractComponentCallbacksC1503hi.f5321l = false;
            if (abstractComponentCallbacksC1503hi.f5296E == null) {
                abstractComponentCallbacksC1503hi.f5300I = false;
            }
            if (m5375H(abstractComponentCallbacksC1503hi)) {
                this.f9482E = true;
            }
        }
        return c0326HiM5408f;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5401a0() {
        for (C0326Hi c0326Hi : this.f9494c.m4879q()) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
            if (abstractComponentCallbacksC1503hi.f5297F) {
                if (this.f9493b) {
                    this.f9486I = true;
                } else {
                    abstractComponentCallbacksC1503hi.f5297F = false;
                    c0326Hi.m704k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5402b(C2104ji c2104ji, AbstractC0828TB abstractC0828TB, AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        AbstractC2580uE abstractC2580uEMo171a;
        if (this.f9512u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9512u = c2104ji;
        this.f9513v = abstractC0828TB;
        this.f9514w = abstractComponentCallbacksC1503hi;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9505n;
        if (abstractComponentCallbacksC1503hi != null) {
            copyOnWriteArrayList.add(new C2590ui(abstractComponentCallbacksC1503hi));
        } else if (c2104ji != null) {
            copyOnWriteArrayList.add(c2104ji);
        }
        if (this.f9514w != null) {
            m5405c0();
        }
        if (c2104ji != null) {
            C2335ot onBackPressedDispatcher = c2104ji.f7404p.getOnBackPressedDispatcher();
            this.f9498g = onBackPressedDispatcher;
            InterfaceC1061Yn interfaceC1061Yn = abstractComponentCallbacksC1503hi != null ? abstractComponentCallbacksC1503hi : c2104ji;
            onBackPressedDispatcher.getClass();
            AbstractC0760Rn lifecycle = interfaceC1061Yn.getLifecycle();
            if (((C1185ao) lifecycle).f4064c != EnumC0675Pn.f2147a) {
                C2461ri c2461ri = this.f9499h;
                c2461ri.f8674b.add(new C2206lt(onBackPressedDispatcher, lifecycle, c2461ri));
                onBackPressedDispatcher.m4744d();
                c2461ri.f8675c = new C2292nt(0, C2335ot.class, onBackPressedDispatcher, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }
        }
        if (abstractComponentCallbacksC1503hi != null) {
            C0154Di c0154Di = abstractComponentCallbacksC1503hi.f5327r.f9490M;
            HashMap map = c0154Di.f414e;
            C0154Di c0154Di2 = (C0154Di) map.get(abstractComponentCallbacksC1503hi.f5314e);
            if (c0154Di2 == null) {
                c0154Di2 = new C0154Di(c0154Di.f416g);
                map.put(abstractComponentCallbacksC1503hi.f5314e, c0154Di2);
            }
            this.f9490M = c0154Di2;
        } else if (c2104ji != null) {
            C2709xE viewModelStore = c2104ji.f7404p.getViewModelStore();
            C2098jc c2098jc = C2098jc.f7385b;
            String canonicalName = C0154Di.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC2580uE abstractC2580uE = (AbstractC2580uE) viewModelStore.f9284a.get(strConcat);
            boolean zIsInstance = C0154Di.class.isInstance(abstractC2580uE);
            C0111Ci c0111Ci = C0154Di.f412j;
            if (!zIsInstance) {
                C2557ts c2557ts = new C2557ts(c2098jc);
                c2557ts.m5044a(C1456gf.f5170n, strConcat);
                try {
                    abstractC2580uEMo171a = c0111Ci.mo2563b(C0154Di.class, c2557ts);
                } catch (AbstractMethodError unused) {
                    abstractC2580uEMo171a = c0111Ci.mo171a(C0154Di.class);
                }
                abstractC2580uE = abstractC2580uEMo171a;
                AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) viewModelStore.f9284a.put(strConcat, abstractC2580uE);
                if (abstractC2580uE2 != null) {
                    abstractC2580uE2.mo297b();
                }
            }
            this.f9490M = (C0154Di) abstractC2580uE;
        } else {
            this.f9490M = new C0154Di(false);
        }
        this.f9490M.f418i = m5385L();
        this.f9494c.f8523d = this.f9490M;
        C2104ji c2104ji2 = this.f9512u;
        if (c2104ji2 != null && abstractComponentCallbacksC1503hi == null) {
            C1518hx savedStateRegistry = c2104ji2.f7404p.getSavedStateRegistry();
            savedStateRegistry.m2898c("android:support:fragments", new C0361Ia(2, this));
            Bundle bundleM2896a = savedStateRegistry.m2896a("android:support:fragments");
            if (bundleM2896a != null) {
                m5393T(bundleM2896a);
            }
        }
        C2104ji c2104ji3 = this.f9512u;
        if (c2104ji3 != null) {
            AbstractC1242c1 activityResultRegistry = c2104ji3.f7404p.getActivityResultRegistry();
            String strM420r = AbstractC0213Ey.m420r("FragmentManager:", abstractComponentCallbacksC1503hi != null ? AbstractC0213Ey.m410h(new StringBuilder(), abstractComponentCallbacksC1503hi.f5314e, ":") : "");
            this.f9478A = activityResultRegistry.m2364c(AbstractC0213Ey.m407e(strM420r, "StartActivityForResult"), new C0860U0(1), new C2418qi(this, 1));
            this.f9479B = activityResultRegistry.m2364c(AbstractC0213Ey.m407e(strM420r, "StartIntentSenderForResult"), new C0860U0(2), new C2418qi(this, 2));
            this.f9480C = activityResultRegistry.m2364c(AbstractC0213Ey.m407e(strM420r, "RequestPermissions"), new C0860U0(0), new C2418qi(this, 0));
        }
        C2104ji c2104ji4 = this.f9512u;
        if (c2104ji4 != null) {
            c2104ji4.f7404p.addOnConfigurationChangedListener(this.f9506o);
        }
        C2104ji c2104ji5 = this.f9512u;
        if (c2104ji5 != null) {
            c2104ji5.f7404p.addOnTrimMemoryListener(this.f9507p);
        }
        C2104ji c2104ji6 = this.f9512u;
        if (c2104ji6 != null) {
            c2104ji6.f7404p.addOnMultiWindowModeChangedListener(this.f9508q);
        }
        C2104ji c2104ji7 = this.f9512u;
        if (c2104ji7 != null) {
            c2104ji7.f7404p.addOnPictureInPictureModeChangedListener(this.f9509r);
        }
        C2104ji c2104ji8 = this.f9512u;
        if (c2104ji8 == null || abstractComponentCallbacksC1503hi != null) {
            return;
        }
        c2104ji8.f7404p.addMenuProvider(this.f9510s);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m5403b0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C2068ip());
        C2104ji c2104ji = this.f9512u;
        try {
            if (c2104ji != null) {
                c2104ji.f7404p.dump("  ", null, printWriter, new String[0]);
            } else {
                m5424v("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5404c(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        if (abstractComponentCallbacksC1503hi.f5335z) {
            abstractComponentCallbacksC1503hi.f5335z = false;
            if (abstractComponentCallbacksC1503hi.f5320k) {
                return;
            }
            this.f9494c.m4868c(abstractComponentCallbacksC1503hi);
            if (m5374G(2)) {
                abstractComponentCallbacksC1503hi.toString();
            }
            if (m5375H(abstractComponentCallbacksC1503hi)) {
                this.f9482E = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ui, pj] */
    /* JADX WARN: Type inference failed for: r1v10, types: [Ui, pj] */
    /* JADX INFO: renamed from: c0 */
    public final void m5405c0() {
        synchronized (this.f9492a) {
            try {
                if (!this.f9492a.isEmpty()) {
                    C2461ri c2461ri = this.f9499h;
                    c2461ri.f8673a = true;
                    ?? r1 = c2461ri.f8675c;
                    if (r1 != 0) {
                        r1.mo6a();
                    }
                    return;
                }
                C2461ri c2461ri2 = this.f9499h;
                ArrayList arrayList = this.f9495d;
                c2461ri2.f8673a = (arrayList != null ? arrayList.size() : 0) > 0 && m5377K(this.f9514w);
                ?? r0 = c2461ri2.f8675c;
                if (r0 != 0) {
                    r0.mo6a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5406d() {
        this.f9493b = false;
        this.f9488K.clear();
        this.f9487J.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m5407e() {
        C2276nd c2276nd;
        HashSet hashSet = new HashSet();
        Iterator it = this.f9494c.m4879q().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0326Hi) it.next()).f1110c.f5295D;
            if (viewGroup != null) {
                m5383F();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C2276nd) {
                    c2276nd = (C2276nd) tag;
                } else {
                    c2276nd = new C2276nd(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c2276nd);
                }
                hashSet.add(c2276nd);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0326Hi m5408f(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        String str = abstractComponentCallbacksC1503hi.f5314e;
        C2428qs c2428qs = this.f9494c;
        C0326Hi c0326Hi = (C0326Hi) ((HashMap) c2428qs.f8521b).get(str);
        if (c0326Hi != null) {
            return c0326Hi;
        }
        C0326Hi c0326Hi2 = new C0326Hi(this.f9504m, c2428qs, abstractComponentCallbacksC1503hi);
        c0326Hi2.m706m(this.f9512u.f7401m.getClassLoader());
        c0326Hi2.f1112e = this.f9511t;
        return c0326Hi2;
    }

    /* JADX INFO: renamed from: g */
    public final void m5409g(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (m5374G(2)) {
            Objects.toString(abstractComponentCallbacksC1503hi);
        }
        if (abstractComponentCallbacksC1503hi.f5335z) {
            return;
        }
        abstractComponentCallbacksC1503hi.f5335z = true;
        if (abstractComponentCallbacksC1503hi.f5320k) {
            if (m5374G(2)) {
                abstractComponentCallbacksC1503hi.toString();
            }
            C2428qs c2428qs = this.f9494c;
            synchronized (((ArrayList) c2428qs.f8520a)) {
                ((ArrayList) c2428qs.f8520a).remove(abstractComponentCallbacksC1503hi);
            }
            abstractComponentCallbacksC1503hi.f5320k = false;
            if (m5375H(abstractComponentCallbacksC1503hi)) {
                this.f9482E = true;
            }
            m5399Z(abstractComponentCallbacksC1503hi);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5410h(boolean z, Configuration configuration) {
        if (z && this.f9512u != null) {
            m5403b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null) {
                abstractComponentCallbacksC1503hi.onConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC1503hi.f5329t.m5410h(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5411i() {
        if (this.f9511t >= 1) {
            for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
                if (abstractComponentCallbacksC1503hi != null) {
                    if (!abstractComponentCallbacksC1503hi.f5334y ? abstractComponentCallbacksC1503hi.f5329t.m5411i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5412j() {
        if (this.f9511t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null && m5376J(abstractComponentCallbacksC1503hi)) {
                if (!abstractComponentCallbacksC1503hi.f5334y ? abstractComponentCallbacksC1503hi.f5329t.m5412j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC1503hi);
                    z = true;
                }
            }
        }
        if (this.f9496e != null) {
            for (int i = 0; i < this.f9496e.size(); i++) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = (AbstractComponentCallbacksC1503hi) this.f9496e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1503hi2)) {
                    abstractComponentCallbacksC1503hi2.getClass();
                }
            }
        }
        this.f9496e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m5413k() {
        boolean zIsChangingConfigurations = true;
        this.f9485H = true;
        m5427y(true);
        Iterator it = m5407e().iterator();
        while (it.hasNext()) {
            ((C2276nd) it.next()).m4608e();
        }
        C2104ji c2104ji = this.f9512u;
        C2428qs c2428qs = this.f9494c;
        if (c2104ji != null) {
            zIsChangingConfigurations = ((C0154Di) c2428qs.f8523d).f417h;
        } else {
            AbstractActivityC1244c3 abstractActivityC1244c3 = c2104ji.f7401m;
            if (abstractActivityC1244c3 != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1244c3.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f9501j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C2084j5) it2.next()).f7344a.iterator();
                while (it3.hasNext()) {
                    ((C0154Di) c2428qs.f8523d).m298c((String) it3.next());
                }
            }
        }
        m5422t(-1);
        C2104ji c2104ji2 = this.f9512u;
        if (c2104ji2 != null) {
            c2104ji2.f7404p.removeOnTrimMemoryListener(this.f9507p);
        }
        C2104ji c2104ji3 = this.f9512u;
        if (c2104ji3 != null) {
            c2104ji3.f7404p.removeOnConfigurationChangedListener(this.f9506o);
        }
        C2104ji c2104ji4 = this.f9512u;
        if (c2104ji4 != null) {
            c2104ji4.f7404p.removeOnMultiWindowModeChangedListener(this.f9508q);
        }
        C2104ji c2104ji5 = this.f9512u;
        if (c2104ji5 != null) {
            c2104ji5.f7404p.removeOnPictureInPictureModeChangedListener(this.f9509r);
        }
        C2104ji c2104ji6 = this.f9512u;
        if (c2104ji6 != null && this.f9514w == null) {
            c2104ji6.f7404p.removeMenuProvider(this.f9510s);
        }
        this.f9512u = null;
        this.f9513v = null;
        this.f9514w = null;
        if (this.f9498g != null) {
            Iterator it4 = this.f9499h.f8674b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0480L6) it4.next()).cancel();
            }
            this.f9498g = null;
        }
        C1199b1 c1199b1 = this.f9478A;
        if (c1199b1 != null) {
            c1199b1.f4110a.m2366e(c1199b1.f4111b);
            C1199b1 c1199b12 = this.f9479B;
            c1199b12.f4110a.m2366e(c1199b12.f4111b);
            C1199b1 c1199b13 = this.f9480C;
            c1199b13.f4110a.m2366e(c1199b13.f4111b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5414l(boolean z) {
        if (z && this.f9512u != null) {
            m5403b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null) {
                abstractComponentCallbacksC1503hi.f5294C = true;
                if (z) {
                    abstractComponentCallbacksC1503hi.f5329t.m5414l(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5415m(boolean z) {
        if (z && this.f9512u != null) {
            m5403b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null && z) {
                abstractComponentCallbacksC1503hi.f5329t.m5415m(true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5416n() {
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4880r()) {
            if (abstractComponentCallbacksC1503hi != null) {
                abstractComponentCallbacksC1503hi.m2876j();
                abstractComponentCallbacksC1503hi.f5329t.m5416n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5417o() {
        if (this.f9511t >= 1) {
            for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
                if (abstractComponentCallbacksC1503hi != null) {
                    if (!abstractComponentCallbacksC1503hi.f5334y ? abstractComponentCallbacksC1503hi.f5329t.m5417o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m5418p() {
        if (this.f9511t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null && !abstractComponentCallbacksC1503hi.f5334y) {
                abstractComponentCallbacksC1503hi.f5329t.m5418p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5419q(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (abstractComponentCallbacksC1503hi != null) {
            if (abstractComponentCallbacksC1503hi.equals(this.f9494c.m4876n(abstractComponentCallbacksC1503hi.f5314e))) {
                abstractComponentCallbacksC1503hi.f5327r.getClass();
                boolean zM5377K = m5377K(abstractComponentCallbacksC1503hi);
                Boolean bool = abstractComponentCallbacksC1503hi.f5319j;
                if (bool == null || bool.booleanValue() != zM5377K) {
                    abstractComponentCallbacksC1503hi.f5319j = Boolean.valueOf(zM5377K);
                    C0025Ai c0025Ai = abstractComponentCallbacksC1503hi.f5329t;
                    c0025Ai.m5405c0();
                    c0025Ai.m5419q(c0025Ai.f9515x);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5420r(boolean z) {
        if (z && this.f9512u != null) {
            m5403b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null && z) {
                abstractComponentCallbacksC1503hi.f5329t.m5420r(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5421s() {
        if (this.f9511t < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : this.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null && m5376J(abstractComponentCallbacksC1503hi)) {
                if (!abstractComponentCallbacksC1503hi.f5334y ? abstractComponentCallbacksC1503hi.f5329t.m5421s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final void m5422t(int i) {
        try {
            this.f9493b = true;
            for (C0326Hi c0326Hi : ((HashMap) this.f9494c.f8521b).values()) {
                if (c0326Hi != null) {
                    c0326Hi.f1112e = i;
                }
            }
            m5386M(i, false);
            Iterator it = m5407e().iterator();
            while (it.hasNext()) {
                ((C2276nd) it.next()).m4608e();
            }
            this.f9493b = false;
            m5427y(true);
        } catch (Throwable th) {
            this.f9493b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f9514w;
        if (abstractComponentCallbacksC1503hi != null) {
            sb.append(abstractComponentCallbacksC1503hi.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9514w)));
            sb.append("}");
        } else {
            C2104ji c2104ji = this.f9512u;
            if (c2104ji != null) {
                sb.append(c2104ji.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9512u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m5423u() {
        if (this.f9486I) {
            this.f9486I = false;
            m5401a0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5424v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        AbstractC2580uE abstractC2580uEMo171a;
        String str2;
        String strM407e = AbstractC0213Ey.m407e(str, "    ");
        C2428qs c2428qs = this.f9494c;
        ArrayList arrayList = (ArrayList) c2428qs.f8520a;
        String strM407e2 = AbstractC0213Ey.m407e(str, "    ");
        HashMap map = (HashMap) c2428qs.f8521b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0326Hi c0326Hi : map.values()) {
                printWriter.print(str);
                if (c0326Hi != null) {
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
                    printWriter.println(abstractComponentCallbacksC1503hi);
                    abstractComponentCallbacksC1503hi.getClass();
                    printWriter.print(strM407e2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC1503hi.f5331v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC1503hi.f5332w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC1503hi.f5333x);
                    printWriter.print(strM407e2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5310a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5314e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC1503hi.f5326q);
                    printWriter.print(strM407e2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5320k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5321l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5322m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC1503hi.f5323n);
                    printWriter.print(strM407e2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5334y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5335z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5293B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM407e2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC1503hi.f5292A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC1503hi.f5298G);
                    if (abstractComponentCallbacksC1503hi.f5327r != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5327r);
                    }
                    if (abstractComponentCallbacksC1503hi.f5328s != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5328s);
                    }
                    if (abstractComponentCallbacksC1503hi.f5330u != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5330u);
                    }
                    if (abstractComponentCallbacksC1503hi.f5315f != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5315f);
                    }
                    if (abstractComponentCallbacksC1503hi.f5311b != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5311b);
                    }
                    if (abstractComponentCallbacksC1503hi.f5312c != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5312c);
                    }
                    if (abstractComponentCallbacksC1503hi.f5313d != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5313d);
                    }
                    Object objM4876n = abstractComponentCallbacksC1503hi.f5316g;
                    if (objM4876n == null) {
                        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
                        objM4876n = (abstractC2805zi == null || (str2 = abstractComponentCallbacksC1503hi.f5317h) == null) ? null : abstractC2805zi.f9494c.m4876n(str2);
                    }
                    if (objM4876n != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM4876n);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5318i);
                    }
                    printWriter.print(strM407e2);
                    printWriter.print("mPopDirection=");
                    C1415fi c1415fi = abstractComponentCallbacksC1503hi.f5299H;
                    printWriter.println(c1415fi == null ? false : c1415fi.f4997a);
                    C1415fi c1415fi2 = abstractComponentCallbacksC1503hi.f5299H;
                    if ((c1415fi2 == null ? 0 : c1415fi2.f4998b) != 0) {
                        printWriter.print(strM407e2);
                        printWriter.print("getEnterAnim=");
                        C1415fi c1415fi3 = abstractComponentCallbacksC1503hi.f5299H;
                        printWriter.println(c1415fi3 == null ? 0 : c1415fi3.f4998b);
                    }
                    C1415fi c1415fi4 = abstractComponentCallbacksC1503hi.f5299H;
                    if ((c1415fi4 == null ? 0 : c1415fi4.f4999c) != 0) {
                        printWriter.print(strM407e2);
                        printWriter.print("getExitAnim=");
                        C1415fi c1415fi5 = abstractComponentCallbacksC1503hi.f5299H;
                        printWriter.println(c1415fi5 == null ? 0 : c1415fi5.f4999c);
                    }
                    C1415fi c1415fi6 = abstractComponentCallbacksC1503hi.f5299H;
                    if ((c1415fi6 == null ? 0 : c1415fi6.f5000d) != 0) {
                        printWriter.print(strM407e2);
                        printWriter.print("getPopEnterAnim=");
                        C1415fi c1415fi7 = abstractComponentCallbacksC1503hi.f5299H;
                        printWriter.println(c1415fi7 == null ? 0 : c1415fi7.f5000d);
                    }
                    C1415fi c1415fi8 = abstractComponentCallbacksC1503hi.f5299H;
                    if ((c1415fi8 == null ? 0 : c1415fi8.f5001e) != 0) {
                        printWriter.print(strM407e2);
                        printWriter.print("getPopExitAnim=");
                        C1415fi c1415fi9 = abstractComponentCallbacksC1503hi.f5299H;
                        printWriter.println(c1415fi9 == null ? 0 : c1415fi9.f5001e);
                    }
                    if (abstractComponentCallbacksC1503hi.f5295D != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5295D);
                    }
                    if (abstractComponentCallbacksC1503hi.f5296E != null) {
                        printWriter.print(strM407e2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC1503hi.f5296E);
                    }
                    if (abstractComponentCallbacksC1503hi.m2870d() != null) {
                        C2709xE viewModelStore = abstractComponentCallbacksC1503hi.getViewModelStore();
                        C0111Ci c0111Ci = C0719Qo.f2303e;
                        C2098jc c2098jc = C2098jc.f7385b;
                        String canonicalName = C0719Qo.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                        AbstractC2580uE abstractC2580uE = (AbstractC2580uE) viewModelStore.f9284a.get(strConcat);
                        if (!C0719Qo.class.isInstance(abstractC2580uE)) {
                            C2557ts c2557ts = new C2557ts(c2098jc);
                            c2557ts.m5044a(C1456gf.f5170n, strConcat);
                            try {
                                abstractC2580uEMo171a = c0111Ci.mo2563b(C0719Qo.class, c2557ts);
                            } catch (AbstractMethodError unused) {
                                abstractC2580uEMo171a = c0111Ci.mo171a(C0719Qo.class);
                            }
                            abstractC2580uE = abstractC2580uEMo171a;
                            AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) viewModelStore.f9284a.put(strConcat, abstractC2580uE);
                            if (abstractC2580uE2 != null) {
                                abstractC2580uE2.mo297b();
                            }
                        }
                        C0471Ky c0471Ky = ((C0719Qo) abstractC2580uE).f2304d;
                        if (c0471Ky.f1531c > 0) {
                            printWriter.print(strM407e2);
                            printWriter.println("Loaders:");
                            if (c0471Ky.f1531c > 0) {
                                if (c0471Ky.f1530b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strM407e2);
                                printWriter.print("  #");
                                printWriter.print(c0471Ky.f1529a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM407e2);
                    printWriter.println("Child " + abstractComponentCallbacksC1503hi.f5329t + ":");
                    abstractComponentCallbacksC1503hi.f5329t.m5424v(AbstractC0213Ey.m407e(strM407e2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = (AbstractComponentCallbacksC1503hi) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1503hi2.toString());
            }
        }
        ArrayList arrayList2 = this.f9496e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = (AbstractComponentCallbacksC1503hi) this.f9496e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1503hi3.toString());
            }
        }
        ArrayList arrayList3 = this.f9495d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C1483h5 c1483h5 = (C1483h5) this.f9495d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c1483h5.toString());
                c1483h5.m2843f(strM407e, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9500i.get());
        synchronized (this.f9492a) {
            try {
                int size4 = this.f9492a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC2719xi) this.f9492a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9512u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9513v);
        if (this.f9514w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9514w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9511t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9483F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9484G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9485H);
        if (this.f9482E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9482E);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5425w(InterfaceC2719xi interfaceC2719xi, boolean z) {
        if (!z) {
            if (this.f9512u == null) {
                if (!this.f9485H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m5385L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f9492a) {
            try {
                if (this.f9512u == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9492a.add(interfaceC2719xi);
                    m5395V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5426x(boolean z) {
        if (this.f9493b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9512u == null) {
            if (!this.f9485H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9512u.f7402n.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m5385L()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f9487J == null) {
            this.f9487J = new ArrayList();
            this.f9488K = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5427y(boolean z) {
        boolean zMo2838a;
        m5426x(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f9487J;
            ArrayList arrayList2 = this.f9488K;
            synchronized (this.f9492a) {
                if (this.f9492a.isEmpty()) {
                    zMo2838a = false;
                } else {
                    try {
                        int size = this.f9492a.size();
                        zMo2838a = false;
                        for (int i = 0; i < size; i++) {
                            zMo2838a |= ((InterfaceC2719xi) this.f9492a.get(i)).mo2838a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo2838a) {
                m5405c0();
                m5423u();
                ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f9493b = true;
            try {
                m5392S(this.f9487J, this.f9488K);
            } finally {
                m5406d();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5428z(C1483h5 c1483h5, boolean z) {
        if (z && (this.f9512u == null || this.f9485H)) {
            return;
        }
        m5426x(z);
        c1483h5.mo2838a(this.f9487J, this.f9488K);
        this.f9493b = true;
        try {
            m5392S(this.f9487J, this.f9488K);
            m5406d();
            m5405c0();
            m5423u();
            ((HashMap) this.f9494c.f8521b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m5406d();
            throw th;
        }
    }
}
