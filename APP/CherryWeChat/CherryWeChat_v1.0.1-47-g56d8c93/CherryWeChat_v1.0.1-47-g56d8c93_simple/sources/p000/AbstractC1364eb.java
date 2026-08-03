package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: eb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1364eb extends View {

    /* JADX INFO: renamed from: a */
    public int[] f4872a;

    /* JADX INFO: renamed from: b */
    public int f4873b;

    /* JADX INFO: renamed from: c */
    public Context f4874c;

    /* JADX INFO: renamed from: d */
    public AbstractC2592uk f4875d;

    /* JADX INFO: renamed from: e */
    public String f4876e;

    /* JADX INFO: renamed from: f */
    public String f4877f;

    /* JADX INFO: renamed from: g */
    public HashMap f4878g;

    /* JADX INFO: renamed from: a */
    public final void m2649a(String r6) {
        Context r0 = this.f4874c;
        if (r6 != null) goto L5;
        return;
    L5:
        if (r6.length() == 0) goto L42;
        if (r0 == null) goto L43;
        String r62 = r6.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L12;
        ConstraintLayout r1 = (ConstraintLayout) getParent();
    L14:
        if (isInEditMode() == false) goto L26;
        if (r1 == null) goto L26;
        if (r62 == null) goto L22;
        HashMap r3 = r1.f3883m;
        if (r3 == null) goto L22;
        if (r3.containsKey(r62) == false) goto L22;
        Object r32 = r1.f3883m.get(r62);
    L24:
        if ((r32 instanceof Integer) == false) goto L26;
        int r33 = ((Integer) r32).intValue();
    L27:
        if (r33 != 0) goto L30;
        if (r1 == null) goto L30;
        r33 = m2653f(r1, r62);
    L30:
        if (r33 == 0) goto L38;
    L32:
        if (r33 != 0) goto L34;
        r33 = r0.getResources().getIdentifier(r62, "id", r0.getPackageName());
    L34:
        if (r33 == 0) goto L41;
        this.f4878g.put(Integer.valueOf(r33), r62);
        m2650b(r33);
        return;
    L41:
        return;
    L38:
        r33 = AbstractC0553Mu.class.getField(r62).getInt(null);     // Catch: Exception -> L37
    L22:
        r32 = null;
    L26:
        r33 = 0;
        goto L27
    L12:
        r1 = null;
        goto L14
    L43:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2650b(int r4) {
        if (r4 != getId()) goto L5;
        return;
    L5:
        int r0 = this.f4873b + 1;
        int[] r1 = this.f4872a;
        if (r0 <= r1.length) goto L8;
        this.f4872a = Arrays.copyOf(r1, r1.length * 2);
    L8:
        int[] r02 = this.f4872a;
        int r12 = this.f4873b;
        r02[r12] = r4;
        this.f4873b = r12 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2651c(String r7) {
        if (r7 != null) goto L4;
        return;
    L4:
        if (r7.length() != 0) goto L7;
        return;
    L7:
        if (this.f4874c == null) goto L33;
        String r72 = r7.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L12;
        ConstraintLayout r0 = (ConstraintLayout) getParent();
    L13:
        if (r0 != null) goto L15;
        return;
    L15:
        int r1 = r0.getChildCount();
        int r2 = 0;
    L16:
        if (r2 >= r1) goto L34;
        View r3 = r0.getChildAt(r2);
        ViewGroup.LayoutParams r4 = r3.getLayoutParams();
        if ((r4 instanceof C1452gb) == false) goto L25;
        if (r72.equals(((C1452gb) r4).f5104Y) == false) goto L25;
        if (r3.getId() == (-1)) goto L25;
        m2650b(r3.getId());
    L25:
        r2 = r2 + 1;
        goto L16
    L34:
        return;
    L12:
        r0 = null;
        goto L13
    }

    /* JADX INFO: renamed from: d */
    public final void m2652d(ConstraintLayout r6) {
        int r0 = getVisibility();
        float r1 = getElevation();
        int r2 = 0;
    L4:
        if (r2 >= this.f4873b) goto L11;
        int r3 = this.f4872a[r2];
        View r32 = (View) r6.f3871a.get(r3);
        if (r32 == null) goto L10;
        r32.setVisibility(r0);
        if (r1 <= 0.0f) goto L10;
        r32.setTranslationZ(r32.getTranslationZ() + r1);
    L10:
        r2 = r2 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: e */
    public void mo1834e(ConstraintLayout r1) {
    }

    /* JADX INFO: renamed from: f */
    public final int m2653f(ConstraintLayout r8, String r9) {
        if (r9 == null) goto L19;
        Resources r1 = this.f4874c.getResources();
        if (r1 == null) goto L19;
        int r2 = r8.getChildCount();
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L19;
        View r4 = r8.getChildAt(r3);
        if (r4.getId() == (-1)) goto L18;
        String r5 = r1.getResourceEntryName(r4.getId());     // Catch: Resources.NotFoundException -> L13
    L15:
        if (r9.equals(r5) == false) goto L18;
        return r4.getId();
    L13:
        r5 = null;
    L18:
        r3 = r3 + 1;
    L19:
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo1835g(AttributeSet r5) {
        if (r5 == null) goto L18;
        TypedArray r52 = getContext().obtainStyledAttributes(r5, AbstractC0639Ou.f2035b);
        int r0 = r52.getIndexCount();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L12;
        int r2 = r52.getIndex(r1);
        if (r2 != 35) goto L9;
        String r22 = r52.getString(r2);
        this.f4876e = r22;
        setIds(r22);
    L11:
        r1 = r1 + 1;
        goto L4
    L9:
        if (r2 != 36) goto L11;
        String r23 = r52.getString(r2);
        this.f4877f = r23;
        setReferenceTags(r23);
        goto L11
    L12:
        r52.recycle();
        return;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4872a, this.f4873b);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo2120h(C2454rb r1, boolean r2);

    /* JADX INFO: renamed from: i */
    public final void m2654i() {
        if (this.f4875d == null) goto L10;
        ViewGroup.LayoutParams r0 = getLayoutParams();
        if ((r0 instanceof C1452gb) == false) goto L9;
        AbstractC2592uk r1 = this.f4875d;
        ((C1452gb) r0).f5137p0 = r1;
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String r0 = this.f4876e;
        if (r0 == null) goto L5;
        setIds(r0);
    L5:
        String r02 = this.f4877f;
        if (r02 == null) goto L9;
        setReferenceTags(r02);
        return;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r1) {
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String r4) {
        this.f4876e = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        this.f4873b = 0;
    L6:
        int r1 = r4.indexOf(44, r0);
        if (r1 == (-1)) goto L8;
        m2649a(r4.substring(r0, r1));
        r0 = r1 + 1;
        goto L6
    L8:
        m2649a(r4.substring(r0));
    }

    public void setReferenceTags(String r4) {
        this.f4877f = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        this.f4873b = 0;
    L6:
        int r1 = r4.indexOf(44, r0);
        if (r1 == (-1)) goto L8;
        m2651c(r4.substring(r0, r1));
        r0 = r1 + 1;
        goto L6
    L8:
        m2651c(r4.substring(r0));
    }

    public void setReferencedIds(int[] r3) {
        this.f4876e = null;
        int r0 = 0;
        this.f4873b = 0;
    L4:
        if (r0 >= r3.length) goto L6;
        m2650b(r3[r0]);
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.View
    public final void setTag(int r1, Object r2) {
        super.setTag(r1, r2);
        if (r2 == null) goto L5;
        return;
    L5:
        if (this.f4876e != null) goto L9;
        m2650b(r1);
        return;
    }
}
