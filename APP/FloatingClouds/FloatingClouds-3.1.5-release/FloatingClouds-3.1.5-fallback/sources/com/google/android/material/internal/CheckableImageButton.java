package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends a.C0077c1 implements android.widget.Checkable {
    public static final int[] g = null;
    public boolean d;
    public boolean e;
    public boolean f;

    public static class a extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.internal.CheckableImageButton.a> CREATOR = null;
        public boolean c;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a$a, reason: collision with other inner class name */
        public class C0033a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.internal.CheckableImageButton.a> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.internal.CheckableImageButton$a r0 = new com.google.android.material.internal.CheckableImageButton$a
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.internal.CheckableImageButton.a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.internal.CheckableImageButton$a r0 = new com.google.android.material.internal.CheckableImageButton$a
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.internal.CheckableImageButton$a[] r1 = new com.google.android.material.internal.CheckableImageButton.a[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.internal.CheckableImageButton$a$a r0 = new com.google.android.material.internal.CheckableImageButton$a$a
                r0.<init>()
                com.google.android.material.internal.CheckableImageButton.a.CREATOR = r0
                return
        }

        public a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto Lb
                goto Lc
            Lb:
                r2 = 0
            Lc:
                r0.c = r2
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.c
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.internal.CheckableImageButton.g = r0
            return
    }

    public CheckableImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.imageButtonStyle
            r1.<init>(r2, r3, r0)
            r2 = 1
            r1.e = r2
            r1.f = r2
            a.W2 r2 = new a.W2
            r2.<init>(r1)
            a.C0414ug.j(r1, r2)
            return
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L11
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            int[] r0 = com.google.android.material.internal.CheckableImageButton.g
            int[] r2 = android.view.View.mergeDrawableStates(r2, r0)
            return r2
        L11:
            int[] r2 = super.onCreateDrawableState(r2)
            return r2
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.internal.CheckableImageButton.a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.internal.CheckableImageButton$a r2 = (com.google.android.material.internal.CheckableImageButton.a) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.c
            r1.setChecked(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.internal.CheckableImageButton$a r1 = new com.google.android.material.internal.CheckableImageButton$a
            r1.<init>(r0)
            boolean r0 = r2.d
            r1.c = r0
            return r1
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == r2) goto La
            r1.e = r2
            r2 = 0
            r1.sendAccessibilityEvent(r2)
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto L12
            boolean r0 = r1.d
            if (r0 == r2) goto L12
            r1.d = r2
            r1.refreshDrawableState()
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        L12:
            return
    }

    public void setPressable(boolean r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L7
            super.setPressed(r2)
        L7:
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.d
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
