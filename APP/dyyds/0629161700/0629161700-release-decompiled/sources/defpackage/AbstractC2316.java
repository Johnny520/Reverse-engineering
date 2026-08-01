package defpackage;

/* JADX INFO: renamed from: ᲈᛸᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2316 {

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static final java.util.List f9780 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.AbstractC2316 f9781;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.util.ArrayList f9782;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public java.util.List f9783;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.AbstractC2316 f9784;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f9785;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public defpackage.AbstractC1191 f9786;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f9787;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f9788;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9789;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9790;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.View f9791;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f9792;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.C1633 f9793;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public int f9794;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.C0055 f9795;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f9796;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9797;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f9798;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9799;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            defpackage.AbstractC2316.f9780 = r0
            return
    }

    public AbstractC2316(android.view.View r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f9790 = r0
            r3.f9789 = r0
            r1 = -1
            r3.f9787 = r1
            r3.f9797 = r0
            r3.f9799 = r0
            r1 = 0
            r3.f9781 = r1
            r3.f9784 = r1
            r3.f9782 = r1
            r3.f9783 = r1
            r2 = 0
            r3.f9788 = r2
            r3.f9793 = r1
            r3.f9785 = r2
            r3.f9798 = r2
            r3.f9794 = r0
            if (r4 == 0) goto L29
            r3.f9791 = r4
            return
        L29:
            java.lang.String r3 = "itemView may not be null"
            defpackage.C2264.m3684(r3)
            throw r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isAnonymousClass()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "ViewHolder"
            goto L15
        Ld:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "{"
            r2.append(r0)
            int r0 = r5.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = " position="
            r2.append(r0)
            int r0 = r5.f9790
            r2.append(r0)
            java.lang.String r0 = " id="
            r2.append(r0)
            long r3 = r5.f9787
            r2.append(r3)
            java.lang.String r0 = ", oldPos="
            r2.append(r0)
            int r0 = r5.f9789
            r2.append(r0)
            java.lang.String r0 = ", pLpos:"
            r2.append(r0)
            int r0 = r5.f9799
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            boolean r0 = r5.m3776()
            if (r0 == 0) goto L72
            java.lang.String r0 = " scrap "
            r1.append(r0)
            boolean r0 = r5.f9785
            if (r0 == 0) goto L6d
            java.lang.String r0 = "[changeScrap]"
            goto L6f
        L6d:
            java.lang.String r0 = "[attachedScrap]"
        L6f:
            r1.append(r0)
        L72:
            boolean r0 = r5.m3775()
            if (r0 == 0) goto L7d
            java.lang.String r0 = " invalid"
            r1.append(r0)
        L7d:
            boolean r0 = r5.m3792()
            if (r0 != 0) goto L88
            java.lang.String r0 = " unbound"
            r1.append(r0)
        L88:
            int r0 = r5.f9792
            r0 = r0 & 2
            if (r0 == 0) goto L93
            java.lang.String r0 = " update"
            r1.append(r0)
        L93:
            boolean r0 = r5.m3785()
            if (r0 == 0) goto L9e
            java.lang.String r0 = " removed"
            r1.append(r0)
        L9e:
            boolean r0 = r5.m3787()
            if (r0 == 0) goto La9
            java.lang.String r0 = " ignored"
            r1.append(r0)
        La9:
            boolean r0 = r5.m3777()
            if (r0 == 0) goto Lb4
            java.lang.String r0 = " tmpDetached"
            r1.append(r0)
        Lb4:
            boolean r0 = r5.m3778()
            if (r0 != 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " not recyclable("
            r0.<init>(r2)
            int r2 = r5.f9788
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
        Ld2:
            int r0 = r5.f9792
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto Lde
            boolean r0 = r5.m3775()
            if (r0 == 0) goto Le3
        Lde:
            java.lang.String r0 = " undefined adapter position"
            r1.append(r0)
        Le3:
            android.view.View r5 = r5.f9791
            android.view.ViewParent r5 = r5.getParent()
            if (r5 != 0) goto Lf0
            java.lang.String r5 = " no parent"
            r1.append(r5)
        Lf0:
            java.lang.String r5 = "}"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean m3775() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m3776() {
            r0 = this;
            ᲀᛲᲁᛳ r0 = r0.f9793
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean m3777() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean m3778() {
            r1 = this;
            int r0 = r1.f9792
            r0 = r0 & 16
            if (r0 != 0) goto L12
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            android.view.View r1 = r1.f9791
            boolean r1 = r1.hasTransientState()
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m3779() {
            r4 = this;
            boolean r0 = defpackage.C0055.f603
            if (r0 == 0) goto L24
            boolean r0 = r4.m3777()
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to reset temp-detached ViewHolder: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ". ViewHolders should be fully detached before resetting."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L24:
            r0 = 0
            r4.f9792 = r0
            r1 = -1
            r4.f9790 = r1
            r4.f9789 = r1
            r2 = -1
            r4.f9787 = r2
            r4.f9799 = r1
            r4.f9788 = r0
            r2 = 0
            r4.f9781 = r2
            r4.f9784 = r2
            java.util.ArrayList r2 = r4.f9782
            if (r2 == 0) goto L40
            r2.clear()
        L40:
            int r2 = r4.f9792
            r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
            r4.f9792 = r2
            r4.f9798 = r0
            r4.f9794 = r1
            defpackage.C0055.m406(r4)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.List m3780() {
            r1 = this;
            int r0 = r1.f9792
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = r1.f9782
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 != 0) goto L11
            goto L14
        L11:
            java.util.List r1 = r1.f9783
            return r1
        L14:
            java.util.List r1 = defpackage.AbstractC2316.f9780
            return r1
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final boolean m3781() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m3782() {
            r2 = this;
            int r0 = r2.f9799
            r1 = -1
            if (r0 != r1) goto L8
            int r2 = r2.f9790
            return r2
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m3783() {
            r3 = this;
            ᛶᲈᲀᲇ r0 = r3.f9786
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            ᛱᛳᛶᛱ r0 = r3.f9795
            if (r0 != 0) goto Lb
            return r1
        Lb:
            ᛶᲈᲀᲇ r0 = r0.getAdapter()
            if (r0 != 0) goto L12
            return r1
        L12:
            ᛱᛳᛶᛱ r2 = r3.f9795
            int r2 = r2.m422(r3)
            if (r2 != r1) goto L1b
            return r1
        L1b:
            ᛶᲈᲀᲇ r1 = r3.f9786
            int r3 = r0.findRelativeAdapterPositionIn(r1, r3, r2)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3784(int r2) {
            r1 = this;
            int r0 = r1.f9792
            r2 = r2 | r0
            r1.f9792 = r2
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final boolean m3785() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final void m3786(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.f9789
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r2.f9790
            r2.f9789 = r0
        L9:
            int r0 = r2.f9799
            if (r0 != r1) goto L11
            int r0 = r2.f9790
            r2.f9799 = r0
        L11:
            if (r4 == 0) goto L16
            int r0 = r0 + r3
            r2.f9799 = r0
        L16:
            int r4 = r2.f9790
            int r4 = r4 + r3
            r2.f9790 = r4
            android.view.View r2 = r2.f9791
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            if (r3 == 0) goto L2c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            r3 = 1
            r2.f3862 = r3
        L2c:
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m3787() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final boolean m3788() {
            r0 = this;
            int r0 = r0.f9792
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m3789() {
            r1 = this;
            ᛱᛳᛶᛱ r0 = r1.f9795
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int r1 = r0.m422(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean m3790() {
            r2 = this;
            android.view.View r0 = r2.f9791
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L12
            android.view.ViewParent r0 = r0.getParent()
            ᛱᛳᛶᛱ r2 = r2.f9795
            if (r0 == r2) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m3791(boolean r3) {
            r2 = this;
            int r0 = r2.f9788
            r1 = 1
            if (r3 == 0) goto L7
            int r0 = r0 - r1
            goto L8
        L7:
            int r0 = r0 + r1
        L8:
            r2.f9788 = r0
            if (r0 >= 0) goto L39
            r0 = 0
            r2.f9788 = r0
            boolean r0 = defpackage.C0055.f603
            java.lang.String r1 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
            if (r0 != 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "View"
            android.util.Log.e(r1, r0)
            goto L4e
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L39:
            if (r3 != 0) goto L44
            if (r0 != r1) goto L44
            int r0 = r2.f9792
            r0 = r0 | 16
            r2.f9792 = r0
            goto L4e
        L44:
            if (r3 == 0) goto L4e
            if (r0 != 0) goto L4e
            int r0 = r2.f9792
            r0 = r0 & (-17)
            r2.f9792 = r0
        L4e:
            boolean r0 = defpackage.C0055.f605
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setIsRecyclable val:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L6d:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m3792() {
            r1 = this;
            int r1 = r1.f9792
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }
}
