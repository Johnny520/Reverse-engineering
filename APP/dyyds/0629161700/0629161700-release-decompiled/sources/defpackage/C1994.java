package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1994 extends defpackage.AbstractC1304 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8631;

    public C1994(defpackage.C0665 r1, int r2) {
            r0 = this;
            r0.f8631 = r2
            r0.<init>()
            r0.f5769 = r1
            r2 = -1
            r0.f5767 = r2
            int r1 = r1.f3230
            r0.f5766 = r1
            r0.m2417()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f8631
            switch(r0) {
                case 0: goto L47;
                case 1: goto L26;
                default: goto L5;
            }
        L5:
            r3.m2419()
            int r0 = r3.f5768
            java.lang.Object r1 = r3.f5769
            ᛴᛴᲁᲇ r1 = (defpackage.C0665) r1
            int r2 = r1.f3221
            if (r0 >= r2) goto L20
            int r2 = r0 + 1
            r3.f5768 = r2
            r3.f5767 = r0
            java.lang.Object[] r1 = r1.f3228
            r0 = r1[r0]
            r3.m2417()
            return r0
        L20:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L26:
            r3.m2419()
            int r0 = r3.f5768
            java.lang.Object r1 = r3.f5769
            ᛴᛴᲁᲇ r1 = (defpackage.C0665) r1
            int r2 = r1.f3221
            if (r0 >= r2) goto L41
            int r2 = r0 + 1
            r3.f5768 = r2
            r3.f5767 = r0
            java.lang.Object[] r1 = r1.f3229
            r0 = r1[r0]
            r3.m2417()
            return r0
        L41:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L47:
            r3.m2419()
            int r0 = r3.f5768
            java.lang.Object r1 = r3.f5769
            ᛴᛴᲁᲇ r1 = (defpackage.C0665) r1
            int r2 = r1.f3221
            if (r0 >= r2) goto L63
            int r2 = r0 + 1
            r3.f5768 = r2
            r3.f5767 = r0
            ᲈᛷᛶ r2 = new ᲈᛷᛶ
            r2.<init>(r1, r0)
            r3.m2417()
            return r2
        L63:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }
}
