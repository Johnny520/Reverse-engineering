package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec extends View {
    public int[] a;
    public int b;
    public Context c;
    public oo d;
    public String e;
    public HashMap f;

    public final void a(String r6) {
        Context r0 = this.c;
        if (r6 != null) goto L5;
        return;
    L5:
        if (r6.length() == 0) goto L46;
        if (r0 == null) goto L47;
        String r62 = r6.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L13;
        ConstraintLayout r1 = (ConstraintLayout) getParent();
    L13:
        if ((getParent() instanceof ConstraintLayout) == false) goto L15;
        ConstraintLayout r12 = (ConstraintLayout) getParent();
    L17:
        if (isInEditMode() == false) goto L29;
        if (r12 == null) goto L29;
        if (r62 == null) goto L25;
        HashMap r3 = r12.m;
        if (r3 == null) goto L25;
        if (r3.containsKey(r62) == false) goto L25;
        Object r32 = r12.m.get(r62);
    L27:
        if ((r32 instanceof Integer) == false) goto L29;
        int r33 = ((Integer) r32).intValue();
    L30:
        if (r33 != 0) goto L33;
        if (r12 == null) goto L33;
        r33 = d(r12, r62);
    L33:
        if (r33 == 0) goto L42;
    L35:
        if (r33 != 0) goto L37;
        r33 = r0.getResources().getIdentifier(r62, "id", r0.getPackageName());
    L37:
        if (r33 == 0) goto L39;
        this.f.put(Integer.valueOf(r33), r62);
        b(r33);
        return;
    L39:
        Log.w("ConstraintHelper", "Could not find id of \"" + r62 + "\"");
        return;
    L42:
        r33 = qy.class.getField(r62).getInt(null);     // Catch: Exception -> L41
    L25:
        r32 = null;
    L29:
        r33 = 0;
        goto L30
    L15:
        r12 = null;
        goto L17
    L47:
        return;
    }

    public final void b(int r4) {
        if (r4 != getId()) goto L5;
        return;
    L5:
        int r0 = this.b + 1;
        int[] r1 = this.a;
        if (r0 <= r1.length) goto L8;
        this.a = Arrays.copyOf(r1, r1.length * 2);
    L8:
        int[] r02 = this.a;
        int r12 = this.b;
        r02[r12] = r4;
        this.b = r12 + 1;
    }

    public final void c() {
        ViewParent r0 = getParent();
        if (r0 != null) goto L5;
        return;
    L5:
        if ((r0 instanceof ConstraintLayout) == false) goto L20;
        ConstraintLayout r02 = (ConstraintLayout) r0;
        int r1 = getVisibility();
        float r2 = getElevation();
        int r3 = 0;
    L8:
        if (r3 >= this.b) goto L21;
        int r4 = this.a[r3];
        View r42 = (View) r02.a.get(r4);
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

    public final int d(ConstraintLayout r8, String r9) {
        if (r9 == null) goto L19;
        Resources r1 = this.c.getResources();
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

    public void e(AttributeSet r5) {
        if (r5 == null) goto L9;
        TypedArray r52 = getContext().obtainStyledAttributes(r5, ry.b);
        int r0 = r52.getIndexCount();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L13;
        int r2 = r52.getIndex(r1);
        if (r2 != 19) goto L8;
        String r22 = r52.getString(r2);
        this.e = r22;
        setIds(r22);
    L8:
        r1 = r1 + 1;
        goto L4
    L13:
        return;
    }

    public abstract void f(pc r1, boolean r2);

    public final void g() {
        if (this.d == null) goto L10;
        ViewGroup.LayoutParams r0 = getLayoutParams();
        if ((r0 instanceof gc) == false) goto L9;
        oo r1 = this.d;
        ((gc) r0).k0 = r1;
        return;
    L9:
        return;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String r0 = this.e;
        if (r0 == null) goto L6;
        setIds(r0);
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String r4) {
        this.e = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        this.b = 0;
    L6:
        int r1 = r4.indexOf(44, r0);
        if (r1 == (-1)) goto L8;
        a(r4.substring(r0, r1));
        r0 = r1 + 1;
        goto L6
    L8:
        a(r4.substring(r0));
    }

    public void setReferencedIds(int[] r3) {
        this.e = null;
        int r0 = 0;
        this.b = 0;
    L4:
        if (r0 >= r3.length) goto L6;
        b(r3[r0]);
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.View
    public final void onDraw(Canvas r1) {
    }
}
