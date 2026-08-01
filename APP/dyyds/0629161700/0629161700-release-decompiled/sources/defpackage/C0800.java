package defpackage;

/* JADX INFO: renamed from: ᛴᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 extends defpackage.AbstractC1692 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f3699;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.content.Context f3700;

    public C0800() {
            r7 = this;
            r7.<init>()
            ᲇᛸᛵᛲ r0 = new ᲇᛸᛵᛲ
            r0.<init>()
            ᛲᛲᛶᲀ r1 = new ᛲᛲᛶᲀ
            ᛷᲈᲀ r2 = defpackage.C0158.f1124
            r1.<init>(r2)
            ᛲᛲᛶᲀ r2 = new ᛲᛲᛶᲀ
            ᛷᛸᛸᛱ r3 = defpackage.C1363.f5961
            r2.<init>(r3)
            ᛲᛲᛶᲀ r3 = new ᛲᛲᛶᲀ
            ᛵᛴᛱᲀ r4 = defpackage.C1276.f5702
            r3.<init>(r4)
            r4 = 4
            ᛶᛸᲀᛵ[] r5 = new defpackage.InterfaceC1130[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L31:
            if (r6 >= r4) goto L3d
            r1 = r5[r6]
            if (r1 == 0) goto L3a
            r0.add(r1)
        L3a:
            int r6 = r6 + 1
            goto L31
        L3d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            r3 = r2
            ᛶᛸᲀᛵ r3 = (defpackage.InterfaceC1130) r3
            boolean r3 = r3.mo687()
            if (r3 == 0) goto L46
            r1.add(r2)
            goto L46
        L5d:
            r7.f3699 = r1
            return
    }
}
