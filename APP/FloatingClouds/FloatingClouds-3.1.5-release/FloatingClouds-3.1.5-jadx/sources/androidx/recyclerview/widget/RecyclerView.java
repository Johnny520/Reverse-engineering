package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.C1152R;
import androidx.recyclerview.widget.C1154B;
import androidx.recyclerview.widget.C1155C;
import androidx.recyclerview.widget.C1196a;
import androidx.recyclerview.widget.C1197b;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.C1219x;
import androidx.recyclerview.widget.RunnableC1208m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0016Af;
import p000a.C0032Bc;
import p000a.C0038C;
import p000a.C0051Cc;
import p000a.C0116G5;
import p000a.C0146I;
import p000a.C0176Jb;
import p000a.C0181Jg;
import p000a.C0371U9;
import p000a.C0598ge;
import p000a.C0739o3;
import p000a.C0866ug;
import p000a.C0904wg;
import p000a.C0944z;
import p000a.C0957zc;
import p000a.InterfaceC0013Ac;
import p000a.InterfaceC0158Ib;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0158Ib {

    /* JADX INFO: renamed from: A0 */
    public static final int[] f4808A0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: B0 */
    public static final float f4809B0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: C0 */
    public static final boolean f4810C0 = true;

    /* JADX INFO: renamed from: D0 */
    public static final boolean f4811D0 = true;

    /* JADX INFO: renamed from: E0 */
    public static final Class<?>[] f4812E0;

    /* JADX INFO: renamed from: F0 */
    public static final InterpolatorC1165b f4813F0;

    /* JADX INFO: renamed from: G0 */
    public static final C1187x f4814G0;

    /* JADX INFO: renamed from: y0 */
    public static boolean f4815y0 = false;

    /* JADX INFO: renamed from: z0 */
    public static boolean f4816z0 = false;

    /* JADX INFO: renamed from: A */
    public final AccessibilityManager f4817A;

    /* JADX INFO: renamed from: B */
    public boolean f4818B;

    /* JADX INFO: renamed from: C */
    public boolean f4819C;

    /* JADX INFO: renamed from: D */
    public int f4820D;

    /* JADX INFO: renamed from: E */
    public int f4821E;

    /* JADX INFO: renamed from: F */
    public C1171h f4822F;

    /* JADX INFO: renamed from: G */
    public EdgeEffect f4823G;

    /* JADX INFO: renamed from: H */
    public EdgeEffect f4824H;

    /* JADX INFO: renamed from: I */
    public EdgeEffect f4825I;

    /* JADX INFO: renamed from: J */
    public EdgeEffect f4826J;

    /* JADX INFO: renamed from: K */
    public AbstractC1172i f4827K;

    /* JADX INFO: renamed from: L */
    public int f4828L;

    /* JADX INFO: renamed from: M */
    public int f4829M;

    /* JADX INFO: renamed from: N */
    public VelocityTracker f4830N;

    /* JADX INFO: renamed from: O */
    public int f4831O;

    /* JADX INFO: renamed from: P */
    public int f4832P;

    /* JADX INFO: renamed from: Q */
    public int f4833Q;

    /* JADX INFO: renamed from: R */
    public int f4834R;

    /* JADX INFO: renamed from: S */
    public int f4835S;

    /* JADX INFO: renamed from: T */
    public AbstractC1177n f4836T;

    /* JADX INFO: renamed from: U */
    public final int f4837U;

    /* JADX INFO: renamed from: V */
    public final int f4838V;

    /* JADX INFO: renamed from: W */
    public final float f4839W;

    /* JADX INFO: renamed from: a */
    public final float f4840a;

    /* JADX INFO: renamed from: a0 */
    public final float f4841a0;

    /* JADX INFO: renamed from: b */
    public final C1183t f4842b;

    /* JADX INFO: renamed from: b0 */
    public boolean f4843b0;

    /* JADX INFO: renamed from: c */
    public final C1181r f4844c;

    /* JADX INFO: renamed from: c0 */
    public final RunnableC1189z f4845c0;

    /* JADX INFO: renamed from: d */
    public C1184u f4846d;

    /* JADX INFO: renamed from: d0 */
    public RunnableC1208m f4847d0;

    /* JADX INFO: renamed from: e */
    public final C1196a f4848e;

    /* JADX INFO: renamed from: e0 */
    public final RunnableC1208m.b f4849e0;

    /* JADX INFO: renamed from: f */
    public final C1197b f4850f;

    /* JADX INFO: renamed from: f0 */
    public final C1186w f4851f0;

    /* JADX INFO: renamed from: g */
    public final C1155C f4852g;

    /* JADX INFO: renamed from: g0 */
    public AbstractC1179p f4853g0;

    /* JADX INFO: renamed from: h */
    public boolean f4854h;

    /* JADX INFO: renamed from: h0 */
    public ArrayList f4855h0;

    /* JADX INFO: renamed from: i */
    public final Rect f4856i;

    /* JADX INFO: renamed from: i0 */
    public boolean f4857i0;

    /* JADX INFO: renamed from: j */
    public final Rect f4858j;

    /* JADX INFO: renamed from: j0 */
    public boolean f4859j0;

    /* JADX INFO: renamed from: k */
    public final RectF f4860k;

    /* JADX INFO: renamed from: k0 */
    public final C1173j f4861k0;

    /* JADX INFO: renamed from: l */
    public AbstractC1167d f4862l;

    /* JADX INFO: renamed from: l0 */
    public boolean f4863l0;

    /* JADX INFO: renamed from: m */
    public AbstractC1175l f4864m;

    /* JADX INFO: renamed from: m0 */
    public C1219x f4865m0;

    /* JADX INFO: renamed from: n */
    public InterfaceC1182s f4866n;

    /* JADX INFO: renamed from: n0 */
    public final int[] f4867n0;

    /* JADX INFO: renamed from: o */
    public final ArrayList f4868o;

    /* JADX INFO: renamed from: o0 */
    public C0176Jb f4869o0;

    /* JADX INFO: renamed from: p */
    public final ArrayList<AbstractC1174k> f4870p;

    /* JADX INFO: renamed from: p0 */
    public final int[] f4871p0;

    /* JADX INFO: renamed from: q */
    public final ArrayList<InterfaceC1178o> f4872q;

    /* JADX INFO: renamed from: q0 */
    public final int[] f4873q0;

    /* JADX INFO: renamed from: r */
    public InterfaceC1178o f4874r;

    /* JADX INFO: renamed from: r0 */
    public final int[] f4875r0;

    /* JADX INFO: renamed from: s */
    public boolean f4876s;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f4877s0;

    /* JADX INFO: renamed from: t */
    public boolean f4878t;

    /* JADX INFO: renamed from: t0 */
    public final RunnableC1164a f4879t0;

    /* JADX INFO: renamed from: u */
    public boolean f4880u;

    /* JADX INFO: renamed from: u0 */
    public boolean f4881u0;

    /* JADX INFO: renamed from: v */
    public int f4882v;

    /* JADX INFO: renamed from: v0 */
    public int f4883v0;

    /* JADX INFO: renamed from: w */
    public boolean f4884w;

    /* JADX INFO: renamed from: w0 */
    public int f4885w0;

    /* JADX INFO: renamed from: x */
    public boolean f4886x;

    /* JADX INFO: renamed from: x0 */
    public final C1166c f4887x0;

    /* JADX INFO: renamed from: y */
    public boolean f4888y;

    /* JADX INFO: renamed from: z */
    public int f4889z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$A */
    public static abstract class AbstractC1163A {

        /* JADX INFO: renamed from: t */
        public static final List<Object> f4890t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        public final View f4891a;

        /* JADX INFO: renamed from: b */
        public WeakReference<RecyclerView> f4892b;

        /* JADX INFO: renamed from: j */
        public int f4900j;

        /* JADX INFO: renamed from: r */
        public RecyclerView f4908r;

        /* JADX INFO: renamed from: s */
        public AbstractC1167d<? extends AbstractC1163A> f4909s;

        /* JADX INFO: renamed from: c */
        public int f4893c = -1;

        /* JADX INFO: renamed from: d */
        public int f4894d = -1;

        /* JADX INFO: renamed from: e */
        public long f4895e = -1;

        /* JADX INFO: renamed from: f */
        public int f4896f = -1;

        /* JADX INFO: renamed from: g */
        public int f4897g = -1;

        /* JADX INFO: renamed from: h */
        public AbstractC1163A f4898h = null;

        /* JADX INFO: renamed from: i */
        public AbstractC1163A f4899i = null;

        /* JADX INFO: renamed from: k */
        public final ArrayList f4901k = null;

        /* JADX INFO: renamed from: l */
        public final List<Object> f4902l = null;

        /* JADX INFO: renamed from: m */
        public int f4903m = 0;

        /* JADX INFO: renamed from: n */
        public C1181r f4904n = null;

        /* JADX INFO: renamed from: o */
        public boolean f4905o = false;

        /* JADX INFO: renamed from: p */
        public int f4906p = 0;

        /* JADX INFO: renamed from: q */
        public int f4907q = -1;

        public AbstractC1163A(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f4891a = view;
        }

        /* JADX INFO: renamed from: a */
        public final void m2795a(int i) {
            this.f4900j = i | this.f4900j;
        }

        /* JADX INFO: renamed from: b */
        public final int m2796b() {
            int i = this.f4897g;
            return i == -1 ? this.f4893c : i;
        }

        /* JADX INFO: renamed from: c */
        public final List<Object> m2797c() {
            ArrayList arrayList;
            return ((this.f4900j & 1024) != 0 || (arrayList = this.f4901k) == null || arrayList.size() == 0) ? f4890t : this.f4902l;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m2798d() {
            View view = this.f4891a;
            return (view.getParent() == null || view.getParent() == this.f4908r) ? false : true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m2799e() {
            return (this.f4900j & 1) != 0;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m2800f() {
            return (this.f4900j & 4) != 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m2801g() {
            if ((this.f4900j & 16) != 0) {
                return false;
            }
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            return !this.f4891a.hasTransientState();
        }

        /* JADX INFO: renamed from: h */
        public final boolean m2802h() {
            return (this.f4900j & 8) != 0;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m2803i() {
            return this.f4904n != null;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m2804j() {
            return (this.f4900j & 256) != 0;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m2805k() {
            return (this.f4900j & 2) != 0;
        }

        /* JADX INFO: renamed from: l */
        public final void m2806l(int i, boolean z) {
            if (this.f4894d == -1) {
                this.f4894d = this.f4893c;
            }
            if (this.f4897g == -1) {
                this.f4897g = this.f4893c;
            }
            if (z) {
                this.f4897g += i;
            }
            this.f4893c += i;
            View view = this.f4891a;
            if (view.getLayoutParams() != null) {
                ((C1176m) view.getLayoutParams()).f4949c = true;
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m2807m() {
            if (RecyclerView.f4815y0 && m2804j()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f4900j = 0;
            this.f4893c = -1;
            this.f4894d = -1;
            this.f4895e = -1L;
            this.f4897g = -1;
            this.f4903m = 0;
            this.f4898h = null;
            this.f4899i = null;
            ArrayList arrayList = this.f4901k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f4900j &= -1025;
            this.f4906p = 0;
            this.f4907q = -1;
            RecyclerView.m2742l(this);
        }

        /* JADX INFO: renamed from: n */
        public final void m2808n(boolean z) {
            int i = this.f4903m;
            int i2 = z ? i - 1 : i + 1;
            this.f4903m = i2;
            if (i2 < 0) {
                this.f4903m = 0;
                if (RecyclerView.f4815y0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.f4900j |= 16;
            } else if (z && i2 == 0) {
                this.f4900j &= -17;
            }
            if (RecyclerView.f4816z0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        /* JADX INFO: renamed from: o */
        public final boolean m2809o() {
            return (this.f4900j & 128) != 0;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m2810p() {
            return (this.f4900j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4893c + " id=" + this.f4895e + ", oldPos=" + this.f4894d + ", pLpos:" + this.f4897g);
            if (m2803i()) {
                sb.append(" scrap ");
                sb.append(this.f4905o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m2800f()) {
                sb.append(" invalid");
            }
            if (!m2799e()) {
                sb.append(" unbound");
            }
            if ((this.f4900j & 2) != 0) {
                sb.append(" update");
            }
            if (m2802h()) {
                sb.append(" removed");
            }
            if (m2809o()) {
                sb.append(" ignored");
            }
            if (m2804j()) {
                sb.append(" tmpDetached");
            }
            if (!m2801g()) {
                sb.append(" not recyclable(" + this.f4903m + ")");
            }
            if ((this.f4900j & 512) != 0 || m2800f()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4891a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC1164a implements Runnable {
        public RunnableC1164a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            RecyclerView recyclerView = RecyclerView.this;
            AbstractC1172i abstractC1172i = recyclerView.f4827K;
            if (abstractC1172i != null) {
                C1206k c1206k = (C1206k) abstractC1172i;
                ArrayList<AbstractC1163A> arrayList = c1206k.f5101h;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList<C1206k.b> arrayList2 = c1206k.f5103j;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList<C1206k.a> arrayList3 = c1206k.f5104k;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList<AbstractC1163A> arrayList4 = c1206k.f5102i;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    Iterator<AbstractC1163A> it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        j = c1206k.f4920d;
                        if (!zHasNext) {
                            break;
                        }
                        AbstractC1163A next = it.next();
                        View view = next.f4891a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1206k.f5110q.add(next);
                        viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1201f(view, viewPropertyAnimatorAnimate, c1206k, next)).start();
                        arrayList = arrayList;
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList<C1206k.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        c1206k.f5106m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC1198c runnableC1198c = new RunnableC1198c(c1206k, arrayList5);
                        if (zIsEmpty) {
                            runnableC1198c.run();
                        } else {
                            View view2 = arrayList5.get(0).f5118a.f4891a;
                            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                            view2.postOnAnimationDelayed(runnableC1198c, j);
                        }
                    }
                    if (!zIsEmpty3) {
                        ArrayList<C1206k.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        c1206k.f5107n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC1199d runnableC1199d = new RunnableC1199d(c1206k, arrayList6);
                        if (zIsEmpty) {
                            runnableC1199d.run();
                        } else {
                            View view3 = arrayList6.get(0).f5112a.f4891a;
                            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                            view3.postOnAnimationDelayed(runnableC1199d, j);
                        }
                    }
                    if (!zIsEmpty4) {
                        ArrayList<AbstractC1163A> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        c1206k.f5105l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC1200e runnableC1200e = new RunnableC1200e(c1206k, arrayList7);
                        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                            runnableC1200e.run();
                        } else {
                            if (zIsEmpty) {
                                j = 0;
                            }
                            long jMax = Math.max(!zIsEmpty2 ? c1206k.f4921e : 0L, zIsEmpty3 ? 0L : c1206k.f4922f) + j;
                            View view4 = arrayList7.get(0).f4891a;
                            WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                            view4.postOnAnimationDelayed(runnableC1200e, jMax);
                        }
                    }
                }
            }
            recyclerView.f4863l0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class InterpolatorC1165b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C1166c {
        public C1166c() {
        }

        /* JADX INFO: renamed from: a */
        public final void m2811a(AbstractC1163A abstractC1163A, AbstractC1172i.b bVar, AbstractC1172i.b bVar2) {
            boolean zMo2962g;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            abstractC1163A.m2808n(false);
            AbstractC1221z abstractC1221z = (AbstractC1221z) recyclerView.f4827K;
            abstractC1221z.getClass();
            if (bVar == null || ((i = bVar.f4923a) == (i2 = bVar2.f4923a) && bVar.f4924b == bVar2.f4924b)) {
                C1206k c1206k = (C1206k) abstractC1221z;
                c1206k.m2966l(abstractC1163A);
                abstractC1163A.f4891a.setAlpha(0.0f);
                c1206k.f5102i.add(abstractC1163A);
                zMo2962g = true;
            } else {
                zMo2962g = abstractC1221z.mo2962g(abstractC1163A, i, bVar.f4924b, i2, bVar2.f4924b);
            }
            if (zMo2962g) {
                recyclerView.m2763V();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2812b(AbstractC1163A abstractC1163A, AbstractC1172i.b bVar, AbstractC1172i.b bVar2) {
            boolean zMo2962g;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4844c.m2879l(abstractC1163A);
            recyclerView.m2775h(abstractC1163A);
            abstractC1163A.m2808n(false);
            AbstractC1221z abstractC1221z = (AbstractC1221z) recyclerView.f4827K;
            abstractC1221z.getClass();
            int i = bVar.f4923a;
            int i2 = bVar.f4924b;
            View view = abstractC1163A.f4891a;
            int left = bVar2 == null ? view.getLeft() : bVar2.f4923a;
            int top2 = bVar2 == null ? view.getTop() : bVar2.f4924b;
            if (abstractC1163A.m2802h() || (i == left && i2 == top2)) {
                C1206k c1206k = (C1206k) abstractC1221z;
                c1206k.m2966l(abstractC1163A);
                c1206k.f5101h.add(abstractC1163A);
                zMo2962g = true;
            } else {
                view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                zMo2962g = abstractC1221z.mo2962g(abstractC1163A, i, i2, left, top2);
            }
            if (zMo2962g) {
                recyclerView.m2763V();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public static abstract class AbstractC1167d<VH extends AbstractC1163A> {

        /* JADX INFO: renamed from: a */
        public final C1168e f4912a = new C1168e();

        /* JADX INFO: renamed from: b */
        public boolean f4913b = false;

        /* JADX INFO: renamed from: c */
        public final a f4914c = a.f4915a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public static final a f4915a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ a[] f4916b;

            static {
                a aVar = new a("ALLOW", 0);
                f4915a = aVar;
                f4916b = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f4916b.clone();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo109a();

        /* JADX INFO: renamed from: b */
        public long mo2813b(int i) {
            return -1L;
        }

        /* JADX INFO: renamed from: c */
        public int mo1072c(int i) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo110d(VH vh, int i);

        /* JADX INFO: renamed from: e */
        public abstract VH mo111e(ViewGroup viewGroup, int i);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static class C1168e extends Observable<AbstractC1169f> {
        /* JADX INFO: renamed from: a */
        public final boolean m2814a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public final void m2815b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1169f) ((Observable) this).mObservers.get(size)).mo2816a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static abstract class AbstractC1169f {
        /* JADX INFO: renamed from: a */
        public void mo2816a() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public interface InterfaceC1170g {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C1171h {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC1172i {

        /* JADX INFO: renamed from: a */
        public C1173j f4917a;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f4918b;

        /* JADX INFO: renamed from: c */
        public long f4919c;

        /* JADX INFO: renamed from: d */
        public long f4920d;

        /* JADX INFO: renamed from: e */
        public long f4921e;

        /* JADX INFO: renamed from: f */
        public long f4922f;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m2823a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f4923a;

            /* JADX INFO: renamed from: b */
            public int f4924b;

            /* JADX INFO: renamed from: a */
            public final void m2824a(AbstractC1163A abstractC1163A) {
                View view = abstractC1163A.f4891a;
                this.f4923a = view.getLeft();
                this.f4924b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m2817b(AbstractC1163A abstractC1163A) {
            RecyclerView recyclerView;
            int i = abstractC1163A.f4900j;
            if (abstractC1163A.m2800f() || (i & 4) != 0 || (recyclerView = abstractC1163A.f4908r) == null) {
                return;
            }
            recyclerView.m2751I(abstractC1163A);
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo2818a(AbstractC1163A abstractC1163A, AbstractC1163A abstractC1163A2, b bVar, b bVar2);

        /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2819c(AbstractC1163A abstractC1163A) {
            C1173j c1173j = this.f4917a;
            if (c1173j != null) {
                boolean z = true;
                abstractC1163A.m2808n(true);
                if (abstractC1163A.f4898h != null && abstractC1163A.f4899i == null) {
                    abstractC1163A.f4898h = null;
                }
                abstractC1163A.f4899i = null;
                if ((abstractC1163A.f4900j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m2776h0();
                C1197b c1197b = recyclerView.f4850f;
                C1197b.a aVar = c1197b.f5066b;
                C1217v c1217v = c1197b.f5065a;
                int i = c1197b.f5068d;
                View view = abstractC1163A.f4891a;
                if (i != 1) {
                    if (i == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        c1197b.f5068d = 2;
                        int iIndexOfChild = c1217v.f5197a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            c1197b.m2952j(view);
                        } else if (aVar.m2956d(iIndexOfChild)) {
                            aVar.m2958f(iIndexOfChild);
                            c1197b.m2952j(view);
                            c1217v.m2998a(iIndexOfChild);
                        }
                        if (z) {
                            AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
                            C1181r c1181r = recyclerView.f4844c;
                            c1181r.m2879l(abstractC1163AM2735L);
                            c1181r.m2876i(abstractC1163AM2735L);
                            if (RecyclerView.f4816z0) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.m2778i0(!z);
                        if (z && abstractC1163A.m2804j()) {
                            recyclerView.removeDetachedView(view, false);
                            return;
                        }
                    } finally {
                        c1197b.f5068d = 0;
                    }
                }
                if (c1197b.f5069e != view) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z = false;
                if (z) {
                }
                recyclerView.m2778i0(!z);
                if (z) {
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo2820d(AbstractC1163A abstractC1163A);

        /* JADX INFO: renamed from: e */
        public abstract void mo2821e();

        /* JADX INFO: renamed from: f */
        public abstract boolean mo2822f();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public class C1173j {
        public C1173j() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static abstract class AbstractC1174k {
        /* JADX INFO: renamed from: c */
        public void mo312c(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: d */
        public void mo2825d(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC1175l {

        /* JADX INFO: renamed from: a */
        public C1197b f4926a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f4927b;

        /* JADX INFO: renamed from: c */
        public final C1154B f4928c;

        /* JADX INFO: renamed from: d */
        public final C1154B f4929d;

        /* JADX INFO: renamed from: e */
        public C1210o f4930e;

        /* JADX INFO: renamed from: f */
        public boolean f4931f;

        /* JADX INFO: renamed from: g */
        public boolean f4932g;

        /* JADX INFO: renamed from: h */
        public final boolean f4933h;

        /* JADX INFO: renamed from: i */
        public final boolean f4934i;

        /* JADX INFO: renamed from: j */
        public int f4935j;

        /* JADX INFO: renamed from: k */
        public boolean f4936k;

        /* JADX INFO: renamed from: l */
        public int f4937l;

        /* JADX INFO: renamed from: m */
        public int f4938m;

        /* JADX INFO: renamed from: n */
        public int f4939n;

        /* JADX INFO: renamed from: o */
        public int f4940o;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public class a implements C1154B.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: a */
            public final View mo2637a(int i) {
                return AbstractC1175l.this.m2858u(i);
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: b */
            public final int mo2638b() {
                AbstractC1175l abstractC1175l = AbstractC1175l.this;
                return abstractC1175l.f4939n - abstractC1175l.m2839F();
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: c */
            public final int mo2639c() {
                return AbstractC1175l.this.m2838E();
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: d */
            public final int mo2640d(View view) {
                return view.getRight() + ((C1176m) view.getLayoutParams()).f4948b.right + ((ViewGroup.MarginLayoutParams) ((C1176m) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: e */
            public final int mo2641e(View view) {
                return (view.getLeft() - ((C1176m) view.getLayoutParams()).f4948b.left) - ((ViewGroup.MarginLayoutParams) ((C1176m) view.getLayoutParams())).leftMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public class b implements C1154B.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: a */
            public final View mo2637a(int i) {
                return AbstractC1175l.this.m2858u(i);
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: b */
            public final int mo2638b() {
                AbstractC1175l abstractC1175l = AbstractC1175l.this;
                return abstractC1175l.f4940o - abstractC1175l.m2837D();
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: c */
            public final int mo2639c() {
                return AbstractC1175l.this.m2840G();
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: d */
            public final int mo2640d(View view) {
                return view.getBottom() + ((C1176m) view.getLayoutParams()).f4948b.bottom + ((ViewGroup.MarginLayoutParams) ((C1176m) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C1154B.b
            /* JADX INFO: renamed from: e */
            public final int mo2641e(View view) {
                return (view.getTop() - ((C1176m) view.getLayoutParams()).f4948b.top) - ((ViewGroup.MarginLayoutParams) ((C1176m) view.getLayoutParams())).topMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f4943a;

            /* JADX INFO: renamed from: b */
            public int f4944b;

            /* JADX INFO: renamed from: c */
            public boolean f4945c;

            /* JADX INFO: renamed from: d */
            public boolean f4946d;
        }

        public AbstractC1175l() {
            a aVar = new a();
            b bVar = new b();
            this.f4928c = new C1154B(aVar);
            this.f4929d = new C1154B(bVar);
            this.f4931f = false;
            this.f4932g = false;
            this.f4933h = true;
            this.f4934i = true;
        }

        /* JADX INFO: renamed from: A */
        public static int m2826A(View view) {
            Rect rect = ((C1176m) view.getLayoutParams()).f4948b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: H */
        public static int m2827H(View view) {
            return ((C1176m) view.getLayoutParams()).f4947a.m2796b();
        }

        /* JADX INFO: renamed from: I */
        public static c m2828I(Context context, AttributeSet attributeSet, int i, int i2) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1152R.styleable.RecyclerView, i, i2);
            cVar.f4943a = typedArrayObtainStyledAttributes.getInt(C1152R.styleable.RecyclerView_android_orientation, 1);
            cVar.f4944b = typedArrayObtainStyledAttributes.getInt(C1152R.styleable.RecyclerView_spanCount, 1);
            cVar.f4945c = typedArrayObtainStyledAttributes.getBoolean(C1152R.styleable.RecyclerView_reverseLayout, false);
            cVar.f4946d = typedArrayObtainStyledAttributes.getBoolean(C1152R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        /* JADX INFO: renamed from: M */
        public static boolean m2829M(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX INFO: renamed from: N */
        public static void m2830N(View view, int i, int i2, int i3, int i4) {
            C1176m c1176m = (C1176m) view.getLayoutParams();
            Rect rect = c1176m.f4948b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1176m).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1176m).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1176m).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin);
        }

        /* JADX INFO: renamed from: g */
        public static int m2831g(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX INFO: renamed from: w */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m2832w(boolean z, int i, int i2, int i3, int i4) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i4 = iMax;
                        i2 = Integer.MIN_VALUE;
                    } else {
                        i4 = iMax;
                        i2 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* JADX INFO: renamed from: z */
        public static int m2833z(View view) {
            Rect rect = ((C1176m) view.getLayoutParams()).f4948b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: A0 */
        public final void m2834A0(C1210o c1210o) {
            C1210o c1210o2 = this.f4930e;
            if (c1210o2 != null && c1210o != c1210o2 && c1210o2.f4972e) {
                c1210o2.m2884d();
            }
            this.f4930e = c1210o;
            RecyclerView recyclerView = this.f4927b;
            RunnableC1189z runnableC1189z = recyclerView.f4845c0;
            RecyclerView.this.removeCallbacks(runnableC1189z);
            runnableC1189z.f4999c.abortAnimation();
            if (c1210o.f4975h) {
                Log.w("RecyclerView", "An instance of " + c1210o.getClass().getSimpleName() + " was started more than once. Each instance of" + c1210o.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            c1210o.f4969b = recyclerView;
            c1210o.f4970c = this;
            int i = c1210o.f4968a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f4851f0.f4983a = i;
            c1210o.f4972e = true;
            c1210o.f4971d = true;
            c1210o.f4973f = recyclerView.f4864m.mo2726q(i);
            c1210o.f4969b.f4845c0.m2889b();
            c1210o.f4975h = true;
        }

        /* JADX INFO: renamed from: B */
        public final int m2835B() {
            RecyclerView recyclerView = this.f4927b;
            AbstractC1167d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo109a();
            }
            return 0;
        }

        /* JADX INFO: renamed from: B0 */
        public boolean mo2647B0() {
            return false;
        }

        /* JADX INFO: renamed from: C */
        public final int m2836C() {
            RecyclerView recyclerView = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            return recyclerView.getLayoutDirection();
        }

        /* JADX INFO: renamed from: D */
        public final int m2837D() {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: E */
        public final int m2838E() {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: F */
        public final int m2839F() {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: G */
        public final int m2840G() {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: J */
        public int mo2649J(C1181r c1181r, C1186w c1186w) {
            return -1;
        }

        /* JADX INFO: renamed from: K */
        public final void m2841K(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C1176m) view.getLayoutParams()).f4948b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f4927b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4927b.f4860k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: L */
        public boolean mo2695L() {
            return false;
        }

        /* JADX INFO: renamed from: O */
        public void mo2842O(int i) {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                int iM2947e = recyclerView.f4850f.m2947e();
                for (int i2 = 0; i2 < iM2947e; i2++) {
                    recyclerView.f4850f.m2946d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* JADX INFO: renamed from: P */
        public void mo2843P(int i) {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                int iM2947e = recyclerView.f4850f.m2947e();
                for (int i2 = 0; i2 < iM2947e; i2++) {
                    recyclerView.f4850f.m2946d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* JADX INFO: renamed from: Q */
        public void mo2844Q() {
        }

        /* JADX INFO: renamed from: R */
        public void mo2845R(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: S */
        public void mo2702S(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: T */
        public View mo2651T(View view, int i, C1181r c1181r, C1186w c1186w) {
            return null;
        }

        /* JADX INFO: renamed from: U */
        public void mo2705U(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4927b;
            C1181r c1181r = recyclerView.f4844c;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4927b.canScrollVertically(-1) && !this.f4927b.canScrollHorizontally(-1) && !this.f4927b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC1167d abstractC1167d = this.f4927b.f4862l;
            if (abstractC1167d != null) {
                accessibilityEvent.setItemCount(abstractC1167d.mo109a());
            }
        }

        /* JADX INFO: renamed from: V */
        public void mo2652V(C1181r c1181r, C1186w c1186w, C0146I c0146i) {
            if (this.f4927b.canScrollVertically(-1) || this.f4927b.canScrollHorizontally(-1)) {
                c0146i.m376a(8192);
                c0146i.m383i(true);
            }
            if (this.f4927b.canScrollVertically(1) || this.f4927b.canScrollHorizontally(1)) {
                c0146i.m376a(4096);
                c0146i.m383i(true);
            }
            c0146i.f505a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo2649J(c1181r, c1186w), mo2684x(c1181r, c1186w), false, 0));
        }

        /* JADX INFO: renamed from: W */
        public final void m2846W(View view, C0146I c0146i) {
            AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
            if (abstractC1163AM2735L == null || abstractC1163AM2735L.m2802h() || this.f4926a.f5067c.contains(abstractC1163AM2735L.f4891a)) {
                return;
            }
            RecyclerView recyclerView = this.f4927b;
            mo2655X(recyclerView.f4844c, recyclerView.f4851f0, view, c0146i);
        }

        /* JADX INFO: renamed from: X */
        public void mo2655X(C1181r c1181r, C1186w c1186w, View view, C0146I c0146i) {
        }

        /* JADX INFO: renamed from: Y */
        public void mo2656Y(int i, int i2) {
        }

        /* JADX INFO: renamed from: Z */
        public void mo2657Z() {
        }

        /* JADX INFO: renamed from: a0 */
        public void mo2658a0(int i, int i2) {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2847b(View view, int i, boolean z) {
            int iM2954b;
            AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
            if (z || abstractC1163AM2735L.m2802h()) {
                C0598ge<AbstractC1163A, C1155C.a> c0598ge = this.f4927b.f4852g.f4751a;
                C1155C.a orDefault = c0598ge.getOrDefault(abstractC1163AM2735L, null);
                if (orDefault == null) {
                    orDefault = C1155C.a.m2646a();
                    c0598ge.put(abstractC1163AM2735L, orDefault);
                }
                orDefault.f4754a |= 1;
            } else {
                this.f4927b.f4852g.m2644c(abstractC1163AM2735L);
            }
            C1176m c1176m = (C1176m) view.getLayoutParams();
            if (abstractC1163AM2735L.m2810p() || abstractC1163AM2735L.m2803i()) {
                if (abstractC1163AM2735L.m2803i()) {
                    abstractC1163AM2735L.f4904n.m2879l(abstractC1163AM2735L);
                } else {
                    abstractC1163AM2735L.f4900j &= -33;
                }
                this.f4926a.m2944b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f4927b) {
                    C1197b c1197b = this.f4926a;
                    int iIndexOfChild = c1197b.f5065a.f5197a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        iM2954b = -1;
                        if (i == -1) {
                            i = this.f4926a.m2947e();
                        }
                        if (iM2954b != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f4927b.indexOfChild(view));
                            throw new IllegalStateException(C0944z.m2224d(this.f4927b, sb));
                        }
                        if (iM2954b != i) {
                            AbstractC1175l abstractC1175l = this.f4927b.f4864m;
                            View viewM2858u = abstractC1175l.m2858u(iM2954b);
                            if (viewM2858u == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2954b + abstractC1175l.f4927b.toString());
                            }
                            abstractC1175l.m2858u(iM2954b);
                            abstractC1175l.f4926a.m2945c(iM2954b);
                            C1176m c1176m2 = (C1176m) viewM2858u.getLayoutParams();
                            AbstractC1163A abstractC1163AM2735L2 = RecyclerView.m2735L(viewM2858u);
                            if (abstractC1163AM2735L2.m2802h()) {
                                C0598ge<AbstractC1163A, C1155C.a> c0598ge2 = abstractC1175l.f4927b.f4852g.f4751a;
                                C1155C.a orDefault2 = c0598ge2.getOrDefault(abstractC1163AM2735L2, null);
                                if (orDefault2 == null) {
                                    orDefault2 = C1155C.a.m2646a();
                                    c0598ge2.put(abstractC1163AM2735L2, orDefault2);
                                }
                                orDefault2.f4754a = 1 | orDefault2.f4754a;
                            } else {
                                abstractC1175l.f4927b.f4852g.m2644c(abstractC1163AM2735L2);
                            }
                            abstractC1175l.f4926a.m2944b(viewM2858u, i, c1176m2, abstractC1163AM2735L2.m2802h());
                        }
                    } else {
                        C1197b.a aVar = c1197b.f5066b;
                        if (!aVar.m2956d(iIndexOfChild)) {
                            iM2954b = iIndexOfChild - aVar.m2954b(iIndexOfChild);
                        }
                        if (i == -1) {
                        }
                        if (iM2954b != -1) {
                        }
                    }
                } else {
                    this.f4926a.m2943a(view, i, false);
                    c1176m.f4949c = true;
                    C1210o c1210o = this.f4930e;
                    if (c1210o != null && c1210o.f4972e) {
                        c1210o.f4969b.getClass();
                        AbstractC1163A abstractC1163AM2735L3 = RecyclerView.m2735L(view);
                        if ((abstractC1163AM2735L3 != null ? abstractC1163AM2735L3.m2796b() : -1) == c1210o.f4968a) {
                            c1210o.f4973f = view;
                            if (RecyclerView.f4816z0) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (c1176m.f4950d) {
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + c1176m.f4947a);
                }
                abstractC1163AM2735L.f4891a.invalidate();
                c1176m.f4950d = false;
            }
        }

        /* JADX INFO: renamed from: b0 */
        public void mo2659b0(int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: c */
        public void mo2713c(String str) {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                recyclerView.m2781k(str);
            }
        }

        /* JADX INFO: renamed from: c0 */
        public void mo2660c0(int i, int i2) {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo2714d() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: d0 */
        public void mo2662d0(C1181r c1181r, C1186w c1186w) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: e */
        public boolean mo2716e() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: e0 */
        public void mo2663e0(C1186w c1186w) {
        }

        /* JADX INFO: renamed from: f */
        public boolean mo2664f(C1176m c1176m) {
            return c1176m != null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: f0 */
        public void mo2718f0(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: g0 */
        public Parcelable mo2720g0() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: h */
        public void mo2721h(int i, int i2, C1186w c1186w, RunnableC1208m.b bVar) {
        }

        /* JADX INFO: renamed from: h0 */
        public void mo2848h0(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: i */
        public void mo2722i(int i, RunnableC1208m.b bVar) {
        }

        /* JADX INFO: renamed from: i0 */
        public final void m2849i0(C1181r c1181r) {
            for (int iM2860v = m2860v() - 1; iM2860v >= 0; iM2860v--) {
                if (!RecyclerView.m2735L(m2858u(iM2860v)).m2809o()) {
                    View viewM2858u = m2858u(iM2860v);
                    m2852l0(iM2860v);
                    c1181r.m2875h(viewM2858u);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public int mo2723j(C1186w c1186w) {
            return 0;
        }

        /* JADX INFO: renamed from: j0 */
        public final void m2850j0(C1181r c1181r) {
            ArrayList<AbstractC1163A> arrayList;
            int size = c1181r.f4958a.size();
            int i = size - 1;
            while (true) {
                arrayList = c1181r.f4958a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).f4891a;
                AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
                if (!abstractC1163AM2735L.m2809o()) {
                    abstractC1163AM2735L.m2808n(false);
                    if (abstractC1163AM2735L.m2804j()) {
                        this.f4927b.removeDetachedView(view, false);
                    }
                    AbstractC1172i abstractC1172i = this.f4927b.f4827K;
                    if (abstractC1172i != null) {
                        abstractC1172i.mo2820d(abstractC1163AM2735L);
                    }
                    abstractC1163AM2735L.m2808n(true);
                    AbstractC1163A abstractC1163AM2735L2 = RecyclerView.m2735L(view);
                    abstractC1163AM2735L2.f4904n = null;
                    abstractC1163AM2735L2.f4905o = false;
                    abstractC1163AM2735L2.f4900j &= -33;
                    c1181r.m2876i(abstractC1163AM2735L2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<AbstractC1163A> arrayList2 = c1181r.f4959b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f4927b.invalidate();
            }
        }

        /* JADX INFO: renamed from: k */
        public int mo2669k(C1186w c1186w) {
            return 0;
        }

        /* JADX INFO: renamed from: k0 */
        public final void m2851k0(View view, C1181r c1181r) {
            C1197b c1197b = this.f4926a;
            C1217v c1217v = c1197b.f5065a;
            int i = c1197b.f5068d;
            if (i == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                c1197b.f5068d = 1;
                c1197b.f5069e = view;
                int iIndexOfChild = c1217v.f5197a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (c1197b.f5066b.m2958f(iIndexOfChild)) {
                        c1197b.m2952j(view);
                    }
                    c1217v.m2998a(iIndexOfChild);
                }
                c1197b.f5068d = 0;
                c1197b.f5069e = null;
                c1181r.m2875h(view);
            } catch (Throwable th) {
                c1197b.f5068d = 0;
                c1197b.f5069e = null;
                throw th;
            }
        }

        /* JADX INFO: renamed from: l */
        public int mo2671l(C1186w c1186w) {
            return 0;
        }

        /* JADX INFO: renamed from: l0 */
        public final void m2852l0(int i) {
            if (m2858u(i) != null) {
                C1197b c1197b = this.f4926a;
                C1217v c1217v = c1197b.f5065a;
                int i2 = c1197b.f5068d;
                if (i2 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i2 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iM2948f = c1197b.m2948f(i);
                    View childAt = c1217v.f5197a.getChildAt(iM2948f);
                    if (childAt != null) {
                        c1197b.f5068d = 1;
                        c1197b.f5069e = childAt;
                        if (c1197b.f5066b.m2958f(iM2948f)) {
                            c1197b.m2952j(childAt);
                        }
                        c1217v.m2998a(iM2948f);
                    }
                    c1197b.f5068d = 0;
                    c1197b.f5069e = null;
                } catch (Throwable th) {
                    c1197b.f5068d = 0;
                    c1197b.f5069e = null;
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public int mo2724m(C1186w c1186w) {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /* JADX INFO: renamed from: m0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo2853m0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int iM2838E = m2838E();
            int iM2840G = m2840G();
            int iM2839F = this.f4939n - m2839F();
            int iM2837D = this.f4940o - m2837D();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top2 = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top2;
            int i = left - iM2838E;
            int iMin = Math.min(0, i);
            int i2 = top2 - iM2840G;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iM2839F;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iM2837D);
            if (m2836C() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int iM2838E2 = m2838E();
                    int iM2840G2 = m2840G();
                    int iM2839F2 = this.f4939n - m2839F();
                    int iM2837D2 = this.f4940o - m2837D();
                    Rect rect2 = this.f4927b.f4856i;
                    mo2863y(focusedChild, rect2);
                    if (rect2.left - i4 < iM2839F2 && rect2.right - i4 > iM2838E2 && rect2.top - i5 < iM2837D2 && rect2.bottom - i5 > iM2840G2) {
                    }
                }
            } else if (i4 != 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.m2774g0(i4, i5, false);
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: n */
        public int mo2674n(C1186w c1186w) {
            return 0;
        }

        /* JADX INFO: renamed from: n0 */
        public final void m2854n0() {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: o */
        public int mo2676o(C1186w c1186w) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: o0 */
        public int mo2677o0(int i, C1181r c1181r, C1186w c1186w) {
            return 0;
        }

        /* JADX INFO: renamed from: p */
        public final void m2855p(C1181r c1181r) {
            for (int iM2860v = m2860v() - 1; iM2860v >= 0; iM2860v--) {
                View viewM2858u = m2858u(iM2860v);
                AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(viewM2858u);
                if (abstractC1163AM2735L.m2809o()) {
                    if (RecyclerView.f4816z0) {
                        Log.d("RecyclerView", "ignoring view " + abstractC1163AM2735L);
                    }
                } else if (!abstractC1163AM2735L.m2800f() || abstractC1163AM2735L.m2802h() || this.f4927b.f4862l.f4913b) {
                    m2858u(iM2860v);
                    this.f4926a.m2945c(iM2860v);
                    c1181r.m2877j(viewM2858u);
                    this.f4927b.f4852g.m2644c(abstractC1163AM2735L);
                } else {
                    m2852l0(iM2860v);
                    c1181r.m2876i(abstractC1163AM2735L);
                }
            }
        }

        /* JADX INFO: renamed from: p0 */
        public void mo2725p0(int i) {
            if (RecyclerView.f4816z0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        /* JADX INFO: renamed from: q */
        public View mo2726q(int i) {
            int iM2860v = m2860v();
            for (int i2 = 0; i2 < iM2860v; i2++) {
                View viewM2858u = m2858u(i2);
                AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(viewM2858u);
                if (abstractC1163AM2735L != null && abstractC1163AM2735L.m2796b() == i && !abstractC1163AM2735L.m2809o() && (this.f4927b.f4851f0.f4989g || !abstractC1163AM2735L.m2802h())) {
                    return viewM2858u;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: q0 */
        public int mo2679q0(int i, C1181r c1181r, C1186w c1186w) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: r */
        public abstract C1176m mo2680r();

        /* JADX INFO: renamed from: r0 */
        public final void m2856r0(RecyclerView recyclerView) {
            m2857s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: s */
        public C1176m mo2681s(Context context, AttributeSet attributeSet) {
            return new C1176m(context, attributeSet);
        }

        /* JADX INFO: renamed from: s0 */
        public final void m2857s0(int i, int i2) {
            this.f4939n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4937l = mode;
            if (mode == 0 && !RecyclerView.f4810C0) {
                this.f4939n = 0;
            }
            this.f4940o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4938m = mode2;
            if (mode2 != 0 || RecyclerView.f4810C0) {
                return;
            }
            this.f4940o = 0;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: t */
        public C1176m mo2682t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1176m ? new C1176m((C1176m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1176m((ViewGroup.MarginLayoutParams) layoutParams) : new C1176m(layoutParams);
        }

        /* JADX INFO: renamed from: t0 */
        public void mo2683t0(Rect rect, int i, int i2) {
            int iM2839F = m2839F() + m2838E() + rect.width();
            int iM2837D = m2837D() + m2840G() + rect.height();
            RecyclerView recyclerView = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            this.f4927b.setMeasuredDimension(m2831g(i, iM2839F, recyclerView.getMinimumWidth()), m2831g(i2, iM2837D, this.f4927b.getMinimumHeight()));
        }

        /* JADX INFO: renamed from: u */
        public final View m2858u(int i) {
            C1197b c1197b = this.f4926a;
            if (c1197b != null) {
                return c1197b.m2946d(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: u0 */
        public final void m2859u0(int i, int i2) {
            int iM2860v = m2860v();
            if (iM2860v == 0) {
                this.f4927b.m2785q(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iM2860v; i7++) {
                View viewM2858u = m2858u(i7);
                Rect rect = this.f4927b.f4856i;
                mo2863y(viewM2858u, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f4927b.f4856i.set(i6, i4, i3, i5);
            mo2683t0(this.f4927b.f4856i, i, i2);
        }

        /* JADX INFO: renamed from: v */
        public final int m2860v() {
            C1197b c1197b = this.f4926a;
            if (c1197b != null) {
                return c1197b.m2947e();
            }
            return 0;
        }

        /* JADX INFO: renamed from: v0 */
        public final void m2861v0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4927b = null;
                this.f4926a = null;
                this.f4939n = 0;
                this.f4940o = 0;
            } else {
                this.f4927b = recyclerView;
                this.f4926a = recyclerView.f4850f;
                this.f4939n = recyclerView.getWidth();
                this.f4940o = recyclerView.getHeight();
            }
            this.f4937l = 1073741824;
            this.f4938m = 1073741824;
        }

        /* JADX INFO: renamed from: w0 */
        public final boolean m2862w0(View view, int i, int i2, C1176m c1176m) {
            return (!view.isLayoutRequested() && this.f4933h && m2829M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1176m).width) && m2829M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1176m).height)) ? false : true;
        }

        /* JADX INFO: renamed from: x */
        public int mo2684x(C1181r c1181r, C1186w c1186w) {
            return -1;
        }

        /* JADX INFO: renamed from: x0 */
        public boolean mo2727x0() {
            return false;
        }

        /* JADX INFO: renamed from: y */
        public void mo2863y(View view, Rect rect) {
            boolean z = RecyclerView.f4815y0;
            C1176m c1176m = (C1176m) view.getLayoutParams();
            Rect rect2 = c1176m.f4948b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1176m).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1176m).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin);
        }

        /* JADX INFO: renamed from: y0 */
        public final boolean m2864y0(View view, int i, int i2, C1176m c1176m) {
            return (this.f4933h && m2829M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1176m).width) && m2829M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1176m).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: z0 */
        public void mo1486z0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC1177n {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface InterfaceC1178o {
        /* JADX INFO: renamed from: a */
        boolean mo2865a(MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        void mo2866b(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC1179p {
        /* JADX INFO: renamed from: a */
        public void mo439a(RecyclerView recyclerView, int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo440b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C1180q {

        /* JADX INFO: renamed from: a */
        public SparseArray<a> f4951a;

        /* JADX INFO: renamed from: b */
        public int f4952b;

        /* JADX INFO: renamed from: c */
        public Set<AbstractC1167d<?>> f4953c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC1163A> f4954a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public final int f4955b = 5;

            /* JADX INFO: renamed from: c */
            public long f4956c = 0;

            /* JADX INFO: renamed from: d */
            public long f4957d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final a m2867a(int i) {
            SparseArray<a> sparseArray = this.f4951a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public final class C1181r {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC1163A> f4958a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC1163A> f4959b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC1163A> f4960c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC1163A> f4961d;

        /* JADX INFO: renamed from: e */
        public int f4962e;

        /* JADX INFO: renamed from: f */
        public int f4963f;

        /* JADX INFO: renamed from: g */
        public C1180q f4964g;

        public C1181r() {
            ArrayList<AbstractC1163A> arrayList = new ArrayList<>();
            this.f4958a = arrayList;
            this.f4959b = null;
            this.f4960c = new ArrayList<>();
            this.f4961d = Collections.unmodifiableList(arrayList);
            this.f4962e = 2;
            this.f4963f = 2;
        }

        /* JADX INFO: renamed from: a */
        public final void m2868a(AbstractC1163A abstractC1163A, boolean z) {
            RecyclerView.m2742l(abstractC1163A);
            RecyclerView recyclerView = RecyclerView.this;
            C1219x c1219x = recyclerView.f4865m0;
            View view = abstractC1163A.f4891a;
            if (c1219x != null) {
                C1219x.a aVar = c1219x.f5200e;
                C0866ug.m2003j(view, aVar != null ? (C0038C) aVar.f5202e.remove(view) : null);
            }
            if (z) {
                InterfaceC1182s interfaceC1182s = recyclerView.f4866n;
                if (interfaceC1182s != null) {
                    interfaceC1182s.m2881a();
                }
                ArrayList arrayList = recyclerView.f4868o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1182s) arrayList.get(i)).m2881a();
                }
                if (recyclerView.f4851f0 != null) {
                    recyclerView.f4852g.m2645d(abstractC1163A);
                }
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC1163A);
                }
            }
            abstractC1163A.f4909s = null;
            abstractC1163A.f4908r = null;
            C1180q c1180qM2870c = m2870c();
            c1180qM2870c.getClass();
            int i2 = abstractC1163A.f4896f;
            ArrayList<AbstractC1163A> arrayList2 = c1180qM2870c.m2867a(i2).f4954a;
            if (c1180qM2870c.f4951a.get(i2).f4955b <= arrayList2.size()) {
                C0957zc.m2247a(view);
            } else {
                if (RecyclerView.f4815y0 && arrayList2.contains(abstractC1163A)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                abstractC1163A.m2807m();
                arrayList2.add(abstractC1163A);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m2869b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.f4851f0.m2887b()) {
                return !recyclerView.f4851f0.f4989g ? i : recyclerView.f4848e.m2937e(i, 0);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f4851f0.m2887b() + recyclerView.m2745B());
        }

        /* JADX INFO: renamed from: c */
        public final C1180q m2870c() {
            if (this.f4964g == null) {
                C1180q c1180q = new C1180q();
                c1180q.f4951a = new SparseArray<>();
                c1180q.f4952b = 0;
                c1180q.f4953c = Collections.newSetFromMap(new IdentityHashMap());
                this.f4964g = c1180q;
                m2871d();
            }
            return this.f4964g;
        }

        /* JADX INFO: renamed from: d */
        public final void m2871d() {
            RecyclerView recyclerView;
            AbstractC1167d<?> abstractC1167d;
            C1180q c1180q = this.f4964g;
            if (c1180q == null || (abstractC1167d = (recyclerView = RecyclerView.this).f4862l) == null || !recyclerView.f4876s) {
                return;
            }
            c1180q.f4953c.add(abstractC1167d);
        }

        /* JADX INFO: renamed from: e */
        public final void m2872e(AbstractC1167d<?> abstractC1167d, boolean z) {
            C1180q c1180q = this.f4964g;
            if (c1180q == null) {
                return;
            }
            Set<AbstractC1167d<?>> set = c1180q.f4953c;
            set.remove(abstractC1167d);
            if (set.size() != 0 || z) {
                return;
            }
            int i = 0;
            while (true) {
                SparseArray<C1180q.a> sparseArray = c1180q.f4951a;
                if (i >= sparseArray.size()) {
                    return;
                }
                ArrayList<AbstractC1163A> arrayList = sparseArray.get(sparseArray.keyAt(i)).f4954a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C0957zc.m2247a(arrayList.get(i2).f4891a);
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m2873f() {
            ArrayList<AbstractC1163A> arrayList = this.f4960c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m2874g(size);
            }
            arrayList.clear();
            if (RecyclerView.f4811D0) {
                RunnableC1208m.b bVar = RecyclerView.this.f4849e0;
                int[] iArr = bVar.f5166c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f5167d = 0;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m2874g(int i) {
            if (RecyclerView.f4816z0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            ArrayList<AbstractC1163A> arrayList = this.f4960c;
            AbstractC1163A abstractC1163A = arrayList.get(i);
            if (RecyclerView.f4816z0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC1163A);
            }
            m2868a(abstractC1163A, true);
            arrayList.remove(i);
        }

        /* JADX INFO: renamed from: h */
        public final void m2875h(View view) {
            AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
            boolean zM2804j = abstractC1163AM2735L.m2804j();
            RecyclerView recyclerView = RecyclerView.this;
            if (zM2804j) {
                recyclerView.removeDetachedView(view, false);
            }
            if (abstractC1163AM2735L.m2803i()) {
                abstractC1163AM2735L.f4904n.m2879l(abstractC1163AM2735L);
            } else if (abstractC1163AM2735L.m2810p()) {
                abstractC1163AM2735L.f4900j &= -33;
            }
            m2876i(abstractC1163AM2735L);
            if (recyclerView.f4827K == null || abstractC1163AM2735L.m2801g()) {
                return;
            }
            recyclerView.f4827K.mo2820d(abstractC1163AM2735L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2876i(AbstractC1163A abstractC1163A) {
            boolean z;
            boolean z2;
            int i;
            boolean zM2803i = abstractC1163A.m2803i();
            boolean z3 = true;
            RecyclerView recyclerView = RecyclerView.this;
            View view = abstractC1163A.f4891a;
            if (zM2803i || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC1163A.m2803i());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(recyclerView.m2745B());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC1163A.m2804j()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(abstractC1163A);
                throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb2));
            }
            if (abstractC1163A.m2809o()) {
                throw new IllegalArgumentException(C0944z.m2224d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((abstractC1163A.f4900j & 16) == 0) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                z = view.hasTransientState();
            }
            AbstractC1167d abstractC1167d = recyclerView.f4862l;
            boolean z4 = RecyclerView.f4815y0;
            ArrayList<AbstractC1163A> arrayList = this.f4960c;
            if (z4 && arrayList.contains(abstractC1163A)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(abstractC1163A);
                throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb3));
            }
            if (abstractC1163A.m2801g()) {
                if (this.f4963f <= 0 || (abstractC1163A.f4900j & 526) != 0) {
                    z2 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f4963f && size > 0) {
                        m2874g(0);
                        size--;
                    }
                    if (RecyclerView.f4811D0 && size > 0) {
                        RunnableC1208m.b bVar = recyclerView.f4849e0;
                        int i2 = abstractC1163A.f4893c;
                        if (bVar.f5166c != null) {
                            int i3 = bVar.f5167d * 2;
                            for (int i4 = 0; i4 < i3; i4 += 2) {
                                if (bVar.f5166c[i4] == i2) {
                                    break;
                                }
                            }
                            i = size - 1;
                            loop1: while (i >= 0) {
                                int i5 = arrayList.get(i).f4893c;
                                RunnableC1208m.b bVar2 = recyclerView.f4849e0;
                                if (bVar2.f5166c == null) {
                                    break;
                                }
                                int i6 = bVar2.f5167d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (bVar2.f5166c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i + 1;
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, abstractC1163A);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    m2868a(abstractC1163A, true);
                }
                z = z2;
            } else {
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m2745B());
                }
                z3 = false;
            }
            recyclerView.f4852g.m2645d(abstractC1163A);
            if (z || z3 || !z) {
                return;
            }
            C0957zc.m2247a(view);
            abstractC1163A.f4909s = null;
            abstractC1163A.f4908r = null;
        }

        /* JADX INFO: renamed from: j */
        public final void m2877j(View view) {
            AbstractC1172i abstractC1172i;
            AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
            boolean z = (abstractC1163AM2735L.f4900j & 12) != 0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z && abstractC1163AM2735L.m2805k() && (abstractC1172i = recyclerView.f4827K) != null) {
                C1206k c1206k = (C1206k) abstractC1172i;
                if (abstractC1163AM2735L.m2797c().isEmpty() && c1206k.f5203g && !abstractC1163AM2735L.m2800f()) {
                    if (this.f4959b == null) {
                        this.f4959b = new ArrayList<>();
                    }
                    abstractC1163AM2735L.f4904n = this;
                    abstractC1163AM2735L.f4905o = true;
                    this.f4959b.add(abstractC1163AM2735L);
                    return;
                }
            }
            if (abstractC1163AM2735L.m2800f() && !abstractC1163AM2735L.m2802h() && !recyclerView.f4862l.f4913b) {
                throw new IllegalArgumentException(C0944z.m2224d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            abstractC1163AM2735L.f4904n = this;
            abstractC1163AM2735L.f4905o = false;
            this.f4958a.add(abstractC1163AM2735L);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0363  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04ce  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0615  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x0635 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:361:0x0639  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC1163A m2878k(long j, int i) {
            boolean z;
            AbstractC1163A abstractC1163AMo111e;
            boolean z2;
            long j2;
            boolean z3;
            boolean z4;
            boolean z5;
            ViewGroup.LayoutParams layoutParams;
            C1176m c1176m;
            RecyclerView recyclerViewM2734G;
            AbstractC1163A abstractC1163ARemove;
            View view;
            int iM2954b;
            boolean z6;
            int size;
            int iM2937e;
            boolean z7 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.f4851f0.m2887b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f4851f0.m2887b() + recyclerView.m2745B());
            }
            C1186w c1186w = recyclerView.f4851f0;
            if (c1186w.f4989g) {
                ArrayList<AbstractC1163A> arrayList = this.f4959b;
                if (arrayList == null || (size = arrayList.size()) == 0) {
                    abstractC1163AMo111e = null;
                    z = abstractC1163AMo111e == null;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            abstractC1163AMo111e = this.f4959b.get(i2);
                            if (!abstractC1163AMo111e.m2810p() && abstractC1163AMo111e.m2796b() == i) {
                                abstractC1163AMo111e.m2795a(32);
                                break;
                            }
                            i2++;
                        } else if (recyclerView.f4862l.f4913b && (iM2937e = recyclerView.f4848e.m2937e(i, 0)) > 0 && iM2937e < recyclerView.f4862l.mo109a()) {
                            long jMo2813b = recyclerView.f4862l.mo2813b(iM2937e);
                            for (int i3 = 0; i3 < size; i3++) {
                                AbstractC1163A abstractC1163A = this.f4959b.get(i3);
                                if (!abstractC1163A.m2810p() && abstractC1163A.f4895e == jMo2813b) {
                                    abstractC1163A.m2795a(32);
                                    abstractC1163AMo111e = abstractC1163A;
                                    break;
                                }
                            }
                        }
                    }
                    abstractC1163AMo111e = null;
                    if (abstractC1163AMo111e == null) {
                    }
                }
            } else {
                z = false;
                abstractC1163AMo111e = null;
            }
            ArrayList<AbstractC1163A> arrayList2 = this.f4960c;
            ArrayList<AbstractC1163A> arrayList3 = this.f4958a;
            if (abstractC1163AMo111e == null) {
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    AbstractC1163A abstractC1163A2 = arrayList3.get(i4);
                    if (!abstractC1163A2.m2810p()) {
                        z2 = z7;
                        if (abstractC1163A2.m2796b() == i && !abstractC1163A2.m2800f() && (c1186w.f4989g || !abstractC1163A2.m2802h())) {
                            abstractC1163A2.m2795a(32);
                            abstractC1163AMo111e = abstractC1163A2;
                            break;
                        }
                    } else {
                        z2 = z7;
                    }
                    i4++;
                    z7 = z2;
                }
                z2 = z7;
                ArrayList arrayList4 = recyclerView.f4850f.f5067c;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i5);
                    AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
                    if (abstractC1163AM2735L.m2796b() == i && !abstractC1163AM2735L.m2800f() && !abstractC1163AM2735L.m2802h()) {
                        break;
                    }
                    i5++;
                }
                if (view == null) {
                    int size4 = arrayList2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            abstractC1163AMo111e = null;
                            break;
                        }
                        abstractC1163AMo111e = arrayList2.get(i6);
                        if (abstractC1163AMo111e.m2800f() || abstractC1163AMo111e.m2796b() != i || abstractC1163AMo111e.m2798d()) {
                            i6++;
                        } else {
                            arrayList2.remove(i6);
                            if (RecyclerView.f4816z0) {
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC1163AMo111e);
                            }
                        }
                    }
                } else {
                    AbstractC1163A abstractC1163AM2735L2 = RecyclerView.m2735L(view);
                    C1197b c1197b = recyclerView.f4850f;
                    int iIndexOfChild = c1197b.f5065a.f5197a.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                    C1197b.a aVar = c1197b.f5066b;
                    if (!aVar.m2956d(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    aVar.m2953a(iIndexOfChild);
                    c1197b.m2952j(view);
                    C1197b c1197b2 = recyclerView.f4850f;
                    int iIndexOfChild2 = c1197b2.f5065a.f5197a.indexOfChild(view);
                    if (iIndexOfChild2 == -1) {
                        iM2954b = -1;
                        if (iM2954b != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(abstractC1163AM2735L2);
                            throw new IllegalStateException(C0944z.m2224d(recyclerView, sb));
                        }
                        recyclerView.f4850f.m2945c(iM2954b);
                        m2877j(view);
                        abstractC1163AM2735L2.m2795a(8224);
                        abstractC1163AMo111e = abstractC1163AM2735L2;
                    } else {
                        C1197b.a aVar2 = c1197b2.f5066b;
                        if (!aVar2.m2956d(iIndexOfChild2)) {
                            iM2954b = iIndexOfChild2 - aVar2.m2954b(iIndexOfChild2);
                        }
                        if (iM2954b != -1) {
                        }
                    }
                }
                if (abstractC1163AMo111e != null) {
                    if (!abstractC1163AMo111e.m2802h()) {
                        int i7 = abstractC1163AMo111e.f4893c;
                        if (i7 < 0 || i7 >= recyclerView.f4862l.mo109a()) {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(abstractC1163AMo111e);
                            throw new IndexOutOfBoundsException(C0944z.m2224d(recyclerView, sb2));
                        }
                        if (c1186w.f4989g || recyclerView.f4862l.mo1072c(abstractC1163AMo111e.f4893c) == abstractC1163AMo111e.f4896f) {
                            AbstractC1167d abstractC1167d = recyclerView.f4862l;
                            z6 = (!abstractC1167d.f4913b || abstractC1163AMo111e.f4895e == abstractC1167d.mo2813b(abstractC1163AMo111e.f4893c)) ? z2 : false;
                        }
                    } else {
                        if (RecyclerView.f4815y0 && !c1186w.f4989g) {
                            throw new IllegalStateException(C0944z.m2224d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z6 = c1186w.f4989g;
                    }
                    if (z6) {
                        z = z2;
                    } else {
                        abstractC1163AMo111e.m2795a(4);
                        if (abstractC1163AMo111e.m2803i()) {
                            recyclerView.removeDetachedView(abstractC1163AMo111e.f4891a, false);
                            abstractC1163AMo111e.f4904n.m2879l(abstractC1163AMo111e);
                        } else if (abstractC1163AMo111e.m2810p()) {
                            abstractC1163AMo111e.f4900j &= -33;
                        }
                        m2876i(abstractC1163AMo111e);
                        abstractC1163AMo111e = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (abstractC1163AMo111e == null) {
                int iM2937e2 = recyclerView.f4848e.m2937e(i, 0);
                if (iM2937e2 < 0 || iM2937e2 >= recyclerView.f4862l.mo109a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM2937e2 + ").state:" + c1186w.m2887b() + recyclerView.m2745B());
                }
                int iMo1072c = recyclerView.f4862l.mo1072c(iM2937e2);
                AbstractC1167d abstractC1167d2 = recyclerView.f4862l;
                j2 = 3;
                if (abstractC1167d2.f4913b) {
                    long jMo2813b2 = abstractC1167d2.mo2813b(iM2937e2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 >= 0) {
                            abstractC1163AMo111e = arrayList3.get(size5);
                            if (abstractC1163AMo111e.f4895e == jMo2813b2 && !abstractC1163AMo111e.m2810p()) {
                                if (iMo1072c == abstractC1163AMo111e.f4896f) {
                                    abstractC1163AMo111e.m2795a(32);
                                    if (abstractC1163AMo111e.m2802h() && !c1186w.f4989g) {
                                        abstractC1163AMo111e.f4900j = (abstractC1163AMo111e.f4900j & (-15)) | 2;
                                    }
                                } else {
                                    arrayList3.remove(size5);
                                    View view2 = abstractC1163AMo111e.f4891a;
                                    recyclerView.removeDetachedView(view2, false);
                                    AbstractC1163A abstractC1163AM2735L3 = RecyclerView.m2735L(view2);
                                    abstractC1163AM2735L3.f4904n = null;
                                    abstractC1163AM2735L3.f4905o = false;
                                    abstractC1163AM2735L3.f4900j &= -33;
                                    m2876i(abstractC1163AM2735L3);
                                }
                            }
                            size5--;
                        } else {
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 < 0) {
                                    break;
                                }
                                AbstractC1163A abstractC1163A3 = arrayList2.get(size6);
                                if (abstractC1163A3.f4895e != jMo2813b2 || abstractC1163A3.m2798d()) {
                                    size6--;
                                } else if (iMo1072c == abstractC1163A3.f4896f) {
                                    arrayList2.remove(size6);
                                    abstractC1163AMo111e = abstractC1163A3;
                                } else {
                                    m2874g(size6);
                                }
                            }
                            abstractC1163AMo111e = null;
                        }
                    }
                    if (abstractC1163AMo111e != null) {
                        abstractC1163AMo111e.f4893c = iM2937e2;
                        z = z2;
                    }
                }
                if (abstractC1163AMo111e == null) {
                    if (RecyclerView.f4816z0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                    }
                    C1180q.a aVar3 = m2870c().f4951a.get(iMo1072c);
                    if (aVar3 != null) {
                        ArrayList<AbstractC1163A> arrayList5 = aVar3.f4954a;
                        if (arrayList5.isEmpty()) {
                            abstractC1163ARemove = null;
                            if (abstractC1163ARemove != null) {
                            }
                            abstractC1163AMo111e = abstractC1163ARemove;
                        } else {
                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                if (!arrayList5.get(size7).m2798d()) {
                                    abstractC1163ARemove = arrayList5.remove(size7);
                                    break;
                                }
                            }
                            abstractC1163ARemove = null;
                            if (abstractC1163ARemove != null) {
                                abstractC1163ARemove.m2807m();
                                boolean z8 = RecyclerView.f4815y0;
                            }
                            abstractC1163AMo111e = abstractC1163ARemove;
                        }
                    }
                }
                if (abstractC1163AMo111e == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j3 = this.f4964g.m2867a(iMo1072c).f4956c;
                        if (!((j3 == 0 || j3 + nanoTime < j) ? z2 : false)) {
                            return null;
                        }
                    }
                    AbstractC1167d abstractC1167d3 = recyclerView.f4862l;
                    abstractC1167d3.getClass();
                    try {
                        int i8 = C0016Af.f53a;
                        Trace.beginSection("RV CreateView");
                        abstractC1163AMo111e = abstractC1167d3.mo111e(recyclerView, iMo1072c);
                        View view3 = abstractC1163AMo111e.f4891a;
                        if (view3.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        abstractC1163AMo111e.f4896f = iMo1072c;
                        Trace.endSection();
                        if (RecyclerView.f4811D0 && (recyclerViewM2734G = RecyclerView.m2734G(view3)) != null) {
                            abstractC1163AMo111e.f4892b = new WeakReference<>(recyclerViewM2734G);
                        }
                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        C1180q.a aVarM2867a = this.f4964g.m2867a(iMo1072c);
                        long j4 = aVarM2867a.f4956c;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                        }
                        aVarM2867a.f4956c = nanoTime2;
                        if (RecyclerView.f4816z0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    } finally {
                        int i9 = C0016Af.f53a;
                        Trace.endSection();
                    }
                }
            } else {
                j2 = 3;
            }
            if (z && !c1186w.f4989g) {
                int i10 = abstractC1163AMo111e.f4900j;
                if ((i10 & 8192) != 0 ? z2 : false) {
                    abstractC1163AMo111e.f4900j = i10 & (-8193);
                    if (c1186w.f4992j) {
                        AbstractC1172i.m2817b(abstractC1163AMo111e);
                        AbstractC1172i abstractC1172i = recyclerView.f4827K;
                        abstractC1163AMo111e.m2797c();
                        abstractC1172i.getClass();
                        AbstractC1172i.b bVar = new AbstractC1172i.b();
                        bVar.m2824a(abstractC1163AMo111e);
                        recyclerView.m2765X(abstractC1163AMo111e, bVar);
                    }
                }
            }
            boolean z9 = c1186w.f4989g;
            View view4 = abstractC1163AMo111e.f4891a;
            if (!z9 || !abstractC1163AMo111e.m2799e()) {
                if (abstractC1163AMo111e.m2799e()) {
                    if (((abstractC1163AMo111e.f4900j & 2) != 0 ? z2 : false) || abstractC1163AMo111e.m2800f()) {
                    }
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                        c1176m = (C1176m) recyclerView.generateDefaultLayoutParams();
                        view4.setLayoutParams(c1176m);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        c1176m = (C1176m) layoutParams;
                    } else {
                        c1176m = (C1176m) recyclerView.generateLayoutParams(layoutParams);
                        view4.setLayoutParams(c1176m);
                    }
                    c1176m.f4947a = abstractC1163AMo111e;
                    c1176m.f4950d = (z && z5) ? z4 : false;
                    return abstractC1163AMo111e;
                }
                if (RecyclerView.f4815y0 && abstractC1163AMo111e.m2802h()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(abstractC1163AMo111e);
                    throw new IllegalStateException(C0944z.m2224d(recyclerView, sb3));
                }
                int iM2937e3 = recyclerView.f4848e.m2937e(i, 0);
                abstractC1163AMo111e.f4909s = null;
                abstractC1163AMo111e.f4908r = recyclerView;
                int i11 = abstractC1163AMo111e.f4896f;
                long nanoTime3 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j5 = this.f4964g.m2867a(i11).f4957d;
                    if (j5 == 0 || j5 + nanoTime3 < j) {
                        if (abstractC1163AMo111e.m2804j()) {
                            recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        AbstractC1167d<? extends AbstractC1163A> abstractC1167d4 = recyclerView.f4862l;
                        abstractC1167d4.getClass();
                        boolean z10 = abstractC1163AMo111e.f4909s == null ? z2 : false;
                        if (z10) {
                            abstractC1163AMo111e.f4893c = iM2937e3;
                            if (abstractC1167d4.f4913b) {
                                abstractC1163AMo111e.f4895e = abstractC1167d4.mo2813b(iM2937e3);
                            }
                            abstractC1163AMo111e.f4900j = (abstractC1163AMo111e.f4900j & (-520)) | 1;
                            int i12 = C0016Af.f53a;
                            Trace.beginSection("RV OnBindView");
                        }
                        abstractC1163AMo111e.f4909s = abstractC1167d4;
                        if (RecyclerView.f4815y0) {
                            if (view4.getParent() == null) {
                                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                                if (view4.isAttachedToWindow() != abstractC1163AMo111e.m2804j()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC1163AMo111e.m2804j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC1163AMo111e);
                                }
                            }
                            if (view4.getParent() == null) {
                                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                                if (view4.isAttachedToWindow()) {
                                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC1163AMo111e);
                                }
                            }
                        }
                        abstractC1163AMo111e.m2797c();
                        abstractC1167d4.mo110d(abstractC1163AMo111e, iM2937e3);
                        if (z10) {
                            ArrayList arrayList6 = abstractC1163AMo111e.f4901k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            abstractC1163AMo111e.f4900j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof C1176m) {
                                ((C1176m) layoutParams2).f4949c = z2;
                            }
                        }
                        if (z3) {
                            recyclerView.detachViewFromParent(view4);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C1180q.a aVarM2867a2 = this.f4964g.m2867a(abstractC1163AMo111e.f4896f);
                        long j6 = aVarM2867a2.f4957d;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * j2);
                        }
                        aVarM2867a2.f4957d = nanoTime4;
                        AccessibilityManager accessibilityManager = recyclerView.f4817A;
                        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                            WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                            z4 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            C1219x c1219x = recyclerView.f4865m0;
                            if (c1219x != null) {
                                C1219x.a aVar4 = c1219x.f5200e;
                                if (aVar4 != null) {
                                    View.AccessibilityDelegate accessibilityDelegateM1995b = C0866ug.m1995b(view4);
                                    C0038C c0038c = accessibilityDelegateM1995b == null ? null : accessibilityDelegateM1995b instanceof C0038C.a ? ((C0038C.a) accessibilityDelegateM1995b).f139a : new C0038C(accessibilityDelegateM1995b);
                                    if (c0038c != null && c0038c != aVar4) {
                                        aVar4.f5202e.put(view4, c0038c);
                                    }
                                }
                                C0866ug.m2003j(view4, aVar4);
                            }
                        } else {
                            z4 = true;
                        }
                        if (c1186w.f4989g) {
                            abstractC1163AMo111e.f4897g = i;
                        }
                        z5 = z4;
                    } else {
                        z5 = false;
                        z4 = z2;
                    }
                }
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                }
                c1176m.f4947a = abstractC1163AMo111e;
                c1176m.f4950d = (z && z5) ? z4 : false;
                return abstractC1163AMo111e;
            }
            abstractC1163AMo111e.f4897g = i;
            z4 = z2;
            z5 = false;
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            c1176m.f4947a = abstractC1163AMo111e;
            c1176m.f4950d = (z && z5) ? z4 : false;
            return abstractC1163AMo111e;
        }

        /* JADX INFO: renamed from: l */
        public final void m2879l(AbstractC1163A abstractC1163A) {
            if (abstractC1163A.f4905o) {
                this.f4959b.remove(abstractC1163A);
            } else {
                this.f4958a.remove(abstractC1163A);
            }
            abstractC1163A.f4904n = null;
            abstractC1163A.f4905o = false;
            abstractC1163A.f4900j &= -33;
        }

        /* JADX INFO: renamed from: m */
        public final void m2880m() {
            AbstractC1175l abstractC1175l = RecyclerView.this.f4864m;
            this.f4963f = this.f4962e + (abstractC1175l != null ? abstractC1175l.f4935j : 0);
            ArrayList<AbstractC1163A> arrayList = this.f4960c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4963f; size--) {
                m2874g(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC1182s {
        /* JADX INFO: renamed from: a */
        void m2881a();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public class C1183t extends AbstractC1169f {
        public C1183t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1169f
        /* JADX INFO: renamed from: a */
        public final void mo2816a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m2781k(null);
            recyclerView.f4851f0.f4988f = true;
            recyclerView.m2764W(true);
            if (recyclerView.f4848e.m2938f()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1184u extends AbstractC0792r {
        public static final Parcelable.Creator<C1184u> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public Parcelable f4967c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public class a implements Parcelable.ClassLoaderCreator<C1184u> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1184u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1184u(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1184u[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1184u(parcel, null);
            }
        }

        public C1184u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4967c = parcel.readParcelable(classLoader == null ? AbstractC1175l.class.getClassLoader() : classLoader);
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4967c, 0);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class AbstractC1185v {

        /* JADX INFO: renamed from: a */
        public int f4968a = -1;

        /* JADX INFO: renamed from: b */
        public RecyclerView f4969b;

        /* JADX INFO: renamed from: c */
        public AbstractC1175l f4970c;

        /* JADX INFO: renamed from: d */
        public boolean f4971d;

        /* JADX INFO: renamed from: e */
        public boolean f4972e;

        /* JADX INFO: renamed from: f */
        public View f4973f;

        /* JADX INFO: renamed from: g */
        public final a f4974g;

        /* JADX INFO: renamed from: h */
        public boolean f4975h;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f4976a;

            /* JADX INFO: renamed from: b */
            public int f4977b;

            /* JADX INFO: renamed from: c */
            public int f4978c;

            /* JADX INFO: renamed from: d */
            public int f4979d;

            /* JADX INFO: renamed from: e */
            public BaseInterpolator f4980e;

            /* JADX INFO: renamed from: f */
            public boolean f4981f;

            /* JADX INFO: renamed from: g */
            public int f4982g;

            /* JADX INFO: renamed from: a */
            public final void m2885a(RecyclerView recyclerView) {
                int i = this.f4979d;
                if (i >= 0) {
                    this.f4979d = -1;
                    recyclerView.m2757P(i);
                    this.f4981f = false;
                    return;
                }
                if (!this.f4981f) {
                    this.f4982g = 0;
                    return;
                }
                BaseInterpolator baseInterpolator = this.f4980e;
                if (baseInterpolator != null && this.f4978c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f4978c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f4845c0.m2890c(this.f4976a, this.f4977b, i2, baseInterpolator);
                int i3 = this.f4982g + 1;
                this.f4982g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f4981f = false;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            PointF mo2710a(int i);
        }

        public AbstractC1185v() {
            a aVar = new a();
            aVar.f4979d = -1;
            aVar.f4981f = false;
            aVar.f4982g = 0;
            aVar.f4976a = 0;
            aVar.f4977b = 0;
            aVar.f4978c = Integer.MIN_VALUE;
            aVar.f4980e = null;
            this.f4974g = aVar;
        }

        /* JADX INFO: renamed from: a */
        public PointF mo634a(int i) {
            Object obj = this.f4970c;
            if (obj instanceof b) {
                return ((b) obj).mo2710a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2882b(int i, int i2) {
            PointF pointFMo634a;
            RecyclerView recyclerView = this.f4969b;
            if (this.f4968a == -1 || recyclerView == null) {
                m2884d();
            }
            if (this.f4971d && this.f4973f == null && this.f4970c != null && (pointFMo634a = mo634a(this.f4968a)) != null) {
                float f = pointFMo634a.x;
                if (f != 0.0f || pointFMo634a.y != 0.0f) {
                    recyclerView.m2771d0((int) Math.signum(f), (int) Math.signum(pointFMo634a.y), null);
                }
            }
            this.f4971d = false;
            View view = this.f4973f;
            a aVar = this.f4974g;
            if (view != null) {
                this.f4969b.getClass();
                AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
                if ((abstractC1163AM2735L != null ? abstractC1163AM2735L.m2796b() : -1) == this.f4968a) {
                    View view2 = this.f4973f;
                    C1186w c1186w = recyclerView.f4851f0;
                    mo2883c(view2, aVar);
                    aVar.m2885a(recyclerView);
                    m2884d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4973f = null;
                }
            }
            if (this.f4972e) {
                C1186w c1186w2 = recyclerView.f4851f0;
                C1210o c1210o = (C1210o) this;
                if (c1210o.f4969b.f4864m.m2860v() == 0) {
                    c1210o.m2884d();
                } else {
                    int i3 = c1210o.f5188o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    c1210o.f5188o = i4;
                    int i5 = c1210o.f5189p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    c1210o.f5189p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF pointFMo634a2 = c1210o.mo634a(c1210o.f4968a);
                        if (pointFMo634a2 != null) {
                            if (pointFMo634a2.x == 0.0f && pointFMo634a2.y == 0.0f) {
                                aVar.f4979d = c1210o.f4968a;
                                c1210o.m2884d();
                            } else {
                                float f2 = pointFMo634a2.y;
                                float fSqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                                float f3 = pointFMo634a2.x / fSqrt;
                                pointFMo634a2.x = f3;
                                float f4 = pointFMo634a2.y / fSqrt;
                                pointFMo634a2.y = f4;
                                c1210o.f5184k = pointFMo634a2;
                                c1210o.f5188o = (int) (f3 * 10000.0f);
                                c1210o.f5189p = (int) (f4 * 10000.0f);
                                int iMo2978i = c1210o.mo2978i(10000);
                                int i7 = (int) (c1210o.f5188o * 1.2f);
                                int i8 = (int) (c1210o.f5189p * 1.2f);
                                LinearInterpolator linearInterpolator = c1210o.f5182i;
                                aVar.f4976a = i7;
                                aVar.f4977b = i8;
                                aVar.f4978c = (int) (iMo2978i * 1.2f);
                                aVar.f4980e = linearInterpolator;
                                aVar.f4981f = true;
                            }
                        }
                    }
                }
                boolean z = aVar.f4979d >= 0;
                aVar.m2885a(recyclerView);
                if (z && this.f4972e) {
                    this.f4971d = true;
                    recyclerView.f4845c0.m2889b();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo2883c(View view, a aVar);

        /* JADX INFO: renamed from: d */
        public final void m2884d() {
            if (this.f4972e) {
                this.f4972e = false;
                C1210o c1210o = (C1210o) this;
                c1210o.f5189p = 0;
                c1210o.f5188o = 0;
                c1210o.f5184k = null;
                this.f4969b.f4851f0.f4983a = -1;
                this.f4973f = null;
                this.f4968a = -1;
                this.f4971d = false;
                AbstractC1175l abstractC1175l = this.f4970c;
                if (abstractC1175l.f4930e == this) {
                    abstractC1175l.f4930e = null;
                }
                this.f4970c = null;
                this.f4969b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C1186w {

        /* JADX INFO: renamed from: a */
        public int f4983a;

        /* JADX INFO: renamed from: b */
        public int f4984b;

        /* JADX INFO: renamed from: c */
        public int f4985c;

        /* JADX INFO: renamed from: d */
        public int f4986d;

        /* JADX INFO: renamed from: e */
        public int f4987e;

        /* JADX INFO: renamed from: f */
        public boolean f4988f;

        /* JADX INFO: renamed from: g */
        public boolean f4989g;

        /* JADX INFO: renamed from: h */
        public boolean f4990h;

        /* JADX INFO: renamed from: i */
        public boolean f4991i;

        /* JADX INFO: renamed from: j */
        public boolean f4992j;

        /* JADX INFO: renamed from: k */
        public boolean f4993k;

        /* JADX INFO: renamed from: l */
        public int f4994l;

        /* JADX INFO: renamed from: m */
        public long f4995m;

        /* JADX INFO: renamed from: n */
        public int f4996n;

        /* JADX INFO: renamed from: a */
        public final void m2886a(int i) {
            if ((this.f4986d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4986d));
        }

        /* JADX INFO: renamed from: b */
        public final int m2887b() {
            return this.f4989g ? this.f4984b - this.f4985c : this.f4987e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f4983a + ", mData=null, mItemCount=" + this.f4987e + ", mIsMeasuring=" + this.f4991i + ", mPreviousLayoutItemCount=" + this.f4984b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4985c + ", mStructureChanged=" + this.f4988f + ", mInPreLayout=" + this.f4989g + ", mRunSimpleAnimations=" + this.f4992j + ", mRunPredictiveAnimations=" + this.f4993k + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C1187x extends C1171h {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC1188y {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class RunnableC1189z implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f4997a;

        /* JADX INFO: renamed from: b */
        public int f4998b;

        /* JADX INFO: renamed from: c */
        public OverScroller f4999c;

        /* JADX INFO: renamed from: d */
        public Interpolator f5000d;

        /* JADX INFO: renamed from: e */
        public boolean f5001e;

        /* JADX INFO: renamed from: f */
        public boolean f5002f;

        public RunnableC1189z() {
            InterpolatorC1165b interpolatorC1165b = RecyclerView.f4813F0;
            this.f5000d = interpolatorC1165b;
            this.f5001e = false;
            this.f5002f = false;
            this.f4999c = new OverScroller(RecyclerView.this.getContext(), interpolatorC1165b);
        }

        /* JADX INFO: renamed from: a */
        public final void m2888a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f4998b = 0;
            this.f4997a = 0;
            Interpolator interpolator = this.f5000d;
            InterpolatorC1165b interpolatorC1165b = RecyclerView.f4813F0;
            if (interpolator != interpolatorC1165b) {
                this.f5000d = interpolatorC1165b;
                this.f4999c = new OverScroller(recyclerView.getContext(), interpolatorC1165b);
            }
            this.f4999c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m2889b();
        }

        /* JADX INFO: renamed from: b */
        public final void m2889b() {
            if (this.f5001e) {
                this.f5002f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            recyclerView.postOnAnimation(this);
        }

        /* JADX INFO: renamed from: c */
        public final void m2890c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            Interpolator interpolator = baseInterpolator;
            if (baseInterpolator == null) {
                interpolator = RecyclerView.f4813F0;
            }
            if (this.f5000d != interpolator) {
                this.f5000d = interpolator;
                this.f4999c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f4998b = 0;
            this.f4997a = 0;
            recyclerView.setScrollState(2);
            this.f4999c.startScroll(0, 0, i, i2, i4);
            m2889b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4864m == null) {
                recyclerView.removeCallbacks(this);
                this.f4999c.abortAnimation();
                return;
            }
            this.f5002f = false;
            this.f5001e = true;
            recyclerView.m2784p();
            OverScroller overScroller = this.f4999c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f4997a;
                int i6 = currY - this.f4998b;
                this.f4997a = currX;
                this.f4998b = currY;
                int iM2743o = RecyclerView.m2743o(i5, recyclerView.f4823G, recyclerView.f4825I, recyclerView.getWidth());
                int iM2743o2 = RecyclerView.m2743o(i6, recyclerView.f4824H, recyclerView.f4826J, recyclerView.getHeight());
                int[] iArr = recyclerView.f4875r0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zM2789u = recyclerView.m2789u(iM2743o, iM2743o2, iArr, null, 1);
                int[] iArr2 = recyclerView.f4875r0;
                if (zM2789u) {
                    iM2743o -= iArr2[0];
                    iM2743o2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m2783n(iM2743o, iM2743o2);
                }
                if (recyclerView.f4862l != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.m2771d0(iM2743o, iM2743o2, iArr2);
                    int i7 = iArr2[0];
                    int i8 = iArr2[1];
                    int i9 = iM2743o - i7;
                    int i10 = iM2743o2 - i8;
                    C1210o c1210o = recyclerView.f4864m.f4930e;
                    if (c1210o != null && !c1210o.f4971d && c1210o.f4972e) {
                        int iM2887b = recyclerView.f4851f0.m2887b();
                        if (iM2887b == 0) {
                            c1210o.m2884d();
                        } else if (c1210o.f4968a >= iM2887b) {
                            c1210o.f4968a = iM2887b - 1;
                            c1210o.m2882b(i7, i8);
                        } else {
                            c1210o.m2882b(i7, i8);
                        }
                    }
                    i = i9;
                    i3 = i7;
                    i2 = i10;
                    i4 = i8;
                } else {
                    i = iM2743o;
                    i2 = iM2743o2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.f4870p.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f4875r0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.m2790v(i3, i4, i, i2, null, 1, iArr3);
                int i11 = i - iArr2[0];
                int i12 = i2 - iArr2[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.m2791w(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                C1210o c1210o2 = recyclerView.f4864m.f4930e;
                if ((c1210o2 == null || !c1210o2.f4971d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        if (i13 < 0) {
                            recyclerView.m2793y();
                            if (recyclerView.f4823G.isFinished()) {
                                recyclerView.f4823G.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.m2794z();
                            if (recyclerView.f4825I.isFinished()) {
                                recyclerView.f4825I.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.m2744A();
                            if (recyclerView.f4824H.isFinished()) {
                                recyclerView.f4824H.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.m2792x();
                            if (recyclerView.f4826J.isFinished()) {
                                recyclerView.f4826J.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.f4811D0) {
                        RunnableC1208m.b bVar = recyclerView.f4849e0;
                        int[] iArr4 = bVar.f5166c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f5167d = 0;
                    }
                } else {
                    m2889b();
                    RunnableC1208m runnableC1208m = recyclerView.f4847d0;
                    if (runnableC1208m != null) {
                        runnableC1208m.m2973a(recyclerView, i3, i4);
                    }
                }
            }
            C1210o c1210o3 = recyclerView.f4864m.f4930e;
            if (c1210o3 != null && c1210o3.f4971d) {
                c1210o3.m2882b(0, 0);
            }
            this.f5001e = false;
            if (!this.f5002f) {
                recyclerView.setScrollState(0);
                recyclerView.m2780j0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f4812E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4813F0 = new InterpolatorC1165b();
        f4814G0 = new C1187x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1152R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: G */
    public static RecyclerView m2734G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM2734G = m2734G(viewGroup.getChildAt(i));
            if (recyclerViewM2734G != null) {
                return recyclerViewM2734G;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC1163A m2735L(View view) {
        if (view == null) {
            return null;
        }
        return ((C1176m) view.getLayoutParams()).f4947a;
    }

    private C0176Jb getScrollingChildHelper() {
        if (this.f4869o0 == null) {
            this.f4869o0 = new C0176Jb(this);
        }
        return this.f4869o0;
    }

    /* JADX INFO: renamed from: l */
    public static void m2742l(AbstractC1163A abstractC1163A) {
        WeakReference<RecyclerView> weakReference = abstractC1163A.f4892b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1163A.f4891a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1163A.f4892b = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m2743o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C0116G5.m306a(edgeEffect) != 0.0f) {
            int iRound = Math.round(C0116G5.m307b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || C0116G5.m306a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(C0116G5.m307b(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f4815y0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f4816z0 = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m2744A() {
        if (this.f4824H != null) {
            return;
        }
        ((C1187x) this.f4822F).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4824H = edgeEffect;
        if (this.f4854h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m2745B() {
        return " " + super.toString() + ", adapter:" + this.f4862l + ", layout:" + this.f4864m + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: C */
    public final void m2746C(C1186w c1186w) {
        if (getScrollState() != 2) {
            c1186w.getClass();
            return;
        }
        OverScroller overScroller = this.f4845c0.f4999c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1186w.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: D */
    public final View m2747D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m2748E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<InterfaceC1178o> arrayList = this.f4872q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1178o interfaceC1178o = arrayList.get(i);
            if (interfaceC1178o.mo2865a(motionEvent) && action != 3) {
                this.f4874r = interfaceC1178o;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m2749F(int[] iArr) {
        int iM2947e = this.f4850f.m2947e();
        if (iM2947e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM2947e; i3++) {
            AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2946d(i3));
            if (!abstractC1163AM2735L.m2809o()) {
                int iM2796b = abstractC1163AM2735L.m2796b();
                if (iM2796b < i) {
                    i = iM2796b;
                }
                if (iM2796b > i2) {
                    i2 = iM2796b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC1163A m2750H(int i) {
        AbstractC1163A abstractC1163A = null;
        if (this.f4818B) {
            return null;
        }
        int iM2950h = this.f4850f.m2950h();
        for (int i2 = 0; i2 < iM2950h; i2++) {
            AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2949g(i2));
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2802h() && m2751I(abstractC1163AM2735L) == i) {
                if (!this.f4850f.f5067c.contains(abstractC1163AM2735L.f4891a)) {
                    return abstractC1163AM2735L;
                }
                abstractC1163A = abstractC1163AM2735L;
            }
        }
        return abstractC1163A;
    }

    /* JADX INFO: renamed from: I */
    public final int m2751I(AbstractC1163A abstractC1163A) {
        if (((abstractC1163A.f4900j & 524) != 0) || !abstractC1163A.m2799e()) {
            return -1;
        }
        C1196a c1196a = this.f4848e;
        int i = abstractC1163A.f4893c;
        ArrayList<C1196a.a> arrayList = c1196a.f5058b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1196a.a aVar = arrayList.get(i2);
            int i3 = aVar.f5062a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = aVar.f5063b;
                    if (i4 <= i) {
                        int i5 = aVar.f5064c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = aVar.f5063b;
                    if (i6 == i) {
                        i = aVar.f5064c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (aVar.f5064c <= i) {
                            i++;
                        }
                    }
                }
            } else if (aVar.f5063b <= i) {
                i += aVar.f5064c;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: J */
    public final long m2752J(AbstractC1163A abstractC1163A) {
        return this.f4862l.f4913b ? abstractC1163A.f4895e : abstractC1163A.f4893c;
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC1163A m2753K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m2735L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: M */
    public final Rect m2754M(View view) {
        C1176m c1176m = (C1176m) view.getLayoutParams();
        boolean z = c1176m.f4949c;
        Rect rect = c1176m.f4948b;
        if (!z || (this.f4851f0.f4989g && (c1176m.f4947a.m2805k() || c1176m.f4947a.m2800f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<AbstractC1174k> arrayList = this.f4870p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f4856i;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i).getClass();
            ((C1176m) view.getLayoutParams()).f4947a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1176m.f4949c = false;
        return rect;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m2755N() {
        return !this.f4880u || this.f4818B || this.f4848e.m2938f();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m2756O() {
        return this.f4820D > 0;
    }

    /* JADX INFO: renamed from: P */
    public final void m2757P(int i) {
        if (this.f4864m == null) {
            return;
        }
        setScrollState(2);
        this.f4864m.mo2725p0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: Q */
    public final void m2758Q() {
        int iM2950h = this.f4850f.m2950h();
        for (int i = 0; i < iM2950h; i++) {
            ((C1176m) this.f4850f.m2949g(i).getLayoutParams()).f4949c = true;
        }
        ArrayList<AbstractC1163A> arrayList = this.f4844c.f4960c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1176m c1176m = (C1176m) arrayList.get(i2).f4891a.getLayoutParams();
            if (c1176m != null) {
                c1176m.f4949c = true;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2759R(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM2950h = this.f4850f.m2950h();
        for (int i4 = 0; i4 < iM2950h; i4++) {
            AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2949g(i4));
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2809o()) {
                int i5 = abstractC1163AM2735L.f4893c;
                C1186w c1186w = this.f4851f0;
                if (i5 >= i3) {
                    if (f4816z0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC1163AM2735L + " now at position " + (abstractC1163AM2735L.f4893c - i2));
                    }
                    abstractC1163AM2735L.m2806l(-i2, z);
                    c1186w.f4988f = true;
                } else if (i5 >= i) {
                    if (f4816z0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC1163AM2735L + " now REMOVED");
                    }
                    abstractC1163AM2735L.m2795a(8);
                    abstractC1163AM2735L.m2806l(-i2, z);
                    abstractC1163AM2735L.f4893c = i - 1;
                    c1186w.f4988f = true;
                }
            }
        }
        C1181r c1181r = this.f4844c;
        ArrayList<AbstractC1163A> arrayList = c1181r.f4960c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1163A abstractC1163A = arrayList.get(size);
            if (abstractC1163A != null) {
                int i6 = abstractC1163A.f4893c;
                if (i6 >= i3) {
                    if (f4816z0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC1163A + " now at position " + (abstractC1163A.f4893c - i2));
                    }
                    abstractC1163A.m2806l(-i2, z);
                } else if (i6 >= i) {
                    abstractC1163A.m2795a(8);
                    c1181r.m2874g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: S */
    public final void m2760S() {
        this.f4820D++;
    }

    /* JADX INFO: renamed from: T */
    public final void m2761T(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f4820D - 1;
        this.f4820D = i2;
        if (i2 < 1) {
            if (f4815y0 && i2 < 0) {
                throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f4820D = 0;
            if (z) {
                int i3 = this.f4889z;
                this.f4889z = 0;
                if (i3 != 0 && (accessibilityManager = this.f4817A) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f4877s0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1163A abstractC1163A = (AbstractC1163A) arrayList.get(size);
                    if (abstractC1163A.f4891a.getParent() == this && !abstractC1163A.m2809o() && (i = abstractC1163A.f4907q) != -1) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        abstractC1163A.f4891a.setImportantForAccessibility(i);
                        abstractC1163A.f4907q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m2762U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4829M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4829M = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4833Q = x;
            this.f4831O = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4834R = y;
            this.f4832P = y;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2763V() {
        if (this.f4863l0 || !this.f4876s) {
            return;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        postOnAnimation(this.f4879t0);
        this.f4863l0 = true;
    }

    /* JADX INFO: renamed from: W */
    public final void m2764W(boolean z) {
        this.f4819C = z | this.f4819C;
        this.f4818B = true;
        int iM2950h = this.f4850f.m2950h();
        for (int i = 0; i < iM2950h; i++) {
            AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2949g(i));
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2809o()) {
                abstractC1163AM2735L.m2795a(6);
            }
        }
        m2758Q();
        C1181r c1181r = this.f4844c;
        ArrayList<AbstractC1163A> arrayList = c1181r.f4960c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1163A abstractC1163A = arrayList.get(i2);
            if (abstractC1163A != null) {
                abstractC1163A.m2795a(6);
                abstractC1163A.m2795a(1024);
            }
        }
        AbstractC1167d abstractC1167d = RecyclerView.this.f4862l;
        if (abstractC1167d == null || !abstractC1167d.f4913b) {
            c1181r.m2873f();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m2765X(AbstractC1163A abstractC1163A, AbstractC1172i.b bVar) {
        abstractC1163A.f4900j &= -8193;
        boolean z = this.f4851f0.f4990h;
        C1155C c1155c = this.f4852g;
        if (z && abstractC1163A.m2805k() && !abstractC1163A.m2802h() && !abstractC1163A.m2809o()) {
            c1155c.f4752b.m991d(m2752J(abstractC1163A), abstractC1163A);
        }
        C0598ge<AbstractC1163A, C1155C.a> c0598ge = c1155c.f4751a;
        C1155C.a orDefault = c0598ge.getOrDefault(abstractC1163A, null);
        if (orDefault == null) {
            orDefault = C1155C.a.m2646a();
            c0598ge.put(abstractC1163A, orDefault);
        }
        orDefault.f4755b = bVar;
        orDefault.f4754a |= 4;
    }

    /* JADX INFO: renamed from: Y */
    public final int m2766Y(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f4823G;
        float f2 = 0.0f;
        if (edgeEffect == null || C0116G5.m306a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4825I;
            if (edgeEffect2 != null && C0116G5.m306a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f4825I.onRelease();
                } else {
                    float fM307b = C0116G5.m307b(this.f4825I, width, height);
                    if (C0116G5.m306a(this.f4825I) == 0.0f) {
                        this.f4825I.onRelease();
                    }
                    f2 = fM307b;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f4823G.onRelease();
            } else {
                float f3 = -C0116G5.m307b(this.f4823G, -width, 1.0f - height);
                if (C0116G5.m306a(this.f4823G) == 0.0f) {
                    this.f4823G.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: Z */
    public final int m2767Z(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f4824H;
        float f2 = 0.0f;
        if (edgeEffect == null || C0116G5.m306a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4826J;
            if (edgeEffect2 != null && C0116G5.m306a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f4826J.onRelease();
                } else {
                    float fM307b = C0116G5.m307b(this.f4826J, height, 1.0f - width);
                    if (C0116G5.m306a(this.f4826J) == 0.0f) {
                        this.f4826J.onRelease();
                    }
                    f2 = fM307b;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f4824H.onRelease();
            } else {
                float f3 = -C0116G5.m307b(this.f4824H, -height, width);
                if (C0116G5.m306a(this.f4824H) == 0.0f) {
                    this.f4824H.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2768a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4856i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1176m) {
            C1176m c1176m = (C1176m) layoutParams;
            if (!c1176m.f4949c) {
                int i = rect.left;
                Rect rect2 = c1176m.f4948b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4864m.mo2853m0(this, view, this.f4856i, !this.f4880u, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            abstractC1175l.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2769b0() {
        VelocityTracker velocityTracker = this.f4830N;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m2780j0(0);
        EdgeEffect edgeEffect = this.f4823G;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4823G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4824H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4824H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4825I;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4825I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4826J;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4826J.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2770c0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        m2784p();
        AbstractC1167d abstractC1167d = this.f4862l;
        int[] iArr = this.f4875r0;
        if (abstractC1167d != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m2771d0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f4870p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m2790v(i4, i5, i6, i7, this.f4871p0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f4833Q;
        int[] iArr2 = this.f4871p0;
        int i13 = iArr2[0];
        this.f4833Q = i12 - i13;
        int i14 = this.f4834R;
        int i15 = iArr2[1];
        this.f4834R = i14 - i15;
        int[] iArr3 = this.f4873q0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m2793y();
                    z = true;
                    C0116G5.m307b(this.f4823G, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        m2794z();
                        C0116G5.m307b(this.f4825I, f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f2 >= 0.0f) {
                            m2744A();
                            C0116G5.m307b(this.f4824H, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                m2792x();
                                C0116G5.m307b(this.f4826J, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (z2 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (z2) {
                            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (z2) {
                }
            }
            m2783n(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            m2791w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1176m) && this.f4864m.mo2664f((C1176m) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2714d()) {
            return this.f4864m.mo2723j(this.f4851f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2714d()) {
            return this.f4864m.mo2669k(this.f4851f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2714d()) {
            return this.f4864m.mo2671l(this.f4851f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2716e()) {
            return this.f4864m.mo2724m(this.f4851f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2716e()) {
            return this.f4864m.mo2674n(this.f4851f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && abstractC1175l.mo2716e()) {
            return this.f4864m.mo2676o(this.f4851f0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2771d0(int i, int i2, int[] iArr) {
        AbstractC1163A abstractC1163A;
        C1197b c1197b = this.f4850f;
        m2776h0();
        m2760S();
        int i3 = C0016Af.f53a;
        Trace.beginSection("RV Scroll");
        C1186w c1186w = this.f4851f0;
        m2746C(c1186w);
        C1181r c1181r = this.f4844c;
        int iMo2677o0 = i != 0 ? this.f4864m.mo2677o0(i, c1181r, c1186w) : 0;
        int iMo2679q0 = i2 != 0 ? this.f4864m.mo2679q0(i2, c1181r, c1186w) : 0;
        Trace.endSection();
        int iM2947e = c1197b.m2947e();
        for (int i4 = 0; i4 < iM2947e; i4++) {
            View viewM2946d = c1197b.m2946d(i4);
            AbstractC1163A abstractC1163AM2753K = m2753K(viewM2946d);
            if (abstractC1163AM2753K != null && (abstractC1163A = abstractC1163AM2753K.f4899i) != null) {
                int left = viewM2946d.getLeft();
                int top2 = viewM2946d.getTop();
                View view = abstractC1163A.f4891a;
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        m2761T(true);
        m2778i0(false);
        if (iArr != null) {
            iArr[0] = iMo2677o0;
            iArr[1] = iMo2679q0;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m477a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m478b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m479c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m480d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList<AbstractC1174k> arrayList = this.f4870p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo2825d(canvas, this);
        }
        EdgeEffect edgeEffect = this.f4823G;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f4854h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4823G;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4824H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4854h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4824H;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4825I;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4854h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4825I;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4826J;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4854h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4826J;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f4827K == null || arrayList.size() <= 0 || !this.f4827K.mo2822f()) ? z : true) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2772e0(int i) {
        C1210o c1210o;
        if (this.f4886x) {
            return;
        }
        setScrollState(0);
        RunnableC1189z runnableC1189z = this.f4845c0;
        RecyclerView.this.removeCallbacks(runnableC1189z);
        runnableC1189z.f4999c.abortAnimation();
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && (c1210o = abstractC1175l.f4930e) != null) {
            c1210o.m2884d();
        }
        AbstractC1175l abstractC1175l2 = this.f4864m;
        if (abstractC1175l2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1175l2.mo2725p0(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m2773f0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM306a = C0116G5.m306a(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f4840a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f4809B0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM306a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo2651T;
        int i2;
        byte b;
        boolean z;
        this.f4864m.getClass();
        boolean z2 = true;
        boolean z3 = (this.f4862l == null || this.f4864m == null || m2756O() || this.f4886x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C1186w c1186w = this.f4851f0;
        C1181r c1181r = this.f4844c;
        if (!z3 || (i != 2 && i != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                m2784p();
                if (m2747D(view) != null) {
                    m2776h0();
                    viewMo2651T = this.f4864m.mo2651T(view, i, c1181r, c1186w);
                    m2778i0(false);
                }
                return null;
            }
            viewMo2651T = viewFindNextFocus;
            if (viewMo2651T == null && !viewMo2651T.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                m2768a0(viewMo2651T, null);
                return view;
            }
            if (viewMo2651T == null || viewMo2651T == this || viewMo2651T == view) {
                z2 = false;
            } else if (m2747D(viewMo2651T) == null) {
                z2 = false;
            } else if (view != null && m2747D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f4856i;
                rect.set(0, 0, width, height);
                int width2 = viewMo2651T.getWidth();
                int height2 = viewMo2651T.getHeight();
                Rect rect2 = this.f4858j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewMo2651T, rect2);
                int i3 = this.f4864m.m2836C() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    b = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(C0944z.m2224d(this, sb));
                                    }
                                    if (b <= 0) {
                                    }
                                } else if (i2 <= 0) {
                                }
                            } else if (b >= 0) {
                            }
                        } else if (i2 >= 0) {
                        }
                    } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    }
                } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                }
            }
            return z2 ? viewMo2651T : super.focusSearch(view, i);
        }
        if (this.f4864m.mo2716e()) {
            if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                z = true;
            }
            if (!z && this.f4864m.mo2714d()) {
                z = focusFinder.findNextFocus(this, view, !((this.f4864m.m2836C() != 1) ^ (i != 2)) ? 66 : 17) != null;
            }
            if (z) {
                m2784p();
                if (m2747D(view) != null) {
                    m2776h0();
                    this.f4864m.mo2651T(view, i, c1181r, c1186w);
                    m2778i0(false);
                }
                return null;
            }
            viewMo2651T = focusFinder.findNextFocus(this, view, i);
            if (viewMo2651T == null) {
            }
            if (viewMo2651T == null) {
                z2 = false;
            }
            if (z2) {
            }
        }
        z = false;
        if (!z) {
            if (focusFinder.findNextFocus(this, view, !((this.f4864m.m2836C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
            }
        }
        if (z) {
        }
        viewMo2651T = focusFinder.findNextFocus(this, view, i);
        if (viewMo2651T == null) {
        }
        if (viewMo2651T == null) {
        }
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2774g0(int i, int i2, boolean z) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4886x) {
            return;
        }
        if (!abstractC1175l.mo2714d()) {
            i = 0;
        }
        if (!this.f4864m.mo2716e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m483g(i3, 1);
        }
        this.f4845c0.m2890c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            return abstractC1175l.mo2680r();
        }
        throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            return abstractC1175l.mo2681s(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1167d getAdapter() {
        return this.f4862l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l == null) {
            return super.getBaseline();
        }
        abstractC1175l.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4854h;
    }

    public C1219x getCompatAccessibilityDelegate() {
        return this.f4865m0;
    }

    public C1171h getEdgeEffectFactory() {
        return this.f4822F;
    }

    public AbstractC1172i getItemAnimator() {
        return this.f4827K;
    }

    public int getItemDecorationCount() {
        return this.f4870p.size();
    }

    public AbstractC1175l getLayoutManager() {
        return this.f4864m;
    }

    public int getMaxFlingVelocity() {
        return this.f4838V;
    }

    public int getMinFlingVelocity() {
        return this.f4837U;
    }

    public long getNanoTime() {
        if (f4811D0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1177n getOnFlingListener() {
        return this.f4836T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4843b0;
    }

    public C1180q getRecycledViewPool() {
        return this.f4844c.m2870c();
    }

    public int getScrollState() {
        return this.f4828L;
    }

    /* JADX INFO: renamed from: h */
    public final void m2775h(AbstractC1163A abstractC1163A) {
        View view = abstractC1163A.f4891a;
        boolean z = view.getParent() == this;
        this.f4844c.m2879l(m2753K(view));
        if (abstractC1163A.m2804j()) {
            this.f4850f.m2944b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f4850f.m2943a(view, -1, true);
            return;
        }
        C1197b c1197b = this.f4850f;
        int iIndexOfChild = c1197b.f5065a.f5197a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1197b.f5066b.m2960h(iIndexOfChild);
            c1197b.m2951i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2776h0() {
        int i = this.f4882v + 1;
        this.f4882v = i;
        if (i != 1 || this.f4886x) {
            return;
        }
        this.f4884w = false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m482f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m2777i(AbstractC1174k abstractC1174k) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            abstractC1175l.mo2713c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC1174k> arrayList = this.f4870p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1174k);
        m2758Q();
        requestLayout();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2778i0(boolean z) {
        if (this.f4882v < 1) {
            if (f4815y0) {
                throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f4882v = 1;
        }
        if (!z && !this.f4886x) {
            this.f4884w = false;
        }
        if (this.f4882v == 1) {
            if (z && this.f4884w && !this.f4886x && this.f4864m != null && this.f4862l != null) {
                m2786r();
            }
            if (!this.f4886x) {
                this.f4884w = false;
            }
        }
        this.f4882v--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4876s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4886x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f618d;
    }

    /* JADX INFO: renamed from: j */
    public final void m2779j(AbstractC1179p abstractC1179p) {
        if (this.f4855h0 == null) {
            this.f4855h0 = new ArrayList();
        }
        this.f4855h0.add(abstractC1179p);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2780j0(int i) {
        getScrollingChildHelper().m484h(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m2781k(String str) {
        if (m2756O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f4821E > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C0944z.m2224d(this, new StringBuilder(""))));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2782m() {
        int iM2950h = this.f4850f.m2950h();
        for (int i = 0; i < iM2950h; i++) {
            AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2949g(i));
            if (!abstractC1163AM2735L.m2809o()) {
                abstractC1163AM2735L.f4894d = -1;
                abstractC1163AM2735L.f4897g = -1;
            }
        }
        C1181r c1181r = this.f4844c;
        ArrayList<AbstractC1163A> arrayList = c1181r.f4960c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1163A abstractC1163A = arrayList.get(i2);
            abstractC1163A.f4894d = -1;
            abstractC1163A.f4897g = -1;
        }
        ArrayList<AbstractC1163A> arrayList2 = c1181r.f4958a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1163A abstractC1163A2 = arrayList2.get(i3);
            abstractC1163A2.f4894d = -1;
            abstractC1163A2.f4897g = -1;
        }
        ArrayList<AbstractC1163A> arrayList3 = c1181r.f4959b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC1163A abstractC1163A3 = c1181r.f4959b.get(i4);
                abstractC1163A3.f4894d = -1;
                abstractC1163A3.f4897g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2783n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4823G;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f4823G.onRelease();
            zIsFinished = this.f4823G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4825I;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4825I.onRelease();
            zIsFinished |= this.f4825I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4824H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4824H.onRelease();
            zIsFinished |= this.f4824H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4826J;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4826J.onRelease();
            zIsFinished |= this.f4826J.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f4820D = 0;
        this.f4876s = true;
        this.f4880u = this.f4880u && !isLayoutRequested();
        this.f4844c.m2871d();
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            abstractC1175l.f4932g = true;
            abstractC1175l.mo2845R(this);
        }
        this.f4863l0 = false;
        if (f4811D0) {
            ThreadLocal<RunnableC1208m> threadLocal = RunnableC1208m.f5158e;
            RunnableC1208m runnableC1208m = threadLocal.get();
            this.f4847d0 = runnableC1208m;
            if (runnableC1208m == null) {
                this.f4847d0 = new RunnableC1208m();
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC1208m runnableC1208m2 = this.f4847d0;
                    runnableC1208m2.f5162c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC1208m2);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC1208m runnableC1208m22 = this.f4847d0;
                    runnableC1208m22.f5162c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC1208m22);
                }
            }
            RunnableC1208m runnableC1208m3 = this.f4847d0;
            runnableC1208m3.getClass();
            boolean z = f4815y0;
            ArrayList<RecyclerView> arrayList = runnableC1208m3.f5160a;
            if (z && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1181r c1181r;
        RunnableC1208m runnableC1208m;
        C1210o c1210o;
        super.onDetachedFromWindow();
        AbstractC1172i abstractC1172i = this.f4827K;
        if (abstractC1172i != null) {
            abstractC1172i.mo2821e();
        }
        int i = 0;
        setScrollState(0);
        RunnableC1189z runnableC1189z = this.f4845c0;
        RecyclerView.this.removeCallbacks(runnableC1189z);
        runnableC1189z.f4999c.abortAnimation();
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null && (c1210o = abstractC1175l.f4930e) != null) {
            c1210o.m2884d();
        }
        this.f4876s = false;
        AbstractC1175l abstractC1175l2 = this.f4864m;
        if (abstractC1175l2 != null) {
            abstractC1175l2.f4932g = false;
            abstractC1175l2.mo2702S(this);
        }
        this.f4877s0.clear();
        removeCallbacks(this.f4879t0);
        this.f4852g.getClass();
        while (C1155C.a.f4753d.mo128a() != null) {
        }
        int i2 = 0;
        while (true) {
            c1181r = this.f4844c;
            ArrayList<AbstractC1163A> arrayList = c1181r.f4960c;
            if (i2 >= arrayList.size()) {
                break;
            }
            C0957zc.m2247a(arrayList.get(i2).f4891a);
            i2++;
        }
        c1181r.m2872e(RecyclerView.this.f4862l, false);
        int i3 = C0957zc.f3566a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = C0957zc.f3566a;
            C0032Bc c0032Bc = (C0032Bc) childAt.getTag(i5);
            if (c0032Bc == null) {
                c0032Bc = new C0032Bc();
                childAt.setTag(i5, c0032Bc);
            }
            ArrayList<InterfaceC0013Ac> arrayList2 = c0032Bc.f119a;
            for (int iM1756c0 = C0739o3.m1756c0(arrayList2); -1 < iM1756c0; iM1756c0--) {
                arrayList2.get(iM1756c0).m43a();
            }
            i = i4;
        }
        if (!f4811D0 || (runnableC1208m = this.f4847d0) == null) {
            return;
        }
        boolean zRemove = runnableC1208m.f5160a.remove(this);
        if (f4815y0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f4847d0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<AbstractC1174k> arrayList = this.f4870p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo312c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        AbstractC1175l abstractC1175l;
        if (this.f4864m != null && !this.f4886x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f4864m.mo2716e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f4864m.mo2714d() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f != 0.0f || axisValue != 0.0f) {
                    int i = (int) (axisValue * this.f4839W);
                    int i2 = (int) (f * this.f4841a0);
                    abstractC1175l = this.f4864m;
                    if (abstractC1175l != null) {
                        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return false;
                    }
                    if (!this.f4886x) {
                        int[] iArr = this.f4875r0;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        boolean zMo2714d = abstractC1175l.mo2714d();
                        boolean zMo2716e = this.f4864m.mo2716e();
                        int i3 = zMo2716e ? (zMo2714d ? 1 : 0) | 2 : zMo2714d ? 1 : 0;
                        float y = motionEvent.getY();
                        float x = motionEvent.getX();
                        int iM2766Y = i - m2766Y(i, y);
                        int iM2767Z = i2 - m2767Z(i2, x);
                        getScrollingChildHelper().m483g(i3, 1);
                        if (m2789u(zMo2714d ? iM2766Y : 0, zMo2716e ? iM2767Z : 0, this.f4875r0, this.f4871p0, 1)) {
                            iM2766Y -= iArr[0];
                            iM2767Z -= iArr[1];
                        }
                        m2770c0(zMo2714d ? iM2766Y : 0, zMo2716e ? iM2767Z : 0, motionEvent, 1);
                        RunnableC1208m runnableC1208m = this.f4847d0;
                        if (runnableC1208m != null && (iM2766Y != 0 || iM2767Z != 0)) {
                            runnableC1208m.m2973a(this, iM2766Y, iM2767Z);
                        }
                        m2780j0(1);
                    }
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f4864m.mo2716e()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        int i4 = (int) (axisValue * this.f4839W);
                        int i22 = (int) (f * this.f4841a0);
                        abstractC1175l = this.f4864m;
                        if (abstractC1175l != null) {
                        }
                    }
                } else {
                    if (this.f4864m.mo2714d()) {
                        axisValue = axisValue2;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00c6 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f4886x) {
            this.f4874r = null;
            if (m2748E(motionEvent)) {
                m2769b0();
                setScrollState(0);
                return true;
            }
            AbstractC1175l abstractC1175l = this.f4864m;
            if (abstractC1175l != null) {
                boolean zMo2714d = abstractC1175l.mo2714d();
                boolean zMo2716e = this.f4864m.mo2716e();
                if (this.f4830N == null) {
                    this.f4830N = VelocityTracker.obtain();
                }
                this.f4830N.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f4888y) {
                        this.f4888y = false;
                    }
                    this.f4829M = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f4833Q = x;
                    this.f4831O = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f4834R = y;
                    this.f4832P = y;
                    EdgeEffect edgeEffect = this.f4823G;
                    if (edgeEffect == null || C0116G5.m306a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        C0116G5.m307b(this.f4823G, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f4825I;
                    boolean z3 = z;
                    if (edgeEffect2 != null) {
                        z3 = z;
                        if (C0116G5.m306a(edgeEffect2) != 0.0f) {
                            z3 = z;
                            if (!canScrollHorizontally(1)) {
                                C0116G5.m307b(this.f4825I, 0.0f, motionEvent.getY() / getHeight());
                                z3 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f4824H;
                    boolean z4 = z3;
                    if (edgeEffect3 != null) {
                        z4 = z3;
                        if (C0116G5.m306a(edgeEffect3) != 0.0f) {
                            z4 = z3;
                            if (!canScrollVertically(-1)) {
                                C0116G5.m307b(this.f4824H, 0.0f, motionEvent.getX() / getWidth());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f4826J;
                    boolean z5 = z4;
                    if (edgeEffect4 != null) {
                        z5 = z4;
                        if (C0116G5.m306a(edgeEffect4) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(1)) {
                                C0116G5.m307b(this.f4826J, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z5 = true;
                            }
                        }
                    }
                    if (z5 || this.f4828L == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m2780j0(1);
                    }
                    int[] iArr = this.f4873q0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zMo2714d;
                    if (zMo2716e) {
                        i = (zMo2714d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m483g(i, 0);
                } else if (actionMasked == 1) {
                    this.f4830N.clear();
                    m2780j0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4829M);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4829M + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f4828L != 1) {
                        int i2 = x2 - this.f4831O;
                        int i3 = y2 - this.f4832P;
                        if (!zMo2714d || Math.abs(i2) <= this.f4835S) {
                            z2 = false;
                        } else {
                            this.f4833Q = x2;
                            z2 = true;
                        }
                        if (zMo2716e && Math.abs(i3) > this.f4835S) {
                            this.f4834R = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m2769b0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f4829M = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f4833Q = x3;
                    this.f4831O = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f4834R = y3;
                    this.f4832P = y3;
                } else if (actionMasked == 6) {
                    m2762U(motionEvent);
                }
                if (this.f4828L == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C0016Af.f53a;
        Trace.beginSection("RV OnLayout");
        m2786r();
        Trace.endSection();
        this.f4880u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l == null) {
            m2785q(i, i2);
            return;
        }
        boolean zMo2695L = abstractC1175l.mo2695L();
        boolean z = false;
        C1186w c1186w = this.f4851f0;
        if (!zMo2695L) {
            if (this.f4878t) {
                this.f4864m.f4927b.m2785q(i, i2);
                return;
            }
            if (c1186w.f4993k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1167d abstractC1167d = this.f4862l;
            if (abstractC1167d != null) {
                c1186w.f4987e = abstractC1167d.mo109a();
            } else {
                c1186w.f4987e = 0;
            }
            m2776h0();
            this.f4864m.f4927b.m2785q(i, i2);
            m2778i0(false);
            c1186w.f4989g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f4864m.f4927b.m2785q(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.f4881u0 = z;
        if (z || this.f4862l == null) {
            return;
        }
        if (c1186w.f4986d == 1) {
            m2787s();
        }
        this.f4864m.m2857s0(i, i2);
        c1186w.f4991i = true;
        m2788t();
        this.f4864m.m2859u0(i, i2);
        if (this.f4864m.mo2727x0()) {
            this.f4864m.m2857s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c1186w.f4991i = true;
            m2788t();
            this.f4864m.m2859u0(i, i2);
        }
        this.f4883v0 = getMeasuredWidth();
        this.f4885w0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m2756O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1184u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1184u c1184u = (C1184u) parcelable;
        this.f4846d = c1184u;
        super.onRestoreInstanceState(c1184u.f3119a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1184u c1184u = new C1184u(super.onSaveInstanceState());
        C1184u c1184u2 = this.f4846d;
        if (c1184u2 != null) {
            c1184u.f4967c = c1184u2.f4967c;
            return c1184u;
        }
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            c1184u.f4967c = abstractC1175l.mo2720g0();
            return c1184u;
        }
        c1184u.f4967c = null;
        return c1184u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f4826J = null;
        this.f4824H = null;
        this.f4825I = null;
        this.f4823G = null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:239:0x039e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x00fe */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b2, code lost:
    
        if (r5 == 0) goto L268;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd A[PHI: r1
  0x00fd: PHI (r1v70 int) = (r1v54 int), (r1v74 int) binds: [B:51:0x00e6, B:55:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.recyclerview.widget.RecyclerView$l] */
    /* JADX WARN: Type inference failed for: r1v17, types: [a.Jb] */
    /* JADX WARN: Type inference failed for: r1v22, types: [a.Jb] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.recyclerview.widget.A, androidx.recyclerview.widget.u] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2748E;
        int iMax;
        int i;
        RunnableC1189z runnableC1189z;
        float f;
        float f2;
        ?? r22;
        int i2;
        int minFlingVelocity;
        boolean z;
        boolean z2;
        int iM2827H;
        PointF pointFMo2710a;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        if (!this.f4886x && !this.f4888y) {
            InterfaceC1178o interfaceC1178o = this.f4874r;
            if (interfaceC1178o == null) {
                zM2748E = motionEvent.getAction() == 0 ? false : m2748E(motionEvent);
            } else {
                interfaceC1178o.mo2866b(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f4874r = null;
                }
                zM2748E = true;
            }
            if (zM2748E) {
                m2769b0();
                setScrollState(0);
                return true;
            }
            AbstractC1175l abstractC1175l = this.f4864m;
            if (abstractC1175l != null) {
                boolean zMo2714d = abstractC1175l.mo2714d();
                boolean zMo2716e = this.f4864m.mo2716e();
                if (this.f4830N == null) {
                    this.f4830N = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f4873q0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.f4829M = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f4833Q = x;
                    this.f4831O = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f4834R = y;
                    this.f4832P = y;
                    ?? r9 = zMo2714d;
                    if (zMo2716e) {
                        r9 = (zMo2714d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m483g(r9, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f4830N.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.f4830N;
                        int i5 = this.f4838V;
                        velocityTracker.computeCurrentVelocity(1000, i5);
                        float f3 = zMo2714d ? -this.f4830N.getXVelocity(this.f4829M) : 0.0f;
                        float f4 = zMo2716e ? -this.f4830N.getYVelocity(this.f4829M) : 0.0f;
                        if (f3 == 0.0f && f4 == 0.0f) {
                            i4 = 0;
                        } else {
                            int i6 = (int) f3;
                            int iMax2 = (int) f4;
                            AbstractC1175l abstractC1175l2 = this.f4864m;
                            if (abstractC1175l2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f4886x) {
                                boolean zMo2714d2 = abstractC1175l2.mo2714d();
                                boolean zMo2716e2 = this.f4864m.mo2716e();
                                int i7 = this.f4837U;
                                if (!zMo2714d2 || Math.abs(i6) < i7) {
                                    i6 = 0;
                                }
                                if (!zMo2716e2 || Math.abs(iMax2) < i7) {
                                    iMax2 = 0;
                                }
                                if (i6 != 0 || iMax2 != 0) {
                                    if (i6 == 0) {
                                        iMax = 0;
                                        if (iMax2 == 0) {
                                            i = iMax2;
                                            iMax2 = 0;
                                            runnableC1189z = this.f4845c0;
                                            if (iMax == 0 || iMax2 != 0) {
                                                int i8 = -i5;
                                                iMax = Math.max(i8, Math.min(iMax, i5));
                                                iMax2 = Math.max(i8, Math.min(iMax2, i5));
                                                runnableC1189z.m2888a(iMax, iMax2);
                                            }
                                            if (i6 == 0 || i != 0) {
                                                f = i6;
                                                f2 = i;
                                                if (!dispatchNestedPreFling(f, f2)) {
                                                    boolean z5 = zMo2714d2 || zMo2716e2;
                                                    dispatchNestedFling(f, f2, z5);
                                                    AbstractC1177n abstractC1177n = this.f4836T;
                                                    if (abstractC1177n != null) {
                                                        AbstractC1153A abstractC1153A = (AbstractC1153A) abstractC1177n;
                                                        ?? layoutManager = abstractC1153A.f4740a.getLayoutManager();
                                                        if (layoutManager != 0 && abstractC1153A.f4740a.getAdapter() != null && ((Math.abs(i) > (minFlingVelocity = abstractC1153A.f4740a.getMinFlingVelocity()) || Math.abs(i6) > minFlingVelocity) && ((z = layoutManager instanceof AbstractC1185v.b)))) {
                                                            ?? r5 = (C1216u) abstractC1153A;
                                                            C1215t c1215t = !z ? null : new C1215t(r5, r5.f4740a.getContext());
                                                            if (c1215t == null) {
                                                                r22 = zMo2714d2;
                                                                i2 = 1;
                                                            } else {
                                                                int iM2835B = layoutManager.m2835B();
                                                                if (iM2835B != 0) {
                                                                    AbstractC1214s abstractC1214sM2997f = layoutManager.mo2716e() ? r5.m2997f(layoutManager) : layoutManager.mo2714d() ? r5.m2996e(layoutManager) : null;
                                                                    if (abstractC1214sM2997f == null) {
                                                                        z2 = zMo2714d2;
                                                                        i2 = 1;
                                                                    } else {
                                                                        i2 = 1;
                                                                        int iM2860v = layoutManager.m2860v();
                                                                        z2 = zMo2714d2;
                                                                        int i9 = Integer.MIN_VALUE;
                                                                        int i10 = Integer.MAX_VALUE;
                                                                        int i11 = 0;
                                                                        View view = null;
                                                                        View view2 = null;
                                                                        while (i11 < iM2860v) {
                                                                            int i12 = iM2860v;
                                                                            View viewM2858u = layoutManager.m2858u(i11);
                                                                            if (viewM2858u == null) {
                                                                                i3 = i11;
                                                                            } else {
                                                                                i3 = i11;
                                                                                int iM2994c = C1216u.m2994c(viewM2858u, abstractC1214sM2997f);
                                                                                if (iM2994c <= 0 && iM2994c > i9) {
                                                                                    i9 = iM2994c;
                                                                                    view2 = viewM2858u;
                                                                                }
                                                                                if (iM2994c >= 0 && iM2994c < i10) {
                                                                                    i10 = iM2994c;
                                                                                    view = viewM2858u;
                                                                                }
                                                                            }
                                                                            i11 = i3 + 1;
                                                                            iM2860v = i12;
                                                                        }
                                                                        boolean z6 = !layoutManager.mo2714d() ? i <= 0 : i6 <= 0;
                                                                        if (z6 && view != null) {
                                                                            iM2827H = AbstractC1175l.m2827H(view);
                                                                            z3 = z2;
                                                                        } else if (z6 || view2 == null) {
                                                                            if (z6) {
                                                                                view = view2;
                                                                            }
                                                                            if (view != null) {
                                                                                iM2827H = ((z && (pointFMo2710a = ((AbstractC1185v.b) layoutManager).mo2710a(layoutManager.m2835B() + (-1))) != null && ((pointFMo2710a.x > 0.0f ? 1 : (pointFMo2710a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo2710a.y > 0.0f ? 1 : (pointFMo2710a.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + AbstractC1175l.m2827H(view);
                                                                                z3 = z2;
                                                                                if (iM2827H < 0 || iM2827H >= iM2835B) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            iM2827H = AbstractC1175l.m2827H(view2);
                                                                            z3 = z2;
                                                                        }
                                                                        r22 = z3;
                                                                        if (iM2827H == -1) {
                                                                            c1215t.f4968a = iM2827H;
                                                                            layoutManager.m2834A0(c1215t);
                                                                        }
                                                                    }
                                                                    iM2827H = -1;
                                                                    z3 = z2;
                                                                    r22 = z3;
                                                                    if (iM2827H == -1) {
                                                                    }
                                                                }
                                                            }
                                                            if (z5) {
                                                                getScrollingChildHelper().m483g(zMo2716e2 ? r22 | 2 : r22, i2);
                                                                int i13 = -i5;
                                                                runnableC1189z.m2888a(Math.max(i13, Math.min(i6, i5)), Math.max(i13, Math.min(i, i5)));
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (iMax == 0) {
                                            }
                                            m2769b0();
                                        } else {
                                            EdgeEffect edgeEffect = this.f4824H;
                                            if (edgeEffect == null || C0116G5.m306a(edgeEffect) == 0.0f) {
                                                EdgeEffect edgeEffect2 = this.f4826J;
                                                if (edgeEffect2 != null && C0116G5.m306a(edgeEffect2) != 0.0f) {
                                                    if (m2773f0(this.f4826J, iMax2, getHeight())) {
                                                        this.f4826J.onAbsorb(iMax2);
                                                        iMax2 = 0;
                                                    }
                                                    i = 0;
                                                    runnableC1189z = this.f4845c0;
                                                    if (iMax == 0) {
                                                        int i82 = -i5;
                                                        iMax = Math.max(i82, Math.min(iMax, i5));
                                                        iMax2 = Math.max(i82, Math.min(iMax2, i5));
                                                        runnableC1189z.m2888a(iMax, iMax2);
                                                        if (i6 == 0) {
                                                            f = i6;
                                                            f2 = i;
                                                            if (!dispatchNestedPreFling(f, f2)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i = iMax2;
                                                iMax2 = 0;
                                                runnableC1189z = this.f4845c0;
                                                if (iMax == 0) {
                                                }
                                            } else {
                                                int i14 = -iMax2;
                                                if (m2773f0(this.f4824H, i14, getHeight())) {
                                                    this.f4824H.onAbsorb(i14);
                                                    iMax2 = 0;
                                                }
                                                i = 0;
                                                runnableC1189z = this.f4845c0;
                                                if (iMax == 0) {
                                                }
                                            }
                                        }
                                    } else {
                                        EdgeEffect edgeEffect3 = this.f4823G;
                                        if (edgeEffect3 == null || C0116G5.m306a(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.f4825I;
                                            if (edgeEffect4 != null && C0116G5.m306a(edgeEffect4) != 0.0f) {
                                                if (m2773f0(this.f4825I, i6, getWidth())) {
                                                    this.f4825I.onAbsorb(i6);
                                                    i6 = 0;
                                                }
                                                iMax = i6;
                                                i6 = 0;
                                                if (iMax2 == 0) {
                                                }
                                            }
                                            iMax = 0;
                                            if (iMax2 == 0) {
                                            }
                                        } else {
                                            int i15 = -i6;
                                            if (m2773f0(this.f4823G, i15, getWidth())) {
                                                this.f4823G.onAbsorb(i15);
                                                i6 = 0;
                                            }
                                            iMax = i6;
                                            i6 = 0;
                                            if (iMax2 == 0) {
                                            }
                                        }
                                    }
                                    motionEventObtain.recycle();
                                    return true;
                                }
                            }
                            i4 = 0;
                        }
                        setScrollState(i4);
                        m2769b0();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f4829M);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4829M + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.f4833Q - x2;
                        int iMax4 = this.f4834R - y2;
                        if (this.f4828L != 1) {
                            if (zMo2714d) {
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f4835S) : Math.min(0, iMax3 + this.f4835S);
                                if (iMax3 != 0) {
                                    z4 = true;
                                }
                                if (zMo2716e) {
                                }
                                if (z4) {
                                }
                            } else {
                                z4 = false;
                                if (zMo2716e) {
                                    iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f4835S) : Math.min(0, iMax4 + this.f4835S);
                                    if (iMax4 != 0) {
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    setScrollState(1);
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.f4828L == 1) {
                            int[] iArr2 = this.f4875r0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM2766Y = iMax3 - m2766Y(iMax3, motionEvent.getY());
                            int iM2767Z = iMax4 - m2767Z(iMax4, motionEvent.getX());
                            boolean zM2789u = m2789u(zMo2714d ? iM2766Y : 0, zMo2716e ? iM2767Z : 0, this.f4875r0, this.f4871p0, 0);
                            int[] iArr3 = this.f4871p0;
                            if (zM2789u) {
                                iM2766Y -= iArr2[0];
                                iM2767Z -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i16 = iM2766Y;
                            int i17 = iM2767Z;
                            this.f4833Q = x2 - iArr3[0];
                            this.f4834R = y2 - iArr3[1];
                            if (m2770c0(zMo2714d ? i16 : 0, zMo2716e ? i17 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC1208m runnableC1208m = this.f4847d0;
                            if (runnableC1208m != null && (i16 != 0 || i17 != 0)) {
                                runnableC1208m.m2973a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        m2769b0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f4829M = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f4833Q = x3;
                        this.f4831O = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f4834R = y3;
                        this.f4832P = y3;
                    } else if (actionMasked == 6) {
                        m2762U(motionEvent);
                    }
                }
                this.f4830N.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m2784p() {
        C1196a c1196a = this.f4848e;
        if (!this.f4880u || this.f4818B) {
            int i = C0016Af.f53a;
            Trace.beginSection("RV FullInvalidate");
            m2786r();
            Trace.endSection();
            return;
        }
        if (c1196a.m2938f()) {
            c1196a.getClass();
            if (c1196a.m2938f()) {
                int i2 = C0016Af.f53a;
                Trace.beginSection("RV FullInvalidate");
                m2786r();
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2785q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setMeasuredDimension(AbstractC1175l.m2831g(i, paddingRight, getMinimumWidth()), AbstractC1175l.m2831g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:240:0x028d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:242:0x0380 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:243:0x037c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.recyclerview.widget.RecyclerView$A] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2786r() {
        boolean z;
        ?? r11;
        View viewFindViewById;
        boolean z2;
        AbstractC1172i.b bVar;
        ?? r3;
        RecyclerView recyclerView;
        boolean zMo2962g;
        boolean z3;
        if (this.f4862l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f4864m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C1186w c1186w = this.f4851f0;
        boolean z4 = false;
        c1186w.f4991i = false;
        boolean z5 = true;
        boolean z6 = this.f4881u0 && !(this.f4883v0 == getWidth() && this.f4885w0 == getHeight());
        this.f4883v0 = 0;
        this.f4885w0 = 0;
        this.f4881u0 = false;
        if (c1186w.f4986d == 1) {
            m2787s();
            this.f4864m.m2856r0(this);
            m2788t();
        } else {
            C1196a c1196a = this.f4848e;
            if ((c1196a.f5059c.isEmpty() || c1196a.f5058b.isEmpty()) && !z6 && this.f4864m.f4939n == getWidth() && this.f4864m.f4940o == getHeight()) {
                this.f4864m.m2856r0(this);
            } else {
                this.f4864m.m2856r0(this);
                m2788t();
            }
        }
        c1186w.m2886a(4);
        m2776h0();
        m2760S();
        c1186w.f4986d = 1;
        boolean z7 = c1186w.f4992j;
        View view = null;
        Long l = null;
        C1181r c1181r = this.f4844c;
        C1155C c1155c = this.f4852g;
        if (z7) {
            int iM2947e = this.f4850f.m2947e() - 1;
            while (iM2947e >= 0) {
                AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2946d(iM2947e));
                if (abstractC1163AM2735L.m2809o()) {
                    z3 = z5;
                } else {
                    long jM2752J = m2752J(abstractC1163AM2735L);
                    this.f4827K.getClass();
                    AbstractC1172i.b bVar2 = new AbstractC1172i.b();
                    bVar2.m2824a(abstractC1163AM2735L);
                    AbstractC1163A abstractC1163A = (AbstractC1163A) c1155c.f4752b.m990c(jM2752J, l);
                    if (abstractC1163A == null || abstractC1163A.m2809o()) {
                        z3 = z5;
                        c1155c.m2642a(abstractC1163AM2735L, bVar2);
                    } else {
                        C0598ge<AbstractC1163A, C1155C.a> c0598ge = c1155c.f4751a;
                        z3 = z5;
                        C1155C.a orDefault = c0598ge.getOrDefault(abstractC1163A, l);
                        boolean z8 = (orDefault == null || (orDefault.f4754a & 1) == 0) ? false : z3;
                        C1155C.a orDefault2 = c0598ge.getOrDefault(abstractC1163AM2735L, l);
                        boolean z9 = (orDefault2 == null || (orDefault2.f4754a & 1) == 0) ? false : z3;
                        if (z8 && abstractC1163A == abstractC1163AM2735L) {
                            c1155c.m2642a(abstractC1163AM2735L, bVar2);
                        } else {
                            AbstractC1172i.b bVarM2643b = c1155c.m2643b(abstractC1163A, 4);
                            c1155c.m2642a(abstractC1163AM2735L, bVar2);
                            AbstractC1172i.b bVarM2643b2 = c1155c.m2643b(abstractC1163AM2735L, 8);
                            if (bVarM2643b == null) {
                                int iM2947e2 = this.f4850f.m2947e();
                                for (int i = 0; i < iM2947e2; i++) {
                                    AbstractC1163A abstractC1163AM2735L2 = m2735L(this.f4850f.m2946d(i));
                                    if (abstractC1163AM2735L2 != abstractC1163AM2735L && m2752J(abstractC1163AM2735L2) == jM2752J) {
                                        AbstractC1167d abstractC1167d = this.f4862l;
                                        if (abstractC1167d == null || !abstractC1167d.f4913b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC1163AM2735L2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC1163AM2735L);
                                            throw new IllegalStateException(C0944z.m2224d(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC1163AM2735L2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC1163AM2735L);
                                        throw new IllegalStateException(C0944z.m2224d(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1163A + " cannot be found but it is necessary for " + abstractC1163AM2735L + m2745B());
                            } else {
                                abstractC1163A.m2808n(false);
                                if (z8) {
                                    m2775h(abstractC1163A);
                                }
                                if (abstractC1163A != abstractC1163AM2735L) {
                                    if (z9) {
                                        m2775h(abstractC1163AM2735L);
                                    }
                                    abstractC1163A.f4898h = abstractC1163AM2735L;
                                    m2775h(abstractC1163A);
                                    c1181r.m2879l(abstractC1163A);
                                    abstractC1163AM2735L.m2808n(false);
                                    abstractC1163AM2735L.f4899i = abstractC1163A;
                                }
                                if (this.f4827K.mo2818a(abstractC1163A, abstractC1163AM2735L, bVarM2643b, bVarM2643b2)) {
                                    m2763V();
                                }
                            }
                        }
                    }
                }
                iM2947e--;
                z5 = z3;
                l = null;
            }
            z = z5;
            C0598ge<AbstractC1163A, C1155C.a> c0598ge2 = c1155c.f4751a;
            int i2 = c0598ge2.f2221c - 1;
            while (i2 >= 0) {
                AbstractC1163A abstractC1163AM1436h = c0598ge2.m1436h(i2);
                C1155C.a aVarM1437i = c0598ge2.m1437i(i2);
                int i3 = aVarM1437i.f4754a;
                int i4 = i3 & 3;
                C1166c c1166c = this.f4887x0;
                if (i4 == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.f4864m.m2851k0(abstractC1163AM1436h.f4891a, recyclerView2.f4844c);
                    r3 = z4;
                } else if ((i3 & 1) != 0) {
                    AbstractC1172i.b bVar3 = aVarM1437i.f4755b;
                    if (bVar3 == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.f4864m.m2851k0(abstractC1163AM1436h.f4891a, recyclerView3.f4844c);
                        r3 = z4;
                    } else {
                        c1166c.m2812b(abstractC1163AM1436h, bVar3, aVarM1437i.f4756c);
                        r3 = z4;
                    }
                } else if ((i3 & 14) == 14) {
                    c1166c.m2811a(abstractC1163AM1436h, aVarM1437i.f4755b, aVarM1437i.f4756c);
                    r3 = z4;
                } else if ((i3 & 12) == 12) {
                    AbstractC1172i.b bVar4 = aVarM1437i.f4755b;
                    AbstractC1172i.b bVar5 = aVarM1437i.f4756c;
                    c1166c.getClass();
                    abstractC1163AM1436h.m2808n(z4);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (!recyclerView4.f4818B) {
                        AbstractC1221z abstractC1221z = (AbstractC1221z) recyclerView4.f4827K;
                        abstractC1221z.getClass();
                        int i5 = bVar4.f4923a;
                        int i6 = bVar5.f4923a;
                        if (i5 == i6 && bVar4.f4924b == bVar5.f4924b) {
                            abstractC1221z.m2819c(abstractC1163AM1436h);
                            recyclerView = recyclerView4;
                            zMo2962g = false;
                        } else {
                            recyclerView = recyclerView4;
                            zMo2962g = abstractC1221z.mo2962g(abstractC1163AM1436h, i5, bVar4.f4924b, i6, bVar5.f4924b);
                        }
                        if (zMo2962g) {
                            recyclerView.m2763V();
                        }
                    } else if (recyclerView4.f4827K.mo2818a(abstractC1163AM1436h, abstractC1163AM1436h, bVar4, bVar5)) {
                        recyclerView4.m2763V();
                    }
                    r3 = 0;
                } else {
                    if ((i3 & 4) != 0) {
                        bVar = null;
                        c1166c.m2812b(abstractC1163AM1436h, aVarM1437i.f4755b, null);
                    } else {
                        bVar = null;
                        if ((i3 & 8) != 0) {
                            c1166c.m2811a(abstractC1163AM1436h, aVarM1437i.f4755b, aVarM1437i.f4756c);
                        }
                    }
                    r3 = 0;
                    aVarM1437i.f4754a = r3;
                    aVarM1437i.f4755b = bVar;
                    aVarM1437i.f4756c = bVar;
                    C1155C.a.f4753d.mo130c(aVarM1437i);
                    i2--;
                    z4 = false;
                }
                bVar = null;
                aVarM1437i.f4754a = r3;
                aVarM1437i.f4755b = bVar;
                aVarM1437i.f4756c = bVar;
                C1155C.a.f4753d.mo130c(aVarM1437i);
                i2--;
                z4 = false;
            }
            view = null;
        } else {
            z = true;
        }
        this.f4864m.m2850j0(c1181r);
        c1186w.f4984b = c1186w.f4987e;
        this.f4818B = false;
        this.f4819C = false;
        c1186w.f4992j = false;
        c1186w.f4993k = false;
        this.f4864m.f4931f = false;
        ArrayList<AbstractC1163A> arrayList = c1181r.f4959b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l.f4936k) {
            abstractC1175l.f4935j = 0;
            abstractC1175l.f4936k = false;
            c1181r.m2880m();
        }
        this.f4864m.mo2663e0(c1186w);
        boolean z10 = z;
        m2761T(z10);
        m2778i0(false);
        c1155c.f4751a.clear();
        c1155c.f4752b.m988a();
        int[] iArr = this.f4867n0;
        int i7 = iArr[0];
        int i8 = iArr[z10 ? 1 : 0];
        m2749F(iArr);
        if ((iArr[0] == i7 && iArr[z10 ? 1 : 0] == i8) ? false : true) {
            m2791w(0, 0);
        }
        if (this.f4843b0 && this.f4862l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (this.f4850f.f5067c.contains(getFocusedChild())) {
                    long j = c1186w.f4995m;
                    if (j != -1 && (z2 = this.f4862l.f4913b) && z2) {
                        int iM2950h = this.f4850f.m2950h();
                        int i9 = 0;
                        r11 = view;
                        while (true) {
                            if (i9 >= iM2950h) {
                                break;
                            }
                            AbstractC1163A abstractC1163AM2735L3 = m2735L(this.f4850f.m2949g(i9));
                            if (abstractC1163AM2735L3 != null && !abstractC1163AM2735L3.m2802h() && abstractC1163AM2735L3.f4895e == j) {
                                if (!this.f4850f.f5067c.contains(abstractC1163AM2735L3.f4891a)) {
                                    r11 = abstractC1163AM2735L3;
                                    break;
                                }
                                r11 = abstractC1163AM2735L3;
                            }
                            i9++;
                            r11 = r11;
                        }
                    } else {
                        r11 = view;
                    }
                    if (r11 != 0) {
                        ArrayList arrayList2 = this.f4850f.f5067c;
                        View view2 = r11.f4891a;
                        if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                            view = view2;
                        } else if (this.f4850f.m2947e() > 0) {
                            int i10 = c1186w.f4994l;
                            int i11 = i10 != -1 ? i10 : 0;
                            int iM2887b = c1186w.m2887b();
                            for (int i12 = i11; i12 < iM2887b; i12++) {
                                AbstractC1163A abstractC1163AM2750H = m2750H(i12);
                                if (abstractC1163AM2750H == null) {
                                    break;
                                }
                                View view3 = abstractC1163AM2750H.f4891a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                    break;
                                }
                            }
                            int iMin = Math.min(iM2887b, i11) - 1;
                            while (true) {
                                if (iMin < 0) {
                                    break;
                                }
                                AbstractC1163A abstractC1163AM2750H2 = m2750H(iMin);
                                if (abstractC1163AM2750H2 == null) {
                                    break;
                                }
                                View view4 = abstractC1163AM2750H2.f4891a;
                                if (view4.hasFocusable()) {
                                    view = view4;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        if (view != null) {
                            int i13 = c1186w.f4996n;
                            if (i13 != -1 && (viewFindViewById = view.findViewById(i13)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
            }
        }
        c1186w.f4995m = -1L;
        c1186w.f4994l = -1;
        c1186w.f4996n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC1163A abstractC1163AM2735L = m2735L(view);
        if (abstractC1163AM2735L != null) {
            if (abstractC1163AM2735L.m2804j()) {
                abstractC1163AM2735L.f4900j &= -257;
            } else if (!abstractC1163AM2735L.m2809o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC1163AM2735L);
                throw new IllegalArgumentException(C0944z.m2224d(this, sb));
            }
        } else if (f4815y0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(C0944z.m2224d(this, sb2));
        }
        view.clearAnimation();
        m2735L(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C1210o c1210o = this.f4864m.f4930e;
        if ((c1210o == null || !c1210o.f4972e) && !m2756O() && view2 != null) {
            m2768a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4864m.mo2853m0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList<InterfaceC1178o> arrayList = this.f4872q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4882v != 0 || this.f4886x) {
            this.f4884w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2787s() {
        View viewM2747D;
        int iM2751I;
        C1155C.a orDefault;
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        byte b;
        int i3;
        boolean z4;
        boolean z5;
        C1196a.a aVarM2939g;
        int i4;
        int i5;
        C1196a.a aVar;
        C1186w c1186w = this.f4851f0;
        c1186w.m2886a(1);
        m2746C(c1186w);
        c1186w.f4991i = false;
        m2776h0();
        C1155C c1155c = this.f4852g;
        c1155c.f4751a.clear();
        C0371U9<AbstractC1163A> c0371u9 = c1155c.f4752b;
        c0371u9.m988a();
        m2760S();
        if (this.f4818B) {
            C1196a c1196a = this.f4848e;
            c1196a.m2941i(c1196a.f5058b);
            c1196a.m2941i(c1196a.f5059c);
            if (this.f4819C) {
                this.f4864m.mo2657Z();
            }
        }
        if (this.f4827K == null || !this.f4864m.mo2647B0()) {
            this.f4848e.m2934b();
        } else {
            C1196a c1196a2 = this.f4848e;
            ArrayList<C1196a.a> arrayList = c1196a2.f5058b;
            C1211p c1211p = c1196a2.f5061e;
            c1211p.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z6 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (arrayList.get(size).f5062a == 8) {
                        if (z6) {
                            break;
                        }
                    } else {
                        z6 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i6 = size + 1;
                C1196a.a aVar2 = arrayList.get(size);
                C1196a.a aVar3 = arrayList.get(i6);
                int i7 = aVar3.f5062a;
                if (i7 != 1) {
                    C1196a c1196a3 = c1211p.f5190a;
                    C1196a.a aVarM2939g2 = null;
                    if (i7 == 2) {
                        int i8 = aVar2.f5063b;
                        int i9 = aVar2.f5064c;
                        if (i8 < i9) {
                            if (aVar3.f5063b == i8 && aVar3.f5064c == i9 - i8) {
                                z4 = false;
                                z5 = true;
                            } else {
                                z4 = false;
                                z5 = false;
                            }
                        } else if (aVar3.f5063b == i9 + 1 && aVar3.f5064c == i8 - i9) {
                            z4 = true;
                            z5 = true;
                        } else {
                            z4 = true;
                            z5 = false;
                        }
                        int i10 = aVar3.f5063b;
                        if (i9 < i10) {
                            aVar3.f5063b = i10 - 1;
                        } else {
                            int i11 = aVar3.f5064c;
                            if (i9 < i10 + i11) {
                                aVar3.f5064c = i11 - 1;
                                aVar2.f5062a = 2;
                                aVar2.f5064c = 1;
                                if (aVar3.f5064c == 0) {
                                    arrayList.remove(i6);
                                    c1196a3.f5057a.mo130c(aVar3);
                                }
                            }
                        }
                        int i12 = aVar2.f5063b;
                        int i13 = aVar3.f5063b;
                        if (i12 <= i13) {
                            aVar3.f5063b = i13 + 1;
                        } else {
                            int i14 = i13 + aVar3.f5064c;
                            if (i12 < i14) {
                                aVarM2939g2 = c1196a3.m2939g(2, i12 + 1, i14 - i12);
                                aVar3.f5064c = aVar2.f5063b - aVar3.f5063b;
                            }
                        }
                        C1196a.a aVar4 = aVarM2939g2;
                        if (z5) {
                            arrayList.set(size, aVar3);
                            arrayList.remove(i6);
                            c1196a3.f5057a.mo130c(aVar2);
                        } else {
                            if (z4) {
                                if (aVar4 != null) {
                                    int i15 = aVar2.f5063b;
                                    if (i15 > aVar4.f5063b) {
                                        aVar2.f5063b = i15 - aVar4.f5064c;
                                    }
                                    int i16 = aVar2.f5064c;
                                    if (i16 > aVar4.f5063b) {
                                        aVar2.f5064c = i16 - aVar4.f5064c;
                                    }
                                }
                                int i17 = aVar2.f5063b;
                                if (i17 > aVar3.f5063b) {
                                    aVar2.f5063b = i17 - aVar3.f5064c;
                                }
                                int i18 = aVar2.f5064c;
                                if (i18 > aVar3.f5063b) {
                                    aVar2.f5064c = i18 - aVar3.f5064c;
                                }
                            } else {
                                if (aVar4 != null) {
                                    int i19 = aVar2.f5063b;
                                    if (i19 >= aVar4.f5063b) {
                                        aVar2.f5063b = i19 - aVar4.f5064c;
                                    }
                                    int i20 = aVar2.f5064c;
                                    if (i20 >= aVar4.f5063b) {
                                        aVar2.f5064c = i20 - aVar4.f5064c;
                                    }
                                }
                                int i21 = aVar2.f5063b;
                                if (i21 >= aVar3.f5063b) {
                                    aVar2.f5063b = i21 - aVar3.f5064c;
                                }
                                int i22 = aVar2.f5064c;
                                if (i22 >= aVar3.f5063b) {
                                    aVar2.f5064c = i22 - aVar3.f5064c;
                                }
                            }
                            arrayList.set(size, aVar3);
                            if (aVar2.f5063b != aVar2.f5064c) {
                                arrayList.set(i6, aVar2);
                            } else {
                                arrayList.remove(i6);
                            }
                            if (aVar4 != null) {
                                arrayList.add(size, aVar4);
                            }
                        }
                    } else if (i7 == 4) {
                        int i23 = aVar2.f5064c;
                        int i24 = aVar3.f5063b;
                        if (i23 < i24) {
                            aVar3.f5063b = i24 - 1;
                        } else {
                            int i25 = aVar3.f5064c;
                            if (i23 < i24 + i25) {
                                aVar3.f5064c = i25 - 1;
                                aVarM2939g = c1196a3.m2939g(4, aVar2.f5063b, 1);
                            }
                            i4 = aVar2.f5063b;
                            i5 = aVar3.f5063b;
                            if (i4 > i5) {
                                aVar3.f5063b = i5 + 1;
                            } else {
                                int i26 = i5 + aVar3.f5064c;
                                if (i4 < i26) {
                                    int i27 = i26 - i4;
                                    aVarM2939g2 = c1196a3.m2939g(4, i4 + 1, i27);
                                    aVar3.f5064c -= i27;
                                }
                            }
                            aVar = aVarM2939g2;
                            arrayList.set(i6, aVar2);
                            if (aVar3.f5064c <= 0) {
                                arrayList.set(size, aVar3);
                            } else {
                                arrayList.remove(size);
                                c1196a3.f5057a.mo130c(aVar3);
                            }
                            if (aVarM2939g != null) {
                                arrayList.add(size, aVarM2939g);
                            }
                            if (aVar == null) {
                                arrayList.add(size, aVar);
                            }
                        }
                        aVarM2939g = null;
                        i4 = aVar2.f5063b;
                        i5 = aVar3.f5063b;
                        if (i4 > i5) {
                        }
                        aVar = aVarM2939g2;
                        arrayList.set(i6, aVar2);
                        if (aVar3.f5064c <= 0) {
                        }
                        if (aVarM2939g != null) {
                        }
                        if (aVar == null) {
                        }
                    }
                } else {
                    int i28 = aVar2.f5064c;
                    int i29 = aVar3.f5063b;
                    int i30 = i28 < i29 ? -1 : 0;
                    int i31 = aVar2.f5063b;
                    if (i31 < i29) {
                        i30++;
                    }
                    if (i29 <= i31) {
                        aVar2.f5063b = i31 + aVar3.f5064c;
                    }
                    int i32 = aVar3.f5063b;
                    if (i32 <= i28) {
                        aVar2.f5064c = i28 + aVar3.f5064c;
                    }
                    aVar3.f5063b = i32 + i30;
                    arrayList.set(size, aVar3);
                    arrayList.set(i6, aVar2);
                }
            }
            int size2 = arrayList.size();
            int i33 = 0;
            while (i33 < size2) {
                C1196a.a aVarM2939g3 = arrayList.get(i33);
                int i34 = aVarM2939g3.f5062a;
                if (i34 != 1) {
                    C0051Cc c0051Cc = c1196a2.f5057a;
                    C1218w c1218w = c1196a2.f5060d;
                    if (i34 == 2) {
                        i2 = size2;
                        int i35 = aVarM2939g3.f5063b;
                        int i36 = aVarM2939g3.f5064c + i35;
                        int i37 = i35;
                        int i38 = 0;
                        byte b2 = -1;
                        while (i37 < i36) {
                            if (c1218w.m3000b(i37) != null || c1196a2.m2933a(i37)) {
                                if (b2 == 0) {
                                    c1196a2.m2935c(c1196a2.m2939g(2, i35, i38));
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z3 = z2;
                                b = 1;
                            } else {
                                if (b2 == 1) {
                                    c1196a2.m2940h(c1196a2.m2939g(2, i35, i38));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                b = 0;
                            }
                            if (z3) {
                                i37 -= i38;
                                i36 -= i38;
                                i38 = 1;
                            } else {
                                i38++;
                            }
                            i37++;
                            b2 = b;
                        }
                        if (i38 != aVarM2939g3.f5064c) {
                            c0051Cc.mo130c(aVarM2939g3);
                            aVarM2939g3 = c1196a2.m2939g(2, i35, i38);
                        }
                        if (b2 == 0) {
                            c1196a2.m2935c(aVarM2939g3);
                        } else {
                            c1196a2.m2940h(aVarM2939g3);
                        }
                    } else if (i34 != 4) {
                        if (i34 == i) {
                            c1196a2.m2940h(aVarM2939g3);
                        }
                        i2 = size2;
                    } else {
                        int i39 = aVarM2939g3.f5063b;
                        int i40 = aVarM2939g3.f5064c + i39;
                        int i41 = i39;
                        byte b3 = -1;
                        int i42 = 0;
                        while (i39 < i40) {
                            if (c1218w.m3000b(i39) != null || c1196a2.m2933a(i39)) {
                                i3 = size2;
                                if (b3 == 0) {
                                    c1196a2.m2935c(c1196a2.m2939g(4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                b3 = 1;
                            } else {
                                i3 = size2;
                                if (b3 == 1) {
                                    c1196a2.m2940h(c1196a2.m2939g(4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                b3 = 0;
                            }
                            i42++;
                            i39++;
                            size2 = i3;
                        }
                        i2 = size2;
                        if (i42 != aVarM2939g3.f5064c) {
                            c0051Cc.mo130c(aVarM2939g3);
                            aVarM2939g3 = c1196a2.m2939g(4, i41, i42);
                        }
                        if (b3 == 0) {
                            c1196a2.m2935c(aVarM2939g3);
                        } else {
                            c1196a2.m2940h(aVarM2939g3);
                        }
                    }
                } else {
                    i2 = size2;
                    c1196a2.m2940h(aVarM2939g3);
                }
                i33++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z7 = this.f4857i0 || this.f4859j0;
        boolean z8 = this.f4880u && this.f4827K != null && ((z = this.f4818B) || z7 || this.f4864m.f4931f) && (!z || this.f4862l.f4913b);
        C1186w c1186w2 = this.f4851f0;
        c1186w2.f4992j = z8;
        c1186w2.f4993k = z8 && z7 && !this.f4818B && this.f4827K != null && this.f4864m.mo2647B0();
        View focusedChild = (this.f4843b0 && hasFocus() && this.f4862l != null) ? getFocusedChild() : null;
        AbstractC1163A abstractC1163AM2753K = (focusedChild == null || (viewM2747D = m2747D(focusedChild)) == null) ? null : m2753K(viewM2747D);
        if (abstractC1163AM2753K == null) {
            c1186w.f4995m = -1L;
            c1186w.f4994l = -1;
            c1186w.f4996n = -1;
        } else {
            c1186w.f4995m = this.f4862l.f4913b ? abstractC1163AM2753K.f4895e : -1L;
            if (!this.f4818B) {
                if (abstractC1163AM2753K.m2802h()) {
                    iM2751I = abstractC1163AM2753K.f4894d;
                } else {
                    RecyclerView recyclerView = abstractC1163AM2753K.f4908r;
                    iM2751I = recyclerView == null ? -1 : recyclerView.m2751I(abstractC1163AM2753K);
                }
                c1186w.f4994l = iM2751I;
                View focusedChild2 = abstractC1163AM2753K.f4891a;
                int id = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id = focusedChild2.getId();
                    }
                }
                c1186w.f4996n = id;
            }
        }
        c1186w.f4990h = c1186w.f4992j && this.f4859j0;
        this.f4859j0 = false;
        this.f4857i0 = false;
        c1186w.f4989g = c1186w.f4993k;
        c1186w.f4987e = this.f4862l.mo109a();
        m2749F(this.f4867n0);
        boolean z9 = c1186w.f4992j;
        C0598ge<AbstractC1163A, C1155C.a> c0598ge = c1155c.f4751a;
        if (z9) {
            int iM2947e = this.f4850f.m2947e();
            for (int i43 = 0; i43 < iM2947e; i43++) {
                AbstractC1163A abstractC1163AM2735L = m2735L(this.f4850f.m2946d(i43));
                if (!abstractC1163AM2735L.m2809o() && (!abstractC1163AM2735L.m2800f() || this.f4862l.f4913b)) {
                    AbstractC1172i abstractC1172i = this.f4827K;
                    AbstractC1172i.m2817b(abstractC1163AM2735L);
                    abstractC1163AM2735L.m2797c();
                    abstractC1172i.getClass();
                    AbstractC1172i.b bVar = new AbstractC1172i.b();
                    bVar.m2824a(abstractC1163AM2735L);
                    C1155C.a orDefault2 = c0598ge.getOrDefault(abstractC1163AM2735L, null);
                    if (orDefault2 == null) {
                        orDefault2 = C1155C.a.m2646a();
                        c0598ge.put(abstractC1163AM2735L, orDefault2);
                    }
                    orDefault2.f4755b = bVar;
                    orDefault2.f4754a |= 4;
                    if (c1186w.f4990h && abstractC1163AM2735L.m2805k() && !abstractC1163AM2735L.m2802h() && !abstractC1163AM2735L.m2809o() && !abstractC1163AM2735L.m2800f()) {
                        c0371u9.m991d(m2752J(abstractC1163AM2735L), abstractC1163AM2735L);
                    }
                }
            }
        }
        if (c1186w.f4993k) {
            int iM2950h = this.f4850f.m2950h();
            for (int i44 = 0; i44 < iM2950h; i44++) {
                AbstractC1163A abstractC1163AM2735L2 = m2735L(this.f4850f.m2949g(i44));
                if (f4815y0 && abstractC1163AM2735L2.f4893c == -1 && !abstractC1163AM2735L2.m2802h()) {
                    throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC1163AM2735L2.m2809o() && abstractC1163AM2735L2.f4894d == -1) {
                    abstractC1163AM2735L2.f4894d = abstractC1163AM2735L2.f4893c;
                }
            }
            boolean z10 = c1186w.f4988f;
            c1186w.f4988f = false;
            this.f4864m.mo2662d0(this.f4844c, c1186w);
            c1186w.f4988f = z10;
            for (int i45 = 0; i45 < this.f4850f.m2947e(); i45++) {
                AbstractC1163A abstractC1163AM2735L3 = m2735L(this.f4850f.m2946d(i45));
                if (!abstractC1163AM2735L3.m2809o() && ((orDefault = c0598ge.getOrDefault(abstractC1163AM2735L3, null)) == null || (orDefault.f4754a & 4) == 0)) {
                    AbstractC1172i.m2817b(abstractC1163AM2735L3);
                    boolean z11 = (abstractC1163AM2735L3.f4900j & 8192) != 0;
                    AbstractC1172i abstractC1172i2 = this.f4827K;
                    abstractC1163AM2735L3.m2797c();
                    abstractC1172i2.getClass();
                    AbstractC1172i.b bVar2 = new AbstractC1172i.b();
                    bVar2.m2824a(abstractC1163AM2735L3);
                    if (z11) {
                        m2765X(abstractC1163AM2735L3, bVar2);
                    } else {
                        C1155C.a orDefault3 = c0598ge.getOrDefault(abstractC1163AM2735L3, null);
                        if (orDefault3 == null) {
                            orDefault3 = C1155C.a.m2646a();
                            c0598ge.put(abstractC1163AM2735L3, orDefault3);
                        }
                        orDefault3.f4754a |= 2;
                        orDefault3.f4755b = bVar2;
                    }
                }
            }
            m2782m();
        } else {
            m2782m();
        }
        m2761T(true);
        m2778i0(false);
        c1186w.f4986d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4886x) {
            return;
        }
        boolean zMo2714d = abstractC1175l.mo2714d();
        boolean zMo2716e = this.f4864m.mo2716e();
        if (zMo2714d || zMo2716e) {
            if (!zMo2714d) {
                i = 0;
            }
            if (!zMo2716e) {
                i2 = 0;
            }
            m2770c0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m2756O()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4889z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1219x c1219x) {
        this.f4865m0 = c1219x;
        C0866ug.m2003j(this, c1219x);
    }

    public void setAdapter(AbstractC1167d abstractC1167d) {
        setLayoutFrozen(false);
        AbstractC1167d abstractC1167d2 = this.f4862l;
        C1183t c1183t = this.f4842b;
        if (abstractC1167d2 != null) {
            abstractC1167d2.f4912a.unregisterObserver(c1183t);
            this.f4862l.getClass();
        }
        AbstractC1172i abstractC1172i = this.f4827K;
        if (abstractC1172i != null) {
            abstractC1172i.mo2821e();
        }
        AbstractC1175l abstractC1175l = this.f4864m;
        C1181r c1181r = this.f4844c;
        if (abstractC1175l != null) {
            abstractC1175l.m2849i0(c1181r);
            this.f4864m.m2850j0(c1181r);
        }
        c1181r.f4958a.clear();
        c1181r.m2873f();
        C1196a c1196a = this.f4848e;
        c1196a.m2941i(c1196a.f5058b);
        c1196a.m2941i(c1196a.f5059c);
        AbstractC1167d<?> abstractC1167d3 = this.f4862l;
        this.f4862l = abstractC1167d;
        if (abstractC1167d != null) {
            abstractC1167d.f4912a.registerObserver(c1183t);
        }
        AbstractC1175l abstractC1175l2 = this.f4864m;
        if (abstractC1175l2 != null) {
            abstractC1175l2.mo2844Q();
        }
        AbstractC1167d abstractC1167d4 = this.f4862l;
        c1181r.f4958a.clear();
        c1181r.m2873f();
        c1181r.m2872e(abstractC1167d3, true);
        C1180q c1180qM2870c = c1181r.m2870c();
        if (abstractC1167d3 != null) {
            c1180qM2870c.f4952b--;
        }
        if (c1180qM2870c.f4952b == 0) {
            int i = 0;
            while (true) {
                SparseArray<C1180q.a> sparseArray = c1180qM2870c.f4951a;
                if (i >= sparseArray.size()) {
                    break;
                }
                C1180q.a aVarValueAt = sparseArray.valueAt(i);
                Iterator<AbstractC1163A> it = aVarValueAt.f4954a.iterator();
                while (it.hasNext()) {
                    C0957zc.m2247a(it.next().f4891a);
                }
                aVarValueAt.f4954a.clear();
                i++;
            }
        }
        if (abstractC1167d4 != null) {
            c1180qM2870c.f4952b++;
        }
        c1181r.m2871d();
        this.f4851f0.f4988f = true;
        m2764W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1170g interfaceC1170g) {
        if (interfaceC1170g == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f4854h) {
            this.f4826J = null;
            this.f4824H = null;
            this.f4825I = null;
            this.f4823G = null;
        }
        this.f4854h = z;
        super.setClipToPadding(z);
        if (this.f4880u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1171h c1171h) {
        c1171h.getClass();
        this.f4822F = c1171h;
        this.f4826J = null;
        this.f4824H = null;
        this.f4825I = null;
        this.f4823G = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f4878t = z;
    }

    public void setItemAnimator(AbstractC1172i abstractC1172i) {
        AbstractC1172i abstractC1172i2 = this.f4827K;
        if (abstractC1172i2 != null) {
            abstractC1172i2.mo2821e();
            this.f4827K.f4917a = null;
        }
        this.f4827K = abstractC1172i;
        if (abstractC1172i != null) {
            abstractC1172i.f4917a = this.f4861k0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1181r c1181r = this.f4844c;
        c1181r.f4962e = i;
        c1181r.m2880m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1175l abstractC1175l) {
        RecyclerView recyclerView;
        C1210o c1210o;
        if (abstractC1175l == this.f4864m) {
            return;
        }
        setScrollState(0);
        RunnableC1189z runnableC1189z = this.f4845c0;
        RecyclerView.this.removeCallbacks(runnableC1189z);
        runnableC1189z.f4999c.abortAnimation();
        AbstractC1175l abstractC1175l2 = this.f4864m;
        if (abstractC1175l2 != null && (c1210o = abstractC1175l2.f4930e) != null) {
            c1210o.m2884d();
        }
        AbstractC1175l abstractC1175l3 = this.f4864m;
        C1181r c1181r = this.f4844c;
        if (abstractC1175l3 != null) {
            AbstractC1172i abstractC1172i = this.f4827K;
            if (abstractC1172i != null) {
                abstractC1172i.mo2821e();
            }
            this.f4864m.m2849i0(c1181r);
            this.f4864m.m2850j0(c1181r);
            c1181r.f4958a.clear();
            c1181r.m2873f();
            if (this.f4876s) {
                AbstractC1175l abstractC1175l4 = this.f4864m;
                abstractC1175l4.f4932g = false;
                abstractC1175l4.mo2702S(this);
            }
            this.f4864m.m2861v0(null);
            this.f4864m = null;
        } else {
            c1181r.f4958a.clear();
            c1181r.m2873f();
        }
        C1197b c1197b = this.f4850f;
        c1197b.f5066b.m2959g();
        ArrayList arrayList = c1197b.f5067c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c1197b.f5065a.f5197a;
            if (size < 0) {
                break;
            }
            AbstractC1163A abstractC1163AM2735L = m2735L((View) arrayList.get(size));
            if (abstractC1163AM2735L != null) {
                int i = abstractC1163AM2735L.f4906p;
                if (recyclerView.m2756O()) {
                    abstractC1163AM2735L.f4907q = i;
                    recyclerView.f4877s0.add(abstractC1163AM2735L);
                } else {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    abstractC1163AM2735L.f4891a.setImportantForAccessibility(i);
                }
                abstractC1163AM2735L.f4906p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            m2735L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4864m = abstractC1175l;
        if (abstractC1175l != null) {
            if (abstractC1175l.f4927b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC1175l);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(C0944z.m2224d(abstractC1175l.f4927b, sb));
            }
            abstractC1175l.m2861v0(this);
            if (this.f4876s) {
                AbstractC1175l abstractC1175l5 = this.f4864m;
                abstractC1175l5.f4932g = true;
                abstractC1175l5.mo2845R(this);
            }
        }
        c1181r.m2880m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0176Jb scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f618d) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.d.m2034z(scrollingChildHelper.f617c);
        }
        scrollingChildHelper.f618d = z;
    }

    public void setOnFlingListener(AbstractC1177n abstractC1177n) {
        this.f4836T = abstractC1177n;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1179p abstractC1179p) {
        this.f4853g0 = abstractC1179p;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4843b0 = z;
    }

    public void setRecycledViewPool(C1180q c1180q) {
        C1181r c1181r = this.f4844c;
        RecyclerView recyclerView = RecyclerView.this;
        c1181r.m2872e(recyclerView.f4862l, false);
        if (c1181r.f4964g != null) {
            r2.f4952b--;
        }
        c1181r.f4964g = c1180q;
        if (c1180q != null && recyclerView.getAdapter() != null) {
            c1181r.f4964g.f4952b++;
        }
        c1181r.m2871d();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1182s interfaceC1182s) {
        this.f4866n = interfaceC1182s;
    }

    public void setScrollState(int i) {
        C1210o c1210o;
        if (i == this.f4828L) {
            return;
        }
        if (f4816z0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f4828L, new Exception());
        }
        this.f4828L = i;
        if (i != 2) {
            RunnableC1189z runnableC1189z = this.f4845c0;
            RecyclerView.this.removeCallbacks(runnableC1189z);
            runnableC1189z.f4999c.abortAnimation();
            AbstractC1175l abstractC1175l = this.f4864m;
            if (abstractC1175l != null && (c1210o = abstractC1175l.f4930e) != null) {
                c1210o.m2884d();
            }
        }
        AbstractC1175l abstractC1175l2 = this.f4864m;
        if (abstractC1175l2 != null) {
            abstractC1175l2.mo2848h0(i);
        }
        AbstractC1179p abstractC1179p = this.f4853g0;
        if (abstractC1179p != null) {
            abstractC1179p.mo439a(this, i);
        }
        ArrayList arrayList = this.f4855h0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1179p) this.f4855h0.get(size)).mo439a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f4835S = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f4835S = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1188y abstractC1188y) {
        this.f4844c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m483g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m484h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C1210o c1210o;
        if (z != this.f4886x) {
            m2781k("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4886x = false;
                if (this.f4884w && this.f4864m != null && this.f4862l != null) {
                    requestLayout();
                }
                this.f4884w = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4886x = true;
            this.f4888y = true;
            setScrollState(0);
            RunnableC1189z runnableC1189z = this.f4845c0;
            RecyclerView.this.removeCallbacks(runnableC1189z);
            runnableC1189z.f4999c.abortAnimation();
            AbstractC1175l abstractC1175l = this.f4864m;
            if (abstractC1175l == null || (c1210o = abstractC1175l.f4930e) == null) {
                return;
            }
            c1210o.m2884d();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2788t() {
        m2776h0();
        m2760S();
        C1186w c1186w = this.f4851f0;
        c1186w.m2886a(6);
        this.f4848e.m2934b();
        c1186w.f4987e = this.f4862l.mo109a();
        c1186w.f4985c = 0;
        if (this.f4846d != null) {
            AbstractC1167d abstractC1167d = this.f4862l;
            int iOrdinal = abstractC1167d.f4914c.ordinal();
            if (iOrdinal == 1 ? abstractC1167d.mo109a() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f4846d.f4967c;
                if (parcelable != null) {
                    this.f4864m.mo2718f0(parcelable);
                }
                this.f4846d = null;
            }
        }
        c1186w.f4989g = false;
        this.f4864m.mo2662d0(this.f4844c, c1186w);
        c1186w.f4988f = false;
        c1186w.f4992j = c1186w.f4992j && this.f4827K != null;
        c1186w.f4986d = 4;
        m2761T(true);
        m2778i0(false);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2789u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m479c(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: v */
    public final void m2790v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m480d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m2791w(int i, int i2) {
        this.f4821E++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC1179p abstractC1179p = this.f4853g0;
        if (abstractC1179p != null) {
            abstractC1179p.mo440b(this, i, i2);
        }
        ArrayList arrayList = this.f4855h0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1179p) this.f4855h0.get(size)).mo440b(this, i, i2);
            }
        }
        this.f4821E--;
    }

    /* JADX INFO: renamed from: x */
    public final void m2792x() {
        if (this.f4826J != null) {
            return;
        }
        ((C1187x) this.f4822F).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4826J = edgeEffect;
        if (this.f4854h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2793y() {
        if (this.f4823G != null) {
            return;
        }
        ((C1187x) this.f4822F).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4823G = edgeEffect;
        if (this.f4854h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2794z() {
        if (this.f4825I != null) {
            return;
        }
        ((C1187x) this.f4822F).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4825I = edgeEffect;
        if (this.f4854h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        char c;
        char c2;
        TypedArray typedArray;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f4842b = new C1183t();
        this.f4844c = new C1181r();
        this.f4852g = new C1155C();
        this.f4856i = new Rect();
        this.f4858j = new Rect();
        this.f4860k = new RectF();
        this.f4868o = new ArrayList();
        this.f4870p = new ArrayList<>();
        this.f4872q = new ArrayList<>();
        this.f4882v = 0;
        this.f4818B = false;
        this.f4819C = false;
        this.f4820D = 0;
        this.f4821E = 0;
        this.f4822F = f4814G0;
        C1206k c1206k = new C1206k();
        Object[] objArr = null;
        c1206k.f4917a = null;
        c1206k.f4918b = new ArrayList<>();
        c1206k.f4919c = 120L;
        c1206k.f4920d = 120L;
        c1206k.f4921e = 250L;
        c1206k.f4922f = 250L;
        c1206k.f5203g = true;
        c1206k.f5101h = new ArrayList<>();
        c1206k.f5102i = new ArrayList<>();
        c1206k.f5103j = new ArrayList<>();
        c1206k.f5104k = new ArrayList<>();
        c1206k.f5105l = new ArrayList<>();
        c1206k.f5106m = new ArrayList<>();
        c1206k.f5107n = new ArrayList<>();
        c1206k.f5108o = new ArrayList<>();
        c1206k.f5109p = new ArrayList<>();
        c1206k.f5110q = new ArrayList<>();
        c1206k.f5111r = new ArrayList<>();
        this.f4827K = c1206k;
        this.f4828L = 0;
        this.f4829M = -1;
        this.f4839W = Float.MIN_VALUE;
        this.f4841a0 = Float.MIN_VALUE;
        this.f4843b0 = true;
        this.f4845c0 = new RunnableC1189z();
        this.f4849e0 = f4811D0 ? new RunnableC1208m.b() : null;
        C1186w c1186w = new C1186w();
        c1186w.f4983a = -1;
        c1186w.f4984b = 0;
        c1186w.f4985c = 0;
        c1186w.f4986d = 1;
        c1186w.f4987e = 0;
        c1186w.f4988f = false;
        c1186w.f4989g = false;
        c1186w.f4990h = false;
        c1186w.f4991i = false;
        c1186w.f4992j = false;
        c1186w.f4993k = false;
        this.f4851f0 = c1186w;
        this.f4857i0 = false;
        this.f4859j0 = false;
        C1173j c1173j = new C1173j();
        this.f4861k0 = c1173j;
        this.f4863l0 = false;
        this.f4867n0 = new int[2];
        this.f4871p0 = new int[2];
        this.f4873q0 = new int[2];
        this.f4875r0 = new int[2];
        this.f4877s0 = new ArrayList();
        this.f4879t0 = new RunnableC1164a();
        this.f4883v0 = 0;
        this.f4885w0 = 0;
        this.f4887x0 = new C1166c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4835S = viewConfiguration.getScaledTouchSlop();
        this.f4839W = C0904wg.m2190a(viewConfiguration);
        this.f4841a0 = C0904wg.m2191b(viewConfiguration);
        this.f4837U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4838V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4840a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4827K.f4917a = c1173j;
        this.f4848e = new C1196a(new C1218w(this));
        this.f4850f = new C1197b(new C1217v(this));
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (C0866ug.f.m2041c(this) == 0) {
            C0866ug.f.m2051m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4817A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1219x(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1152R.styleable.RecyclerView, i, 0);
        C0866ug.m2002i(this, context, C1152R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(C1152R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(C1152R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4854h = typedArrayObtainStyledAttributes.getBoolean(C1152R.styleable.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(C1152R.styleable.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C1152R.styleable.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C1152R.styleable.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C1152R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C1152R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C0944z.m2224d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            c = 1;
            typedArray = typedArrayObtainStyledAttributes;
            new C1207l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1152R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C1152R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1152R.dimen.fastscroll_margin));
        } else {
            c = 1;
            c2 = 2;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1175l.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f4812E0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[c] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(c);
                    setLayoutManager((AbstractC1175l) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr = f4808A0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0866ug.m2002i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        int i2 = C0957zc.f3566a;
        setTag(C0957zc.f3567b, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static class C1176m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC1163A f4947a;

        /* JADX INFO: renamed from: b */
        public final Rect f4948b;

        /* JADX INFO: renamed from: c */
        public boolean f4949c;

        /* JADX INFO: renamed from: d */
        public boolean f4950d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1176m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4948b = new Rect();
            this.f4949c = true;
            this.f4950d = false;
        }

        public C1176m(int i, int i2) {
            super(i, i2);
            this.f4948b = new Rect();
            this.f4949c = true;
            this.f4950d = false;
        }

        public C1176m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4948b = new Rect();
            this.f4949c = true;
            this.f4950d = false;
        }

        public C1176m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4948b = new Rect();
            this.f4949c = true;
            this.f4950d = false;
        }

        public C1176m(C1176m c1176m) {
            super((ViewGroup.LayoutParams) c1176m);
            this.f4948b = new Rect();
            this.f4949c = true;
            this.f4950d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1175l abstractC1175l = this.f4864m;
        if (abstractC1175l != null) {
            return abstractC1175l.mo2682t(layoutParams);
        }
        throw new IllegalStateException(C0944z.m2224d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
