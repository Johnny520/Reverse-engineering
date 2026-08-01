package defpackage;

/* JADX INFO: renamed from: ᛶᛲᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1020 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f4548;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f4549;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f4550;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.os.Parcelable f4551;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f4552;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f4553;

    public C1020() {
            r1 = this;
            r1.<init>()
            ᛸᛱᛴᲀ r0 = new ᛸᛱᛴᲀ
            r0.<init>()
            r1.f4553 = r0
            r0 = 1
            r1.f4548 = r0
            return
    }

    public /* synthetic */ C1020(android.widget.TextView r2) {
            r1 = this;
            r0 = 0
            r1.f4551 = r0
            r1.f4552 = r0
            r0 = 0
            r1.f4550 = r0
            r1.f4549 = r0
            r1.f4553 = r2
            r1.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m1969(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r8 = r8.f4553
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = defpackage.AbstractC1070.f4788
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
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r10 == 0) goto L42
            int r9 = r7.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L42
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC1592.m2873(r10, r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            goto L59
        L3f:
            r0 = move-exception
            r9 = r0
            goto L7f
        L42:
            boolean r9 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            int r9 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC1592.m2873(r10, r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f
        L59:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L67
            android.content.res.ColorStateList r9 = r8.m2480(r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3f
        L67:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L7b
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.AbstractC1660.m3053(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3f
        L7b:
            r8.m2469()
            return
        L7f:
            r8.m2469()
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.os.Bundle m1970(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f4549
            r1 = 0
            if (r0 == 0) goto L29
            android.os.Parcelable r0 = r3.f4551
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L28
            android.os.Bundle r0 = r0.getBundle(r4)
            android.os.Parcelable r2 = r3.f4551
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L18
            r2.remove(r4)
        L18:
            android.os.Parcelable r4 = r3.f4551
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 == 0) goto L25
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L25
            return r0
        L25:
            r3.f4551 = r1
            return r0
        L28:
            return r1
        L29:
            java.lang.String r3 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            defpackage.C2264.m3676(r3)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m1971() {
            r3 = this;
            java.lang.Object r0 = r3.f4553
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.graphics.drawable.Drawable r1 = r0.getButtonDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.f4550
            if (r2 != 0) goto L12
            boolean r2 = r3.f4549
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.f4550
            if (r2 == 0) goto L21
            android.os.Parcelable r2 = r3.f4551
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.f4549
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.f4552
            android.graphics.PorterDuff$Mode r3 = (android.graphics.PorterDuff.Mode) r3
            r1.setTintMode(r3)
        L2c:
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L39
            int[] r3 = r0.getDrawableState()
            r1.setState(r3)
        L39:
            r0.setButtonDrawable(r1)
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m1972() {
            r3 = this;
            java.lang.Object r0 = r3.f4553
            ᲇᛴᛴᲀ r0 = (defpackage.C2034) r0
            android.graphics.drawable.Drawable r1 = r0.getCheckMarkDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.f4550
            if (r2 != 0) goto L12
            boolean r2 = r3.f4549
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.f4550
            if (r2 == 0) goto L21
            android.os.Parcelable r2 = r3.f4551
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.f4549
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.f4552
            android.graphics.PorterDuff$Mode r3 = (android.graphics.PorterDuff.Mode) r3
            r1.setTintMode(r3)
        L2c:
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L39
            int[] r3 = r0.getDrawableState()
            r1.setState(r3)
        L39:
            r0.setCheckMarkDrawable(r1)
        L3c:
            return
    }
}
