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

    /* JADX INFO: renamed from: a */
    public final ArrayList f3029a;

    /* JADX INFO: renamed from: b */
    public final float[] f3030b;

    /* JADX INFO: renamed from: c */
    public AbstractC1166o f3031c;

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

    /* JADX INFO: renamed from: l */
    public int f3040l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0887Ul f3041m;

    /* JADX INFO: renamed from: n */
    public int f3042n;

    /* JADX INFO: renamed from: o */
    public int f3043o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f3044p;

    /* JADX INFO: renamed from: q */
    public RecyclerView f3045q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0431K0 f3046r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f3047s;

    /* JADX INFO: renamed from: t */
    public ArrayList f3048t;

    /* JADX INFO: renamed from: u */
    public ArrayList f3049u;

    /* JADX INFO: renamed from: v */
    public View f3050v;

    /* JADX INFO: renamed from: w */
    public GestureDetectorCompat f3051w;

    /* JADX INFO: renamed from: x */
    public C0930Vl f3052x;

    /* JADX INFO: renamed from: y */
    public final C0758Rl f3053y;

    /* JADX INFO: renamed from: z */
    public Rect f3054z;

    public C0973Wl(AbstractC0887Ul r4) {
        this.f3029a = new ArrayList();
        this.f3030b = new float[2];
        this.f3031c = null;
        this.f3040l = -1;
        this.f3042n = 0;
        this.f3044p = new ArrayList();
        this.f3046r = new RunnableC0431K0(10, this);
        this.f3050v = null;
        this.f3053y = new C0758Rl(this);
        this.f3041m = r4;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1849k(View r1, float r2, float r3, float r4, float r5) {
        if (r2 >= r4) goto L5;
        return false;
    L5:
        if (r2 <= (r4 + r1.getWidth())) goto L7;
        return false;
    L7:
        if (r3 >= r5) goto L9;
        return false;
    L9:
        if (r3 > (r5 + r1.getHeight())) goto L16;
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m1850d(RecyclerView r7) {
        RecyclerView r0 = this.f3045q;
        if (r0 != r7) goto L5;
        return;
    L5:
        C0758Rl r1 = this.f3053y;
        if (r0 == null) goto L20;
        r0.removeItemDecoration(this);
        this.f3045q.removeOnItemTouchListener(r1);
        this.f3045q.removeOnChildAttachStateChangeListener(this);
        ArrayList r02 = this.f3044p;
        int r2 = r02.size();
    L8:
        r2 = r2 - 1;
        if (r2 < 0) goto L11;
        C0801Sl r3 = (C0801Sl) r02.get(0);
        r3.f2514g.cancel();
        this.f3041m.mo1531a(this.f3045q, r3.f2512e);
        goto L8
    L11:
        r02.clear();
        this.f3050v = null;
        VelocityTracker r22 = this.f3047s;
        if (r22 == null) goto L14;
        r22.recycle();
        this.f3047s = null;
    L14:
        C0930Vl r23 = this.f3052x;
        if (r23 == null) goto L18;
        r23.f2895a = false;
        this.f3052x = null;
    L18:
        if (this.f3051w == null) goto L20;
        this.f3051w = null;
    L20:
        this.f3045q = r7;
        Resources r72 = r7.getResources();
        this.f3034f = r72.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f3035g = r72.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        ViewConfiguration.get(this.f3045q.getContext()).getScaledTouchSlop();
        this.f3045q.addItemDecoration(this);
        this.f3045q.addOnItemTouchListener(r1);
        this.f3045q.addOnChildAttachStateChangeListener(this);
        this.f3052x = new C0930Vl(this);
        this.f3051w = new GestureDetectorCompat(this.f3045q.getContext(), this.f3052x);
    }

    /* JADX INFO: renamed from: e */
    public final int m1851e(int r9) {
        if ((r9 & 12) == 0) goto L28;
        int r2 = 4;
        if (this.f3036h <= 0.0f) goto L7;
        int r0 = 8;
    L8:
        VelocityTracker r4 = this.f3047s;
        AbstractC0887Ul r5 = this.f3041m;
        if (r4 != null) goto L11;
    L23:
        float r1 = this.f3045q.getWidth();
        r5.getClass();
        float r12 = r1 * 0.5f;
        if ((r9 & r0) != 0) goto L26;
        return 0;
    L26:
        if (Math.abs(this.f3036h) <= r12) goto L31;
        return r0;
    L31:
        return 0;
    L11:
        if (this.f3040l <= (-1)) goto L23;
        float r6 = this.f3035g;
        r5.getClass();
        r4.computeCurrentVelocity(1000, r6);
        float r42 = this.f3047s.getXVelocity(this.f3040l);
        float r62 = this.f3047s.getYVelocity(this.f3040l);
        if (r42 <= 0.0f) goto L15;
        r2 = 8;
    L15:
        float r13 = Math.abs(r42);
        if ((r2 & r9) == 0) goto L23;
        if (r0 != r2) goto L23;
        if (r13 < this.f3034f) goto L23;
        if (r13 <= Math.abs(r62)) goto L23;
        return r2;
    L7:
        r0 = 4;
        goto L8
    L28:
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1852f(int r1, int r2, MotionEvent r3) {
        if (this.f3031c == null) goto L5;
        return;
    L5:
        if (r1 == 2) goto L7;
        return;
    L7:
        if (this.f3042n == 2) goto L12;
        this.f3041m.getClass();
        return;
    }

    /* JADX INFO: renamed from: g */
    public final int m1853g(int r9) {
        if ((r9 & 3) == 0) goto L28;
        int r2 = 1;
        if (this.f3037i <= 0.0f) goto L7;
        int r0 = 2;
    L8:
        VelocityTracker r4 = this.f3047s;
        AbstractC0887Ul r5 = this.f3041m;
        if (r4 != null) goto L11;
    L23:
        float r1 = this.f3045q.getHeight();
        r5.getClass();
        float r12 = r1 * 0.5f;
        if ((r9 & r0) != 0) goto L26;
        return 0;
    L26:
        if (Math.abs(this.f3037i) <= r12) goto L31;
        return r0;
    L31:
        return 0;
    L11:
        if (this.f3040l <= (-1)) goto L23;
        float r6 = this.f3035g;
        r5.getClass();
        r4.computeCurrentVelocity(1000, r6);
        float r42 = this.f3047s.getXVelocity(this.f3040l);
        float r62 = this.f3047s.getYVelocity(this.f3040l);
        if (r62 <= 0.0f) goto L15;
        r2 = 2;
    L15:
        float r13 = Math.abs(r62);
        if ((r2 & r9) == 0) goto L23;
        if (r2 != r0) goto L23;
        if (r13 < this.f3034f) goto L23;
        if (r13 <= Math.abs(r42)) goto L23;
        return r2;
    L7:
        r0 = 1;
        goto L8
    L28:
        return 0;
    }

    @Override // p000.AbstractC2251mv
    public final void getItemOffsets(Rect r1, View r2, RecyclerView r3, C0038Av r4) {
        r1.setEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final void m1854h(AbstractC1166o r5, boolean r6) {
        ArrayList r0 = this.f3044p;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L12;
        C0801Sl r2 = (C0801Sl) r0.get(r1);
        if (r2.f2512e == r5) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        r2.f2518k |= r6;
        if (r2.f2519l == true) goto L9;
        r2.f2514g.cancel();
    L9:
        r0.remove(r1);
        return;
    }

    /* JADX INFO: renamed from: i */
    public final View m1855i(MotionEvent r7) {
        float r0 = r7.getX();
        float r72 = r7.getY();
        AbstractC1166o r1 = this.f3031c;
        if (r1 == null) goto L7;
        View r12 = r1.itemView;
        if (m1849k(r12, r0, r72, this.f3038j + this.f3036h, this.f3039k + this.f3037i) == false) goto L7;
        return r12;
    L7:
        ArrayList r13 = this.f3044p;
        int r2 = r13.size() - 1;
    L8:
        if (r2 < 0) goto L14;
        C0801Sl r3 = (C0801Sl) r13.get(r2);
        View r4 = r3.f2512e.itemView;
        if (m1849k(r4, r0, r72, r3.f2516i, r3.f2517j) == true) goto L11;
        r2 = r2 - 1;
        goto L8
    L11:
        return r4;
    L14:
        return this.f3045q.findChildViewUnder(r0, r72);
    }

    /* JADX INFO: renamed from: j */
    public final void m1856j(float[] r4) {
        if ((this.f3043o & 12) == 0) goto L5;
        r4[0] = (this.f3038j + this.f3036h) - this.f3031c.itemView.getLeft();
    L7:
        if ((this.f3043o & 3) == 0) goto L10;
        r4[1] = (this.f3039k + this.f3037i) - this.f3031c.itemView.getTop();
        return;
    L10:
        r4[1] = this.f3031c.itemView.getTranslationY();
        return;
    L5:
        r4[0] = this.f3031c.itemView.getTranslationX();
        goto L7
    }

    /* JADX INFO: renamed from: l */
    public final void m1857l(AbstractC1166o r23) {
        if (this.f3045q.isLayoutRequested() == true) goto L115;
        char r3 = 2;
        if (this.f3042n != 2) goto L116;
        AbstractC0887Ul r2 = this.f3041m;
        r2.getClass();
        int r4 = (int) (this.f3038j + this.f3036h);
        int r5 = (int) (this.f3039k + this.f3037i);
        if (Math.abs(r5 - r23.itemView.getTop()) < (r23.itemView.getHeight() * 0.5f)) goto L11;
    L13:
        ArrayList r6 = this.f3048t;
        if (r6 != null) goto L16;
        this.f3048t = new ArrayList();
        this.f3049u = new ArrayList();
    L17:
        int r62 = Math.round(this.f3038j + this.f3036h);
        int r7 = Math.round(this.f3039k + this.f3037i);
        int r8 = r23.itemView.getWidth() + r62;
        int r9 = r23.itemView.getHeight() + r7;
        int r10 = (r62 + r8) / 2;
        int r11 = (r7 + r9) / 2;
        AbstractC1160i r12 = this.f3045q.getLayoutManager();
        int r13 = r12.getChildCount();
        int r15 = 0;
    L18:
        if (r15 >= r13) goto L38;
        char r16 = r3;
        View r32 = r12.getChildAt(r15);
        if (r32 != r23.itemView) goto L23;
    L21:
        int r18 = r62;
        int r19 = r7;
        int r20 = r8;
    L37:
        r15 = r15 + 1;
        r3 = r16;
        r62 = r18;
        r7 = r19;
        r8 = r20;
        goto L18
    L23:
        if (r32.getBottom() < r7) goto L21;
        if (r32.getTop() > r9) goto L21;
        if (r32.getRight() < r62) goto L21;
        if (r32.getLeft() > r8) goto L21;
        AbstractC1166o r14 = this.f3045q.getChildViewHolder(r32);
        int r182 = Math.abs(r10 - ((r32.getRight() + r32.getLeft()) / 2));
        int r33 = Math.abs(r11 - ((r32.getBottom() + r32.getTop()) / 2));
        int r34 = (r33 * r33) + (r182 * r182);
        r18 = r62;
        int r63 = this.f3048t.size();
        r19 = r7;
        r20 = r8;
        int r72 = 0;
        int r82 = 0;
    L32:
        if (r72 >= r63) goto L36;
        int r21 = r63;
        if (r34 <= ((Integer) this.f3049u.get(r72)).intValue()) goto L36;
        r82 = r82 + 1;
        r72 = r72 + 1;
        r63 = r21;
    L36:
        this.f3048t.add(r82, r14);
        this.f3049u.add(r82, Integer.valueOf(r34));
        goto L37
    L38:
        ArrayList r35 = this.f3048t;
        if (r35.size() == 0) goto L118;
        int r64 = r23.itemView.getWidth() + r4;
        int r73 = r23.itemView.getHeight() + r5;
        int r83 = r4 - r23.itemView.getLeft();
        int r92 = r5 - r23.itemView.getTop();
        int r102 = r35.size();
        AbstractC1166o r112 = null;
        int r122 = -1;
        int r142 = 0;
    L42:
        if (r142 >= r102) goto L78;
        AbstractC1166o r132 = (AbstractC1166o) r35.get(r142);
        if (r83 <= 0) goto L52;
        int r152 = r132.itemView.getRight() - r64;
        if (r152 >= 0) goto L52;
        ArrayList r162 = r35;
        int r17 = r64;
        if (r132.itemView.getRight() <= r23.itemView.getRight()) goto L53;
        int r36 = Math.abs(r152);
        if (r36 <= r122) goto L53;
        r122 = r36;
        r112 = r132;
    L53:
        if (r83 >= 0) goto L61;
        int r37 = r132.itemView.getLeft() - r4;
        if (r37 <= 0) goto L61;
        if (r132.itemView.getLeft() >= r23.itemView.getLeft()) goto L61;
        int r38 = Math.abs(r37);
        if (r38 <= r122) goto L61;
        r122 = r38;
        r112 = r132;
    L61:
        if (r92 >= 0) goto L69;
        int r39 = r132.itemView.getTop() - r5;
        if (r39 <= 0) goto L69;
        if (r132.itemView.getTop() >= r23.itemView.getTop()) goto L69;
        int r310 = Math.abs(r39);
        if (r310 <= r122) goto L69;
        r122 = r310;
        r112 = r132;
    L69:
        if (r92 <= 0) goto L77;
        int r311 = r132.itemView.getBottom() - r73;
        if (r311 >= 0) goto L77;
        if (r132.itemView.getBottom() <= r23.itemView.getBottom()) goto L77;
        int r312 = Math.abs(r311);
        if (r312 <= r122) goto L77;
        r122 = r312;
        r112 = r132;
    L77:
        r142 = r142 + 1;
        r35 = r162;
        r64 = r17;
    L52:
        r162 = r35;
        r17 = r64;
        goto L53
    L78:
        if (r112 != null) goto L81;
        this.f3048t.clear();
        this.f3049u.clear();
        return;
    L81:
        int r313 = r112.getAbsoluteAdapterPosition();
        r23.getAbsoluteAdapterPosition();
        r2.mo1533l(r23, r112);
        RecyclerView r22 = this.f3045q;
        AbstractC1160i r65 = r22.getLayoutManager();
        if ((r65 instanceof LinearLayoutManager) == false) goto L86;
        ((LinearLayoutManager) r65).prepareForDrop(r23.itemView, r112.itemView, r4, r5);
        return;
    L86:
        if (r65.canScrollHorizontally() == false) goto L94;
        if (r65.getDecoratedLeft(r112.itemView) > r22.getPaddingLeft()) goto L91;
        r22.scrollToPosition(r313);
    L91:
        if (r65.getDecoratedRight(r112.itemView) < (r22.getWidth() - r22.getPaddingRight())) goto L94;
        r22.scrollToPosition(r313);
    L94:
        if (r65.canScrollVertically() == true) goto L96;
        return;
    L96:
        if (r65.getDecoratedTop(r112.itemView) > r22.getPaddingTop()) goto L99;
        r22.scrollToPosition(r313);
    L99:
        if (r65.getDecoratedBottom(r112.itemView) < (r22.getHeight() - r22.getPaddingBottom())) goto L114;
        r22.scrollToPosition(r313);
        return;
    L114:
        return;
    L118:
        return;
    L16:
        r6.clear();
        this.f3049u.clear();
        goto L17
    L11:
        if (Math.abs(r4 - r23.itemView.getLeft()) >= (r23.itemView.getWidth() * 0.5f)) goto L13;
        return;
    L116:
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m1858m(View r2) {
        if (r2 != this.f3050v) goto L6;
        this.f3050v = null;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void m1859n(AbstractC1166o r21, int r22) {
        if (r21 == this.f3031c) goto L5;
    L7:
        this.f3028A = Long.MIN_VALUE;
        int r3 = this.f3042n;
        m1854h(r21, true);
        this.f3042n = r22;
        if (r22 != 2) goto L13;
        if (r21 == null) goto L12;
        this.f3050v = r21.itemView;
        goto L13
    L12:
        throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
    L13:
        int r15 = (1 << ((r22 * 8) + 8)) - 1;
        ?? r2 = this.f3031c;
        AbstractC0887Ul r0 = this.f3041m;
        if (r2 != 0) goto L16;
        ?? r32 = r0;
        ?? r12 = 0;
        boolean r4 = false;
    L75:
        if (r21 == null) goto L79;
        RecyclerView r02 = this.f3045q;
        int r23 = r32.mo1532d();
        WeakHashMap r5 = AbstractC2185lE.f7617a;
        this.f3043o = (AbstractC0887Ul.m1733b(r23, r02.getLayoutDirection()) & r15) >> (this.f3042n * 8);
        this.f3038j = r21.itemView.getLeft();
        this.f3039k = r21.itemView.getTop();
        this.f3031c = r21;
        if (r22 != 2) goto L79;
        r21.itemView.performHapticFeedback(r12 == true ? 1 : 0);
    L79:
        ?? r03 = this.f3045q.getParent();
        if (r03 == 0) goto L85;
        ?? r122 = r12;
        if (this.f3031c == null) goto L84;
        r122 = 1;
    L84:
        r03.requestDisallowInterceptTouchEvent(r122);
    L85:
        if (r4 == true) goto L87;
        this.f3045q.getLayoutManager().requestSimpleAnimationsInNextLayout();
    L87:
        r32.mo1534m(this.f3031c, this.f3042n);
        this.f3045q.invalidate();
        return;
    L16:
        if (r2.itemView.getParent() == null) goto L72;
        if (r3 != 2) goto L20;
    L18:
        int r8 = 0;
    L43:
        VelocityTracker r52 = this.f3047s;
        if (r52 == null) goto L46;
        r52.recycle();
        this.f3047s = null;
    L46:
        char r53 = 4;
        float r7 = 0.0f;
        if (r8 == 1) goto L57;
        if (r8 == 2) goto L57;
        if (r8 == 4) goto L56;
        if (r8 == 8) goto L56;
        if (r8 == 16) goto L56;
        if (r8 == 32) goto L56;
        float r42 = 0.0f;
        char r16 = 0;
    L58:
        if (r3 != 2) goto L60;
        r53 = '\b';
    L62:
        float[] r9 = this.f3030b;
        m1856j(r9);
        char r19 = r53;
        ?? r123 = r16;
        C0801Sl r04 = new C0801Sl(this, r2, r3, r9[r16], r9[1], r7, r42, r8, r2);
        RecyclerView r33 = this.f3045q;
        r0.getClass();
        AbstractC1159h r34 = r33.getItemAnimator();
        if (r34 != null) goto L67;
        if (r19 != '\b') goto L66;
        long r35 = 200;
    L70:
        ValueAnimator r54 = r04.f2514g;
        r54.setDuration(r35);
        this.f3044p.add(r04);
        r2.setIsRecyclable(r123);
        r54.start();
        ?? r36 = r0;
        r4 = true;
        ?? r124 = r123;
    L73:
        this.f3031c = null;
        r32 = r36;
        r12 = r124;
        goto L75
    L66:
        r35 = 250;
        goto L70
    L67:
        if (r19 != '\b') goto L69;
        r35 = r34.f4037e;
        goto L70
    L69:
        r35 = r34.f4036d;
        goto L70
    L60:
        if (r8 <= 0) goto L62;
        r53 = 2;
    L56:
        r16 = 0;
        r42 = 0.0f;
        r7 = Math.signum(this.f3036h) * this.f3045q.getWidth();
    L57:
        r16 = 0;
        r42 = Math.signum(this.f3037i) * this.f3045q.getHeight();
        goto L58
    L20:
        if (this.f3042n == 2) goto L18;
        int r55 = r0.mo1532d();
        RecyclerView r72 = this.f3045q;
        WeakHashMap r82 = AbstractC2185lE.f7617a;
        int r73 = (AbstractC0887Ul.m1733b(r55, r72.getLayoutDirection()) & 65280) >> 8;
        if (r73 == 0) goto L18;
        int r56 = (r55 & 65280) >> 8;
        if (Math.abs(this.f3036h) <= Math.abs(this.f3037i)) goto L35;
        r8 = m1851e(r73);
        if (r8 > 0) goto L30;
        r8 = m1853g(r73);
        if (r8 <= 0) goto L18;
    L30:
        if ((r56 & r8) != 0) goto L43;
        r8 = AbstractC0887Ul.m1734c(r8, this.f3045q.getLayoutDirection());
        goto L43
    L35:
        r8 = m1853g(r73);
        if (r8 > 0) goto L43;
        r8 = m1851e(r73);
        if (r8 <= 0) goto L18;
        if ((r56 & r8) != 0) goto L43;
        r8 = AbstractC0887Ul.m1734c(r8, this.f3045q.getLayoutDirection());
        goto L43
    L72:
        r124 = 0;
        m1858m(r2.itemView);
        ?? r37 = r0;
        r37.mo1531a(this.f3045q, r2);
        r4 = false;
        r36 = r37;
        goto L73
    L5:
        if (r22 != this.f3042n) goto L7;
    }

    /* JADX INFO: renamed from: o */
    public final void m1860o(int r2, int r3, MotionEvent r4) {
        float r0 = r4.getX(r3);
        float r32 = r4.getY(r3);
        float r02 = r0 - this.f3032d;
        this.f3036h = r02;
        this.f3037i = r32 - this.f3033e;
        if ((r2 & 4) != 0) goto L6;
        this.f3036h = Math.max(0.0f, r02);
    L6:
        if ((r2 & 8) != 0) goto L9;
        this.f3036h = Math.min(0.0f, this.f3036h);
    L9:
        if ((r2 & 1) != 0) goto L12;
        this.f3037i = Math.max(0.0f, this.f3037i);
    L12:
        if ((r2 & 2) != 0) goto L15;
        this.f3037i = Math.min(0.0f, this.f3037i);
        return;
    }

    @Override // p000.InterfaceC2474rv
    public final void onChildViewAttachedToWindow(View r1) {
    }

    @Override // p000.InterfaceC2474rv
    public final void onChildViewDetachedFromWindow(View r3) {
        m1858m(r3);
        AbstractC1166o r32 = this.f3045q.getChildViewHolder(r3);
        if (r32 == null) goto L15;
        AbstractC1166o r0 = this.f3031c;
        if (r0 == null) goto L10;
        if (r32 != r0) goto L10;
        m1859n(null, 0);
        return;
    L10:
        m1854h(r32, false);
        if (this.f3029a.remove(r32.itemView) == false) goto L14;
        this.f3041m.mo1531a(this.f3045q, r32);
        return;
    L14:
        return;
    }

    @Override // p000.AbstractC2251mv
    public final void onDraw(Canvas r13, RecyclerView r14, C0038Av r15) {
        if (this.f3031c == null) goto L5;
        float[] r152 = this.f3030b;
        m1856j(r152);
        float r2 = r152[0];
        float r153 = r152[1];
    L6:
        AbstractC1166o r3 = this.f3031c;
        this.f3041m.getClass();
        ArrayList r4 = this.f3044p;
        int r5 = r4.size();
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L17;
        C0801Sl r7 = (C0801Sl) r4.get(r6);
        AbstractC1166o r8 = r7.f2512e;
        float r9 = r7.f2508a;
        float r10 = r7.f2510c;
        if (r9 != r10) goto L11;
        r7.f2516i = r8.itemView.getTranslationX();
    L12:
        float r92 = r7.f2509b;
        float r102 = r7.f2511d;
        if (r92 != r102) goto L15;
        r7.f2517j = r8.itemView.getTranslationY();
    L16:
        int r82 = r13.save();
        AbstractC0887Ul.m1735k(r14, r7.f2512e, r7.f2516i, r7.f2517j, false);
        r13.restoreToCount(r82);
        r6 = r6 + 1;
        goto L7
    L15:
        r7.f2517j = ((r102 - r92) * r7.f2520m) + r92;
        goto L16
    L11:
        r7.f2516i = ((r10 - r9) * r7.f2520m) + r9;
        goto L12
    L17:
        if (r3 == null) goto L23;
        int r1 = r13.save();
        AbstractC0887Ul.m1735k(r14, r3, r2, r153, true);
        r13.restoreToCount(r1);
        return;
    L23:
        return;
    L5:
        r2 = 0.0f;
        r153 = 0.0f;
        goto L6
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas r8, RecyclerView r9, C0038Av r10) {
        boolean r1 = false;
        if (this.f3031c == null) goto L5;
        float[] r102 = this.f3030b;
        m1856j(r102);
        float r2 = r102[0];
        float r103 = r102[1];
    L5:
        AbstractC1166o r104 = this.f3031c;
        this.f3041m.getClass();
        ArrayList r22 = this.f3044p;
        int r3 = r22.size();
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L8;
        C0801Sl r5 = (C0801Sl) r22.get(r4);
        int r6 = r8.save();
        View r52 = r5.f2512e.itemView;
        r8.restoreToCount(r6);
        r4 = r4 + 1;
        goto L6
    L8:
        if (r104 == null) goto L10;
        r8.restoreToCount(r8.save());
    L10:
        int r32 = r3 - 1;
    L11:
        if (r32 < 0) goto L20;
        C0801Sl r82 = (C0801Sl) r22.get(r32);
        boolean r105 = r82.f2519l;
        if (r105 == true) goto L15;
    L17:
        if (r105 == true) goto L19;
        r1 = true;
    L19:
        r32 = r32 - 1;
        goto L11
    L15:
        if (r82.f2515h == true) goto L17;
        r22.remove(r32);
        goto L19
    L20:
        if (r1 == false) goto L28;
        r9.invalidate();
        return;
    }
}
