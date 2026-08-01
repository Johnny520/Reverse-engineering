package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0525 extends com.kongzue.dialogx.interfaces.AbstractC0008 {

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public float f2583;

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public int f2584;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public defpackage.C0292 f2585;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public java.lang.CharSequence f2586;

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public int f2587;

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f2588;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final long f2589;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public final float f2590;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final boolean f2591;

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f2592;

    public C0525() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f2591 = r0
            int r0 = defpackage.AbstractC0042.f559
            float r0 = (float) r0
            r2.f2590 = r0
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.f2589 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f2583 = r0
            r0 = -1
            r2.f2587 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            r0.<init>(r1)
            r2.f377 = r0
            r0 = 0
            r2.f368 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public static defpackage.C0525 m1314() {
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L5c
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L5c
            boolean r1 = r0 instanceof defpackage.InterfaceC0770
            if (r1 == 0) goto L24
            r1 = r0
            ᛴᲁᲁᛶ r1 = (defpackage.InterfaceC0770) r1
            androidx.lifecycle.ᛷᲁᛳᛳ r1 = r1.mo0()
            ᛳᲇᲇᛱ r1 = r1.f286
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2853
            if (r1 != r2) goto L24
            goto L5c
        L24:
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            if (r1 != 0) goto L2e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L35
        L2e:
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r1.<init>(r2)
        L35:
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r2 = (com.kongzue.dialogx.interfaces.AbstractC0008) r2
            boolean r3 = r2 instanceof defpackage.C0525
            if (r3 == 0) goto L39
            boolean r3 = r2.f369
            if (r3 == 0) goto L39
            android.app.Activity r3 = r2.m271()
            if (r3 != r0) goto L39
            ᛳᛸᛳᛸ r2 = (defpackage.C0525) r2
            return r2
        L56:
            ᛳᛸᛳᛸ r0 = new ᛳᛸᛳᛸ
            r0.<init>()
            return r0
        L5c:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public static defpackage.C0525 m1315(java.lang.CharSequence r2) {
            ᛳᛸᛳᛸ r0 = m1314()
            if (r0 == 0) goto L1d
            r1 = 1
            r0.m1321(r2, r1)
            ᛱᛳᲀᛷ r2 = r0.m1320()
            if (r2 != 0) goto L1c
            r0.m267()
            ᲇᛵᛷᛸ r2 = new ᲇᛵᛷᛸ
            r1 = 0
            r2.<init>(r0, r1)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r2)
        L1c:
            return r0
        L1d:
            ᛳᛸᛳᛸ r2 = new ᛳᛸᛳᛸ
            r2.<init>()
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public static defpackage.C0525 m1316(java.lang.String r2, float r3) {
            ᛳᛸᛳᛸ r0 = m1314()
            if (r0 == 0) goto L22
            r1 = 5
            r0.m1321(r2, r1)
            r0.f2583 = r3
            r0.m1319()
            ᛱᛳᲀᛷ r2 = r0.m1320()
            if (r2 != 0) goto L21
            r0.m267()
            ᲇᛵᛷᛸ r2 = new ᲇᛵᛷᛸ
            r3 = 0
            r2.<init>(r0, r3)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r2)
        L21:
            return r0
        L22:
            ᛳᛸᛳᛸ r2 = new ᛳᛸᛳᛸ
            r2.<init>()
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public static void m1317() {
            ᛳᛸᛳᛸ r0 = m1314()
            if (r0 == 0) goto L9
            r0.m1322()
        L9:
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final void m1318() {
            r2 = this;
            r0 = 0
            r2.f369 = r0
            ᲈᲀᛴᛷ r0 = new ᲈᲀᛴᛷ
            r0.<init>()
            r0.m3794()
            ᛳᲇᲇᛱ r0 = defpackage.EnumC0578.f2853
            r2.m260(r0)
            java.lang.ref.WeakReference r0 = r2.f2588
            if (r0 == 0) goto L17
            r0.clear()
        L17:
            r0 = 0
            r2.f2588 = r0
            java.lang.ref.WeakReference r1 = r2.f2592
            if (r1 == 0) goto L21
            r1.clear()
        L21:
            r2.f2592 = r0
            java.lang.ref.WeakReference r2 = r2.f377
            if (r2 == 0) goto L2a
            r2.clear()
        L2a:
            ᲈᛴᛵᲈ r2 = defpackage.AbstractC0042.f556
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public final void m1319() {
            r2 = this;
            ᛱᛳᲀᛷ r0 = r2.m1320()
            if (r0 != 0) goto L7
            return
        L7:
            ᲇᛵᛷᛸ r0 = new ᲇᛵᛷᛸ
            r1 = 1
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᛶᲈᲈᛸ */
    public final void mo265() {
            r0 = this;
            r0.m1319()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final defpackage.C0060 m1320() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f2588
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            ᛱᛳᲀᛷ r0 = (defpackage.C0060) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public final void m1321(java.lang.CharSequence r2, int r3) {
            r1 = this;
            r1.f2586 = r2
            int r2 = r1.f2584
            if (r2 != r3) goto L7
            goto L24
        L7:
            int r2 = defpackage.AbstractC0225.m812(r3)
            r1.f2587 = r2
            r1.f2584 = r3
            ᛱᛳᲀᛷ r2 = r1.m1320()
            if (r2 == 0) goto L24
            ᛱᛳᲀᛷ r2 = r1.m1320()
            r2.getClass()
            ᛵᛵᛱᛸ r0 = new ᛵᛵᛱᛸ
            r0.<init>(r2, r3)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
        L24:
            r1.m1319()
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public final void m1322() {
            r2 = this;
            r0 = 0
            r2.f369 = r0
            ᲇᛵᛷᛸ r0 = new ᲇᛵᛷᛸ
            r1 = 2
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲁᲈᛳ */
    public final boolean mo270() {
            r1 = this;
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            boolean r1 = super.mo270()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.String mo274() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<ᛳᛸᛳᛸ> r1 = defpackage.C0525.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
