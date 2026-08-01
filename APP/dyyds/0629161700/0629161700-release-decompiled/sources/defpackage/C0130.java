package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130 implements defpackage.InterfaceC1152 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f1064;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1065;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1152 f1066;

    public /* synthetic */ C0130(defpackage.InterfaceC1152 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f1065 = r3
            r0.f1066 = r1
            r0.f1064 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1152
    public final java.util.Iterator iterator() {
            r5 = this;
            int r0 = r5.f1065
            java.lang.Object r1 = r5.f1064
            ᛶᲁᛴ r2 = r5.f1066
            switch(r0) {
                case 0: goto L43;
                case 1: goto Lf;
                default: goto L9;
            }
        L9:
            ᲇᛳᲀᲈ r0 = new ᲇᛳᲀᲈ
            r0.<init>(r5)
            return r0
        Lf:
            ᛱᛷᛷᛲ r2 = (defpackage.C0130) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ᛶᲁᛴ r0 = r2.f1066
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.f1064
            ᛳᲈᲇᛳ r3 = (defpackage.InterfaceC0598) r3
            java.lang.Object r4 = r0.next()
            java.lang.Object r3 = r3.mo617(r4)
            r5.add(r3)
            goto L1c
        L32:
            java.util.Comparator r1 = (java.util.Comparator) r1
            int r0 = r5.size()
            r2 = 1
            if (r0 <= r2) goto L3e
            java.util.Collections.sort(r5, r1)
        L3e:
            java.util.Iterator r5 = r5.iterator()
            return r5
        L43:
            ᛳᛲᲇᛴ r5 = new ᛳᛲᲇᛴ
            ᛷᛵᛵᛶ r2 = (defpackage.C1273) r2
            ᲈᲁᛵᲁ r0 = new ᲈᲁᛵᲁ
            r0.<init>(r2)
            ᛳᛶᛱᛷ r1 = (defpackage.C0495) r1
            r5.<init>(r0, r1)
            return r5
    }
}
