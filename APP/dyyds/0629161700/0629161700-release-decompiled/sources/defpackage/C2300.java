package defpackage;

/* JADX INFO: renamed from: ᲈᛸᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2300 f9726 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0377 f9727;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            ᲈᛸᛱᲀ r0 = defpackage.C0035.f534
            defpackage.C2300.f9726 = r0
            return
        Lb:
            ᲈᛸᛱᲀ r0 = defpackage.C2214.f9461
            defpackage.C2300.f9726 = r0
            return
    }

    public C2300() {
            r1 = this;
            r1.<init>()
            ᛲᲇᲀᲈ r0 = new ᛲᲇᲀᲈ
            r0.<init>(r1)
            r1.f9727 = r0
            return
    }

    public C2300(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L11
            ᛷᛸ r0 = new ᛷᛸ
            r0.<init>(r2, r3)
            r2.f9727 = r0
            return
        L11:
            r1 = 34
            if (r0 < r1) goto L1d
            ᛱᛲᛶ r0 = new ᛱᛲᛶ
            r0.<init>(r2, r3)
            r2.f9727 = r0
            return
        L1d:
            r1 = 31
            if (r0 < r1) goto L29
            ᛴᛳᛳᛵ r0 = new ᛴᛳᛳᛵ
            r0.<init>(r2, r3)
            r2.f9727 = r0
            return
        L29:
            ᲈᛳᲁᛱ r0 = new ᲈᛳᲁᛱ
            r0.<init>(r2, r3)
            r2.f9727 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C2300 m3730(android.view.View r2, android.view.WindowInsets r3) {
            ᲈᛸᛱᲀ r0 = new ᲈᛸᛱᲀ
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L2f
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L2f
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            ᲈᛸᛱᲀ r3 = defpackage.AbstractC0054.m397(r2)
            ᛲᲇᲀᲈ r1 = r0.f9727
            r1.mo1120(r3)
            android.view.View r3 = r2.getRootView()
            r1.mo1123(r3)
            r1.mo358(r3)
            r1.mo1115()
            int r2 = r2.getWindowSystemUiVisibility()
            r1.mo1118(r2)
        L2f:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.C2300
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ᲈᛸᛱᲀ r2 = (defpackage.C2300) r2
            ᛲᲇᲀᲈ r1 = r1.f9727
            ᛲᲇᲀᲈ r2 = r2.f9727
            boolean r1 = java.util.Objects.equals(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᛲᲇᲀᲈ r0 = r0.f9727
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.WindowInsets m3731() {
            r1 = this;
            ᛲᲇᲀᲈ r1 = r1.f9727
            boolean r0 = r1 instanceof defpackage.AbstractC2148
            if (r0 == 0) goto Lb
            ᲇᲇᛷᲁ r1 = (defpackage.AbstractC2148) r1
            android.view.WindowInsets r1 = r1.f9129
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
