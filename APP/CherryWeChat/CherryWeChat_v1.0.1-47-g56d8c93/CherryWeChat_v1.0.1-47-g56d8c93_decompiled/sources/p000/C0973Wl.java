package p000;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Wl */
/* JADX INFO: loaded from: classes.dex */
public final class C0973Wl extends AbstractC2251mv implements InterfaceC2474rv {

    /* JADX INFO: renamed from: A */
    public long f3028A;

    /* JADX INFO: renamed from: d */
    public float f3032d;

    /* JADX INFO: renamed from: e */
    public float f3033e;

    /* JADX INFO: renamed from: f */
    public float f3034f;

    /* JADX INFO: renamed from: g */
    public float f3035g;

    /* JADX INFO: renamed from: h */
    public float f3036h;

    /* JADX INFO: renamed from: i */
    public float f3037i;

    /* JADX INFO: renamed from: j */
    public float f3038j;

    /* JADX INFO: renamed from: k */
    public float f3039k;

    /* JADX INFO: renamed from: m */
    public final AbstractC0887Ul f3041m;

    /* JADX INFO: renamed from: o */
    public int f3043o;

    /* JADX INFO: renamed from: q */
    public RecyclerView f3045q;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f3047s;

    /* JADX INFO: renamed from: t */
    public ArrayList f3048t;

    /* JADX INFO: renamed from: u */
    public ArrayList f3049u;

    /* JADX INFO: renamed from: w */
    public GestureDetectorCompat f3051w;

    /* JADX INFO: renamed from: x */
    public C0930Vl f3052x;

    /* JADX INFO: renamed from: z */
    public Rect f3054z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f3029a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f3030b = new float[2];

    /* JADX INFO: renamed from: c */
    public AbstractC1166o f3031c = null;

    /* JADX INFO: renamed from: l */
    public int f3040l = -1;

    /* JADX INFO: renamed from: n */
    public int f3042n = 0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f3044p = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final RunnableC0431K0 f3046r = new RunnableC0431K0(10, this);

    /* JADX INFO: renamed from: v */
    public View f3050v = null;

    /* JADX INFO: renamed from: y */
    public final C0758Rl f3053y = new C0758Rl(this);

    public C0973Wl(AbstractC0887Ul abstractC0887Ul) {
        this.f3041m = abstractC0887Ul;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1849k(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: d */
    public final void m1850d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3045q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C0758Rl c0758Rl = this.f3053y;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f3045q.removeOnItemTouchListener(c0758Rl);
            this.f3045q.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f3044p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0801Sl c0801Sl = (C0801Sl) arrayList.get(0);
                c0801Sl.f2514g.cancel();
                this.f3041m.mo1531a(this.f3045q, c0801Sl.f2512e);
            }
            arrayList.clear();
            this.f3050v = null;
            VelocityTracker velocityTracker = this.f3047s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3047s = null;
            }
            C0930Vl c0930Vl = this.f3052x;
            if (c0930Vl != null) {
                c0930Vl.f2895a = false;
                this.f3052x = null;
            }
            if (this.f3051w != null) {
                this.f3051w = null;
            }
        }
        this.f3045q = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f3034f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f3035g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        ViewConfiguration.get(this.f3045q.getContext()).getScaledTouchSlop();
        this.f3045q.addItemDecoration(this);
        this.f3045q.addOnItemTouchListener(c0758Rl);
        this.f3045q.addOnChildAttachStateChangeListener(this);
        this.f3052x = new C0930Vl(this);
        this.f3051w = new GestureDetectorCompat(this.f3045q.getContext(), this.f3052x);
    }

    /* JADX INFO: renamed from: e */
    public final int m1851e(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f3036h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f3047s;
        AbstractC0887Ul abstractC0887Ul = this.f3041m;
        if (velocityTracker != null && this.f3040l > -1) {
            float f = this.f3035g;
            abstractC0887Ul.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f3047s.getXVelocity(this.f3040l);
            float yVelocity = this.f3047s.getYVelocity(this.f3040l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f3034f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f3045q.getWidth();
        abstractC0887Ul.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f3036h) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public final void m1852f(int i, int i2, MotionEvent motionEvent) {
        if (this.f3031c == null && i == 2 && this.f3042n != 2) {
            this.f3041m.getClass();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m1853g(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f3037i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f3047s;
        AbstractC0887Ul abstractC0887Ul = this.f3041m;
        if (velocityTracker != null && this.f3040l > -1) {
            float f = this.f3035g;
            abstractC0887Ul.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f3047s.getXVelocity(this.f3040l);
            float yVelocity = this.f3047s.getYVelocity(this.f3040l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f3034f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f3045q.getHeight();
        abstractC0887Ul.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f3037i) <= f2) {
            return 0;
        }
        return i2;
    }

    @Override // p000.AbstractC2251mv
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0038Av c0038Av) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final void m1854h(AbstractC1166o abstractC1166o, boolean z) {
        ArrayList arrayList = this.f3044p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0801Sl c0801Sl = (C0801Sl) arrayList.get(size);
            if (c0801Sl.f2512e == abstractC1166o) {
                c0801Sl.f2518k |= z;
                if (!c0801Sl.f2519l) {
                    c0801Sl.f2514g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final View m1855i(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC1166o abstractC1166o = this.f3031c;
        if (abstractC1166o != null) {
            View view = abstractC1166o.itemView;
            if (m1849k(view, x, y, this.f3038j + this.f3036h, this.f3039k + this.f3037i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f3044p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0801Sl c0801Sl = (C0801Sl) arrayList.get(size);
            View view2 = c0801Sl.f2512e.itemView;
            if (m1849k(view2, x, y, c0801Sl.f2516i, c0801Sl.f2517j)) {
                return view2;
            }
        }
        return this.f3045q.findChildViewUnder(x, y);
    }

    /* JADX INFO: renamed from: j */
    public final void m1856j(float[] fArr) {
        if ((this.f3043o & 12) != 0) {
            fArr[0] = (this.f3038j + this.f3036h) - this.f3031c.itemView.getLeft();
        } else {
            fArr[0] = this.f3031c.itemView.getTranslationX();
        }
        if ((this.f3043o & 3) != 0) {
            fArr[1] = (this.f3039k + this.f3037i) - this.f3031c.itemView.getTop();
        } else {
            fArr[1] = this.f3031c.itemView.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1857l(AbstractC1166o abstractC1166o) {
        ArrayList arrayList;
        int i;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i2;
        int i3;
        int i4;
        if (this.f3045q.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.f3042n != 2) {
            return;
        }
        AbstractC0887Ul abstractC0887Ul = this.f3041m;
        abstractC0887Ul.getClass();
        int i5 = (int) (this.f3038j + this.f3036h);
        int i6 = (int) (this.f3039k + this.f3037i);
        if (Math.abs(i6 - abstractC1166o.itemView.getTop()) >= abstractC1166o.itemView.getHeight() * 0.5f || Math.abs(i5 - abstractC1166o.itemView.getLeft()) >= abstractC1166o.itemView.getWidth() * 0.5f) {
            ArrayList arrayList2 = this.f3048t;
            if (arrayList2 == null) {
                this.f3048t = new ArrayList();
                this.f3049u = new ArrayList();
            } else {
                arrayList2.clear();
                this.f3049u.clear();
            }
            int iRound = Math.round(this.f3038j + this.f3036h);
            int iRound2 = Math.round(this.f3039k + this.f3037i);
            int width = abstractC1166o.itemView.getWidth() + iRound;
            int height = abstractC1166o.itemView.getHeight() + iRound2;
            int i7 = (iRound + width) / 2;
            int i8 = (iRound2 + height) / 2;
            AbstractC1160i layoutManager = this.f3045q.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                char c2 = c;
                View childAt = layoutManager.getChildAt(i9);
                if (childAt != abstractC1166o.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    AbstractC1166o childViewHolder = this.f3045q.getChildViewHolder(childAt);
                    int iAbs5 = Math.abs(i7 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int iAbs6 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i10 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    i2 = iRound;
                    int size = this.f3048t.size();
                    i3 = iRound2;
                    i4 = width;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size) {
                        int i13 = size;
                        if (i10 <= ((Integer) this.f3049u.get(i11)).intValue()) {
                            break;
                        }
                        i12++;
                        i11++;
                        size = i13;
                    }
                    this.f3048t.add(i12, childViewHolder);
                    this.f3049u.add(i12, Integer.valueOf(i10));
                } else {
                    i2 = iRound;
                    i3 = iRound2;
                    i4 = width;
                }
                i9++;
                c = c2;
                iRound = i2;
                iRound2 = i3;
                width = i4;
            }
            ArrayList arrayList3 = this.f3048t;
            if (arrayList3.size() == 0) {
                return;
            }
            int width2 = abstractC1166o.itemView.getWidth() + i5;
            int height2 = abstractC1166o.itemView.getHeight() + i6;
            int left2 = i5 - abstractC1166o.itemView.getLeft();
            int top2 = i6 - abstractC1166o.itemView.getTop();
            int size2 = arrayList3.size();
            AbstractC1166o abstractC1166o2 = null;
            int i14 = -1;
            int i15 = 0;
            while (i15 < size2) {
                AbstractC1166o abstractC1166o3 = (AbstractC1166o) arrayList3.get(i15);
                if (left2 <= 0 || (right = abstractC1166o3.itemView.getRight() - width2) >= 0) {
                    arrayList = arrayList3;
                    i = width2;
                } else {
                    arrayList = arrayList3;
                    i = width2;
                    if (abstractC1166o3.itemView.getRight() > abstractC1166o.itemView.getRight() && (iAbs4 = Math.abs(right)) > i14) {
                        i14 = iAbs4;
                        abstractC1166o2 = abstractC1166o3;
                    }
                }
                if (left2 < 0 && (left = abstractC1166o3.itemView.getLeft() - i5) > 0 && abstractC1166o3.itemView.getLeft() < abstractC1166o.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i14) {
                    i14 = iAbs3;
                    abstractC1166o2 = abstractC1166o3;
                }
                if (top2 < 0 && (top = abstractC1166o3.itemView.getTop() - i6) > 0 && abstractC1166o3.itemView.getTop() < abstractC1166o.itemView.getTop() && (iAbs2 = Math.abs(top)) > i14) {
                    i14 = iAbs2;
                    abstractC1166o2 = abstractC1166o3;
                }
                if (top2 > 0 && (bottom = abstractC1166o3.itemView.getBottom() - height2) < 0 && abstractC1166o3.itemView.getBottom() > abstractC1166o.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i14) {
                    i14 = iAbs;
                    abstractC1166o2 = abstractC1166o3;
                }
                i15++;
                arrayList3 = arrayList;
                width2 = i;
            }
            if (abstractC1166o2 == null) {
                this.f3048t.clear();
                this.f3049u.clear();
                return;
            }
            int absoluteAdapterPosition = abstractC1166o2.getAbsoluteAdapterPosition();
            abstractC1166o.getAbsoluteAdapterPosition();
            abstractC0887Ul.mo1533l(abstractC1166o, abstractC1166o2);
            RecyclerView recyclerView = this.f3045q;
            AbstractC1160i layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager2).prepareForDrop(abstractC1166o.itemView, abstractC1166o2.itemView, i5, i6);
                return;
            }
            if (layoutManager2.canScrollHorizontally()) {
                if (layoutManager2.getDecoratedLeft(abstractC1166o2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(absoluteAdapterPosition);
                }
                if (layoutManager2.getDecoratedRight(abstractC1166o2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(absoluteAdapterPosition);
                }
            }
            if (layoutManager2.canScrollVertically()) {
                if (layoutManager2.getDecoratedTop(abstractC1166o2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(absoluteAdapterPosition);
                }
                if (layoutManager2.getDecoratedBottom(abstractC1166o2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(absoluteAdapterPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1858m(View view) {
        if (view == this.f3050v) {
            this.f3050v = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Ul] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Ul] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1859n(AbstractC1166o abstractC1166o, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r122;
        ?? r32;
        int iM1853g;
        VelocityTracker velocityTracker;
        char c;
        float fSignum;
        if (abstractC1166o == this.f3031c && i == this.f3042n) {
            return;
        }
        this.f3028A = Long.MIN_VALUE;
        int i2 = this.f3042n;
        m1854h(abstractC1166o, true);
        this.f3042n = i;
        if (i == 2) {
            if (abstractC1166o == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f3050v = abstractC1166o.itemView;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f3031c;
        AbstractC0887Ul abstractC0887Ul = this.f3041m;
        if (r2 != 0) {
            if (r2.itemView.getParent() == null) {
                r122 = 0;
                m1858m(r2.itemView);
                ?? r33 = abstractC0887Ul;
                r33.mo1531a(this.f3045q, r2);
                z = false;
                r32 = r33;
            } else if (i2 != 2 && this.f3042n != 2) {
                int iMo1532d = abstractC0887Ul.mo1532d();
                RecyclerView recyclerView = this.f3045q;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                int iM1733b = (AbstractC0887Ul.m1733b(iMo1532d, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iM1733b == 0) {
                    iM1853g = 0;
                    velocityTracker = this.f3047s;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f3047s = null;
                    }
                    char c2 = 4;
                    float fSignum2 = 0.0f;
                    if (iM1853g == 1 || iM1853g == 2) {
                        c = 0;
                        fSignum = Math.signum(this.f3037i) * this.f3045q.getHeight();
                    } else if (iM1853g == 4 || iM1853g == 8 || iM1853g == 16 || iM1853g == 32) {
                        c = 0;
                        fSignum = 0.0f;
                        fSignum2 = Math.signum(this.f3036h) * this.f3045q.getWidth();
                    } else {
                        fSignum = 0.0f;
                        c = 0;
                    }
                    if (i2 != 2) {
                        c2 = '\b';
                    } else if (iM1853g > 0) {
                        c2 = 2;
                    }
                    float[] fArr = this.f3030b;
                    m1856j(fArr);
                    char c3 = c2;
                    ?? r123 = c;
                    C0801Sl c0801Sl = new C0801Sl(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM1853g, r2);
                    RecyclerView recyclerView2 = this.f3045q;
                    abstractC0887Ul.getClass();
                    AbstractC1159h itemAnimator = recyclerView2.getItemAnimator();
                    long j = itemAnimator != null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.f4037e : itemAnimator.f4036d;
                    ValueAnimator valueAnimator = c0801Sl.f2514g;
                    valueAnimator.setDuration(j);
                    this.f3044p.add(c0801Sl);
                    r2.setIsRecyclable(r123);
                    valueAnimator.start();
                    r32 = abstractC0887Ul;
                    z = true;
                    r122 = r123;
                } else {
                    int i4 = (iMo1532d & 65280) >> 8;
                    if (Math.abs(this.f3036h) > Math.abs(this.f3037i)) {
                        iM1853g = m1851e(iM1733b);
                        if (iM1853g <= 0) {
                            iM1853g = m1853g(iM1733b);
                            if (iM1853g <= 0) {
                            }
                        } else if ((i4 & iM1853g) == 0) {
                            iM1853g = AbstractC0887Ul.m1734c(iM1853g, this.f3045q.getLayoutDirection());
                        }
                        velocityTracker = this.f3047s;
                        if (velocityTracker != null) {
                        }
                        char c22 = 4;
                        float fSignum22 = 0.0f;
                        if (iM1853g == 1) {
                            c = 0;
                            fSignum = Math.signum(this.f3037i) * this.f3045q.getHeight();
                            if (i2 != 2) {
                            }
                            float[] fArr2 = this.f3030b;
                            m1856j(fArr2);
                            char c32 = c22;
                            ?? r1232 = c;
                            C0801Sl c0801Sl2 = new C0801Sl(this, r2, i2, fArr2[c], fArr2[1], fSignum22, fSignum, iM1853g, r2);
                            RecyclerView recyclerView22 = this.f3045q;
                            abstractC0887Ul.getClass();
                            AbstractC1159h itemAnimator2 = recyclerView22.getItemAnimator();
                            if (itemAnimator2 != null) {
                            }
                            ValueAnimator valueAnimator2 = c0801Sl2.f2514g;
                            valueAnimator2.setDuration(j);
                            this.f3044p.add(c0801Sl2);
                            r2.setIsRecyclable(r1232);
                            valueAnimator2.start();
                            r32 = abstractC0887Ul;
                            z = true;
                            r122 = r1232;
                        }
                    } else {
                        iM1853g = m1853g(iM1733b);
                        if (iM1853g <= 0) {
                            iM1853g = m1851e(iM1733b);
                            if (iM1853g > 0) {
                                if ((i4 & iM1853g) == 0) {
                                    iM1853g = AbstractC0887Ul.m1734c(iM1853g, this.f3045q.getLayoutDirection());
                                }
                            }
                        }
                        velocityTracker = this.f3047s;
                        if (velocityTracker != null) {
                        }
                        char c222 = 4;
                        float fSignum222 = 0.0f;
                        if (iM1853g == 1) {
                        }
                    }
                }
            }
            this.f3031c = null;
            r3 = r32;
            r12 = r122;
        } else {
            r3 = abstractC0887Ul;
            r12 = 0;
            z = false;
        }
        if (abstractC1166o != null) {
            RecyclerView recyclerView3 = this.f3045q;
            int iMo1532d2 = r3.mo1532d();
            WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
            this.f3043o = (AbstractC0887Ul.m1733b(iMo1532d2, recyclerView3.getLayoutDirection()) & i3) >> (this.f3042n * 8);
            this.f3038j = abstractC1166o.itemView.getLeft();
            this.f3039k = abstractC1166o.itemView.getTop();
            this.f3031c = abstractC1166o;
            if (i == 2) {
                abstractC1166o.itemView.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f3045q.getParent();
        if (parent != 0) {
            ?? r124 = r12;
            if (this.f3031c != null) {
                r124 = 1;
            }
            parent.requestDisallowInterceptTouchEvent(r124);
        }
        if (!z) {
            this.f3045q.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        r3.mo1534m(this.f3031c, this.f3042n);
        this.f3045q.invalidate();
    }

    /* JADX INFO: renamed from: o */
    public final void m1860o(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f3032d;
        this.f3036h = f;
        this.f3037i = y - this.f3033e;
        if ((i & 4) == 0) {
            this.f3036h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f3036h = Math.min(0.0f, this.f3036h);
        }
        if ((i & 1) == 0) {
            this.f3037i = Math.max(0.0f, this.f3037i);
        }
        if ((i & 2) == 0) {
            this.f3037i = Math.min(0.0f, this.f3037i);
        }
    }

    @Override // p000.InterfaceC2474rv
    public final void onChildViewAttachedToWindow(View view) {
    }

    @Override // p000.InterfaceC2474rv
    public final void onChildViewDetachedFromWindow(View view) {
        m1858m(view);
        AbstractC1166o childViewHolder = this.f3045q.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC1166o abstractC1166o = this.f3031c;
        if (abstractC1166o != null && childViewHolder == abstractC1166o) {
            m1859n(null, 0);
            return;
        }
        m1854h(childViewHolder, false);
        if (this.f3029a.remove(childViewHolder.itemView)) {
            this.f3041m.mo1531a(this.f3045q, childViewHolder);
        }
    }

    @Override // p000.AbstractC2251mv
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        float f;
        float f2;
        if (this.f3031c != null) {
            float[] fArr = this.f3030b;
            m1856j(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC1166o abstractC1166o = this.f3031c;
        this.f3041m.getClass();
        ArrayList arrayList = this.f3044p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0801Sl c0801Sl = (C0801Sl) arrayList.get(i);
            AbstractC1166o abstractC1166o2 = c0801Sl.f2512e;
            float f3 = c0801Sl.f2508a;
            float f4 = c0801Sl.f2510c;
            if (f3 == f4) {
                c0801Sl.f2516i = abstractC1166o2.itemView.getTranslationX();
            } else {
                c0801Sl.f2516i = ((f4 - f3) * c0801Sl.f2520m) + f3;
            }
            float f5 = c0801Sl.f2509b;
            float f6 = c0801Sl.f2511d;
            if (f5 == f6) {
                c0801Sl.f2517j = abstractC1166o2.itemView.getTranslationY();
            } else {
                c0801Sl.f2517j = ((f6 - f5) * c0801Sl.f2520m) + f5;
            }
            int iSave = canvas.save();
            AbstractC0887Ul.m1735k(recyclerView, c0801Sl.f2512e, c0801Sl.f2516i, c0801Sl.f2517j, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC1166o != null) {
            int iSave2 = canvas.save();
            AbstractC0887Ul.m1735k(recyclerView, abstractC1166o, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        boolean z = false;
        if (this.f3031c != null) {
            float[] fArr = this.f3030b;
            m1856j(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC1166o abstractC1166o = this.f3031c;
        this.f3041m.getClass();
        ArrayList arrayList = this.f3044p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0801Sl c0801Sl = (C0801Sl) arrayList.get(i);
            int iSave = canvas.save();
            View view = c0801Sl.f2512e.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC1166o != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C0801Sl c0801Sl2 = (C0801Sl) arrayList.get(i2);
            boolean z2 = c0801Sl2.f2519l;
            if (z2 && !c0801Sl2.f2515h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
