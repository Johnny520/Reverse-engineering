package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.C0983R;
import p000a.AbstractC0792r;
import p000a.C0400W2;
import p000a.C0509c1;
import p000a.C0866ug;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0509c1 implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f5798g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f5799d;

    /* JADX INFO: renamed from: e */
    public boolean f5800e;

    /* JADX INFO: renamed from: f */
    public boolean f5801f;

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C1298a extends AbstractC0792r {
        public static final Parcelable.Creator<C1298a> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public boolean f5802c;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C1298a> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1298a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1298a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1298a[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1298a(parcel, null);
            }
        }

        public C1298a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5802c = parcel.readInt() == 1;
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5802c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0983R.attr.imageButtonStyle);
        this.f5800e = true;
        this.f5801f = true;
        C0866ug.m2003j(this, new C0400W2(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5799d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f5799d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f5798g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1298a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1298a c1298a = (C1298a) parcelable;
        super.onRestoreInstanceState(c1298a.f3119a);
        setChecked(c1298a.f5802c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1298a c1298a = new C1298a(super.onSaveInstanceState());
        c1298a.f5802c = this.f5799d;
        return c1298a;
    }

    public void setCheckable(boolean z) {
        if (this.f5800e != z) {
            this.f5800e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f5800e || this.f5799d == z) {
            return;
        }
        this.f5799d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f5801f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f5801f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5799d);
    }
}
