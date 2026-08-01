package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 extends com.kongzue.dialogx.interfaces.AbstractC0001 {

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public xhss.C0614 f952;

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public java.lang.String f953;

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public final long f954;

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public int f955;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f956;

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public int f957;

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public final float f958;

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f959;

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public final boolean f960;

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public float f961;

    public C0259() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f960 = r0
            int r0 = xhss.AbstractC1069.f3455
            float r0 = (float) r0
            r2.f958 = r0
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.f954 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f961 = r0
            r0 = -1
            r2.f955 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            r0.<init>(r1)
            r2.f84 = r0
            r0 = 0
            r2.f86 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public static void m566() {
            xhss.ᛳᛴᛵ r0 = m567()
            if (r0 == 0) goto L9
            r0.m571()
        L9:
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public static xhss.C0259 m567() {
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L5c
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L5c
            boolean r1 = r0 instanceof xhss.InterfaceC0386
            if (r1 == 0) goto L24
            r1 = r0
            xhss.ᛴᛷᲀᲁ r1 = (xhss.InterfaceC0386) r1
            androidx.lifecycle.ᛷᛵᛵᲈ r1 = r1.mo63()
            xhss.ᛱᛷᛸᲁ r1 = r1.f64
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f351
            if (r1 != r2) goto L24
            goto L5c
        L24:
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            if (r1 != 0) goto L2e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L35
        L2e:
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            r1.<init>(r2)
        L35:
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r2 = (com.kongzue.dialogx.interfaces.AbstractC0001) r2
            boolean r3 = r2 instanceof xhss.C0259
            if (r3 == 0) goto L39
            boolean r3 = r2.f90
            if (r3 == 0) goto L39
            android.app.Activity r3 = r2.m54()
            if (r3 != r0) goto L39
            xhss.ᛳᛴᛵ r2 = (xhss.C0259) r2
            return r2
        L56:
            xhss.ᛳᛴᛵ r0 = new xhss.ᛳᛴᛵ
            r0.<init>()
            return r0
        L5c:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲀᛵᲇ, reason: contains not printable characters */
    public static xhss.C0259 m568(java.lang.String r2) {
            xhss.ᛳᛴᛵ r0 = m567()
            if (r0 == 0) goto L1d
            r1 = 1
            r0.m574(r2, r1)
            xhss.ᲀᲀ r2 = r0.m570()
            if (r2 != 0) goto L1c
            r0.m49()
            xhss.ᛷᛷᲈᛸ r2 = new xhss.ᛷᛷᲈᛸ
            r1 = 0
            r2.<init>(r0, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r2)
        L1c:
            return r0
        L1d:
            xhss.ᛳᛴᛵ r2 = new xhss.ᛳᛴᛵ
            r2.<init>()
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛲᲈᛵ, reason: contains not printable characters */
    public static xhss.C0259 m569(java.lang.String r2) {
            xhss.ᛳᛴᛵ r0 = m567()
            if (r0 == 0) goto L23
            r1 = 5
            r0.m574(r2, r1)
            r2 = 0
            r0.f961 = r2
            r0.m572()
            xhss.ᲀᲀ r2 = r0.m570()
            if (r2 != 0) goto L22
            r0.m49()
            xhss.ᛷᛷᲈᛸ r2 = new xhss.ᛷᛷᲈᛸ
            r1 = 0
            r2.<init>(r0, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r2)
        L22:
            return r0
        L23:
            xhss.ᛳᛴᛵ r2 = new xhss.ᛳᛴᛵ
            r2.<init>()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public final xhss.C0891 m570() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f956
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            xhss.ᲀᲀ r0 = (xhss.C0891) r0
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛱᛳᲁᲈ */
    public final boolean mo50() {
            r1 = this;
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            boolean r1 = super.mo50()
            return r1
    }

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public final void m571() {
            r2 = this;
            r0 = 0
            r2.f90 = r0
            xhss.ᛷᛷᲈᛸ r0 = new xhss.ᛷᛷᲈᛸ
            r1 = 2
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛳᛸᛵᲀ */
    public final void mo52() {
            r0 = this;
            r0.m572()
            return
    }

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public final void m572() {
            r2 = this;
            xhss.ᲀᲀ r0 = r2.m570()
            if (r0 != 0) goto L7
            return
        L7:
            xhss.ᛷᛷᲈᛸ r0 = new xhss.ᛷᛷᲈᛸ
            r1 = 1
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public final void m573() {
            r2 = this;
            r0 = 0
            r2.f90 = r0
            xhss.ᲁᛲᛸᛴ r0 = new xhss.ᲁᛲᛸᛴ
            r0.<init>()
            r0.m1528()
            xhss.ᛱᛷᛸᲁ r0 = xhss.EnumC0064.f351
            r2.m55(r0)
            java.lang.ref.WeakReference r0 = r2.f956
            if (r0 == 0) goto L17
            r0.clear()
        L17:
            r0 = 0
            r2.f956 = r0
            java.lang.ref.WeakReference r1 = r2.f959
            if (r1 == 0) goto L21
            r1.clear()
        L21:
            r2.f959 = r0
            java.lang.ref.WeakReference r2 = r2.f84
            if (r2 == 0) goto L2a
            r2.clear()
        L2a:
            xhss.ᛶᛵᲇᛸ r2 = xhss.AbstractC1069.f3451
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final java.lang.String mo56() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<xhss.ᛳᛴᛵ> r1 = xhss.C0259.class
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

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public final void m574(java.lang.String r2, int r3) {
            r1 = this;
            r1.f953 = r2
            int r2 = r1.f957
            if (r2 != r3) goto L7
            goto L24
        L7:
            int r2 = xhss.AbstractC0390.m784(r3)
            r1.f955 = r2
            r1.f957 = r3
            xhss.ᲀᲀ r2 = r1.m570()
            if (r2 == 0) goto L24
            xhss.ᲀᲀ r2 = r1.m570()
            r2.getClass()
            xhss.ᛵᛶᛲᛳ r0 = new xhss.ᛵᛶᛲᛳ
            r0.<init>(r2, r3)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
        L24:
            r1.m572()
            return
    }
}
