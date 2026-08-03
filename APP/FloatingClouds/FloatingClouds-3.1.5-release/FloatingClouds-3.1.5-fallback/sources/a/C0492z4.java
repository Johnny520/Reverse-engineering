package a;

/* JADX INFO: renamed from: a.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492z4 {
    public static void a() {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.o6> r0 = a.Fd.f90a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r0.size()
            int r2 = a.C0048aa.C(r2)
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            a.o6 r2 = (a.C0297o6) r2
            a.p6 r4 = new a.p6
            java.lang.String r5 = r2.f619a
            a.q6 r6 = r2.b
            java.util.concurrent.atomic.AtomicLong r7 = r2.e
            long r7 = r7.get()
            java.util.concurrent.atomic.AtomicLong r9 = r2.d
            long r9 = r9.get()
            java.util.concurrent.atomic.AtomicInteger r11 = r2.c
            int r11 = r11.get()
            int r12 = r2.i
            java.lang.String r13 = r2.f
            java.lang.String r14 = r2.g
            r15 = r4
            r16 = r5
            long r4 = r2.h
            r17 = r4
            r4 = r15
            r5 = r16
            r15 = r17
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15)
            r1.put(r3, r4)
            goto L17
        L5e:
            java.util.Set r0 = r1.entrySet()
            a.g2 r1 = new a.g2
            r2 = 10
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = "; "
            java.lang.String r0 = a.C0383t3.p0(r0, r3, r1, r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            a.Ce.X(r0, r1)
            return
    }
}
