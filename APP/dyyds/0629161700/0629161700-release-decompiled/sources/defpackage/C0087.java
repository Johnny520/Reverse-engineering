package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0087 extends defpackage.AbstractC0758 {
    public C0087() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo561(defpackage.C0353 r4, java.lang.Object r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerArray r5 = (java.util.concurrent.atomic.AtomicIntegerArray) r5
            r4.m1082()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            int r1 = r5.get(r0)
            long r1 = (long) r1
            r4.m1070(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.m1068()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.m2101()
        L8:
            boolean r0 = r4.m2082()
            if (r0 == 0) goto L21
            int r0 = r4.m2099()     // Catch: java.lang.NumberFormatException -> L1a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1a
            r3.add(r0)     // Catch: java.lang.NumberFormatException -> L1a
            goto L8
        L1a:
            r3 = move-exception
            ᛲᛱᛶᲀ r4 = new ᛲᛱᛶᲀ
            r4.<init>(r3)
            throw r4
        L21:
            r4.m2083()
            int r4 = r3.size()
            java.util.concurrent.atomic.AtomicIntegerArray r0 = new java.util.concurrent.atomic.AtomicIntegerArray
            r0.<init>(r4)
            r1 = 0
        L2e:
            if (r1 >= r4) goto L40
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.set(r1, r2)
            int r1 = r1 + 1
            goto L2e
        L40:
            return r0
    }
}
