package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1197 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0735 f5402 = null;

    static {
            ᛶᛶᛳᲇ r0 = defpackage.C1087.f4877
            ᛴᛸᲇ r1 = r0.f4879
            if (r1 != 0) goto L22
            ᛷᛸᛱᛸ r2 = new ᛷᛸᛱᛸ
            r1 = 19
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C1087.f4878
        Lf:
            r1 = 0
            boolean r1 = r3.compareAndSet(r0, r1, r2)
            if (r1 == 0) goto L18
            r1 = r2
            goto L22
        L18:
            java.lang.Object r1 = r3.get(r0)
            if (r1 == 0) goto Lf
            ᛶᛶᛳᲇ r0 = defpackage.C1087.f4877
            ᛴᛸᲇ r1 = r0.f4879
        L22:
            defpackage.AbstractC1197.f5402 = r1
            return
    }
}
