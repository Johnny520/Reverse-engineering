package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
public class C2943 {
    public C2943() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T, K> java.util.Map<K, java.lang.Integer> m12520(@Yue.InterfaceC4418 Yue.InterfaceC2940<T, ? extends K> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.mo4085()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r6.mo4084(r2)
            java.lang.Object r3 = r0.get(r2)
            r4 = 1
            if (r3 != 0) goto L2b
            boolean r5 = r0.containsKey(r2)
            if (r5 != 0) goto L2b
            r5 = r4
            goto L2c
        L2b:
            r5 = 0
        L2c:
            if (r5 == 0) goto L33
            Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r3 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟۠
            r3.<init>()
        L33:
            Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r3 = (Yue.C5264.C5270) r3
            int r5 = r3.f19774
            int r5 = r5 + r4
            r3.f19774 = r5
            r0.put(r2, r3)
            goto Le
        L3e:
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L46:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>"
            Yue.C3329.m13904(r1, r2)
            java.util.Map$Entry r2 = Yue.C6466.m23826(r1)
            java.lang.Object r1 = r1.getValue()
            Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r1 = (Yue.C5264.C5270) r1
            int r1 = r1.f19774
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setValue(r1)
            goto L46
        L6b:
            java.util.Map r6 = Yue.C6466.m23824(r0)
            return r6
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <K, V, R> java.util.Map<K, R> m12521(java.util.Map<K, V> r3, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "f"
            Yue.C3329.m13906(r4, r0)
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>"
            Yue.C3329.m13904(r1, r2)
            java.util.Map$Entry r2 = Yue.C6466.m23826(r1)
            java.lang.Object r1 = r4.invoke(r1)
            r2.setValue(r1)
            goto L12
        L2f:
            java.util.Map r3 = Yue.C6466.m23824(r3)
            return r3
    }
}
