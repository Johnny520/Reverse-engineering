package defpackage;

/* JADX INFO: renamed from: ᛳᲁᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0564 implements defpackage.InterfaceC0204, defpackage.InterfaceC0784 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.List f2808;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f2809;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f2810;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1326 f2811;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f2812;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.EnumC1307 f2813;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC0784 f2814;

    public C0564(java.util.ArrayList r1, defpackage.C1326 r2) {
            r0 = this;
            r0.<init>()
            r0.f2811 = r2
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L11
            r0.f2812 = r1
            r1 = 0
            r0.f2810 = r1
            return
        L11:
            java.lang.String r0 = "Must not be empty."
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f2809 = r0
            java.util.ArrayList r1 = r1.f2812
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            ᛱᲇᲀᛴ r0 = (defpackage.InterfaceC0204) r0
            r0.cancel()
            goto L9
        L19:
            return
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo1360(java.lang.Exception r3) {
            r2 = this;
            java.util.List r0 = r2.f2808
            java.lang.String r1 = "Argument must not be null"
            defpackage.C0292.m944(r0, r1)
            r0.add(r3)
            r2.m1361()
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r2, defpackage.InterfaceC0784 r3) {
            r1 = this;
            r1.f2813 = r2
            r1.f2814 = r3
            ᛷᛸᛱᛸ r3 = r1.f2811
            java.lang.Object r3 = r3.mo913()
            java.util.List r3 = (java.util.List) r3
            r1.f2808 = r3
            java.util.ArrayList r3 = r1.f2812
            int r0 = r1.f2810
            java.lang.Object r3 = r3.get(r0)
            ᛱᲇᲀᛴ r3 = (defpackage.InterfaceC0204) r3
            r3.mo753(r2, r1)
            boolean r2 = r1.f2809
            if (r2 == 0) goto L22
            r1.cancel()
        L22:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r2 = this;
            java.util.List r0 = r2.f2808
            if (r0 == 0) goto L9
            ᛷᛸᛱᛸ r1 = r2.f2811
            r1.mo914(r0)
        L9:
            r0 = 0
            r2.f2808 = r0
            java.util.ArrayList r2 = r2.f2812
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            ᛱᲇᲀᛴ r0 = (defpackage.InterfaceC0204) r0
            r0.mo754()
            goto L12
        L22:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r1 = this;
            java.util.ArrayList r1 = r1.f2812
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            ᛱᲇᲀᛴ r1 = (defpackage.InterfaceC0204) r1
            java.lang.Class r1 = r1.mo646()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1361() {
            r3 = this;
            boolean r0 = r3.f2809
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r3.f2810
            java.util.ArrayList r1 = r3.f2812
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L1f
            int r0 = r3.f2810
            int r0 = r0 + 1
            r3.f2810 = r0
            ᛷᛷᛱᛴ r0 = r3.f2813
            ᛴᲇᛸᛸ r1 = r3.f2814
            r3.mo753(r0, r1)
            return
        L1f:
            java.util.List r0 = r3.f2808
            defpackage.C0292.m948(r0)
            ᛴᲇᛸᛸ r0 = r3.f2814
            ᛵᲈᛳᛲ r1 = new ᛵᲈᛳᛲ
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r3.f2808
            r2.<init>(r3)
            java.lang.String r3 = "Fetch failed"
            r1.<init>(r2, r3)
            r0.mo1360(r1)
            return
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void mo1362(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L8
            ᛴᲇᛸᛸ r0 = r0.f2814
            r0.mo1362(r1)
            return
        L8:
            r0.m1361()
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r1 = this;
            java.util.ArrayList r1 = r1.f2812
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            ᛱᲇᲀᛴ r1 = (defpackage.InterfaceC0204) r1
            int r1 = r1.mo755()
            return r1
    }
}
