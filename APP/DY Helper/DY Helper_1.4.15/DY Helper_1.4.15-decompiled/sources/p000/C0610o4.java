package p000;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0610o4 {

    /* JADX INFO: renamed from: α */
    public int f7939;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f7940;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f7941;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f7942;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f7943;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f7944;

    public C0610o4() {
            r2 = this;
            r2.<init>()
            r0 = 32
            te0[] r1 = new p000.te0[r0]
            r2.f7940 = r1
            float[] r1 = new float[r0]
            r2.f7941 = r1
            byte[] r0 = new byte[r0]
            r2.f7942 = r0
            int r0 = p000.uq1.f10933
            c21 r0 = new c21
            r0.<init>()
            r2.f7943 = r0
            c21 r0 = new c21
            r0.<init>()
            r2.f7944 = r0
            return
    }

    public C0610o4(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f7939 = r0
            r1.f7940 = r2
            j5 r2 = p000.C0419j5.m2862()
            r1.f7941 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public void m4194() {
            r5 = this;
            java.lang.Object r0 = r5.f7940
            android.view.View r0 = (android.view.View) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L6d
            java.lang.Object r2 = r5.f7942
            oo r2 = (p000.C0630oo) r2
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.f7944
            oo r2 = (p000.C0630oo) r2
            if (r2 != 0) goto L1d
            oo r2 = new oo
            r2.<init>()
            r5.f7944 = r2
        L1d:
            java.lang.Object r2 = r5.f7944
            oo r2 = (p000.C0630oo) r2
            r3 = 0
            r2.f8165 = r3
            r4 = 0
            r2.f8164 = r4
            r2.f8166 = r3
            r2.f8163 = r4
            java.util.WeakHashMap r3 = p000.b92.f1572
            android.content.res.ColorStateList r3 = p000.u82.m5821(r0)
            r4 = 1
            if (r3 == 0) goto L38
            r2.f8164 = r4
            r2.f8165 = r3
        L38:
            android.graphics.PorterDuff$Mode r3 = p000.u82.m5822(r0)
            if (r3 == 0) goto L42
            r2.f8163 = r4
            r2.f8166 = r3
        L42:
            boolean r3 = r2.f8164
            if (r3 != 0) goto L4a
            boolean r3 = r2.f8163
            if (r3 == 0) goto L52
        L4a:
            int[] r5 = r0.getDrawableState()
            p000.C0419j5.m2864(r1, r2, r5)
            return
        L52:
            java.lang.Object r2 = r5.f7943
            oo r2 = (p000.C0630oo) r2
            if (r2 == 0) goto L60
            int[] r5 = r0.getDrawableState()
            p000.C0419j5.m2864(r1, r2, r5)
            return
        L60:
            java.lang.Object r5 = r5.f7942
            oo r5 = (p000.C0630oo) r5
            if (r5 == 0) goto L6d
            int[] r0 = r0.getDrawableState()
            p000.C0419j5.m2864(r1, r5, r0)
        L6d:
            return
    }

    /* JADX INFO: renamed from: β */
    public android.content.res.ColorStateList m4195() {
            r0 = this;
            java.lang.Object r0 = r0.f7943
            oo r0 = (p000.C0630oo) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.f8165
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public android.graphics.PorterDuff.Mode m4196() {
            r0 = this;
            java.lang.Object r0 = r0.f7943
            oo r0 = (p000.C0630oo) r0
            if (r0 == 0) goto Lb
            java.io.Serializable r0 = r0.f8166
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public void m4197(android.util.AttributeSet r11, int r12) {
            r10 = this;
            java.lang.Object r0 = r10.f7940
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            int[] r4 = p000.kk1.f5965
            m6 r1 = p000.C0538m6.m3752(r1, r11, r4, r12)
            java.lang.Object r2 = r1.f6967
            r9 = r2
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            java.lang.Object r2 = r10.f7940
            android.view.View r2 = (android.view.View) r2
            android.content.Context r3 = r2.getContext()
            java.lang.Object r5 = r1.f6967
            r6 = r5
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            java.util.WeakHashMap r5 = p000.b92.f1572
            r8 = 0
            r5 = r11
            r7 = r12
            p000.y82.m6840(r2, r3, r4, r5, r6, r7, r8)
            r11 = 0
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L4e
            r2 = -1
            if (r12 == 0) goto L55
            int r11 = r9.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L4e
            r10.f7939 = r11     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r11 = r10.f7941     // Catch: java.lang.Throwable -> L4e
            j5 r11 = (p000.C0419j5) r11     // Catch: java.lang.Throwable -> L4e
            android.content.Context r12 = r0.getContext()     // Catch: java.lang.Throwable -> L4e
            int r3 = r10.f7939     // Catch: java.lang.Throwable -> L4e
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L4e
            tn1 r4 = r11.f5322     // Catch: java.lang.Throwable -> L51
            android.content.res.ColorStateList r12 = r4.m5726(r12, r3)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4e
            if (r12 == 0) goto L55
            r10.m4200(r12)     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r0 = move-exception
            r10 = r0
            goto L7a
        L51:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L51
            throw r10     // Catch: java.lang.Throwable -> L4e
        L55:
            r10 = 1
            boolean r11 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto L63
            android.content.res.ColorStateList r10 = r1.m3790(r10)     // Catch: java.lang.Throwable -> L4e
            p000.u82.m5824(r0, r10)     // Catch: java.lang.Throwable -> L4e
        L63:
            r10 = 2
            boolean r11 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto L76
            int r10 = r9.getInt(r10, r2)     // Catch: java.lang.Throwable -> L4e
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = p000.AbstractC0300fw.m2207(r10, r11)     // Catch: java.lang.Throwable -> L4e
            p000.u82.m5825(r0, r10)     // Catch: java.lang.Throwable -> L4e
        L76:
            r1.m3765()
            return
        L7a:
            r1.m3765()
            throw r10
    }

    /* JADX INFO: renamed from: ε */
    public void m4198() {
            r1 = this;
            r0 = -1
            r1.f7939 = r0
            r0 = 0
            r1.m4200(r0)
            r1.m4194()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m4199(int r4) {
            r3 = this;
            r3.f7939 = r4
            java.lang.Object r0 = r3.f7941
            j5 r0 = (p000.C0419j5) r0
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r3.f7940
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            tn1 r2 = r0.f5322     // Catch: java.lang.Throwable -> L19
            android.content.res.ColorStateList r4 = r2.m5726(r1, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            goto L1d
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        L1c:
            r4 = 0
        L1d:
            r3.m4200(r4)
            r3.m4194()
            return
    }

    /* JADX INFO: renamed from: η */
    public void m4200(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L19
            java.lang.Object r0 = r1.f7942
            oo r0 = (p000.C0630oo) r0
            if (r0 != 0) goto Lf
            oo r0 = new oo
            r0.<init>()
            r1.f7942 = r0
        Lf:
            java.lang.Object r0 = r1.f7942
            oo r0 = (p000.C0630oo) r0
            r0.f8165 = r2
            r2 = 1
            r0.f8164 = r2
            goto L1c
        L19:
            r2 = 0
            r1.f7942 = r2
        L1c:
            r1.m4194()
            return
    }

    /* JADX INFO: renamed from: θ */
    public void m4201(android.content.res.ColorStateList r2) {
            r1 = this;
            java.lang.Object r0 = r1.f7943
            oo r0 = (p000.C0630oo) r0
            if (r0 != 0) goto Ld
            oo r0 = new oo
            r0.<init>()
            r1.f7943 = r0
        Ld:
            java.lang.Object r0 = r1.f7943
            oo r0 = (p000.C0630oo) r0
            r0.f8165 = r2
            r2 = 1
            r0.f8164 = r2
            r1.m4194()
            return
    }

    /* JADX INFO: renamed from: ι */
    public void m4202(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            java.lang.Object r0 = r1.f7943
            oo r0 = (p000.C0630oo) r0
            if (r0 != 0) goto Ld
            oo r0 = new oo
            r0.<init>()
            r1.f7943 = r0
        Ld:
            java.lang.Object r0 = r1.f7943
            oo r0 = (p000.C0630oo) r0
            r0.f8166 = r2
            r2 = 1
            r0.f8163 = r2
            r1.m4194()
            return
    }
}
