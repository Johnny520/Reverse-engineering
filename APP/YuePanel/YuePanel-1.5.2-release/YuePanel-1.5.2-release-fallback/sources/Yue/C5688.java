package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
public class C5688 extends Yue.C5687 {
    public C5688() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21270(@Yue.InterfaceC4418 java.util.Set<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            Yue.C1216.m6263(r0, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21271(@Yue.InterfaceC4418 java.util.Set<? extends T> r3, @Yue.InterfaceC4418 java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            java.util.Collection r4 = Yue.C1216.m6249(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            java.util.Set r3 = Yue.C1219.m6542(r3)
            return r3
        L19:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L3b
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L26
            r0.add(r1)
            goto L26
        L3a:
            return r0
        L3b:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21272(@Yue.InterfaceC4418 java.util.Set<? extends T> r6, T r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.size()
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = r1
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2d
            boolean r5 = Yue.C3329.m13897(r3, r7)
            if (r5 == 0) goto L2d
            r2 = r4
            r4 = r1
        L2d:
            if (r4 == 0) goto L18
            r0.add(r3)
            goto L18
        L33:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21273(@Yue.InterfaceC4418 java.util.Set<? extends T> r1, @Yue.InterfaceC4418 T[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            Yue.C1216.m6266(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21274(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r1 = m21272(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21275(@Yue.InterfaceC4418 java.util.Set<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 * 2
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            Yue.C1216.m6246(r0, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static <T> java.util.Set<T> m21276(@Yue.InterfaceC4418 java.util.Set<? extends T> r2, @Yue.InterfaceC4418 java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            java.lang.Integer r0 = Yue.C1210.m6232(r3)
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L20
        L1a:
            int r0 = r2.size()
            int r1 = r0 * 2
        L20:
            int r0 = Yue.C3900.m15722(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r1.addAll(r2)
            Yue.C1216.m6247(r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21277(@Yue.InterfaceC4418 java.util.Set<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21278(@Yue.InterfaceC4418 java.util.Set<? extends T> r3, @Yue.InterfaceC4418 T[] r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r3.size()
            int r2 = r4.length
            int r1 = r1 + r2
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            r0.addAll(r3)
            Yue.C1216.m6248(r0, r4)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21279(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r1 = m21277(r1, r2)
            return r1
    }
}
