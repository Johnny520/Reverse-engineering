package p000;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0711q4 {

    /* JADX INFO: renamed from: α */
    public java.lang.Object f8850;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f8851;

    /* JADX INFO: renamed from: γ */
    public boolean f8852;

    /* JADX INFO: renamed from: δ */
    public boolean f8853;

    /* JADX INFO: renamed from: ε */
    public boolean f8854;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f8855;

    public C0711q4(p000.ak1 r1, java.lang.Object r2, boolean r3, p000.xn0 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f8855 = r1
            r0.f8852 = r3
            r0.f8850 = r4
            r0.f8853 = r5
            r0.f8851 = r2
            r1 = 1
            r0.f8854 = r1
            return
    }

    public /* synthetic */ C0711q4(android.widget.TextView r2) {
            r1 = this;
            r0 = 0
            r1.f8850 = r0
            r1.f8851 = r0
            r0 = 0
            r1.f8852 = r0
            r1.f8853 = r0
            r1.f8855 = r2
            r1.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public void m4761() {
            r3 = this;
            java.lang.Object r0 = r3.f8855
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.graphics.drawable.Drawable r1 = r0.getButtonDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.f8852
            if (r2 != 0) goto L12
            boolean r2 = r3.f8853
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.f8852
            if (r2 == 0) goto L21
            java.lang.Object r2 = r3.f8850
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.f8853
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.f8851
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

    /* JADX INFO: renamed from: β */
    public void m4762() {
            r3 = this;
            java.lang.Object r0 = r3.f8855
            androidx.appcompat.widget.AppCompatCheckedTextView r0 = (androidx.appcompat.widget.AppCompatCheckedTextView) r0
            android.graphics.drawable.Drawable r1 = r0.getCheckMarkDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.f8852
            if (r2 != 0) goto L12
            boolean r2 = r3.f8853
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.f8852
            if (r2 == 0) goto L21
            java.lang.Object r2 = r3.f8850
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.f8853
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.f8851
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

    /* JADX INFO: renamed from: γ */
    public java.lang.Object m4763() {
            r1 = this;
            boolean r0 = r1.f8852
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Object r1 = r1.f8851
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "Unexpected form of a provided value"
            p000.AbstractC0804sn.m5527(r1)
            pm r1 = new pm
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: δ */
    public void m4764(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r8 = r8.f8855
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = p000.kk1.f5980
            m6 r8 = p000.C0538m6.m3752(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f6967
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r8.f6967
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = p000.b92.f1572
            r6 = 0
            r3 = r9
            r5 = r10
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r10 == 0) goto L42
            int r9 = r7.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L42
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            android.graphics.drawable.Drawable r9 = p000.ln0.m3603(r10, r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
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
            android.graphics.drawable.Drawable r9 = p000.ln0.m3603(r10, r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f
        L59:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L67
            android.content.res.ColorStateList r9 = r8.m3790(r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3f
        L67:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L7b
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = p000.AbstractC0300fw.m2207(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3f
        L7b:
            r8.m3765()
            return
        L7f:
            r8.m3765()
            throw r9
    }
}
