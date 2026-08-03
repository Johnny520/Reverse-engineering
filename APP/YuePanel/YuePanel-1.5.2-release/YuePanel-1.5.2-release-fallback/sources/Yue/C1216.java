package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1216 extends Yue.C1215 {
    public C1216() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static <T> boolean m6246(@Yue.InterfaceC4418 java.util.Collection<? super T> r2, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto Lf
            r0 = 1
            goto Lf
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static <T> boolean m6247(@Yue.InterfaceC4418 java.util.Collection<? super T> r2, @Yue.InterfaceC4418 java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L15
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.addAll(r3)
            return r2
        L15:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L1a
            r0 = 1
            goto L1a
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static <T> boolean m6248(@Yue.InterfaceC4418 java.util.Collection<? super T> r1, @Yue.InterfaceC4418 T[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            boolean r1 = r1.addAll(r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static <T> java.util.Collection<T> m6249(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.Collection r1 = (java.util.Collection) r1
            goto L10
        Lc:
            java.util.List r1 = Yue.C1219.m6537(r1)
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final <T> boolean m6250(java.lang.Iterable<? extends T> r2, Yue.InterfaceC2825<? super T, java.lang.Boolean> r3, boolean r4) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r4) goto L5
            r2.remove()
            r0 = 1
            goto L5
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final <T> boolean m6251(java.util.List<T> r6, Yue.InterfaceC2825<? super T, java.lang.Boolean> r7, boolean r8) {
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 != 0) goto L12
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>"
            Yue.C3329.m13904(r6, r0)
            java.lang.Iterable r6 = Yue.C6466.m23816(r6)
            boolean r6 = m6250(r6, r7, r8)
            return r6
        L12:
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = Yue.C1208.m6212(r6)
            r2 = 0
            r0.<init>(r2, r1)
            Yue.ۥ۠ۥۣۥ r0 = r0.m13740()
            r1 = r2
        L21:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            int r3 = r0.mo2006()
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r8) goto L3c
            goto L21
        L3c:
            if (r1 == r3) goto L41
            r6.set(r1, r4)
        L41:
            int r1 = r1 + 1
            goto L21
        L44:
            int r7 = r6.size()
            if (r1 >= r7) goto L5a
            int r7 = Yue.C1208.m6212(r6)
            if (r1 > r7) goto L58
        L50:
            r6.remove(r7)
            if (r7 == r1) goto L58
            int r7 = r7 + (-1)
            goto L50
        L58:
            r6 = 1
            return r6
        L5a:
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final <T> void m6252(java.util.Collection<? super T> r1, Yue.InterfaceC5609<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6263(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <T> void m6253(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6264(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final <T> void m6254(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.remove(r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final <T> void m6255(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6266(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final <T> void m6256(java.util.Collection<? super T> r1, Yue.InterfaceC5609<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6246(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <T> void m6257(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6247(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <T> void m6258(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.add(r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <T> void m6259(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            m6248(r1, r2)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use removeAt(index) instead.", replaceWith = @Yue.InterfaceC5313(expression = "removeAt(index)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <T> T m6260(java.util.List<T> r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object r1 = r1.remove(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <T> boolean m6261(java.util.Collection<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Collection r1 = Yue.C6466.m23814(r1)
            boolean r1 = r1.remove(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final <T> boolean m6262(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            boolean r1 = m6250(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final <T> boolean m6263(@Yue.InterfaceC4418 java.util.Collection<? super T> r2, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            java.util.List r3 = Yue.C5629.m21197(r3)
            boolean r0 = r3.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L1d
            boolean r2 = r2.removeAll(r3)
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final <T> boolean m6264(@Yue.InterfaceC4418 java.util.Collection<? super T> r1, @Yue.InterfaceC4418 java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.Collection r2 = m6249(r2)
            boolean r1 = r1.removeAll(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final <T> boolean m6265(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.Collection r1 = Yue.C6466.m23814(r1)
            boolean r1 = r1.removeAll(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final <T> boolean m6266(@Yue.InterfaceC4418 java.util.Collection<? super T> r3, @Yue.InterfaceC4418 T[] r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 ^ r2
            if (r0 == 0) goto L20
            java.util.List r4 = Yue.C0586.m2116(r4)
            boolean r3 = r3.removeAll(r4)
            if (r3 == 0) goto L20
            r1 = r2
        L20:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final <T> boolean m6267(@Yue.InterfaceC4418 java.util.List<T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            boolean r1 = m6251(r1, r2, r0)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final <T> T m6268(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.remove(r0)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final <T> T m6269(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L12
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.remove(r0)
        L12:
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static <T> T m6270(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = Yue.C1208.m6212(r1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static <T> T m6271(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            int r0 = Yue.C1208.m6212(r1)
            java.lang.Object r1 = r1.remove(r0)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static <T> boolean m6272(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            boolean r1 = m6250(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final <T> boolean m6273(@Yue.InterfaceC4418 java.util.Collection<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C5629.m21197(r2)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            boolean r1 = r1.retainAll(r2)
            return r1
        L1b:
            boolean r1 = m6278(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final <T> boolean m6274(@Yue.InterfaceC4418 java.util.Collection<? super T> r1, @Yue.InterfaceC4418 java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.Collection r2 = m6249(r2)
            boolean r1 = r1.retainAll(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final <T> boolean m6275(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.Collection r1 = Yue.C6466.m23814(r1)
            boolean r1 = r1.retainAll(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final <T> boolean m6276(@Yue.InterfaceC4418 java.util.Collection<? super T> r2, @Yue.InterfaceC4418 T[] r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            r1 = 1
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = 0
        L11:
            r0 = r0 ^ r1
            if (r0 == 0) goto L1d
            java.util.List r3 = Yue.C0586.m2116(r3)
            boolean r2 = r2.retainAll(r3)
            return r2
        L1d:
            boolean r2 = m6278(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m6277(@Yue.InterfaceC4418 java.util.List<T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            boolean r1 = m6251(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final boolean m6278(java.util.Collection<?> r1) {
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r1.clear()
            return r0
    }
}
