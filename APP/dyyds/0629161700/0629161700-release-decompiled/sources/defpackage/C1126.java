package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1126 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f5013;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f5014;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5015;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f5016;

    public C1126(int r2, defpackage.C1063 r3) {
            r1 = this;
            r0 = 5
            r1.f5015 = r0
            r1.<init>()
            r1.f5016 = r2
            r1.f5014 = r3
            return
    }

    public C1126(int r2, defpackage.C1063 r3, defpackage.C1126 r4) {
            r1 = this;
            r0 = 2
            r1.f5015 = r0
            r1.<init>()
            r1.f5016 = r2
            r1.f5014 = r3
            r1.f5013 = r4
            return
    }

    public C1126(android.widget.ImageView r2) {
            r1 = this;
            r0 = 0
            r1.f5015 = r0
            r1.<init>()
            r1.f5016 = r0
            r1.f5014 = r2
            return
    }

    public C1126(java.lang.Integer r2, java.lang.Integer r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f5015 = r0
            r1.<init>()
            r1.f5014 = r2
            r1.f5013 = r3
            r1.f5016 = r4
            return
    }

    public C1126(defpackage.EnumC1832 r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 4
            r1.f5015 = r0
            r1.<init>()
            r1.f5014 = r2
            r1.f5016 = r3
            r1.f5013 = r4
            return
    }

    public C1126(defpackage.C2243 r3) {
            r2 = this;
            r0 = 3
            r2.f5015 = r0
            r2.<init>()
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r1 = 20
            r0.<init>(r1, r2)
            r1 = 150(0x96, float:2.1E-43)
            ᛷᛸᛱᛸ r0 = defpackage.AbstractC2346.m3841(r1, r0)
            r2.f5013 = r0
            r2.f5014 = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f5015
            java.lang.Object r1 = r3.f5014
            switch(r0) {
                case 1: goto L3b;
                case 4: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.String r3 = super.toString()
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᲁᛳᛶᛵ r1 = (defpackage.EnumC1832) r1
            ᲁᛳᛶᛵ r2 = defpackage.EnumC1832.f7982
            if (r1 != r2) goto L1d
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L22
        L1d:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L22:
            r1 = 32
            r0.append(r1)
            int r2 = r3.f5016
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.f5013
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r2 = ""
            if (r1 != 0) goto L4a
            r1 = r2
            goto L4e
        L4a:
            java.lang.String r1 = r1.toString()
        L4e:
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.Object r3 = r3.f5013
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L5d
            goto L61
        L5d:
            java.lang.String r2 = r3.toString()
        L61:
            r0.append(r2)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m2154() {
            r3 = this;
            java.lang.Object r0 = r3.f5014
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto Ld
            defpackage.AbstractC1660.m3052(r1)
        Ld:
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r3.f5013
            ᛲᛸᲀᲁ r3 = (defpackage.C0340) r3
            if (r3 == 0) goto L1e
            int[] r0 = r0.getDrawableState()
            android.graphics.PorterDuff$Mode r2 = defpackage.C0844.f3869
            defpackage.C2070.m3477(r1, r3, r0)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m2155(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r8 = r8.f5014
            r0 = r8
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = defpackage.AbstractC1070.f4802
            ᛷᛸᛱᛸ r8 = defpackage.C1326.m2454(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f5856
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r8.f5856
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            r6 = 0
            r3 = r9
            r5 = r10
            defpackage.AbstractC0756.m1676(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r9 = r0.getDrawable()     // Catch: java.lang.Throwable -> L41
            r10 = -1
            if (r9 != 0) goto L44
            r1 = 1
            int r1 = r7.getResourceId(r1, r10)     // Catch: java.lang.Throwable -> L41
            if (r1 == r10) goto L44
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC1592.m2873(r9, r1)     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L44
            r0.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            r9 = r0
            goto L6e
        L44:
            if (r9 == 0) goto L49
            defpackage.AbstractC1660.m3052(r9)     // Catch: java.lang.Throwable -> L41
        L49:
            r9 = 2
            boolean r1 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L57
            android.content.res.ColorStateList r9 = r8.m2480(r9)     // Catch: java.lang.Throwable -> L41
            r0.setImageTintList(r9)     // Catch: java.lang.Throwable -> L41
        L57:
            r9 = 3
            boolean r1 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L6a
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L41
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.AbstractC1660.m3053(r9, r10)     // Catch: java.lang.Throwable -> L41
            r0.setImageTintMode(r9)     // Catch: java.lang.Throwable -> L41
        L6a:
            r8.m2469()
            return
        L6e:
            r8.m2469()
            throw r9
    }
}
