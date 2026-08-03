package androidx.appcompat.widget;

import Yue.C6898;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f26322;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f26323;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public WeakReference<View> f26324;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public LayoutInflater f26325;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public InterfaceC1627 f26326;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ViewStubCompat$ۥ */
    public interface InterfaceC1627 {
        /* JADX INFO: renamed from: ۥ */
        void m4688(ViewStubCompat viewStubCompat, View view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewStubCompat(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@InterfaceC6391 Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f26323;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f26325;
    }

    public int getLayoutResource() {
        return this.f26322;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f26323 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f26325 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f26322 = i;
    }

    public void setOnInflateListener(InterfaceC1627 interfaceC1627) {
        this.f26326 = interfaceC1627;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f26324;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m4687();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public View m4687() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f26322 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f26325;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f26322, viewGroup, false);
        int i = this.f26323;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f26324 = new WeakReference<>(viewInflate);
        InterfaceC1627 interfaceC1627 = this.f26326;
        if (interfaceC1627 != null) {
            interfaceC1627.m4688(this, viewInflate);
        }
        return viewInflate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ViewStubCompat(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26322 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19787, i, 0);
        this.f26323 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19790, -1);
        this.f26322 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19789, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19788, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
