package p075p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p071n.AbstractC1004i;
import p071n.C0999d;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1037c extends View {

    /* JADX INFO: renamed from: a */
    public int[] f3870a;

    /* JADX INFO: renamed from: b */
    public int f3871b;

    /* JADX INFO: renamed from: c */
    public Context f3872c;

    /* JADX INFO: renamed from: d */
    public AbstractC1004i f3873d;

    /* JADX INFO: renamed from: e */
    public String f3874e;

    /* JADX INFO: renamed from: f */
    public HashMap f3875f;

    /* JADX INFO: renamed from: a */
    public final void m2513a(String r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (r6.length() == 0) goto L46;
        Context r02 = this.f3872c;
        if (r02 != null) goto L9;
        return;
    L9:
        String r62 = r6.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L13;
        ConstraintLayout r1 = (ConstraintLayout) getParent();
    L13:
        if ((getParent() instanceof ConstraintLayout) == false) goto L15;
        ConstraintLayout r12 = (ConstraintLayout) getParent();
    L17:
        if (isInEditMode() == false) goto L30;
        if (r12 == null) goto L30;
        if ((r62 instanceof String) == false) goto L26;
        HashMap r3 = r12.f1270m;
        if (r3 == null) goto L26;
        if (r3.containsKey(r62) == false) goto L26;
        Object r32 = r12.f1270m.get(r62);
    L28:
        if ((r32 instanceof Integer) == false) goto L30;
        int r33 = ((Integer) r32).intValue();
    L31:
        if (r33 != 0) goto L34;
        if (r12 == null) goto L34;
        r33 = m2516d(r12, r62);
    L34:
        if (r33 == 0) goto L42;
    L36:
        if (r33 != 0) goto L38;
        r33 = r02.getResources().getIdentifier(r62, "id", r02.getPackageName());
    L38:
        if (r33 == 0) goto L45;
        this.f3875f.put(Integer.valueOf(r33), r62);
        m2514b(r33);
        return;
    L45:
        return;
    L42:
        r33 = AbstractC1051q.class.getField(r62).getInt(null);     // Catch: Exception -> L41
    L26:
        r32 = null;
    L30:
        r33 = 0;
        goto L31
    L15:
        r12 = null;
        goto L17
    }

    /* JADX INFO: renamed from: b */
    public final void m2514b(int r4) {
        if (r4 != getId()) goto L5;
        return;
    L5:
        int r02 = this.f3871b + 1;
        int[] r1 = this.f3870a;
        if (r02 <= r1.length) goto L8;
        this.f3870a = Arrays.copyOf(r1, r1.length * 2);
    L8:
        int[] r03 = this.f3870a;
        int r12 = this.f3871b;
        r03[r12] = r4;
        this.f3871b = r12 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2515c() {
        ViewParent r02 = getParent();
        if (r02 != null) goto L5;
        return;
    L5:
        if ((r02 instanceof ConstraintLayout) == false) goto L20;
        ConstraintLayout r03 = (ConstraintLayout) r02;
        int r1 = getVisibility();
        float r2 = getElevation();
        int r3 = 0;
    L8:
        if (r3 >= this.f3871b) goto L21;
        int r4 = this.f3870a[r3];
        View r42 = (View) r03.f1258a.get(r4);
        if (r42 == null) goto L14;
        r42.setVisibility(r1);
        if (r2 <= 0.0f) goto L14;
        r42.setTranslationZ(r42.getTranslationZ() + r2);
    L14:
        r3 = r3 + 1;
        goto L8
    L21:
        return;
    }

    /* JADX INFO: renamed from: d */
    public final int m2516d(ConstraintLayout r8, String r9) {
        if (r9 == null) goto L21;
        if (r8 == null) goto L21;
        Resources r1 = this.f3872c.getResources();
        if (r1 != null) goto L9;
        return 0;
    L9:
        int r2 = r8.getChildCount();
        int r3 = 0;
    L10:
        if (r3 >= r2) goto L21;
        View r4 = r8.getChildAt(r3);
        if (r4.getId() == (-1)) goto L20;
        String r5 = r1.getResourceEntryName(r4.getId());     // Catch: Resources.NotFoundException -> L15
    L17:
        if (r9.equals(r5) == false) goto L20;
        return r4.getId();
    L15:
        r5 = null;
    L20:
        r3 = r3 + 1;
    L21:
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public void mo1155e(AttributeSet r5) {
        if (r5 == null) goto L9;
        TypedArray r52 = getContext().obtainStyledAttributes(r5, AbstractC1052r.f4051b);
        int r02 = r52.getIndexCount();
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L13;
        int r2 = r52.getIndex(r1);
        if (r2 != 19) goto L8;
        String r22 = r52.getString(r2);
        this.f3874e = r22;
        setIds(r22);
    L8:
        r1 = r1 + 1;
        goto L4
    L13:
        return;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1156f(C0999d r1, boolean r2);

    /* JADX INFO: renamed from: g */
    public final void m2517g() {
        if (this.f3873d != null) goto L5;
        return;
    L5:
        ViewGroup.LayoutParams r02 = getLayoutParams();
        if ((r02 instanceof C1039e) == false) goto L9;
        AbstractC1004i r1 = this.f3873d;
        ((C1039e) r02).f3924k0 = r1;
        return;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3870a, this.f3871b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String r02 = this.f3874e;
        if (r02 == null) goto L6;
        setIds(r02);
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
        this.f3874e = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r02 = 0;
        this.f3871b = 0;
    L6:
        int r1 = r4.indexOf(44, r02);
        if (r1 == (-1)) goto L8;
        m2513a(r4.substring(r02, r1));
        r02 = r1 + 1;
        goto L6
    L8:
        m2513a(r4.substring(r02));
    }

    public void setReferencedIds(int[] r3) {
        this.f3874e = null;
        int r02 = 0;
        this.f3871b = 0;
    L4:
        if (r02 >= r3.length) goto L6;
        m2514b(r3[r02]);
        r02 = r02 + 1;
        goto L4
    }
}
