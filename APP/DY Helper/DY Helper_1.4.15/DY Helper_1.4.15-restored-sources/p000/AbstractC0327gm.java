package p000;

/* JADX INFO: renamed from: gm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0327gm {

    /* JADX INFO: renamed from: α */
    public static final java.util.Map f4416 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.ThreadLocal f4417 = null;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.AbstractC0327gm.f4416 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.AbstractC0327gm.f4417 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2312(android.view.View r13) {
            java.lang.ThreadLocal r1 = p000.AbstractC0327gm.f4417
            java.lang.Object r0 = r1.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.util.Map r0 = p000.AbstractC0327gm.f4416
            java.lang.Object r3 = r0.get(r13)
            if (r3 != 0) goto L3f
            fm r4 = new fm
            int r5 = r13.getVisibility()
            float r6 = r13.getAlpha()
            boolean r7 = r13.isEnabled()
            boolean r8 = r13.isClickable()
            boolean r9 = r13.isLongClickable()
            boolean r10 = r13.isFocusable()
            boolean r11 = r13.isFocusableInTouchMode()
            int r12 = r13.getImportantForAccessibility()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.put(r13, r4)
        L3f:
            r1.set(r2)
            r0 = 8
            r13.setVisibility(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 0
            r13.setAlpha(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 0
            r13.setEnabled(r0)     // Catch: java.lang.Throwable -> L63
            r13.setClickable(r0)     // Catch: java.lang.Throwable -> L63
            r13.setLongClickable(r0)     // Catch: java.lang.Throwable -> L63
            r13.setFocusable(r0)     // Catch: java.lang.Throwable -> L63
            r13.setFocusableInTouchMode(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 4
            r13.setImportantForAccessibility(r0)     // Catch: java.lang.Throwable -> L63
            r1.remove()
            return
        L63:
            r0 = move-exception
            r13 = r0
            r1.remove()
            throw r13
    }
}
