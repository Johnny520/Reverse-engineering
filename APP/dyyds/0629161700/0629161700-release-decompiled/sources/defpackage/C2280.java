package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2280 extends defpackage.AbstractC1382 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f9636;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9637;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f9638;

    public C2280(android.view.View r1, defpackage.InterfaceC0140 r2) {
            r0 = this;
            r0.f9638 = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᲀᛶᛴᛲ r1 = (defpackage.C1687) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᲈᛷᛲᛳ r0 = (defpackage.C2280) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r2, java.lang.Object r3) {
            r1 = this;
            ᲈᛷᛲᛳ r0 = new ᲈᛷᛲᛳ
            android.view.View r1 = r1.f9638
            r0.<init>(r1, r2)
            r0.f9636 = r3
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f9637
            android.view.View r1 = r7.f9638
            r2 = 1
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r0 == 0) goto L53
            r4 = 0
            ᲁᲀᛱᲁ r5 = defpackage.C1907.f8270
            r6 = 2
            if (r0 == r2) goto L1b
            if (r0 != r6) goto L15
            defpackage.AbstractC0762.m1680(r8)
            return r5
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r7)
            return r4
        L1b:
            java.lang.Object r0 = r7.f9636
            ᲀᛶᛴᛲ r0 = (defpackage.C1687) r0
            defpackage.AbstractC0762.m1680(r8)
            boolean r8 = r1 instanceof android.view.ViewGroup
            if (r8 == 0) goto L52
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.f9636 = r4
            r7.f9637 = r6
            r0.getClass()
            ᲇᛳᲀᲈ r8 = new ᲇᛳᲀᲈ
            ᛶᛷᛱᲀ r2 = new ᛶᛷᛱᲀ
            r4 = 3
            r2.<init>(r4, r1)
            r8.<init>(r2)
            java.util.Iterator r1 = r8.f8730
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L44
            r7 = r5
            goto L4b
        L44:
            r0.f7504 = r8
            r0.f7506 = r6
            r0.f7507 = r7
            r7 = r3
        L4b:
            if (r7 != r3) goto L4e
            goto L4f
        L4e:
            r7 = r5
        L4f:
            if (r7 != r3) goto L52
            return r3
        L52:
            return r5
        L53:
            defpackage.AbstractC0762.m1680(r8)
            java.lang.Object r8 = r7.f9636
            ᲀᛶᛴᛲ r8 = (defpackage.C1687) r8
            r7.f9636 = r8
            r7.f9637 = r2
            r8.m3071(r1, r7)
            return r3
    }
}
