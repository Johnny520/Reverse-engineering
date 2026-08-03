package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000.AbstractC0982Wu;
import p000.InterfaceC0402JE;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    public int f3849a;

    /* JADX INFO: renamed from: b */
    public int f3850b;

    /* JADX INFO: renamed from: c */
    public WeakReference f3851c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f3852d;

    public ViewStubCompat(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.f3849a = 0;
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0982Wu.f3065A, 0, 0);
        this.f3850b = r42.getResourceId(2, -1);
        this.f3849a = r42.getResourceId(1, 0);
        setId(r42.getResourceId(0, -1));
        r42.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public final View m2119a() {
        ViewParent r0 = getParent();
        if ((r0 instanceof ViewGroup) == false) goto L22;
        if (this.f3849a == 0) goto L20;
        ViewGroup r02 = (ViewGroup) r0;
        LayoutInflater r1 = this.f3852d;
        if (r1 != null) goto L10;
        r1 = LayoutInflater.from(getContext());
    L10:
        View r12 = r1.inflate(this.f3849a, r02, false);
        int r2 = this.f3850b;
        if (r2 == (-1)) goto L13;
        r12.setId(r2);
    L13:
        int r22 = r02.indexOfChild(this);
        r02.removeViewInLayout(this);
        ViewGroup.LayoutParams r3 = getLayoutParams();
        if (r3 == null) goto L16;
        r02.addView(r12, r22, r3);
    L17:
        this.f3851c = new WeakReference(r12);
        return r12;
    L16:
        r02.addView(r12, r22);
        goto L17
    L20:
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    L22:
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas r1) {
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    public int getInflatedId() {
        return this.f3850b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3852d;
    }

    public int getLayoutResource() {
        return this.f3849a;
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r1) {
        this.f3850b = r1;
    }

    public void setLayoutInflater(LayoutInflater r1) {
        this.f3852d = r1;
    }

    public void setLayoutResource(int r1) {
        this.f3849a = r1;
    }

    public void setOnInflateListener(InterfaceC0402JE r1) {
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        WeakReference r0 = this.f3851c;
        if (r0 == null) goto L10;
        View r02 = (View) r0.get();
        if (r02 == null) goto L9;
        r02.setVisibility(r2);
        return;
    L9:
        throw new IllegalStateException("setVisibility called on un-referenced view");
    L10:
        super.setVisibility(r2);
        if (r2 != 0) goto L13;
    L16:
        m2119a();
        return;
    L13:
        if (r2 == 4) goto L16;
    }
}
