package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3902 extends Yue.C3901 {
    public C3902() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use maxByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15802(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use maxWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V> java.util.Map.Entry<K, V> m15803(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6433(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15804(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.Map.Entry m15805(java.util.Map r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6451(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }
}
