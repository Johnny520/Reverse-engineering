package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000a.AbstractC0472a2;
import p000a.C0003A2;
import p000a.C0054Cf;
import p000a.C0072Df;
import p000a.C0108Ff;
import p000a.C0166J1;
import p000a.C0181Jg;
import p000a.C0371U9;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.transition.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235e implements Cloneable {

    /* JADX INFO: renamed from: k */
    public ArrayList<C0108Ff> f5248k;

    /* JADX INFO: renamed from: l */
    public ArrayList<C0108Ff> f5249l;

    /* JADX INFO: renamed from: m */
    public f[] f5250m;

    /* JADX INFO: renamed from: w */
    public long f5260w;

    /* JADX INFO: renamed from: x */
    public long f5261x;

    /* JADX INFO: renamed from: y */
    public static final Animator[] f5236y = new Animator[0];

    /* JADX INFO: renamed from: z */
    public static final int[] f5237z = {2, 1, 3, 4};

    /* JADX INFO: renamed from: A */
    public static final a f5234A = new a();

    /* JADX INFO: renamed from: B */
    public static final ThreadLocal<C0166J1<Animator, b>> f5235B = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final String f5238a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f5239b = -1;

    /* JADX INFO: renamed from: c */
    public long f5240c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f5241d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList<Integer> f5242e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final ArrayList<View> f5243f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public C0003A2 f5244g = new C0003A2(3);

    /* JADX INFO: renamed from: h */
    public C0003A2 f5245h = new C0003A2(3);

    /* JADX INFO: renamed from: i */
    public C1238h f5246i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f5247j = f5237z;

    /* JADX INFO: renamed from: n */
    public final ArrayList<Animator> f5251n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public Animator[] f5252o = f5236y;

    /* JADX INFO: renamed from: p */
    public int f5253p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f5254q = false;

    /* JADX INFO: renamed from: r */
    public boolean f5255r = false;

    /* JADX INFO: renamed from: s */
    public AbstractC1235e f5256s = null;

    /* JADX INFO: renamed from: t */
    public ArrayList<f> f5257t = null;

    /* JADX INFO: renamed from: u */
    public ArrayList<Animator> f5258u = new ArrayList<>();

    /* JADX INFO: renamed from: v */
    public a f5259v = f5234A;

    /* JADX INFO: renamed from: androidx.transition.e$a */
    public class a extends AbstractC0472a2 {
        /* JADX INFO: renamed from: g */
        public final Path m3060g(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public View f5262a;

        /* JADX INFO: renamed from: b */
        public String f5263b;

        /* JADX INFO: renamed from: c */
        public C0108Ff f5264c;

        /* JADX INFO: renamed from: d */
        public WindowId f5265d;

        /* JADX INFO: renamed from: e */
        public AbstractC1235e f5266e;

        /* JADX INFO: renamed from: f */
        public Animator f5267f;
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    public static abstract class c {
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static long m3061a(Animator animator) {
            return animator.getTotalDuration();
        }

        /* JADX INFO: renamed from: b */
        public static void m3062b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e */
    public class e extends C1236f {

        /* JADX INFO: renamed from: a */
        public long f5268a;
    }

    /* JADX INFO: renamed from: androidx.transition.e$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        default void mo3026a(AbstractC1235e abstractC1235e) {
            mo3027d(abstractC1235e);
        }

        /* JADX INFO: renamed from: b */
        default void m3063b(AbstractC1235e abstractC1235e) {
            mo3022f(abstractC1235e);
        }

        /* JADX INFO: renamed from: c */
        void mo3020c();

        /* JADX INFO: renamed from: d */
        void mo3027d(AbstractC1235e abstractC1235e);

        /* JADX INFO: renamed from: e */
        void mo3021e(AbstractC1235e abstractC1235e);

        /* JADX INFO: renamed from: f */
        void mo3022f(AbstractC1235e abstractC1235e);

        /* JADX INFO: renamed from: g */
        void mo3023g();
    }

    /* JADX INFO: renamed from: androidx.transition.e$g */
    public interface g {

        /* JADX INFO: renamed from: a */
        public static final C0944z f5269a = new C0944z(15);

        /* JADX INFO: renamed from: b */
        public static final C0944z f5270b = new C0944z(16);

        /* JADX INFO: renamed from: c */
        public static final C0944z f5271c = new C0944z(17);

        /* JADX INFO: renamed from: d */
        public static final C0944z f5272d = new C0944z(18);

        /* JADX INFO: renamed from: e */
        public static final C0944z f5273e = new C0944z(19);

        /* JADX INFO: renamed from: a */
        void mo2232a(f fVar, AbstractC1235e abstractC1235e, boolean z);
    }

    /* JADX INFO: renamed from: b */
    public static void m3028b(C0003A2 c0003a2, View view, C0108Ff c0108Ff) {
        ((C0166J1) c0003a2.f23a).put(view, c0108Ff);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0003a2.f24b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        String strM2019k = C0866ug.d.m2019k(view);
        if (strM2019k != null) {
            C0166J1 c0166j1 = (C0166J1) c0003a2.f26d;
            if (c0166j1.containsKey(strM2019k)) {
                c0166j1.put(strM2019k, null);
            } else {
                c0166j1.put(strM2019k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0371U9 c0371u9 = (C0371U9) c0003a2.f25c;
                if (c0371u9.f1387a) {
                    c0371u9.m989b();
                }
                if (C0889w1.m2142b(c0371u9.f1388b, c0371u9.f1390d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0371u9.m991d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0371u9.m990c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0371u9.m991d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0166J1<Animator, b> m3029p() {
        ThreadLocal<C0166J1<Animator, b>> threadLocal = f5235B;
        C0166J1<Animator, b> c0166j1 = threadLocal.get();
        if (c0166j1 != null) {
            return c0166j1;
        }
        C0166J1<Animator, b> c0166j12 = new C0166J1<>();
        threadLocal.set(c0166j12);
        return c0166j12;
    }

    /* JADX INFO: renamed from: A */
    public void mo3030A() {
        m3038I();
        C0166J1<Animator, b> c0166j1M3029p = m3029p();
        for (Animator animator : this.f5258u) {
            if (c0166j1M3029p.containsKey(animator)) {
                m3038I();
                if (animator != null) {
                    animator.addListener(new C0054Cf(this, c0166j1M3029p));
                    long j = this.f5240c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f5239b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f5241d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0072Df(this));
                    animator.start();
                }
            }
        }
        this.f5258u.clear();
        m3048m();
    }

    /* JADX INFO: renamed from: B */
    public void mo3031B(long j, long j2) {
        long j3 = this.f5260w;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f5255r = false;
            m3055v(this, g.f5269a, z);
        }
        ArrayList<Animator> arrayList = this.f5251n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5252o);
        this.f5252o = f5236y;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            d.m3062b(animator, Math.min(Math.max(0L, j), d.m3061a(animator)));
        }
        this.f5252o = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.f5255r = true;
        }
        m3055v(this, g.f5270b, z);
    }

    /* JADX INFO: renamed from: C */
    public void mo3032C(long j) {
        this.f5240c = j;
    }

    /* JADX INFO: renamed from: D */
    public void mo3033D(c cVar) {
    }

    /* JADX INFO: renamed from: E */
    public void mo3034E(TimeInterpolator timeInterpolator) {
        this.f5241d = timeInterpolator;
    }

    /* JADX INFO: renamed from: F */
    public void mo3035F(a aVar) {
        if (aVar == null) {
            this.f5259v = f5234A;
        } else {
            this.f5259v = aVar;
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo3036G() {
    }

    /* JADX INFO: renamed from: H */
    public void mo3037H(long j) {
        this.f5239b = j;
    }

    /* JADX INFO: renamed from: I */
    public final void m3038I() {
        if (this.f5253p == 0) {
            m3055v(this, g.f5269a, false);
            this.f5255r = false;
        }
        this.f5253p++;
    }

    /* JADX INFO: renamed from: J */
    public String mo3039J(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f5240c != -1) {
            sb.append("dur(");
            sb.append(this.f5240c);
            sb.append(") ");
        }
        if (this.f5239b != -1) {
            sb.append("dly(");
            sb.append(this.f5239b);
            sb.append(") ");
        }
        if (this.f5241d != null) {
            sb.append("interp(");
            sb.append(this.f5241d);
            sb.append(") ");
        }
        ArrayList<Integer> arrayList = this.f5242e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f5243f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m3040a(f fVar) {
        if (this.f5257t == null) {
            this.f5257t = new ArrayList<>();
        }
        this.f5257t.add(fVar);
    }

    /* JADX INFO: renamed from: c */
    public void mo3041c() {
        ArrayList<Animator> arrayList = this.f5251n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5252o);
        this.f5252o = f5236y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f5252o = animatorArr;
        m3055v(this, g.f5271c, false);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3016d(C0108Ff c0108Ff);

    /* JADX INFO: renamed from: e */
    public final void m3042e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0108Ff c0108Ff = new C0108Ff(view);
            if (z) {
                mo3017g(c0108Ff);
            } else {
                mo3016d(c0108Ff);
            }
            c0108Ff.f368c.add(this);
            mo3043f(c0108Ff);
            if (z) {
                m3028b(this.f5244g, view, c0108Ff);
            } else {
                m3028b(this.f5245h, view, c0108Ff);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3042e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo3043f(C0108Ff c0108Ff) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3017g(C0108Ff c0108Ff);

    /* JADX INFO: renamed from: h */
    public final void m3044h(FrameLayout frameLayout, boolean z) {
        m3045i(z);
        ArrayList<Integer> arrayList = this.f5242e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f5243f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m3042e(frameLayout, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = frameLayout.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                C0108Ff c0108Ff = new C0108Ff(viewFindViewById);
                if (z) {
                    mo3017g(c0108Ff);
                } else {
                    mo3016d(c0108Ff);
                }
                c0108Ff.f368c.add(this);
                mo3043f(c0108Ff);
                if (z) {
                    m3028b(this.f5244g, viewFindViewById, c0108Ff);
                } else {
                    m3028b(this.f5245h, viewFindViewById, c0108Ff);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            C0108Ff c0108Ff2 = new C0108Ff(view);
            if (z) {
                mo3017g(c0108Ff2);
            } else {
                mo3016d(c0108Ff2);
            }
            c0108Ff2.f368c.add(this);
            mo3043f(c0108Ff2);
            if (z) {
                m3028b(this.f5244g, view, c0108Ff2);
            } else {
                m3028b(this.f5245h, view, c0108Ff2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3045i(boolean z) {
        if (z) {
            ((C0166J1) this.f5244g.f23a).clear();
            ((SparseArray) this.f5244g.f24b).clear();
            ((C0371U9) this.f5244g.f25c).m988a();
        } else {
            ((C0166J1) this.f5245h.f23a).clear();
            ((SparseArray) this.f5245h.f24b).clear();
            ((C0371U9) this.f5245h.f25c).m988a();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1235e clone() {
        try {
            AbstractC1235e abstractC1235e = (AbstractC1235e) super.clone();
            abstractC1235e.f5258u = new ArrayList<>();
            abstractC1235e.f5244g = new C0003A2(3);
            abstractC1235e.f5245h = new C0003A2(3);
            abstractC1235e.f5248k = null;
            abstractC1235e.f5249l = null;
            abstractC1235e.f5256s = this;
            abstractC1235e.f5257t = null;
            return abstractC1235e;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo3018k(FrameLayout frameLayout, C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void mo3047l(FrameLayout frameLayout, C0003A2 c0003a2, C0003A2 c0003a22, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C0108Ff c0108Ff;
        Animator animator;
        C0108Ff c0108Ff2;
        C0166J1<Animator, b> c0166j1M3029p = m3029p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m3050o().getClass();
        int i3 = 0;
        while (i3 < size) {
            C0108Ff c0108Ff3 = (C0108Ff) arrayList.get(i3);
            C0108Ff c0108Ff4 = (C0108Ff) arrayList2.get(i3);
            if (c0108Ff3 != null && !c0108Ff3.f368c.contains(this)) {
                c0108Ff3 = null;
            }
            if (c0108Ff4 != null && !c0108Ff4.f368c.contains(this)) {
                c0108Ff4 = null;
            }
            if ((c0108Ff3 != null || c0108Ff4 != null) && (c0108Ff3 == null || c0108Ff4 == null || mo3053t(c0108Ff3, c0108Ff4))) {
                Animator animatorMo3018k = mo3018k(frameLayout, c0108Ff3, c0108Ff4);
                if (animatorMo3018k != null) {
                    String str = this.f5238a;
                    if (c0108Ff4 != null) {
                        String[] strArrMo3019q = mo3019q();
                        view = c0108Ff4.f367b;
                        if (strArrMo3019q != null && strArrMo3019q.length > 0) {
                            c0108Ff2 = new C0108Ff(view);
                            C0108Ff c0108Ff5 = (C0108Ff) ((C0166J1) c0003a22.f23a).getOrDefault(view, null);
                            i = size;
                            if (c0108Ff5 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo3019q.length) {
                                    HashMap map = c0108Ff2.f366a;
                                    int i5 = i3;
                                    String str2 = strArrMo3019q[i4];
                                    map.put(str2, c0108Ff5.f366a.get(str2));
                                    i4++;
                                    i3 = i5;
                                }
                            }
                            i2 = i3;
                            int i6 = c0166j1M3029p.f2221c;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo3018k;
                                    break;
                                }
                                b orDefault = c0166j1M3029p.getOrDefault(c0166j1M3029p.m1436h(i7), null);
                                if (orDefault.f5264c != null && orDefault.f5262a == view && orDefault.f5263b.equals(str) && orDefault.f5264c.equals(c0108Ff2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo3018k;
                            c0108Ff2 = null;
                        }
                        animatorMo3018k = animator;
                        c0108Ff = c0108Ff2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c0108Ff3.f367b;
                        c0108Ff = null;
                    }
                    if (animatorMo3018k != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        b bVar = new b();
                        bVar.f5262a = view;
                        bVar.f5263b = str;
                        bVar.f5264c = c0108Ff;
                        bVar.f5265d = windowId;
                        bVar.f5266e = this;
                        bVar.f5267f = animatorMo3018k;
                        c0166j1M3029p.put(animatorMo3018k, bVar);
                        this.f5258u.add(animatorMo3018k);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                b orDefault2 = c0166j1M3029p.getOrDefault(this.f5258u.get(sparseIntArray.keyAt(i8)), null);
                orDefault2.f5267f.setStartDelay(orDefault2.f5267f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3048m() {
        int i = this.f5253p - 1;
        this.f5253p = i;
        if (i == 0) {
            m3055v(this, g.f5270b, false);
            for (int i2 = 0; i2 < ((C0371U9) this.f5244g.f25c).m992e(); i2++) {
                View view = (View) ((C0371U9) this.f5244g.f25c).m993f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0371U9) this.f5245h.f25c).m992e(); i3++) {
                View view2 = (View) ((C0371U9) this.f5245h.f25c).m993f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f5255r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f5249l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f5248k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0108Ff m3049n(View view, boolean z) {
        C1238h c1238h = this.f5246i;
        if (c1238h != null) {
            return c1238h.m3049n(view, z);
        }
        ArrayList<C0108Ff> arrayList = z ? this.f5248k : this.f5249l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0108Ff c0108Ff = arrayList.get(i);
            if (c0108Ff == null) {
                return null;
            }
            if (c0108Ff.f367b == view) {
                break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC1235e m3050o() {
        C1238h c1238h = this.f5246i;
        return c1238h != null ? c1238h.m3050o() : this;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo3019q() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final C0108Ff m3051r(View view, boolean z) {
        C1238h c1238h = this.f5246i;
        if (c1238h != null) {
            return c1238h.m3051r(view, z);
        }
        return (C0108Ff) ((C0166J1) (z ? this.f5244g : this.f5245h).f23a).getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo3052s() {
        return !this.f5251n.isEmpty();
    }

    /* JADX INFO: renamed from: t */
    public boolean mo3053t(C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        if (c0108Ff != null && c0108Ff2 != null) {
            String[] strArrMo3019q = mo3019q();
            HashMap map = c0108Ff.f366a;
            HashMap map2 = c0108Ff2.f366a;
            if (strArrMo3019q != null) {
                for (String str : strArrMo3019q) {
                    Object obj = map.get(str);
                    Object obj2 = map2.get(str);
                    if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : map.keySet()) {
                    Object obj3 = map.get(str2);
                    Object obj4 = map2.get(str2);
                    if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return mo3039J("");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3054u(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f5242e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f5243f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: v */
    public final void m3055v(AbstractC1235e abstractC1235e, g gVar, boolean z) {
        AbstractC1235e abstractC1235e2 = this.f5256s;
        if (abstractC1235e2 != null) {
            abstractC1235e2.m3055v(abstractC1235e, gVar, z);
        }
        ArrayList<f> arrayList = this.f5257t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f5257t.size();
        f[] fVarArr = this.f5250m;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f5250m = null;
        f[] fVarArr2 = (f[]) this.f5257t.toArray(fVarArr);
        for (int i = 0; i < size; i++) {
            gVar.mo2232a(fVarArr2[i], abstractC1235e, z);
            fVarArr2[i] = null;
        }
        this.f5250m = fVarArr2;
    }

    /* JADX INFO: renamed from: w */
    public void mo3056w(ViewGroup viewGroup) {
        if (this.f5255r) {
            return;
        }
        ArrayList<Animator> arrayList = this.f5251n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5252o);
        this.f5252o = f5236y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f5252o = animatorArr;
        m3055v(this, g.f5272d, false);
        this.f5254q = true;
    }

    /* JADX INFO: renamed from: x */
    public void mo3057x() {
        C0166J1<Animator, b> c0166j1M3029p = m3029p();
        this.f5260w = 0L;
        for (int i = 0; i < this.f5258u.size(); i++) {
            Animator animator = this.f5258u.get(i);
            b orDefault = c0166j1M3029p.getOrDefault(animator, null);
            if (animator != null && orDefault != null) {
                long j = this.f5240c;
                Animator animator2 = orDefault.f5267f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f5239b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f5241d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f5251n.add(animator);
                this.f5260w = Math.max(this.f5260w, d.m3061a(animator));
            }
        }
        this.f5258u.clear();
    }

    /* JADX INFO: renamed from: y */
    public AbstractC1235e mo3058y(f fVar) {
        AbstractC1235e abstractC1235e;
        ArrayList<f> arrayList = this.f5257t;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (abstractC1235e = this.f5256s) != null) {
                abstractC1235e.mo3058y(fVar);
            }
            if (this.f5257t.size() == 0) {
                this.f5257t = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: z */
    public void mo3059z(FrameLayout frameLayout) {
        if (this.f5254q) {
            if (!this.f5255r) {
                ArrayList<Animator> arrayList = this.f5251n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5252o);
                this.f5252o = f5236y;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f5252o = animatorArr;
                m3055v(this, g.f5273e, false);
            }
            this.f5254q = false;
        }
    }
}
