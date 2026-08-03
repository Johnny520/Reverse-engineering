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
    public static final int[] f798x = null;

    /* JADX INFO: renamed from: y */
    public static final int[] f799y = null;

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

    /* JADX INFO: renamed from: l */
    public int f811l;

    /* JADX INFO: renamed from: m */
    public int f812m;

    /* JADX INFO: renamed from: n */
    public final RecyclerView f813n;

    /* JADX INFO: renamed from: o */
    public final boolean f814o;

    /* JADX INFO: renamed from: p */
    public final boolean f815p;

    /* JADX INFO: renamed from: q */
    public int f816q;

    /* JADX INFO: renamed from: r */
    public int f817r;

    /* JADX INFO: renamed from: s */
    public final int[] f818s;

    /* JADX INFO: renamed from: t */
    public final int[] f819t;

    /* JADX INFO: renamed from: u */
    public final ValueAnimator f820u;

    /* JADX INFO: renamed from: v */
    public int f821v;

    /* JADX INFO: renamed from: w */
    public final RunnableC0019E f822w;

    static {
        f798x = new int[]{R.attr.state_pressed};
        f799y = new int[0];
    }

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
    public C0374j(RecyclerView r7, StateListDrawable r8, Drawable r9, StateListDrawable r10, Drawable r11, int r12, int r13, int r14) {
        boolean r132 = true;
        this.f811l = 0;
        this.f812m = 0;
        this.f814o = false;
        this.f815p = false;
        this.f816q = 0;
        this.f817r = 0;
        this.f818s = new int[2];
        this.f819t = new int[2];
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f820u = r2;
        this.f821v = 0;
        RunnableC0019E r3 = new RunnableC0019E(3, this);
        this.f822w = r3;
        C0372h r4 = new C0372h();
        this.f801b = r8;
        this.f802c = r9;
        this.f805f = r10;
        this.f806g = r11;
        this.f803d = Math.max(r12, r8.getIntrinsicWidth());
        this.f804e = Math.max(r12, r9.getIntrinsicWidth());
        this.f807h = Math.max(r12, r10.getIntrinsicWidth());
        this.f808i = Math.max(r12, r11.getIntrinsicWidth());
        this.f800a = r14;
        r8.setAlpha(255);
        r9.setAlpha(255);
        r2.addListener(new C0373i(this));
        r2.addUpdateListener(new C0020F(1 == true ? 1 : 0, this));
        RecyclerView r82 = this.f813n;
        if (r82 == r7) goto L37;
        if (r82 == null) goto L23;
        AbstractC0343C r92 = r82.f1580j;
        if (r92 == null) goto L9;
        r92.mo797b("Cannot remove item decoration during a scroll  or layout");
    L9:
        ArrayList r93 = r82.f1582k;
        r93.remove(this);
        if (r93.isEmpty() == true) goto L12;
    L16:
        r82.m1332y();
        r82.requestLayout();
        RecyclerView r83 = this.f813n;
        r83.f1583l.remove(this);
        if (r83.f1584m != this) goto L19;
        r83.f1584m = null;
    L19:
        ArrayList r84 = this.f813n.f1565b0;
        if (r84 == null) goto L22;
        r84.remove(r4);
    L22:
        this.f813n.removeCallbacks(r3);
        goto L23
    L12:
        if (r82.getOverScrollMode() == 2) goto L15;
        r132 = false;
    L15:
        r82.setWillNotDraw(r132);
    L23:
        this.f813n = r7;
        if (r7 == null) goto L36;
        AbstractC0343C r85 = r7.f1580j;
        if (r85 == null) goto L28;
        r85.mo797b("Cannot add item decoration during a scroll  or layout");
    L28:
        ArrayList r86 = r7.f1582k;
        if (r86.isEmpty() == false) goto L31;
        r7.setWillNotDraw(false);
    L31:
        r86.add(this);
        r7.m1332y();
        r7.requestLayout();
        this.f813n.f1583l.add(this);
        RecyclerView r72 = this.f813n;
        if (r72.f1565b0 != null) goto L34;
        r72.f1565b0 = new ArrayList();
    L34:
        r72.f1565b0.add(r4);
        return;
    L36:
        return;
    }

    /* JADX INFO: renamed from: e */
    public static int m952e(float r2, float r3, int[] r4, int r5, int r6, int r7) {
        int r02 = r4[1] - r4[0];
        if (r02 != 0) goto L5;
        return 0;
    L5:
        int r52 = r5 - r7;
        int r22 = (int) (((r3 - r2) / r02) * r52);
        int r62 = r6 + r22;
        if (r62 >= r52) goto L9;
        if (r62 < 0) goto L9;
        return r22;
    L9:
        return 0;
    }

    @Override // p037U.AbstractC0341A
    /* JADX INFO: renamed from: b */
    public final void mo759b(Canvas r10, RecyclerView r11) {
        int r112 = this.f811l;
        RecyclerView r02 = this.f813n;
        if (r112 == r02.getWidth()) goto L5;
    L19:
        this.f811l = r02.getWidth();
        this.f812m = r02.getHeight();
        m955f(0);
        return;
    L5:
        if (this.f812m != r02.getHeight()) goto L19;
        if (this.f821v != 0) goto L10;
        return;
    L10:
        if (this.f814o == false) goto L16;
        int r113 = this.f811l;
        int r3 = this.f803d;
        int r114 = r113 - r3;
        int r4 = 0 - (0 / 2);
        StateListDrawable r5 = this.f801b;
        r5.setBounds(0, 0, r3, 0);
        int r6 = this.f812m;
        int r7 = this.f804e;
        Drawable r8 = this.f802c;
        r8.setBounds(0, 0, r7, r6);
        Field r62 = AbstractC0080Q.f219a;
        if (r02.getLayoutDirection() != 1) goto L14;
        r8.draw(r10);
        r10.translate(r3, r4);
        r10.scale(-1.0f, 1.0f);
        r5.draw(r10);
        r10.scale(1.0f, 1.0f);
        r10.translate(-r3, -r4);
        goto L16
    L14:
        r10.translate(r114, 0.0f);
        r8.draw(r10);
        r10.translate(0.0f, r4);
        r5.draw(r10);
        r10.translate(-r114, -r4);
    L16:
        if (this.f815p == false) goto L22;
        int r115 = this.f812m;
        int r03 = this.f807h;
        int r116 = r115 - r03;
        StateListDrawable r42 = this.f805f;
        r42.setBounds(0, 0, 0, r03);
        int r04 = this.f811l;
        int r52 = this.f808i;
        Drawable r63 = this.f806g;
        r63.setBounds(0, 0, r04, r52);
        r10.translate(0.0f, r116);
        r63.draw(r10);
        r10.translate(0 - (0 / 2), 0.0f);
        r42.draw(r10);
        r10.translate(-r3, -r116);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m953c(float r3, float r4) {
        if (r4 >= (this.f812m - this.f807h)) goto L5;
    L9:
        return false;
    L5:
        if (r3 < (0 - (0 / 2))) goto L9;
        if (r3 > ((0 / 2) + 0)) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m954d(float r5, float r6) {
        RecyclerView r1 = this.f813n;
        Field r2 = AbstractC0080Q.f219a;
        if (r1.getLayoutDirection() != 1) goto L5;
        boolean r12 = true;
    L6:
        int r3 = this.f803d;
        if (r12 == false) goto L12;
        if (r5 > (r3 / 2)) goto L19;
    L13:
        int r52 = 0 / 2;
        if (r6 >= (0 - r52)) goto L16;
        return false;
    L16:
        if (r6 <= (r52 + 0)) goto L18;
        return false;
    L18:
        return true;
    L19:
        return false;
    L12:
        if (r5 >= (this.f811l - r3)) goto L13;
        return false;
    L5:
        r12 = false;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public final void m955f(int r5) {
        RunnableC0019E r02 = this.f822w;
        StateListDrawable r1 = this.f801b;
        if (r5 == 2) goto L5;
    L7:
        if (r5 != 0) goto L9;
        this.f813n.invalidate();
    L11:
        if (this.f816q != 2) goto L15;
        if (r5 == 2) goto L15;
        r1.setState(f799y);
        this.f813n.removeCallbacks(r02);
        this.f813n.postDelayed(r02, 1200);
    L17:
        this.f816q = r5;
        return;
    L15:
        if (r5 != 1) goto L17;
        this.f813n.removeCallbacks(r02);
        this.f813n.postDelayed(r02, 1500);
        goto L17
    L9:
        m956g();
        goto L11
    L5:
        if (this.f816q == 2) goto L7;
        r1.setState(f798x);
        this.f813n.removeCallbacks(r02);
        goto L7
    }

    /* JADX INFO: renamed from: g */
    public final void m956g() {
        int r1 = this.f821v;
        ValueAnimator r2 = this.f820u;
        if (r1 != 0) goto L5;
    L8:
        this.f821v = 1;
        r2.setFloatValues(new float[]{((Float) r2.getAnimatedValue()).floatValue(), 1.0f});
        r2.setDuration(500);
        r2.setStartDelay(0);
        r2.start();
        return;
    L5:
        if (r1 != 3) goto L10;
        r2.cancel();
        goto L8
    }
}
