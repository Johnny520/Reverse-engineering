package p037U;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p001A0.C0020F;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: U.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0374j extends AbstractC0341A {

    /* JADX INFO: renamed from: x */
    public static final int[] f798x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y */
    public static final int[] f799y = new int[0];

    /* JADX INFO: renamed from: a */
    public final int f800a;

    /* JADX INFO: renamed from: b */
    public final StateListDrawable f801b;

    /* JADX INFO: renamed from: c */
    public final Drawable f802c;

    /* JADX INFO: renamed from: d */
    public final int f803d;

    /* JADX INFO: renamed from: e */
    public final int f804e;

    /* JADX INFO: renamed from: f */
    public final StateListDrawable f805f;

    /* JADX INFO: renamed from: g */
    public final Drawable f806g;

    /* JADX INFO: renamed from: h */
    public final int f807h;

    /* JADX INFO: renamed from: i */
    public final int f808i;

    /* JADX INFO: renamed from: j */
    public float f809j;

    /* JADX INFO: renamed from: k */
    public float f810k;

    /* JADX INFO: renamed from: n */
    public final RecyclerView f813n;

    /* JADX INFO: renamed from: u */
    public final ValueAnimator f820u;

    /* JADX INFO: renamed from: v */
    public int f821v;

    /* JADX INFO: renamed from: w */
    public final RunnableC0019E f822w;

    /* JADX INFO: renamed from: l */
    public int f811l = 0;

    /* JADX INFO: renamed from: m */
    public int f812m = 0;

    /* JADX INFO: renamed from: o */
    public final boolean f814o = false;

    /* JADX INFO: renamed from: p */
    public final boolean f815p = false;

    /* JADX INFO: renamed from: q */
    public int f816q = 0;

    /* JADX INFO: renamed from: r */
    public int f817r = 0;

    /* JADX INFO: renamed from: s */
    public final int[] f818s = new int[2];

    /* JADX INFO: renamed from: t */
    public final int[] f819t = new int[2];

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
    public C0374j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f820u = valueAnimatorOfFloat;
        this.f821v = 0;
        RunnableC0019E runnableC0019E = new RunnableC0019E(3, this);
        this.f822w = runnableC0019E;
        C0372h c0372h = new C0372h();
        this.f801b = stateListDrawable;
        this.f802c = drawable;
        this.f805f = stateListDrawable2;
        this.f806g = drawable2;
        this.f803d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f804e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f807h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f808i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f800a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0373i(this));
        valueAnimatorOfFloat.addUpdateListener(new C0020F(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f813n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0343C abstractC0343C = recyclerView2.f1580j;
            if (abstractC0343C != null) {
                abstractC0343C.mo797b("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1582k;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1332y();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f813n;
            recyclerView3.f1583l.remove(this);
            if (recyclerView3.f1584m == this) {
                recyclerView3.f1584m = null;
            }
            ArrayList arrayList2 = this.f813n.f1565b0;
            if (arrayList2 != null) {
                arrayList2.remove(c0372h);
            }
            this.f813n.removeCallbacks(runnableC0019E);
        }
        this.f813n = recyclerView;
        if (recyclerView != null) {
            AbstractC0343C abstractC0343C2 = recyclerView.f1580j;
            if (abstractC0343C2 != null) {
                abstractC0343C2.mo797b("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1582k;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m1332y();
            recyclerView.requestLayout();
            this.f813n.f1583l.add(this);
            RecyclerView recyclerView4 = this.f813n;
            if (recyclerView4.f1565b0 == null) {
                recyclerView4.f1565b0 = new ArrayList();
            }
            recyclerView4.f1565b0.add(c0372h);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m952e(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    @Override // p037U.AbstractC0341A
    /* JADX INFO: renamed from: b */
    public final void mo759b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f811l;
        RecyclerView recyclerView2 = this.f813n;
        if (i2 != recyclerView2.getWidth() || this.f812m != recyclerView2.getHeight()) {
            this.f811l = recyclerView2.getWidth();
            this.f812m = recyclerView2.getHeight();
            m955f(0);
            return;
        }
        if (this.f821v != 0) {
            if (this.f814o) {
                int i3 = this.f811l;
                int i4 = this.f803d;
                int i5 = i3 - i4;
                int i6 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.f801b;
                stateListDrawable.setBounds(0, 0, i4, 0);
                int i7 = this.f812m;
                int i8 = this.f804e;
                Drawable drawable = this.f802c;
                drawable.setBounds(0, 0, i8, i7);
                Field field = AbstractC0080Q.f219a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i4, -i6);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i6);
                }
            }
            if (this.f815p) {
                int i9 = this.f812m;
                int i10 = this.f807h;
                int i11 = i9 - i10;
                StateListDrawable stateListDrawable2 = this.f805f;
                stateListDrawable2.setBounds(0, 0, 0, i10);
                int i12 = this.f811l;
                int i13 = this.f808i;
                Drawable drawable2 = this.f806g;
                drawable2.setBounds(0, 0, i12, i13);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i11);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m953c(float f2, float f3) {
        return f3 >= ((float) (this.f812m - this.f807h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m954d(float f2, float f3) {
        RecyclerView recyclerView = this.f813n;
        Field field = AbstractC0080Q.f219a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f803d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f811l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    /* JADX INFO: renamed from: f */
    public final void m955f(int i2) {
        RunnableC0019E runnableC0019E = this.f822w;
        StateListDrawable stateListDrawable = this.f801b;
        if (i2 == 2 && this.f816q != 2) {
            stateListDrawable.setState(f798x);
            this.f813n.removeCallbacks(runnableC0019E);
        }
        if (i2 == 0) {
            this.f813n.invalidate();
        } else {
            m956g();
        }
        if (this.f816q == 2 && i2 != 2) {
            stateListDrawable.setState(f799y);
            this.f813n.removeCallbacks(runnableC0019E);
            this.f813n.postDelayed(runnableC0019E, 1200);
        } else if (i2 == 1) {
            this.f813n.removeCallbacks(runnableC0019E);
            this.f813n.postDelayed(runnableC0019E, 1500);
        }
        this.f816q = i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m956g() {
        int i2 = this.f821v;
        ValueAnimator valueAnimator = this.f820u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f821v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
