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
import p048b.AbstractC0550a;
import p057g.InterfaceC0879P0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    public int f1253a;

    /* JADX INFO: renamed from: b */
    public int f1254b;

    /* JADX INFO: renamed from: c */
    public WeakReference f1255c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f1256d;

    public ViewStubCompat(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.f1253a = 0;
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0550a.f1637v, 0, 0);
        this.f1254b = r42.getResourceId(2, -1);
        this.f1253a = r42.getResourceId(1, 0);
        setId(r42.getResourceId(0, -1));
        r42.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas r1) {
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    public int getInflatedId() {
        return this.f1254b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1256d;
    }

    public int getLayoutResource() {
        return this.f1253a;
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r1) {
        this.f1254b = r1;
    }

    public void setLayoutInflater(LayoutInflater r1) {
        this.f1256d = r1;
    }

    public void setLayoutResource(int r1) {
        this.f1253a = r1;
    }

    public void setOnInflateListener(InterfaceC0879P0 r1) {
    }

    @Override // android.view.View
    public void setVisibility(int r4) {
        WeakReference r02 = this.f1255c;
        if (r02 == null) goto L9;
        View r03 = (View) r02.get();
        if (r03 == null) goto L8;
        r03.setVisibility(r4);
        return;
    L8:
        throw new IllegalStateException("setVisibility called on un-referenced view");
    L9:
        super.setVisibility(r4);
        if (r4 != 0) goto L12;
    L13:
        ViewParent r42 = getParent();
        if ((r42 instanceof ViewGroup) == false) goto L33;
        if (this.f1253a == 0) goto L31;
        ViewGroup r43 = (ViewGroup) r42;
        LayoutInflater r04 = this.f1256d;
        if (r04 != null) goto L21;
        r04 = LayoutInflater.from(getContext());
    L21:
        View r05 = r04.inflate(this.f1253a, r43, false);
        int r1 = this.f1254b;
        if (r1 == (-1)) goto L24;
        r05.setId(r1);
    L24:
        int r12 = r43.indexOfChild(this);
        r43.removeViewInLayout(this);
        ViewGroup.LayoutParams r2 = getLayoutParams();
        if (r2 == null) goto L27;
        r43.addView(r05, r12, r2);
    L28:
        this.f1255c = new WeakReference(r05);
        return;
    L27:
        r43.addView(r05, r12);
        goto L28
    L31:
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    L33:
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    L12:
        if (r4 == 4) goto L13;
    }
}
