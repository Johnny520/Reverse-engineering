package defpackage;

/* JADX INFO: renamed from: ᛲᛵᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0293 implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, defpackage.InterfaceC0770, defpackage.InterfaceC2120, defpackage.InterfaceC1145, defpackage.InterfaceC1386 {

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final java.lang.Object f1596 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.EnumC0578 f1597;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.util.ArrayList f1598;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.C1606 f1599;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public androidx.lifecycle.C0005 f1600;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2295 f1601;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f1602;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f1603;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.C0542 f1604;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f1605;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C1326 f1606;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractComponentCallbacksC0293.f1596 = r0
            return
    }

    public AbstractComponentCallbacksC0293() {
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.f1603 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r6.f1602 = r0
            ᲈᛷᲀᲀ r0 = new ᲈᛷᲀᲀ
            r1 = 1
            r0.<init>(r1)
            r6.f1601 = r0
            r6.f1605 = r1
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r2 = 8
            r0.<init>(r2, r6)
            ᛳᲇᲇᛱ r0 = defpackage.EnumC0578.f2855
            r6.f1597 = r0
            ᛲᛴᛴᛵ r0 = new ᛲᛴᛴᛵ
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f1598 = r0
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r2 = 22
            r0.<init>(r2, r6)
            r6.f1599 = r0
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r0.<init>(r6)
            r6.f1600 = r0
            ᛳᲀᛴᲈ r0 = new ᛳᲀᛴᲈ
            r0.<init>(r6)
            r6.f1604 = r0
            java.util.ArrayList r0 = r6.f1598
            ᛸᲈᛸᲈ r2 = r6.f1599
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L104
            int r6 = r6.f1603
            if (r6 < 0) goto L101
            java.lang.Object r6 = r2.f7101
            ᛲᛵᛴᲁ r6 = (defpackage.AbstractComponentCallbacksC0293) r6
            ᛳᲀᛴᲈ r0 = r6.f1604
            r0.m1330()
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r6.f1600
            ᛳᲇᲇᛱ r0 = r0.f286
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2852
            if (r0 == r2) goto L78
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2851
            if (r0 != r2) goto L71
            goto L78
        L71:
            java.lang.String r6 = "Failed requirement."
            defpackage.C2264.m3684(r6)
            goto L104
        L78:
            ᛳᲀᛴᲈ r0 = r6.f1604
            java.lang.Object r0 = r0.f2672
            ᛶᛲᛱᛸ r0 = (defpackage.C1020) r0
            java.lang.Object r0 = r0.f4553
            ᛸᛱᛴᲀ r0 = (defpackage.C1418) r0
            java.util.Iterator r0 = r0.iterator()
        L86:
            r2 = r0
            ᲈᲁᛸᛶ r2 = (defpackage.C2340) r2
            boolean r3 = r2.hasNext()
            r4 = 0
            java.lang.String r5 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            if (r3 == 0) goto Lab
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            ᲁᛶᛵᛵ r2 = (defpackage.InterfaceC1872) r2
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r5)
            if (r3 == 0) goto L86
            goto Lac
        Lab:
            r2 = r4
        Lac:
            if (r2 != 0) goto Lfb
            ᛸᛴᲁᛷ r0 = new ᛸᛴᲁᛷ
            ᛳᲀᛴᲈ r2 = r6.f1604
            java.lang.Object r2 = r2.f2672
            ᛶᛲᛱᛸ r2 = (defpackage.C1020) r2
            r0.<init>(r2, r6)
            ᛳᲀᛴᲈ r2 = r6.f1604
            java.lang.Object r2 = r2.f2672
            ᛶᛲᛱᛸ r2 = (defpackage.C1020) r2
            java.lang.Object r2 = r2.f4553
            ᛸᛱᛴᲀ r2 = (defpackage.C1418) r2
            ᛴᛵᛳ r3 = r2.mo2601(r5)
            if (r3 == 0) goto Lcc
            java.lang.Object r1 = r3.f3254
            goto Le6
        Lcc:
            ᛴᛵᛳ r3 = new ᛴᛵᛳ
            r3.<init>(r5, r0)
            int r5 = r2.f6210
            int r5 = r5 + r1
            r2.f6210 = r5
            ᛴᛵᛳ r1 = r2.f6208
            if (r1 != 0) goto Ldf
            r2.f6209 = r3
            r2.f6208 = r3
            goto Le5
        Ldf:
            r1.f3253 = r3
            r3.f3256 = r1
            r2.f6208 = r3
        Le5:
            r1 = r4
        Le6:
            ᲁᛶᛵᛵ r1 = (defpackage.InterfaceC1872) r1
            if (r1 != 0) goto Lf5
            androidx.lifecycle.ᛷᲁᛳᛳ r1 = r6.f1600
            androidx.lifecycle.SavedStateHandleAttacher r2 = new androidx.lifecycle.SavedStateHandleAttacher
            r2.<init>(r0)
            r1.m110(r2)
            goto Lfb
        Lf5:
            java.lang.String r6 = "SavedStateProvider with the given key is already registered"
            defpackage.C2264.m3684(r6)
            goto L104
        Lfb:
            ᛳᲀᛴᲈ r6 = r6.f1604
            r6.m1333(r4)
            goto L104
        L101:
            r0.add(r2)
        L104:
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 1
            return r0
    }

    public final androidx.fragment.app.FragmentActivity getActivity() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto La
            r0.onCreateContextMenu(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Fragment "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " not attached to an activity."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ("
            r0.append(r1)
            java.lang.String r2 = r2.f1602
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC0770
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final androidx.lifecycle.C0005 mo0() {
            r0 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r0.f1600
            return r0
    }

    @Override // defpackage.InterfaceC2120
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C0448 mo1() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.InterfaceC1145
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.AbstractC1723 mo2() {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " not attached to a context."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.InterfaceC1386
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C1020 mo4() {
            r0 = this;
            ᛳᲀᛴᲈ r0 = r0.f1604
            java.lang.Object r0 = r0.f2672
            ᛶᛲᛱᛸ r0 = (defpackage.C1020) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C2295 m953() {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " not associated with a fragment manager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
