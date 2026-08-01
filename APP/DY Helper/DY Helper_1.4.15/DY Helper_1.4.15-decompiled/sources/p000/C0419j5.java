package p000;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0419j5 {

    /* JADX INFO: renamed from: β */
    public static final android.graphics.PorterDuff.Mode f5320 = null;

    /* JADX INFO: renamed from: γ */
    public static p000.C0419j5 f5321;

    /* JADX INFO: renamed from: α */
    public p000.tn1 f5322;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            p000.C0419j5.f5320 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static synchronized p000.C0419j5 m2862() {
            java.lang.Class<j5> r0 = p000.C0419j5.class
            monitor-enter(r0)
            j5 r1 = p000.C0419j5.f5321     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            m2863()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            j5 r1 = p000.C0419j5.f5321     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    /* JADX INFO: renamed from: γ */
    public static synchronized void m2863() {
            java.lang.Class<j5> r0 = p000.C0419j5.class
            monitor-enter(r0)
            j5 r1 = p000.C0419j5.f5321     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            j5 r1 = new j5     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            p000.C0419j5.f5321 = r1     // Catch: java.lang.Throwable -> L26
            tn1 r2 = p000.tn1.m5720()     // Catch: java.lang.Throwable -> L26
            r1.f5322 = r2     // Catch: java.lang.Throwable -> L26
            j5 r1 = p000.C0419j5.f5321     // Catch: java.lang.Throwable -> L26
            tn1 r1 = r1.f5322     // Catch: java.lang.Throwable -> L26
            i5 r2 = new i5     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L26
            r1.f10427 = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L28
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m2864(android.graphics.drawable.Drawable r4, p000.C0630oo r5, int[] r6) {
            android.graphics.PorterDuff$Mode r0 = p000.tn1.f10420
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L51
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1f
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1f:
            boolean r0 = r5.f8164
            if (r0 != 0) goto L2c
            boolean r1 = r5.f8163
            if (r1 == 0) goto L28
            goto L2c
        L28:
            r4.clearColorFilter()
            return
        L2c:
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.f8165
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r3 = r5.f8163
            if (r3 == 0) goto L3e
            java.io.Serializable r5 = r5.f8166
            android.graphics.PorterDuff$Mode r5 = (android.graphics.PorterDuff.Mode) r5
            goto L40
        L3e:
            android.graphics.PorterDuff$Mode r5 = p000.tn1.f10420
        L40:
            if (r0 == 0) goto L4d
            if (r5 != 0) goto L45
            goto L4d
        L45:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = p000.tn1.m5721(r6, r5)
        L4d:
            r4.setColorFilter(r1)
            return
        L51:
            java.lang.String r4 = "ResourceManagerInternal"
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            return
    }

    /* JADX INFO: renamed from: β */
    public final synchronized android.graphics.drawable.Drawable m2865(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            tn1 r0 = r1.f5322     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.m5724(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
